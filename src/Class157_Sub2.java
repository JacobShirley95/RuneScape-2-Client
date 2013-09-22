import jaclib.memory.Buffer;

public class Class157_Sub2 extends Class157 implements OGLBuffer {

   int anInt_11132;


   public int getStride() {
      return this.anInt_11132;
   }

   Class157_Sub2(OpenGLRenderer var1, int var2, byte[] var3, int var4) {
      super(var1, var3, var4);
      this.anInt_11132 = var2;
   }

   public long getAddress() {
      return this.aBuffer_2769.getAddress();
   }

   public void putData(int var1, byte[] var2, int var3) {
      this.method1857(var2, var3);
      this.anInt_11132 = var1;
   }

   Class157_Sub2(OpenGLRenderer var1, int var2, Buffer var3) {
      super(var1, var3);
      this.anInt_11132 = var2;
   }

   public int method1868() {
      return 0;
   }
}
