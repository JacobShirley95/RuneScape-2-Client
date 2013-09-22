import java.awt.Font;
import java.io.File;

public class Class370 implements Runnable {

   int anInt_6926 = 0;
   Class494 cacheFileNodeList = new Class494();
   boolean aBoolean_6928 = false;
   Thread aThread_6929 = new Thread(this);
   static Font clientFont;


   CacheDataNode createDataNode(int var1, byte[] var2, Class243 var3, int var4) {
      CacheDataNode var5 = new CacheDataNode();
      var5.anInt_3242 = 1518619210;
      var5.aLong_7278 = (long)var1 * -390861045572062217L;
      var5.data = var2;
      var5.aClass243_3241 = var3;
      var5.aBoolean_3670 = false;
      this.method4692(var5, -440945402);
      return var5;
   }

   public Class370() {
      this.aThread_6929.setDaemon(true);
      this.aThread_6929.start();
      this.aThread_6929.setPriority(1);
   }

   CacheDataNode createDataNode(int var1, Class243 var2, byte var3) {
      CacheDataNode var4 = new CacheDataNode();
      var4.anInt_3242 = 130445167;
      var4.aLong_7278 = -390861045572062217L * (long)var1;
      var4.aClass243_3241 = var2;
      var4.aBoolean_3670 = false;
      this.method4692(var4, 312875102);
      return var4;
   }

   public void method4690(byte var1) {
      this.aBoolean_6928 = true;
      Class494 var2 = this.cacheFileNodeList;
      synchronized(this.cacheFileNodeList) {
         this.cacheFileNodeList.notifyAll();
      }

      try {
         this.aThread_6929.join();
      } catch (InterruptedException var4) {
         ;
      }

      this.aThread_6929 = null;
   }

   public void run() {
      while(!this.aBoolean_6928) {
         Class494 var1 = this.cacheFileNodeList;
         CacheDataNode var2;
         synchronized(this.cacheFileNodeList) {
            var2 = (CacheDataNode)this.cacheFileNodeList.method5776(-1008859982);
            if(var2 == null) {
               try {
                  this.cacheFileNodeList.wait();
               } catch (InterruptedException var6) {
                  ;
               }
               continue;
            }

            this.anInt_6926 -= 908765409;
         }

         try {
            if(var2.anInt_3242 * -1026855251 == 2) {
               var2.aClass243_3241.method3115((int)(2950103203925786055L * var2.aLong_7278), var2.data, var2.data.length, -543293588);
            } else if(-1026855251 * var2.anInt_3242 == 3) {
               var2.data = var2.aClass243_3241.method3116((int)(var2.aLong_7278 * 2950103203925786055L), 1528897181);
            }
         } catch (Exception var5) {
            CacheFileID.method1397((String)null, var5, -740617971);
         }

         var2.aBoolean_3671 = false;
      }

   }

   CacheDataNode method4691(int var1, Class243 var2, short var3) {
      CacheDataNode var4 = new CacheDataNode();
      var4.anInt_3242 = -1388174043;
      Class494 var5 = this.cacheFileNodeList;
      synchronized(this.cacheFileNodeList) {
         CacheDataNode var6 = (CacheDataNode)this.cacheFileNodeList.method5772(-242540247);

         while(true) {
            if(var6 == null) {
               break;
            }

            if((long)var1 == 2950103203925786055L * var6.aLong_7278 && var2 == var6.aClass243_3241 && 2 == -1026855251 * var6.anInt_3242) {
               var4.data = var6.data;
               var4.aBoolean_3671 = false;
               return var4;
            }

            var6 = (CacheDataNode)this.cacheFileNodeList.method5771(-738986488);
         }
      }

      var4.data = var2.method3116(var1, 790299942);
      var4.aBoolean_3671 = false;
      var4.aBoolean_3670 = true;
      return var4;
   }

   void method4692(CacheDataNode var1, int var2) {
      Class494 var3 = this.cacheFileNodeList;
      synchronized(this.cacheFileNodeList) {
         this.cacheFileNodeList.insert(var1, 858067396);
         this.anInt_6926 += 908765409;
         this.cacheFileNodeList.notifyAll();
      }
   }

   public int method4693(int var1) {
      Class494 var2 = this.cacheFileNodeList;
      synchronized(this.cacheFileNodeList) {
         return this.anInt_6926 * -129983711;
      }
   }

   public static File getRootCacheFile(int var0) {
      return Class240_Sub22_Sub1.rootCacheDir;
   }

   static final void method4695(RSInterface var0, int var1, int var2, RSInterfaceData var3, int var4) {
      if(var0.anIntArray_2545 == null) {
         if(var2 <= 0) {
            return;
         }

         var0.aByteArrayArray_2506 = new byte[11][];
         var0.aByteArrayArray_2470 = new byte[11][];
         var0.anIntArray_2508 = new int[11];
         var0.anIntArray_2545 = new int[11];
      }

      var0.anIntArray_2545[var1] = var2;
      if(var2 > 0) {
         var0.aBoolean_2505 = true;
      } else {
         var0.aBoolean_2505 = false;

         for(int var5 = 0; var5 < var0.aByteArrayArray_2506.length; ++var5) {
            if(null != var0.aByteArrayArray_2506[var5] || var0.anIntArray_2545[var5] > 0) {
               var0.aBoolean_2505 = true;
               break;
            }
         }
      }

   }

   public static int method4696(CharSequence var0, byte var1) {
      int var2 = var0.length();
      int var3 = 0;

      for(int var4 = 0; var4 < var2; ++var4) {
         var3 = (var3 << 5) - var3 + var0.charAt(var4);
      }

      return var3;
   }

   public static String method4697(CharSequence var0, int var1) {
      int var2 = var0.length();
      StringBuilder var3 = new StringBuilder(var2);

      for(int var4 = 0; var4 < var2; ++var4) {
         char var5 = var0.charAt(var4);
         if((var5 < 97 || var5 > 122) && (var5 < 65 || var5 > 90) && (var5 < 48 || var5 > 57) && 46 != var5 && 45 != var5 && var5 != 42 && var5 != 95) {
            if(32 == var5) {
               var3.append('+');
            } else {
               byte var6 = Class120.method1515(var5, 1109827119);
               var3.append('%');
               int var7 = var6 >> 4 & 15;
               if(var7 >= 10) {
                  var3.append((char)(55 + var7));
               } else {
                  var3.append((char)(48 + var7));
               }

               var7 = var6 & 15;
               if(var7 >= 10) {
                  var3.append((char)(55 + var7));
               } else {
                  var3.append((char)(48 + var7));
               }
            }
         } else {
            var3.append(var5);
         }
      }

      return var3.toString();
   }
}
