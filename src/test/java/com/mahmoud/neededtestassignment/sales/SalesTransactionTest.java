/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mahmoud.neededtestassignment.sales;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


/**
 *
 * @author Musab Mahmoud
 */
public class SalesTransactionTest {

    private static final int GOOD_TRANSACTION_ID = 500;
    private static final int GOOD_SALES_PERSON_ID = 10;
    private static final LocalDateTime GOOD_DATE = LocalDateTime.now();
    private static final int GOOD_ITEM_ID = 100;
    private static final BigDecimal GOOD_UNIT_PRICE = new BigDecimal("1.00");
    private static final int GOOD_QTY_SOLD = 1;
    private static SalesTransaction instance;

    public SalesTransactionTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
         instance = new SalesTransaction(GOOD_TRANSACTION_ID,GOOD_SALES_PERSON_ID
,GOOD_DATE,GOOD_ITEM_ID,GOOD_UNIT_PRICE,GOOD_QTY_SOLD);
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getTransactionId method, of class SalesTransaction.
     */
    @org.junit.Test
    public void testGetTransactionId() {
        setUp();
        int expResult = 500;
        int result = instance.getTransactionId();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSalesPersonId method, of class SalesTransaction.
     */
    @org.junit.Test
    public void testGetSalesPersonId() {
        setUp();
        int expResult = 10;
        int result = instance.getSalesPersonId();
        assertEquals(expResult, result);
        
    }

    
    /**
     * Test of getTransactionDateTime method, of class SalesTransaction.
     */
    @org.junit.Test
    public void testGetTransactionDateTime() {
        setUp();
        LocalDateTime expResult = GOOD_DATE;
        LocalDateTime result = instance.getTransactionDateTime();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getItemId method, of class SalesTransaction.
     */
    @org.junit.Test
    public void testGetItemId() {
        setUp();      
        int expResult = 100;
        int result = instance.getItemId();
        assertEquals(expResult, result);

    }

    /**
     * Test of getUnitPrice method, of class SalesTransaction.
     */
    @org.junit.Test
    public void testGetUnitPrice() {
      setUp();
        BigDecimal expResult =  new BigDecimal("1.00");
        BigDecimal result = instance.getUnitPrice();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getQuantitySold method, of class SalesTransaction.
     */
    @org.junit.Test
    public void testGetQuantitySold() {
     setUp();
        int expResult = 1;
        int result = instance.getQuantitySold();
        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class SalesTransaction.
     */
    @org.junit.Test
    public void testToString() {
        setUp();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult.toString(),"");
//        // TODO review the generated test code and remove the default call to fail.
//       fail("The test case is a prototype.");
    }

    @org.junit.Test
    public void testSetTransactionIdArbitraryGood() {
        //first initilize 
            setUp();
//        SalesTransaction instance = null;

            int expResult = 500;
        // second .call the method    
//            instance.setTransactionId(expResult);
            int result = instance.getTransactionId();
//            //third. assert
              assertEquals(expResult,result);
        
        // call the appropriate method to set the necessary GOOD value
        // use assertEquals to compare an expected value with an actual value. The actual value must come from the getter method.
//        fail("Remove this line");
    }

    @org.junit.Test
    public void testSetTransactionIdZeroGood() {
        setUp();
        int expResult=500;
        int result=instance.getTransactionId();
        assertEquals(expResult,result);
        
        // call the appropriate method to set the necessary GOOD value
        // use assertEquals to compare an expected value with an actual value. The actual value must come from the getter method.
//        fail("Remove this line");
    }

    @org.junit.Test
    public void testSetTransactionIdNegativeBad() {
        setUp();
        
        try {
            instance.setTransactionId(-1);
             fail("your method is accept negative value");

        } catch (Exception e) {
            assertTrue(true);
        }
        
        // use a try-catch statement
        // inside try, call the appropriate method to set the necessary BAD value 
        // inside try, call the fail method, with an appropriate message, if the program allows the setter to process
        // inside catch, use assertTrue with any truthy expression
//        fail("Remove this line");
    }

    @org.junit.Test
    public void testSetSalesPersonIdBadZero() {
        setUp();
        try {
            instance.setSalesPersonId(0);
                    fail("this method accept 0");

        } catch (Exception e) {
            assertTrue(true);
            
        }
        // use a try-catch statement
        // inside try, call the appropriate method to set the necessary BAD value 
        // inside try, call the fail method, with an appropriate message, if the program allows the setter to process
        // inside catch, use assertTrue with any truthy expression
//        fail("Remove this line");
    }

    @org.junit.Test
    public void testSetSalesPersonIdOneGood() {
        setUp();
        instance.setSalesPersonId(GOOD_SALES_PERSON_ID);
        int result= instance.getSalesPersonId();
        assertEquals(GOOD_SALES_PERSON_ID,result);
        // call the appropriate method to set the necessary GOOD value
        // use assertEquals to compare an expected value with an actual value. The actual value must come from the getter method.
//        fail("Remove this line");
    }

    @org.junit.Test
    public void testSetSalesPersonIdArbitraryGood() {
        setUp();
        instance.setSalesPersonId(GOOD_SALES_PERSON_ID);
        int result= instance.getSalesPersonId();
        assertEquals(GOOD_SALES_PERSON_ID,result);
        // call the appropriate method to set the necessary GOOD value
        // use assertEquals to compare an expected value with an actual value. The actual value must come from the getter method.
//        fail("Remove this line");
    }

    @org.junit.Test
    public void testSetSalesDateTimeTodayGood() {
        setUp();
        instance.setTransactionDateTime(GOOD_DATE);
        LocalDateTime result= instance.getTransactionDateTime();
        assertEquals(GOOD_DATE,result);
        
        // call the appropriate method to set the necessary GOOD value
        // use assertEquals to compare an expected value with an actual value. The actual value must come from the getter method.
//        fail("Remove this line");
    }

    @org.junit.Test
    public void testSetSalesDateTimeTomorrowBad() {
        setUp();
        try {
            instance.setTransactionDateTime(GOOD_DATE.plusDays(1));
            fail("your method accept tomorrow");
        } catch (Exception e) {
            assertTrue(true);
        }
        // use a try-catch statement
        // inside try, call the appropriate method to set the necessary BAD value 
        // inside try, call the fail method, with an appropriate message, if the program allows the setter to process
        // inside catch, use assertTrue with any truthy expression
//        fail("Remove this line");
    }

    @org.junit.Test
    public void testSetSalesDateTimeMinus31DaysBad() {
        setUp();
        try {
            instance.setTransactionDateTime(LocalDateTime.now().minusDays(31));
            fail("your method accept minus 31 days");
            
        } catch (Exception e) {
            assertTrue(true);
        }
        // use a try-catch statement
        // inside try, call the appropriate method to set the necessary BAD value 
        // inside try, call the fail method, with an appropriate message, if the program allows the setter to process
        // inside catch, use assertTrue with any truthy expression
//        fail("Remove this line");
    }

    @org.junit.Test
    public void testSetSalesDateTimeMinus30DaysGood() {
        setUp();
        instance.setTransactionDateTime(GOOD_DATE.minusDays(29));
        
        LocalDateTime result= instance.getTransactionDateTime();
        assertEquals(GOOD_DATE.minusDays(29),result);
        // call the appropriate method to set the necessary GOOD value
        // use assertEquals to compare an expected value with an actual value. The actual value must come from the getter method.
//        fail("Remove this line");
        
    }

    @org.junit.Test
    public void testSetItemIdZeroBad() {
        setUp();
        try {
            instance.setItemId(0);
            fail("your method accept 0");
            
            
        } catch (Exception e) {
            assertTrue(true);
        }
        // use a try-catch statement
        // inside try, call the appropriate method to set the necessary BAD value 
        // inside try, call the fail method, with an appropriate message, if the program allows the setter to process
        // inside catch, use assertTrue with any truthy expression
//        fail("Remove this line");
    }

    @org.junit.Test
    public void testSetItemIdOneGood() {
        setUp();
        instance.setItemId(GOOD_ITEM_ID);
       int result=instance.getItemId();
       assertEquals(GOOD_ITEM_ID,result);
        // call the appropriate method to set the necessary GOOD value
        // use assertEquals to compare an expected value with an actual value. The actual value must come from the getter method.
//        fail("Remove this line");
    }

    @org.junit.Test
    public void testSetItemIdArbitraryGood() {
        setUp();
        instance.setItemId(GOOD_ITEM_ID);
        int result=instance.getItemId();
        assertEquals(GOOD_ITEM_ID,result);
        // call the appropriate method to set the necessary GOOD value
        // use assertEquals to compare an expected value with an actual value. The actual value must come from the getter method.
//        fail("Remove this line");
    }

    @org.junit.Test
    public void testSetUnitPriceNegativeBad() {
        setUp();
        try {
            instance.setUnitPrice(new BigDecimal("-1.00"));
            fail("your method accept this");
        } catch (Exception e) {
            assertTrue(true);
        }
        // use a try-catch statement
        // inside try, call the appropriate method to set the necessary BAD value 
        // inside try, call the fail method, with an appropriate message, if the program allows the setter to process
        // inside catch, use assertTrue with any truthy expression
//        fail("Remove this line");
    }

    @org.junit.Test
    public void testSetUnitPriceZeroGood() {
        
        setUp();
        instance.setUnitPrice(GOOD_UNIT_PRICE);
        BigDecimal result=instance.getUnitPrice();
        assertEquals(GOOD_UNIT_PRICE,result);
        // call the appropriate method to set the necessary GOOD value
        // use assertEquals to compare an expected value with an actual value. The actual value must come from the getter method.
//        fail("Remove this line");
    }

    @org.junit.Test
    public void testSetUnitPriceArbitraryGood() {
        setUp();
        instance.setUnitPrice(GOOD_UNIT_PRICE);
        BigDecimal result=instance.getUnitPrice();
        assertEquals(GOOD_UNIT_PRICE,result);
        // call the appropriate method to set the necessary GOOD value
        // use assertEquals to compare an expected value with an actual value. The actual value must come from the getter method.
//        fail("Remove this line");
    }

    @org.junit.Test
    public void testSetUnitPriceOneDecimalGood() {
        setUp();
        instance.setUnitPrice(GOOD_UNIT_PRICE);
        BigDecimal result=instance.getUnitPrice();
        assertEquals(GOOD_UNIT_PRICE,result);
        // call the appropriate method to set the necessary GOOD value
        // use assertEquals to compare an expected value with an actual value. The actual value must come from the getter method.
//        fail("Remove this line");
    }

    @org.junit.Test
    public void testSetUnitPriceThreeDecimalsGood() {
        setUp();
        instance.setUnitPrice(GOOD_UNIT_PRICE);
        BigDecimal result=instance.getUnitPrice();
        assertEquals(GOOD_UNIT_PRICE,result);
        
        // call the appropriate method to set the necessary GOOD value
        // use assertEquals to compare an expected value with an actual value. The actual value must come from the getter method.
//        fail("Remove this line");
    }

    @org.junit.Test
    public void testSetQuantitySoldZeroBad() {
        try {
            instance.setQuantitySold(0);
            fail("your method accept these");
            
        } catch (Exception e) {
            assertTrue(true);
        }
        // use a try-catch statement
        // inside try, call the appropriate method to set the necessary BAD value 
        // inside try, call the fail method, with an appropriate message, if the program allows the setter to process
        // inside catch, use assertTrue with any truthy expression
//        fail("Remove this line");
    }

    @org.junit.Test
    public void testSetQuantitySoldOneGood() {
        setUp();
        instance.setQuantitySold(GOOD_QTY_SOLD);
        int result=instance.getQuantitySold();
        assertEquals(GOOD_QTY_SOLD,result);
        // call the appropriate method to set the necessary GOOD value
        // use assertEquals to compare an expected value with an actual value. The actual value must come from the getter method.
//        fail("Remove this line");
    }

    @org.junit.Test
    public void testSetQuantitySoldArbitraryGood() {
        setUp();
        instance.setQuantitySold(GOOD_QTY_SOLD);
        int result=instance.getQuantitySold();
        assertEquals(GOOD_QTY_SOLD,result);
        // call the appropriate method to set the necessary GOOD value
        // use assertEquals to compare an expected value with an actual value. The actual value must come from the getter method.
//        fail("Remove this line");
    }

    @org.junit.Test
    public void testCompareToFirstDateEarlier() {
        setUp();
        SalesTransaction other= instance;
        other.setTransactionDateTime(GOOD_DATE.minusDays(0));
     
        int result=instance.compareTo(other);
        assertEquals(0,result);

        // instantiate a second mock object using aribitray acceptable values, modify the date as necessary
        // use assertTrue with an expression that uses the .compareTo() method
//        fail("Remove this line");
    }

    @org.junit.Test
    public void testCompareToBothDatesEqual() {
        setUp();
        SalesTransaction other= instance;
        other.setTransactionDateTime(GOOD_DATE);
         int result=instance.compareTo(other);
        assertEquals(0,result);
        
        // instantiate a second mock object using aribitray acceptable values, modify the date as necessary
        // use assertTrue with an expression that uses the .compareTo() method
//        fail("Remove this line");
    }

    @org.junit.Test
    public void testCompareToOtherDateEarlier() {
        
        setUp();
        SalesTransaction other= instance;
        other.setTransactionDateTime(GOOD_DATE.minusDays(0));
     
        int result=instance.compareTo(other);
        assertEquals(0,result);
        
        // instantiate a second mock object using aribitray acceptable values, modify the date as necessary
        // use assertTrue with an expression that uses the .compareTo() method
//       fail("Remove this line");
    }


}
