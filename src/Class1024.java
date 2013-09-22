
public abstract class Class1024 {

   public static boolean method2086(byte var0) {
      return Class134.anInt_2617 * 1919337139 != 0;
   }

   static CacheFileID[] method2087(int var0) {
      return new CacheFileID[]{CacheFileID.aClass108_2018, CacheFileID.aClass108_2003, CacheFileID.aClass108_2008, CacheFileID.aClass108_2032, CacheFileID.aClass108_1996, CacheFileID.aClass108_2027, CacheFileID.aClass108_2031, CacheFileID.aClass108_2033, CacheFileID.aClass108_2014, CacheFileID.aClass108_2006, CacheFileID.aClass108_1997, CacheFileID.aClass108_1995, CacheFileID.aClass108_2030, CacheFileID.aClass108_2023, CacheFileID.aClass108_2020, CacheFileID.aClass108_2015, CacheFileID.aClass108_2004, CacheFileID.aClass108_2000, CacheFileID.aClass108_2019, CacheFileID.cache23ID, CacheFileID.aClass108_2012, CacheFileID.aClass108_2017, CacheFileID.cacheFileId8, CacheFileID.aClass108_2022, CacheFileID.aClass108_1998, CacheFileID.aClass108_2013, CacheFileID.aClass108_2001, CacheFileID.aClass108_2028, CacheFileID.aClass108_2029, CacheFileID.aClass108_2016, CacheFileID.aClass108_2011, CacheFileID.aClass108_2026, CacheFileID.aClass108_2007, CacheFileID.aClass108_2025, CacheFileID.aClass108_2009, CacheFileID.aClass108_2005, CacheFileID.aClass108_2002, CacheFileID.aClass108_2010, CacheFileID.aClass108_1994, CacheFileID.aClass108_2021};
   }

   static final void method2088(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class215.method2696(var3, var4, var0, (short)16383);
   }

   static final void method2089(RSInterfaceData var0, byte var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      Class555.method6145(var3, var4, var0, 634530542);
   }

   static final void method2090(ByteArrayDataNode_Sub1 var0, int var1) {
      var0.method294((byte)11);
      int var2 = -719726693 * client.anInt_438;
      Player var3 = Class521.myPlayer = client.aPlayerArray[var2] = new Player(client.aClass296_348.getWorldObjects());
      var3.index = -1106794769 * var2;
      int var4 = var0.method291(30, 1832157798);
      byte var5 = (byte)(var4 >> 28);
      int var6 = var4 >> 14 & 16383;
      int var7 = var4 & 16383;
      MapPoint var8 = client.aClass296_348.getMapArea();
      var3.tilePosArrayX[0] = var6 - var8.loadedMapX * 1265321541;
      var3.tilePosArrayY[0] = var7 - -1996781083 * var8.loadedMapY;
      var3.setPosition((float)((var3.tilePosArrayX[0] << 9) + (var3.method3257() << 8)), var3.method6202().gameCoord.floatY, (float)((var3.tilePosArrayY[0] << 9) + (var3.method3257() << 8)));
      CacheFileID.anInt_2036 = (var3.plane = var3.aByte_6942 = var5) * 1640210089;
      if(client.aClass296_348.method3753().method3646(var3.tilePosArrayX[0], var3.tilePosArrayY[0], (byte)0)) {
         ++var3.aByte_6942;
      }

      if(Class15.aClass240_Sub8Array_126[var2] != null) {
         var3.method991(Class15.aClass240_Sub8Array_126[var2], 1448617386);
      }

      Class15.availablePlayers = 0;
      Class15.playersIndices[(Class15.availablePlayers += -194487337) * -688404505 - 1] = var2;
      Class15.aByteArray_121[var2] = 0;
      Class15.anInt_125 = 0;

      for(int var9 = 1; var9 < 2048; ++var9) {
         if(var9 != var2) {
            int var10 = var0.method291(18, 1832157798);
            int var11 = var10 >> 16;
            int var12 = var10 >> 8 & 255;
            int var13 = var10 & 255;
            Class21 var14 = Class15.aClass21Array_130[var9] = new Class21();
            var14.anInt_194 = ((var11 << 28) + (var12 << 14) + var13) * -1789120471;
            var14.rotation = 0;
            var14.anInt_192 = 420881083;
            var14.aBoolean_195 = false;
            var14.aBoolean_196 = false;
            Class15.anIntArray_129[(Class15.anInt_125 += 742708609) * 527002241 - 1] = var9;
            Class15.aByteArray_121[var9] = 0;
         }
      }

      var0.method292(1836249180);
   }

   static void method2091(RSInterfaceData var0, int var1) {
      Class559 var2 = HintMarker.aClass583_3709.method6327(var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111], 1353376048);
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = null == var2.anIntArray_9572?0:var2.anIntArray_9572.length;
   }
}
