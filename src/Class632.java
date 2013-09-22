
public class Class632 {

   static final int anInt_10083 = 2;
   int anInt_10084;
   static final int anInt_10085 = 39168;
   static final int anInt_10086 = 8;
   Class269 aClass269_10087;
   static final int anInt_10088 = 12;
   static final int anInt_10089 = 1;
   int anInt_10090 = 0;
   static final int anInt_10091 = 2010;
   static final int anInt_10092 = -2010;


   final boolean method6699(int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if(var5 > var8) {
         var5 = var8;
      }

      if(var4 < 0) {
         var4 = 0;
      }

      if(var4 >= var5) {
         return true;
      } else {
         var2 += var4 - 1;
         var3 = var5 - var4 >> 2;
         var6 += var7 * var4;
         if(this.anInt_10084 == 1) {
            this.anInt_10090 += var3;

            while(true) {
               --var3;
               if(var3 < 0) {
                  var3 = var5 - var4 & 3;

                  while(true) {
                     --var3;
                     if(var3 < 0) {
                        return true;
                     }

                     ++var2;
                     if(var6 < var1[var2]) {
                        var1[var2] = var6;
                     }

                     var6 += var7;
                  }
               }

               ++var2;
               if(var6 < var1[var2]) {
                  var1[var2] = var6;
               }

               var6 += var7;
               ++var2;
               if(var6 < var1[var2]) {
                  var1[var2] = var6;
               }

               var6 += var7;
               ++var2;
               if(var6 < var1[var2]) {
                  var1[var2] = var6;
               }

               var6 += var7;
               ++var2;
               if(var6 < var1[var2]) {
                  var1[var2] = var6;
               }

               var6 += var7;
            }
         } else {
            var6 -= '\u9900';

            while(true) {
               --var3;
               if(var3 < 0) {
                  var3 = var5 - var4 & 3;

                  while(true) {
                     --var3;
                     if(var3 < 0) {
                        return true;
                     }

                     ++var2;
                     if(var6 < var1[var2]) {
                        return false;
                     }

                     var6 += var7;
                  }
               }

               ++var2;
               if(var6 < var1[var2]) {
                  return false;
               }

               var6 += var7;
               ++var2;
               if(var6 < var1[var2]) {
                  return false;
               }

               var6 += var7;
               ++var2;
               if(var6 < var1[var2]) {
                  return false;
               }

               var6 += var7;
               ++var2;
               if(var6 < var1[var2]) {
                  return false;
               }

               var6 += var7;
            }
         }
      }
   }

