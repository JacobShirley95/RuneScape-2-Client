
public class SoftwarePlane extends Plane {

   static final int anInt_10946 = -1694498816;
   float aFloat_10947;
   static final int anInt_10948 = 1;
   float aFloat_10949;
   static final int anInt_10950 = 4;
   static final int anInt_10951 = 64;
   final int anInt_10952;
   float aFloat_10953;
   float aFloat_10954;
   Class197[][] colours;
   Class196[][] vertices;
   Class139[][] positionData;
   float aFloat_10958;
   Class199[][] aClass199ArrayArray_10959;
   Class190[][] aClass190ArrayArray_10960;
   float aFloat_10961;
   float aFloat_10962;
   float aFloat_10963;
   float aFloat_10964;
   float aFloat_10965;
   float aFloat_10966;
   float aFloat_10967;
   float aFloat_10968;
   float aFloat_10969;
   final SoftwareRenderer aRenderer_Sub1_10970;
   float aFloat_10971;
   static final int anInt_10972 = 2;
   byte[][] renderBuffer;
   float aFloat_10974;
   byte[][] aByteArrayArray_10975;
   static final boolean aBoolean_10976 = true;
   static final boolean aBoolean_10977 = true;
   static final boolean aBoolean_10978 = false;


   public void method2149(int var1, int var2, int var3) {
      if(this.aByteArrayArray_10975[var1][var2] < var3) {
         this.aByteArrayArray_10975[var1][var2] = (byte)var3;
      }

   }

   void method7556(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean[][] var8, Class210 var9, Class202 var10, float[] var11, float[] var12) {
      int var13 = (var7 - var5) * var3 / 256;
      int var14 = var3 >> 8;
      boolean var15 = var9.aBoolean_3639;
      this.aRenderer_Sub1_10970.enableZBuffering(false);
      var10.aBoolean_3475 = false;
      var10.aBoolean_3476 = false;
      int var16 = var1;
      int var17 = var2 + var13;

      for(int var18 = var4; var18 < var6; ++var18) {
         for(int var19 = var5; var19 < var7; ++var19) {
            if(var8[var18 - var4][var19 - var5]) {
               int var21;
               int var23;
               int var22;
               float var25;
               int var24;
               float var27;
               float var26;
               float var29;
               float var28;
               int var31;
               float var30;
               if(this.colours != null) {
                  if(this.colours[var18][var19] == null) {
                     if(this.vertices[var18][var19] != null) {
                        Class196 var32 = this.vertices[var18][var19];

                        for(var21 = 0; var21 < var32.aShort_3389; ++var21) {
                           var11[var21] = (float)(var16 + var32.xCoords[var21] * var14 / (this.anInt_3031 * 69671577));
                           var12[var21] = (float)(var17 - var32.yCoords[var21] * var14 / (this.anInt_3031 * 69671577));
                        }

                        for(var21 = 0; var21 < var32.aShort_3391; ++var21) {
                           var22 = var21 * 3;
                           var23 = var22 + 1;
                           var24 = var23 + 1;
                           var25 = var11[var22];
                           var26 = var11[var23];
                           var27 = var11[var24];
                           var28 = var12[var22];
                           var29 = var12[var23];
                           var30 = var12[var24];
                           if(var32.anIntArray_3398 != null && var32.anIntArray_3398[var21] != 0 && (var32.aShortArray_3395 == null || var32.aShortArray_3395 != null && var32.aShortArray_3395[var21] == -1)) {
                              var31 = var32.anIntArray_3398[var21];
                              var10.method2567(true, true, false, var28, var29, var30, var25, var26, var27, 100.0F, 100.0F, 100.0F, Class39.method319(var31, -16777216 - (var32.anIntArray_3392[var22] & -16777216), (byte)85), Class39.method319(var31, -16777216 - (var32.anIntArray_3392[var23] & -16777216), (byte)78), Class39.method319(var31, -16777216 - (var32.anIntArray_3392[var24] & -16777216), (byte)55));
                           } else if(var32.aShortArray_3395 != null && var32.aShortArray_3395[var21] != -1) {
                              var31 = this.aRenderer_Sub1_10970.method6739(var32.aShortArray_3395[var21] & '\uffff');
                              var10.method2561(true, true, false, var28, var29, var30, var25, var26, var27, 100.0F, 100.0F, 100.0F, (float)var31, (float)var31, (float)var31);
                           } else {
                              var10.method2567(true, true, false, var28, var29, var30, var25, var26, var27, 100.0F, 100.0F, 100.0F, var32.anIntArray_3392[var22], var32.anIntArray_3392[var23], var32.anIntArray_3392[var24]);
                           }
                        }
                     }
                  } else {
                     Class197 var33 = this.colours[var18][var19];
                     if(var33.aShort_3409 != -1 && (var33.aByte_3399 & 2) == 0 && var33.anInt_3408 == 0) {
                        var21 = this.aRenderer_Sub1_10970.method6739(var33.aShort_3409 & '\uffff');
                        var10.method2561(true, true, false, (float)(var17 - var14), (float)(var17 - var14), (float)var17, (float)(var16 + var14), (float)var16, (float)(var16 + var14), 100.0F, 100.0F, 100.0F, (float)Class476.method5683(var21, var33.colour3, -1322405180), (float)Class476.method5683(var21, var33.colour4, -1224352018), (float)Class476.method5683(var21, var33.colour2, -2138392815));
                        var10.method2561(true, true, false, (float)var17, (float)var17, (float)(var17 - var14), (float)var16, (float)(var16 + var14), (float)var16, 100.0F, 100.0F, 100.0F, (float)Class476.method5683(var21, var33.colour1, -1762069278), (float)Class476.method5683(var21, var33.colour2, -1644066557), (float)Class476.method5683(var21, var33.colour4, -1369782728));
                     } else if(var33.anInt_3408 == 0) {
                        var10.method2567(true, true, false, (float)(var17 - var14), (float)(var17 - var14), (float)var17, (float)(var16 + var14), (float)var16, (float)(var16 + var14), 100.0F, 100.0F, 100.0F, var33.colour3, var33.colour4, var33.colour2);
                        var10.method2567(true, true, false, (float)var17, (float)var17, (float)(var17 - var14), (float)var16, (float)(var16 + var14), (float)var16, 100.0F, 100.0F, 100.0F, var33.colour1, var33.colour2, var33.colour4);
                     } else {
                        var21 = var33.anInt_3408;
                        var10.method2567(true, true, false, (float)(var17 - var14), (float)(var17 - var14), (float)var17, (float)(var16 + var14), (float)var16, (float)(var16 + var14), 100.0F, 100.0F, 100.0F, Class39.method319(var21, var33.colour3 & -16777216, (byte)11), Class39.method319(var21, var33.colour4 & -16777216, (byte)-72), Class39.method319(var21, var33.colour2 & -16777216, (byte)-39));
                        var10.method2567(true, true, false, (float)var17, (float)var17, (float)(var17 - var14), (float)var16, (float)(var16 + var14), (float)var16, 100.0F, 100.0F, 100.0F, Class39.method319(var21, var33.colour1 & -16777216, (byte)-6), Class39.method319(var21, var33.colour2 & -16777216, (byte)-40), Class39.method319(var21, var33.colour4 & -16777216, (byte)-47));
                     }
                  }
               } else if(this.positionData[var18][var19] != null) {
                  Class139 var20 = this.positionData[var18][var19];

                  for(var21 = 0; var21 < var20.coordCount; ++var21) {
                     var11[var21] = (float)(var16 + var20.xCoords[var21] * var14 / (this.anInt_3031 * 69671577));
                     var12[var21] = (float)(var17 - var20.yCoords[var21] * var14 / (this.anInt_3031 * 69671577));
                  }

                  for(var21 = 0; var21 < var20.size; ++var21) {
                     var22 = var21 * 3;
                     var23 = var22 + 1;
                     var24 = var23 + 1;
                     var25 = var11[var22];
                     var26 = var11[var23];
                     var27 = var11[var24];
                     var28 = var12[var22];
                     var29 = var12[var23];
                     var30 = var12[var24];
                     if(var20.anIntArray_2651 != null && var20.anIntArray_2651[var21] != 0) {
                        var31 = var20.anIntArray_2651[var21];
                        var10.method2567(true, true, false, var28, var29, var30, var25, var26, var27, 100.0F, 100.0F, 100.0F, var31, var31, var31);
                     } else {
                        var10.method2567(true, true, false, var28, var29, var30, var25, var26, var27, 100.0F, 100.0F, 100.0F, var20.colourData[var22], var20.colourData[var23], var20.colourData[var24]);
                     }
                  }
               }
            }

            var17 -= var14;
         }

         var17 = var2 + var13;
         var16 += var14;
      }

      var10.aBoolean_3475 = true;
      this.aRenderer_Sub1_10970.enableZBuffering(var15);
   }

   public void method2151(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, int[] var11, int[] var12, int[] var13, Class105 var14, boolean var15) {
      if(this.aClass190ArrayArray_10960 == null) {
         this.aClass190ArrayArray_10960 = new Class190[this.maxWidth * 1658489349][this.maxHeight * 445373459];
         this.aClass199ArrayArray_10959 = new Class199[this.maxWidth * 1658489349][this.maxHeight * 445373459];
      } else if(this.colours != null || this.positionData != null) {
         throw new IllegalStateException();
      }

      boolean var16 = false;
      int var19;
      int var18;
      if(var10.length == 2 && var7.length == 2 && (var10[0] == var10[1] || var12[0] != -1 && var12[0] == var12[1])) {
         var16 = true;

         for(int var17 = 1; var17 < 2; ++var17) {
            var18 = var3[var7[var17]];
            var19 = var5[var7[var17]];
            if(var18 != 0 && var18 != this.anInt_3031 * 69671577 || var19 != 0 && var19 != this.anInt_3031 * 69671577) {
               var16 = false;
               break;
            }
         }
      }

      if(!var16) {
         Class199 var26 = new Class199();
         short var28 = (short)var3.length;
         short var27 = (short)var10.length;
         var26.aShort_3420 = var28;
         var26.aShortArray_3432 = new short[var28];
         var26.aShortArray_3422 = new short[var28];
         var26.aShortArray_3419 = new short[var28];
         var26.aShortArray_3429 = new short[var28];

         int var21;
         int var23;
         int var22;
         for(int var20 = 0; var20 < var28; ++var20) {
            var21 = var3[var20];
            var22 = var5[var20];
            int var24;
            if(var21 == 0 && var22 == 0) {
               var26.aShortArray_3432[var20] = (short)(this.renderBuffer[var1][var2] - this.aByteArrayArray_10975[var1][var2]);
            } else if(var21 == 0 && var22 == this.anInt_3031 * 69671577) {
               var26.aShortArray_3432[var20] = (short)(this.renderBuffer[var1][var2 + 1] - this.aByteArrayArray_10975[var1][var2 + 1]);
            } else if(var21 == this.anInt_3031 * 69671577 && var22 == this.anInt_3031 * 69671577) {
               var26.aShortArray_3432[var20] = (short)(this.renderBuffer[var1 + 1][var2 + 1] - this.aByteArrayArray_10975[var1 + 1][var2 + 1]);
            } else if(var21 == this.anInt_3031 * 69671577 && var22 == 0) {
               var26.aShortArray_3432[var20] = (short)(this.renderBuffer[var1 + 1][var2] - this.aByteArrayArray_10975[var1 + 1][var2]);
            } else {
               var23 = (this.renderBuffer[var1][var2] - this.aByteArrayArray_10975[var1][var2]) * (this.anInt_3031 * 69671577 - var21) + (this.renderBuffer[var1 + 1][var2] - this.aByteArrayArray_10975[var1 + 1][var2]) * var21;
               var24 = (this.renderBuffer[var1][var2 + 1] - this.aByteArrayArray_10975[var1][var2 + 1]) * (this.anInt_3031 * 69671577 - var21) + (this.renderBuffer[var1 + 1][var2 + 1] - this.aByteArrayArray_10975[var1 + 1][var2 + 1]) * var21;
               var26.aShortArray_3432[var20] = (short)(var23 * (this.anInt_3031 * 69671577 - var22) + var24 * var22 >> this.shiftAmount * -906622462);
            }

            var23 = (var1 << this.shiftAmount * 1694172417) + var21;
            var24 = (var2 << this.shiftAmount * 1694172417) + var22;
            var26.aShortArray_3422[var20] = (short)var21;
            var26.aShortArray_3429[var20] = (short)var22;
            var26.aShortArray_3419[var20] = (short)(this.getHeight(var23, var24) + (var4 != null?var4[var20]:0));
            if(var26.aShortArray_3432[var20] < 2) {
               var26.aShortArray_3432[var20] = 2;
            }
         }

         boolean var29 = false;
         var21 = 0;

         for(var22 = 0; var22 < var27; ++var22) {
            if(var10[var22] >= 0 || var11 != null && var11[var22] >= 0) {
               ++var21;
            }

            var23 = var12[var22];
            if(var23 != -1) {
               Class183 var32 = this.aRenderer_Sub1_10970.aClass163_2802.method1996(var23, (byte)2);
               if(!var32.aBoolean_3174) {
                  var29 = true;
                  if(this.method7562(var32.aByte_3169) || var32.aByte_3145 != 0 || var32.aByte_3157 != 0) {
                     var26.aByte_3421 = (byte)(var26.aByte_3421 | 4);
                  }
               }
            }
         }

         var26.anIntArray_3431 = new int[var21];
         if(var11 != null) {
            var26.anIntArray_3426 = new int[var21];
         }

         var26.aShortArray_3425 = new short[var21];
         var26.aShortArray_3427 = new short[var21];
         var26.aShortArray_3428 = new short[var21];
         if(var29) {
            var26.aShortArray_3424 = new short[var21];
            var26.aShortArray_3430 = new short[var21];
         }

         for(var22 = 0; var22 < var27; ++var22) {
            if(var10[var22] >= 0 || var11 != null && var11[var22] >= 0) {
               if(var10[var22] >= 0) {
                  var26.anIntArray_3431[var26.aShort_3423] = CacheFileID.method1398(var10[var22], 325032345);
               } else {
                  var26.anIntArray_3431[var26.aShort_3423] = -1;
               }

               if(var11 != null) {
                  if(var11[var22] != -1) {
                     var26.anIntArray_3426[var26.aShort_3423] = CacheFileID.method1398(var11[var22], -155458248);
                  } else {
                     var26.anIntArray_3426[var26.aShort_3423] = -1;
                  }
               }

               var26.aShortArray_3425[var26.aShort_3423] = (short)var7[var22];
               var26.aShortArray_3427[var26.aShort_3423] = (short)var8[var22];
               var26.aShortArray_3428[var26.aShort_3423] = (short)var9[var22];
               if(var29) {
                  if(var12[var22] != -1 && !this.aRenderer_Sub1_10970.aClass163_2802.method1996(var12[var22], (byte)2).aBoolean_3174) {
                     var26.aShortArray_3424[var26.aShort_3423] = (short)var12[var22];
                     var26.aShortArray_3430[var26.aShort_3423] = (short)var13[var22];
                  } else {
                     var26.aShortArray_3424[var26.aShort_3423] = -1;
                  }
               }

               ++var26.aShort_3423;
            }
         }

         this.aClass199ArrayArray_10959[var1][var2] = var26;
      } else if(var10[0] >= 0 || var11 != null && var11[0] >= 0) {
         Class190 var25 = new Class190();
         var18 = var10[0];
         var19 = var12[0];
         if(var11 != null) {
            var25.anInt_3318 = Class476.method5683(CacheFileID.method1398(var11[0], 932707622), this.renderBuffer[var1][var2] - this.aByteArrayArray_10975[var1][var2], -1740401086);
            if(var18 == -1) {
               var25.aByte_3312 = (byte)(var25.aByte_3312 | 2);
            }
         }

         if(this.anIntArrayArray_3029[var1][var2] == this.anIntArrayArray_3029[var1 + 1][var2] && this.anIntArrayArray_3029[var1][var2] == this.anIntArrayArray_3029[var1 + 1][var2 + 1] && this.anIntArrayArray_3029[var1][var2] == this.anIntArrayArray_3029[var1][var2 + 1]) {
            var25.aByte_3312 = (byte)(var25.aByte_3312 | 1);
         }

         Class183 var30 = null;
         if(var19 != -1) {
            var30 = this.aRenderer_Sub1_10970.aClass163_2802.method1996(var19, (byte)2);
         }

         if(var30 != null && (var25.aByte_3312 & 2) == 0 && !var30.aBoolean_3174) {
            var25.aShort_3313 = (short)(this.renderBuffer[var1][var2] - this.aByteArrayArray_10975[var1][var2]);
            var25.aShort_3314 = (short)(this.renderBuffer[var1 + 1][var2] - this.aByteArrayArray_10975[var1 + 1][var2]);
            var25.aShort_3317 = (short)(this.renderBuffer[var1 + 1][var2 + 1] - this.aByteArrayArray_10975[var1 + 1][var2 + 1]);
            var25.aShort_3316 = (short)(this.renderBuffer[var1][var2 + 1] - this.aByteArrayArray_10975[var1][var2 + 1]);
            var25.aShort_3315 = (short)var19;
            if(this.method7562(var30.aByte_3169) || var30.aByte_3145 != 0 || var30.aByte_3157 != 0) {
               var25.aByte_3312 = (byte)(var25.aByte_3312 | 4);
            }
         } else {
            short var31 = CacheFileID.method1398(var18, 2113156305);
            var25.aShort_3313 = (short)Class476.method5683(var31, this.renderBuffer[var1][var2] - this.aByteArrayArray_10975[var1][var2], -1666512723);
            var25.aShort_3314 = (short)Class476.method5683(var31, this.renderBuffer[var1 + 1][var2] - this.aByteArrayArray_10975[var1 + 1][var2], -2098925750);
            var25.aShort_3317 = (short)Class476.method5683(var31, this.renderBuffer[var1 + 1][var2 + 1] - this.aByteArrayArray_10975[var1 + 1][var2 + 1], -1852706587);
            var25.aShort_3316 = (short)Class476.method5683(var31, this.renderBuffer[var1][var2 + 1] - this.aByteArrayArray_10975[var1][var2 + 1], -428230199);
            var25.aShort_3315 = -1;
         }

         this.aClass190ArrayArray_10960[var1][var2] = var25;
      }

   }

