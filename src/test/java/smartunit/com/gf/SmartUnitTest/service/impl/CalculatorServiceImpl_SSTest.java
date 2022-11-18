/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.gf.SmartUnitTest.service.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import com.gf.SmartUnitTest.service.impl.CalculatorServiceImpl;
import org.junit.runner.RunWith;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CalculatorServiceImpl_SSTest extends CalculatorServiceImpl_SSTest_scaffolding {
// allCoveredLines:[7, 10, 15, 20, 25, 26, 27, 30]

  @Test(timeout = 4000)
  public void test_add_0()  throws Throwable  {
      //caseID:5189286bc28890a92e56d6949205950a
      //CoveredLines: [7, 10]
      //Input_0_int: 1377
      //Input_1_int: 0
      //Assert: assertEquals(1377, method_result);
      
      CalculatorServiceImpl calculatorServiceImpl0 = new CalculatorServiceImpl();
      
      //Call method: add
      int int0 = calculatorServiceImpl0.add(1377, 0);
      
      //Test Result Assert
      assertEquals(1377, int0);
  }

  @Test(timeout = 4000)
  public void test_divide_1()  throws Throwable  {
      //caseID:64b6841cab04b9059b6eb120bdd64c0e
      //CoveredLines: [7, 25, 30]
      //Input_0_int: 0
      //Input_1_int: 1
      //Assert: assertEquals(0, method_result);
      
      CalculatorServiceImpl calculatorServiceImpl0 = new CalculatorServiceImpl();
      
      //Call method: divide
      int int0 = calculatorServiceImpl0.divide(0, 1);
      
      //Test Result Assert
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_divide_2()  throws Throwable  {
      //caseID:1ba82c9b0659eeb36b900fc91c974dc3
      //CoveredLines: [7, 25, 26, 27]
      //Input_0_int: 0
      //Input_1_int: 0
      //Assert: assertEquals((-1), method_result);
      
      CalculatorServiceImpl calculatorServiceImpl0 = new CalculatorServiceImpl();
      
      //Call method: divide
      int int0 = calculatorServiceImpl0.divide(0, 0);
      
      //Test Result Assert
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test_minus_3()  throws Throwable  {
      //caseID:37cf1d19402f91d65a05de0ecfdc59b0
      //CoveredLines: [7, 15]
      //Input_0_int: 3499
      //Input_1_int: 712
      //Assert: assertEquals(2787, method_result);
      
      CalculatorServiceImpl calculatorServiceImpl0 = new CalculatorServiceImpl();
      
      //Call method: minus
      int int0 = calculatorServiceImpl0.minus(3499, 712);
      
      //Test Result Assert
      assertEquals(2787, int0);
  }

  @Test(timeout = 4000)
  public void test_multiply_4()  throws Throwable  {
      //caseID:210cf2f89e78b9ab7b940e318fc781ce
      //CoveredLines: [7, 20]
      //Input_0_int: 0
      //Input_1_int: 0
      //Assert: assertEquals(0, method_result);
      
      CalculatorServiceImpl calculatorServiceImpl0 = new CalculatorServiceImpl();
      
      //Call method: multiply
      int int0 = calculatorServiceImpl0.multiply(0, 0);
      
      //Test Result Assert
      assertEquals(0, int0);
  }
}
