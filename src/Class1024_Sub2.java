
public class Class1024_Sub2 extends Class1024 {

   final Class384 aClass384_10776;


   Class1024_Sub2(Renderer_Sub3 var1, int var2, int var3, int[] var4) {
      this.aClass384_10776 = var1.method7297(var2, var3, false, var4);
      this.aClass384_10776.method4869(false, false);
   }

   Class1024_Sub2(Renderer_Sub3 var1, int var2, int var3, byte[] var4) {
      this.aClass384_10776 = var1.method7215(Class136.aClass136_2626, var2, var3, false, var4);
      this.aClass384_10776.method4869(false, false);
   }

   static Class1024_Sub2 create(Renderer_Sub3 var0, int var1, int var2, int[] var3, int[] var4) {
      int var6;
      int var7;
      int var8;
      if(var0.method7212(Class136.aClass136_2626, Class87.aClass87_1759)) {
         byte[] emptyMM = new byte[var1 * var2];

         for(var6 = 0; var6 < var2; ++var6) {
            var7 = var6 * var1 + var3[var6];

            for(var8 = 0; var8 < var4[var6]; ++var8) {
               emptyMM[var7++] = -1;
            }
         }

         return new Class1024_Sub2(var0, var1, var2, emptyMM);
      } else {
         int[] var5 = new int[var1 * var2];

         for(var6 = 0; var6 < var2; ++var6) {
            var7 = var6 * var1 + var3[var6];

            for(var8 = 0; var8 < var4[var6]; ++var8) {
               var5[var7++] = -16777216;
            }
         }

         return new Class1024_Sub2(var0, var1, var2, var5);
      }
   }
}
