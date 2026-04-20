

public class UserConfirmationService {

    public void userConfirmation(User user, boolean userConfirmed) {
        if (!userConfirmed) {
            System.out.println("⚠️ User did not confirm registration.");
            return;
        }

        System.out.println("📧 Sending confirmation email to: " + user.getEmail());
    }
}
