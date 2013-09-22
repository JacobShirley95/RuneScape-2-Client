
public class Class53 {

   static Class48 aClass48_1073;
   public static AbstractMouseHandler captureMouseList;


   Class53() throws Throwable {
      throw new Error();
   }

   static void method540(byte var0) {
      if(Class217.aClass321_3761 != null) {
         GameCoord var1 = GameCoord.method4308(Class521.myPlayer.method6203().gameCoord);
         MapPoint var2 = client.aClass296_348.getMapArea();
         var1.floatX += (float)(1265321541 * var2.loadedMapX << 9);
         var1.floatZ += (float)(var2.loadedMapY * -1996781083 << 9);
         var1.method4318((float)(Class217.aClass321_3761.anInt_6200 * -931656673), var1.floatY, (float)(Class217.aClass321_3761.anInt_6201 * -1556491381));
         float var3 = var1.getHyp();
         var1.store();
         float var4 = 0.0F;
         if(var3 < (float)(-1845006903 * Class217.aClass321_3761.anInt_6202)) {
            var4 = 1.0F;
         } else if(var3 > (float)(358375237 * Class217.aClass321_3761.anInt_6203)) {
            var4 = 0.0F;
         } else {
            var3 -= (float)(Class217.aClass321_3761.anInt_6202 * -1845006903);
            var4 = 1.0F - var3 / (float)(Class217.aClass321_3761.anInt_6204 * 32051713);
         }

         Class104_Sub5.method3284((int)(256.0F * var4), (short)-23050);
      }

   }

   static final void method541(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var3.anInt_2486 * -1760962491;
   }

   static final void method542(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = -1912427407 * client.anInt_394 - client.anInt_524 * -665704711;
   }

   static final void method543(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class104_Sub21.renderSettings.aClass540_Sub14_7320.method1701(-2005139574);
   }

   static final void method544(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      if(RSInterface.interfaceGroups[var2] == null) {
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = "";
      } else {
         String var3 = RSInterface.interfaceGroups[var2].interfaceArray[0].aString_2425;
         if(null == var3) {
            var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = "";
         } else {
            var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = var3.substring(0, var3.indexOf(58));
         }
      }

   }

   static final void method545(int var0) {
      Class11.aLong_99 = 3016473431628976607L;
      Class11.aLong_91 = 0L;
      Class11.anInt_105 = 822335539;
   }

   static String getMoneyString(int var0, LanguagePack var1, int var2) {
      return var0 < 100000?"<col=ffff00>" + var0 + "</col>":(var0 < 10000000?"<col=ffffff>" + var0 / 1000 + ServerString.aClass482_8904.getText(var1, -873875045) + "</col>":"<col=00ff80>" + var0 / 1000000 + ServerString.aClass482_8902.getText(var1, -1904273585) + "</col>");
   }

   static final void method547(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      for(Class231_Sub6 var7 = (Class231_Sub6)client.aClass512_457.method5930((byte)-1); null != var7; var7 = (Class231_Sub6)client.aClass512_457.method5933(-1935175580)) {
         if(-1025618511 * client.timer >= -457106607 * var7.anInt_8285) {
            var7.method2931(-2140497974);
         } else {
            Class525.method5990(2049712427 * var7.anInt_8284, 256 + (var7.anInt_8280 * -1557642165 << 9), (-146618549 * var7.anInt_8282 << 9) + 256, -471221142 * var7.anInt_8281, -1844577525);
            MouseHandler.aTextRenderer_6379.method1063(var7.aString_8286, (int)(client.calculatedPosition[0] + (float)var0), (int)((float)var1 + client.calculatedPosition[1]), -16777216 | var7.anInt_8283 * -154172265, 0, (short)-9140);
         }
      }

   }

   public static int method548(int var0, int var1, boolean var2, int var3) {
      Class240_Sub46 var4 = Class416.method5153(var0, var2, (byte)-12);
      if(var4 == null) {
         return 0;
      } else if(var1 == -1) {
         return 0;
      } else {
         int var5 = 0;

         for(int var6 = 0; var6 < var4.anIntArray_7647.length; ++var6) {
            if(var1 == var4.anIntArray_7650[var6]) {
               var5 += var4.anIntArray_7647[var6];
            }
         }

         return var5;
      }
   }

   static void method549(RSInterfaceData var0, int var1) {
      var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = HintMarker.aClass583_3709.method6327(var0.intTypes[-831324111 * var0.intTypeIndex - 2], -255634620).aStringArray_9579[var0.intTypes[-831324111 * var0.intTypeIndex - 1]];
      var0.intTypeIndex -= -1416056414;
   }
}
