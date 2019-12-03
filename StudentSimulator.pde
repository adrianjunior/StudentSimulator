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
      print(me + " e ");
  }
  println();
  
  for (Map.Entry me : stateConstraints.entrySet()) { 
    if ((int)me.getValue() == max && checkIfCanChangeState()){
      changeStatus((Constraint) me.getKey());
    } 
  }
}

boolean checkIfCanChangeState() {
   State studentState = student.getState();
   if ((studentState == Sleeping.getInstance(student, day.getTimeInInt(counter))) && (student.getConstraint(Constraint.sleepiness) > 3)) {
         return false;
   }
   
   if ((studentState == Eating.getInstance(student, day.getTimeInInt(counter))) && (student.getConstraint(Constraint.hunger) > 5)) {
         return false;
   }
   
   if ((studentState == Studying.getInstance(student, day.getTimeInInt(counter))) && (student.getConstraint(Constraint.ignorance) > 5)) {
         return false;
   }
   
   return true;
}

void changeStatus(Constraint constr) {
  if (!checkIfCanChangeState()) {
    return;
  }
  int dayHour = day.getTimeInInt(counter);
  switch (constr) {
      case loneliness:
        State goingout = GoingOut.getInstance(student, dayHour);
        if(student.getState() != goingout) {
          student.changeState(goingout);
        }
        student.changeState(goingout);
        break;
      case ignorance:
        State studying = Studying.getInstance(student, dayHour);
        if(student.getState() !=  studying) {
          student.changeState(studying);
        }
        break;
      case hunger:
        if(student.getConstraint(Constraint.hunger) > 40 || (student.getConstraint(Constraint.sleepiness) < 3)) {
          State eating = Eating.getInstance(student, dayHour);
          student.changeState(eating);
        }
        break;
      case sleepiness:
        State sleeping = Sleeping.getInstance(student, dayHour);
        if((student.getConstraint(Constraint.sleepiness) > 80 && (student.getState() !=  sleeping))|| (student.getConstraint(Constraint.hunger) < 3)) {
          student.changeState(sleeping);
        }
        break;
      case stress:
        State playing = Playing.getInstance(student, dayHour);
        if(student.getState() !=  playing) {
          student.changeState(playing);
        }
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
