import processing.core.*;
import java.util.Random;

class OnTestWeek implements State {
  Student student;
  
  private static final OnTestWeek instance = new OnTestWeek();
  
  private OnTestWeek(){}
  
  public static OnTestWeek getInstance(Student s){
    instance.student = s;
    
    return instance;
  }
  
  public void execute(){
    
    
    //TO-DO: Change State Logic
  }
  
  public void enter(){
    System.out.println("Começou a semana de provas. A tensão está a todo vapor!");
    System.out.println("");
  }
  
  public void leave(){
    System.out.println("Terminou a semana de provas. O aluno conseguiu sobreviver.");
    System.out.println("");
  }
}
