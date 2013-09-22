
public class Class77 {

   final String aString_1454;
   final String aString_1455;
   final String aString_1456;
   public static Sprite aClass170_1457;


   Class77(String var1, String var2, String var3) {
      this.aString_1456 = var1;
      this.aString_1455 = var2;
      this.aString_1454 = var3;
   }

   public static final void method983(int var0) {
      ClientSuper.aClass228_3899.method2899(-863993467);

      int var1;
      for(var1 = 0; var1 < 32; ++var1) {
         ClientSuper.aLongArray_3908[var1] = 0L;
      }

      for(var1 = 0; var1 < 32; ++var1) {
         ClientSuper.aLongArray_3902[var1] = 0L;
      }

      Class635.anInt_10098 = 0;
   }

   static void method984(RSInterfaceData var0, int var1) {
      var0.intTypes[-831324111 * var0.intTypeIndex - 1] = HintMarker.aClass583_3709.method6327(var0.intTypes[var0.intTypeIndex * -831324111 - 1], 1972508259).method6170(Class240_Sub41_Sub3.aClass23_1024, (short)-3)?1:0;
   }

   static final void method985(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      if(var2 < 0 || var2 > 1) {
         var2 = 0;
      }

      CompProfile.method6114(var2 == 1, -314184337);
   }

   static final void method986(Class240_Sub30 var0, int var1) {
      WorldObjects var2 = client.aClass296_348.getWorldObjects();
      if(null != var2) {
         Class218 var3 = null;
         if(-2030620795 * var0.anInt_7410 == 0) {
            var3 = (Class218)var2.method3423(var0.anInt_7423 * -511987961, -1480406251 * var0.anInt_7409, -1398294791 * var0.anInt_7422, (byte)-114);
         }

         if(1 == -2030620795 * var0.anInt_7410) {
            var3 = (Class218)var2.method3425(var0.anInt_7423 * -511987961, -1480406251 * var0.anInt_7409, var0.anInt_7422 * -1398294791, -1129286531);
         }

         if(2 == var0.anInt_7410 * -2030620795) {
            var3 = (Class218)var2.method3416(-511987961 * var0.anInt_7423, -1480406251 * var0.anInt_7409, -1398294791 * var0.anInt_7422, client.aClass264_482, -831996065);
         }

         if(3 == var0.anInt_7410 * -2030620795) {
            var3 = (Class218)var2.method3428(-511987961 * var0.anInt_7423, -1480406251 * var0.anInt_7409, var0.anInt_7422 * -1398294791, 1727693150);
         }

         if(var3 != null) {
            var0.anInt_7412 = var3.method2723((byte)-93) * 220602263;
            var0.anInt_7414 = var3.method2730(849191307) * -1108679811;
            var0.anInt_7413 = var3.method2718(-201472538) * -1752855691;
         } else {
            var0.anInt_7412 = -220602263;
            var0.anInt_7414 = 0;
            var0.anInt_7413 = 0;
         }

      }
   }

