
public class Class240_Sub22_Sub7_Sub1 extends Class240_Sub22_Sub7 {

   static final int anInt_3061 = 16;
   int anInt_3062;
   final byte[] aByteArray_3063;
   int anInt_3064;
   int anInt_3065;
   int anInt_3066;


   Class240_Sub22_Sub7_Sub1(OpenGLRenderer var1, int var2, int var3) {
      this.aByteArray_3063 = new byte[var2 * var3];
   }

   void method2206() {
      int var1 = -1;

      for(int var2 = this.aByteArray_3063.length - 8; var1 < var2; this.aByteArray_3063[var1] = 0) {
         ++var1;
         this.aByteArray_3063[var1] = 0;
         ++var1;
         this.aByteArray_3063[var1] = 0;
         ++var1;
         this.aByteArray_3063[var1] = 0;
         ++var1;
         this.aByteArray_3063[var1] = 0;
         ++var1;
         this.aByteArray_3063[var1] = 0;
         ++var1;
         this.aByteArray_3063[var1] = 0;
         ++var1;
         this.aByteArray_3063[var1] = 0;
         ++var1;
      }

      while(var1 < this.aByteArray_3063.length - 1) {
         ++var1;
         this.aByteArray_3063[var1] = 0;
      }

   }

   void method2207(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = 0;
      if(var2 != var1) {
         var7 = (var5 - var4 << 16) / (var2 - var1);
      }

      int var8 = 0;
      if(var3 != var2) {
         var8 = (var6 - var5 << 16) / (var3 - var2);
      }

      int var9 = 0;
      if(var3 != var1) {
         var9 = (var4 - var6 << 16) / (var1 - var3);
      }

      if(var1 <= var2 && var1 <= var3) {
         if(var2 < var3) {
            var6 = var4 <<= 16;
            if(var1 < 0) {
               var6 -= var9 * var1;
               var4 -= var7 * var1;
               var1 = 0;
            }

            var5 <<= 16;
            if(var2 < 0) {
               var5 -= var8 * var2;
               var2 = 0;
            }

            if((var1 == var2 || var9 >= var7) && (var1 != var2 || var9 <= var8)) {
               var3 -= var2;
               var2 -= var1;
               var1 *= this.anInt_3062;

               while(true) {
                  --var2;
                  if(var2 < 0) {
                     while(true) {
                        --var3;
                        if(var3 < 0) {
                           return;
                        }

                        method2208(this.aByteArray_3063, var1, 0, var5 >> 16, var6 >> 16);
                        var6 += var9;
                        var5 += var8;
                        var1 += this.anInt_3062;
                     }
                  }

                  method2208(this.aByteArray_3063, var1, 0, var4 >> 16, var6 >> 16);
                  var6 += var9;
                  var4 += var7;
                  var1 += this.anInt_3062;
               }
            } else {
               var3 -= var2;
               var2 -= var1;
               var1 *= this.anInt_3062;

               while(true) {
                  --var2;
                  if(var2 < 0) {
                     while(true) {
                        --var3;
                        if(var3 < 0) {
                           return;
                        }

                        method2208(this.aByteArray_3063, var1, 0, var6 >> 16, var5 >> 16);
                        var6 += var9;
                        var5 += var8;
                        var1 += this.anInt_3062;
                     }
                  }

                  method2208(this.aByteArray_3063, var1, 0, var6 >> 16, var4 >> 16);
                  var6 += var9;
                  var4 += var7;
                  var1 += this.anInt_3062;
               }
            }
         } else {
            var5 = var4 <<= 16;
            if(var1 < 0) {
               var5 -= var9 * var1;
               var4 -= var7 * var1;
               var1 = 0;
            }

            var6 <<= 16;
            if(var3 < 0) {
               var6 -= var8 * var3;
               var3 = 0;
            }

            if((var1 == var3 || var9 >= var7) && (var1 != var3 || var8 <= var7)) {
               var2 -= var3;
               var3 -= var1;
               var1 *= this.anInt_3062;

               while(true) {
                  --var3;
                  if(var3 < 0) {
                     while(true) {
                        --var2;
                        if(var2 < 0) {
                           return;
                        }

                        method2208(this.aByteArray_3063, var1, 0, var4 >> 16, var6 >> 16);
                        var6 += var8;
                        var4 += var7;
                        var1 += this.anInt_3062;
                     }
                  }

                  method2208(this.aByteArray_3063, var1, 0, var4 >> 16, var5 >> 16);
                  var5 += var9;
                  var4 += var7;
                  var1 += this.anInt_3062;
               }
            } else {
               var2 -= var3;
               var3 -= var1;
               var1 *= this.anInt_3062;

               while(true) {
                  --var3;
                  if(var3 < 0) {
                     while(true) {
                        --var2;
                        if(var2 < 0) {
                           return;
                        }

                        method2208(this.aByteArray_3063, var1, 0, var6 >> 16, var4 >> 16);
                        var6 += var8;
                        var4 += var7;
                        var1 += this.anInt_3062;
                     }
                  }

                  method2208(this.aByteArray_3063, var1, 0, var5 >> 16, var4 >> 16);
                  var5 += var9;
                  var4 += var7;
                  var1 += this.anInt_3062;
               }
            }
         }
      } else if(var2 <= var3) {
         if(var3 < var1) {
            var4 = var5 <<= 16;
            if(var2 < 0) {
               var4 -= var7 * var2;
               var5 -= var8 * var2;
               var2 = 0;
            }

            var6 <<= 16;
            if(var3 < 0) {
               var6 -= var9 * var3;
               var3 = 0;
            }

            if((var2 == var3 || var7 >= var8) && (var2 != var3 || var7 <= var9)) {
               var1 -= var3;
               var3 -= var2;
               var2 *= this.anInt_3062;

               while(true) {
                  --var3;
                  if(var3 < 0) {
                     while(true) {
                        --var1;
                        if(var1 < 0) {
                           return;
                        }

                        method2208(this.aByteArray_3063, var2, 0, var6 >> 16, var4 >> 16);
                        var4 += var7;
                        var6 += var9;
                        var2 += this.anInt_3062;
                     }
                  }

                  method2208(this.aByteArray_3063, var2, 0, var5 >> 16, var4 >> 16);
                  var4 += var7;
                  var5 += var8;
                  var2 += this.anInt_3062;
               }
            } else {
               var1 -= var3;
               var3 -= var2;
               var2 *= this.anInt_3062;

               while(true) {
                  --var3;
                  if(var3 < 0) {
                     while(true) {
                        --var1;
                        if(var1 < 0) {
                           return;
                        }

                        method2208(this.aByteArray_3063, var2, 0, var4 >> 16, var6 >> 16);
                        var4 += var7;
                        var6 += var9;
                        var2 += this.anInt_3062;
                     }
                  }

                  method2208(this.aByteArray_3063, var2, 0, var4 >> 16, var5 >> 16);
                  var4 += var7;
                  var5 += var8;
                  var2 += this.anInt_3062;
               }
            }
         } else {
            var6 = var5 <<= 16;
            if(var2 < 0) {
               var6 -= var7 * var2;
               var5 -= var8 * var2;
               var2 = 0;
            }

            var4 <<= 16;
            if(var1 < 0) {
               var4 -= var9 * var1;
               var1 = 0;
            }

            if(var7 < var8) {
               var3 -= var1;
               var1 -= var2;
               var2 *= this.anInt_3062;

               while(true) {
                  --var1;
                  if(var1 < 0) {
                     while(true) {
                        --var3;
                        if(var3 < 0) {
                           return;
                        }

                        method2208(this.aByteArray_3063, var2, 0, var4 >> 16, var5 >> 16);
                        var4 += var9;
                        var5 += var8;
                        var2 += this.anInt_3062;
                     }
                  }

                  method2208(this.aByteArray_3063, var2, 0, var6 >> 16, var5 >> 16);
                  var6 += var7;
                  var5 += var8;
                  var2 += this.anInt_3062;
               }
            } else {
               var3 -= var1;
               var1 -= var2;
               var2 *= this.anInt_3062;

               while(true) {
                  --var1;
                  if(var1 < 0) {
                     while(true) {
                        --var3;
                        if(var3 < 0) {
                           return;
                        }

                        method2208(this.aByteArray_3063, var2, 0, var5 >> 16, var4 >> 16);
                        var4 += var9;
                        var5 += var8;
                        var2 += this.anInt_3062;
                     }
                  }

                  method2208(this.aByteArray_3063, var2, 0, var5 >> 16, var6 >> 16);
                  var6 += var7;
                  var5 += var8;
                  var2 += this.anInt_3062;
               }
            }
         }
      } else if(var1 < var2) {
         var5 = var6 <<= 16;
         if(var3 < 0) {
            var5 -= var8 * var3;
            var6 -= var9 * var3;
            var3 = 0;
         }

         var4 <<= 16;
         if(var1 < 0) {
            var4 -= var7 * var1;
            var1 = 0;
         }

         if(var8 < var9) {
            var2 -= var1;
            var1 -= var3;
            var3 *= this.anInt_3062;

            while(true) {
               --var1;
               if(var1 < 0) {
                  while(true) {
                     --var2;
                     if(var2 < 0) {
                        return;
                     }

                     method2208(this.aByteArray_3063, var3, 0, var5 >> 16, var4 >> 16);
                     var5 += var8;
                     var4 += var7;
                     var3 += this.anInt_3062;
                  }
               }

               method2208(this.aByteArray_3063, var3, 0, var5 >> 16, var6 >> 16);
               var5 += var8;
               var6 += var9;
               var3 += this.anInt_3062;
            }
         } else {
            var2 -= var1;
            var1 -= var3;
            var3 *= this.anInt_3062;

            while(true) {
               --var1;
               if(var1 < 0) {
                  while(true) {
                     --var2;
                     if(var2 < 0) {
                        return;
                     }

                     method2208(this.aByteArray_3063, var3, 0, var4 >> 16, var5 >> 16);
                     var5 += var8;
                     var4 += var7;
                     var3 += this.anInt_3062;
                  }
               }

               method2208(this.aByteArray_3063, var3, 0, var6 >> 16, var5 >> 16);
               var5 += var8;
               var6 += var9;
               var3 += this.anInt_3062;
            }
         }
      } else {
         var4 = var6 <<= 16;
         if(var3 < 0) {
            var4 -= var8 * var3;
            var6 -= var9 * var3;
            var3 = 0;
         }

         var5 <<= 16;
         if(var2 < 0) {
            var5 -= var7 * var2;
            var2 = 0;
         }

         if(var8 < var9) {
            var1 -= var2;
            var2 -= var3;
            var3 *= this.anInt_3062;

            while(true) {
               --var2;
               if(var2 < 0) {
                  while(true) {
                     --var1;
                     if(var1 < 0) {
                        return;
                     }

                     method2208(this.aByteArray_3063, var3, 0, var5 >> 16, var6 >> 16);
                     var5 += var7;
                     var6 += var9;
                     var3 += this.anInt_3062;
                  }
               }

               method2208(this.aByteArray_3063, var3, 0, var4 >> 16, var6 >> 16);
               var4 += var8;
               var6 += var9;
               var3 += this.anInt_3062;
            }
         } else {
            var1 -= var2;
            var2 -= var3;
            var3 *= this.anInt_3062;

            while(true) {
               --var2;
               if(var2 < 0) {
                  while(true) {
                     --var1;
                     if(var1 < 0) {
                        return;
                     }

                     method2208(this.aByteArray_3063, var3, 0, var6 >> 16, var5 >> 16);
                     var5 += var7;
                     var6 += var9;
                     var3 += this.anInt_3062;
                  }
               }

               method2208(this.aByteArray_3063, var3, 0, var6 >> 16, var4 >> 16);
               var4 += var8;
               var6 += var9;
               var3 += this.anInt_3062;
            }
         }
      }
   }

   static final void method2208(byte[] var0, int var1, int var2, int var3, int var4) {
      if(var3 < var4) {
         var1 += var3;
         var2 = var4 - var3 >> 2;

         while(true) {
            --var2;
            if(var2 < 0) {
               var2 = var4 - var3 & 3;

               while(true) {
                  --var2;
                  if(var2 < 0) {
                     return;
                  }

                  var0[var1++] = 1;
               }
            }

            var0[var1++] = 1;
            var0[var1++] = 1;
            var0[var1++] = 1;
            var0[var1++] = 1;
         }
      }
   }

   boolean method2209(int var1, int var2) {
      return this.aByteArray_3063.length >= var1 * var2;
   }

   void method2210(int var1, int var2, int var3, int var4) {
      this.anInt_3064 = var1;
      this.anInt_3066 = var2;
      this.anInt_3062 = var3 - var1;
      this.anInt_3065 = var4 - var2;
   }
}
