
public class Class71 implements Class208 {

   final CacheDataUnpacker aCacheUnpacker_1359;
   final CacheDataUnpacker aCacheUnpacker_1360;
   final CacheNodeArrayList aClass627_1361 = new CacheNodeArrayList(64);


   public void method815(int var1, int var2) {
      CacheNodeArrayList var3 = this.aClass627_1361;
      synchronized(this.aClass627_1361) {
         this.aClass627_1361.method6677(var1, -2021395383);
      }
   }

   public void method816(int var1) {
      CacheNodeArrayList var2 = this.aClass627_1361;
      synchronized(this.aClass627_1361) {
         this.aClass627_1361.method6669(151057011);
      }
   }

   public void method817(int var1) {
      CacheNodeArrayList var2 = this.aClass627_1361;
      synchronized(this.aClass627_1361) {
         this.aClass627_1361.method6665((byte)5);
      }
   }

   public Class71(GamePack var1, LanguagePack var2, CacheDataUnpacker var3, CacheDataUnpacker var4) {
      this.aCacheUnpacker_1359 = var3;
      this.aCacheUnpacker_1360 = var4;
      this.aCacheUnpacker_1359.method3575(-851327023 * Class124.aClass124_2331.anInt_2347, -1775591538);
   }

   public Class79 method818(int var1, int var2) {
      CacheNodeArrayList var3 = this.aClass627_1361;
      Class79 var4;
      synchronized(this.aClass627_1361) {
         var4 = (Class79)this.aClass627_1361.getObject((long)var1);
      }

      if(var4 != null) {
         return var4;
      } else {
         CacheDataUnpacker var5 = this.aCacheUnpacker_1359;
         byte[] var12;
         synchronized(this.aCacheUnpacker_1359) {
            var12 = this.aCacheUnpacker_1359.getDataBytes(Class124.aClass124_2331.anInt_2347 * -851327023, var1, -814564427);
         }

         var4 = new Class79();
         var4.aClass71_1522 = this;
         if(var12 != null) {
            var4.method1035(new ByteArrayDataNode(var12), -1094335825);
         }

         CacheNodeArrayList var11 = this.aClass627_1361;
         synchronized(this.aClass627_1361) {
            this.aClass627_1361.insert(var4, (long)var1);
            return var4;
         }
      }
   }

   static final void method819(RSInterfaceData var0, int var1) {
      var0.intTypeIndex -= 1462854468;
      int var2 = var0.intTypes[var0.intTypeIndex * -831324111];
      int var3 = var0.intTypes[-831324111 * var0.intTypeIndex + 1];
      int var4 = var0.intTypes[2 + var0.intTypeIndex * -831324111];
      int var5 = var0.intTypes[-831324111 * var0.intTypeIndex + 3];
      Class470 var6 = Class493.aClass466_9034.method5614(var4, (byte)-28);
      if(var2 == var6.aChar_8697 && var6.aChar_8694 == var3) {
         if(var3 == 115) {
            var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = var6.method5656(var5, 344915629);
         } else {
            var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var6.method5655(var5, (short)11364);
         }

      } else {
         throw new RuntimeException(var4 + " " + var5);
      }
   }

   public static boolean method820(short var0) {
      Class240_Sub1 var1 = (Class240_Sub1)Class462.aNodeList_8603.getBaseNode_2((byte)27);
      return null != var1;
   }

   static void method821(RSInterface var0, int var1, int var2, int var3) {
      Class18.aClass132_185 = var0;
      Class18.anInt_163 = var1 * -1035806777;
      Class18.anInt_174 = var2 * 1209347097;
   }

   public static void method822(int var0, int var1, int var2, int var3) {
      Class110.method1412(new Class488_Sub1(var0, var1, var2, client.anInt_294 * 87046993, 1946606119 * Class91.updateServerConnection.status, Class91.updateServerConnection.anInt_4748 * -763251429, Class91.updateServerConnection.method3631((byte)-10), Class91.updateServerConnection.method3630(1792118865), Class528.aClass370_9305.method4693(-1500060803)), 1537146665);
   }
}
