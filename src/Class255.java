
public class Class255 {

   final CacheDataUnpacker aCacheUnpacker_4404;
   public static final Class263 aClass263_4405 = new Class263();
   final CacheNodeArrayList aClass627_4406 = new CacheNodeArrayList(64);
   final Class592 aClass592_4407;
   public static Sprite aClass170_4408;


   public void method3342(int var1) {
      CacheNodeArrayList var2 = this.aClass627_4406;
      synchronized(this.aClass627_4406) {
         this.aClass627_4406.method6669(-1574919720);
      }
   }

   public Class263 method3343(int var1, int var2) {
      CacheNodeArrayList var3 = this.aClass627_4406;
      Class263 var4;
      synchronized(this.aClass627_4406) {
         var4 = (Class263)this.aClass627_4406.getObject((long)var1);
      }

      if(var4 != null) {
         return var4;
      } else {
         CacheDataUnpacker var5 = this.aCacheUnpacker_4404;
         byte[] var12;
         synchronized(this.aCacheUnpacker_4404) {
            var12 = this.aCacheUnpacker_4404.getDataBytes(Class124.aClass124_2308.anInt_2347 * -851327023, var1, -894856529);
         }

         var4 = new Class263();
         var4.aClass255_4574 = this;
         if(var12 != null) {
            var4.method3500(new ByteArrayDataNode(var12), 1582131301);
         }

         CacheNodeArrayList var11 = this.aClass627_4406;
         synchronized(this.aClass627_4406) {
            this.aClass627_4406.insert(var4, (long)var1);
            return var4;
         }
      }
   }

   public void method3344(int var1, int var2) {
      CacheNodeArrayList var3 = this.aClass627_4406;
      synchronized(this.aClass627_4406) {
         this.aClass627_4406.method6677(var1, -1615322460);
      }
   }

   public void method3345(byte var1) {
      CacheNodeArrayList var2 = this.aClass627_4406;
      synchronized(this.aClass627_4406) {
         this.aClass627_4406.method6665((byte)5);
      }
   }

   public Class255(GamePack var1, LanguagePack var2, CacheDataUnpacker var3, Class592 var4) {
      this.aCacheUnpacker_4404 = var3;
      this.aCacheUnpacker_4404.method3575(Class124.aClass124_2308.anInt_2347 * -851327023, -1482915459);
      this.aClass592_4407 = var4;
   }

   static final void method3346(RSInterfaceData var0, int var1) {
      var0.longTypeIndex -= 2117648622;
      if(var0.aLongArray_9519[973044039 * var0.longTypeIndex] != var0.aLongArray_9519[1 + 973044039 * var0.longTypeIndex]) {
         var0.anInt_9510 += var0.anIntArray_9518[var0.anInt_9510 * -1756266293] * -1856838429;
      }

   }

   static final void method3347(RSInterfaceData var0, int var1) {
      var0.intTypeIndex -= -2124084621;
      int var2 = var0.intTypes[-831324111 * var0.intTypeIndex];
      int var3 = var0.intTypes[1 + var0.intTypeIndex * -831324111];
      int var4 = var0.intTypes[2 + -831324111 * var0.intTypeIndex];
      Class598.method6476(9, var2 << 16 | var3, var4, "", -1898494081);
   }

   public static byte[] method3348(byte[] var0, int var1, int var2, int var3) {
      byte[] var4;
      if(var1 > 0) {
         var4 = new byte[var2];

         for(int var5 = 0; var5 < var2; ++var5) {
            var4[var5] = var0[var1 + var5];
         }
      } else {
         var4 = var0;
      }

      Class493 var7 = new Class493();
      var7.method5765((short)-12176);
      var7.method5767(var4, (long)(var2 * 8));
      byte[] var6 = new byte[64];
      var7.method5768(var6, 0, (byte)64);
      return var6;
   }

   static boolean method3349(short var0) {
      boolean var1 = true;
      if(null == Class481.aClass106_8763) {
         if(Class301.mmUnpacker.hasData(-1899399771 * Class206.anInt_3565, 94855997)) {
            Class481.aClass106_8763 = ImageUtils.method1794(Class301.mmUnpacker, -1899399771 * Class206.anInt_3565);
         } else {
            var1 = false;
         }
      }

      if(Class87.aClass106_1770 == null) {
         if(Class301.mmUnpacker.hasData(-166023923 * Class206.anInt_3563, -1285363323)) {
            Class87.aClass106_1770 = ImageUtils.method1794(Class301.mmUnpacker, -166023923 * Class206.anInt_3563);
         } else {
            var1 = false;
         }
      }

      if(null == Class206.aClass106_3557) {
         if(Class301.mmUnpacker.hasData(Class206.anInt_3564 * -544132235, 1231040341)) {
            Class206.aClass106_3557 = ImageUtils.method1794(Class301.mmUnpacker, -544132235 * Class206.anInt_3564);
         } else {
            var1 = false;
         }
      }

      if(null == Class207.aRSFont_3603) {
         if(Class5.aCacheUnpacker_31.hasData(Class104_Sub22.anInt_10740 * -1183336909, -171121424)) {
            Class207.aRSFont_3603 = Class105.method1356(Class5.aCacheUnpacker_31, Class104_Sub22.anInt_10740 * -1183336909, 1223225512);
         } else {
            var1 = false;
         }
      }

      if(Class1.aClass106_Sub2Array_15 == null) {
         if(Class301.mmUnpacker.hasData(Class104_Sub22.anInt_10740 * -1183336909, 517391820)) {
            Class1.aClass106_Sub2Array_15 = (ImageData[])((ImageData[])ImageUtils.method1796(Class301.mmUnpacker, -1183336909 * Class104_Sub22.anInt_10740));
         } else {
            var1 = false;
         }
      }

      return var1;
   }

   public static final void method3350(int var0) {
      ConnectionHandler var1 = Class32.method230(1256516041);
      Class240_Sub27 var2 = Class47_Sub1.method3496(Class326.aClass326_6241, var1.aClass528_3433, 1917447504);
      var2.aClass240_Sub8_Sub1_7370.putByte(0, -421680273);
      var1.addPacket(var2, 1310314058);
   }

   static final void method3351(RSInterfaceData var0, byte var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = null != Class97.aClass178_1926?1:0;
   }
}
