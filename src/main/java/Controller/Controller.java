package Controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Controller {
    
    protected EntityManagerFactory entityManagerFactory ;
    protected EntityManager entityManager;
        
    public void conn() {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("maindatabase");
        this.entityManager =  entityManagerFactory.createEntityManager();
    }
    
    protected void close () {        
        if (entityManager != null) {
                entityManager.close();
                this.entityManager = null;
        }
        if (entityManagerFactory != null) {
                entityManagerFactory.close();
                this.entityManagerFactory = null;
        }
    }

}
