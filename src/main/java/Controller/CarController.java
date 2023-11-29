package Controller;

import Model.Car;
import Model.User;

import java.util.List;
import javax.persistence.TypedQuery;


public class CarController extends Controller {

    public CarController() {
    }

    public Car find(int id) {
        try {
            this.conn();
            Car result = this.entityManager.find(Car.class, id);
            return result;
        } finally {
            this.close();
        }
    }

    public List<Car> all() {
        try {
            this.conn();
            String jpql = "SELECT c FROM Car c";
            TypedQuery<Car> query = this.entityManager.createQuery(jpql, Car.class);

            List<Car> result = query.getResultList();

            return result;
        } finally {
            this.close();
        }
    }

    public Car insert(String plate, User user) {
        try {
            this.conn();
            Car result = new Car(plate, user);

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

    public Car update(int id, String plate, User user) {
        try {
            this.conn();
            Car result = this.entityManager.find(Car.class, id);

        if (result != null) {
            result.setPlate(plate);
            result.setUser(user);

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
            Car result = this.entityManager.find(Car.class, id);

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
