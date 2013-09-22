import jaggl.OpenGL;

public class OGLTexture_Sub1 extends OGLTexture {

   final int anInt_8339;


   OGLTexture_Sub1(OpenGLRenderer var1, Class136 var2, Class87 var3, int var4, byte[] var5, Class136 var6) {
      super(var1, 3552, var2, var3, var4, false);
      this.anInt_8339 = var4;
      this.renderer.setTextureRenderer(this);
      OpenGL.glPixelStorei(3317, 1);
      OpenGL.glTexImage1Dub(this.texSubDubTexture, 0, OpenGLRenderer.method7039(this.aClass136_2756, this.aClass87_2759), this.anInt_8339, 0, OpenGLRenderer.method7046(var6), 5121, var5, 0);
      OpenGL.glPixelStorei(3317, 4);
      this.method1852(true);
   }

   void method5410(boolean var1) {
      this.renderer.setTextureRenderer(this);
      OpenGL.glTexParameteri(this.texSubDubTexture, 10242, var1?10497:'\u812f');
   }
}
