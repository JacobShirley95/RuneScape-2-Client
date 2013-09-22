
public class Class631 {

   final CacheNodeArrayList aClass627_10079 = new CacheNodeArrayList(64);
   final CacheDataUnpacker aCacheUnpacker_10080;
   static Class286 aClass286_10081;
   static int anInt_10082;


   public Class631(GamePack var1, LanguagePack var2, CacheDataUnpacker var3) {
      this.aCacheUnpacker_10080 = var3;
      if(null != this.aCacheUnpacker_10080) {
         this.aCacheUnpacker_10080.method3575(-851327023 * Class124.aClass124_2295.anInt_2347, -1878930466);
      }

   }

   Class258 method6696(int var1, byte var2) {
      CacheNodeArrayList var3 = this.aClass627_10079;
      Class258 var4;
      synchronized(this.aClass627_10079) {
         var4 = (Class258)this.aClass627_10079.getObject((long)var1);
      }

      if(null != var4) {
         return var4;
      } else {
         CacheDataUnpacker var5 = this.aCacheUnpacker_10080;
         byte[] var12;
         synchronized(this.aCacheUnpacker_10080) {
            var12 = this.aCacheUnpacker_10080.getDataBytes(-851327023 * Class124.aClass124_2295.anInt_2347, var1, -1862949569);
         }

         var4 = new Class258();
         if(var12 != null) {
            var4.method3381(new ByteArrayDataNode(var12), -1487536245);
         }

         CacheNodeArrayList var11 = this.aClass627_10079;
         synchronized(this.aClass627_10079) {
            this.aClass627_10079.insert(var4, (long)var1);
            return var4;
         }
      }
   }

   static final void method6697(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var3.Y1 * 980798721;
   }

   public static void method6698(String var0, String var1, int var2) {
      if(var0.length() <= 320) {
         if(Class620.method6632(631970412)) {
            Class53.method545(-1652729872);
            Class11.aString_92 = var0;
            Class11.aString_93 = var1;
            Class418.method5190(9, (byte)-81);
         }
      }
   }
}
