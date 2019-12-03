import processing.core.*;
import java.util.Random;
import java.util.*;


class Eating implements State {
  Student student;
  
  private static final Eating instance = new Eating();
  
  private Eating(){}
  public int timerMultiplier;

  public static Eating getInstance(Student s, int timerMultiplier){
    instance.timerMultiplier = timerMultiplier;
    instance.student = s;
    
    return instance;
  }
  
  public void execute(){
    System.out.println("O aluno está comendo.");
    System.out.println("");
    student.change(Constraint.sleepiness, (int)0.5*timerMultiplier);
    student.change(Constraint.ignorance, 3);
    student.change(Constraint.hunger,-10);
    
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
