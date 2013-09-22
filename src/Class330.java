
public class Class330 {

   public static final int anInt_6380 = 20;
   public static final int anInt_6381 = 16;
   public static final int anInt_6382 = 17;
   public static final int anInt_6383 = 29;
   public static final int anInt_6384 = 26;
   public static final int anInt_6385 = 14;
   public static final int anInt_6386 = 2;
   public static final int anInt_6387 = 19;
   public static final int anInt_6388 = 28;
   public static final int anInt_6389 = 6;
   public static final int anInt_6390 = 27;
   public static final int anInt_6391 = 13;
   public static final int anInt_6392 = 24;
   public static final int anInt_6393 = 21;
   public static final int anInt_6394 = 11;
   public static final int anInt_6395 = 25;
   public static final int anInt_6396 = 4;
   public static final int anInt_6397 = 5;
   public static final int anInt_6398 = 1;
   public static final int anInt_6399 = 15;
   public static final int anInt_6400 = 3;
   public static final int anInt_6401 = 23;
   public static final int anInt_6402 = 10;
   public static final int anInt_6403 = 8;
   public static final int anInt_6404 = 22;
   public static final int anInt_6405 = 7;
   public static int anInt_6406;


   Class330() throws Throwable {
      throw new Error();
   }

   static final void method4086(RSInterfaceData var0, byte var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class2.method7(var3, var4, var0, 355697229);
   }

   static final void method4087(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, int var3) {
      String var4 = (String)var2.stringData[(var2.stringDataIndex -= -1828074049) * 863838783];
      if(Class557.extractInterfaceIntData(var4, var2, 2022744075) != null) {
         var4 = var4.substring(0, var4.length() - 1);
      }

      var0.anObjectArray_2553 = Class133.extractInterfaceData(var4, var2, (byte)22);
      var0.aBoolean_2524 = true;
   }

   static final void method4088(RSInterfaceData var0, short var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class421.method5263(var3, var4, var0, -551644960);
   }

   static final void method4089(RSInterfaceData var0, byte var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      if(Class542.aClass43_Sub1_9475.method370(-346822229) == Class116.aClass116_2089 && Class542.aClass43_Sub1_9475.method369(-831324111) == Class31.aClass31_808) {
         Class66_Sub3 var3 = (Class66_Sub3)Class542.aClass43_Sub1_9475.method398(822021035);
         Class508_Sub4 var4 = (Class508_Sub4)Class542.aClass43_Sub1_9475.method397((byte)-110);
         GameCoord var5 = var3.method2995((byte)-6);
         GameCoord var6 = GameCoord.method4308(var5);
         var6.floatY += (float)var2;
         GameCoord var7 = GameCoord.distBetween(var4.method5903(2078899593), var6);
         var7.method4313();
         float var8 = var3.method3003((byte)71).getHyp();
         Class353.method4438(var4.method5903(2078899593), var7, var5, var8, Class556.aClass347Array_9547);
         GameCoord var9 = null;
         if(null == Class556.aClass347Array_9547[0]) {
            throw new RuntimeException("");
         } else {
            if(null == Class556.aClass347Array_9547[1]) {
               var9 = Class556.aClass347Array_9547[0];
            } else if(GameCoord.distBetween(var4.method5903(2078899593), Class556.aClass347Array_9547[0]).getHyp() < GameCoord.distBetween(var4.method5903(2078899593), Class556.aClass347Array_9547[1]).getHyp()) {
               var9 = Class556.aClass347Array_9547[1];
            } else {
               var9 = Class556.aClass347Array_9547[0];
            }

            float var10 = ParameterNode.method5292(var5.floatX - var9.floatX, var5.floatZ - var9.floatZ, (byte)32);
            var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 0;
            var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = (int)(2607.5945876176133D * (double)var10) & 16383;
         }
      } else {
         throw new RuntimeException();
      }
   }

   static final int method4090(int var0, int var1, int var2, int var3) {
      int var4 = var0 / var2;
      int var5 = var0 & var2 - 1;
      int var6 = var1 / var2;
      int var7 = var1 & var2 - 1;
      int var8 = Class410.method5064(var4, var6, -1245969253);
      int var9 = Class410.method5064(1 + var4, var6, -1486166501);
      int var10 = Class410.method5064(var4, var6 + 1, -1571410748);
      int var11 = Class410.method5064(var4 + 1, 1 + var6, -1186156722);
      int var12 = DamageSprite.method6532(var8, var9, var5, var2, 1726616178);
      int var13 = DamageSprite.method6532(var10, var11, var5, var2, 1795909743);
      return DamageSprite.method6532(var12, var13, var7, var2, 319008088);
   }

   static final void method4091(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      Class540_Sub11.method1662(var3, var4, var0, 1159425012);
   }

   public static int method4092(short var0) {
      return (double)Class248_Sub1.mapZoomScaleY == 3.0D?37:(4.0D == (double)Class248_Sub1.mapZoomScaleY?50:(6.0D == (double)Class248_Sub1.mapZoomScaleY?75:((double)Class248_Sub1.mapZoomScaleY == 8.0D?100:200)));
   }

   static final void method4093(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class104_Sub21.renderSettings.aClass540_Sub25_7290.method4178((byte)-18);
   }

   static int method4094(Class240_Sub22_Sub1 var0, RSFont var1, int var2) {
      String var3 = Class500.method5833(var0, -1536685534);
      return var1.getStringWidth(var3, Class20.imgNameIcons, -1330052332);
   }
}
