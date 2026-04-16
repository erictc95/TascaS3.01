public class UserMain {
    public static void main(String[] args) {
        User user = new User("Manolo", "manolo@gmail.com", "ManoloPass");
        UserService registerUser = new UserService();
        registerUser.validateUserEmail(user);
        registerUser.validateUserPassword(user);
        registerUser.comfirmUser(user);
    }
}
