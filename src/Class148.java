import jaggl.OpenGL;

public class Class148 {

   final int anInt_2719;
   static final int[] anIntArray_2720 = new int[2];
   final OpenGLRenderer aRenderer_Sub2_2721;


   Class148(OpenGLRenderer var1, int var2, Class151[] var3) {
      this.aRenderer_Sub2_2721 = var1;
      this.anInt_2719 = var2;
   }

   static Class148 method1826(OpenGLRenderer var0, Class151[] var1) {
      int var2;
      for(var2 = 0; var2 < var1.length; ++var2) {
         if(var1[var2] == null || var1[var2].anInt_2727 <= 0) {
            return null;
         }
      }

      var2 = OpenGL.glCreateProgram();

      int var3;
      for(var3 = 0; var3 < var1.length; ++var3) {
         OpenGL.glAttachShader(var2, var1[var3].anInt_2727);
      }

      OpenGL.glLinkProgram(var2);
      OpenGL.glGetProgramiv(var2, '\u8b82', anIntArray_2720, 0);
      if(anIntArray_2720[0] == 0) {
         OpenGL.glGetProgramiv(var2, '\u8b84', anIntArray_2720, 1);
         if(anIntArray_2720[1] > 1) {
            byte[] var4 = new byte[anIntArray_2720[1]];
            OpenGL.glGetProgramInfoLog(var2, anIntArray_2720[1], anIntArray_2720, 0, var4, 0);
            System.out.println(new String(var4));
         }

         if(anIntArray_2720[0] == 0) {
            for(var3 = 0; var3 < var1.length; ++var3) {
               OpenGL.glDetachShader(var2, var1[var3].anInt_2727);
            }

            OpenGL.glDeleteProgram(var2);
            return null;
         }
      }

      return new Class148(var0, var2, var1);
   }

   public void finalize() throws Throwable {
      this.aRenderer_Sub2_2721.method7054((long)this.anInt_2719);
      super.finalize();
   }
}
