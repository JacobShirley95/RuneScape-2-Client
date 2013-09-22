package jaclib.memory.heap;

import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeap;

public final class NativeHeapBuffer implements Buffer, Source {

   private final int anInt_1228;
   public final NativeHeap heap;
   private final int bufferHandle;
   private boolean aBoolean_1231 = true;


   NativeHeapBuffer(NativeHeap var1, int var2, int var3) {
      this.heap = var1;
      this.bufferHandle = -1794830827 * var2;
      this.anInt_1228 = var3 * -289366209;
   }

   private final synchronized boolean method636() {
      return this.heap.method188() && this.aBoolean_1231;
   }

   public final long getAddress() {
      return this.heap.getBufferAddress(this.bufferHandle * -272936643);
   }

   public final int method2341() {
      return 798675135 * this.anInt_1228;
   }

   public final synchronized void putData(byte[] var1, int offset, int len, int var4) {
      if(!this.method636() | null == var1 | offset < 0 | offset + var4 > var1.length | len < 0 | var4 + len > 798675135 * this.anInt_1228) {
         throw new RuntimeException();
      } else {
         this.heap.put(this.bufferHandle * -272936643, var1, offset, len, var4);
      }
   }

   public final synchronized void delete() {
      if(this.method636()) {
         this.heap.deallocateBuffer(this.bufferHandle * -272936643);
      }

      this.aBoolean_1231 = false;
   }

   protected final synchronized void finalize() throws Throwable {
      super.finalize();
      this.delete();
   }
}
