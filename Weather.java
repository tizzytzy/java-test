import  java.util.Date;

public class Weather {

    private String clothesType;
    private int temperature;
    private boolean rain;
    private boolean umbrella;
    private Date week;


    public Weather(){


    }

    public Weather(String clothesType){

        this.clothesType = clothesType;

    }

    public String getClothesType() {
        return clothesType;
    }

    public void setClothesType(String clothesType) {
        this.clothesType = clothesType;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public boolean isRain() {
        return rain;
    }

    public void setRain(boolean rain) {
        this.rain = rain;
    }

    public boolean isUmbrella() {
        return umbrella;
    }

    public void setUmbrella(boolean umbrella) {
        this.umbrella = umbrella;
    }

    public Date getWeek() {
        return week;
    }

    public void setWeek(Date week) {
        this.week = week;
    }

}

