package financialForecasting;

public class FinancialForecast {

    static double baseValue = 1000;
    static double growthRate = 0.05;

    // STEP 4: Recursive method
    public static double futureValue(int year) {

        // Base case
        if (year == 0) {
            return baseValue;
        }

        // Recursive case
        return futureValue(year - 1) * (1 + growthRate);
    }

    public static void main(String[] args) {

        int year = 5;

        double result = futureValue(year);

        System.out.println("Future value after " + year + " years: " + result);
    }
}
