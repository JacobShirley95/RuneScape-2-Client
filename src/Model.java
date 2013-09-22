
public abstract class Model {

   protected boolean aBoolean_3022 = false;
   static final float aFloat_3023 = 3.1415927F;


   void method2010(int var1, int var2, int var3, int var4, int var5, int var6, float[] var7, int var8, float var9, float[] var10) {
      var1 -= var4;
      var2 -= var5;
      var3 -= var6;
      float var11 = (float)var1 * var7[0] + (float)var2 * var7[1] + (float)var3 * var7[2];
      float var12 = (float)var1 * var7[3] + (float)var2 * var7[4] + (float)var3 * var7[5];
      float var13 = (float)var1 * var7[6] + (float)var2 * var7[7] + (float)var3 * var7[8];
      float var14 = (float)Math.sqrt((double)(var11 * var11 + var12 * var12 + var13 * var13));
      float var15 = (float)Math.atan2((double)var11, (double)var13) / 6.2831855F + 0.5F;
      float var16 = (float)Math.asin((double)(var12 / var14)) / 3.1415927F + 0.5F + var9;
      float var17;
      if(var8 == 1) {
         var17 = var15;
         var15 = -var16;
         var16 = var17;
      } else if(var8 == 2) {
         var15 = -var15;
         var16 = -var16;
      } else if(var8 == 3) {
         var17 = var15;
         var15 = var16;
         var16 = -var17;
      }

      var10[0] = var15;
      var10[1] = var16;
   }

   void method2011(int var1, int var2, int var3, int var4, int var5, int var6, int var7, float[] var8, int var9, float var10, float var11, float var12, float[] var13) {
      var1 -= var4;
      var2 -= var5;
      var3 -= var6;
      float var14 = (float)var1 * var8[0] + (float)var2 * var8[1] + (float)var3 * var8[2];
      float var15 = (float)var1 * var8[3] + (float)var2 * var8[4] + (float)var3 * var8[5];
      float var16 = (float)var1 * var8[6] + (float)var2 * var8[7] + (float)var3 * var8[8];
      float var17;
      float var18;
      if(var7 == 0) {
         var17 = var14 + var10 + 0.5F;
         var18 = -var16 + var12 + 0.5F;
      } else if(var7 == 1) {
         var17 = var14 + var10 + 0.5F;
         var18 = var16 + var12 + 0.5F;
      } else if(var7 == 2) {
         var17 = -var14 + var10 + 0.5F;
         var18 = -var15 + var11 + 0.5F;
      } else if(var7 == 3) {
         var17 = var14 + var10 + 0.5F;
         var18 = -var15 + var11 + 0.5F;
      } else if(var7 == 4) {
         var17 = var16 + var12 + 0.5F;
         var18 = -var15 + var11 + 0.5F;
      } else {
         var17 = -var16 + var12 + 0.5F;
         var18 = -var15 + var11 + 0.5F;
      }

      float var19;
      if(var9 == 1) {
         var19 = var17;
         var17 = -var18;
         var18 = var19;
      } else if(var9 == 2) {
         var17 = -var17;
         var18 = -var18;
      } else if(var9 == 3) {
         var19 = var17;
         var17 = var18;
         var18 = -var19;
      }

      var13[0] = var17;
      var13[1] = var18;
   }

   public abstract void method2012(int var1, int var2, int var3);

