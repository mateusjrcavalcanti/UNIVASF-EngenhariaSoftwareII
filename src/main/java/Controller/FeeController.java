package Controller;

import Model.Fee;

import java.util.Date;
import java.util.List;
import javax.persistence.TypedQuery;


public class FeeController extends Controller {

    public FeeController() {
    }

    public Fee find(int id) {
        try {
            this.conn();
            Fee result = this.entityManager.find(Fee.class, id);
            return result;
        } finally {
            this.close();
        }
    }

    public List<Fee> all() {
        try {
            this.conn();
            String jpql = "SELECT c FROM Fee c";
            TypedQuery<Fee> query = this.entityManager.createQuery(jpql, Fee.class);

            List<Fee> result = query.getResultList();

            return result;
        } finally {
            this.close();
        }
    }

    public Fee insert(Integer day, float value, Date dateStart, Date dateEnd, String type) {
        try {
            this.conn();
            Fee result = new Fee(day, value, dateStart, dateEnd, type);

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

    public Fee update(int id, Integer day, float value, Date dateStart, Date dateEnd, String type) {
        try {
            this.conn();
            Fee result = this.entityManager.find(Fee.class, id);

        if (result != null) {
            result.setDay(day);
            result.setValue(value);
            result.setDateStart(dateStart);
            result.setDateEnd(dateEnd);
            result.setType(type);

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
            Fee result = this.entityManager.find(Fee.class, id);

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


}
