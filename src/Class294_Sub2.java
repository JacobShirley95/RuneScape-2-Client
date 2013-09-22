import jaggl.OpenGL;

public class Class294_Sub2 extends Class294 implements Class398 {

   static final int anInt_3842 = 34069;


   public void method4976() {
      super.method4976();
   }

   public void method4977(Class389 var1) {
      super.method4977(var1);
   }

   public void method4978() {
      super.method4978();
   }

   Class294_Sub2(OpenGLRenderer_Sub1 var1, int var2, boolean var3, int[][] var4) {
      super(var1, '\u8513', Class136.aClass136_2625, Class87.aClass87_1759, var2 * var2 * 6, var3);
      this.aRenderer_Sub3_Sub1_5924.method7224(this);
      int var5;
      if(var3) {
         for(var5 = 0; var5 < 6; ++var5) {
            this.method3725('\u8515' + var5, var2, var2, var4[var5]);
         }
      } else {
         for(var5 = 0; var5 < 6; ++var5) {
            OpenGL.glTexImage2Di('\u8515' + var5, 0, OpenGLRenderer_Sub1.method792(this.aClass136_5932, this.aClass87_5933), var2, var2, 0, OpenGLRenderer_Sub1.method791(this.aClass136_5932), this.aRenderer_Sub3_Sub1_5924.anInt_1336, var4[var5], 0);
         }
      }

   }
}
