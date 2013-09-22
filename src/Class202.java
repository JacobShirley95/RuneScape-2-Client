
public class Class202 {

   int[] anIntArray_3474 = null;
   boolean aBoolean_3475 = true;
   boolean aBoolean_3476 = false;
   int anInt_3477 = -1;
   float aFloat_3478 = 0.0F;
   boolean aBoolean_3479 = false;
   int anInt_3480;
   boolean aBoolean_3481 = false;
   int anInt_3482 = 0;
   float aFloat_3483;
   float aFloat_3484;
   float aFloat_3485 = 0.0F;
   int[] anIntArray_3486;
   int anInt_3487;
   int anInt_3488 = -1;
   float aFloat_3489 = 1.0F;
   float aFloat_3490;
   int anInt_3491;
   int[] anIntArray_3492 = new int[4096];
   float[] aFloatArray_3493;
   int anInt_3494;
   float aFloat_3495;
   float aFloat_3496 = 0.0F;
   int anInt_3497 = 0;
   int anInt_3498 = 0;
   SoftwareRenderer aRenderer_Sub1_3499;
   Class620 aClass620_3500;
   boolean aBoolean_3501 = true;
   int anInt_3502 = -1;
   int[] anIntArray_3503 = null;
   int anInt_3504 = 0;
   int anInt_3505 = 0;
   float aFloat_3506 = 0.0F;
   Class210 aClass210_3507;
   int[] anIntArray_3508 = null;
   int anInt_3509 = 0;
   int anInt_3510 = 0;
   boolean aBoolean_3511 = false;


   int method2559() {
      return this.anIntArray_3492[0] % this.anInt_3491;
   }

   final void method2560(boolean var1) {
      this.aBoolean_3511 = var1;
   }

   final void method2561(boolean var1, boolean var2, boolean var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11, float var12, float var13, float var14, float var15) {
      if(!var1) {
         this.method2562(false, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, 0);
      } else if(this.aBoolean_3511) {
         this.aRenderer_Sub1_3499.method1919((int)var7, (int)var4, (int)var8, (int)var5, Class561.colourMap[(int)var13 & '\uffff'], -503847881);
         this.aRenderer_Sub1_3499.method1919((int)var8, (int)var5, (int)var9, (int)var6, Class561.colourMap[(int)var13 & '\uffff'], 390352085);
         this.aRenderer_Sub1_3499.method1919((int)var9, (int)var6, (int)var7, (int)var4, Class561.colourMap[(int)var13 & '\uffff'], 1769612277);
      } else {
         float var16 = var8 - var7;
         float var17 = var5 - var4;
         float var18 = var9 - var7;
         float var19 = var6 - var4;
         float var20 = var14 - var13;
         float var21 = var15 - var13;
         float var22 = var11 - var10;
         float var23 = var12 - var10;
         float var24;
         if(var6 != var5) {
            var24 = (var9 - var8) / (var6 - var5);
         } else {
            var24 = 0.0F;
         }

         float var25;
         if(var5 != var4) {
            var25 = var16 / var17;
         } else {
            var25 = 0.0F;
         }

         float var26;
         if(var6 != var4) {
            var26 = var18 / var19;
         } else {
            var26 = 0.0F;
         }

         float var27 = var16 * var19 - var18 * var17;
         if(var27 != 0.0F) {
            float var28 = (var20 * var19 - var21 * var17) / var27;
            float var29 = (var21 * var16 - var20 * var18) / var27;
            float var30 = (var22 * var19 - var23 * var17) / var27;
            float var31 = (var23 * var16 - var22 * var18) / var27;
            if(var4 <= var5 && var4 <= var6) {
               if(var4 < (float)this.anInt_3480) {
                  if(var5 > (float)this.anInt_3480) {
                     var5 = (float)this.anInt_3480;
                  }

                  if(var6 > (float)this.anInt_3480) {
                     var6 = (float)this.anInt_3480;
                  }

                  var13 = var13 - var28 * var7 + var28;
                  var10 = var10 - var30 * var7 + var30;
                  if(var5 < var6) {
                     var9 = var7;
                     if(var4 < 0.0F) {
                        var9 = var7 - var26 * var4;
                        var7 -= var25 * var4;
                        var13 -= var29 * var4;
                        var10 -= var31 * var4;
                        var4 = 0.0F;
                     }

                     if(var5 < 0.0F) {
                        var8 -= var24 * var5;
                        var5 = 0.0F;
                     }

                     if((var4 == var5 || var26 >= var25) && (var4 != var5 || var26 <= var24)) {
                        var4 = (float)((int)(var4 + 0.5F));
                        var5 = (float)((int)(var5 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F)) - var5;
                        var5 -= var4;

                        for(var4 = (float)this.anIntArray_3492[(int)var4]; --var5 >= 0.0F; var4 += (float)this.anInt_3491) {
                           this.method2569(var2, var3, this.anIntArray_3486, (int)var4, 0, 0, (int)var7, (int)var9, var13, var28, var10, var30);
                           var9 += var26;
                           var7 += var25;
                           var13 += var29;
                           var10 += var31;
                        }

                        while(--var6 >= 0.0F) {
                           this.method2569(var2, var3, this.anIntArray_3486, (int)var4, 0, 0, (int)var8, (int)var9, var13, var28, var10, var30);
                           var9 += var26;
                           var8 += var24;
                           var13 += var29;
                           var10 += var31;
                           var4 += (float)this.anInt_3491;
                        }

                     } else {
                        var4 = (float)((int)(var4 + 0.5F));
                        var5 = (float)((int)(var5 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F)) - var5;
                        var5 -= var4;

                        for(var4 = (float)this.anIntArray_3492[(int)var4]; --var5 >= 0.0F; var4 += (float)this.anInt_3491) {
                           this.method2569(var2, var3, this.anIntArray_3486, (int)var4, 0, 0, (int)var9, (int)var7, var13, var28, var10, var30);
                           var9 += var26;
                           var7 += var25;
                           var13 += var29;
                           var10 += var31;
                        }

                        while(--var6 >= 0.0F) {
                           this.method2569(var2, var3, this.anIntArray_3486, (int)var4, 0, 0, (int)var9, (int)var8, var13, var28, var10, var30);
                           var9 += var26;
                           var8 += var24;
                           var13 += var29;
                           var10 += var31;
                           var4 += (float)this.anInt_3491;
                        }

                     }
                  } else {
                     var8 = var7;
                     if(var4 < 0.0F) {
                        var8 = var7 - var26 * var4;
                        var7 -= var25 * var4;
                        var13 -= var29 * var4;
                        var10 -= var31 * var4;
                        var4 = 0.0F;
                     }

                     if(var6 < 0.0F) {
                        var9 -= var24 * var6;
                        var6 = 0.0F;
                     }

                     if((var4 == var6 || var26 >= var25) && (var4 != var6 || var24 <= var25)) {
                        var4 = (float)((int)(var4 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F));
                        var5 = (float)((int)(var5 + 0.5F)) - var6;
                        var6 -= var4;

                        for(var4 = (float)this.anIntArray_3492[(int)var4]; --var6 >= 0.0F; var4 += (float)this.anInt_3491) {
                           this.method2569(var2, var3, this.anIntArray_3486, (int)var4, 0, 0, (int)var7, (int)var8, var13, var28, var10, var30);
                           var8 += var26;
                           var7 += var25;
                           var13 += var29;
                           var10 += var31;
                        }

                        while(--var5 >= 0.0F) {
                           this.method2569(var2, var3, this.anIntArray_3486, (int)var4, 0, 0, (int)var7, (int)var9, var13, var28, var10, var30);
                           var9 += var24;
                           var7 += var25;
                           var13 += var29;
                           var10 += var31;
                           var4 += (float)this.anInt_3491;
                        }

                     } else {
                        var4 = (float)((int)(var4 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F));
                        var5 = (float)((int)(var5 + 0.5F)) - var6;
                        var6 -= var4;

                        for(var4 = (float)this.anIntArray_3492[(int)var4]; --var6 >= 0.0F; var4 += (float)this.anInt_3491) {
                           this.method2569(var2, var3, this.anIntArray_3486, (int)var4, 0, 0, (int)var8, (int)var7, var13, var28, var10, var30);
                           var8 += var26;
                           var7 += var25;
                           var13 += var29;
                           var10 += var31;
                        }

                        while(--var5 >= 0.0F) {
                           this.method2569(var2, var3, this.anIntArray_3486, (int)var4, 0, 0, (int)var9, (int)var7, var13, var28, var10, var30);
                           var9 += var24;
                           var7 += var25;
                           var13 += var29;
                           var10 += var31;
                           var4 += (float)this.anInt_3491;
                        }

                     }
                  }
               }
            } else if(var5 <= var6) {
               if(var5 < (float)this.anInt_3480) {
                  if(var6 > (float)this.anInt_3480) {
                     var6 = (float)this.anInt_3480;
                  }

                  if(var4 > (float)this.anInt_3480) {
                     var4 = (float)this.anInt_3480;
                  }

                  var14 = var14 - var28 * var8 + var28;
                  var11 = var11 - var30 * var8 + var30;
                  if(var6 < var4) {
                     var7 = var8;
                     if(var5 < 0.0F) {
                        var7 = var8 - var25 * var5;
                        var8 -= var24 * var5;
                        var14 -= var29 * var5;
                        var11 -= var31 * var5;
                        var5 = 0.0F;
                     }

                     if(var6 < 0.0F) {
                        var9 -= var26 * var6;
                        var6 = 0.0F;
                     }

                     if((var5 == var6 || var25 >= var24) && (var5 != var6 || var25 <= var26)) {
                        var5 = (float)((int)(var5 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F));
                        var4 = (float)((int)(var4 + 0.5F)) - var6;
                        var6 -= var5;

                        for(var5 = (float)this.anIntArray_3492[(int)var5]; --var6 >= 0.0F; var5 += (float)this.anInt_3491) {
                           this.method2569(var2, var3, this.anIntArray_3486, (int)var5, 0, 0, (int)var8, (int)var7, var14, var28, var11, var30);
                           var7 += var25;
                           var8 += var24;
                           var14 += var29;
                           var11 += var31;
                        }

                        while(--var4 >= 0.0F) {
                           this.method2569(var2, var3, this.anIntArray_3486, (int)var5, 0, 0, (int)var9, (int)var7, var14, var28, var11, var30);
                           var7 += var25;
                           var9 += var26;
                           var14 += var29;
                           var11 += var31;
                           var5 += (float)this.anInt_3491;
                        }

                     } else {
                        var5 = (float)((int)(var5 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F));
                        var4 = (float)((int)(var4 + 0.5F)) - var6;
                        var6 -= var5;

                        for(var5 = (float)this.anIntArray_3492[(int)var5]; --var6 >= 0.0F; var5 += (float)this.anInt_3491) {
                           this.method2569(var2, var3, this.anIntArray_3486, (int)var5, 0, 0, (int)var7, (int)var8, var14, var28, var11, var30);
                           var7 += var25;
                           var8 += var24;
                           var14 += var29;
                           var11 += var31;
                        }

                        while(--var4 >= 0.0F) {
                           this.method2569(var2, var3, this.anIntArray_3486, (int)var5, 0, 0, (int)var7, (int)var9, var14, var28, var11, var30);
                           var7 += var25;
                           var9 += var26;
                           var14 += var29;
                           var11 += var31;
                           var5 += (float)this.anInt_3491;
                        }

                     }
                  } else {
                     var9 = var8;
                     if(var5 < 0.0F) {
                        var9 = var8 - var25 * var5;
                        var8 -= var24 * var5;
                        var14 -= var29 * var5;
                        var11 -= var31 * var5;
                        var5 = 0.0F;
                     }

                     if(var4 < 0.0F) {
                        var7 -= var26 * var4;
                        var4 = 0.0F;
                     }

                     if(var25 < var24) {
                        var5 = (float)((int)(var5 + 0.5F));
                        var4 = (float)((int)(var4 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F)) - var4;
                        var4 -= var5;

                        for(var5 = (float)this.anIntArray_3492[(int)var5]; --var4 >= 0.0F; var5 += (float)this.anInt_3491) {
                           this.method2569(var2, var3, this.anIntArray_3486, (int)var5, 0, 0, (int)var9, (int)var8, var14, var28, var11, var30);
                           var9 += var25;
                           var8 += var24;
                           var14 += var29;
                           var11 += var31;
                        }

                        while(--var6 >= 0.0F) {
                           this.method2569(var2, var3, this.anIntArray_3486, (int)var5, 0, 0, (int)var7, (int)var8, var14, var28, var11, var30);
                           var7 += var26;
                           var8 += var24;
                           var14 += var29;
                           var11 += var31;
                           var5 += (float)this.anInt_3491;
                        }

                     } else {
                        var5 = (float)((int)(var5 + 0.5F));
                        var4 = (float)((int)(var4 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F)) - var4;
                        var4 -= var5;

                        for(var5 = (float)this.anIntArray_3492[(int)var5]; --var4 >= 0.0F; var5 += (float)this.anInt_3491) {
                           this.method2569(var2, var3, this.anIntArray_3486, (int)var5, 0, 0, (int)var8, (int)var9, var14, var28, var11, var30);
                           var9 += var25;
                           var8 += var24;
                           var14 += var29;
                           var11 += var31;
                        }

                        while(--var6 >= 0.0F) {
                           this.method2569(var2, var3, this.anIntArray_3486, (int)var5, 0, 0, (int)var8, (int)var7, var14, var28, var11, var30);
                           var7 += var26;
                           var8 += var24;
                           var14 += var29;
                           var11 += var31;
                           var5 += (float)this.anInt_3491;
                        }

                     }
                  }
               }
            } else if(var6 < (float)this.anInt_3480) {
               if(var4 > (float)this.anInt_3480) {
                  var4 = (float)this.anInt_3480;
               }

               if(var5 > (float)this.anInt_3480) {
                  var5 = (float)this.anInt_3480;
               }

               var15 = var15 - var28 * var9 + var28;
               var12 = var12 - var30 * var9 + var30;
               if(var4 < var5) {
                  var8 = var9;
                  if(var6 < 0.0F) {
                     var8 = var9 - var24 * var6;
                     var9 -= var26 * var6;
                     var15 -= var29 * var6;
                     var12 -= var31 * var6;
                     var6 = 0.0F;
                  }

                  if(var4 < 0.0F) {
                     var7 -= var25 * var4;
                     var4 = 0.0F;
                  }

                  if(var24 < var26) {
                     var6 = (float)((int)(var6 + 0.5F));
                     var4 = (float)((int)(var4 + 0.5F));
                     var5 = (float)((int)(var5 + 0.5F)) - var4;
                     var4 -= var6;

                     for(var6 = (float)this.anIntArray_3492[(int)var6]; --var4 >= 0.0F; var6 += (float)this.anInt_3491) {
                        this.method2569(var2, var3, this.anIntArray_3486, (int)var6, 0, 0, (int)var8, (int)var9, var15, var28, var12, var30);
                        var8 += var24;
                        var9 += var26;
                        var15 += var29;
                        var12 += var31;
                     }

                     while(--var5 >= 0.0F) {
                        this.method2569(var2, var3, this.anIntArray_3486, (int)var6, 0, 0, (int)var8, (int)var7, var15, var28, var12, var30);
                        var8 += var24;
                        var7 += var25;
                        var15 += var29;
                        var12 += var31;
                        var6 += (float)this.anInt_3491;
                     }

                  } else {
                     var6 = (float)((int)(var6 + 0.5F));
                     var4 = (float)((int)(var4 + 0.5F));
                     var5 = (float)((int)(var5 + 0.5F)) - var4;
                     var4 -= var6;

                     for(var6 = (float)this.anIntArray_3492[(int)var6]; --var4 >= 0.0F; var6 += (float)this.anInt_3491) {
                        this.method2569(var2, var3, this.anIntArray_3486, (int)var6, 0, 0, (int)var9, (int)var8, var15, var28, var12, var30);
                        var8 += var24;
                        var9 += var26;
                        var15 += var29;
                        var12 += var31;
                     }

                     while(--var5 >= 0.0F) {
                        this.method2569(var2, var3, this.anIntArray_3486, (int)var6, 0, 0, (int)var7, (int)var8, var15, var28, var12, var30);
                        var8 += var24;
                        var7 += var25;
                        var15 += var29;
                        var12 += var31;
                        var6 += (float)this.anInt_3491;
                     }

                  }
               } else {
                  var7 = var9;
                  if(var6 < 0.0F) {
                     var7 = var9 - var24 * var6;
                     var9 -= var26 * var6;
                     var15 -= var29 * var6;
                     var12 -= var31 * var6;
                     var6 = 0.0F;
                  }

                  if(var5 < 0.0F) {
                     var8 -= var25 * var5;
                     var5 = 0.0F;
                  }

                  if(var24 < var26) {
                     var6 = (float)((int)(var6 + 0.5F));
                     var5 = (float)((int)(var5 + 0.5F));
                     var4 = (float)((int)(var4 + 0.5F)) - var5;
                     var5 -= var6;

                     for(var6 = (float)this.anIntArray_3492[(int)var6]; --var5 >= 0.0F; var6 += (float)this.anInt_3491) {
                        this.method2569(var2, var3, this.anIntArray_3486, (int)var6, 0, 0, (int)var7, (int)var9, var15, var28, var12, var30);
                        var7 += var24;
                        var9 += var26;
                        var15 += var29;
                        var12 += var31;
                     }

                     while(--var4 >= 0.0F) {
                        this.method2569(var2, var3, this.anIntArray_3486, (int)var6, 0, 0, (int)var8, (int)var9, var15, var28, var12, var30);
                        var8 += var25;
                        var9 += var26;
                        var15 += var29;
                        var12 += var31;
                        var6 += (float)this.anInt_3491;
                     }

                  } else {
                     var6 = (float)((int)(var6 + 0.5F));
                     var5 = (float)((int)(var5 + 0.5F));
                     var4 = (float)((int)(var4 + 0.5F)) - var5;
                     var5 -= var6;

                     for(var6 = (float)this.anIntArray_3492[(int)var6]; --var5 >= 0.0F; var6 += (float)this.anInt_3491) {
                        this.method2569(var2, var3, this.anIntArray_3486, (int)var6, 0, 0, (int)var9, (int)var7, var15, var28, var12, var30);
                        var7 += var24;
                        var9 += var26;
                        var15 += var29;
                        var12 += var31;
                     }

                     while(--var4 >= 0.0F) {
                        this.method2569(var2, var3, this.anIntArray_3486, (int)var6, 0, 0, (int)var9, (int)var8, var15, var28, var12, var30);
                        var8 += var25;
                        var9 += var26;
                        var15 += var29;
                        var12 += var31;
                        var6 += (float)this.anInt_3491;
                     }

                  }
               }
            }
         }
      }
   }

