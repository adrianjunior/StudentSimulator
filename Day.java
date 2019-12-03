import processing.core.*;

class Day {
     private int count;
     private String time;
     
     Day() {
       time = "00:00";
       count = 1;
     }
     
     int getDay() {
       return count;
     }
     
     String getTime() {
       return time;
     }
     
     int getTimeInInt(int counter) {
       float timeMinAgr = 30*counter;
       return (int) timeMinAgr/60;
     }
     
     void newDay() {
       count++;
     }
     
     void changeTime(int counter) {
       int counterHour = (int) (counter/2.5);
       float timeMinAgr = 30*counter;
       int hora = (int) timeMinAgr/60;
       time = hora + ":"; 
       if(counter%2 != 0) {
            time += "30";
       } else {
            time += "00";
       }
     }
}