   void method7558(int var1, int var2, boolean var3, Class210 var4, Class202 var5, float[] var6, float[] var7, float[] var8, float[] var9, float[] var10, int var11) {
      Class197 var12 = this.colours[var1][var2];
      int var14;
      int var15;
      int var16;
      float var34;
      float var35;
      float var33;
      float var39;
      float var42;
      float var43;
      float var40;
      float var47;
      float var44;
      float var51;
      float var50;
      float var48;
      float var52;
      if(var12 != null) {
         if((var12.aByte_3399 & 2) == 0) {
            if(var11 != 0) {
               if((var12.aByte_3399 & 4) != 0) {
                  if((var11 & 1) != 0) {
                     return;
                  }
               } else if((var11 & 2) != 0) {
                  return;
               }
            }

            int var55 = var1 * this.anInt_3031 * 69671577;
            var14 = var55 + this.anInt_3031 * 69671577;
            var15 = var2 * this.anInt_3031 * 69671577;
            var16 = var15 + this.anInt_3031 * 69671577;
            float var17 = 0.0F;
            float var18 = 0.0F;
            float var19 = 0.0F;
            float var20 = 0.0F;
            int var21;
            int var22;
            float var25;
            float var24;
            float var27;
            float var26;
            float var29;
            float var28;
            float var31;
            float var30;
            int var38;
            float var36;
            float var53;
            float var63;
            float var62;
            float var60;
            float var68;
            float var64;
            float var65;
            float var67;
            if((var12.aByte_3399 & 1) != 0 && !var3) {
               var21 = this.anIntArrayArray_3029[var1][var2];
               float var57 = this.aFloat_10964 * (float)var21;
               float var58 = this.aFloat_10965 * (float)var21;
               var24 = this.aFloat_10947 + this.aFloat_10953 * (float)var55 + var57 + this.aFloat_10968 * (float)var15;
               var25 = this.aFloat_10949 + this.aFloat_10961 * (float)var55 + var58 + this.aFloat_10969 * (float)var15;
               if(var24 < -var25) {
                  return;
               }

               var26 = this.aFloat_10947 + this.aFloat_10953 * (float)var14 + var57 + this.aFloat_10968 * (float)var15;
               var27 = this.aFloat_10949 + this.aFloat_10961 * (float)var14 + var58 + this.aFloat_10969 * (float)var15;
               if(var26 < -var27) {
                  return;
               }

               var28 = this.aFloat_10947 + this.aFloat_10953 * (float)var14 + var57 + this.aFloat_10968 * (float)var16;
               var29 = this.aFloat_10949 + this.aFloat_10961 * (float)var14 + var58 + this.aFloat_10969 * (float)var16;
               if(var28 < -var29) {
                  return;
               }

               var30 = this.aFloat_10947 + this.aFloat_10953 * (float)var55 + var57 + this.aFloat_10968 * (float)var16;
               var31 = this.aFloat_10949 + this.aFloat_10961 * (float)var55 + var58 + this.aFloat_10969 * (float)var16;
               if(var30 < -var31) {
                  return;
               }

               var60 = var5.aFloat_3485 + var5.aFloat_3489 * var24 / var25;
               var33 = var5.aFloat_3485 + var5.aFloat_3489 * var26 / var27;
               var34 = var5.aFloat_3485 + var5.aFloat_3489 * var28 / var29;
               var35 = var5.aFloat_3485 + var5.aFloat_3489 * var30 / var31;
               if(var4.aBoolean_3613) {
                  var36 = var24 - var4.aFloat_3614;
                  if(var36 > 0.0F) {
                     var17 = var36 / var4.aFloat_3624;
                     if(var17 > 1.0F) {
                        var17 = 1.0F;
                     }
                  }

                  var36 = var26 - var4.aFloat_3614;
                  if(var36 > 0.0F) {
                     var18 = var36 / var4.aFloat_3624;
                     if(var18 > 1.0F) {
                        var18 = 1.0F;
                     }
                  }

                  var36 = var28 - var4.aFloat_3614;
                  if(var36 > 0.0F) {
                     var19 = var36 / var4.aFloat_3624;
                     if(var19 > 1.0F) {
                        var19 = 1.0F;
                     }
                  }

                  var36 = var30 - var4.aFloat_3614;
                  if(var36 > 0.0F) {
                     var20 = var36 / var4.aFloat_3624;
                     if(var20 > 1.0F) {
                        var20 = 1.0F;
                     }
                  }
               }

               var62 = this.aFloat_10962 * (float)var21;
               float var61 = this.aFloat_10963 * (float)var21;
               var39 = this.aFloat_10954 + this.aFloat_10958 * (float)var55 + var62 + this.aFloat_10966 * (float)var15;
               var40 = var5.aFloat_3495 + var5.aFloat_3490 * var39 / var25;
               var64 = this.aFloat_10971 + this.aFloat_10974 * (float)var55 + var61 + this.aFloat_10967 * (float)var15;
               var42 = var5.aFloat_3483 + var5.aFloat_3484 * var64 / var25;
               var43 = this.aFloat_10954 + this.aFloat_10958 * (float)var14 + var62 + this.aFloat_10966 * (float)var15;
               var44 = var5.aFloat_3495 + var5.aFloat_3490 * var43 / var27;
               var63 = this.aFloat_10971 + this.aFloat_10974 * (float)var14 + var61 + this.aFloat_10967 * (float)var15;
               var67 = var5.aFloat_3483 + var5.aFloat_3484 * var63 / var27;
               var47 = this.aFloat_10954 + this.aFloat_10958 * (float)var14 + var62 + this.aFloat_10966 * (float)var16;
               var48 = var5.aFloat_3495 + var5.aFloat_3490 * var47 / var29;
               var65 = this.aFloat_10971 + this.aFloat_10974 * (float)var14 + var61 + this.aFloat_10967 * (float)var16;
               var50 = var5.aFloat_3483 + var5.aFloat_3484 * var65 / var29;
               var51 = this.aFloat_10954 + this.aFloat_10958 * (float)var55 + var62 + this.aFloat_10966 * (float)var16;
               var52 = var5.aFloat_3495 + var5.aFloat_3490 * var51 / var31;
               var53 = this.aFloat_10971 + this.aFloat_10974 * (float)var55 + var61 + this.aFloat_10967 * (float)var16;
               var68 = var5.aFloat_3483 + var5.aFloat_3484 * var53 / var31;
            } else {
               var21 = this.anIntArrayArray_3029[var1][var2];
               var22 = this.anIntArrayArray_3029[var1 + 1][var2];
               int var23 = this.anIntArrayArray_3029[var1 + 1][var2 + 1];
               int var37 = this.anIntArrayArray_3029[var1][var2 + 1];
               var24 = this.aFloat_10947 + this.aFloat_10953 * (float)var55 + this.aFloat_10964 * (float)var21 + this.aFloat_10968 * (float)var15;
               var25 = this.aFloat_10949 + this.aFloat_10961 * (float)var55 + this.aFloat_10965 * (float)var21 + this.aFloat_10969 * (float)var15;
               if(var24 < -var25) {
                  return;
               }

               var26 = this.aFloat_10947 + this.aFloat_10953 * (float)var14 + this.aFloat_10964 * (float)var22 + this.aFloat_10968 * (float)var15;
               var27 = this.aFloat_10949 + this.aFloat_10961 * (float)var14 + this.aFloat_10965 * (float)var22 + this.aFloat_10969 * (float)var15;
               if(var26 < -var27) {
                  return;
               }

               var28 = this.aFloat_10947 + this.aFloat_10953 * (float)var14 + this.aFloat_10964 * (float)var23 + this.aFloat_10968 * (float)var16;
               var29 = this.aFloat_10949 + this.aFloat_10961 * (float)var14 + this.aFloat_10965 * (float)var23 + this.aFloat_10969 * (float)var16;
               if(var28 < -var29) {
                  return;
               }

               var30 = this.aFloat_10947 + this.aFloat_10953 * (float)var55 + this.aFloat_10964 * (float)var37 + this.aFloat_10968 * (float)var16;
               var31 = this.aFloat_10949 + this.aFloat_10961 * (float)var55 + this.aFloat_10965 * (float)var37 + this.aFloat_10969 * (float)var16;
               if(var30 < -var31) {
                  return;
               }

               var60 = var5.aFloat_3485 + var5.aFloat_3489 * var24 / var25;
               var33 = var5.aFloat_3485 + var5.aFloat_3489 * var26 / var27;
               var34 = var5.aFloat_3485 + var5.aFloat_3489 * var28 / var29;
               var35 = var5.aFloat_3485 + var5.aFloat_3489 * var30 / var31;
               if(var3) {
                  var36 = var24 - var4.aFloat_3614;
                  if(var36 > 0.0F) {
                     var36 /= var4.aFloat_3624;
                     if(var36 > 1.0F) {
                        var36 = 1.0F;
                     }

                     var17 = var36;
                     var38 = (int)((float)var12.aShort_3404 * var36);
                     if(var38 > 0) {
                        var21 -= var38;
                     }
                  }

                  var36 = var26 - var4.aFloat_3614;
                  if(var36 > 0.0F) {
                     var36 /= var4.aFloat_3624;
                     if(var36 > 1.0F) {
                        var36 = 1.0F;
                     }

                     var18 = var36;
                     var38 = (int)((float)var12.aShort_3406 * var36);
                     if(var38 > 0) {
                        var22 -= var38;
                     }
                  }

                  var36 = var28 - var4.aFloat_3614;
                  if(var36 > 0.0F) {
                     var36 /= var4.aFloat_3624;
                     if(var36 > 1.0F) {
                        var36 = 1.0F;
                     }

                     var19 = var36;
                     var38 = (int)((float)var12.aShort_3405 * var36);
                     if(var38 > 0) {
                        var23 -= var38;
                     }
                  }

                  var36 = var30 - var4.aFloat_3614;
                  if(var36 > 0.0F) {
                     var36 /= var4.aFloat_3624;
                     if(var36 > 1.0F) {
                        var36 = 1.0F;
                     }

                     var20 = var36;
                     var38 = (int)((float)var12.aShort_3407 * var36);
                     if(var38 > 0) {
                        var37 -= var38;
                     }
                  }
               } else if(var4.aBoolean_3613) {
                  var36 = var24 - var4.aFloat_3614;
                  if(var36 > 0.0F) {
                     var17 = var36 / var4.aFloat_3624;
                     if(var17 > 1.0F) {
                        var17 = 1.0F;
                     }
                  }

                  var36 = var26 - var4.aFloat_3614;
                  if(var36 > 0.0F) {
                     var18 = var36 / var4.aFloat_3624;
                     if(var18 > 1.0F) {
                        var18 = 1.0F;
                     }
                  }

                  var36 = var28 - var4.aFloat_3614;
                  if(var36 > 0.0F) {
                     var19 = var36 / var4.aFloat_3624;
                     if(var19 > 1.0F) {
                        var19 = 1.0F;
                     }
                  }

                  var36 = var30 - var4.aFloat_3614;
                  if(var36 > 0.0F) {
                     var20 = var36 / var4.aFloat_3624;
                     if(var20 > 1.0F) {
                        var20 = 1.0F;
                     }
                  }
               }

               var39 = this.aFloat_10954 + this.aFloat_10958 * (float)var55 + this.aFloat_10962 * (float)var21 + this.aFloat_10966 * (float)var15;
               var40 = var5.aFloat_3495 + var5.aFloat_3490 * var39 / var25;
               var64 = this.aFloat_10971 + this.aFloat_10974 * (float)var55 + this.aFloat_10963 * (float)var21 + this.aFloat_10967 * (float)var15;
               var42 = var5.aFloat_3483 + var5.aFloat_3484 * var64 / var25;
               var43 = this.aFloat_10954 + this.aFloat_10958 * (float)var14 + this.aFloat_10962 * (float)var22 + this.aFloat_10966 * (float)var15;
               var44 = var5.aFloat_3495 + var5.aFloat_3490 * var43 / var27;
               var63 = this.aFloat_10971 + this.aFloat_10974 * (float)var14 + this.aFloat_10963 * (float)var22 + this.aFloat_10967 * (float)var15;
               var67 = var5.aFloat_3483 + var5.aFloat_3484 * var63 / var27;
               var47 = this.aFloat_10954 + this.aFloat_10958 * (float)var14 + this.aFloat_10962 * (float)var23 + this.aFloat_10966 * (float)var16;
               var48 = var5.aFloat_3495 + var5.aFloat_3490 * var47 / var29;
               var65 = this.aFloat_10971 + this.aFloat_10974 * (float)var14 + this.aFloat_10963 * (float)var23 + this.aFloat_10967 * (float)var16;
               var50 = var5.aFloat_3483 + var5.aFloat_3484 * var65 / var29;
               var51 = this.aFloat_10954 + this.aFloat_10958 * (float)var55 + this.aFloat_10962 * (float)var37 + this.aFloat_10966 * (float)var16;
               var52 = var5.aFloat_3495 + var5.aFloat_3490 * var51 / var31;
               var53 = this.aFloat_10971 + this.aFloat_10974 * (float)var55 + this.aFloat_10963 * (float)var37 + this.aFloat_10967 * (float)var16;
               var68 = var5.aFloat_3483 + var5.aFloat_3484 * var53 / var31;
            }

            Class183 var56 = null;
            var22 = -1;
            if(var12.aShort_3409 != -1) {
               var56 = this.aRenderer_Sub1_10970.aClass163_2802.method1996(var12.aShort_3409 & '\uffff', (byte)2);
               var22 = var56.anInt_3146 * -534969509;
            }

            boolean var59 = var56 != null && this.method7562(var56.aByte_3169);
            var62 = var18 + var19 + var20;
            if((var48 - var52) * (var67 - var68) - (var50 - var68) * (var44 - var52) > 0.0F) {
               var5.aBoolean_3481 = var48 < 0.0F || var52 < 0.0F || var44 < 0.0F || var48 > (float)var5.anInt_3487 || var52 > (float)var5.anInt_3487 || var44 > (float)var5.anInt_3487;
               if(var62 < 3.0F) {
                  if(var62 > 0.0F) {
                     if(var22 >= 0) {
                        var38 = -16777216;
                        if(var59) {
                           var38 = -1694498816;
                        }

                        var5.method2568(true, true, false, var50, var68, var67, var48, var52, var44, var34, var35, var33, var29, var31, var27, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var38 | var12.colour3 & 16777215, var38 | var12.colour4 & 16777215, var38 | var12.colour2 & 16777215, var4.anInt_3616 * -2058706033, var19 * 255.0F, var20 * 255.0F, var18 * 255.0F, var12.aShort_3409 & '\uffff', var22);
                     } else {
                        if(var59) {
                           var5.anInt_3509 = 100;
                        }

                        var5.method2567(true, true, false, var50, var68, var67, var48, var52, var44, var34, var35, var33, Class39.method319(var12.colour3, (int)(var19 * 255.0F) << 24 | var4.anInt_3616 * -2058706033, (byte)3), Class39.method319(var12.colour4, (int)(var20 * 255.0F) << 24 | var4.anInt_3616 * -2058706033, (byte)-16), Class39.method319(var12.colour2, (int)(var18 * 255.0F) << 24 | var4.anInt_3616 * -2058706033, (byte)16));
                        var5.anInt_3509 = 0;
                     }
                  } else if(var22 >= 0) {
                     var38 = -16777216;
                     if(var59) {
                        var38 = -1694498816;
                     }

                     var5.method2568(true, true, false, var50, var68, var67, var48, var52, var44, var34, var35, var33, var29, var31, var27, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var38 | var12.colour3 & 16777215, var38 | var12.colour4 & 16777215, var38 | var12.colour2 & 16777215, 0, 0.0F, 0.0F, 0.0F, var12.aShort_3409 & '\uffff', var22);
                  } else {
                     if(var59) {
                        var5.anInt_3509 = 100;
                     }

                     var5.method2567(true, true, false, var50, var68, var67, var48, var52, var44, var34, var35, var33, var12.colour3, var12.colour4, var12.colour2);
                     var5.anInt_3509 = 0;
                  }
               } else {
                  var5.method2562(true, true, false, var50, var68, var67, var48, var52, var44, var34, var35, var33, var4.anInt_3616 * -2058706033);
               }
            }

            var62 = var17 + var18 + var20;
            if((var40 - var44) * (var68 - var67) - (var42 - var67) * (var52 - var44) > 0.0F) {
               var5.aBoolean_3481 = var40 < 0.0F || var44 < 0.0F || var52 < 0.0F || var40 > (float)var5.anInt_3487 || var44 > (float)var5.anInt_3487 || var52 > (float)var5.anInt_3487;
               if(var62 < 3.0F) {
                  if(var59) {
                     var5.anInt_3509 = -1694498816;
                  }

                  if(var62 > 0.0F) {
                     if(var22 >= 0) {
                        var38 = -16777216;
                        if(var59) {
                           var38 = -1694498816;
                        }

                        var5.method2568(true, true, false, var42, var67, var68, var40, var44, var52, var60, var33, var35, var25, var27, var31, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var38 | var12.colour1 & 16777215, var38 | var12.colour2 & 16777215, var38 | var12.colour4 & 16777215, var4.anInt_3616 * -2058706033, var17 * 255.0F, var18 * 255.0F, var20 * 255.0F, var12.aShort_3409 & '\uffff', var22);
                     } else {
                        if(var59) {
                           var5.anInt_3509 = 100;
                        }

                        var5.method2567(true, true, false, var42, var67, var68, var40, var44, var52, var60, var33, var35, Class39.method319(var12.colour1, (int)(var17 * 255.0F) << 24 | var4.anInt_3616 * -2058706033, (byte)-65), Class39.method319(var12.colour2, (int)(var18 * 255.0F) << 24 | var4.anInt_3616 * -2058706033, (byte)-96), Class39.method319(var12.colour4, (int)(var20 * 255.0F) << 24 | var4.anInt_3616 * -2058706033, (byte)-24));
                        var5.anInt_3509 = 0;
                     }
                  } else if(var22 >= 0) {
                     var38 = -16777216;
                     if(var59) {
                        var38 = -1694498816;
                     }

                     var5.method2568(true, true, false, var42, var67, var68, var40, var44, var52, var60, var33, var35, var25, var27, var31, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var38 | var12.colour1 & 16777215, var38 | var12.colour2 & 16777215, var38 | var12.colour4 & 16777215, 0, 0.0F, 0.0F, 0.0F, var12.aShort_3409 & '\uffff', var22);
                  } else {
                     if(var59) {
                        var5.anInt_3509 = 100;
                     }

                     var5.method2567(true, true, false, var42, var67, var68, var40, var44, var52, var60, var33, var35, var12.colour1, var12.colour2, var12.colour4);
                     var5.anInt_3509 = 0;
                  }
               } else {
                  var5.method2562(true, true, false, var42, var67, var68, var40, var44, var52, var60, var33, var35, var4.anInt_3616 * -2058706033);
               }
            }

         }
      } else {
         Class196 vertex = this.vertices[var1][var2];
         if(vertex != null) {
            if(var11 != 0) {
               if((vertex.aByte_3388 & 4) != 0) {
                  if((var11 & 1) != 0) {
                     return;
                  }
               } else if((var11 & 2) != 0) {
                  return;
               }
            }

            int var46;
            int var54;
            for(var46 = 0; var46 < vertex.aShort_3389; ++var46) {
               var14 = vertex.xCoords[var46] + (var1 << this.shiftAmount * 1694172417);
               var15 = vertex.zCoords[var46];
               var16 = vertex.yCoords[var46] + (var2 << this.shiftAmount * 1694172417);
               var48 = this.aFloat_10947 + this.aFloat_10953 * (float)var14 + this.aFloat_10964 * (float)var15 + this.aFloat_10968 * (float)var16;
               var52 = this.aFloat_10949 + this.aFloat_10961 * (float)var14 + this.aFloat_10965 * (float)var15 + this.aFloat_10969 * (float)var16;
               if(var48 < -var52) {
                  return;
               }

               var42 = var5.aFloat_3485 + var5.aFloat_3489 * var48 / var52;
               var10[var46] = 0.0F;
               if(var3) {
                  var50 = var48 - var4.aFloat_3614;
                  if(var50 > 0.0F) {
                     var50 /= var4.aFloat_3624;
                     if(var50 > 1.0F) {
                        var50 = 1.0F;
                     }

                     var10[var46] = var50;
                     var54 = (int)((float)vertex.aShortArray_3394[var46] * var50);
                     if(var54 > 0) {
                        var15 -= var54;
                     }
                  }
               } else if(var4.aBoolean_3613) {
                  var50 = var48 - var4.aFloat_3614;
                  if(var50 > 0.0F) {
                     var10[var46] = var50 / var4.aFloat_3624;
                     if(var10[var46] > 1.0F) {
                        var10[var46] = 1.0F;
                     }
                  }
               }

               var40 = this.aFloat_10954 + this.aFloat_10958 * (float)var14 + this.aFloat_10962 * (float)var15 + this.aFloat_10966 * (float)var16;
               var44 = this.aFloat_10971 + this.aFloat_10974 * (float)var14 + this.aFloat_10963 * (float)var15 + this.aFloat_10967 * (float)var16;
               var6[var46] = var5.aFloat_3495 + var5.aFloat_3490 * var40 / var52;
               var7[var46] = var5.aFloat_3483 + var5.aFloat_3484 * var44 / var52;
               var8[var46] = var42;
               var9[var46] = var52;
            }

            int var32;
            int var66;
            if(vertex.aShortArray_3395 != null) {
               for(var46 = 0; var46 < vertex.aShort_3391; ++var46) {
                  var66 = var46 * 3;
                  var54 = var66 + 1;
                  var32 = var54 + 1;
                  var33 = var6[var66];
                  var34 = var6[var54];
                  var35 = var6[var32];
                  var39 = var7[var66];
                  var43 = var7[var54];
                  var47 = var7[var32];
                  var51 = var10[var66] + var10[var54] + var10[var32];
                  if((var33 - var34) * (var47 - var43) - (var39 - var43) * (var35 - var34) > 0.0F) {
                     var5.aBoolean_3481 = var33 < 0.0F || var34 < 0.0F || var35 < 0.0F || var33 > (float)var5.anInt_3487 || var34 > (float)var5.anInt_3487 || var35 > (float)var5.anInt_3487;
                     Class183 var41 = null;
                     int var45 = -1;
                     if(vertex.aShortArray_3395[var46] != -1) {
                        var41 = this.aRenderer_Sub1_10970.aClass163_2802.method1996(vertex.aShortArray_3395[var46] & '\uffff', (byte)2);
                        var45 = var41.anInt_3146 * -534969509;
                     }

                     if(var51 < 3.0F) {
                        int var49;
                        if(var51 > 0.0F) {
                           if(var45 != -1) {
                              var49 = -16777216;
                              if(var45 != -1 && this.method7562(var41.aByte_3169)) {
                                 var49 = -1694498816;
                              }

                              var5.method2568(true, true, false, var39, var43, var47, var33, var34, var35, var8[var66], var8[var54], var8[var32], var9[var66], var9[var54], var9[var32], (float)vertex.xCoords[var66] / (float)(this.anInt_3031 * 69671577), (float)vertex.xCoords[var54] / (float)(this.anInt_3031 * 69671577), (float)vertex.xCoords[var32] / (float)(this.anInt_3031 * 69671577), (float)vertex.yCoords[var66] / (float)(this.anInt_3031 * 69671577), (float)vertex.yCoords[var54] / (float)(this.anInt_3031 * 69671577), (float)vertex.yCoords[var32] / (float)(this.anInt_3031 * 69671577), var49 | vertex.anIntArray_3392[var66] & 16777215, var49 | vertex.anIntArray_3392[var54] & 16777215, var49 | vertex.anIntArray_3392[var32] & 16777215, var4.anInt_3616 * -2058706033, var10[var66] * 255.0F, var10[var54] * 255.0F, var10[var32] * 255.0F, vertex.aShortArray_3395[var46] & '\uffff', var45);
                           } else if((vertex.anIntArray_3392[var66] & 16777215) != 0) {
                              if(var45 != -1 && this.method7562(var41.aByte_3169)) {
                                 var5.anInt_3509 = -1694498816;
                              }

                              var5.method2567(true, true, false, var39, var43, var47, var33, var34, var35, var8[var66], var8[var54], var8[var32], Class39.method319(vertex.anIntArray_3392[var66], (int)(var10[var66] * 255.0F) << 24 | var4.anInt_3616 * -2058706033, (byte)-15), Class39.method319(vertex.anIntArray_3392[var54], (int)(var10[var54] * 255.0F) << 24 | var4.anInt_3616 * -2058706033, (byte)5), Class39.method319(vertex.anIntArray_3392[var32], (int)(var10[var32] * 255.0F) << 24 | var4.anInt_3616 * -2058706033, (byte)-86));
                              var5.anInt_3509 = 0;
                           }
                        } else if(var45 != -1) {
                           var49 = -16777216;
                           if(var45 != -1 && this.method7562(var41.aByte_3169)) {
                              var49 = -1694498816;
                           }

                           var5.method2568(true, true, false, var39, var43, var47, var33, var34, var35, var8[var66], var8[var54], var8[var32], var9[var66], var9[var54], var9[var32], (float)vertex.xCoords[var66] / (float)(this.anInt_3031 * 69671577), (float)vertex.xCoords[var54] / (float)(this.anInt_3031 * 69671577), (float)vertex.xCoords[var32] / (float)(this.anInt_3031 * 69671577), (float)vertex.yCoords[var66] / (float)(this.anInt_3031 * 69671577), (float)vertex.yCoords[var54] / (float)(this.anInt_3031 * 69671577), (float)vertex.yCoords[var32] / (float)(this.anInt_3031 * 69671577), var49 | vertex.anIntArray_3392[var66] & 16777215, var49 | vertex.anIntArray_3392[var54] & 16777215, var49 | vertex.anIntArray_3392[var32] & 16777215, 0, 0.0F, 0.0F, 0.0F, vertex.aShortArray_3395[var46] & '\uffff', var45);
                        } else if((vertex.anIntArray_3392[var66] & 16777215) != 0) {
                           if(var45 != -1 && this.method7562(var41.aByte_3169)) {
                              var5.anInt_3509 = -1694498816;
                           }

                           var5.method2567(true, true, false, var39, var43, var47, var33, var34, var35, var8[var66], var8[var54], var8[var32], vertex.anIntArray_3392[var66], vertex.anIntArray_3392[var54], vertex.anIntArray_3392[var32]);
                           var5.anInt_3509 = 0;
                        }
                     } else {
                        var5.method2562(true, true, false, var39, var43, var47, var33, var34, var35, var8[var66], var8[var54], var8[var32], var4.anInt_3616 * -2058706033);
                     }
                  }
               }
            } else {
               for(var46 = 0; var46 < vertex.aShort_3391; ++var46) {
                  var66 = var46 * 3;
                  var54 = var66 + 1;
                  var32 = var54 + 1;
                  var33 = var6[var66];
                  var34 = var6[var54];
                  var35 = var6[var32];
                  var39 = var7[var66];
                  var43 = var7[var54];
                  var47 = var7[var32];
                  var51 = var10[var66] + var10[var54] + var10[var32];
                  if((var33 - var34) * (var47 - var43) - (var39 - var43) * (var35 - var34) > 0.0F) {
                     var5.aBoolean_3481 = var33 < 0.0F || var34 < 0.0F || var35 < 0.0F || var33 > (float)var5.anInt_3487 || var34 > (float)var5.anInt_3487 || var35 > (float)var5.anInt_3487;
                     if(var51 < 3.0F) {
                        if(var51 > 0.0F) {
                           if((vertex.anIntArray_3392[var66] & 16777215) != 0) {
                              var5.method2567(true, true, false, var39, var43, var47, var33, var34, var35, var8[var66], var8[var54], var8[var32], Class104_Sub20.method7394(vertex.anIntArray_3392[var66], var4.anInt_3616 * -2058706033, var10[var66] * 255.0F, -367874826), Class104_Sub20.method7394(vertex.anIntArray_3392[var54], var4.anInt_3616 * -2058706033, var10[var54] * 255.0F, 113663366), Class104_Sub20.method7394(vertex.anIntArray_3392[var32], var4.anInt_3616 * -2058706033, var10[var32] * 255.0F, -1010465602));
                           }
                        } else if((vertex.anIntArray_3392[var66] & 16777215) != 0) {
                           var5.method2567(true, true, false, var39, var43, var47, var33, var34, var35, var8[var66], var8[var54], var8[var32], vertex.anIntArray_3392[var66], vertex.anIntArray_3392[var54], vertex.anIntArray_3392[var32]);
                        }
                     } else {
                        var5.method2562(true, true, false, var39, var43, var47, var33, var34, var35, var8[var66], var8[var54], var8[var32], var4.anInt_3616 * -2058706033);
                     }
                  }
               }
            }
         }

      }
   }