   final void method2562(boolean var1, boolean var2, boolean var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11, float var12, int var13) {
      if(this.aBoolean_3511) {
         this.aRenderer_Sub1_3499.method1919((int)var7, (int)var4, (int)var8, (int)var5, var13, -1931733371);
         this.aRenderer_Sub1_3499.method1919((int)var8, (int)var5, (int)var9, (int)var6, var13, -2074387478);
         this.aRenderer_Sub1_3499.method1919((int)var9, (int)var6, (int)var7, (int)var4, var13, 853630746);
      } else {
         float var14 = var8 - var7;
         float var15 = var5 - var4;
         float var16 = var9 - var7;
         float var17 = var6 - var4;
         float var18 = var11 - var10;
         float var19 = var12 - var10;
         float var20 = 0.0F;
         if(var5 != var4) {
            var20 = (var8 - var7) / (var5 - var4);
         }

         float var21 = 0.0F;
         if(var6 != var5) {
            var21 = (var9 - var8) / (var6 - var5);
         }

         float var22 = 0.0F;
         if(var6 != var4) {
            var22 = (var7 - var9) / (var4 - var6);
         }

         float var23 = var14 * var17 - var16 * var15;
         if(var23 != 0.0F) {
            float var24 = (var18 * var17 - var19 * var15) / var23;
            float var25 = (var19 * var14 - var18 * var16) / var23;
            if(var4 <= var5 && var4 <= var6) {
               if(var4 < (float)this.anInt_3480) {
                  if(var5 > (float)this.anInt_3480) {
                     var5 = (float)this.anInt_3480;
                  }

                  if(var6 > (float)this.anInt_3480) {
                     var6 = (float)this.anInt_3480;
                  }

                  var10 = var10 - var24 * var7 + var24;
                  if(var5 < var6) {
                     var9 = var7;
                     if(var4 < 0.0F) {
                        var9 = var7 - var22 * var4;
                        var7 -= var20 * var4;
                        var10 -= var25 * var4;
                        var4 = 0.0F;
                     }

                     if(var5 < 0.0F) {
                        var8 -= var21 * var5;
                        var5 = 0.0F;
                     }

                     if((var4 == var5 || var22 >= var20) && (var4 != var5 || var22 <= var21)) {
                        var4 = (float)((int)(var4 + 0.5F));
                        var5 = (float)((int)(var5 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F)) - var5;
                        var5 -= var4;

                        for(var4 = (float)this.anIntArray_3492[(int)var4]; --var5 >= 0.0F; var4 += (float)this.anInt_3491) {
                           this.method2563(var1, var2, var3, this.anIntArray_3486, (int)var4, var13, 0, (int)var7, (int)var9, var10, var24);
                           var9 += var22;
                           var7 += var20;
                           var10 += var25;
                        }

                        while(--var6 >= 0.0F) {
                           this.method2563(var1, var2, var3, this.anIntArray_3486, (int)var4, var13, 0, (int)var8, (int)var9, var10, var24);
                           var9 += var22;
                           var8 += var21;
                           var10 += var25;
                           var4 += (float)this.anInt_3491;
                        }

                     } else {
                        var4 = (float)((int)(var4 + 0.5F));
                        var5 = (float)((int)(var5 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F)) - var5;
                        var5 -= var4;

                        for(var4 = (float)this.anIntArray_3492[(int)var4]; --var5 >= 0.0F; var4 += (float)this.anInt_3491) {
                           this.method2563(var1, var2, var3, this.anIntArray_3486, (int)var4, var13, 0, (int)var9, (int)var7, var10, var24);
                           var9 += var22;
                           var7 += var20;
                           var10 += var25;
                        }

                        while(--var6 >= 0.0F) {
                           this.method2563(var1, var2, var3, this.anIntArray_3486, (int)var4, var13, 0, (int)var9, (int)var8, var10, var24);
                           var9 += var22;
                           var8 += var21;
                           var10 += var25;
                           var4 += (float)this.anInt_3491;
                        }

                     }
                  } else {
                     var8 = var7;
                     if(var4 < 0.0F) {
                        var8 = var7 - var22 * var4;
                        var7 -= var20 * var4;
                        var10 -= var25 * var4;
                        var4 = 0.0F;
                     }

                     if(var6 < 0.0F) {
                        var9 -= var21 * var6;
                        var6 = 0.0F;
                     }

                     if((var4 == var6 || var22 >= var20) && (var4 != var6 || var21 <= var20)) {
                        var4 = (float)((int)(var4 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F));
                        var5 = (float)((int)(var5 + 0.5F)) - var6;
                        var6 -= var4;

                        for(var4 = (float)this.anIntArray_3492[(int)var4]; --var6 >= 0.0F; var4 += (float)this.anInt_3491) {
                           this.method2563(var1, var2, var3, this.anIntArray_3486, (int)var4, var13, 0, (int)var7, (int)var8, var10, var24);
                           var8 += var22;
                           var7 += var20;
                           var10 += var25;
                        }

                        while(--var5 >= 0.0F) {
                           this.method2563(var1, var2, var3, this.anIntArray_3486, (int)var4, var13, 0, (int)var7, (int)var9, var10, var24);
                           var9 += var21;
                           var7 += var20;
                           var10 += var25;
                           var4 += (float)this.anInt_3491;
                        }

                     } else {
                        var4 = (float)((int)(var4 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F));
                        var5 = (float)((int)(var5 + 0.5F)) - var6;
                        var6 -= var4;

                        for(var4 = (float)this.anIntArray_3492[(int)var4]; --var6 >= 0.0F; var4 += (float)this.anInt_3491) {
                           this.method2563(var1, var2, var3, this.anIntArray_3486, (int)var4, var13, 0, (int)var8, (int)var7, var10, var24);
                           var8 += var22;
                           var7 += var20;
                           var10 += var25;
                        }

                        while(--var5 >= 0.0F) {
                           this.method2563(var1, var2, var3, this.anIntArray_3486, (int)var4, var13, 0, (int)var9, (int)var7, var10, var24);
                           var9 += var21;
                           var7 += var20;
                           var10 += var25;
                           var4 += (float)this.anInt_3491;
                        }

                     }
                  }
               }
            } else if(var5 <= var6) {
               if(var5 < (float)this.anInt_3480) {
                  if(var6 > (float)this.anInt_3480) {
                     var6 = (float)this.anInt_3480;
                  }

                  if(var4 > (float)this.anInt_3480) {
                     var4 = (float)this.anInt_3480;
                  }

                  var11 = var11 - var24 * var8 + var24;
                  if(var6 < var4) {
                     var7 = var8;
                     if(var5 < 0.0F) {
                        var7 = var8 - var20 * var5;
                        var8 -= var21 * var5;
                        var11 -= var25 * var5;
                        var5 = 0.0F;
                     }

                     if(var6 < 0.0F) {
                        var9 -= var22 * var6;
                        var6 = 0.0F;
                     }

                     if((var5 == var6 || var20 >= var21) && (var5 != var6 || var20 <= var22)) {
                        var5 = (float)((int)(var5 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F));
                        var4 = (float)((int)(var4 + 0.5F)) - var6;
                        var6 -= var5;

                        for(var5 = (float)this.anIntArray_3492[(int)var5]; --var6 >= 0.0F; var5 += (float)this.anInt_3491) {
                           this.method2563(var1, var2, var3, this.anIntArray_3486, (int)var5, var13, 0, (int)var8, (int)var7, var11, var24);
                           var7 += var20;
                           var8 += var21;
                           var11 += var25;
                        }

                        while(--var4 >= 0.0F) {
                           this.method2563(var1, var2, var3, this.anIntArray_3486, (int)var5, var13, 0, (int)var9, (int)var7, var11, var24);
                           var7 += var20;
                           var9 += var22;
                           var11 += var25;
                           var5 += (float)this.anInt_3491;
                        }

                     } else {
                        var5 = (float)((int)(var5 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F));
                        var4 = (float)((int)(var4 + 0.5F)) - var6;
                        var6 -= var5;

                        for(var5 = (float)this.anIntArray_3492[(int)var5]; --var6 >= 0.0F; var5 += (float)this.anInt_3491) {
                           this.method2563(var1, var2, var3, this.anIntArray_3486, (int)var5, var13, 0, (int)var7, (int)var8, var11, var24);
                           var7 += var20;
                           var8 += var21;
                           var11 += var25;
                        }

                        while(--var4 >= 0.0F) {
                           this.method2563(var1, var2, var3, this.anIntArray_3486, (int)var5, var13, 0, (int)var7, (int)var9, var11, var24);
                           var7 += var20;
                           var9 += var22;
                           var11 += var25;
                           var5 += (float)this.anInt_3491;
                        }

                     }
                  } else {
                     var9 = var8;
                     if(var5 < 0.0F) {
                        var9 = var8 - var20 * var5;
                        var8 -= var21 * var5;
                        var11 -= var25 * var5;
                        var5 = 0.0F;
                     }

                     if(var4 < 0.0F) {
                        var7 -= var22 * var4;
                        var4 = 0.0F;
                     }

                     if(var20 < var21) {
                        var5 = (float)((int)(var5 + 0.5F));
                        var4 = (float)((int)(var4 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F)) - var4;
                        var4 -= var5;

                        for(var5 = (float)this.anIntArray_3492[(int)var5]; --var4 >= 0.0F; var5 += (float)this.anInt_3491) {
                           this.method2563(var1, var2, var3, this.anIntArray_3486, (int)var5, var13, 0, (int)var9, (int)var8, var11, var24);
                           var9 += var20;
                           var8 += var21;
                           var11 += var25;
                        }

                        while(--var6 >= 0.0F) {
                           this.method2563(var1, var2, var3, this.anIntArray_3486, (int)var5, var13, 0, (int)var7, (int)var8, var11, var24);
                           var7 += var22;
                           var8 += var21;
                           var11 += var25;
                           var5 += (float)this.anInt_3491;
                        }

                     } else {
                        var5 = (float)((int)(var5 + 0.5F));
                        var4 = (float)((int)(var4 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F)) - var4;
                        var4 -= var5;

                        for(var5 = (float)this.anIntArray_3492[(int)var5]; --var4 >= 0.0F; var5 += (float)this.anInt_3491) {
                           this.method2563(var1, var2, var3, this.anIntArray_3486, (int)var5, var13, 0, (int)var8, (int)var9, var11, var24);
                           var9 += var20;
                           var8 += var21;
                           var11 += var25;
                        }

                        while(--var6 >= 0.0F) {
                           this.method2563(var1, var2, var3, this.anIntArray_3486, (int)var5, var13, 0, (int)var8, (int)var7, var11, var24);
                           var7 += var22;
                           var8 += var21;
                           var11 += var25;
                           var5 += (float)this.anInt_3491;
                        }

                     }
                  }
               }
            } else if(var6 < (float)this.anInt_3480) {
               if(var4 > (float)this.anInt_3480) {
                  var4 = (float)this.anInt_3480;
               }

               if(var5 > (float)this.anInt_3480) {
                  var5 = (float)this.anInt_3480;
               }

               var12 = var12 - var24 * var9 + var24;
               if(var4 < var5) {
                  var8 = var9;
                  if(var6 < 0.0F) {
                     var8 = var9 - var21 * var6;
                     var9 -= var22 * var6;
                     var12 -= var25 * var6;
                     var6 = 0.0F;
                  }

                  if(var4 < 0.0F) {
                     var7 -= var20 * var4;
                     var4 = 0.0F;
                  }

                  if(var21 < var22) {
                     var6 = (float)((int)(var6 + 0.5F));
                     var4 = (float)((int)(var4 + 0.5F));
                     var5 = (float)((int)(var5 + 0.5F)) - var4;
                     var4 -= var6;

                     for(var6 = (float)this.anIntArray_3492[(int)var6]; --var4 >= 0.0F; var6 += (float)this.anInt_3491) {
                        this.method2563(var1, var2, var3, this.anIntArray_3486, (int)var6, var13, 0, (int)var8, (int)var9, var12, var24);
                        var8 += var21;
                        var9 += var22;
                        var12 += var25;
                     }

                     while(--var5 >= 0.0F) {
                        this.method2563(var1, var2, var3, this.anIntArray_3486, (int)var6, var13, 0, (int)var8, (int)var7, var12, var24);
                        var8 += var21;
                        var7 += var20;
                        var12 += var25;
                        var6 += (float)this.anInt_3491;
                     }

                  } else {
                     var6 = (float)((int)(var6 + 0.5F));
                     var4 = (float)((int)(var4 + 0.5F));
                     var5 = (float)((int)(var5 + 0.5F)) - var4;
                     var4 -= var6;

                     for(var6 = (float)this.anIntArray_3492[(int)var6]; --var4 >= 0.0F; var6 += (float)this.anInt_3491) {
                        this.method2563(var1, var2, var3, this.anIntArray_3486, (int)var6, var13, 0, (int)var9, (int)var8, var12, var24);
                        var8 += var21;
                        var9 += var22;
                        var12 += var25;
                     }

                     while(--var5 >= 0.0F) {
                        this.method2563(var1, var2, var3, this.anIntArray_3486, (int)var6, var13, 0, (int)var7, (int)var8, var12, var24);
                        var8 += var21;
                        var7 += var20;
                        var12 += var25;
                        var6 += (float)this.anInt_3491;
                     }

                  }
               } else {
                  var7 = var9;
                  if(var6 < 0.0F) {
                     var7 = var9 - var21 * var6;
                     var9 -= var22 * var6;
                     var12 -= var25 * var6;
                     var6 = 0.0F;
                  }

                  if(var5 < 0.0F) {
                     var8 -= var20 * var5;
                     var5 = 0.0F;
                  }

                  if(var21 < var22) {
                     var6 = (float)((int)(var6 + 0.5F));
                     var5 = (float)((int)(var5 + 0.5F));
                     var4 = (float)((int)(var4 + 0.5F)) - var5;
                     var5 -= var6;

                     for(var6 = (float)this.anIntArray_3492[(int)var6]; --var5 >= 0.0F; var6 += (float)this.anInt_3491) {
                        this.method2563(var1, var2, var3, this.anIntArray_3486, (int)var6, var13, 0, (int)var7, (int)var9, var12, var24);
                        var7 += var21;
                        var9 += var22;
                        var12 += var25;
                     }

                     while(--var4 >= 0.0F) {
                        this.method2563(var1, var2, var3, this.anIntArray_3486, (int)var6, var13, 0, (int)var8, (int)var9, var12, var24);
                        var8 += var20;
                        var9 += var22;
                        var12 += var25;
                        var6 += (float)this.anInt_3491;
                     }

                  } else {
                     var6 = (float)((int)(var6 + 0.5F));
                     var5 = (float)((int)(var5 + 0.5F));
                     var4 = (float)((int)(var4 + 0.5F)) - var5;
                     var5 -= var6;

                     for(var6 = (float)this.anIntArray_3492[(int)var6]; --var5 >= 0.0F; var6 += (float)this.anInt_3491) {
                        this.method2563(var1, var2, var3, this.anIntArray_3486, (int)var6, var13, 0, (int)var9, (int)var7, var12, var24);
                        var7 += var21;
                        var9 += var22;
                        var12 += var25;
                     }

                     while(--var4 >= 0.0F) {
                        this.method2563(var1, var2, var3, this.anIntArray_3486, (int)var6, var13, 0, (int)var9, (int)var8, var12, var24);
                        var8 += var20;
                        var9 += var22;
                        var12 += var25;
                        var6 += (float)this.anInt_3491;
                     }

                  }
               }
            }
         }
      }
   }

