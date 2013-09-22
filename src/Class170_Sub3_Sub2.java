
public class Class170_Sub3_Sub2 extends SoftwareSprite {

   byte[] imageData;
   int[] anIntArray_2076;


   public void method2127(int var1, int var2, int var3, int var4, int var5, int var6) {
      throw new IllegalStateException();
   }

   public void method2142(int var1, int var2, Class1024 var3, int var4, int var5) {
      if(this.renderer.method6820()) {
         throw new IllegalStateException();
      } else {
         int[] var6 = this.renderer.renderArray;
         if(var6 != null) {
            var1 += this.x;
            var2 += this.y;
            int var7 = 0;
            int var8 = this.renderer.renderWidth * 1176497263;
            int var9 = this.width;
            int var10 = this.height;
            int var11 = var8 - var9;
            int var12 = 0;
            int var13 = var1 + var2 * var8;
            int var14;
            if(var2 < this.renderer.targetWidth * 759884099) {
               var14 = this.renderer.targetWidth * 759884099 - var2;
               var10 -= var14;
               var2 = this.renderer.targetWidth * 759884099;
               var7 += var14 * var9;
               var13 += var14 * var8;
            }

            if(var2 + var10 > this.renderer.targetHeight * 108427145) {
               var10 -= var2 + var10 - this.renderer.targetHeight * 108427145;
            }

            if(var1 < this.renderer.targetX * -346770183) {
               var14 = this.renderer.targetX * -346770183 - var1;
               var9 -= var14;
               var1 = this.renderer.targetX * -346770183;
               var7 += var14;
               var13 += var14;
               var12 += var14;
               var11 += var14;
            }

            if(var1 + var9 > this.renderer.targetY * 1163141991) {
               var14 = var1 + var9 - this.renderer.targetY * 1163141991;
               var9 -= var14;
               var12 += var14;
               var11 += var14;
            }

            if(var9 > 0 && var10 > 0) {
               Class1024_Sub3 var26 = (Class1024_Sub3)var3;
               int[] var15 = var26.anIntArray_10982;
               int[] var16 = var26.anIntArray_10981;
               int var17 = var2;
               if(var5 > var2) {
                  var17 = var5;
                  var13 += (var5 - var2) * var8;
                  var7 += (var5 - var2) * this.width;
               }

               int var18 = var5 + var15.length < var2 + var10?var5 + var15.length:var2 + var10;

               for(int var19 = var17; var19 < var18; ++var19) {
                  int var20 = var15[var19 - var5] + var4;
                  int var21 = var16[var19 - var5];
                  int var22 = var9;
                  int var23;
                  if(var1 > var20) {
                     var23 = var1 - var20;
                     if(var23 >= var21) {
                        var7 += var9 + var12;
                        var13 += var9 + var11;
                        continue;
                     }

                     var21 -= var23;
                  } else {
                     var23 = var20 - var1;
                     if(var23 >= var9) {
                        var7 += var9 + var12;
                        var13 += var9 + var11;
                        continue;
                     }

                     var7 += var23;
                     var22 = var9 - var23;
                     var13 += var23;
                  }

                  var23 = 0;
                  if(var22 < var21) {
                     var21 = var22;
                  } else {
                     var23 = var22 - var21;
                  }

                  for(int var24 = -var21; var24 < 0; ++var24) {
                     byte var25 = this.imageData[var7++];
                     if(var25 != 0) {
                        var6[var13++] = this.anIntArray_2076[var25 & 255];
                     } else {
                        ++var13;
                     }
                  }

                  var7 += var23 + var12;
                  var13 += var23 + var11;
               }

            }
         }
      }
   }

   public Class101 method2126() {
      throw new IllegalStateException();
   }

