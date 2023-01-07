public class BonusMilesService {
    public int calculate(int cost) {
        int rubForAMiles = 20;
        int bonusMiles = (cost / rubForAMiles);
        return bonusMiles;

    }


}