   SoftwarePlane(SoftwareRenderer var1, int var2, int var3, int var4, int var5, int[][] var6, int[][] var7, int var8) {
      super(var4, var5, var8, var6);
      this.aRenderer_Sub1_10970 = var1;
      this.anInt_10952 = var3;
      this.renderBuffer = new byte[var4 + 1][var5 + 1];
      int var9 = this.aRenderer_Sub1_10970.anInt_10171 * -414455413 >> 9;

      for(int var10 = 1; var10 < var5; ++var10) {
         for(int var11 = 1; var11 < var4; ++var11) {
            int distX = var7[var11 + 1][var10] - var7[var11 - 1][var10];
            int distY = var7[var11][var10 + 1] - var7[var11][var10 - 1];
            int scale = (int)Math.sqrt((double)(distX * distX + 512 * var8 + distY * distY));
            int var16 = (distX << 8) / scale;
            int var17 = -512 * var8 / scale;
            int var18 = (distY << 8) / scale;
            int var12 = var9 + (this.aRenderer_Sub1_10970.anInt_10192 * 351046469 * var16 + this.aRenderer_Sub1_10970.anInt_10167 * 991895723 * var17 + this.aRenderer_Sub1_10970.anInt_10188 * 547386025 * var18 >> 17);
            var12 >>= 1;
            if(var12 < 2) {
               var12 = 2;
            } else if(var12 > 126) {
               var12 = 126;
            }

            this.renderBuffer[var11][var10] = (byte)var12;
         }
      }

      this.aByteArrayArray_10975 = new byte[var4 + 1][var5 + 1];
   }

