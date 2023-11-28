package Model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "fees_houses")
public class FeeHouse implements Serializable {  

    @Column(name = "status")
    private String status;       

    @Id
    @ManyToOne
    @JoinColumn(name = "fee_id")
    private Fee fee;

    @Id
    @ManyToOne
    @JoinColumn(name = "house_id")
    private House house;

    public FeeHouse() {
    }

    public FeeHouse(String status, Fee fee, House house) {
        this.status = status;
        this.fee = fee;
        this.house = house;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Fee getFee() {
        return fee;
    }

    public void setFee(Fee fee) {
        this.fee = fee;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }
    
    
}
