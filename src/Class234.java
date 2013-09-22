import java.io.File;

public class Class234 {

   int anInt_4004 = -626201213;
   static final int anInt_4005 = 70;
   int anInt_4006 = -192102829;
   public int anInt_4007 = -1235669299;
   Class251 aClass251_4008;
   public int anInt_4009 = 1165229245;
   public int anInt_4010 = -793350978;
   int anInt_4011 = -2090024997;
   public int anInt_4012 = 1716649393;
   int anInt_4013 = 940889925;
   public int anInt_4014 = 549043051;


   void method3005(ByteArrayDataNode var1, int var2, int var3) {
      if(1 == var2) {
         var1.readShort(864584689);
      } else if(2 == var2) {
         this.anInt_4009 = var1.readByte(1986493094) * -1932376509;
      } else if(3 == var2) {
         this.anInt_4007 = var1.readByte(-117287404) * -190118861;
      } else if(4 == var2) {
         this.anInt_4014 = 0;
      } else if(var2 == 5) {
         this.anInt_4010 = var1.readShort(1403435134) * 1706653333;
      } else if(var2 == 6) {
         var1.readByte(-260391098);
      } else if(7 == var2) {
         this.anInt_4011 = var1.method4493(-157074556) * 2090024997;
      } else if(var2 == 8) {
         this.anInt_4006 = var1.method4493(-157074556) * 192102829;
      } else if(9 == var2) {
         this.anInt_4013 = var1.method4493(-157074556) * -940889925;
      } else if(10 == var2) {
         this.anInt_4004 = var1.method4493(-157074556) * 626201213;
      } else if(11 == var2) {
         this.anInt_4014 = var1.readShort(409063615) * -549043051;
      }

   }

   public Sprite method3006(Renderer var1, byte var2) {
      if(this.anInt_4013 * -413868941 < 0) {
         return this.method3010(var1, (byte)64);
      } else {
         Sprite var3 = (Sprite)this.aClass251_4008.aClass627_4363.getObject((long)(this.anInt_4013 * -413868941));
         if(var3 == null) {
            this.method3008(var1, -596388478);
            var3 = (Sprite)this.aClass251_4008.aClass627_4363.getObject((long)(-413868941 * this.anInt_4013));
         }

         return var3;
      }
   }

   public Sprite method3007(Renderer var1, int var2) {
      if(this.anInt_4004 * -1483966763 < 0) {
         return this.method3009(var1, 1768465742);
      } else {
         Sprite var3 = (Sprite)this.aClass251_4008.aClass627_4363.getObject((long)(this.anInt_4004 * -1483966763));
         if(null == var3) {
            this.method3008(var1, -304039125);
            var3 = (Sprite)this.aClass251_4008.aClass627_4363.getObject((long)(-1483966763 * this.anInt_4004));
         }

         return var3;
      }
   }

   void method3008(Renderer var1, int var2) {
      CacheDataUnpacker var3 = this.aClass251_4008.aCacheUnpacker_4362;
      AbstractImageData var4;
      if(-1933124691 * this.anInt_4011 >= 0 && this.aClass251_4008.aClass627_4363.getObject((long)(-1933124691 * this.anInt_4011)) == null && var3.hasData(-1933124691 * this.anInt_4011, 2026098610)) {
         var4 = ImageUtils.method1794(var3, this.anInt_4011 * -1933124691);
         this.aClass251_4008.aClass627_4363.insert(var1.loadSprite(var4, true), (long)(-1933124691 * this.anInt_4011));
      }

      if(-1019622875 * this.anInt_4006 >= 0 && this.aClass251_4008.aClass627_4363.getObject((long)(this.anInt_4006 * -1019622875)) == null && var3.hasData(-1019622875 * this.anInt_4006, -1552608831)) {
         var4 = ImageUtils.method1794(var3, this.anInt_4006 * -1019622875);
         this.aClass251_4008.aClass627_4363.insert(var1.loadSprite(var4, true), (long)(this.anInt_4006 * -1019622875));
      }

      if(-413868941 * this.anInt_4013 >= 0 && this.aClass251_4008.aClass627_4363.getObject((long)(this.anInt_4013 * -413868941)) == null && var3.hasData(this.anInt_4013 * -413868941, 1355382694)) {
         var4 = ImageUtils.method1794(var3, -413868941 * this.anInt_4013);
         this.aClass251_4008.aClass627_4363.insert(var1.loadSprite(var4, true), (long)(-413868941 * this.anInt_4013));
      }

      if(-1483966763 * this.anInt_4004 >= 0 && this.aClass251_4008.aClass627_4363.getObject((long)(-1483966763 * this.anInt_4004)) == null && var3.hasData(-1483966763 * this.anInt_4004, 1017744211)) {
         var4 = ImageUtils.method1794(var3, this.anInt_4004 * -1483966763);
         this.aClass251_4008.aClass627_4363.insert(var1.loadSprite(var4, true), (long)(this.anInt_4004 * -1483966763));
      }

   }

