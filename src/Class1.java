
public class Class1 {

   static Sprite[] crossSprites;
   static int p12_fullOffset;
   static int p13_fullOffset;
   static int headIconsPK;
   static int headIconsPrayer;
   static int hintMarkersOffset;
   static int flagCacheOffset;
   static Sprite[] headPKIcons;
   static Sprite[] hintMarkerSprites;
   public static RSFont aRSFont_10;
   static RSFont aRSFont_11;
   static int mapDotsOffset;
   static int p11_fullOffset;
   static int nameIconsOffset;
   static ImageData[] aClass106_Sub2Array_15;
   public static Class631 aClass631_16;
   static int anInt_17;


   Class1() throws Throwable {
      throw new Error();
   }

   static void method1(RSInterfaceData var0, int var1) {
      var0.intTypeIndex -= -1416056414;
      int var2 = var0.intTypes[-831324111 * var0.intTypeIndex];
      int var3 = var0.intTypes[1 + -831324111 * var0.intTypeIndex];
      Class476 var4 = Class240_Sub1.aClass465_6506.method5610(var3, -900773785);
      if(var4.method5681(-2137992109)) {
         String var5 = var4.aString_8738;
         if(var2 == -1) {
            var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = var5;
         } else {
            var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = HintMarker.aClass583_3709.method6327(var2, -698254799).method6181(var3, var5, 1090920475);
         }
      } else {
         int var6 = var4.anInt_8739 * -80630797;
         if(var2 == -1) {
            var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var6;
         } else {
            var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = HintMarker.aClass583_3709.method6327(var2, 1715941099).method6172(var3, var6, -1580412130);
         }
      }

   }

   static final void method2(RSInterfaceData var0, int var1) {
      Class491.method5755(AbstractCacheData.method4673(-2046210360), var0, 2144649915);
   }

   static final void method3(RSInterfaceData var0, byte var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      if(-1 == var2) {
         int var3 = var2 >> 14 & 16383;
         int var4 = var2 & 16383;
         MapPoint var5 = client.aClass296_348.getMapArea();
         var3 -= 1265321541 * var5.loadedMapX;
         if(var3 < 0) {
            var3 = 0;
         } else if(var3 >= client.aClass296_348.getMaxX((byte)-51)) {
            var3 = client.aClass296_348.getMaxX((byte)-32);
         }

         var4 -= var5.loadedMapY * -1996781083;
         if(var4 < 0) {
            var4 = 0;
         } else if(var4 >= client.aClass296_348.getMaxY(1560605274)) {
            var4 = client.aClass296_348.getMaxY(-212986194);
         }

         Class571.anInt_9652 = (256 + (var3 << 9)) * 1694464327;
         Class102.anInt_1968 = 1061791373 * ((var4 << 9) + 256);
      } else {
         Class571.anInt_9652 = -1694464327;
         Class102.anInt_1968 = -1061791373;
      }

   }

   static final void method4(RSInterfaceData var0, int var1) {
      var0.intTypeIndex -= -2124084621;
      Class210.method2652(var0.intTypes[-831324111 * var0.intTypeIndex], var0.intTypes[var0.intTypeIndex * -831324111 + 1], var0.intTypes[2 + -831324111 * var0.intTypeIndex], -507094336);
   }
}
