package Controller;

import Model.Guest;
import Model.Reservation;
import Model.User;

import java.util.List;
import javax.persistence.TypedQuery;


public class GuestController extends Controller {

    public GuestController() {
    }

    public Guest find(int id) {
        try {
            this.conn();
            Guest result = this.entityManager.find(Guest.class, id);
            return result;
        } finally {
            this.close();
        }
    }

    public List<Guest> all() {
        try {
            this.conn();
            String jpql = "SELECT c FROM Guest c";
            TypedQuery<Guest> query = this.entityManager.createQuery(jpql, Guest.class);

            List<Guest> result = query.getResultList();

            return result;
        } finally {
            this.close();
        }
    }

    public Guest insert(User user, Reservation reservation) {
        try {
            this.conn();
            Guest result = new Guest(user, reservation);

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

    public Guest update(int id, User user, Reservation reservation) {
        try {
            this.conn();
            Guest result = this.entityManager.find(Guest.class, id);

        if (result != null) {
            result.setUser(user);
            result.setReservation(reservation);

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
            Guest result = this.entityManager.find(Guest.class, id);

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
