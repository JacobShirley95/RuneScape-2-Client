package jagtheora.vorbis;

import jagtheora.misc.SimplePeer;
import jagtheora.ogg.OggPacket;
import jagtheora.vorbis.VorbisComment;

public class VorbisInfo extends SimplePeer {

   public int anInt_3107;
   public int anInt_3108;


   public VorbisInfo() {
      this.init();
      if(this.method5439()) {
         throw new IllegalStateException();
      }
   }

   private static native void initFields();

   private native void init();

   public native int headerIn(VorbisComment var