   final void method2563(boolean var1, boolean var2, boolean var3, int[] var4, int var5, int var6, int var7, int var8, int var9, float var10, float var11) {
      if(this.aBoolean_3481) {
         if(var9 > this.anInt_3487) {
            var9 = this.anInt_3487;
         }

         if(var8 < 0) {
            var8 = 0;
         }
      }

      if(var8 < var9) {
         var5 += var8 - 1;
         var7 = var9 - var8 >> 2;
         var10 += var11 * (float)var8;
         int var12;
         int var13;
         int var14;
         if(this.aClass210_3507.aBoolean_3639) {
            if(this.anInt_3509 == 0) {
               while(true) {
                  --var7;
                  if(var7 < 0) {
                     var7 = var9 - var8 & 3;

                     while(true) {
                        --var7;
                        if(var7 < 0) {
                           return;
                        }

                        ++var5;
                        if(!var2 || var10 < this.aFloatArray_3493[var5]) {
                           if(var1) {
                              var4[var5] = var6;
                           }

                           if(var2) {
                              this.aFloatArray_3493[var5] = var10;
                           }
                        }

                        var10 += var11;
                     }
                  }

                  ++var5;
                  if(!var2 || var10 < this.aFloatArray_3493[var5]) {
                     if(var1) {
                        var4[var5] = var6;
                     }

                     if(var2) {
                        this.aFloatArray_3493[var5] = var10;
                     }
                  }

                  var10 += var11;
                  ++var5;
                  if(!var2 || var10 < this.aFloatArray_3493[var5]) {
                     if(var1) {
                        var4[var5] = var6;
                     }

                     if(var2) {
                        this.aFloatArray_3493[var5] = var10;
                     }
                  }

                  var10 += var11;
                  ++var5;
                  if(!var2 || var10 < this.aFloatArray_3493[var5]) {
                     if(var1) {
                        var4[var5] = var6;
                     }

                     if(var2) {
                        this.aFloatArray_3493[var5] = var10;
                     }
                  }

                  var10 += var11;
                  ++var5;
                  if(!var2 || var10 < this.aFloatArray_3493[var5]) {
                     if(var1) {
                        var4[var5] = var6;
                     }

                     if(var2) {
                        this.aFloatArray_3493[var5] = var10;
                     }
                  }

                  var10 += var11;
               }
            } else if(this.anInt_3509 == 254) {
               if(var8 != 0 && var9 <= this.anInt_3487 - 1) {
                  while(true) {
                     --var7;
                     if(var7 < 0) {
                        var7 = var9 - var8 & 3;

                        while(true) {
                           --var7;
                           if(var7 < 0) {
                              return;
                           }

                           ++var5;
                           if((!var2 || var10 < this.aFloatArray_3493[var5]) && var1) {
                              var4[var5 - 1] = var4[var5];
                           }

                           var10 += var11;
                        }
                     }

                     ++var5;
                     if((!var2 || var10 < this.aFloatArray_3493[var5]) && var1) {
                        var4[var5 - 1] = var4[var5];
                     }

                     var10 += var11;
                     ++var5;
                     if((!var2 || var10 < this.aFloatArray_3493[var5]) && var1) {
                        var4[var5 - 1] = var4[var5];
                     }

                     var10 += var11;
                     ++var5;
                     if((!var2 || var10 < this.aFloatArray_3493[var5]) && var1) {
                        var4[var5 - 1] = var4[var5];
                     }

                     var10 += var11;
                     ++var5;
                     if((!var2 || var10 < this.aFloatArray_3493[var5]) && var1) {
                        var4[var5 - 1] = var4[var5];
                     }

                     var10 += var11;
                  }
               }
            } else {
               var12 = this.anInt_3509;
               var13 = 256 - this.anInt_3509;
               var6 = ((var6 & 16711935) * var13 >> 8 & 16711935) + ((var6 & '\uff00') * var13 >> 8 & '\uff00');

               while(true) {
                  --var7;
                  if(var7 < 0) {
                     var7 = var9 - var8 & 3;

                     while(true) {
                        --var7;
                        if(var7 < 0) {
                           return;
                        }

                        ++var5;
                        if(!var2 || var10 < this.aFloatArray_3493[var5]) {
                           if(var1) {
                              var14 = var4[var5];
                              if(var3) {
                                 var4[var5] = (var13 | var14 >> 24) << 24 | var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                              } else {
                                 var4[var5] = var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                              }
                           }

                           if(var2) {
                              this.aFloatArray_3493[var5] = var10;
                           }
                        }

                        var10 += var11;
                     }
                  }

                  ++var5;
                  if(!var2 || var10 < this.aFloatArray_3493[var5]) {
                     if(var1) {
                        var14 = var4[var5];
                        if(var3) {
                           var4[var5] = (var13 | var14 >> 24) << 24 | var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                        } else {
                           var4[var5] = var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                        }
                     }

                     if(var2) {
                        this.aFloatArray_3493[var5] = var10;
                     }
                  }

                  var10 += var11;
                  ++var5;
                  if(!var2 || var10 < this.aFloatArray_3493[var5]) {
                     if(var1) {
                        var14 = var4[var5];
                        if(var3) {
                           var4[var5] = (var13 | var14 >> 24) << 24 | var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                        } else {
                           var4[var5] = var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                        }
                     }

                     if(var2) {
                        this.aFloatArray_3493[var5] = var10;
                     }
                  }

                  var10 += var11;
                  ++var5;
                  if(!var2 || var10 < this.aFloatArray_3493[var5]) {
                     if(var1) {
                        var14 = var4[var5];
                        if(var3) {
                           var4[var5] = (var13 | var14 >> 24) << 24 | var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                        } else {
                           var4[var5] = var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                        }
                     }

                     if(var2) {
                        this.aFloatArray_3493[var5] = var10;
                     }
                  }

                  var10 += var11;
                  ++var5;
                  if(!var2 || var10 < this.aFloatArray_3493[var5]) {
                     if(var1) {
                        var14 = var4[var5];
                        if(var3) {
                           var4[var5] = (var13 | var14 >> 24) << 24 | var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                        } else {
                           var4[var5] = var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                        }
                     }

                     if(var2) {
                        this.aFloatArray_3493[var5] = var10;
                     }
                  }

                  var10 += var11;
               }
            }
         } else if(var1) {
            if(this.anInt_3509 == 0) {
               while(true) {
                  --var7;
                  if(var7 < 0) {
                     var7 = var9 - var8 & 3;

                     while(true) {
                        --var7;
                        if(var7 < 0) {
                           return;
                        }

                        ++var5;
                        if(!var2 || var10 < this.aFloatArray_3493[var5]) {
                           var4[var5] = var6;
                        }

                        var10 += var11;
                     }
                  }

                  ++var5;
                  if(!var2 || var10 < this.aFloatArray_3493[var5]) {
                     var4[var5] = var6;
                  }

                  var10 += var11;
                  ++var5;
                  if(!var2 || var10 < this.aFloatArray_3493[var5]) {
                     var4[var5] = var6;
                  }

                  var10 += var11;
                  ++var5;
                  if(!var2 || var10 < this.aFloatArray_3493[var5]) {
                     var4[var5] = var6;
                  }

                  var10 += var11;
                  ++var5;
                  if(!var2 || var10 < this.aFloatArray_3493[var5]) {
                     var4[var5] = var6;
                  }

                  var10 += var11;
               }
            } else if(this.anInt_3509 == 254) {
               if(var8 != 0 && var9 <= this.anInt_3487 - 1) {
                  while(true) {
                     --var7;
                     if(var7 < 0) {
                        var7 = var9 - var8 & 3;

                        while(true) {
                           --var7;
                           if(var7 < 0) {
                              return;
                           }

                           ++var5;
                           if(!var2 || var10 < this.aFloatArray_3493[var5]) {
                              var4[var5 - 1] = var4[var5];
                           }

                           var10 += var11;
                        }
                     }

                     ++var5;
                     if(!var2 || var10 < this.aFloatArray_3493[var5]) {
                        var4[var5 - 1] = var4[var5];
                     }

                     var10 += var11;
                     ++var5;
                     if(!var2 || var10 < this.aFloatArray_3493[var5]) {
                        var4[var5 - 1] = var4[var5];
                     }

                     var10 += var11;
                     ++var5;
                     if(!var2 || var10 < this.aFloatArray_3493[var5]) {
                        var4[var5 - 1] = var4[var5];
                     }

                     var10 += var11;
                     ++var5;
                     if(!var2 || var10 < this.aFloatArray_3493[var5]) {
                        var4[var5 - 1] = var4[var5];
                     }

                     var10 += var11;
                  }
               }
            } else {
               var12 = this.anInt_3509;
               var13 = 256 - this.anInt_3509;
               var6 = ((var6 & 16711935) * var13 >> 8 & 16711935) + ((var6 & '\uff00') * var13 >> 8 & '\uff00');

               while(true) {
                  --var7;
                  if(var7 < 0) {
                     var7 = var9 - var8 & 3;

                     while(true) {
                        --var7;
                        if(var7 < 0) {
                           return;
                        }

                        ++var5;
                        if(!var2 || var10 < this.aFloatArray_3493[var5]) {
                           var14 = var4[var5];
                           if(var3) {
                              var4[var5] = (var13 | var14 >> 24) << 24 | var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                           } else {
                              var4[var5] = var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                           }
                        }

                        var10 += var11;
                     }
                  }

                  ++var5;
                  if(!var2 || var10 < this.aFloatArray_3493[var5]) {
                     var14 = var4[var5];
                     if(var3) {
                        var4[var5] = (var13 | var14 >> 24) << 24 | var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                     } else {
                        var4[var5] = var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                     }
                  }

                  var10 += var11;
                  ++var5;
                  if(!var2 || var10 < this.aFloatArray_3493[var5]) {
                     var14 = var4[var5];
                     if(var3) {
                        var4[var5] = (var13 | var14 >> 24) << 24 | var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                     } else {
                        var4[var5] = var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                     }
                  }

                  var10 += var11;
                  ++var5;
                  if(!var2 || var10 < this.aFloatArray_3493[var5]) {
                     var14 = var4[var5];
                     if(var3) {
                        var4[var5] = (var13 | var14 >> 24) << 24 | var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                     } else {
                        var4[var5] = var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                     }
                  }

                  var10 += var11;
                  ++var5;
                  if(!var2 || var10 < this.aFloatArray_3493[var5]) {
                     var14 = var4[var5];
                     if(var3) {
                        var4[var5] = (var13 | var14 >> 24) << 24 | var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                     } else {
                        var4[var5] = var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                     }
                  }

                  var10 += var11;
               }
            }
         }
      }
   }

   final void method2564(boolean var1, boolean var2, int[] var3, int[] var4, int var5, int var6, int var7, float var8, float var9, float var10, float var11, float var12, float var13, float var14, float var15, float var16, float var17, float var18, float var19, float var20, float var21, float var22, float var23, float var24, float var25) {
      int var26 = var7 - var6;
      float var27 = 1.0F / (float)var26;
      float var28 = (var9 - var8) * var27;
      float var29 = (var11 - var10) * var27;
      float var30 = (var13 - var12) * var27;
      float var31 = (var15 - var14) * var27;
      float var32 = (var17 - var16) * var27;
      float var33 = (var19 - var18) * var27;
      float var34 = (var21 - var20) * var27;
      float var35 = (var23 - var22) * var27;
      float var36 = (var25 - var24) * var27;
      if(this.aBoolean_3481) {
         if(var7 > this.anInt_3487) {
            var7 = this.anInt_3487;
         }

         if(var6 < 0) {
            var8 -= var28 * (float)var6;
            var10 -= var29 * (float)var6;
            var12 -= var30 * (float)var6;
            var14 -= var31 * (float)var6;
            var16 -= var32 * (float)var6;
            var18 -= var33 * (float)var6;
            var20 -= var34 * (float)var6;
            var22 -= var35 * (float)var6;
            var24 -= var36 * (float)var6;
            var6 = 0;
         }
      }

      if(var6 < var7) {
         var26 = var7 - var6;

         for(var5 += var6; var26-- > 0; var24 += var36) {
            float var37 = 1.0F / var8;
            float var38 = 1.0F / var10;
            if(!var1 || var37 < this.aFloatArray_3493[var5]) {
               int var39 = (int)(var12 * var38 * (float)this.anInt_3497);
               if(this.aBoolean_3501) {
                  var39 &= this.anInt_3498;
               } else if(var39 < 0) {
                  var39 = 0;
               } else if(var39 > this.anInt_3498) {
                  var39 = this.anInt_3498;
               }

               int var40 = (int)(var14 * var38 * (float)this.anInt_3497);
               if(this.aBoolean_3501) {
                  var40 &= this.anInt_3498;
               } else if(var40 < 0) {
                  var40 = 0;
               } else if(var40 > this.anInt_3498) {
                  var40 = this.anInt_3498;
               }

               int var41 = this.anIntArray_3474[var40 * this.anInt_3497 + var39];
               boolean var42 = true;
               int var46;
               if(this.aClass620_3500 == Class620.aClass620_10022) {
                  var46 = (int)((float)(var41 >> 24 & 255) * var18 / 255.0F);
               } else if(this.aClass620_3500 == Class620.aClass620_10021) {
                  var46 = var41 == 0?0:255;
               } else {
                  var46 = (int)var18;
               }

               if(var46 != 0) {
                  int var43;
                  int var44;
                  int var45;
                  if(var46 != 255) {
                     var43 = -16777216 | (int)(var20 * (float)(var41 >> 16 & 255)) << 8 & 16711680 | (int)(var22 * (float)(var41 >> 8 & 255)) & '\uff00' | (int)(var24 * (float)(var41 & 255)) >> 8;
                     if(var16 != 0.0F) {
                        var44 = (int)(255.0F - var16);
                        var45 = ((this.anInt_3494 & 16711935) * (int)var16 & -16711936 | (this.anInt_3494 & '\uff00') * (int)var16 & 16711680) >>> 8;
                        var43 = (((var43 & 16711935) * var44 & -16711936 | (var43 & '\uff00') * var44 & 16711680) >>> 8) + var45;
                     }

                     var44 = var3[var5];
                     var45 = 255 - var46;
                     var43 = ((var44 & 16711935) * var45 + (var43 & 16711935) * var46 & -16711936) + ((var44 & '\uff00') * var45 + (var43 & '\uff00') * var46 & 16711680) >> 8;
                     if(var2) {
                        var3[var5] = (var46 | var3[var5] >> 24) << 24 | var43;
                     } else {
                        var3[var5] = var43;
                     }

                     if(var1) {
                        this.aFloatArray_3493[var5] = var37;
                     }
                  } else {
                     var43 = -16777216 | (int)(var20 * (float)(var41 >> 16 & 255)) << 8 & 16711680 | (int)(var22 * (float)(var41 >> 8 & 255)) & '\uff00' | (int)(var24 * (float)(var41 & 255)) >> 8;
                     if(var16 != 0.0F) {
                        var44 = (int)(255.0F - var16);
                        var45 = ((this.anInt_3494 & 16711935) * (int)var16 & -16711936 | (this.anInt_3494 & '\uff00') * (int)var16 & 16711680) >>> 8;
                        var43 = (((var43 & 16711935) * var44 & -16711936 | (var43 & '\uff00') * var44 & 16711680) >>> 8) + var45;
                     }

                     if(var2) {
                        var3[var5] = var46 << 24 | var43;
                     } else {
                        var3[var5] = var43;
                     }

                     if(var1) {
                        this.aFloatArray_3493[var5] = var37;
                     }
                  }
               }
            }

            ++var5;
            var8 += var28;
            var10 += var29;
            var12 += var30;
            var14 += var31;
            var16 += var32;
            var18 += var33;
            var20 += var34;
            var22 += var35;
         }

      }
   }

