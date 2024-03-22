package LoopsNConditionalStatments;

import org.junit.jupiter.api.Test;

public class AT07_SwitchStatement {
    @Test
    public void SwitchStatmentLearn() {

        switch (4){
            case 1:
                System.out.println("1st one will be selected");
                break;
            case 2:
                System.out.println("2nd one selected");
                break;
            case 3:
                System.out.println("3rd one selected");
                break;
            case 4:
                System.out.println("4th one selected");
                break;
            default:
                System.out.println("none selected");


        }
    }
}
