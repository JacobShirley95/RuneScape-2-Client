
public class Class530 {

   final CacheNodeArrayList aClass627_9320 = new CacheNodeArrayList(128);
   final CacheDataUnpacker aCacheUnpacker_9321;
   static Sprite otherLeveLSprite;


   public Class497 method6025(int var1, int var2) {
      CacheNodeArrayList var3 = this.aClass627_9320;
      Class497 var4;
      synchronized(this.aClass627_9320) {
         var4 = (Class497)this.aClass627_9320.getObject((long)var1);
      }

      if(var4 != null) {
         return var4;
      } else {
         CacheDataUnpacker var5 = this.aCacheUnpacker_9321;
         byte[] var12;
         synchronized(this.aCacheUnpacker_9321) {
            var12 = this.aCacheUnpacker_9321.getDataBytes(Class124.aClass124_2336.anInt_2347 * -851327023, var1, -1510159204);
         }

         var4 = new Class497();
         if(var12 != null) {
            var4.method5820(new ByteArrayDataNode(var12), 929276459);
         }

         CacheNodeArrayList var11 = this.aClass627_9320;
         synchronized(this.aClass627_9320) {
            this.aClass627_9320.insert(var4, (long)var1);
            return var4;
         }
      }
   }

   public void method6026(byte var1) {
      CacheNodeArrayList var2 = this.aClass627_9320;
      synchronized(this.aClass627_9320) {
         this.aClass627_9320.method6665((byte)5);
      }
   }

   public void method6027(int var1, int var2) {
      CacheNodeArrayList var3 = this.aClass627_9320;
      synchronized(this.aClass627_9320) {
         this.aClass627_9320.method6677(var1, -1183094639);
      }
   }

   public void method6028(int var1) {
      CacheNodeArrayList var2 = this.aClass627_9320;
      synchronized(this.aClass627_9320) {
         this.aClass627_9320.method6669(-610351616);
      }
   }

   public Class530(GamePack var1, LanguagePack var2, CacheDataUnpacker var3) {
      this.aCacheUnpacker_9321 = var3;
      this.aCacheUnpacker_9321.method3575(-851327023 * Class124.aClass124_2336.anInt_2347, -867230567);
   }

   static final void method6029(RSInterfaceData var0, short var1) {
      Class540_Sub21.method4048(-1935633038);
      Class18.aBoolean_172 = false;
   }

   static final void method6030(RSInterfaceData var0, int var1) {
      var0.intTypeIndex -= -1416056414;
      int var2 = var0.intTypes[-831324111 * var0.intTypeIndex];
      int var3 = var0.intTypes[1 + -831324111 * var0.intTypeIndex];
      var0.aClass420_9507.anIntArray_7966[var2] = var3;
   }
}
