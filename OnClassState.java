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
    
    student.changeIntelligence(6);
    student.changeFun(-6);
    student.changeSleepiness(3);
    student.changeHunger(10);
    student.changeStress(3);
    
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
