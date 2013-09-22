
public class Class143 {

   OGL3DTexture anOGLTexture_Sub4_2674 = null;
   static final int anInt_2675 = 128;
   static final int anInt_2676 = 128;
   static Object anObject_2677;
   boolean supports3DTextures;
   OGLTexture_Sub3[] anOGLTexture_Sub3Array_2679 = null;
   OGL3DTexture anOGLTexture_Sub4_2680 = null;
   static Object anObject_2681;
   OGL3DTexture anOGLTexture_Sub4_2682 = null;
   static final int anInt_2683 = 16;
   OGLTexture_Sub3[] anOGLTexture_Sub3Array_2684 = null;
   static final int anInt_2685 = 4000;
   static Object anObject_2686;


   static void method1813(OpenGLRenderer var0) {
      byte[] var2;
      if(anObject_2681 == null) {
         Class333_Sub1_Sub2 var1 = new Class333_Sub1_Sub2();
         var2 = var1.method1150(128, 128, 16);
         anObject_2681 = Class89.method1184(var2, false, (short)-3600);
      }

      if(anObject_2677 == null) {
         Class333_Sub2_Sub1 var3 = new Class333_Sub2_Sub1();
         var2 = var3.method557(128, 128, 16);
         anObject_2677 = Class89.method1184(var2, false, (short)-16668);
      }

      Class145 var4 = var0.aClass145_10328;
      if(var4.method1817() && anObject_2686 == null) {
         var2 = Class245.method3138(128, 128, 16, 8, new Class242_Sub1(419684), 4.0F, 4.0F, 16.0F, 0.5F, 0.6F);
         anObject_2686 = Class89.method1184(var2, false, (short)24899);
      }

   }

   Class143(OpenGLRenderer var1) {
      this.supports3DTextures = var1.supports3DTextures;
      method1813(var1);
      if(!this.supports3DTextures) {
         this.anOGLTexture_Sub3Array_2679 = new OGLTexture_Sub3[16];

         int var2;
         byte[] var3;
         for(var2 = 0; var2 < 16; ++var2) {
            var3 = Class623.method6643(anObject_2681, var2 * '\u8000', '\u8000', 1453969503);
            this.anOGLTexture_Sub3Array_2679[var2] = new OGLTexture_Sub3(var1, 3553, Class136.aClass136_2628, Class87.aClass87_1759, 128, 128, true, var3, Class136.aClass136_2628, false);
         }

         this.anOGLTexture_Sub3Array_2684 = new OGLTexture_Sub3[16];

         for(var2 = 0; var2 < 16; ++var2) {
            var3 = Class623.method6643(anObject_2677, var2 * '\u8000', '\u8000', 1453969503);
            this.anOGLTexture_Sub3Array_2684[var2] = new OGLTexture_Sub3(var1, 3553, Class136.aClass136_2628, Class87.aClass87_1759, 128, 128, true, var3, Class136.aClass136_2628, false);
         }
      } else {
         byte[] var5 = Class41.method340(anObject_2681, false, (byte)3);
         this.anOGLTexture_Sub4_2680 = new OGL3DTexture(var1, Class136.aClass136_2628, Class87.aClass87_1759, 128, 128, 16, var5, Class136.aClass136_2628);
         var5 = Class41.method340(anObject_2677, false, (byte)19);
         this.anOGLTexture_Sub4_2682 = new OGL3DTexture(var1, Class136.aClass136_2628, Class87.aClass87_1759, 128, 128, 16, var5, Class136.aClass136_2628);
         Class145 var6 = var1.aClass145_10328;
         if(var6.method1817()) {
            var5 = Class41.method340(anObject_2686, false, (byte)15);
            this.anOGLTexture_Sub4_2674 = new OGL3DTexture(var1, Class136.aClass136_2625, Class87.aClass87_1759, 128, 128, 16);
            OGL3DTexture var4 = new OGL3DTexture(var1, Class136.aClass136_2631, Class87.aClass87_1759, 128, 128, 16, var5, Class136.aClass136_2631);
            if(!var6.method1816(this.anOGLTexture_Sub4_2674, var4, 2.0F)) {
               this.anOGLTexture_Sub4_2674.method1851();
               this.anOGLTexture_Sub4_2674 = null;
            } else {
               this.anOGLTexture_Sub4_2674.method1845();
            }

            var4.method1851();
         }
      }

   }
}
