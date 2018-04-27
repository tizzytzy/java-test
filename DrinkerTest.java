import java.util.ArrayList;

public class DrinkerTest {

    public static void main(String[] args) {


        ArrayList<Drink> List = new ArrayList();
        Drink coffee = new Drink("榛果星冰乐");
        coffee.setCupType("大杯");

        Drink coffee1 = new Drink("榛果星冰乐");
        coffee1.setCupType("超大杯");

        Drink coffee2 = new Drink("榛果星冰乐");
        coffee2.setCupType("中杯");


        List.add(coffee);
        List.add(coffee1);
        List.add(coffee2);



        Drinker drinker = new Drinker("小明");
        drinker.setWantDrink("大杯");




        drinker.buy(List);










    }

}
