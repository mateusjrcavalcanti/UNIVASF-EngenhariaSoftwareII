package Controller;

import Model.User;
import java.util.List;
import javax.persistence.TypedQuery;


public class UserController extends Controller {

    public UserController() {
        if(this.all().isEmpty()){
            User admin = this.insert("admin", "(87) 98877-6655", "111.222.444-55", "admin", "admin", true);
            System.out.println("ID: " + admin.getId());
            System.out.println("Nome: " + admin.getName());
            System.out.println("Usuário: " + admin.getUsername());
        }
    }
        
    public User find(int id) {
        try {
            this.conn();
            User result = this.entityManager.find(User.class, id);
            return result;
        } finally {            
            this.close();
        }
    }
    
    public List<User> all() {        
        try {
            this.conn();
            String jpql = "SELECT c FROM User c";
            TypedQuery<User> query = this.entityManager.createQuery(jpql, User.class);

            List<User> result = query.getResultList();

            return result;
        } finally {            
            this.close();
        }
    }
    
    public User insert(String name, String phone, String cpf, String username, String password, Boolean is_admin) {        
        try {
            this.conn();
            User result = new User(name, phone, cpf, username, password, is_admin);

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
    
    public User insert(String name, String phone, String cpf, String username, String password) {        
        return insert(name, phone, cpf, username, password,  false);
    }
    
    public User update(int id, String name, String phone, String cpf, String username, String password, Boolean is_admin) {        
        try {
            this.conn();
            User result = this.entityManager.find(User.class, id);

        if (result != null) {
            result.setName(name);
            result.setCpf(cpf);
            result.setPassword(password);
            result.setPhone(phone);
            result.setUsername(username);
            result.setIs_admin(is_admin);
            
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
