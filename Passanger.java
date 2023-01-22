public class Passanger extends Person {
    private int id;
    private boolean invalid;
    private int vagonNum;

    //constructors
    Passanger(String firstName, String secondName, int id, int age, boolean invalid, int vagonNum) {
        setFirstName(firstName);
        setSecondName(secondName);
        setAge(age);
        this.id = id;
        this.invalid = invalid;
        this.vagonNum = vagonNum;
    }
    Passanger() {}

    //method toString
    @Override
    public String toString() {
        return "Full Name: "+getFirstName()+" "+getSecondName()+", Id: "+id+", Age: "+getAge()+", Invalid status: "+invalid;
    }

    //method
    public void clearAllData(){
        id = 0;
        invalid = false;
        vagonNum = 0;
        setFirstName("unknown");
        setSecondName("unknown");
        setAge(0);
    }

    //set and get
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setInvalid(boolean invalid) {
        this.invalid = invalid;
    }
    public boolean getInvalid() { return invalid; }

    public void setVagonNum(int vagonNum) { this.vagonNum = vagonNum; }
    public int getVagonNum() { return vagonNum; }
}
