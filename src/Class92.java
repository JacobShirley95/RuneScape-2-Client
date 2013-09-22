
public class Class92 {

   public int anInt_1826;
   public int anInt_1827;
   public boolean aBoolean_1828 = false;
   public int anInt_1829;
   public int anInt_1830;
   public int anInt_1831;


   public boolean method1207(int var1, int var2) {
      if(!this.aBoolean_1828) {
         return false;
      } else {
         int var3 = this.anInt_1827 - this.anInt_1829;
         int var4 = this.anInt_1830 - this.anInt_1826;
         int var5 = var3 * var3 + var4 * var4;
         int var6 = var1 * var3 + var2 * var4 - (this.anInt_1829 * var3 + this.anInt_1826 * var4);
         int var7;
         int var8;
         if(var6 <= 0) {
            var7 = this.anInt_1829 - var1;
            var8 = this.anInt_1826 - var2;
            return var7 * var7 + var8 * var8 < this.anInt_1831 * this.anInt_1831;
         } else if(var6 > var5) {
            var7 = this.anInt_1827 - var1;
            var8 = this.anInt_1830 - var2;
            return var7 * var7 + var8 * var8 < this.anInt_1831 * this.anInt_1831;
         } else {
            var6 = (var6 << 10) / var5;
            var7 = this.anInt_1829 + (var3 * var6 >> 10) - var1;
            var8 = this.anInt_1826 + (var4 * var6 >> 10) - var2;
            return var7 * var7 + var8 * var8 < this.anInt_1831 * this.anInt_1831;
         }
      }
   }

}
