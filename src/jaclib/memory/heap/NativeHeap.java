package jaclib.memory.heap;

import jaclib.memory.heap.NativeHeapBuffer;

public final class NativeHeap {

   long peer;
   private final int anInt_760;
   private boolean aBoolean_761;


   public NativeHeap(int var1) {
      this.anInt_760 = 370227245 * var1;
      this.allocateHeap(1715328933 * this.anInt_760);
      this.aBoolean_761 = true;
   }

   synchronized boolean method188() {
      return this.aBoolean_761;
   }

   public NativeHeapBuffer createNativeHeapBuffer(int var1, boolean var2) {
      if(!this.aBoolean_761) {
         throw new IllegalStateException();
      } else {
         return new NativeHeapBuffer(this, this.allocateBuffer(var1, var2), var1);
      }
   }

   public synchronized void method190() {
      if(this.aBoolean_761) {
         this.deallocateHeap();
      }

      this.aBoolean_761 = false;
   }

   private native void allocateHeap(int var1);

   private native void deallocateHeap();

   synchronized native int allocateBuffer(int var1, boolean var2);

   synchronized native long getBufferAddress(int var1);

   synchronized native void get(int var1, byte[] var2, int var3, int var4, int var5);

   synchronized native void put(int var1, byte[] var2, int var3, int var4, int var5);

   synchronized native void deallocateBuffer(int var1);

   public synchronized native void copy(long var1, long var3, int var5);

   protected synchronized void finalize() throws Throwable {
      super.finalize();
      this.method190();
   }
}
