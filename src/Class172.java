import java.awt.Rectangle;

public class Class172 {

   public int anInt_3034;
   public Class172 aClass172_3035;
   public final int anInt_3036;
   public int anInt_3037;
   public ArrayViewport anArrayViewport_3038;
   public int anInt_3039;
   public final int anInt_3040;
   public static int anInt_3041;


   Class172 method2168(int var1, short var2) {
      return new Class172(this.anInt_3040 * 94661645, var1);
   }

   Class172(int var1, int var2) {
      this.anInt_3040 = var1 * -1473002811;
      this.anInt_3036 = var2 * 229041675;
   }

   public Class401 method2169(byte var1) {
      return DrawingTarget.method2203(this.anInt_3040 * 94661645, -451373688);
   }

   static final void method2170(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class563_Sub1_Sub3_Sub1.method5234(var3, var4, var0, -1858731801);
   }

   static final void method2171(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      Class300.method3809(var3, var4, var0, -138522282);
   }

   static void method2172(Class240_Sub6 var0, int var1) {
      Class22.aClass43_Sub1_198 = new Class43_Sub1(client.aClass7_546);
      Class22.aClass43_Sub1_198.method387(Class46.aClass46_971, -511130188);

      try {
         Class66_Sub2 var2 = (Class66_Sub2)Class22.aClass43_Sub1_198.method352(Class116.aClass116_2086, false, (byte)-62);
         Class508_Sub1 var3 = (Class508_Sub1)Class22.aClass43_Sub1_198.method351(Class31.aClass31_810, false, 775120310);
         var2.method2812(var0, (byte)42);
         var3.method1441(new Class342(0.0F, 0.0F, 0.0F), (byte)57);
         Class22.aClass43_Sub1_198.method359(GameCoord.createCoord(99999.0F, 99999.0F, 99999.0F), (byte)-3);
         Class22.aClass43_Sub1_198.method374(GameCoord.createCoord(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY), (byte)-17);
         Class22.aClass43_Sub1_198.method358(GameCoord.createCoord(99999.0F, 99999.0F, 99999.0F), -1747076920);
         Class22.aClass43_Sub1_198.method356(GameCoord.createCoord(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY), -693285477);
      } catch (Exception_Sub1 var4) {
         ;
      }

      Class22.anInt_200 = Class53.captureMouseList.getCaptureMouseX() * 1890424291;
      Class38.anInt_858 = Class53.captureMouseList.getCaptureMouseY() * 615464709;
      Class22.aBoolean_199 = true;
   }

   static void method2173(int var0) {
      int var1 = Class29.canvasWidth * 1111410531;
      int var2 = -75607525 * Class597.canvasHeight;
      if(-1364963335 * Class221.clientWidth < var1) {
         var1 = -1364963335 * Class221.clientWidth;
      }

      if(client.clientHeight * 772194201 < var2) {
         var2 = client.clientHeight * 772194201;
      }

      try {
         Class332.aClass332_6415.method4109(new Object[]{Integer.valueOf(var1), Integer.valueOf(var2), Integer.valueOf(Class445.method5491(1917504476)), Integer.valueOf(Class104_Sub21.renderSettings.aClass540_Sub3_7307.method1431((byte)0))}, (byte)12);
      } catch (Throwable var4) {
         ;
      }

   }

