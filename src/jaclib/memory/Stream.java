package jaclib.memory;

import jaclib.memory.Buffer;

public final class Stream {

   private Buffer aBuffer_3249;
   private int anInt_3250;
   private int anInt_3251;
   private int anInt_3252;
   private final byte[] data;
   private static final boolean isLittleEndian = getLSB(-65536) == -1;


   public Stream() {
      this(4096);
   }

   private Stream(int var1) {
      this.data = new byte[var1];
   }

   public Stream(Buffer var1) {
      this(var1, 0, var1.method2341());
   }

   private Stream(Buffer var1, int var2, int var3) {
      this(var1.method2341() < 4096?var1.method2341():4096);
      this.method2382(var1, var2, var3);
   }

   private void method2382(Buffer var1, int var2, int var3) {
      this.flush();
      this.aBuffer_3249 = var1;
      this.anInt_3251 = var2 * 689058317;
      this.anInt_3250 = 1981840031 * (var2 + var3);
      if(this.anInt_3250 * 2002526559 > var1.method2341()) {
         throw new RuntimeException();
      }
   }

   public int method2383() {
      return -2128531097 * this.anInt_3252 + this.anInt_3251 * -655725371;
   }

   public void method2384(int var1) {
      this.flush();
      this.anInt_3251 = var1 * 689058317;
   }

   public void putByte(int var1) {
      if(-2128531097 * this.anInt_3252 >= this.data.length) {
         this.flush();
      }

      this.data[(this.anInt_3252 += -2137630121) * -2128531097 - 1] = (byte)var1;
   }

   public void putFloatBigEndian(float var1) {
      if(3 + -2128531097 * this.anInt_3252 >= this.data.length) {
         this.flush();
      }

      int var2 = floatToRawIntBits(var1);
      this.data[(this.anInt_3252 += -2137630121) * -2128531097 - 1] = (byte)(var2 >> 24);
      this.data[(this.anInt_3252 += -2137630121) * -2128531097 - 1] = (byte)(var2 >> 16);
      this.data[(this.anInt_3252 += -2137630121) * -2128531097 - 1] = (byte)(var2 >> 8);
      this.data[(this.anInt_3252 += -2137630121) * -2128531097 - 1] = (byte)var2;
   }

   public void putFloatLittleEndian(float var1) {
      if(this.anInt_3252 * -2128531097 + 3 >= this.data.length) {
         this.flush();
      }

      int var2 = floatToRawIntBits(var1);
      this.data[(this.anInt_3252 += -2137630121) * -2128531097 - 1] = (byte)var2;
      this.data[(this.anInt_3252 += -2137630121) * -2128531097 - 1] = (byte)(var2 >> 8);
      this.data[(this.anInt_3252 += -2137630121) * -2128531097 - 1] = (byte)(var2 >> 16);
      this.data[(this.anInt_3252 += -2137630121) * -2128531097 - 1] = (byte)(var2 >> 24);
   }

   public void flush() {
      if(this.anInt_3252 * -2128531097 > 0) {
         if(this.anInt_3252 * -2128531097 + this.anInt_3251 * -655725371 > this.anInt_3250 * 2002526559) {
            throw new RuntimeException();
         }

         this.aBuffer_3249.putData(this.data, 0, this.anInt_3251 * -655725371, -2128531097 * this.anInt_3252);
         this.anInt_3251 += this.anInt_3252 * 43229243;
         this.anInt_3252 = 0;
      }

   }

   public static final boolean isLE() {
      return isLittleEndian;
   }

   public static native int floatToRawIntBits(float var0);

   private static final native byte getLSB(int var0);

}
