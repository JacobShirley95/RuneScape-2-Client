import jaclib.memory.Buffer;

public class Class157 {

   Buffer aBuffer_2769;
   final OpenGLRenderer aRenderer_Sub2_2770;


   void method1857(byte[] var1, int var2) {
      if(this.aBuffer_2769 == null || this.aBuffer_2769.method2341() < var2) {
         this.aBuffer_2769 = this.aRenderer_Sub2_2770.aNativeHeap_10333.createNativeHeapBuffer(var2, false);
      }

      this.aBuffer_2769.putData(var1, 0, 0, var2);
   }

   Class157(OpenGLRenderer var1, Buffer var2) {
      this.aRenderer_Sub2_2770 = var1;
      this.aBuffer_2769 = var2;
   }

   Class157(OpenGLRenderer var1, byte[] var2, int var3) {
      this.aRenderer_Sub2_2770 = var1;
      this.aBuffer_2769 = this.aRenderer_Sub2_2770.aNativeHeap_10333.createNativeHeapBuffer(var3, false);
      if(var2 != null) {
         this.aBuffer_2769.putData(var2, 0, 0, var3);
      }

   }
}
