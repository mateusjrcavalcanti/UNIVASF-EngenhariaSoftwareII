package Model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "maintenance")
public class Maintenance implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "description")
    private String description; 
    
    @Column(name = "date")
    private Date datee; 

    @ManyToOne
    @JoinColumn(name = "common_area_id")
    private CommonArea area;
    
    @OneToMany(mappedBy = "maintenance", cascade = CascadeType.ALL) 
    private List<Stage> stages; 

    public Maintenance() {
    }

    public Maintenance(String description, Date date, CommonArea area) {
        this.description = description;
        this.datee = date;
        this.area = area;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return datee;
    }

    public void setDate(Date date) {
        this.datee = date;
    }

    public CommonArea getArea() {
        return area;
    }

    public void setArea(CommonArea area) {
        this.area = area;
    }
    
}