   void method7559(int var1, int var2, int var3) {
      Class210 var4 = this.aRenderer_Sub1_10970.method6787(Thread.currentThread());
      var4.aClass202_3630.anInt_3509 = 0;
      if(this.colours != null) {
         this.method7558(var1, var2, var4.aBoolean_3618, var4, var4.aClass202_3630, var4.aFloatArray_3650, var4.aFloatArray_3635, var4.aFloatArray_3652, var4.aFloatArray_3653, var4.aFloatArray_3654, var3);
      } else if(this.aClass190ArrayArray_10960 != null) {
         this.method7560(var1, var2, var4.aClass202_3630, var4.aFloatArray_3650, var4.aFloatArray_3635, var4.aFloatArray_3652, var4.aFloatArray_3653, var4.aFloatArray_3654, var3);
      } else if(this.positionData != null) {
         this.method7561(var1, var2, var4.aBoolean_3618, var4, var4.aClass202_3630, var4.aFloatArray_3650, var4.aFloatArray_3635, var4.aFloatArray_3652, var4.aFloatArray_3653, var4.aFloatArray_3654, var3);
      }

   }

   void method7560(int var1, int var2, Class202 var3, float[] var4, float[] var5, float[] var6, float[] var7, float[] var8, int var9) {
      Class190 var10 = this.aClass190ArrayArray_10960[var1][var2];
      int var12;
      int var14;
      float var29;
      float var28;
      float var34;
      float var32;
      float var33;
      float var39;
      float var37;
      float var42;
      float var47;
      float var44;
      if(var10 != null) {
         if((var10.aByte_3312 & 2) == 0) {
            if(var9 != 0) {
               if((var10.aByte_3312 & 4) != 0) {
                  if((var9 & 1) != 0) {
                     return;
                  }
               } else if((var9 & 2) != 0) {
                  return;
               }
            }

            int var48 = var1 * this.anInt_3031 * 69671577;
            var12 = var48 + this.anInt_3031 * 69671577;
            int var49 = var2 * this.anInt_3031 * 69671577;
            var14 = var49 + this.anInt_3031 * 69671577;
            int var15;
            float var19;
            float var18;
            float var21;
            float var20;
            float var23;
            float var22;
            float var25;
            float var24;
            float var30;
            float var35;
            float var40;
            float var45;
            float var55;
            float var54;
            float var53;
            float var58;
            float var57;
            float var56;
            if((var10.aByte_3312 & 1) != 0) {
               var15 = this.anIntArrayArray_3029[var1][var2];
               float var16 = this.aFloat_10964 * (float)var15;
               float var17 = this.aFloat_10965 * (float)var15;
               var18 = this.aFloat_10947 + this.aFloat_10953 * (float)var48 + var16 + this.aFloat_10968 * (float)var49;
               var19 = this.aFloat_10949 + this.aFloat_10961 * (float)var48 + var17 + this.aFloat_10969 * (float)var49;
               if(var18 < -var19) {
                  return;
               }

               var20 = this.aFloat_10947 + this.aFloat_10953 * (float)var12 + var16 + this.aFloat_10968 * (float)var49;
               var21 = this.aFloat_10949 + this.aFloat_10961 * (float)var12 + var17 + this.aFloat_10969 * (float)var49;
               if(var20 < -var21) {
                  return;
               }

               var22 = this.aFloat_10947 + this.aFloat_10953 * (float)var12 + var16 + this.aFloat_10968 * (float)var14;
               var23 = this.aFloat_10949 + this.aFloat_10961 * (float)var12 + var17 + this.aFloat_10969 * (float)var14;
               if(var22 < -var23) {
                  return;
               }

               var24 = this.aFloat_10947 + this.aFloat_10953 * (float)var48 + var16 + this.aFloat_10968 * (float)var14;
               var25 = this.aFloat_10949 + this.aFloat_10961 * (float)var48 + var17 + this.aFloat_10969 * (float)var14;
               if(var24 < -var25) {
                  return;
               }

               float var26 = this.aFloat_10962 * (float)var15;
               float var27 = this.aFloat_10963 * (float)var15;
               var28 = this.aFloat_10954 + this.aFloat_10958 * (float)var48 + var26 + this.aFloat_10966 * (float)var49;
               var29 = var3.aFloat_3495 + var3.aFloat_3490 * var28 / var19;
               var30 = this.aFloat_10971 + this.aFloat_10974 * (float)var48 + var27 + this.aFloat_10967 * (float)var49;
               var53 = var3.aFloat_3483 + var3.aFloat_3484 * var30 / var19;
               var32 = var3.aFloat_3485 + var3.aFloat_3489 * var18 / var19;
               var33 = this.aFloat_10954 + this.aFloat_10958 * (float)var12 + var26 + this.aFloat_10966 * (float)var49;
               var34 = var3.aFloat_3495 + var3.aFloat_3490 * var33 / var21;
               var35 = this.aFloat_10971 + this.aFloat_10974 * (float)var12 + var27 + this.aFloat_10967 * (float)var49;
               var54 = var3.aFloat_3483 + var3.aFloat_3484 * var35 / var21;
               var37 = var3.aFloat_3485 + var3.aFloat_3489 * var20 / var21;
               var55 = this.aFloat_10954 + this.aFloat_10958 * (float)var12 + var26 + this.aFloat_10966 * (float)var14;
               var39 = var3.aFloat_3495 + var3.aFloat_3490 * var55 / var23;
               var40 = this.aFloat_10971 + this.aFloat_10974 * (float)var12 + var27 + this.aFloat_10967 * (float)var14;
               var56 = var3.aFloat_3483 + var3.aFloat_3484 * var40 / var23;
               var42 = var3.aFloat_3485 + var3.aFloat_3489 * var22 / var23;
               var58 = this.aFloat_10954 + this.aFloat_10958 * (float)var48 + var26 + this.aFloat_10966 * (float)var14;
               var44 = var3.aFloat_3495 + var3.aFloat_3490 * var58 / var25;
               var45 = this.aFloat_10971 + this.aFloat_10974 * (float)var48 + var27 + this.aFloat_10967 * (float)var14;
               var57 = var3.aFloat_3483 + var3.aFloat_3484 * var45 / var25;
               var47 = var3.aFloat_3485 + var3.aFloat_3489 * var24 / var25;
            } else {
               var15 = this.anIntArrayArray_3029[var1][var2];
               int var50 = this.anIntArrayArray_3029[var1 + 1][var2];
               int var51 = this.anIntArrayArray_3029[var1 + 1][var2 + 1];
               int var52 = this.anIntArrayArray_3029[var1][var2 + 1];
               var18 = this.aFloat_10947 + this.aFloat_10953 * (float)var48 + this.aFloat_10964 * (float)var15 + this.aFloat_10968 * (float)var49;
               var19 = this.aFloat_10949 + this.aFloat_10961 * (float)var48 + this.aFloat_10965 * (float)var15 + this.aFloat_10969 * (float)var49;
               if(var18 < -var19) {
                  return;
               }

               var20 = this.aFloat_10947 + this.aFloat_10953 * (float)var12 + this.aFloat_10964 * (float)var50 + this.aFloat_10968 * (float)var49;
               var21 = this.aFloat_10949 + this.aFloat_10961 * (float)var12 + this.aFloat_10965 * (float)var50 + this.aFloat_10969 * (float)var49;
               if(var20 < -var21) {
                  return;
               }

               var22 = this.aFloat_10947 + this.aFloat_10953 * (float)var12 + this.aFloat_10964 * (float)var51 + this.aFloat_10968 * (float)var14;
               var23 = this.aFloat_10949 + this.aFloat_10961 * (float)var12 + this.aFloat_10965 * (float)var51 + this.aFloat_10969 * (float)var14;
               if(var22 < -var23) {
                  return;
               }

               var24 = this.aFloat_10947 + this.aFloat_10953 * (float)var48 + this.aFloat_10964 * (float)var52 + this.aFloat_10968 * (float)var14;
               var25 = this.aFloat_10949 + this.aFloat_10961 * (float)var48 + this.aFloat_10965 * (float)var52 + this.aFloat_10969 * (float)var14;
               if(var24 < -var25) {
                  return;
               }

               var28 = this.aFloat_10954 + this.aFloat_10958 * (float)var48 + this.aFloat_10962 * (float)var15 + this.aFloat_10966 * (float)var49;
               var29 = var3.aFloat_3495 + var3.aFloat_3490 * var28 / var19;
               var30 = this.aFloat_10971 + this.aFloat_10974 * (float)var48 + this.aFloat_10963 * (float)var15 + this.aFloat_10967 * (float)var49;
               var53 = var3.aFloat_3483 + var3.aFloat_3484 * var30 / var19;
               var32 = var3.aFloat_3485 + var3.aFloat_3489 * var18 / var19;
               var33 = this.aFloat_10954 + this.aFloat_10958 * (float)var12 + this.aFloat_10962 * (float)var50 + this.aFloat_10966 * (float)var49;
               var34 = var3.aFloat_3495 + var3.aFloat_3490 * var33 / var21;
               var35 = this.aFloat_10971 + this.aFloat_10974 * (float)var12 + this.aFloat_10963 * (float)var50 + this.aFloat_10967 * (float)var49;
               var54 = var3.aFloat_3483 + var3.aFloat_3484 * var35 / var21;
               var37 = var3.aFloat_3485 + var3.aFloat_3489 * var20 / var21;
               var55 = this.aFloat_10954 + this.aFloat_10958 * (float)var12 + this.aFloat_10962 * (float)var51 + this.aFloat_10966 * (float)var14;
               var39 = var3.aFloat_3495 + var3.aFloat_3490 * var55 / var23;
               var40 = this.aFloat_10971 + this.aFloat_10974 * (float)var12 + this.aFloat_10963 * (float)var51 + this.aFloat_10967 * (float)var14;
               var56 = var3.aFloat_3483 + var3.aFloat_3484 * var40 / var23;
               var42 = var3.aFloat_3485 + var3.aFloat_3489 * var22 / var23;
               var58 = this.aFloat_10954 + this.aFloat_10958 * (float)var48 + this.aFloat_10962 * (float)var52 + this.aFloat_10966 * (float)var14;
               var44 = var3.aFloat_3495 + var3.aFloat_3490 * var58 / var25;
               var45 = this.aFloat_10971 + this.aFloat_10974 * (float)var48 + this.aFloat_10963 * (float)var52 + this.aFloat_10967 * (float)var14;
               var57 = var3.aFloat_3483 + var3.aFloat_3484 * var45 / var25;
               var47 = var3.aFloat_3485 + var3.aFloat_3489 * var24 / var25;
            }

            var15 = -1;
            if(var10.aShort_3315 != -1) {
               var15 = this.aRenderer_Sub1_10970.aClass163_2802.method1996(var10.aShort_3315 & '\uffff', (byte)2).anInt_3146 * -534969509;
            }

            if((var39 - var44) * (var54 - var57) - (var56 - var57) * (var34 - var44) > 0.0F) {
               var3.aBoolean_3481 = var39 < 0.0F || var44 < 0.0F || var34 < 0.0F || var39 > (float)var3.anInt_3487 || var44 > (float)var3.anInt_3487 || var34 > (float)var3.anInt_3487;
               if(var15 >= 0) {
                  var3.method2568(true, true, false, var56, var57, var54, var39, var44, var34, var42, var47, var37, var23, var25, var21, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, -16777216 | Class561.colourMap[var10.aShort_3317 & '\uffff'] & 16777215, -16777216 | Class561.colourMap[var10.aShort_3316 & '\uffff'] & 16777215, -16777216 | Class561.colourMap[var10.aShort_3314 & '\uffff'] & 16777215, 0, 0.0F, 0.0F, 0.0F, var10.aShort_3315 & '\uffff', var15);
               } else {
                  var3.method2561(true, true, false, var56, var57, var54, var39, var44, var34, var42, var47, var37, (float)(var10.aShort_3317 & '\uffff'), (float)(var10.aShort_3316 & '\uffff'), (float)(var10.aShort_3314 & '\uffff'));
               }
            }

            if((var29 - var34) * (var57 - var54) - (var53 - var54) * (var44 - var34) > 0.0F) {
               var3.aBoolean_3481 = var29 < 0.0F || var34 < 0.0F || var44 < 0.0F || var29 > (float)var3.anInt_3487 || var34 > (float)var3.anInt_3487 || var44 > (float)var3.anInt_3487;
               if(var15 >= 0) {
                  var3.method2568(true, true, false, var53, var54, var57, var29, var34, var44, var32, var37, var47, var19, var21, var25, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, -16777216 | Class561.colourMap[var10.aShort_3313 & '\uffff'] & 16777215, -16777216 | Class561.colourMap[var10.aShort_3314 & '\uffff'] & 16777215, -16777216 | Class561.colourMap[var10.aShort_3316 & '\uffff'] & 16777215, 0, 0.0F, 0.0F, 0.0F, var10.aShort_3315 & '\uffff', var15);
               } else {
                  var3.method2561(true, true, false, var53, var54, var57, var29, var34, var44, var32, var37, var47, (float)(var10.aShort_3313 & '\uffff'), (float)(var10.aShort_3314 & '\uffff'), (float)(var10.aShort_3316 & '\uffff'));
               }
            }

         }
      } else {
         Class199 var11 = this.aClass199ArrayArray_10959[var1][var2];
         if(var11 != null) {
            if(var9 != 0) {
               if((var11.aByte_3421 & 4) != 0) {
                  if((var9 & 1) != 0) {
                     return;
                  }
               } else if((var9 & 2) != 0) {
                  return;
               }
            }

            int var31;
            for(var31 = 0; var31 < var11.aShort_3420; ++var31) {
               var12 = var11.aShortArray_3422[var31] + (var1 << this.shiftAmount * 1694172417);
               short var13 = var11.aShortArray_3419[var31];
               var14 = var11.aShortArray_3429[var31] + (var2 << this.shiftAmount * 1694172417);
               var39 = this.aFloat_10947 + this.aFloat_10953 * (float)var12 + this.aFloat_10964 * (float)var13 + this.aFloat_10968 * (float)var14;
               var44 = this.aFloat_10949 + this.aFloat_10961 * (float)var12 + this.aFloat_10965 * (float)var13 + this.aFloat_10969 * (float)var14;
               if(var39 < -var44) {
                  return;
               }

               var29 = this.aFloat_10954 + this.aFloat_10958 * (float)var12 + this.aFloat_10962 * (float)var13 + this.aFloat_10966 * (float)var14;
               var34 = this.aFloat_10971 + this.aFloat_10974 * (float)var12 + this.aFloat_10963 * (float)var13 + this.aFloat_10967 * (float)var14;
               var4[var31] = var3.aFloat_3495 + var3.aFloat_3490 * var29 / var44;
               var5[var31] = var3.aFloat_3483 + var3.aFloat_3484 * var34 / var44;
               var6[var31] = var3.aFloat_3485 + var3.aFloat_3489 * var39 / var44;
               var7[var31] = var44;
            }

            int var38;
            short var36;
            short var41;
            short var46;
            if(var11.aShortArray_3424 != null) {
               for(var31 = 0; var31 < var11.aShort_3423; ++var31) {
                  var36 = var11.aShortArray_3425[var31];
                  var41 = var11.aShortArray_3427[var31];
                  var46 = var11.aShortArray_3428[var31];
                  var32 = var4[var36];
                  var37 = var4[var41];
                  var42 = var4[var46];
                  var47 = var5[var36];
                  var28 = var5[var41];
                  var33 = var5[var46];
                  if((var32 - var37) * (var33 - var28) - (var47 - var28) * (var42 - var37) > 0.0F) {
                     var3.aBoolean_3481 = var32 < 0.0F || var37 < 0.0F || var42 < 0.0F || var32 > (float)var3.anInt_3487 || var37 > (float)var3.anInt_3487 || var42 > (float)var3.anInt_3487;
                     var38 = -1;
                     if(var11.aShortArray_3424[var31] != -1) {
                        var38 = this.aRenderer_Sub1_10970.aClass163_2802.method1996(var11.aShortArray_3424[var31] & '\uffff', (byte)2).anInt_3146 * -534969509;
                     }

                     if(var38 != -1) {
                        var3.method2568(true, true, false, var47, var28, var33, var32, var37, var42, var6[var36], var6[var41], var6[var46], var7[var36], var7[var41], var7[var46], (float)var11.aShortArray_3422[var36] / (float)(this.anInt_3031 * 69671577), (float)var11.aShortArray_3422[var41] / (float)(this.anInt_3031 * 69671577), (float)var11.aShortArray_3422[var46] / (float)(this.anInt_3031 * 69671577), (float)var11.aShortArray_3429[var36] / (float)(this.anInt_3031 * 69671577), (float)var11.aShortArray_3429[var41] / (float)(this.anInt_3031 * 69671577), (float)var11.aShortArray_3429[var46] / (float)(this.anInt_3031 * 69671577), -16777216 | Class561.colourMap[var11.aShortArray_3432[var36] & '\uffff'] & 16777215, -16777216 | Class561.colourMap[var11.aShortArray_3432[var41] & '\uffff'] & 16777215, -16777216 | Class561.colourMap[var11.aShortArray_3432[var46] & '\uffff'] & 16777215, 0, 0.0F, 0.0F, 0.0F, var11.aShortArray_3424[var31] & '\uffff', var38);
                     } else {
                        int var43 = var11.anIntArray_3431[var31];
                        if(var43 != -1) {
                           var3.method2561(true, true, false, var47, var28, var33, var32, var37, var42, var6[var36], var6[var41], var6[var46], (float)Class476.method5683(var43, var11.aShortArray_3432[var36], -428694147), (float)Class476.method5683(var43, var11.aShortArray_3432[var41], -1229328117), (float)Class476.method5683(var43, var11.aShortArray_3432[var46], -989055958));
                        }
                     }
                  }
               }
            } else {
               for(var31 = 0; var31 < var11.aShort_3423; ++var31) {
                  var36 = var11.aShortArray_3425[var31];
                  var41 = var11.aShortArray_3427[var31];
                  var46 = var11.aShortArray_3428[var31];
                  var32 = var4[var36];
                  var37 = var4[var41];
                  var42 = var4[var46];
                  var47 = var5[var36];
                  var28 = var5[var41];
                  var33 = var5[var46];
                  if((var32 - var37) * (var33 - var28) - (var47 - var28) * (var42 - var37) > 0.0F) {
                     var38 = var11.anIntArray_3431[var31];
                     if(var38 != -1) {
                        var3.aBoolean_3481 = var32 < 0.0F || var37 < 0.0F || var42 < 0.0F || var32 > (float)var3.anInt_3487 || var37 > (float)var3.anInt_3487 || var42 > (float)var3.anInt_3487;
                        var3.method2561(true, true, false, var47, var28, var33, var32, var37, var42, var6[var36], var6[var41], var6[var46], (float)Class476.method5683(var38, var11.aShortArray_3432[var36], -1085903104), (float)Class476.method5683(var38, var11.aShortArray_3432[var41], -1565005235), (float)Class476.method5683(var38, var11.aShortArray_3432[var46], -1593032277));
                     }
                  }
               }
            }
         }

      }
   }

