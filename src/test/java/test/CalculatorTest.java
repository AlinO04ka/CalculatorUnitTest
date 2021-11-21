package test;

import calculator.Calculator;
import dataProvider.DataProviderCalculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
    @Test(dataProvider = "subtractionDataProvider", dataProviderClass = DataProviderCalculator.class)
    public void differenceTest(int firstNumber, int secondNumber, int expectedResult) {
        Assert.assertEquals(Calculator.subtractNumbers(firstNumber, secondNumber), expectedResult);
    }

    @Test(dataProvider = "summaryDataProvider", dataProviderClass = DataProviderCalculator.class)
    public void sumTest(int firstNumber, int secondNumber, int expectedResult) {
        Assert.assertEquals(Calculator.summarizeNumbers(firstNumber, secondNumber), expectedResult);
    }

    @Test(dataProvider = "multiplicationDataProvider", dataProviderClass = DataProviderCalculator.class)
    public void multiplicationTest(int firstNumber, int secondNumber, int expectedResult) {
        Assert.assertEquals(Calculator.multiplyNumbers(firstNumber, secondNumber), expectedResult);
    }

    @Test(dataProvider = "divisionDataProvider", dataProviderClass = DataProviderCalculator.class)
    public void divisionTest(int firstNumber, int secondNumber, int expectedResult) {
        Assert.assertEquals(Calculator.divideNumbers(firstNumber, secondNumber), expectedResult);
    }

    @Test(dataProvider = "divisionByZeroDataProvider", dataProviderClass = DataProviderCalculator.class)
    public void divisionByZeroTest(int firstNumber, int secondNumber) {
        Assert.expectThrows(ArithmeticException.class, () -> Calculator.divideNumbers(firstNumber, secondNumber));
    }
}
