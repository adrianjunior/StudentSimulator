import processing.core.*;
import java.util.Random;

class Studying implements State {
  Student student;
  
  private static final Studying instance = new Studying();
  
  private Studying(){}
  
  public static Studying getInstance(Student s){
    instance.student = s;
    
    return instance;
  }
  
  public void execute(){
    System.out.println("O aluno está estudando.");
    System.out.println("");
    
    student.changeIntelligence(6);
    student.changeFun(-6);
    student.changeSocial(-3);
    student.changeSleepiness(3);
    student.changeHunger(10);
    student.changeStress(5);
 
    //TO-DO: Change State Logic 
  }
  
  public void enter(){
    System.out.println("O Aluno começou a estudar.");
    System.out.println("");
  }
  
  public void leave(){
    System.out.println("O Aluno terminou de estudar.");
    System.out.println("");
  }
}
