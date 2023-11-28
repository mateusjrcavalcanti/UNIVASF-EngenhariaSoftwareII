package Model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "reservations")
public class Reservation implements Serializable {
    @Id
    @Column(name = "date")
    private Date datee;
    
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;   
        
    @ManyToOne
    @JoinColumn(name = "commom_area_id")
    private CommonArea area;    
    
    @OneToMany(mappedBy = "reservation", cascade = CascadeType.ALL) 
    private List<Guest> guests; 

    public Reservation() {
    }

    public Reservation(Date date, User user, CommonArea area) {
        this.datee = date;
        this.user = user;
        this.area = area;
    }

    public Date getDate() {
        return datee;
    }

    public void setDate(Date date) {
        this.datee = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public CommonArea getArea() {
        return area;
    }

    public void setArea(CommonArea area) {
        this.area = area;
    }

    public List<Guest> getGuests() {
        return guests;
    }

    public void setGuests(List<Guest> guests) {
        this.guests = guests;
    }
    
    
}
