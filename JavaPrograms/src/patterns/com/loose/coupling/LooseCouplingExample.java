package patterns.com.loose.coupling;

public class LooseCouplingExample {
    public static void main(String[] args) {
        UserDataProvider userDataProvider = new UserDatabase();
        UserManager userManagerWithDB = new UserManager(userDataProvider);
        System.out.println(userManagerWithDB.getUserInfo());

        //----------------------------------------------------------

        UserDataProvider webServiceProvider = new WebServiceDataProvider();
        UserManager userManagerWithWebService = new UserManager(webServiceProvider);
        System.out.println(userManagerWithWebService.getUserInfo());

        //----------------------------------------------------------

        UserDataProvider newDatabaseProvider = new NewDatabaseProvider();
        UserManager userManagerWithNewDatabase = new UserManager(newDatabaseProvider);
        System.out.println(userManagerWithNewDatabase.getUserInfo());
    }
}
