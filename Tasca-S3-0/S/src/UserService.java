

public class UserService {


    public void comfirmUser(User user) {
        System.out.println("📧 Sending confirmation email to: " + user.getEmail());

        boolean userConfirmed = true;
        if (!userConfirmed) {
            System.out.println("⚠️ User did not confirm registration.");
            return;
        }
    }

    public void validateUserEmail(User user) {
        if (user.getEmail() == null || !user.getEmail().contains("@") || !user.getEmail().contains(".")) {
            throw new IllegalArgumentException("Invalid email address.");
        }
    }

    public void validateUserPassword(User user) {
        if (user.getPassword() == null || user.getPassword().length() < 8 || !user.getPassword().matches(".*[A-Z].*")) {
            throw new IllegalArgumentException("Password must be at least 8 characters long and contain an uppercase letter.");
        }
    }
}
