
public class Class36 implements Class70 {

   final CacheDataUnpacker aCacheUnpacker_847;
   final Class399 aClass399_848;
   final CacheDataUnpacker aCacheUnpacker_849;
   FontRenderer aTextRenderer_850;
   public static int anInt_851;


   public void method812(short var1) {
      RSFont var2 = Class105.method1356(this.aCacheUnpacker_849, 1869528733 * this.aClass399_848.anInt_7606, 1223225512);
      this.aTextRenderer_850 = Class286.gameRenderer.method1935(var2, (ImageData[])((ImageData[])ImageUtils.method1796(this.aCacheUnpacker_847, 1869528733 * this.aClass399_848.anInt_7606)), true);
   }

   public boolean method811(byte var1) {
      boolean var2 = true;
      if(!this.aCacheUnpacker_847.hasData(1869528733 * this.aClass399_848.anInt_7606, -1498225674)) {
         var2 = false;
      }

      if(!this.aCacheUnpacker_849.hasData(this.aClass399_848.anInt_7606 * 1869528733, 889920859)) {
         var2 = false;
      }

      return var2;
   }

   Class36(CacheDataUnpacker var1, CacheDataUnpacker var2, Class399 var3) {
      this.aClass399_848 = var3;
      this.aCacheUnpacker_847 = var1;
      this.aCacheUnpacker_849 = var2;
   }

   public void method813(boolean var1, int var2) {
      if(var1) {
         int var3 = this.aClass399_848.aClass419_7602.method5215(this.aClass399_848.anInt_7596 * -1957608797, client.anInt_343 * 688709465, (byte)-99) + 913550889 * this.aClass399_848.anInt_7599;
         int var4 = this.aClass399_848.aClass412_7598.method5106(this.aClass399_848.anInt_7605 * 1861349075, 759607001 * client.anInt_435, 2008413529) + this.aClass399_848.anInt_7601 * 1807760429;
         this.aTextRenderer_850.method1078(this.aClass399_848.aString_7597, var3, var4, -1957608797 * this.aClass399_848.anInt_7596, 1861349075 * this.aClass399_848.anInt_7605, 927591393 * this.aClass399_848.anInt_7607, this.aClass399_848.anInt_7608 * -478635783, -1539332209 * this.aClass399_848.anInt_7604, -1272192413 * this.aClass399_848.anInt_7600, 1033537485 * this.aClass399_848.anInt_7603, (Sprite[])null, (int[])null, (Class1024)null, 0, 0, 1329866743);
      }

   }

   static final void method299(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class240_Sub47.visibleTilesX * 617015539;
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = -341755025 * Class129.visibleTilesY;
   }

   static final void method300(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class104_Sub21.renderSettings.aClass540_Sub3_7307.method1430((short)-8200)?1:0;
   }

   public static float method301(Class342 var0, byte var1) {
      GameCoord var2 = GameCoord.createCoord(0.0F, 0.0F, 1.0F);
      var2.method4328(var0);
      double var3 = Math.atan2((double)var2.floatX, (double)var2.floatZ);
      var2.store();
      if(var3 < 0.0D) {
         var3 = 3.141592653589793D + 3.141592653589793D + var3;
      }

      return (float)var3;
   }

   public static Class459 method302(ObjectDescriptor var0, ByteArrayDataNode var1, int var2) {
      Class459 var3 = new Class459(var0);
      int var4 = var1.readByte(1033712381);
      boolean var5 = (var4 & 1) != 0;
      boolean var6 = (var4 & 2) != 0;
      boolean var7 = (var4 & 4) != 0;
      boolean var8 = (var4 & 8) != 0;
      if(var5) {
         var3.anIntArray_8584[0] = var1.method4493(-157074556);
         var3.anIntArray_8581[0] = var1.method4493(-157074556);
         if(-615229187 * var0.anInt_8451 != -1 || var0.anInt_8449 * -1090233185 != -1) {
            var3.anIntArray_8584[1] = var1.method4493(-157074556);
            var3.anIntArray_8581[1] = var1.method4493(-157074556);
         }

         if(var0.anInt_8460 * 1299696045 != -1 || 102701445 * var0.anInt_8483 != -1) {
            var3.anIntArray_8584[2] = var1.method4493(-157074556);
            var3.anIntArray_8581[2] = var1.method4493(-157074556);
         }
      }

      if(var6) {
         var3.anIntArray_8582[0] = var1.method4493(-157074556);
         var3.anIntArray_8583[0] = var1.method4493(-157074556);
         if(1009167343 * var0.anInt_8459 != -1 || -1 != -730376201 * var0.anInt_8493) {
            var3.anIntArray_8582[1] = var1.method4493(-157074556);
            var3.anIntArray_8583[1] = var1.method4493(-157074556);
         }
      }

      int var9;
      int[] var10;
      int var11;
      if(var7) {
         var9 = var1.readShort(328700566);
         var10 = new int[]{var9 & 15, var9 >> 4 & 15, var9 >> 8 & 15, var9 >> 12 & 15};

         for(var11 = 0; var11 < 4; ++var11) {
            if(var10[var11] != 15) {
               var3.aShortArray_8578[var10[var11]] = (short)var1.readShort(172042810);
            }
         }
      }

      if(var8) {
         var9 = var1.readByte(-837434984);
         var10 = new int[]{var9 & 15, var9 >> 4 & 15};

         for(var11 = 0; var11 < 2; ++var11) {
            if(15 != var10[var11]) {
               var3.aShortArray_8576[var10[var11]] = (short)var1.readShort(110265918);
            }
         }
      }

      return var3;
   }

   static final void method303(RSInterfaceData var0, int var1) {
      if(Class223.captureKeyboardList.method3208(82, 1953407658)) {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 1;
      } else {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 0;
      }

   }

   public static Class619 method304(ByteArrayDataNode var0, int var1) {
      int var2 = var0.readByte(722539232);
      int[] var3 = new int[var2];

      for(int var4 = 0; var4 < var2; ++var4) {
         var3[var4] = var0.readByte(932062068);
      }

      return new Class619(var3);
   }

   static final void method305(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 1887083827 * client.aClass301Array_286[var2].anInt_6001;
   }
}
