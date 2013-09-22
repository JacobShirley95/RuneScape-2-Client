package jagtheora.theora;

import jagtheora.misc.SimplePeer;

public class TheoraComment extends SimplePeer {

   public TheoraComment() {
      this.init();
      if(this.method5439()) {
         throw new IllegalStateException();
      }
   }

   private native void init();

   protected native void method5441();
}
