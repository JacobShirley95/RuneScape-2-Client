
public class MapIconUnpacker {

   CacheNodeArrayList aClass627_10007 = new CacheNodeArrayList(128);
   final CacheDataUnpacker aCacheUnpacker_10008;
   public static final int anInt_10009 = 128;
   final CacheDataUnpacker aCacheUnpacker_10010;
   public static final int anInt_10011 = 64;
   CacheNodeArrayList aClass627_10012 = new CacheNodeArrayList(64);
   static AbstractServerConnection aClass237_10013;


   public void method6601(int var1) {
      CacheNodeArrayList var2 = this.aClass627_10007;
      synchronized(this.aClass627_10007) {
         this.aClass627_10007.method6669(-757438888);
      }

      var2 = this.aClass627_10012;
      synchronized(this.aClass627_10012) {
         this.aClass627_10012.method6669(-450899238);
      }
   }

   public void method6602(int var1, int var2) {
      CacheNodeArrayList var3 = this.aClass627_10007;
      synchronized(this.aClass627_10007) {
         this.aClass627_10007.method6677(var1, -1146779603);
      }

      var3 = this.aClass627_10012;
      synchronized(this.aClass627_10012) {
         this.aClass627_10012.method6677(var1, -2095396190);
      }
   }

   public void method6603(short var1) {
      CacheNodeArrayList var2 = this.aClass627_10007;
      synchronized(this.aClass627_10007) {
         this.aClass627_10007.method6665((byte)5);
      }

      var2 = this.aClass627_10012;
      synchronized(this.aClass627_10012) {
         this.aClass627_10012.method6665((byte)5);
      }
   }

   public void init(int var1, int var2) {
      this.aClass627_10007 = new CacheNodeArrayList(var1);
      this.aClass627_10012 = new CacheNodeArrayList(var2);
   }

   public MapIcon loadIcon(int var1) {
      CacheNodeArrayList var3 = this.aClass627_10007;
      MapIcon var4;
      synchronized(this.aClass627_10007) {
         var4 = (MapIcon)this.aClass627_10007.getObject((long)var1);
      }

      if(null != var4) {
         return var4;
      } else {
         CacheDataUnpacker var5 = this.aCacheUnpacker_10008;
         byte[] var11;
         synchronized(this.aCacheUnpacker_10008) {
            var11 = this.aCacheUnpacker_10008.getDataBytes(Class124.aClass124_2312.anInt_2347 * -851327023, var1, -1905457390);
         }

         var4 = new MapIcon();
         var4.id = 133718981 * var1;
         var4.aClass616_9970 = this;
         if(var11 != null) {
            var4.method6599(new ByteArrayDataNode(var11), (byte)71);
         }

         var4.method6593(1249264418);
         CacheNodeArrayList var12 = this.aClass627_10007;
         synchronized(this.aClass627_10007) {
            this.aClass627_10007.insert(var4, (long)var1);
            return var4;
         }
      }
   }

   public MapIconUnpacker(GamePack var1, LanguagePack var2, CacheDataUnpacker var3, CacheDataUnpacker var4) {
      this.aCacheUnpacker_10008 = var3;
      this.aCacheUnpacker_10010 = var4;
      this.aCacheUnpacker_10008.method3575(-851327023 * Class124.aClass124_2312.anInt_2347, -1684323552);
   }

   static final void method6606(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 899618089 * var0.aClass240_Sub47_9501.anInt_7662;
   }

   static final void method6607(RSInterfaceData var0, byte var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class542.aClass43_Sub1_9475.method370(-770533890).anInt_2085 * -1835220801;
   }

   public static Class533[] method6608(int var0) {
      return new Class533[]{Class533.aClass533_9349, Class533.aClass533_9354, Class533.aClass533_9352, Class533.aClass533_9340, Class533.aClass533_9347, Class533.aClass533_9351, Class533.aClass533_9356, Class533.aClass533_9348, Class533.aClass533_9338, Class533.aClass533_9344, Class533.aClass533_9357, Class533.aClass533_9345, Class533.aClass533_9341, Class533.aClass533_9346, Class533.aClass533_9339, Class533.aClass533_9350, Class533.aClass533_9355, Class533.aClass533_9343, Class533.aClass533_9342};
   }
}
