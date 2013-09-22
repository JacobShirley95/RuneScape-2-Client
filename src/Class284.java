import jaggl.OpenGL;

public class Class284 implements Class287 {

   final int anInt_4793;
   final Class294_Sub3 aClass294_Sub3_4794;


   public int method2006() {
      return this.aClass294_Sub3_4794.method4868();
   }

   Class284(Class294_Sub3 var1, int var2) {
      this.anInt_4793 = var2;
      this.aClass294_Sub3_4794 = var1;
   }

   public void method824() {}

   public int method2005() {
      return this.aClass294_Sub3_4794.method4863();
   }

   public void method3697(int var1) {
      OpenGL.glFramebufferTexture2DEXT('\u8d40', var1, this.aClass294_Sub3_4794.textureTarget, this.aClass294_Sub3_4794.texture, this.anInt_4793);
   }
}
