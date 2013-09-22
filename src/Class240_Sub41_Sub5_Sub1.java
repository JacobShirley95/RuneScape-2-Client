
public class Class240_Sub41_Sub5_Sub1 extends Class240_Sub41_Sub5 {

   static int method2355(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, Class240_Sub41_Sub5_Sub1 var13, int var14, int var15) {
      var13.anInt_1192 -= var13.anInt_1199 * -208963221 * var5 * -1876472655;
      if(var14 == 0 || (var10 = var5 + (var12 - var4 + var14 - 257) / var14) > var11) {
         var10 = var11;
      }

      var5 <<= 1;

      int var10001;
      byte var16;
      for(var10 <<= 1; var5 < var10; var4 += var14) {
         var1 = var4 >> 8;
         var16 = var2[var1];
         var0 = (var16 << 8) + (var2[var1 + 1] - var16) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      if(var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14 - 1) / var14) > var11) {
         var10 = var11;
      }

      var10 <<= 1;

      for(var1 = var15; var5 < var10; var4 += var14) {
         var16 = var2[var4 >> 8];
         var0 = (var16 << 8) + (var1 - var16) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      var5 >>= 1;
      var13.anInt_1192 += var13.anInt_1199 * -208963221 * var5 * -1876472655;
      var13.anInt_1197 = var6 * 209954677;
      var13.anInt_1198 = var7 * -1759892173;
      var13.anInt_1193 = var4 * 147588577;
      return var5;
   }

