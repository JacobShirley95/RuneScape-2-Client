import java.nio.ByteBuffer;

public class Class64 {

   final byte[] aByteArray_1238;
   final Class171_Sub3 aClass171_Sub3_1239;
   final int anInt_1240;
   final int anInt_1241;
   final Renderer_Sub3 aRenderer_Sub3_1242;
   final int anInt_1243;
   final int anInt_1244;
   final int anInt_1245;
   Class385[][] aClass385ArrayArray_1246;


   void method645() {
      this.aClass385ArrayArray_1246 = new Class385[this.anInt_1243][this.anInt_1244];

      for(int var1 = 0; var1 < this.anInt_1244; ++var1) {
         for(int var2 = 0; var2 < this.anInt_1243; ++var2) {
            this.aClass385ArrayArray_1246[var2][var1] = new Class385(this.aRenderer_Sub3_1242, this, this.aClass171_Sub3_1239, var2, var1, this.anInt_1245, var2 * 128 + 1, var1 * 128 + 1);
            if(this.aClass385ArrayArray_1246[var2][var1].anInt_7445 == 0) {
               this.aClass385ArrayArray_1246[var2][var1] = null;
            }
         }
      }

   }

   void method646(Class240_Sub22_Sub7 var1, int var2, int var3) {
      Class240_Sub22_Sub7_Sub2 var4 = (Class240_Sub22_Sub7_Sub2)var1;
      var2 += var4.anInt_3230 + 1;
      var3 += var4.anInt_3228 + 1;
      int var5 = var2 + var3 * this.anInt_1240;
      int var6 = 0;
      int var7 = var4.anInt_3229;
      int var8 = var4.anInt_3231;
      int var9 = this.anInt_1240 - var8;
      int var10 = 0;
      int var11;
      if(var3 <= 0) {
         var11 = 1 - var3;
         var7 -= var11;
         var6 += var11 * var8;
         var5 += var11 * this.anInt_1240;
         var3 = 1;
      }

      if(var3 + var7 >= this.anInt_1241) {
         var11 = var3 + var7 + 1 - this.anInt_1241;
         var7 -= var11;
      }

      if(var2 <= 0) {
         var11 = 1 - var2;
         var8 -= var11;
         var6 += var11;
         var5 += var11;
         var10 += var11;
         var9 += var11;
         var2 = 1;
      }

      if(var2 + var8 >= this.anInt_1240) {
         var11 = var2 + var8 + 1 - this.anInt_1240;
         var8 -= var11;
         var10 += var11;
         var9 += var11;
      }

      if(var8 > 0 && var7 > 0) {
         method650(this.aByteArray_1238, var4.aByteArray_3232, var6, var5, var8, var7, var9, var10);
         this.method649(var2, var3, var8, var7);
      }
   }

   void method647(Class240_Sub22_Sub7 var1, int var2, int var3) {
      Class240_Sub22_Sub7_Sub2 var4 = (Class240_Sub22_Sub7_Sub2)var1;
      var2 += var4.anInt_3230 + 1;
      var3 += var4.anInt_3228 + 1;
      int var5 = var2 + var3 * this.anInt_1240;
      int var6 = 0;
      int var7 = var4.anInt_3229;
      int var8 = var4.anInt_3231;
      int var9 = this.anInt_1240 - var8;
      int var10 = 0;
      int var11;
      if(var3 <= 0) {
         var11 = 1 - var3;
         var7 -= var11;
         var6 += var11 * var8;
         var5 += var11 * this.anInt_1240;
         var3 = 1;
      }

      if(var3 + var7 >= this.anInt_1241) {
         var11 = var3 + var7 + 1 - this.anInt_1241;
         var7 -= var11;
      }

      if(var2 <= 0) {
         var11 = 1 - var2;
         var8 -= var11;
         var6 += var11;
         var5 += var11;
         var10 += var11;
         var9 += var11;
         var2 = 1;
      }

      if(var2 + var8 >= this.anInt_1240) {
         var11 = var2 + var8 + 1 - this.anInt_1240;
         var8 -= var11;
         var10 += var11;
         var9 += var11;
      }

      if(var8 > 0 && var7 > 0) {
         method652(this.aByteArray_1238, var4.aByteArray_3232, var6, var5, var8, var7, var9, var10);
         this.method649(var2, var3, var8, var7);
      }
   }

