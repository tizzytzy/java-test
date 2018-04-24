

public class TodoTest {

    public static void main(String[] args) {


        Todo todo = new Todo();
        todo.setDate("2018.4.1");
        todo.setContent("我开始学习Java");

        System.out.println(todo.getDate() + "|" + todo.getContent() );



    }

}
