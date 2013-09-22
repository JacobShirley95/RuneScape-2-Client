
public class Class409_Sub2 extends Class409 {

   public final int anInt_3822;
   public final int anInt_3823;


   Class409_Sub2(Class419 var1, Class412 var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, var9);
      this.anInt_3822 = var11 * 207359421;
      this.anInt_3823 = 1826852855 * var12;
   }

   public Class408 method5142(int var1) {
      return Class408.aClass408_7745;
   }

   static final void method2801(RSInterfaceData var0, int var1) {
      var0.intTypeIndex -= -1416056414;
      Class618.method6614(Class521.myPlayer, var0.intTypes[-831324111 * var0.intTypeIndex], var0.intTypes[1 + -831324111 * var0.intTypeIndex], -2007245158);
   }

   static void method2802(Class502_Sub1 var0, int var1) {
      var0.method4702(0, (byte)-12);
      byte var3;
      if(-222937899 * ClientSuper.maxMemory >= 96) {
         int var2 = Class418.method5192((byte)-36);
         if(var2 <= 102) {
            Class3.setHigh((byte)23);
            var3 = 4;
         } else if(var2 <= 502) {
            Class86.setMid(420406933);
            var3 = 3;
         } else if(var2 <= 1000) {
            Class194.setLow((byte)-1);
            var3 = 2;
         } else {
            Class240_Sub52_Sub1.setMin(true, 1177157351);
            var3 = 1;
         }

         var0.method4700(0, var2, (byte)63);
      } else {
         Class240_Sub52_Sub1.setMin(true, 979163203);
         var3 = 1;
         var0.setFlag(64, -557380865);
      }

      if(Class104_Sub21.renderSettings.currentToolkit.getToolkitID() != 0) {
         Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub29_7312, 0, 2131659378);
         Class462.setRenderToolkit(0, false, -2054578085);
      } else {
         Class104_Sub21.renderSettings.method4824(Class104_Sub21.renderSettings.currentToolkit, true, -982036058);
      }

      Class83.method1089(-978975867);
      var0.method4698(var3, 1658463661);
   }
}