   public synchronized void method4937(int[] var1, int var2, int var3) {
      if(this.anInt_1194 * -242391125 == 0 && this.anInt_1206 * -721397207 == 0) {
         this.method4935(var3);
      } else {
         int var4 = this.anInt_1203 * 333398009 << 8;
         int var5 = this.anInt_1204 * 960762737 << 8;
         int var6 = ((Class240_Sub7_Sub1_Sub1)this.aClass240_Sub7_7567).aByteArray_3081.length << 8;
         int var7 = var5 - var4;
         if(var7 <= 0) {
            this.anInt_1202 = 0;
         }

         int var8 = var2;
         var3 += var2;
         if(this.anInt_1193 * -1348534751 < 0) {
            if(this.anInt_1196 * -208424667 <= 0) {
               this.method611((byte)14);
               this.shiftNext();
               return;
            }

            this.anInt_1193 = 0;
         }

         if(this.anInt_1193 * -1348534751 >= var6) {
            if(this.anInt_1196 * -208424667 >= 0) {
               this.method611((byte)-50);
               this.shiftNext();
               return;
            }

            this.anInt_1193 = (var6 - 1) * 147588577;
         }

         if(this.anInt_1202 * 221893437 < 0) {
            if(this.aBoolean_1205) {
               if(this.anInt_1196 * -208424667 < 0) {
                  var8 = this.method2365(var1, var2, var4, var3, ((Class240_Sub7_Sub1_Sub1)this.aClass240_Sub7_7567).aByteArray_3081[this.anInt_1203 * 333398009]);
                  if(this.anInt_1193 * -1348534751 >= var4) {
                     return;
                  }

                  this.anInt_1193 = (var4 + var4 - 1 - this.anInt_1193 * -1348534751) * 147588577;
                  this.anInt_1196 = -(this.anInt_1196 * 1);
               }

               while(true) {
                  var8 = this.method2371(var1, var8, var5, var3, ((Class240_Sub7_Sub1_Sub1)this.aClass240_Sub7_7567).aByteArray_3081[this.anInt_1204 * 960762737 - 1]);
                  if(this.anInt_1193 * -1348534751 < var5) {
                     return;
                  }

                  this.anInt_1193 = (var5 + var5 - 1 - this.anInt_1193 * -1348534751) * 147588577;
                  this.anInt_1196 = -(this.anInt_1196 * 1);
                  var8 = this.method2365(var1, var8, var4, var3, ((Class240_Sub7_Sub1_Sub1)this.aClass240_Sub7_7567).aByteArray_3081[this.anInt_1203 * 333398009]);
                  if(this.anInt_1193 * -1348534751 >= var4) {
                     return;
                  }

                  this.anInt_1193 = (var4 + var4 - 1 - this.anInt_1193 * -1348534751) * 147588577;
                  this.anInt_1196 = -(this.anInt_1196 * 1);
               }
            } else if(this.anInt_1196 * -208424667 < 0) {
               while(true) {
                  var8 = this.method2365(var1, var8, var4, var3, ((Class240_Sub7_Sub1_Sub1)this.aClass240_Sub7_7567).aByteArray_3081[this.anInt_1204 * 960762737 - 1]);
                  if(this.anInt_1193 * -1348534751 >= var4) {
                     return;
                  }

                  this.anInt_1193 = (var5 - 1 - (var5 - 1 - this.anInt_1193 * -1348534751) % var7) * 147588577;
               }
            } else {
               while(true) {
                  var8 = this.method2371(var1, var8, var5, var3, ((Class240_Sub7_Sub1_Sub1)this.aClass240_Sub7_7567).aByteArray_3081[this.anInt_1203 * 333398009]);
                  if(this.anInt_1193 * -1348534751 < var5) {
                     return;
                  }

                  this.anInt_1193 = (var4 + (this.anInt_1193 * -1348534751 - var4) % var7) * 147588577;
               }
            }
         } else {
            if(this.anInt_1202 * 221893437 > 0) {
               if(this.aBoolean_1205) {
                  label134: {
                     if(this.anInt_1196 * -208424667 < 0) {
                        var8 = this.method2365(var1, var2, var4, var3, ((Class240_Sub7_Sub1_Sub1)this.aClass240_Sub7_7567).aByteArray_3081[this.anInt_1203 * 333398009]);
                        if(this.anInt_1193 * -1348534751 >= var4) {
                           return;
                        }

                        this.anInt_1193 = (var4 + var4 - 1 - this.anInt_1193 * -1348534751) * 147588577;
                        this.anInt_1196 = -(this.anInt_1196 * 1);
                        if((this.anInt_1202 -= -1439491051) * 221893437 == 0) {
                           break label134;
                        }
                     }

                     do {
                        var8 = this.method2371(var1, var8, var5, var3, ((Class240_Sub7_Sub1_Sub1)this.aClass240_Sub7_7567).aByteArray_3081[this.anInt_1204 * 960762737 - 1]);
                        if(this.anInt_1193 * -1348534751 < var5) {
                           return;
                        }

                        this.anInt_1193 = (var5 + var5 - 1 - this.anInt_1193 * -1348534751) * 147588577;
                        this.anInt_1196 = -(this.anInt_1196 * 1);
                        if((this.anInt_1202 -= -1439491051) * 221893437 == 0) {
                           break;
                        }

                        var8 = this.method2365(var1, var8, var4, var3, ((Class240_Sub7_Sub1_Sub1)this.aClass240_Sub7_7567).aByteArray_3081[this.anInt_1203 * 333398009]);
                        if(this.anInt_1193 * -1348534751 >= var4) {
                           return;
                        }

                        this.anInt_1193 = (var4 + var4 - 1 - this.anInt_1193 * -1348534751) * 147588577;
                        this.anInt_1196 = -(this.anInt_1196 * 1);
                     } while((this.anInt_1202 -= -1439491051) * 221893437 != 0);
                  }
               } else {
                  int var9;
                  if(this.anInt_1196 * -208424667 < 0) {
                     while(true) {
                        var8 = this.method2365(var1, var8, var4, var3, ((Class240_Sub7_Sub1_Sub1)this.aClass240_Sub7_7567).aByteArray_3081[this.anInt_1204 * 960762737 - 1]);
                        if(this.anInt_1193 * -1348534751 >= var4) {
                           return;
                        }

                        var9 = (var5 - 1 - this.anInt_1193 * -1348534751) / var7;
                        if(var9 >= this.anInt_1202 * 221893437) {
                           this.anInt_1193 += var7 * this.anInt_1202 * 221893437 * 147588577;
                           this.anInt_1202 = 0;
                           break;
                        }

                        this.anInt_1193 += var7 * var9 * 147588577;
                        this.anInt_1202 -= var9 * -1439491051;
                     }
                  } else {
                     while(true) {
                        var8 = this.method2371(var1, var8, var5, var3, ((Class240_Sub7_Sub1_Sub1)this.aClass240_Sub7_7567).aByteArray_3081[this.anInt_1203 * 333398009]);
                        if(this.anInt_1193 * -1348534751 < var5) {
                           return;
                        }

                        var9 = (this.anInt_1193 * -1348534751 - var4) / var7;
                        if(var9 >= this.anInt_1202 * 221893437) {
                           this.anInt_1193 -= var7 * this.anInt_1202 * 221893437 * 147588577;
                           this.anInt_1202 = 0;
                           break;
                        }

                        this.anInt_1193 -= var7 * var9 * 147588577;
                        this.anInt_1202 -= var9 * -1439491051;
                     }
                  }
               }
            }

            if(this.anInt_1196 * -208424667 < 0) {
               this.method2365(var1, var8, 0, var3, 0);
               if(this.anInt_1193 * -1348534751 < 0) {
                  this.anInt_1193 = -147588577;
                  this.method611((byte)-67);
                  this.shiftNext();
               }
            } else {
               this.method2371(var1, var8, var6, var3, 0);
               if(this.anInt_1193 * -1348534751 >= var6) {
                  this.anInt_1193 = var6 * 147588577;
                  this.method611((byte)-49);
                  this.shiftNext();
               }
            }

         }
      }
   }

