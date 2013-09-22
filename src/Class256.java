
public class Class256 {

   int anInt_4413;
   int anInt_4414;
   int anInt_4415;
   int anInt_4416;
   int anInt_4417;
   int anInt_4418;
   int anInt_4419;
   int anInt_4420;
   int anInt_4421;
   int anInt_4422;


   void method3363(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      this.anInt_4420 = var1;
      this.anInt_4414 = var2;
      this.anInt_4415 = var3;
      this.anInt_4416 = var4 * var4;
      this.anInt_4417 = this.anInt_4420 + var5;
      this.anInt_4421 = this.anInt_4420 + var6;
      this.anInt_4419 = this.anInt_4414 + var7;
      this.anInt_4418 = this.anInt_4414 + var8;
      this.anInt_4413 = this.anInt_4415 + var9;
      this.anInt_4422 = this.anInt_4415 + var10;
   }

   Class256(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      this.anInt_4420 = var1;
      this.anInt_4414 = var2;
      this.anInt_4415 = var3;
      this.anInt_4416 = var4 * var4;
      this.anInt_4417 = this.anInt_4420 + var5;
      this.anInt_4421 = this.anInt_4420 + var6;
      this.anInt_4419 = this.anInt_4414 + var7;
      this.anInt_4418 = this.anInt_4414 + var8;
      this.anInt_4413 = this.anInt_4415 + var9;
      this.anInt_4422 = this.anInt_4415 + var10;
   }

   public boolean method3364(int var1, int var2, int var3) {
      if(var1 >= this.anInt_4417 && var1 <= this.anInt_4421) {
         if(var2 >= this.anInt_4419 && var2 <= this.anInt_4418) {
            if(var3 >= this.anInt_4413 && var3 <= this.anInt_4422) {
               int var4 = var1 - this.anInt_4420;
               int var5 = var3 - this.anInt_4415;
               return var4 * var4 + var5 * var5 < this.anInt_4416;
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }
}
