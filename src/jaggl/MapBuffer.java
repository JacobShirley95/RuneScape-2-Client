package jaggl;

import jaclib.memory.NativeBuffer;

public class MapBuffer extends NativeBuffer {

   private int anInt_10682;


   public void putData(byte[] var1, int var2, int var3, int var4) {
      if(-304991723 * this.anInt_10682 == 0) {
         throw new RuntimeException();
      } else {
         super.putData(var1, var2, var3, var4);
      }
   }
}
