import java.nio.ByteBuffer;
import sun.misc.Unsafe;

public class Class240_Sub39 extends NodeListNode {

   int anInt_7536 = 0;
   ByteBuffer aByteBuffer_7537;
   final Class240_Sub53 aClass240_Sub53_7538;
   int anInt_7539;
   float[][] aFloatArrayArray_7540;
   int anInt_7541;
   int anInt_7542;
   int anInt_7543 = 0;
   NodeArrayList aNodeArrayList_7544;
   int anInt_7545 = 0;
   float[][] aFloatArrayArray_7546;
   Class76 aClass76_7547;
   float[][] aFloatArrayArray_7548;
   int anInt_7549;
   final Class171_Sub3 aClass171_Sub3_7550;
   final Renderer_Sub3 aRenderer_Sub3_7551;
   Class414 aClass414_7552;


   void method4912(int var1, int var2, int var3, int var4, int var5, int var6) {
      long var7 = -1L;
      int var9 = var5 + (var3 << this.aClass171_Sub3_7550.shiftAmount * 1694172417);
      int var10 = var6 + (var4 << this.aClass171_Sub3_7550.shiftAmount * 1694172417);
      int var11 = this.aClass171_Sub3_7550.getHeight(var9, var10);
      if((var5 & 127) == 0 || (var6 & 127) == 0) {
         var7 = ((long)var10 & 65535L) << 16 | (long)var9 & 65535L;
         NodeListNode var12 = this.aNodeArrayList_7544.getNode(var7);
         if(var12 != null) {
            Unsafe var31 = this.aRenderer_Sub3_7551.anUnsafe_10510;
            var31.putShort(this.aRenderer_Sub3_7551.aLong_10629 + 2097152L + (long)(this.anInt_7545 * 2), ((Class240_Sub21)var12).aShort_7275);
            ++this.anInt_7545;
            return;
         }
      }

      short var30 = (short)this.anInt_7543;
      if(var7 != -1L) {
         this.aNodeArrayList_7544.insert(new Class240_Sub21(var30), var7);
      }

      float var13;
      float var14;
      float var15;
      float var17;
      float var16;
      float var19;
      float var18;
      float var21;
      float var20;
      float var23;
      float var22;
      if(var5 == 0 && var6 == 0) {
         var13 = this.aFloatArrayArray_7548[var1][var2];
         var14 = this.aFloatArrayArray_7546[var1][var2];
         var15 = this.aFloatArrayArray_7540[var1][var2];
      } else if(var5 == this.aClass171_Sub3_7550.anInt_3031 * 69671577 && var6 == 0) {
         var13 = this.aFloatArrayArray_7548[var1 + 1][var2];
         var14 = this.aFloatArrayArray_7546[var1 + 1][var2];
         var15 = this.aFloatArrayArray_7540[var1 + 1][var2];
      } else if(var5 == this.aClass171_Sub3_7550.anInt_3031 * 69671577 && var6 == this.aClass171_Sub3_7550.anInt_3031 * 69671577) {
         var13 = this.aFloatArrayArray_7548[var1 + 1][var2 + 1];
         var14 = this.aFloatArrayArray_7546[var1 + 1][var2 + 1];
         var15 = this.aFloatArrayArray_7540[var1 + 1][var2 + 1];
      } else if(var5 == 0 && var6 == this.aClass171_Sub3_7550.anInt_3031 * 69671577) {
         var13 = this.aFloatArrayArray_7548[var1][var2 + 1];
         var14 = this.aFloatArrayArray_7546[var1][var2 + 1];
         var15 = this.aFloatArrayArray_7540[var1][var2 + 1];
      } else {
         var16 = (float)var5 / (float)(this.aClass171_Sub3_7550.anInt_3031 * 69671577);
         var17 = (float)var6 / (float)(this.aClass171_Sub3_7550.anInt_3031 * 69671577);
         var18 = this.aFloatArrayArray_7548[var1][var2];
         var19 = this.aFloatArrayArray_7546[var1][var2];
         var20 = this.aFloatArrayArray_7540[var1][var2];
         var21 = this.aFloatArrayArray_7548[var1 + 1][var2];
         var22 = this.aFloatArrayArray_7546[var1 + 1][var2];
         var23 = this.aFloatArrayArray_7540[var1 + 1][var2];
         var18 += (this.aFloatArrayArray_7548[var1][var2 + 1] - var18) * var16;
         var19 += (this.aFloatArrayArray_7546[var1][var2 + 1] - var19) * var16;
         var20 += (this.aFloatArrayArray_7540[var1][var2 + 1] - var20) * var16;
         var21 += (this.aFloatArrayArray_7548[var1 + 1][var2 + 1] - var21) * var16;
         var22 += (this.aFloatArrayArray_7546[var1 + 1][var2 + 1] - var22) * var16;
         var23 += (this.aFloatArrayArray_7540[var1 + 1][var2 + 1] - var23) * var16;
         var13 = var18 + (var21 - var18) * var17;
         var14 = var19 + (var22 - var19) * var17;
         var15 = var20 + (var23 - var20) * var17;
      }

      var16 = (float)(this.aClass240_Sub53_7538.method5274((byte)32) - var9);
      var17 = (float)(this.aClass240_Sub53_7538.method5275((byte)64) - var11);
      var18 = (float)(this.aClass240_Sub53_7538.method5276((byte)33) - var10);
      var19 = (float)Math.sqrt((double)(var16 * var16 + var17 * var17 + var18 * var18));
      var20 = 1.0F / var19;
      var16 *= var20;
      var17 *= var20;
      var18 *= var20;
      var21 = var19 / (float)this.aClass240_Sub53_7538.method5277(-1932051005);
      var22 = 1.0F - var21 * var21;
      if(var22 < 0.0F) {
         var22 = 0.0F;
      }

      var23 = var16 * var13 + var17 * var14 + var18 * var15;
      if(var23 < 0.0F) {
         var23 = 0.0F;
      }

      float var24 = var23 * var22 * 2.0F;
      if(var24 > 1.0F) {
         var24 = 1.0F;
      }

      int var25 = this.aClass240_Sub53_7538.method5278((byte)-118);
      int var26 = (int)(var24 * (float)(var25 >> 16 & 255));
      if(var26 > 255) {
         var26 = 255;
      }

      int var27 = (int)(var24 * (float)(var25 >> 8 & 255));
      if(var27 > 255) {
         var27 = 255;
      }

      int var28 = (int)(var24 * (float)(var25 & 255));
      if(var28 > 255) {
         var28 = 255;
      }

      Unsafe var29 = this.aRenderer_Sub3_7551.anUnsafe_10510;
      var29.putFloat(this.aRenderer_Sub3_7551.aLong_10629 + (long)(this.anInt_7543 * 16), (float)var9);
      var29.putFloat(this.aRenderer_Sub3_7551.aLong_10629 + (long)(this.anInt_7543 * 16) + 4L, (float)var11);
      var29.putFloat(this.aRenderer_Sub3_7551.aLong_10629 + (long)(this.anInt_7543 * 16) + 8L, (float)var10);
      if(this.aRenderer_Sub3_7551.anInt_10640 == 0) {
         var29.putByte(this.aRenderer_Sub3_7551.aLong_10629 + (long)(this.anInt_7543 * 16) + 12L, (byte)var28);
         var29.putByte(this.aRenderer_Sub3_7551.aLong_10629 + (long)(this.anInt_7543 * 16) + 13L, (byte)var27);
         var29.putByte(this.aRenderer_Sub3_7551.aLong_10629 + (long)(this.anInt_7543 * 16) + 14L, (byte)var26);
      } else {
         var29.putByte(this.aRenderer_Sub3_7551.aLong_10629 + (long)(this.anInt_7543 * 16) + 12L, (byte)var26);
         var29.putByte(this.aRenderer_Sub3_7551.aLong_10629 + (long)(this.anInt_7543 * 16) + 13L, (byte)var27);
         var29.putByte(this.aRenderer_Sub3_7551.aLong_10629 + (long)(this.anInt_7543 * 16) + 14L, (byte)var28);
      }

      var29.putByte(this.aRenderer_Sub3_7551.aLong_10629 + (long)(this.anInt_7543 * 16) + 15L, (byte)-1);
      ++this.anInt_7543;
      var29.putShort(this.aRenderer_Sub3_7551.aLong_10629 + 2097152L + (long)(this.anInt_7545 * 2), var30);
      ++this.anInt_7545;
   }

