
public class Class1024_Sub1 extends Class1024 {

   final OGLTexture_Sub3_Sub1 anOGLTexture_Sub3_Sub1_10747;


   static Class1024_Sub1 createBlankImage(OpenGLRenderer var0, int var1, int var2, int[] var3, int[] var4) {
      byte[] var5 = new byte[var1 * var2];

      for(int var6 = 0; var6 < var2; ++var6) {
         int var7 = var6 * var1 + var3[var6];

         for(int var8 = 0; var8 < var4[var6]; ++var8) {
            var5[var7++] = -1;
         }
      }

      return new Class1024_Sub1(var0, var1, var2, var5);
   }

   Class1024_Sub1(OpenGLRenderer var1, int var2, int var3, byte[] var4) {
      this.anOGLTexture_Sub3_Sub1_10747 = OGLTexture_Sub3_Sub1.method1212(var1, Class136.aClass136_2626, Class87.aClass87_1759, var2, var3, false, var4, Class136.aClass136_2626);
      this.anOGLTexture_Sub3_Sub1_10747.method5442(false, false);
   }
}
