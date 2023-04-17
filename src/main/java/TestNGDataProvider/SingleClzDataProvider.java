package TestNGDataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SingleClzDataProvider {

    @Test(dataProvider = "LoginDataProvider")
    public void loginTest(String email, String name){

        System.out.println(email+" "+name);

    }

    @DataProvider(name = "LoginDataProvider")
    public Object[][] getData(){

        Object[][] data={{"viku@gmail.com","viku"},{"siku@gmail.com","siku"},{"tiku@gmail.com","tiku"}};

        return data;
    }
}
