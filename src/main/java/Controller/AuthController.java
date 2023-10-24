package Controller;

import Model.User;
import java.util.List;

public class AuthController extends Controller {
    
    private List<User> users;
    private User authenticatedUser;

    public AuthController() {
        UserController UserController = new UserController();
        this.users = UserController.all();            

        for (User user : users) {
            System.out.println("ID: " + user.getId());
            System.out.println("Nome: " + user.getName());
            System.out.println("Username: " + user.getUsername());
        }
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
