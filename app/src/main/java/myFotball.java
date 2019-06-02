public class myFotball {

    public  String TeamName;
    private  String date;
    private  String id;
    private String Place;
    private String Time;

    public myFotball()
    {

    }

    public myFotball(String teamName, String date, String place, String time) {
        TeamName = teamName;
        this.date = date;
        Place = place;
        Time = time;
    }

    public myFotball(String teamName, String date, String id, String place, String time) {
        TeamName = teamName;
        this.date = date;
        this.id = id;
        Place = place;
        Time = time;
    }

    public String getTeamName() {
        return TeamName;
    }

    public String getDate() {
        return date;
    }

    public String getId() {
        return id;
    }

    public String getPlace() {
        return Place;
    }

    public String getTime() {
        return Time;
    }

    public void setTeamName(String teamName) {
        TeamName = teamName;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPlace(String place) {
        Place = place;
    }

    public void setTime(String time) {
        Time = time;
    }

    @Override
    public String toString() {
        return "myFotball{" +
                "TeamName='" + TeamName + '\'' +
                ", date='" + date + '\'' +
                ", id='" + id + '\'' +
                ", Place='" + Place + '\'' +
                ", Time='" + Time + '\'' +
                '}';
    }
}