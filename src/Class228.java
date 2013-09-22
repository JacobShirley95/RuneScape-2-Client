
public abstract class Class228 {

   static CacheDataUnpacker aCacheUnpacker_3936;
   public static int anInt_3937;


   final int method2898(long var1) {
      long var3 = this.method2902(1632588460);
      if(var3 > 0L) {
         RSInterface.method1724(var3);
      }

      return this.method2900(var1);
   }

   abstract void method2899(int var1);

   abstract int method2900(long var1);

   abstract long method2901(byte var1);

   abstract long method2902(int var1);

   public static final int method2903(int var0, int var1, int var2, byte var3) {
      if(var2 > 243) {
         var1 >>= 4;
      } else if(var2 > 217) {
         var1 >>= 3;
      } else if(var2 > 192) {
         var1 >>= 2;
      } else if(var2 > 179) {
         var1 >>= 1;
      }

      return (var2 >> 1) + ((var0 & 255) >> 2 << 10) + (var1 >> 5 << 7);
   }

   public static void method2904(CacheDataUnpacker var0, int var1, int var2, int var3, boolean var4, Class240_Sub41_Sub2 var5, byte var6) {
      Class243.method3122(var0, var1, var2, var3, var4, (byte)-34);
      Class123.aClass240_Sub41_Sub2_2276 = var5;
   }

   static final void method2905(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, int var3) {
      var0.aBoolean_2450 = var2.intTypes[(var2.intTypeIndex -= -708028207) * -831324111] == 1;
   }

   static void method2906(int var0, boolean var1, int var2) {
      Class240_Sub22_Sub5 var3 = Class65_Sub1_Sub2.method866(22, (long)var0);
      var3.method596((byte)106);
      var3.anInt_1175 = 134353971 * (var1?1:0);
   }
}