   final boolean method6700(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      if(var1 <= 2010 && var2 <= 2010 && var3 <= 2010 && var4 <= 2010 && var5 <= 2010 && var6 <= 2010) {
         if(var1 >= -2010 && var2 >= -2010 && var3 >= -2010 && var4 >= -2010 && var5 >= -2010 && var6 >= -2010) {
            int var10;
            if(this.anInt_10084 == 2) {
               var10 = var4 + var1 * this.aClass269_10087.anInt_4674;
               if(var10 >= 0 && var10 < this.aClass269_10087.anIntArray_4673.length && (var7 << 8) - '\u9900' < this.aClass269_10087.anIntArray_4673[var10]) {
                  return false;
               }

               var10 = var5 + var2 * this.aClass269_10087.anInt_4674;
               if(var10 >= 0 && var10 < this.aClass269_10087.anIntArray_4673.length && (var8 << 8) - '\u9900' < this.aClass269_10087.anIntArray_4673[var10]) {
                  return false;
               }

               var10 = var6 + var3 * this.aClass269_10087.anInt_4674;
               if(var10 >= 0 && var10 < this.aClass269_10087.anIntArray_4673.length && (var9 << 8) - '\u9900' < this.aClass269_10087.anIntArray_4673[var10]) {
                  return false;
               }
            }

            var10 = var5 - var4;
            int var11 = var2 - var1;
            int var12 = var6 - var4;
            int var13 = var3 - var1;
            int var14 = var8 - var7;
            int var15 = var9 - var7;
            if(var1 < var2 && var1 < var3) {
               --var1;
               if(var2 > var3) {
                  ++var2;
               } else {
                  ++var3;
               }
            } else if(var2 < var3) {
               --var2;
               if(var1 > var3) {
                  ++var1;
               } else {
                  ++var3;
               }
            } else {
               --var3;
               if(var1 > var2) {
                  ++var1;
               } else {
                  ++var2;
               }
            }

            int var16 = 0;
            if(var2 != var1) {
               var16 = (var5 - var4 << 12) / (var2 - var1);
            }

            int var17 = 0;
            if(var3 != var2) {
               var17 = (var6 - var5 << 12) / (var3 - var2);
            }

            int var18 = 0;
            if(var3 != var1) {
               var18 = (var4 - var6 << 12) / (var1 - var3);
            }

            int var19 = var10 * var13 - var12 * var11;
            if(var19 == 0) {
               return false;
            } else {
               int var20 = (var14 * var13 - var15 * var11 << 8) / var19;
               int var21 = (var15 * var10 - var14 * var12 << 8) / var19;
               if(var1 <= var2 && var1 <= var3) {
                  if(var1 >= this.aClass269_10087.anInt_4659) {
                     return true;
                  } else {
                     if(var2 > this.aClass269_10087.anInt_4659) {
                        var2 = this.aClass269_10087.anInt_4659;
                     }

                     if(var3 > this.aClass269_10087.anInt_4659) {
                        var3 = this.aClass269_10087.anInt_4659;
                     }

                     var7 = (var7 << 8) - var20 * var4 + var20;
                     if(var2 < var3) {
                        var6 = var4 <<= 12;
                        if(var1 < 0) {
                           var6 -= var18 * var1;
                           var4 -= var16 * var1;
                           var7 -= var21 * var1;
                           var1 = 0;
                        }

                        var5 <<= 12;
                        if(var2 < 0) {
                           var5 -= var17 * var2;
                           var2 = 0;
                        }

                        if((var1 == var2 || var18 >= var16) && (var1 != var2 || var18 <= var17)) {
                           var3 -= var2;
                           var2 -= var1;
                           var1 *= this.aClass269_10087.anInt_4674;

                           while(true) {
                              --var2;
                              if(var2 < 0) {
                                 while(true) {
                                    --var3;
                                    if(var3 < 0) {
                                       return true;
                                    }

                                    if(!this.method6699(this.aClass269_10087.anIntArray_4673, var1, 0, (var5 >> 12) - 1, (var6 >> 12) + 1, var7, var20, this.aClass269_10087.anInt_4674)) {
                                       return false;
                                    }

                                    var6 += var18;
                                    var5 += var17;
                                    var7 += var21;
                                    var1 += this.aClass269_10087.anInt_4674;
                                 }
                              }

                              if(!this.method6699(this.aClass269_10087.anIntArray_4673, var1, 0, (var4 >> 12) - 1, (var6 >> 12) + 1, var7, var20, this.aClass269_10087.anInt_4674)) {
                                 return false;
                              }

                              var6 += var18;
                              var4 += var16;
                              var7 += var21;
                              var1 += this.aClass269_10087.anInt_4674;
                           }
                        } else {
                           var3 -= var2;
                           var2 -= var1;
                           var1 *= this.aClass269_10087.anInt_4674;

                           while(true) {
                              --var2;
                              if(var2 < 0) {
                                 while(true) {
                                    --var3;
                                    if(var3 < 0) {
                                       return true;
                                    }

                                    if(!this.method6699(this.aClass269_10087.anIntArray_4673, var1, 0, (var6 >> 12) - 1, (var5 >> 12) + 1, var7, var20, this.aClass269_10087.anInt_4674)) {
                                       return false;
                                    }

                                    var6 += var18;
                                    var5 += var17;
                                    var7 += var21;
                                    var1 += this.aClass269_10087.anInt_4674;
                                 }
                              }

                              if(!this.method6699(this.aClass269_10087.anIntArray_4673, var1, 0, (var6 >> 12) - 1, (var4 >> 12) + 1, var7, var20, this.aClass269_10087.anInt_4674)) {
                                 return false;
                              }

                              var6 += var18;
                              var4 += var16;
                              var7 += var21;
                              var1 += this.aClass269_10087.anInt_4674;
                           }
                        }
                     } else {
                        var5 = var4 <<= 12;
                        if(var1 < 0) {
                           var5 -= var18 * var1;
                           var4 -= var16 * var1;
                           var7 -= var21 * var1;
                           var1 = 0;
                        }

                        var6 <<= 12;
                        if(var3 < 0) {
                           var6 -= var17 * var3;
                           var3 = 0;
                        }

                        if((var1 == var3 || var18 >= var16) && (var1 != var3 || var17 <= var16)) {
                           var2 -= var3;
                           var3 -= var1;
                           var1 *= this.aClass269_10087.anInt_4674;

                           while(true) {
                              --var3;
                              if(var3 < 0) {
                                 while(true) {
                                    --var2;
                                    if(var2 < 0) {
                                       return true;
                                    }

                                    if(!this.method6699(this.aClass269_10087.anIntArray_4673, var1, 0, (var4 >> 12) - 1, (var6 >> 12) + 1, var7, var20, this.aClass269_10087.anInt_4674)) {
                                       return false;
                                    }

                                    var6 += var17;
                                    var4 += var16;
                                    var7 += var21;
                                    var1 += this.aClass269_10087.anInt_4674;
                                 }
                              }

                              if(!this.method6699(this.aClass269_10087.anIntArray_4673, var1, 0, (var4 >> 12) - 1, (var5 >> 12) + 1, var7, var20, this.aClass269_10087.anInt_4674)) {
                                 return false;
                              }

                              var5 += var18;
                              var4 += var16;
                              var7 += var21;
                              var1 += this.aClass269_10087.anInt_4674;
                           }
                        } else {
                           var2 -= var3;
                           var3 -= var1;
                           var1 *= this.aClass269_10087.anInt_4674;

                           while(true) {
                              --var3;
                              if(var3 < 0) {
                                 while(true) {
                                    --var2;
                                    if(var2 < 0) {
                                       return true;
                                    }

                                    if(!this.method6699(this.aClass269_10087.anIntArray_4673, var1, 0, (var6 >> 12) - 1, (var4 >> 12) + 1, var7, var20, this.aClass269_10087.anInt_4674)) {
                                       return false;
                                    }

                                    var6 += var17;
                                    var4 += var16;
                                    var7 += var21;
                                    var1 += this.aClass269_10087.anInt_4674;
                                 }
                              }

                              if(!this.method6699(this.aClass269_10087.anIntArray_4673, var1, 0, (var5 >> 12) - 1, (var4 >> 12) + 1, var7, var20, this.aClass269_10087.anInt_4674)) {
                                 return false;
                              }

                              var5 += var18;
                              var4 += var16;
                              var7 += var21;
                              var1 += this.aClass269_10087.anInt_4674;
                           }
                        }
                     }
                  }
               } else if(var2 > var3) {
                  if(var3 >= this.aClass269_10087.anInt_4659) {
                     return true;
                  } else {
                     if(var1 > this.aClass269_10087.anInt_4659) {
                        var1 = this.aClass269_10087.anInt_4659;
                     }

                     if(var2 > this.aClass269_10087.anInt_4659) {
                        var2 = this.aClass269_10087.anInt_4659;
                     }

                     var9 = (var9 << 8) - var20 * var6 + var20;
                     if(var1 < var2) {
                        var5 = var6 <<= 12;
                        if(var3 < 0) {
                           var5 -= var17 * var3;
                           var6 -= var18 * var3;
                           var9 -= var21 * var3;
                           var3 = 0;
                        }

                        var4 <<= 12;
                        if(var1 < 0) {
                           var4 -= var16 * var1;
                           var1 = 0;
                        }

                        if(var17 < var18) {
                           var2 -= var1;
                           var1 -= var3;
                           var3 *= this.aClass269_10087.anInt_4674;

                           while(true) {
                              --var1;
                              if(var1 < 0) {
                                 while(true) {
                                    --var2;
                                    if(var2 < 0) {
                                       return true;
                                    }

                                    if(!this.method6699(this.aClass269_10087.anIntArray_4673, var3, 0, (var5 >> 12) - 1, (var4 >> 12) + 1, var9, var20, this.aClass269_10087.anInt_4674)) {
                                       return false;
                                    }

                                    var5 += var17;
                                    var4 += var16;
                                    var9 += var21;
                                    var3 += this.aClass269_10087.anInt_4674;
                                 }
                              }

                              if(!this.method6699(this.aClass269_10087.anIntArray_4673, var3, 0, (var5 >> 12) - 1, (var6 >> 12) + 1, var9, var20, this.aClass269_10087.anInt_4674)) {
                                 return false;
                              }

                              var5 += var17;
                              var6 += var18;
                              var9 += var21;
                              var3 += this.aClass269_10087.anInt_4674;
                           }
                        } else {
                           var2 -= var1;
                           var1 -= var3;
                           var3 *= this.aClass269_10087.anInt_4674;

                           while(true) {
                              --var1;
                              if(var1 < 0) {
                                 while(true) {
                                    --var2;
                                    if(var2 < 0) {
                                       return true;
                                    }

                                    if(!this.method6699(this.aClass269_10087.anIntArray_4673, var3, 0, (var4 >> 12) - 1, (var5 >> 12) + 1, var9, var20, this.aClass269_10087.anInt_4674)) {
                                       return false;
                                    }

                                    var5 += var17;
                                    var4 += var16;
                                    var9 += var21;
                                    var3 += this.aClass269_10087.anInt_4674;
                                 }
                              }

                              if(!this.method6699(this.aClass269_10087.anIntArray_4673, var3, 0, (var6 >> 12) - 1, (var5 >> 12) + 1, var9, var20, this.aClass269_10087.anInt_4674)) {
                                 return false;
                              }

                              var5 += var17;
                              var6 += var18;
                              var9 += var21;
                              var3 += this.aClass269_10087.anInt_4674;
                           }
                        }
                     } else {
                        var4 = var6 <<= 12;
                        if(var3 < 0) {
                           var4 -= var17 * var3;
                           var6 -= var18 * var3;
                           var9 -= var21 * var3;
                           var3 = 0;
                        }

                        var5 <<= 12;
                        if(var2 < 0) {
                           var5 -= var16 * var2;
                           var2 = 0;
                        }

                        if(var17 < var18) {
                           var1 -= var2;
                           var2 -= var3;
                           var3 *= this.aClass269_10087.anInt_4674;

                           while(true) {
                              --var2;
                              if(var2 < 0) {
                                 while(true) {
                                    --var1;
                                    if(var1 < 0) {
                                       return true;
                                    }

                                    if(!this.method6699(this.aClass269_10087.anIntArray_4673, var3, 0, (var5 >> 12) - 1, (var6 >> 12) + 1, var9, var20, this.aClass269_10087.anInt_4674)) {
                                       return false;
                                    }

                                    var5 += var16;
                                    var6 += var18;
                                    var9 += var21;
                                    var3 += this.aClass269_10087.anInt_4674;
                                 }
                              }

                              if(!this.method6699(this.aClass269_10087.anIntArray_4673, var3, 0, (var4 >> 12) - 1, (var6 >> 12) + 1, var9, var20, this.aClass269_10087.anInt_4674)) {
                                 return false;
                              }

                              var4 += var17;
                              var6 += var18;
                              var9 += var21;
                              var3 += this.aClass269_10087.anInt_4674;
                           }
                        } else {
                           var1 -= var2;
                           var2 -= var3;
                           var3 *= this.aClass269_10087.anInt_4674;

                           while(true) {
                              --var2;
                              if(var2 < 0) {
                                 while(true) {
                                    --var1;
                                    if(var1 < 0) {
                                       return true;
                                    }

                                    if(!this.method6699(this.aClass269_10087.anIntArray_4673, var3, 0, (var6 >> 12) - 1, (var5 >> 12) + 1, var9, var20, this.aClass269_10087.anInt_4674)) {
                                       return false;
                                    }

                                    var5 += var16;
                                    var6 += var18;
                                    var9 += var21;
                                    var3 += this.aClass269_10087.anInt_4674;
                                 }
                              }

                              if(!this.method6699(this.aClass269_10087.anIntArray_4673, var3, 0, (var6 >> 12) - 1, (var4 >> 12) + 1, var9, var20, this.aClass269_10087.anInt_4674)) {
                                 return false;
                              }

                              var4 += var17;
                              var6 += var18;
                              var9 += var21;
                              var3 += this.aClass269_10087.anInt_4674;
                           }
                        }
                     }
                  }
               } else if(var2 >= this.aClass269_10087.anInt_4659) {
                  return true;
               } else {
                  if(var3 > this.aClass269_10087.anInt_4659) {
                     var3 = this.aClass269_10087.anInt_4659;
                  }

                  if(var1 > this.aClass269_10087.anInt_4659) {
                     var1 = this.aClass269_10087.anInt_4659;
                  }

                  var8 = (var8 << 8) - var20 * var5 + var20;
                  if(var3 >= var1) {
                     var6 = var5 <<= 12;
                     if(var2 < 0) {
                        var6 -= var16 * var2;
                        var5 -= var17 * var2;
                        var8 -= var21 * var2;
                        var2 = 0;
                     }

                     var4 <<= 12;
                     if(var1 < 0) {
                        var4 -= var18 * var1;
                        var1 = 0;
                     }

                     if(var16 < var17) {
                        var3 -= var1;
                        var1 -= var2;
                        var2 *= this.aClass269_10087.anInt_4674;

                        while(true) {
                           --var1;
                           if(var1 < 0) {
                              while(true) {
                                 --var3;
                                 if(var3 < 0) {
                                    return true;
                                 }

                                 if(!this.method6699(this.aClass269_10087.anIntArray_4673, var2, 0, (var4 >> 12) - 1, (var5 >> 12) + 1, var8, var20, this.aClass269_10087.anInt_4674)) {
                                    return false;
                                 }

                                 var4 += var18;
                                 var5 += var17;
                                 var8 += var21;
                                 var2 += this.aClass269_10087.anInt_4674;
                              }
                           }

                           if(!this.method6699(this.aClass269_10087.anIntArray_4673, var2, 0, (var6 >> 12) - 1, (var5 >> 12) + 1, var8, var20, this.aClass269_10087.anInt_4674)) {
                              return false;
                           }

                           var6 += var16;
                           var5 += var17;
                           var8 += var21;
                           var2 += this.aClass269_10087.anInt_4674;
                        }
                     } else {
                        var3 -= var1;
                        var1 -= var2;
                        var2 *= this.aClass269_10087.anInt_4674;

                        while(true) {
                           --var1;
                           if(var1 < 0) {
                              while(true) {
                                 --var3;
                                 if(var3 < 0) {
                                    return true;
                                 }

                                 if(!this.method6699(this.aClass269_10087.anIntArray_4673, var2, 0, (var5 >> 12) - 1, (var4 >> 12) + 1, var8, var20, this.aClass269_10087.anInt_4674)) {
                                    return false;
                                 }

                                 var4 += var18;
                                 var5 += var17;
                                 var8 += var21;
                                 var2 += this.aClass269_10087.anInt_4674;
                              }
                           }

                           if(!this.method6699(this.aClass269_10087.anIntArray_4673, var2, 0, (var5 >> 12) - 1, (var6 >> 12) + 1, var8, var20, this.aClass269_10087.anInt_4674)) {
                              return false;
                           }

                           var6 += var16;
                           var5 += var17;
                           var8 += var21;
                           var2 += this.aClass269_10087.anInt_4674;
                        }
                     }
                  } else {
                     var4 = var5 <<= 12;
                     if(var2 < 0) {
                        var4 -= var16 * var2;
                        var5 -= var17 * var2;
                        var8 -= var21 * var2;
                        var2 = 0;
                     }

                     var6 <<= 12;
                     if(var3 < 0) {
                        var6 -= var18 * var3;
                        var3 = 0;
                     }

                     if((var2 == var3 || var16 >= var17) && (var2 != var3 || var16 <= var18)) {
                        var1 -= var3;
                        var3 -= var2;
                        var2 *= this.aClass269_10087.anInt_4674;

                        while(true) {
                           --var3;
                           if(var3 < 0) {
                              while(true) {
                                 --var1;
                                 if(var1 < 0) {
                                    return true;
                                 }

                                 if(!this.method6699(this.aClass269_10087.anIntArray_4673, var2, 0, (var6 >> 12) - 1, (var4 >> 12) + 1, var8, var20, this.aClass269_10087.anInt_4674)) {
                                    return false;
                                 }

                                 var4 += var16;
                                 var6 += var18;
                                 var8 += var21;
                                 var2 += this.aClass269_10087.anInt_4674;
                              }
                           }

                           if(!this.method6699(this.aClass269_10087.anIntArray_4673, var2, 0, (var5 >> 12) - 1, (var4 >> 12) + 1, var8, var20, this.aClass269_10087.anInt_4674)) {
                              return false;
                           }

                           var4 += var16;
                           var5 += var17;
                           var8 += var21;
                           var2 += this.aClass269_10087.anInt_4674;
                        }
                     } else {
                        var1 -= var3;
                        var3 -= var2;
                        var2 *= this.aClass269_10087.anInt_4674;

                        while(true) {
                           --var3;
                           if(var3 < 0) {
                              while(true) {
                                 --var1;
                                 if(var1 < 0) {
                                    return true;
                                 }

                                 if(!this.method6699(this.aClass269_10087.anIntArray_4673, var2, 0, (var4 >> 12) - 1, (var6 >> 12) + 1, var8, var20, this.aClass269_10087.anInt_4674)) {
                                    return false;
                                 }

                                 var4 += var16;
                                 var6 += var18;
                                 var8 += var21;
                                 var2 += this.aClass269_10087.anInt_4674;
                              }
                           }

                           if(!this.method6699(this.aClass269_10087.anIntArray_4673, var2, 0, (var4 >> 12) - 1, (var5 >> 12) + 1, var8, var20, this.aClass269_10087.anInt_4674)) {
                              return false;
                           }

                           var4 += var16;
                           var5 += var17;
                           var8 += var21;
                           var2 += this.aClass269_10087.anInt_4674;
                        }
                     }
                  }
               }
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   Class632(Class269 var1) {
      this.aClass269_10087 = var1;
   }
}
