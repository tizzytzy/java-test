import java.text.SimpleDateFormat;
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
        calendar.set(2018,3,20);
        weather.setWeek(calendar.getTime());

        calendar.clear();

        Weather weather1 = new Weather("外套");
        weather1.setTemperature(15);
        weather1.setRain(true);
        weather1.setUmbrella(true);
        calendar.set(2018,3,21);
        weather1.setWeek(calendar.getTime());

        calendar.clear();

        list.add(weather);
        list.add(weather1);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyy-mm-dd");

        System.out.println("最近" + list.size() + "天天气情况如下：");
        System.out.println("日期" + " |" + "温度");

        System.out.println(simpleDateFormat.format(weather.getWeek()) +" |" + weather.getTemperature());
        System.out.println(simpleDateFormat.format(weather1.getWeek()) + " |" + weather1.getTemperature());


        for (Weather weather2 : list){
            String isRain = null;
            if (weather2.isRain()) {
                isRain = "有雨";
            }else {

                isRain = "没雨";
            }
                System.out.println(simpleDateFormat.format(weather2.getWeek()) + isRain + "   建议穿" + weather2.getClothesType());




        }











    }
}
