import jaclib.memory.Buffer;
import jaggl.OpenGL;

public abstract class Class141 {

   static final int anInt_2661 = 34962;
   boolean aBoolean_2662;
   final int anInt_2663;
   static final int anInt_2664 = 34963;
   final int anInt_2665;
   int anInt_2666;
   final OpenGLRenderer aRenderer_Sub2_2667;
   boolean aBoolean_2668 = false;
   static final int[] genBuffers = new int[1];


   abstract void method1811();

   Class141(OpenGLRenderer var1, int var2, Buffer var3, int var4, boolean var5) {
      this.aRenderer_Sub2_2667 = var1;
      this.anInt_2663 = var2;
      this.anInt_2666 = var4;
      this.aBoolean_2662 = var5;
      OpenGL.glGenBuffersARB(1, genBuffers, 0);
      this.anInt_2665 = genBuffers[0];
      this.method1811();
      OpenGL.glBufferDataARBa(var2, this.anInt_2666, var3.getAddress(), this.aBoolean_2662?'\u88e0':'\u88e4');
      this.aRenderer_Sub2_2667.anInt_10336 += this.anInt_2666;
   }

   void bufferData(byte[] var1, int var2) {
      this.method1811();
      if(var2 > this.anInt_2666) {
         OpenGL.glBufferDataARBub(this.anInt_2663, var2, var1, 0, this.aBoolean_2662?'\u88e0':'\u88e4');
         this.aRenderer_Sub2_2667.anInt_10336 += var2 - this.anInt_2666;
         this.anInt_2666 = var2;
      } else {
         OpenGL.glBufferSubDataARBub(this.anInt_2663, 0, var2, var1, 0);
      }

   }

   public void finalize() throws Throwable {
      if(!this.aBoolean_2668) {
         this.aRenderer_Sub2_2667.method7034(this.anInt_2665, this.anInt_2666);
         this.aBoolean_2668 = true;
      }

      super.finalize();
   }

   Class141(OpenGLRenderer var1, int var2, byte[] var3, int var4, boolean var5) {
      this.aRenderer_Sub2_2667 = var1;
      this.anInt_2663 = var2;
      this.anInt_2666 = var4;
      this.aBoolean_2662 = var5;
      OpenGL.glGenBuffersARB(1, genBuffers, 0);
      this.anInt_2665 = genBuffers[0];
      this.method1811();
      OpenGL.glBufferDataARBub(var2, this.anInt_2666, var3, 0, this.aBoolean_2662?'\u88e0':'\u88e4');
      this.aRenderer_Sub2_2667.anInt_10336 += this.anInt_2666;
   }
}
