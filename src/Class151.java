import jaggl.OpenGL;

public class Class151 {

   static final int anInt_2723 = 35633;
   static final int anInt_2724 = 35632;
   static final int[] anIntArray_2725 = new int[2];
   final OpenGLRenderer aRenderer_Sub2_2726;
   final int anInt_2727;


   Class151(OpenGLRenderer var1, int var2, int var3) {
      this.aRenderer_Sub2_2726 = var1;
      this.anInt_2727 = var2;
   }

   public void finalize() throws Throwable {
      this.aRenderer_Sub2_2726.method7054((long)this.anInt_2727);
      super.finalize();
   }

   static Class151 method1833(OpenGLRenderer var0, int var1, String var2) {
      int var3 = OpenGL.glCreateShader(var1);
      OpenGL.glShaderSource(var3, var2);
      OpenGL.glCompileShader(var3);
      OpenGL.glGetShaderiv(var3, '\u8b81', anIntArray_2725, 0);
      if(anIntArray_2725[0] == 0) {
         if(anIntArray_2725[0] == 0) {
            System.out.println("");
         }

         OpenGL.glGetShaderiv(var3, '\u8b84', anIntArray_2725, 1);
         if(anIntArray_2725[1] > 1) {
            byte[] var4 = new byte[anIntArray_2725[1]];
            OpenGL.glGetShaderInfoLog(var3, anIntArray_2725[1], anIntArray_2725, 0, var4, 0);
            System.out.println(new String(var4));
         }

         if(anIntArray_2725[0] == 0) {
            OpenGL.glDeleteShader(var3);
            return null;
         }
      }

      return new Class151(var0, var3, var1);
   }
}
