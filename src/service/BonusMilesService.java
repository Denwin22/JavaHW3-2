package service;

public class BonusMilesService {
    public int calculate(int price, int bonusCalc) {
        return (price / bonusCalc);
    }
}
