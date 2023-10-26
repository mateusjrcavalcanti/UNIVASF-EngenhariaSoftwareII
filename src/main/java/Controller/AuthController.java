package Controller;

import Model.User;
import java.util.List;

public class AuthController extends Controller {
    
    private final List<User> users;
    private User authenticatedUser;

    public AuthController() {
        UserController UserController = new UserController();
        this.users = UserController.all();            

        for (User user : users) {
            System.out.println("ID: " + user.getId());
            System.out.println("Nome: " + user.getName());
            System.out.println("Username: " + user.getUsername());
        }
        
        if(this.users.isEmpty()){
            UserController.insert("Nome do Administrador", "(88) 97766-55-44", "123.456.789-00", "admin", "admin", true);
        }
        
        System.out.println("Total de usuários: " + this.users.size());     
    }

    public User auth(String email, String senha) {
        for (User user : users) {
            if (user.getUsername().equals(email) && user.getPassword().equals(senha)) {
                authenticatedUser = user;
            }
        }
        
        return authenticatedUser;
    }
}
