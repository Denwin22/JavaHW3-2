public class BmiService {
    public double calculate(double weight, double height) {
        if (weight <= 0 || height <= 0) {
        }
        double bmi = weight / (height * height);
        return bmi;
    }
}