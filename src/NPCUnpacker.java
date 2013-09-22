
public class NPCUnpacker {

   final LanguagePack languagePack;
   boolean aBoolean_8728;
   final GamePack gamePack;
   final CacheDataUnpacker aCacheUnpacker_8730;
   final CacheDataUnpacker aCacheUnpacker_8731;
   final CacheNodeArrayList aClass627_8732 = new CacheNodeArrayList(64); //npc model cache
   final CacheNodeArrayList aClass627_8733 = new CacheNodeArrayList(50);
   final CacheNodeArrayList aClass627_8734 = new CacheNodeArrayList(5);
   int anInt_8735;
   final String[] aStringArray_8736;


   public NPCComposite method5670(int var1, int var2) {
      CacheNodeArrayList var3 = this.aClass627_8732;
      NPCComposite var4;
      synchronized(this.aClass627_8732) {
         var4 = (NPCComposite)this.aClass627_8732.getObject((long)var1);
      }

      if(null != var4) {
         return var4;
      } else {
         CacheDataUnpacker var5 = this.aCacheUnpacker_8731;
         byte[] var11;
         synchronized(this.aCacheUnpacker_8731) {
            var11 = this.aCacheUnpacker_8731.getDataBytes(Class124.aClass124_2285.method1575(var1, -700972288), Class124.aClass124_2285.method1573(var1, (byte)49), 822810090);
         }

         var4 = new NPCComposite();
         var4.modelID = 872834965 * var1;
         var4.npcUnpacker = this;
         var4.optionsArray = (String[])((String[])this.aStringArray_8736.clone());
         if(null != var11) {
            var4.method5605(new ByteArrayDataNode(var11), (byte)-68);
         }

         var4.method5603(730883993);
         CacheNodeArrayList var12 = this.aClass627_8732;
         synchronized(this.aClass627_8732) {
            this.aClass627_8732.insert(var4, (long)var1);
            return var4;
         }
      }
   }

   public void method5671(int var1, byte var2) {
      this.anInt_8735 = 713373095 * var1;
      CacheNodeArrayList var3 = this.aClass627_8733;
      synchronized(this.aClass627_8733) {
         this.aClass627_8733.method6669(180006620);
      }

      var3 = this.aClass627_8734;
      synchronized(this.aClass627_8734) {
         this.aClass627_8734.method6669(-1173999423);
      }
   }

   public void method5672(byte var1) {
      CacheNodeArrayList var2 = this.aClass627_8732;
      synchronized(this.aClass627_8732) {
         this.aClass627_8732.method6669(-971203643);
      }

      var2 = this.aClass627_8733;
      synchronized(this.aClass627_8733) {
         this.aClass627_8733.method6669(454199810);
      }

      var2 = this.aClass627_8734;
      synchronized(this.aClass627_8734) {
         this.aClass627_8734.method6669(-555022904);
      }
   }

   public void method5673(int var1, int var2) {
      CacheNodeArrayList var3 = this.aClass627_8732;
      synchronized(this.aClass627_8732) {
         this.aClass627_8732.method6677(var1, -1978092862);
      }

      var3 = this.aClass627_8733;
      synchronized(this.aClass627_8733) {
         this.aClass627_8733.method6677(var1, -1472448192);
      }

      var3 = this.aClass627_8734;
      synchronized(this.aClass627_8734) {
         this.aClass627_8734.method6677(var1, -999020828);
      }
   }

   public void method5674(int var1) {
      CacheNodeArrayList var2 = this.aClass627_8732;
      synchronized(this.aClass627_8732) {
         this.aClass627_8732.method6665((byte)5);
      }

      var2 = this.aClass627_8733;
      synchronized(this.aClass627_8733) {
         this.aClass627_8733.method6665((byte)5);
      }

      var2 = this.aClass627_8734;
      synchronized(this.aClass627_8734) {
         this.aClass627_8734.method6665((byte)5);
      }
   }

   public NPCUnpacker(GamePack var1, LanguagePack var2, boolean var3, CacheDataUnpacker var4, CacheDataUnpacker var5) {
      this.gamePack = var1;
      this.languagePack = var2;
      this.aBoolean_8728 = var3;
      this.aCacheUnpacker_8731 = var4;
      this.aCacheUnpacker_8730 = var5;
      if(this.aCacheUnpacker_8731 != null) {
         int var6 = this.aCacheUnpacker_8731.method3581((short)-31766) - 1;
         Class124.aClass124_2285.method1574(-1622586930);
         this.aCacheUnpacker_8731.method3575(var6, -1252851104);
      }

      if(GamePack.runescapePack == this.gamePack) {
         this.aStringArray_8736 = new String[]{null, null, null, null, null, ServerString.examineStr.getText(this.languagePack, 836714478)};
      } else {
         this.aStringArray_8736 = new String[]{null, null, null, null, null, null};
      }

   }

   public void method5675(boolean var1, byte var2) {
      if(this.aBoolean_8728 != var1) {
         this.aBoolean_8728 = var1;
         this.method5672((byte)1);
      }
   }

   public void method5676(int var1) {
      CacheNodeArrayList var2 = this.aClass627_8733;
      synchronized(this.aClass627_8733) {
         this.aClass627_8733.method6669(649406974);
      }

      var2 = this.aClass627_8734;
      synchronized(this.aClass627_8734) {
         this.aClass627_8734.method6669(1713811120);
      }
   }

   public static void method5677(Class434 var0, int var1, int var2, Class218 var3, int var4) {
      RSInterfaceData var5 = Class261.getInterfaceData();
      var5.aClass218_9511 = var3;
      Class240_Sub52_Sub10.method585(var0, var1, var2, var5, 2071401666);
      var5.aClass218_9511 = null;
   }

   static final void method5678(RSInterfaceData var0, byte var1) {
      var0.intTypeIndex -= 1462854468;
      Class374.method4755(var0.intTypes[var0.intTypeIndex * -831324111], var0.intTypes[1 + var0.intTypeIndex * -831324111], var0.intTypes[var0.intTypeIndex * -831324111 + 2], var0.intTypes[-831324111 * var0.intTypeIndex + 3], 256, -952603512);
   }
}
