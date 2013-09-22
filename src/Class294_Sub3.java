import jaggl.OpenGL;

public class Class294_Sub3 extends Class294 implements Class406 {

   final int anInt_3938;
   final int anInt_3939;


   Class294_Sub3(OpenGLRenderer_Sub1 var1, int var2, int var3, boolean var4, int[] var5, int var6, int var7) {
      super(var1, 3553, Class136.aClass136_2625, Class87.aClass87_1759, var2 * var3, var4);
      this.anInt_3938 = var2;
      this.anInt_3939 = var3;
      this.aRenderer_Sub3_Sub1_5924.method7224(this);
      if(var4 && var7 == 0 && var6 == 0) {
         this.method3725(this.textureTarget, var2, var3, var5);
      } else {
         OpenGL.glPixelStorei(3314, var7);
         OpenGL.glTexImage2Di(this.textureTarget, 0, 6408, this.anInt_3938, this.anInt_3939, 0, '\u80e1', this.aRenderer_Sub3_Sub1_5924.anInt_1336, var5, var6 * 4);
         OpenGL.glPixelStorei(3314, 0);
      }

   }

   Class294_Sub3(OpenGLRenderer_Sub1 var1, Class136 var2, int var3, int var4, boolean var5, byte[] var6, int var7, int var8) {
      super(var1, 3553, var2, Class87.aClass87_1759, var3 * var4, var5);
      this.anInt_3938 = var3;
      this.anInt_3939 = var4;
      this.aRenderer_Sub3_Sub1_5924.method7224(this);
      OpenGL.glPixelStorei(3317, 1);
      if(var5 && var8 == 0 && var7 == 0) {
         this.method3726(this.textureTarget, var3, var4, var6);
      } else {
         OpenGL.glPixelStorei(3314, var8);
         if(this.aClass136_5932 == Class136.aClass136_2632) {
            OpenGL.glCompressedTexImage2Dub(this.textureTarget, 0, '\u83f1', var3, var4, 0, var3 * var4 / 2, var6, var7);
         } else if(this.aClass136_5932 == Class136.aClass136_2633) {
            OpenGL.glCompressedTexImage2Dub(this.textureTarget, 0, '\u83f3', var3, var4, 0, var3 * var4, var6, var7);
         } else {
            OpenGL.glTexImage2Dub(this.textureTarget, 0, OpenGLRenderer_Sub1.method792(this.aClass136_5932, this.aClass87_5933), var3, var4, 0, OpenGLRenderer_Sub1.method791(this.aClass136_5932), 5121, var6, var7);
         }

         OpenGL.glPixelStorei(3314, 0);
      }

      OpenGL.glPixelStorei(3317, 4);
   }

   Class294_Sub3(OpenGLRenderer_Sub1 var1, Class136 var2, int var3, int var4, boolean var5, float[] var6, int var7, int var8) {
      super(var1, 3553, var2, Class87.aClass87_1767, var3 * var4, var5);
      this.anInt_3938 = var3;
      this.anInt_3939 = var4;
      this.aRenderer_Sub3_Sub1_5924.method7224(this);
      if(var5 && var8 == 0 && var7 == 0) {
         this.method3729(this.textureTarget, var3, var4, var6);
      } else {
         OpenGL.glPixelStorei(3314, var8);
         OpenGL.glTexImage2Df(this.textureTarget, 0, OpenGLRenderer_Sub1.method792(this.aClass136_5932, this.aClass87_5933), var3, var4, 0, OpenGLRenderer_Sub1.method791(this.aClass136_5932), 5126, var6, var7 * 4);
         OpenGL.glPixelStorei(3314, 0);
      }

   }

   public int method4868() {
      return this.anInt_3938;
   }

   public float method4862(float var1) {
      return var1 / (float)this.anInt_3938;
   }

   public float method4864() {
      return 1.0F;
   }

   public float method4873() {
      return 1.0F;
   }

   public boolean method4866() {
      return true;
   }

   public void method4869(boolean var1, boolean var2) {
      this.aRenderer_Sub3_Sub1_5924.method7224(this);
      OpenGL.glTexParameteri(this.textureTarget, 10242, var1?10497:'\u812f');
      OpenGL.glTexParameteri(this.textureTarget, 10243, var2?10497:'\u812f');
   }

   public void method4867(int var1, int var2, int var3, int var4, int[] var5, int var6, int var7) {
      this.aRenderer_Sub3_Sub1_5924.method7224(this);
      OpenGL.glPixelStorei(3314, var7);
      OpenGL.glTexSubImage2Di(this.textureTarget, 0, var1, var2, var3, var4, '\u80e1', this.aRenderer_Sub3_Sub1_5924.anInt_1336, var5, var6);
      OpenGL.glPixelStorei(3314, 0);
   }

   void method2914(int var1, int var2, int var3, int var4, float[] var5, Class136 var6, int var7, int var8) {
      this.aRenderer_Sub3_Sub1_5924.method7224(this);
      OpenGL.glPixelStorei(3314, var8);
      OpenGL.glTexSubImage2Df(this.textureTarget, 0, var1, var2, var3, var4, OpenGLRenderer_Sub1.method791(var6), 5121, var5, var7);
      OpenGL.glPixelStorei(3314, 0);
   }

   public Class101 method5013(int var1) {
      return new Class284(this, var1);
   }

   public boolean method3732() {
      return super.method3732();
   }

   public void method4976() {
      super.method4976();
   }

   public void method4977(Class389 var1) {
      super.method4977(var1);
   }

   public void method4872(int var1, int var2, int var3, int var4, int[] var5, int var6) {
      int[] var7 = new int[this.anInt_3938 * this.anInt_3939];
      this.aRenderer_Sub3_Sub1_5924.method7224(this);
      OpenGL.glGetTexImagei(this.textureTarget, 0, '\u80e1', 5121, var7, 0);

      for(int var8 = 0; var8 < var4; ++var8) {
         System.arraycopy(var7, (var2 + (var4 - 1) - var8) * this.anInt_3938, var5, var6 + var8 * var3, var3);
      }

   }

   public void method4978() {
      super.method4978();
   }

   Class294_Sub3(OpenGLRenderer_Sub1 var1, Class136 var2, Class87 var3, int var4, int var5) {
      super(var1, 3553, var2, var3, var4 * var5, false);
      this.anInt_3938 = var4;
      this.anInt_3939 = var5;
      this.aRenderer_Sub3_Sub1_5924.method7224(this);
      OpenGL.glTexImage2Dub(this.textureTarget, 0, OpenGLRenderer_Sub1.method792(this.aClass136_5932, this.aClass87_5933), var4, var5, 0, OpenGLRenderer_Sub1.method791(this.aClass136_5932), OpenGLRenderer_Sub1.method790(this.aClass87_5933), (byte[])null, 0);
   }

   public void method4870(int var1, int var2, int var3, int var4, byte[] var5, Class136 var6, int var7, int var8) {
      this.aRenderer_Sub3_Sub1_5924.method7224(this);
      OpenGL.glPixelStorei(3317, 1);
      OpenGL.glPixelStorei(3314, var8);
      OpenGL.glTexSubImage2Dub(this.textureTarget, 0, var1, var2, var3, var4, OpenGLRenderer_Sub1.method791(var6), 5121, var5, var7);
      OpenGL.glPixelStorei(3314, 0);
      OpenGL.glPixelStorei(3317, 4);
   }

   public int method4863() {
      return this.anInt_3939;
   }

   public float method4865(float var1) {
      return var1 / (float)this.anInt_3939;
   }

@Override
public boolean method4871() {
	// TODO Auto-generated method stub
	return false;
}
}
