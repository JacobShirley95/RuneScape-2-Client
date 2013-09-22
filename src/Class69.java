
public class Class69 implements Class70 {

   Sprite aClass170_1324;
   final CacheDataUnpacker aCacheUnpacker_1325;
   final Class394 aClass394_1326;


   Class69(CacheDataUnpacker var1, Class394 var2) {
      this.aCacheUnpacker_1325 = var1;
      this.aClass394_1326 = var2;
   }

   public void method812(short var1) {
      this.aClass170_1324 = FontRenderer.method1079(this.aCacheUnpacker_1325, this.aClass394_1326.anInt_7560 * -606137971, -2128277615);
   }

   public void method813(boolean var1, int var2) {
      if(var1) {
         int var3 = 1111410531 * Class29.canvasWidth > 688709465 * client.anInt_343?Class29.canvasWidth * 1111410531:client.anInt_343 * 688709465;
         int var4 = Class597.canvasHeight * -75607525 > 759607001 * client.anInt_435?Class597.canvasHeight * -75607525:759607001 * client.anInt_435;
         int var5 = this.aClass170_1324.getFurthestX();
         int var6 = this.aClass170_1324.getFurthestY();
         int var7 = 0;
         int var8 = var3;
         int var9 = var6 * var3 / var5;
         int var10 = (var4 - var9) / 2;
         if(var9 > var4) {
            var10 = 0;
            var9 = var4;
            var8 = var5 * var4 / var6;
            var7 = (var3 - var8) / 2;
         }

         this.aClass170_1324.method2145(var7, var10, var8, var9);
      }

   }

   public boolean method811(byte var1) {
      return this.aCacheUnpacker_1325.hasData(this.aClass394_1326.anInt_7560 * -606137971, 1311316114);
   }

   static final void method724(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = -894621809 * var3.anInt_2476;
   }

   static final void method725(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class240_Sub41_Sub3.aClass23_1024.method6395(var2, 1558023400);
   }

   static final void method726(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = (int)client.aFloat_387 >> 3;
   }

   static final void method727(RSInterfaceData var0, int var1) {
      var0.intTypeIndex -= -708028207;
   }

   static final void method728(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class104_Sub21.renderSettings.particlesSetting.method4019('\uff00')?1:0;
   }

   public static int method729(int var0, int var1, int var2, int var3) {
      var2 &= 3;
      return 0 == var2?var0:(var2 == 1?var1:(var2 == 2?7 - var0:7 - var1));
   }

   static final void method730(RSInterfaceData var0, byte var1) {
      Class489.method5747(var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111], 255, 50, -1313013936);
   }
}