   void method7561(int var1, int var2, boolean var3, Class210 var4, Class202 var5, float[] var6, float[] var7, float[] var8, float[] var9, float[] var10, int var11) {
      Class139 var12 = this.positionData[var1][var2];
      if(var11 == 0 || (var11 & 2) == 0) {
         if(var12 != null) {
            int var20;
            for(int var13 = 0; var13 < var12.coordCount; ++var13) {
               int realX = var12.xCoords[var13] + (var1 << this.shiftAmount * 1694172417);
               int realY = var12.zCoords[var13];
               int realZ = var12.yCoords[var13] + (var2 << this.shiftAmount * 1694172417);
               float var17 = this.aFloat_10947 + this.aFloat_10953 * (float)realX + this.aFloat_10964 * (float)realY + this.aFloat_10968 * (float)realZ;
               float var18 = this.aFloat_10949 + this.aFloat_10961 * (float)realX + this.aFloat_10965 * (float)realY + this.aFloat_10969 * (float)realZ;
               if(var17 < -var18) {
                  return;
               }

               var10[var13] = 0.0F;
               float var19;
               if(var3) {
                  var19 = var17 - var4.aFloat_3614;
                  if(var19 > 0.0F) {
                     var19 /= var4.aFloat_3624;
                     if(var19 > 1.0F) {
                        var19 = 1.0F;
                     }

                     var10[var13] = var19;
                     var20 = (int)((float)var12.aShortArray_2654[var13] * var19);
                     if(var20 > 0) {
                        realY -= var20;
                     }
                  }
               } else if(var4.aBoolean_3613) {
                  var19 = var17 - var4.aFloat_3614;
                  if(var19 > 0.0F) {
                     var10[var13] = var19 / var4.aFloat_3624;
                     if(var10[var13] > 1.0F) {
                        var10[var13] = 1.0F;
                     }
                  }
               }

               float var21 = this.aFloat_10954 + this.aFloat_10958 * (float)realX + this.aFloat_10962 * (float)realY + this.aFloat_10966 * (float)realZ;
               float var22 = this.aFloat_10971 + this.aFloat_10974 * (float)realX + this.aFloat_10963 * (float)realY + this.aFloat_10967 * (float)realZ;
               var6[var13] = var5.aFloat_3495 + var5.aFloat_3490 * var21 / var18;
               var7[var13] = var5.aFloat_3483 + var5.aFloat_3484 * var22 / var18;
               var8[var13] = var5.aFloat_3485 + var5.aFloat_3489 * var17 / var18;
               var9[var13] = var18;
            }

            float var33 = (float)(this.anInt_3031 * 69671577);

            for(int var34 = 0; var34 < var12.size; ++var34) {
               var20 = var34 * 3;
               int var23 = var20 + 1;
               int var24 = var23 + 1;
               float var25 = var6[var20];
               float var26 = var6[var23];
               float var27 = var6[var24];
               float var28 = var7[var20];
               float var29 = var7[var23];
               float var30 = var7[var24];
               if((var25 - var26) * (var30 - var29) - (var28 - var29) * (var27 - var26) > 0.0F) {
                  var5.aBoolean_3481 = var25 < 0.0F || var26 < 0.0F || var27 < 0.0F || var25 > (float)var5.anInt_3487 || var26 > (float)var5.anInt_3487 || var27 > (float)var5.anInt_3487;
                  if(var10[var20] + var10[var23] + var10[var24] < 3.0F) {
                     int offsetX = var1 << this.shiftAmount * 1694172417;
                     int offsetY = var2 << this.shiftAmount * 1694172417;
                     if((var12.colourData[var20] & 16777215) != 0) {
                        if(var12.aShortArray_2655[var20] != -1 && var12.aShortArray_2655[var23] != -1 && var12.aShortArray_2655[var24] != -1) {
                           if(var12.aShortArray_2655[var20] == var12.aShortArray_2655[var23] && var12.aShortArray_2655[var20] == var12.aShortArray_2655[var24] && var12.aShortArray_2656[var20] == var12.aShortArray_2656[var23] && var12.aShortArray_2656[var20] == var12.aShortArray_2656[var24]) {
                              var5.method2568(true, true, false, var28, var29, var30, var25, var26, var27, var8[var20], var8[var23], var8[var24], var9[var20], var9[var23], var9[var24], (float)(offsetX + var12.xCoords[var20]) / (float)var12.aShortArray_2656[var20], (float)(offsetX + var12.xCoords[var23]) / (float)var12.aShortArray_2656[var23], (float)(offsetX + var12.xCoords[var24]) / (float)var12.aShortArray_2656[var24], (float)(offsetY + var12.yCoords[var20]) / (float)var12.aShortArray_2656[var20], (float)(offsetY + var12.yCoords[var23]) / (float)var12.aShortArray_2656[var23], (float)(offsetY + var12.yCoords[var24]) / (float)var12.aShortArray_2656[var24], var12.colourData[var20], var12.colourData[var23], var12.colourData[var24], var4.anInt_3616 * -2058706033, var10[var20] * 255.0F, var10[var23] * 255.0F, var10[var24] * 255.0F, var12.aShortArray_2655[var20] & '\uffff', this.aRenderer_Sub1_10970.aClass163_2802.method1996(var12.aShortArray_2655[var20] & '\uffff', (byte)2).anInt_3146 * -534969509);
                           } else {
                              var5.method2565(true, true, false, var28, var29, var30, var25, var26, var27, var8[var20], var8[var23], var8[var24], var9[var20], var9[var23], var9[var24], (float)(offsetX + var12.xCoords[var20]) / var33, (float)(offsetX + var12.xCoords[var23]) / var33, (float)(offsetX + var12.xCoords[var24]) / var33, (float)(offsetY + var12.yCoords[var20]) / var33, (float)(offsetY + var12.yCoords[var23]) / var33, (float)(offsetY + var12.yCoords[var24]) / var33, var12.colourData[var20], var12.colourData[var23], var12.colourData[var24], var4.anInt_3616 * -2058706033, var10[var20] * 255.0F, var10[var23] * 255.0F, var10[var24] * 255.0F, var12.aShortArray_2655[var20] & '\uffff', this.aRenderer_Sub1_10970.aClass163_2802.method1996(var12.aShortArray_2655[var20] & '\uffff', (byte)2).anInt_3146 * -534969509, var33 / (float)var12.aShortArray_2656[var20], var12.aShortArray_2655[var23] & '\uffff', this.aRenderer_Sub1_10970.aClass163_2802.method1996(var12.aShortArray_2655[var23] & '\uffff', (byte)2).anInt_3146 * -534969509, var33 / (float)var12.aShortArray_2656[var23], var12.aShortArray_2655[var24] & '\uffff', this.aRenderer_Sub1_10970.aClass163_2802.method1996(var12.aShortArray_2655[var24] & '\uffff', (byte)2).anInt_3146 * -534969509, var33 / (float)var12.aShortArray_2656[var24]);
                           }
                        } else {
                           var5.method2562(true, true, false, var28, var29, var30, var25, var26, var27, var8[var20], var8[var23], var8[var24], var4.anInt_3616 * -2058706033);
                        }
                     }
                  } else {
                     var5.method2562(true, true, false, var28, var29, var30, var25, var26, var27, var8[var20], var8[var23], var8[var24], var4.anInt_3616 * -2058706033);
                  }
               }
            }
         }

      }
   }

