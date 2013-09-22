
public class Class490 {

   public int anInt_9004 = 0;
   final CacheDataUnpacker aCacheUnpacker_9005;
   final CacheDataUnpacker aCacheUnpacker_9006;
   public int anInt_9007 = 0;
   final CacheNodeArrayList aClass627_9008 = new CacheNodeArrayList(64);
   static final int anInt_9009 = 1;
   static final int anInt_9010 = 32768;
   Class579 aClass579_9011 = null;


   public Class240_Sub22_Sub16 method5748(int var1, byte var2) {
      Class240_Sub22_Sub16 var3 = (Class240_Sub22_Sub16)this.aClass627_9008.getObject((long)var1);
      if(null != var3) {
         return var3;
      } else {
         byte[] var4;
         if(var1 >= '\u8000') {
            var4 = this.aCacheUnpacker_9006.getDataBytes(1, var1 & 32767, -133823256);
         } else {
            var4 = this.aCacheUnpacker_9005.getDataBytes(1, var1, -1889024585);
         }

         var3 = new Class240_Sub22_Sub16();
         var3.aClass490_3692 = this;
         if(var4 != null) {
            var3.method2677(new ByteArrayDataNode(var4), (byte)23);
         }

         if(var1 >= '\u8000') {
            var3.method2684((short)-19417);
         }

         this.aClass627_9008.insert(var3, (long)var1);
         return var3;
      }
   }

   public Class490(LanguagePack var1, CacheDataUnpacker var2, CacheDataUnpacker var3, Class579 var4) {
      this.aCacheUnpacker_9005 = var2;
      this.aCacheUnpacker_9006 = var3;
      this.aClass579_9011 = var4;
      if(this.aCacheUnpacker_9005 != null) {
         this.anInt_9007 = this.aCacheUnpacker_9005.method3575(1, -1504985427) * -332486231;
      }

      if(null != this.aCacheUnpacker_9006) {
         this.anInt_9004 = this.aCacheUnpacker_9006.method3575(1, -928334535) * 101110709;
      }

   }

   String method5749(Class577 var1, int[] var2, long var3) {
      if(null != this.aClass579_9011) {
         String var5 = this.aClass579_9011.method6314(var1, var2, var3);
         if(null != var5) {
            return var5;
         }
      }

      return Long.toString(var3);
   }

   static final void method5750(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var3.anInt_2495 * 586830225;
   }

   static void method5751(int var0, int var1, int var2, int var3, int var4) {
      float var5 = (float)Class248_Sub1.maxMapTilesY / (float)Class248_Sub1.maxMapTilesX;
      int var6 = var2;
      int var7 = var3;
      if(var5 < 1.0F) {
         var7 = (int)((float)var2 * var5);
      } else {
         var6 = (int)((float)var3 / var5);
      }

      var0 -= (var2 - var6) / 2;
      var1 -= (var3 - var7) / 2;
      Class107.viewOfMapImageX = 745782645 * (var0 * Class248_Sub1.maxMapTilesX / var6);
      AbstractUpdateServerConnector.viewOfMapImageY = -394363757 * (Class248_Sub1.maxMapTilesY - Class248_Sub1.maxMapTilesY * var1 / var7);
      Class248_Sub1.anInt_6446 = -1082544505;
      Class248_Sub1.anInt_6447 = 826358349;
      RenderSettings.method4829(1387365076);
   }
}
