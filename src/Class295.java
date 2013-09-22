import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;

public abstract class Class295 implements Class381 {

   final OpenGLRenderer_Sub1 aRenderer_Sub3_Sub1_5938;
   static final int anInt_5939 = 34963;
   static final int anInt_5940 = 34962;
   final int bufferType;
   final boolean aBoolean_5942;
   int bufferID = -1;
   int anInt_5944;
   int anInt_5945;
   NativeHeapBuffer aNativeHeapBuffer_5946;
   static final int[] generatedBuffers = new int[1];


   public int method4854() {
      return this.anInt_5944;
   }

   void method3734() {
      if(this.aRenderer_Sub3_Sub1_5938.isnOGLBuffer) {
         OpenGL.glBindBufferARB(this.bufferType, this.bufferID);
      }

   }

   void method3735(int var1) {
      if(var1 > this.anInt_5945) {
         this.method3741();
         if(this.bufferID > 0) {
            OpenGL.glBindBufferARB(this.bufferType, this.bufferID);
            OpenGL.glBufferDataARBub(this.bufferType, var1, (byte[])null, 0, this.aBoolean_5942?'\u88e0':'\u88e4');
            this.aRenderer_Sub3_Sub1_5938.anInt_10656 += var1 - this.anInt_5945;
         } else {
            this.aNativeHeapBuffer_5946 = this.aRenderer_Sub3_Sub1_5938.method7156(var1, false);
         }

         this.anInt_5945 = var1;
      }

      this.anInt_5944 = var1;
   }

   public boolean method4853(int var1, int var2, long var3) {
      this.method3741();
      if(this.bufferID > 0) {
         OpenGL.glBindBufferARB(this.bufferType, this.bufferID);
         OpenGL.glBufferSubDataARBa(this.bufferType, var1, var2, var3);
      } else {
         this.aNativeHeapBuffer_5946.heap.copy(this.aNativeHeapBuffer_5946.getAddress() + (long)var1, var3, var2);
      }

      return true;
   }

   void method3737() {
      if(this.bufferID > 0) {
         this.aRenderer_Sub3_Sub1_5938.method785(this.bufferID, this.anInt_5944);
         this.bufferID = -1;
      }

   }

   public void finalize() throws Throwable {
      this.method3737();
      super.finalize();
   }

   Class295(OpenGLRenderer_Sub1 var1, int var2, boolean var3) {
      this.aRenderer_Sub3_Sub1_5938 = var1;
      this.bufferType = var2;
      this.aBoolean_5942 = var3;
   }

   public long method4851(int var1, int var2) {
      OpenGL.glBindBufferARB(this.bufferType, this.bufferID);
      return OpenGL.glMapBufferARB(this.bufferType, '\u88b9') + (long)var1;
   }

   public void method4852() {
      OpenGL.glUnmapBufferARB(this.bufferType);
   }

   long method3740() {
      return this.bufferID == 0?this.aNativeHeapBuffer_5946.getAddress():0L;
   }

   void method3741() {
      if(this.bufferID < 0) {
         if(this.aRenderer_Sub3_Sub1_5938.isnOGLBuffer) {
            OpenGL.glGenBuffersARB(1, generatedBuffers, 0);
            this.bufferID = generatedBuffers[0];
            OpenGL.glBindBufferARB(this.bufferType, this.bufferID);
         } else {
            this.bufferID = 0;
         }

      }
   }
}
