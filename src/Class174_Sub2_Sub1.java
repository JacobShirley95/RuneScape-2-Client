import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Dimension;

public class Class174_Sub2_Sub1 extends Class174_Sub2 {

   int anInt_1723;
   final Canvas aCanvas_1724;
   boolean aBoolean_1725;
   final long aLong_1726;
   int anInt_1727;
   final OpenGLRenderer aRenderer_Sub2_1728;
   final OpenGL anOpenGL_1729;


   Class174_Sub2_Sub1(OpenGLRenderer var1, Canvas var2, long var3) {
      this.aBoolean_1725 = false;
      this.aRenderer_Sub2_1728 = var1;
      this.aCanvas_1724 = var2;
      this.anOpenGL_1729 = var1.anOpenGL_10309;
      this.aLong_1726 = var3;
      this.method1108();
   }

   public int method2198() {
      return this.anInt_1723;
   }

   void method7575(int var1, int var2) {
      if(this.aBoolean_1725) {
         throw new IllegalStateException();
      } else {
         this.anOpenGL_1729.surfaceResized(this.aLong_1726);
         this.method1108();
         if(this == this.aRenderer_Sub2_1728.method1896(-1049944088)) {
            this.aRenderer_Sub2_1728.method6934();
         }

      }
   }

   public int method7576() {
      if(this.aBoolean_1725) {
         throw new IllegalStateException();
      } else {
         this.anOpenGL_1729.swapBuffers(this.aLong_1726);
         return 0;
      }
   }

   public void method2195() {
      if(this.aBoolean_1725) {
         throw new IllegalStateException();
      } else {
         this.anOpenGL_1729.releaseSurface(this.aCanvas_1724, this.aLong_1726);
         this.aBoolean_1725 = true;
      }
   }

   boolean method2197() {
      return true;
   }

   void method1108() {
      Dimension var1 = this.aCanvas_1724.getSize();
      this.anInt_1723 = var1.height;
      this.anInt_1727 = var1.width;
   }

   public int method2194() {
      return this.anInt_1727;
   }

   Class174_Sub2_Sub1(OpenGLRenderer var1, Canvas var2) {
      this(var1, var2, var1.anOpenGL_10309.prepareSurface(var2));
   }

   boolean method2196() {
      if(this.aBoolean_1725) {
         throw new IllegalStateException();
      } else {
         this.anOpenGL_1729.setSurface(this.aLong_1726);
         this.aRenderer_Sub2_1728.method6983();
         return true;
      }
   }

   public int method7574(int var1, int var2) {
      return 0;
   }
}