   float[] method2013(int var1, int var2, int var3, int var4, float var5, float var6, float var7) {
      float[] var8 = new float[9];
      float[] var9 = new float[9];
      float var10 = (float)Math.cos((double)((float)var4 * 0.024543693F));
      float var11 = (float)Math.sin((double)((float)var4 * 0.024543693F));
      float var12 = 1.0F - var10;
      var8[0] = var10;
      var8[1] = 0.0F;
      var8[2] = var11;
      var8[3] = 0.0F;
      var8[4] = 1.0F;
      var8[5] = 0.0F;
      var8[6] = -var11;
      var8[7] = 0.0F;
      var8[8] = var10;
      float[] var13 = new float[9];
      float var14 = 1.0F;
      float var15 = 0.0F;
      var10 = (float)var2 / 32767.0F;
      var11 = -((float)Math.sqrt((double)(1.0F - var10 * var10)));
      var12 = 1.0F - var10;
      float var16 = (float)Math.sqrt((double)(var1 * var1 + var3 * var3));
      if(var16 == 0.0F && var10 == 0.0F) {
         var9 = var8;
      } else {
         if(var16 != 0.0F) {
            var14 = (float)(-var3) / var16;
            var15 = (float)var1 / var16;
         }

         var13[0] = var10 + var14 * var14 * var12;
         var13[1] = var15 * var11;
         var13[2] = var15 * var14 * var12;
         var13[3] = -var15 * var11;
         var13[4] = var10;
         var13[5] = var14 * var11;
         var13[6] = var14 * var15 * var12;
         var13[7] = -var14 * var11;
         var13[8] = var10 + var15 * var15 * var12;
         var9[0] = var8[0] * var13[0] + var8[1] * var13[3] + var8[2] * var13[6];
         var9[1] = var8[0] * var13[1] + var8[1] * var13[4] + var8[2] * var13[7];
         var9[2] = var8[0] * var13[2] + var8[1] * var13[5] + var8[2] * var13[8];
         var9[3] = var8[3] * var13[0] + var8[4] * var13[3] + var8[5] * var13[6];
         var9[4] = var8[3] * var13[1] + var8[4] * var13[4] + var8[5] * var13[7];
         var9[5] = var8[3] * var13[2] + var8[4] * var13[5] + var8[5] * var13[8];
         var9[6] = var8[6] * var13[0] + var8[7] * var13[3] + var8[8] * var13[6];
         var9[7] = var8[6] * var13[1] + var8[7] * var13[4] + var8[8] * var13[7];
         var9[8] = var8[6] * var13[2] + var8[7] * var13[5] + var8[8] * var13[8];
      }

      var9[0] *= var5;
      var9[1] *= var5;
      var9[2] *= var5;
      var9[3] *= var6;
      var9[4] *= var6;
      var9[5] *= var6;
      var9[6] *= var7;
      var9[7] *= var7;
      var9[8] *= var7;
      return var9;
   }

   public abstract Model copy(byte var1, int var2, boolean var3);

   public abstract int method2015();

   public abstract void method2016();

   public abstract void method2017(int var1);

   public final void method2018(Class240_Sub22_Sub9 var1, int var2, Class240_Sub22_Sub9 var3, int var4, int var5, int var6, Class240_Sub22_Sub9 var7, int var8, Class240_Sub22_Sub9 var9, int var10, int var11, int var12, boolean[] var13, boolean var14) {
      if(var2 != -1) {
         if(var13 != null && var8 != -1) {
            this.method2064();
            if(!this.method2031()) {
               this.method2025();
            } else {
               Class98 var15 = var1.aClass98Array_3526[var2];
               Class240_Sub26 var16 = var15.aClass240_Sub26_1934;
               Class98 var17 = null;
               if(var3 != null) {
                  var17 = var3.aClass98Array_3526[var4];
                  if(var17.aClass240_Sub26_1934 != var16) {
                     var17 = null;
                  }
               }

               this.method2057(var16, var15, var17, var5, var6, 0, var13, false, var14, '\uffff', (int[])null);
               Class98 var18 = var7.aClass98Array_3526[var8];
               Class98 var19 = null;
               if(var9 != null) {
                  var19 = var9.aClass98Array_3526[var10];
                  if(var19.aClass240_Sub26_1934 != var16) {
                     var19 = null;
                  }
               }

               this.method2032(0, new int[0], 0, 0, 0, 0, var14);
               this.method2057(var18.aClass240_Sub26_1934, var18, var19, var11, var12, 0, var13, true, var14, '\uffff', (int[])null);
               this.method2024();
               this.method2025();
            }
         } else {
            this.method2026(var1, var2, var3, var4, var5, var6, 0, var14);
         }
      }
   }

