import java.util.Iterator;

public class Class231_Sub2_Sub1_Sub1 extends Class231_Sub2_Sub1 {

   int anInt_3280;
   Class578 aClass578_3281;
   short aShort_3282;
   short aShort_3283;
   int anInt_3284;
   short aShort_3285;
   short aShort_3286;
   short aShort_3287;
   short aShort_3288;
   short aShort_3289;


   void method2431(Class578 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, boolean var15, boolean var16) {
      this.aClass578_3281 = var1;
      this.anInt_1809 = var2 << 12;
      this.anInt_1807 = var3 << 12;
      this.anInt_1811 = var4 << 12;
      this.anInt_1808 = var10;
      this.aShort_3282 = this.aShort_3283 = (short)var9;
      this.anInt_1810 = var11;
      this.aShort_1814 = (short)var12;
      this.aShort_3289 = (short)var13;
      this.anInt_1806 = var14;
      this.aBoolean_1815 = var16;
      this.aShort_3285 = (short)var5;
      this.aShort_3288 = (short)var6;
      this.aShort_3287 = (short)var7;
      this.anInt_3280 = var8;
      this.method2432();
   }

   void method2432() {
      int var1 = this.aClass578_3281.aClass594_9685.anInt_9823;
      if(this.aClass578_3281.aClass594_9685.aClass231_Sub2_Sub1_Sub1Array_9816[var1] != null) {
         this.aClass578_3281.aClass594_9685.aClass231_Sub2_Sub1_Sub1Array_9816[var1].method2435();
      }

      this.aClass578_3281.aClass594_9685.aClass231_Sub2_Sub1_Sub1Array_9816[var1] = this;
      this.aShort_3286 = (short)this.aClass578_3281.aClass594_9685.anInt_9823;
      this.aClass578_3281.aClass594_9685.anInt_9823 = var1 + 1 & 8191;
      this.aClass578_3281.aClass512_9699.method5931(this, -524504842);
   }

