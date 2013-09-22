
public class Class269 {

   static final int anInt_4647 = 100;
   boolean aBoolean_4648 = true;
   static final int anInt_4649 = 10;
   static final float aFloat_4650 = 3.0F;
   Class628[] aClass628Array_4651;
   WorldObjects aClass259_4652;
   Class632 aClass632_4653;
   boolean aBoolean_4654 = false;
   int anInt_4655;
   int anInt_4656;
   int[][][] anIntArrayArrayArray_4657;
   int anInt_4658;
   int anInt_4659 = -1;
   int anInt_4660;
   int anInt_4661 = 0;
   int anInt_4662;
   Class628[] aClass628Array_4663;
   Class628[] aClass628Array_4664;
   static Renderer aRenderer_4665;
   int[] anIntArray_4666;
   int[] anIntArray_4667;
   int[] anIntArray_4668;
   int[] anIntArray_4669;
   Class628[] aClass628Array_4670;
   public boolean aBoolean_4671 = true;
   final float[] aFloatArray_4672 = new float[3];
   int[] anIntArray_4673;
   int anInt_4674 = -1;
   int[] anIntArray_4675;
   final int[] anIntArray_4676 = new int[2];
   boolean aBoolean_4677 = true;


   public void method3534() {
      this.method3536();
   }

   boolean method3535(Class628 var1, int var2) {
      if(!this.method3539(var1.anIntArray_10067[var2], var1.anIntArray_10068[var2], var1.anIntArray_10070[var2])) {
         return false;
      } else {
         var1.aShortArray_10062[var2] = (short)((int)this.aFloatArray_4672[0]);
         var1.aShortArray_10059[var2] = (short)((int)this.aFloatArray_4672[1]);
         var1.aShortArray_10072[var2] = (short)((int)this.aFloatArray_4672[2]);
         return true;
      }
   }