   boolean method7562(int var1) {
      return (this.anInt_10952 & 8) == 0?false:(var1 == 4?true:(var1 == 8?true:var1 == 9));
   }

   public void method2152(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean[][] var8) {
      Class210 var9 = this.aRenderer_Sub1_10970.method6787(Thread.currentThread());
      Class202 var10 = var9.aClass202_3630;
      var10.anInt_3509 = 0;
      var10.aBoolean_3481 = true;
      this.aRenderer_Sub1_10970.method6752();
      if(this.colours == null && this.positionData == null) {
         if(this.aClass190ArrayArray_10960 != null) {
            this.method7567(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var9.aFloatArray_3650, var9.aFloatArray_3635);
         }
      } else {
         this.method7556(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var9.aFloatArray_3650, var9.aFloatArray_3635);
      }

   }

   public void method2158(Class240_Sub22_Sub7 var1, int var2, int var3, int var4, int var5, boolean var6) {}

   public void method2160(Class240_Sub53 var1, int[] var2) {}

   public void define(int x, int y, int[] var3, int[] heights, int[] var5, int[] var6, int[] var7, int[] colourData, int[] var9, int[] var10, Class105 var11, boolean var12) {
      boolean var13 = (this.anInt_10952 & 32) == 0;
      if(this.colours == null && !var13) {
         this.colours = new Class197[this.maxWidth * 1658489349][this.maxHeight * 445373459];
         this.vertices = new Class196[this.maxWidth * 1658489349][this.maxHeight * 445373459];
      } else if(this.positionData == null && var13) {
         this.positionData = new Class139[this.maxWidth * 1658489349][this.maxHeight * 445373459];
      } else if(this.aClass190ArrayArray_10960 != null) {
         throw new IllegalStateException();
      }

      if(var3 != null && var3.length != 0) {
         int var14;
         for(var14 = 0; var14 < var7.length; ++var14) {
            if(var7[var14] == -1) {
               var7[var14] = 0;
            } else {
               var7[var14] = Class561.colourMap[CacheFileID.method1398(var7[var14], 1980485241) & '\uffff'] << 8 | 255;
            }
         }

         if(colourData != null) {
            for(var14 = 0; var14 < colourData.length; ++var14) {
               if(colourData[var14] == -1) {
                  colourData[var14] = 0;
               } else {
                  colourData[var14] = Class561.colourMap[CacheFileID.method1398(colourData[var14], -1873269418) & '\uffff'] << 8 | 255;
               }
            }
         }

         int vIndex;
         int offsetY;
         int offsetX;
         int var19;
         int var21;
         int var20;
         int blueComp;
         int var30;
         if(var13) {
            Class139 var28 = new Class139();
            var28.coordCount = (short)var3.length; //39
            var28.size = (short)(var3.length / 3); // 13 
            var28.xCoords = new short[var28.coordCount];
            var28.zCoords = new short[var28.coordCount];
            var28.yCoords = new short[var28.coordCount];
            var28.colourData = new int[var28.coordCount];
            var28.aShortArray_2655 = new short[var28.coordCount];
            var28.aShortArray_2656 = new short[var28.coordCount];
            var28.aByteArray_2658 = new byte[var28.coordCount];
            if(var6 != null) {
               var28.aShortArray_2654 = new short[var28.coordCount];
            }

            for(vIndex = 0; vIndex < var28.coordCount; ++vIndex) {
               offsetX = var3[vIndex];
               offsetY = var5[vIndex];
               boolean var18 = false;
               if(offsetX == 0 && offsetY == 0) {
                  var30 = this.renderBuffer[x][y] - this.aByteArrayArray_10975[x][y];
               } else if(offsetX == 0 && offsetY == this.anInt_3031 * 69671577) {
                  var30 = this.renderBuffer[x][y + 1] - this.aByteArrayArray_10975[x][y + 1];
               } else if(offsetX == this.anInt_3031 * 69671577 && offsetY == this.anInt_3031 * 69671577) {
                  var30 = this.renderBuffer[x + 1][y + 1] - this.aByteArrayArray_10975[x + 1][y + 1];
               } else if(offsetX == this.anInt_3031 * 69671577 && offsetY == 0) {
                  var30 = this.renderBuffer[x + 1][y] - this.aByteArrayArray_10975[x + 1][y];
               } else {
                  var19 = (this.renderBuffer[x][y] - this.aByteArrayArray_10975[x][y]) * (this.anInt_3031 * 69671577 - offsetX) + (this.renderBuffer[x + 1][y] - this.aByteArrayArray_10975[x + 1][y]) * offsetX;
                  var20 = (this.renderBuffer[x][y + 1] - this.aByteArrayArray_10975[x][y + 1]) * (this.anInt_3031 * 69671577 - offsetX) + (this.renderBuffer[x + 1][y + 1] - this.aByteArrayArray_10975[x + 1][y + 1]) * offsetX;
                  var30 = var19 * (this.anInt_3031 * 69671577 - offsetY) + var20 * offsetY >> this.shiftAmount * -906622462;
               }

               var19 = (x << this.shiftAmount * 1694172417) + offsetX;
               var20 = (y << this.shiftAmount * 1694172417) + offsetY;
               var28.xCoords[vIndex] = (short)offsetX;
               var28.yCoords[vIndex] = (short)offsetY;
               var28.zCoords[vIndex] = (short)(this.getHeight(var19, var20) + (heights != null?heights[vIndex]:0));
               if(var30 < 0) {
                  var30 = 0;
               }

               if(var7[vIndex] == 0) {
                  var28.colourData[vIndex] = 0;
                  if(colourData != null) {
                     var28.aByteArray_2658[vIndex] = (byte)var30;
                  }
               } else {
                  var21 = 0;
                  if(var6 != null) {
                     short var22 = var28.aShortArray_2654[vIndex] = (short)var6[vIndex];
                     if(var11.anInt_1981 * 1611763201 != 0) {
                        var21 = 255 * var22 / (var11.anInt_1981 * 1611763201);
                        if(var21 < 0) {
                           var21 = 0;
                        } else if(var21 > 255) {
                           var21 = 255;
                        }
                     }
                  }

                  blueComp = -16777216;
                  if(var9[vIndex] != -1) {
                     Class183 var23 = this.aRenderer_Sub1_10970.aClass163_2802.method1996(var9[vIndex], (byte)2);
                     if(var23.anInt_3146 * -534969509 != -1 && this.method7562(var23.aByte_3169)) {
                        blueComp = -1694498816;
                     }
                  }

                  var28.colourData[vIndex] = blueComp | UpdateServerConnector.rgbToColour(method7569(var7[vIndex] >> 8, var30), var11.anInt_1982 * 1829281247, var21);
                  if(colourData != null) {
                     var28.aByteArray_2658[vIndex] = (byte)var30;
                  }
               }

               var28.aShortArray_2655[vIndex] = (short)var9[vIndex];
               var28.aShortArray_2656[vIndex] = (short)var10[vIndex];
            }

            if(colourData != null) {
               var28.anIntArray_2651 = new int[var28.size];
            }

            for(vIndex = 0; vIndex < var28.size; ++vIndex) {
               offsetX = vIndex * 3;
               if(colourData != null && colourData[offsetX] != 0) {
                  var28.anIntArray_2651[vIndex] = -16777216 | colourData[offsetX] >> 8;
               }
            }

            this.positionData[x][y] = var28;
         } else {
            boolean var29 = true;
            vIndex = -1;
            offsetX = -1;
            offsetY = -1;
            var30 = -1;
            if(var3.length == 6) {
               for(var19 = 0; var19 < 6; ++var19) {
                  if(var3[var19] == 0 && var5[var19] == 0) {
                     if(vIndex != -1 && var7[vIndex] != var7[var19]) {
                        var29 = false;
                        break;
                     }

                     vIndex = var19;
                  } else if(var3[var19] == this.anInt_3031 * 69671577 && var5[var19] == 0) {
                     if(offsetX != -1 && var7[offsetX] != var7[var19]) {
                        var29 = false;
                        break;
                     }

                     offsetX = var19;
                  } else if(var3[var19] == this.anInt_3031 * 69671577 && var5[var19] == this.anInt_3031 * 69671577) {
                     if(offsetY != -1 && var7[offsetY] != var7[var19]) {
                        var29 = false;
                        break;
                     }

                     offsetY = var19;
                  } else if(var3[var19] == 0 && var5[var19] == this.anInt_3031 * 69671577) {
                     if(var30 != -1 && var7[var30] != var7[var19]) {
                        var29 = false;
                        break;
                     }

                     var30 = var19;
                  }
               }

               if(vIndex == -1 || offsetX == -1 || offsetY == -1 || var30 == -1) {
                  var29 = false;
               }

               if(var29) {
                  if(heights != null) {
                     for(var19 = 0; var19 < 4; ++var19) {
                        if(heights[var19] != 0) {
                           var29 = false;
                           break;
                        }
                     }
                  }

                  if(var29) {
                     for(var19 = 1; var19 < 4; ++var19) {
                        if(var3[var19] != var3[0] && var3[var19] != var3[0] + this.anInt_3031 * 69671577 && var3[var19] != var3[0] - this.anInt_3031 * 69671577) {
                           var29 = false;
                           break;
                        }

                        if(var5[var19] != var5[0] && var5[var19] != var5[0] + this.anInt_3031 * 69671577 && var5[var19] != var5[0] - this.anInt_3031 * 69671577) {
                           var29 = false;
                           break;
                        }
                     }
                  }
               }
            } else {
               var29 = false;
            }

            if(var29) {
               Class197 var33 = new Class197();
               var20 = var7[0];
               var21 = var9[0];
               if(colourData != null) {
                  var33.anInt_3408 = colourData[0] >> 8;
                  if(var20 == 0) {
                     var33.aByte_3399 = (byte)(var33.aByte_3399 | 2);
                  }
               } else if(var20 == 0) {
                  return;
               }

               if(this.anIntArrayArray_3029[x][y] == this.anIntArrayArray_3029[x + 1][y] && this.anIntArrayArray_3029[x][y] == this.anIntArrayArray_3029[x + 1][y + 1] && this.anIntArrayArray_3029[x][y] == this.anIntArrayArray_3029[x][y + 1]) {
                  var33.aByte_3399 = (byte)(var33.aByte_3399 | 1);
               }

               if(var21 != -1 && (var33.aByte_3399 & 2) == 0 && !this.aRenderer_Sub1_10970.aClass163_2802.method1996(var21, (byte)2).aBoolean_3174) {
                  if(var6 != null && var11.anInt_1981 * 1611763201 != 0) {
                     blueComp = 255 * var6[vIndex] / (var11.anInt_1981 * 1611763201);
                     if(blueComp < 0) {
                        blueComp = 0;
                     } else if(blueComp > 255) {
                        blueComp = 255;
                     }
                  } else {
                     blueComp = 0;
                  }

                  var33.colour1 = UpdateServerConnector.rgbToColour(method7569(var7[vIndex] >> 8, this.renderBuffer[x][y] - this.aByteArrayArray_10975[x][y]), var11.anInt_1982 * 1829281247, blueComp);
                  if(var33.anInt_3408 != 0) {
                     var33.colour1 |= 255 - (this.renderBuffer[x][y] - this.aByteArrayArray_10975[x][y]) << 25;
                  }

                  if(var6 != null && var11.anInt_1981 * 1611763201 != 0) {
                     blueComp = 255 * var6[offsetX] / (var11.anInt_1981 * 1611763201);
                     if(blueComp < 0) {
                        blueComp = 0;
                     } else if(blueComp > 255) {
                        blueComp = 255;
                     }
                  } else {
                     blueComp = 0;
                  }

                  var33.colour2 = UpdateServerConnector.rgbToColour(method7569(var7[offsetX] >> 8, this.renderBuffer[x + 1][y] - this.aByteArrayArray_10975[x + 1][y]), var11.anInt_1982 * 1829281247, blueComp);
                  if(var33.anInt_3408 != 0) {
                     var33.colour2 |= 255 - (this.renderBuffer[x + 1][y] - this.aByteArrayArray_10975[x + 1][y]) << 25;
                  }

                  if(var6 != null && var11.anInt_1981 * 1611763201 != 0) {
                     blueComp = 255 * var6[offsetY] / (var11.anInt_1981 * 1611763201);
                     if(blueComp < 0) {
                        blueComp = 0;
                     } else if(blueComp > 255) {
                        blueComp = 255;
                     }
                  } else {
                     blueComp = 0;
                  }

                  var33.colour3 = UpdateServerConnector.rgbToColour(method7569(var7[offsetY] >> 8, this.renderBuffer[x + 1][y + 1] - this.aByteArrayArray_10975[x + 1][y + 1]), var11.anInt_1982 * 1829281247, blueComp);
                  if(var33.anInt_3408 != 0) {
                     var33.colour3 |= 255 - (this.renderBuffer[x + 1][y + 1] - this.aByteArrayArray_10975[x + 1][y + 1]) << 25;
                  }

                  if(var6 != null && var11.anInt_1981 * 1611763201 != 0) {
                     blueComp = 255 * var6[var30] / (var11.anInt_1981 * 1611763201);
                     if(blueComp < 0) {
                        blueComp = 0;
                     } else if(blueComp > 255) {
                        blueComp = 255;
                     }
                  } else {
                     blueComp = 0;
                  }

                  var33.colour4 = UpdateServerConnector.rgbToColour(method7569(var7[var30] >> 8, this.renderBuffer[x][y + 1] - this.aByteArrayArray_10975[x][y + 1]), var11.anInt_1982 * 1829281247, blueComp);
                  var33.aShort_3409 = (short)var21;
               } else {
                  if(var6 != null && var11.anInt_1981 * 1611763201 != 0) {
                     blueComp = 255 * var6[vIndex] / (var11.anInt_1981 * 1611763201);
                     if(blueComp < 0) {
                        blueComp = 0;
                     } else if(blueComp > 255) {
                        blueComp = 255;
                     }
                  } else {
                     blueComp = 0;
                  }

                  var33.colour1 = UpdateServerConnector.rgbToColour(method7569(var7[vIndex] >> 8, this.renderBuffer[x][y] - this.aByteArrayArray_10975[x][y]), var11.anInt_1982 * 1829281247, blueComp);
                  if(var33.anInt_3408 != 0) {
                     var33.colour1 |= 255 - (this.renderBuffer[x][y] - this.aByteArrayArray_10975[x][y]) << 25;
                  }

                  if(var6 != null && var11.anInt_1981 * 1611763201 != 0) {
                     blueComp = 255 * var6[offsetX] / (var11.anInt_1981 * 1611763201);
                     if(blueComp < 0) {
                        blueComp = 0;
                     } else if(blueComp > 255) {
                        blueComp = 255;
                     }
                  } else {
                     blueComp = 0;
                  }

                  var33.colour2 = UpdateServerConnector.rgbToColour(method7569(var7[offsetX] >> 8, this.renderBuffer[x + 1][y] - this.aByteArrayArray_10975[x + 1][y]), var11.anInt_1982 * 1829281247, blueComp);
                  if(var33.anInt_3408 != 0) {
                     var33.colour2 |= 255 - (this.renderBuffer[x + 1][y] - this.aByteArrayArray_10975[x + 1][y]) << 25;
                  }

                  if(var6 != null && var11.anInt_1981 * 1611763201 != 0) {
                     blueComp = 255 * var6[offsetY] / (var11.anInt_1981 * 1611763201);
                     if(blueComp < 0) {
                        blueComp = 0;
                     } else if(blueComp > 255) {
                        blueComp = 255;
                     }
                  } else {
                     blueComp = 0;
                  }

                  var33.colour3 = UpdateServerConnector.rgbToColour(method7569(var7[offsetY] >> 8, this.renderBuffer[x + 1][y + 1] - this.aByteArrayArray_10975[x + 1][y + 1]), var11.anInt_1982 * 1829281247, blueComp);
                  if(var33.anInt_3408 != 0) {
                     var33.colour3 |= 255 - (this.renderBuffer[x + 1][y + 1] - this.aByteArrayArray_10975[x + 1][y + 1]) << 25;
                  }

                  if(var6 != null && var11.anInt_1981 * 1611763201 != 0) {
                     blueComp = 255 * var6[var30] / (var11.anInt_1981 * 1611763201);
                     if(blueComp < 0) {
                        blueComp = 0;
                     } else if(blueComp > 255) {
                        blueComp = 255;
                     }
                  } else {
                     blueComp = 0;
                  }

                  var33.colour4 = UpdateServerConnector.rgbToColour(method7569(var7[var30] >> 8, this.renderBuffer[x][y + 1] - this.aByteArrayArray_10975[x][y + 1]), var11.anInt_1982 * 1829281247, blueComp);
                  if(var33.anInt_3408 != 0) {
                     var33.colour4 |= 255 - (this.renderBuffer[x][y + 1] - this.aByteArrayArray_10975[x][y + 1]) << 25;
                  }

                  var33.aShort_3409 = -1;
               }

               if(var6 != null) {
                  var33.aShort_3405 = (short)var6[offsetY];
                  var33.aShort_3407 = (short)var6[var30];
                  var33.aShort_3406 = (short)var6[offsetX];
                  var33.aShort_3404 = (short)var6[vIndex];
               }

               this.colours[x][y] = var33;
            } else {
               Class196 var35 = new Class196();
               var35.aShort_3389 = (short)var3.length;
               var35.aShort_3391 = (short)(var3.length / 3);
               var35.xCoords = new short[var35.aShort_3389];
               var35.zCoords = new short[var35.aShort_3389];
               var35.yCoords = new short[var35.aShort_3389];
               var35.anIntArray_3392 = new int[var35.aShort_3389];
               if(var6 != null) {
                  var35.aShortArray_3394 = new short[var35.aShort_3389];
               }

               int var24;
               int var37;
               for(var20 = 0; var20 < var35.aShort_3389; ++var20) {
                  var21 = var3[var20];
                  blueComp = var5[var20];
                  boolean var32 = false;
                  int var25;
                  if(var21 == 0 && blueComp == 0) {
                     var37 = this.renderBuffer[x][y] - this.aByteArrayArray_10975[x][y];
                  } else if(var21 == 0 && blueComp == this.anInt_3031 * 69671577) {
                     var37 = this.renderBuffer[x][y + 1] - this.aByteArrayArray_10975[x][y + 1];
                  } else if(var21 == this.anInt_3031 * 69671577 && blueComp == this.anInt_3031 * 69671577) {
                     var37 = this.renderBuffer[x + 1][y + 1] - this.aByteArrayArray_10975[x + 1][y + 1];
                  } else if(var21 == this.anInt_3031 * 69671577 && blueComp == 0) {
                     var37 = this.renderBuffer[x + 1][y] - this.aByteArrayArray_10975[x + 1][y];
                  } else {
                     var24 = (this.renderBuffer[x][y] - this.aByteArrayArray_10975[x][y]) * (this.anInt_3031 * 69671577 - var21) + (this.renderBuffer[x + 1][y] - this.aByteArrayArray_10975[x + 1][y]) * var21;
                     var25 = (this.renderBuffer[x][y + 1] - this.aByteArrayArray_10975[x][y + 1]) * (this.anInt_3031 * 69671577 - var21) + (this.renderBuffer[x + 1][y + 1] - this.aByteArrayArray_10975[x + 1][y + 1]) * var21;
                     var37 = var24 * (this.anInt_3031 * 69671577 - blueComp) + var25 * blueComp >> this.shiftAmount * -906622462;
                  }

                  var24 = (x << this.shiftAmount * 1694172417) + var21;
                  var25 = (y << this.shiftAmount * 1694172417) + blueComp;
                  var35.xCoords[var20] = (short)var21;
                  var35.yCoords[var20] = (short)blueComp;
                  var35.zCoords[var20] = (short)(this.getHeight(var24, var25) + (heights != null?heights[var20]:0));
                  if(var37 < 0) {
                     var37 = 0;
                  }

                  if(var7[var20] == 0) {
                     if(colourData != null) {
                        var35.anIntArray_3392[var20] = var37 << 25;
                     } else {
                        var35.anIntArray_3392[var20] = 0;
                     }
                  } else {
                     int var26 = 0;
                     if(var6 != null) {
                        short var27 = var35.aShortArray_3394[var20] = (short)var6[var20];
                        if(var11.anInt_1981 * 1611763201 != 0) {
                           var26 = 255 * var27 / (var11.anInt_1981 * 1611763201);
                           if(var26 < 0) {
                              var26 = 0;
                           } else if(var26 > 255) {
                              var26 = 255;
                           }
                        }
                     }

                     var35.anIntArray_3392[var20] = UpdateServerConnector.rgbToColour(method7569(var7[var20] >> 8, var37), var11.anInt_1982 * 1829281247, var26);
                     if(colourData != null) {
                        var35.anIntArray_3392[var20] |= var37 << 25;
                     }
                  }
               }

               boolean var34 = false;

               for(var21 = 0; var21 < var35.aShort_3391; ++var21) {
                  if(var9[var21 * 3] != -1 && !this.aRenderer_Sub1_10970.aClass163_2802.method1996(var9[var21 * 3], (byte)2).aBoolean_3174) {
                     var34 = true;
                  }
               }

               if(colourData != null) {
                  var35.anIntArray_3398 = new int[var35.aShort_3391];
               }

               if(var34) {
                  var35.aShortArray_3395 = new short[var35.aShort_3391];
                  var35.aShortArray_3397 = new short[var35.aShort_3391];
               }

               for(var21 = 0; var21 < var35.aShort_3391; ++var21) {
                  blueComp = var21 * 3;
                  if(colourData != null && colourData[blueComp] != 0) {
                     var35.anIntArray_3398[var21] = colourData[blueComp] >> 8;
                  }

                  if(var34) {
                     var37 = blueComp + 1;
                     var24 = var37 + 1;
                     boolean var36 = false;
                     boolean var38 = true;
                     int var39 = var9[blueComp];
                     if(var39 != -1 && !this.aRenderer_Sub1_10970.aClass163_2802.method1996(var39, (byte)2).aBoolean_3174) {
                        var36 = true;
                     } else {
                        var38 = false;
                     }

                     var39 = var9[var37];
                     if(var39 != -1 && !this.aRenderer_Sub1_10970.aClass163_2802.method1996(var39, (byte)2).aBoolean_3174) {
                        var36 = true;
                     } else {
                        var38 = false;
                     }

                     var39 = var9[var24];
                     if(var39 != -1 && !this.aRenderer_Sub1_10970.aClass163_2802.method1996(var39, (byte)2).aBoolean_3174) {
                        var36 = true;
                     } else {
                        var38 = false;
                     }

                     if(var38) {
                        var35.aShortArray_3395[var21] = (short)var39;
                        var35.aShortArray_3397[var21] = (short)var10[blueComp];
                     } else {
                        if(var36) {
                           var39 = var9[blueComp];
                           if(var39 != -1 && !this.aRenderer_Sub1_10970.aClass163_2802.method1996(var39, (byte)2).aBoolean_3174) {
                              var35.anIntArray_3392[blueComp] = Class561.colourMap[CacheFileID.method1398(this.aRenderer_Sub1_10970.aClass163_2802.method1996(var39, (byte)2).aShort_3118 & '\uffff', 738590008) & '\uffff'];
                           }

                           var39 = var9[var37];
                           if(var39 != -1 && !this.aRenderer_Sub1_10970.aClass163_2802.method1996(var39, (byte)2).aBoolean_3174) {
                              var35.anIntArray_3392[var37] = Class561.colourMap[CacheFileID.method1398(this.aRenderer_Sub1_10970.aClass163_2802.method1996(var39, (byte)2).aShort_3118 & '\uffff', 2034142900) & '\uffff'];
                           }

                           var39 = var9[var24];
                           if(var39 != -1 && !this.aRenderer_Sub1_10970.aClass163_2802.method1996(var39, (byte)2).aBoolean_3174) {
                              var35.anIntArray_3392[var24] = Class561.colourMap[CacheFileID.method1398(this.aRenderer_Sub1_10970.aClass163_2802.method1996(var39, (byte)2).aShort_3118 & '\uffff', -754414579) & '\uffff'];
                           }
                        }

                        var35.aShortArray_3395[var21] = -1;
                     }
                  }
               }

               this.vertices[x][y] = var35;
            }
         }

      }
   }

