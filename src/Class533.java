
public class Class533 implements Class551 {

   static final Class533 aClass533_9338 = new Class533(9);
   public static final Class533 aClass533_9339 = new Class533(-3);
   static final Class533 aClass533_9340 = new Class533(2);
   public static final Class533 aClass533_9341 = new Class533(3);
   static final Class533 aClass533_9342 = new Class533(7);
   static final Class533 aClass533_9343 = new Class533(5);
   static final Class533 aClass533_9344 = new Class533(34);
   public static final Class533 aClass533_9345 = new Class533(-2);
   static final Class533 aClass533_9346 = new Class533(8);
   static final Class533 aClass533_9347 = new Class533(20);
   static final Class533 aClass533_9348 = new Class533(10);
   static final Class533 aClass533_9349 = new Class533(6);
   static final Class533 aClass533_9350 = new Class533(21);
   static final Class533 aClass533_9351 = new Class533(30);
   static final Class533 aClass533_9352 = new Class533(32);
   final int anInt_9353;
   static final Class533 aClass533_9354 = new Class533(33);
   static final Class533 aClass533_9355 = new Class533(31);
   static final Class533 aClass533_9356 = new Class533(38);
   static final Class533 aClass533_9357 = new Class533(4);
   static int anInt_9358;


   public int getLanguageID(int var1) {
      return this.anInt_9353 * -151582913;
   }

   Class533(int var1) {
      this.anInt_9353 = -1388287809 * var1;
   }

   static String method6037(int var0, int var1, boolean var2, int var3) {
      if(var1 >= 2 && var1 <= 36) {
         if(var2 && var0 >= 0) {
            int var4 = 2;

            for(int var5 = var0 / var1; 0 != var5; ++var4) {
               var5 /= var1;
            }

            char[] var6 = new char[var4];
            var6[0] = 43;

            for(int var7 = var4 - 1; var7 > 0; --var7) {
               int var8 = var0;
               var0 /= var1;
               int var9 = var8 - var1 * var0;
               if(var9 >= 10) {
                  var6[var7] = (char)(var9 + 87);
               } else {
                  var6[var7] = (char)(var9 + 48);
               }
            }

            return new String(var6);
         } else {
            return Integer.toString(var0, var1);
         }
      } else {
         throw new IllegalArgumentException("" + var1);
      }
   }

   static final void method6038(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      MapIcon var3 = Class126.mapIconUnpacker.loadIcon(var2);
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var3.anInt_10004 * 1297612527;
   }

   static void method6039(Class240_Sub22_Sub1 var0, int var1, int var2) {
      if(Class18.optionsClosed) {
         RSFont var3 = DamageSprite.method6530((byte)-65);
         int var4 = 0;

         int var6;
         for(OptionListNode var5 = (OptionListNode)var0.aClass494_798.method5772(-1588809921); var5 != null; var5 = (OptionListNode)var0.aClass494_798.method5771(-440370455)) {
            var6 = DamageSprite.method6534(var5, var3, (byte)16);
            if(var6 > var4) {
               var4 = var6;
            }
         }

         var4 += 8;
         int var9 = -1686791407 * var0.anInt_799 * 32251295 * Class18.anInt_144 + 21;
         ScreenCharText.anInt_6172 = ((Class18.aBoolean_172?26:22) + 32251295 * Class18.anInt_144 * var0.anInt_799 * -1686791407) * 27961155;
         var6 = 1516402115 * Class558.optionsBoxWidth + WeakReference_Sub1.optionBoxX * -1754705091;
         if(var4 + var6 > 1111410531 * Class29.canvasWidth) {
            var6 = WeakReference_Sub1.optionBoxX * -1754705091 - var4;
         }

         if(var6 < 0) {
            var6 = 0;
         }

         int var7 = Class18.aBoolean_172?1 + var3.anInt_8573 * 915612327 + 20:31;
         int var8 = 1 + 915612327 * var3.anInt_8573 + (var1 - var7);
         if(var8 + var9 > Class597.canvasHeight * -75607525) {
            var8 = Class597.canvasHeight * -75607525 - var9;
         }

         if(var8 < 0) {
            var8 = 0;
         }

         Class474.anInt_8725 = -1230039777 * var6;
         Class43.anInt_939 = var8 * 1368367963;
         Class113.anInt_2072 = 424659445 * var4;
         Class18.aClass240_Sub22_Sub1_166 = var0;
      }
   }

