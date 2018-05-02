import java.util.ArrayList;

public class CloudStorage {


    ArrayList<Album> albums;

    public CloudStorage(){


    }

    public ArrayList<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(ArrayList<Album> albums) {
        this.albums = albums;
    }






    public void upload(ArrayList<Picture> pictures){

        for (Picture picture : pictures){
            for (Album album : albums) {
                if (album.getName().equals(picture.getPlace())) {

                    System.out.println(this.albums + "创建于" + album.getCreatTime() + "地点是" + album.getName() + "，这个相册内存是" + album.getSize() + "KB" + album.getPictures());


                }

            }


        }

    }



}
