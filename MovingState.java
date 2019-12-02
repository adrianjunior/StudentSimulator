import processing.core.*;
import java.util.Random;

class Moving implements State {
  Student student;
  
  private static final Moving instance = new Moving();
  
  private Moving(){}

  public static Moving getInstance(Student s){
    instance.student = s;
    
    return instance;
  }
  
  public void execute(){
    System.out.println("O aluno está no ônibus.");
    System.out.println("");
    
    student.change(Constraint.sleepiness,3);
    student.change(Constraint.hunger, 10);
    student.change(Constraint.stress,2);
    //TO-DO: Change State Logic 
  }
  
  public void enter(){
    System.out.println("O aluno pegou um ônibus.");
    System.out.println("");
  }
  
  public void leave(){
    System.out.println("O aluno desceu do ônibus.");
    System.out.println("");
  }
}
