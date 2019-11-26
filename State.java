import processing.core.*;

interface State {
   void execute();
   void enter();
   void leave();
}
