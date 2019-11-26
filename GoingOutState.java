import processing.core.*;
import java.util.Random;

class GoingOut implements State {
  Student student;
  
  private static final GoingOut instance = new GoingOut();
  
  private GoingOut(){}

  public static GoingOut getInstance(Student s){
    instance.student = s;
    
    return instance;
  }
  
  public void execute(){
    System.out.println("O aluno está na balada se divertindo com os amigos.");
    System.out.println("");
    
    student.changeIntelligence(-2);
    student.changeFun(3);
    student.changeSocial(15);
    student.changeSleepiness(3);
    
    //TO-DO: Change State Logic 
  }
  
  public void enter(){
    System.out.println("O chegou na balada.");
    System.out.println("");
  }
  
  public void leave(){
    System.out.println("O aluno saiu da balada.");
    System.out.println("");
  }
}