   void method3536() {
      int var1;
      for(var1 = 0; var1 < this.anInt_4660; ++var1) {
         this.aClass628Array_4664[var1] = null;
      }

      this.anInt_4660 = 0;

      int var2;
      int var3;
      Class638 var4;
      for(var1 = 0; var1 < this.aClass259_4652.anInt_4480 * -743133593; ++var1) {
         for(var2 = 0; var2 < this.aClass259_4652.anInt_4481 * 1346434785; ++var2) {
            for(var3 = 0; var3 < this.aClass259_4652.anInt_4479 * -1775771909; ++var3) {
               var4 = this.aClass259_4652.tiles[var1][var3][var2];
               if(var4 != null) {
                  if(var4.aShort_10130 > 0) {
                     var4.aShort_10130 = (short)(var4.aShort_10130 * -1);
                  }

                  if(var4.aShort_10140 > 0) {
                     var4.aShort_10140 = (short)(var4.aShort_10140 * -1);
                  }
               }
            }
         }
      }

      for(var1 = 0; var1 < this.aClass259_4652.anInt_4480 * -743133593; ++var1) {
         for(var2 = 0; var2 < this.aClass259_4652.anInt_4481 * 1346434785; ++var2) {
            for(var3 = 0; var3 < this.aClass259_4652.anInt_4479 * -1775771909; ++var3) {
               var4 = this.aClass259_4652.tiles[var1][var3][var2];
               if(var4 != null) {
                  boolean var5 = this.aClass259_4652.tiles[0][var3][var2] != null && this.aClass259_4652.tiles[0][var3][var2].aClass638_10135 != null;
                  int var6;
                  int var7;
                  int var9;
                  Class638 var10;
                  int var11;
                  int var12;
                  int var13;
                  int var14;
                  int var15;
                  int var17;
                  int var16;
                  int var19;
                  int var18;
                  int var21;
                  int var20;
                  if(var4.aShort_10130 < 0) {
                     var6 = var2;
                     var7 = var2;
                     var9 = var1;
                     var10 = this.aClass259_4652.tiles[var1][var3][var2 - 1];

                     for(var11 = this.aClass259_4652.aClass171Array_4486[var1].method2155(var3, var2, (short)-5774); var6 > 0 && var10 != null && var10.aShort_10130 < 0 && var10.aShort_10130 == var4.aShort_10130 && var10.aShort_10139 == var4.aShort_10139 && var11 == this.aClass259_4652.aClass171Array_4486[var1].method2155(var3, var6 - 1, (short)-4614) && (var6 - 1 <= 0 || var11 == this.aClass259_4652.aClass171Array_4486[var1].method2155(var3, var6 - 2, (short)-5791)) && var7 - var6 <= 10; var10 = this.aClass259_4652.tiles[var1][var3][var6 - 1]) {
                        --var6;
                     }

                     for(var10 = this.aClass259_4652.tiles[var1][var3][var7 + 1]; var7 < this.aClass259_4652.anInt_4479 * -1775771909 && var10 != null && var10.aShort_10130 < 0 && var10.aShort_10130 == var4.aShort_10130 && var10.aShort_10139 == var4.aShort_10139 && var11 == this.aClass259_4652.aClass171Array_4486[var1].method2155(var3, var7 + 1, (short)-25089) && (var7 + 1 >= this.aClass259_4652.anInt_4479 * -1775771909 || var11 == this.aClass259_4652.aClass171Array_4486[var1].method2155(var3, var7 + 2, (short)-2300)) && var7 - var6 <= 10; var10 = this.aClass259_4652.tiles[var1][var3][var7 + 1]) {
                        ++var7;
                     }

                     var12 = var1 - var1 + 1;
                     var13 = this.aClass259_4652.aClass171Array_4486[var5?var1 + 1:var1].method2155(var3, var6, (short)6244);
                     var14 = var13 + var4.aShort_10130 * var12;
                     var15 = this.aClass259_4652.aClass171Array_4486[var5?var1 + 1:var1].method2155(var3, var7 + 1, (short)-12505);
                     var16 = var15 + var4.aShort_10130 * var12;
                     var17 = var3 << this.aClass259_4652.shiftAmount * 725150473;
                     var18 = var6 << this.aClass259_4652.shiftAmount * 725150473;
                     var19 = (var7 << this.aClass259_4652.shiftAmount * 725150473) + this.aClass259_4652.anInt_4530 * -1510650155;
                     this.aClass628Array_4664[this.anInt_4660++] = new Class628(this.aClass259_4652, 1, var1, var17 + var4.aShort_10139, var17 + var4.aShort_10139, var17 + var4.aShort_10139, var17 + var4.aShort_10139, var13, var15, var16, var14, var18, var19, var19, var18);

                     for(var20 = var1; var20 <= var9; ++var20) {
                        for(var21 = var6; var21 <= var7; ++var21) {
                           this.aClass259_4652.tiles[var20][var3][var21].aShort_10130 = (short)(this.aClass259_4652.tiles[var20][var3][var21].aShort_10130 * -1);
                        }
                     }
                  }

                  if(var4.aShort_10140 < 0) {
                     var6 = var3;
                     var7 = var3;
                     var9 = var1;
                     var10 = this.aClass259_4652.tiles[var1][var3 - 1][var2];

                     for(var11 = this.aClass259_4652.aClass171Array_4486[var1].method2155(var3, var2, (short)-2078); var6 > 0 && var10 != null && var10.aShort_10140 < 0 && var10.aShort_10140 == var4.aShort_10140 && var10.aShort_10141 == var4.aShort_10141 && var11 == this.aClass259_4652.aClass171Array_4486[var1].method2155(var6 - 1, var2, (short)12636) && (var6 - 1 <= 0 || var11 == this.aClass259_4652.aClass171Array_4486[var1].method2155(var6 - 2, var2, (short)-13352)) && var7 - var6 <= 10; var10 = this.aClass259_4652.tiles[var1][var6 - 1][var2]) {
                        --var6;
                     }

                     for(var10 = this.aClass259_4652.tiles[var1][var7 + 1][var2]; var7 < this.aClass259_4652.anInt_4481 * 1346434785 && var10 != null && var10.aShort_10140 < 0 && var10.aShort_10140 == var4.aShort_10140 && var10.aShort_10141 == var4.aShort_10141 && var11 == this.aClass259_4652.aClass171Array_4486[var1].method2155(var7 + 1, var2, (short)-14320) && (var7 + 1 >= this.aClass259_4652.anInt_4481 * 1346434785 || var11 == this.aClass259_4652.aClass171Array_4486[var1].method2155(var7 + 2, var2, (short)-24089)) && var7 - var6 <= 10; var10 = this.aClass259_4652.tiles[var1][var7 + 1][var2]) {
                        ++var7;
                     }

                     var12 = var1 - var1 + 1;
                     var13 = this.aClass259_4652.aClass171Array_4486[var5?var1 + 1:var1].method2155(var6, var2, (short)-9003);
                     var14 = var13 + var4.aShort_10140 * var12;
                     var15 = this.aClass259_4652.aClass171Array_4486[var5?var1 + 1:var1].method2155(var7 + 1, var2, (short)-4555);
                     var16 = var15 + var4.aShort_10140 * var12;
                     var17 = var6 << this.aClass259_4652.shiftAmount * 725150473;
                     var18 = (var7 << this.aClass259_4652.shiftAmount * 725150473) + this.aClass259_4652.anInt_4530 * -1510650155;
                     var19 = var2 << this.aClass259_4652.shiftAmount * 725150473;
                     this.aClass628Array_4664[this.anInt_4660++] = new Class628(this.aClass259_4652, 2, var1, var17, var18, var18, var17, var13, var15, var16, var14, var19 + var4.aShort_10141, var19 + var4.aShort_10141, var19 + var4.aShort_10141, var19 + var4.aShort_10141);

                     for(var20 = var1; var20 <= var9; ++var20) {
                        for(var21 = var6; var21 <= var7; ++var21) {
                           this.aClass259_4652.tiles[var20][var21][var2].aShort_10140 = (short)(this.aClass259_4652.tiles[var20][var21][var2].aShort_10140 * -1);
                        }
                     }
                  }
               }
            }
         }
      }

      this.aBoolean_4654 = true;
   }

