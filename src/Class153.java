import jaggl.OpenGL;

public class Class153 {

   final OpenGLRenderer aRenderer_Sub2_2731;
   static final int anInt_2732 = 34336;
   final int anInt_2733;
   static final int[] anIntArray_2734 = new int[1];


   Class153(OpenGLRenderer var1, int var2, int var3) {
      this.aRenderer_Sub2_2731 = var1;
      this.anInt_2733 = var3;
   }

   public void finalize() throws Throwable {
      this.aRenderer_Sub2_2731.method7037(this.anInt_2733);
      super.finalize();
   }

   static Class153 method1838(OpenGLRenderer var0, int var1, String var2) {
      int var3 = OpenGL.glGenProgramARB();
      OpenGL.glBindProgramARB(var1, var3);
      OpenGL.glProgramStringARB(var1, '\u8875', var2);
      OpenGL.glGetIntegerv('\u864b', anIntArray_2734, 0);
      if(anIntArray_2734[0] != -1) {
         OpenGL.glBindProgramARB(var1, 0);
         return null;
      } else {
         OpenGL.glBindProgramARB(var1, 0);
         return new Class153(var0, var1, var3);
      }
   }

}
