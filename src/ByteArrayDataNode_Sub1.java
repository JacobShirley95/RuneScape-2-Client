
public class ByteArrayDataNode_Sub1 extends ByteArrayDataNode {

   static final int[] anIntArray_844 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, '\uffff', 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
   int anInt_845;
   Class528 aClass528_846;


   public void method287(Class528 var1, int var2) {
      this.aClass528_846 = var1;
   }

   public void method288(int var1, int var2) {
      this.data[(this.index += -2043502829) * 964952859 - 1] = (byte)(var1 + this.aClass528_846.method6007((byte)36));
   }

   public ByteArrayDataNode_Sub1(int var1) {
      super(var1);
   }

   public int method289(int var1) {
      int var2 = this.data[(this.index += -2043502829) * 964952859 - 1] - this.aClass528_846.method6007((byte)-62) & 255;
      return var2 < 128?var2:(var2 - 128 << 8) + (this.data[(this.index += -2043502829) * 964952859 - 1] - this.aClass528_846.method6007((byte)92) & 255);
   }

   public boolean method290(int var1) {
      int var2 = this.data[this.index * 964952859] - this.aClass528_846.method6008(1213156050) & 255;
      return var2 >= 128;
   }

   public int method291(int var1, int var2) {
      int var3 = 66280549 * this.anInt_845 >> 3;
      int var4 = 8 - (this.anInt_845 * 66280549 & 7);
      int var5 = 0;

      for(this.anInt_845 += -1773013651 * var1; var1 > var4; var4 = 8) {
         var5 += (this.data[var3++] & anIntArray_844[var4]) << var1 - var4;
         var1 -= var4;
      }

      if(var1 == var4) {
         var5 += this.data[var3] & anIntArray_844[var4];
      } else {
         var5 += this.data[var3] >> var4 - var1 & anIntArray_844[var1];
      }

      return var5;
   }

   public void method292(int var1) {
      this.index = -2043502829 * ((66280549 * this.anInt_845 + 7) / 8);
   }

   public int method293(int var1, int var2) {
      return var1 * 8 - 66280549 * this.anInt_845;
   }

   public void method294(byte var1) {
      this.anInt_845 = 231295992 * this.index;
   }

   public void method295(byte[] var1, int var2, int var3, int var4) {
      for(int var5 = 0; var5 < var3; ++var5) {
         var1[var5 + var2] = (byte)(this.data[(this.index += -2043502829) * 964952859 - 1] - this.aClass528_846.method6007((byte)-18));
      }

   }
}
