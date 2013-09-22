
public class Class21 {

   int anInt_192;
   int rotation;
   int anInt_194;
   boolean aBoolean_195;
   boolean aBoolean_196;
   public static int anInt_197;


   static void method124(int var0, int var1, int var2, int var3, int var4, int var5, int var6, Class240_Sub22_Sub1 var7, FontRenderer var8, RSFont var9, int var10, int var11, byte var12) {
      if(var0 > var2 && var0 < var4 + var2 && var1 > var6 - 915612327 * var9.anInt_8573 - 1 && var1 < var6 + var9.anInt_8571 * 2080531379) {
         var10 = var11;
      }

      String var13 = Class500.method5833(var7, -1863823458);
      var8.method1073(var13, 3 + var2, var6, var10, 0, client.aRandom_383, ServerInputStream.anInt_4375 * -324359965, Class20.imgNameIcons, Class90.furthestPositions, (byte)79);
   }

   static boolean method125(int var0, int var1, byte var2) {
      return var1 >= 1000 && var0 < 1000?true:(var1 < 1000 && var0 < 1000?(Class366.method4663(var0, (byte)24)?true:!Class366.method4663(var1, (byte)40)):var1 >= 1000 && var0 >= 1000);
   }

   public static boolean method126(int var0, byte var1) {
      return 1 != var0 && var0 != 7;
   }

   public static void method127(int var0) {
      RSInterface.spriteCache.method6669(546539815);
      RSInterface.aClass627_2423.method6669(-220371468);
      RSInterface.aClass627_2412.method6669(858089827);
      RSInterface.aClass627_2422.method6669(674912857);
   }

   static boolean method128(int var0) {
      return null != client.aByteArray_595?Class520.method5967((byte)4):(-1 != Class11.anInt_105 * 1674910981?Class336.method4162(-1060533527):Class557.method6152(Class11.aString_92, Class11.aString_93, (byte)95));
   }

   static final void method129(RSInterfaceData var0, byte var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      Class240_Sub41_Sub5.method625(var3, var4, var0, 1887619698);
   }

   public static void method130(String var0, int var1) {
      if(client.aBoolean_463 && (1458447745 * Class286.anInt_4823 & 24) != 0) {
         boolean found = false;
         int var3 = Class15.availablePlayers * -688404505;
         int[] var4 = Class15.playersIndices;

         for(int var5 = 0; var5 < var3; ++var5) {
            Player var6 = client.aPlayerArray[var4[var5]];
            if(var6.playerName != null && var6.playerName.equalsIgnoreCase(var0) && (var6 == Class521.myPlayer && (Class286.anInt_4823 * 1458447745 & 16) != 0 || 0 != (1458447745 * Class286.anInt_4823 & 8))) {
               Class240_Sub27 var7 = Class47_Sub1.method3496(Class326.aClass326_6243, client.gameConnectionHandler.aClass528_3433, 1917447504);
               var7.aClass240_Sub8_Sub1_7370.method4507(-315969483 * client.anInt_543, -1828074049);
               var7.aClass240_Sub8_Sub1_7370.method4507(client.anInt_279 * 1440987389, -1828074049);
               var7.aClass240_Sub8_Sub1_7370.method4463(var4[var5], -1266646550);
               var7.aClass240_Sub8_Sub1_7370.putByte(0, 1371670033);
               var7.aClass240_Sub8_Sub1_7370.method4514(Class283_Sub3.anInt_7897 * 2036107931, 808346398);
               client.gameConnectionHandler.addPacket(var7, 1796842072);
               Class9.putFlag(var6.tilePosArrayX[0], var6.tilePosArrayY[0], 1175025470);
               found = true;
               break;
            }
         }

         if(!found) {
            Class321.method3960(4, ServerString.unableToFindStr.getText(Class599.clientLanguage, 1759120581) + var0, 10182864);
         }

         if(client.aBoolean_463) {
            Class537.method6073(-700479267);
         }

      }
   }

   static String method131(RSInterface var0, int var1) {
      return client.method174(var0).method4993((byte)-67) == 0?null:(null != var0.aString_2540 && var0.aString_2540.trim().length() != 0?var0.aString_2540:(client.aBoolean_365?"Hidden-use":null));
   }

   static final void method132(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = client.aBoolean_422?1:0;
   }
}
