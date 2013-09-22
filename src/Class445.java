
public class Class445 {

   final CacheDataUnpacker aCacheUnpacker_8515;
   public static final int anInt_8516 = 64;
   public static final int anInt_8517 = 64;
   CacheNodeArrayList aClass627_8518 = new CacheNodeArrayList(64);
   CacheNodeArrayList aClass627_8519 = new CacheNodeArrayList(64);
   final CacheDataUnpacker aCacheUnpacker_8520;
   static WorldMapText aClass198_8521;


   public void method5486(int var1) {
      CacheNodeArrayList var2 = this.aClass627_8519;
      synchronized(this.aClass627_8519) {
         this.aClass627_8519.method6669(874337668);
      }

      var2 = this.aClass627_8518;
      synchronized(this.aClass627_8518) {
         this.aClass627_8518.method6669(-305728106);
      }
   }

   public void method5487(int var1, byte var2) {
      CacheNodeArrayList var3 = this.aClass627_8519;
      synchronized(this.aClass627_8519) {
         this.aClass627_8519.method6677(var1, -1327476656);
      }

      var3 = this.aClass627_8518;
      synchronized(this.aClass627_8518) {
         this.aClass627_8518.method6677(var1, -1304533412);
      }
   }

   public void method5488(int var1) {
      CacheNodeArrayList var2 = this.aClass627_8519;
      synchronized(this.aClass627_8519) {
         this.aClass627_8519.method6665((byte)5);
      }

      var2 = this.aClass627_8518;
      synchronized(this.aClass627_8518) {
         this.aClass627_8518.method6665((byte)5);
      }
   }

   public Class474 method5489(int var1, int var2) {
      CacheNodeArrayList var3 = this.aClass627_8519;
      Class474 var4;
      synchronized(this.aClass627_8519) {
         var4 = (Class474)this.aClass627_8519.getObject((long)var1);
      }

      if(null != var4) {
         return var4;
      } else {
         CacheDataUnpacker var5 = this.aCacheUnpacker_8515;
         byte[] var12;
         synchronized(this.aCacheUnpacker_8515) {
            var12 = this.aCacheUnpacker_8515.getDataBytes(Class124.aClass124_2346.anInt_2347 * -851327023, var1, -587757599);
         }

         var4 = new Class474();
         var4.aClass445_8720 = this;
         if(var12 != null) {
            var4.method5665(new ByteArrayDataNode(var12), 949595175);
         }

         CacheNodeArrayList var11 = this.aClass627_8519;
         synchronized(this.aClass627_8519) {
            this.aClass627_8519.insert(var4, (long)var1);
            return var4;
         }
      }
   }

   public void method5490(int var1, int var2, int var3) {
      this.aClass627_8519 = new CacheNodeArrayList(var1);
      this.aClass627_8518 = new CacheNodeArrayList(var2);
   }

   public Class445(GamePack var1, LanguagePack var2, CacheDataUnpacker var3, CacheDataUnpacker var4) {
      this.aCacheUnpacker_8515 = var3;
      this.aCacheUnpacker_8520 = var4;
      this.aCacheUnpacker_8515.method3575(Class124.aClass124_2346.anInt_2347 * -851327023, -1541392595);
      Math.random();
      Math.random();
      Math.random();
      Math.random();
   }

   public static int method5491(int var0) {
      return Class506.aBoolean_9125 && Class102.aFrame_1967 != null?3:(client.aBoolean_431?2:1);
   }

   static final void method5492(RSInterfaceData var0, byte var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      if(null == RSInterface.interfaceGroups[var2]) {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 0;
      } else {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = RSInterface.interfaceGroups[var2].interfaceArray.length;
      }

   }
}
