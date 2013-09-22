
public class Class228_Sub2 extends Class228 {

   long[] aLongArray_7865 = new long[10];
   long aLong_7866 = 0L;
   long aLong_7867 = 0L;
   int anInt_7868 = 0;
   long aLong_7869 = 0L;
   int anInt_7870 = 1093947855;
   static String aString_7871;


   void method2899(int var1) {
      this.aLong_7867 = 0L;
      if(this.aLong_7866 * 3242709071020362919L > 2888948380069513295L * this.aLong_7869) {
         this.aLong_7869 += this.aLong_7866 * 5588603359788697641L - this.aLong_7869 * 1L;
      }

   }

   long method2902(int var1) {
      this.aLong_7869 += this.method5105((byte)79) * -2362519412054536529L;
      return 3242709071020362919L * this.aLong_7866 > 2888948380069513295L * this.aLong_7869?(this.aLong_7866 * 3242709071020362919L - this.aLong_7869 * 2888948380069513295L) / 1000000L:0L;
   }

   int method2900(long var1) {
      if(this.aLong_7866 * 3242709071020362919L > 2888948380069513295L * this.aLong_7869) {
         this.aLong_7867 += this.aLong_7866 * -8512558143340315359L - -1806982460255024071L * this.aLong_7869;
         this.aLong_7869 += this.aLong_7866 * 5588603359788697641L - 1L * this.aLong_7869;
         this.aLong_7866 += var1 * 4258139488047979287L;
         return 1;
      } else {
         int var3 = 0;

         do {
            ++var3;
            this.aLong_7866 += 4258139488047979287L * var1;
         } while(var3 < 10 && this.aLong_7866 * 3242709071020362919L < this.aLong_7869 * 2888948380069513295L);

         if(this.aLong_7866 * 3242709071020362919L < 2888948380069513295L * this.aLong_7869) {
            this.aLong_7866 = 7485986131996152857L * this.aLong_7869;
         }

         return var3;
      }
   }

   long method2901(byte var1) {
      return this.aLong_7869 * 2888948380069513295L;
   }

   long method5105(byte var1) {
      long var2 = System.nanoTime();
      long var4 = var2 - 2382779119172044999L * this.aLong_7867;
      this.aLong_7867 = var2 * -2962325542550865673L;
      if(var4 > -5000000000L && var4 < 5000000000L) {
         this.aLongArray_7865[-1592919957 * this.anInt_7868] = var4;
         this.anInt_7868 = -432606141 * ((-1592919957 * this.anInt_7868 + 1) % 10);
         if(this.anInt_7870 * -14609105 < 1) {
            this.anInt_7870 += 1093947855;
         }
      }

      long var6 = 0L;

      for(int var8 = 1; var8 <= this.anInt_7870 * -14609105; ++var8) {
         var6 += this.aLongArray_7865[(10 + (-1592919957 * this.anInt_7868 - var8)) % 10];
      }

      return var6 / (long)(this.anInt_7870 * -14609105);
   }

   Class228_Sub2() {
      this.aLong_7869 = System.nanoTime() * -2362519412054536529L;
      this.aLong_7866 = System.nanoTime() * 4258139488047979287L;
   }
}
