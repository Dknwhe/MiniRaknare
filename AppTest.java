package se.ecutb.cai;

import org.junit.Assert;
import org.junit.Test;


public class AppTest
{

    @Test
    public void result_of_addition() {

        double n1= 4;
        double n2= 2;
        double expectedResult= 6;


        Assert.assertEquals(expectedResult,n1,n2);


    }

   @Test
    public void result_of_subtraction() {

       double n1 = 4;
       double n2 = 2;
       double expectedResult = 2;

       Assert.assertEquals(expectedResult,n1,n2);
   }


    @Test
    public void result_of_multiplications() {

        double n1 = 4;
        double n2 = 2;
        double expectedResult = 8;


        Assert.assertEquals(expectedResult,n1,n2);
    }

    @Test

    public void result_of_division() {

        double n1 = 4;
        double n2 = 2;
        double expectedResult = 2;

        

        Assert.assertEquals(expectedResult, n1,n2);

    }

}