   void method3537(Renderer var1, int var2) {
      aRenderer_4665 = var1;
      if(this.aBoolean_4671 && this.aBoolean_4648) {
         if(this.aBoolean_4677) {
            this.aClass259_4652.aClass499_4476.method5831((byte)-1);
         }

         aRenderer_4665.method1895(this.anIntArray_4676);
         if(this.anInt_4674 != (int)((float)this.anIntArray_4676[0] / 3.0F) || this.anInt_4659 != (int)((float)this.anIntArray_4676[1] / 3.0F)) {
            this.anInt_4674 = (int)((float)this.anIntArray_4676[0] / 3.0F);
            this.anInt_4659 = (int)((float)this.anIntArray_4676[1] / 3.0F);
            this.anIntArray_4673 = new int[this.anInt_4674 * this.anInt_4659];
         }

         this.anInt_4661 = 0;

         int var3;
         for(var3 = 0; var3 < this.anInt_4658; ++var3) {
            this.method3538(aRenderer_4665, this.aClass628Array_4663[var3], var2);
         }

         for(var3 = 0; var3 < this.anInt_4660; ++var3) {
            this.method3538(aRenderer_4665, this.aClass628Array_4664[var3], var2);
         }

         for(var3 = 0; var3 < this.anInt_4662; ++var3) {
            this.method3538(aRenderer_4665, this.aClass628Array_4651[var3], var2);
         }

         this.aClass632_4653.anInt_10090 = 0;
         if(this.anInt_4661 > 0) {
            var3 = this.anIntArray_4673.length;
            int var4 = var3 - var3 & 7;

            int var5;
            for(var5 = 0; var5 < var4; this.anIntArray_4673[var5++] = Integer.MAX_VALUE) {
               this.anIntArray_4673[var5++] = Integer.MAX_VALUE;
               this.anIntArray_4673[var5++] = Integer.MAX_VALUE;
               this.anIntArray_4673[var5++] = Integer.MAX_VALUE;
               this.anIntArray_4673[var5++] = Integer.MAX_VALUE;
               this.anIntArray_4673[var5++] = Integer.MAX_VALUE;
               this.anIntArray_4673[var5++] = Integer.MAX_VALUE;
               this.anIntArray_4673[var5++] = Integer.MAX_VALUE;
            }

            while(var5 < var3) {
               this.anIntArray_4673[var5++] = Integer.MAX_VALUE;
            }

            this.aClass632_4653.anInt_10084 = 1;

            for(int var6 = 0; var6 < this.anInt_4661; ++var6) {
               Class628 var7 = this.aClass628Array_4670[var6];
               this.aClass632_4653.method6700(var7.aShortArray_10059[0], var7.aShortArray_10059[1], var7.aShortArray_10059[3], var7.aShortArray_10062[0], var7.aShortArray_10062[1], var7.aShortArray_10062[3], var7.aShortArray_10072[0], var7.aShortArray_10072[1], var7.aShortArray_10072[3]);
               this.aClass632_4653.method6700(var7.aShortArray_10059[1], var7.aShortArray_10059[2], var7.aShortArray_10059[3], var7.aShortArray_10062[1], var7.aShortArray_10062[2], var7.aShortArray_10062[3], var7.aShortArray_10072[1], var7.aShortArray_10072[2], var7.aShortArray_10072[3]);
            }

            this.aClass632_4653.anInt_10084 = 2;
         }

         if(this.aBoolean_4677) {
            this.aClass259_4652.aClass499_4476.method5831((byte)-1);
         }

      } else {
         this.anInt_4661 = 0;
      }
   }

