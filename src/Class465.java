
public class Class465 {

   final CacheNodeArrayList aClass627_8674 = new CacheNodeArrayList(64);
   final CacheDataUnpacker aCacheUnpacker_8675;
   public static Class341 aClass341_8676;
   static OptionListNode firstOptionNode;
   public static CacheDataUnpacker aCacheUnpacker_8678;


   public Class476 method5610(int var1, int var2) {
      CacheNodeArrayList var3 = this.aClass627_8674;
      Class476 var4;
      synchronized(this.aClass627_8674) {
         var4 = (Class476)this.aClass627_8674.getObject((long)var1);
      }

      if(null != var4) {
         return var4;
      } else {
         CacheDataUnpacker var5 = this.aCacheUnpacker_8675;
         byte[] var12;
         synchronized(this.aCacheUnpacker_8675) {
            var12 = this.aCacheUnpacker_8675.getDataBytes(-851327023 * Class124.aClass124_2287.anInt_2347, var1, -293242659);
         }

         var4 = new Class476();
         if(var12 != null) {
            var4.method5680(new ByteArrayDataNode(var12), -1759925736);
         }

         CacheNodeArrayList var11 = this.aClass627_8674;
         synchronized(this.aClass627_8674) {
            this.aClass627_8674.insert(var4, (long)var1);
            return var4;
         }
      }
   }

   public void method5611(byte var1) {
      CacheNodeArrayList var2 = this.aClass627_8674;
      synchronized(this.aClass627_8674) {
         this.aClass627_8674.method6669(1015846617);
      }
   }

   public void method5612(int var1, byte var2) {
      CacheNodeArrayList var3 = this.aClass627_8674;
      synchronized(this.aClass627_8674) {
         this.aClass627_8674.method6677(var1, -1066374566);
      }
   }

   public void method5613(int var1) {
      CacheNodeArrayList var2 = this.aClass627_8674;
      synchronized(this.aClass627_8674) {
         this.aClass627_8674.method6665((byte)5);
      }
   }

   public Class465(GamePack var1, LanguagePack var2, CacheDataUnpacker var3) {
      this.aCacheUnpacker_8675 = var3;
      if(this.aCacheUnpacker_8675 != null) {
         this.aCacheUnpacker_8675.method3575(Class124.aClass124_2287.anInt_2347 * -851327023, -1627850716);
      }

   }
}
