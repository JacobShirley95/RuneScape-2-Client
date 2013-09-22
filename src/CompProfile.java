
public class CompProfile {

   boolean isARM;
   int availableProcessors;
   int maxMem;
   boolean isWin;


   public boolean method6110(byte var1) {
      return this.isWin;
   }

   public int method6111(byte var1) {
      return -951457007 * this.maxMem;
   }

   public int method6112(byte var1) {
      return this.availableProcessors * -552071227;
   }

   CompProfile(int var1, int var2, boolean var3, boolean var4) {
      this.maxMem = var1 * 653026801;
      this.availableProcessors = var2 * 775067405;
      this.isARM = var3;
      this.isWin = var4;
   }

   public boolean method6113(int var1) {
      return this.isARM;
   }

   public static boolean method6114(boolean var0, int var1) {
      boolean var2 = Class286.gameRenderer.method1989();
      if(var0 != var2) {
         if(var0) {
            if(!Class286.gameRenderer.method1953()) {
               var0 = false;
            }
         } else {
            Class286.gameRenderer.method1990();
         }

         if(var0 != var2) {
            Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub16_7301, var0?1:0, -612674932);
            Class83.method1089(-798311908);
            return true;
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   public static final int getHeight(int gameX, int gameY, int var2) {
      if(client.aClass296_348.getWorldObjects() == null) {
         return 0;
      } else {
         int var4 = gameX >> 9;
         int var5 = gameY >> 9;
         if(var4 >= 0 && var5 >= 0 && var4 <= client.aClass296_348.getMaxX((byte)10) - 1 && var5 <= client.aClass296_348.getMaxY(-509589375) - 1) {
            int index = var2;
            if(var2 < 3 && (client.aClass296_348.method3753().aByteArrayArrayArray_4768[1][var4][var5] & 2) != 0) {
               index = var2 + 1;
            }

            return client.aClass296_348.getWorldObjects().planes[index].getHeight(gameX, gameY);
         } else {
            return 0;
         }
      }
   }

   public static int[][] method6116(int var0, int var1, int var2, int var3, int var4, int var5, float var6, boolean var7, int var8) {
      int[][] var9 = new int[var1][var0];
      Class240_Sub20_Sub1 var10 = new Class240_Sub20_Sub1();
      var10.aBoolean_3729 = var7;
      var10.anInt_3725 = -1194316681 * var3;
      var10.anInt_3717 = -1682538991 * var4;
      var10.anInt_3727 = 1107518257 * var5;
      var10.anInt_3716 = -531572041 * (int)(4096.0F * var6);
      var10.method2691(-450167940);
      Class479.method5695(var0, var1, 1376987800);

      for(int var11 = 0; var11 < var1; ++var11) {
         var10.method2689(var11, var9[var11], -1932107578);
      }

      return var9;
   }
}
