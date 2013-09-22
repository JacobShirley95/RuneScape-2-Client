
public class Class333_Sub2_Sub1 extends Class333_Sub2 {

   byte[] aByteArray_1080;


   Class333_Sub2_Sub1() {
      super(12, 5, 16, 2, 2, 0.45F);
   }

   void method2930(int var1, byte var2) {
      int var3 = var1 * 2;
      var2 = (byte)(127 + ((var2 & 255) >> 1));
      this.aByteArray_1080[var3++] = var2;
      this.aByteArray_1080[var3] = var2;
   }

   byte[] method557(int var1, int var2, int var3) {
      this.aByteArray_1080 = new byte[var1 * var2 * var3 * 2];
      this.method4117(var1, var2, var3);
      return this.aByteArray_1080;
   }
}
