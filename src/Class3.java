
public class Class3 {

   static int anInt_20 = 0;
   static Class520 aClass520_21;
   static Class521 aClass521_22;
   static int anInt_23 = 0;
   static final int anInt_24 = 3;
   static Class531 aClass531_25;
   static Class26 aClass26_26;
   static int[] anIntArray_27;


   Class3() throws Throwable {
      throw new Error();
   }

   public static String method12(int var0, int var1) {
      return "<img=" + var0 + ">";
   }

   public static Class620[] method13(byte var0) {
      return new Class620[]{Class620.aClass620_10021, Class620.aClass620_10022, Class620.aClass620_10020};
   }

   static final void method14(RSInterfaceData var0, byte var1) {
      var0.intTypeIndex -= -1416056414;
      int var2 = var0.intTypes[-831324111 * var0.intTypeIndex];
      int var3 = var0.intTypes[1 + var0.intTypeIndex * -831324111];
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class618.method6617(var2, var3, true, false, 474252491);
   }

   public static void setHigh(byte var0) {
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub24_7302, 2, 2106029997);
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub24_7297, 2, 31719073);
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub18_7280, 1, 1714157609);
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub1_7295, 1, -618899800);
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.idleAnimations, 1, 589329705);
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub23_7293, 1, 1844732639);
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub21_7306, 1, 1899049487);
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub17_7299, 1, 857004253);
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub32_7303, 2, 1009106626);
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub26_7308, 1, -257664789);
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub22_7310, 2, -119957147);
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub31_7321, 1, 1929304374);
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub27_7315, 0, 1274802752);
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub27_7288, 0, 1794576414);
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.particlesSetting, 2, 1899959423);
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub7_7291, Class40.aClass40_878.anInt_873 * 746264091, 2113522926);
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub16_7301, 0, -426590597);
      if(null != Class286.gameRenderer && Class286.gameRenderer.supportsTexture() && Class286.gameRenderer.method1989()) {
         Class286.gameRenderer.method1990();
      }

      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub6_7305, 1, -596567102);
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub10_7292, 1, 1965966793);
      Class209.method2639((byte)-75);
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub3_7307, 0, 2065930328);
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub30_7314, 4, 1871522155);
      Class481.method5706(-834672780);
      client.aClass296_348.method3754(-1728326594).method6383((byte)-95);
      client.aBoolean_311 = true;
   }

   static String method16(String var0, byte var1) {
      String var2 = null;
      int var3 = var0.indexOf("--> ");
      if(var3 >= 0) {
         var2 = var0.substring(0, 4 + var3);
         var0 = var0.substring(4 + var3);
      }

      if(var0.startsWith("directlogin ")) {
         int var4 = var0.indexOf(" ", "directlogin ".length());
         if(var4 >= 0) {
            int var5 = var0.length();
            var0 = var0.substring(0, var4) + " ";

            for(int var6 = 1 + var4; var6 < var5; ++var6) {
               var0 = var0 + "*";
            }
         }
      }

      return null != var2?var2 + var0:var0;
   }

   static final void method17(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, byte var3) {
      var0.anInt_2469 = -522394205;
      var0.anInt_2416 = client.anInt_438 * 318893009;
      var0.anInt_2426 = 0;
      if(-1 == var0.anInt_2428 * -1001687885 && !var1.aBoolean_2054) {
         Class86.method1132(1278853609 * var0.cacheID, (byte)62);
      }

   }

   static final void method18(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, byte var3) {
      if(var0.index * 1916189739 == 5) {
         Class535.method6064(var0, var1, var2, (byte)15);
      }
   }
}
