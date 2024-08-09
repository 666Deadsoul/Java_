package lab.MVC;

//contemailer
public class EmployeeController{
    private Employee model;
    private EmployeeView view;
    public EmployeeController(Employee model, EmployeeView view){
        this.model = model;
        this.view = view;
    }
    public void setStdname(String name){
        model.setName(name);
    }
    public String getStdname(){
        return model.getName();
    }

    public void setStdemail(String email){
        model.setemail(email);
    }
    public String getStdemail(){
        return model.getemail();
    }

    public void setStdadd(String add){
        model.setAddress(add);
    }
    public String getStdadd(){
        return model.getAddress();
    }

    public void updateView(){
        view.printDetails(model.getName(), model.getemail(), model.getAddress());
    }
}