   static boolean method6040(ByteArrayDataNode_Sub1 var0, int var1, short var2) {
      int var3 = var0.method291(2, 1832157798);
      int var4;
      int var5;
      int var9;
      int var10;
      int var11;
      if(var3 == 0) {
         if(var0.method291(1, 1832157798) != 0) {
            method6040(var0, var1, (short)4096);
         }

         var4 = var0.method291(6, 1832157798);
         var5 = var0.method291(6, 1832157798);
         boolean var16 = var0.method291(1, 1832157798) == 1;
         if(var16) {
            Class15.anIntArray_132[(Class15.anInt_131 += -1309255717) * 1796066387 - 1] = var1;
         }

         if(client.aPlayerArray[var1] != null) {
            throw new RuntimeException();
         } else {
            Class21 var17 = Class15.aClass21Array_130[var1];
            Player var18 = client.aPlayerArray[var1] = new Player(client.aClass296_348.getWorldObjects());
            var18.index = var1 * -1106794769;
            if(Class15.aClass240_Sub8Array_126[var1] != null) {
               var18.method991(Class15.aClass240_Sub8Array_126[var1], -661530722);
            }

            var18.turnTo(var17.rotation * -1183520671, true, 945742739);
            var18.anInt_4312 = var17.anInt_192 * -1439526769;
            var9 = var17.anInt_194 * 1979608089;
            var10 = var9 >> 28;
            var11 = var9 >> 14 & 255;
            int var12 = var9 & 255;
            MapPoint var13 = client.aClass296_348.getMapArea();
            int var14 = var4 + (var11 << 6) - 1265321541 * var13.loadedMapX;
            int var15 = (var12 << 6) + var5 - var13.loadedMapY * -1996781083;
            var18.aBoolean_1458 = var17.aBoolean_195;
            var18.aBoolean_1486 = var17.aBoolean_196;
            var18.aByteArray_4303[0] = Class15.aByteArray_124[var1];
            var18.plane = var18.aByte_6942 = (byte)var10;
            if(client.aClass296_348.method3753().method3646(var14, var15, (byte)0)) {
               ++var18.aByte_6942;
            }

            var18.method1011(var14, var15, -755729368);
            var18.aBoolean_1481 = false;
            Class15.aClass21Array_130[var1] = null;
            return true;
         }
      } else if(1 == var3) {
         var4 = var0.method291(2, 1832157798);
         var5 = 1979608089 * Class15.aClass21Array_130[var1].anInt_194;
         Class15.aClass21Array_130[var1].anInt_194 = -1789120471 * (((var4 + (var5 >> 28) & 3) << 28) + (var5 & 268435455));
         return false;
      } else {
         int var6;
         int var7;
         int var8;
         if(var3 == 2) {
            var4 = var0.method291(5, 1832157798);
            var5 = var4 >> 3;
            var6 = var4 & 7;
            var7 = Class15.aClass21Array_130[var1].anInt_194 * 1979608089;
            var8 = var5 + (var7 >> 28) & 3;
            var9 = var7 >> 14 & 255;
            var10 = var7 & 255;
            if(0 == var6) {
               --var9;
               --var10;
            }

            if(1 == var6) {
               --var10;
            }

            if(2 == var6) {
               ++var9;
               --var10;
            }

            if(3 == var6) {
               --var9;
            }

            if(var6 == 4) {
               ++var9;
            }

            if(5 == var6) {
               --var9;
               ++var10;
            }

            if(6 == var6) {
               ++var10;
            }

            if(var6 == 7) {
               ++var9;
               ++var10;
            }

            Class15.aClass21Array_130[var1].anInt_194 = (var10 + (var8 << 28) + (var9 << 14)) * -1789120471;
            return false;
         } else {
            var4 = var0.method291(18, 1832157798);
            var5 = var4 >> 16;
            var6 = var4 >> 8 & 255;
            var7 = var4 & 255;
            var8 = 1979608089 * Class15.aClass21Array_130[var1].anInt_194;
            var9 = (var8 >> 28) + var5 & 3;
            var10 = var6 + (var8 >> 14) & 255;
            var11 = var8 + var7 & 255;
            Class15.aClass21Array_130[var1].anInt_194 = -1789120471 * ((var10 << 14) + (var9 << 28) + var11);
            return false;
         }
      }
   }
}
