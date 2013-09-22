
public class Class86 {

   public final int anInt_1740;
   public int anInt_1741;
   public Class86 aClass86_1742;
   public int anInt_1743;
   public final int anInt_1744;
   public final int anInt_1745;
   public final int anInt_1746;
   public int anInt_1747;
   public int anInt_1748;
   public int anInt_1749;
   public int anInt_1750;
   public int anInt_1751;
   public int anInt_1752;
   public int anInt_1753;
   public final int anInt_1754;
   final byte aByte_1755;


   public Class411 method1124(int var1) {
      return Class110.method1411(this.anInt_1746 * 87629913, 952446448);
   }

   Class86(int var1, int var2, int var3, int var4, int var5, byte var6) {
      this.anInt_1746 = -1590417431 * var1;
      this.anInt_1754 = 1311008521 * var2;
      this.anInt_1740 = 1764639773 * var3;
      this.anInt_1744 = -1084285575 * var4;
      this.anInt_1745 = var5 * 1936715319;
      this.aByte_1755 = var6;
   }

   Class86 method1125(int var1, int var2, int var3, int var4, int var5) {
      return new Class86(87629913 * this.anInt_1746, var1, var2, var3, var4, this.aByte_1755);
   }

   public static void setMid(int var0) {
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub24_7302, 2, -640894399);
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub24_7297, 2, 1201479653);
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub18_7280, 1, 2108122961);
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub1_7295, 1, -352802783);
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.idleAnimations, 1, 1603926239);
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub23_7293, 1, 1064221703);
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub21_7306, 1, 4633666);
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub17_7299, 1, 1498813505);
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub32_7303, 1, 1212411546);
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub26_7308, 1, 883984181);
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub22_7310, 0, 1585228156);
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub31_7321, 1, 1145815539);
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub27_7315, 0, 763137202);
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub27_7288, 0, -297260657);
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.particlesSetting, 1, 852254854);
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub7_7291, 746264091 * Class40.aClass40_878.anInt_873, -527442819);
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub16_7301, 0, 1277784076);
      if(null != Class286.gameRenderer && Class286.gameRenderer.supportsTexture() && Class286.gameRenderer.method1989()) {
         Class286.gameRenderer.method1990();
      }

      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub6_7305, 1, 1287121387);
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub10_7292, 1, 2109827967);
      Class209.method2639((byte)-40);
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub3_7307, 1, 1595874323);
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub30_7314, 3, 1945953306);
      Class481.method5706(-834672780);
      client.aClass296_348.method3754(-649268265).method6383((byte)-121);
      client.aBoolean_311 = true;
   }

   public static void method1127(boolean var0, boolean var1, byte var2) {
      if(var0) {
         Class561.anInt_9586 += -833651027;
         Class33.method242((short)7296);
      }

      if(var1) {
         Class561.anInt_9584 += 1705301153;
         Class7.method41((byte)0);
      }

   }

   static final void method1128(RSInterfaceData var0, byte var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      CacheNodeArrayList.method6679(var3, var4, var0, 1341881234);
   }

   public static String method1129(String var0, int var1) {
      int var2 = var0.length();
      int var3 = 0;

      for(int var4 = 0; var4 < var2; ++var4) {
         char var5 = var0.charAt(var4);
         if(var5 == 60 || var5 == 62) {
            var3 += 3;
         }
      }

      StringBuilder var7 = new StringBuilder(var2 + var3);

      for(int var8 = 0; var8 < var2; ++var8) {
         char var6 = var0.charAt(var8);
         if(var6 == 60) {
            var7.append("<lt>");
         } else if(var6 == 62) {
            var7.append("<gt>");
         } else {
            var7.append(var6);
         }
      }

      return var7.toString();
   }

   static final void method1130(RSCharacter var0, int var1) {
      StanceAnimation idleAnimation = var0.stance;
      if(idleAnimation.isAnimating(1642812846) && idleAnimation.method5883(1, -1074668392) && idleAnimation.method5887(-2019528399)) {
         if(idleAnimation.isStationary) {
            idleAnimation.animate(var0.method3261((short)21493).method3502((byte)-22), false, true, -711591167);
            idleAnimation.isStationary = idleAnimation.isAnimating(1267887319);
         }

         idleAnimation.method5881((byte)115);
      }

      for(int var3 = 0; var3 < var0.aClass322Array_4319.length; ++var3) {
         if(-1 != -1769281411 * var0.aClass322Array_4319[var3].animationID) {
            Animator var4 = var0.aClass322Array_4319[var3].anime;
            if(var4.method5877((short)27766)) {
               Class567 var5 = Class75.aClass558_1422.method6164(-1769281411 * var0.aClass322Array_4319[var3].animationID, (byte)76);
               Animation var6 = var4.getAnimation(1349327017);
               if(var5.aBoolean_9630) {
                  if(3 == var6.anInt_10115 * -2073113599) {
                     if(992560711 * var0.anInt_4345 > 0 && var0.anInt_4321 * -1865071747 <= -1025618511 * client.timer && var0.anInt_4317 * 2141686191 < client.timer * -1025618511) {
                        var4.animate(-1, 1593151072);
                        var0.aClass322Array_4319[var3].animationID = -1431556309;
                        continue;
                     }
                  } else if(1 == var6.anInt_10115 * -2073113599 && 992560711 * var0.anInt_4345 > 0 && var0.anInt_4321 * -1865071747 <= -1025618511 * client.timer && var0.anInt_4317 * 2141686191 < -1025618511 * client.timer) {
                     continue;
                  }
               }
            }

            if(var4.method5883(1, 1505011445) && var4.method5887(-57736419)) {
               var4.animate(-1, 1593151072);
               var0.aClass322Array_4319[var3].animationID = -1431556309;
            }
         }
      }

      Animator var7 = var0.animation;
      if(var7.isAnimating(1703676282)) {
         label84: {
            Animation var8 = var7.getAnimation(-391381370);
            if(-2073113599 * var8.anInt_10115 == 3) {
               if(992560711 * var0.anInt_4345 > 0 && var0.anInt_4321 * -1865071747 <= client.timer * -1025618511 && var0.anInt_4317 * 2141686191 < -1025618511 * client.timer) {
                  var0.animationQueue = null;
                  var7.animate(-1, 1593151072);
                  break label84;
               }
            } else if(1 == var8.anInt_10115 * -2073113599) {
               if(var0.anInt_4345 * 992560711 > 0 && var0.anInt_4321 * -1865071747 <= client.timer * -1025618511 && 2141686191 * var0.anInt_4317 < client.timer * -1025618511) {
                  var7.method5879(1, (byte)103);
                  break label84;
               }

               var7.method5879(0, (byte)56);
            }

            if(var7.method5883(1, 981480386) && var7.method5887(-729660868)) {
               var0.animationQueue = null;
               var7.animate(-1, 1593151072);
            }
         }
      }

      for(int var9 = 0; var9 < var0.emotesPossible.length; ++var9) {
         Class507_Sub1_Sub1 var10 = var0.emotesPossible[var9];
         if(null != var10) {
            if(var10.anInt_3298 * 858307945 > 0) {
               var10.anInt_3298 -= 1667474137;
            } else if(var10.method5883(1, -989867550) && var10.method5887(-859137946)) {
               var0.emotesPossible[var9] = null;
            }
         }
      }

   }

   static boolean method1131(int var0, int var1) {
      return var0 >= Class495.aClass495_9044.anInt_9062 * -1965975883 && var0 <= Class495.aClass495_9048.anInt_9062 * -1965975883;
   }

   public static void method1132(int var0, byte var1) {
      Class240_Sub22_Sub5 var2 = Class65_Sub1_Sub2.method866(4, (long)var0);
      var2.method597((byte)0);
   }

   public static void method1133(int var0) {
      RSInterface.interfaceGroups = new RSInterfaceGroup[Class409_Sub1_Sub1.interfaceUnpacker.method3581((short)-7026)];
      Class527.loadedInterfaces = new boolean[Class409_Sub1_Sub1.interfaceUnpacker.method3581((short)-29039)];
   }
}
