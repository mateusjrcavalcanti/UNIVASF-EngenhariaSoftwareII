package Controller;

import Model.CommonArea;
import Model.Reservation;
import Model.User;

import java.util.Date;
import java.util.List;
import javax.persistence.TypedQuery;


public class ReservationController extends Controller {

    public ReservationController() {
    }

    public Reservation find(int id) {
        try {
            this.conn();
            Reservation result = this.entityManager.find(Reservation.class, id);
            return result;
        } finally {
            this.close();
        }
    }

    public List<Reservation> all() {
        try {
            this.conn();
            String jpql = "SELECT c FROM Reservation c";
            TypedQuery<Reservation> query = this.entityManager.createQuery(jpql, Reservation.class);

            List<Reservation> result = query.getResultList();

            return result;
        } finally {
            this.close();
        }
    }

    public Reservation insert(Date date, User user, CommonArea area) {
        try {
            this.conn();
            Reservation result = new Reservation(date, user, area);

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

    public Reservation update(int id, Date date, User user, CommonArea area) {
        try {
            this.conn();
            Reservation result = this.entityManager.find(Reservation.class, id);

        if (result != null) {
            result.setDate(date);
            result.setUser(user);
            result.setArea(area);

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
            Reservation result = this.entityManager.find(Reservation.class, id);

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
