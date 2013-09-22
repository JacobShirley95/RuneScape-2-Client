import java.math.BigInteger;

public class Class16 {

   public static final BigInteger aBigInteger_134 = new BigInteger("93a019fd12a03dcab1426b8478029904c5604a01ee5b2c05a24eaa60d7387bf523648eff95731e3bc22403bb013f332c93898d4207bb3e5bb5aaa8cd29a7ce33367b85d263637b14d290c2f798a6a896a846abd8f5da1dccf6f81954f310bb33f40c54b5d4e8f511c611c7bfdeeca1342964d4abfdfd21e7fc5911a7485e05139d9bb4e35890de9534bfcaf61317bbb3fdc354c3f7882a0dd478666ad50b6838e4e1b4645e117fde49a6a10152bae207e5d1bbd999d7167f579dda045616fa84e6296f212985d9841170d131fbda1fca3e1956f8a3331740ed1f36c6559308fc4a7e955965e9e46ecd0466fe268ebc053725dab02ce86b0916af02e86e34ab0a95830e9056cdd70922cc948173863559f59dd9b9e348c59d4f14dfb768aa93593ecb99faba5c299d999c7b1216e4e33e30e2a888e2e94b2760dcaf41e49770b67ea315ad02990794385e2485a4e3fad9e8c8a2d50b88de0ac7376417d520832a65cb44fd90cc70736c742ba4d322c12b3156a4d4e6018990f9355246744b967b1b069ea11abcf3f498e498d282f9d09d0b7dee62f2bd694b7438aaeb61ece1603a85bd8d6d52d5afd3a3cfa5d181c738c83fec7b8fb2d7811597f9acc3bcb248e368a08c0bcb7373a626df964110e401c9aa95b21a488fff8b2d1c344060c6a8fac551015d0a08fbb4b61b3c6f10b28d9c92a1199f222606f1b9d43e1f84728d", 16);
   static final BigInteger aBigInteger_135 = new BigInteger("8f513cc336cf9fb3338dc05ba090f0b4cfd1a88470c86589e95f035b3b17120f945d1fe26e4134347babff8073e08dd9a754368cff18faf1f8a4c01b43dfef87", 16);
   public static final BigInteger aBigInteger_136 = new BigInteger("10001", 16);
   static final BigInteger aBigInteger_137 = new BigInteger("10001", 16);


   static {
      new BigInteger("10001", 16);
      new BigInteger("8c4f1f2466e11182ee999c47f7d3785943b46a0c36ef1fd2bcb02560969437c037f9c07c8b541c057ca1160381eecd91dc34159f5a483af1697e7e7d37cf1269", 16);
   }

   Class16() throws Throwable {
      throw new Error();
   }

   static void method87(int var0) {
      Class134.anInt_2617 = 0;
      NodeList.aClass240_Sub35_9068 = null;
      Class540_Sub20.aClass312_6336 = null;
      ConnectionUpdate.aCacheUnpacker_119 = null;
      Class123.aClass240_Sub41_Sub2_2276 = null;
   }

   static final void method88(RSInterfaceData var0, int var1) {
      var0.intTypeIndex -= -2124084621;
      int var2 = var0.intTypes[-831324111 * var0.intTypeIndex];
      int var3 = var0.intTypes[1 + -831324111 * var0.intTypeIndex];
      int var4 = var0.intTypes[var0.intTypeIndex * -831324111 + 2];
      RSInterface var5 = RSServerQueue.getInterface(var4, (byte)105);
      Class240_Sub52_Sub11.method644(var5, var2, var3, 1999362003);
   }

   static final void method89(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class240_Sub41_Sub3.aClass23_1024.method137(var2, -1709683416);
   }

   static void method90(RSCharacter var0, byte var1) {
      if(var0 instanceof NPC) {
         NPC var2 = (NPC)var0;
         if(var2.npcComposite != null) {
            Class397.addToOptionList(var2, var2.plane != Class521.myPlayer.plane, (byte)25);
         }
      } else if(var0 instanceof Player) {
         Player var3 = (Player)var0;
         Class104_Sub16.addPlayerToOptionsList(var3, var3.plane != Class521.myPlayer.plane, (byte)-26);
      }

   }
}
