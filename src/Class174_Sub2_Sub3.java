import java.awt.Canvas;

public abstract class Class174_Sub2_Sub3 extends Class174_Sub2 {

   int[] anIntArray_1911;
   final Canvas aCanvas_1912;
   int anInt_1913;
   int anInt_1914;
   final SoftwareRenderer aRenderer_Sub1_1915;
   float[] aFloatArray_1916;
   boolean aBoolean_1917;


   final void method7575(int var1, int var2) {
      if(var1 != this.anInt_1913 * -1851521955 || var2 != 1039204617 * this.anInt_1914) {
         this.anInt_1913 = 1182396405 * var1;
         this.anInt_1914 = var2 * 845339961;
         this.method1269((byte)4);
      }

   }

   final boolean method2196() {
      this.aRenderer_Sub1_1915.method6750(-1851521955 * this.anInt_1913, this.anInt_1914 * 1039204617, this.anIntArray_1911, this.aFloatArray_1916);
      this.aBoolean_1917 = true;
      return true;
   }

   public int method2194() {
      return this.anInt_1913 * -1851521955;
   }

   public int method2198() {
      return this.anInt_1914 * 1039204617;
   }

   final boolean method2197() {
      this.aBoolean_1917 = false;
      return true;
   }

   void method1269(byte var1) {
      this.anIntArray_1911 = new int[1039204617 * this.anInt_1914 * this.anInt_1913 * -1851521955];
      this.aFloatArray_1916 = new float[1039204617 * this.anInt_1914 * this.anInt_1913 * -1851521955];
      if(this.aBoolean_1917) {
         this.aRenderer_Sub1_1915.method6750(this.anInt_1913 * -1851521955, 1039204617 * this.anInt_1914, this.anIntArray_1911, this.aFloatArray_1916);
      }

   }

   Class174_Sub2_Sub3(SoftwareRenderer var1, Canvas var2, int var3, int var4) {
      this.aCanvas_1912 = var2;
      this.aRenderer_Sub1_1915 = var1;
      this.anInt_1913 = 1182396405 * var3;
      this.anInt_1914 = var4 * 845339961;
   }

   static final int method1270(int var0, int var1, int var2) {
      return var1 < 0?var0:(int)((double)var0 * Math.sqrt(1.220703125E-4D * (double)(16384 - var1)) + 0.5D);
   }
}
