
public final class RSServer {

   public volatile int serverPing = 1897065301;
   volatile String serverAddress;
   public static short[] aShortArray_9662;


   RSServer(String var1) {
      this.serverAddress = var1;
   }

   static final void method6290(RSInterfaceData var0, byte var1) {
      var0.intTypeIndex -= -2124084621;
      int var2 = var0.intTypes[var0.intTypeIndex * -831324111];
      int var3 = var0.intTypes[var0.intTypeIndex * -831324111 + 1];
      int var4 = var0.intTypes[-831324111 * var0.intTypeIndex + 2];
      Class598.method6476(10, var2 << 16 | var3, var4, "", -1898494081);
   }

   public static void method6291(String var0, int var1) {
      Class194.aString_3361 = var0;
      Class194.anInt_3363 = Class194.aString_3361.length() * 1782055083;
   }
}
