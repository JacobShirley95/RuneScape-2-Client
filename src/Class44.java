
public class Class44 {

   final CacheNodeArrayList aClass627_957 = new CacheNodeArrayList(16);
   final CacheDataUnpacker aCacheUnpacker_958;


   public Class44(GamePack var1, LanguagePack var2, CacheDataUnpacker var3) {
      this.aCacheUnpacker_958 = var3;
      this.aCacheUnpacker_958.method3575(-851327023 * Class124.aClass124_2306.anInt_2347, -1141620556);
   }

   public Class49 method407(int var1, byte var2) {
      CacheNodeArrayList var3 = this.aClass627_957;
      Class49 var4;
      synchronized(this.aClass627_957) {
         var4 = (Class49)this.aClass627_957.getObject((long)var1);
      }

      if(null != var4) {
         return var4;
      } else {
         CacheDataUnpacker var5 = this.aCacheUnpacker_958;
         byte[] var12;
         synchronized(this.aCacheUnpacker_958) {
            var12 = this.aCacheUnpacker_958.getDataBytes(-851327023 * Class124.aClass124_2306.anInt_2347, var1, -232906337);
         }

         var4 = new Class49();
         if(var12 != null) {
            var4.method501(new ByteArrayDataNode(var12), -313932680);
         }

         CacheNodeArrayList var11 = this.aClass627_957;
         synchronized(this.aClass627_957) {
            this.aClass627_957.insert(var4, (long)var1);
            return var4;
         }
      }
   }

   public void method408(byte var1) {
      CacheNodeArrayList var2 = this.aClass627_957;
      synchronized(this.aClass627_957) {
         this.aClass627_957.method6669(532885946);
      }
   }

   public void method409(int var1) {
      CacheNodeArrayList var2 = this.aClass627_957;
      synchronized(this.aClass627_957) {
         this.aClass627_957.method6665((byte)5);
      }
   }

   public void method410(int var1, int var2) {
      CacheNodeArrayList var3 = this.aClass627_957;
      synchronized(this.aClass627_957) {
         this.aClass627_957.method6677(var1, -2053382285);
      }
   }

   static void method411(byte var0) {
      ConnectionHandler var1 = Class32.method230(1380005087);
      Class240_Sub27 var2 = Class47_Sub1.method3496(Class326.aClass326_6329, var1.aClass528_3433, 1917447504);
      var2.aClass240_Sub8_Sub1_7370.putIntBE(client.anInt_526 * -1425350471, 2062892803);
      var1.addPacket(var2, 1439940933);
   }

   static final void method412(RSInterfaceData var0, int var1) {
      RSInterface var2 = RSServerQueue.getInterface(var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111], (byte)105);
      if(null == var2.aClass132Array_2579) {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 0;
      } else {
         int var3 = var2.aClass132Array_2579.length;

         for(int var4 = 0; var4 < var2.aClass132Array_2579.length; ++var4) {
            if(var2.aClass132Array_2579[var4] == null) {
               var3 = var4;
               break;
            }
         }

         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var3;
      }
   }

   static final void method413(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      Class474.method5669(var3, var4, var0, 2146027359);
   }
}
