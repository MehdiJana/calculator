package com.exemple.calculator;
import org.junit.Test;
import com.exemple.calculator.*;
import static org.junit.Assert.assertEquals;
public class CalculatorTest {
     private Calculator calculator = new Calculator();
     @Test
     public void testSum() {
          assertEquals(5, calculator.sum(2, 3));
     }
}