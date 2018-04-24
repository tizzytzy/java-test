import java.util.ArrayList;

public class CustomerTest {

    public static void main(String[] args) {

        ArrayList<BookShop> list2 = new ArrayList();

        BookShop book = new BookShop("Java编程思想(第4版)");
        book.setPrice(85.7);

        BookShop book1 = new BookShop("Head First Java(中文版)(第2版)");
        book1.setPrice(53.66);

        BookShop book2 = new BookShop("人类简史");
        book2.setPrice(46.24);

        BookShop book3 = new BookShop("三体");
        book3.setPrice(17.1);

        BookShop book4 = new BookShop("算法导论");
        book4.setPrice(101.9);


        ArrayList<Customer> list3 = new ArrayList();

        Customer customer = new Customer("小Q");
        customer.setAge(22);
        customer.setSex("男");

        Customer customer1 = new Customer("小M");
        customer1.setAge(18);
        customer1.setSex("女");




    }

    public void buy (BookShop bookShop){

        System.out.println(bookShop.getName());


    }

    }


