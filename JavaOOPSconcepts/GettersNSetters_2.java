package JavaOOPSconcepts;

import org.junit.jupiter.api.Test;

public class GettersNSetters_2 {

   @Test
    public void callGettersNSetters(){
       GettersNSetters obj =new GettersNSetters();

       System.out.println(obj.getUsername());
       System.out.println(obj.getPassword());
       obj.setUsername("NewUserName");
       obj.setPassword("NewPassword");
       System.out.println(obj.getUsername());
       System.out.println(obj.getPassword());

   }
}
