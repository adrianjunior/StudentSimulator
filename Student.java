import processing.core.*;

class Student {
  private int hunger, social, fun, grades, sleepiness, stress, intelligence;
  private State currentState;
  private State currentSecondState; //OnTestWeekState && OnNormalWeekState
  
  Student() {
    social = 50;
    fun = 50;
    intelligence = 50;
    hunger = 50;
    sleepiness = 0;
    stress = 0;
    grades = 0;
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
  
  void changeHunger(int value){
    hunger = hunger + value;
    if(hunger <= 0) {
       hunger = 0;
    }
  }
  
  void changeSocial(int value){
    social = social + value;
    if(social <= 0) {
       social = 0;
    }
  }
  
  void changeFun(int value){
    fun = fun + value;
    if(fun <= 0) {
       fun = 0;
    }
  }
  
  void changeIntelligence(int value){
    intelligence = intelligence + value;
    if(intelligence <= 0) {
       intelligence = 0;
    }
  }
  
  void changeSleepiness(int value){
    sleepiness = sleepiness + value;
    if(sleepiness <= 0) {
       sleepiness = 0;
    }
  }
  
  void changeStress(int value){
    stress = stress + value;
    if(stress <= 0) {
       stress = 0;
    }
  }
  
  void setHunger(int value){
    hunger = value;
  }
  
  void setGrades(int value){
    grades = value;
  }
  
  int getHunger(){
    return hunger;
  }
  
  int getSocial(){
    return social;
  }
  
  int getFun(){
    return fun;
  }
  
  int getIntelligence(){
    return intelligence;
  }
  
  int getSleepiness(){
    return sleepiness;
  }
  
  int getStress(){
    return stress;
  }
  
  int getGrades(){
    return grades;
  }
}