   public abstract void rotateY(int var1);

   public abstract void offset(int var1, int var2, int var3);

   public abstract void method2021();

   public abstract int method2022();

   public abstract void method2023(int var1, int var2, Plane var3, Plane var4, int var5, int var6, int var7);

   abstract void method2024();

   abstract void method2025();

   public final void method2026(Class240_Sub22_Sub9 var1, int var2, Class240_Sub22_Sub9 var3, int var4, int var5, int var6, int var7, boolean var8) {
      if(var2 != -1) {
         this.method2064();
         if(!this.method2031()) {
            this.method2025();
         } else {
            Class98 var9 = var1.aClass98Array_3526[var2];
            Class240_Sub26 var10 = var9.aClass240_Sub26_1934;
            Class98 var11 = null;
            if(var3 != null) {
               var11 = var3.aClass98Array_3526[var4];
               if(var11.aClass240_Sub26_1934 != var10) {
                  var11 = null;
               }
            }

            this.method2057(var10, var9, var11, var5, var6, var7, (boolean[])null, false, var8, '\uffff', (int[])null);
            this.method2024();
            this.method2025();
         }
      }
   }

   public final void method2027(Class240_Sub22_Sub9 var1, int var2, Class240_Sub22_Sub9 var3, int var4, int var5, int var6, int var7, int var8, boolean var9, int[] var10) {
      if(var2 != -1) {
         this.method2064();
         if(!this.method2031()) {
            this.method2025();
         } else {
            Class98 var11 = var1.aClass98Array_3526[var2];
            Class240_Sub26 var12 = var11.aClass240_Sub26_1934;
            Class98 var13 = null;
            if(var3 != null) {
               var13 = var3.aClass98Array_3526[var4];
               if(var13.aClass240_Sub26_1934 != var12) {
                  var13 = null;
               }
            }

            this.method2057(var12, var11, var13, var5, var6, var7, (boolean[])null, false, var9, var8, var10);
            this.method2024();
            this.method2025();
         }
      }
   }

   public abstract void method2028(int var1);

   public final void method2029(Class240_Sub22_Sub9 var1, int var2) {
      if(var2 != -1) {
         this.method2064();
         if(!this.method2031()) {
            this.method2025();
         } else {
            Class98 var3 = var1.aClass98Array_3526[var2];
            Class240_Sub26 var4 = var3.aClass240_Sub26_1934;

            for(int var5 = 0; var5 < var3.anInt_1935; ++var5) {
               short var6 = var3.aShortArray_1936[var5];
               if(var4.aBooleanArray_7343[var6]) {
                  if(var3.aShortArray_1942[var5] != -1) {
                     this.method2034(0, 0, 0, 0);
                  }

                  this.method2034(var4.anIntArray_7347[var6], var3.aShortArray_1937[var5], var3.aShortArray_1947[var5], var3.aShortArray_1939[var5]);
               }
            }

            this.method2024();
            this.method2025();
         }
      }
   }

   public abstract void method2030(short var1, short var2);

   abstract boolean method2031();

   abstract void method2032(int var1, int[] var2, int var3, int var4, int var5, int var6, boolean var7);

   abstract void method2033(int var1, int[] var2, int var3, int var4, int var5, boolean var6, int var7, int[] var8);

   abstract void method2034(int var1, int var2, int var3, int var4);

   public abstract void method2035(short var1, short var2);

   public abstract void applyViewport(Viewport var1, int var2, boolean var3);

   public abstract int method2037();

   public abstract int method2038();

   public abstract int method2039();

   public abstract Class172[] method2040();

   public abstract int method2041();

   public abstract void method2042(int var1);

