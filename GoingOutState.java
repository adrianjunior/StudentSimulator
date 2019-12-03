import processing.core.*;
import java.util.Random;

class GoingOut implements State {
  Student student;
  
  private static final GoingOut instance = new GoingOut();
  
  private GoingOut(){}
  
  public int timerMultiplier;
  public static GoingOut getInstance(Student s, int timerMultiplier){
    instance.timerMultiplier = timerMultiplier;
    instance.student = s;
    
    return instance;
  }
  
  public void execute(){
    System.out.println("O aluno está se divertindo com os amigos.");
    System.out.println("");

    student.change(Constraint.ignorance,-2);
    student.change(Constraint.stress,-3);
    student.change(Constraint.loneliness,-15);
    student.change(Constraint.sleepiness, timerMultiplier);
    
    //TO-DO: Change State Logic 
  }
  
  public void enter(){
    System.out.println("O chegou no encontro com seus amigos.");
    System.out.println("");
  }
  
  public void leave(){
    System.out.println("O aluno saiu do encontro com seus amigos.");
    System.out.println("");
  }
}