   static int method2357(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, Class240_Sub41_Sub5_Sub1 var8) {
      var2 >>= 8;
      var7 >>= 8;
      var4 <<= 2;
      if((var5 = var3 + var7 - var2) > var6) {
         var5 = var6;
      }

      int var10001;
      for(var5 -= 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
      }

      for(var5 += 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
         var10001 = var3++;
      }

      var8.anInt_1193 = (var2 << 8) * 147588577;
      return var3;
   }

   static int method2358(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, Class240_Sub41_Sub5_Sub1 var10) {
      var3 >>= 8;
      var9 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      if((var7 = var4 + var9 - var3) > var8) {
         var7 = var8;
      }

      var4 <<= 1;
      var7 <<= 1;

      byte var11;
      int var10001;
      for(var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      for(var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      var10.anInt_1193 = (var3 << 8) * 147588577;
      return var4 >> 1;
   }

   static int method2359(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, Class240_Sub41_Sub5_Sub1 var8) {
      var2 >>= 8;
      var7 >>= 8;
      var4 <<= 2;
      if((var5 = var3 + var2 - (var7 - 1)) > var6) {
         var5 = var6;
      }

      int var10001;
      for(var5 -= 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var10001 = var3++;
      }

      for(var5 += 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
         var10001 = var3++;
      }

      var8.anInt_1193 = (var2 << 8) * 147588577;
      return var3;
   }

   static int method2360(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, Class240_Sub41_Sub5_Sub1 var10) {
      var3 >>= 8;
      var9 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      if((var7 = var4 + var3 - (var9 - 1)) > var8) {
         var7 = var8;
      }

      var4 <<= 1;
      var7 <<= 1;

      byte var11;
      int var10001;
      for(var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      for(var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      var10.anInt_1193 = (var3 << 8) * 147588577;
      return var4 >> 1;
   }

   static int method2361(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, Class240_Sub41_Sub5_Sub1 var10, int var11, int var12) {
      if(var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 257) / var11) > var8) {
         var7 = var8;
      }

      int var10001;
      byte var13;
      while(var5 < var7) {
         var1 = var4 >> 8;
         var13 = var2[var1];
         var10001 = var5++;
         var3[var10001] += ((var13 << 8) + (var2[var1 + 1] - var13) * (var4 & 255)) * var6 >> 6;
         var4 += var11;
      }

      if(var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 1) / var11) > var8) {
         var7 = var8;
      }

      for(var1 = var12; var5 < var7; var4 += var11) {
         var13 = var2[var4 >> 8];
         var10001 = var5++;
         var3[var10001] += ((var13 << 8) + (var1 - var13) * (var4 & 255)) * var6 >> 6;
      }

      var10.anInt_1193 = var4 * 147588577;
      return var5;
   }

