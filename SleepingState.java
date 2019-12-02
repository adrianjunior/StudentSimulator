import processing.core.*;
import java.util.Random;

class Sleeping implements State {
  Student student;
  
  private static final Sleeping instance = new Sleeping();
  
  private Sleeping(){}
  
  public static Sleeping getInstance(Student s){
    instance.student = s;
    return instance;
  }
  
  public void execute(){
    System.out.println("O aluno está dormindo.");
    System.out.println("");
    student.change(Constraint.sleepiness, -10);
    student.change(Constraint.hunger, 2);
    student.change(Constraint.ignorance, 3);
    student.change(Constraint.stress, -1);
    
    //TO-DO: Change State Logic
  }
 
  
  public void enter(){
    System.out.println("O Aluno se arrumou para dormir.");
    System.out.println("");
  }
  
  public void leave(){
    System.out.println("O Aluno acordou e se levantou.");
    System.out.println("");
  }
}
