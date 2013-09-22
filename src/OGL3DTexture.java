import jaggl.OpenGL;

public class OGL3DTexture extends OGLTexture {

   final int anInt_8529;
   final int anInt_8530;
   final int depth;


   OGL3DTexture(OpenGLRenderer var1, Class136 var2, Class87 var3, int var4, int var5, int var6, byte[] var7, Class136 var8) {
      super(var1, '\u806f', var2, var3, var4 * var5 * var6, false);
      this.anInt_8530 = var4;
      this.anInt_8529 = var5;
      this.depth = var6;
      this.renderer.setTextureRenderer(this);
      OpenGL.glPixelStorei(3317, 1);
      OpenGL.glTexImage3Dub(this.texSubDubTexture, 0, OpenGLRenderer.method7039(this.aClass136_2756, this.aClass87_2759), this.anInt_8530, this.anInt_8529, this.depth, 0, OpenGLRenderer.method7046(var8), 5121, var7, 0);
      OpenGL.glPixelStorei(3317, 4);
      this.method1852(true);
   }

   void copyTexture(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.renderer.setTextureRenderer(this);
      OpenGL.glCopyTexSubImage3D(this.texSubDubTexture, 0, var1, var2, var3, var6, var7, var4, var5);
      OpenGL.glFlush();
   }

   OGL3DTexture(OpenGLRenderer var1, Class136 var2, Class87 var3, int var4, int var5, int var6) {
      super(var1, '\u806f', var2, var3, var4 * var5 * var6, false);
      this.anInt_8530 = var4;
      this.anInt_8529 = var5;
      this.depth = var6;
      this.renderer.setTextureRenderer(this);
      OpenGL.glTexImage3Dub(this.texSubDubTexture, 0, OpenGLRenderer.method7039(this.aClass136_2756, this.aClass87_2759), this.anInt_8530, this.anInt_8529, this.depth, 0, OpenGLRenderer.method7046(this.aClass136_2756), 5121, (byte[])null, 0);
      this.method1852(true);
   }
}
