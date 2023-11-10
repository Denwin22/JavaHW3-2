package main;

import service.BmiService;

public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.87;
        double weight = 98;
        int bmi = (int) service.calculate(height, weight);
        System.out.println("Индекс массы тела: " + bmi);
    }
}

//public class Main {
//    public static void main(String[] args) {
//        BonusMilesService service = new BonusMilesService();
//        int price = 10000;
//        int bonusCalc = 20;
//        int miles = service.calculate(price, bonusCalc); // должно получиться 500
//        System.out.println(miles);
//    }
//}0

//        CalcService distr = new CalcService();
//
//        System.out.println();
//        System.out.println("Проверка на большее значение:");
//        System.out.println(distr.denwin(25, 33));
//        System.out.println();
//        System.out.println("Проверка на большее значение:");
//        System.out.println(distr.denwin(100 * 2, 33 * 6));
//        System.out.println();
//        System.out.println("Проверка на большее значение:");
//        System.out.println(distr.denwin(25 / 2, 365 - 658));
//        System.out.println();
//        System.out.println("Проверка на большее значение:");
//        System.out.println(distr.denwin(-10, 10));
//        System.out.println();
//        System.out.println("Проверка на большее значение:");
//        System.out.println(distr.denwin(-10, -20));
////        int myCalc = service.denwin(17, 15);
////        System.out.println(myCalc);
//    }
//}