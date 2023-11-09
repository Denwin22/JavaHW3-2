package main;

import service.BonusMilesService;

public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int privetcena = 10000;
        int bonusCalc = 20;
        int miles = service.calculate(price, bonusCalc); // должно получиться 500
        System.out.println(miles);
    }
}

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