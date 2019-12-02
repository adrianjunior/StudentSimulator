import processing.core.*;
import java.util.Random;

class OnClass implements State {
  Student student;
  
  private static final OnClass instance = new OnClass();
  
  private OnClass(){}

  public static OnClass getInstance(Student s){
    instance.student = s;
    
    return instance;
  }
  
  public void execute(){
    System.out.println("O aluno está na aula.");
    System.out.println("");
    
    student.change(Constraint.intelligence,6);
    student.change(Constraint.fun,-6);
    student.change(Constraint.sleepiness,3);
    student.change(Constraint.hunger,10);
    student.change(Constraint.stress,3);
 
    //TO-DO: Change State Logic 
  }
  
  public void enter(){
    System.out.println("O aluno foi para a aula.");
    System.out.println("");
  }
  
  public void leave(){
    System.out.println("A aula acabou.");
    System.out.println("");
  }
}