   void method7554(boolean var1, boolean var2, boolean var3, int var4, int var5, float var6, int var7, int var8, int var9, int var10, int var11, int var12, boolean var13) {
      if(var7 > 0 && var8 > 0) {
         if(var1 || var2) {
            int var14 = 0;
            int var15 = 0;
            int var16 = this.x + this.width + this.x2;
            int var17 = this.y + this.height + this.y2;
            int var18 = (var16 << 16) / var7;
            int var19 = (var17 << 16) / var8;
            int var20;
            if(this.x > 0) {
               var20 = ((this.x << 16) + var18 - 1) / var18;
               var4 += var20;
               var14 += var20 * var18 - (this.x << 16);
            }

            if(this.y > 0) {
               var20 = ((this.y << 16) + var19 - 1) / var19;
               var5 += var20;
               var15 += var20 * var19 - (this.y << 16);
            }

            if(this.width < var16) {
               var7 = ((this.width << 16) - var14 + var18 - 1) / var18;
            }

            if(this.height < var17) {
               var8 = ((this.height << 16) - var15 + var19 - 1) / var19;
            }

            var20 = var4 + var5 * this.renderer.renderWidth * 1176497263;
            int var21 = this.renderer.renderWidth * 1176497263 - var7;
            if(var5 + var8 > this.renderer.targetHeight * 108427145) {
               var8 -= var5 + var8 - this.renderer.targetHeight * 108427145;
            }

            int var22;
            if(var5 < this.renderer.targetWidth * 759884099) {
               var22 = this.renderer.targetWidth * 759884099 - var5;
               var8 -= var22;
               var20 += var22 * this.renderer.renderWidth * 1176497263;
               var15 += var19 * var22;
            }

            if(var4 + var7 > this.renderer.targetY * 1163141991) {
               var22 = var4 + var7 - this.renderer.targetY * 1163141991;
               var7 -= var22;
               var21 += var22;
            }

            if(var4 < this.renderer.targetX * -346770183) {
               var22 = this.renderer.targetX * -346770183 - var4;
               var7 -= var22;
               var20 += var22;
               var14 += var18 * var22;
               var21 += var22;
            }

            float[] var39 = this.renderer.aFloatArray_10159;
            int[] var23 = this.renderer.renderArray;
            int var25;
            int var24;
            int var27;
            int var26;
            int var29;
            int var28;
            int var31;
            int var30;
            int var34;
            int var32;
            int var33;
            byte var40;
            if(var11 == 0) {
               if(var9 == 1) {
                  var24 = var14;

                  for(var25 = -var8; var25 < 0; ++var25) {
                     var26 = (var15 >> 16) * this.width;

                     for(var27 = -var7; var27 < 0; ++var27) {
                        if(!var2 || var6 < var39[var20]) {
                           if(var1) {
                              var23[var20] = this.anIntArray_2076[this.imageData[(var14 >> 16) + var26] & 255];
                           }

                           if(var2 && var13) {
                              var39[var20] = var6;
                           }
                        }

                        var14 += var18;
                        ++var20;
                     }

                     var15 += var19;
                     var14 = var24;
                     var20 += var21;
                  }
               } else if(var9 == 0) {
                  var24 = (var10 & 16711680) >> 16;
                  var25 = (var10 & '\uff00') >> 8;
                  var26 = var10 & 255;
                  var27 = var14;

                  for(var28 = -var8; var28 < 0; ++var28) {
                     var29 = (var15 >> 16) * this.width;

                     for(var30 = -var7; var30 < 0; ++var30) {
                        if(!var2 || var6 < var39[var20]) {
                           if(var1) {
                              var31 = this.anIntArray_2076[this.imageData[(var14 >> 16) + var29] & 255];
                              var32 = (var31 & 16711680) * var24 & -16777216;
                              var33 = (var31 & '\uff00') * var25 & 16711680;
                              var34 = (var31 & 255) * var26 & '\uff00';
                              var23[var20] = (var32 | var33 | var34) >>> 8;
                           }

                           if(var2 && var13) {
                              var39[var20] = var6;
                           }
                        }

                        var14 += var18;
                        ++var20;
                     }

                     var15 += var19;
                     var14 = var27;
                     var20 += var21;
                  }
               } else if(var9 == 3) {
                  var24 = var14;

                  for(var25 = -var8; var25 < 0; ++var25) {
                     var26 = (var15 >> 16) * this.width;

                     for(var27 = -var7; var27 < 0; ++var27) {
                        if(!var2 || var6 < var39[var20]) {
                           if(var1) {
                              var40 = this.imageData[(var14 >> 16) + var26];
                              var29 = var40 > 0?this.anIntArray_2076[var40]:0;
                              var30 = var29 + var10;
                              var31 = (var29 & 16711935) + (var10 & 16711935);
                              var32 = (var31 & 16777472) + (var30 - var31 & 65536);
                              var23[var20] = var30 - var32 | var32 - (var32 >>> 8);
                           }

                           if(var2 && var13) {
                              var39[var20] = var6;
                           }
                        }

                        var14 += var18;
                        ++var20;
                     }

                     var15 += var19;
                     var14 = var24;
                     var20 += var21;
                  }
               } else {
                  if(var9 != 2) {
                     throw new IllegalArgumentException();
                  }

                  var24 = var10 >>> 24;
                  var25 = 256 - var24;
                  var26 = (var10 & 16711935) * var25 & -16711936;
                  var27 = (var10 & '\uff00') * var25 & 16711680;
                  var10 = (var26 | var27) >>> 8;
                  var28 = var14;

                  for(var29 = -var8; var29 < 0; ++var29) {
                     var30 = (var15 >> 16) * this.width;

                     for(var31 = -var7; var31 < 0; ++var31) {
                        if(!var2 || var6 < var39[var20]) {
                           if(var1) {
                              var32 = this.anIntArray_2076[this.imageData[(var14 >> 16) + var30] & 255];
                              var26 = (var32 & 16711935) * var24 & -16711936;
                              var27 = (var32 & '\uff00') * var24 & 16711680;
                              var23[var20] = ((var26 | var27) >>> 8) + var10;
                           }

                           if(var2 && var13) {
                              var39[var20] = var6;
                           }
                        }

                        var14 += var18;
                        ++var20;
                     }

                     var15 += var19;
                     var14 = var28;
                     var20 += var21;
                  }
               }
            } else {
               int var35;
               int var38;
               int var36;
               int var37;
               byte var43;
               if(var11 == 1) {
                  if(var9 == 1) {
                     var24 = var14;

                     for(var25 = -var8; var25 < 0; ++var25) {
                        var26 = (var15 >> 16) * this.width;

                        for(var27 = -var7; var27 < 0; ++var27) {
                           if(!var2 || var6 < var39[var20]) {
                              var40 = this.imageData[(var14 >> 16) + var26];
                              if(var40 != 0) {
                                 if(var1) {
                                    var23[var20] = this.anIntArray_2076[var40 & 255];
                                 }

                                 if(var2 && var13) {
                                    var39[var20] = var6;
                                 }
                              }
                           }

                           var14 += var18;
                           ++var20;
                        }

                        var15 += var19;
                        var14 = var24;
                        var20 += var21;
                     }
                  } else {
                     byte var41;
                     if(var9 == 0) {
                        var24 = var14;
                        if((var10 & 16777215) == 16777215) {
                           var25 = var10 >>> 24;
                           var26 = 256 - var25;

                           for(var27 = -var8; var27 < 0; ++var27) {
                              var28 = (var15 >> 16) * this.width;

                              for(var29 = -var7; var29 < 0; ++var29) {
                                 if(!var2 || var6 < var39[var20]) {
                                    var41 = this.imageData[(var14 >> 16) + var28];
                                    if(var41 != 0) {
                                       if(var1) {
                                          var31 = this.anIntArray_2076[var41 & 255];
                                          var32 = var23[var20];
                                          var23[var20] = ((var31 & 16711935) * var25 + (var32 & 16711935) * var26 & -16711936) + ((var31 & '\uff00') * var25 + (var32 & '\uff00') * var26 & 16711680) >> 8;
                                       }

                                       if(var2 && var13) {
                                          var39[var20] = var6;
                                       }
                                    }
                                 }

                                 var14 += var18;
                                 ++var20;
                              }

                              var15 += var19;
                              var14 = var24;
                              var20 += var21;
                           }
                        } else {
                           var25 = (var10 & 16711680) >> 16;
                           var26 = (var10 & '\uff00') >> 8;
                           var27 = var10 & 255;
                           var28 = var10 >>> 24;
                           var29 = 256 - var28;

                           for(var30 = -var8; var30 < 0; ++var30) {
                              var31 = (var15 >> 16) * this.width;

                              for(var32 = -var7; var32 < 0; ++var32) {
                                 if(!var2 || var6 < var39[var20]) {
                                    byte var42 = this.imageData[(var14 >> 16) + var31];
                                    if(var42 != 0) {
                                       var34 = this.anIntArray_2076[var42 & 255];
                                       if(var28 != 255) {
                                          if(var1) {
                                             var35 = (var34 & 16711680) * var25 & -16777216;
                                             var36 = (var34 & '\uff00') * var26 & 16711680;
                                             var37 = (var34 & 255) * var27 & '\uff00';
                                             var34 = (var35 | var36 | var37) >>> 8;
                                             var38 = var23[var20];
                                             var23[var20] = ((var34 & 16711935) * var28 + (var38 & 16711935) * var29 & -16711936) + ((var34 & '\uff00') * var28 + (var38 & '\uff00') * var29 & 16711680) >> 8;
                                          }

                                          if(var2 && var13) {
                                             var39[var20] = var6;
                                          }
                                       } else {
                                          if(var1) {
                                             var35 = (var34 & 16711680) * var25 & -16777216;
                                             var36 = (var34 & '\uff00') * var26 & 16711680;
                                             var37 = (var34 & 255) * var27 & '\uff00';
                                             var23[var20] = (var35 | var36 | var37) >>> 8;
                                          }

                                          if(var2 && var13) {
                                             var39[var20] = var6;
                                          }
                                       }
                                    }
                                 }

                                 var14 += var18;
                                 ++var20;
                              }

                              var15 += var19;
                              var14 = var24;
                              var20 += var21;
                           }
                        }
                     } else if(var9 == 3) {
                        var24 = var14;
                        var25 = var10 >>> 24;
                        var26 = 256 - var25;

                        for(var27 = -var8; var27 < 0; ++var27) {
                           var28 = (var15 >> 16) * this.width;

                           for(var29 = -var7; var29 < 0; ++var29) {
                              if(!var2 || var6 < var39[var20]) {
                                 if(var1) {
                                    var41 = this.imageData[(var14 >> 16) + var28];
                                    var31 = var41 > 0?this.anIntArray_2076[var41]:0;
                                    var32 = var31 + var10;
                                    var33 = (var31 & 16711935) + (var10 & 16711935);
                                    var34 = (var33 & 16777472) + (var32 - var33 & 65536);
                                    var34 = var32 - var34 | var34 - (var34 >>> 8);
                                    if(var31 == 0 && var25 != 255) {
                                       var31 = var34;
                                       var34 = var23[var20];
                                       var34 = ((var31 & 16711935) * var25 + (var34 & 16711935) * var26 & -16711936) + ((var31 & '\uff00') * var25 + (var34 & '\uff00') * var26 & 16711680) >> 8;
                                    }

                                    var23[var20] = var34;
                                 }

                                 if(var2 && var13) {
                                    var39[var20] = var6;
                                 }
                              }

                              var14 += var18;
                              ++var20;
                           }

                           var15 += var19;
                           var14 = var24;
                           var20 += var21;
                        }
                     } else {
                        if(var9 != 2) {
                           throw new IllegalArgumentException();
                        }

                        var24 = var10 >>> 24;
                        var25 = 256 - var24;
                        var26 = (var10 & 16711935) * var25 & -16711936;
                        var27 = (var10 & '\uff00') * var25 & 16711680;
                        var10 = (var26 | var27) >>> 8;
                        var28 = var14;

                        for(var29 = -var8; var29 < 0; ++var29) {
                           var30 = (var15 >> 16) * this.width;

                           for(var31 = -var7; var31 < 0; ++var31) {
                              if(!var2 || var6 < var39[var20]) {
                                 var43 = this.imageData[(var14 >> 16) + var30];
                                 if(var43 != 0) {
                                    if(var1) {
                                       var33 = this.anIntArray_2076[var43 & 255];
                                       var26 = (var33 & 16711935) * var24 & -16711936;
                                       var27 = (var33 & '\uff00') * var24 & 16711680;
                                       var23[var20] = ((var26 | var27) >>> 8) + var10;
                                    }

                                    if(var2 && var13) {
                                       var39[var20] = var6;
                                    }
                                 }
                              }

                              var14 += var18;
                              ++var20;
                           }

                           var15 += var19;
                           var14 = var28;
                           var20 += var21;
                        }
                     }
                  }
               } else {
                  if(var11 != 2) {
                     throw new IllegalArgumentException();
                  }

                  if(var9 == 1) {
                     var24 = var14;

                     for(var25 = -var8; var25 < 0; ++var25) {
                        var26 = (var15 >> 16) * this.width;

                        for(var27 = -var7; var27 < 0; ++var27) {
                           if(!var2 || var6 < var39[var20]) {
                              var40 = this.imageData[(var14 >> 16) + var26];
                              if(var40 != 0) {
                                 if(var1) {
                                    var29 = this.anIntArray_2076[var40 & 255];
                                    var30 = var23[var20];
                                    var31 = var29 + var30;
                                    var32 = (var29 & 16711935) + (var30 & 16711935);
                                    var30 = (var32 & 16777472) + (var31 - var32 & 65536);
                                    var23[var20] = var31 - var30 | var30 - (var30 >>> 8);
                                 }

                                 if(var2 && var13) {
                                    var39[var20] = var6;
                                 }
                              }
                           }

                           var14 += var18;
                           ++var20;
                        }

                        var15 += var19;
                        var14 = var24;
                        var20 += var21;
                     }
                  } else if(var9 == 0) {
                     var24 = var14;
                     var25 = (var10 & 16711680) >> 16;
                     var26 = (var10 & '\uff00') >> 8;
                     var27 = var10 & 255;

                     for(var28 = -var8; var28 < 0; ++var28) {
                        var29 = (var15 >> 16) * this.width;

                        for(var30 = -var7; var30 < 0; ++var30) {
                           if(!var2 || var6 < var39[var20]) {
                              byte var44 = this.imageData[(var14 >> 16) + var29];
                              if(var44 != 0) {
                                 if(var1) {
                                    var32 = this.anIntArray_2076[var44 & 255];
                                    var33 = (var32 & 16711680) * var25 & -16777216;
                                    var34 = (var32 & '\uff00') * var26 & 16711680;
                                    var35 = (var32 & 255) * var27 & '\uff00';
                                    var32 = (var33 | var34 | var35) >>> 8;
                                    var36 = var23[var20];
                                    var37 = var32 + var36;
                                    var38 = (var32 & 16711935) + (var36 & 16711935);
                                    var36 = (var38 & 16777472) + (var37 - var38 & 65536);
                                    var23[var20] = var37 - var36 | var36 - (var36 >>> 8);
                                 }

                                 if(var2 && var13) {
                                    var39[var20] = var6;
                                 }
                              }
                           }

                           var14 += var18;
                           ++var20;
                        }

                        var15 += var19;
                        var14 = var24;
                        var20 += var21;
                     }
                  } else if(var9 == 3) {
                     var24 = var14;

                     for(var25 = -var8; var25 < 0; ++var25) {
                        var26 = (var15 >> 16) * this.width;

                        for(var27 = -var7; var27 < 0; ++var27) {
                           if(!var2 || var6 < var39[var20]) {
                              if(var1) {
                                 var40 = this.imageData[(var14 >> 16) + var26];
                                 var29 = var40 > 0?this.anIntArray_2076[var40]:0;
                                 var30 = var29 + var10;
                                 var31 = (var29 & 16711935) + (var10 & 16711935);
                                 var32 = (var31 & 16777472) + (var30 - var31 & 65536);
                                 var29 = var30 - var32 | var32 - (var32 >>> 8);
                                 var32 = var23[var20];
                                 var30 = var29 + var32;
                                 var31 = (var29 & 16711935) + (var32 & 16711935);
                                 var32 = (var31 & 16777472) + (var30 - var31 & 65536);
                                 var23[var20] = var30 - var32 | var32 - (var32 >>> 8);
                              }

                              if(var2 && var13) {
                                 var39[var20] = var6;
                              }
                           }

                           var14 += var18;
                           ++var20;
                        }

                        var15 += var19;
                        var14 = var24;
                        var20 += var21;
                     }
                  } else {
                     if(var9 != 2) {
                        throw new IllegalArgumentException();
                     }

                     var24 = var10 >>> 24;
                     var25 = 256 - var24;
                     var26 = (var10 & 16711935) * var25 & -16711936;
                     var27 = (var10 & '\uff00') * var25 & 16711680;
                     var10 = (var26 | var27) >>> 8;
                     var28 = var14;

                     for(var29 = -var8; var29 < 0; ++var29) {
                        var30 = (var15 >> 16) * this.width;

                        for(var31 = -var7; var31 < 0; ++var31) {
                           if(!var2 || var6 < var39[var20]) {
                              var43 = this.imageData[(var14 >> 16) + var30];
                              if(var43 != 0) {
                                 if(var1) {
                                    var33 = this.anIntArray_2076[var43 & 255];
                                    var26 = (var33 & 16711935) * var24 & -16711936;
                                    var27 = (var33 & '\uff00') * var24 & 16711680;
                                    var33 = ((var26 | var27) >>> 8) + var10;
                                    var34 = var23[var20];
                                    var35 = var33 + var34;
                                    var36 = (var33 & 16711935) + (var34 & 16711935);
                                    var34 = (var36 & 16777472) + (var35 - var36 & 65536);
                                    var23[var20] = var35 - var34 | var34 - (var34 >>> 8);
                                 }

                                 if(var2 && var13) {
                                    var39[var20] = var6;
                                 }
                              }
                           }

                           var14 += var18;
                           ++var20;
                        }

                        var15 += var19;
                        var14 = var28;
                        var20 += var21;
                     }
                  }
               }
            }

         }
      }
   }

