public class myFotball {

    public static String getTIME;
    private static String ed2Teams;
    private static String Date;
    private String Place;
    private String Time;



    public myFotball() {


    }

    public myFotball(String Time, String Place, String Date, String ed2Teams) {
        this.Time = Time;
        this.Place = Place;
        this.Date = Date;
        this.ed2Teams = ed2Teams;


    }

    public static String getplace() {
        return null;
    }

    public void setEd2Teams(String ed2Teams) {
        this.ed2Teams = ed2Teams;
    }

    public static String geted2Teams() {
        return ed2Teams;
    }

    public void setEdTime(String edTime) {
        this.Time = Time;
    }

    public String getEdTime() {
        return Time;
    }

    public String getPlace() {
        return Place;
    }

     public static String getDate() {
        return Date;
    }

    public String getTime() {
        return Time;
    }

    public String getEd2Teams() {
        return ed2Teams;
    }

    public void setPlace(String place) {
        Place = place;
    }

    public void setDate(String date) {
        Date = date;
    }

    public void setTime(String time) {
        Time = time;
    }

    public void setPhone_number(String edDate) {
        this.Date = Date;
    }

    public String getEdDate() {
        return Date;
    }

    public void setEdPlace(String edPlace) {
        this.Place = Place;

    }

    public String getEdPlace() {
        return Place;
    }

    public void setEdDate(String edDate) {
        this.Place = Place;
    }

    @Override
    public String toString() {
        return "myFotball{" +
                "Place='" + Place + '\'' +
                ", Date='" + Date + '\'' +
                ", Time='" + Time + '\'' +
                ", ed2Teams='" + ed2Teams + '\'' +
                '}';
    }
}