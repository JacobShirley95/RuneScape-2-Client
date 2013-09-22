
public class Class215 {

   final short aShort_3731;
   final byte aByte_3732;
   final short aShort_3733;
   final short aShort_3734;
   final byte aByte_3735;
   final int anInt_3736;
   final boolean aBoolean_3737;
   final int anInt_3738;
   public static CacheDataUnpacker aCacheUnpacker_3739;


   Class215(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, boolean var10, int var11) {
      this.anInt_3736 = var1 * 1119440393;
      this.aShort_3734 = (short)var5;
      this.aShort_3731 = (short)var6;
      this.aShort_3733 = (short)var7;
      this.aByte_3732 = (byte)var8;
      this.aByte_3735 = (byte)var9;
      this.aBoolean_3737 = var10;
      this.anInt_3738 = 1087733469 * var11;
   }

   public static void setTextImgs(Sprite[] var0) {
      Class374.nameIconsCount = -387924395 * var0.length;
      Class20.imgNameIcons = new Sprite[10 + Class374.nameIconsCount * -632402179];
      Class90.furthestPositions = new int[10 + -632402179 * Class374.nameIconsCount];
      System.arraycopy(var0, 0, Class20.imgNameIcons, 0, -632402179 * Class374.nameIconsCount);

      int var2;
      for(var2 = 0; var2 < -632402179 * Class374.nameIconsCount; ++var2) {
         Class90.furthestPositions[var2] = Class20.imgNameIcons[var2].getFurthestY();
      }

      for(var2 = -632402179 * Class374.nameIconsCount; var2 < Class20.imgNameIcons.length; ++var2) {
         Class90.furthestPositions[var2] = 12;
      }

   }

   static final void method2696(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, short var3) {
      var2.intTypeIndex -= -2124084621;
      int var4 = var2.intTypes[-831324111 * var2.intTypeIndex];
      short var5 = (short)var2.intTypes[var2.intTypeIndex * -831324111 + 1];
      short var6 = (short)var2.intTypes[2 + -831324111 * var2.intTypeIndex];
      if(var4 >= 0) {
         ;
      }

      var0.method1717(var4, var5, var6, 1277921622);
      Class110_Sub1.method3149(var0, -1372862808);
      if(-1 == -1001687885 * var0.anInt_2428 && !var1.aBoolean_2054) {
         Class281.method3654(1278853609 * var0.cacheID, var4, (byte)54);
      }

   }

   static final void method2697(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, int var3) {
      String var4 = (String)var2.stringData[(var2.stringDataIndex -= -1828074049) * 863838783];
      if(Class557.extractInterfaceIntData(var4, var2, 2017798316) != null) {
         var4 = var4.substring(0, var4.length() - 1);
      }

      var0.anObjectArray_2420 = Class133.extractInterfaceData(var4, var2, (byte)11);
      var0.aBoolean_2524 = true;
   }

   static final void method2698(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 1833812087 * var3.height;
   }

   static final void method2699(RSInterfaceData var0, int var1) {
      if(1422532379 * client.anInt_472 >= 5 && client.anInt_472 * 1422532379 <= 9) {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 1;
      } else {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 0;
      }

   }

   public static void method2700(int var0, byte var1) {
      Class240_Sub5 var2 = (Class240_Sub5)Class524.aNodeArrayList_9273.getNode((long)var0);
      if(var2 != null) {
         var2.aClass254_Sub1_6754.method3326(904374723);
         Class505.method5865(var2.anInt_6753 * -484590667, var2.aBoolean_6756, -880433694);
         var2.shiftNext();
      }

   }

   static void method2701(RSInterface var0, int var1) {
      if(5 == 1916189739 * var0.index && 2142376247 * var0.itemID != -1) {
         Class87.method1140(Class286.gameRenderer, var0, -400974870);
      }

   }

   static final void method2702(RSInterfaceData var0, byte var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class521.myPlayer.aClass6_4337.getRotation((byte)110) >> 3;
   }
}
