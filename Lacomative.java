import java.util.ArrayList;

public class Lacomative {
    private int id;
    private int max_vagons;
    private int max_speed;
    private Vagons vagonType;
    ArrayList<Passanger> passangers = new ArrayList<>();

    //constructor
    Lacomative(int id, int max_vagons, int max_speed, Vagons vagonType) {
        this.max_vagons = max_vagons;
        this.max_speed = max_speed;
        this.id = id;
        this.vagonType = vagonType;
    }

    //method toString()
    @Override
    public String toString() {
        return "Lacomative #"+id+", Max vagons: "+max_vagons+", Max speed: "+max_speed;
    }

    //methods
    public void showPassangerInfo(Passanger data2) {
        System.out.println("Your Lacomative's Id: "+id+"\nYour Vagons's number: "+data2.getVagonNum());
    }
    //set and get
    public void setMax_speed(int max_speed) {
        this.max_speed = max_speed;
    }
    public int getMax_speed() {
        return max_speed;
    }

    public void setMax_vagons(int max_vagons) {
        this.max_vagons = max_vagons;
    }
    public int getMax_vagons() {
        return max_vagons;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() { return id; }

    public void setVagonType(Vagons vagonType) { this.vagonType = vagonType; }
    public Vagons getVagonType() { return vagonType; }
}
