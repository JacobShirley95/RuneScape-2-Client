
public class Class333_Sub1 extends Class333 {

   final int anInt_3828;
   int anInt_3829;
   int anInt_3830;
   int anInt_3831;
   int anInt_3832;
   int anInt_3833;
   byte[] aByteArray_3834;
   final int anInt_3835;
   final int anInt_3836;


   void method4118() {
      this.anInt_3832 = 0;
      this.anInt_3833 = 0;
   }

   void method4123(int var1, int var2) {
      if(var1 != 0) {
         this.anInt_3830 = this.anInt_3831 * this.anInt_3836 >> 12;
         if(this.anInt_3830 < 0) {
            this.anInt_3830 = 0;
         } else if(this.anInt_3830 > 4096) {
            this.anInt_3830 = 4096;
         }

         this.anInt_3831 = this.anInt_3835 - (var2 < 0?-var2:var2);
         this.anInt_3831 = this.anInt_3831 * this.anInt_3831 >> 12;
         this.anInt_3831 = this.anInt_3831 * this.anInt_3830 >> 12;
         this.anInt_3833 += this.anInt_3831 * this.anInt_3829 >> 12;
         this.anInt_3829 = this.anInt_3829 * this.anInt_3828 >> 12;
      } else {
         this.anInt_3831 = this.anInt_3835 - (var2 < 0?-var2:var2);
         this.anInt_3831 = this.anInt_3831 * this.anInt_3831 >> 12;
         this.anInt_3830 = 4096;
         this.anInt_3833 = this.anInt_3831;
      }

   }

   void method4122() {
      this.anInt_3829 = this.anInt_3828;
      this.anInt_3833 >>= 4;
      if(this.anInt_3833 < 0) {
         this.anInt_3833 = 0;
      } else if(this.anInt_3833 > 255) {
         this.anInt_3833 = 255;
      }

      this.method2811(this.anInt_3832++, (byte)this.anInt_3833);
      this.anInt_3833 = 0;
   }

   Class333_Sub1(int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8) {
      super(var1, var2, var3, var4, var5);
      this.anInt_3836 = (int)(var8 * 4096.0F);
      this.anInt_3835 = (int)(var7 * 4096.0F);
      this.anInt_3829 = this.anInt_3828 = (int)(Math.pow(0.5D, (double)(-var6)) * 4096.0D);
   }

   void method2811(int var1, byte var2) {
      this.aByteArray_3834[var1] = var2;
   }
}
