package dataProvider;

import org.testng.annotations.DataProvider;

public class DataProviderCalculator {
    @DataProvider
    public static Object[][] subtractionDataProvider() {
        return new Object[][]{{7, -7, 14}, {14, 4, 10}, {0, 1, -1}};
    }

    @DataProvider
    public static Object[][] summaryDataProvider() {
        return new Object[][]{{1, -2, -1}, {19, 11, 30}, {0, 11, 11}};
    }

    @DataProvider
    public static Object[][] multiplicationDataProvider() {
        return new Object[][]{{1, 0, 0}, {1, 1, 1}, {3, -7, -21}};
    }

    @DataProvider
    public static Object[][] divisionDataProvider() {
        return new Object[][]{{3, -1, -3}, {15, 5, 3}, {-7, -1, 7}};
    }

    @DataProvider
    public static Object[][] divisionByZeroDataProvider() {
        return new Object[][]{{18, 0}, {0, 0}};
    }
}
