import java.util.ArrayList;

public class Customer {


    private String name;
    private int age;
    private String sex;

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

    public void buy(ArrayList<BookShop> bookShops){
        for (BookShop bookShop : bookShops ) {



                System.out.println(this.name + "是一位" + this.age + "岁的" + this.sex + "生" + "买了"  + bookShop.getName());


        }

    }



}
