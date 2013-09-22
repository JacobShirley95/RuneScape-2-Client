import jaggl.OpenGL;

public class Class291 implements Class101, Class99, Class287 {

   final int anInt_5913;
   final Class136 aClass136_5914;
   final OpenGLRenderer_Sub1 aRenderer_Sub3_Sub1_5915;
   final int anInt_5916;
   int anInt_5917;
   final Class87 aClass87_5918;


   Class291(OpenGLRenderer_Sub1 var1, Class136 var2, Class87 var3, int var4, int var5, int var6) {
      this.aClass136_5914 = var2;
      this.aClass87_5918 = var3;
      this.anInt_5913 = var4;
      this.anInt_5916 = var5;
      this.aRenderer_Sub3_Sub1_5915 = var1;
      int[] var7 = new int[1];
      OpenGL.glGenRenderbuffersEXT(1, var7, 0);
      this.anInt_5917 = var7[0];
      OpenGL.glBindRenderbufferEXT('\u8d41', this.anInt_5917);
      OpenGL.glRenderbufferStorageMultisampleEXT('\u8d41', var6, OpenGLRenderer_Sub1.method792(this.aClass136_5914, this.aClass87_5918), var4, var5);
   }

   public int method2006() {
      return this.anInt_5913;
   }

   public void method824() {
      if(this.anInt_5917 > 0) {
         int[] var1 = new int[]{this.anInt_5917};
         OpenGL.glDeleteRenderbuffersEXT(1, var1, 0);
         this.anInt_5917 = 0;
      }

   }

   Class291(OpenGLRenderer_Sub1 var1, Class136 var2, Class87 var3, int var4, int var5) {
      this.aClass136_5914 = var2;
      this.aClass87_5918 = var3;
      this.anInt_5913 = var4;
      this.anInt_5916 = var5;
      this.aRenderer_Sub3_Sub1_5915 = var1;
      int[] var6 = new int[1];
      OpenGL.glGenRenderbuffersEXT(1, var6, 0);
      this.anInt_5917 = var6[0];
      OpenGL.glBindRenderbufferEXT('\u8d41', this.anInt_5917);
      OpenGL.glRenderbufferStorageEXT('\u8d41', OpenGLRenderer_Sub1.method792(this.aClass136_5914, this.aClass87_5918), var4, var5);
   }

   public void finalize() throws Throwable {
      this.method3715();
      super.finalize();
   }

   public void method3697(int var1) {
      OpenGL.glFramebufferRenderbufferEXT('\u8d40', var1, '\u8d41', this.anInt_5917);
   }

   void method3715() {
      if(this.anInt_5917 > 0) {
         this.aRenderer_Sub3_Sub1_5915.method788(this.anInt_5917, this.anInt_5913 * this.anInt_5916 * this.aClass87_5918.anInt_1764 * -151363651 * this.aClass136_5914.anInt_2624 * 191693721);
         this.anInt_5917 = 0;
      }

   }

   public int method2005() {
      return this.anInt_5916;
   }
}