   final void method2565(boolean var1, boolean var2, boolean var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11, float var12, float var13, float var14, float var15, float var16, float var17, float var18, float var19, float var20, float var21, int var22, int var23, int var24, int var25, float var26, float var27, float var28, int var29, int var30, float var31, int var32, int var33, float var34, int var35, int var36, float var37) {
      if(!var1) {
         this.method2562(false, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, 0);
      } else {
         this.anInt_3494 = var25;
         int var39;
         if(var4 > var5 || var4 > var6) {
            float var38;
            if(var5 <= var6) {
               var38 = var7;
               var7 = var8;
               var8 = var38;
               var38 = var4;
               var4 = var5;
               var5 = var38;
               var38 = var10;
               var10 = var11;
               var11 = var38;
               var38 = var16;
               var16 = var17;
               var17 = var38;
               var38 = var19;
               var19 = var20;
               var20 = var38;
               var38 = var13;
               var13 = var14;
               var14 = var38;
               var38 = var26;
               var26 = var27;
               var27 = var38;
               var38 = var31;
               var31 = var34;
               var34 = var38;
               var39 = var22;
               var22 = var23;
               var23 = var39;
               var39 = var30;
               var30 = var33;
               var33 = var39;
               var39 = var29;
               var29 = var32;
               var32 = var39;
            } else {
               var38 = var7;
               var7 = var9;
               var9 = var38;
               var38 = var4;
               var4 = var6;
               var6 = var38;
               var38 = var10;
               var10 = var12;
               var12 = var38;
               var38 = var16;
               var16 = var18;
               var18 = var38;
               var38 = var19;
               var19 = var21;
               var21 = var38;
               var38 = var13;
               var13 = var15;
               var15 = var38;
               var38 = var26;
               var26 = var28;
               var28 = var38;
               var38 = var31;
               var31 = var37;
               var37 = var38;
               var39 = var22;
               var22 = var24;
               var24 = var39;
               var39 = var30;
               var30 = var36;
               var36 = var39;
               var39 = var29;
               var29 = var35;
               var35 = var39;
            }
         }

         int var98 = (var29 & '\uffff') << 16 | var30 & '\uffff';
         var39 = (var32 & '\uffff') << 16 | var33 & '\uffff';
         int var40 = (var35 & '\uffff') << 16 | var36 & '\uffff';
         int var96;
         int var97;
         if(var98 != this.anInt_3488) {
            this.anIntArray_3474 = this.aRenderer_Sub1_3499.method6736(var29, var30);
            if(this.anIntArray_3474 == null) {
               this.anInt_3488 = -1;
               this.anInt_3509 = 255 - (var22 >> 24 & 255);
               var96 = Class561.colourMap[CacheFileID.method1398(this.aRenderer_Sub1_3499.method6739(var29), -539567452) & '\uffff'];
               var97 = -16777216 | (var22 >> 16 & 255) * (var96 >> 16 & 255) << 8 & 16711680 | (var22 >> 8 & 255) * (var96 >> 8 & 255) & '\uff00' | (var22 & 255) * (var96 & 255) >> 8;
               this.method2567(true, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, Class104_Sub20.method7394(var97, var25, var26, -1235596570), Class104_Sub20.method7394(var97, var25, var27, -1856107918), Class104_Sub20.method7394(var97, var25, var28, -1447198157));
               return;
            }

            this.anInt_3488 = var98;
            this.anInt_3497 = this.aRenderer_Sub1_3499.method6776(var29);
            this.anInt_3498 = this.anInt_3497 - 1;
            this.aClass620_3500 = this.aRenderer_Sub1_3499.method6738(var29);
         }

         this.aFloat_3496 = var31;
         if(var39 != this.anInt_3502) {
            this.anIntArray_3503 = this.aRenderer_Sub1_3499.method6736(var32, var33);
            if(this.anIntArray_3503 == null) {
               this.anInt_3502 = -1;
               this.anInt_3509 = 255 - (var22 >> 24 & 255);
               var96 = Class561.colourMap[CacheFileID.method1398(this.aRenderer_Sub1_3499.method6739(var32), -911721457) & '\uffff'];
               var97 = -16777216 | (var22 >> 16 & 255) * (var96 >> 16 & 255) << 8 & 16711680 | (var22 >> 8 & 255) * (var96 >> 8 & 255) & '\uff00' | (var22 & 255) * (var96 & 255) >> 8;
               this.method2567(true, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, Class104_Sub20.method7394(var97, var25, var26, -124298922), Class104_Sub20.method7394(var97, var25, var27, 83362057), Class104_Sub20.method7394(var97, var25, var28, -455726559));
               return;
            }

            this.anInt_3502 = var39;
            this.anInt_3504 = this.aRenderer_Sub1_3499.method6776(var32);
            this.anInt_3505 = this.anInt_3504 - 1;
         }

         this.aFloat_3506 = var34;
         if(var40 != this.anInt_3477) {
            this.anIntArray_3508 = this.aRenderer_Sub1_3499.method6736(var35, var36);
            if(this.anIntArray_3508 == null) {
               this.anInt_3477 = -1;
               this.anInt_3509 = 255 - (var22 >> 24 & 255);
               var96 = Class561.colourMap[CacheFileID.method1398(this.aRenderer_Sub1_3499.method6739(var35), 246666037) & '\uffff'];
               var97 = -16777216 | (var22 >> 16 & 255) * (var96 >> 16 & 255) << 8 & 16711680 | (var22 >> 8 & 255) * (var96 >> 8 & 255) & '\uff00' | (var22 & 255) * (var96 & 255) >> 8;
               this.method2567(true, var2, var3, (float)((int)var4), (float)((int)var5), (float)((int)var6), (float)((int)var7), (float)((int)var8), (float)((int)var9), (float)((int)var10), (float)((int)var11), (float)((int)var12), Class104_Sub20.method7394(var97, var25, var26, -1225006313), Class104_Sub20.method7394(var97, var25, var27, -1197558513), Class104_Sub20.method7394(var97, var25, var28, -709657882));
               return;
            }

            this.anInt_3477 = var40;
            this.anInt_3482 = this.aRenderer_Sub1_3499.method6776(var35);
            this.anInt_3510 = this.anInt_3482 - 1;
         }

         this.aFloat_3478 = var37;
         var16 /= var13;
         var17 /= var14;
         var18 /= var15;
         var19 /= var13;
         var20 /= var14;
         var21 /= var15;
         var10 = 1.0F / var10;
         var11 = 1.0F / var11;
         var12 = 1.0F / var12;
         var13 = 1.0F / var13;
         var14 = 1.0F / var14;
         var15 = 1.0F / var15;
         float var41 = (float)(var22 >> 24 & 255);
         float var42 = (float)(var23 >> 24 & 255);
         float var43 = (float)(var24 >> 24 & 255);
         float var44 = (float)(var22 >> 16 & 255);
         float var45 = (float)(var23 >> 16 & 255);
         float var46 = (float)(var24 >> 16 & 255);
         float var47 = (float)(var22 >> 8 & 255);
         float var48 = (float)(var23 >> 8 & 255);
         float var49 = (float)(var24 >> 8 & 255);
         float var50 = (float)(var22 & 255);
         float var51 = (float)(var23 & 255);
         float var52 = (float)(var24 & 255);
         float var53 = 1.0F;
         float var54 = 0.0F;
         float var55 = 0.0F;
         float var56 = 0.0F;
         float var57 = 1.0F;
         float var58 = 0.0F;
         float var59 = 0.0F;
         float var60 = 0.0F;
         float var61 = 0.0F;
         float var62 = 0.0F;
         float var63 = 0.0F;
         float var64 = 0.0F;
         float var65 = 0.0F;
         float var66 = 0.0F;
         float var67 = 0.0F;
         float var68 = 0.0F;
         float var69 = 0.0F;
         float var70 = 0.0F;
         float var71;
         if(var5 != var4) {
            var71 = var5 - var4;
            var59 = (var8 - var7) / var71;
            var60 = (var11 - var10) / var71;
            var61 = (var14 - var13) / var71;
            var62 = (var17 - var16) / var71;
            var63 = (var20 - var19) / var71;
            var64 = (var27 - var26) / var71;
            var65 = (var42 - var41) / var71;
            var66 = (var45 - var44) / var71;
            var67 = (var48 - var47) / var71;
            var68 = (var51 - var50) / var71;
            var69 = (var54 - var53) / var71;
            var70 = (var57 - var56) / var71;
         }

         var71 = 0.0F;
         float var72 = 0.0F;
         float var73 = 0.0F;
         float var74 = 0.0F;
         float var75 = 0.0F;
         float var76 = 0.0F;
         float var77 = 0.0F;
         float var78 = 0.0F;
         float var79 = 0.0F;
         float var80 = 0.0F;
         float var81 = 0.0F;
         float var82 = 0.0F;
         float var83;
         if(var6 != var5) {
            var83 = var6 - var5;
            var71 = (var9 - var8) / var83;
            var72 = (var12 - var11) / var83;
            var73 = (var15 - var14) / var83;
            var74 = (var18 - var17) / var83;
            var75 = (var21 - var20) / var83;
            var76 = (var28 - var27) / var83;
            var77 = (var43 - var42) / var83;
            var78 = (var46 - var45) / var83;
            var79 = (var49 - var48) / var83;
            var80 = (var52 - var51) / var83;
            var81 = (var55 - var54) / var83;
            var82 = (var58 - var57) / var83;
         }

         var83 = 0.0F;
         float var84 = 0.0F;
         float var85 = 0.0F;
         float var86 = 0.0F;
         float var87 = 0.0F;
         float var88 = 0.0F;
         float var89 = 0.0F;
         float var90 = 0.0F;
         float var91 = 0.0F;
         float var92 = 0.0F;
         float var93 = 0.0F;
         float var94 = 0.0F;
         if(var4 != var6) {
            float var95 = var4 - var6;
            var83 = (var7 - var9) / var95;
            var84 = (var10 - var12) / var95;
            var85 = (var13 - var15) / var95;
            var86 = (var16 - var18) / var95;
            var87 = (var19 - var21) / var95;
            var88 = (var26 - var28) / var95;
            var89 = (var41 - var43) / var95;
            var90 = (var44 - var46) / var95;
            var91 = (var47 - var49) / var95;
            var92 = (var50 - var52) / var95;
            var93 = (var53 - var55) / var95;
            var94 = (var56 - var58) / var95;
         }

         if(var4 < (float)this.anInt_3480) {
            if(var5 > (float)this.anInt_3480) {
               var5 = (float)this.anInt_3480;
            }

            if(var6 > (float)this.anInt_3480) {
               var6 = (float)this.anInt_3480;
            }

            if(var5 < var6) {
               var9 = var7;
               var12 = var10;
               var15 = var13;
               var18 = var16;
               var21 = var19;
               var28 = var26;
               var43 = var41;
               var46 = var44;
               var49 = var47;
               var52 = var50;
               var55 = var53;
               var58 = var56;
               if(var4 < 0.0F) {
                  var7 -= var59 * var4;
                  var9 -= var83 * var4;
                  var10 -= var60 * var4;
                  var12 -= var84 * var4;
                  var13 -= var61 * var4;
                  var15 -= var85 * var4;
                  var16 -= var62 * var4;
                  var18 -= var86 * var4;
                  var19 -= var63 * var4;
                  var21 -= var87 * var4;
                  var26 -= var64 * var4;
                  var28 -= var88 * var4;
                  var41 -= var65 * var4;
                  var43 -= var89 * var4;
                  var44 -= var66 * var4;
                  var46 -= var90 * var4;
                  var47 -= var67 * var4;
                  var49 -= var91 * var4;
                  var50 -= var68 * var4;
                  var52 -= var92 * var4;
                  var53 -= var69 * var4;
                  var55 -= var93 * var4;
                  var56 -= var70 * var4;
                  var58 -= var94 * var4;
                  var4 = 0.0F;
               }

               if(var5 < 0.0F) {
                  var8 -= var71 * var5;
                  var11 -= var72 * var5;
                  var14 -= var73 * var5;
                  var17 -= var74 * var5;
                  var20 -= var75 * var5;
                  var27 -= var76 * var5;
                  var42 -= var77 * var5;
                  var45 -= var78 * var5;
                  var48 -= var79 * var5;
                  var51 -= var80 * var5;
                  var54 -= var81 * var5;
                  var57 -= var82 * var5;
                  var5 = 0.0F;
               }

               if((var4 == var5 || var83 >= var59) && (var4 != var5 || var83 <= var71)) {
                  var4 = (float)((int)(var4 + 0.5F));
                  var5 = (float)((int)(var5 + 0.5F));
                  var6 = (float)((int)(var6 + 0.5F)) - var5;
                  var5 -= var4;

                  for(var4 = (float)this.anIntArray_3492[(int)var4]; --var5 >= 0.0F; var4 += (float)this.anInt_3491) {
                     this.method2566(var2, var3, this.anIntArray_3486, (int)var4, (int)var7, (int)var9, var10, var12, var13, var15, var16, var18, var19, var21, var26, var28, var41, var43, var44, var46, var47, var49, var50, var52, var53, var55, var56, var58);
                     var7 += var59;
                     var9 += var83;
                     var10 += var60;
                     var12 += var84;
                     var13 += var61;
                     var15 += var85;
                     var16 += var62;
                     var18 += var86;
                     var19 += var63;
                     var21 += var87;
                     var26 += var64;
                     var28 += var88;
                     var41 += var65;
                     var43 += var89;
                     var44 += var66;
                     var46 += var90;
                     var47 += var67;
                     var49 += var91;
                     var50 += var68;
                     var52 += var92;
                     var53 += var69;
                     var55 += var93;
                     var56 += var70;
                     var58 += var94;
                  }

                  while(--var6 >= 0.0F) {
                     this.method2566(var2, var3, this.anIntArray_3486, (int)var4, (int)var8, (int)var9, var11, var12, var14, var15, var17, var18, var20, var21, var27, var28, var42, var43, var45, var46, var48, var49, var51, var52, var54, var55, var57, var58);
                     var8 += var71;
                     var9 += var83;
                     var11 += var72;
                     var12 += var84;
                     var14 += var73;
                     var15 += var85;
                     var17 += var74;
                     var18 += var86;
                     var20 += var75;
                     var21 += var87;
                     var27 += var76;
                     var28 += var88;
                     var42 += var77;
                     var43 += var89;
                     var45 += var78;
                     var46 += var90;
                     var48 += var79;
                     var49 += var91;
                     var51 += var80;
                     var52 += var92;
                     var54 += var81;
                     var55 += var93;
                     var57 += var82;
                     var58 += var94;
                     var4 += (float)this.anInt_3491;
                  }
               } else {
                  var4 = (float)((int)(var4 + 0.5F));
                  var5 = (float)((int)(var5 + 0.5F));
                  var6 = (float)((int)(var6 + 0.5F)) - var5;
                  var5 -= var4;

                  for(var4 = (float)this.anIntArray_3492[(int)var4]; --var5 >= 0.0F; var4 += (float)this.anInt_3491) {
                     this.method2566(var2, var3, this.anIntArray_3486, (int)var4, (int)var9, (int)var7, var12, var10, var15, var13, var18, var16, var21, var19, var28, var26, var43, var41, var46, var44, var49, var47, var52, var50, var55, var53, var58, var56);
                     var7 += var59;
                     var9 += var83;
                     var10 += var60;
                     var12 += var84;
                     var13 += var61;
                     var15 += var85;
                     var16 += var62;
                     var18 += var86;
                     var19 += var63;
                     var21 += var87;
                     var26 += var64;
                     var28 += var88;
                     var41 += var65;
                     var43 += var89;
                     var44 += var66;
                     var46 += var90;
                     var47 += var67;
                     var49 += var91;
                     var50 += var68;
                     var52 += var92;
                     var53 += var69;
                     var55 += var93;
                     var56 += var70;
                     var58 += var94;
                  }

                  while(--var6 >= 0.0F) {
                     this.method2566(var2, var3, this.anIntArray_3486, (int)var4, (int)var9, (int)var8, var12, var11, var15, var14, var18, var17, var21, var20, var28, var27, var43, var42, var46, var45, var49, var48, var52, var51, var55, var54, var58, var57);
                     var8 += var71;
                     var9 += var83;
                     var11 += var72;
                     var12 += var84;
                     var14 += var73;
                     var15 += var85;
                     var17 += var74;
                     var18 += var86;
                     var20 += var75;
                     var21 += var87;
                     var27 += var76;
                     var28 += var88;
                     var42 += var77;
                     var43 += var89;
                     var45 += var78;
                     var46 += var90;
                     var48 += var79;
                     var49 += var91;
                     var51 += var80;
                     var52 += var92;
                     var54 += var81;
                     var55 += var93;
                     var57 += var82;
                     var58 += var94;
                     var4 += (float)this.anInt_3491;
                  }
               }
            } else {
               var8 = var7;
               var11 = var10;
               var14 = var13;
               var17 = var16;
               var20 = var19;
               var27 = var26;
               var42 = var41;
               var45 = var44;
               var48 = var47;
               var51 = var50;
               var54 = var53;
               var57 = var56;
               if(var4 < 0.0F) {
                  var7 -= var59 * var4;
                  var8 -= var83 * var4;
                  var10 -= var60 * var4;
                  var11 -= var84 * var4;
                  var13 -= var61 * var4;
                  var14 -= var85 * var4;
                  var16 -= var62 * var4;
                  var17 -= var86 * var4;
                  var19 -= var63 * var4;
                  var20 -= var87 * var4;
                  var26 -= var64 * var4;
                  var27 -= var88 * var4;
                  var41 -= var65 * var4;
                  var42 -= var89 * var4;
                  var44 -= var66 * var4;
                  var45 -= var90 * var4;
                  var47 -= var67 * var4;
                  var48 -= var91 * var4;
                  var50 -= var68 * var4;
                  var51 -= var92 * var4;
                  var53 -= var69 * var4;
                  var54 -= var93 * var4;
                  var56 -= var70 * var4;
                  var57 -= var94 * var4;
                  var4 = 0.0F;
               }

               if(var6 < 0.0F) {
                  var9 -= var71 * var6;
                  var12 -= var72 * var6;
                  var15 -= var73 * var6;
                  var18 -= var74 * var6;
                  var21 -= var75 * var6;
                  var28 -= var76 * var6;
                  var43 -= var77 * var6;
                  var46 -= var78 * var6;
                  var49 -= var79 * var6;
                  var52 -= var80 * var6;
                  var55 -= var81 * var6;
                  var58 -= var82 * var6;
                  var6 = 0.0F;
               }

               if((var4 == var6 || var83 >= var59) && (var4 != var6 || var71 <= var59)) {
                  var4 = (float)((int)(var4 + 0.5F));
                  var6 = (float)((int)(var6 + 0.5F));
                  var5 = (float)((int)(var5 + 0.5F)) - var6;
                  var6 -= var4;

                  for(var4 = (float)this.anIntArray_3492[(int)var4]; --var6 >= 0.0F; var4 += (float)this.anInt_3491) {
                     this.method2566(var2, var3, this.anIntArray_3486, (int)var4, (int)var7, (int)var8, var10, var11, var13, var14, var16, var17, var19, var20, var26, var27, var41, var42, var44, var45, var47, var48, var50, var51, var53, var54, var56, var57);
                     var8 += var83;
                     var7 += var59;
                     var11 += var84;
                     var10 += var60;
                     var14 += var85;
                     var13 += var61;
                     var17 += var86;
                     var16 += var62;
                     var20 += var87;
                     var19 += var63;
                     var27 += var88;
                     var26 += var64;
                     var42 += var89;
                     var41 += var65;
                     var45 += var90;
                     var44 += var66;
                     var48 += var91;
                     var47 += var67;
                     var51 += var92;
                     var50 += var68;
                     var54 += var93;
                     var53 += var69;
                     var57 += var94;
                     var56 += var70;
                  }

                  while(--var5 >= 0.0F) {
                     this.method2566(var2, var3, this.anIntArray_3486, (int)var4, (int)var7, (int)var9, var10, var12, var13, var15, var16, var18, var19, var21, var26, var28, var41, var43, var44, var46, var47, var49, var50, var52, var53, var55, var56, var58);
                     var7 += var59;
                     var9 += var71;
                     var10 += var60;
                     var12 += var72;
                     var13 += var61;
                     var15 += var73;
                     var16 += var62;
                     var18 += var74;
                     var19 += var63;
                     var21 += var75;
                     var26 += var64;
                     var28 += var76;
                     var41 += var65;
                     var43 += var77;
                     var44 += var66;
                     var46 += var78;
                     var47 += var67;
                     var49 += var79;
                     var50 += var68;
                     var52 += var80;
                     var53 += var69;
                     var55 += var81;
                     var56 += var70;
                     var58 += var82;
                     var4 += (float)this.anInt_3491;
                  }
               } else {
                  var4 = (float)((int)(var4 + 0.5F));
                  var6 = (float)((int)(var6 + 0.5F));
                  var5 = (float)((int)(var5 + 0.5F)) - var6;
                  var6 -= var4;

                  for(var4 = (float)this.anIntArray_3492[(int)var4]; --var6 >= 0.0F; var4 += (float)this.anInt_3491) {
                     this.method2566(var2, var3, this.anIntArray_3486, (int)var4, (int)var8, (int)var7, var11, var10, var14, var13, var17, var16, var20, var19, var27, var26, var42, var41, var45, var44, var48, var47, var51, var50, var54, var53, var57, var56);
                     var7 += var59;
                     var8 += var83;
                     var10 += var60;
                     var11 += var84;
                     var13 += var61;
                     var14 += var85;
                     var16 += var62;
                     var17 += var86;
                     var19 += var63;
                     var20 += var87;
                     var26 += var64;
                     var27 += var88;
                     var41 += var65;
                     var42 += var89;
                     var44 += var66;
                     var45 += var90;
                     var47 += var67;
                     var48 += var91;
                     var50 += var68;
                     var51 += var92;
                     var53 += var69;
                     var54 += var93;
                     var56 += var70;
                     var57 += var94;
                  }

                  while(--var5 >= 0.0F) {
                     this.method2566(var2, var3, this.anIntArray_3486, (int)var4, (int)var9, (int)var7, var12, var10, var15, var13, var18, var16, var21, var19, var28, var26, var43, var41, var46, var44, var49, var47, var52, var50, var55, var53, var58, var56);
                     var9 += var71;
                     var7 += var59;
                     var12 += var72;
                     var10 += var60;
                     var15 += var73;
                     var13 += var61;
                     var18 += var74;
                     var16 += var62;
                     var21 += var75;
                     var19 += var63;
                     var28 += var76;
                     var26 += var64;
                     var43 += var77;
                     var41 += var65;
                     var46 += var78;
                     var44 += var66;
                     var49 += var79;
                     var47 += var67;
                     var52 += var80;
                     var50 += var68;
                     var55 += var81;
                     var53 += var69;
                     var58 += var82;
                     var56 += var70;
                     var4 += (float)this.anInt_3491;
                  }
               }
            }

         }
      }
   }