   public abstract int method2043();

   public abstract void method2044(int var1);

   int method2045(float var1, float var2, float var3) {
      float var4 = var1 < 0.0F?-var1:var1;
      float var5 = var2 < 0.0F?-var2:var2;
      float var6 = var3 < 0.0F?-var3:var3;
      return var5 > var4 && var5 > var6?(var2 > 0.0F?0:1):(var6 > var4 && var6 > var5?(var3 > 0.0F?2:3):(var1 > 0.0F?4:5));
   }

   public abstract int method2046();

   public abstract int method2047();

   public abstract byte[] method2048();

   public abstract void method2049(int var1, int var2, int var3, int var4);

   public abstract boolean method2050(int var1, int var2, Viewport var3, boolean var4, int var5);

   public abstract boolean method2051();

   public abstract void method2052(Viewport var1);

   public abstract void method2053(Model var1, int var2, int var3, int var4, boolean var5);

   public abstract Class240_Sub22_Sub7 method2054(Class240_Sub22_Sub7 var1);

   public abstract void method2055(int var1);

   public abstract int method2056();

   void method2057(Class240_Sub26 var1, Class98 var2, Class98 var3, int var4, int var5, int var6, boolean[] var7, boolean var8, boolean var9, int var10, int[] var11) {
      int var12;
      if(var3 != null && var4 != 0) {
         var12 = 0;
         int var35 = 0;

         for(int var36 = 0; var36 < var1.anInt_7346 * -23885375; ++var36) {
            boolean var15 = false;
            if(var12 < var2.anInt_1935 && var2.aShortArray_1936[var12] == var36) {
               var15 = true;
            }

            boolean var16 = false;
            if(var35 < var3.anInt_1935 && var3.aShortArray_1936[var35] == var36) {
               var16 = true;
            }

            if(var15 || var16) {
               if(var7 != null && var7[var36] != var8 && var1.anIntArray_7347[var36] != 0) {
                  if(var15) {
                     ++var12;
                  }

                  if(var16) {
                     ++var35;
                  }
               } else {
                  short var17 = 0;
                  int var18 = var1.anIntArray_7347[var36];
                  if(var18 == 3 || var18 == 10) {
                     var17 = 128;
                  }

                  short var19;
                  short var21;
                  short var20;
                  byte var23;
                  short var22;
                  if(var15) {
                     var19 = var2.aShortArray_1937[var12];
                     var20 = var2.aShortArray_1947[var12];
                     var21 = var2.aShortArray_1939[var12];
                     var22 = var2.aShortArray_1942[var12];
                     var23 = var2.aByteArray_1943[var12];
                     ++var12;
                  } else {
                     var19 = var17;
                     var20 = var17;
                     var21 = var17;
                     var22 = -1;
                     var23 = 0;
                  }

                  short var25;
                  short var24;
                  short var27;
                  short var26;
                  byte var28;
                  if(var16) {
                     var24 = var3.aShortArray_1937[var35];
                     var25 = var3.aShortArray_1947[var35];
                     var26 = var3.aShortArray_1939[var35];
                     var27 = var3.aShortArray_1942[var35];
                     var28 = var3.aByteArray_1943[var35];
                     ++var35;
                  } else {
                     var24 = var17;
                     var25 = var17;
                     var26 = var17;
                     var27 = -1;
                     var28 = 0;
                  }

                  int var29;
                  int var31;
                  int var30;
                  if((var23 & 2) == 0 && (var28 & 1) == 0) {
                     int var32;
                     if(var18 == 2) {
                        var32 = var24 - var19 & 16383;
                        int var33 = var25 - var20 & 16383;
                        int var34 = var26 - var21 & 16383;
                        if(var32 >= 8192) {
                           var32 -= 16384;
                        }

                        if(var33 >= 8192) {
                           var33 -= 16384;
                        }

                        if(var34 >= 8192) {
                           var34 -= 16384;
                        }

                        var29 = var19 + var32 * var4 / var5 & 16383;
                        var30 = var20 + var33 * var4 / var5 & 16383;
                        var31 = var21 + var34 * var4 / var5 & 16383;
                     } else if(var18 == 9) {
                        var32 = var24 - var19 & 16383;
                        if(var32 >= 8192) {
                           var32 -= 16384;
                        }

                        var29 = var19 + var32 * var4 / var5 & 16383;
                        var31 = 0;
                        var30 = 0;
                     } else if(var18 == 7) {
                        var32 = var24 - var19 & 63;
                        if(var32 >= 32) {
                           var32 -= 64;
                        }

                        var29 = var19 + var32 * var4 / var5 & 63;
                        var30 = var20 + (var25 - var20) * var4 / var5;
                        var31 = var21 + (var26 - var21) * var4 / var5;
                     } else {
                        var29 = var19 + (var24 - var19) * var4 / var5;
                        var30 = var20 + (var25 - var20) * var4 / var5;
                        var31 = var21 + (var26 - var21) * var4 / var5;
                     }
                  } else {
                     var29 = var19;
                     var30 = var20;
                     var31 = var21;
                  }

                  if(var22 != -1) {
                     this.method2068(0, var1.anIntArrayArray_7338[var22], 0, 0, 0, var6, var9, var10 & var1.anIntArray_7350[var22], var11);
                  } else if(var27 != -1) {
                     this.method2068(0, var1.anIntArrayArray_7338[var27], 0, 0, 0, var6, var9, var10 & var1.anIntArray_7350[var27], var11);
                  }

                  this.method2068(var18, var1.anIntArrayArray_7338[var36], var29, var30, var31, var6, var9, var10 & var1.anIntArray_7350[var36], var11);
               }
            }
         }

      } else {
         for(var12 = 0; var12 < var2.anInt_1935; ++var12) {
            short var13 = var2.aShortArray_1936[var12];
            if(var7 == null || var7[var13] == var8 || var1.anIntArray_7347[var13] == 0) {
               short var14 = var2.aShortArray_1942[var12];
               if(var14 != -1) {
                  this.method2068(0, var1.anIntArrayArray_7338[var14], 0, 0, 0, var6, var9, var10 & var1.anIntArray_7350[var14], var11);
               }

               this.method2068(var1.anIntArray_7347[var13], var1.anIntArrayArray_7338[var13], var2.aShortArray_1937[var12], var2.aShortArray_1947[var12], var2.aShortArray_1939[var12], var6, var9, var10 & var1.anIntArray_7350[var13], var11);
            }
         }

      }
   }

