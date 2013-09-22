
public class DamageAnimeLoader {

   CacheNodeArrayList aClass627_10040 = new CacheNodeArrayList(20);
   final CacheDataUnpacker aCacheUnpacker_10041;
   final CacheDataUnpacker aCacheUnpacker_10042;
   final CacheNodeArrayList aClass627_10043 = new CacheNodeArrayList(64);
   public static client gameClient;


   public DamageSprite loadSprite(int var1, int var2) {
      CacheNodeArrayList var3 = this.aClass627_10043;
      DamageSprite var4;
      synchronized(this.aClass627_10043) {
         var4 = (DamageSprite)this.aClass627_10043.getObject((long)var1);
      }

      if(var4 != null) {
         return var4;
      } else {
         CacheDataUnpacker var5 = this.aCacheUnpacker_10042;
         byte[] var12;
         synchronized(this.aCacheUnpacker_10042) {
            var12 = this.aCacheUnpacker_10042.getDataBytes(Class124.aClass124_2322.anInt_2347 * -851327023, var1, -415438776);
         }

         var4 = new DamageSprite();
         var4.aClass624_9932 = this;
         if(var12 != null) {
            var4.method6522(new ByteArrayDataNode(var12), 2020974758);
         }

         CacheNodeArrayList var11 = this.aClass627_10043;
         synchronized(this.aClass627_10043) {
            this.aClass627_10043.insert(var4, (long)var1);
            return var4;
         }
      }
   }

   public void method6646(byte var1) {
      CacheNodeArrayList var2 = this.aClass627_10043;
      synchronized(this.aClass627_10043) {
         this.aClass627_10043.method6669(653211306);
      }

      var2 = this.aClass627_10040;
      synchronized(this.aClass627_10040) {
         this.aClass627_10040.method6669(-500642167);
      }
   }

   public void method6647(int var1) {
      CacheNodeArrayList var2 = this.aClass627_10043;
      synchronized(this.aClass627_10043) {
         this.aClass627_10043.method6665((byte)5);
      }

      var2 = this.aClass627_10040;
      synchronized(this.aClass627_10040) {
         this.aClass627_10040.method6665((byte)5);
      }
   }

   public void method6648(int var1, int var2) {
      CacheNodeArrayList var3 = this.aClass627_10043;
      synchronized(this.aClass627_10043) {
         this.aClass627_10043.method6677(var1, -1252036576);
      }

      var3 = this.aClass627_10040;
      synchronized(this.aClass627_10040) {
         this.aClass627_10040.method6677(var1, -2051208587);
      }
   }

   public DamageAnimeLoader(GamePack var1, LanguagePack var2, CacheDataUnpacker var3, CacheDataUnpacker var4) {
      this.aCacheUnpacker_10041 = var4;
      this.aCacheUnpacker_10042 = var3;
      this.aCacheUnpacker_10042.method3575(-851327023 * Class124.aClass124_2322.anInt_2347, -1215435068);
   }

   static final void method6649(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      Class563_Sub1_Sub3_Sub1.method5234(var3, var4, var0, -1607706169);
   }

   static final void method6650(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, int var3) {
      var2.intTypeIndex -= -1416056414;
      var0.anInt_2401 = -1994303531 * var2.intTypes[var2.intTypeIndex * -831324111];
      var0.anInt_2512 = 572079039 * var2.intTypes[1 + -831324111 * var2.intTypeIndex];
      Class110_Sub1.method3149(var0, 1022172535);
   }
}
