import java.lang.management.GarbageCollectorMXBean;

public class Class236 {

   final CacheNodeArrayList aClass627_4034 = new CacheNodeArrayList(16);
   final CacheDataUnpacker aCacheUnpacker_4035;
   static GarbageCollectorMXBean aGarbageCollectorMXBean_4036;


   public Class236(GamePack var1, LanguagePack var2, CacheDataUnpacker var3) {
      this.aCacheUnpacker_4035 = var3;
      this.aCacheUnpacker_4035.method3575(Class124.aClass124_2305.anInt_2347 * -851327023, -950701272);
   }

   public Class286 method3057(int var1, int var2, int var3, int var4, Class44 var5, byte var6) {
      Class308[] var7 = null;
      Class239 var8 = this.method3061(var1, 122620821);
      if(null != var8.anIntArray_4039) {
         var7 = new Class308[var8.anIntArray_4039.length];

         for(int var9 = 0; var9 < var7.length; ++var9) {
            Class49 var10 = var5.method407(var8.anIntArray_4039[var9], (byte)-14);
            var7[var9] = new Class308(1608295461 * var10.anInt_1033, var10.anInt_1035 * -838941799, 779377977 * var10.anInt_1036, 530258197 * var10.anInt_1031, var10.anInt_1032 * -1034231457, var10.anInt_1029 * 1578983951, var10.anInt_1034 * 440829325, var10.aBoolean_1028, var10.anInt_1030 * -1407165933, -426660991 * var10.anInt_1037, -761564791 * var10.anInt_1038);
         }
      }

      return new Class286(var8.anInt_4041 * -383820891, var7, -1504349757 * var8.anInt_4040, var2, var3, var4, var8.aClass266_4042, -884981833 * var8.anInt_4043);
   }

   public void method3058(byte var1) {
      CacheNodeArrayList var2 = this.aClass627_4034;
      synchronized(this.aClass627_4034) {
         this.aClass627_4034.method6669(-1924538412);
      }
   }

   public void method3059(int var1, byte var2) {
      CacheNodeArrayList var3 = this.aClass627_4034;
      synchronized(this.aClass627_4034) {
         this.aClass627_4034.method6677(var1, -1688026254);
      }
   }

   public void method3060(int var1) {
      CacheNodeArrayList var2 = this.aClass627_4034;
      synchronized(this.aClass627_4034) {
         this.aClass627_4034.method6665((byte)5);
      }
   }

   Class239 method3061(int var1, int var2) {
      CacheNodeArrayList var3 = this.aClass627_4034;
      Class239 var4;
      synchronized(this.aClass627_4034) {
         var4 = (Class239)this.aClass627_4034.getObject((long)var1);
      }

      if(null != var4) {
         return var4;
      } else {
         CacheDataUnpacker var5 = this.aCacheUnpacker_4035;
         byte[] var12;
         synchronized(this.aCacheUnpacker_4035) {
            var12 = this.aCacheUnpacker_4035.getDataBytes(Class124.aClass124_2305.anInt_2347 * -851327023, var1, 844737008);
         }

         var4 = new Class239();
         if(var12 != null) {
            var4.method3082(new ByteArrayDataNode(var12), 1850812093);
         }

         CacheNodeArrayList var11 = this.aClass627_4034;
         synchronized(this.aClass627_4034) {
            this.aClass627_4034.insert(var4, (long)var1);
            return var4;
         }
      }
   }

   static final void method3062(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      Class369.method4687(var3, var4, var0, 308549635);
   }

   public static void method3063(int var0) {
      for(Class240_Sub5 var1 = (Class240_Sub5)Class524.aNodeArrayList_9273.start(); var1 != null; var1 = (Class240_Sub5)Class524.aNodeArrayList_9273.next()) {
         if(!var1.aBoolean_6755) {
            Class215.method2700(var1.anInt_6753 * -484590667, (byte)-17);
         } else {
            var1.aBoolean_6755 = false;
         }
      }

   }
}