   final void method2566(boolean var1, boolean var2, int[] var3, int var4, int var5, int var6, float var7, float var8, float var9, float var10, float var11, float var12, float var13, float var14, float var15, float var16, float var17, float var18, float var19, float var20, float var21, float var22, float var23, float var24, float var25, float var26, float var27, float var28) {
      int var29 = var6 - var5;
      float var30 = 1.0F / (float)var29;
      float var31 = (var8 - var7) * var30;
      float var32 = (var10 - var9) * var30;
      float var33 = (var12 - var11) * var30;
      float var34 = (var14 - var13) * var30;
      float var35 = (var16 - var15) * var30;
      float var36 = (var18 - var17) * var30;
      float var37 = (var20 - var19) * var30;
      float var38 = (var22 - var21) * var30;
      float var39 = (var24 - var23) * var30;
      float var40 = (var26 - var25) * var30;
      float var41 = (var28 - var27) * var30;
      if(this.aBoolean_3481) {
         if(var6 > this.anInt_3487) {
            var6 = this.anInt_3487;
         }

         if(var5 < 0) {
            var7 -= var31 * (float)var5;
            var9 -= var32 * (float)var5;
            var11 -= var33 * (float)var5;
            var13 -= var34 * (float)var5;
            var15 -= var35 * (float)var5;
            var17 -= var36 * (float)var5;
            var19 -= var37 * (float)var5;
            var21 -= var38 * (float)var5;
            var23 -= var39 * (float)var5;
            var25 -= var40 * (float)var5;
            var27 -= var41 * (float)var5;
            var5 = 0;
         }
      }

      if(var5 < var6) {
         var29 = var6 - var5;

         for(var4 += var5; var29-- > 0; var27 += var41) {
            float var42 = 1.0F / var7;
            float var43 = 1.0F / var9;
            if(!var1 || var42 < this.aFloatArray_3493[var4]) {
               float var44 = var11 * var43;
               float var45 = var13 * var43;
               int var46 = (int)(var44 * (float)this.anInt_3497 * this.aFloat_3496) & this.anInt_3498;
               int var47 = (int)(var45 * (float)this.anInt_3497 * this.aFloat_3496) & this.anInt_3498;
               int var48 = this.anIntArray_3474[var47 * this.anInt_3497 + var46];
               var46 = (int)(var44 * (float)this.anInt_3504 * this.aFloat_3506) & this.anInt_3505;
               var47 = (int)(var45 * (float)this.anInt_3504 * this.aFloat_3506) & this.anInt_3505;
               int var49 = this.anIntArray_3503[var47 * this.anInt_3504 + var46];
               var46 = (int)(var44 * (float)this.anInt_3482 * this.aFloat_3478) & this.anInt_3510;
               var47 = (int)(var45 * (float)this.anInt_3482 * this.aFloat_3478) & this.anInt_3510;
               int var50 = this.anIntArray_3508[var47 * this.anInt_3482 + var46];
               float var51 = 1.0F - (var25 + var27);
               var48 = -16777216 | (int)(var25 * (float)(var48 >> 16 & 255)) << 16 | (int)(var25 * (float)(var48 >> 8 & 255)) << 8 | (int)(var25 * (float)(var48 & 255));
               var49 = -16777216 | (int)(var27 * (float)(var49 >> 16 & 255)) << 16 | (int)(var27 * (float)(var49 >> 8 & 255)) << 8 | (int)(var27 * (float)(var49 & 255));
               var50 = -16777216 | (int)(var51 * (float)(var50 >> 16 & 255)) << 16 | (int)(var51 * (float)(var50 >> 8 & 255)) << 8 | (int)(var51 * (float)(var50 & 255));
               int var52 = var48 + var49 + var50;
               int var53 = -16777216 | (int)(var19 * (float)(var52 >> 16 & 255)) << 8 & 16711680 | (int)(var21 * (float)(var52 >> 8 & 255)) & '\uff00' | (int)(var23 * (float)(var52 & 255)) >> 8;
               if(var15 != 0.0F) {
                  int var54 = (int)(255.0F - var15);
                  int var55 = ((this.anInt_3494 & 16711935) * (int)var15 & -16711936 | (this.anInt_3494 & '\uff00') * (int)var15 & 16711680) >>> 8;
                  var53 = (((var53 & 16711935) * var54 & -16711936 | (var53 & '\uff00') * var54 & 16711680) >>> 8) + var55;
               }

               if(var2) {
                  var3[var4] = ((int)var17 | var3[var4] >> 24) << 24 | var53;
               } else {
                  var3[var4] = var53;
               }

               if(var1) {
                  this.aFloatArray_3493[var4] = var42;
               }
            }

            ++var4;
            var7 += var31;
            var9 += var32;
            var11 += var33;
            var13 += var34;
            var15 += var35;
            var17 += var36;
            var19 += var37;
            var21 += var38;
            var23 += var39;
            var25 += var40;
         }

      }
   }

   final void method2567(boolean var1, boolean var2, boolean var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11, float var12, int var13, int var14, int var15) {
      if(!var1) {
         this.method2562(false, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, 0);
      } else if(this.aBoolean_3511) {
         this.aRenderer_Sub1_3499.method1919((int)var7, (int)var4, (int)var8, (int)var5, -16777216 | var13, -1497172058);
         this.aRenderer_Sub1_3499.method1919((int)var8, (int)var5, (int)var9, (int)var6, -16777216 | var13, 186409423);
         this.aRenderer_Sub1_3499.method1919((int)var9, (int)var6, (int)var7, (int)var4, -16777216 | var13, -1849075657);
      } else {
         float var16 = var8 - var7;
         float var17 = var5 - var4;
         float var18 = var9 - var7;
         float var19 = var6 - var4;
         float var20 = var11 - var10;
         float var21 = var12 - var10;
         float rDiff1 = (float)((var14 & 16711680) - (var13 & 16711680));
         float rDiff2 = (float)((var15 & 16711680) - (var13 & 16711680));
         float gDiff1 = (float)((var14 & '\uff00') - (var13 & '\uff00'));
         float gDiff2 = (float)((var15 & '\uff00') - (var13 & '\uff00'));
         float bDiff1 = (float)((var14 & 255) - (var13 & 255));
         float bDiff2 = (float)((var15 & 255) - (var13 & 255));
         float var28;
         if(var6 != var5) {
            var28 = (var9 - var8) / (var6 - var5);
         } else {
            var28 = 0.0F;
         }

         float var29;
         if(var5 != var4) {
            var29 = var16 / var17;
         } else {
            var29 = 0.0F;
         }

         float var30;
         if(var6 != var4) {
            var30 = var18 / var19;
         } else {
            var30 = 0.0F;
         }

         float var31 = var16 * var19 - var18 * var17;
         if(var31 != 0.0F) {
            float var32 = (var20 * var19 - var21 * var17) / var31;
            float var33 = (var21 * var16 - var20 * var18) / var31;
            float var34 = (rDiff1 * var19 - rDiff2 * var17) / var31;
            float var35 = (rDiff2 * var16 - rDiff1 * var18) / var31;
            float var36 = (gDiff1 * var19 - gDiff2 * var17) / var31;
            float var37 = (gDiff2 * var16 - gDiff1 * var18) / var31;
            float var38 = (bDiff1 * var19 - bDiff2 * var17) / var31;
            float var39 = (bDiff2 * var16 - bDiff1 * var18) / var31;
            float var42;
            float var40;
            float var41;
            if(var4 <= var5 && var4 <= var6) {
               if(var4 < (float)this.anInt_3480) {
                  if(var5 > (float)this.anInt_3480) {
                     var5 = (float)this.anInt_3480;
                  }

                  if(var6 > (float)this.anInt_3480) {
                     var6 = (float)this.anInt_3480;
                  }

                  var10 = var10 - var32 * var7 + var32;
                  var40 = (float)(var13 & 16711680) - var34 * var7 + var34;
                  var41 = (float)(var13 & '\uff00') - var36 * var7 + var36;
                  var42 = (float)(var13 & 255) - var38 * var7 + var38;
                  if(var5 < var6) {
                     var9 = var7;
                     if(var4 < 0.0F) {
                        var9 = var7 - var30 * var4;
                        var7 -= var29 * var4;
                        var10 -= var33 * var4;
                        var40 -= var35 * var4;
                        var41 -= var37 * var4;
                        var42 -= var39 * var4;
                        var4 = 0.0F;
                     }

                     if(var5 < 0.0F) {
                        var8 -= var28 * var5;
                        var5 = 0.0F;
                     }

                     if((var4 == var5 || var30 >= var29) && (var4 != var5 || var30 <= var28)) {
                        var4 = (float)((int)(var4 + 0.5F));
                        var5 = (float)((int)(var5 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F)) - var5;
                        var5 -= var4;

                        for(var4 = (float)this.anIntArray_3492[(int)var4]; --var5 >= 0.0F; var4 += (float)this.anInt_3491) {
                           this.method2571(var2, var3, this.anIntArray_3486, (int)var4, 0, 0, (int)var7, (int)var9, var10, var32, var40, var34, var41, var36, var42, var38);
                           var9 += var30;
                           var7 += var29;
                           var10 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var6 >= 0.0F) {
                           this.method2571(var2, var3, this.anIntArray_3486, (int)var4, 0, 0, (int)var8, (int)var9, var10, var32, var40, var34, var41, var36, var42, var38);
                           var9 += var30;
                           var8 += var28;
                           var10 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var4 += (float)this.anInt_3491;
                        }

                     } else {
                        var4 = (float)((int)(var4 + 0.5F));
                        var5 = (float)((int)(var5 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F)) - var5;
                        var5 -= var4;

                        for(var4 = (float)this.anIntArray_3492[(int)var4]; --var5 >= 0.0F; var4 += (float)this.anInt_3491) {
                           this.method2571(var2, var3, this.anIntArray_3486, (int)var4, 0, 0, (int)var9, (int)var7, var10, var32, var40, var34, var41, var36, var42, var38);
                           var9 += var30;
                           var7 += var29;
                           var10 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var6 >= 0.0F) {
                           this.method2571(var2, var3, this.anIntArray_3486, (int)var4, 0, 0, (int)var9, (int)var8, var10, var32, var40, var34, var41, var36, var42, var38);
                           var9 += var30;
                           var8 += var28;
                           var10 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var4 += (float)this.anInt_3491;
                        }

                     }
                  } else {
                     var8 = var7;
                     if(var4 < 0.0F) {
                        var8 = var7 - var30 * var4;
                        var7 -= var29 * var4;
                        var10 -= var33 * var4;
                        var40 -= var35 * var4;
                        var41 -= var37 * var4;
                        var42 -= var39 * var4;
                        var4 = 0.0F;
                     }

                     if(var6 < 0.0F) {
                        var9 -= var28 * var6;
                        var6 = 0.0F;
                     }

                     if((var4 == var6 || var30 >= var29) && (var4 != var6 || var28 <= var29)) {
                        var4 = (float)((int)(var4 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F));
                        var5 = (float)((int)(var5 + 0.5F)) - var6;
                        var6 -= var4;

                        for(var4 = (float)this.anIntArray_3492[(int)var4]; --var6 >= 0.0F; var4 += (float)this.anInt_3491) {
                           this.method2571(var2, var3, this.anIntArray_3486, (int)var4, 0, 0, (int)var7, (int)var8, var10, var32, var40, var34, var41, var36, var42, var38);
                           var8 += var30;
                           var7 += var29;
                           var10 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var5 >= 0.0F) {
                           this.method2571(var2, var3, this.anIntArray_3486, (int)var4, 0, 0, (int)var7, (int)var9, var10, var32, var40, var34, var41, var36, var42, var38);
                           var9 += var28;
                           var7 += var29;
                           var10 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var4 += (float)this.anInt_3491;
                        }

                     } else {
                        var4 = (float)((int)(var4 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F));
                        var5 = (float)((int)(var5 + 0.5F)) - var6;
                        var6 -= var4;

                        for(var4 = (float)this.anIntArray_3492[(int)var4]; --var6 >= 0.0F; var4 += (float)this.anInt_3491) {
                           this.method2571(var2, var3, this.anIntArray_3486, (int)var4, 0, 0, (int)var8, (int)var7, var10, var32, var40, var34, var41, var36, var42, var38);
                           var8 += var30;
                           var7 += var29;
                           var10 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var5 >= 0.0F) {
                           this.method2571(var2, var3, this.anIntArray_3486, (int)var4, 0, 0, (int)var9, (int)var7, var10, var32, var40, var34, var41, var36, var42, var38);
                           var9 += var28;
                           var7 += var29;
                           var10 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var4 += (float)this.anInt_3491;
                        }

                     }
                  }
               }
            } else if(var5 <= var6) {
               if(var5 < (float)this.anInt_3480) {
                  if(var6 > (float)this.anInt_3480) {
                     var6 = (float)this.anInt_3480;
                  }

                  if(var4 > (float)this.anInt_3480) {
                     var4 = (float)this.anInt_3480;
                  }

                  var11 = var11 - var32 * var8 + var32;
                  var40 = (float)(var14 & 16711680) - var34 * var8 + var34;
                  var41 = (float)(var14 & '\uff00') - var36 * var8 + var36;
                  var42 = (float)(var14 & 255) - var38 * var8 + var38;
                  if(var6 < var4) {
                     var7 = var8;
                     if(var5 < 0.0F) {
                        var7 = var8 - var29 * var5;
                        var8 -= var28 * var5;
                        var11 -= var33 * var5;
                        var40 -= var35 * var5;
                        var41 -= var37 * var5;
                        var42 -= var39 * var5;
                        var5 = 0.0F;
                     }

                     if(var6 < 0.0F) {
                        var9 -= var30 * var6;
                        var6 = 0.0F;
                     }

                     if((var5 == var6 || var29 >= var28) && (var5 != var6 || var29 <= var30)) {
                        var5 = (float)((int)(var5 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F));
                        var4 = (float)((int)(var4 + 0.5F)) - var6;
                        var6 -= var5;

                        for(var5 = (float)this.anIntArray_3492[(int)var5]; --var6 >= 0.0F; var5 += (float)this.anInt_3491) {
                           this.method2571(var2, var3, this.anIntArray_3486, (int)var5, 0, 0, (int)var8, (int)var7, var11, var32, var40, var34, var41, var36, var42, var38);
                           var7 += var29;
                           var8 += var28;
                           var11 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var4 >= 0.0F) {
                           this.method2571(var2, var3, this.anIntArray_3486, (int)var5, 0, 0, (int)var9, (int)var7, var11, var32, var40, var34, var41, var36, var42, var38);
                           var7 += var29;
                           var9 += var30;
                           var11 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var5 += (float)this.anInt_3491;
                        }

                     } else {
                        var5 = (float)((int)(var5 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F));
                        var4 = (float)((int)(var4 + 0.5F)) - var6;
                        var6 -= var5;

                        for(var5 = (float)this.anIntArray_3492[(int)var5]; --var6 >= 0.0F; var5 += (float)this.anInt_3491) {
                           this.method2571(var2, var3, this.anIntArray_3486, (int)var5, 0, 0, (int)var7, (int)var8, var11, var32, var40, var34, var41, var36, var42, var38);
                           var7 += var29;
                           var8 += var28;
                           var11 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var4 >= 0.0F) {
                           this.method2571(var2, var3, this.anIntArray_3486, (int)var5, 0, 0, (int)var7, (int)var9, var11, var32, var40, var34, var41, var36, var42, var38);
                           var7 += var29;
                           var9 += var30;
                           var11 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var5 += (float)this.anInt_3491;
                        }

                     }
                  } else {
                     var9 = var8;
                     if(var5 < 0.0F) {
                        var9 = var8 - var29 * var5;
                        var8 -= var28 * var5;
                        var11 -= var33 * var5;
                        var40 -= var35 * var5;
                        var41 -= var37 * var5;
                        var42 -= var39 * var5;
                        var5 = 0.0F;
                     }

                     if(var4 < 0.0F) {
                        var7 -= var30 * var4;
                        var4 = 0.0F;
                     }

                     if(var29 < var28) {
                        var5 = (float)((int)(var5 + 0.5F));
                        var4 = (float)((int)(var4 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F)) - var4;
                        var4 -= var5;

                        for(var5 = (float)this.anIntArray_3492[(int)var5]; --var4 >= 0.0F; var5 += (float)this.anInt_3491) {
                           this.method2571(var2, var3, this.anIntArray_3486, (int)var5, 0, 0, (int)var9, (int)var8, var11, var32, var40, var34, var41, var36, var42, var38);
                           var9 += var29;
                           var8 += var28;
                           var11 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var6 >= 0.0F) {
                           this.method2571(var2, var3, this.anIntArray_3486, (int)var5, 0, 0, (int)var7, (int)var8, var11, var32, var40, var34, var41, var36, var42, var38);
                           var7 += var30;
                           var8 += var28;
                           var11 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var5 += (float)this.anInt_3491;
                        }

                     } else {
                        var5 = (float)((int)(var5 + 0.5F));
                        var4 = (float)((int)(var4 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F)) - var4;
                        var4 -= var5;

                        for(var5 = (float)this.anIntArray_3492[(int)var5]; --var4 >= 0.0F; var5 += (float)this.anInt_3491) {
                           this.method2571(var2, var3, this.anIntArray_3486, (int)var5, 0, 0, (int)var8, (int)var9, var11, var32, var40, var34, var41, var36, var42, var38);
                           var9 += var29;
                           var8 += var28;
                           var11 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var6 >= 0.0F) {
                           this.method2571(var2, var3, this.anIntArray_3486, (int)var5, 0, 0, (int)var8, (int)var7, var11, var32, var40, var34, var41, var36, var42, var38);
                           var7 += var30;
                           var8 += var28;
                           var11 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var5 += (float)this.anInt_3491;
                        }

                     }
                  }
               }
            } else if(var6 < (float)this.anInt_3480) {
               if(var4 > (float)this.anInt_3480) {
                  var4 = (float)this.anInt_3480;
               }

               if(var5 > (float)this.anInt_3480) {
                  var5 = (float)this.anInt_3480;
               }

               var12 = var12 - var32 * var9 + var32;
               var40 = (float)(var15 & 16711680) - var34 * var9 + var34;
               var41 = (float)(var15 & '\uff00') - var36 * var9 + var36;
               var42 = (float)(var15 & 255) - var38 * var9 + var38;
               if(var4 < var5) {
                  var8 = var9;
                  if(var6 < 0.0F) {
                     var8 = var9 - var28 * var6;
                     var9 -= var30 * var6;
                     var12 -= var33 * var6;
                     var40 -= var35 * var6;
                     var41 -= var37 * var6;
                     var42 -= var39 * var6;
                     var6 = 0.0F;
                  }

                  if(var4 < 0.0F) {
                     var7 -= var29 * var4;
                     var4 = 0.0F;
                  }

                  if(var28 < var30) {
                     var6 = (float)((int)(var6 + 0.5F));
                     var4 = (float)((int)(var4 + 0.5F));
                     var5 = (float)((int)(var5 + 0.5F)) - var4;
                     var4 -= var6;

                     for(var6 = (float)this.anIntArray_3492[(int)var6]; --var4 >= 0.0F; var6 += (float)this.anInt_3491) {
                        this.method2571(var2, var3, this.anIntArray_3486, (int)var6, 0, 0, (int)var8, (int)var9, var12, var32, var40, var34, var41, var36, var42, var38);
                        var8 += var28;
                        var9 += var30;
                        var12 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                     }

                     while(--var5 >= 0.0F) {
                        this.method2571(var2, var3, this.anIntArray_3486, (int)var6, 0, 0, (int)var8, (int)var7, var12, var32, var40, var34, var41, var36, var42, var38);
                        var8 += var28;
                        var7 += var29;
                        var12 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                        var6 += (float)this.anInt_3491;
                     }

                  } else {
                     var6 = (float)((int)(var6 + 0.5F));
                     var4 = (float)((int)(var4 + 0.5F));
                     var5 = (float)((int)(var5 + 0.5F)) - var4;
                     var4 -= var6;

                     for(var6 = (float)this.anIntArray_3492[(int)var6]; --var4 >= 0.0F; var6 += (float)this.anInt_3491) {
                        this.method2571(var2, var3, this.anIntArray_3486, (int)var6, 0, 0, (int)var9, (int)var8, var12, var32, var40, var34, var41, var36, var42, var38);
                        var8 += var28;
                        var9 += var30;
                        var12 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                     }

                     while(--var5 >= 0.0F) {
                        this.method2571(var2, var3, this.anIntArray_3486, (int)var6, 0, 0, (int)var7, (int)var8, var12, var32, var40, var34, var41, var36, var42, var38);
                        var8 += var28;
                        var7 += var29;
                        var12 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                        var6 += (float)this.anInt_3491;
                     }

                  }
               } else {
                  var7 = var9;
                  if(var6 < 0.0F) {
                     var7 = var9 - var28 * var6;
                     var9 -= var30 * var6;
                     var12 -= var33 * var6;
                     var40 -= var35 * var6;
                     var41 -= var37 * var6;
                     var42 -= var39 * var6;
                     var6 = 0.0F;
                  }

                  if(var5 < 0.0F) {
                     var8 -= var29 * var5;
                     var5 = 0.0F;
                  }

                  if(var28 < var30) {
                     var6 = (float)((int)(var6 + 0.5F));
                     var5 = (float)((int)(var5 + 0.5F));
                     var4 = (float)((int)(var4 + 0.5F)) - var5;
                     var5 -= var6;

                     for(var6 = (float)this.anIntArray_3492[(int)var6]; --var5 >= 0.0F; var6 += (float)this.anInt_3491) {
                        this.method2571(var2, var3, this.anIntArray_3486, (int)var6, 0, 0, (int)var7, (int)var9, var12, var32, var40, var34, var41, var36, var42, var38);
                        var7 += var28;
                        var9 += var30;
                        var12 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                     }

                     while(--var4 >= 0.0F) {
                        this.method2571(var2, var3, this.anIntArray_3486, (int)var6, 0, 0, (int)var8, (int)var9, var12, var32, var40, var34, var41, var36, var42, var38);
                        var8 += var29;
                        var9 += var30;
                        var12 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                        var6 += (float)this.anInt_3491;
                     }

                  } else {
                     var6 = (float)((int)(var6 + 0.5F));
                     var5 = (float)((int)(var5 + 0.5F));
                     var4 = (float)((int)(var4 + 0.5F)) - var5;
                     var5 -= var6;

                     for(var6 = (float)this.anIntArray_3492[(int)var6]; --var5 >= 0.0F; var6 += (float)this.anInt_3491) {
                        this.method2571(var2, var3, this.anIntArray_3486, (int)var6, 0, 0, (int)var9, (int)var7, var12, var32, var40, var34, var41, var36, var42, var38);
                        var7 += var28;
                        var9 += var30;
                        var12 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                     }

                     while(--var4 >= 0.0F) {
                        this.method2571(var2, var3, this.anIntArray_3486, (int)var6, 0, 0, (int)var9, (int)var8, var12, var32, var40, var34, var41, var36, var42, var38);
                        var8 += var29;
                        var9 += var30;
                        var12 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                        var6 += (float)this.anInt_3491;
                     }

                  }
               }
            }
         }
      }
   }

