package homework;

public class ConsoleUserReporter implements UserReporter {
    private final UserData userData;

    public ConsoleUserReporter(UserData userData) {
        this.userData = userData;
    }

    @Override
    public void report() {
        System.out.println("Report for user: " + userData.getName());
    }
}