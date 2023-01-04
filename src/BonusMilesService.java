public class BonusMilesService {
    public int calculate(int cost) {
        int rub_for_a_miles = 20;
        int bonus_miles = (cost / rub_for_a_miles);
        return bonus_miles;

    }


}
