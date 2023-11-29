package Controller;

import Model.Message;
import Model.User;

import java.util.List;
import javax.persistence.TypedQuery;


public class MessageController extends Controller {

    public MessageController() {
    }

    public Message find(int id) {
        try {
            this.conn();
            Message result = this.entityManager.find(Message.class, id);
            return result;
        } finally {
            this.close();
        }
    }

    public List<Message> all() {
        try {
            this.conn();
            String jpql = "SELECT c FROM Message c";
            TypedQuery<Message> query = this.entityManager.createQuery(jpql, Message.class);

            List<Message> result = query.getResultList();

            return result;
        } finally {
            this.close();
        }
    }

    public Message insert(String message, User user) {
        try {
            this.conn();
            Message result = new Message(message, user);

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

    public Message update(int id, String message, User user) {
        try {
            this.conn();
            Message result = this.entityManager.find(Message.class, id);

        if (result != null) {
            result.setMessage(message);
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
            Message result = this.entityManager.find(Message.class, id);

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
