import jaggl.OpenGL;

public class Class161_Sub8 extends Class161 {

   final Class143 aClass143_11126;
   static final char aChar_11127 = '\u0001';
   static final char aChar_11128 = '\u0000';
   Class150 aClass150_11129;
   OGLTexture_Sub1 anOGLTexture_Sub1_11130;
   static final float[] aFloatArray_11131 = new float[]{0.0F, 0.0F, 0.0F, 0.0F};


   void method1880(boolean var1) {
      if(this.aRenderer_Sub2_2792.anInt_10457 > 0) {
         float var2 = -0.5F / (float)this.aRenderer_Sub2_2792.anInt_10457;
         this.aRenderer_Sub2_2792.setTexture(1);
         aFloatArray_11131[0] = 0.0F;
         aFloatArray_11131[1] = 0.0F;
         aFloatArray_11131[2] = var2;
         aFloatArray_11131[3] = this.aRenderer_Sub2_2792.aFloat_10409 * var2 + 0.25F;
         OpenGL.glPushMatrix();
         OpenGL.glLoadIdentity();
         OpenGL.glTexGenfv(8192, 9474, aFloatArray_11131, 0);
         OpenGL.glPopMatrix();
         this.aRenderer_Sub2_2792.method6985(0.5F, (float)this.aRenderer_Sub2_2792.anInt_10457);
         this.aRenderer_Sub2_2792.setTextureRenderer(this.anOGLTexture_Sub1_11130);
         this.aRenderer_Sub2_2792.setTexture(0);
      }

      this.aClass150_11129.method1832('\u0000');
      OpenGL.glMatrixMode(5890);
      OpenGL.glPushMatrix();
      OpenGL.glScalef(0.25F, 0.25F, 1.0F);
      OpenGL.glMatrixMode(5888);
   }

   void method1881(boolean var1) {
      this.aRenderer_Sub2_2792.setTexEnv(260, 8448);
   }

   void method1884() {
      this.aClass150_11129.method1832('\u0001');
      if(this.aRenderer_Sub2_2792.anInt_10457 > 0) {
         this.aRenderer_Sub2_2792.setTexture(1);
         this.aRenderer_Sub2_2792.setTextureRenderer((OGLTexture)null);
         this.aRenderer_Sub2_2792.method6985(1.0F, 0.0F);
         this.aRenderer_Sub2_2792.setTexture(0);
      }

      this.aRenderer_Sub2_2792.setTexEnv(8448, 8448);
      OpenGL.glMatrixMode(5890);
      OpenGL.glPopMatrix();
      OpenGL.glMatrixMode(5888);
   }

   void method1882(int var1, int var2) {
      if((var1 & 1) == 1) {
         if(this.aClass143_11126.supports3DTextures) {
            this.aRenderer_Sub2_2792.setTextureRenderer(this.aClass143_11126.anOGLTexture_Sub4_2680);
            aFloatArray_11131[0] = 0.0F;
            aFloatArray_11131[1] = 0.0F;
            aFloatArray_11131[2] = 0.0F;
            aFloatArray_11131[3] = (float)(this.aRenderer_Sub2_2792.lastCleanup % 4000) / 4000.0F;
            OpenGL.glTexGenfv(8194, 9473, aFloatArray_11131, 0);
         } else {
            int var3 = this.aRenderer_Sub2_2792.lastCleanup % 4000 * 16 / 4000;
            this.aRenderer_Sub2_2792.setTextureRenderer(this.aClass143_11126.anOGLTexture_Sub3Array_2679[var3]);
         }
      } else if(this.aClass143_11126.supports3DTextures) {
         this.aRenderer_Sub2_2792.setTextureRenderer(this.aClass143_11126.anOGLTexture_Sub4_2680);
         aFloatArray_11131[0] = 0.0F;
         aFloatArray_11131[1] = 0.0F;
         aFloatArray_11131[2] = 0.0F;
         aFloatArray_11131[3] = 0.0F;
         OpenGL.glTexGenfv(8194, 9473, aFloatArray_11131, 0);
      } else {
         this.aRenderer_Sub2_2792.setTextureRenderer(this.aClass143_11126.anOGLTexture_Sub3Array_2679[0]);
      }

   }

   void method1879(OGLTexture var1, int var2) {}

   void method7698() {
      this.aClass150_11129 = new Class150(this.aRenderer_Sub2_2792, 2);
      this.aClass150_11129.method1831(0);
      this.aRenderer_Sub2_2792.setTexture(1);
      this.aRenderer_Sub2_2792.setTexEnv(7681, 260);
      this.aRenderer_Sub2_2792.method7020(0, '\u8578', 768);
      OpenGL.glTexGeni(8192, 9472, 9216);
      OpenGL.glEnable(3168);
      this.aRenderer_Sub2_2792.setTexture(0);
      OpenGL.glTexEnvf(8960, '\u8573', 2.0F);
      if(this.aClass143_11126.supports3DTextures) {
         OpenGL.glTexGeni(8194, 9472, 9217);
         OpenGL.glTexGeni(8195, 9472, 9217);
         OpenGL.glTexGenfv(8195, 9473, new float[]{0.0F, 0.0F, 0.0F, 1.0F}, 0);
         OpenGL.glEnable(3170);
         OpenGL.glEnable(3171);
      }

      this.aClass150_11129.method1830();
      this.aClass150_11129.method1831(1);
      this.aRenderer_Sub2_2792.setTexture(1);
      this.aRenderer_Sub2_2792.setTexEnv(8448, 8448);
      this.aRenderer_Sub2_2792.method7020(0, 5890, 768);
      OpenGL.glDisable(3168);
      this.aRenderer_Sub2_2792.setTexture(0);
      OpenGL.glTexEnvf(8960, '\u8573', 1.0F);
      if(this.aClass143_11126.supports3DTextures) {
         OpenGL.glDisable(3170);
         OpenGL.glDisable(3171);
      }

      this.aClass150_11129.method1830();
   }

   Class161_Sub8(OpenGLRenderer var1, Class143 var2) {
      super(var1);
      this.aClass143_11126 = var2;
      this.method7698();
      this.anOGLTexture_Sub1_11130 = new OGLTexture_Sub1(this.aRenderer_Sub2_2792, Class136.aClass136_2626, Class87.aClass87_1759, 2, new byte[]{(byte)0, (byte)-1}, Class136.aClass136_2626);
      this.anOGLTexture_Sub1_11130.method5410(false);
   }

   boolean method1883() {
      return true;
   }
}