   public abstract boolean method2058();

   public abstract Class86[] method2059();

   public abstract void method2060(byte var1, byte[] var2);

   void method2061(Plane var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      boolean var9 = false;
      boolean var10 = false;
      boolean var11 = false;
      int var12 = -var5 / 2;
      int var13 = -var6 / 2;
      int var14 = var1.getHeight(var2 + var12, var4 + var13);
      int var15 = var5 / 2;
      int var16 = -var6 / 2;
      int var17 = var1.getHeight(var2 + var15, var4 + var16);
      int var18 = -var5 / 2;
      int var19 = var6 / 2;
      int var20 = var1.getHeight(var2 + var18, var4 + var19);
      int var21 = var5 / 2;
      int var22 = var6 / 2;
      int var23 = var1.getHeight(var2 + var21, var4 + var22);
      int var24 = var14 < var17?var14:var17;
      int var25 = var20 < var23?var20:var23;
      int var26 = var17 < var23?var17:var23;
      int var27 = var14 < var20?var14:var20;
      int var28;
      if(var6 != 0) {
         int var29 = (int)(Math.atan2((double)(var24 - var25), (double)var6) * 2607.5945876176133D) & 16383;
         if(var29 != 0) {
            if(var7 != 0) {
               if(var29 > 8192) {
                  var28 = 16384 - var7;
                  if(var29 < var28) {
                     var29 = var28;
                  }
               } else if(var29 > var7) {
                  var29 = var7;
               }
            }

            this.rotateY(var29);
         }
      }

      if(var5 != 0) {
         int var31 = (int)(Math.atan2((double)(var27 - var26), (double)var5) * 2607.5945876176133D) & 16383;
         if(var31 != 0) {
            if(var8 != 0) {
               if(var31 > 8192) {
                  var28 = 16384 - var8;
                  if(var31 < var28) {
                     var31 = var28;
                  }
               } else if(var31 > var8) {
                  var31 = var8;
               }
            }

            this.rotateX(var31);
         }
      }

      int var30 = var14 + var23;
      if(var17 + var20 < var30) {
         var30 = var17 + var20;
      }

      var30 = (var30 >> 1) - var3;
      if(var30 != 0) {
         this.offset(0, var30, 0);
      }

   }

