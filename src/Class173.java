
public class Class173 {

   final Class96 aClass96_3042;
   final OpenGLRenderer aRenderer_Sub2_3043;
   final CacheNodeArrayList aClass627_3044 = new CacheNodeArrayList(6291456, 256);


   OGLTexture_Sub3 method2176(Class183 var1, int var2) {
      OGLTexture_Sub3 var3 = (OGLTexture_Sub3)this.aClass627_3044.getObject((long)(var1.anInt_3146 * -534969509));
      if(var3 != null) {
         return var3;
      } else if(!this.method2178(var1, var2)) {
         return null;
      } else {
         if(var2 == -1) {
            var2 = var1.anInt_3112 * -1446355517;
         }

         OGLTexture_Sub3 var5;
         if(var1.aBoolean_3141 && this.aRenderer_Sub2_3043.method1989()) {
            float[] var6 = this.aClass96_3042.method1253(var1.anInt_3146 * -534969509, 0.7F, var2, var2, false, (byte)5);
            var5 = new OGLTexture_Sub3(this.aRenderer_Sub2_3043, 3553, Class136.aClass136_2625, Class87.aClass87_1766, var2, var2, var1.aByte_3143 != 0, var6, Class136.aClass136_2625);
         } else {
            int[] var4;
            if(var1.aClass620_3153 != Class620.aClass620_10022 && Class21.method126(var1.aByte_3169, (byte)83)) {
               var4 = this.aClass96_3042.method1251(var1.anInt_3146 * -534969509, 0.7F, var2, var2, true, -791644240);
            } else {
               var4 = this.aClass96_3042.method1257(var1.anInt_3146 * -534969509, 0.7F, var2, var2, false, (byte)1);
            }

            var5 = new OGLTexture_Sub3(this.aRenderer_Sub2_3043, 3553, var2, var2, var1.aByte_3143 != 0, var4, 0, 0, false);
         }

         var5.method5442(var1.aByte_3154 == 1, var1.aByte_3111 == 1);
         this.aClass627_3044.insert(var5, (long)(var1.anInt_3146 * -534969509), var2 * var2, -1036155501);
         return var5;
      }
   }

   OGLTexture_Sub3 method2177(Class183 var1) {
      return this.method2176(var1, var1.anInt_3112 * -1446355517);
   }

   Class173(OpenGLRenderer var1, Class96 var2) {
      this.aRenderer_Sub2_3043 = var1;
      this.aClass96_3042 = var2;
   }

   boolean method2178(Class183 var1, int var2) {
      if(var2 == -1) {
         var2 = var1.anInt_3112 * -1446355517;
      }

      return var1.aBoolean_3141 && this.aRenderer_Sub2_3043.method1989()?this.aClass96_3042.method1263(var1.anInt_3146 * -534969509, Class610.aClass610_9946, 0.7F, var2, var2, false, (byte)84):(var1.aClass620_3153 != Class620.aClass620_10022 && Class21.method126(var1.aByte_3169, (byte)108)?this.aClass96_3042.method1263(var1.anInt_3146 * -534969509, Class610.aClass610_9944, 0.7F, var2, var2, true, (byte)84):this.aClass96_3042.method1263(var1.anInt_3146 * -534969509, Class610.aClass610_9945, 0.7F, var2, var2, false, (byte)106));
   }

   void method2179() {
      this.aClass627_3044.method6677(5, -1810780707);
   }

   void method2180() {
      this.aClass627_3044.method6669(-958114737);
   }
}
