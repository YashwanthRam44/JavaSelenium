package LoopsNConditionalStatments;

import org.junit.jupiter.api.Test;

public class AT06_ElseIf {
    @Test
    public void ElseIfLoopLearn() {
        String browser = "chrome";
        //chrome=CHROME
        if (browser.equalsIgnoreCase("CHROME")) {
            System.out.println("This test case will be executed in chrome");
            //IE=IE
        } else if(browser.equalsIgnoreCase("IE")){
            System.out.println("This test case will be executed in IE");
        }else if(browser.equalsIgnoreCase("FireFox")) {
            System.out.println("This test case will be executed in FireFox");
        }else {
            System.out.println("Browser is not installed");

        }

    }




}































