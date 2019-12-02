import processing.core.*;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

Student student = new Student();
Day day = new Day();
Student state;
String message;
int counter = 0;

void setup(){
  //size(1280, 360);
  background(0);
  noStroke();
  message = "";
  frameRate(1);
  student.init();
}

void draw(){
  background(0);
  if(day.getDay() < 100) {
    counter++; //Cada counter é meia hora
    day.changeTime(counter);
    println("às " + day.getTime());
    student.update();
    if(counter >= 48) { //Virar o dia (48 counters = 24 horas)
      counter = 0;
      day.newDay();
    }
  } else if(day.getDay() == 100) {
    endSemester();   
  }
  checkStatus();
}

void checkStatus() {
  int max = Collections.max(student.stateConstraints.values());
  Map<Constraint, Integer> stateConstraints = student.stateConstraints;
  Constraint newStateConstraint = Constraint.sleepiness;
  for (Map.Entry me : stateConstraints.entrySet()) {
    if ((int)me.getValue() == max){
      changeStatus((Constraint) me.getKey());
    }
  }
}

void changeStatus(Constraint constr) {
  switch (constr) {
      case loneliness:
        State goingout = GoingOut.getInstance(student);
        student.changeState(goingout);
        break;
      case ignorance:
        State studying = Studying.getInstance(student);
        student.changeState(studying);
        break;
      case hunger:
        State eating = Eating.getInstance(student);
        student.changeState(eating);
        break;
      case sleepiness:
        State sleeping = Sleeping.getInstance(student);
        student.changeState(sleeping);
        break;
      case stress:
        State playing = Playing.getInstance(student);
        student.changeState(playing);
        break;
      default: break;
    }

}

void endSemester() {
  print("O semestre acabou!");
  int grade = student.getConstraint(Constraint.grades);
  if(grade >= 7) {
    println("O aluno passou por média! Nota: " + grade);
  } else if(grade >= 5) {
    println("O aluno passou na AF. Nota: " + grade);
  } else {
    println("O aluno reprovou... Nota: " + grade);
  }
}