   void method2144(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if(this.renderer.method6820()) {
         throw new IllegalStateException();
      } else if(var3 > 0 && var4 > 0) {
         int[] var9 = this.renderer.renderArray;
         if(var9 != null) {
            int var10 = 0;
            int var11 = 0;
            int var12 = this.renderer.renderWidth * 1176497263;
            int var13 = this.x + this.width + this.x2;
            int var14 = this.y + this.height + this.y2;
            int var15 = (var13 << 16) / var3;
            int var16 = (var14 << 16) / var4;
            int var17;
            if(this.x > 0) {
               var17 = ((this.x << 16) + var15 - 1) / var15;
               var1 += var17;
               var10 += var17 * var15 - (this.x << 16);
            }

            if(this.y > 0) {
               var17 = ((this.y << 16) + var16 - 1) / var16;
               var2 += var17;
               var11 += var17 * var16 - (this.y << 16);
            }

            if(this.width < var13) {
               var3 = ((this.width << 16) - var10 + var15 - 1) / var15;
            }

            if(this.height < var14) {
               var4 = ((this.height << 16) - var11 + var16 - 1) / var16;
            }

            var17 = var1 + var2 * var12;
            int var18 = var12 - var3;
            if(var2 + var4 > this.renderer.targetHeight * 108427145) {
               var4 -= var2 + var4 - this.renderer.targetHeight * 108427145;
            }

            int var19;
            if(var2 < this.renderer.targetWidth * 759884099) {
               var19 = this.renderer.targetWidth * 759884099 - var2;
               var4 -= var19;
               var17 += var19 * var12;
               var11 += var16 * var19;
            }

            if(var1 + var3 > this.renderer.targetY * 1163141991) {
               var19 = var1 + var3 - this.renderer.targetY * 1163141991;
               var3 -= var19;
               var18 += var19;
            }

            if(var1 < this.renderer.targetX * -346770183) {
               var19 = this.renderer.targetX * -346770183 - var1;
               var3 -= var19;
               var17 += var19;
               var10 += var15 * var19;
               var18 += var19;
            }

            int var21;
            int var20;
            int var23;
            int var22;
            int var25;
            int var24;
            int var27;
            int var26;
            int var29;
            int var28;
            byte var34;
            if(var7 == 0) {
               if(var5 == 1) {
                  var19 = var10;

                  for(var20 = -var4; var20 < 0; ++var20) {
                     var21 = (var11 >> 16) * this.width;

                     for(var22 = -var3; var22 < 0; ++var22) {
                        var9[var17++] = this.anIntArray_2076[this.imageData[(var10 >> 16) + var21] & 255];
                        var10 += var15;
                     }

                     var11 += var16;
                     var10 = var19;
                     var17 += var18;
                  }
               } else if(var5 == 0) {
                  var19 = (var6 & 16711680) >> 16;
                  var20 = (var6 & '\uff00') >> 8;
                  var21 = var6 & 255;
                  var22 = var10;

                  for(var23 = -var4; var23 < 0; ++var23) {
                     var24 = (var11 >> 16) * this.width;

                     for(var25 = -var3; var25 < 0; ++var25) {
                        var26 = this.anIntArray_2076[this.imageData[(var10 >> 16) + var24] & 255];
                        var27 = (var26 & 16711680) * var19 & -16777216;
                        var28 = (var26 & '\uff00') * var20 & 16711680;
                        var29 = (var26 & 255) * var21 & '\uff00';
                        var9[var17++] = (var27 | var28 | var29) >>> 8;
                        var10 += var15;
                     }

                     var11 += var16;
                     var10 = var22;
                     var17 += var18;
                  }
               } else if(var5 == 3) {
                  var19 = var10;

                  for(var20 = -var4; var20 < 0; ++var20) {
                     var21 = (var11 >> 16) * this.width;

                     for(var22 = -var3; var22 < 0; ++var22) {
                        var34 = this.imageData[(var10 >> 16) + var21];
                        var24 = var34 > 0?this.anIntArray_2076[var34]:0;
                        var25 = var24 + var6;
                        var26 = (var24 & 16711935) + (var6 & 16711935);
                        var27 = (var26 & 16777472) + (var25 - var26 & 65536);
                        var9[var17++] = var25 - var27 | var27 - (var27 >>> 8);
                        var10 += var15;
                     }

                     var11 += var16;
                     var10 = var19;
                     var17 += var18;
                  }
               } else {
                  if(var5 != 2) {
                     throw new IllegalArgumentException();
                  }

                  var19 = var6 >>> 24;
                  var20 = 256 - var19;
                  var21 = (var6 & 16711935) * var20 & -16711936;
                  var22 = (var6 & '\uff00') * var20 & 16711680;
                  var6 = (var21 | var22) >>> 8;
                  var23 = var10;

                  for(var24 = -var4; var24 < 0; ++var24) {
                     var25 = (var11 >> 16) * this.width;

                     for(var26 = -var3; var26 < 0; ++var26) {
                        var27 = this.anIntArray_2076[this.imageData[(var10 >> 16) + var25] & 255];
                        var21 = (var27 & 16711935) * var19 & -16711936;
                        var22 = (var27 & '\uff00') * var19 & 16711680;
                        var9[var17++] = ((var21 | var22) >>> 8) + var6;
                        var10 += var15;
                     }

                     var11 += var16;
                     var10 = var23;
                     var17 += var18;
                  }
               }
            } else {
               int var31;
               int var30;
               int var32;
               int var33;
               byte var37;
               if(var7 == 1) {
                  if(var5 == 1) {
                     var19 = var10;

                     for(var20 = -var4; var20 < 0; ++var20) {
                        var21 = (var11 >> 16) * this.width;

                        for(var22 = -var3; var22 < 0; ++var22) {
                           var34 = this.imageData[(var10 >> 16) + var21];
                           if(var34 != 0) {
                              var9[var17++] = this.anIntArray_2076[var34 & 255];
                           } else {
                              ++var17;
                           }

                           var10 += var15;
                        }

                        var11 += var16;
                        var10 = var19;
                        var17 += var18;
                     }
                  } else {
                     byte var36;
                     if(var5 == 0) {
                        var19 = var10;
                        if((var6 & 16777215) == 16777215) {
                           var20 = var6 >>> 24;
                           var21 = 256 - var20;

                           for(var22 = -var4; var22 < 0; ++var22) {
                              var23 = (var11 >> 16) * this.width;

                              for(var24 = -var3; var24 < 0; ++var24) {
                                 var36 = this.imageData[(var10 >> 16) + var23];
                                 if(var36 != 0) {
                                    var26 = this.anIntArray_2076[var36 & 255];
                                    var27 = var9[var17];
                                    var9[var17++] = ((var26 & 16711935) * var20 + (var27 & 16711935) * var21 & -16711936) + ((var26 & '\uff00') * var20 + (var27 & '\uff00') * var21 & 16711680) >> 8;
                                 } else {
                                    ++var17;
                                 }

                                 var10 += var15;
                              }

                              var11 += var16;
                              var10 = var19;
                              var17 += var18;
                           }
                        } else {
                           var20 = (var6 & 16711680) >> 16;
                           var21 = (var6 & '\uff00') >> 8;
                           var22 = var6 & 255;
                           var23 = var6 >>> 24;
                           var24 = 256 - var23;

                           for(var25 = -var4; var25 < 0; ++var25) {
                              var26 = (var11 >> 16) * this.width;

                              for(var27 = -var3; var27 < 0; ++var27) {
                                 byte var35 = this.imageData[(var10 >> 16) + var26];
                                 if(var35 != 0) {
                                    var29 = this.anIntArray_2076[var35 & 255];
                                    if(var23 != 255) {
                                       var30 = (var29 & 16711680) * var20 & -16777216;
                                       var31 = (var29 & '\uff00') * var21 & 16711680;
                                       var32 = (var29 & 255) * var22 & '\uff00';
                                       var29 = (var30 | var31 | var32) >>> 8;
                                       var33 = var9[var17];
                                       var9[var17++] = ((var29 & 16711935) * var23 + (var33 & 16711935) * var24 & -16711936) + ((var29 & '\uff00') * var23 + (var33 & '\uff00') * var24 & 16711680) >> 8;
                                    } else {
                                       var30 = (var29 & 16711680) * var20 & -16777216;
                                       var31 = (var29 & '\uff00') * var21 & 16711680;
                                       var32 = (var29 & 255) * var22 & '\uff00';
                                       var9[var17++] = (var30 | var31 | var32) >>> 8;
                                    }
                                 } else {
                                    ++var17;
                                 }

                                 var10 += var15;
                              }

                              var11 += var16;
                              var10 = var19;
                              var17 += var18;
                           }
                        }
                     } else if(var5 == 3) {
                        var19 = var10;
                        var20 = var6 >>> 24;
                        var21 = 256 - var20;

                        for(var22 = -var4; var22 < 0; ++var22) {
                           var23 = (var11 >> 16) * this.width;

                           for(var24 = -var3; var24 < 0; ++var24) {
                              var36 = this.imageData[(var10 >> 16) + var23];
                              var26 = var36 > 0?this.anIntArray_2076[var36]:0;
                              var27 = var26 + var6;
                              var28 = (var26 & 16711935) + (var6 & 16711935);
                              var29 = (var28 & 16777472) + (var27 - var28 & 65536);
                              var29 = var27 - var29 | var29 - (var29 >>> 8);
                              if(var26 == 0 && var20 != 255) {
                                 var26 = var29;
                                 var29 = var9[var17];
                                 var29 = ((var26 & 16711935) * var20 + (var29 & 16711935) * var21 & -16711936) + ((var26 & '\uff00') * var20 + (var29 & '\uff00') * var21 & 16711680) >> 8;
                              }

                              var9[var17++] = var29;
                              var10 += var15;
                           }

                           var11 += var16;
                           var10 = var19;
                           var17 += var18;
                        }
                     } else {
                        if(var5 != 2) {
                           throw new IllegalArgumentException();
                        }

                        var19 = var6 >>> 24;
                        var20 = 256 - var19;
                        var21 = (var6 & 16711935) * var20 & -16711936;
                        var22 = (var6 & '\uff00') * var20 & 16711680;
                        var6 = (var21 | var22) >>> 8;
                        var23 = var10;

                        for(var24 = -var4; var24 < 0; ++var24) {
                           var25 = (var11 >> 16) * this.width;

                           for(var26 = -var3; var26 < 0; ++var26) {
                              var37 = this.imageData[(var10 >> 16) + var25];
                              if(var37 != 0) {
                                 var28 = this.anIntArray_2076[var37 & 255];
                                 var21 = (var28 & 16711935) * var19 & -16711936;
                                 var22 = (var28 & '\uff00') * var19 & 16711680;
                                 var9[var17++] = ((var21 | var22) >>> 8) + var6;
                              } else {
                                 ++var17;
                              }

                              var10 += var15;
                           }

                           var11 += var16;
                           var10 = var23;
                           var17 += var18;
                        }
                     }
                  }
               } else {
                  if(var7 != 2) {
                     throw new IllegalArgumentException();
                  }

                  if(var5 == 1) {
                     var19 = var10;

                     for(var20 = -var4; var20 < 0; ++var20) {
                        var21 = (var11 >> 16) * this.width;

                        for(var22 = -var3; var22 < 0; ++var22) {
                           var34 = this.imageData[(var10 >> 16) + var21];
                           if(var34 != 0) {
                              var24 = this.anIntArray_2076[var34 & 255];
                              var25 = var9[var17];
                              var26 = var24 + var25;
                              var27 = (var24 & 16711935) + (var25 & 16711935);
                              var25 = (var27 & 16777472) + (var26 - var27 & 65536);
                              var9[var17++] = var26 - var25 | var25 - (var25 >>> 8);
                           } else {
                              ++var17;
                           }

                           var10 += var15;
                        }

                        var11 += var16;
                        var10 = var19;
                        var17 += var18;
                     }
                  } else if(var5 == 0) {
                     var19 = var10;
                     var20 = (var6 & 16711680) >> 16;
                     var21 = (var6 & '\uff00') >> 8;
                     var22 = var6 & 255;

                     for(var23 = -var4; var23 < 0; ++var23) {
                        var24 = (var11 >> 16) * this.width;

                        for(var25 = -var3; var25 < 0; ++var25) {
                           byte var38 = this.imageData[(var10 >> 16) + var24];
                           if(var38 != 0) {
                              var27 = this.anIntArray_2076[var38 & 255];
                              var28 = (var27 & 16711680) * var20 & -16777216;
                              var29 = (var27 & '\uff00') * var21 & 16711680;
                              var30 = (var27 & 255) * var22 & '\uff00';
                              var27 = (var28 | var29 | var30) >>> 8;
                              var31 = var9[var17];
                              var32 = var27 + var31;
                              var33 = (var27 & 16711935) + (var31 & 16711935);
                              var31 = (var33 & 16777472) + (var32 - var33 & 65536);
                              var9[var17++] = var32 - var31 | var31 - (var31 >>> 8);
                           } else {
                              ++var17;
                           }

                           var10 += var15;
                        }

                        var11 += var16;
                        var10 = var19;
                        var17 += var18;
                     }
                  } else if(var5 == 3) {
                     var19 = var10;

                     for(var20 = -var4; var20 < 0; ++var20) {
                        var21 = (var11 >> 16) * this.width;

                        for(var22 = -var3; var22 < 0; ++var22) {
                           var34 = this.imageData[(var10 >> 16) + var21];
                           var24 = var34 > 0?this.anIntArray_2076[var34]:0;
                           var25 = var24 + var6;
                           var26 = (var24 & 16711935) + (var6 & 16711935);
                           var27 = (var26 & 16777472) + (var25 - var26 & 65536);
                           var24 = var25 - var27 | var27 - (var27 >>> 8);
                           var27 = var9[var17];
                           var25 = var24 + var27;
                           var26 = (var24 & 16711935) + (var27 & 16711935);
                           var27 = (var26 & 16777472) + (var25 - var26 & 65536);
                           var9[var17++] = var25 - var27 | var27 - (var27 >>> 8);
                           var10 += var15;
                        }

                        var11 += var16;
                        var10 = var19;
                        var17 += var18;
                     }
                  } else {
                     if(var5 != 2) {
                        throw new IllegalArgumentException();
                     }

                     var19 = var6 >>> 24;
                     var20 = 256 - var19;
                     var21 = (var6 & 16711935) * var20 & -16711936;
                     var22 = (var6 & '\uff00') * var20 & 16711680;
                     var6 = (var21 | var22) >>> 8;
                     var23 = var10;

                     for(var24 = -var4; var24 < 0; ++var24) {
                        var25 = (var11 >> 16) * this.width;

                        for(var26 = -var3; var26 < 0; ++var26) {
                           var37 = this.imageData[(var10 >> 16) + var25];
                           if(var37 != 0) {
                              var28 = this.anIntArray_2076[var37 & 255];
                              var21 = (var28 & 16711935) * var19 & -16711936;
                              var22 = (var28 & '\uff00') * var19 & 16711680;
                              var28 = ((var21 | var22) >>> 8) + var6;
                              var29 = var9[var17];
                              var30 = var28 + var29;
                              var31 = (var28 & 16711935) + (var29 & 16711935);
                              var29 = (var31 & 16777472) + (var30 - var31 & 65536);
                              var9[var17++] = var30 - var29 | var29 - (var29 >>> 8);
                           } else {
                              ++var17;
                           }

                           var10 += var15;
                        }

                        var11 += var16;
                        var10 = var23;
                        var17 += var18;
                     }
                  }
               }
            }

         }
      }
   }

