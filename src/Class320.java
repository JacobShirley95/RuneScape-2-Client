
public class Class320 {

   int anInt_6193 = Class240_Sub2.method4405(24);
   int anInt_6194 = Class240_Sub2.method4405(24);
   int anInt_6195 = Class240_Sub2.method4405(24) + 1;
   int anInt_6196 = Class240_Sub2.method4405(8);
   int anInt_6197 = Class240_Sub2.method4405(6) + 1;
   int anInt_6198 = Class240_Sub2.method4405(16);
   int[] anIntArray_6199;


   void method3959(float[] var1, int var2, boolean var3, Class240_Sub2 var4) {
      int var5;
      for(var5 = 0; var5 < var2; ++var5) {
         var1[var5] = 0.0F;
      }

      if(!var3) {
         var5 = var4.aClass219Array_6700[this.anInt_6196].anInt_3776;
         int var6 = this.anInt_6193 - this.anInt_6194;
         int var7 = var6 / this.anInt_6195;
         int[] var8 = new int[var7];

         for(int var9 = 0; var9 < 8; ++var9) {
            int var10 = 0;

            while(var10 < var7) {
               int var11;
               int var12;
               if(var9 == 0) {
                  var11 = var4.aClass219Array_6700[this.anInt_6196].method2763();

                  for(var12 = var5 - 1; var12 >= 0; --var12) {
                     if(var10 + var12 < var7) {
                        var8[var10 + var12] = var11 % this.anInt_6197;
                     }

                     var11 /= this.anInt_6197;
                  }
               }

               for(var11 = 0; var11 < var5; ++var11) {
                  var12 = var8[var10];
                  int var13 = this.anIntArray_6199[var12 * 8 + var9];
                  if(var13 >= 0) {
                     int var14 = this.anInt_6194 + var10 * this.anInt_6195;
                     Class219 var15 = var4.aClass219Array_6700[var13];
                     int var16;
                     if(this.anInt_6198 == 0) {
                        var16 = this.anInt_6195 / var15.anInt_3776;

                        for(int var20 = 0; var20 < var16; ++var20) {
                           float[] var21 = var15.method2761();

                           for(int var19 = 0; var19 < var15.anInt_3776; ++var19) {
                              var1[var14 + var20 + var19 * var16] += var21[var19];
                           }
                        }
                     } else {
                        var16 = 0;

                        while(var16 < this.anInt_6195) {
                           float[] var17 = var15.method2761();

                           for(int var18 = 0; var18 < var15.anInt_3776; ++var18) {
                              var1[var14 + var16] += var17[var18];
                              ++var16;
                           }
                        }
                     }
                  }

                  ++var10;
                  if(var10 >= var7) {
                     break;
                  }
               }
            }
         }

      }
   }

   Class320() {
      int[] var1 = new int[this.anInt_6197];

      int var2;
      for(var2 = 0; var2 < this.anInt_6197; ++var2) {
         int var3 = 0;
         int var4 = Class240_Sub2.method4405(3);
         boolean var5 = Class240_Sub2.method4420() != 0;
         if(var5) {
            var3 = Class240_Sub2.method4405(5);
         }

         var1[var2] = var3 << 3 | var4;
      }

      this.anIntArray_6199 = new int[this.anInt_6197 * 8];

      for(var2 = 0; var2 < this.anInt_6197 * 8; ++var2) {
         this.anIntArray_6199[var2] = (var1[var2 >> 3] & 1 << (var2 & 7)) != 0?Class240_Sub2.method4405(8):-1;
      }

   }
}
