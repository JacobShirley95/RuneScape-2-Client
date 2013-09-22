
public class Class240_Sub22_Sub7_Sub2 extends Class240_Sub22_Sub7 {

   static final int anInt_3227 = 16;
   int anInt_3228;
   int anInt_3229;
   int anInt_3230;
   int anInt_3231;
   final byte[] aByteArray_3232;


   void method2334(int var1, int var2, int var3, int var4, int var5, int var6) {
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
               var1 *= this.anInt_3231;

               while(true) {
                  --var2;
                  if(var2 < 0) {
                     while(true) {
                        --var3;
                        if(var3 < 0) {
                           return;
                        }

                        method2338(this.aByteArray_3232, var1, 0, var5 >> 16, var6 >> 16);
                        var6 += var9;
                        var5 += var8;
                        var1 += this.anInt_3231;
                     }
                  }

                  method2338(this.aByteArray_3232, var1, 0, var4 >> 16, var6 >> 16);
                  var6 += var9;
                  var4 += var7;
                  var1 += this.anInt_3231;
               }
            } else {
               var3 -= var2;
               var2 -= var1;
               var1 *= this.anInt_3231;

               while(true) {
                  --var2;
                  if(var2 < 0) {
                     while(true) {
                        --var3;
                        if(var3 < 0) {
                           return;
                        }

                        method2338(this.aByteArray_3232, var1, 0, var6 >> 16, var5 >> 16);
                        var6 += var9;
                        var5 += var8;
                        var1 += this.anInt_3231;
                     }
                  }

                  method2338(this.aByteArray_3232, var1, 0, var6 >> 16, var4 >> 16);
                  var6 += var9;
                  var4 += var7;
                  var1 += this.anInt_3231;
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
               var1 *= this.anInt_3231;

               while(true) {
                  --var3;
                  if(var3 < 0) {
                     while(true) {
                        --var2;
                        if(var2 < 0) {
                           return;
                        }

                        method2338(this.aByteArray_3232, var1, 0, var4 >> 16, var6 >> 16);
                        var6 += var8;
                        var4 += var7;
                        var1 += this.anInt_3231;
                     }
                  }

                  method2338(this.aByteArray_3232, var1, 0, var4 >> 16, var5 >> 16);
                  var5 += var9;
                  var4 += var7;
                  var1 += this.anInt_3231;
               }
            } else {
               var2 -= var3;
               var3 -= var1;
               var1 *= this.anInt_3231;

               while(true) {
                  --var3;
                  if(var3 < 0) {
                     while(true) {
                        --var2;
                        if(var2 < 0) {
                           return;
                        }

                        method2338(this.aByteArray_3232, var1, 0, var6 >> 16, var4 >> 16);
                        var6 += var8;
                        var4 += var7;
                        var1 += this.anInt_3231;
                     }
                  }

                  method2338(this.aByteArray_3232, var1, 0, var5 >> 16, var4 >> 16);
                  var5 += var9;
                  var4 += var7;
                  var1 += this.anInt_3231;
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
               var2 *= this.anInt_3231;

               while(true) {
                  --var3;
                  if(var3 < 0) {
                     while(true) {
                        --var1;
                        if(var1 < 0) {
                           return;
                        }

                        method2338(this.aByteArray_3232, var2, 0, var6 >> 16, var4 >> 16);
                        var4 += var7;
                        var6 += var9;
                        var2 += this.anInt_3231;
                     }
                  }

                  method2338(this.aByteArray_3232, var2, 0, var5 >> 16, var4 >> 16);
                  var4 += var7;
                  var5 += var8;
                  var2 += this.anInt_3231;
               }
            } else {
               var1 -= var3;
               var3 -= var2;
               var2 *= this.anInt_3231;

               while(true) {
                  --var3;
                  if(var3 < 0) {
                     while(true) {
                        --var1;
                        if(var1 < 0) {
                           return;
                        }

                        method2338(this.aByteArray_3232, var2, 0, var4 >> 16, var6 >> 16);
                        var4 += var7;
                        var6 += var9;
                        var2 += this.anInt_3231;
                     }
                  }

                  method2338(this.aByteArray_3232, var2, 0, var4 >> 16, var5 >> 16);
                  var4 += var7;
                  var5 += var8;
                  var2 += this.anInt_3231;
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
               var2 *= this.anInt_3231;

               while(true) {
                  --var1;
                  if(var1 < 0) {
                     while(true) {
                        --var3;
                        if(var3 < 0) {
                           return;
                        }

                        method2338(this.aByteArray_3232, var2, 0, var4 >> 16, var5 >> 16);
                        var4 += var9;
                        var5 += var8;
                        var2 += this.anInt_3231;
                     }
                  }

                  method2338(this.aByteArray_3232, var2, 0, var6 >> 16, var5 >> 16);
                  var6 += var7;
                  var5 += var8;
                  var2 += this.anInt_3231;
               }
            } else {
               var3 -= var1;
               var1 -= var2;
               var2 *= this.anInt_3231;

               while(true) {
                  --var1;
                  if(var1 < 0) {
                     while(true) {
                        --var3;
                        if(var3 < 0) {
                           return;
                        }

                        method2338(this.aByteArray_3232, var2, 0, var5 >> 16, var4 >> 16);
                        var4 += var9;
                        var5 += var8;
                        var2 += this.anInt_3231;
                     }
                  }

                  method2338(this.aByteArray_3232, var2, 0, var5 >> 16, var6 >> 16);
                  var6 += var7;
                  var5 += var8;
                  var2 += this.anInt_3231;
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
            var3 *= this.anInt_3231;

            while(true) {
               --var1;
               if(var1 < 0) {
                  while(true) {
                     --var2;
                     if(var2 < 0) {
                        return;
                     }

                     method2338(this.aByteArray_3232, var3, 0, var5 >> 16, var4 >> 16);
                     var5 += var8;
                     var4 += var7;
                     var3 += this.anInt_3231;
                  }
               }

               method2338(this.aByteArray_3232, var3, 0, var5 >> 16, var6 >> 16);
               var5 += var8;
               var6 += var9;
               var3 += this.anInt_3231;
            }
         } else {
            var2 -= var1;
            var1 -= var3;
            var3 *= this.anInt_3231;

            while(true) {
               --var1;
               if(var1 < 0) {
                  while(true) {
                     --var2;
                     if(var2 < 0) {
                        return;
                     }

                     method2338(this.aByteArray_3232, var3, 0, var4 >> 16, var5 >> 16);
                     var5 += var8;
                     var4 += var7;
                     var3 += this.anInt_3231;
                  }
               }

               method2338(this.aByteArray_3232, var3, 0, var6 >> 16, var5 >> 16);
               var5 += var8;
               var6 += var9;
               var3 += this.anInt_3231;
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
            var3 *= this.anInt_3231;

            while(true) {
               --var2;
               if(var2 < 0) {
                  while(true) {
                     --var1;
                     if(var1 < 0) {
                        return;
                     }

                     method2338(this.aByteArray_3232, var3, 0, var5 >> 16, var6 >> 16);
                     var5 += var7;
                     var6 += var9;
                     var3 += this.anInt_3231;
                  }
               }

               method2338(this.aByteArray_3232, var3, 0, var4 >> 16, var6 >> 16);
               var4 += var8;
               var6 += var9;
               var3 += this.anInt_3231;
            }
         } else {
            var1 -= var2;
            var2 -= var3;
            var3 *= this.anInt_3231;

            while(true) {
               --var2;
               if(var2 < 0) {
                  while(true) {
                     --var1;
                     if(var1 < 0) {
                        return;
                     }

                     method2338(this.aByteArray_3232, var3, 0, var6 >> 16, var5 >> 16);
                     var5 += var7;
                     var6 += var9;
                     var3 += this.anInt_3231;
                  }
               }

               method2338(this.aByteArray_3232, var3, 0, var6 >> 16, var4 >> 16);
               var4 += var8;
               var6 += var9;
               var3 += this.anInt_3231;
            }
         }
      }
   }

   void method2335(int var1, int var2, int var3, int var4) {
      this.anInt_3230 = var1;
      this.anInt_3228 = var2;
      this.anInt_3231 = var3 - var1;
      this.anInt_3229 = var4 - var2;
   }

   boolean method2336(int var1, int var2) {
      return this.aByteArray_3232.length >= var1 * var2;
   }

   void method2337() {
      int var1 = -1;

      for(int var2 = this.aByteArray_3232.length - 8; var1 < var2; this.aByteArray_3232[var1] = 0) {
         ++var1;
         this.aByteArray_3232[var1] = 0;
         ++var1;
         this.aByteArray_3232[var1] = 0;
         ++var1;
         this.aByteArray_3232[var1] = 0;
         ++var1;
         this.aByteArray_3232[var1] = 0;
         ++var1;
         this.aByteArray_3232[var1] = 0;
         ++var1;
         this.aByteArray_3232[var1] = 0;
         ++var1;
         this.aByteArray_3232[var1] = 0;
         ++var1;
      }

      while(var1 < this.aByteArray_3232.length - 1) {
         ++var1;
         this.aByteArray_3232[var1] = 0;
      }

   }

   static final void method2338(byte[] var0, int var1, int var2, int var3, int var4) {
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

   Class240_Sub22_Sub7_Sub2(Renderer_Sub3 var1, int var2, int var3) {
      this.aByteArray_3232 = new byte[var2 * var3];
   }
}
