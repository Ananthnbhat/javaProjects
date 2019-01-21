package service;

import pojo.User;

import java.util.ArrayList;
import java.util.List;

public class IncomePredictor {


    public static void calculate(List<Double> startingSalary, double incrementPercent,
                                 int incrementFrequency, double deduction, int deductionFrequency, int yearsOfPrediction) {
        User user = new User();
        int totalNumberOfIncrements = incrementFrequency * yearsOfPrediction;
        List<Double> incAmountList = new ArrayList<>();
        for (int i = 0; i < yearsOfPrediction; i++) {
            Double incrementAmount = getIncrementAmount(startingSalary.get(i), incrementPercent, incrementFrequency);
            startingSalary.add(startingSalary.get(i) + incrementAmount);

            incAmountList.add(incrementAmount);

        }
        user.setIncrementAmount(incAmountList);
        user.setStartingSalaries(startingSalary);//is this even needed?
    }

    private static Double getIncrementAmount(Double startingSalary, double increment, int incrementFrequency) {
        return startingSalary * (increment / 100) * incrementFrequency;
    }
}