   boolean method648(Class240_Sub22_Sub7 var1, int var2, int var3) {
      Class240_Sub22_Sub7_Sub2 var4 = (Class240_Sub22_Sub7_Sub2)var1;
      var2 += var4.anInt_3230 + 1;
      var3 += var4.anInt_3228 + 1;
      int var5 = var2 + var3 * this.anInt_1240;
      int var6 = var4.anInt_3229;
      int var7 = var4.anInt_3231;
      int var8 = this.anInt_1240 - var7;
      int var9;
      if(var3 <= 0) {
         var9 = 1 - var3;
         var6 -= var9;
         var5 += var9 * this.anInt_1240;
         var3 = 1;
      }

      if(var3 + var6 >= this.anInt_1241) {
         var9 = var3 + var6 + 1 - this.anInt_1241;
         var6 -= var9;
      }

      if(var2 <= 0) {
         var9 = 1 - var2;
         var7 -= var9;
         var5 += var9;
         var8 += var9;
         var2 = 1;
      }

      if(var2 + var7 >= this.anInt_1240) {
         var9 = var2 + var7 + 1 - this.anInt_1240;
         var7 -= var9;
         var8 += var9;
      }

      if(var7 > 0 && var6 > 0) {
         byte var10 = 8;
         var8 += (var10 - 1) * this.anInt_1240;
         return method653(this.aByteArray_1238, var5, var7, var6, var8, var10);
      } else {
         return false;
      }
   }

   void method649(int var1, int var2, int var3, int var4) {
      if(this.aClass385ArrayArray_1246 != null) {
         int var5 = var1 - 1 >> 7;
         int var6 = var1 - 1 + var3 - 1 >> 7;
         int var7 = var2 - 1 >> 7;
         int var8 = var2 - 1 + var4 - 1 >> 7;

         for(int var9 = var5; var9 <= var6; ++var9) {
            Class385[] var10 = this.aClass385ArrayArray_1246[var9];

            for(int var11 = var7; var11 <= var8; ++var11) {
               if(var10[var11] != null) {
                  var10[var11].aBoolean_7453 = true;
               }
            }
         }

      }
   }

