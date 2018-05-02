import java.util.ArrayList;

public class CloudStorage {

    private String name;
    ArrayList<Album> albums;

    public CloudStorage(){


    }

    public ArrayList<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(ArrayList<Album> albums) {
        this.albums = albums;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }






    public void upload(ArrayList<Picture> pictures){

        for (Picture picture : pictures){
            for (Album album : albums) {
                if (album.getName().equals(picture.getPlace())) {
                    System.out.println(this.name + ":" + album.getName() +   "建立于" +album.getCreatTime() + "相册内存是" + album.getSize());

                }

            }


        }

    }



}
