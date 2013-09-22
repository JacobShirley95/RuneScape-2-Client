import jaggl.OpenGL;

public class Class240_Sub50_Sub1_Sub2 extends Class240_Sub50_Sub1 {

   Class133_Sub2 aClass133_Sub2_3319;
   int[] anIntArray_3320 = null;


   public final int method872(int var1) {
      return this.anIntArray_3320[var1];
   }

   Class240_Sub50_Sub1_Sub2(Class133_Sub2 var1, Class120 var2) {
      super(var2);
      this.aClass133_Sub2_3319 = var1;
   }

   public boolean method869(int var1) {
      if(this.anIntArray_3320 == null) {
         this.anIntArray_3320 = new int[this.aClass133_Sub2_3319.method1730(-1979691700)];
      }

      Class125_Sub1 var2 = (Class125_Sub1)this.aClass133_Sub2_3319.method1731(var1, -682057200);
      this.anIntArray_3320[var1] = OpenGL.glGetUniformLocation(var2.glProgramID, this.method873(1244931490));
      return this.anIntArray_3320[var1] != -1;
   }

   final int method2463() {
      return this.anIntArray_3320[this.aClass133_Sub2_3319.method1736(1714985129)];
   }
}
