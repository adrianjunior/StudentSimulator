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
