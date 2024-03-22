package JavaOOPSconcepts;

import org.junit.jupiter.api.Test;

public class AT04_Encapsulation02 {
    @Test
    public void envMethod03() {

        AT03_Encapsulation01 obj = new AT03_Encapsulation01();
        //first method
        obj.encMethod01(10, 20); //30
        obj.encMethod01(100, 100); //200
    }

        @Test
        public void envMethod04(){

        AT03_Encapsulation01 obj = new AT03_Encapsulation01();
        //second method
        // here we are using the value from return statement into code
        int x = obj.encMethod02(90,90); //180
        int l = x+120;
        System.out.println("Value of l is : "+ l);

    }

    @Test
    public void envMethod05(){

        AT03_Encapsulation01 obj = new AT03_Encapsulation01();
        String CompanyName= obj.encMethod03("SoftwareTestLab");

        String FullCompanyName= CompanyName+" PTY LTD.";
        System.out.println("FullCompanyName is : "+ FullCompanyName);


    }
}
