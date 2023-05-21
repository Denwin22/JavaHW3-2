public class Main {
    public static void main(String[] args) {
        double weight = 85;
        double height = 1.75;

        BmiService bmiService = new BmiService();
        int bmiValue = (int) bmiService.calculate(weight, height);
        System.out.println("Индекс массы тела (ИМТ): " + bmiValue);
    }
}