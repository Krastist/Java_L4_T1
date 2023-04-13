public class BonusMilesService {
    public int calculate(int price) {
        int costMiles = 20;
        int miles = price / costMiles;
        return miles;
    }
}
