package TestNGDataProvider;

import io.cucumber.java.it.Data;
import org.testng.annotations.DataProvider;

public class DataProviderClz {

    @DataProvider(name = "LoginData")
    public Object[][] getData(){

        Object[][] data = {{"viku@gmail.com","viku"},{"siku@gmail.com","siku"},{"tiku@gmail.com","tiku"}};

        return data;
    }
}