   void method4913() {
      this.aClass414_7552 = this.aRenderer_Sub3_7551.method7249(false);
      this.aClass414_7552.method5136(this.anInt_7545);
      this.aClass76_7547 = this.aRenderer_Sub3_7551.method7320(false);
      this.aClass76_7547.method981(this.anInt_7543 * 16, 16);
      this.aClass76_7547.method4853(0, this.anInt_7543 * 16, this.aRenderer_Sub3_7551.aLong_10629);
      this.aClass414_7552.method4853(0, this.anInt_7545 * 2, this.aRenderer_Sub3_7551.aLong_10629 + 2097152L);
   }

   Class240_Sub39(Renderer_Sub3 var1, Class171_Sub3 var2, Class240_Sub53 var3, int[] var4) {
      this.aRenderer_Sub3_7551 = var1;
      this.aClass240_Sub53_7538 = var3;
      this.aClass171_Sub3_7550 = var2;
      int var5 = this.aClass240_Sub53_7538.method5277(-1932051005) - (var2.anInt_3031 * 69671577 >> 1);
      this.anInt_7539 = this.aClass240_Sub53_7538.method5274((byte)90) - var5 >> var2.shiftAmount * 1694172417;
      this.anInt_7549 = this.aClass240_Sub53_7538.method5274((byte)82) + var5 >> var2.shiftAmount * 1694172417;
      this.anInt_7541 = this.aClass240_Sub53_7538.method5276((byte)70) - var5 >> var2.shiftAmount * 1694172417;
      this.anInt_7542 = this.aClass240_Sub53_7538.method5276((byte)107) + var5 >> var2.shiftAmount * 1694172417;
      int var6 = this.anInt_7549 - this.anInt_7539 + 1;
      int var7 = this.anInt_7542 - this.anInt_7541 + 1;
      this.aFloatArrayArray_7548 = new float[var6 + 1][var7 + 1];
      this.aFloatArrayArray_7546 = new float[var6 + 1][var7 + 1];
      this.aFloatArrayArray_7540 = new float[var6 + 1][var7 + 1];

      int var8;
      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      for(var8 = 0; var8 <= var7; ++var8) {
         var9 = var8 + this.anInt_7541;
         if(var9 > 0 && var9 < this.aClass171_Sub3_7550.maxHeight * 445373459 - 1) {
            for(var10 = 0; var10 <= var6; ++var10) {
               var11 = var10 + this.anInt_7539;
               if(var11 > 0 && var11 < this.aClass171_Sub3_7550.maxWidth * 1658489349 - 1) {
                  var12 = var2.method2155(var11 + 1, var9, (short)22516) - var2.method2155(var11 - 1, var9, (short)-19789);
                  var13 = var2.method2155(var11, var9 + 1, (short)17122) - var2.method2155(var11, var9 - 1, (short)14042);
                  float var14 = (float)(1.0D / Math.sqrt((double)(var12 * var12 + 65536 + var13 * var13)));
                  this.aFloatArrayArray_7548[var10][var8] = (float)var12 * var14;
                  this.aFloatArrayArray_7546[var10][var8] = -256.0F * var14;
                  this.aFloatArrayArray_7540[var10][var8] = (float)var13 * var14;
               }
            }
         }
      }

      var8 = 0;

      for(var9 = this.anInt_7541; var9 <= this.anInt_7542; ++var9) {
         if(var9 >= 0 && var9 < var2.maxHeight * 445373459) {
            for(var10 = this.anInt_7539; var10 <= this.anInt_7549; ++var10) {
               if(var10 >= 0 && var10 < var2.maxWidth * 1658489349) {
                  var11 = var4[var8];
                  int[] var18 = var2.anIntArrayArrayArray_11090[var10][var9];
                  if(var18 != null && var11 != 0) {
                     if(var11 == 1) {
                        for(var13 = 0; var13 < var18.length; var13 += 3) {
                           if(var18[var13] != -1 && var18[var13 + 1] != -1 && var18[var13 + 2] != -1) {
                              this.anInt_7536 += 3;
                           }
                        }
                     } else {
                        this.anInt_7536 += 3;
                     }
                  }
               }

               ++var8;
            }
         } else {
            var8 += this.anInt_7549 - this.anInt_7539;
         }
      }

      if(this.anInt_7536 > 0) {
         this.aNodeArrayList_7544 = new NodeArrayList(Class105.method1359(this.anInt_7536, (byte)127));
         this.aByteBuffer_7537 = this.aRenderer_Sub3_7551.aByteBuffer_10646;
         this.aByteBuffer_7537.clear();
         this.aByteBuffer_7537.position(2097152);
         this.aByteBuffer_7537.slice();
         this.aByteBuffer_7537.position(0);
         this.aByteBuffer_7537.limit(2097152);
         var9 = 0;
         var8 = 0;

         for(var10 = this.anInt_7541; var10 <= this.anInt_7542; ++var10) {
            if(var10 >= 0 && var10 < var2.maxHeight * 445373459) {
               var11 = 0;

               for(var12 = this.anInt_7539; var12 <= this.anInt_7549; ++var12) {
                  if(var12 >= 0 && var12 < var2.maxWidth * 1658489349) {
                     var13 = var4[var8];
                     int[] var19 = var2.anIntArrayArrayArray_11090[var12][var10];
                     if(var19 != null && var13 != 0) {
                        if(var13 == 1) {
                           int[] var15 = var2.anIntArrayArrayArray_11093[var12][var10];
                           int[] var16 = var2.anIntArrayArrayArray_11116[var12][var10];
                           int var17 = 0;

                           while(var17 < var19.length) {
                              if(var19[var17] != -1 && var19[var17 + 1] != -1 && var19[var17 + 2] != -1) {
                                 this.method4912(var11, var9, var12, var10, var15[var17], var16[var17]);
                                 ++var17;
                                 this.method4912(var11, var9, var12, var10, var15[var17], var16[var17]);
                                 ++var17;
                                 this.method4912(var11, var9, var12, var10, var15[var17], var16[var17]);
                                 ++var17;
                              } else {
                                 var17 += 3;
                              }
                           }
                        } else if(var13 == 3) {
                           this.method4912(var11, var9, var12, var10, 0, 0);
                           this.method4912(var11, var9, var12, var10, var2.anInt_3031 * 69671577, 0);
                           this.method4912(var11, var9, var12, var10, 0, var2.anInt_3031 * 69671577);
                        } else if(var13 == 2) {
                           this.method4912(var11, var9, var12, var10, var2.anInt_3031 * 69671577, 0);
                           this.method4912(var11, var9, var12, var10, var2.anInt_3031 * 69671577, var2.anInt_3031 * 69671577);
                           this.method4912(var11, var9, var12, var10, 0, 0);
                        } else if(var13 == 5) {
                           this.method4912(var11, var9, var12, var10, var2.anInt_3031 * 69671577, var2.anInt_3031 * 69671577);
                           this.method4912(var11, var9, var12, var10, 0, var2.anInt_3031 * 69671577);
                           this.method4912(var11, var9, var12, var10, var2.anInt_3031 * 69671577, 0);
                        } else if(var13 == 4) {
                           this.method4912(var11, var9, var12, var10, 0, var2.anInt_3031 * 69671577);
                           this.method4912(var11, var9, var12, var10, 0, 0);
                           this.method4912(var11, var9, var12, var10, var2.anInt_3031 * 69671577, var2.anInt_3031 * 69671577);
                        }
                     }
                  }

                  ++var8;
                  ++var11;
               }
            } else {
               var8 += this.anInt_7549 - this.anInt_7539;
            }

            ++var9;
         }

         this.method4913();
      } else {
         this.aClass76_7547 = null;
         this.aClass414_7552 = null;
      }

      this.aNodeArrayList_7544 = null;
      this.aFloatArrayArray_7540 = (float[][])null;
      this.aFloatArrayArray_7546 = (float[][])null;
      this.aFloatArrayArray_7548 = (float[][])null;
   }

