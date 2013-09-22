import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Class111 {

   public String aString_2045;
   public String aString_2046;
   public static String javaVendor;


   void method1417(Class129 var1, int var2) {
      this.aString_2046 = var1.method1664(2136533555);
      this.aString_2045 = var1.method1664(1897656721);
   }

   public static void method1418(String var0, String var1, int var2, boolean var3, int var4) {
      if(client.loginStage * -243034353 == 3) {
         Class240_Sub27 var5 = Class47_Sub1.method3496(Class326.aClass326_6234, client.lobbyConnectionHandler.aClass528_3433, 1917447504);
         var5.aClass240_Sub8_Sub1_7370.method4463(0, -145519741);
         int var6 = 964952859 * var5.aClass240_Sub8_Sub1_7370.index;
         var5.aClass240_Sub8_Sub1_7370.putString(var0, (byte)-60);
         var5.aClass240_Sub8_Sub1_7370.putString(var1, (byte)-116);
         var5.aClass240_Sub8_Sub1_7370.putByte(var2, 1256827994);
         var5.aClass240_Sub8_Sub1_7370.putByte(var3?1:0, 1872632678);
         var5.aClass240_Sub8_Sub1_7370.index += -1419617915;
         var5.aClass240_Sub8_Sub1_7370.method4496(Class3.anIntArray_27, var6, 964952859 * var5.aClass240_Sub8_Sub1_7370.index, -763494346);
         var5.aClass240_Sub8_Sub1_7370.method4472(964952859 * var5.aClass240_Sub8_Sub1_7370.index - var6, -560327268);
         client.lobbyConnectionHandler.addPacket(var5, 201851083);
         if(var2 < 13) {
            client.aBoolean_314 = true;
            Class545.method6097(-1085954129);
         }

         Class479.aClass533_8756 = Class533.aClass533_9339;
      }
   }

   static void writeRandomDatFile(int var0) {
      try {
         File var1 = new File(Class405.userDirectory, "random.dat");
         int var3;
         if(var1.exists()) {
            ClientSuper.randomDataFile = new CacheFile(new RandomAccessFileNode(var1, "rw", 25L), 24, 0);
         } else {
            label31:
            for(int var2 = 0; var2 < LoadProgress.jagexCacheFiles.length; ++var2) {
               for(var3 = 0; var3 < Class203.cacheDirectories.length; ++var3) {
                  File var4 = new File(Class203.cacheDirectories[var3] + LoadProgress.jagexCacheFiles[var2] + File.separatorChar + "random.dat");
                  if(var4.exists()) {
                     ClientSuper.randomDataFile = new CacheFile(new RandomAccessFileNode(var4, "rw", 25L), 24, 0);
                     break label31;
                  }
               }
            }
         }

         if(ClientSuper.randomDataFile == null) {
            RandomAccessFile var6 = new RandomAccessFile(var1, "rw");
            var3 = var6.read();
            var6.seek(0L);
            var6.write(var3);
            var6.seek(0L);
            var6.close();
            ClientSuper.randomDataFile = new CacheFile(new RandomAccessFileNode(var1, "rw", 25L), 24, 0);
         }
      } catch (IOException var5) {
         ;
      }

   }

   public static Class31 method1420(int var0, byte var1) {
      return var0 == 1428504707 * Class31.aClass31_807.anInt_813?Class31.aClass31_807:(var0 == 1428504707 * Class31.aClass31_808.anInt_813?Class31.aClass31_808:(1428504707 * Class31.aClass31_809.anInt_813 == var0?Class31.aClass31_809:(Class31.aClass31_810.anInt_813 * 1428504707 == var0?Class31.aClass31_810:(var0 == Class31.aClass31_811.anInt_813 * 1428504707?Class31.aClass31_811:(var0 == Class31.aClass31_812.anInt_813 * 1428504707?Class31.aClass31_812:null)))));
   }

   static final void method1421(RSInterfaceData var0, byte var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 1900159845 * var3.imageID;
   }

   static final boolean method1422(Class529 var0, int var1, int var2, byte var3) {
      Class534 var4 = var0.method6015(var1, (byte)1);
      if(11 == var2) {
         var2 = 10;
      }

      if(var2 >= 5 && var2 <= 8) {
         var2 = 4;
      }

      return var4.method6044(var2, (byte)67);
   }

   public static boolean method1423(char var0, int var1) {
      return var0 >= 48 && var0 <= 57 || var0 >= 65 && var0 <= 90 || var0 >= 97 && var0 <= 122;
   }
}
