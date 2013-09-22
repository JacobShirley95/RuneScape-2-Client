
public class Class450 {

   final CacheDataUnpacker aCacheUnpacker_8542;
   final CacheNodeArrayList aClass627_8543 = new CacheNodeArrayList(64);


   public void method5518(byte var1) {
      CacheNodeArrayList var2 = this.aClass627_8543;
      synchronized(this.aClass627_8543) {
         this.aClass627_8543.method6669(-1311253908);
      }
   }

   public Class451 method5519(int var1, byte var2) {
      CacheNodeArrayList var3 = this.aClass627_8543;
      Class451 var4;
      synchronized(this.aClass627_8543) {
         var4 = (Class451)this.aClass627_8543.getObject((long)var1);
      }

      if(null != var4) {
         return var4;
      } else {
         CacheDataUnpacker var5 = this.aCacheUnpacker_8542;
         byte[] var12;
         synchronized(this.aCacheUnpacker_8542) {
            var12 = this.aCacheUnpacker_8542.getDataBytes(-851327023 * Class124.aClass124_2326.anInt_2347, var1, -119559889);
         }

         var4 = new Class451();
         if(null != var12) {
            var4.method5524(new ByteArrayDataNode(var12), 1564978722);
         }

         CacheNodeArrayList var11 = this.aClass627_8543;
         synchronized(this.aClass627_8543) {
            this.aClass627_8543.insert(var4, (long)var1);
            return var4;
         }
      }
   }

   public void method5520(int var1, int var2) {
      CacheNodeArrayList var3 = this.aClass627_8543;
      synchronized(this.aClass627_8543) {
         this.aClass627_8543.method6677(var1, -1494469220);
      }
   }

   public void method5521(int var1) {
      CacheNodeArrayList var2 = this.aClass627_8543;
      synchronized(this.aClass627_8543) {
         this.aClass627_8543.method6665((byte)5);
      }
   }

   public Class450(GamePack var1, LanguagePack var2, CacheDataUnpacker var3) {
      this.aCacheUnpacker_8542 = var3;
      this.aCacheUnpacker_8542.method3575(Class124.aClass124_2326.anInt_2347 * -851327023, -1276780633);
   }

   static final void method5522(RSInterface var0, RSInterfaceData var1, int var2) {
      RSFont var3 = var0.method1707(Class368.aFontUnpacker_6922, client.aClass339_284, (byte)1);
      int var4 = var1.intTypes[(var1.intTypeIndex -= -708028207) * -831324111];
      int var5 = var1.intTypes[(var1.intTypeIndex -= -708028207) * -831324111];
      int var6 = var3.method5564(var0.title, var0.width * -533669195, var0.anInt_2435 * 956409315, var5, var4, Class481.nameIconsSprites, (short)-3952);
      var1.intTypes[(var1.intTypeIndex += -708028207) * -831324111 - 1] = var6;
   }

   public static void method5523(int var0, int var1, int var2, boolean var3, byte var4) {
      if(Class104_Sub21.renderSettings.currentToolkit.getToolkitID() != 0) {
         Class248_Sub1.anInt_6450 = Class104_Sub21.renderSettings.currentToolkit.getToolkitID() * -1564984895;
         Class462.setRenderToolkit(0, true, -1901359387);
      } else {
         Class494.method5780(false, -1626899059);
      }

      Class248_Sub1.anInt_6449 = var1 * -2146299805;
      Class248_Sub1.anInt_6445 = 1408690543 * var2;
      Class248_Sub1.aBoolean_6452 = var3;
      Class248_Sub1.method3171(var0);
   }
}
