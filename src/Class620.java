
public class Class620 implements Class551 {

   public static final Class620 aClass620_10020 = new Class620(0);
   public static final Class620 aClass620_10021 = new Class620(1);
   public static final Class620 aClass620_10022 = new Class620(2);
   final int anInt_10023;
   static Sprite aClass170_10024;


   Class620(int var1) {
      this.anInt_10023 = 467078669 * var1;
   }

   public int getLanguageID(int var1) {
      return this.anInt_10023 * 808382661;
   }

   public static void method6627(int var0, byte var1) {
      if(-1 != var0) {
         if(!Class527.loadedInterfaces[var0]) {
            Class409_Sub1_Sub1.interfaceUnpacker.method3577(var0, -1313719884);
            RSInterface.interfaceGroups[var0] = null;
         }
      }
   }

   static final void method6628(RSInterfaceData var0, byte var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var0.aClass240_Sub47_9501.aClass37Array_7661[var2].anInt_854 * 1615014705;
   }

   static final void method6629(RSInterfaceData var0, byte var1) {
      var0.intTypeIndex -= -1416056414;
      int var2 = var0.intTypes[-831324111 * var0.intTypeIndex];
      int var3 = var0.intTypes[1 + -831324111 * var0.intTypeIndex];
      Class476 var4 = Class240_Sub1.aClass465_6506.method5610(var3, -2125513377);
      if(var4.method5681(-1812906143)) {
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = Class204.aClass455_3536.method5541(var2, -831324111).method236(var3, var4.aString_8738, -1172344237);
      } else {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class204.aClass455_3536.method5541(var2, -831324111).method237(var3, -80630797 * var4.anInt_8739, -662081767);
      }

   }

   public static void method6630(RSInterface[] var0, byte var1) {
      for(int var2 = 0; var2 < var0.length; ++var2) {
         RSInterface var3 = var0[var2];
         if(null != var3.anObjectArray_2410) {
            Class240_Sub17 var4 = new Class240_Sub17();
            var4.aClass132_6903 = var3;
            var4.anObjectArray_6907 = var3.anObjectArray_2410;
            Class263.method3506(var4, 2000000, 2049110780);
         }
      }

   }

   static final void method6631(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 1;
   }

   static boolean method6632(int var0) {
      return 5 != client.loginStage * -243034353?false:!Class66.method680(816645008) && !Class119.method1505((byte)-12);
   }

   static final void method6633(RSInterfaceData var0, byte var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class66.method680(-1180984870)?1:0;
   }
}
