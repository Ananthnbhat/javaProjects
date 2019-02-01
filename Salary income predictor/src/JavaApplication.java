import pojo.User;
import service.IncomePredictor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaApplication {
    public static boolean contains(int[] arr, int item) {
        for (int n : arr) {
            if (item == n) {
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        int[] freq = {1, 2, 3};
        User user = new User();
        IncomePredictor incomePredictor = new IncomePredictor();
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter the starting salary");

            List<Double> salary = new ArrayList<>();
            salary.add(Double.valueOf(scanner.nextLine()));
            user.setIncrementingSalary(salary);
//            user.setDecrementingSalary(salary);


            List<Double> amt = new ArrayList<>();
            user.setIncrementAmount(amt);
//            user.setDecrementAmount(amt);

            System.out.println("Enter the percentage of increment");
            double increment = Double.valueOf(scanner.nextLine());
            if (increment < 0)
                throw new Exception();
            user.setIncrementPercent(increment);

            System.out.println("Enter how frequently the increment is received");
            System.out.println("If it is Quarterly, enter 3. Enter 2 for Half-yearly and Enter 1 for Yearly");
            int incrementFrequency = Integer.parseInt(scanner.nextLine());
            if (!contains(freq, incrementFrequency))
                throw new Exception();
            user.setIncrementFrequency(incrementFrequency);
//
//            System.out.println("Enter the percentage of deduction");
//            double deduction = Double.valueOf(scanner.nextLine());
//            if (deduction < 0)
//                throw new Exception();
//            user.setDeductionPercent(deduction);
//
//            System.out.println("Enter how frequently the deduction is received");
//            System.out.println("If it is Quarterly, enter 3. Enter 2 for Half-yearly and Enter 1 for Yearly");
//            int deductionFrequency = Integer.parseInt(scanner.nextLine());
//            if (!contains(freq, deductionFrequency))
//                throw new Exception();
//            user.setDeductionFrequency(deductionFrequency);

            System.out.println("Enter the number of Years for which prediction of salary is required");
            int years = Integer.parseInt(scanner.nextLine());
            if (years < 0)
                throw new Exception();
            user.setYearsOfPrediction(years);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        IncomePredictor.calculateIncrement(user.getIncrementingSalary(), user.getIncrementPercent(), user.getIncrementFrequency(),
                user.getYearsOfPrediction(), user.getIncrementAmount());

//        IncomePredictor.calculateDecrement(user.getDecrementingSalary(),user.getDeductionPercent(),user.getDeductionFrequency(),
//                user.getYearsOfPrediction(),user.getDecrementAmount());

        System.out.println(user.getIncrementingSalary());
        System.out.println(user.getIncrementAmount());
        System.out.println(user.getIncrementPercent());
        System.out.println(user.getIncrementFrequency());
//
//        System.out.println(user.getDecrementingSalary());
//        System.out.println(user.getDecrementAmount());
//        System.out.println(user.getDeductionPercent());
//        System.out.println(user.getDeductionFrequency());
        System.out.println(user.getYearsOfPrediction());
    }
}