   void method7549(int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   void method7551(int[] var1, int[] var2, int var3, int var4) {
      int[] var5 = this.renderer.renderArray;
      if(var5 != null) {
         int var6;
         int var7;
         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         int var13;
         int var14;
         byte var15;
         int var16;
         if(anInt_10927 == 0) {
            if(anInt_10928 == 0) {
               for(var6 = anInt_10926; var6 < 0; anInt_10912 += anInt_10925) {
                  var7 = var6 + var4;
                  if(var7 >= 0) {
                     if(var7 >= var1.length) {
                        return;
                     }

                     var8 = anInt_10912;
                     var9 = anInt_10933;
                     var10 = anInt_10934;
                     var11 = anInt_10922;
                     if(var9 >= 0 && var10 >= 0 && var9 - (this.width << 12) < 0 && var10 - (this.height << 12) < 0) {
                        var12 = var1[var7] - var3;
                        var13 = -var2[var7];
                        var14 = var12 - (var8 - anInt_10912);
                        if(var14 > 0) {
                           var8 += var14;
                           var11 += var14;
                           var9 += anInt_10927 * var14;
                           var10 += anInt_10928 * var14;
                        } else {
                           var13 -= var14;
                        }

                        if(var11 < var13) {
                           var11 = var13;
                        }

                        for(; var11 < 0; ++var11) {
                           var15 = this.imageData[(var10 >> 12) * this.width + (var9 >> 12)];
                           if(var15 != 0) {
                              var5[var8++] = this.anIntArray_2076[var15 & 255];
                           } else {
                              ++var8;
                           }
                        }
                     }
                  }

                  ++var6;
               }
            } else if(anInt_10928 < 0) {
               for(var6 = anInt_10926; var6 < 0; anInt_10912 += anInt_10925) {
                  var7 = var6 + var4;
                  if(var7 >= 0) {
                     if(var7 >= var1.length) {
                        return;
                     }

                     var8 = anInt_10912;
                     var9 = anInt_10933;
                     var10 = anInt_10934 + anInt_10910;
                     var11 = anInt_10922;
                     if(var9 >= 0 && var9 - (this.width << 12) < 0) {
                        if((var16 = var10 - (this.height << 12)) >= 0) {
                           var16 = (anInt_10928 - var16) / anInt_10928;
                           var11 += var16;
                           var10 += anInt_10928 * var16;
                           var8 += var16;
                        }

                        if((var16 = (var10 - anInt_10928) / anInt_10928) > var11) {
                           var11 = var16;
                        }

                        var12 = var1[var7] - var3;
                        var13 = -var2[var7];
                        var14 = var12 - (var8 - anInt_10912);
                        if(var14 > 0) {
                           var8 += var14;
                           var11 += var14;
                           var9 += anInt_10927 * var14;
                           var10 += anInt_10928 * var14;
                        } else {
                           var13 -= var14;
                        }

                        if(var11 < var13) {
                           var11 = var13;
                        }

                        while(var11 < 0) {
                           var15 = this.imageData[(var10 >> 12) * this.width + (var9 >> 12)];
                           if(var15 != 0) {
                              var5[var8++] = this.anIntArray_2076[var15 & 255];
                           } else {
                              ++var8;
                           }

                           var10 += anInt_10928;
                           ++var11;
                        }
                     }
                  }

                  ++var6;
                  anInt_10933 += anInt_10929;
               }
            } else {
               for(var6 = anInt_10926; var6 < 0; anInt_10912 += anInt_10925) {
                  var7 = var6 + var4;
                  if(var7 >= 0) {
                     if(var7 >= var1.length) {
                        return;
                     }

                     var8 = anInt_10912;
                     var9 = anInt_10933;
                     var10 = anInt_10934 + anInt_10910;
                     var11 = anInt_10922;
                     if(var9 >= 0 && var9 - (this.width << 12) < 0) {
                        if(var10 < 0) {
                           var16 = (anInt_10928 - 1 - var10) / anInt_10928;
                           var11 += var16;
                           var10 += anInt_10928 * var16;
                           var8 += var16;
                        }

                        if((var16 = (1 + var10 - (this.height << 12) - anInt_10928) / anInt_10928) > var11) {
                           var11 = var16;
                        }

                        var12 = var1[var7] - var3;
                        var13 = -var2[var7];
                        var14 = var12 - (var8 - anInt_10912);
                        if(var14 > 0) {
                           var8 += var14;
                           var11 += var14;
                           var9 += anInt_10927 * var14;
                           var10 += anInt_10928 * var14;
                        } else {
                           var13 -= var14;
                        }

                        if(var11 < var13) {
                           var11 = var13;
                        }

                        while(var11 < 0) {
                           var15 = this.imageData[(var10 >> 12) * this.width + (var9 >> 12)];
                           if(var15 != 0) {
                              var5[var8++] = this.anIntArray_2076[var15 & 255];
                           } else {
                              ++var8;
                           }

                           var10 += anInt_10928;
                           ++var11;
                        }
                     }
                  }

                  ++var6;
                  anInt_10933 += anInt_10929;
               }
            }
         } else if(anInt_10927 < 0) {
            if(anInt_10928 == 0) {
               for(var6 = anInt_10926; var6 < 0; anInt_10912 += anInt_10925) {
                  var7 = var6 + var4;
                  if(var7 >= 0) {
                     if(var7 >= var1.length) {
                        return;
                     }

                     var8 = anInt_10912;
                     var9 = anInt_10933 + anInt_10935;
                     var10 = anInt_10934;
                     var11 = anInt_10922;
                     if(var10 >= 0 && var10 - (this.height << 12) < 0) {
                        if((var16 = var9 - (this.width << 12)) >= 0) {
                           var16 = (anInt_10927 - var16) / anInt_10927;
                           var11 += var16;
                           var9 += anInt_10927 * var16;
                           var8 += var16;
                        }

                        if((var16 = (var9 - anInt_10927) / anInt_10927) > var11) {
                           var11 = var16;
                        }

                        var12 = var1[var7] - var3;
                        var13 = -var2[var7];
                        var14 = var12 - (var8 - anInt_10912);
                        if(var14 > 0) {
                           var8 += var14;
                           var11 += var14;
                           var9 += anInt_10927 * var14;
                           var10 += anInt_10928 * var14;
                        } else {
                           var13 -= var14;
                        }

                        if(var11 < var13) {
                           var11 = var13;
                        }

                        while(var11 < 0) {
                           var15 = this.imageData[(var10 >> 12) * this.width + (var9 >> 12)];
                           if(var15 != 0) {
                              var5[var8++] = this.anIntArray_2076[var15 & 255];
                           } else {
                              ++var8;
                           }

                           var9 += anInt_10927;
                           ++var11;
                        }
                     }
                  }

                  ++var6;
                  anInt_10934 += anInt_10930;
               }
            } else if(anInt_10928 < 0) {
               for(var6 = anInt_10926; var6 < 0; anInt_10912 += anInt_10925) {
                  var7 = var6 + var4;
                  if(var7 >= 0) {
                     if(var7 >= var1.length) {
                        return;
                     }

                     var8 = anInt_10912;
                     var9 = anInt_10933 + anInt_10935;
                     var10 = anInt_10934 + anInt_10910;
                     var11 = anInt_10922;
                     if((var16 = var9 - (this.width << 12)) >= 0) {
                        var16 = (anInt_10927 - var16) / anInt_10927;
                        var11 += var16;
                        var9 += anInt_10927 * var16;
                        var10 += anInt_10928 * var16;
                        var8 += var16;
                     }

                     if((var16 = (var9 - anInt_10927) / anInt_10927) > var11) {
                        var11 = var16;
                     }

                     if((var16 = var10 - (this.height << 12)) >= 0) {
                        var16 = (anInt_10928 - var16) / anInt_10928;
                        var11 += var16;
                        var9 += anInt_10927 * var16;
                        var10 += anInt_10928 * var16;
                        var8 += var16;
                     }

                     if((var16 = (var10 - anInt_10928) / anInt_10928) > var11) {
                        var11 = var16;
                     }

                     var12 = var1[var7] - var3;
                     var13 = -var2[var7];
                     var14 = var12 - (var8 - anInt_10912);
                     if(var14 > 0) {
                        var8 += var14;
                        var11 += var14;
                        var9 += anInt_10927 * var14;
                        var10 += anInt_10928 * var14;
                     } else {
                        var13 -= var14;
                     }

                     if(var11 < var13) {
                        var11 = var13;
                     }

                     while(var11 < 0) {
                        var15 = this.imageData[(var10 >> 12) * this.width + (var9 >> 12)];
                        if(var15 != 0) {
                           var5[var8++] = this.anIntArray_2076[var15 & 255];
                        } else {
                           ++var8;
                        }

                        var9 += anInt_10927;
                        var10 += anInt_10928;
                        ++var11;
                     }
                  }

                  ++var6;
                  anInt_10933 += anInt_10929;
                  anInt_10934 += anInt_10930;
               }
            } else {
               for(var6 = anInt_10926; var6 < 0; anInt_10912 += anInt_10925) {
                  var7 = var6 + var4;
                  if(var7 >= 0) {
                     if(var7 >= var1.length) {
                        return;
                     }

                     var8 = anInt_10912;
                     var9 = anInt_10933 + anInt_10935;
                     var10 = anInt_10934 + anInt_10910;
                     var11 = anInt_10922;
                     if((var16 = var9 - (this.width << 12)) >= 0) {
                        var16 = (anInt_10927 - var16) / anInt_10927;
                        var11 += var16;
                        var9 += anInt_10927 * var16;
                        var10 += anInt_10928 * var16;
                        var8 += var16;
                     }

                     if((var16 = (var9 - anInt_10927) / anInt_10927) > var11) {
                        var11 = var16;
                     }

                     if(var10 < 0) {
                        var16 = (anInt_10928 - 1 - var10) / anInt_10928;
                        var11 += var16;
                        var9 += anInt_10927 * var16;
                        var10 += anInt_10928 * var16;
                        var8 += var16;
                     }

                     if((var16 = (1 + var10 - (this.height << 12) - anInt_10928) / anInt_10928) > var11) {
                        var11 = var16;
                     }

                     var12 = var1[var7] - var3;
                     var13 = -var2[var7];
                     var14 = var12 - (var8 - anInt_10912);
                     if(var14 > 0) {
                        var8 += var14;
                        var11 += var14;
                        var9 += anInt_10927 * var14;
                        var10 += anInt_10928 * var14;
                     } else {
                        var13 -= var14;
                     }

                     if(var11 < var13) {
                        var11 = var13;
                     }

                     while(var11 < 0) {
                        var15 = this.imageData[(var10 >> 12) * this.width + (var9 >> 12)];
                        if(var15 != 0) {
                           var5[var8++] = this.anIntArray_2076[var15 & 255];
                        } else {
                           ++var8;
                        }

                        var9 += anInt_10927;
                        var10 += anInt_10928;
                        ++var11;
                     }
                  }

                  ++var6;
                  anInt_10933 += anInt_10929;
                  anInt_10934 += anInt_10930;
               }
            }
         } else if(anInt_10928 == 0) {
            for(var6 = anInt_10926; var6 < 0; anInt_10912 += anInt_10925) {
               var7 = var6 + var4;
               if(var7 >= 0) {
                  if(var7 >= var1.length) {
                     return;
                  }

                  var8 = anInt_10912;
                  var9 = anInt_10933 + anInt_10935;
                  var10 = anInt_10934;
                  var11 = anInt_10922;
                  if(var10 >= 0 && var10 - (this.height << 12) < 0) {
                     if(var9 < 0) {
                        var16 = (anInt_10927 - 1 - var9) / anInt_10927;
                        var11 += var16;
                        var9 += anInt_10927 * var16;
                        var8 += var16;
                     }

                     if((var16 = (1 + var9 - (this.width << 12) - anInt_10927) / anInt_10927) > var11) {
                        var11 = var16;
                     }

                     var12 = var1[var7] - var3;
                     var13 = -var2[var7];
                     var14 = var12 - (var8 - anInt_10912);
                     if(var14 > 0) {
                        var8 += var14;
                        var11 += var14;
                        var9 += anInt_10927 * var14;
                        var10 += anInt_10928 * var14;
                     } else {
                        var13 -= var14;
                     }

                     if(var11 < var13) {
                        var11 = var13;
                     }

                     while(var11 < 0) {
                        var15 = this.imageData[(var10 >> 12) * this.width + (var9 >> 12)];
                        if(var15 != 0) {
                           var5[var8++] = this.anIntArray_2076[var15 & 255];
                        } else {
                           ++var8;
                        }

                        var9 += anInt_10927;
                        ++var11;
                     }
                  }
               }

               ++var6;
               anInt_10933 += anInt_10929;
               anInt_10934 += anInt_10930;
            }
         } else if(anInt_10928 < 0) {
            for(var6 = anInt_10926; var6 < 0; anInt_10912 += anInt_10925) {
               var7 = var6 + var4;
               if(var7 >= 0) {
                  if(var7 >= var1.length) {
                     return;
                  }

                  var8 = anInt_10912;
                  var9 = anInt_10933 + anInt_10935;
                  var10 = anInt_10934 + anInt_10910;
                  var11 = anInt_10922;
                  if(var9 < 0) {
                     var16 = (anInt_10927 - 1 - var9) / anInt_10927;
                     var11 += var16;
                     var9 += anInt_10927 * var16;
                     var10 += anInt_10928 * var16;
                     var8 += var16;
                  }

                  if((var16 = (1 + var9 - (this.width << 12) - anInt_10927) / anInt_10927) > var11) {
                     var11 = var16;
                  }

                  if((var16 = var10 - (this.height << 12)) >= 0) {
                     var16 = (anInt_10928 - var16) / anInt_10928;
                     var11 += var16;
                     var9 += anInt_10927 * var16;
                     var10 += anInt_10928 * var16;
                     var8 += var16;
                  }

                  if((var16 = (var10 - anInt_10928) / anInt_10928) > var11) {
                     var11 = var16;
                  }

                  var12 = var1[var7] - var3;
                  var13 = -var2[var7];
                  var14 = var12 - (var8 - anInt_10912);
                  if(var14 > 0) {
                     var8 += var14;
                     var11 += var14;
                     var9 += anInt_10927 * var14;
                     var10 += anInt_10928 * var14;
                  } else {
                     var13 -= var14;
                  }

                  if(var11 < var13) {
                     var11 = var13;
                  }

                  while(var11 < 0) {
                     var15 = this.imageData[(var10 >> 12) * this.width + (var9 >> 12)];
                     if(var15 != 0) {
                        var5[var8++] = this.anIntArray_2076[var15 & 255];
                     } else {
                        ++var8;
                     }

                     var9 += anInt_10927;
                     var10 += anInt_10928;
                     ++var11;
                  }
               }

               ++var6;
               anInt_10933 += anInt_10929;
               anInt_10934 += anInt_10930;
            }
         } else {
            for(var6 = anInt_10926; var6 < 0; anInt_10912 += anInt_10925) {
               var7 = var6 + var4;
               if(var7 >= 0) {
                  if(var7 >= var1.length) {
                     return;
                  }

                  var8 = anInt_10912;
                  var9 = anInt_10933 + anInt_10935;
                  var10 = anInt_10934 + anInt_10910;
                  var11 = anInt_10922;
                  if(var9 < 0) {
                     var16 = (anInt_10927 - 1 - var9) / anInt_10927;
                     var11 += var16;
                     var9 += anInt_10927 * var16;
                     var10 += anInt_10928 * var16;
                     var8 += var16;
                  }

                  if((var16 = (1 + var9 - (this.width << 12) - anInt_10927) / anInt_10927) > var11) {
                     var11 = var16;
                  }

                  if(var10 < 0) {
                     var16 = (anInt_10928 - 1 - var10) / anInt_10928;
                     var11 += var16;
                     var9 += anInt_10927 * var16;
                     var10 += anInt_10928 * var16;
                     var8 += var16;
                  }

                  if((var16 = (1 + var10 - (this.height << 12) - anInt_10928) / anInt_10928) > var11) {
                     var11 = var16;
                  }

                  var12 = var1[var7] - var3;
                  var13 = -var2[var7];
                  var14 = var12 - (var8 - anInt_10912);
                  if(var14 > 0) {
                     var8 += var14;
                     var11 += var14;
                     var9 += anInt_10927 * var14;
                     var10 += anInt_10928 * var14;
                  } else {
                     var13 -= var14;
                  }

                  if(var11 < var13) {
                     var11 = var13;
                  }

                  while(var11 < 0) {
                     var15 = this.imageData[(var10 >> 12) * this.width + (var9 >> 12)];
                     if(var15 != 0) {
                        var5[var8++] = this.anIntArray_2076[var15 & 255];
                     } else {
                        ++var8;
                     }

                     var9 += anInt_10927;
                     var10 += anInt_10928;
                     ++var11;
                  }
               }

               ++var6;
               anInt_10933 += anInt_10929;
               anInt_10934 += anInt_10930;
            }
         }

      }
   }

   public void method2128(int var1, int var2, int var3) {
      throw new IllegalStateException();
   }

   Class170_Sub3_Sub2(SoftwareRenderer var1, byte[] var2, int[] var3, int var4, int var5) {
      super(var1, var4, var5);
      this.imageData = var2;
      this.anIntArray_2076 = var3;
   }

   public void drawAt(int startX, int startY, int var3, int colour, int var5) {
      if(this.renderer.method6820()) {
         throw new IllegalStateException();
      } else {
         int[] rendererIntArray = this.renderer.renderArray;
         if(rendererIntArray != null) {
            int var7 = this.renderer.renderWidth * 1176497263;
            startX += this.x;
            startY += this.y;
            int var8 = startY * var7 + startX;
            int var9 = 0;
            int var10 = this.height;
            int var11 = this.width;
            int var12 = var7 - var11;
            int var13 = 0;
            int colourR;
            if(startY < this.renderer.targetWidth * 759884099) {
               colourR = this.renderer.targetWidth * 759884099 - startY;
               var10 -= colourR;
               startY = this.renderer.targetWidth * 759884099;
               var9 += colourR * var11;
               var8 += colourR * var7;
            }

            if(startY + var10 > this.renderer.targetHeight * 108427145) {
               var10 -= startY + var10 - this.renderer.targetHeight * 108427145;
            }

            if(startX < this.renderer.targetX * -346770183) {
               colourR = this.renderer.targetX * -346770183 - startX;
               var11 -= colourR;
               startX = this.renderer.targetX * -346770183;
               var9 += colourR;
               var8 += colourR;
               var13 += colourR;
               var12 += colourR;
            }

            if(startX + var11 > this.renderer.targetY * 1163141991) {
               colourR = startX + var11 - this.renderer.targetY * 1163141991;
               var11 -= colourR;
               var13 += colourR;
               var12 += colourR;
            }

            if(var11 > 0 && var10 > 0) {
               int colourG;
               int var17;
               int colourB;
               int var19;
               int var18;
               int var21;
               int var20;
               int var22;
               if(var5 == 0) {
                  if(var3 == 1) {
                     for(colourR = -var10; colourR < 0; ++colourR) {
                        for(colourG = var8 + var11 - 3; var8 < colourG; rendererIntArray[var8++] = this.anIntArray_2076[this.imageData[var9++] & 255]) {
                           rendererIntArray[var8++] = this.anIntArray_2076[this.imageData[var9++] & 255];
                           rendererIntArray[var8++] = this.anIntArray_2076[this.imageData[var9++] & 255];
                           rendererIntArray[var8++] = this.anIntArray_2076[this.imageData[var9++] & 255];
                        }

                        for(colourG += 3; var8 < colourG; rendererIntArray[var8++] = this.anIntArray_2076[this.imageData[var9++] & 255]) {
                           ;
                        }

                        var8 += var12;
                        var9 += var13;
                     }
                  } else if(var3 == 0) {
                     colourR = (colour & 16711680) >> 16;
                     colourG = (colour & '\uff00') >> 8;
                     colourB = colour & 255;

                     for(var17 = -var10; var17 < 0; ++var17) {
                        for(var18 = -var11; var18 < 0; ++var18) {
                           var19 = this.anIntArray_2076[this.imageData[var9++] & 255];
                           var20 = (var19 & 16711680) * colourR & -16777216;
                           var21 = (var19 & '\uff00') * colourG & 16711680;
                           var22 = (var19 & 255) * colourB & '\uff00';
                           rendererIntArray[var8++] = (var20 | var21 | var22) >>> 8;
                        }

                        var8 += var12;
                        var9 += var13;
                     }
                  } else if(var3 == 3) {
                     for(colourR = -var10; colourR < 0; ++colourR) {
                        for(colourG = -var11; colourG < 0; ++colourG) {
                           colourB = this.anIntArray_2076[this.imageData[var9++] & 255];
                           var17 = colourB + colour;
                           var18 = (colourB & 16711935) + (colour & 16711935);
                           var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                           rendererIntArray[var8++] = var17 - var19 | var19 - (var19 >>> 8);
                        }

                        var8 += var12;
                        var9 += var13;
                     }
                  } else {
                     if(var3 != 2) {
                        throw new IllegalArgumentException();
                     }

                     colourR = colour >>> 24;
                     colourG = 256 - colourR;
                     colourB = (colour & 16711935) * colourG & -16711936;
                     var17 = (colour & '\uff00') * colourG & 16711680;
                     colour = (colourB | var17) >>> 8;

                     for(var18 = -var10; var18 < 0; ++var18) {
                        for(var19 = -var11; var19 < 0; ++var19) {
                           var20 = this.anIntArray_2076[this.imageData[var9++] & 255];
                           colourB = (var20 & 16711935) * colourR & -16711936;
                           var17 = (var20 & '\uff00') * colourR & 16711680;
                           rendererIntArray[var8++] = ((colourB | var17) >>> 8) + colour;
                        }

                        var8 += var12;
                        var9 += var13;
                     }
                  }
               } else {
                  int var23;
                  int var25;
                  int var24;
                  byte var27;
                  int var26;
                  byte var31;
                  if(var5 == 1) {
                     if(var3 == 1) {
                        for(colourR = -var10; colourR < 0; ++colourR) {
                           for(colourG = -var11; colourG < 0; ++colourG) {
                              var27 = this.imageData[var9++];
                              if(var27 != 0) {
                                 var17 = this.anIntArray_2076[var27 & 255] | -16777216;
                                 short var30 = 255;
                                 byte var28 = 0;
                                 var20 = rendererIntArray[var8];
                                 rendererIntArray[var8++] = (((var17 & 16711935) * var30 + (var20 & 16711935) * var28 & -16711936) >> 8) + (((var17 & -16711936) >>> 8) * var30 + ((var20 & -16711936) >>> 8) * var28 & -16711936);
                              } else {
                                 ++var8;
                              }
                           }

                           var8 += var12;
                           var9 += var13;
                        }
                     } else {
                        byte var29;
                        if(var3 == 0) {
                           if((colour & 16777215) == 16777215) {
                              colourR = colour >>> 24;
                              colourG = 256 - colourR;

                              for(colourB = -var10; colourB < 0; ++colourB) {
                                 for(var17 = -var11; var17 < 0; ++var17) {
                                    var29 = this.imageData[var9++];
                                    if(var29 != 0) {
                                       var19 = this.anIntArray_2076[var29 & 255];
                                       var20 = rendererIntArray[var8];
                                       rendererIntArray[var8++] = ((var19 & 16711935) * colourR + (var20 & 16711935) * colourG & -16711936) + ((var19 & '\uff00') * colourR + (var20 & '\uff00') * colourG & 16711680) >> 8;
                                    } else {
                                       ++var8;
                                    }
                                 }

                                 var8 += var12;
                                 var9 += var13;
                              }
                           } else {
                              colourR = (colour & 16711680) >> 16;
                              colourG = (colour & '\uff00') >> 8;
                              colourB = colour & 255;
                              var17 = colour >>> 24;
                              var18 = 256 - var17;

                              for(var19 = -var10; var19 < 0; ++var19) {
                                 for(var20 = -var11; var20 < 0; ++var20) {
                                    byte var33 = this.imageData[var9++];
                                    if(var33 != 0) {
                                       var22 = this.anIntArray_2076[var33 & 255];
                                       if(var17 != 255) {
                                          var23 = (var22 & 16711680) * colourR & -16777216;
                                          var24 = (var22 & '\uff00') * colourG & 16711680;
                                          var25 = (var22 & 255) * colourB & '\uff00';
                                          var22 = (var23 | var24 | var25) >>> 8;
                                          var26 = rendererIntArray[var8];
                                          rendererIntArray[var8++] = ((var22 & 16711935) * var17 + (var26 & 16711935) * var18 & -16711936) + ((var22 & '\uff00') * var17 + (var26 & '\uff00') * var18 & 16711680) >> 8;
                                       } else {
                                          var23 = (var22 & 16711680) * colourR & -16777216;
                                          var24 = (var22 & '\uff00') * colourG & 16711680;
                                          var25 = (var22 & 255) * colourB & '\uff00';
                                          rendererIntArray[var8++] = (var23 | var24 | var25) >>> 8;
                                       }
                                    } else {
                                       ++var8;
                                    }
                                 }

                                 var8 += var12;
                                 var9 += var13;
                              }
                           }
                        } else if(var3 == 3) {
                           colourR = colour >>> 24;
                           colourG = 256 - colourR;

                           for(colourB = -var10; colourB < 0; ++colourB) {
                              for(var17 = -var11; var17 < 0; ++var17) {
                                 var29 = this.imageData[var9++];
                                 var19 = var29 > 0?this.anIntArray_2076[var29]:0;
                                 var20 = var19 + colour;
                                 var21 = (var19 & 16711935) + (colour & 16711935);
                                 var22 = (var21 & 16777472) + (var20 - var21 & 65536);
                                 var22 = var20 - var22 | var22 - (var22 >>> 8);
                                 if(var19 == 0 && colourR != 255) {
                                    var19 = var22;
                                    var22 = rendererIntArray[var8];
                                    var22 = ((var19 & 16711935) * colourR + (var22 & 16711935) * colourG & -16711936) + ((var19 & '\uff00') * colourR + (var22 & '\uff00') * colourG & 16711680) >> 8;
                                 }

                                 rendererIntArray[var8++] = var22;
                              }

                              var8 += var12;
                              var9 += var13;
                           }
                        } else {
                           if(var3 != 2) {
                              throw new IllegalArgumentException();
                           }

                           colourR = colour >>> 24;
                           colourG = 256 - colourR;
                           colourB = (colour & 16711935) * colourG & -16711936;
                           var17 = (colour & '\uff00') * colourG & 16711680;
                           colour = (colourB | var17) >>> 8;

                           for(var18 = -var10; var18 < 0; ++var18) {
                              for(var19 = -var11; var19 < 0; ++var19) {
                                 var31 = this.imageData[var9++];
                                 if(var31 != 0) {
                                    var21 = this.anIntArray_2076[var31 & 255];
                                    colourB = (var21 & 16711935) * colourR & -16711936;
                                    var17 = (var21 & '\uff00') * colourR & 16711680;
                                    rendererIntArray[var8++] = ((colourB | var17) >>> 8) + colour;
                                 } else {
                                    ++var8;
                                 }
                              }

                              var8 += var12;
                              var9 += var13;
                           }
                        }
                     }
                  } else {
                     if(var5 != 2) {
                        throw new IllegalArgumentException();
                     }

                     if(var3 == 1) {
                        for(colourR = -var10; colourR < 0; ++colourR) {
                           for(colourG = -var11; colourG < 0; ++colourG) {
                              var27 = this.imageData[var9++];
                              if(var27 != 0) {
                                 var17 = this.anIntArray_2076[var27 & 255];
                                 var18 = rendererIntArray[var8];
                                 var19 = var17 + var18;
                                 var20 = (var17 & 16711935) + (var18 & 16711935);
                                 var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                                 rendererIntArray[var8++] = var19 - var18 | var18 - (var18 >>> 8);
                              } else {
                                 ++var8;
                              }
                           }

                           var8 += var12;
                           var9 += var13;
                        }
                     } else if(var3 == 0) {
                        colourR = (colour & 16711680) >> 16;
                        colourG = (colour & '\uff00') >> 8;
                        colourB = colour & 255;

                        for(var17 = -var10; var17 < 0; ++var17) {
                           for(var18 = -var11; var18 < 0; ++var18) {
                              byte var32 = this.imageData[var9++];
                              if(var32 != 0) {
                                 var20 = this.anIntArray_2076[var32 & 255];
                                 var21 = (var20 & 16711680) * colourR & -16777216;
                                 var22 = (var20 & '\uff00') * colourG & 16711680;
                                 var23 = (var20 & 255) * colourB & '\uff00';
                                 var20 = (var21 | var22 | var23) >>> 8;
                                 var24 = rendererIntArray[var8];
                                 var25 = var20 + var24;
                                 var26 = (var20 & 16711935) + (var24 & 16711935);
                                 var24 = (var26 & 16777472) + (var25 - var26 & 65536);
                                 rendererIntArray[var8++] = var25 - var24 | var24 - (var24 >>> 8);
                              } else {
                                 ++var8;
                              }
                           }

                           var8 += var12;
                           var9 += var13;
                        }
                     } else if(var3 == 3) {
                        for(colourR = -var10; colourR < 0; ++colourR) {
                           for(colourG = -var11; colourG < 0; ++colourG) {
                              var27 = this.imageData[var9++];
                              var17 = var27 > 0?this.anIntArray_2076[var27]:0;
                              var18 = var17 + colour;
                              var19 = (var17 & 16711935) + (colour & 16711935);
                              var20 = (var19 & 16777472) + (var18 - var19 & 65536);
                              var17 = var18 - var20 | var20 - (var20 >>> 8);
                              var20 = rendererIntArray[var8];
                              var18 = var17 + var20;
                              var19 = (var17 & 16711935) + (var20 & 16711935);
                              var20 = (var19 & 16777472) + (var18 - var19 & 65536);
                              rendererIntArray[var8++] = var18 - var20 | var20 - (var20 >>> 8);
                           }

                           var8 += var12;
                           var9 += var13;
                        }
                     } else {
                        if(var3 != 2) {
                           throw new IllegalArgumentException();
                        }

                        colourR = colour >>> 24;
                        colourG = 256 - colourR;
                        colourB = (colour & 16711935) * colourG & -16711936;
                        var17 = (colour & '\uff00') * colourG & 16711680;
                        colour = (colourB | var17) >>> 8;

                        for(var18 = -var10; var18 < 0; ++var18) {
                           for(var19 = -var11; var19 < 0; ++var19) {
                              var31 = this.imageData[var9++];
                              if(var31 != 0) {
                                 var21 = this.anIntArray_2076[var31 & 255];
                                 colourB = (var21 & 16711935) * colourR & -16711936;
                                 var17 = (var21 & '\uff00') * colourR & 16711680;
                                 var21 = ((colourB | var17) >>> 8) + colour;
                                 var22 = rendererIntArray[var8];
                                 var23 = var21 + var22;
                                 var24 = (var21 & 16711935) + (var22 & 16711935);
                                 var22 = (var24 & 16777472) + (var23 - var24 & 65536);
                                 rendererIntArray[var8++] = var23 - var22 | var22 - (var22 >>> 8);
                              } else {
                                 ++var8;
                              }
                           }

                           var8 += var12;
                           var9 += var13;
                        }
                     }
                  }
               }

            }
         }
      }
   }
}
