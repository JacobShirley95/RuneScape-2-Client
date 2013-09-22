
public class Class275 {

   final CacheDataUnpacker aCacheUnpacker_4720;
   final CacheDataUnpacker aCacheUnpacker_4721;
   final CacheNodeArrayList aClass627_4722 = new CacheNodeArrayList(64);
   static final int anInt_4723 = 0;
   static final int anInt_4724 = 32768;
   public static CacheDataUnpacker aCacheUnpacker_4725;


   public Class240_Sub22_Sub10 method3606(int var1, int var2) {
      Class240_Sub22_Sub10 var3 = (Class240_Sub22_Sub10)this.aClass627_4722.getObject((long)var1);
      if(null != var3) {
         return var3;
      } else {
         byte[] var4;
         if(var1 >= '\u8000') {
            var4 = this.aCacheUnpacker_4721.getDataBytes(0, var1 & 32767, -1282326322);
         } else {
            var4 = this.aCacheUnpacker_4720.getDataBytes(0, var1, -175934515);
         }

         var3 = new Class240_Sub22_Sub10();
         if(null != var4) {
            var3.method2603(new ByteArrayDataNode(var4), (short)-9582);
         }

         if(var1 >= '\u8000') {
            var3.method2607((byte)14);
         }

         this.aClass627_4722.insert(var3, (long)var1);
         return var3;
      }
   }

   public Class275(LanguagePack var1, CacheDataUnpacker var2, CacheDataUnpacker var3) {
      this.aCacheUnpacker_4720 = var2;
      this.aCacheUnpacker_4721 = var3;
      if(null != this.aCacheUnpacker_4720) {
         this.aCacheUnpacker_4720.method3575(0, -2084856127);
      }

      if(null != this.aCacheUnpacker_4721) {
         this.aCacheUnpacker_4721.method3575(0, -2051582459);
      }

   }

   static final void method3607(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, int var3) {
      var0.anInt_2469 = -626873046;
      var0.aClass442_2594 = null;
      var0.anInt_2416 = var2.intTypes[(var2.intTypeIndex -= -708028207) * -831324111] * 795082499;
      if(-1 == -1001687885 * var0.anInt_2428 && !var1.aBoolean_2054) {
         Class86.method1132(var0.cacheID * 1278853609, (byte)41);
      }

   }
}