   void method3538(Renderer var1, Class628 var2, int var3) {
      aRenderer_4665 = var1;
      int var4;
      if(this.anIntArray_4666 != null && var2.aByte_10069 >= var3) {
         for(var4 = 0; var4 < this.anIntArray_4666.length; ++var4) {
            if(this.anIntArray_4666[var4] != -1000000 && (var2.anIntArray_10068[0] <= this.anIntArray_4666[var4] || var2.anIntArray_10068[1] <= this.anIntArray_4666[var4] || var2.anIntArray_10068[2] <= this.anIntArray_4666[var4] || var2.anIntArray_10068[3] <= this.anIntArray_4666[var4]) && (var2.anIntArray_10067[0] <= this.anIntArray_4668[var4] || var2.anIntArray_10067[1] <= this.anIntArray_4668[var4] || var2.anIntArray_10067[2] <= this.anIntArray_4668[var4] || var2.anIntArray_10067[3] <= this.anIntArray_4668[var4]) && (var2.anIntArray_10067[0] >= this.anIntArray_4667[var4] || var2.anIntArray_10067[1] >= this.anIntArray_4667[var4] || var2.anIntArray_10067[2] >= this.anIntArray_4667[var4] || var2.anIntArray_10067[3] >= this.anIntArray_4667[var4]) && (var2.anIntArray_10070[0] <= this.anIntArray_4669[var4] || var2.anIntArray_10070[1] <= this.anIntArray_4669[var4] || var2.anIntArray_10070[2] <= this.anIntArray_4669[var4] || var2.anIntArray_10070[3] <= this.anIntArray_4669[var4]) && (var2.anIntArray_10070[0] >= this.anIntArray_4675[var4] || var2.anIntArray_10070[1] >= this.anIntArray_4675[var4] || var2.anIntArray_10070[2] >= this.anIntArray_4675[var4] || var2.anIntArray_10070[3] >= this.anIntArray_4675[var4])) {
               return;
            }
         }
      }

      boolean var16;
      int var5;
      int var13;
      float var15;
      if(var2.aByte_10061 == 1) {
         var4 = var2.aShort_10063 - this.aClass259_4652.anInt_4521 * -1947125211 + this.aClass259_4652.anInt_4498 * -644084065;
         if(var4 >= 0 && var4 <= this.aClass259_4652.anInt_4498 * -644084065 + this.aClass259_4652.anInt_4498 * -644084065) {
            var5 = var2.aShort_10065 - this.aClass259_4652.anInt_4508 * -2026113737 + this.aClass259_4652.anInt_4498 * -644084065;
            if(var5 < 0) {
               var5 = 0;
            } else if(var5 > this.aClass259_4652.anInt_4498 * -644084065 + this.aClass259_4652.anInt_4498 * -644084065) {
               return;
            }

            var13 = var2.aShort_10066 - this.aClass259_4652.anInt_4508 * -2026113737 + this.aClass259_4652.anInt_4498 * -644084065;
            if(var13 > this.aClass259_4652.anInt_4498 * -644084065 + this.aClass259_4652.anInt_4498 * -644084065) {
               var13 = this.aClass259_4652.anInt_4498 * -644084065 + this.aClass259_4652.anInt_4498 * -644084065;
            } else if(var13 < 0) {
               return;
            }

            var16 = false;

            while(var5 <= var13) {
               if(this.aClass259_4652.aBooleanArrayArray_4531[var4][var5++]) {
                  var16 = true;
                  break;
               }
            }

            if(var16) {
               var15 = (float)(this.aClass259_4652.anInt_4509 * -2021816805 - var2.anIntArray_10067[0]);
               if(var15 < 0.0F) {
                  var15 *= -1.0F;
               }

               if(var15 >= (float)this.anInt_4655) {
                  if(this.method3535(var2, 0)) {
                     if(this.method3535(var2, 1)) {
                        if(this.method3535(var2, 2)) {
                           if(this.method3535(var2, 3)) {
                              this.aClass628Array_4670[this.anInt_4661++] = var2;
                           }
                        }
                     }
                  }
               }
            }
         }
      } else if(var2.aByte_10061 == 2) {
         var4 = var2.aShort_10065 - this.aClass259_4652.anInt_4508 * -2026113737 + this.aClass259_4652.anInt_4498 * -644084065;
         if(var4 >= 0 && var4 <= this.aClass259_4652.anInt_4498 * -644084065 + this.aClass259_4652.anInt_4498 * -644084065) {
            var5 = var2.aShort_10063 - this.aClass259_4652.anInt_4521 * -1947125211 + this.aClass259_4652.anInt_4498 * -644084065;
            if(var5 < 0) {
               var5 = 0;
            } else if(var5 > this.aClass259_4652.anInt_4498 * -644084065 + this.aClass259_4652.anInt_4498 * -644084065) {
               return;
            }

            var13 = var2.aShort_10064 - this.aClass259_4652.anInt_4521 * -1947125211 + this.aClass259_4652.anInt_4498 * -644084065;
            if(var13 > this.aClass259_4652.anInt_4498 * -644084065 + this.aClass259_4652.anInt_4498 * -644084065) {
               var13 = this.aClass259_4652.anInt_4498 * -644084065 + this.aClass259_4652.anInt_4498 * -644084065;
            } else if(var13 < 0) {
               return;
            }

            var16 = false;

            while(var5 <= var13) {
               if(this.aClass259_4652.aBooleanArrayArray_4531[var5++][var4]) {
                  var16 = true;
                  break;
               }
            }

            if(var16) {
               var15 = (float)(this.aClass259_4652.anInt_4478 * -20121723 - var2.anIntArray_10070[0]);
               if(var15 < 0.0F) {
                  var15 *= -1.0F;
               }

               if(var15 >= (float)this.anInt_4655) {
                  if(this.method3535(var2, 0)) {
                     if(this.method3535(var2, 1)) {
                        if(this.method3535(var2, 2)) {
                           if(this.method3535(var2, 3)) {
                              this.aClass628Array_4670[this.anInt_4661++] = var2;
                           }
                        }
                     }
                  }
               }
            }
         }
      } else if(var2.aByte_10061 != 16 && var2.aByte_10061 != 8) {
         if(var2.aByte_10061 == 4) {
            float var12 = (float)(var2.anIntArray_10068[0] - this.aClass259_4652.anInt_4511 * 1135240551);
            if(var12 > (float)this.anInt_4656) {
               var5 = var2.aShort_10065 - this.aClass259_4652.anInt_4508 * -2026113737 + this.aClass259_4652.anInt_4498 * -644084065;
               if(var5 < 0) {
                  var5 = 0;
               } else if(var5 > this.aClass259_4652.anInt_4498 * -644084065 + this.aClass259_4652.anInt_4498 * -644084065) {
                  return;
               }

               var13 = var2.aShort_10066 - this.aClass259_4652.anInt_4508 * -2026113737 + this.aClass259_4652.anInt_4498 * -644084065;
               if(var13 > this.aClass259_4652.anInt_4498 * -644084065 + this.aClass259_4652.anInt_4498 * -644084065) {
                  var13 = this.aClass259_4652.anInt_4498 * -644084065 + this.aClass259_4652.anInt_4498 * -644084065;
               } else if(var13 < 0) {
                  return;
               }

               int var14 = var2.aShort_10063 - this.aClass259_4652.anInt_4521 * -1947125211 + this.aClass259_4652.anInt_4498 * -644084065;
               if(var14 < 0) {
                  var14 = 0;
               } else if(var14 > this.aClass259_4652.anInt_4498 * -644084065 + this.aClass259_4652.anInt_4498 * -644084065) {
                  return;
               }

               int var8 = var2.aShort_10064 - this.aClass259_4652.anInt_4521 * -1947125211 + this.aClass259_4652.anInt_4498 * -644084065;
               if(var8 > this.aClass259_4652.anInt_4498 * -644084065 + this.aClass259_4652.anInt_4498 * -644084065) {
                  var8 = this.aClass259_4652.anInt_4498 * -644084065 + this.aClass259_4652.anInt_4498 * -644084065;
               } else if(var8 < 0) {
                  return;
               }

               boolean var9 = false;

               label286:
               for(int var10 = var14; var10 <= var8; ++var10) {
                  for(int var11 = var5; var11 <= var13; ++var11) {
                     if(this.aClass259_4652.aBooleanArrayArray_4531[var10][var11]) {
                        var9 = true;
                        break label286;
                     }
                  }
               }

               if(var9) {
                  if(this.method3535(var2, 0)) {
                     if(this.method3535(var2, 1)) {
                        if(this.method3535(var2, 2)) {
                           if(this.method3535(var2, 3)) {
                              this.aClass628Array_4670[this.anInt_4661++] = var2;
                           }
                        }
                     }
                  }
               }
            }
         }
      } else {
         var4 = var2.aShort_10063 - this.aClass259_4652.anInt_4521 * -1947125211 + this.aClass259_4652.anInt_4498 * -644084065;
         if(var4 >= 0 && var4 <= this.aClass259_4652.anInt_4498 * -644084065 + this.aClass259_4652.anInt_4498 * -644084065) {
            var5 = var2.aShort_10065 - this.aClass259_4652.anInt_4508 * -2026113737 + this.aClass259_4652.anInt_4498 * -644084065;
            if(var5 >= 0 && var5 <= this.aClass259_4652.anInt_4498 * -644084065 + this.aClass259_4652.anInt_4498 * -644084065) {
               if(this.aClass259_4652.aBooleanArrayArray_4531[var4][var5]) {
                  float var6 = (float)(this.aClass259_4652.anInt_4509 * -2021816805 - var2.anIntArray_10067[0]);
                  if(var6 < 0.0F) {
                     var6 *= -1.0F;
                  }

                  float var7 = (float)(this.aClass259_4652.anInt_4478 * -20121723 - var2.anIntArray_10070[0]);
                  if(var7 < 0.0F) {
                     var7 *= -1.0F;
                  }

                  if(var6 >= (float)this.anInt_4655 || var7 >= (float)this.anInt_4655) {
                     if(this.method3535(var2, 0)) {
                        if(this.method3535(var2, 1)) {
                           if(this.method3535(var2, 2)) {
                              if(this.method3535(var2, 3)) {
                                 this.aClass628Array_4670[this.anInt_4661++] = var2;
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   final boolean method3539(int var1, int var2, int var3) {
      aRenderer_4665.getScreenPosHidden((float)var1, (float)var2, (float)var3, this.aFloatArray_4672);
      if(this.aFloatArray_4672[2] < 50.0F) {
         return false;
      } else {
         this.aFloatArray_4672[0] /= 3.0F;
         this.aFloatArray_4672[1] /= 3.0F;
         return true;
      }
   }

   boolean method3540(int var1, int var2, int var3) {
      if(this.aBoolean_4671 && this.aBoolean_4648) {
         if(this.aClass632_4653.anInt_10090 < 100) {
            return false;
         } else {
            int var4 = this.anIntArrayArrayArray_4657[var1][var2][var3];
            if(var4 == -(this.aClass259_4652.anInt_4512 * -828122167)) {
               return false;
            } else if(var4 == this.aClass259_4652.anInt_4512 * -828122167) {
               return true;
            } else if(this.aClass259_4652.planes == this.aClass259_4652.aClass171Array_4492) {
               return false;
            } else {
               int var5 = var2 << this.aClass259_4652.shiftAmount * 725150473;
               int var6 = var3 << this.aClass259_4652.shiftAmount * 725150473;
               if(this.method3549(var5 + 1, this.aClass259_4652.planes[var1].method2155(var2, var3, (short)-11586), var6 + 1, var5 + this.aClass259_4652.anInt_4530 * -1510650155 - 1, this.aClass259_4652.planes[var1].method2155(var2 + 1, var3 + 1, (short)2682), var6 + this.aClass259_4652.anInt_4530 * -1510650155 - 1, var5 + 1, this.aClass259_4652.planes[var1].method2155(var2, var3 + 1, (short)-23509), var6 + this.aClass259_4652.anInt_4530 * -1510650155 - 1) && this.method3549(var5 + 1, this.aClass259_4652.planes[var1].method2155(var2, var3, (short)-7022), var6 + 1, var5 + this.aClass259_4652.anInt_4530 * -1510650155 - 1, this.aClass259_4652.planes[var1].method2155(var2 + 1, var3, (short)14355), var6 + 1, var5 + this.aClass259_4652.anInt_4530 * -1510650155 - 1, this.aClass259_4652.planes[var1].method2155(var2 + 1, var3 + 1, (short)7006), var6 + this.aClass259_4652.anInt_4530 * -1510650155 - 1)) {
                  this.anIntArrayArrayArray_4657[var1][var2][var3] = this.aClass259_4652.anInt_4512 * -828122167;
                  return true;
               } else {
                  this.anIntArrayArrayArray_4657[var1][var2][var3] = -(this.aClass259_4652.anInt_4512 * -828122167);
                  return false;
               }
            }
         }
      } else {
         return false;
      }
   }

   boolean method3541(Class563_Sub1_Sub5 var1, int var2, int var3, int var4) {
      if(this.aBoolean_4671 && this.aBoolean_4648) {
         if(this.aClass632_4653.anInt_10090 < 100) {
            return false;
         } else if(!this.method3540(var2, var3, var4)) {
            return false;
         } else {
            int var5 = var3 << this.aClass259_4652.shiftAmount * 725150473;
            int var6 = var4 << this.aClass259_4652.shiftAmount * 725150473;
            int var7 = this.aClass259_4652.planes[var2].method2155(var3, var4, (short)1433) - 1;
            int var8 = var7 + var1.method4732(1258869381);
            return var1.aShort_3323 == 1?(!this.method3549(var5, var7, var6, var5, var8, var6, var5, var8, var6 + this.aClass259_4652.anInt_4530 * -1510650155)?false:this.method3549(var5, var7, var6, var5, var8, var6 + this.aClass259_4652.anInt_4530 * -1510650155, var5, var7, var6 + this.aClass259_4652.anInt_4530 * -1510650155)):(var1.aShort_3323 == 2?(!this.method3549(var5, var7, var6 + this.aClass259_4652.anInt_4530 * -1510650155, var5 + this.aClass259_4652.anInt_4530 * -1510650155, var8, var6 + this.aClass259_4652.anInt_4530 * -1510650155, var5, var8, var6 + this.aClass259_4652.anInt_4530 * -1510650155)?false:this.method3549(var5, var7, var6 + this.aClass259_4652.anInt_4530 * -1510650155, var5 + this.aClass259_4652.anInt_4530 * -1510650155, var7, var6 + this.aClass259_4652.anInt_4530 * -1510650155, var5 + this.aClass259_4652.anInt_4530 * -1510650155, var8, var6 + this.aClass259_4652.anInt_4530 * -1510650155)):(var1.aShort_3323 == 4?(!this.method3549(var5 + this.aClass259_4652.anInt_4530 * -1510650155, var7, var6, var5 + this.aClass259_4652.anInt_4530 * -1510650155, var8, var6, var5 + this.aClass259_4652.anInt_4530 * -1510650155, var8, var6 + this.aClass259_4652.anInt_4530 * -1510650155)?false:this.method3549(var5 + this.aClass259_4652.anInt_4530 * -1510650155, var7, var6, var5 + this.aClass259_4652.anInt_4530 * -1510650155, var8, var6 + this.aClass259_4652.anInt_4530 * -1510650155, var5 + this.aClass259_4652.anInt_4530 * -1510650155, var7, var6 + this.aClass259_4652.anInt_4530 * -1510650155)):(var1.aShort_3323 == 8?(!this.method3549(var5, var7, var6, var5 + this.aClass259_4652.anInt_4530 * -1510650155, var8, var6, var5, var8, var6)?false:this.method3549(var5, var7, var6, var5 + this.aClass259_4652.anInt_4530 * -1510650155, var7, var6, var5 + this.aClass259_4652.anInt_4530 * -1510650155, var8, var6)):(var1.aShort_3323 == 16?this.method3544(var5, var7, var6 + this.aClass259_4652.anInt_4473 * -569208769, this.aClass259_4652.anInt_4473 * -569208769, var8, this.aClass259_4652.anInt_4473 * -569208769):(var1.aShort_3323 == 32?this.method3544(var5 + this.aClass259_4652.anInt_4473 * -569208769, var7, var6 + this.aClass259_4652.anInt_4473 * -569208769, this.aClass259_4652.anInt_4473 * -569208769, var8, this.aClass259_4652.anInt_4473 * -569208769):(var1.aShort_3323 == 64?this.method3544(var5 + this.aClass259_4652.anInt_4473 * -569208769, var7, var6, this.aClass259_4652.anInt_4473 * -569208769, var8, this.aClass259_4652.anInt_4473 * -569208769):(var1.aShort_3323 == 128?this.method3544(var5, var7, var6, this.aClass259_4652.anInt_4473 * -569208769, var8, this.aClass259_4652.anInt_4473 * -569208769):true)))))));
         }
      } else {
         return false;
      }
   }

   Class269(WorldObjects var1) {
      this.anInt_4655 = var1.anInt_4530 * -1510650155;
      this.anInt_4656 = var1.anInt_4530 * -1510650155;
      this.aClass259_4652 = var1;
      this.aClass628Array_4663 = new Class628[517];
      this.anInt_4658 = 0;
      this.aClass628Array_4664 = new Class628[2025];
      this.anInt_4660 = 0;
      this.aClass628Array_4651 = new Class628[1014];
      this.anInt_4662 = 0;
      this.aClass628Array_4670 = new Class628[1039];
      this.anInt_4661 = 0;
      this.anIntArrayArrayArray_4657 = new int[this.aClass259_4652.anInt_4480 * -743133593][this.aClass259_4652.anInt_4481 * 1346434785 + 1][this.aClass259_4652.anInt_4479 * -1775771909 + 1];
      this.aBoolean_4654 = false;
      this.aBoolean_4671 = true;
      if(this.aBoolean_4671) {
         this.aClass632_4653 = new Class632(this);
      }

   }

   boolean method3542(int var1, int var2, int var3, int var4, int var5, Class256 var6) {
      if(this.aBoolean_4671 && this.aBoolean_4648) {
         if(this.aClass632_4653.anInt_10090 < 100) {
            return false;
         } else if(var2 == var3 && var4 == var5) {
            return !this.method3540(var1, var2, var4)?false:this.method3543(var6);
         } else {
            for(int var7 = var2; var7 <= var3; ++var7) {
               for(int var8 = var4; var8 <= var5; ++var8) {
                  if(this.anIntArrayArrayArray_4657[var1][var7][var8] == -(this.aClass259_4652.anInt_4512 * -828122167)) {
                     return false;
                  }
               }
            }

            if(!this.method3543(var6)) {
               return false;
            } else {
               return true;
            }
         }
      } else {
         return false;
      }
   }

   final boolean method3543(Class256 var1) {
      return var1 == null?false:this.method3544(var1.anInt_4417, var1.anInt_4419, var1.anInt_4413, var1.anInt_4421 - var1.anInt_4417, var1.anInt_4418 - var1.anInt_4419, var1.anInt_4422 - var1.anInt_4413);
   }

   final boolean method3544(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var1 + var4;
      int var8 = var2 + var5;
      int var9 = var3 + var6;
      if(!this.method3549(var1, var8, var3, var7, var8, var9, var1, var8, var9)) {
         return false;
      } else if(!this.method3549(var1, var8, var3, var7, var8, var3, var7, var8, var9)) {
         return false;
      } else {
         if(var1 < this.aClass259_4652.anInt_4509 * -2021816805) {
            if(!this.method3549(var1, var2, var9, var1, var8, var3, var1, var8, var9)) {
               return false;
            }

            if(!this.method3549(var1, var2, var9, var1, var2, var3, var1, var8, var3)) {
               return false;
            }
         } else {
            if(!this.method3549(var7, var2, var9, var7, var8, var3, var7, var8, var9)) {
               return false;
            }

            if(!this.method3549(var7, var2, var9, var7, var2, var3, var7, var8, var3)) {
               return false;
            }
         }

         if(var3 < this.aClass259_4652.anInt_4478 * -20121723) {
            if(!this.method3549(var1, var2, var3, var7, var8, var3, var1, var8, var3)) {
               return false;
            }

            if(!this.method3549(var1, var2, var3, var7, var2, var3, var7, var8, var3)) {
               return false;
            }
         } else {
            if(!this.method3549(var1, var2, var9, var7, var8, var9, var1, var8, var9)) {
               return false;
            }

            if(!this.method3549(var1, var2, var9, var7, var2, var9, var7, var8, var9)) {
               return false;
            }
         }

         return true;
      }
   }

   public void method3545(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      this.aClass628Array_4663[this.anInt_4658++] = new Class628(this.aClass259_4652, var1, var2, var3, var4, var4, var3, var7, var8, var8, var7, var5, var5, var6, var6);
   }

   public void method3546(int var1, int var2, int var3, int var4, int var5, int var6) {
      if(var1 != 8 && var1 != 16) {
         Class638 var13 = this.aClass259_4652.tiles[var2][var3][var4];
         if(var13 == null) {
            this.aClass259_4652.tiles[var2][var3][var4] = var13 = new Class638(var2);
         }

         if(var1 == 1) {
            var13.aShort_10130 = (short)var5;
            var13.aShort_10139 = (short)var6;
         } else if(var1 == 2) {
            var13.aShort_10140 = (short)var5;
            var13.aShort_10141 = (short)var6;
         }

         if(this.aBoolean_4654) {
            this.method3536();
         }
      } else {
         int var7;
         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         if(var1 == 8) {
            var7 = var3 << this.aClass259_4652.shiftAmount * 725150473;
            var8 = var7 + this.aClass259_4652.anInt_4530 * -1510650155;
            var9 = var4 << this.aClass259_4652.shiftAmount * 725150473;
            var10 = var9 + this.aClass259_4652.anInt_4530 * -1510650155;
            var11 = this.aClass259_4652.aClass171Array_4486[var2].method2155(var3, var4, (short)12476);
            var12 = this.aClass259_4652.aClass171Array_4486[var2].method2155(var3 + 1, var4 + 1, (short)3378);
            this.aClass628Array_4651[this.anInt_4662++] = new Class628(this.aClass259_4652, var1, var2, var7, var8, var8, var7, var11, var12, var12 - var5, var11 - var5, var9, var10, var10, var9);
         } else {
            var7 = (var3 << this.aClass259_4652.shiftAmount * 725150473) + this.aClass259_4652.anInt_4530 * -1510650155;
            var8 = var7 - this.aClass259_4652.anInt_4530 * -1510650155;
            var9 = var4 << this.aClass259_4652.shiftAmount * 725150473;
            var10 = var9 + this.aClass259_4652.anInt_4530 * -1510650155;
            var11 = this.aClass259_4652.aClass171Array_4486[var2].method2155(var3 + 1, var4, (short)2560);
            var12 = this.aClass259_4652.aClass171Array_4486[var2].method2155(var3, var4 + 1, (short)-12406);
            this.aClass628Array_4651[this.anInt_4662++] = new Class628(this.aClass259_4652, var1, var2, var7, var8, var8, var7, var11, var12, var12 - var5, var11 - var5, var9, var10, var10, var9);
         }
      }

   }

   public void method3547(int var1, int var2, int var3, int var4) {
      if(var1 != 8 && var1 != 16) {
         Class638 var7 = this.aClass259_4652.tiles[var2][var3][var4];
         if(var7 != null) {
            if(var1 == 1) {
               var7.aShort_10130 = 0;
            } else if(var1 == 2) {
               var7.aShort_10140 = 0;
            }
         }

         this.method3536();
      } else {
         for(int var5 = 0; var5 < this.anInt_4662; ++var5) {
            Class628 var6 = this.aClass628Array_4651[var5];
            if(var6.aByte_10061 == var1 && var6.aByte_10069 == var2 && (var6.aShort_10063 == var3 && var6.aShort_10065 == var4 || var6.aShort_10064 == var3 && var6.aShort_10066 == var4)) {
               if(var5 != this.anInt_4662) {
                  System.arraycopy(this.aClass628Array_4651, var5 + 1, this.aClass628Array_4651, var5, this.aClass628Array_4651.length - (var5 + 1));
               }

               --this.anInt_4662;
               return;
            }
         }
      }

   }

   boolean method3548(int var1, int var2, int var3, int var4) {
      if(this.aBoolean_4671 && this.aBoolean_4648) {
         if(this.aClass632_4653.anInt_10090 < 100) {
            return false;
         } else if(!this.method3540(var1, var2, var3)) {
            return false;
         } else {
            int var5 = var2 << this.aClass259_4652.shiftAmount * 725150473;
            int var6 = var3 << this.aClass259_4652.shiftAmount * 725150473;
            return this.method3544(var5, this.aClass259_4652.planes[var1].method2155(var2, var3, (short)-18214), var6, this.aClass259_4652.anInt_4530 * -1510650155, var4, this.aClass259_4652.anInt_4530 * -1510650155);
         }
      } else {
         return false;
      }
   }

   final boolean method3549(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      if(!this.method3539(var1, var2, var3)) {
         return false;
      } else {
         var1 = (int)this.aFloatArray_4672[0];
         var2 = (int)this.aFloatArray_4672[1];
         var3 = (int)this.aFloatArray_4672[2];
         if(!this.method3539(var4, var5, var6)) {
            return false;
         } else {
            var4 = (int)this.aFloatArray_4672[0];
            var5 = (int)this.aFloatArray_4672[1];
            var6 = (int)this.aFloatArray_4672[2];
            if(!this.method3539(var7, var8, var9)) {
               return false;
            } else {
               var7 = (int)this.aFloatArray_4672[0];
               var8 = (int)this.aFloatArray_4672[1];
               var9 = (int)this.aFloatArray_4672[2];
               return this.aClass632_4653.method6700(var2, var5, var8, var1, var4, var7, var3, var6, var9);
            }
         }
      }
   }
}
