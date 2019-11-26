import processing.core.*;
import java.util.Random;

class OnNormalWeek implements State {
  Student student;
  
  private static final OnNormalWeek instance = new OnNormalWeek();
  
  private OnNormalWeek(){}
  
  public static OnNormalWeek getInstance(Student s){
    instance.student = s;
    
    return instance;
  }
  
  public void execute(){
    
    
    //TO-DO: Change State Logic 
  }
  
  public void enter(){
    
  }
  
  public void leave(){
    
  }
}
