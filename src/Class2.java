import java.awt.Image;

final class Class2 implements Class339 {

   public static int anInt_18;
   public static Image anImage_19;


   public Object method4195(byte[] var1, RSFont var2, boolean var3, int var4) {
      return Class286.gameRenderer.method1935(var2, (ImageData[])((ImageData[])ImageUtils.defineImage(var1)), var3);
   }

   static final void method6(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, byte var3) {
      var0.aBoolean_2467 = var2.intTypes[(var2.intTypeIndex -= -708028207) * -831324111] == 1;
      Class110_Sub1.method3149(var0, -981308674);
   }

   static final void method7(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, int var3) {
      var2.intTypeIndex -= -1416056414;
      int var4 = var2.intTypes[var2.intTypeIndex * -831324111];
      int var5 = var2.intTypes[var2.intTypeIndex * -831324111 + 1];
      Class476 var6 = Class240_Sub1.aClass465_6506.method5610(var4, -775866501);
      if(var6.anInt_8739 * -80630797 != var5) {
         var0.method1719(var4, var5, 73991305);
      } else {
         var0.method1702(var4, -210764691);
      }

   }

   static final void method8(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      ChatMessageCache.method1649(var3, var4, var0, (byte)-69);
   }

   static final void method9(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class104_Sub21.renderSettings.idleAnimations.method1774(-1489025316);
   }

   static final void method10(RSInterfaceData var0, int var1) {
      var0.intTypeIndex -= -2124084621;
      int var2 = var0.intTypes[-831324111 * var0.intTypeIndex];
      int var3 = var0.intTypes[1 + var0.intTypeIndex * -831324111];
      int var4 = var0.intTypes[var0.intTypeIndex * -831324111 + 2];
      Class598.method6476(4, var2 << 16 | var3, var4, "", -1898494081);
   }

   static final void method11(RSInterfaceData var0, byte var1) {
      var0.intTypeIndex -= 1462854468;
      int var2 = var0.intTypes[var0.intTypeIndex * -831324111];
      int var3 = var0.intTypes[-831324111 * var0.intTypeIndex + 1];
      int var4 = var0.intTypes[-831324111 * var0.intTypeIndex + 2];
      int var5 = var0.intTypes[var0.intTypeIndex * -831324111 + 3];
      var2 += var3 << 14;
      var2 += var4 << 28;
      var2 += var5;
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var2;
   }
}
