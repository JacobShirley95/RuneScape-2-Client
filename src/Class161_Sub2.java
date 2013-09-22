import jaggl.OpenGL;

public class Class161_Sub2 extends Class161 {

   boolean aBoolean_8392 = false;
   static final char aChar_8393 = '\u0001';
   static final char aChar_8394 = '\u0000';
   Class150 aClass150_8395;


   void method1881(boolean var1) {
      this.aRenderer_Sub2_2792.setTexEnv(8448, 7681);
   }

   void method1880(boolean var1) {
      OGLTexture_Sub2 var2 = this.aRenderer_Sub2_2792.method6994();
      if(this.aClass150_8395 != null && var2 != null && var1) {
         this.aClass150_8395.method1832('\u0000');
         this.aRenderer_Sub2_2792.setTexture(1);
         this.aRenderer_Sub2_2792.setTextureRenderer(var2);
         OpenGL.glMatrixMode(5890);
         OpenGL.glLoadMatrixf(this.aRenderer_Sub2_2792.anArrayViewport_10356.method4561(this.aRenderer_Sub2_2792.aFloatArray_10390), 0);
         OpenGL.glScalef(1.0F, -1.0F, -1.0F);
         OpenGL.glMatrixMode(5888);
         this.aRenderer_Sub2_2792.setTexture(0);
         this.aBoolean_8392 = true;
      } else {
         this.aRenderer_Sub2_2792.method7055(0, '\u8578', 770);
      }

   }

   void method1884() {
      if(this.aBoolean_8392) {
         this.aClass150_8395.method1832('\u0001');
         this.aRenderer_Sub2_2792.setTexture(1);
         this.aRenderer_Sub2_2792.setTextureRenderer((OGLTexture)null);
         this.aRenderer_Sub2_2792.setTexture(0);
      } else {
         this.aRenderer_Sub2_2792.method7055(0, 5890, 770);
      }

      this.aRenderer_Sub2_2792.setTexEnv(8448, 8448);
      this.aBoolean_8392 = false;
   }

   void method1882(int var1, int var2) {}

   void method1879(OGLTexture var1, int var2) {
      this.aRenderer_Sub2_2792.setTextureRenderer(var1);
      this.aRenderer_Sub2_2792.setTextureEnv(var2);
   }

   boolean method1883() {
      return true;
   }

   Class161_Sub2(OpenGLRenderer var1) {
      super(var1);
      if(var1.supportsTextureCubeMap) {
         this.aClass150_8395 = new Class150(var1, 2);
         this.aClass150_8395.method1831(0);
         this.aRenderer_Sub2_2792.setTexture(1);
         this.aRenderer_Sub2_2792.setTexEnv('\u8575', 7681);
         this.aRenderer_Sub2_2792.method7020(2, '\u8578', 770);
         this.aRenderer_Sub2_2792.method7055(0, '\u8577', 770);
         OpenGL.glTexGeni(8192, 9472, '\u8512');
         OpenGL.glTexGeni(8193, 9472, '\u8512');
         OpenGL.glTexGeni(8194, 9472, '\u8512');
         OpenGL.glEnable(3168);
         OpenGL.glEnable(3169);
         OpenGL.glEnable(3170);
         this.aRenderer_Sub2_2792.setTexture(0);
         this.aClass150_8395.method1830();
         this.aClass150_8395.method1831(1);
         this.aRenderer_Sub2_2792.setTexture(1);
         this.aRenderer_Sub2_2792.setTexEnv(8448, 8448);
         this.aRenderer_Sub2_2792.method7020(2, '\u8576', 770);
         this.aRenderer_Sub2_2792.method7055(0, 5890, 770);
         OpenGL.glDisable(3168);
         OpenGL.glDisable(3169);
         OpenGL.glDisable(3170);
         OpenGL.glMatrixMode(5890);
         OpenGL.glLoadIdentity();
         OpenGL.glMatrixMode(5888);
         this.aRenderer_Sub2_2792.setTexture(0);
         this.aClass150_8395.method1830();
      }

   }
}
