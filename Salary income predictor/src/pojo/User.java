package pojo;

import java.util.List;

public class User {
    private List<Double> incrementingSalary;
    private List<Double> decrementingSalary;
    private double incrementPercent;
    private int incrementFrequency;
    private double deductionPercent;
    private int deductionFrequency;
    private int yearsOfPrediction;
    private int totalNumberOfIncrements;
    private List<Double> incrementAmount;
    private List<Double> decrementAmount;

    public List<Double> getIncrementingSalary() { return incrementingSalary; }

    public void setIncrementingSalary(List<Double> incrementingSalary) { this.incrementingSalary = incrementingSalary; }

    public List<Double> getDecrementingSalary() { return decrementingSalary; }

    public void setDecrementingSalary(List<Double> decrementingSalary) { this.decrementingSalary = decrementingSalary; }

    public double getIncrementPercent() { return incrementPercent; }

    public void setIncrementPercent(double incrementPercent) { this.incrementPercent = incrementPercent; }

    public int getIncrementFrequency() { return incrementFrequency; }

    public void setIncrementFrequency(int incrementFrequency) { this.incrementFrequency = incrementFrequency; }

    public double getDeductionPercent() { return deductionPercent; }

    public void setDeductionPercent(double deductionPercent) { this.deductionPercent = deductionPercent; }

    public int getDeductionFrequency() { return deductionFrequency; }

    public void setDeductionFrequency(int deductionFrequency) { this.deductionFrequency = deductionFrequency; }

    public int getYearsOfPrediction() { return yearsOfPrediction; }

    public void setYearsOfPrediction(int yearsOfPrediction) { this.yearsOfPrediction = yearsOfPrediction; }

    public int getTotalNumberOfIncrements() { return totalNumberOfIncrements; }

    public void setTotalNumberOfIncrements(int totalNumberOfIncrements) { this.totalNumberOfIncrements = totalNumberOfIncrements; }

    public List<Double> getIncrementAmount() { return incrementAmount; }

    public void setIncrementAmount(List<Double> incrementAmount) { this.incrementAmount = incrementAmount; }

    public List<Double> getDecrementAmount() { return decrementAmount; }

    public void setDecrementAmount(List<Double> decrementAmount) { this.decrementAmount = decrementAmount; }
}
