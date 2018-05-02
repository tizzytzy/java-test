import java.util.ArrayList;

public class CloudStorage {


    ArrayList<Album> albums;


    public ArrayList<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(ArrayList<Album> albums) {
        this.albums = albums;
    }


    public CloudStorage(){


    }






    public void upload(ArrayList<Picture> pictureData){

        for (Picture picture : pictureData){
            for (Album album : albums) {
                if (album.getName().equals(picture.getPlace())) {

                    System.out.println(this.albums  + "是" + album.getCreatTime() + album.getName() + album.getPictures());


                }

            }


        }

    }



}
