package jagtheora.vorbis;

import jagtheora.misc.SimplePeer;
import jagtheora.ogg.OggPacket;
import jagtheora.vorbis.DSPState;

public class VorbisBlock extends SimplePeer {

   public VorbisBlock(DSPState var1) {
      this.init(var1);
      if(this.method5439()) {
         throw new IllegalStateException();
      }
   }

   private native void init(DSPState var1);

   public native int synthesis(OggPacket var1);

   protected native void method5441();
}
