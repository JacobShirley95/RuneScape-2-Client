package jagtheora.vorbis;

import jagtheora.misc.SimplePeer;

public class VorbisComment extends SimplePeer {

   public VorbisComment() {
      this.init();
      if(this.method5439()) {
         throw new IllegalStateException();
      }
   }

   private native void init();

   protected native void method5441();
}
