public class Customer {


    private String name;
    private int age;
    private String sex;

    public void buy(){

        System.out.println("Customer buy");

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


    public void buy(String name) {
    }
}
