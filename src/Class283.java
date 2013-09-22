import java.io.File;

public class Class283 implements Class551 {

   static final Class283 aClass283_4780 = new Class283_Sub2(Class124.aClass124_2297, 3, false, false);
   public static final Class283 aClass283_4781 = new Class283_Sub4(Class124.aClass124_2329, 1, false, true);
   static final Class283 aClass283_4782 = new Class283(Class124.aClass124_2335, 5, true, false);
   public static final Class283 aClass283_4783 = new Class283_Sub3(Class124.aClass124_2332, 2, true, true);
   static final Class283 aClass283_4784 = new Class283(Class124.aClass124_2334, 4, false, false);
   public static final Class283 aClass283_4785 = new Class283_Sub5(Class124.aClass124_2330, 0, true, true);
   public static final Class283 aClass283_4786 = new Class283(Class124.aClass124_2303, 6, true, true);
   static final Class283 aClass283_4787 = new Class283(Class124.aClass124_2283, 10, false, false);
   static final Class283 aClass283_4788 = new Class283_Sub1(Class124.aClass124_2338, 8, false, false);
   static final Class283 aClass283_4789 = new Class283((Class124)null, 9, false, false);
   public static final Class283 aClass283_4790 = new Class283(Class124.aClass124_2337, 7, true, false);
   final Class124 aClass124_4791;
   final int anInt_4792;


   public Class124 method3663(int var1) {
      return this.aClass124_4791;
   }

   public static Class283[] method3664(short var0) {
      return new Class283[]{aClass283_4780, aClass283_4784, aClass283_4789, aClass283_4787, aClass283_4788, aClass283_4782, aClass283_4790, aClass283_4786, aClass283_4781, aClass283_4785, aClass283_4783};
   }

   public Object method3665(Class187 var1, int var2) {
      return var1.aBoolean_3200?this.method3666(var1, 832409824):var1.aClass373_3197.method4743(-624982311);
   }

   Class283(Class124 var1, int var2, boolean var3, boolean var4, Class283_Sub5 var5) {
      this(var1, var2, var3, var4);
   }

   Class283(Class124 var1, int var2, boolean var3, boolean var4) {
      this.aClass124_4791 = var1;
      this.anInt_4792 = var2 * 749388359;
   }

   Object method3666(Class187 var1, int var2) {
      return var1.aClass373_3197.method4743(-1514967568);
   }

   public int getLanguageID(int var1) {
      return this.anInt_4792 * 710035319;
   }

   static final void method3668(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      Class555.method6144(var3, var4, var0, (byte)1);
   }

   static final void method3669(RSInterfaceData var0, byte var1) {
      if(Class542.aClass43_Sub1_9475.method370(-1424772367) == Class116.aClass116_2089 && Class542.aClass43_Sub1_9475.method369(-831324111) == Class31.aClass31_808) {
         GameCoord var2 = ((Class66_Sub3)Class542.aClass43_Sub1_9475.method398(1713854862)).method2995((byte)-74);
         GameCoord var3 = ((Class508_Sub4)Class542.aClass43_Sub1_9475.method397((byte)-74)).method1616(-2015492864);
         GameCoord var4 = GameCoord.method4308(var2);
         var4.dist(var3);
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = (int)var4.getHyp();
      } else {
         throw new RuntimeException();
      }
   }

   public static int method3670(int var0, int var1, byte var2) {
      int var3;
      for(var3 = 0; var1 > 0; --var1) {
         var3 = var3 << 1 | var0 & 1;
         var0 >>>= 1;
      }

      return var3;
   }

   static final void method3671(RSInterfaceData var0, byte var1) {
      boolean var2 = false;
      String var3 = "";
      if(null != var0.aClass20_9517 && var0.aClass20_9517.method115(-1161659315)) {
         File var4 = var0.aClass20_9517.method114(1418522794);
         if(null != var4) {
            var3 = var4.getPath();
            if(var3 == null) {
               var3 = "";
            }
         }

         var2 = true;
         var0.aClass20_9517 = null;
      }

      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var2?1:0;
      var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = var3;
   }

