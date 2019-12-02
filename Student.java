import processing.core.*;
import java.util.HashMap;
import java.util.Map;

class Student {
  public Map<Constraint, Integer> stateConstraints = new HashMap<>();
  private State currentState;
  private State currentSecondState; //OnTestWeekState && OnNormalWeekState
  
  Student() {
    stateConstraints.put(Constraint.loneliness, 50);
    stateConstraints.put(Constraint.ignorance, 50);
    stateConstraints.put(Constraint.hunger, 50);
    stateConstraints.put(Constraint.sleepiness, 0);
    stateConstraints.put(Constraint.stress, 0);
    stateConstraints.put(Constraint.grades, 0);
  }
  
  void init() {
    currentState = Sleeping.getInstance(this);
    currentSecondState = OnNormalWeek.getInstance(this);
  }
  
  void update() {
    currentState.execute();
  }
  
  void changeState(State newState){
    currentState.leave();
    currentState = newState;
    currentState.enter();
  }
  
  void changeSecondState(State newState){
    currentSecondState.leave();
    currentSecondState = newState;
    currentSecondState.enter();
  }
  
  void change(Constraint constraint, int value) {
      int newConstraintValue = stateConstraints.get(constraint);
      newConstraintValue += value;
      if(newConstraintValue <= 0) {
         newConstraintValue = 0;
      }
      stateConstraints.put(constraint, newConstraintValue);
  }
  
  int getConstraint(Constraint constraint) {
    return stateConstraints.get(constraint);
  }
}
