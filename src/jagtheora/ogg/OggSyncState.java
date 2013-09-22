package jagtheora.ogg;

import jagtheora.misc.SimplePeer;
import jagtheora.ogg.OggPage;

public class OggSyncState extends SimplePeer {

   public OggSyncState() {
      this.init();
      if(this.method5439()) {
         throw new IllegalStateException();
      }
   }

   private native void init();

   public native boolean write(byte[] var1, int var2);

   public native long pageSeek(OggPage var1);

   public native int pageOut(OggPage var1);

   public native boolean reset();

   protected native void method5441();
}
