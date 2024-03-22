package JavaLearning;

import org.junit.jupiter.api.Test;

public class AT10_ArrayLoop {

    @Test
    public void test14() {
        // variable age is an arr
        int[] age ={10,20,30,40,50,60,70,80};
        // this length will tell the total number of items present in an array
        int ArraySize = age.length; //how many boxes are there
        System.out.println("Length of Array is  : "+ ArraySize); //6

        for(int i=0;i<ArraySize;i++){

            System.out.println("index : "+ i+" and its value is : " + age[i] );
        }



    }

}
