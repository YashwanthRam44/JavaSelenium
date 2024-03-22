package JavaLearning;

import org.junit.jupiter.api.Test;

// public is a access modifier
public class AT04_GlobalVariables { // Variables which we declare outside the class is known as global variable.

// global variables
    int i=10; // int is data type, i is a variable, 10 is a value and = is operator
    int j=20;
    String abc="TestLab";

    @Test
    public void test05() {
        //local variables
        int m =20+j; //j is 20; m =40
        int x = m; //m=40
        System.out.println("x value is : "+x); //40
    }

    @Test
    public void test06(){
        int k =i+j; //k=10+20=30
        System.out.println("k value is : "+k);
        System.out.println("abc value is : "+abc);
    }

}
