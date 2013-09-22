
public class Class611 {

   static final Class611 aClass611_9947 = new Class611(2);
   final int anInt_9948;
   static final Class611 aClass611_9949 = new Class611(1);
   static final Class611 aClass611_9950 = new Class611(0);


   Class611(int var1) {
      this.anInt_9948 = var1 * -1123040079;
   }

   static final void method6563(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class638.method6729(var3, var4, var0, (byte)-73);
   }

   static final void method6564(RSInterfaceData var0, byte var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = var0.aClass68_9508.aStringArray_1287[var2];
   }

   static final void method6565(RSInterfaceData var0, short var1) {
      var0.intTypeIndex -= -1416056414;
      int var2 = var0.intTypes[-831324111 * var0.intTypeIndex];
      int var3 = var0.intTypes[var0.intTypeIndex * -831324111 + 1];
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var2 & var3;
   }

   public static int method6566(int var0, int var1, int var2, int var3) {
      var2 &= 3;
      return var2 == 0?var0:(var2 == 1?var1:(var2 == 2?4095 - var0:4095 - var1));
   }

   public static void method6567(int var0, int var1, boolean var2, int var3) {
      if(Class524.aNodeArrayList_9273.getNode((long)var0) == null) {
         if(!DamageAnimeLoader.gameClient.aBoolean_3903) {
            Class505.method5865(var0, var2, -1853747180);
         } else {
            Class240_Sub5 var4 = new Class240_Sub5(var0, new Class254_Sub1(4096, Class222.aCacheUnpacker_3821, var0), var1, var2);
            var4.aClass254_Sub1_6754.method3330(Class599.clientLanguage.getLocaleName(-1610542805), -1221010333);
            Class524.aNodeArrayList_9273.insert(var4, (long)var0);
         }
      }

   }

   static final void method6568(RSInterfaceData var0, int var1) {
      var0.stringDataIndex -= 638819198;
      String var2 = (String)var0.stringData[var0.stringDataIndex * 863838783];
      String var3 = (String)var0.stringData[var0.stringDataIndex * 863838783 + 1];
      if(0 != client.anInt_507 * -268988889 || (!client.aBoolean_499 || client.aBoolean_444) && !client.aBoolean_447) {
         ConnectionHandler var4 = Class32.method230(1767487948);
         Class240_Sub27 var5 = Class47_Sub1.method3496(Class326.aClass326_6305, var4.aClass528_3433, 1917447504);
         var5.aClass240_Sub8_Sub1_7370.method4463(0, 42408480);
         int var6 = 964952859 * var5.aClass240_Sub8_Sub1_7370.index;
         var5.aClass240_Sub8_Sub1_7370.putString(var2, (byte)-40);
         Class134.method1785(var5.aClass240_Sub8_Sub1_7370, var3, -1142597032);
         var5.aClass240_Sub8_Sub1_7370.method4472(var5.aClass240_Sub8_Sub1_7370.index * 964952859 - var6, 383389844);
         var4.addPacket(var5, 2077246288);
      }
   }
}