   public Sprite method3009(Renderer var1, int var2) {
      if(this.anInt_4006 * -1019622875 < 0) {
         return null;
      } else {
         Sprite var3 = (Sprite)this.aClass251_4008.aClass627_4363.getObject((long)(this.anInt_4006 * -1019622875));
         if(null == var3) {
            this.method3008(var1, 306183324);
            var3 = (Sprite)this.aClass251_4008.aClass627_4363.getObject((long)(this.anInt_4006 * -1019622875));
         }

         return var3;
      }
   }

   public Sprite method3010(Renderer var1, byte var2) {
      if(this.anInt_4011 * -1933124691 < 0) {
         return null;
      } else {
         Sprite var3 = (Sprite)this.aClass251_4008.aClass627_4363.getObject((long)(this.anInt_4011 * -1933124691));
         if(var3 == null) {
            this.method3008(var1, -1274991785);
            var3 = (Sprite)this.aClass251_4008.aClass627_4363.getObject((long)(this.anInt_4011 * -1933124691));
         }

         return var3;
      }
   }

   void method3011(ByteArrayDataNode var1, byte var2) {
      while(true) {
         int var3 = var1.readByte(2025293953);
         if(0 == var3) {
            return;
         }

         this.method3005(var1, var3, -479333016);
      }
   }

   static final void method3012(RSInterfaceData var0, int var1) {
      RSInterface var2 = RSServerQueue.getInterface(var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111], (byte)105);
      var2.aClass132Array_2579 = null;
      var2.children = null;
      Class110_Sub1.method3149(var2, -1145198837);
   }

   static final void method3013(RSInterface var0, RSInterfaceGroup var1, boolean var2, int var3, RSInterfaceData var4, int var5) {
      var4.intTypeIndex -= -1416056414;
      int var6 = var4.intTypes[var4.intTypeIndex * -831324111];
      int var7 = var4.intTypes[-831324111 * var4.intTypeIndex + 1];
      if(-1 == var0.anInt_2428 * -1001687885 && !var1.aBoolean_2054) {
         Class212_Sub1.method5506(var0.cacheID * 1278853609, -2138989747);
         Class240_Sub22_Sub17.method5456(1278853609 * var0.cacheID, 313534009);
         ConnectionUpdate.method81(var0.cacheID * 1278853609, (byte)-121);
      }

      if(var6 == -1) {
         var0.anInt_2469 = -104478841;
         var0.anInt_2416 = -795082499;
         var0.itemID = 418089849;
      } else {
         var0.itemID = -418089849 * var6;
         var0.itemAmount = var7 * -1807945147;
         var0.isWorn = var2;
         ObjectDescriptor var8 = Class592.cacheObjectLoader.getObjectDescriptor(var6);
         var0.anInt_2475 = -1262139997 * var8.rotation;
         var0.anInt_2476 = var8.anInt_8488 * 1900542135;
         var0.anInt_2522 = -1255018121 * var8.anInt_8464;
         var0.anInt_2473 = -896956875 * var8.anInt_8447;
         var0.anInt_2569 = 1411418417 * var8.anInt_8453;
         var0.anInt_2486 = -1483841125 * var8.anInt_8461;
         var0.anInt_2564 = 2120642063 * var3;
         if(-1386908629 * var0.anInt_2415 > 0) {
            var0.anInt_2486 = var0.anInt_2486 * -516224864 / (-1386908629 * var0.anInt_2415) * 1009220237;
         } else if(1303835095 * var0.anInt_2436 > 0) {
            var0.anInt_2486 = 1009220237 * (var0.anInt_2486 * -516224864 / (1303835095 * var0.anInt_2436));
         }

      }
   }

   static final void method3014(RSInterfaceData var0, int var1) {
      var0.intTypeIndex -= -1416056414;
      int var2 = var0.intTypes[var0.intTypeIndex * -831324111];
      int var3 = var0.intTypes[1 + var0.intTypeIndex * -831324111];
      Class476 var4 = Class240_Sub1.aClass465_6506.method5610(var3, -626284415);
      if(var4.method5681(-2077313726)) {
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = Class88.animeUnpacker.loadAnimation(var2).getName(var3, var4.aString_8738, -1986200413);
      } else {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class88.animeUnpacker.loadAnimation(var2).method6726(var3, -80630797 * var4.anInt_8739, -1691176446);
      }

   }

   static void setRootCacheFile(File var0, byte var1) {
      Class223.aFile_3824 = var0;
      if(!Class223.aFile_3824.exists()) {
         throw new RuntimeException("");
      } else {
         Class223.cacheFileExists = true;
      }
   }

   public static int method3016(int var0, byte var1) {
      int var2 = var0 >>> 1;
      var2 |= var2 >>> 1;
      var2 |= var2 >>> 2;
      var2 |= var2 >>> 4;
      var2 |= var2 >>> 8;
      var2 |= var2 >>> 16;
      return var0 & ~var2;
   }

   static final void method3017(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      Class134.method1787(var3, var4, var0, -1093167655);
   }
}
