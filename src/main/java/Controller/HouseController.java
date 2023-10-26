package Controller;

import Model.House;
import java.util.List;
import javax.persistence.TypedQuery;


public class HouseController extends Controller {

    public HouseController() {
    }
    
    public House find(int id) {
        try {
            this.conn();
            House result = this.entityManager.find(House.class, id);
            return result;
        } finally {            
            this.close();
        }
    }
    
    public List<House> all() {        
        try {
            this.conn();
            String jpql = "SELECT c FROM House c";
            TypedQuery<House> query = this.entityManager.createQuery(jpql, House.class);

            List<House> result = query.getResultList();

            return result;
        } finally {            
            this.close();
        }
    }
    
    public House insert(String adress, int size, int number) {        
        try {
            this.conn();
            House result = new House(adress, size, number);

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
    
    public House update(int id, String adress, int size, int number) {        
        try {
            this.conn();
            House result = this.entityManager.find(House.class, id);

        if (result != null) {
            result.setAdress(adress);
            result.setSize(size);
            result.setNumber(number);
            
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
            House result = this.entityManager.find(House.class, id);

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
