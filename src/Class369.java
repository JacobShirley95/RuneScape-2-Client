
public class Class369 {

   public static final Class369 aClass369_6923 = new Class369(0);
   static final Class369 aClass369_6924 = new Class369(1);
   final int anInt_6925;


   Class369(int var1) {
      this.anInt_6925 = var1 * 2133529819;
   }

   public static void method4683(int var0) {
      Class344.aBoolean_6556 = true;
      Class545.aString_9478 = Class11.aString_92;
      Class508_Sub4.aString_2359 = Class11.aString_93;
      Class125.method1608(false, (byte)-87);
      Class68.method712((byte)110);
      Class344.aClass351Array_6559 = null;
      FontUnpacker.cacheDownload = null;
      Class418.method5190(19, (byte)-48);
   }

   static final void method4684(RSInterfaceData var0, byte var1) {
      var0.stringDataIndex -= 638819198;
      String var2 = (String)var0.stringData[var0.stringDataIndex * 863838783];
      String var3 = (String)var0.stringData[1 + var0.stringDataIndex * 863838783];
      var0.intTypeIndex -= -1416056414;
      int var4 = var0.intTypes[var0.intTypeIndex * -831324111];
      int var5 = var0.intTypes[1 + var0.intTypeIndex * -831324111];
      if(var3 == null) {
         var3 = "";
      }

      if(var3.length() > 80) {
         var3 = var3.substring(0, 80);
      }

      ConnectionHandler var6 = Class32.method230(-1648999270);
      Class240_Sub27 var7 = Class47_Sub1.method3496(Class326.aClass326_6216, var6.aClass528_3433, 1917447504);
      var7.aClass240_Sub8_Sub1_7370.putByte(Class258.method3383(var2, -66578287) + 2 + Class258.method3383(var3, -1496866237), -518062504);
      var7.aClass240_Sub8_Sub1_7370.putString(var2, (byte)-79);
      var7.aClass240_Sub8_Sub1_7370.putByte(var4 - 1, -1600871982);
      var7.aClass240_Sub8_Sub1_7370.putByte(var5, -192308937);
      var7.aClass240_Sub8_Sub1_7370.putString(var3, (byte)-24);
      var6.addPacket(var7, 13745681);
   }

   static final void method4685(RSInterfaceData var0, byte var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      Class25.method154(var3, var4, var0, (byte)-9);
   }

   static final void method4686(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = -2024084013 * Class271.anInt_4693;
   }

   static final void method4687(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, int var3) {
      int var4 = var2.intTypes[(var2.intTypeIndex -= -708028207) * -831324111] - 1;
      if(var4 >= 0 && var4 <= 9) {
         var0.method1710(var4, (String)var2.stringData[(var2.stringDataIndex -= -1828074049) * 863838783], 893675862);
      } else {
         var2.stringDataIndex -= -1828074049;
      }
   }
}
