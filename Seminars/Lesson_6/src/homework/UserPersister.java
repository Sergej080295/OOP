package homework;

public class UserPersister {
    private final UserData userData;

    public UserPersister(UserData userData) {
        this.userData = userData;
    }

    public void save() {
        System.out.println("Save user: " + userData.getName());
    }
}