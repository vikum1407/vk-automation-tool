package TestNGDataProvider;

import org.testng.annotations.Test;

public class TestClz {

    @Test(dataProvider = "LoginData",dataProviderClass = DataProviderClz.class)
    public void loginTest(String email, String name){

        System.out.println(email + " " + name);
    }
}
