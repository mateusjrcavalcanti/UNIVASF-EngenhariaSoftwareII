package Model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "guests")
public class Guest implements Serializable {
    @Id
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User userr;

    @Id
    @ManyToOne
    @JoinColumn(name = "reservation_id")
    private Reservation reservation;

    public Guest() {
    }

    public Guest(User user, Reservation reservation) {
        this.userr = user;
        this.reservation = reservation;
    }

    public User getUser() {
        return userr;
    }

    public void setUser(User user) {
        this.userr = user;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    
}
