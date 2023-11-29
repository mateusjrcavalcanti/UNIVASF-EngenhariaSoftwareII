package Controller;

import Model.CommonArea;

import java.util.List;
import javax.persistence.TypedQuery;


public class CommonAreaController extends Controller {

    public CommonAreaController() {
    }

    public CommonArea find(int id) {
        try {
            this.conn();
            CommonArea result = this.entityManager.find(CommonArea.class, id);
            return result;
        } finally {
            this.close();
        }
    }

    public List<CommonArea> all() {
        try {
            this.conn();
            String jpql = "SELECT c FROM CommonArea c";
            TypedQuery<CommonArea> query = this.entityManager.createQuery(jpql, CommonArea.class);

            List<CommonArea> result = query.getResultList();

            return result;
        } finally {
            this.close();
        }
    }

    public CommonArea insert(String name) {
        try {
            this.conn();
            CommonArea result = new CommonArea(name);

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

    public CommonArea update(int id, String name) {
        try {
            this.conn();
            CommonArea result = this.entityManager.find(CommonArea.class, id);

        if (result != null) {
            result.setName(name);

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
            CommonArea result = this.entityManager.find(CommonArea.class, id);

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
