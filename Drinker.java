import java.util.ArrayList;

public class Drinker {

    public Drinker(){}


    public Drinker(String name){

        this.name = name;

    }

    private String name;
    private String wantDrink;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWantDrink() {
        return wantDrink;
    }

    public void setWantDrink(String wantDrink) {
        this.wantDrink = wantDrink;
    }


    public void buy(ArrayList<Drink> List){
        for (Drink coffee : List){
            if (this.wantDrink.equals(coffee.getCupType())){

                System.out.println(this.name + "请我喝了"  + "1杯" + coffee.getCupType() + coffee.getKind() );

            }


        }



    }


}