   void method4914(Class27 var1, int var2, int var3, int var4, boolean[][] var5, boolean var6) {
      if(this.aClass414_7552 != null) {
         if(this.anInt_7539 <= var2 + var4) {
            if(this.anInt_7549 >= var2 - var4) {
               if(this.anInt_7541 <= var3 + var4) {
                  if(this.anInt_7542 >= var3 - var4) {
                     int var7;
                     if(var6) {
                        for(var7 = this.anInt_7539; var7 <= this.anInt_7549; ++var7) {
                           if(var7 - var2 >= -var4 && var7 - var2 <= var4) {
                              for(int var8 = this.anInt_7541; var8 <= this.anInt_7542; ++var8) {
                                 if(var8 - var3 >= -var4 && var8 - var3 <= var4 && var5[var7 - var2 + var4][var8 - var3 + var4]) {
                                    this.method4915(var1, this.aClass414_7552, this.anInt_7545 / 3);
                                    return;
                                 }
                              }
                           }
                        }
                     } else {
                        var7 = 0;
                        ByteBuffer var14 = this.aRenderer_Sub3_7551.aByteBuffer_10646;
                        var14.clear();

                        int var9;
                        for(var9 = this.anInt_7541; var9 <= this.anInt_7542; ++var9) {
                           if(var9 - var3 >= -var4 && var9 - var3 <= var4) {
                              int var10 = var9 * this.aClass171_Sub3_7550.maxWidth * 1658489349 + this.anInt_7539;

                              for(int var11 = this.anInt_7539; var11 <= this.anInt_7549; ++var11) {
                                 if(var11 - var2 >= -var4 && var11 - var2 <= var4 && var5[var11 - var2 + var4][var9 - var3 + var4]) {
                                    short[] var12 = this.aClass171_Sub3_7550.aShortArrayArray_11086[var10];
                                    if(var12 != null) {
                                       for(int var13 = 0; var13 < var12.length; ++var13) {
                                          var14.putShort(var12[var13]);
                                          ++var7;
                                       }
                                    }
                                 }

                                 ++var10;
                              }
                           }
                        }

                        if(var14.position() == 0 || var7 == 0) {
                           return;
                        }

                        var9 = var14.position();
                        Class414 var15 = this.aRenderer_Sub3_7551.method7286(var9 / 2);
                        var15.method4853(0, var9, this.aRenderer_Sub3_7551.aLong_10629);
                        this.method4915(var1, var15, var7 / 3);
                     }

                  }
               }
            }
         }
      }
   }

   void method4915(Class27 var1, Class414 var2, int var3) {
      var1.anInt_768 = 0;
      var1.anInt_782 = this.anInt_7543;
      var1.anInt_779 = 0;
      var1.anInt_784 = this.anInt_7545 / 3;
      var1.aClass384_762 = this.aRenderer_Sub3_7551.aClass384_10563;
      float var4 = this.aClass240_Sub53_7538.method5279(-2098549125);
      var1.aClass347_776.setPos(var4, var4, var4);
      this.aRenderer_Sub3_7551.method7251(0, this.aClass76_7547);
      this.aRenderer_Sub3_7551.method7190(this.aRenderer_Sub3_7551.aClass379_10639);
      this.aRenderer_Sub3_7551.method7307(this.aClass414_7552);
      var1.method193(0);
   }
}