   void method7567(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean[][] var8, Class210 var9, Class202 var10, float[] var11, float[] var12) {
      int var13 = (var7 - var5) * var3 / 256;
      int var14 = var3 >> 8;
      boolean var15 = var9.aBoolean_3639;
      this.aRenderer_Sub1_10970.enableZBuffering(false);
      var10.aBoolean_3475 = false;
      var10.aBoolean_3476 = false;
      int var16 = var1;
      int var17 = var2 + var13;

      for(int var18 = var4; var18 < var6; ++var18) {
         for(int var19 = var5; var19 < var7; ++var19) {
            if(var8[var18 - var4][var19 - var5]) {
               int var21;
               if(this.aClass190ArrayArray_10960[var18][var19] != null) {
                  Class190 something = this.aClass190ArrayArray_10960[var18][var19];
                  if(something.aShort_3315 != -1 && (something.aByte_3312 & 2) == 0 && something.anInt_3318 == -1) {
                     var21 = this.aRenderer_Sub1_10970.method6739(something.aShort_3315 & '\uffff');
                     var10.method2561(true, true, false, (float)(var17 - var14), (float)(var17 - var14), (float)var17, (float)(var16 + var14), (float)var16, (float)(var16 + var14), 100.0F, 100.0F, 100.0F, (float)Class476.method5683(var21, something.aShort_3317 & '\uffff', -1023276981), (float)Class476.method5683(var21, something.aShort_3316 & '\uffff', -1562918417), (float)Class476.method5683(var21, something.aShort_3314 & '\uffff', -615747298));
                     var10.method2561(true, true, false, (float)var17, (float)var17, (float)(var17 - var14), (float)var16, (float)(var16 + var14), (float)var16, 100.0F, 100.0F, 100.0F, (float)Class476.method5683(var21, something.aShort_3313 & '\uffff', -404267762), (float)Class476.method5683(var21, something.aShort_3314 & '\uffff', -1000622055), (float)Class476.method5683(var21, something.aShort_3316 & '\uffff', -835451307));
                  } else if(something.anInt_3318 == -1) {
                     var10.method2561(true, true, false, (float)(var17 - var14), (float)(var17 - var14), (float)var17, (float)(var16 + var14), (float)var16, (float)(var16 + var14), 100.0F, 100.0F, 100.0F, (float)(something.aShort_3317 & '\uffff'), (float)(something.aShort_3316 & '\uffff'), (float)(something.aShort_3314 & '\uffff'));
                     var10.method2561(true, true, false, (float)var17, (float)var17, (float)(var17 - var14), (float)var16, (float)(var16 + var14), (float)var16, 100.0F, 100.0F, 100.0F, (float)(something.aShort_3313 & '\uffff'), (float)(something.aShort_3314 & '\uffff'), (float)(something.aShort_3316 & '\uffff'));
                  } else {
                     var21 = something.anInt_3318;
                     var10.method2561(true, true, false, (float)(var17 - var14), (float)(var17 - var14), (float)var17, (float)(var16 + var14), (float)var16, (float)(var16 + var14), 100.0F, 100.0F, 100.0F, (float)var21, (float)var21, (float)var21);
                     var10.method2561(true, true, false, (float)var17, (float)var17, (float)(var17 - var14), (float)var16, (float)(var16 + var14), (float)var16, 100.0F, 100.0F, 100.0F, (float)var21, (float)var21, (float)var21);
                  }
               } else if(this.aClass199ArrayArray_10959[var18][var19] != null) {
                  Class199 var20 = this.aClass199ArrayArray_10959[var18][var19];

                  for(var21 = 0; var21 < var20.aShort_3420; ++var21) {
                     var11[var21] = (float)(var16 + var20.aShortArray_3422[var21] * var14 / (this.anInt_3031 * 69671577));
                     var12[var21] = (float)(var17 - var20.aShortArray_3429[var21] * var14 / (this.anInt_3031 * 69671577));
                  }

                  for(var21 = 0; var21 < var20.aShort_3423; ++var21) {
                     short var22 = var20.aShortArray_3425[var21];
                     short var23 = var20.aShortArray_3427[var21];
                     short var24 = var20.aShortArray_3428[var21];
                     float var25 = var11[var22];
                     float var26 = var11[var23];
                     float var27 = var11[var24];
                     float var28 = var12[var22];
                     float var29 = var12[var23];
                     float var30 = var12[var24];
                     int var31;
                     if(var20.anIntArray_3426 != null && var20.anIntArray_3426[var21] != -1) {
                        var31 = var20.anIntArray_3426[var21];
                        var10.method2561(true, true, false, var28, var29, var30, var25, var26, var27, 100.0F, 100.0F, 100.0F, (float)Class476.method5683(var31, var20.aShortArray_3432[var22], -769414495), (float)Class476.method5683(var31, var20.aShortArray_3432[var23], -1459037585), (float)Class476.method5683(var31, var20.aShortArray_3432[var24], -1559984109));
                     } else if(var20.aShortArray_3424 != null && var20.aShortArray_3424[var21] != -1) {
                        var31 = this.aRenderer_Sub1_10970.method6739(var20.aShortArray_3424[var21] & '\uffff');
                        var10.method2561(true, true, false, var28, var29, var30, var25, var26, var27, 100.0F, 100.0F, 100.0F, (float)Class476.method5683(var31, var20.aShortArray_3432[var22], -1595548301), (float)Class476.method5683(var31, var20.aShortArray_3432[var23], -1455594022), (float)Class476.method5683(var31, var20.aShortArray_3432[var24], -1250627369));
                     } else {
                        var31 = var20.anIntArray_3431[var21];
                        var10.method2561(true, true, false, var28, var29, var30, var25, var26, var27, 100.0F, 100.0F, 100.0F, (float)Class476.method5683(var31, var20.aShortArray_3432[var22], -1367308356), (float)Class476.method5683(var31, var20.aShortArray_3432[var23], -408632619), (float)Class476.method5683(var31, var20.aShortArray_3432[var24], -612309947));
                     }
                  }
               }
            }

            var17 -= var14;
         }

         var17 = var2 + var13;
         var16 += var14;
      }

      var10.aBoolean_3475 = true;
      this.aRenderer_Sub1_10970.enableZBuffering(var15);
   }

