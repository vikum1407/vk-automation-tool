package TestNGClassRoom;

import org.testng.annotations.Test;

public class GroupingTestNG {

    /**
     * check the group running from xml in 'Groupingtestng.xml' file
     */
    @Test(groups = {"sanity"})
    void  firstTest(){
        System.out.println("Stop car");
    }

    @Test(groups = {"regression"})
    void  secondTest(){
        System.out.println("Stop car");
    }

    @Test(groups = {"smoke", "regression"})
    void  thirdTest(){
        System.out.println("Stop car");
    }

    @Test(groups = {"smoke"})
    void  fourthTest(){
        System.out.println("Stop car");
    }

    @Test(groups = {"smoke", "sanity", "regression"})
    void  fiveTest(){
        System.out.println("Stop car");
    }

    /**
     * @author Vikum Sugathadasa
     */
}
