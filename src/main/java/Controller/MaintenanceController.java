package Controller;

import Model.CommonArea;
import Model.Maintenance;

import java.util.Date;
import java.util.List;
import javax.persistence.TypedQuery;


public class MaintenanceController extends Controller {

    public MaintenanceController() {
    }

    public Maintenance find(int id) {
        try {
            this.conn();
            Maintenance result = this.entityManager.find(Maintenance.class, id);
            return result;
        } finally {
            this.close();
        }
    }

    public List<Maintenance> all() {
        try {
            this.conn();
            String jpql = "SELECT c FROM Maintenance c";
            TypedQuery<Maintenance> query = this.entityManager.createQuery(jpql, Maintenance.class);

            List<Maintenance> result = query.getResultList();

            return result;
        } finally {
            this.close();
        }
    }

    public Maintenance insert(String description, Date date, CommonArea area) {
        try {
            this.conn();
            Maintenance result = new Maintenance(description, date, area);

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

    public Maintenance update(int id, String description, Date date, CommonArea area) {
        try {
            this.conn();
            Maintenance result = this.entityManager.find(Maintenance.class, id);

        if (result != null) {
            result.setDescription(description);
            result.setDate(date);
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
            Maintenance result = this.entityManager.find(Maintenance.class, id);

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