   void method2062(int var1, int var2, int var3, int var4, int var5, int var6, float[] var7, float var8, int var9, float var10, float[] var11) {
      var1 -= var4;
      var2 -= var5;
      var3 -= var6;
      float var12 = (float)var1 * var7[0] + (float)var2 * var7[1] + (float)var3 * var7[2];
      float var13 = (float)var1 * var7[3] + (float)var2 * var7[4] + (float)var3 * var7[5];
      float var14 = (float)var1 * var7[6] + (float)var2 * var7[7] + (float)var3 * var7[8];
      float var15 = (float)Math.atan2((double)var12, (double)var14) / 6.2831855F + 0.5F;
      if(var8 != 1.0F) {
         var15 *= var8;
      }

      float var16 = var13 + 0.5F + var10;
      float var17;
      if(var9 == 1) {
         var17 = var15;
         var15 = -var16;
         var16 = var17;
      } else if(var9 == 2) {
         var15 = -var15;
         var16 = -var16;
      } else if(var9 == 3) {
         var17 = var15;
         var15 = var16;
         var16 = -var17;
      }

      var11[0] = var15;
      var11[1] = var16;
   }

   Class93 method2063(ModelData var1, int[] var2, int var3) {
      int[] var4 = null;
      int[] var5 = null;
      int[] var6 = null;
      float[][] var7 = (float[][])null;
      if(var1.aShortArray_1863 != null) {
         int var8 = var1.anInt_1847;
         int[] var9 = new int[var8];
         int[] var10 = new int[var8];
         int[] var11 = new int[var8];
         int[] var12 = new int[var8];
         int[] var13 = new int[var8];
         int[] var14 = new int[var8];

         int var15;
         for(var15 = 0; var15 < var8; ++var15) {
            var9[var15] = Integer.MAX_VALUE;
            var10[var15] = -2147483647;
            var11[var15] = Integer.MAX_VALUE;
            var12[var15] = -2147483647;
            var13[var15] = Integer.MAX_VALUE;
            var14[var15] = -2147483647;
         }

         int var20;
         for(var15 = 0; var15 < var3; ++var15) {
            int var16 = var2[var15];
            if(var1.aShortArray_1863[var16] != -1) {
               short var17 = var1.aShortArray_1863[var16];

               for(int var18 = 0; var18 < 3; ++var18) {
                  short var19;
                  if(var18 == 0) {
                     var19 = var1.aShortArray_1857[var16];
                  } else if(var18 == 1) {
                     var19 = var1.aShortArray_1845[var16];
                  } else {
                     var19 = var1.aShortArray_1869[var16];
                  }

                  var20 = var1.anIntArray_1858[var19];
                  int var21 = var1.anIntArray_1880[var19];
                  int var22 = var1.anIntArray_1853[var19];
                  if(var20 < var9[var17]) {
                     var9[var17] = var20;
                  }

                  if(var20 > var10[var17]) {
                     var10[var17] = var20;
                  }

                  if(var21 < var11[var17]) {
                     var11[var17] = var21;
                  }

                  if(var21 > var12[var17]) {
                     var12[var17] = var21;
                  }

                  if(var22 < var13[var17]) {
                     var13[var17] = var22;
                  }

                  if(var22 > var14[var17]) {
                     var14[var17] = var22;
                  }
               }
            }
         }

         var4 = new int[var8];
         var5 = new int[var8];
         var6 = new int[var8];
         var7 = new float[var8][];

         for(var15 = 0; var15 < var8; ++var15) {
            byte var23 = var1.aByteArray_1870[var15];
            if(var23 > 0) {
               var4[var15] = (var9[var15] + var10[var15]) / 2;
               var5[var15] = (var11[var15] + var12[var15]) / 2;
               var6[var15] = (var13[var15] + var14[var15]) / 2;
               float var25;
               float var24;
               float var26;
               if(var23 == 1) {
                  var20 = var1.anIntArray_1874[var15];
                  if(var20 == 0) {
                     var24 = 1.0F;
                     var26 = 1.0F;
                  } else if(var20 > 0) {
                     var24 = 1.0F;
                     var26 = (float)var20 / 1024.0F;
                  } else {
                     var26 = 1.0F;
                     var24 = (float)(-var20) / 1024.0F;
                  }

                  var25 = 64.0F / (float)var1.anIntArray_1875[var15];
               } else if(var23 == 2) {
                  var24 = 64.0F / (float)var1.anIntArray_1874[var15];
                  var25 = 64.0F / (float)var1.anIntArray_1875[var15];
                  var26 = 64.0F / (float)var1.anIntArray_1865[var15];
               } else {
                  var24 = (float)var1.anIntArray_1874[var15] / 1024.0F;
                  var25 = (float)var1.anIntArray_1875[var15] / 1024.0F;
                  var26 = (float)var1.anIntArray_1865[var15] / 1024.0F;
               }

               var7[var15] = this.method2013(var1.aShortArray_1871[var15], var1.aShortArray_1872[var15], var1.aShortArray_1852[var15], var1.aByteArray_1851[var15] & 255, var24, var25, var26);
            }
         }
      }

      return new Class93(this, var4, var5, var6, var7);
   }

