
public class Class240_Sub45 extends NodeListNode {

   boolean aBoolean_7641;
   static int[] anIntArray_7642;
   int anInt_7643;
   final int anInt_7644;
   int[] anIntArray_7645;
   final int anInt_7646;


   void method4974(int var1, int var2) {
      if(var1 != 0 || var2 != 0) {
         if(anIntArray_7642 == null || anIntArray_7642.length != this.anIntArray_7645.length) {
            anIntArray_7642 = new int[this.anIntArray_7645.length];
         }

         int var3 = this.anIntArray_7645.length;
         int var4 = var1;
         int var5 = this.anInt_7644 - 1;
         int var6 = this.anInt_7644 * var2;
         int var7 = var3 - 1;

         for(int var8 = 0; var8 < var3; var8 += this.anInt_7644) {
            int var9 = var8 + var6 & var7;

            for(int var10 = 0; var10 < this.anInt_7644; ++var10) {
               int var11 = var8 + var10;
               int var12 = var9 + (var10 + var4 & var5);
               anIntArray_7642[var11] = this.anIntArray_7645[var12];
            }
         }

         int[] var13 = this.anIntArray_7645;
         this.anIntArray_7645 = anIntArray_7642;
         anIntArray_7642 = var13;
      }
   }

   int[] method4975() {
      return this.anIntArray_7645;
   }

   Class240_Sub45(int var1, int var2, int var3, int[] var4, boolean var5) {
      this.anInt_7646 = var1;
      this.anInt_7644 = var3;
      this.anIntArray_7645 = var4;
      if(var5) {
         int[] var6 = new int[this.anInt_7644];
         int[] var7 = new int[this.anInt_7644];
         int[] var8 = new int[this.anInt_7644];
         int[] var9 = new int[this.anInt_7644];
         if(anIntArray_7642 == null || anIntArray_7642.length != this.anIntArray_7645.length) {
            anIntArray_7642 = new int[this.anIntArray_7645.length];
         }

         int var10 = this.anInt_7644;
         int var11 = this.anInt_7644;
         int var12 = var10 - 1;
         int var13 = var11 - 1;
         int var14 = var10 * var11;
         int var15;
         int var16 = var15 = 1 * var10;

         int var17;
         int var18;
         for(var17 = 2; var17 >= 0; --var17) {
            for(var18 = var12; var18 >= 0; --var18) {
               --var15;
               int var19 = this.anIntArray_7645[var15];
               var6[var18] += var19 >> 24 & 255;
               var7[var18] += var19 >> 16 & 255;
               var8[var18] += var19 >> 8 & 255;
               var9[var18] += var19 & 255;
            }

            if(var15 == 0) {
               var15 = var14;
            }
         }

         int var20 = var14;

         for(int var21 = var13; var21 >= 0; --var21) {
            int var22 = 1;
            int var23 = 1;
            int var24 = 0;
            int var25 = 0;
            int var26 = 0;
            int var27 = 0;

            for(var18 = 2; var18 >= 0; --var18) {
               --var23;
               var27 += var6[var23];
               var26 += var7[var23];
               var24 += var8[var23];
               var25 += var9[var23];
               if(var23 == 0) {
                  var23 = var10;
               }
            }

            for(var18 = var12; var18 >= 0; --var18) {
               --var23;
               --var22;
               var17 = var27 / 9;
               int var28 = var26 / 9;
               int var29 = var24 / 9;
               int var30 = var25 / 9;
               --var20;
               anIntArray_7642[var20] = var17 << 24 | var28 << 16 | var29 << 8 | var30;
               var27 += var6[var23] - var6[var22];
               var26 += var7[var23] - var7[var22];
               var25 += var9[var23] - var9[var22];
               var24 += var8[var23] - var8[var22];
               if(var23 == 0) {
                  var23 = var10;
               }

               if(var22 == 0) {
                  var22 = var10;
               }
            }

            for(var18 = var12; var18 >= 0; --var18) {
               --var15;
               int var31 = this.anIntArray_7645[var15];
               --var16;
               int var32 = this.anIntArray_7645[var16];
               var6[var18] += (var31 >> 24 & 255) - (var32 >> 24 & 255);
               var7[var18] += (var31 >> 16 & 255) - (var32 >> 16 & 255);
               var8[var18] += (var31 >> 8 & 255) - (var32 >> 8 & 255);
               var9[var18] += (var31 & 255) - (var32 & 255);
            }

            if(var15 == 0) {
               var15 = var14;
            }

            if(var16 == 0) {
               var16 = var14;
            }
         }

         int[] var33 = this.anIntArray_7645;
         this.anIntArray_7645 = anIntArray_7642;
         anIntArray_7642 = var33;
      }

   }
}
