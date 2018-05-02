import java.util.ArrayList;
import java.util.Calendar;

public class CloudTest {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        ArrayList<Picture> list = new ArrayList();
        Picture picture = new Picture("1（11）.jpg");
        picture.setSize(20);
        picture.setPlace("上海");
        calendar.set(2017,5,1);
        picture.setGmtCreated(calendar.getTime());

        calendar.clear();

        Picture picture1 = new Picture("1（12）.jpg");
        picture1.setSize(21);
        picture1.setPlace("杭州");
        calendar.set(2018,5,1);
        picture1.setGmtCreated(calendar.getTime());

        calendar.clear();


        Picture picture2 = new Picture("1（13）.jpg");
        picture2.setSize(20);
        picture2.setPlace("北京");
        calendar.set(2018,5,2);
        picture2.setGmtCreated(calendar.getTime());

        calendar.clear();

        Picture picture3 = new Picture("1（14）.jpg");
        picture3.setSize(19);
        picture3.setPlace("丽江");
        calendar.set(2018,5,3);
        picture3.setGmtCreated(calendar.getTime());

        calendar.clear();

        Picture picture4 = new Picture("1（15）.jpg");
        picture4.setSize(22);
        picture4.setPlace("长沙");
        calendar.set(2016,5,5);
        picture4.setGmtCreated(calendar.getTime());

        calendar.clear();

        list.add(picture);
        list.add(picture1);
        list.add(picture2);
        list.add(picture3);
        list.add(picture4);


        ArrayList<Album> list1 = new ArrayList();
        Album album = new Album("上海");
        album.setSize(500);
        calendar.set(2017,4,30);
        album.setCreatTime(calendar.getTime());

        calendar.clear();

        Album album1 = new Album("杭州");
        album1.setSize(500);
        calendar.set(2018,5,1);
        album1.setCreatTime(calendar.getTime());

        calendar.clear();

        Album album2 = new Album("北京");
        album2.setSize(500);
        calendar.set(2018,5,2);
        album2.setCreatTime(calendar.getTime());

        calendar.clear();

        Album album3 = new Album("丽江");
        album3.setSize(500);
        calendar.set(2018,5,3);
        album3.setCreatTime(calendar.getTime());

        calendar.clear();

        Album album4 = new Album("长沙");
        album4.setSize(500);
        calendar.set(2016,5,4);
        album4.setCreatTime(calendar.getTime());

        calendar.clear();

        list1.add(album);
        list1.add(album1);
        list1.add(album2);
        list1.add(album3);
        list1.add(album4);

        ArrayList<CloudStorage> list2 = new ArrayList();
        CloudStorage cloudStorage = new CloudStorage();


        list2.add(cloudStorage);

        cloudStorage.upload(list);



    }

}
