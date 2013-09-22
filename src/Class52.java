
public class Class52 {

   static final Class52 aClass52_1067 = new Class52(2, false);
   static final Class52 aClass52_1068 = new Class52(0, true);
   static final Class52 aClass52_1069 = new Class52(1, true);
   int anInt_1070;
   boolean aBoolean_1071;
   public static Class327 aClass327_1072;


   Class52(int var1, boolean var2) {
      this.anInt_1070 = 719573275 * var1;
      this.aBoolean_1071 = var2;
   }

   public static void method533(int var0) {
      if(null == Class344.aClass351Array_6559) {
         Class344.aClass351Array_6559 = LoadProgress.method4423((byte)75);
         RendererInfo.curLoadProgress = Class344.aClass351Array_6559[0];
         Class240_Sub21.aLong_7276 = Class373.getCurrentTime((short)8571) * -144614345514772287L;
      }

      if(aClass327_1072 == null) {
         Class126.method1631(141450277);
      }

      LoadProgress var1 = RendererInfo.curLoadProgress;
      int var2 = LoadProgress.method4429((byte)10);
      if(RendererInfo.curLoadProgress == var1) {
         client.aString_315 = RendererInfo.curLoadProgress.aClass482_6739.getText(Class599.clientLanguage, 901053347);
         if(RendererInfo.curLoadProgress.aBoolean_6744) {
            Class240_Sub52.anInt_7975 = (var2 * (-392308157 * RendererInfo.curLoadProgress.anInt_6742 - RendererInfo.curLoadProgress.percent * 1707216417) / 100 + 1707216417 * RendererInfo.curLoadProgress.percent) * 1142874757;
         }

         if(RendererInfo.curLoadProgress.aBoolean_6743) {
            client.aString_315 = client.aString_315 + Class240_Sub52.anInt_7975 * 1281869389 + "%";
         }
      } else if(LoadProgress.aClass351_6723 == RendererInfo.curLoadProgress) {
         aClass327_1072 = null;
         Class418.method5190(5, (byte)-16);
         if(Class344.aBoolean_6556) {
            Class344.aBoolean_6556 = false;
            Class631.method6698(Class545.aString_9478, Class508_Sub4.aString_2359, -1490230217);
         }
      } else {
         client.aString_315 = var1.aClass482_6740.getText(Class599.clientLanguage, -675275794);
         if(RendererInfo.curLoadProgress.aBoolean_6743) {
            client.aString_315 = client.aString_315 + -392308157 * var1.anInt_6742 + "%";
         }

         Class240_Sub52.anInt_7975 = -1802794289 * var1.anInt_6742;
         if(RendererInfo.curLoadProgress.aBoolean_6744 || var1.aBoolean_6744) {
            Class240_Sub21.aLong_7276 = Class373.getCurrentTime((short)23364) * -144614345514772287L;
         }
      }

      if(null != aClass327_1072) {
         aClass327_1072.method4028(Class240_Sub21.aLong_7276 * -248947798881470655L, client.aString_315, 1281869389 * Class240_Sub52.anInt_7975, RendererInfo.curLoadProgress, -90264769);
         if(null != Class344.aClass345Array_6558) {
            for(int var3 = 1188217859 * Class344.anInt_6561 + 1; var3 < Class344.aClass345Array_6558.length; ++var3) {
               if(Class344.aClass345Array_6558[var3].method4289(-946689482) >= 100 && 1188217859 * Class344.anInt_6561 == var3 - 1 && 19 != client.loginStage * -243034353 && aClass327_1072.method4026(84059067)) {
                  try {
                     Class344.aClass345Array_6558[var3].method4291((byte)-81);
                  } catch (Exception var5) {
                     Class344.aClass345Array_6558 = null;
                     break;
                  }

                  aClass327_1072.method4027(Class344.aClass345Array_6558[var3], -2004640387);
                  Class344.anInt_6561 += 1681196715;
                  if(Class344.anInt_6561 * 1188217859 >= Class344.aClass345Array_6558.length - 1 && Class344.aClass345Array_6558.length > 1) {
                     Class344.anInt_6561 = (Class203.aClass449_3530.method5516(377871504)?0:-1) * 1681196715;
                  }
               }
            }
         }
      }

   }

   static final void method534(RSInterfaceData var0, int var1) {
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.idleAnimations, var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111], 71950886);
      Class83.method1089(-867709980);
   }

   public static String method535(CharSequence var0, int var1) {
      String var2 = Class483.method5721(Class31.method221(var0, (byte)0));
      if(null == var2) {
         var2 = "";
      }

      return var2;
   }

   static final void method536(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 1074478051 * var3.anInt_2473;
   }

   static int method537(int var0, int var1) {
      return 16711935 == var0?-1:Class554.method6139(var0, (byte)0);
   }

   public static void method538(int var0, int var1) {
      Class240_Sub27 var2 = Class47_Sub1.method3496(Class326.aClass326_6222, client.gameConnectionHandler.aClass528_3433, 1917447504);
      var2.aClass240_Sub8_Sub1_7370.putIntBE(-1, 2062892803);
      client.gameConnectionHandler.addPacket(var2, 2144095414);
      Class48.aClass123_1020 = new Class123(GraphicsDataHolder.aCacheUnpacker_9212, var0);
   }

   static final int method539(int var0, int var1, int var2) {
      return var1 < 0?-var0:(int)((double)var0 * Math.sqrt(1.220703125E-4D * (double)var1) + 0.5D);
   }
}
