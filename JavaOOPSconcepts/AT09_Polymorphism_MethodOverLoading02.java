package JavaOOPSconcepts;

import org.junit.jupiter.api.Test;

public class AT09_Polymorphism_MethodOverLoading02 {
    @Test
    public void MethodCall() {
        AT08_Polymorphism_MethodOverLoading01 obj = new AT08_Polymorphism_MethodOverLoading01();
        obj.SumOfNum();
        obj.SumOfNum(90);
        obj.SumOfNum(80,90);
    }
}
