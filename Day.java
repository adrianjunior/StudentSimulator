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
     
     void newDay() {
       count++;
     }
     
     void changeTime(int counter) {
       switch(counter) {
         case 1:
           time = "00:00";
           break;
         case 2:
           time = "00:30";
           break;
         case 3:
           time = "01:00";
           break;
         case 4:
           time = "01:30";
           break;
         case 5:
           time = "02:00";
           break;
         case 6:
           time = "02:30";
           break;
         case 7:
           time = "03:00";
           break;
         case 8:
           time = "03:30";
           break;
         case 9:
           time = "04:00";
           break;
         case 10:
           time = "04:30";
           break;
         case 11:
           time = "05:00";
           break;
         case 12:
           time = "05:30";
           break;
         case 13:
           time = "06:00";
           break;
         case 14:
           time = "06:30";
           break;
         case 15:
           time = "07:00";
           break;
         case 16:
           time = "07:30";
           break;
         case 17:
           time = "08:00";
           break;
         case 18:
           time = "08:30";
           break;
         case 19:
           time = "09:00";
           break;
         case 20:
           time = "09:30";
           break;
         case 21:
           time = "10:00";
           break;
         case 22:
           time = "10:30";
           break;
         case 23:
           time = "11:00";
           break;
         case 24:
           time = "11:30";
           break;
         case 25:
           time = "12:00";
           break;
         case 26:
           time = "12:30";
           break;
         case 27:
           time = "13:00";
           break;
         case 28:
           time = "13:30";
           break;
         case 29:
           time = "14:00";
           break;
         case 30:
           time = "14:30";
           break;
         case 31:
           time = "15:00";
           break;
         case 32:
           time = "15:30";
           break;
         case 33:
           time = "16:00";
           break;
         case 34:
           time = "16:30";
           break;
         case 35:
           time = "17:00";
           break;
         case 36:
           time = "17:30";
           break;
         case 37:
           time = "18:00";
           break;
         case 38:
           time = "18:30";
           break;
         case 39:
           time = "19:00";
           break;
         case 40:
           time = "19:30";
           break;
         case 41:
           time = "20:00";
           break;
         case 42:
           time = "20:30";
           break;
         case 43:
           time = "21:00";
           break;
         case 44:
           time = "21:30";
           break;
         case 45:
           time = "22:00";
           break;
         case 46:
           time = "22:30";
           break;
         case 47:
           time = "23:00";
           break;
         case 48:
           time = "23:30";
           break;
       }
     }
}
