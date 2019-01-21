package pojo;

import java.util.List;

public class User {
    private List<Double> startingSalaries;
    private double incrementPercent;
    private int incrementFrequency;
    private double deduction;
    private int deductionFrequency;
    private int yearsOfPrediction;
    private int totalNumberOfIncrements;
    private List<Double> incrementAmount;

    public List<Double> getStartingSalaries() { return startingSalaries; }

    public void setStartingSalaries(List<Double> startingSalaries) { this.startingSalaries = startingSalaries; }

    public double getIncrementPercent() { return incrementPercent; }

    public void setIncrementPercent(double incrementPercent) { this.incrementPercent = incrementPercent; }

    public int getIncrementFrequency() { return incrementFrequency; }

    public void setIncrementFrequency(int incrementFrequency) { this.incrementFrequency = incrementFrequency; }

    public double getDeduction() { return deduction; }

    public void setDeduction(double deduction) { this.deduction = deduction; }

    public int getDeductionFrequency() { return deductionFrequency; }

    public void setDeductionFrequency(int deductionFrequency) { this.deductionFrequency = deductionFrequency; }

    public int getYearsOfPrediction() { return yearsOfPrediction; }

    public void setYearsOfPrediction(int yearsOfPrediction) { this.yearsOfPrediction = yearsOfPrediction; }

    public int getTotalNumberOfIncrements() { return totalNumberOfIncrements; }

    public void setTotalNumberOfIncrements(int totalNumberOfIncrements) { this.totalNumberOfIncrements = totalNumberOfIncrements; }

    public List<Double> getIncrementAmount() { return incrementAmount; }

    public void setIncrementAmount(List<Double> incrementAmount) { this.incrementAmount = incrementAmount; }
}
