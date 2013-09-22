import jaggl.OpenGL;

public class Class186 implements Class149 {

   final OGLTexture_Sub3 anOGLTexture_Sub3_3194;
   final int anInt_3195;


   public int method2005() {
      return this.anOGLTexture_Sub3_3194.anInt_8399;
   }

   public void method1827(int var1) {
      OpenGL.glFramebufferTexture2DEXT('\u8d40', var1, this.anOGLTexture_Sub3_3194.texSubDubTexture, this.anOGLTexture_Sub3_3194.loadedTexture, this.anInt_3195);
   }

   public void method824() {}

   Class186(OGLTexture_Sub3 var1, int var2) {
      this.anInt_3195 = var2;
      this.anOGLTexture_Sub3_3194 = var1;
   }

   public int method2006() {
      return this.anOGLTexture_Sub3_3194.anInt_8398;
   }
}
