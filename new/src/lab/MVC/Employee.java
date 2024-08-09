package lab.MVC;

//model
public class Employee {
    private String name;
    private String email;
    private String address;
    
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setemail(String email){
        this.email = email;
    }
    public String getemail(){
        return email;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return address;
    }
}