   final void method2568(boolean var1, boolean var2, boolean var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11, float var12, float var13, float var14, float var15, float var16, float var17, float var18, float var19, float var20, float var21, int var22, int var23, int var24, int var25, float var26, float var27, float var28, int var29, int var30) {
      if(!var1) {
         this.method2562(false, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, 0);
      } else {
         int var31 = (var29 & '\uffff') << 16 | var30 & '\uffff';
         int var33;
         if(var31 != this.anInt_3488) {
            this.anIntArray_3474 = this.aRenderer_Sub1_3499.method6736(var29, var30);
            if(this.anIntArray_3474 == null) {
               this.anInt_3488 = -1;
               this.anInt_3509 = 255 - (var22 >> 24 & 255);
               int var76 = Class561.colourMap[CacheFileID.method1398(this.aRenderer_Sub1_3499.method6739(var29), 1122342337) & '\uffff'];
               var33 = -16777216 | (var22 >> 16 & 255) * (var76 >> 16 & 255) << 8 & 16711680 | (var22 >> 8 & 255) * (var76 >> 8 & 255) & '\uff00' | (var22 & 255) * (var76 & 255) >> 8;
               this.method2567(true, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, Class104_Sub20.method7394(var33, var25, var26, -670961066), Class104_Sub20.method7394(var33, var25, var27, -1748786778), Class104_Sub20.method7394(var33, var25, var28, -1876034252));
               return;
            }

            this.anInt_3488 = var31;
            this.anInt_3497 = this.aRenderer_Sub1_3499.method6776(var29);
            this.anInt_3498 = this.anInt_3497 - 1;
            this.aClass620_3500 = this.aRenderer_Sub1_3499.method6738(var29);
            this.aBoolean_3501 = this.aRenderer_Sub1_3499.method6839(var29);
         }

         this.anInt_3494 = var25;
         float var32;
         if(var4 > var5 || var4 > var6) {
            if(var5 <= var6) {
               var32 = var7;
               var7 = var8;
               var8 = var32;
               var32 = var4;
               var4 = var5;
               var5 = var32;
               var32 = var10;
               var10 = var11;
               var11 = var32;
               var32 = var16;
               var16 = var17;
               var17 = var32;
               var32 = var19;
               var19 = var20;
               var20 = var32;
               var32 = var13;
               var13 = var14;
               var14 = var32;
               var32 = var26;
               var26 = var27;
               var27 = var32;
               var33 = var22;
               var22 = var23;
               var23 = var33;
            } else {
               var32 = var7;
               var7 = var9;
               var9 = var32;
               var32 = var4;
               var4 = var6;
               var6 = var32;
               var32 = var10;
               var10 = var12;
               var12 = var32;
               var32 = var16;
               var16 = var18;
               var18 = var32;
               var32 = var19;
               var19 = var21;
               var21 = var32;
               var32 = var13;
               var13 = var15;
               var15 = var32;
               var32 = var26;
               var26 = var28;
               var28 = var32;
               var33 = var22;
               var22 = var24;
               var24 = var33;
            }
         }

         var16 /= var13;
         var17 /= var14;
         var18 /= var15;
         var19 /= var13;
         var20 /= var14;
         var21 /= var15;
         var10 = 1.0F / var10;
         var11 = 1.0F / var11;
         var12 = 1.0F / var12;
         var13 = 1.0F / var13;
         var14 = 1.0F / var14;
         var15 = 1.0F / var15;
         var32 = (float)(var22 >> 24 & 255);
         float var75 = (float)(var23 >> 24 & 255);
         float var34 = (float)(var24 >> 24 & 255);
         float var35 = (float)(var22 >> 16 & 255);
         float var36 = (float)(var23 >> 16 & 255);
         float var37 = (float)(var24 >> 16 & 255);
         float var38 = (float)(var22 >> 8 & 255);
         float var39 = (float)(var23 >> 8 & 255);
         float var40 = (float)(var24 >> 8 & 255);
         float var41 = (float)(var22 & 255);
         float var42 = (float)(var23 & 255);
         float var43 = (float)(var24 & 255);
         float var44 = 0.0F;
         float var45 = 0.0F;
         float var46 = 0.0F;
         float var47 = 0.0F;
         float var48 = 0.0F;
         float var49 = 0.0F;
         float var50 = 0.0F;
         float var51 = 0.0F;
         float var52 = 0.0F;
         float var53 = 0.0F;
         float var54;
         if(var5 != var4) {
            var54 = var5 - var4;
            var44 = (var8 - var7) / var54;
            var45 = (var11 - var10) / var54;
            var46 = (var14 - var13) / var54;
            var47 = (var17 - var16) / var54;
            var48 = (var20 - var19) / var54;
            var49 = (var27 - var26) / var54;
            var50 = (var75 - var32) / var54;
            var51 = (var36 - var35) / var54;
            var52 = (var39 - var38) / var54;
            var53 = (var42 - var41) / var54;
         }

         var54 = 0.0F;
         float var55 = 0.0F;
         float var56 = 0.0F;
         float var57 = 0.0F;
         float var58 = 0.0F;
         float var59 = 0.0F;
         float var60 = 0.0F;
         float var61 = 0.0F;
         float var62 = 0.0F;
         float var63 = 0.0F;
         float var64;
         if(var6 != var5) {
            var64 = var6 - var5;
            var54 = (var9 - var8) / var64;
            var55 = (var12 - var11) / var64;
            var56 = (var15 - var14) / var64;
            var57 = (var18 - var17) / var64;
            var58 = (var21 - var20) / var64;
            var59 = (var28 - var27) / var64;
            var60 = (var34 - var75) / var64;
            var61 = (var37 - var36) / var64;
            var62 = (var40 - var39) / var64;
            var63 = (var43 - var42) / var64;
         }

         var64 = 0.0F;
         float var65 = 0.0F;
         float var66 = 0.0F;
         float var67 = 0.0F;
         float var68 = 0.0F;
         float var69 = 0.0F;
         float var70 = 0.0F;
         float var71 = 0.0F;
         float var72 = 0.0F;
         float var73 = 0.0F;
         if(var4 != var6) {
            float var74 = var4 - var6;
            var64 = (var7 - var9) / var74;
            var65 = (var10 - var12) / var74;
            var66 = (var13 - var15) / var74;
            var67 = (var16 - var18) / var74;
            var68 = (var19 - var21) / var74;
            var69 = (var26 - var28) / var74;
            var70 = (var32 - var34) / var74;
            var71 = (var35 - var37) / var74;
            var72 = (var38 - var40) / var74;
            var73 = (var41 - var43) / var74;
         }

         if(var4 < (float)this.anInt_3480) {
            if(var5 > (float)this.anInt_3480) {
               var5 = (float)this.anInt_3480;
            }

            if(var6 > (float)this.anInt_3480) {
               var6 = (float)this.anInt_3480;
            }

            if(var5 < var6) {
               var9 = var7;
               var12 = var10;
               var15 = var13;
               var18 = var16;
               var21 = var19;
               var28 = var26;
               var34 = var32;
               var37 = var35;
               var40 = var38;
               var43 = var41;
               if(var4 < 0.0F) {
                  var7 -= var44 * var4;
                  var9 -= var64 * var4;
                  var10 -= var45 * var4;
                  var12 -= var65 * var4;
                  var13 -= var46 * var4;
                  var15 -= var66 * var4;
                  var16 -= var47 * var4;
                  var18 -= var67 * var4;
                  var19 -= var48 * var4;
                  var21 -= var68 * var4;
                  var26 -= var49 * var4;
                  var28 -= var69 * var4;
                  var32 -= var50 * var4;
                  var34 -= var70 * var4;
                  var35 -= var50 * var4;
                  var37 -= var70 * var4;
                  var38 -= var50 * var4;
                  var40 -= var70 * var4;
                  var41 -= var50 * var4;
                  var43 -= var70 * var4;
                  var4 = 0.0F;
               }

               if(var5 < 0.0F) {
                  var8 -= var54 * var5;
                  var11 -= var55 * var5;
                  var14 -= var56 * var5;
                  var17 -= var57 * var5;
                  var20 -= var58 * var5;
                  var27 -= var59 * var5;
                  var75 -= var60 * var5;
                  var36 -= var61 * var5;
                  var39 -= var62 * var5;
                  var42 -= var63 * var5;
                  var5 = 0.0F;
               }

               if((var4 == var5 || var64 >= var44) && (var4 != var5 || var64 <= var54)) {
                  var4 = (float)((int)(var4 + 0.5F));
                  var5 = (float)((int)(var5 + 0.5F));
                  var6 = (float)((int)(var6 + 0.5F)) - var5;
                  var5 -= var4;

                  for(var4 = (float)this.anIntArray_3492[(int)var4]; --var5 >= 0.0F; var4 += (float)this.anInt_3491) {
                     this.method2564(var2, var3, this.anIntArray_3486, this.anIntArray_3474, (int)var4, (int)var7, (int)var9, var10, var12, var13, var15, var16, var18, var19, var21, var26, var28, var32, var34, var35, var37, var38, var40, var41, var43);
                     var7 += var44;
                     var9 += var64;
                     var10 += var45;
                     var12 += var65;
                     var13 += var46;
                     var15 += var66;
                     var16 += var47;
                     var18 += var67;
                     var19 += var48;
                     var21 += var68;
                     var26 += var49;
                     var28 += var69;
                     var32 += var50;
                     var34 += var70;
                     var35 += var51;
                     var37 += var71;
                     var38 += var52;
                     var40 += var72;
                     var41 += var53;
                     var43 += var73;
                  }

                  while(--var6 >= 0.0F) {
                     this.method2564(var2, var3, this.anIntArray_3486, this.anIntArray_3474, (int)var4, (int)var8, (int)var9, var11, var12, var14, var15, var17, var18, var20, var21, var27, var28, var75, var34, var36, var37, var39, var40, var42, var43);
                     var8 += var54;
                     var9 += var64;
                     var11 += var55;
                     var12 += var65;
                     var14 += var56;
                     var15 += var66;
                     var17 += var57;
                     var18 += var67;
                     var20 += var58;
                     var21 += var68;
                     var27 += var59;
                     var28 += var69;
                     var75 += var60;
                     var34 += var70;
                     var36 += var61;
                     var37 += var71;
                     var39 += var62;
                     var40 += var72;
                     var42 += var63;
                     var43 += var73;
                     var4 += (float)this.anInt_3491;
                  }
               } else {
                  var4 = (float)((int)(var4 + 0.5F));
                  var5 = (float)((int)(var5 + 0.5F));
                  var6 = (float)((int)(var6 + 0.5F)) - var5;
                  var5 -= var4;

                  for(var4 = (float)this.anIntArray_3492[(int)var4]; --var5 >= 0.0F; var4 += (float)this.anInt_3491) {
                     this.method2564(var2, var3, this.anIntArray_3486, this.anIntArray_3474, (int)var4, (int)var9, (int)var7, var12, var10, var15, var13, var18, var16, var21, var19, var28, var26, var34, var32, var37, var35, var40, var38, var43, var41);
                     var7 += var44;
                     var9 += var64;
                     var10 += var45;
                     var12 += var65;
                     var13 += var46;
                     var15 += var66;
                     var16 += var47;
                     var18 += var67;
                     var19 += var48;
                     var21 += var68;
                     var26 += var49;
                     var28 += var69;
                     var32 += var50;
                     var34 += var70;
                     var35 += var51;
                     var37 += var71;
                     var38 += var52;
                     var40 += var72;
                     var41 += var53;
                     var43 += var73;
                  }

                  while(--var6 >= 0.0F) {
                     this.method2564(var2, var3, this.anIntArray_3486, this.anIntArray_3474, (int)var4, (int)var9, (int)var8, var12, var11, var15, var14, var18, var17, var21, var20, var28, var27, var34, var75, var37, var36, var40, var39, var43, var42);
                     var8 += var54;
                     var9 += var64;
                     var11 += var55;
                     var12 += var65;
                     var14 += var56;
                     var15 += var66;
                     var17 += var57;
                     var18 += var67;
                     var20 += var58;
                     var21 += var68;
                     var27 += var59;
                     var28 += var69;
                     var75 += var60;
                     var34 += var70;
                     var36 += var61;
                     var37 += var71;
                     var39 += var62;
                     var40 += var72;
                     var42 += var63;
                     var43 += var73;
                     var4 += (float)this.anInt_3491;
                  }
               }
            } else {
               var8 = var7;
               var11 = var10;
               var14 = var13;
               var17 = var16;
               var20 = var19;
               var27 = var26;
               var75 = var32;
               var36 = var35;
               var39 = var38;
               var42 = var41;
               if(var4 < 0.0F) {
                  var7 -= var44 * var4;
                  var8 -= var64 * var4;
                  var10 -= var45 * var4;
                  var11 -= var65 * var4;
                  var13 -= var46 * var4;
                  var14 -= var66 * var4;
                  var16 -= var47 * var4;
                  var17 -= var67 * var4;
                  var19 -= var48 * var4;
                  var20 -= var68 * var4;
                  var26 -= var49 * var4;
                  var27 -= var69 * var4;
                  var32 -= var50 * var4;
                  var75 -= var70 * var4;
                  var35 -= var50 * var4;
                  var36 -= var70 * var4;
                  var38 -= var50 * var4;
                  var39 -= var70 * var4;
                  var41 -= var50 * var4;
                  var42 -= var70 * var4;
                  var4 = 0.0F;
               }

               if(var6 < 0.0F) {
                  var9 -= var54 * var6;
                  var12 -= var55 * var6;
                  var15 -= var56 * var6;
                  var18 -= var57 * var6;
                  var21 -= var58 * var6;
                  var28 -= var59 * var6;
                  var34 -= var60 * var6;
                  var37 -= var61 * var6;
                  var40 -= var62 * var6;
                  var43 -= var63 * var6;
                  var6 = 0.0F;
               }

               if((var4 == var6 || var64 >= var44) && (var4 != var6 || var54 <= var44)) {
                  var4 = (float)((int)(var4 + 0.5F));
                  var6 = (float)((int)(var6 + 0.5F));
                  var5 = (float)((int)(var5 + 0.5F)) - var6;
                  var6 -= var4;

                  for(var4 = (float)this.anIntArray_3492[(int)var4]; --var6 >= 0.0F; var4 += (float)this.anInt_3491) {
                     this.method2564(var2, var3, this.anIntArray_3486, this.anIntArray_3474, (int)var4, (int)var7, (int)var8, var10, var11, var13, var14, var16, var17, var19, var20, var26, var27, var32, var75, var35, var36, var38, var39, var41, var42);
                     var8 += var64;
                     var7 += var44;
                     var11 += var65;
                     var10 += var45;
                     var14 += var66;
                     var13 += var46;
                     var17 += var67;
                     var16 += var47;
                     var20 += var68;
                     var19 += var48;
                     var27 += var69;
                     var26 += var49;
                     var75 += var70;
                     var32 += var50;
                     var36 += var71;
                     var35 += var51;
                     var39 += var72;
                     var38 += var52;
                     var42 += var73;
                     var41 += var53;
                  }

                  while(--var5 >= 0.0F) {
                     this.method2564(var2, var3, this.anIntArray_3486, this.anIntArray_3474, (int)var4, (int)var7, (int)var9, var10, var12, var13, var15, var16, var18, var19, var21, var26, var28, var32, var34, var35, var37, var38, var40, var41, var43);
                     var7 += var44;
                     var9 += var54;
                     var10 += var45;
                     var12 += var55;
                     var13 += var46;
                     var15 += var56;
                     var16 += var47;
                     var18 += var57;
                     var19 += var48;
                     var21 += var58;
                     var26 += var49;
                     var28 += var59;
                     var32 += var50;
                     var34 += var60;
                     var35 += var51;
                     var37 += var61;
                     var38 += var52;
                     var40 += var62;
                     var41 += var53;
                     var43 += var63;
                     var4 += (float)this.anInt_3491;
                  }
               } else {
                  var4 = (float)((int)(var4 + 0.5F));
                  var6 = (float)((int)(var6 + 0.5F));
                  var5 = (float)((int)(var5 + 0.5F)) - var6;
                  var6 -= var4;

                  for(var4 = (float)this.anIntArray_3492[(int)var4]; --var6 >= 0.0F; var4 += (float)this.anInt_3491) {
                     this.method2564(var2, var3, this.anIntArray_3486, this.anIntArray_3474, (int)var4, (int)var8, (int)var7, var11, var10, var14, var13, var17, var16, var20, var19, var27, var26, var75, var32, var36, var35, var39, var38, var42, var41);
                     var7 += var44;
                     var8 += var64;
                     var10 += var45;
                     var11 += var65;
                     var13 += var46;
                     var14 += var66;
                     var16 += var47;
                     var17 += var67;
                     var19 += var48;
                     var20 += var68;
                     var26 += var49;
                     var27 += var69;
                     var32 += var50;
                     var75 += var70;
                     var35 += var51;
                     var36 += var71;
                     var38 += var52;
                     var39 += var72;
                     var41 += var53;
                     var42 += var73;
                  }

                  while(--var5 >= 0.0F) {
                     this.method2564(var2, var3, this.anIntArray_3486, this.anIntArray_3474, (int)var4, (int)var9, (int)var7, var12, var10, var15, var13, var18, var16, var21, var19, var28, var26, var34, var32, var37, var35, var40, var38, var43, var41);
                     var9 += var54;
                     var7 += var44;
                     var12 += var55;
                     var10 += var45;
                     var15 += var56;
                     var13 += var46;
                     var18 += var57;
                     var16 += var47;
                     var21 += var58;
                     var19 += var48;
                     var28 += var59;
                     var26 += var49;
                     var34 += var60;
                     var32 += var50;
                     var37 += var61;
                     var35 += var51;
                     var40 += var62;
                     var38 += var52;
                     var43 += var63;
                     var41 += var53;
                     var4 += (float)this.anInt_3491;
                  }
               }
            }

         }
      }
   }

