import jaggl.OpenGL;

public class Class240_Sub22_Sub18 extends Class240_Sub22 implements Class149 {

   final OpenGLRenderer aRenderer_Sub2_10984;
   int anInt_10985;
   final int anInt_10986;
   final Class87 aClass87_10987;
   final Class136 aClass136_10988;
   final int anInt_10989;
   final int anInt_10990;
   static final int[] anIntArray_10991 = new int[1];


   public void method824() {
      if(this.anInt_10985 > 0) {
         int[] var1 = new int[]{this.anInt_10985};
         OpenGL.glDeleteRenderbuffersEXT(1, var1, 0);
         this.anInt_10985 = 0;
      }

   }

   Class240_Sub22_Sub18(OpenGLRenderer var1, Class136 var2, Class87 var3, int var4, int var5, int var6) {
      this.aRenderer_Sub2_10984 = var1;
      this.anInt_10986 = var4;
      this.anInt_10989 = var5;
      this.aClass136_10988 = var2;
      this.aClass87_10987 = var3;
      OpenGL.glGenRenderbuffersEXT(1, anIntArray_10991, 0);
      this.anInt_10985 = anIntArray_10991[0];
      OpenGL.glBindRenderbufferEXT('\u8d41', this.anInt_10985);
      OpenGL.glRenderbufferStorageMultisampleEXT('\u8d41', var6, OpenGLRenderer.method7039(this.aClass136_10988, this.aClass87_10987), this.anInt_10986, this.anInt_10989);
      this.anInt_10990 = this.anInt_10986 * this.anInt_10989 * this.aClass136_10988.anInt_2624 * 191693721 * this.aClass87_10987.anInt_1764 * -151363651;
   }

   void method7589() {
      if(this.anInt_10985 > 0) {
         this.aRenderer_Sub2_10984.method7062(this.anInt_10985, this.anInt_10990);
         this.anInt_10985 = 0;
      }

   }

   public void finalize() throws Throwable {
      this.method7589();
      super.finalize();
   }

   public int method2005() {
      return this.anInt_10989;
   }

   public void method1827(int var1) {
      OpenGL.glFramebufferRenderbufferEXT('\u8d40', var1, '\u8d41', this.anInt_10985);
   }

   Class240_Sub22_Sub18(OpenGLRenderer var1, Class136 var2, Class87 var3, int var4, int var5) {
      this.aRenderer_Sub2_10984 = var1;
      this.anInt_10986 = var4;
      this.anInt_10989 = var5;
      this.aClass136_10988 = var2;
      this.aClass87_10987 = var3;
      OpenGL.glGenRenderbuffersEXT(1, anIntArray_10991, 0);
      this.anInt_10985 = anIntArray_10991[0];
      OpenGL.glBindRenderbufferEXT('\u8d41', this.anInt_10985);
      OpenGL.glRenderbufferStorageEXT('\u8d41', OpenGLRenderer.method7039(this.aClass136_10988, this.aClass87_10987), this.anInt_10986, this.anInt_10989);
      this.anInt_10990 = this.anInt_10986 * this.anInt_10989 * this.aClass136_10988.anInt_2624 * 191693721 * this.aClass87_10987.anInt_1764 * -151363651;
   }

   public int method2006() {
      return this.anInt_10986;
   }
}
