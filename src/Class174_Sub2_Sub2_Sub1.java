import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Dimension;

public class Class174_Sub2_Sub2_Sub1 extends Class174_Sub2_Sub2 {

   final Canvas aCanvas_3307;
   final OpenGL anOpenGL_3308;
   final long aLong_3309;
   int anInt_3310;
   int anInt_3311;


   boolean method2197() {
      return true;
   }

   public int method2194() {
      return this.anInt_3310;
   }

   Class174_Sub2_Sub2_Sub1(OpenGLRenderer_Sub1 var1, Canvas var2, long var3) {
      super(var1);
      this.aCanvas_3307 = var2;
      this.anOpenGL_3308 = var1.anOpenGL_1338;
      this.aLong_3309 = var3;
      this.method2454();
   }

   void method2454() {
      Dimension var1 = this.aCanvas_3307.getSize();
      this.anInt_3311 = var1.height;
      this.anInt_3310 = var1.width;
   }

   public int method7574(int var1, int var2) {
      return 0;
   }

   void method7575(int var1, int var2) {
      this.anOpenGL_3308.surfaceResized(this.aLong_3309);
      this.method2454();
      super.method7575(var1, var2);
   }

   public void method2195() {
      this.anOpenGL_3308.releaseSurface(this.aCanvas_3307, this.aLong_3309);
   }

   Class174_Sub2_Sub2_Sub1(OpenGLRenderer_Sub1 var1, Canvas var2) {
      this(var1, var2, var1.anOpenGL_1338.prepareSurface(var2));
   }

   boolean method2196() {
      return this.anOpenGL_3308.setSurface(this.aLong_3309) && super.method2196();
   }

   public int method2198() {
      return this.anInt_3311;
   }

   public int method7576() {
      this.anOpenGL_3308.swapBuffers(this.aLong_3309);
      return 0;
   }
}
