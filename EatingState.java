import processing.core.*;
import java.util.Random;

class Eating implements State {
  Student student;
  
  private static final Eating instance = new Eating();
  
  private Eating(){}

  public static Eating getInstance(Student s){
    instance.student = s;
    
    return instance;
  }
  
  public void execute(){
    System.out.println("O aluno está comendo.");
    System.out.println("");
    
    student.change(Constraint.sleepiness,6);
    student.change(Constraint.hunger,0);
    
    //TO-DO: Change State Logic 
  }
  
  public void enter(){
    System.out.println("O aluno começou uma refeição.");
    System.out.println("");
  }
  
  public void leave(){
    System.out.println("O aluno terminou a refeição.");
    System.out.println("");
  }
}
