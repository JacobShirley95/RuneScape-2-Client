import java.util.Random;

public class Class479 {

   public static int[] anIntArray_8750;
   public static int[] anIntArray_8751;
   static int anInt_8752;
   static final int anInt_8753 = 12;
   public static int anInt_8754;
   static Class371 aClass371_8755 = new Class371(16, Class369.aClass369_6923);
   static Class533 aClass533_8756;


   static final void method5694(RSInterfaceData var0, int var1) {
      boolean var2 = false;
      if(client.aBoolean_452) {
         try {
            Object var3 = Class332.aClass332_6426.method4107(new Object[]{Integer.valueOf(Class36.anInt_851 * -1571622403), Boolean.valueOf(1 == Class521.myPlayer.aByte_1462), Integer.valueOf(var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111])}, 1555345718);
            if(var3 != null) {
               var2 = ((Boolean)var3).booleanValue();
            }
         } catch (Throwable var4) {
            ;
         }
      }

      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var2?1:0;
   }

   public static void method5695(int var0, int var1, int var2) {
      int var3;
      if(var0 != -1021356107 * anInt_8754) {
         anIntArray_8751 = new int[var0];

         for(var3 = 0; var3 < var0; ++var3) {
            anIntArray_8751[var3] = (var3 << 12) / var0;
         }

         anInt_8754 = -209707363 * var0;
      }

      if(var1 != -2009866671 * anInt_8752) {
         if(-1021356107 * anInt_8754 != var1) {
            anIntArray_8750 = new int[var1];

            for(var3 = 0; var3 < var1; ++var3) {
               anIntArray_8750[var3] = (var3 << 12) / var1;
            }
         } else {
            anIntArray_8750 = anIntArray_8751;
         }

         anInt_8752 = var1 * 1519004337;
      }

   }

   public static byte[] method5696(int var0, int var1) {
      byte[] var2 = (byte[])((byte[])aClass371_8755.method4706(Integer.valueOf(var0), 1847912472));
      if(null == var2) {
         var2 = new byte[512];
         Random var3 = new Random((long)var0);

         int var4;
         for(var4 = 0; var4 < 255; ++var4) {
            var2[var4] = (byte)var4;
         }

         for(var4 = 0; var4 < 255; ++var4) {
            int var5 = 255 - var4;
            int var6 = Class417.method5182(var3, var5, -138362779);
            byte var7 = var2[var6];
            var2[var6] = var2[var5];
            var2[var5] = var2[511 - var4] = var7;
         }

         aClass371_8755.method4710(Integer.valueOf(var0), var2, 1483518059);
      }

      return var2;
   }

   static final void method5697(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, int var3) {
      String var4 = (String)var2.stringData[(var2.stringDataIndex -= -1828074049) * 863838783];
      if(Class557.extractInterfaceIntData(var4, var2, 1605508783) != null) {
         var4 = var4.substring(0, var4.length() - 1);
      }

      var0.anObjectArray_2556 = Class133.extractInterfaceData(var4, var2, (byte)30);
      var0.aBoolean_2524 = true;
   }

   Class479() throws Throwable {
      throw new Error();
   }

   public static void method5698(int var0, String var1, boolean var2, int var3) {
      if(var0 == 0) {
         Class286.gameRenderer = AnimationUnpacker.getRenderer(0, Class51.clientCanvas, FontRenderer_Sub3.aClass163_10701, RSInterfaceGroup.aClass96_2057, Class465.aCacheUnpacker_8678, Class104_Sub21.renderSettings.aClass540_Sub27_7288.method4256(-2047678864) * 2, (short)22220);
         if(null != var1) {
            Class286.gameRenderer.method1977(1, 0);
            RSFont var4 = Class410.method5063(Class5.aCacheUnpacker_31, Class1.p12_fullOffset * -151545987, 0, -2023441546);
            FontRenderer var5 = Class286.gameRenderer.method1935(var4, (ImageData[])((ImageData[])ImageUtils.method1797(Class301.mmUnpacker, Class1.p12_fullOffset * -151545987, 0)), true);
            Class408.method5039(2041580698);
            Class599.method6484(var1, true, Class286.gameRenderer, var5, var4, 888701854);
         }
      } else {
         label210: {
            Renderer var20 = null;
            RSFont var21;
            FontRenderer var6;
            if(var1 != null) {
               var20 = AnimationUnpacker.getRenderer(0, Class51.clientCanvas, FontRenderer_Sub3.aClass163_10701, RSInterfaceGroup.aClass96_2057, Class465.aCacheUnpacker_8678, 0, (short)13773);
               var20.method1977(1, 0);
               var21 = Class410.method5063(Class5.aCacheUnpacker_31, -151545987 * Class1.p12_fullOffset, 0, -1584624588);
               var6 = var20.method1935(var21, (ImageData[])((ImageData[])ImageUtils.method1797(Class301.mmUnpacker, Class1.p12_fullOffset * -151545987, 0)), true);
               Class408.method5039(1328173455);
               Class599.method6484(var1, true, var20, var6, var21, -1650127427);
            }

            try {
               try {
                  Class286.gameRenderer = AnimationUnpacker.getRenderer(var0, Class51.clientCanvas, FontRenderer_Sub3.aClass163_10701, RSInterfaceGroup.aClass96_2057, Class465.aCacheUnpacker_8678, Class104_Sub21.renderSettings.aClass540_Sub27_7288.method4256(-2116651551) * 2, (short)-16935);
                  if(null != var1) {
                     var20.method1977(1, 0);
                     var21 = Class410.method5063(Class5.aCacheUnpacker_31, -151545987 * Class1.p12_fullOffset, 0, -1345440132);
                     var6 = var20.method1935(var21, (ImageData[])((ImageData[])ImageUtils.method1797(Class301.mmUnpacker, Class1.p12_fullOffset * -151545987, 0)), true);
                     Class408.method5039(1673862682);
                     Class599.method6484(var1, true, var20, var6, var21, -1507602438);
                  }

                  if(Class286.gameRenderer.method1992()) {
                     boolean var22 = true;

                     try {
                        var22 = Class494.aClass240_Sub15_9037.anInt_6891 * 2057037889 > 256;
                     } catch (Throwable var17) {
                        ;
                     }

                     Class240_Sub51 var24;
                     if(var22) {
                        var24 = Class286.gameRenderer.method1926(146800640);
                     } else {
                        var24 = Class286.gameRenderer.method1926(104857600);
                     }

                     Class286.gameRenderer.method1986(var24);
                  }
                  break label210;
               } catch (Throwable var18) {
                  switch(var0) {
                  case 1:
                     Class274.method3603(Class486.aClass486_8982, (short)-22417);
                     break;
                  case 3:
                     Class274.method3603(Class486.aClass486_8983, (short)-9986);
                  }
               }

               int var23 = Class104_Sub21.renderSettings.currentToolkit.getToolkitID();
               Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.currentToolkit, 0, 50569593);
               method5698(var23, var1, var2, -783718429);
            } finally {
               if(null != var20) {
                  try {
                     var20.method1939(-1500363801);
                  } catch (Throwable var16) {
                     ;
                  }
               }

            }

            return;
         }
      }

      if(var2) {
         Class104_Sub21.renderSettings.method4824(Class104_Sub21.renderSettings.currentToolkit, !var2, -2007212303);
      }

      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.currentToolkit, var0, 372864114);
      if(!var2) {
         Class104_Sub21.renderSettings.method4824(Class104_Sub21.renderSettings.currentToolkit, !var2, -1165055458);
      }

      Class29.method212(1349963823);
      Class286.gameRenderer.method1938(10000);
      Class286.gameRenderer.method1948(32);
      client.aClass296_348.method3762(980291308);
      if(Class286.gameRenderer.supportsTexture()) {
         CompProfile.method6114(Class104_Sub21.renderSettings.aClass540_Sub16_7301.method1783(1882255912) == 1, 1507405730);
      }

      client.aClass296_348.method3786(-2135653658);
      client.aClass296_348.method3754(-1853793809).method6383((byte)-118);
      client.aBoolean_568 = false;
      client.aBoolean_311 = true;
      Class346.aClass516Array_6568 = null;
      Class286.gameRenderer.method1970(0.0F, 1.0F);
   }

   static final void method5699(int var0) {
      for(Class231_Sub4 var1 = (Class231_Sub4)client.aClass512_402.method5929(1659302625); null != var1; var1 = (Class231_Sub4)client.aClass512_402.method5929(1039717980)) {
         Class319.method3958(var1, (byte)-54);
      }

      byte var4 = 0;
      byte var2 = 3;
      int var3;
      if(1 == 415041591 * client.anInt_356) {
         for(var3 = var4; var3 <= var2; ++var3) {
            client.method177(var3);
         }

         client.method172();
      } else {
         client.method170();

         for(var3 = var4; var3 <= var2; ++var3) {
            client.method171();
            client.method178(var3);
            client.method177(var3);
         }

         client.method176();
         client.method172();
      }

   }

   public static boolean method5700(String var0, byte var1) {
      if(var0 == null) {
         return false;
      } else {
         for(int var2 = 0; var2 < -275736435 * client.ignoreListCount; ++var2) {
            IgnoredPlayer var3 = client.ignoreList[var2];
            if(var0.equalsIgnoreCase(var3.aString_111)) {
               return true;
            }

            if(var0.equalsIgnoreCase(var3.aString_112)) {
               return true;
            }
         }

         return false;
      }
   }
}
