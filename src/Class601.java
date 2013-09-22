
public final class Class601 {

   static int anInt_9882;


   Class601() throws Throwable {
      throw new Error();
   }

   static final void method6494(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      Class215.method2696(var3, var4, var0, (short)16383);
   }

   static final void method6495(RSInterfaceData var0, byte var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class525.aClass490_9274.method5748(var2, (byte)87).method2681(-458160602);
   }

   static final void method6496(RSInterfaceData var0, byte var1) {
      var0.intTypeIndex -= -1416056414;
      int var2 = var0.intTypes[var0.intTypeIndex * -831324111];
      int var3 = var0.intTypes[var0.intTypeIndex * -831324111 + 1];
      Class476 var4 = Class240_Sub1.aClass465_6506.method5610(var3, 1536664141);
      if(var4.method5681(-1424394018)) {
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = Class126.mapIconUnpacker.loadIcon(var2).method6598(var3, var4.aString_8738, -831324111);
      } else {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class126.mapIconUnpacker.loadIcon(var2).method6596(var3, -80630797 * var4.anInt_8739, (byte)6);
      }

   }

   static void method6497(RSInterface var0, RSInterface var1, int var2) {
      Class240_Sub27 var3 = Class47_Sub1.method3496(Class326.aClass326_6244, client.gameConnectionHandler.aClass528_3433, 1917447504);
      var3.aClass240_Sub8_Sub1_7370.method4463(var0.anInt_2428 * -1001687885, 1265720136);
      var3.aClass240_Sub8_Sub1_7370.method4514(1278853609 * var0.cacheID, 1644188986);
      var3.aClass240_Sub8_Sub1_7370.method4463(-1001687885 * var1.anInt_2428, -429238687);
      var3.aClass240_Sub8_Sub1_7370.putShort(2142376247 * var0.itemID, -2077919099);
      var3.aClass240_Sub8_Sub1_7370.method4516(1278853609 * var1.cacheID, -350677284);
      var3.aClass240_Sub8_Sub1_7370.method4528(var1.itemID * 2142376247, -1084365783);
      client.gameConnectionHandler.addPacket(var3, 622242222);
   }

   static void method6498(RSInterface var0, int var1, int var2, int var3) {
      Class126 var4 = var0.method1712(Class286.gameRenderer, 1272478299);
      if(null != var4) {
         Class286.gameRenderer.method1965(var1, var2, var1 + -533669195 * var0.width, var2 + var0.height * 1833812087);
         if(1049318505 * Class192.anInt_3351 < 3) {
            int var5;
            if(2 == 1735950531 * Class509.anInt_9182) {
               var5 = (int)(-((double)Class542.aClass43_Sub1_9475.method394(-1962301117) * 2607.5945876176133D));
            } else {
               var5 = (int)(-client.aFloat_501);
            }

            var5 = -1034935602 * client.anInt_378 + var5 & 16383;
            var5 <<= 2;
            Class240_Sub52_Sub1.compassSprite.method2132((float)var1 + (float)(var0.width * -533669195) / 2.0F, (float)(var0.height * 1833812087) / 2.0F + (float)var2, 4133, var5, var4.aClass168_2369, var1, var2);
         } else {
            Class286.gameRenderer.method1934(-16777216, var4.aClass168_2369, var1, var2);
         }

      }
   }
}
