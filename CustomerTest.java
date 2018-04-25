import java.util.ArrayList;

public class CustomerTest {

    public static void main(String[] args) {


        ArrayList<BookShop> list2 = new ArrayList();

        BookShop book = new BookShop("Java编程思想(第4版)");
        book.setPrice(85.7);

        BookShop book1 = new BookShop("Head First Java(中文版)(第2版)");
        book1.setPrice(53.66);

        BookShop book2 = new BookShop("人类简史");
        book1.setPrice(46.24);

        BookShop book3 = new BookShop("三体");
        book3.setPrice(17.1);

        BookShop book4 = new BookShop("算法导论");
        book4.setPrice(101.9);

        list2.add(book);
        list2.add(book1);
        list2.add(book2);
        list2.add(book3);
        list2.add(book4);



        ArrayList<Customer> list3 = new ArrayList();

        Customer customer1 = new Customer("小Q");
        customer1.setAge(22);
        customer1.setSex("男");
        customer1.setWantBook("算法导论");

        Customer customer2 = new Customer("小M");
        customer2.setAge(18);
        customer2.setSex("女");
        customer2.setWantBook("三体");


        list3.add(customer1);
        list3.add(customer2);


        customer1.buy(list2);
        customer2.buy(list2);






    }

    }


