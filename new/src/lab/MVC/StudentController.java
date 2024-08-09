package lab.MVC;

//controller
public class StudentController {
    private Student model;
    private StudentView view;
    public StudentController(Student model, StudentView view){
        this.model = model;
        this.view = view;
    }
    public void setStdname(String name){
        model.setName(name);
    }
    public String getStdname(){
        return model.getName();
    }

    public void setStdroll(String roll){
        model.setRoll(roll);
    }
    public String getStdroll(){
        return model.getRoll();
    }

    public void setStdadd(String add){
        model.setAddress(add);
    }
    public String getStdadd(){
        return model.getAddress();
    }

    public void updateView(){
        view.printDetails(model.getName(), model.getRoll(), model.getAddress());
    }
}
