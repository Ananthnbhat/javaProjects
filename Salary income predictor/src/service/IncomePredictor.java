package service;

import pojo.User;

import java.util.List;

public class IncomePredictor {


    public static void calculateIncrement(List<Double> incrementingSalary, double incrementPercent,
                                 int incrementFrequency, int yearsOfPrediction,List<Double> incAmount) {
        User user = new User();
        int totalNumberOfIncrements = incrementFrequency * yearsOfPrediction;
        for (int i = 0; i < yearsOfPrediction; i++) {
            Double incrementAmount = getIncrementAmount(incrementingSalary.get(i), incrementPercent, incrementFrequency);
            incrementingSalary.add(incrementingSalary.get(i) + incrementAmount);

            incAmount.add(incrementAmount);

        }
        user.setIncrementAmount(incAmount);
        user.setIncrementingSalary(incrementingSalary);//is this even needed?
    }
//    public static void calculateDecrement(List<Double> decrementingSalary,double decrementPercent,
//                                          int decrementFrequency,int yearsOfPrediction,List<Double> decAmount){
//
//        User user = new User();
//        for (int i = 0; i < yearsOfPrediction; i++) {
//            Double decrementAmount = getDecrementAmount(decrementingSalary.get(i), decrementPercent, decrementFrequency);
//            decrementingSalary.add(decrementingSalary.get(i) - decrementAmount);
//
//            decAmount.add(decrementAmount);
//
//        }
//        user.setDecrementAmount(decAmount);
//        user.setDecrementingSalary(decrementingSalary);
//    }

    private static Double getIncrementAmount(Double startingSalary, double increment, int incrementFrequency) {
        return startingSalary * (increment / 100) * incrementFrequency;
    }

//    private static Double getDecrementAmount(Double startingSalary, double decrement, int decrementFrequency) {
//        return startingSalary * (decrement / 100) * decrementFrequency;
//    }
}
