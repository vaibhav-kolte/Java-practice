package patterns.com.loose.coupling;

public class UserManager {
    private final UserDataProvider dataProvider;

    public UserManager(UserDataProvider dataProvider) {
        this.dataProvider = dataProvider;
    }

    public String getUserInfo() {
        return dataProvider.getUserDetails();
    }
}