   final void method2569(boolean var1, boolean var2, int[] var3, int var4, int var5, int var6, int var7, int var8, float var9, float var10, float var11, float var12) {
      if(this.aBoolean_3481) {
         if(var8 > this.anInt_3487) {
            var8 = this.anInt_3487;
         }

         if(var7 < 0) {
            var7 = 0;
         }
      }

      if(var7 < var8) {
         var4 += var7 - 1;
         var9 += var10 * (float)var7;
         var11 += var12 * (float)var7;
         int var13;
         int var14;
         int var15;
         if(this.aClass210_3507.aBoolean_3639) {
            if(this.aBoolean_3475) {
               var6 = var8 - var7 >> 2;
               var10 *= 4.0F;
               if(this.anInt_3509 == 0) {
                  if(var6 > 0) {
                     do {
                        var5 = Class561.colourMap[(int)var9 & '\uffff'];
                        var9 += var10;
                        ++var4;
                        if(!var1 || var11 < this.aFloatArray_3493[var4]) {
                           var3[var4] = var5;
                           if(var1) {
                              this.aFloatArray_3493[var4] = var11;
                           }
                        }

                        var11 += var12;
                        ++var4;
                        if(!var1 || var11 < this.aFloatArray_3493[var4]) {
                           var3[var4] = var5;
                           if(var1) {
                              this.aFloatArray_3493[var4] = var11;
                           }
                        }

                        var11 += var12;
                        ++var4;
                        if(!var1 || var11 < this.aFloatArray_3493[var4]) {
                           var3[var4] = var5;
                           if(var1) {
                              this.aFloatArray_3493[var4] = var11;
                           }
                        }

                        var11 += var12;
                        ++var4;
                        if(!var1 || var11 < this.aFloatArray_3493[var4]) {
                           var3[var4] = var5;
                           if(var1) {
                              this.aFloatArray_3493[var4] = var11;
                           }
                        }

                        var11 += var12;
                        --var6;
                     } while(var6 > 0);
                  }

                  var6 = var8 - var7 & 3;
                  if(var6 > 0) {
                     var5 = Class561.colourMap[(int)var9 & '\uffff'];

                     do {
                        ++var4;
                        if(!var1 || var11 < this.aFloatArray_3493[var4]) {
                           var3[var4] = var5;
                           if(var1) {
                              this.aFloatArray_3493[var4] = var11;
                           }
                        }

                        var11 += var12;
                        --var6;
                     } while(var6 > 0);
                  }
               } else {
                  var13 = this.anInt_3509;
                  var14 = 256 - this.anInt_3509;
                  if(var6 > 0) {
                     do {
                        var5 = Class561.colourMap[(int)var9 & '\uffff'];
                        var9 += var10;
                        var5 = ((var5 & 16711935) * var14 >> 8 & 16711935) + ((var5 & '\uff00') * var14 >> 8 & '\uff00');
                        ++var4;
                        if(!var1 || var11 < this.aFloatArray_3493[var4]) {
                           var15 = var3[var4];
                           if(var2) {
                              var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                           } else {
                              var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                           }

                           if(var1) {
                              this.aFloatArray_3493[var4] = var11;
                           }
                        }

                        var11 += var12;
                        ++var4;
                        if(!var1 || var11 < this.aFloatArray_3493[var4]) {
                           var15 = var3[var4];
                           if(var2) {
                              var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                           } else {
                              var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                           }

                           if(var1) {
                              this.aFloatArray_3493[var4] = var11;
                           }
                        }

                        var11 += var12;
                        ++var4;
                        if(!var1 || var11 < this.aFloatArray_3493[var4]) {
                           var15 = var3[var4];
                           if(var2) {
                              var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                           } else {
                              var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                           }

                           if(var1) {
                              this.aFloatArray_3493[var4] = var11;
                           }
                        }

                        var11 += var12;
                        ++var4;
                        if(!var1 || var11 < this.aFloatArray_3493[var4]) {
                           var15 = var3[var4];
                           if(var2) {
                              var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                           } else {
                              var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                           }

                           if(var1) {
                              this.aFloatArray_3493[var4] = var11;
                           }
                        }

                        var11 += var12;
                        --var6;
                     } while(var6 > 0);
                  }

                  var6 = var8 - var7 & 3;
                  if(var6 > 0) {
                     var5 = Class561.colourMap[(int)var9 & '\uffff'];
                     var5 = ((var5 & 16711935) * var14 >> 8 & 16711935) + ((var5 & '\uff00') * var14 >> 8 & '\uff00');

                     do {
                        ++var4;
                        if(!var1 || var11 < this.aFloatArray_3493[var4]) {
                           var15 = var3[var4];
                           if(var2) {
                              var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                           } else {
                              var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                           }

                           if(var1) {
                              this.aFloatArray_3493[var4] = var11;
                           }
                        }

                        var11 += var12;
                        --var6;
                     } while(var6 > 0);
                  }
               }
            } else {
               var6 = var8 - var7;
               if(this.anInt_3509 == 0) {
                  do {
                     ++var4;
                     if(!var1 || var11 < this.aFloatArray_3493[var4]) {
                        var3[var4] = Class561.colourMap[(int)var9 & '\uffff'];
                        if(var1) {
                           this.aFloatArray_3493[var4] = var11;
                        }
                     }

                     var11 += var12;
                     var9 += var10;
                     --var6;
                  } while(var6 > 0);
               } else {
                  var13 = this.anInt_3509;
                  var14 = 256 - this.anInt_3509;

                  do {
                     ++var4;
                     if(!var1 || var11 < this.aFloatArray_3493[var4]) {
                        var5 = Class561.colourMap[(int)var9 & '\uffff'];
                        var5 = ((var5 & 16711935) * var14 >> 8 & 16711935) + ((var5 & '\uff00') * var14 >> 8 & '\uff00');
                        var15 = var3[var4];
                        if(var2) {
                           var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                        } else {
                           var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                        }

                        if(var1) {
                           this.aFloatArray_3493[var4] = var11;
                        }
                     }

                     var9 += var10;
                     var11 += var12;
                     --var6;
                  } while(var6 > 0);
               }
            }
         } else if(this.aBoolean_3475) {
            var6 = var8 - var7 >> 2;
            var10 *= 4.0F;
            if(this.anInt_3509 == 0) {
               if(var6 > 0) {
                  do {
                     var5 = Class561.colourMap[(int)var9 & '\uffff'];
                     var9 += var10;
                     ++var4;
                     if(!var1 || var11 < this.aFloatArray_3493[var4]) {
                        var3[var4] = var5;
                     }

                     var11 += var12;
                     ++var4;
                     if(!var1 || var11 < this.aFloatArray_3493[var4]) {
                        var3[var4] = var5;
                     }

                     var11 += var12;
                     ++var4;
                     if(!var1 || var11 < this.aFloatArray_3493[var4]) {
                        var3[var4] = var5;
                     }

                     var11 += var12;
                     ++var4;
                     if(!var1 || var11 < this.aFloatArray_3493[var4]) {
                        var3[var4] = var5;
                     }

                     var11 += var12;
                     --var6;
                  } while(var6 > 0);
               }

               var6 = var8 - var7 & 3;
               if(var6 > 0) {
                  var5 = Class561.colourMap[(int)var9 & '\uffff'];

                  do {
                     ++var4;
                     if(!var1 || var11 < this.aFloatArray_3493[var4]) {
                        var3[var4] = var5;
                     }

                     var11 += var12;
                     --var6;
                  } while(var6 > 0);
               }
            } else {
               var13 = this.anInt_3509;
               var14 = 256 - this.anInt_3509;
               if(var6 > 0) {
                  do {
                     var5 = Class561.colourMap[(int)var9 & '\uffff'];
                     var9 += var10;
                     var5 = ((var5 & 16711935) * var14 >> 8 & 16711935) + ((var5 & '\uff00') * var14 >> 8 & '\uff00');
                     ++var4;
                     if(!var1 || var11 < this.aFloatArray_3493[var4]) {
                        var15 = var3[var4];
                        if(var2) {
                           var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                        } else {
                           var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                        }
                     }

                     var11 += var12;
                     ++var4;
                     if(!var1 || var11 < this.aFloatArray_3493[var4]) {
                        var15 = var3[var4];
                        if(var2) {
                           var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                        } else {
                           var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                        }
                     }

                     var11 += var12;
                     ++var4;
                     if(!var1 || var11 < this.aFloatArray_3493[var4]) {
                        var15 = var3[var4];
                        if(var2) {
                           var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                        } else {
                           var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                        }
                     }

                     var11 += var12;
                     ++var4;
                     if(!var1 || var11 < this.aFloatArray_3493[var4]) {
                        var15 = var3[var4];
                        if(var2) {
                           var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                        } else {
                           var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                        }
                     }

                     var11 += var12;
                     --var6;
                  } while(var6 > 0);
               }

               var6 = var8 - var7 & 3;
               if(var6 > 0) {
                  var5 = Class561.colourMap[(int)var9 & '\uffff'];
                  var5 = ((var5 & 16711935) * var14 >> 8 & 16711935) + ((var5 & '\uff00') * var14 >> 8 & '\uff00');

                  do {
                     ++var4;
                     if(!var1 || var11 < this.aFloatArray_3493[var4]) {
                        var15 = var3[var4];
                        if(var2) {
                           var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                        } else {
                           var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                        }
                     }

                     var11 += var12;
                     --var6;
                  } while(var6 > 0);
               }
            }
         } else {
            var6 = var8 - var7;
            if(this.anInt_3509 == 0) {
               do {
                  ++var4;
                  if(!var1 || var11 < this.aFloatArray_3493[var4]) {
                     var3[var4] = Class561.colourMap[(int)var9 & '\uffff'];
                  }

                  var11 += var12;
                  var9 += var10;
                  --var6;
               } while(var6 > 0);
            } else {
               var13 = this.anInt_3509;
               var14 = 256 - this.anInt_3509;

               do {
                  ++var4;
                  if(!var1 || var11 < this.aFloatArray_3493[var4]) {
                     var5 = Class561.colourMap[(int)var9 & '\uffff'];
                     var5 = ((var5 & 16711935) * var14 >> 8 & 16711935) + ((var5 & '\uff00') * var14 >> 8 & '\uff00');
                     var15 = var3[var4];
                     if(var2) {
                        var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                     } else {
                        var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                     }
                  }

                  var9 += var10;
                  var11 += var12;
                  --var6;
               } while(var6 > 0);
            }
         }

      }
   }

   int method2570() {
      return this.anIntArray_3492[0] / this.anInt_3491;
   }

   Class202(SoftwareRenderer var1, Class210 var2) {
      this.aRenderer_Sub1_3499 = var1;
      this.aClass210_3507 = var2;
      this.anInt_3491 = this.aRenderer_Sub1_3499.renderWidth * 1176497263;
      this.anIntArray_3486 = this.aRenderer_Sub1_3499.renderArray;
      this.aFloatArray_3493 = this.aRenderer_Sub1_3499.aFloatArray_10159;
      this.aClass620_3500 = Class620.aClass620_10020;
   }

   final void method2571(boolean var1, boolean var2, int[] var3, int var4, int var5, int var6, int var7, int var8, float var9, float var10, float var11, float var12, float var13, float var14, float var15, float var16) {
      if(this.aBoolean_3481) {
         if(var8 > this.anInt_3487) {
            var8 = this.anInt_3487;
         }

         if(var7 < 0) {
            var7 = 0;
         }
      }

      if(var7 < var8) {
         int var17;
         int var19;
         int var18;
         int var21;
         int var20;
         int var22;
         if(this.aBoolean_3479) {
            var4 += var7;
            var11 += var12 * (float)var7;
            var13 += var14 * (float)var7;
            var15 += var16 * (float)var7;
            if(this.aBoolean_3475) {
               var6 = var8 - var7 >> 2;
               var12 *= 4.0F;
               var14 *= 4.0F;
               var16 *= 4.0F;
               if(this.anInt_3509 == 0) {
                  if(var6 > 0) {
                     do {
                        var5 = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                        var11 += var12;
                        var13 += var14;
                        var15 += var16;
                        var3[var4++] = var5;
                        var3[var4++] = var5;
                        var3[var4++] = var5;
                        var3[var4++] = var5;
                        --var6;
                     } while(var6 > 0);
                  }

                  var6 = var8 - var7 & 3;
                  if(var6 > 0) {
                     var5 = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;

                     do {
                        var3[var4++] = var5;
                        --var6;
                     } while(var6 > 0);
                  }
               } else if(!this.aBoolean_3476) {
                  var17 = this.anInt_3509;
                  var18 = 256 - this.anInt_3509;
                  if(var6 > 0) {
                     do {
                        var5 = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                        var11 += var12;
                        var13 += var14;
                        var15 += var16;
                        var5 = ((var5 & 16711935) * var18 >> 8 & 16711935) + ((var5 & '\uff00') * var18 >> 8 & '\uff00');
                        var19 = var3[var4];
                        if(var2) {
                           var3[var4++] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           var19 = var3[var4];
                           var3[var4++] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           var19 = var3[var4];
                           var3[var4++] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           var19 = var3[var4];
                           var3[var4++] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                        } else {
                           var3[var4++] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           var19 = var3[var4];
                           var3[var4++] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           var19 = var3[var4];
                           var3[var4++] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           var19 = var3[var4];
                           var3[var4++] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                        }

                        --var6;
                     } while(var6 > 0);
                  }

                  var6 = var8 - var7 & 3;
                  if(var6 > 0) {
                     var5 = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                     var5 = ((var5 & 16711935) * var18 >> 8 & 16711935) + ((var5 & '\uff00') * var18 >> 8 & '\uff00');

                     do {
                        var19 = var3[var4];
                        if(var2) {
                           var3[var4++] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                        } else {
                           var3[var4++] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                        }

                        --var6;
                     } while(var6 > 0);
                  }
               } else {
                  if(var6 > 0) {
                     do {
                        var5 = (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                        var11 += var12;
                        var13 += var14;
                        var15 += var16;
                        var18 = var4++;
                        var20 = var3[var18];
                        var21 = var5 + var20;
                        var22 = (var5 & 16711935) + (var20 & 16711935);
                        var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                        var3[var18] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                        var21 = var4++;
                        int var23 = var3[var21];
                        int var24 = var5 + var23;
                        int var25 = (var5 & 16711935) + (var23 & 16711935);
                        var23 = (var25 & 16777472) + (var24 - var25 & 65536);
                        var3[var21] = -16777216 | var24 - var23 | var23 - (var23 >>> 8);
                        var24 = var4++;
                        int var26 = var3[var24];
                        int var27 = var5 + var26;
                        int var28 = (var5 & 16711935) + (var26 & 16711935);
                        var26 = (var28 & 16777472) + (var27 - var28 & 65536);
                        var3[var24] = -16777216 | var27 - var26 | var26 - (var26 >>> 8);
                        var27 = var4++;
                        int var29 = var3[var27];
                        int var30 = var5 + var29;
                        int var31 = (var5 & 16711935) + (var29 & 16711935);
                        var29 = (var31 & 16777472) + (var30 - var31 & 65536);
                        var3[var27] = -16777216 | var30 - var29 | var29 - (var29 >>> 8);
                        --var6;
                     } while(var6 > 0);
                  }

                  var6 = var8 - var7 & 3;
                  if(var6 > 0) {
                     var5 = (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;

                     do {
                        var18 = var4++;
                        var20 = var3[var18];
                        var21 = var5 + var20;
                        var22 = (var5 & 16711935) + (var20 & 16711935);
                        var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                        var3[var18] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                        --var6;
                     } while(var6 > 0);
                  }
               }
            } else {
               var6 = var8 - var7;
               if(this.anInt_3509 == 0) {
                  do {
                     var3[var4++] = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                     var11 += var12;
                     var13 += var14;
                     var15 += var16;
                     --var6;
                  } while(var6 > 0);
               } else if(!this.aBoolean_3476) {
                  var17 = this.anInt_3509;
                  var18 = 256 - this.anInt_3509;

                  do {
                     var5 = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                     var11 += var12;
                     var13 += var14;
                     var15 += var16;
                     var5 = ((var5 & 16711935) * var18 >> 8 & 16711935) + ((var5 & '\uff00') * var18 >> 8 & '\uff00');
                     var19 = var3[var4];
                     if(var2) {
                        var3[var4++] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                     } else {
                        var3[var4++] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                     }

                     --var6;
                  } while(var6 > 0);
               } else {
                  do {
                     var18 = var4++;
                     var19 = (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                     var20 = var3[var18];
                     var21 = var19 + var20;
                     var22 = (var19 & 16711935) + (var20 & 16711935);
                     var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                     var3[var18] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                     var11 += var12;
                     var13 += var14;
                     var15 += var16;
                     --var6;
                  } while(var6 > 0);
               }
            }

         } else {
            var4 += var7 - 1;
            var9 += var10 * (float)var7;
            var11 += var12 * (float)var7;
            var13 += var14 * (float)var7;
            var15 += var16 * (float)var7;
            if(this.aClass210_3507.aBoolean_3639) {
               if(this.aBoolean_3475) {
                  var6 = var8 - var7 >> 2;
                  var12 *= 4.0F;
                  var14 *= 4.0F;
                  var16 *= 4.0F;
                  if(this.anInt_3509 == 0) {
                     if(var6 > 0) {
                        do {
                           var5 = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                           var11 += var12;
                           var13 += var14;
                           var15 += var16;
                           ++var4;
                           if(!var1 || var9 < this.aFloatArray_3493[var4]) {
                              var3[var4] = var5;
                              if(var1) {
                                 this.aFloatArray_3493[var4] = var9;
                              }
                           }

                           var9 += var10;
                           ++var4;
                           if(!var1 || var9 < this.aFloatArray_3493[var4]) {
                              var3[var4] = var5;
                              if(var1) {
                                 this.aFloatArray_3493[var4] = var9;
                              }
                           }

                           var9 += var10;
                           ++var4;
                           if(!var1 || var9 < this.aFloatArray_3493[var4]) {
                              var3[var4] = var5;
                              if(var1) {
                                 this.aFloatArray_3493[var4] = var9;
                              }
                           }

                           var9 += var10;
                           ++var4;
                           if(!var1 || var9 < this.aFloatArray_3493[var4]) {
                              var3[var4] = var5;
                              if(var1) {
                                 this.aFloatArray_3493[var4] = var9;
                              }
                           }

                           var9 += var10;
                           --var6;
                        } while(var6 > 0);
                     }

                     var6 = var8 - var7 & 3;
                     if(var6 > 0) {
                        var5 = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;

                        do {
                           ++var4;
                           if(!var1 || var9 < this.aFloatArray_3493[var4]) {
                              var3[var4] = var5;
                              if(var1) {
                                 this.aFloatArray_3493[var4] = var9;
                              }
                           }

                           var9 += var10;
                           --var6;
                        } while(var6 > 0);
                     }
                  } else if(!this.aBoolean_3476) {
                     var17 = this.anInt_3509;
                     var18 = 256 - this.anInt_3509;
                     if(var6 > 0) {
                        do {
                           var5 = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                           var11 += var12;
                           var13 += var14;
                           var15 += var16;
                           var5 = ((var5 & 16711935) * var18 >> 8 & 16711935) + ((var5 & '\uff00') * var18 >> 8 & '\uff00');
                           ++var4;
                           if(!var1 || var9 < this.aFloatArray_3493[var4]) {
                              var19 = var3[var4];
                              if(var2) {
                                 var3[var4] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                              } else {
                                 var3[var4] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                              }

                              if(var1) {
                                 this.aFloatArray_3493[var4] = var9;
                              }
                           }

                           var9 += var10;
                           ++var4;
                           if(!var1 || var9 < this.aFloatArray_3493[var4]) {
                              var19 = var3[var4];
                              if(var2) {
                                 var3[var4] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                              } else {
                                 var3[var4] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                              }

                              if(var1) {
                                 this.aFloatArray_3493[var4] = var9;
                              }
                           }

                           var9 += var10;
                           ++var4;
                           if(!var1 || var9 < this.aFloatArray_3493[var4]) {
                              var19 = var3[var4];
                              if(var2) {
                                 var3[var4] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                              } else {
                                 var3[var4] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                              }

                              if(var1) {
                                 this.aFloatArray_3493[var4] = var9;
                              }
                           }

                           var9 += var10;
                           ++var4;
                           if(!var1 || var9 < this.aFloatArray_3493[var4]) {
                              var19 = var3[var4];
                              if(var2) {
                                 var3[var4] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                              } else {
                                 var3[var4] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                              }

                              if(var1) {
                                 this.aFloatArray_3493[var4] = var9;
                              }
                           }

                           var9 += var10;
                           --var6;
                        } while(var6 > 0);
                     }

                     var6 = var8 - var7 & 3;
                     if(var6 > 0) {
                        var5 = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                        var5 = ((var5 & 16711935) * var18 >> 8 & 16711935) + ((var5 & '\uff00') * var18 >> 8 & '\uff00');

                        do {
                           ++var4;
                           if(!var1 || var9 < this.aFloatArray_3493[var4]) {
                              var19 = var3[var4];
                              if(var2) {
                                 var3[var4] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                              } else {
                                 var3[var4] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                              }

                              if(var1) {
                                 this.aFloatArray_3493[var4] = var9;
                              }
                           }

                           var9 += var10;
                           --var6;
                        } while(var6 > 0);
                     }
                  } else {
                     if(var6 > 0) {
                        do {
                           var5 = (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                           var11 += var12;
                           var13 += var14;
                           var15 += var16;
                           ++var4;
                           if(!var1 || var9 < this.aFloatArray_3493[var4]) {
                              var20 = var3[var4];
                              var21 = var5 + var20;
                              var22 = (var5 & 16711935) + (var20 & 16711935);
                              var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                              var3[var4] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                              if(var1) {
                                 this.aFloatArray_3493[var4] = var9;
                              }
                           }

                           var9 += var10;
                           ++var4;
                           if(!var1 || var9 < this.aFloatArray_3493[var4]) {
                              var20 = var3[var4];
                              var21 = var5 + var20;
                              var22 = (var5 & 16711935) + (var20 & 16711935);
                              var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                              var3[var4] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                              if(var1) {
                                 this.aFloatArray_3493[var4] = var9;
                              }
                           }

                           var9 += var10;
                           ++var4;
                           if(!var1 || var9 < this.aFloatArray_3493[var4]) {
                              var20 = var3[var4];
                              var21 = var5 + var20;
                              var22 = (var5 & 16711935) + (var20 & 16711935);
                              var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                              var3[var4] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                              if(var1) {
                                 this.aFloatArray_3493[var4] = var9;
                              }
                           }

                           var9 += var10;
                           ++var4;
                           if(!var1 || var9 < this.aFloatArray_3493[var4]) {
                              var20 = var3[var4];
                              var21 = var5 + var20;
                              var22 = (var5 & 16711935) + (var20 & 16711935);
                              var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                              var3[var4] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                              if(var1) {
                                 this.aFloatArray_3493[var4] = var9;
                              }
                           }

                           var9 += var10;
                           --var6;
                        } while(var6 > 0);
                     }

                     var6 = var8 - var7 & 3;
                     if(var6 > 0) {
                        var5 = (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;

                        do {
                           ++var4;
                           if(!var1 || var9 < this.aFloatArray_3493[var4]) {
                              var20 = var3[var4];
                              var21 = var5 + var20;
                              var22 = (var5 & 16711935) + (var20 & 16711935);
                              var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                              var3[var4] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                              if(var1) {
                                 this.aFloatArray_3493[var4] = var9;
                              }
                           }

                           var9 += var10;
                           --var6;
                        } while(var6 > 0);
                     }
                  }

               } else {
                  var6 = var8 - var7;
                  if(this.anInt_3509 == 0) {
                     do {
                        ++var4;
                        if(!var1 || var9 < this.aFloatArray_3493[var4]) {
                           var3[var4] = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                           if(var1) {
                              this.aFloatArray_3493[var4] = var9;
                           }
                        }

                        var9 += var10;
                        var11 += var12;
                        var13 += var14;
                        var15 += var16;
                        --var6;
                     } while(var6 > 0);
                  } else if(!this.aBoolean_3476) {
                     var17 = this.anInt_3509;
                     var18 = 256 - this.anInt_3509;

                     do {
                        ++var4;
                        if(!var1 || var9 < this.aFloatArray_3493[var4]) {
                           var5 = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                           var5 = ((var5 & 16711935) * var18 >> 8 & 16711935) + ((var5 & '\uff00') * var18 >> 8 & '\uff00');
                           var19 = var3[var4];
                           if(var2) {
                              var3[var4] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           } else {
                              var3[var4] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           }

                           if(var1) {
                              this.aFloatArray_3493[var4] = var9;
                           }
                        }

                        var9 += var10;
                        var11 += var12;
                        var13 += var14;
                        var15 += var16;
                        --var6;
                     } while(var6 > 0);
                  } else {
                     do {
                        ++var4;
                        if(!var1 || var9 < this.aFloatArray_3493[var4]) {
                           var19 = (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                           var20 = var3[var4];
                           var21 = var19 + var20;
                           var22 = (var19 & 16711935) + (var20 & 16711935);
                           var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                           var3[var4] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                           if(var1) {
                              this.aFloatArray_3493[var4] = var9;
                           }
                        }

                        var9 += var10;
                        var11 += var12;
                        var13 += var14;
                        var15 += var16;
                        --var6;
                     } while(var6 > 0);
                  }

               }
            } else if(this.aBoolean_3475) {
               var6 = var8 - var7 >> 2;
               var12 *= 4.0F;
               var14 *= 4.0F;
               var16 *= 4.0F;
               if(this.anInt_3509 == 0) {
                  if(var6 > 0) {
                     do {
                        var5 = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                        var11 += var12;
                        var13 += var14;
                        var15 += var16;
                        ++var4;
                        if(!var1 || var9 < this.aFloatArray_3493[var4]) {
                           var3[var4] = var5;
                        }

                        var9 += var10;
                        ++var4;
                        if(!var1 || var9 < this.aFloatArray_3493[var4]) {
                           var3[var4] = var5;
                        }

                        var9 += var10;
                        ++var4;
                        if(!var1 || var9 < this.aFloatArray_3493[var4]) {
                           var3[var4] = var5;
                        }

                        var9 += var10;
                        ++var4;
                        if(!var1 || var9 < this.aFloatArray_3493[var4]) {
                           var3[var4] = var5;
                        }

                        var9 += var10;
                        --var6;
                     } while(var6 > 0);
                  }

                  var6 = var8 - var7 & 3;
                  if(var6 > 0) {
                     var5 = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;

                     do {
                        ++var4;
                        if(!var1 || var9 < this.aFloatArray_3493[var4]) {
                           var3[var4] = var5;
                        }

                        var9 += var10;
                        --var6;
                     } while(var6 > 0);
                  }
               } else if(!this.aBoolean_3476) {
                  var17 = this.anInt_3509;
                  var18 = 256 - this.anInt_3509;
                  if(var6 > 0) {
                     do {
                        var5 = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                        var11 += var12;
                        var13 += var14;
                        var15 += var16;
                        var5 = ((var5 & 16711935) * var18 >> 8 & 16711935) + ((var5 & '\uff00') * var18 >> 8 & '\uff00');
                        ++var4;
                        if(!var1 || var9 < this.aFloatArray_3493[var4]) {
                           var19 = var3[var4];
                           if(var2) {
                              var3[var4] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           } else {
                              var3[var4] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           }
                        }

                        var9 += var10;
                        ++var4;
                        if(!var1 || var9 < this.aFloatArray_3493[var4]) {
                           var19 = var3[var4];
                           if(var2) {
                              var3[var4] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           } else {
                              var3[var4] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           }
                        }

                        var9 += var10;
                        ++var4;
                        if(!var1 || var9 < this.aFloatArray_3493[var4]) {
                           var19 = var3[var4];
                           if(var2) {
                              var3[var4] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           } else {
                              var3[var4] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           }
                        }

                        var9 += var10;
                        ++var4;
                        if(!var1 || var9 < this.aFloatArray_3493[var4]) {
                           var19 = var3[var4];
                           if(var2) {
                              var3[var4] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           } else {
                              var3[var4] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           }
                        }

                        var9 += var10;
                        --var6;
                     } while(var6 > 0);
                  }

                  var6 = var8 - var7 & 3;
                  if(var6 > 0) {
                     var5 = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                     var5 = ((var5 & 16711935) * var18 >> 8 & 16711935) + ((var5 & '\uff00') * var18 >> 8 & '\uff00');

                     do {
                        ++var4;
                        if(!var1 || var9 < this.aFloatArray_3493[var4]) {
                           var19 = var3[var4];
                           if(var2) {
                              var3[var4] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           } else {
                              var3[var4] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           }
                        }

                        var9 += var10;
                        --var6;
                     } while(var6 > 0);
                  }
               } else {
                  if(var6 > 0) {
                     do {
                        var5 = (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                        var11 += var12;
                        var13 += var14;
                        var15 += var16;
                        ++var4;
                        if(!var1 || var9 < this.aFloatArray_3493[var4]) {
                           var20 = var3[var4];
                           var21 = var5 + var20;
                           var22 = (var5 & 16711935) + (var20 & 16711935);
                           var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                           var3[var4] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                        }

                        var9 += var10;
                        ++var4;
                        if(!var1 || var9 < this.aFloatArray_3493[var4]) {
                           var20 = var3[var4];
                           var21 = var5 + var20;
                           var22 = (var5 & 16711935) + (var20 & 16711935);
                           var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                           var3[var4] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                        }

                        var9 += var10;
                        ++var4;
                        if(!var1 || var9 < this.aFloatArray_3493[var4]) {
                           var20 = var3[var4];
                           var21 = var5 + var20;
                           var22 = (var5 & 16711935) + (var20 & 16711935);
                           var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                           var3[var4] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                        }

                        var9 += var10;
                        ++var4;
                        if(!var1 || var9 < this.aFloatArray_3493[var4]) {
                           var20 = var3[var4];
                           var21 = var5 + var20;
                           var22 = (var5 & 16711935) + (var20 & 16711935);
                           var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                           var3[var4] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                        }

                        var9 += var10;
                        --var6;
                     } while(var6 > 0);
                  }

                  var6 = var8 - var7 & 3;
                  if(var6 > 0) {
                     var5 = (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;

                     do {
                        ++var4;
                        if(!var1 || var9 < this.aFloatArray_3493[var4]) {
                           var20 = var3[var4];
                           var21 = var5 + var20;
                           var22 = (var5 & 16711935) + (var20 & 16711935);
                           var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                           var3[var4] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                        }

                        var9 += var10;
                        --var6;
                     } while(var6 > 0);
                  }
               }

            } else {
               var6 = var8 - var7;
               if(this.anInt_3509 == 0) {
                  do {
                     ++var4;
                     if(!var1 || var9 < this.aFloatArray_3493[var4]) {
                        var3[var4] = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                     }

                     var9 += var10;
                     var11 += var12;
                     var13 += var14;
                     var15 += var16;
                     --var6;
                  } while(var6 > 0);
               } else if(!this.aBoolean_3476) {
                  var17 = this.anInt_3509;
                  var18 = 256 - this.anInt_3509;

                  do {
                     ++var4;
                     if(!var1 || var9 < this.aFloatArray_3493[var4]) {
                        var5 = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                        var5 = ((var5 & 16711935) * var18 >> 8 & 16711935) + ((var5 & '\uff00') * var18 >> 8 & '\uff00');
                        var19 = var3[var4];
                        if(var2) {
                           var3[var4] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                        } else {
                           var3[var4] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                        }
                     }

                     var9 += var10;
                     var11 += var12;
                     var13 += var14;
                     var15 += var16;
                     --var6;
                  } while(var6 > 0);
               } else {
                  do {
                     ++var4;
                     if(!var1 || var9 < this.aFloatArray_3493[var4]) {
                        var19 = (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                        var20 = var3[var4];
                        var21 = var19 + var20;
                        var22 = (var19 & 16711935) + (var20 & 16711935);
                        var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                        var3[var4] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                     }

                     var9 += var10;
                     var11 += var12;
                     var13 += var14;
                     var15 += var16;
                     --var6;
                  } while(var6 > 0);
               }

            }
         }
      }
   }
}