   static boolean method987(Renderer var0, Class240_Sub12 var1, MapIcon var2, int var3, int var4, int var5) {
      int var6 = Integer.MAX_VALUE;
      int var7 = Integer.MIN_VALUE;
      int var8 = Integer.MAX_VALUE;
      int var9 = Integer.MIN_VALUE;
      if(null != var2.anIntArray_9989) {
         var6 = Class248_Sub1.anInt_4110 + (Class248_Sub1.anInt_4142 - Class248_Sub1.anInt_4110) * (var1.anInt_6802 * -1889789653 + var2.anInt_9991 * -1001950925 - Class248_Sub1.anInt_4127) / (Class248_Sub1.anInt_4123 - Class248_Sub1.anInt_4127);
         var7 = (-1889789653 * var1.anInt_6802 + 189282879 * var2.anInt_9993 - Class248_Sub1.anInt_4127) * (Class248_Sub1.anInt_4142 - Class248_Sub1.anInt_4110) / (Class248_Sub1.anInt_4123 - Class248_Sub1.anInt_4127) + Class248_Sub1.anInt_4110;
         var9 = Class248_Sub1.anInt_4134 - (var1.anInt_6803 * -526841819 + var2.anInt_9992 * -12505347 - Class248_Sub1.anInt_4106) * (Class248_Sub1.anInt_4134 - Class248_Sub1.anInt_4141) / (Class248_Sub1.anInt_4137 - Class248_Sub1.anInt_4106);
         var8 = Class248_Sub1.anInt_4134 - (Class248_Sub1.anInt_4134 - Class248_Sub1.anInt_4141) * (-526841819 * var1.anInt_6803 + var2.anInt_9994 * -250973399 - Class248_Sub1.anInt_4106) / (Class248_Sub1.anInt_4137 - Class248_Sub1.anInt_4106);
      }

      Sprite var10 = null;
      int var11 = 0;
      int var12 = 0;
      int var13 = 0;
      int var14 = 0;
      if(var2.anInt_9969 * 1517017943 != -1) {
         if(var1.aBoolean_6806 && -1 != var2.anInt_9967 * -135554731) {
            var10 = var2.method6597(var0, true, 1471312782);
         } else {
            var10 = var2.method6597(var0, false, -735108479);
         }

         if(var10 != null) {
            var11 = -2101621525 * var1.anInt_6805 - (var10.getFurthestX() + 1 >> 1);
            if(var11 < var6) {
               var6 = var11;
            }

            var12 = -2101621525 * var1.anInt_6805 + (var10.getFurthestX() + 1 >> 1);
            if(var12 > var7) {
               var7 = var12;
            }

            var13 = 1962545839 * var1.anInt_6800 - (var10.getFurthestY() + 1 >> 1);
            if(var13 < var8) {
               var8 = var13;
            }

            var14 = var1.anInt_6800 * 1962545839 + (var10.getFurthestY() + 1 >> 1);
            if(var14 > var9) {
               var9 = var14;
            }
         }
      }

      WorldMapText worldMapText = null;
      int var16 = 0;
      int var17 = 0;
      int var18 = 0;
      int var19 = 0;
      int var20 = 0;
      int var21 = 0;
      int var22 = 0;
      int var23 = 0;
      int var24;
      if(null != var2.iconTitle) {
         worldMapText = CacheDataUnpacker.getMapTextRenderer(var2.anInt_10002 * 1935152359, 889494416);
         if(worldMapText != null) {
            var16 = FriendPlayer.aRSFont_55.method5563(var2.iconTitle, (int[])null, Class248_Sub1.aStringArray_6451, (TextObjects[])null, (byte)1);
            var17 = -2101621525 * var1.anInt_6805 + var2.anInt_9978 * -483038179 * (Class248_Sub1.anInt_4142 - Class248_Sub1.anInt_4110) / (Class248_Sub1.anInt_4123 - Class248_Sub1.anInt_4127);
            var18 = var1.anInt_6800 * 1962545839 - 1283060009 * var2.anInt_10000 * (Class248_Sub1.anInt_4134 - Class248_Sub1.anInt_4141) / (Class248_Sub1.anInt_4137 - Class248_Sub1.anInt_4106);
            if(null == var10) {
               var18 -= worldMapText.method2533() * var16 / 2;
            } else {
               var18 -= (var10.getFurthestY() >> 1) + worldMapText.method2534() * var16;
            }

            for(var24 = 0; var24 < var16; ++var24) {
               String var25 = Class248_Sub1.aStringArray_6451[var24];
               if(var24 < var16 - 1) {
                  var25 = var25.substring(0, var25.length() - 4);
               }

               int var26 = worldMapText.getRenderedWidth(var25);
               if(var26 > var19) {
                  var19 = var26;
               }
            }

            var20 = var3 + (var17 - var19 / 2);
            if(var20 < var6) {
               var6 = var20;
            }

            var21 = var3 + var17 + var19 / 2;
            if(var21 > var7) {
               var7 = var21;
            }

            var22 = var18 + var4;
            if(var22 < var8) {
               var8 = var22;
            }

            var23 = var18 + var16 * worldMapText.method2534() + var4;
            if(var23 > var9) {
               var9 = var23;
            }
         }
      }

      if(var7 >= Class248_Sub1.anInt_4110 && var6 <= Class248_Sub1.anInt_4142 && var9 >= Class248_Sub1.anInt_4141 && var8 <= Class248_Sub1.anInt_4134) {
         Class248_Sub1.method3167(var0, var1, var2);
         if(var10 != null) {
            if(-325125283 * Class533.anInt_9358 > 0 && (Class248_Sub1.anInt_6453 * 1615039673 != -1 && 781228131 * var1.anInt_6801 == 1615039673 * Class248_Sub1.anInt_6453 || -1 != Class248_Sub1.anInt_6454 * -1536384619 && var2.anInt_10004 * 1297612527 == Class248_Sub1.anInt_6454 * -1536384619)) {
               if(Class467.anInt_8690 * -2092984369 > 50) {
                  var24 = 200 - 108998558 * Class467.anInt_8690;
               } else {
                  var24 = 108998558 * Class467.anInt_8690;
               }

               int var28 = var24 << 24 | 16776960;
               var0.method1916(-2101621525 * var1.anInt_6805, var1.anInt_6800 * 1962545839, var10.getWidth() / 2 + 7, var28, (short)256);
               var0.method1916(-2101621525 * var1.anInt_6805, var1.anInt_6800 * 1962545839, var10.getWidth() / 2 + 5, var28, (short)256);
               var0.method1916(var1.anInt_6805 * -2101621525, var1.anInt_6800 * 1962545839, var10.getWidth() / 2 + 3, var28, (short)256);
               var0.method1916(-2101621525 * var1.anInt_6805, 1962545839 * var1.anInt_6800, var10.getWidth() / 2 + 1, var28, (short)256);
               var0.method1916(-2101621525 * var1.anInt_6805, 1962545839 * var1.anInt_6800, var10.getWidth() / 2, var28, (short)256);
            }

            var10.drawAt(-2101621525 * var1.anInt_6805 - (var10.getFurthestX() >> 1), 1962545839 * var1.anInt_6800 - (var10.getFurthestY() >> 1));
         }

         if(null != var2.iconTitle && null != worldMapText) {
            Class635.method6714(var0, var1, var2, var16, var17, var18, var19, worldMapText, (byte)114);
         }

         if(1517017943 * var2.anInt_9969 != -1 || null != var2.iconTitle) {
            Class240_Sub33 var27 = new Class240_Sub33(var1);
            var27.anInt_7473 = 162300619 * var11;
            var27.anInt_7470 = 239145167 * var12;
            var27.anInt_7472 = var13 * -1806702777;
            var27.anInt_7476 = var14 * 1168931135;
            var27.anInt_7471 = var20 * 1134347737;
            var27.anInt_7474 = 179355789 * var21;
            var27.anInt_7475 = 904545943 * var22;
            var27.anInt_7477 = var23 * -1412198869;
            IgnoredPlayer.aNodeList_114.addNode(var27, (short)-8933);
         }

         return false;
      } else {
         return true;
      }
   }

   public static void method988(byte var0) {
      if(IcmpService_Sub1.anIcmpService_Sub1_7119 != null) {
         try {
            IcmpService_Sub1.anIcmpService_Sub1_7119.quit();
         } catch (Throwable var2) {
            ;
         }

         IcmpService_Sub1.anIcmpService_Sub1_7119 = null;
      }
   }

   static final void method989(RSInterfaceData var0, int var1) {
      var0.intTypeIndex -= -1416056414;
      int var2 = var0.intTypes[-831324111 * var0.intTypeIndex];
      int var3 = var0.intTypes[1 + -831324111 * var0.intTypeIndex];
      Class552 var4 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      Class240_Sub52_Sub11.method644(var4.aClass132_9524, var2, var3, 1546178485);
   }
}
