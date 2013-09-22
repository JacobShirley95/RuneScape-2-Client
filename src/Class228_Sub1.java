import jaclib.nanotime.QueryPerformanceCounter;

public class Class228_Sub1 extends Class228 {

   int anInt_7754 = -1066721701;
   long nanoTime1 = 0L;
   long aLong_7756 = 0L;
   long nanoTime2 = 0L;
   int anInt_7758 = 0;
   long[] aLongArray_7759 = new long[10];


   void method2899(int var1) {
      this.aLong_7756 = 0L;
      if(this.nanoTime1 * -2510686677360147895L > this.nanoTime2 * -8335284184432965765L) {
         this.nanoTime2 += this.nanoTime1 * -3229629047642484725L - this.nanoTime2 * 1L;
      }

   }

   long method2902(int var1) {
      this.nanoTime2 += this.method5045(-1958559332) * -6086703283769327693L;
      return -2510686677360147895L * this.nanoTime1 > -8335284184432965765L * this.nanoTime2?(this.nanoTime1 * -2510686677360147895L - this.nanoTime2 * -8335284184432965765L) / 1000000L:0L;
   }

   int method2900(long var1) {
      if(-2510686677360147895L * this.nanoTime1 > this.nanoTime2 * -8335284184432965765L) {
         this.aLong_7756 += 3951586986892107405L * this.nanoTime1 - this.nanoTime2 * -7705413402973850937L;
         this.nanoTime2 += -3229629047642484725L * this.nanoTime1 - 1L * this.nanoTime2;
         this.nanoTime1 += 905249151904845817L * var1;
         return 1;
      } else {
         int var3 = 0;

         do {
            ++var3;
            this.nanoTime1 += 905249151904845817L * var1;
         } while(var3 < 10 && this.nanoTime1 * -2510686677360147895L < this.nanoTime2 * -8335284184432965765L);

         if(this.nanoTime1 * -2510686677360147895L < this.nanoTime2 * -8335284184432965765L) {
            this.nanoTime1 = this.nanoTime2 * -4408892633794905181L;
         }

         return var3;
      }
   }

   long method5045(int var1) {
      long var2 = QueryPerformanceCounter.nanoTime();
      long var4 = var2 - this.aLong_7756 * 2448664817112191405L;
      this.aLong_7756 = var2 * 6053368779268520485L;
      if(var4 > -5000000000L && var4 < 5000000000L) {
         this.aLongArray_7759[1583076253 * this.anInt_7758] = var4;
         this.anInt_7758 = (1583076253 * this.anInt_7758 + 1) % 10 * 1426606773;
         if(this.anInt_7754 * 1956176339 < 1) {
            this.anInt_7754 += -1066721701;
         }
      }

      long var6 = 0L;

      for(int var8 = 1; var8 <= 1956176339 * this.anInt_7754; ++var8) {
         var6 += this.aLongArray_7759[(10 + (1583076253 * this.anInt_7758 - var8)) % 10];
      }

      return var6 / (long)(1956176339 * this.anInt_7754);
   }

   long method2901(byte var1) {
      return this.nanoTime2 * -8335284184432965765L;
   }

   Class228_Sub1() {
      this.nanoTime1 = (this.nanoTime2 = QueryPerformanceCounter.nanoTime() * -6086703283769327693L) * -4408892633794905181L;
      if(0L == -8335284184432965765L * this.nanoTime2) {
         throw new RuntimeException();
      }
   }
}