   static final void method650(byte[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = -(var4 >> 2);
      var4 = -(var4 & 3);

      for(int var9 = -var5; var9 < 0; ++var9) {
         int var10;
         int var10001;
         for(var10 = var8; var10 < 0; ++var10) {
            var10001 = var3++;
            var0[var10001] += var1[var2++];
            var10001 = var3++;
            var0[var10001] += var1[var2++];
            var10001 = var3++;
            var0[var10001] += var1[var2++];
            var10001 = var3++;
            var0[var10001] += var1[var2++];
         }

         for(var10 = var4; var10 < 0; ++var10) {
            var10001 = var3++;
            var0[var10001] += var1[var2++];
         }

         var3 += var6;
         var2 += var7;
      }

   }

   Class64(Renderer_Sub3 var1, Class171_Sub3 var2) {
      this.aRenderer_Sub3_1242 = var1;
      this.aClass171_Sub3_1239 = var2;
      this.anInt_1240 = 2 + (this.aClass171_Sub3_1239.maxWidth * 1658489349 * this.aClass171_Sub3_1239.anInt_3031 * 69671577 >> this.aRenderer_Sub3_1242.anInt_10589);
      this.anInt_1241 = 2 + (this.aClass171_Sub3_1239.maxHeight * 445373459 * this.aClass171_Sub3_1239.anInt_3031 * 69671577 >> this.aRenderer_Sub3_1242.anInt_10589);
      this.aByteArray_1238 = new byte[this.anInt_1240 * this.anInt_1241];
      this.anInt_1245 = 7 + this.aRenderer_Sub3_1242.anInt_10589 - this.aClass171_Sub3_1239.shiftAmount * 1694172417;
      this.anInt_1243 = this.aClass171_Sub3_1239.maxWidth * 1658489349 >> this.anInt_1245;
      this.anInt_1244 = this.aClass171_Sub3_1239.maxHeight * 445373459 >> this.anInt_1245;
   }

   void method651(Class27 var1, int var2, int var3, int var4, boolean[][] var5, boolean var6) {
      this.aRenderer_Sub3_1242.enableZBuffering(false);
      float var7 = 1.0F / (float)(this.aRenderer_Sub3_1242.anInt_10588 * 128);
      int var10;
      int var11;
      int var12;
      int var13;
      int var14;
      int var15;
      if(var6) {
         for(int var8 = 0; var8 < this.anInt_1244; ++var8) {
            int var9 = var8 << this.anInt_1245;
            var10 = var8 + 1 << this.anInt_1245;

            label131:
            for(var11 = 0; var11 < this.anInt_1243; ++var11) {
               if(this.aClass385ArrayArray_1246[var11][var8] != null) {
                  var12 = var11 << this.anInt_1245;
                  var13 = var11 + 1 << this.anInt_1245;

                  for(var14 = var12; var14 < var13; ++var14) {
                     if(var14 - var2 >= -var4 && var14 - var2 <= var4) {
                        for(var15 = var9; var15 < var10; ++var15) {
                           if(var15 - var3 >= -var4 && var15 - var3 <= var4 && var5[var14 - var2 + var4][var15 - var3 + var4]) {
                              var1.anArrayViewport_773.method4557(var7, var7, 1.0F, 1.0F);
                              var1.anArrayViewport_773.data[12] = (float)(-var11);
                              var1.anArrayViewport_773.data[13] = (float)(-var8);
                              this.aClass385ArrayArray_1246[var11][var8].method4879(var1);
                              continue label131;
                           }
                        }
                     }
                  }
               }
            }
         }
      } else {
         int[] var24 = new int[this.anInt_1244 * this.anInt_1243];
         ByteBuffer var25 = this.aRenderer_Sub3_1242.aByteBuffer_10646;
         var25.clear();
         var10 = 0;

         for(var11 = 0; var11 < this.anInt_1244; ++var11) {
            var12 = var11 << this.anInt_1245;
            var13 = var11 + 1 << this.anInt_1245;

            for(var14 = 0; var14 < this.anInt_1243; ++var14) {
               Class385 var27 = this.aClass385ArrayArray_1246[var14][var11];
               int var16 = 0;
               if(var27 != null) {
                  int var17 = var14 << this.anInt_1245;
                  int var18 = var14 + 1 << this.anInt_1245;

                  for(int var19 = var12; var19 < var13; ++var19) {
                     if(var19 - var3 >= -var4 && var19 - var3 <= var4) {
                        int var20 = var19 * this.aClass171_Sub3_1239.maxWidth * 1658489349 + var17;

                        for(int var21 = var17; var21 < var18; ++var21) {
                           if(var21 - var2 >= -var4 && var21 - var2 <= var4 && var5[var21 - var2 + var4][var19 - var3 + var4]) {
                              short[] var22 = this.aClass171_Sub3_1239.aShortArrayArray_11086[var20];
                              if(var22 != null) {
                                 for(int var23 = 0; var23 < var22.length; ++var23) {
                                    var25.putShort(var22[var23]);
                                    ++var16;
                                 }
                              }
                           }

                           ++var20;
                        }
                     }
                  }
               }

               var24[var10] = var16;
               ++var10;
            }
         }

         if(var25.position() != 0) {
            var11 = var25.position();
            Class414 var26 = this.aRenderer_Sub3_1242.method7286(var11 / 2);
            var26.method4853(0, var11, this.aRenderer_Sub3_1242.aLong_10629);
            var13 = 0;
            var10 = 0;

            for(var14 = 0; var14 < this.anInt_1244; ++var14) {
               for(var15 = 0; var15 < this.anInt_1243; ++var15) {
                  if(var24[var10] != 0) {
                     var1.anArrayViewport_773.method4557(var7, var7, 1.0F, 1.0F);
                     var1.anArrayViewport_773.data[12] = (float)(-var15);
                     var1.anArrayViewport_773.data[13] = (float)(-var14);
                     this.aClass385ArrayArray_1246[var15][var14].method4878(var1, var26, var13, var24[var10] / 3);
                     var13 += var24[var10];
                  }

                  ++var10;
               }
            }
         }
      }

      this.aRenderer_Sub3_1242.enableZBuffering(true);
   }

   static final void method652(byte[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = -(var4 >> 2);
      var4 = -(var4 & 3);

      for(int var9 = -var5; var9 < 0; ++var9) {
         int var10;
         int var10001;
         for(var10 = var8; var10 < 0; ++var10) {
            var10001 = var3++;
            var0[var10001] -= var1[var2++];
            var10001 = var3++;
            var0[var10001] -= var1[var2++];
            var10001 = var3++;
            var0[var10001] -= var1[var2++];
            var10001 = var3++;
            var0[var10001] -= var1[var2++];
         }

         for(var10 = var4; var10 < 0; ++var10) {
            var10001 = var3++;
            var0[var10001] -= var1[var2++];
         }

         var3 += var6;
         var2 += var7;
      }

   }

   static final boolean method653(byte[] var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = var2 % var5;
      int var7;
      if(var6 != 0) {
         var7 = var5 - var6;
      } else {
         var7 = 0;
      }

      int var8 = -((var3 + var5 - 1) / var5);
      int var9 = -((var2 + var5 - 1) / var5);

      for(int var10 = var8; var10 < 0; ++var10) {
         for(int var11 = var9; var11 < 0; ++var11) {
            if(var0[var1] == 0) {
               return true;
            }

            var1 += var5;
         }

         var1 -= var7;
         if(var0[var1 - 1] == 0) {
            return true;
         }

         var1 += var4;
      }

      return false;
   }
}
