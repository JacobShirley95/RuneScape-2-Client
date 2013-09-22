
public class Class457 {

   final CacheDataUnpacker aCacheUnpacker_8565;
   final CacheDataUnpacker aCacheUnpacker_8566;
   final CacheNodeArrayList aClass627_8567 = new CacheNodeArrayList(64);
   final CacheNodeArrayList aClass627_8568 = new CacheNodeArrayList(2);
   public static CacheDataUnpacker aCacheUnpacker_8569;


   public Class456 method5547(int var1, byte var2) {
      CacheNodeArrayList var3 = this.aClass627_8567;
      Class456 var4;
      synchronized(this.aClass627_8567) {
         var4 = (Class456)this.aClass627_8567.getObject((long)var1);
      }

      if(null != var4) {
         return var4;
      } else {
         CacheDataUnpacker var5 = this.aCacheUnpacker_8566;
         byte[] var12;
         synchronized(this.aCacheUnpacker_8566) {
            var12 = this.aCacheUnpacker_8566.getDataBytes(-851327023 * Class124.aClass124_2279.anInt_2347, var1, -182554195);
         }

         var4 = new Class456();
         var4.aClass457_8561 = this;
         if(var12 != null) {
            var4.method5542(new ByteArrayDataNode(var12), (byte)0);
         }

         CacheNodeArrayList var11 = this.aClass627_8567;
         synchronized(this.aClass627_8567) {
            this.aClass627_8567.insert(var4, (long)var1);
            return var4;
         }
      }
   }

   public void method5548(int var1) {
      CacheNodeArrayList var2 = this.aClass627_8567;
      synchronized(this.aClass627_8567) {
         this.aClass627_8567.method6669(-1293744583);
      }

      var2 = this.aClass627_8568;
      synchronized(this.aClass627_8568) {
         this.aClass627_8568.method6669(572936974);
      }
   }

   public Class457(GamePack var1, LanguagePack var2, CacheDataUnpacker var3, CacheDataUnpacker var4) {
      this.aCacheUnpacker_8566 = var3;
      this.aCacheUnpacker_8565 = var4;
      this.aCacheUnpacker_8566.method3575(Class124.aClass124_2279.anInt_2347 * -851327023, -981152524);
   }

   public void method5549(int var1, int var2) {
      CacheNodeArrayList var3 = this.aClass627_8567;
      synchronized(this.aClass627_8567) {
         this.aClass627_8567.method6677(var1, -1418023072);
      }

      var3 = this.aClass627_8568;
      synchronized(this.aClass627_8568) {
         this.aClass627_8568.method6677(var1, -1070325658);
      }
   }

   public void method5550(int var1) {
      CacheNodeArrayList var2 = this.aClass627_8567;
      synchronized(this.aClass627_8567) {
         this.aClass627_8567.method6665((byte)5);
      }

      var2 = this.aClass627_8568;
      synchronized(this.aClass627_8568) {
         this.aClass627_8568.method6665((byte)5);
      }
   }

   static void method5551(Class240_Sub27 var0, int var1, int var2, int var3, int var4) {
      var0.aClass240_Sub8_Sub1_7370.method4528(var3, 1152969786);
      var0.aClass240_Sub8_Sub1_7370.method4514(var1, -21374416);
      var0.aClass240_Sub8_Sub1_7370.method4463(var2, -1757135913);
   }

   static int method5552(Player var0, byte var1) {
      int var2 = var0.anInt_1475 * -991087421;
      Class263 var3 = var0.method3261((short)-22941);
      int var4 = var0.stance.getAnimationID(548250711);
      if(var4 != -1 && !var0.stance.isStationary) {
         if(-424471161 * var3.anInt_4564 != var4 && var3.anInt_4576 * -1174724853 != var4 && var3.anInt_4561 * -1278757251 != var4 && var4 != 1034825445 * var3.anInt_4553) {
            if(var4 == var3.anInt_4568 * 69768581 || var4 == 9421325 * var3.anInt_4563 || var3.anInt_4569 * 1655148515 == var4 || var4 == 613044169 * var3.anInt_4595) {
               var2 = -545133229 * var0.anInt_1474;
            }
         } else {
            var2 = -145685525 * var0.anInt_1461;
         }
      } else {
         var2 = 1461253509 * var0.anInt_1473;
      }

      return var2;
   }

   static final void method5553(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      NodeArrayList.method5943(var3, var4, var0, 1305932618);
   }

   static Class439[] method5554(int var0) {
      return new Class439[]{Class439.aClass439_8400, Class439.aClass439_8422, Class439.aClass439_8427, Class439.aClass439_8407, Class439.aClass439_8413, Class439.aClass439_8430, Class439.aClass439_8420, Class439.aClass439_8423, Class439.aClass439_8418, Class439.aClass439_8401, Class439.aClass439_8425, Class439.aClass439_8406, Class439.aClass439_8402, Class439.aClass439_8424, Class439.aClass439_8428, Class439.aClass439_8419, Class439.aClass439_8410, Class439.aClass439_8432, Class439.aClass439_8412, Class439.aClass439_8404, Class439.aClass439_8411, Class439.aClass439_8403, Class439.aClass439_8417, Class439.aClass439_8426, Class439.aClass439_8405, Class439.aClass439_8416, Class439.aClass439_8415, Class439.aClass439_8421, Class439.aClass439_8408, Class439.aClass439_8429, Class439.aClass439_8409};
   }
}
