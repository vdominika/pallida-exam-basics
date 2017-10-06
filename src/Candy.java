public class Candy extends Sweets {

    int amountOfCandy = 2;
    int priceOfCandy = 20;
    int sugarCandy = 10;

    public void createSweets(String s) {
        if (s == "candyShop.CANDY") {
            amountOfSugar = amountOfSugar - 10;
            income = income - 1;
            amountOfCandy = amountOfCandy + 1;
        }
    }
    public void sell (String s, int j){
        if (s == "CandyShop.CANDY"){
            income = income + (j * priceOfCandy);
            amountOfCandy = amountOfCandy - (j * amountOfCandy);
        }
    }
    public void raise (int k){
        priceOfCandy = (priceOfCandy + k);
    }
}
