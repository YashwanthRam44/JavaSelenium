package JavaLearning;

import org.junit.jupiter.api.Test;

public class AT15_UserDir {
    @Test
    public void UserDirectory(){
        System.out.println(System.getProperty("user.dir"));
        //usr.dir --> project location --> this will work for all of them
        // this path is hardcoded--this wont work for other user
        String path = "C:\\Users\\softw\\Downloads\\mds-tests-master\\mds-tests-master\\automation\\YashProject-STL";
        //"C:\\Users\\yash\\YashProject-STL"
    }
}
