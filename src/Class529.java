
public class Class529 {

   final CacheNodeArrayList aClass627_9306 = new CacheNodeArrayList(500);
   final LanguagePack aClass526_9307;
   boolean aBoolean_9308;
   final GamePack aClass523_9309;
   final CacheDataUnpacker aCacheUnpacker_9310;
   final String[] aStringArray_9311;
   Class477 aClass477_9312 = new Class477((Object)null, (Object)null);
   final CacheDataUnpacker aCacheUnpacker_9313;
   final CacheNodeArrayList aClass627_9314 = new CacheNodeArrayList(30);
   final CacheNodeArrayList aClass627_9315 = new CacheNodeArrayList(50);
   public static final int anInt_9316 = 256;
   CacheNodeArrayList aClass627_9317 = new CacheNodeArrayList(256);
   ModelData[] aClass94Array_9318 = new ModelData[4];
   int anInt_9319;


   public void method6014(int var1) {
      CacheNodeArrayList var2 = this.aClass627_9317;
      synchronized(this.aClass627_9317) {
         this.aClass627_9317.method6669(1904784);
      }

      var2 = this.aClass627_9306;
      synchronized(this.aClass627_9306) {
         this.aClass627_9306.method6669(-1916781517);
      }

      var2 = this.aClass627_9314;
      synchronized(this.aClass627_9314) {
         this.aClass627_9314.method6669(-669893038);
      }

      var2 = this.aClass627_9315;
      synchronized(this.aClass627_9315) {
         this.aClass627_9315.method6669(-107674795);
      }

      this.aClass94Array_9318 = new ModelData[4];
      this.aClass477_9312 = new Class477((Object)null, (Object)null);
   }

   public Class534 method6015(int var1, byte var2) {
      CacheNodeArrayList var3 = this.aClass627_9317;
      Class534 var4;
      synchronized(this.aClass627_9317) {
         var4 = (Class534)this.aClass627_9317.getObject((long)var1);
      }

      if(var4 != null) {
         return var4;
      } else {
         CacheDataUnpacker var5 = this.aCacheUnpacker_9313;
         byte[] var11;
         synchronized(this.aCacheUnpacker_9313) {
            var11 = this.aCacheUnpacker_9313.getDataBytes(Class124.aClass124_2282.method1575(var1, 1710087621), Class124.aClass124_2282.method1573(var1, (byte)70), -21033494);
         }

         var4 = new Class534();
         var4.anInt_9367 = var1 * 935740395;
         var4.aClass529_9381 = this;
         var4.screenOptions = (String[])((String[])this.aStringArray_9311.clone());
         if(null != var11) {
            var4.method6041(new ByteArrayDataNode(var11), 773440449);
         }

         var4.method6043(-2035591541);
         if(var4.aBoolean_9412) {
            var4.anInt_9379 = 0;
         }

         if(!this.aBoolean_9308 && var4.aBoolean_9364) {
            var4.screenOptions = null;
            var4.anIntArray_9387 = null;
         }

         CacheNodeArrayList var12 = this.aClass627_9317;
         synchronized(this.aClass627_9317) {
            this.aClass627_9317.insert(var4, (long)var1);
            return var4;
         }
      }
   }

   public void method6016(boolean var1, byte var2) {
      if(var1 != this.aBoolean_9308) {
         this.aBoolean_9308 = var1;
         this.method6014(-1742990926);
      }
   }

   public void method6017(int var1, int var2) {
      this.anInt_9319 = var1 * 577400769;
      CacheNodeArrayList var3 = this.aClass627_9306;
      synchronized(this.aClass627_9306) {
         this.aClass627_9306.method6669(-1581434840);
      }

      var3 = this.aClass627_9314;
      synchronized(this.aClass627_9314) {
         this.aClass627_9314.method6669(912821641);
      }

      var3 = this.aClass627_9315;
      synchronized(this.aClass627_9315) {
         this.aClass627_9315.method6669(433562071);
      }
   }

   public void method6018(int var1, int var2) {
      this.aClass627_9317 = new CacheNodeArrayList(var1);
   }

   public void method6019(int var1, int var2) {
      CacheNodeArrayList var3 = this.aClass627_9317;
      synchronized(this.aClass627_9317) {
         this.aClass627_9317.method6677(var1, -1737266926);
      }

      var3 = this.aClass627_9306;
      synchronized(this.aClass627_9306) {
         this.aClass627_9306.method6677(var1, -1532127171);
      }

      var3 = this.aClass627_9314;
      synchronized(this.aClass627_9314) {
         this.aClass627_9314.method6677(var1, -1221943588);
      }

      var3 = this.aClass627_9315;
      synchronized(this.aClass627_9315) {
         this.aClass627_9315.method6677(var1, -1930106676);
      }
   }

   public void method6020(int var1) {
      CacheNodeArrayList var2 = this.aClass627_9317;
      synchronized(this.aClass627_9317) {
         this.aClass627_9317.method6665((byte)5);
      }

      var2 = this.aClass627_9306;
      synchronized(this.aClass627_9306) {
         this.aClass627_9306.method6665((byte)5);
      }

      var2 = this.aClass627_9314;
      synchronized(this.aClass627_9314) {
         this.aClass627_9314.method6665((byte)5);
      }

      var2 = this.aClass627_9315;
      synchronized(this.aClass627_9315) {
         this.aClass627_9315.method6665((byte)5);
      }
   }

   public Class529(GamePack var1, LanguagePack var2, boolean var3, CacheDataUnpacker var4, CacheDataUnpacker var5) {
      this.aClass523_9309 = var1;
      this.aClass526_9307 = var2;
      this.aBoolean_9308 = var3;
      this.aCacheUnpacker_9313 = var4;
      this.aCacheUnpacker_9310 = var5;
      if(this.aCacheUnpacker_9313 != null) {
         int var6 = this.aCacheUnpacker_9313.method3581((short)-29125) - 1;
         Class124.aClass124_2282.method1574(-849095788);
         this.aCacheUnpacker_9313.method3575(var6, -1074743676);
      }

      if(GamePack.runescapePack == this.aClass523_9309) {
         this.aStringArray_9311 = new String[]{null, null, null, null, null, ServerString.examineStr.getText(this.aClass526_9307, 396899578)};
      } else {
         this.aStringArray_9311 = new String[]{null, null, null, null, null, null};
      }

   }

   static final void method6021(RSInterfaceData var0, int var1) {
      boolean var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111] != 0;
      int var3 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = Class91.method1202((long)var3, 0, var2, Class599.clientLanguage, -917178471);
   }

   public static Class114 method6022(int var0, int var1) {
      return var0 == -683417325 * Class114.aClass114_2077.anInt_2079?Class114.aClass114_2077:(-683417325 * Class114.aClass114_2078.anInt_2079 == var0?Class114.aClass114_2078:null);
   }

   static final int method6023(int var0, int var1, int var2, int var3) {
      if(var0 == var1) {
         return var0;
      } else {
         int var4 = 128 - var2;
         int var5 = var4 * (var0 & 127) + var2 * (var1 & 127) >> 7;
         int var6 = (var0 & 896) * var4 + (var1 & 896) * var2 >> 7;
         int var7 = (var1 & '\ufc00') * var2 + (var0 & '\ufc00') * var4 >> 7;
         return var7 & '\ufc00' | var6 & 896 | var5 & 127;
      }
   }

   static void method6024(int var0) {
      Class192.anInt_3351 = 0;
      Class192.flagX = -624818685;
      Class192.flagY = 2043346881;
   }
}
