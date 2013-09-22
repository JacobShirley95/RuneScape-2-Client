
public class Class245 {

   static void method3136(int var0, int var1, int var2, int var3, Class242 var4, float var5, float var6, float var7, float var8, float var9, byte[] var10, int var11) {
      for(int var12 = 0; var12 < var2; ++var12) {
         method3137(var12, var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
         var11 += var0 * var1;
      }

   }

   static void method3137(int var0, int var1, int var2, int var3, int var4, Class242 var5, float var6, float var7, float var8, float var9, float var10, byte[] var11, int var12) {
      int var13 = var1 * var2;
      float[] var14 = new float[var13];

      int var15;
      int var16;
      for(var15 = 0; var15 < var4; ++var15) {
         var16 = var12;
         var5.method3112(var0, var1, var2, var3, var6 / (float)var1, var7 / (float)var2, var8 / (float)var3, var9 * 127.0F, var14, 0);

         for(int var17 = 0; var17 < var13; ++var17) {
            var11[var16] = (byte)((int)((float)var11[var16] + var14[var17]));
            ++var16;
         }

         var6 *= 2.0F;
         var7 *= 2.0F;
         var8 *= 2.0F;
         var9 *= var10;
      }

      var15 = var12;

      for(var16 = 0; var16 < var13; ++var16) {
         var11[var15] = (byte)(var11[var15] + 127);
         ++var15;
      }

   }

   public static byte[] method3138(int var0, int var1, int var2, int var3, Class242 var4, float var5, float var6, float var7, float var8, float var9) {
      byte[] var10 = new byte[var0 * var1 * var2];
      method3136(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, 0);
      return var10;
   }

   Class245() throws Throwable {
      throw new Error();
   }
}
