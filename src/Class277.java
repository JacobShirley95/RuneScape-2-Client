import jaggl.OpenGL;

public class Class277 implements Class287 {

   final int anInt_4727;
   final Class294_Sub1 aClass294_Sub1_4728;


   public int method2006() {
      return this.aClass294_Sub1_4728.method4868();
   }

   public void method824() {}

   public int method2005() {
      return this.aClass294_Sub1_4728.method4863();
   }

   public void method3697(int var1) {
      OpenGL.glFramebufferTexture2DEXT('\u8d40', var1, this.aClass294_Sub1_4728.textureTarget, this.aClass294_Sub1_4728.texture, this.anInt_4727);
   }

   Class277(Class294_Sub1 var1, int var2) {
      this.anInt_4727 = var2;
      this.aClass294_Sub1_4728 = var1;
   }
}
