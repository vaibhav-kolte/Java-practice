package patterns.com.loose.coupling;

public class UserDatabase implements UserDataProvider {

    @Override
    public String getUserDetails() {
        return "User Details from Database";
    }
}