   static int method2362(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, Class240_Sub41_Sub5_Sub1 var11, int var12, int var13) {
      if(var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      int var10001;
      byte var14;
      for(var8 <<= 1; var5 < var8; var4 += var12) {
         var1 = var4 >> 8;
         var14 = var2[var1];
         var0 = (var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      if(var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12 - 1) / var12) > var9) {
         var8 = var9;
      }

      var8 <<= 1;

      for(var1 = var13; var5 < var8; var4 += var12) {
         var14 = var2[var4 >> 8];
         var0 = (var14 << 8) + (var1 - var14) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      var11.anInt_1193 = var4 * 147588577;
      return var5 >> 1;
   }

   static int method2363(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, Class240_Sub41_Sub5_Sub1 var11, int var12, int var13) {
      if(var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      int var10001;
      for(var8 <<= 1; var5 < var8; var4 += var12) {
         var1 = var4 >> 8;
         byte var14 = var2[var1 - 1];
         var0 = (var14 << 8) + (var2[var1] - var14) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      if(var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var8 <<= 1;

      for(var1 = var13; var5 < var8; var4 += var12) {
         var0 = (var1 << 8) + (var2[var4 >> 8] - var1) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      var11.anInt_1193 = var4 * 147588577;
      return var5 >> 1;
   }

   static int method2364(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, Class240_Sub41_Sub5_Sub1 var12) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      if((var9 = var4 + var11 - var3) > var10) {
         var9 = var10;
      }

      var12.anInt_1192 += var12.anInt_1199 * -208963221 * (var9 - var4) * -1876472655;
      var4 <<= 1;
      var9 <<= 1;

      int var10001;
      byte var13;
      for(var9 -= 6; var4 < var9; var6 += var8) {
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      for(var9 += 6; var4 < var9; var6 += var8) {
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      var12.anInt_1197 = (var5 >> 2) * 209954677;
      var12.anInt_1198 = (var6 >> 2) * -1759892173;
      var12.anInt_1193 = (var3 << 8) * 147588577;
      return var4 >> 1;
   }

   int method2365(int[] var1, int var2, int var3, int var4, int var5) {
      while(true) {
         if(this.anInt_1206 * -721397207 > 0) {
            int var6 = var2 + this.anInt_1206 * -721397207;
            if(var6 > var4) {
               var6 = var4;
            }

            this.anInt_1206 += var2 * 306700825;
            if(this.anInt_1196 * -208424667 == -256 && (this.anInt_1193 * -1348534751 & 255) == 0) {
               if(Class316.aBoolean_6136) {
                  var2 = method2367(0, ((Class240_Sub7_Sub1_Sub1)this.aClass240_Sub7_7567).aByteArray_3081, var1, this.anInt_1193 * -1348534751, var2, this.anInt_1197 * -1017597731, this.anInt_1198 * 148739579, this.anInt_1200 * 2071015239, this.anInt_1201 * 2040591525, 0, var6, var3, this);
               } else {
                  var2 = method2366(((Class240_Sub7_Sub1_Sub1)this.aClass240_Sub7_7567).aByteArray_3081, var1, this.anInt_1193 * -1348534751, var2, this.anInt_1192 * 1876655185, this.anInt_1199 * -208963221, 0, var6, var3, this);
               }
            } else if(Class316.aBoolean_6136) {
               var2 = method2370(0, 0, ((Class240_Sub7_Sub1_Sub1)this.aClass240_Sub7_7567).aByteArray_3081, var1, this.anInt_1193 * -1348534751, var2, this.anInt_1197 * -1017597731, this.anInt_1198 * 148739579, this.anInt_1200 * 2071015239, this.anInt_1201 * 2040591525, 0, var6, var3, this, this.anInt_1196 * -208424667, var5);
            } else {
               var2 = method2372(0, 0, ((Class240_Sub7_Sub1_Sub1)this.aClass240_Sub7_7567).aByteArray_3081, var1, this.anInt_1193 * -1348534751, var2, this.anInt_1192 * 1876655185, this.anInt_1199 * -208963221, 0, var6, var3, this, this.anInt_1196 * -208424667, var5);
            }

            this.anInt_1206 -= var2 * 306700825;
            if(this.anInt_1206 * -721397207 != 0) {
               return var2;
            }

            if(!this.method616(-1667890140)) {
               continue;
            }

            return var4;
         }

         if(this.anInt_1196 * -208424667 == -256 && (this.anInt_1193 * -1348534751 & 255) == 0) {
            if(Class316.aBoolean_6136) {
               return method2360(0, ((Class240_Sub7_Sub1_Sub1)this.aClass240_Sub7_7567).aByteArray_3081, var1, this.anInt_1193 * -1348534751, var2, this.anInt_1197 * -1017597731, this.anInt_1198 * 148739579, 0, var4, var3, this);
            }

            return method2359(((Class240_Sub7_Sub1_Sub1)this.aClass240_Sub7_7567).aByteArray_3081, var1, this.anInt_1193 * -1348534751, var2, this.anInt_1192 * 1876655185, 0, var4, var3, this);
         }

         if(Class316.aBoolean_6136) {
            return method2363(0, 0, ((Class240_Sub7_Sub1_Sub1)this.aClass240_Sub7_7567).aByteArray_3081, var1, this.anInt_1193 * -1348534751, var2, this.anInt_1197 * -1017597731, this.anInt_1198 * 148739579, 0, var4, var3, this, this.anInt_1196 * -208424667, var5);
         }

         return method2369(0, 0, ((Class240_Sub7_Sub1_Sub1)this.aClass240_Sub7_7567).aByteArray_3081, var1, this.anInt_1193 * -1348534751, var2, this.anInt_1192 * 1876655185, 0, var4, var3, this, this.anInt_1196 * -208424667, var5);
      }
   }

   static int method2366(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, Class240_Sub41_Sub5_Sub1 var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if((var6 = var3 + var2 - (var8 - 1)) > var7) {
         var6 = var7;
      }

      var9.anInt_1197 += var9.anInt_1200 * 2071015239 * (var6 - var3) * 209954677;
      var9.anInt_1198 += var9.anInt_1201 * 2040591525 * (var6 - var3) * -1759892173;

      int var10001;
      for(var6 -= 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
      }

      for(var6 += 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
      }

      var9.anInt_1192 = (var4 >> 2) * -1876472655;
      var9.anInt_1193 = (var2 << 8) * 147588577;
      return var3;
   }

   static int method2367(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, Class240_Sub41_Sub5_Sub1 var12) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      if((var9 = var4 + var3 - (var11 - 1)) > var10) {
         var9 = var10;
      }

      var12.anInt_1192 += var12.anInt_1199 * -208963221 * (var9 - var4) * -1876472655;
      var4 <<= 1;
      var9 <<= 1;

      int var10001;
      byte var13;
      for(var9 -= 6; var4 < var9; var6 += var8) {
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      for(var9 += 6; var4 < var9; var6 += var8) {
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      var12.anInt_1197 = (var5 >> 2) * 209954677;
      var12.anInt_1198 = (var6 >> 2) * -1759892173;
      var12.anInt_1193 = (var3 << 8) * 147588577;
      return var4 >> 1;
   }

   static int method2368(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, Class240_Sub41_Sub5_Sub1 var11, int var12, int var13) {
      var11.anInt_1197 -= var11.anInt_1200 * 2071015239 * var5 * 209954677;
      var11.anInt_1198 -= var11.anInt_1201 * 2040591525 * var5 * -1759892173;
      if(var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
         var8 = var9;
      }

      int var10001;
      byte var14;
      while(var5 < var8) {
         var1 = var4 >> 8;
         var14 = var2[var1];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
         var4 += var12;
      }

      if(var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 1) / var12) > var9) {
         var8 = var9;
      }

      for(var1 = var13; var5 < var8; var4 += var12) {
         var14 = var2[var4 >> 8];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var1 - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
      }

      var11.anInt_1197 += var11.anInt_1200 * 2071015239 * var5 * 209954677;
      var11.anInt_1198 += var11.anInt_1201 * 2040591525 * var5 * -1759892173;
      var11.anInt_1192 = var6 * -1876472655;
      var11.anInt_1193 = var4 * 147588577;
      return var5;
   }

   static int method2369(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, Class240_Sub41_Sub5_Sub1 var10, int var11, int var12) {
      if(var11 == 0 || (var7 = var5 + (var9 + 256 - var4 + var11) / var11) > var8) {
         var7 = var8;
      }

      int var10001;
      while(var5 < var7) {
         var1 = var4 >> 8;
         byte var13 = var2[var1 - 1];
         var10001 = var5++;
         var3[var10001] += ((var13 << 8) + (var2[var1] - var13) * (var4 & 255)) * var6 >> 6;
         var4 += var11;
      }

      if(var11 == 0 || (var7 = var5 + (var9 - var4 + var11) / var11) > var8) {
         var7 = var8;
      }

      var0 = var12;

      for(var1 = var11; var5 < var7; var4 += var1) {
         var10001 = var5++;
         var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
      }

      var10.anInt_1193 = var4 * 147588577;
      return var5;
   }

   static int method2370(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, Class240_Sub41_Sub5_Sub1 var13, int var14, int var15) {
      var13.anInt_1192 -= var13.anInt_1199 * -208963221 * var5 * -1876472655;
      if(var14 == 0 || (var10 = var5 + (var12 + 256 - var4 + var14) / var14) > var11) {
         var10 = var11;
      }

      var5 <<= 1;

      int var10001;
      for(var10 <<= 1; var5 < var10; var4 += var14) {
         var1 = var4 >> 8;
         byte var16 = var2[var1 - 1];
         var0 = (var16 << 8) + (var2[var1] - var16) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      if(var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14) / var14) > var11) {
         var10 = var11;
      }

      var10 <<= 1;

      for(var1 = var15; var5 < var10; var4 += var14) {
         var0 = (var1 << 8) + (var2[var4 >> 8] - var1) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      var5 >>= 1;
      var13.anInt_1192 += var13.anInt_1199 * -208963221 * var5 * -1876472655;
      var13.anInt_1197 = var6 * 209954677;
      var13.anInt_1198 = var7 * -1759892173;
      var13.anInt_1193 = var4 * 147588577;
      return var5;
   }

   int method2371(int[] var1, int var2, int var3, int var4, int var5) {
      while(true) {
         if(this.anInt_1206 * -721397207 > 0) {
            int var6 = var2 + this.anInt_1206 * -721397207;
            if(var6 > var4) {
               var6 = var4;
            }

            this.anInt_1206 += var2 * 306700825;
            if(this.anInt_1196 * -208424667 == 256 && (this.anInt_1193 * -1348534751 & 255) == 0) {
               if(Class316.aBoolean_6136) {
                  var2 = method2364(0, ((Class240_Sub7_Sub1_Sub1)this.aClass240_Sub7_7567).aByteArray_3081, var1, this.anInt_1193 * -1348534751, var2, this.anInt_1197 * -1017597731, this.anInt_1198 * 148739579, this.anInt_1200 * 2071015239, this.anInt_1201 * 2040591525, 0, var6, var3, this);
               } else {
                  var2 = method2373(((Class240_Sub7_Sub1_Sub1)this.aClass240_Sub7_7567).aByteArray_3081, var1, this.anInt_1193 * -1348534751, var2, this.anInt_1192 * 1876655185, this.anInt_1199 * -208963221, 0, var6, var3, this);
               }
            } else if(Class316.aBoolean_6136) {
               var2 = method2355(0, 0, ((Class240_Sub7_Sub1_Sub1)this.aClass240_Sub7_7567).aByteArray_3081, var1, this.anInt_1193 * -1348534751, var2, this.anInt_1197 * -1017597731, this.anInt_1198 * 148739579, this.anInt_1200 * 2071015239, this.anInt_1201 * 2040591525, 0, var6, var3, this, this.anInt_1196 * -208424667, var5);
            } else {
               var2 = method2368(0, 0, ((Class240_Sub7_Sub1_Sub1)this.aClass240_Sub7_7567).aByteArray_3081, var1, this.anInt_1193 * -1348534751, var2, this.anInt_1192 * 1876655185, this.anInt_1199 * -208963221, 0, var6, var3, this, this.anInt_1196 * -208424667, var5);
            }

            this.anInt_1206 -= var2 * 306700825;
            if(this.anInt_1206 * -721397207 != 0) {
               return var2;
            }

            if(!this.method616(-1494675580)) {
               continue;
            }

            return var4;
         }

         if(this.anInt_1196 * -208424667 == 256 && (this.anInt_1193 * -1348534751 & 255) == 0) {
            if(Class316.aBoolean_6136) {
               return method2358(0, ((Class240_Sub7_Sub1_Sub1)this.aClass240_Sub7_7567).aByteArray_3081, var1, this.anInt_1193 * -1348534751, var2, this.anInt_1197 * -1017597731, this.anInt_1198 * 148739579, 0, var4, var3, this);
            }

            return method2357(((Class240_Sub7_Sub1_Sub1)this.aClass240_Sub7_7567).aByteArray_3081, var1, this.anInt_1193 * -1348534751, var2, this.anInt_1192 * 1876655185, 0, var4, var3, this);
         }

         if(Class316.aBoolean_6136) {
            return method2362(0, 0, ((Class240_Sub7_Sub1_Sub1)this.aClass240_Sub7_7567).aByteArray_3081, var1, this.anInt_1193 * -1348534751, var2, this.anInt_1197 * -1017597731, this.anInt_1198 * 148739579, 0, var4, var3, this, this.anInt_1196 * -208424667, var5);
         }

         return method2361(0, 0, ((Class240_Sub7_Sub1_Sub1)this.aClass240_Sub7_7567).aByteArray_3081, var1, this.anInt_1193 * -1348534751, var2, this.anInt_1192 * 1876655185, 0, var4, var3, this, this.anInt_1196 * -208424667, var5);
      }
   }

   Class240_Sub41_Sub5_Sub1(Class240_Sub7_Sub1_Sub1 var1, int var2, int var3, int var4) {
      this.aClass240_Sub7_7567 = var1;
      this.anInt_1203 = var1.anInt_1054 * 145558109;
      this.anInt_1204 = var1.anInt_1056 * 265620655;
      this.aBoolean_1205 = var1.aBoolean_1055;
      this.anInt_1196 = var2 * 1659044525;
      this.anInt_1194 = var3 * -2139464957;
      this.anInt_1195 = var4 * -1744650965;
      this.anInt_1193 = 0;
      this.method601(507184898);
   }

   static int method2372(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, Class240_Sub41_Sub5_Sub1 var11, int var12, int var13) {
      var11.anInt_1197 -= var11.anInt_1200 * 2071015239 * var5 * 209954677;
      var11.anInt_1198 -= var11.anInt_1201 * 2040591525 * var5 * -1759892173;
      if(var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      int var10001;
      while(var5 < var8) {
         var1 = var4 >> 8;
         byte var14 = var2[var1 - 1];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var2[var1] - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
         var4 += var12;
      }

      if(var12 == 0 || (var8 = var5 + (var10 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var0 = var13;

      for(var1 = var12; var5 < var8; var4 += var1) {
         var10001 = var5++;
         var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
      }

      var11.anInt_1197 += var11.anInt_1200 * 2071015239 * var5 * 209954677;
      var11.anInt_1198 += var11.anInt_1201 * 2040591525 * var5 * -1759892173;
      var11.anInt_1192 = var6 * -1876472655;
      var11.anInt_1193 = var4 * 147588577;
      return var5;
   }

   static int method2373(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, Class240_Sub41_Sub5_Sub1 var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if((var6 = var3 + var8 - var2) > var7) {
         var6 = var7;
      }

      var9.anInt_1197 += var9.anInt_1200 * 2071015239 * (var6 - var3) * 209954677;
      var9.anInt_1198 += var9.anInt_1201 * 2040591525 * (var6 - var3) * -1759892173;

      int var10001;
      for(var6 -= 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
      }

      for(var6 += 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
      }

      var9.anInt_1192 = (var4 >> 2) * -1876472655;
      var9.anInt_1193 = (var2 << 8) * 147588577;
      return var3;
   }
}
