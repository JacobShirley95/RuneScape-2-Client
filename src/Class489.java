
public final class Class489 {

   static int anInt_9003;


   Class489() throws Throwable {
      throw new Error();
   }

   public static void method5746(int[] var0, Object[] var1, int var2) {
      Class522.method5976(var0, var1, 0, var0.length - 1, (byte)119);
   }

   public static void method5747(int var0, int var1, int var2, int var3) {
      if(Class48.aClass123_1020 != null && Class48.aClass123_1020.method1566((byte)103) && var0 == -1216432127 * Class48.aClass123_1020.anInt_2266) {
         Class87.method1142(Class48.aClass123_1020, var1, (byte)118);
         Class217.anInt_3752 = var0 * -255660039;
         Class48.aClass123_1020 = null;
         Class217.aClass240_Sub41_Sub2_3755 = null;
         Class240_Sub27 var4 = Class47_Sub1.method3496(Class326.aClass326_6222, client.gameConnectionHandler.aClass528_3433, 1917447504);
         var4.aClass240_Sub8_Sub1_7370.putIntBE(-1, 2062892803);
         client.gameConnectionHandler.addPacket(var4, 1608268361);
      } else {
         var1 = var1 * Class104_Sub21.renderSettings.aClass540_Sub14_7323.method1701(-1020103215) >> 8;
         if(-1 == var0 && !Class217.aBoolean_3748) {
            Class586.method6365((short)353);
         } else if(-1 != var0 && (var0 != -528571831 * Class217.anInt_3752 || !Class220.method2769((byte)20)) && 0 != var1 && !Class217.aBoolean_3748) {
            Class584.method6343(var2, GraphicsDataHolder.aCacheUnpacker_9212, var0, 0, var1, false, new Class110_Sub1(), -242632388);
            Class134.method1792(1761745705);
         }

         if(-528571831 * Class217.anInt_3752 != var0) {
            Class217.aClass240_Sub41_Sub2_3755 = null;
         }

         Class217.anInt_3752 = -255660039 * var0;
         Class217.aClass321_3746 = null;
      }

   }
}
