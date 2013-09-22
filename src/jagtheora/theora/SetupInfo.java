package jagtheora.theora;

import jagtheora.misc.SimplePeer;
import jagtheora.ogg.OggPacket;
import jagtheora.theora.TheoraComment;
import jagtheora.theora.TheoraInfo;

public class SetupInfo extends SimplePeer {

   public native int decodeHeader(TheoraInfo var1, TheoraComment var2, OggPacket var3);

   protected native void method5441();
}
