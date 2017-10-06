public class Lollipop extends Sweets {

    int amountOfLollipop = 2;
    int priceOfLollipop = 10;
    int sugarLollipop = 5;

    public void createSweets(String s) {
        if (s == "candyShop.LOLLIPOP") {
            amountOfSugar = amountOfSugar - 10;
            income = income - 1;
            amountOfLollipop = amountOfLollipop + 1;
        }
    }
    public void raise (int k){
        priceOfLollipop = (priceOfLollipop + k);
    }
}