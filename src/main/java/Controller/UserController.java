package Controller;

import Model.User;
import java.util.List;
import javax.persistence.TypedQuery;


public class UserController extends Controller {
    
    public User find(int id) {
        try {
            User result = this.entityManager.find(User.class, id);
            return result;
        } finally {            
            this.close();
        }
    }
    
    public List<User> all() {        
        try {
            String jpql = "SELECT c FROM User c";
            TypedQuery<User> query = this.entityManager.createQuery(jpql, User.class);

            List<User> result = query.getResultList();

            return result;
        } finally {            
            this.close();
        }
    }
    
    public User insert(String name) {        
        try {
            User result = new User();
            result.setNome(name);

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
    
    public User update(int id, String novoNome) {        
        try {
            User result = this.entityManager.find(User.class, id);

        if (result != null) {
            result.setNome(novoNome);

            
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
            User result = this.entityManager.find(User.class, id);

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
