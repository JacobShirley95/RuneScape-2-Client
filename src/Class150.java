import jaggl.OpenGL;

public class Class150 {

   final int anInt_2722;


   Class150(OpenGLRenderer var1, int var2) {
      this.anInt_2722 = OpenGL.glGenLists(var2);
   }

   void method1830() {
      OpenGL.glEndList();
   }

   void method1831(int var1) {
      OpenGL.glNewList(this.anInt_2722 + var1, 4864);
   }

   void method1832(char var1) {
      OpenGL.glCallList(this.anInt_2722 + var1);
   }
}
