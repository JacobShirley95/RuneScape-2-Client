import java.net.URL;

public class Class194 {

   static int anInt_3356 = 2050923467;
   static int anInt_3357;
   static String[] consoleStrings;
   static final int anInt_3359 = 350;
   static int anInt_3360 = 0;
   static String aString_3361 = "";
   static int anInt_3362 = 0;
   static int anInt_3363 = 0;
   static int anInt_3364 = 0;
   static boolean aBoolean_3365 = false;
   static final String aString_3366 = "Failure";
   static long timeStamp;
   static final String aString_3368 = "\\/.:, _-+[]~@";
   static final String aString_3369 = "Success";
   static int anInt_3370 = 0;


   Class194() throws Throwable {
      throw new Error();
   }

   public static final boolean method2516(String var0, String var1, String var2, String var3, int var4) {
      return var0 != null && null != var2?(!var0.startsWith("#") && !var2.startsWith("#")?var1.equals(var3):var0.equals(var2)):false;
   }

   static final void method2517(RSInterfaceData var0, byte var1) {
      if(1 == Class228.anInt_3937 * 1740852563) {
         Class211.aBoolean_3667 = true;
      } else if(Class228.anInt_3937 * 1740852563 == 3) {
         Class211.aBoolean_3668 = true;
      }

   }

   public static void setLow(byte var0) {
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub24_7302, 1, 885171796);
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub24_7297, 1, -64106709);
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub18_7280, 1, 1048479048);
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub1_7295, 1, 1043912825);
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.idleAnimations, 0, 1325110107);
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub23_7293, 0, 292318960);
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub21_7306, 0, -597637652);
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub32_7303, 0, 1277938959);
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub17_7299, 0, 1696644749);
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub26_7308, 0, 964359737);
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub22_7310, 0, -367259107);
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub31_7321, 0, -571488945);
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub27_7315, 0, 1042546569);
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub27_7288, 0, 40333483);
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.particlesSetting, 0, 760616995);
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub7_7291, 746264091 * Class40.aClass40_878.anInt_873, -283710746);
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub16_7301, 0, -430134553);
      if(Class286.gameRenderer != null && Class286.gameRenderer.supportsTexture() && Class286.gameRenderer.method1989()) {
         Class286.gameRenderer.method1990();
      }

      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub6_7305, 0, 1893795816);
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub10_7292, 0, 1415460143);
      Class209.method2639((byte)-63);
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub3_7307, 2, 1458096551);
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub30_7314, 2, 729270843);
      Class481.method5706(-834672780);
      client.aClass296_348.method3754(-889153992).method6383((byte)-70);
      client.aBoolean_311 = true;
   }

   static boolean method2519(int var0, int var1) {
      return var0 == 4 || var0 == 2;
   }

   public static int method2520(int var0, int var1, boolean var2, short var3) {
      int var4 = 0;
      Class240_Sub46 var5 = Class416.method5153(var0, var2, (byte)-10);
      if(var5 == null) {
         return 0;
      } else {
         for(int var6 = 0; var6 < var5.anIntArray_7650.length; ++var6) {
            if(var5.anIntArray_7650[var6] >= 0 && Class592.cacheObjectLoader.getObjectDescriptor(var5.anIntArray_7650[var6]).anInt_8466 * 1407986865 == var1) {
               var4 += Class514.method5946(var0, var6, var2, -1851227125);
            }
         }

         return var4;
      }
   }

   public static boolean method2521(String var0, int var1, String var2, int var3) {
      if(var1 == 0) {
         try {
            if(!Class220.aString_3781.startsWith("win")) {
               throw new Exception();
            } else if(!var0.startsWith("http://") && !var0.startsWith("https://")) {
               throw new Exception();
            } else {
               String var11 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

               for(int var5 = 0; var5 < var0.length(); ++var5) {
                  if(var11.indexOf(var0.charAt(var5)) == -1) {
                     throw new Exception();
                  }
               }

               Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\"");
               return true;
            }
         } catch (Throwable var6) {
            return false;
         }
      } else if(1 == var1) {
         try {
            Object var4 = Class480.method5702(Class220.anApplet_3778, var2, new Object[]{(new URL(Class220.anApplet_3778.getCodeBase(), var0)).toString()}, 1572302653);
            return null != var4;
         } catch (Throwable var7) {
            return false;
         }
      } else if(2 == var1) {
         try {
            Class220.anApplet_3778.getAppletContext().showDocument(new URL(Class220.anApplet_3778.getCodeBase(), var0), "_blank");
            return true;
         } catch (Exception var8) {
            return false;
         }
      } else if(var1 == 3) {
         try {
            Class480.method5701(Class220.anApplet_3778, "loggedout", -819889300);
         } catch (Throwable var10) {
            ;
         }

         try {
            Class220.anApplet_3778.getAppletContext().showDocument(new URL(Class220.anApplet_3778.getCodeBase(), var0), "_top");
            return true;
         } catch (Exception var9) {
            return false;
         }
      } else {
         throw new IllegalArgumentException();
      }
   }
}
