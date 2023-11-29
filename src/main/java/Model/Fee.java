package Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "fees")
public class Fee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "day")
    private Integer dayy;

    @Column(name = "value")
    private float value;

    @Column(name = "date_start")
    private Date dateStart;

    @Column(name = "date_end")
    private Date dateEnd;

    @Column(name = "type")
    private String type;

    @OneToMany(mappedBy = "fee")
    private List<FeeHouse> feeHouse = new ArrayList<>();

    public Fee() {
    }

    public Fee(Integer day, float value, Date dateStart, Date dateEnd, String type) {
        this.dayy = day;
        this.value = value;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.type = type;
    }

    public Integer getDay() {
        return dayy;
    }

    public void setDay(Integer day) {
        this.dayy = day;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<FeeHouse> getFeeHouse() {
        return feeHouse;
    }

    public void setFeeHouse(List<FeeHouse> feeHouse) {
        this.feeHouse = feeHouse;
    }


}