   static final void method3672(int var0, int var1, int var2) {
      if(Class248_Sub1.mapZoomScaleX < Class248_Sub1.mapZoomScaleY) {
         Class248_Sub1.mapZoomScaleX = (float)((double)Class248_Sub1.mapZoomScaleX + (double)Class248_Sub1.mapZoomScaleX / 30.0D);
         if(Class248_Sub1.mapZoomScaleX > Class248_Sub1.mapZoomScaleY) {
            Class248_Sub1.mapZoomScaleX = Class248_Sub1.mapZoomScaleY;
         }

         RenderSettings.method4829(-1065508851);
         Class248_Sub1.anInt_4116 = (int)Class248_Sub1.mapZoomScaleX >> 1;
         Class248_Sub1.aByteArrayArrayArray_4115 = Class240_Sub4_Sub2.method284(Class248_Sub1.anInt_4116, 1351082583);
      } else if(Class248_Sub1.mapZoomScaleX > Class248_Sub1.mapZoomScaleY) {
         Class248_Sub1.mapZoomScaleX = (float)((double)Class248_Sub1.mapZoomScaleX - (double)Class248_Sub1.mapZoomScaleX / 30.0D);
         if(Class248_Sub1.mapZoomScaleX < Class248_Sub1.mapZoomScaleY) {
            Class248_Sub1.mapZoomScaleX = Class248_Sub1.mapZoomScaleY;
         }

         RenderSettings.method4829(-1673101107);
         Class248_Sub1.anInt_4116 = (int)Class248_Sub1.mapZoomScaleX >> 1;
         Class248_Sub1.aByteArrayArrayArray_4115 = Class240_Sub4_Sub2.method284(Class248_Sub1.anInt_4116, 1597515821);
      }

      if(Class248_Sub1.anInt_6446 * -996128567 != -1 && Class248_Sub1.anInt_6447 * -1558089349 != -1) {
         int var3 = -996128567 * Class248_Sub1.anInt_6446 - Class107.viewOfMapImageX * -1850250531;
         if(var3 < 2 || var3 > 2) {
            var3 /= 8;
         }

         int var4 = Class248_Sub1.anInt_6447 * -1558089349 - AbstractUpdateServerConnector.viewOfMapImageY * 1377436059;
         if(var4 < 2 || var4 > 2) {
            var4 /= 8;
         }

         Class107.viewOfMapImageX = (-1850250531 * Class107.viewOfMapImageX + var3) * 745782645;
         AbstractUpdateServerConnector.viewOfMapImageY = (AbstractUpdateServerConnector.viewOfMapImageY * 1377436059 + var4) * -394363757;
         if(var3 == 0 && 0 == var4) {
            Class248_Sub1.anInt_6446 = -1082544505;
            Class248_Sub1.anInt_6447 = 826358349;
         }

         RenderSettings.method4829(-611172209);
      }

      if(Class533.anInt_9358 * -325125283 > 0) {
         Class467.anInt_8690 -= -919466193;
         if(-2092984369 * Class467.anInt_8690 == 0) {
            Class533.anInt_9358 -= 471347445;
            Class467.anInt_8690 = -1752306084;
         }
      } else {
         Class248_Sub1.anInt_6453 = 2140620407;
         Class248_Sub1.anInt_6454 = 1309236803;
      }

      if(Class248_Sub1.aBoolean_6448 && null != IgnoredPlayer.aNodeList_114) {
         for(Class240_Sub33 var5 = (Class240_Sub33)IgnoredPlayer.aNodeList_114.getBaseNode_2((byte)95); null != var5; var5 = (Class240_Sub33)IgnoredPlayer.aNodeList_114.getNext(-1449958655)) {
            MapIcon var6 = Class248_Sub1.mapIconUnpacker.loadIcon(781228131 * var5.aClass240_Sub12_7478.anInt_6801);
            if(var5.method4884(var0, var1, 1561649159)) {
               if(var6.options != null) {
                  if(null != var6.options[4]) {
                     Class343.genAndAddOption(var6.options[4], var6.optionTitle, -1, 1012, -1, (long)(781228131 * var5.aClass240_Sub12_7478.anInt_6801), var6.anInt_10004 * 1297612527, 0, true, false, (long)(781228131 * var5.aClass240_Sub12_7478.anInt_6801), false, (byte)117);
                  }

                  if(var6.options[3] != null) {
                     Class343.genAndAddOption(var6.options[3], var6.optionTitle, -1, 1011, -1, (long)(781228131 * var5.aClass240_Sub12_7478.anInt_6801), var6.anInt_10004 * 1297612527, 0, true, false, (long)(var5.aClass240_Sub12_7478.anInt_6801 * 781228131), false, (byte)73);
                  }

                  if(null != var6.options[2]) {
                     Class343.genAndAddOption(var6.options[2], var6.optionTitle, -1, 1010, -1, (long)(781228131 * var5.aClass240_Sub12_7478.anInt_6801), var6.anInt_10004 * 1297612527, 0, true, false, (long)(var5.aClass240_Sub12_7478.anInt_6801 * 781228131), false, (byte)38);
                  }

                  if(null != var6.options[1]) {
                     Class343.genAndAddOption(var6.options[1], var6.optionTitle, -1, 1009, -1, (long)(var5.aClass240_Sub12_7478.anInt_6801 * 781228131), var6.anInt_10004 * 1297612527, 0, true, false, (long)(781228131 * var5.aClass240_Sub12_7478.anInt_6801), false, (byte)79);
                  }

                  if(null != var6.options[0]) {
                     Class343.genAndAddOption(var6.options[0], var6.optionTitle, -1, 1008, -1, (long)(781228131 * var5.aClass240_Sub12_7478.anInt_6801), 1297612527 * var6.anInt_10004, 0, true, false, (long)(var5.aClass240_Sub12_7478.anInt_6801 * 781228131), false, (byte)41);
                  }
               }

               if(!var5.aClass240_Sub12_7478.aBoolean_6806) {
                  var5.aClass240_Sub12_7478.aBoolean_6806 = true;
                  Class203.method2587(Class434.aClass434_8351, 781228131 * var5.aClass240_Sub12_7478.anInt_6801, var6.anInt_10004 * 1297612527, 712103244);
               }

               if(var5.aClass240_Sub12_7478.aBoolean_6806) {
                  Class203.method2587(Class434.aClass434_8365, var5.aClass240_Sub12_7478.anInt_6801 * 781228131, var6.anInt_10004 * 1297612527, -362553049);
               }
            } else if(var5.aClass240_Sub12_7478.aBoolean_6806) {
               var5.aClass240_Sub12_7478.aBoolean_6806 = false;
               Class203.method2587(Class434.aClass434_8349, 781228131 * var5.aClass240_Sub12_7478.anInt_6801, var6.anInt_10004 * 1297612527, -164890804);
            }
         }
      }

   }
}
