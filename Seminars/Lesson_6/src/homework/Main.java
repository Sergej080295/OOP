package homework;

public class Main {
    public static void main(String[] args) {
        UserData userData = new UserData("Bob");
        UserPersister userPersister = new UserPersister(userData);
        UserReporter userReporter = new ConsoleUserReporter(userData);

        userPersister.save();
        userReporter.report();
    }
}