
public class Class134 {

   static final int anInt_2609 = 3;
   static CacheDataUnpacker aCacheUnpacker_2610;
   static int anInt_2611;
   static boolean aBoolean_2612;
   static final int anInt_2613 = 0;
   static final int anInt_2614 = 1;
   static final int anInt_2615 = 2;
   static Class240_Sub41_Sub2 aClass240_Sub41_Sub2_2616;
   static int anInt_2617 = 0;
   static CacheDataUnpacker aCacheUnpacker_2618;
   static CacheDataUnpacker aCacheUnpacker_2619;
   static int anInt_2620;


   Class134() throws Throwable {
      throw new Error();
   }

   public static int method1785(ByteArrayDataNode var0, String var1, int var2) {
      int var3 = 964952859 * var0.index;
      byte[] var4 = Class566.encodeStr(var1, (byte)8);
      var0.method4473(var4.length, (byte)53);
      var0.index += Class53.aClass48_1073.method487(var4, 0, var4.length, var0.data, var0.index * 964952859, 589737102) * -2043502829;
      return var0.index * 964952859 - var3;
   }

   static final void method1786(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, byte var3) {
      var2.intTypeIndex -= -1416056414;
      var0.scrollX = var2.intTypes[-831324111 * var2.intTypeIndex] * 1533796587;
      if(var0.scrollX * -340277309 > var0.anInt_2453 * -1912683305 - -533669195 * var0.width) {
         var0.scrollX = -134753955 * var0.anInt_2453 - var0.width * 1289626663;
      }

      if(-340277309 * var0.scrollX < 0) {
         var0.scrollX = 0;
      }

      var0.scrollY = var2.intTypes[var2.intTypeIndex * -831324111 + 1] * -198237437;
      if(-978526293 * var0.scrollY > 972244665 * var0.anInt_2454 - var0.height * 1833812087) {
         var0.scrollY = 1081876267 * var0.anInt_2454 - -1424849307 * var0.height;
      }

      if(var0.scrollY * -978526293 < 0) {
         var0.scrollY = 0;
      }

      Class110_Sub1.method3149(var0, 2134422096);
      if(-1 == -1001687885 * var0.anInt_2428 && !var1.aBoolean_2054) {
         Class32_Sub1.method3353(1278853609 * var0.cacheID, (byte)-1);
      }

   }

   static final void method1787(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, int var3) {
      int var4 = var2.intTypes[(var2.intTypeIndex -= -708028207) * -831324111];
      int var5 = var2.intTypes[(var2.intTypeIndex -= -708028207) * -831324111];
      if(var5 >= 1 && var5 <= 10) {
         var0.method1711(var5 - 1, var4, (byte)-65);
      }

   }

   static final void method1788(RSInterfaceData var0, int var1) {
      var0.intTypeIndex -= -1416056414;
      int var2 = var0.intTypes[-831324111 * var0.intTypeIndex];
      int var3 = var0.intTypes[-831324111 * var0.intTypeIndex + 1];
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class618.method6617(var2, var3, false, false, 1574404655);
   }

   static final void method1789(RSInterfaceData var0, int var1) {
      Class573.method6282(var0.animeTarget, var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111], -1045078331);
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = (int)client.calculatedPosition[0];
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = (int)client.calculatedPosition[1];
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = (int)client.calculatedPosition[2];
   }

   static final void method1790(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var0.aClass68_9508.method711((String)var0.stringData[(var0.stringDataIndex -= -1828074049) * 863838783], 68378898);
   }

   public static boolean method1791(CacheDataUnpacker var0, CacheDataUnpacker var1, CacheDataUnpacker var2, Class240_Sub41_Sub2 var3, Class316 var4, int var5) {
      aCacheUnpacker_2618 = var0;
      aCacheUnpacker_2610 = var1;
      aCacheUnpacker_2619 = var2;
      aClass240_Sub41_Sub2_2616 = var3;
      AnimationUnpacker.aClass316_4423 = var4;
      Class26.anIntArray_269 = new int[16];

      for(int var6 = 0; var6 < 16; ++var6) {
         Class26.anIntArray_269[var6] = 255;
      }

      return true;
   }

   public static void method1792(int var0) {
      Class35.method273(-1, 255, -1912749449);
   }
}