   static void method2174(RSCharacter var0, int var1, int var2, int var3, short var4) {
      Class263 var5 = var0.method3261((short)-5764);
      StanceAnimation stance = var0.stance;
      int rotation = var0.rotation * 1788884777 - 208910329 * var0.aClass6_4337.angle & 16383;
      if(Class539.aClass539_9457.aByte_9460 == var1) {
         if(0 == rotation && var0.anInt_4302 * 1067578007 <= 25) {
            if(!stance.isStationary || !var5.method3503(stance.getAnimationID(-728855158), 2128047172)) {
               stance.animate(var5.method3502((byte)8), false, true, -493679583);
               stance.isStationary = stance.isAnimating(1264020012);
            }
         } else if(var3 < 0 && -1 != var5.anInt_4558 * 31753221) {
            stance.animate(31753221 * var5.anInt_4558, false, true, -1184803702);
            stance.isStationary = false;
         } else if(var3 > 0 && 772391085 * var5.anInt_4554 != -1) {
            stance.animate(var5.anInt_4554 * 772391085, false, true, -1652049679);
            stance.isStationary = false;
         } else if(!stance.isStationary || !var5.method3503(stance.getAnimationID(-1680860527), 2026414690)) {
            stance.animate(var5.method3502((byte)39), false, true, -2033275042);
            stance.isStationary = var0.stance.isAnimating(1488659858);
         }
      } else if(-1 != var0.anInt_4312 * 1994913315 && (rotation >= 10240 || rotation <= 2048)) {
         int var8 = client.anIntArray_370[var2] - 208910329 * var0.aClass6_4337.angle & 16383;
         if(Class539.aClass539_9458.aByte_9460 == var1 && -1 != var5.anInt_4564 * -424471161) {
            if(var8 > 2048 && var8 <= 6144 && -1 != var5.anInt_4561 * -1278757251) {
               stance.animate(-1278757251 * var5.anInt_4561, false, true, -1441816666);
            } else if(var8 >= 10240 && var8 < 14336 && -1 != 1034825445 * var5.anInt_4553) {
               stance.animate(1034825445 * var5.anInt_4553, false, true, -1727772360);
            } else if(var8 > 6144 && var8 < 10240 && -1174724853 * var5.anInt_4576 != -1) {
               stance.animate(-1174724853 * var5.anInt_4576, false, true, -1934250920);
            } else {
               stance.animate(var5.anInt_4564 * -424471161, false, true, -2110843444);
            }
         } else if(var1 == Class539.aClass539_9456.aByte_9460 && -1 != 69768581 * var5.anInt_4568) {
            if(var8 > 2048 && var8 <= 6144 && 1655148515 * var5.anInt_4569 != -1) {
               stance.animate(var5.anInt_4569 * 1655148515, false, true, -628975797);
            } else if(var8 >= 10240 && var8 < 14336 && -1 != 613044169 * var5.anInt_4595) {
               stance.animate(var5.anInt_4595 * 613044169, false, true, -1760199802);
            } else if(var8 > 6144 && var8 < 10240 && 9421325 * var5.anInt_4563 != -1) {
               stance.animate(9421325 * var5.anInt_4563, false, true, -675947302);
            } else {
               stance.animate(var5.anInt_4568 * 69768581, false, true, -905885497);
            }
         } else if(var8 > 2048 && var8 <= 6144 && -1 != var5.anInt_4584 * -892055849) {
            stance.animate(-892055849 * var5.anInt_4584, false, true, -803840182);
         } else if(var8 >= 10240 && var8 < 14336 && -1 != var5.anInt_4562 * -94412747) {
            stance.animate(-94412747 * var5.anInt_4562, false, true, -1756871765);
         } else if(var8 > 6144 && var8 < 10240 && -1 != var5.anInt_4567 * 2124311195) {
            stance.animate(2124311195 * var5.anInt_4567, false, true, -694389376);
         } else {
            stance.animate(var5.anInt_4560 * -1500371099, false, true, -543756613);
         }

         stance.isStationary = false;
      } else if(rotation == 0 && 1067578007 * var0.anInt_4302 <= 25) {
         if(Class539.aClass539_9458.aByte_9460 == var1 && -1 != -424471161 * var5.anInt_4564) {
            stance.animate(-424471161 * var5.anInt_4564, false, true, -1160339247);
         } else if(var1 == Class539.aClass539_9456.aByte_9460 && -1 != var5.anInt_4568 * 69768581) {
            stance.animate(69768581 * var5.anInt_4568, false, true, -1864772325);
         } else {
            stance.animate(var5.anInt_4560 * -1500371099, false, true, -893441933);
         }

         stance.isStationary = false;
      } else {
         if(var1 == Class539.aClass539_9458.aByte_9460 && var5.anInt_4564 * -424471161 != -1) {
            if(var3 < 0 && -1 != -934758029 * var5.anInt_4580) {
               stance.animate(var5.anInt_4580 * -934758029, false, true, -1967933987);
            } else if(var3 > 0 && 703579193 * var5.anInt_4575 != -1) {
               stance.animate(var5.anInt_4575 * 703579193, false, true, -1972820366);
            } else {
               stance.animate(var5.anInt_4564 * -424471161, false, true, -1042749980);
            }
         } else if(Class539.aClass539_9456.aByte_9460 == var1 && var5.anInt_4568 * 69768581 != -1) {
            if(var3 < 0 && -1 != -868521485 * var5.anInt_4571) {
               stance.animate(-868521485 * var5.anInt_4571, false, true, -1041331339);
            } else if(var3 > 0 && -705714475 * var5.anInt_4573 != -1) {
               stance.animate(var5.anInt_4573 * -705714475, false, true, -1367574722);
            } else {
               stance.animate(var5.anInt_4568 * 69768581, false, true, -511385722);
            }
         } else if(var3 < 0 && -1 != var5.anInt_4581 * -899593181) {
            stance.animate(var5.anInt_4581 * -899593181, false, true, -1456832464);
         } else if(var3 > 0 && -1 != var5.anInt_4577 * 971798999) {
            stance.animate(var5.anInt_4577 * 971798999, false, true, -524440218);
         } else {
            stance.animate(-1500371099 * var5.anInt_4560, false, true, -1116390125);
         }

         stance.isStationary = false;
      }

   }

   static final void method2175(int var0, int var1, int var2, int var3, byte var4) {
      for(int var5 = 0; var5 < client.anInt_386 * -396228463; ++var5) {
         Rectangle var6 = client.aRectangleArray_527[var5];
         if(var6.x + var6.width > var0 && var6.x < var0 + var2 && var6.height + var6.y > var1 && var6.y < var1 + var3) {
            client.aBooleanArray_525[var5] = true;
         }
      }

   }
}
