import java.util.ArrayList;
import java.util.List;

public class Customer {


    private String name;
    private int age;
    private String sex;
    private String wantBook;

    public Customer(){


    }

    public Customer(String name){

        this.name = name;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getWantBook() {
        return wantBook;
    }

    public void setWantBook(String wantBook) {
        this.wantBook = wantBook;
    }


    String wantBook1 = "算法导论";
    String wantBook2 = "三体";
    String sex1 = "男";
    String sex2 = "女";

    public void buy(ArrayList<BookShop> list2){

            for (BookShop book : list2) {
                if (wantBook1.equals(book.getName()) && sex1.equals(this.sex)) {

                    System.out.println(this.name + "是一位" + this.age + "岁的" + this.sex + "生" + "买了" + book.getName());

                }else if (wantBook2.equals(book.getName()) && sex2.equals(this.sex)){

                    System.out.println(this.name + "是一位" + this.age + "岁的" + this.sex + "生" + "买了" + book.getName());
                }

        }




}
}
