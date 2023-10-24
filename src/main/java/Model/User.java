package Model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String username;

    private String password;

    private Boolean is_admin;
    
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
      name = "users_houses",
      joinColumns = {@JoinColumn(name = "user_id")},
      inverseJoinColumns = {@JoinColumn(name = "home_id")}
    )
    
    private List<Home> houses;

    public User() {
    }

    public User(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }
    
    public User(String name, String username, String password, Boolean is_admin) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.is_admin = is_admin;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
            return id;
    }

    public void setId(int id) {
            this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getIs_admin() {
        return is_admin;
    }

    public void setIs_admin(Boolean is_admin) {
        this.is_admin = is_admin;
    }

    public List<Home> getHouses() {
        return houses;
    }   
    
    public Boolean getIs_resident(){
        if(this.houses.isEmpty()){ 
            return false;
        } else {
            return true;
        }
    }
	
}
