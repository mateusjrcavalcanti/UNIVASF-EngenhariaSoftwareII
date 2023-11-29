package Controller;

import Model.Maintenance;
import Model.Stage;

import java.util.List;
import javax.persistence.TypedQuery;


public class StageController extends Controller {

    public StageController() {
    }

    public Stage find(int id) {
        try {
            this.conn();
            Stage result = this.entityManager.find(Stage.class, id);
            return result;
        } finally {
            this.close();
        }
    }

    public List<Stage> all() {
        try {
            this.conn();
            String jpql = "SELECT c FROM Stage c";
            TypedQuery<Stage> query = this.entityManager.createQuery(jpql, Stage.class);

            List<Stage> result = query.getResultList();

            return result;
        } finally {
            this.close();
        }
    }

    public Stage insert(String description, Maintenance maintenance, Boolean status) {
        try {
            this.conn();
            Stage result = new Stage(description, maintenance, status);

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

    public Stage update(int id, String description, Maintenance maintenance, Boolean status) {
        try {
            this.conn();
            Stage result = this.entityManager.find(Stage.class, id);

        if (result != null) {
            result.setDescription(description);
            result.setMaintenance(maintenance);
            result.setStatus(status);

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
            Stage result = this.entityManager.find(Stage.class, id);

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
