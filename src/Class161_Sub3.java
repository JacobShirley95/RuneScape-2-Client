import jaggl.OpenGL;

public class Class161_Sub3 extends Class161 {

   static final float[] aFloatArray_8533 = new float[4];
   static final char aChar_8534 = '\u0001';
   Class150 aClass150_8535;
   Class143 aClass143_8536;
   static final char aChar_8537 = '\u0000';


   boolean method1883() {
      return true;
   }

   void method1882(int var1, int var2) {
      float var3 = -5.0E-4F * (float)((var1 & 3) + 1);
      float var4 = 5.0E-4F * (float)((var1 >> 3 & 3) + 1);
      float var5 = (var1 & 64) == 0?4.8828125E-4F:9.765625E-4F;
      boolean var6 = (var1 & 128) != 0;
      this.aRenderer_Sub2_2792.setTexture(1);
      if(var6) {
         aFloatArray_8533[0] = var5;
         aFloatArray_8533[1] = 0.0F;
         aFloatArray_8533[2] = 0.0F;
         aFloatArray_8533[3] = 0.0F;
      } else {
         aFloatArray_8533[0] = 0.0F;
         aFloatArray_8533[1] = 0.0F;
         aFloatArray_8533[2] = var5;
         aFloatArray_8533[3] = 0.0F;
      }

      OpenGL.glTexGenfv(8192, 9474, aFloatArray_8533, 0);
      aFloatArray_8533[0] = 0.0F;
      aFloatArray_8533[1] = var5;
      aFloatArray_8533[2] = 0.0F;
      aFloatArray_8533[3] = (float)this.aRenderer_Sub2_2792.lastCleanup * var3 % 1.0F;
      OpenGL.glTexGenfv(8193, 9474, aFloatArray_8533, 0);
      if(!this.aClass143_8536.supports3DTextures) {
         int var7 = (int)(var4 * (float)this.aRenderer_Sub2_2792.lastCleanup * 16.0F);
         this.aRenderer_Sub2_2792.setTextureRenderer(this.aClass143_8536.anOGLTexture_Sub3Array_2684[var7 % 16]);
      } else {
         aFloatArray_8533[0] = 0.0F;
         aFloatArray_8533[1] = 0.0F;
         aFloatArray_8533[2] = 0.0F;
         aFloatArray_8533[3] = (float)this.aRenderer_Sub2_2792.lastCleanup * var4 % 1.0F;
         OpenGL.glTexGenfv(8194, 9473, aFloatArray_8533, 0);
      }

      this.aRenderer_Sub2_2792.setTexture(0);
   }

   void method1881(boolean var1) {}

   void method1884() {
      this.aClass150_8535.method1832('\u0001');
      this.aRenderer_Sub2_2792.setTexture(1);
      this.aRenderer_Sub2_2792.setTextureRenderer((OGLTexture)null);
      this.aRenderer_Sub2_2792.setTexture(0);
   }

   void method1880(boolean var1) {
      this.aClass150_8535.method1832('\u0000');
      if(this.aClass143_8536.supports3DTextures) {
         this.aRenderer_Sub2_2792.setTexture(1);
         this.aRenderer_Sub2_2792.setTextureRenderer(this.aClass143_8536.anOGLTexture_Sub4_2682);
         this.aRenderer_Sub2_2792.setTexture(0);
      }

   }

   void method1879(OGLTexture var1, int var2) {
      this.aRenderer_Sub2_2792.setTextureRenderer(var1);
      this.aRenderer_Sub2_2792.setTextureEnv(var2);
   }

   Class161_Sub3(OpenGLRenderer var1, Class143 var2) {
      super(var1);
      this.aClass143_8536 = var2;
      this.aClass150_8535 = new Class150(var1, 2);
      this.aClass150_8535.method1831(0);
      this.aRenderer_Sub2_2792.setTexture(1);
      if(this.aClass143_8536.supports3DTextures) {
         OpenGL.glTexGeni(8194, 9472, 9217);
         OpenGL.glEnable(3170);
      }

      OpenGL.glTexGeni(8192, 9472, 9216);
      OpenGL.glTexGeni(8193, 9472, 9216);
      OpenGL.glEnable(3168);
      OpenGL.glEnable(3169);
      this.aRenderer_Sub2_2792.setTexture(0);
      this.aClass150_8535.method1830();
      this.aClass150_8535.method1831(1);
      this.aRenderer_Sub2_2792.setTexture(1);
      if(this.aClass143_8536.supports3DTextures) {
         OpenGL.glDisable(3170);
      }

      OpenGL.glDisable(3168);
      OpenGL.glDisable(3169);
      this.aRenderer_Sub2_2792.setTexture(0);
      this.aClass150_8535.method1830();
   }
}
