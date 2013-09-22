
public class Class231_Sub6 extends Class231 {

   int anInt_8280;
   int anInt_8281;
   int anInt_8282;
   int anInt_8283;
   int anInt_8284;
   int anInt_8285;
   String aString_8286;


   static void method5368(String var0, String var1, String var2, boolean var3, boolean var4, int var5) {
      ConnectionHandler var6 = Class32.method230(-107931806);
      if(var6.getServerConnection() != null) {
         Class240_Sub27 var7 = Class47_Sub1.method3496(Class326.aClass326_6307, var6.aClass528_3433, 1917447504);
         var7.aClass240_Sub8_Sub1_7370.method4463(Class258.method3383(var0, -371245318) + Class258.method3383(var1, -246477669) + Class258.method3383(var2, -466525533) + 1, 1438401568);
         var7.aClass240_Sub8_Sub1_7370.putString(var0, (byte)-97);
         var7.aClass240_Sub8_Sub1_7370.putString(var1, (byte)-57);
         var7.aClass240_Sub8_Sub1_7370.putString(var2, (byte)-36);
         int var8 = 0;
         if(var3) {
            var8 |= 1;
         }

         if(var4) {
            var8 |= 2;
         }

         var7.aClass240_Sub8_Sub1_7370.putByte(var8, -2068944146);
         var6.addPacket(var7, 193517799);
      }

   }

   static final void method5369(RSInterfaceData var0, byte var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class305.method3841(var3, var4, var0, (byte)1);
   }

   public static void method5370(int var0, int var1) {
      Class240_Sub22_Sub5 var2 = Class65_Sub1_Sub2.method866(21, (long)var0);
      var2.method597((byte)0);
   }

   static void method5371(int var0, String var1, int var2) {
      Class240_Sub22_Sub5 var3 = Class65_Sub1_Sub2.method866(2, (long)var0);
      var3.method596((byte)66);
      var3.aString_1181 = var1;
   }
}
