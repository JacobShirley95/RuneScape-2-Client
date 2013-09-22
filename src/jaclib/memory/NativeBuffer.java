package jaclib.memory;

import jaclib.memory.Buffer;
import jaclib.memory.Source;

public class NativeBuffer implements Buffer, Source {

   private int anInt_7458 = -59399019;
   private long aLong_7459;


   public final int method2341() {
      return this.anInt_7458 * 1583216963;
   }

   public final long getAddress() {
      return 8057676847509236561L * this.aLong_7459;
   }

   public void putData(byte[] var1, int var2, int var3, int var4) {
      if(0L == 8057676847509236561L * this.aLong_7459 | null == var1 | var2 < 0 | var4 + var2 > var1.length | var3 < 0 | var4 + var3 > 1583216963 * this.anInt_7458) {
         throw new RuntimeException();
      } else {
         this.put(8057676847509236561L * this.aLong_7459, var1, var2, var3, var4);
      }
   }

   private final native void get(long var1, byte[] var3, int var4, int var5, int var6);

   private final native void put(long var1, byte[] var3, int var4, int var5, int var6);
}
