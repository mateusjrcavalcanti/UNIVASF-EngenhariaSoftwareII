package Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "houses")
public class House implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "adress")
    private String adress;
    
    @Column(name = "size")
    private int sizee;
    
    @Column(name = "number")
    private int number;

    @ManyToMany(mappedBy = "houses")
    private List<User> users;    

    @OneToMany(mappedBy = "house")
    private List<FeeHouse> feeHouse = new ArrayList<>();
        
    public House() {
    }

    public House(String adress, int size, int number) {
        this.adress = adress;
        this.sizee = size;
        this.number = number;
    } 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public int getSize() {
        return sizee;
    }

    public void setSize(int size) {
        this.sizee = size;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    } 

    public List<FeeHouse> getFeeHouse() {
        return feeHouse;
    }

    public void setFeeHouse(List<FeeHouse> feeHouse) {
        this.feeHouse = feeHouse;
    }
      
}
