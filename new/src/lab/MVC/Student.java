package lab.MVC;

//model
public class Student {
    private String name;
    private String roll;
    private String address;
    
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setRoll(String roll){
        this.roll = roll;
    }
    public String getRoll(){
        return roll;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return address;
    }
}
