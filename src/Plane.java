
public abstract class Plane {

   public final int[][] anIntArrayArray_3029;
   public final int maxHeight;
   public final int anInt_3031;
   public final int shiftAmount;
   public final int maxWidth;


   public abstract void method2149(int var1, int var2, int var3);

   public abstract void define(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, Class105 var11, boolean var12);

   public abstract void method2151(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, int[] var11, int[] var12, int[] var13, Class105 var14, boolean var15);

   public abstract void method2152(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean[][] var8);

   public abstract void method2153();

   public final int getHeight(int var1, int var2) {
      int var4 = var1 >> this.shiftAmount * 1694172417;
      int var5 = var2 >> this.shiftAmount * 1694172417;
      if(var4 >= 0 && var5 >= 0 && var4 <= this.maxWidth * 1658489349 - 1 && var5 <= this.maxHeight * 445373459 - 1) {
         int var6 = var1 & this.anInt_3031 * 69671577 - 1;
         int var7 = var2 & 69671577 * this.anInt_3031 - 1;
         int var8 = var6 * this.anIntArrayArray_3029[1 + var4][var5] + (this.anInt_3031 * 69671577 - var6) * this.anIntArrayArray_3029[var4][var5] >> this.shiftAmount * 1694172417;
         int var9 = this.anIntArrayArray_3029[var4][var5 + 1] * (69671577 * this.anInt_3031 - var6) + this.anIntArrayArray_3029[1 + var4][var5 + 1] * var6 >> this.shiftAmount * 1694172417;
         return var7 * var9 + var8 * (69671577 * this.anInt_3031 - var7) >> this.shiftAmount * 1694172417;
      } else {
         return 0;
      }
   }

   public final int method2155(int var1, int var2, short var3) {
      return this.anIntArrayArray_3029[var1][var2];
   }

   public abstract Class240_Sub22_Sub7 method2156(int var1, int var2, Class240_Sub22_Sub7 var3);

   public abstract void method2157(Class240_Sub22_Sub7 var1, int var2, int var3, int var4, int var5, boolean var6);

   public abstract void method2158(Class240_Sub22_Sub7 var1, int var2, int var3, int var4, int var5, boolean var6);

   public abstract boolean method2159(Class240_Sub22_Sub7 var1, int var2, int var3, int var4, int var5, boolean var6);

   public abstract void method2160(Class240_Sub53 var1, int[] var2);

   public abstract void method2161(int var1, int var2, int var3, boolean[][] var4, boolean var5, int var6);

   Plane(int var1, int var2, int var3, int[][] var4) {
      this.maxWidth = 1567142605 * var1;
      this.maxHeight = 323374619 * var2;

      int var5;
      for(var5 = 0; var3 > 1; var3 >>= 1) {
         ++var5;
      }

      this.anInt_3031 = (1 << var5) * 1171954089;
      this.shiftAmount = -333579519 * var5;
      this.anIntArrayArray_3029 = var4;
   }

   static void method2162(RSInterfaceData var0, byte var1) {
      var0.intTypes[var0.intTypeIndex * -831324111 - 1] = HintMarker.aClass583_3709.method6327(var0.intTypes[var0.intTypeIndex * -831324111 - 1], 884188461).anInt_9571 * 1433837549;
   }

   static void method2163(Class521 var0, short var1) {
      Class3.aClass521_22 = var0;
   }

   static boolean method2164(int var0, byte var1) {
      return var0 == 13 || var0 == 14 || var0 == 10 || 11 == var0 || 12 == var0;
   }

   public static final void method2165(int var0, byte var1) {
      for(int var2 = 0; var2 < 5; ++var2) {
         client.aBooleanArray_548[var2] = false;
      }

      client.anInt_400 = 1150192039;
      client.anInt_408 = 1040489835;
      Class304.anInt_6021 = 0;
      FontUnpacker.anInt_6466 = 0;
      Class102.anInt_1968 = -1061791373;
      Class571.anInt_9652 = -1694464327;
      Class509.anInt_9182 = var0 * -597020693;
      if(2 != 1735950531 * Class509.anInt_9182) {
         Class293.aLong_5923 = 0L;
      }

   }

   static int method2166(int var0, int var1, int var2) {
      return var0 != -1965975883 * Class495.aClass495_9040.anInt_9062 && var0 != -1965975883 * Class495.aClass495_9042.anInt_9062?Class563_Sub1_Sub5_Sub2.anIntArray_7969[var1 & 3]:Class563_Sub1_Sub5_Sub2.anIntArray_7973[var1 & 3];
   }

   static void method2167(int var0, int var1, int var2) {
      Class240_Sub22_Sub5 var3 = Class65_Sub1_Sub2.method866(5, (long)var0);
      var3.method596((byte)103);
      var3.anInt_1175 = var1 * 134353971;
   }
}
