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

        double actualResult = MiniRaknare.add(n1,n2);

        Assert.assertEquals(expectedResult,actualResult, 0);


    }

   @Test
    public void result_of_subtraction() {

       double n1 = 4;
       double n2 = 2;
       double expectedResult = 2;

       double actualResult = MiniRaknare.sub(n1,n2);


       Assert.assertEquals(expectedResult,actualResult,0);
   }


    @Test
    public void result_of_multiplications() {

        double n1 = 4;
        double n2 = 2;
        double expectedResult = 8;

        double actualResult = MiniRaknare.multi(n1,n2);


        Assert.assertEquals(expectedResult,actualResult,0);
    }

    @Test

    public void result_of_division() {

        double n1 = 4;
        double n2 = 2;
        double expectedResult = 2;

        double actualResult = MiniRaknare.div(n1,n2);

        Assert.assertEquals(expectedResult, actualResult, 0);

    }

}
