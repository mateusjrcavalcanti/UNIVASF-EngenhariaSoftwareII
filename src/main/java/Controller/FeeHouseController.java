package Controller;

import Model.Fee;
import Model.FeeHouse;
import Model.House;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.persistence.TypedQuery;


public class FeeHouseController extends Controller {

    public FeeHouseController() {
    }

    public FeeHouse find(int id) {
        try {
            this.conn();
            FeeHouse result = this.entityManager.find(FeeHouse.class, id);
            return result;
        } finally {
            this.close();
        }
    }

    public List<FeeHouse> all() {
        try {
            this.conn();
            String jpql = "SELECT c FROM FeeHouse c";
            TypedQuery<FeeHouse> query = this.entityManager.createQuery(jpql, FeeHouse.class);

            List<FeeHouse> result = query.getResultList();

            return result;
        } finally {
            this.close();
        }
    }

    public FeeHouse insert(String status, Fee fee, House house) {
        try {
            this.conn();
            FeeHouse result = new FeeHouse(status, fee, house);

            this.entityManager.getTransaction().begin();
            this.entityManager.persist(result);
            this.entityManager.getTransaction().commit();

            // Atualize o objeto para obter o ID gerado
            this.entityManager.refresh(result);

            // O objeto agora contém o ID gerado
            return result;
        } finally {
            this.close();
        }
    }

    public FeeHouse update(int id, String status, Fee fee, House house) {
        try {
            this.conn();
            FeeHouse result = this.entityManager.find(FeeHouse.class, id);

        if (result != null) {
            result.setStatus(status);
            result.setFee(fee);
            result.setHouse(house);

            this.entityManager.getTransaction().begin();
            result = this.entityManager.merge(result);
            this.entityManager.getTransaction().commit();

            return result;
        } else {
            return null;
        }
        } finally {
            this.close();
        }
    }

    public boolean delete(int id) {
        try {
            this.conn();
            FeeHouse result = this.entityManager.find(FeeHouse.class, id);

            if (result != null) {
                this.entityManager.getTransaction().begin();
                this.entityManager.remove(result);
                this.entityManager.getTransaction().commit();
                return true;
            } else {
                return false;
            }
        } finally {
            this.close();
        }
    }

    public void generateMonth() {
        try {
            this.conn();
            // Consulta para trazer todas as casas
            String jpqlHouse = "SELECT h FROM House h";
            TypedQuery<House> queryHouse = this.entityManager.createQuery(jpqlHouse, House.class);
            List<House> houses = queryHouse.getResultList();

            // Obtendo a data atual
            Date currentDate = new Date(); // Certifique-se de importar java.util.Date
            // Obtendo o ano e o mês atuais
            Calendar calendar = Calendar.getInstance();
            int currentYear = calendar.get(Calendar.YEAR);
            int currentMonth = calendar.get(Calendar.MONTH) + 1; // Calendar.MONTH é base zero, então somamos 1

            for (House house : houses) {
                // Consulta para encontrar todas as taxas (Fee) dentro do intervalo de datas
                String jpqlFee = "SELECT f FROM Fee f WHERE f.dateStart <= :currentDate AND f.dateEnd >= :currentDate";
                TypedQuery<Fee> queryFee = this.entityManager.createQuery(jpqlFee, Fee.class);
                queryFee.setParameter("currentDate", currentDate);
                List<Fee> fees = queryFee.getResultList();

                // Verificar se existe um FeeHouse com expiração para o ano e mês atuais
                boolean hasFeeHouseForCurrentMonth = false;
                for (Fee fee : fees) {
                    if (fee.getDay() == calendar.get(Calendar.DAY_OF_MONTH)) {
                        String jpqlFeeHouse = "SELECT fh FROM FeeHouse fh WHERE fh.house = :house AND FUNCTION('YEAR', fh.expiration) = :currentYear AND FUNCTION('MONTH', fh.expiration) = :currentMonth";
                        TypedQuery<FeeHouse> queryFeeHouse = this.entityManager.createQuery(jpqlFeeHouse, FeeHouse.class);
                        queryFeeHouse.setParameter("house", house);
                        queryFeeHouse.setParameter("currentYear", currentYear);
                        queryFeeHouse.setParameter("currentMonth", currentMonth);
                        List<FeeHouse> feeHouses = queryFeeHouse.getResultList();

                        if (!feeHouses.isEmpty()) {
                            hasFeeHouseForCurrentMonth = true;
                            break;
                        }
                    }
                }

                if (!hasFeeHouseForCurrentMonth) {
                    // Cadastre um novo FeeHouse para o mês e ano atual
                    FeeHouse newFeeHouse = new FeeHouse();
                    newFeeHouse.setHouse(house);
                    // Defina a data de expiração para o ano e mês atuais (supondo que expiration seja um atributo do tipo Date)
                    calendar.set(Calendar.YEAR, currentYear);
                    calendar.set(Calendar.MONTH, currentMonth - 1); // Calendar.MONTH é base zero, então subtraímos 1
                    Date expirationDate = calendar.getTime();
                    newFeeHouse.setExpiration(expirationDate);

                    //Persistir o novo FeeHouse no banco de dados
                    entityManager.persist(newFeeHouse);
                }
            }
        } finally {
            this.close();
        }
    }


}
