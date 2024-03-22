package JavaOOPSconcepts;

import org.junit.jupiter.api.Test;

public class AT03_Encapsulation01 {
    @Test
    public void encMethod01(int i, int j){
        int m = i+j;
        System.out.println("added total is : "+ m);

    }

    @Test
    public int encMethod02(int l, int m) {
        int k = l + m;
        System.out.println("added total is : " + k);
        return k;
    }


    @Test
    public String encMethod03(String MyName) {
        System.out.println("MyName is : " + MyName);
        return MyName;
    }


}
