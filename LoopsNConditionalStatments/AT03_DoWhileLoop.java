package LoopsNConditionalStatments;

import org.junit.jupiter.api.Test;

public class AT03_DoWhileLoop {
    @Test
    public void DoWhileLoopLearn() {
        int ticketNum=40;
        do{
            System.out.println("Ticket number is : "+ ticketNum); //40
            ticketNum++;

        }while(ticketNum<=45);
    }
}
