package jagtheora.theora;

import jagtheora.misc.SimplePeer;

public class TheoraInfo extends SimplePeer {

   public byte aByte_596;
   public byte aByte_597;
   public byte aByte_598;
   public int anInt_599;
   public int anInt_600;
   public int anInt_601;
   public int anInt_602;
   public int anInt_603;
   public int anInt_604;
   public int anInt_605;
   public int anInt_606;
   public int anInt_607;
   public int anInt_608;
   public int anInt_609;
   public int anInt_610;


   public TheoraInfo() {
      this.init();
      if(this.method5439()) {
         throw new IllegalStateException();
      }
   }

   private static native void initFields();

   private native void init();

   protected native void method5441();

   static {
      initFields();
   }
}
