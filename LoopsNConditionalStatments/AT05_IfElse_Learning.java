package LoopsNConditionalStatments;

import org.junit.jupiter.api.Test;

public class AT05_IfElse_Learning {

    @Test
    public void IfElseLoopLearning() {
        String browser = "chrome";
        if(browser.equalsIgnoreCase("CHROM")){
            System.out.println("This test case will be executed in chrome");
        }else{
            System.out.println("This test case will not execute on chrome");
        }

    }
}
