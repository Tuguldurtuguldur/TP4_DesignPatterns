package Exercice4;


import java.util.List;
import java.util.Scanner;

public class StudentView implements IStudentView{

    private IStudentModel studentModel;
    private IStudentController studentController;

    public StudentView(IStudentModel studentModel, IStudentController studentController) {
        this.studentModel = studentModel;
        this.studentController = studentController;
    }

    public void update(List<String> l) {

    }

    public void interactionConsole(){
        System.out.println("Type a new student name or c to continue:");
        Scanner scan = new Scanner(System.in);
        String choice = scan.nextLine();
        while (choice.charAt(0)!= 'c') {
            studentController.setStudentName(choice);
            System.out.println("Type a new student name or c to continue:");
            choice = scan.nextLine();
        }
        System.out.println("Type a new roll number, or q to quit:");
        choice = scan.nextLine();
        while (choice.charAt(0)!= 'q') {
            studentController.setStudentRollNo(choice);
            System.out.println("Type a new roll number, or q to quit:");
            choice = scan.nextLine();
        }
    }
}
