import java.applet.Applet;

public class RuntimeException_Sub3 extends RuntimeException {

   public static int anInt_3271;
   public static int anInt_3272;
   String aString_3273;
   public static Applet anApplet_3274;
   static long aLong_3275;
   Throwable aThrowable_3276;


   RuntimeException_Sub3(Throwable var1, String var2) {
      this.aString_3273 = var2;
      this.aThrowable_3276 = var1;
      this.initCause(var1);
   }
}
