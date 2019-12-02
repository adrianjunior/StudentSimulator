import processing.core.*;
import java.util.Random;

class Playing implements State {
  Student student;
  
  private static final Playing instance = new Playing();
  
  private Playing(){}
  
  public static Playing getInstance(Student s){
    instance.student = s;
    
    return instance;
  }
  
  public void execute(){
    System.out.println("O aluno está se divertindo sozinho.");
    System.out.println("");
    
    student.change(Constraint.intelligence,-2);
    student.change(Constraint.fun,6);
    student.change(Constraint.social,-2);
    student.change(Constraint.sleepiness,3);
    student.change(Constraint.hunger,10);
    student.change(Constraint.stress,-2);
    
    //TO-DO: Change State Logic 
  }
  
  public void enter(){
    System.out.println("O Aluno começou a se divertir para passar o tempo.");
    System.out.println("");
  }
  
  public void leave(){
    System.out.println("O Aluno começou terminou de se divertir.");
    System.out.println("");
  }
}
