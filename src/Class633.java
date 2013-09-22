
public class Class633 implements Class262 {

   final Class491 aClass491_10093;
   final String aString_10094;
   final int anInt_10095;


   public void method3492(byte var1) {
      Class240_Sub27 var2 = Class47_Sub1.method3496(Class326.aClass326_6310, client.gameConnectionHandler.aClass528_3433, 1917447504);
      int var3 = (var2.aClass240_Sub8_Sub1_7370.index += -2043502829) * 964952859;
      var2.aClass240_Sub8_Sub1_7370.putByte(this.aClass491_10093.getLanguageID(706291033), -2062961784);
      var2.aClass240_Sub8_Sub1_7370.putString(this.aString_10094, (byte)-100);
      var2.aClass240_Sub8_Sub1_7370.method4463(this.anInt_10095 * -474550737, -402345291);
      var2.aClass240_Sub8_Sub1_7370.putString(Class288.aString_4828, (byte)-18);
      var2.aClass240_Sub8_Sub1_7370.method4521(964952859 * var2.aClass240_Sub8_Sub1_7370.index - var3, -907432342);
      client.gameConnectionHandler.addPacket(var2, 911861882);
   }

   Class633(Class491 var1, String var2, int var3) {
      this.aClass491_10093 = var1;
      this.aString_10094 = var2;
      this.anInt_10095 = 2081364175 * var3;
   }

   public static void method6702(int var0) {
      CacheNodeArrayList var1 = PlayerComposite.longTermPlayerCache;
      synchronized(PlayerComposite.longTermPlayerCache) {
         PlayerComposite.longTermPlayerCache.method6669(-1192171966);
      }

      var1 = PlayerComposite.playerModelCache;
      synchronized(PlayerComposite.playerModelCache) {
         PlayerComposite.playerModelCache.method6669(1886639561);
      }
   }

   static final void method6703(RSInterfaceData var0, byte var1) {
      var0.intTypeIndex -= -1416056414;
      Class301.method3823(var0.intTypes[var0.intTypeIndex * -831324111], var0.intTypes[var0.intTypeIndex * -831324111 + 1], 0, -1619534047);
   }

   static final void method6704(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, byte var3) {
      String var4 = (String)var2.stringData[(var2.stringDataIndex -= -1828074049) * 863838783];
      if(Class557.extractInterfaceIntData(var4, var2, 1467942184) != null) {
         var4 = var4.substring(0, var4.length() - 1);
      }

      var0.anObjectArray_2414 = Class133.extractInterfaceData(var4, var2, (byte)6);
      var0.aBoolean_2524 = true;
   }
}
