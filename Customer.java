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




    public void buy(ArrayList<BookShop> list2){

            for (BookShop book : list2) {
                if (this.wantBook.equals(book.getName())) {

                    System.out.println(this.name + "是一位" + this.age + "岁的" + this.sex + "生" + "买了" + book.getName());


                }

        }




}
}
