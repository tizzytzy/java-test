import java.util.ArrayList;


public class WeatherTest {

    public static void main(String[] args) {

        ArrayList<Weather> list1 = new ArrayList<Weather>();


        Weather weather2 = new Weather("短袖");
        weather2.setTemperature(30);
        weather2.setRain(false);
        weather2.setUmbrella(false);
        weather2.setDay("星期一");

        Weather weather3 = new Weather("外套");
        weather3.setTemperature(20);
        weather3.setRain(false);
        weather3.setUmbrella(false);
        weather3.setDay("星期二");


        Weather weather4 = new Weather("外套");
        weather4.setTemperature(24);
        weather4.setRain(true);
        weather4.setUmbrella(true);
        weather4.setDay("星期三");

        list1.add(weather2);
        list1.add(weather3);
        list1.add(weather4);

        for (Weather weather5 : list1) {
            String isRain = null;
            String isUmbrella = null;
            if (weather5.isRain() && weather5.isUmbrella()) {

                isRain = "下雨要打伞";
            }else {

                isRain = "";

            }

            System.out.println(weather5.getDay() + weather5.getTemperature() + "度" + isRain  + "要穿" + weather5.getClothesType());


        }
    }

}