   public void method2161(int var1, int var2, int var3, boolean[][] var4, boolean var5, int var6) {
      if(this.aRenderer_Sub1_10970.renderArray != null && this.aRenderer_Sub1_10970.aFloatArray_10159 != null) {
         ArrayViewport var7 = this.aRenderer_Sub1_10970.renderData;
         this.aFloat_10958 = var7.data[0];
         this.aFloat_10974 = var7.data[1];
         this.aFloat_10953 = var7.data[2];
         this.aFloat_10961 = var7.data[3];
         this.aFloat_10962 = var7.data[4];
         this.aFloat_10963 = var7.data[5];
         this.aFloat_10964 = var7.data[6];
         this.aFloat_10965 = var7.data[7];
         this.aFloat_10966 = var7.data[8];
         this.aFloat_10967 = var7.data[9];
         this.aFloat_10968 = var7.data[10];
         this.aFloat_10969 = var7.data[11];
         this.aFloat_10954 = var7.data[12];
         this.aFloat_10971 = var7.data[13];
         this.aFloat_10947 = var7.data[14];
         this.aFloat_10949 = var7.data[15];

         for(int var8 = 0; var8 < var3 + var3; ++var8) {
            for(int var9 = 0; var9 < var3 + var3; ++var9) {
               if(var4[var8][var9]) {
                  int var10 = var1 - var3 + var8;
                  int var11 = var2 - var3 + var9;
                  if(var10 >= 0 && var10 < this.maxWidth * 1658489349 && var11 >= 0 && var11 < this.maxHeight * 445373459) {
                     this.method7559(var10, var11, var6);
                  }
               }
            }
         }

      } else {
         throw new IllegalStateException("");
      }
   }

   static int method7569(int var0, int var1) {
      int var2 = (var0 & 16711680) * var1 >> 23;
      if(var2 < 2) {
         var2 = 2;
      } else if(var2 > 253) {
         var2 = 253;
      }

      int var3 = (var0 & '\uff00') * var1 >> 15;
      if(var3 < 2) {
         var3 = 2;
      } else if(var3 > 253) {
         var3 = 253;
      }

      int var4 = (var0 & 255) * var1 >> 7;
      if(var4 < 2) {
         var4 = 2;
      } else if(var4 > 253) {
         var4 = 253;
      }

      return var2 << 16 | var3 << 8 | var4;
   }

   public void method2153() {
      this.renderBuffer = (byte[][])null;
      this.aByteArrayArray_10975 = (byte[][])null;
   }

   public boolean method2159(Class240_Sub22_Sub7 var1, int var2, int var3, int var4, int var5, boolean var6) {
      return false;
   }

   public Class240_Sub22_Sub7 method2156(int var1, int var2, Class240_Sub22_Sub7 var3) {
      return null;
   }

   public void method2157(Class240_Sub22_Sub7 var1, int var2, int var3, int var4, int var5, boolean var6) {}
}
