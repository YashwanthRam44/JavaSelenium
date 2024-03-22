package JavaLearning;

import org.junit.jupiter.api.Test;

public class AT14_TrimLearing {

    @Test
    public void trimlearn() {
        String MyName = "            software      ";
        System.out.println("MyName is:" + MyName);
        //Trim will remove front and back spaces
        System.out.println("MyTrimmedName is:" + MyName.trim() );
    }

}
