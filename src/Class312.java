
public class Class312 {

   NodeArrayList aNodeArrayList_6096 = new NodeArrayList(256);
   CacheDataUnpacker aCacheUnpacker_6097;
   CacheDataUnpacker aCacheUnpacker_6098;
   NodeArrayList aNodeArrayList_6099 = new NodeArrayList(256);
   NodeArrayList aNodeArrayList_6100 = new NodeArrayList(256);
   public static CacheDataUnpacker aCacheUnpacker_6101;


   Class240_Sub7_Sub1_Sub1 method3879(int var1, int var2, int[] var3, int var4) {
      int var5 = var2 ^ (var1 << 4 & '\uffff' | var1 >>> 12);
      var5 |= var1 << 16;
      long var6 = (long)var5;
      Class240_Sub7_Sub1_Sub1 var8 = (Class240_Sub7_Sub1_Sub1)this.aNodeArrayList_6100.getNode(var6);
      if(null != var8) {
         return var8;
      } else if(null != var3 && var3[0] <= 0) {
         return null;
      } else {
         Class302 var9 = Class302.method3827(this.aCacheUnpacker_6097, var1, var2);
         if(var9 == null) {
            return null;
         } else {
            var8 = var9.method3825();
            this.aNodeArrayList_6100.insert(var8, var6);
            if(null != var3) {
               var3[0] -= var8.aByteArray_3081.length;
            }

            return var8;
         }
      }
   }

   Class240_Sub7_Sub1_Sub2 method3880(int var1, int var2, int[] var3, byte var4) {
      int var5 = var2 ^ (var1 << 4 & '\uffff' | var1 >>> 12);
      var5 |= var1 << 16;
      long var6 = (long)var5 ^ 4294967296L;
      Class240_Sub7_Sub1_Sub2 var8 = (Class240_Sub7_Sub1_Sub2)this.aNodeArrayList_6099.getNode(var6);
      if(null != var8) {
         return var8;
      } else if(null != var3 && var3[0] <= 0) {
         return null;
      } else {
         Class240_Sub2 var9 = (Class240_Sub2)this.aNodeArrayList_6096.getNode(var6);
         if(null == var9) {
            var9 = Class240_Sub2.method4413(this.aCacheUnpacker_6098, var1, var2);
            if(var9 == null) {
               return null;
            }

            this.aNodeArrayList_6096.insert(var9, var6);
         }

         var8 = var9.method4414();
         if(null == var8) {
            return null;
         } else {
            var9.shiftNext();
            this.aNodeArrayList_6099.insert(var8, var6);
            return var8;
         }
      }
   }

   public Class240_Sub7_Sub1_Sub1 method3881(int var1, int[] var2, byte var3) {
      if(this.aCacheUnpacker_6097.method3581((short)-28506) == 1) {
         return this.method3879(0, var1, var2, 1508518977);
      } else if(this.aCacheUnpacker_6097.method3575(var1, -1335796697) == 1) {
         return this.method3879(var1, 0, var2, 1532492965);
      } else {
         throw new RuntimeException();
      }
   }

   public Class240_Sub7_Sub1_Sub2 method3882(int var1, int[] var2, int var3) {
      if(this.aCacheUnpacker_6098.method3581((short)6671) == 1) {
         return this.method3880(0, var1, var2, (byte)-71);
      } else if(this.aCacheUnpacker_6098.method3575(var1, -2140291224) == 1) {
         return this.method3880(var1, 0, var2, (byte)-13);
      } else {
         throw new RuntimeException();
      }
   }

   public Class312(CacheDataUnpacker var1, CacheDataUnpacker var2) {
      this.aCacheUnpacker_6097 = var1;
      this.aCacheUnpacker_6098 = var2;
   }

   static final void method3883(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      AbstractKeyboardHandler.method3211(var3, var4, var0, 1450952093);
   }

   static final void method3884(RSInterfaceData var0, int var1) {
      var0.intTypeIndex -= 1462854468;
      int var2 = var0.intTypes[var0.intTypeIndex * -831324111];
      int var3 = var0.intTypes[1 + -831324111 * var0.intTypeIndex];
      int var4 = var0.intTypes[2 + -831324111 * var0.intTypeIndex];
      int var5 = var0.intTypes[var0.intTypeIndex * -831324111 + 3];
      MapPoint var6 = client.aClass296_348.getMapArea();
      Class192.method2512((var2 >> 14 & 16383) - var6.loadedMapX * 1265321541, (var2 & 16383) - var6.loadedMapY * -1996781083, var3 << 2, var4, var5, false, -1378928813);
   }

   static final void method3885(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = -978526293 * var3.scrollY;
   }
}
