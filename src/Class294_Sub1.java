import jaggl.OpenGL;

public class Class294_Sub1 extends Class294 implements Class406 {

   final int anInt_3769;
   final int anInt_3770;


   Class294_Sub1(OpenGLRenderer_Sub1 var1, int var2, int var3, int[] var4, int var5, int var6) {
      super(var1, '\u84f5', Class136.aClass136_2625, Class87.aClass87_1759, var2 * var3, false);
      this.anInt_3769 = var2;
      this.anInt_3770 = var3;
      this.aRenderer_Sub3_Sub1_5924.method7224(this);
      OpenGL.glPixelStorei(3314, var6);
      OpenGL.glTexImage2Di(this.textureTarget, 0, 6408, this.anInt_3769, this.anInt_3770, 0, '\u80e1', this.aRenderer_Sub3_Sub1_5924.anInt_1336, var4, var5 * 4);
      OpenGL.glPixelStorei(3314, 0);
   }

   Class294_Sub1(OpenGLRenderer_Sub1 var1, Class136 var2, int var3, int var4, byte[] var5, int var6, int var7) {
      super(var1, '\u84f5', var2, Class87.aClass87_1759, var3 * var4, false);
      this.anInt_3769 = var3;
      this.anInt_3770 = var4;
      this.aRenderer_Sub3_Sub1_5924.method7224(this);
      OpenGL.glPixelStorei(3317, 1);
      OpenGL.glPixelStorei(3314, var7);
      OpenGL.glTexImage2Dub(this.textureTarget, 0, OpenGLRenderer_Sub1.method792(this.aClass136_5932, this.aClass87_5933), var3, var4, 0, OpenGLRenderer_Sub1.method791(this.aClass136_5932), 5121, var5, var6);
      OpenGL.glPixelStorei(3314, 0);
      OpenGL.glPixelStorei(3317, 4);
   }

   Class294_Sub1(OpenGLRenderer_Sub1 var1, Class136 var2, int var3, int var4, float[] var5, int var6, int var7) {
      super(var1, '\u84f5', var2, Class87.aClass87_1767, var3 * var4, false);
      this.anInt_3769 = var3;
      this.anInt_3770 = var4;
      this.aRenderer_Sub3_Sub1_5924.method7224(this);
      OpenGL.glPixelStorei(3314, var7);
      OpenGL.glTexImage2Df(this.textureTarget, 0, OpenGLRenderer_Sub1.method792(this.aClass136_5932, this.aClass87_5933), var3, var4, 0, OpenGLRenderer_Sub1.method791(this.aClass136_5932), 5126, var5, var6 * 4);
      OpenGL.glPixelStorei(3314, 0);
   }

   public int method4868() {
      return this.anInt_3769;
   }

   public int method4863() {
      return this.anInt_3770;
   }

   public float method4865(float var1) {
      return var1;
   }

   public float method4864() {
      return 1.0F;
   }

   public float method4873() {
      return 1.0F;
   }

   public boolean method4866() {
      return false;
   }

   public void method4869(boolean var1, boolean var2) {}

   public void method4867(int var1, int var2, int var3, int var4, int[] var5, int var6, int var7) {
      if(var7 == 0) {
         var7 = var3;
      }

      this.aRenderer_Sub3_Sub1_5924.method7224(this);
      if(var3 != var7) {
         OpenGL.glPixelStorei(3314, var7);
      }

      OpenGL.glTexSubImage2Di(this.textureTarget, 0, var1, var2, var3, var4, '\u80e1', this.aRenderer_Sub3_Sub1_5924.anInt_1336, var5, var6);
      if(var3 != var7) {
         OpenGL.glPixelStorei(3314, 0);
      }

   }

   public void method4872(int var1, int var2, int var3, int var4, int[] var5, int var6) {
      int[] var7 = new int[this.anInt_3769 * this.anInt_3770];
      this.aRenderer_Sub3_Sub1_5924.method7224(this);
      OpenGL.glGetTexImagei(this.textureTarget, 0, '\u80e1', 5121, var7, 0);

      for(int var8 = 0; var8 < var4; ++var8) {
         System.arraycopy(var7, (var2 + (var4 - 1) - var8) * this.anInt_3769, var5, var6 + var8 * var3, var3);
      }

   }

   public float method4862(float var1) {
      return var1;
   }

   public void method4978() {
      super.method4978();
   }

   public Class101 method5013(int var1) {
      return new Class277(this, var1);
   }

   Class294_Sub1(OpenGLRenderer_Sub1 var1, Class136 var2, Class87 var3, int var4, int var5) {
      super(var1, '\u84f5', var2, var3, var4 * var5, false);
      this.anInt_3769 = var4;
      this.anInt_3770 = var5;
      this.aRenderer_Sub3_Sub1_5924.method7224(this);
      OpenGL.glTexImage2Dub(this.textureTarget, 0, OpenGLRenderer_Sub1.method792(this.aClass136_5932, this.aClass87_5933), var4, var5, 0, OpenGLRenderer_Sub1.method791(this.aClass136_5932), OpenGLRenderer_Sub1.method790(this.aClass87_5933), (byte[])null, 0);
   }

   public void method4977(Class389 var1) {
      super.method4977(var1);
   }

   public void method4870(int var1, int var2, int var3, int var4, byte[] var5, Class136 var6, int var7, int var8) {
      if(var8 == 0) {
         var8 = var3;
      }

      this.aRenderer_Sub3_Sub1_5924.method7224(this);
      OpenGL.glPixelStorei(3317, 1);
      if(var8 != var3) {
         OpenGL.glPixelStorei(3314, var8);
      }

      OpenGL.glTexSubImage2Dub(this.textureTarget, 0, var1, var2, var3, var4, OpenGLRenderer_Sub1.method791(var6), 5121, var5, var7);
      if(var8 != var3) {
         OpenGL.glPixelStorei(3314, 0);
      }

      OpenGL.glPixelStorei(3317, 4);
   }

   public void method4976() {
      super.method4976();
   }

   public boolean method3732() {
      return super.method3732();
   }

@Override
public boolean method4871() {
	// TODO Auto-generated method stub
	return false;
}
}
