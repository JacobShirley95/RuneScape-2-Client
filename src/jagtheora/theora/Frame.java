package jagtheora.theora;

import jagtheora.misc.SimplePeer;

public class Frame extends SimplePeer {

   public final int anInt_10152;
   public final int anInt_10153;
   public int[] anIntArray_10154;


   public Frame(int var1, int var2) {
      this.anInt_10152 = var1 * -1414766863;
      this.anInt_10153 = var2 * 1547766349;
      this.anIntArray_10154 = new int[-971817339 * this.anInt_10153 * -2039688687 * this.anInt_10152];
   }

   private static native void init();

   protected native void method5441();

   static {
      init();
   }
}
