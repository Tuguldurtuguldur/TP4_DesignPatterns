package Exercice4;


public class StudentController implements IStudentController{

    private IStudentModel model;
    private IStudentView view;

    public StudentController(IStudentModel model){
        this.model = model;
        this.view = new StudentView(this.model, this);
    }

    public void setStudentName(String name) {
        this.model.setName(name);
    }


    public String getStudentName() {
        return this.model.getName();
    }


    public void setStudentRollNo(String rollNo) {
        this.model.setRollNo(rollNo);
    }


    public String getStudentRollNo() {
        return this.model.getRollNo();
    }

    public void updateView(){
        this.model.notifyObservers();
    }
}
