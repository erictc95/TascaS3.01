public class UserMain {
    public static void main(String[] args) {
        User user = new User("Manolo", "manolo@gmail.com", "ManoloPass");
        UserConfirmationService userConfirmationService = new UserConfirmationService();
        UserValidator userValidator = new UserValidator();
        userValidator.validateUserEmail(user);
        userValidator.validateUserPassword(user);
        userConfirmationService.userConfirmation(user, true);
    }
}