   abstract void method2064();

   public abstract int method2065();

   public abstract boolean method2066();

   public abstract void rotateX(int var1);

   void method2068(int var1, int[] var2, int var3, int var4, int var5, int var6, boolean var7, int var8, int[] var9) {
      int var10;
      if(var6 == 1) {
         if(var1 != 0 && var1 != 1) {
            if(var1 == 3) {
               var10 = var3;
               var3 = var5;
               var5 = var10;
            } else if(var1 == 2) {
               var10 = var3;
               var3 = -var5 & 16383;
               var5 = var10 & 16383;
            }
         } else {
            var10 = -var3;
            var3 = var5;
            var5 = var10;
         }
      } else if(var6 == 2) {
         if(var1 != 0 && var1 != 1) {
            if(var1 == 2) {
               var3 = -var3 & 16383;
               var5 = -var5 & 16383;
            }
         } else {
            var3 = -var3;
            var5 = -var5;
         }
      } else if(var6 == 3) {
         if(var1 != 0 && var1 != 1) {
            if(var1 == 3) {
               var10 = var3;
               var3 = var5;
               var5 = var10;
            } else if(var1 == 2) {
               var10 = var3;
               var3 = var5 & 16383;
               var5 = -var10 & 16383;
            }
         } else {
            var10 = var3;
            var3 = -var5;
            var5 = var10;
         }
      }

      if(var8 != '\uffff') {
         this.method2033(var1, var2, var3, var4, var5, var7, var8, var9);
      } else {
         this.method2032(var1, var2, var3, var4, var5, var6, var7);
      }

   }

   public abstract void method2069(Viewport var1, Class92 var2, int var3);
}
