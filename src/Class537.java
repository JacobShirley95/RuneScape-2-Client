
public class Class537 {

   public static String aString_9452;


   Class537() throws Throwable {
      throw new Error();
   }

   public static String bytesToString(byte[] var0, int var1, int var2, int var3) {
      char[] var4 = new char[var2];
      int var5 = 0;

      for(int var6 = 0; var6 < var2; ++var6) {
         int var7 = var0[var1 + var6] & 255;
         if(var7 != 0) {
            if(var7 >= 128 && var7 < 160) {
               char var8 = Class535.aCharArray_9440[var7 - 128];
               if(var8 == 0) {
                  var8 = 63;
               }

               var7 = var8;
            }

            var4[var5++] = (char)var7;
         }
      }

      return new String(var4, 0, var5);
   }

   static final void method6071(RSInterfaceData var0, byte var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = client.method174(var3).method4993((byte)-55);
   }

   static final void method6072(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, int var3) {
      String var4 = (String)var2.stringData[(var2.stringDataIndex -= -1828074049) * 863838783];
      int[] var5 = Class557.extractInterfaceIntData(var4, var2, 1785945920);
      if(var5 != null) {
         var4 = var4.substring(0, var4.length() - 1);
      }

      var0.anObjectArray_2539 = Class133.extractInterfaceData(var4, var2, (byte)79);
      var0.anIntArray_2538 = var5;
      var0.aBoolean_2524 = true;
   }

   public static void method6073(int var0) {
      if(client.aBoolean_463) {
         RSInterface var1 = DrawingTarget.method2201(Class283_Sub3.anInt_7897 * 2036107931, -315969483 * client.anInt_543, (byte)74);
         if(var1 != null && null != var1.anObjectArray_2420) {
            Class240_Sub17 var2 = new Class240_Sub17();
            var2.aClass132_6903 = var1;
            var2.anObjectArray_6907 = var1.anObjectArray_2420;
            Class411.method5074(var2, (byte)1);
         }

         client.anInt_373 = 1449477201;
         client.anInt_279 = -2027955285;
         client.aBoolean_463 = false;
         if(null != var1) {
            Class110_Sub1.method3149(var1, 1193532684);
         }

      }
   }

   static final void method6074(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class305.aBoolean_6032?1:0;
   }

   public static Class39 method6075(int var0, int var1) {
      return var0 == 287578289 * Class39.aClass39_863.anInt_865?Class39.aClass39_863:(Class39.aClass39_864.anInt_865 * 287578289 == var0?Class39.aClass39_864:null);
   }

   static final void method6076(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      Class120.method1513(var3, var4, var0, 2137864904);
   }
}
