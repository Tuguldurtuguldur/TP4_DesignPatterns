package Exercice4;

import java.util.ArrayList;
import java.util.List;

public class StudentModel implements IStudentModel{

    private ArrayList<IStudentView> observers;
    private String rollNo;
    private String name;

    public StudentModel(){
        this.observers = new ArrayList<>();
    }

    public void registerObserver(IStudentView o) {
        this.observers.add(o);
    }


    public void removeObserver(IStudentView o) {
        this.observers.remove(o);

    }


    public void notifyObservers() {
        List<String> l = new ArrayList<>();
        l.add(this.name);
        l.add(this.rollNo);
        for(IStudentView o : this.observers){
            o.update(l);
        }
    }


    public String getRollNo() {
        return this.rollNo;
    }


    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }


    public String getName() {
        return this.name;
    }


    public void setName(String name) {
        this.name = name;
    }
}