   void method2433(long var1, int var3) {
      this.aShort_3283 = (short)(this.aShort_3283 - var3);
      if(this.aShort_3283 <= 0) {
         this.method2435();
      } else {
         int var4 = this.anInt_1809 >> 12;
         int var5 = this.anInt_1807 >> 12;
         int var6 = this.anInt_1811 >> 12;
         Class594 var7 = this.aClass578_3281.aClass594_9685;
         Class411 var8 = this.aClass578_3281.aClass411_9684;
         if(var8.anInt_7776 * -1842826009 != 0) {
            int var9;
            if(this.aShort_3282 - this.aShort_3283 <= var8.anInt_7829 * -1447772129) {
               var9 = (this.anInt_1808 >> 8 & '\uff00') + (this.anInt_3284 >> 16 & 255) + var8.anInt_7836 * 1498155653 * var3;
               int var10 = (this.anInt_1808 & '\uff00') + (this.anInt_3284 >> 8 & 255) + var8.anInt_7842 * 258459985 * var3;
               int var11 = (this.anInt_1808 << 8 & '\uff00') + (this.anInt_3284 & 255) + var8.anInt_7850 * -381366875 * var3;
               if(var9 < 0) {
                  var9 = 0;
               } else if(var9 > '\uffff') {
                  var9 = '\uffff';
               }

               if(var10 < 0) {
                  var10 = 0;
               } else if(var10 > '\uffff') {
                  var10 = '\uffff';
               }

               if(var11 < 0) {
                  var11 = 0;
               } else if(var11 > '\uffff') {
                  var11 = '\uffff';
               }

               this.anInt_1808 &= -16777216;
               this.anInt_1808 |= ((var9 & '\uff00') << 8) + (var10 & '\uff00') + ((var11 & '\uff00') >> 8);
               this.anInt_3284 &= -16777216;
               this.anInt_3284 |= ((var9 & 255) << 16) + ((var10 & 255) << 8) + (var11 & 255);
            }

            if(this.aShort_3282 - this.aShort_3283 <= var8.anInt_7840 * -1788874199) {
               var9 = (this.anInt_1808 >> 16 & '\uff00') + (this.anInt_3284 >> 24 & 255) + var8.anInt_7844 * -1661682023 * var3;
               if(var9 < 0) {
                  var9 = 0;
               } else if(var9 > '\uffff') {
                  var9 = '\uffff';
               }

               this.anInt_1808 &= 16777215;
               this.anInt_1808 |= (var9 & '\uff00') << 16;
               this.anInt_3284 &= 16777215;
               this.anInt_3284 |= (var9 & 255) << 24;
            }
         }

         if(var8.anInt_7771 * 1816835705 != -1 && this.aShort_3282 - this.aShort_3283 <= var8.anInt_7845 * 237408487) {
            this.anInt_3280 += var8.anInt_7846 * -955603237 * var3;
         }

         if(var8.anInt_7800 * 861550967 != -1 && this.aShort_3282 - this.aShort_3283 <= var8.anInt_7773 * -63477661) {
            this.anInt_1810 += var8.anInt_7848 * -884237057 * var3;
         }

         if(this.aShort_3289 != 0) {
            this.aShort_1814 = (short)(this.aShort_1814 + this.aShort_3289 * var3 & 16383);
         }

         double var12 = (double)this.aShort_3285;
         double var14 = (double)this.aShort_3288;
         double var16 = (double)this.aShort_3287;
         boolean var18 = false;
         int var19;
         int var21;
         int var20;
         long var23;
         int var22;
         if(var8.anInt_7782 * -1456008551 == 1) {
            var19 = var4 - this.aClass578_3281.aClass595_9687.anInt_9839 * -923728711;
            var20 = var5 - this.aClass578_3281.aClass595_9687.anInt_9840 * 1395242255;
            var21 = var6 - this.aClass578_3281.aClass595_9687.anInt_9836 * 1832434039;
            var22 = (int)Math.sqrt((double)(var19 * var19 + var20 * var20 + var21 * var21)) >> 2;
            var23 = (long)(var8.anInt_7783 * -45230435 * var22 * var3);
            this.anInt_3280 = (int)((long)this.anInt_3280 - ((long)this.anInt_3280 * var23 >> 18));
         } else if(var8.anInt_7782 * -1456008551 == 2) {
            var19 = var4 - this.aClass578_3281.aClass595_9687.anInt_9839 * -923728711;
            var20 = var5 - this.aClass578_3281.aClass595_9687.anInt_9840 * 1395242255;
            var21 = var6 - this.aClass578_3281.aClass595_9687.anInt_9836 * 1832434039;
            var22 = var19 * var19 + var20 * var20 + var21 * var21;
            var23 = (long)(var8.anInt_7783 * -45230435 * var22 * var3);
            this.anInt_3280 = (int)((long)this.anInt_3280 - ((long)this.anInt_3280 * var23 >> 28));
         }

         Class401 var68;
         Class240_Sub18 var64;
         if(var8.anIntArray_7801 != null) {
            Iterator var65 = var7.aList_9822.iterator();

            while(var65.hasNext()) {
               var64 = (Class240_Sub18)var65.next();
               var68 = var64.aClass401_7128;
               if(var68.anInt_7626 * -1754227241 != 1) {
                  boolean var67 = false;

                  for(int var25 = 0; var25 < var8.anIntArray_7801.length; ++var25) {
                     if(var8.anIntArray_7801[var25] == var68.anInt_7633 * 1663028727) {
                        var67 = true;
                        break;
                     }
                  }

                  if(var67) {
                     double var69 = (double)(var4 - var64.anInt_7130 * 274889473);
                     double var26 = (double)(var5 - var64.anInt_7133 * -1470810677);
                     double var28 = (double)(var6 - var64.anInt_7129 * -915661517);
                     double var30 = var69 * var69 + var26 * var26 + var28 * var28;
                     if(var30 <= (double)(var68.aLong_7637 * -4939581491706328465L)) {
                        double var32 = Math.sqrt(var30);
                        if(var32 == 0.0D) {
                           var32 = 1.0D;
                        }

                        double var34 = (var69 * (double)var64.aFloat_7127 + var26 * (double)(var68.anInt_7629 * 1689304253) + var28 * (double)var64.aFloat_7132) * 65535.0D / ((double)(var68.anInt_7636 * -415958931) * var32);
                        if(var34 >= (double)(var68.anInt_7630 * 1619805587)) {
                           double var36 = 0.0D;
                           if(var68.anInt_7631 * 1397470781 == 1) {
                              var36 = var32 / 16.0D * (double)(var68.anInt_7614 * -1621816029);
                           } else if(var68.anInt_7631 * 1397470781 == 2) {
                              var36 = var32 / 16.0D * (var32 / 16.0D) * (double)(var68.anInt_7614 * -1621816029);
                           }

                           if(var68.anInt_7634 * -273700157 == 0) {
                              if(var68.anInt_7613 * -1039180185 == 0) {
                                 var12 += ((double)var64.aFloat_7127 - var36) * (double)var3;
                                 var14 += ((double)(var68.anInt_7629 * 1689304253) - var36) * (double)var3;
                                 var16 += ((double)var64.aFloat_7132 - var36) * (double)var3;
                                 var18 = true;
                              } else {
                                 this.anInt_1809 = (int)((double)this.anInt_1809 + ((double)var64.aFloat_7127 - var36) * (double)var3);
                                 this.anInt_1807 = (int)((double)this.anInt_1807 + ((double)(var68.anInt_7629 * 1689304253) - var36) * (double)var3);
                                 this.anInt_1811 = (int)((double)this.anInt_1811 + ((double)var64.aFloat_7132 - var36) * (double)var3);
                              }
                           } else {
                              double var38 = var69 / var32 * (double)(var68.anInt_7636 * -415958931);
                              double var40 = var26 / var32 * (double)(var68.anInt_7636 * -415958931);
                              double var42 = var28 / var32 * (double)(var68.anInt_7636 * -415958931);
                              if(var68.anInt_7613 * -1039180185 == 0) {
                                 var12 += var38 * (double)var3;
                                 var14 += var40 * (double)var3;
                                 var16 += var42 * (double)var3;
                                 var18 = true;
                              } else {
                                 this.anInt_1809 = (int)((double)this.anInt_1809 + var38 * (double)var3);
                                 this.anInt_1807 = (int)((double)this.anInt_1807 + var40 * (double)var3);
                                 this.anInt_1811 = (int)((double)this.anInt_1811 + var42 * (double)var3);
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

         if(var8.anIntArray_7802 != null) {
            for(var19 = 0; var19 < var8.anIntArray_7802.length; ++var19) {
               var64 = (Class240_Sub18)Class597.aNodeArrayList_9859.getNode((long)var8.anIntArray_7802[var19]);

               while(var64 != null) {
                  var68 = var64.aClass401_7128;
                  double var44 = (double)(var4 - var64.anInt_7130 * 274889473);
                  double var46 = (double)(var5 - var64.anInt_7133 * -1470810677);
                  double var48 = (double)(var6 - var64.anInt_7129 * -915661517);
                  double var50 = var44 * var44 + var46 * var46 + var48 * var48;
                  if(var50 > (double)(var68.aLong_7637 * -4939581491706328465L)) {
                     var64 = (Class240_Sub18)Class597.aNodeArrayList_9859.method5939(-1135136201);
                  } else {
                     double var52 = Math.sqrt(var50);
                     if(var52 == 0.0D) {
                        var52 = 1.0D;
                     }

                     double var54 = (var44 * (double)var64.aFloat_7127 + var46 * (double)(var68.anInt_7629 * 1689304253) + var48 * (double)var64.aFloat_7132) * 65535.0D / ((double)(var68.anInt_7636 * -415958931) * var52);
                     if(var54 < (double)(var68.anInt_7630 * 1619805587)) {
                        var64 = (Class240_Sub18)Class597.aNodeArrayList_9859.method5939(-1135136201);
                     } else {
                        double var56 = 0.0D;
                        if(var68.anInt_7631 * 1397470781 == 1) {
                           var56 = var52 / 16.0D * (double)(var68.anInt_7614 * -1621816029);
                        } else if(var68.anInt_7631 * 1397470781 == 2) {
                           var56 = var52 / 16.0D * (var52 / 16.0D) * (double)(var68.anInt_7614 * -1621816029);
                        }

                        if(var68.anInt_7634 * -273700157 == 0) {
                           if(var68.anInt_7613 * -1039180185 == 0) {
                              var12 += ((double)var64.aFloat_7127 - var56) * (double)var3;
                              var14 += ((double)(var68.anInt_7629 * 1689304253) - var56) * (double)var3;
                              var16 += ((double)var64.aFloat_7132 - var56) * (double)var3;
                              var18 = true;
                           } else {
                              this.anInt_1809 = (int)((double)this.anInt_1809 + ((double)var64.aFloat_7127 - var56) * (double)var3);
                              this.anInt_1807 = (int)((double)this.anInt_1807 + ((double)(var68.anInt_7629 * 1689304253) - var56) * (double)var3);
                              this.anInt_1811 = (int)((double)this.anInt_1811 + ((double)var64.aFloat_7132 - var56) * (double)var3);
                           }
                        } else {
                           double var58 = var44 / var52 * (double)(var68.anInt_7636 * -415958931);
                           double var60 = var46 / var52 * (double)(var68.anInt_7636 * -415958931);
                           double var62 = var48 / var52 * (double)(var68.anInt_7636 * -415958931);
                           if(var68.anInt_7613 * -1039180185 == 0) {
                              var12 += var58 * (double)var3;
                              var14 += var60 * (double)var3;
                              var16 += var62 * (double)var3;
                              var18 = true;
                           } else {
                              this.anInt_1809 = (int)((double)this.anInt_1809 + var58 * (double)var3);
                              this.anInt_1807 = (int)((double)this.anInt_1807 + var60 * (double)var3);
                              this.anInt_1811 = (int)((double)this.anInt_1811 + var62 * (double)var3);
                           }
                        }

                        var64 = (Class240_Sub18)Class597.aNodeArrayList_9859.method5939(-1135136201);
                     }
                  }
               }
            }
         }

         if(var8.anIntArray_7803 != null) {
            if(var8.anIntArray_7784 == null) {
               var8.anIntArray_7784 = new int[var8.anIntArray_7803.length];

               for(var19 = 0; var19 < var8.anIntArray_7803.length; ++var19) {
                  DrawingTarget.method2203(var8.anIntArray_7803[var19], 563797255);
                  var8.anIntArray_7784[var19] = ((IndexNode)Class401.aNodeArrayList_7612.getNode((long)var8.anIntArray_7803[var19])).cacheID * 523939595;
               }
            }

            for(var19 = 0; var19 < var8.anIntArray_7784.length; ++var19) {
               Class401 var66 = Class401.aClass401Array_7620[var8.anIntArray_7784[var19]];
               if(var66.anInt_7613 * -1039180185 == 0) {
                  var12 += (double)(var66.anInt_7638 * -1831859401 * var3);
                  var14 += (double)(var66.anInt_7629 * 1689304253 * var3);
                  var16 += (double)(var66.anInt_7628 * 218013533 * var3);
                  var18 = true;
               } else {
                  this.anInt_1809 += var66.anInt_7638 * -1831859401 * var3;
                  this.anInt_1807 += var66.anInt_7629 * 1689304253 * var3;
                  this.anInt_1811 += var66.anInt_7628 * 218013533 * var3;
               }
            }
         }

         if(var18) {
            while(var12 > 32767.0D || var14 > 32767.0D || var16 > 32767.0D || var12 < -32767.0D || var14 < -32767.0D || var16 < -32767.0D) {
               var12 /= 2.0D;
               var14 /= 2.0D;
               var16 /= 2.0D;
               this.anInt_3280 <<= 1;
            }

            this.aShort_3285 = (short)((int)var12);
            this.aShort_3288 = (short)((int)var14);
            this.aShort_3287 = (short)((int)var16);
         }

         this.anInt_1809 = (int)((long)this.anInt_1809 + ((long)this.aShort_3285 * (long)(this.anInt_3280 << 2) >> 23) * (long)var3);
         this.anInt_1807 = (int)((long)this.anInt_1807 + ((long)this.aShort_3288 * (long)(this.anInt_3280 << 2) >> 23) * (long)var3);
         this.anInt_1811 = (int)((long)this.anInt_1811 + ((long)this.aShort_3287 * (long)(this.anInt_3280 << 2) >> 23) * (long)var3);
      }
   }

   void method2434(WorldObjects var1, Renderer var2, long var3) {
      int var5 = this.anInt_1809 >> 12 + var1.shiftAmount * 725150473;
      int var6 = this.anInt_1811 >> 12 + var1.shiftAmount * 725150473;
      int var7 = this.anInt_1807 >> 12;
      if(var7 <= 262144 && var7 >= -262144 && var5 >= 0 && var5 < var1.anInt_4481 * 1346434785 && var6 >= 0 && var6 < var1.anInt_4479 * -1775771909) {
         Class594 var8 = this.aClass578_3281.aClass594_9685;
         Class411 var9 = this.aClass578_3281.aClass411_9684;
         Plane[] var10 = var1.planes;
         int var11 = var8.anInt_9826;
         Class638 var12 = var1.tiles[var8.anInt_9826][var5][var6];
         if(var12 != null) {
            var11 = var12.aByte_10129;
         }

         int var13 = var10[var11].method2155(var5, var6, (short)-15825);
         int var14;
         if(var11 < var1.anInt_4480 * -743133593 - 1) {
            var14 = var10[var11 + 1].method2155(var5, var6, (short)2083);
         } else {
            var14 = var13 - (8 << var1.shiftAmount * 725150473);
         }

         if(var9.aBoolean_7826) {
            if(var9.anInt_7789 * -778815647 == -1 && var7 > var13) {
               this.method2435();
               return;
            }

            if(var9.anInt_7789 * -778815647 >= 0 && var7 > var10[var9.anInt_7789 * -778815647].method2155(var5, var6, (short)12707)) {
               this.method2435();
               return;
            }

            if(var9.anInt_7814 * 538828233 == -1 && var7 < var14) {
               this.method2435();
               return;
            }

            if(var9.anInt_7814 * 538828233 >= 0 && var7 < var10[var9.anInt_7814 * 538828233 + 1].method2155(var5, var6, (short)11431)) {
               this.method2435();
               return;
            }
         }

         int var15;
         for(var15 = var1.anInt_4480 * -743133593 - 1; var15 > 0 && var7 > var10[var15].method2155(var5, var6, (short)11711); --var15) {
            ;
         }

         if(var9.aBoolean_7824 && var15 == 0 && var7 > var10[0].method2155(var5, var6, (short)-3429)) {
            this.method2435();
         } else if(var15 == var1.anInt_4480 * -743133593 - 1 && var10[var15].method2155(var5, var6, (short)-22466) - var7 > 8 << var1.shiftAmount * 725150473) {
            this.method2435();
         } else {
            var12 = var1.tiles[var15][var5][var6];
            int var17;
            if(var12 == null) {
               if(var15 == 0 || var1.tiles[0][var5][var6] == null) {
                  var12 = var1.tiles[0][var5][var6] = new Class638(0);
               }

               boolean var16 = var1.tiles[0][var5][var6].aClass638_10135 != null;
               if(var15 == 3 && var16) {
                  --var15;
               }

               for(var17 = 1; var17 <= var15; ++var17) {
                  if(var1.tiles[var17][var5][var6] == null) {
                     var12 = var1.tiles[var17][var5][var6] = new Class638(var17);
                     if(var16) {
                        ++var12.aByte_10129;
                     }
                  }
               }

               if(var12 == null) {
                  var12 = var1.tiles[var15][var5][var6];
               }
            }

            if(var9.aBoolean_7823) {
               int var20 = this.anInt_1809 >> 12;
               var17 = this.anInt_1811 >> 12;
               Class256 var18;
               if(var12.aClass563_Sub1_Sub5_10131 != null) {
                  var18 = var12.aClass563_Sub1_Sub5_10131.method4735(var2, -608492962);
                  if(var18 != null && var18.method3364(var20, var7, var17)) {
                     this.method2435();
                     return;
                  }
               }

               if(var12.aClass563_Sub1_Sub5_10132 != null) {
                  var18 = var12.aClass563_Sub1_Sub5_10132.method4735(var2, -467077480);
                  if(var18 != null && var18.method3364(var20, var7, var17)) {
                     this.method2435();
                     return;
                  }
               }

               if(var12.aClass563_Sub1_Sub1_10138 != null) {
                  var18 = var12.aClass563_Sub1_Sub1_10138.method4735(var2, -581788015);
                  if(var18 != null && var18.method3364(var20, var7, var17)) {
                     this.method2435();
                     return;
                  }
               }

               for(Class629 var21 = var12.aClass629_10137; var21 != null; var21 = var21.aClass629_10073) {
                  Class256 var19 = var21.aClass563_Sub1_Sub4_10075.method4735(var2, -1079068904);
                  if(var19 != null && var19.method3364(var20, var7, var17)) {
                     this.method2435();
                     return;
                  }
               }
            }

            var8.aClass167_9827.aClass505_3024.method5864(this, -1293642000);
         }
      } else {
         this.method2435();
      }
   }

   void method2435() {
      this.aClass578_3281.aClass594_9685.aClass231_Sub2_Sub1_Sub1Array_9816[this.aShort_3286] = null;
      Class597.aClass231_Sub2_Sub1_Sub1Array_9866[Class597.anInt_9862 * -77671059] = this;
      Class597.anInt_9862 = (Class597.anInt_9862 * -77671059 + 1 & 1023) * -1259766683;
      this.method2931(-1101848233);
      this.method5055((byte)16);
   }

   Class231_Sub2_Sub1_Sub1(Class578 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, boolean var15, boolean var16) {
      this.aClass578_3281 = var1;
      this.anInt_1809 = var2 << 12;
      this.anInt_1807 = var3 << 12;
      this.anInt_1811 = var4 << 12;
      this.anInt_1808 = var10;
      this.aShort_3282 = this.aShort_3283 = (short)var9;
      this.anInt_1810 = var11;
      this.aShort_1814 = (short)var12;
      this.aShort_3289 = (short)var13;
      this.anInt_1806 = var14;
      this.aBoolean_1815 = var16;
      this.aShort_3285 = (short)var5;
      this.aShort_3288 = (short)var6;
      this.aShort_3287 = (short)var7;
      this.anInt_3280 = var8;
      this.method2432();
   }
}
