
public class Class130 {

   final int[] anIntArray_2389;
   static final int anInt_2390 = 2;
   static final int anInt_2391 = 0;
   final int[] anIntArray_2392;


   void method1671(Class100 var1, int var2, int var3) {
      int var4 = this.anIntArray_2389[0];
      var1.method1287(var2, var4 >>> 16, var4 & '\uffff', 614392941);
      RSCharacter var5 = var1.getTarget((byte)127);
      var5.anInt_4331 = 0;

      for(int var6 = this.anIntArray_2392.length - 1; var6 >= 0; --var6) {
         int var7 = this.anIntArray_2392[var6];
         int var8 = this.anIntArray_2389[var6];
         var5.tilePosArrayX[-74820059 * var5.anInt_4331] = var8 >> 16;
         var5.tilePosArrayY[var5.anInt_4331 * -74820059] = var8 & '\uffff';
         byte var9 = Class539.aClass539_9455.aByte_9460;
         if(0 == var7) {
            var9 = Class539.aClass539_9456.aByte_9460;
         } else if(var7 == 2) {
            var9 = Class539.aClass539_9458.aByte_9460;
         }

         var5.aByteArray_4303[var5.anInt_4331 * -74820059] = var9;
         var5.anInt_4331 += -380906067;
      }

   }

   Class130(ByteArrayDataNode var1) {
      int var2 = var1.method4490((byte)0);
      this.anIntArray_2392 = new int[var2];
      this.anIntArray_2389 = new int[var2];

      for(int var3 = 0; var3 < var2; ++var3) {
         int var4 = var1.readByte(1639855891);
         this.anIntArray_2392[var3] = var4;
         int var5 = var1.readShort(-881167053);
         int var6 = var1.readShort(772768846);
         this.anIntArray_2389[var3] = var6 + (var5 << 16);
      }

   }

   public static Class419[] method1672(int var0) {
      return new Class419[]{Class419.aClass419_7953, Class419.aClass419_7954, Class419.aClass419_7955};
   }

   static final byte[] method1673(byte[] var0, int var1) {
      ByteArrayDataNode var2 = new ByteArrayDataNode(var0);
      int var3 = var2.readByte(-728077914);
      int var4 = var2.method4480(1260717178);
      if(var4 >= 0 && (-1863005635 * CacheDataUnpacker.anInt_4705 == 0 || var4 <= CacheDataUnpacker.anInt_4705 * -1863005635)) {
         if(0 == var3) {
            byte[] var10 = new byte[var4];
            var2.fillArray(var10, 0, var4);
            return var10;
         } else {
            int var5 = var2.method4480(1260717178);
            if(var5 >= 0 && (0 == -1863005635 * CacheDataUnpacker.anInt_4705 || var5 <= -1863005635 * CacheDataUnpacker.anInt_4705)) {
               byte[] var6 = new byte[var5];
               if(var3 == 1) {
                  Class518.method5955(var6, var5, var0, var4, 9);
               } else {
                  Class433 var7 = CacheDataUnpacker.aClass433_4697;
                  synchronized(CacheDataUnpacker.aClass433_4697) {
                     CacheDataUnpacker.aClass433_4697.method5415(var2, var6, 1347080216);
                  }
               }

               return var6;
            } else {
               throw new RuntimeException();
            }
         }
      } else {
         throw new RuntimeException();
      }
   }

   static void method1674(int var0) {
      if(Class48.aClass123_1020 != null && !Class48.aClass123_1020.method1566((byte)83) && Class48.aClass123_1020.method1565(834166030)) {
         Class240_Sub27 var1 = Class47_Sub1.method3496(Class326.aClass326_6222, client.gameConnectionHandler.aClass528_3433, 1917447504);
         var1.aClass240_Sub8_Sub1_7370.putIntBE(Class48.aClass123_1020.anInt_2266 * -1216432127, 2062892803);
         client.gameConnectionHandler.addPacket(var1, 1958535976);
      }

   }

   static final void method1675(RSInterfaceData var0, byte var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class104_Sub21.renderSettings.aClass540_Sub10_7292.method1654(-171040097)?1:0;
   }

   static final void method1676(int var0) {
      ClientSuper.method2888(Class286.gameRenderer, (long)(-1025618511 * client.timer));
      if(client.anInt_468 * 1854782309 != -1) {
         Class371.method4718(1854782309 * client.anInt_468, -402517789);
      }

      int var1;
      for(var1 = 0; var1 < client.anInt_386 * -396228463; ++var1) {
         client.aBooleanArray_362[var1] = client.aBooleanArray_525[var1];
         client.aBooleanArray_525[var1] = false;
      }

      client.anInt_555 = client.timer * 1816986437;
      if(client.anInt_468 * 1854782309 != -1) {
         client.anInt_386 = 0;
         Class508.method5910(-1624990161);
      }

      Class286.gameRenderer.method1967();
      LoadProgress.method4424(Class286.gameRenderer, -783279489);
      var1 = Class618.method6616(-1178969681);
      if(-1 == var1) {
         var1 = 635272015 * client.anInt_373;
      }

      if(-1 == var1) {
         var1 = client.anInt_371 * -381640343;
      }

      Class608.method6553(var1, 1311265443);
      client.anInt_384 = 0;
   }
}
