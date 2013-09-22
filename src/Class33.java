import java.util.Calendar;

public class Class33 implements Class70 {

   final Class413 aClass413_819;
   final Class35 aClass35_820;


   public void method812(short var1) {}

   Class33(Class35 var1, Class413 var2) {
      this.aClass413_819 = var2;
      this.aClass35_820 = var1;
   }

   int method239(FontRenderer var1, String var2, int var3, int var4, int var5, byte var6) {
      return var1.method1078(var2, var5 + var3, var4 + var5, this.aClass413_819.anInt_7888 * 806696797 - 2 * var5, -813779949 * this.aClass413_819.anInt_7893 - 2 * var5, this.aClass413_819.anInt_7889 * 827094119, 278857189 * this.aClass413_819.anInt_7890, 0, 0, 0, (Sprite[])null, (int[])null, (Class1024)null, 0, 0, -123113637);
   }

   public void method813(boolean var1, int var2) {
      Class77 var3 = this.aClass35_820.method267(this.aClass413_819.anInt_7885 * 716912587, 597466827);
      if(var3 != null) {
         int var4 = this.aClass413_819.aClass419_7894.method5215(806696797 * this.aClass413_819.anInt_7888, client.anInt_343 * 688709465, (byte)-71) + this.aClass413_819.anInt_7887 * 303478499;
         int var5 = this.aClass413_819.aClass412_7886.method5106(this.aClass413_819.anInt_7893 * -813779949, client.anInt_435 * 759607001, -646968018) + this.aClass413_819.anInt_7892 * -1647219439;
         if(this.aClass413_819.aBoolean_7895) {
            Class286.gameRenderer.method1920(var4, var5, 806696797 * this.aClass413_819.anInt_7888, this.aClass413_819.anInt_7893 * -813779949, -1163613133 * this.aClass413_819.anInt_7891, 0);
         }

         var5 += this.method239(MouseHandler.aTextRenderer_6379, var3.aString_1456, var4, var5, 5, (byte)4) * 12;
         var5 += 8;
         if(this.aClass413_819.aBoolean_7895) {
            Class286.gameRenderer.method1968(var4, var5, var4 + this.aClass413_819.anInt_7888 * 806696797 - 1, var5, -1163613133 * this.aClass413_819.anInt_7891, 0);
         }

         ++var5;
         var5 += this.method239(MouseHandler.aTextRenderer_6379, var3.aString_1455, var4, var5, 5, (byte)4) * 12;
         var5 += 5;
         int var10000 = var5 + this.method239(MouseHandler.aTextRenderer_6379, var3.aString_1454, var4, var5, 5, (byte)4) * 12;
      }

   }

   public boolean method811(byte var1) {
      return this.aClass35_820.method268((byte)-106);
   }

   static void method242(short var0) {
      if(Class561.colourMap == null) {
         Class561.colourMap = new int[65536];
         double var1 = 0.7D + (Math.random() * 0.03D - 0.015D);
         int var3 = 0;

         for(int var4 = 0; var4 < 512; ++var4) {
            float var5 = ((float)(var4 >> 3) / 64.0F + 0.0078125F) * 360.0F;
            float var6 = 0.0625F + (float)(var4 & 7) / 8.0F;

            for(int var7 = 0; var7 < 128; ++var7) {
               float var8 = (float)var7 / 128.0F;
               float var9 = 0.0F;
               float var10 = 0.0F;
               float var11 = 0.0F;
               float var12 = var5 / 60.0F;
               int var13 = (int)var12;
               int var14 = var13 % 6;
               float var15 = var12 - (float)var13;
               float var16 = var8 * (1.0F - var6);
               float var17 = (1.0F - var15 * var6) * var8;
               float var18 = (1.0F - var6 * (1.0F - var15)) * var8;
               if(var14 == 0) {
                  var9 = var8;
                  var10 = var18;
                  var11 = var16;
               } else if(var14 == 1) {
                  var9 = var17;
                  var10 = var8;
                  var11 = var16;
               } else if(var14 == 2) {
                  var9 = var16;
                  var10 = var8;
                  var11 = var18;
               } else if(var14 == 3) {
                  var9 = var16;
                  var10 = var17;
                  var11 = var8;
               } else if(4 == var14) {
                  var9 = var18;
                  var10 = var16;
                  var11 = var8;
               } else if(var14 == 5) {
                  var9 = var8;
                  var10 = var16;
                  var11 = var17;
               }

               var9 = (float)Math.pow((double)var9, var1);
               var10 = (float)Math.pow((double)var10, var1);
               var11 = (float)Math.pow((double)var11, var1);
               int var19 = (int)(var9 * 256.0F);
               int var20 = (int)(var10 * 256.0F);
               int var21 = (int)(256.0F * var11);
               int var22 = (var20 << 8) + -16777216 + (var19 << 16) + var21;
               Class561.colourMap[var3++] = var22;
            }
         }

      }
   }

   static void method243(CacheDataUnpacker var0, int var1, int var2, int var3, boolean var4, long var5, int var7, int var8) {
      Class134.anInt_2617 = 642235515;
      ConnectionUpdate.aCacheUnpacker_119 = var0;
      Class134.anInt_2611 = var1 * -981507397;
      Class489.anInt_9003 = -2057939165 * var2;
      Class123.aClass240_Sub41_Sub2_2276 = null;
      Class586.anInt_9739 = -101527585 * var3;
      Class134.aBoolean_2612 = var4;
      Class134.anInt_2620 = 265466256;
      Class174_Sub2_Sub3_Sub1.aLong_3245 = var5 * -1164472324242648855L;
      LanguagePack.anInt_9289 = 975889651 * var7;
   }

   public static String method244(long var0, int var2, boolean var3, int var4) {
      Calendar var5;
      if(var3) {
         Class421.method5266(var0);
         var5 = Class461.aCalendar_8602;
      } else {
         Class544.method6092(var0);
         var5 = Class461.aCalendar_8600;
      }

      int var6 = var5.get(5);
      int var7 = var5.get(2);
      int var8 = var5.get(1);
      int var9 = var5.get(11);
      int var10 = var5.get(12);
      return var2 == 3?Class578.method6313(var0, var2, var3, 1736545264):Integer.toString(var6 / 10) + var6 % 10 + "-" + Class461.aStringArrayArray_8601[var2][var7] + "-" + var8 + " " + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10;
   }

   static final int method245(int var0, int var1, byte var2) {
      int var3 = Class330.method4090(var0 + '\ub135', var1 + 91923, 4, -706682761) - 128 + (Class330.method4090(10294 + var0, var1 + '\u93bd', 2, -706682761) - 128 >> 1) + (Class330.method4090(var0, var1, 1, -706682761) - 128 >> 2);
      var3 = (int)(0.3D * (double)var3) + 35;
      if(var3 < 10) {
         var3 = 10;
      } else if(var3 > 60) {
         var3 = 60;
      }

      return var3;
   }

   public static boolean method246(int var0, byte var1) {
      return 0 == var0 || 2 == var0;
   }

   static final void method247(RSInterfaceData var0, byte var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      Class210.method2653(var3, var4, var0, 176947277);
   }
}
