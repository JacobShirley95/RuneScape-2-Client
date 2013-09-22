import jaggl.OpenGL;

public class Class294_Sub4 extends Class294 implements Class54 {

   final int anInt_4031;
   final int anInt_4032;
   final int anInt_4033;


   public void method4976() {
      super.method4976();
   }

   public void method4977(Class389 var1) {
      super.method4977(var1);
   }

   public void method4978() {
      super.method4978();
   }

   Class294_Sub4(OpenGLRenderer_Sub1 var1, Class136 var2, int var3, int var4, int var5, boolean var6, byte[] var7) {
      super(var1, '\u806f', var2, Class87.aClass87_1759, var3 * var4 * var5, var6);
      this.anInt_4031 = var3;
      this.anInt_4032 = var4;
      this.anInt_4033 = var5;
      this.aRenderer_Sub3_Sub1_5924.method7224(this);
      OpenGL.glPixelStorei(3317, 1);
      OpenGL.glTexImage3Dub(this.textureTarget, 0, OpenGLRenderer_Sub1.method792(this.aClass136_5932, this.aClass87_5933), this.anInt_4031, this.anInt_4032, this.anInt_4033, 0, OpenGLRenderer_Sub1.method791(this.aClass136_5932), 5121, var7, 0);
      OpenGL.glPixelStorei(3317, 4);
      if(var6) {
         this.method3732();
      }

   }
}
