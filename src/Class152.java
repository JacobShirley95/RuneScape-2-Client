import jaggl.OpenGL;

public class Class152 implements Class149 {

   final int anInt_2728;
   final int anInt_2729;
   final OGLTexture_Sub2 anOGLTexture_Sub2_2730;


   public int method2006() {
      return this.anOGLTexture_Sub2_2730.anInt_8391;
   }

   public int method2005() {
      return this.anOGLTexture_Sub2_2730.anInt_8391;
   }

   public void method1827(int var1) {
      OpenGL.glFramebufferTexture2DEXT('\u8d40', var1, this.anInt_2728, this.anOGLTexture_Sub2_2730.loadedTexture, this.anInt_2729);
   }

   public void method824() {}

   Class152(OGLTexture_Sub2 var1, int var2, int var3) {
      this.anInt_2729 = var3;
      this.anOGLTexture_Sub2_2730 = var1;
      this.anInt_2728 = var2;
   }
}
