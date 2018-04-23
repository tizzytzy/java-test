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

        ArrayList<Weather> list1 = new ArrayList();


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

                System.out.println(weather5.getDay() + weather5.getTemperature() + "度" + isRain + weather5 + "要穿" + weather5.getClothesType());


        }

        ArrayList<Book> list2 = new ArrayList();

        Book book = new Book("Java编程思想(第4版)");
        book.setPrice(85.7);

        Book book1 = new Book("Head First Java(中文版)(第2版)");
        book1.setPrice(53.66);

        Book book2 = new Book("人类简史");
        book2.setPrice(46.24);

        Book book3 = new Book("三体");
        book3.setPrice(17.1);

        Book book4 = new Book("算法导论");
        book4.setPrice(101.9);


        ArrayList<Customer> list3 = new ArrayList();

        Customer customer = new Customer("小Q");
        customer.setAge(22);
        customer.setSex("男");

        Customer customer1 = new Customer("小M");
        customer1.setAge(18);
        customer1.setSex("女");

        customer1.buy(book4.getName());
        customer1.buy(book3.getName());





    }
}
