import jaggl.OpenGL;

public class Class137 {

   final int anInt_2636;
   final Class171_Sub1 aClass171_Sub1_2637;
   final int anInt_2638;
   final int anInt_2639;
   final byte[] aByteArray_2640;
   final OpenGLRenderer aRenderer_Sub2_2641;
   final int anInt_2642;
   final int anInt_2643;
   Class154[][] aClass154ArrayArray_2644;


   void method1802(int var1, int var2, int var3, boolean[][] var4, boolean var5) {
      this.aRenderer_Sub2_2641.method7066(false);
      this.aRenderer_Sub2_2641.method7029(false);
      this.aRenderer_Sub2_2641.method6957(-2);
      this.aRenderer_Sub2_2641.setTextureEnv(1);
      this.aRenderer_Sub2_2641.setBlendFunc(1);
      float var6 = 1.0F / (float)(this.aRenderer_Sub2_2641.anInt_10330 * 128);
      int var7;
      int var8;
      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      if(var5) {
         for(var7 = 0; var7 < this.anInt_2636; ++var7) {
            var8 = var7 << this.anInt_2643;
            var9 = var7 + 1 << this.anInt_2643;
            var10 = 0;

            while(var10 < this.anInt_2638) {
               var11 = var10 << this.anInt_2643;
               var12 = var10 + 1 << this.anInt_2643;
               var13 = var11;

               while(true) {
                  if(var13 < var12) {
                     label112: {
                        if(var13 - var1 >= -var3 && var13 - var1 <= var3) {
                           for(int var14 = var8; var14 < var9; ++var14) {
                              if(var14 - var2 >= -var3 && var14 - var2 <= var3 && var4[var13 - var1 + var3][var14 - var2 + var3]) {
                                 OpenGL.glMatrixMode(5890);
                                 OpenGL.glLoadIdentity();
                                 OpenGL.glScalef(var6, var6, 1.0F);
                                 OpenGL.glTranslatef((float)(-var10) / var6, (float)(-var7) / var6, 1.0F);
                                 OpenGL.glMatrixMode(5888);
                                 this.aClass154ArrayArray_2644[var10][var7].method1840();
                                 break label112;
                              }
                           }
                        }

                        ++var13;
                        continue;
                     }
                  }

                  ++var10;
                  break;
               }
            }
         }
      } else {
         for(var7 = 0; var7 < this.anInt_2636; ++var7) {
            var8 = var7 << this.anInt_2643;
            var9 = var7 + 1 << this.anInt_2643;

            for(var10 = 0; var10 < this.anInt_2638; ++var10) {
               var11 = 0;
               var12 = var10 << this.anInt_2643;
               var13 = var10 + 1 << this.anInt_2643;
               BufferDataNode var20 = this.aRenderer_Sub2_2641.aClass240_Sub8_Sub2_10359;
               var20.index = 0;

               for(int var15 = var8; var15 < var9; ++var15) {
                  if(var15 - var2 >= -var3 && var15 - var2 <= var3) {
                     int var16 = var15 * this.aClass171_Sub1_2637.maxWidth * 1658489349 + var12;

                     for(int var17 = var12; var17 < var13; ++var17) {
                        if(var17 - var1 >= -var3 && var17 - var1 <= var3 && var4[var17 - var1 + var3][var15 - var2 + var3]) {
                           short[] var18 = this.aClass171_Sub1_2637.aShortArrayArray_10852[var16];
                           if(var18 != null) {
                              int var19;
                              if(this.aRenderer_Sub2_2641.isBigEndian) {
                                 for(var19 = 0; var19 < var18.length; ++var19) {
                                    var20.method4463(var18[var19] & '\uffff', -1356567875);
                                    ++var11;
                                 }
                              } else {
                                 for(var19 = 0; var19 < var18.length; ++var19) {
                                    var20.method4464(var18[var19] & '\uffff', (byte)1);
                                    ++var11;
                                 }
                              }
                           }
                        }

                        ++var16;
                     }
                  }
               }

               if(var11 > 0) {
                  OpenGL.glMatrixMode(5890);
                  OpenGL.glLoadIdentity();
                  OpenGL.glScalef(var6, var6, 1.0F);
                  OpenGL.glTranslatef((float)(-var10) / var6, (float)(-var7) / var6, 1.0F);
                  OpenGL.glMatrixMode(5888);
                  this.aClass154ArrayArray_2644[var10][var7].method1841(var20.data, var11);
               }
            }
         }
      }

      OpenGL.glMatrixMode(5890);
      OpenGL.glLoadIdentity();
      OpenGL.glMatrixMode(5888);
   }

   void method1803(Class240_Sub22_Sub7 var1, int var2, int var3) {
      Class240_Sub22_Sub7_Sub1 var4 = (Class240_Sub22_Sub7_Sub1)var1;
      var2 += var4.anInt_3064 + 1;
      var3 += var4.anInt_3066 + 1;
      int var5 = var2 + var3 * this.anInt_2642;
      int var6 = 0;
      int var7 = var4.anInt_3065;
      int var8 = var4.anInt_3062;
      int var9 = this.anInt_2642 - var8;
      int var10 = 0;
      int var11;
      if(var3 <= 0) {
         var11 = 1 - var3;
         var7 -= var11;
         var6 += var11 * var8;
         var5 += var11 * this.anInt_2642;
         var3 = 1;
      }

      if(var3 + var7 >= this.anInt_2639) {
         var11 = var3 + var7 + 1 - this.anInt_2639;
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

      if(var2 + var8 >= this.anInt_2642) {
         var11 = var2 + var8 + 1 - this.anInt_2642;
         var8 -= var11;
         var10 += var11;
         var9 += var11;
      }

      if(var8 > 0 && var7 > 0) {
         method1807(this.aByteArray_2640, var4.aByteArray_3063, var6, var5, var8, var7, var9, var10);
         this.method1806(var2, var3, var8, var7);
      }
   }

   void method1804(Class240_Sub22_Sub7 var1, int var2, int var3) {
      Class240_Sub22_Sub7_Sub1 var4 = (Class240_Sub22_Sub7_Sub1)var1;
      var2 += var4.anInt_3064 + 1;
      var3 += var4.anInt_3066 + 1;
      int var5 = var2 + var3 * this.anInt_2642;
      int var6 = 0;
      int var7 = var4.anInt_3065;
      int var8 = var4.anInt_3062;
      int var9 = this.anInt_2642 - var8;
      int var10 = 0;
      int var11;
      if(var3 <= 0) {
         var11 = 1 - var3;
         var7 -= var11;
         var6 += var11 * var8;
         var5 += var11 * this.anInt_2642;
         var3 = 1;
      }

      if(var3 + var7 >= this.anInt_2639) {
         var11 = var3 + var7 + 1 - this.anInt_2639;
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

      if(var2 + var8 >= this.anInt_2642) {
         var11 = var2 + var8 + 1 - this.anInt_2642;
         var8 -= var11;
         var10 += var11;
         var9 += var11;
      }

      if(var8 > 0 && var7 > 0) {
         method1808(this.aByteArray_2640, var4.aByteArray_3063, var6, var5, var8, var7, var9, var10);
         this.method1806(var2, var3, var8, var7);
      }
   }

   boolean method1805(Class240_Sub22_Sub7 var1, int var2, int var3) {
      Class240_Sub22_Sub7_Sub1 var4 = (Class240_Sub22_Sub7_Sub1)var1;
      var2 += var4.anInt_3064 + 1;
      var3 += var4.anInt_3066 + 1;
      int var5 = var2 + var3 * this.anInt_2642;
      int var6 = var4.anInt_3065;
      int var7 = var4.anInt_3062;
      int var8 = this.anInt_2642 - var7;
      int var9;
      if(var3 <= 0) {
         var9 = 1 - var3;
         var6 -= var9;
         var5 += var9 * this.anInt_2642;
         var3 = 1;
      }

      if(var3 + var6 >= this.anInt_2639) {
         var9 = var3 + var6 + 1 - this.anInt_2639;
         var6 -= var9;
      }

      if(var2 <= 0) {
         var9 = 1 - var2;
         var7 -= var9;
         var5 += var9;
         var8 += var9;
         var2 = 1;
      }

      if(var2 + var7 >= this.anInt_2642) {
         var9 = var2 + var7 + 1 - this.anInt_2642;
         var7 -= var9;
         var8 += var9;
      }

      if(var7 > 0 && var6 > 0) {
         byte var10 = 8;
         var8 += (var10 - 1) * this.anInt_2642;
         return method1809(this.aByteArray_2640, var5, var7, var6, var8, var10);
      } else {
         return false;
      }
   }

   void method1806(int var1, int var2, int var3, int var4) {
      if(this.aClass154ArrayArray_2644 != null) {
         int var5 = var1 - 1 >> 7;
         int var6 = var1 - 1 + var3 - 1 >> 7;
         int var7 = var2 - 1 >> 7;
         int var8 = var2 - 1 + var4 - 1 >> 7;

         for(int var9 = var5; var9 <= var6; ++var9) {
            Class154[] var10 = this.aClass154ArrayArray_2644[var9];

            for(int var11 = var7; var11 <= var8; ++var11) {
               var10[var11].aBoolean_2741 = true;
            }
         }

      }
   }

   static final void method1807(byte[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
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

   static final void method1808(byte[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
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

   static final boolean method1809(byte[] var0, int var1, int var2, int var3, int var4, int var5) {
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

   Class137(OpenGLRenderer var1, Class171_Sub1 var2) {
      this.aRenderer_Sub2_2641 = var1;
      this.aClass171_Sub1_2637 = var2;
      this.anInt_2642 = 2 + (this.aClass171_Sub1_2637.maxWidth * 1658489349 * this.aClass171_Sub1_2637.anInt_3031 * 69671577 >> this.aRenderer_Sub2_2641.anInt_10407);
      this.anInt_2639 = 2 + (this.aClass171_Sub1_2637.maxHeight * 445373459 * this.aClass171_Sub1_2637.anInt_3031 * 69671577 >> this.aRenderer_Sub2_2641.anInt_10407);
      this.aByteArray_2640 = new byte[this.anInt_2642 * this.anInt_2639];
      this.anInt_2643 = 7 + this.aRenderer_Sub2_2641.anInt_10407 - this.aClass171_Sub1_2637.shiftAmount * 1694172417;
      this.anInt_2638 = this.aClass171_Sub1_2637.maxWidth * 1658489349 >> this.anInt_2643;
      this.anInt_2636 = this.aClass171_Sub1_2637.maxHeight * 445373459 >> this.anInt_2643;
   }

   void method1810() {
      this.aClass154ArrayArray_2644 = new Class154[this.anInt_2638][this.anInt_2636];

      for(int var1 = 0; var1 < this.anInt_2636; ++var1) {
         for(int var2 = 0; var2 < this.anInt_2638; ++var2) {
            this.aClass154ArrayArray_2644[var2][var1] = new Class154(this.aRenderer_Sub2_2641, this, this.aClass171_Sub1_2637, var2, var1, this.anInt_2643, var2 * 128 + 1, var1 * 128 + 1);
         }
      }

   }
}
