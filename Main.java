import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;


public class Main {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        ArrayList<Weather> list = new ArrayList();

        Weather weather = new Weather("短袖");
        weather.setTemperature(30);
        weather.setRain(false);
        weather.setUmbrella(false);
        calendar.set(2018,4,20);
        weather.setWeek(calendar.getTime());

        calendar.clear();

        Weather weather1 = new Weather("外套");
        weather1.setTemperature(15);
        weather1.setRain(true);
        weather1.setUmbrella(true);
        calendar.set(2018,4,21);
        weather1.setWeek(calendar.getTime());

        calendar.clear();

        list.add(weather);
        list.add(weather1);

        System.out.println("最近" + list.size() + "天天气情况如下：");
        System.out.println("日期 | 是否有雨 | 是否需要带伞 | 温度 | 着装建议 ");
        for(Weather weather2 : list){
            System.out.println(weather2.getWeek() + "|" + weather2.isRain() + "|" + weather2.isUmbrella() + "|" + weather2.getTemperature() + "|" + weather2.getClothesType());
        }

    }
}
