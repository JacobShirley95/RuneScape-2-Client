import jaclib.memory.Buffer;

public class OGLVBuffer extends Class141 implements OGLBuffer {

   int anInt_10761;


   OGLVBuffer(OpenGLRenderer var1, int var2, Buffer var3, int var4, boolean var5) {
      super(var1, '\u8892', var3, var4, var5);
      this.anInt_10761 = var2;
   }

   public int method1868() {
      return this.anInt_2665;
   }

   public long getAddress() {
      return 0L;
   }

   void method1811() {
      this.aRenderer_Sub2_2667.bindBuffer(this);
   }

   public int getStride() {
      return this.anInt_10761;
   }

   public void putData(int var1, byte[] var2, int var3) {
      this.bufferData(var2, var3);
      this.anInt_10761 = var1;
   }

   OGLVBuffer(OpenGLRenderer var1, int var2, byte[] var3, int var4, boolean var5) {
      super(var1, '\u8892', var3, var4, var5);
      this.anInt_10761 = var2;
   }
}
