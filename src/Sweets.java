public class Sweets  extends CandyShop{

    int priceOfsugar = 100;
    int amountOfSugar = 270;

    public void buySugar (int i){
        amountOfSugar = amountOfSugar + i;
        income = income - (i * priceOfsugar);
    }
}
