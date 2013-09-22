
public class Class333_Sub2 extends Class333 {

   byte[] aByteArray_3943;
   int anInt_3944;
   final int[] anIntArray_3945;
   int anInt_3946;


   void method4118() {
      this.anInt_3944 = 0;
      this.anInt_3946 = 0;
   }

   void method4122() {
      this.anInt_3946 = Math.abs(this.anInt_3946);
      if(this.anInt_3946 >= 4096) {
         this.anInt_3946 = 4095;
      }

      this.method2930(this.anInt_3944++, (byte)(this.anInt_3946 >> 4));
      this.anInt_3946 = 0;
   }

   void method4123(int var1, int var2) {
      this.anInt_3946 += var2 * this.anIntArray_3945[var1] >> 12;
   }

   void method2930(int var1, byte var2) {
      this.aByteArray_3943[this.anInt_3944++] = (byte)(127 + ((var2 & 255) >> 1));
   }

   Class333_Sub2(int var1, int var2, int var3, int var4, int var5, float var6) {
      super(var1, var2, var3, var4, var5);
      this.anIntArray_3945 = new int[this.anInt_6439];

      for(int var7 = 0; var7 < this.anInt_6439; ++var7) {
         this.anIntArray_3945[var7] = (short)((int)(Math.pow((double)var6, (double)var7) * 4096.0D));
      }

   }
}
