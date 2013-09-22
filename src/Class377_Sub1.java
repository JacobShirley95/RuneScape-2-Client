
public class Class377_Sub1 extends Class377 {

   static final int anInt_8326 = 0;
   static boolean aBoolean_8327 = false;
   static boolean aBoolean_8328 = false;
   static final int anInt_8329 = 1;
   static final int anInt_8330 = 2;
   static final int[] anIntArray_8331 = new int[]{0, -1, 0, 1};
   static final int[] anIntArray_8332 = new int[]{1, 0, -1, 0};
   Class529 aClass529_8333;
   static final int[] anIntArray_8334 = new int[]{1, -1, -1, 1};
   static final int[] anIntArray_8335 = new int[]{-1, -1, 1, 1};
   int anInt_8336 = 593650345;
   Class588 aClass588_8337;
   static final int anInt_8338 = 3;


   public final void method5398(Renderer var1, byte[] var2, int var3, int var4, int var5) {
      ByteArrayDataNode var6 = new ByteArrayDataNode(var2);
      int var7 = -1;

      while(true) {
         int var8 = var6.method4491(-1539781725);
         if(var8 == 0) {
            return;
         }

         var7 += var8;
         int var9 = 0;

         while(true) {
            int var10 = var6.method4490((byte)0);
            if(var10 == 0) {
               break;
            }

            var9 += var10 - 1;
            int var11 = var9 & 63;
            int var12 = var9 >> 6 & 63;
            int var13 = var9 >> 12;
            int var14 = var6.readByte(1331693886);
            int var15 = var14 >> 2;
            int var16 = var14 & 3;
            int var17 = var12 + var3;
            int var18 = var4 + var11;
            if(var17 > 0 && var18 > 0 && var17 < -1058787665 * this.cubeWidth - 1 && var18 < this.cubeHeight * -581318601 - 1) {
               this.method5402(var1, var13, var13, var17, var18, var7, var16, var15, -1, 0, 2044185499);
            }
         }
      }
   }

   public final void method5399(Renderer var1, ByteArrayDataNode var2, int var3, int var4, int var5) {
      if(!this.aBoolean_7199) {
         boolean var6 = false;
         Class584 var7 = null;

         int var8;
         int var9;
         int var11;
         int var12;
         int var17;
         while(964952859 * var2.index < var2.data.length) {
            var8 = var2.readByte(162318867);
            if(var8 == 0) {
               if(var7 == null) {
                  var7 = new Class584(var2, this.aClass588_8337);
               } else {
                  var7.method6336(var2, this.aClass588_8337, (byte)27);
               }
            } else {
               int var14;
               int var15;
               int var18;
               if(1 == var8) {
                  var9 = var2.readByte(123196100);
                  if(var9 > 0) {
                     for(var17 = 0; var17 < var9; ++var17) {
                        Class265 var19 = new Class265(var1, this.aClass259_7198.shiftAmount * 725150473, var2, 2);
                        if(var19.anInt_4630 * -676508531 == 31) {
                           Class451 var20 = Class181.aClass450_3106.method5519(var2.readShort(-753684357), (byte)34);
                           var19.method3513(var20.anInt_8547 * 948055309, -24849115 * var20.anInt_8544, 1387805471 * var20.anInt_8546, -2003203733 * var20.anInt_8545, 917028830);
                        }

                        if(var1.method1994() > 0) {
                           Class240_Sub53 var21 = var19.aClass240_Sub53_4635;
                           var18 = var21.method5274((byte)23) + (var3 << 9);
                           var14 = var21.method5276((byte)126) + (var4 << 9);
                           var15 = var18 >> 9;
                           int var16 = var14 >> 9;
                           if(var15 >= 0 && var16 >= 0 && var15 < this.cubeWidth * -1058787665 && var16 < -581318601 * this.cubeHeight) {
                              var21.method5281(var18, this.anIntArrayArrayArray_7263[-1420871057 * var19.anInt_4628][var15][var16] - var21.method5275((byte)119), var14, 656878942);
                              this.aClass259_7198.method3440(var19, 1876201510);
                           }
                        }
                     }
                  }
               } else if(var8 == 2) {
                  if(var7 == null) {
                     var7 = new Class584();
                  }

                  var7.method6337(var2, 2132292114);
               } else if(var8 == 128) {
                  if(null == var7) {
                     var7 = new Class584();
                  }

                  var7.method6332(var2, this.aClass588_8337, (byte)1);
               } else {
                  if(var8 != 129) {
                     throw new IllegalStateException("");
                  }

                  if(null == this.aByteArrayArrayArray_7201) {
                     this.aByteArrayArrayArray_7201 = new byte[4][][];
                  }

                  for(var9 = 0; var9 < 4; ++var9) {
                     byte var10 = var2.getByte((byte)92);
                     if(0 == var10 && this.aByteArrayArrayArray_7201[var9] != null) {
                        var11 = var3;
                        var12 = var3 + 64;
                        var18 = var4;
                        var14 = var4 + 64;
                        if(var3 < 0) {
                           var11 = 0;
                        } else if(var3 >= this.cubeWidth * -1058787665) {
                           var11 = -1058787665 * this.cubeWidth;
                        }

                        if(var12 < 0) {
                           var12 = 0;
                        } else if(var12 >= this.cubeWidth * -1058787665) {
                           var12 = -1058787665 * this.cubeWidth;
                        }

                        if(var4 < 0) {
                           var18 = 0;
                        } else if(var4 >= this.cubeHeight * -581318601) {
                           var18 = this.cubeHeight * -581318601;
                        }

                        if(var14 < 0) {
                           var14 = 0;
                        } else if(var14 >= this.cubeHeight * -581318601) {
                           var14 = -581318601 * this.cubeHeight;
                        }

                        while(var11 < var12) {
                           while(var18 < var14) {
                              this.aByteArrayArrayArray_7201[var9][var11][var18] = 0;
                              ++var18;
                           }

                           ++var11;
                        }
                     } else if(1 == var10) {
                        if(null == this.aByteArrayArrayArray_7201[var9]) {
                           this.aByteArrayArrayArray_7201[var9] = new byte[this.cubeWidth * -1058787665 + 1][1 + -581318601 * this.cubeHeight];
                        }

                        for(var11 = 0; var11 < 64; var11 += 4) {
                           for(var12 = 0; var12 < 64; var12 += 4) {
                              byte var13 = var2.getByte((byte)10);

                              for(var14 = var3 + var11; var14 < 4 + var11 + var3; ++var14) {
                                 for(var15 = var4 + var12; var15 < var12 + var4 + 4; ++var15) {
                                    if(var14 >= 0 && var14 < -1058787665 * this.cubeWidth && var15 >= 0 && var15 < -581318601 * this.cubeHeight) {
                                       this.aByteArrayArrayArray_7201[var9][var14][var15] = var13;
                                    }
                                 }
                              }
                           }
                        }
                     } else if(2 == var10) {
                        if(this.aByteArrayArrayArray_7201[var9] == null) {
                           this.aByteArrayArrayArray_7201[var9] = new byte[-1058787665 * this.cubeWidth + 1][1 + -581318601 * this.cubeHeight];
                        }

                        if(var9 > 0) {
                           var11 = var3;
                           var12 = var3 + 64;
                           var18 = var4;
                           var14 = 64 + var4;
                           if(var3 < 0) {
                              var11 = 0;
                           } else if(var3 >= this.cubeWidth * -1058787665) {
                              var11 = -1058787665 * this.cubeWidth;
                           }

                           if(var12 < 0) {
                              var12 = 0;
                           } else if(var12 >= -1058787665 * this.cubeWidth) {
                              var12 = this.cubeWidth * -1058787665;
                           }

                           if(var4 < 0) {
                              var18 = 0;
                           } else if(var4 >= this.cubeHeight * -581318601) {
                              var18 = this.cubeHeight * -581318601;
                           }

                           if(var14 < 0) {
                              var14 = 0;
                           } else if(var14 >= this.cubeHeight * -581318601) {
                              var14 = -581318601 * this.cubeHeight;
                           }

                           while(var11 < var12) {
                              while(var18 < var14) {
                                 this.aByteArrayArrayArray_7201[var9][var11][var18] = this.aByteArrayArrayArray_7201[var9 - 1][var11][var18];
                                 ++var18;
                              }

                              ++var11;
                           }
                        }
                     }
                  }

                  var6 = true;
               }
            }
         }

         if(var7 != null) {
            for(var8 = 0; var8 < 8; ++var8) {
               for(var9 = 0; var9 < 8; ++var9) {
                  var17 = var8 + (var3 >> 3);
                  var11 = (var4 >> 3) + var9;
                  if(var17 >= 0 && var17 < -1058787665 * this.cubeWidth >> 3 && var11 >= 0 && var11 < -581318601 * this.cubeHeight >> 3) {
                     this.aClass588_8337.method6378(var17, var11, var7, (byte)-34);
                  }
               }
            }
         }

         if(!var6 && this.aByteArrayArrayArray_7201 != null) {
            for(var8 = 0; var8 < 4; ++var8) {
               if(this.aByteArrayArrayArray_7201[var8] != null) {
                  for(var9 = 0; var9 < 16; ++var9) {
                     for(var17 = 0; var17 < 16; ++var17) {
                        var11 = (var3 >> 2) + var9;
                        var12 = var17 + (var4 >> 2);
                        if(var11 >= 0 && var11 < 26 && var12 >= 0 && var12 < 26) {
                           this.aByteArrayArrayArray_7201[var8][var11][var12] = 0;
                        }
                     }
                  }
               }
            }
         }

      }
   }

   public final void method5400(Renderer var1, ByteArrayDataNode var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      if(!this.aBoolean_7199) {
         boolean var11 = false;
         Class584 var12 = null;
         int var13 = (var7 & 7) * 8;
         int var14 = (var8 & 7) * 8;

         int var15;
         int var16;
         int var18;
         int var25;
         while(var2.index * 964952859 < var2.data.length) {
            var15 = var2.readByte(-86098296);
            if(0 == var15) {
               if(null == var12) {
                  var12 = new Class584(var2, this.aClass588_8337);
               } else {
                  var12.method6336(var2, this.aClass588_8337, (byte)118);
               }
            } else {
               int var21;
               int var23;
               int var22;
               int var27;
               if(var15 == 1) {
                  var16 = var2.readByte(1710833306);
                  if(var16 > 0) {
                     for(var25 = 0; var25 < var16; ++var25) {
                        Class265 var26 = new Class265(var1, this.aClass259_7198.shiftAmount * 725150473, var2, 2);
                        if(31 == -676508531 * var26.anInt_4630) {
                           Class451 var28 = Class181.aClass450_3106.method5519(var2.readShort(382441113), (byte)67);
                           var26.method3513(var28.anInt_8547 * 948055309, -24849115 * var28.anInt_8544, 1387805471 * var28.anInt_8546, var28.anInt_8545 * -2003203733, 1328427365);
                        }

                        if(var1.method1994() > 0) {
                           Class240_Sub53 var29 = var26.aClass240_Sub53_4635;
                           var27 = var29.method5274((byte)72) >> 9;
                           var21 = var29.method5276((byte)39) >> 9;
                           if(-1420871057 * var26.anInt_4628 == var6 && var27 >= var13 && var27 < var13 + 8 && var21 >= var14 && var21 < 8 + var14) {
                              var22 = (var4 << 9) + Class611.method6566(var29.method5274((byte)110) & 4095, var29.method5276((byte)20) & 4095, var9, 1559767062);
                              var23 = (var5 << 9) + Class439.method5448(var29.method5274((byte)53) & 4095, var29.method5276((byte)107) & 4095, var9, (short)1000);
                              var27 = var22 >> 9;
                              var21 = var23 >> 9;
                              if(var27 >= 0 && var21 >= 0 && var27 < this.cubeWidth * -1058787665 && var21 < this.cubeHeight * -581318601) {
                                 var29.method5281(var22, this.anIntArrayArrayArray_7263[var6][var27][var21] - var29.method5275((byte)26), var23, 656878942);
                                 this.aClass259_7198.method3440(var26, 2076978369);
                              }
                           }
                        }
                     }
                  }
               } else if(var15 == 2) {
                  if(null == var12) {
                     var12 = new Class584();
                  }

                  var12.method6337(var2, -601054506);
               } else if(var15 == 128) {
                  if(null == var12) {
                     var12 = new Class584();
                  }

                  var12.method6332(var2, this.aClass588_8337, (byte)1);
               } else {
                  if(var15 != 129) {
                     throw new IllegalStateException("");
                  }

                  if(null == this.aByteArrayArrayArray_7201) {
                     this.aByteArrayArrayArray_7201 = new byte[4][][];
                  }

                  for(var16 = 0; var16 < 4; ++var16) {
                     byte var17 = var2.getByte((byte)58);
                     int var19;
                     if(0 == var17 && this.aByteArrayArrayArray_7201[var3] != null) {
                        if(var16 <= var6) {
                           var18 = var4;
                           var19 = 7 + var4;
                           var27 = var5;
                           var21 = var5 + 7;
                           if(var4 < 0) {
                              var18 = 0;
                           } else if(var4 >= -1058787665 * this.cubeWidth) {
                              var18 = this.cubeWidth * -1058787665;
                           }

                           if(var19 < 0) {
                              var19 = 0;
                           } else if(var19 >= this.cubeWidth * -1058787665) {
                              var19 = -1058787665 * this.cubeWidth;
                           }

                           if(var5 < 0) {
                              var27 = 0;
                           } else if(var5 >= this.cubeHeight * -581318601) {
                              var27 = this.cubeHeight * -581318601;
                           }

                           if(var21 < 0) {
                              var21 = 0;
                           } else if(var21 >= this.cubeHeight * -581318601) {
                              var21 = this.cubeHeight * -581318601;
                           }

                           while(var18 < var19) {
                              while(var27 < var21) {
                                 this.aByteArrayArrayArray_7201[var3][var18][var27] = 0;
                                 ++var27;
                              }

                              ++var18;
                           }
                        }
                     } else if(1 == var17) {
                        if(null == this.aByteArrayArrayArray_7201[var3]) {
                           this.aByteArrayArrayArray_7201[var3] = new byte[1 + -1058787665 * this.cubeWidth][-581318601 * this.cubeHeight + 1];
                        }

                        for(var18 = 0; var18 < 64; var18 += 4) {
                           for(var19 = 0; var19 < 64; var19 += 4) {
                              byte var20 = var2.getByte((byte)84);
                              if(var16 <= var6) {
                                 for(var21 = var18; var21 < 4 + var18; ++var21) {
                                    for(var22 = var19; var22 < 4 + var19; ++var22) {
                                       if(var21 >= var13 && var21 < 8 + var13 && var22 >= var14 && var22 < var14 + 8) {
                                          var23 = var4 + Class69.method729(var21 & 7, var22 & 7, var9, -220157254);
                                          int var24 = var5 + Class576.method6292(var21 & 7, var22 & 7, var9, 713097626);
                                          if(var23 >= 0 && var23 < this.cubeWidth * -1058787665 && var24 >= 0 && var24 < this.cubeHeight * -581318601) {
                                             this.aByteArrayArrayArray_7201[var3][var23][var24] = var20;
                                             var11 = true;
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     } else if(2 == var17) {
                        ;
                     }
                  }
               }
            }
         }

         if(var12 != null) {
            this.aClass588_8337.method6378(var4 >> 3, var5 >> 3, var12, (byte)66);
         }

         if(!var11 && null != this.aByteArrayArrayArray_7201 && this.aByteArrayArrayArray_7201[var3] != null) {
            var15 = 7 + var4;
            var16 = var5 + 7;

            for(var25 = var4; var25 < var15; ++var25) {
               for(var18 = var5; var18 < var16; ++var18) {
                  this.aByteArrayArrayArray_7201[var3][var25][var18] = 0;
               }
            }
         }

      }
   }

   boolean method5401(Renderer var1, int var2, int var3, boolean var4, Class534 var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, boolean var15, Plane var16, int var17, int var18, int var19) {
      Object var28;
      if(var2 == -1965975883 * Class495.aClass495_9053.anInt_9062) {
         int var29 = -60626187 * var5.anInt_9372;
         if(aBoolean_8327 && -1 == -60626187 * var5.anInt_9372) {
            var29 = 1;
         }

         if(var4) {
            Class563_Sub1_Sub5_Sub1 var27 = new Class563_Sub1_Sub5_Sub1(this.aClass259_7198, var1, this.aClass529_8333, var5, var8, var9, var10, var11, var12, this.aBoolean_7199, var2, var3, var15);
            if(var27.method2735((byte)12)) {
               var27.method2721(var1, -889458123);
            }

            var28 = var27;
         } else {
            var28 = new Class563_Sub1_Sub5_Sub2(this.aClass259_7198, var1, this.aClass529_8333, var5, var8, var9, var10, var11, var12, this.aBoolean_7199, var2, var3, var6, var7);
         }

         this.aClass259_7198.method3449(var8, var13, var14, (Class563_Sub1_Sub5)var28, (Class563_Sub1_Sub5)null, (short)-13333);
         if(var3 == 0) {
            if(this.aBoolean_7202 && var5.aBoolean_9401) {
               var16.method2149(var13, var14, 50);
               var16.method2149(var13, var14 + 1, 50);
            }

            if(1 == var29 && !this.aBoolean_7199) {
               this.aClass259_7198.aClass269_4485.method3546(1, var8, var13, var14, -1303644603 * var5.anInt_9385, 1991764185 * var5.anInt_9386);
            }
         } else if(var3 == 1) {
            if(this.aBoolean_7202 && var5.aBoolean_9401) {
               var16.method2149(var13, var14 + 1, 50);
               var16.method2149(1 + var13, 1 + var14, 50);
            }

            if(var29 == 1 && !this.aBoolean_7199) {
               this.aClass259_7198.aClass269_4485.method3546(2, var8, var13, var14 + 1, var5.anInt_9385 * -1303644603, -(var5.anInt_9386 * 1991764185));
            }
         } else if(var3 == 2) {
            if(this.aBoolean_7202 && var5.aBoolean_9401) {
               var16.method2149(var13 + 1, var14, 50);
               var16.method2149(1 + var13, 1 + var14, 50);
            }

            if(var29 == 1 && !this.aBoolean_7199) {
               this.aClass259_7198.aClass269_4485.method3546(1, var8, 1 + var13, var14, -1303644603 * var5.anInt_9385, -(1991764185 * var5.anInt_9386));
            }
         } else if(3 == var3) {
            if(this.aBoolean_7202 && var5.aBoolean_9401) {
               var16.method2149(var13, var14, 50);
               var16.method2149(1 + var13, var14, 50);
            }

            if(var29 == 1 && !this.aBoolean_7199) {
               this.aClass259_7198.aClass269_4485.method3546(2, var8, var13, var14, -1303644603 * var5.anInt_9385, var5.anInt_9386 * 1991764185);
            }
         }

         if(-461592693 * var5.anInt_9390 != 64) {
            this.aClass259_7198.method3456(var8, var13, var14, var5.anInt_9390 * -461592693, (byte)0);
         }

         return true;
      } else {
         Object var20;
         Class563_Sub1_Sub5_Sub1 var26;
         if(var2 == Class495.aClass495_9040.anInt_9062 * -1965975883) {
            if(var4) {
               var26 = new Class563_Sub1_Sub5_Sub1(this.aClass259_7198, var1, this.aClass529_8333, var5, var8, var9, var10, var11, var12, this.aBoolean_7199, var2, var3, var15);
               if(var26.method2735((byte)12)) {
                  var26.method2721(var1, -1222473342);
               }

               var20 = var26;
            } else {
               var20 = new Class563_Sub1_Sub5_Sub2(this.aClass259_7198, var1, this.aClass529_8333, var5, var8, var9, var10, var11, var12, this.aBoolean_7199, var2, var3, var6, var7);
            }

            this.aClass259_7198.method3449(var8, var13, var14, (Class563_Sub1_Sub5)var20, (Class563_Sub1_Sub5)null, (short)-8449);
            if(var5.aBoolean_9401 && this.aBoolean_7202) {
               if(0 == var3) {
                  var16.method2149(var13, var14 + 1, 50);
               } else if(1 == var3) {
                  var16.method2149(var13 + 1, 1 + var14, 50);
               } else if(2 == var3) {
                  var16.method2149(1 + var13, var14, 50);
               } else if(var3 == 3) {
                  var16.method2149(var13, var14, 50);
               }
            }

            return true;
         } else if(-1965975883 * Class495.aClass495_9058.anInt_9062 == var2) {
            int var21 = var3 + 1 & 3;
            if(var4) {
               Class563_Sub1_Sub5_Sub1 var23 = new Class563_Sub1_Sub5_Sub1(this.aClass259_7198, var1, this.aClass529_8333, var5, var8, var9, var10, var11, var12, this.aBoolean_7199, var2, 4 + var3, var15);
               Class563_Sub1_Sub5_Sub1 var24 = new Class563_Sub1_Sub5_Sub1(this.aClass259_7198, var1, this.aClass529_8333, var5, var8, var9, var10, var11, var12, this.aBoolean_7199, var2, var21, var15);
               if(var23.method2735((byte)12)) {
                  var23.method2721(var1, 952634559);
               }

               if(var24.method2735((byte)12)) {
                  var24.method2721(var1, -878679018);
               }

               var20 = var23;
               var28 = var24;
            } else {
               var20 = new Class563_Sub1_Sub5_Sub2(this.aClass259_7198, var1, this.aClass529_8333, var5, var8, var9, var10, var11, var12, this.aBoolean_7199, var2, 4 + var3, var6, var7);
               var28 = new Class563_Sub1_Sub5_Sub2(this.aClass259_7198, var1, this.aClass529_8333, var5, var8, var9, var10, var11, var12, this.aBoolean_7199, var2, var21, var6, var7);
            }

            this.aClass259_7198.method3449(var8, var13, var14, (Class563_Sub1_Sub5)var20, (Class563_Sub1_Sub5)var28, (short)3605);
            if((1 == var5.anInt_9372 * -60626187 || aBoolean_8327 && -1 == var5.anInt_9372 * -60626187) && !this.aBoolean_7199) {
               if(0 == var3) {
                  this.aClass259_7198.aClass269_4485.method3546(1, var8, var13, var14, -1303644603 * var5.anInt_9385, 1991764185 * var5.anInt_9386);
                  this.aClass259_7198.aClass269_4485.method3546(2, var8, var13, var14 + 1, -1303644603 * var5.anInt_9385, 1991764185 * var5.anInt_9386);
               } else if(var3 == 1) {
                  this.aClass259_7198.aClass269_4485.method3546(1, var8, var13 + 1, var14, var5.anInt_9385 * -1303644603, 1991764185 * var5.anInt_9386);
                  this.aClass259_7198.aClass269_4485.method3546(2, var8, var13, var14 + 1, var5.anInt_9385 * -1303644603, 1991764185 * var5.anInt_9386);
               } else if(2 == var3) {
                  this.aClass259_7198.aClass269_4485.method3546(1, var8, var13 + 1, var14, -1303644603 * var5.anInt_9385, 1991764185 * var5.anInt_9386);
                  this.aClass259_7198.aClass269_4485.method3546(2, var8, var13, var14, var5.anInt_9385 * -1303644603, 1991764185 * var5.anInt_9386);
               } else if(var3 == 3) {
                  this.aClass259_7198.aClass269_4485.method3546(1, var8, var13, var14, var5.anInt_9385 * -1303644603, 1991764185 * var5.anInt_9386);
                  this.aClass259_7198.aClass269_4485.method3546(2, var8, var13, var14, -1303644603 * var5.anInt_9385, var5.anInt_9386 * 1991764185);
               }
            }

            if(-461592693 * var5.anInt_9390 != 64) {
               this.aClass259_7198.method3456(var8, var13, var14, var5.anInt_9390 * -461592693, (byte)0);
            }

            return true;
         } else if(Class495.aClass495_9042.anInt_9062 * -1965975883 == var2) {
            if(var4) {
               var26 = new Class563_Sub1_Sub5_Sub1(this.aClass259_7198, var1, this.aClass529_8333, var5, var8, var9, var10, var11, var12, this.aBoolean_7199, var2, var3, var15);
               if(var26.method2735((byte)12)) {
                  var26.method2721(var1, -483026635);
               }

               var20 = var26;
            } else {
               var20 = new Class563_Sub1_Sub5_Sub2(this.aClass259_7198, var1, this.aClass529_8333, var5, var8, var9, var10, var11, var12, this.aBoolean_7199, var2, var3, var6, var7);
            }

            this.aClass259_7198.method3449(var8, var13, var14, (Class563_Sub1_Sub5)var20, (Class563_Sub1_Sub5)null, (short)-12458);
            if(var5.aBoolean_9401 && this.aBoolean_7202) {
               if(0 == var3) {
                  var16.method2149(var13, 1 + var14, 50);
               } else if(var3 == 1) {
                  var16.method2149(var13 + 1, 1 + var14, 50);
               } else if(2 == var3) {
                  var16.method2149(var13 + 1, var14, 50);
               } else if(3 == var3) {
                  var16.method2149(var13, var14, 50);
               }
            }

            return true;
         } else if(-1965975883 * Class495.aClass495_9043.anInt_9062 == var2) {
            if(var4) {
               Class563_Sub1_Sub4_Sub5 var22 = new Class563_Sub1_Sub4_Sub5(this.aClass259_7198, var1, this.aClass529_8333, var5, var8, var9, var10, var11, var12, this.aBoolean_7199, var13, var13, var14, var14, var2, var3, var15);
               if(var22.method2735((byte)12)) {
                  var22.method2721(var1, -1102764409);
               }

               var20 = var22;
            } else {
               var20 = new Class563_Sub1_Sub4_Sub6(this.aClass259_7198, var1, this.aClass529_8333, var5, var8, var9, var10, var11, var12, this.aBoolean_7199, var13, var13 + var17 - 1, var14, var18 + var14 - 1, var2, var3, var6, var7);
            }

            this.aClass259_7198.method3455((PositionEntity)var20, false, 2050828637);
            if(var5.anInt_9372 * -60626187 == 1 && !this.aBoolean_7199) {
               byte var25;
               if((var3 & 1) == 0) {
                  var25 = 8;
               } else {
                  var25 = 16;
               }

               this.aClass259_7198.aClass269_4485.method3546(var25, var8, var13, var14, -1303644603 * var5.anInt_9385, 0);
            }

            if(64 != var5.anInt_9390 * -461592693) {
               this.aClass259_7198.method3456(var8, var13, var14, var5.anInt_9390 * -461592693, (byte)0);
            }

            return true;
         } else {
            return false;
         }
      }
   }

   final void method5402(Renderer var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      if(var3 < -952058325 * this.anInt_8336) {
         this.anInt_8336 = -1208741757 * var3;
      }

      Class534 var12 = this.aClass529_8333.method6015(var6, (byte)1);
      if(Class104_Sub21.renderSettings.aClass540_Sub17_7299.method3986(1395619056) != 0 || !var12.aBoolean_9433) {
         int var13;
         int var14;
         if(1 != var7 && var7 != 3) {
            var13 = var12.anInt_9377 * -215704445;
            var14 = -220503463 * var12.anInt_9423;
         } else {
            var13 = -220503463 * var12.anInt_9423;
            var14 = -215704445 * var12.anInt_9377;
         }

         int var15;
         int var16;
         if(var13 + var4 <= this.cubeWidth * -1058787665) {
            var15 = (var13 >> 1) + var4;
            var16 = var4 + (var13 + 1 >> 1);
         } else {
            var15 = var4;
            var16 = var4 + 1;
         }

         int var17;
         int var18;
         if(var5 + var14 <= -581318601 * this.cubeHeight) {
            var17 = var5 + (var14 >> 1);
            var18 = var5 + (1 + var14 >> 1);
         } else {
            var17 = var5;
            var18 = var5 + 1;
         }

         Plane var19 = this.aClass259_7198.planes[var2];
         int var20 = var19.method2155(var15, var17, (short)-1113) + var19.method2155(var16, var17, (short)-11081) + var19.method2155(var15, var18, (short)-6139) + var19.method2155(var16, var18, (short)17917) >> 2;
         int var21 = (var4 << 9) + (var13 << 8);
         int var22 = (var5 << 9) + (var14 << 8);
         boolean var23 = this.aBoolean_7202 && !this.aBoolean_7199 && var12.aBoolean_9383;
         if(var12.method6058((byte)117)) {
            Class34_Sub3.method2775(var3, var4, var5, var7, var12, (NPC)null, (Player)null, -245206809);
         }

         boolean var24 = var9 == -1 && (!var12.method6053((short)3211) || var12.aBoolean_9426 && Class104_Sub21.renderSettings.aClass540_Sub10_7292.method1653(-594341511) == 0) && null == var12.anIntArray_9415 && !var12.aBoolean_9432 && !var12.aBoolean_9436;
         if(!aBoolean_8328 || (!Class51.method520(var8, (short)-5978) || -60626187 * var12.anInt_9372 == 1) && (!Class104_Sub3.method3179(var8, 1933964699) || 0 != -60626187 * var12.anInt_9372)) {
            Object var26;
            if(Class495.aClass495_9061.anInt_9062 * -1965975883 == var8) {
               if(Class104_Sub21.renderSettings.aClass540_Sub18_7280.method4005((byte)-99) != 0 || var12.anInt_9380 * 166485479 != 0 || 1 == -69502263 * var12.anInt_9379 || var12.aBoolean_9411) {
                  if(var24) {
                     Class563_Sub1_Sub1_Sub1 var30 = new Class563_Sub1_Sub1_Sub1(this.aClass259_7198, var1, this.aClass529_8333, var12, var3, var2, var21, var20, var22, this.aBoolean_7199, var7, var23);
                     if(var30.method2735((byte)12)) {
                        var30.method2721(var1, 1634509479);
                     }

                     var26 = var30;
                  } else {
                     var26 = new Class563_Sub1_Sub1_Sub2(this.aClass259_7198, var1, this.aClass529_8333, var12, var3, var2, var21, var20, var22, this.aBoolean_7199, var7, var9, var10);
                  }

                  this.aClass259_7198.method3413(var3, var4, var5, (Class563_Sub1_Sub1)var26, (byte)10);
               }
            } else {
               Class563_Sub1_Sub4_Sub5 var25;
               if(var8 != -1965975883 * Class495.aClass495_9054.anInt_9062 && -1965975883 * Class495.aClass495_9060.anInt_9062 != var8) {
                  if(!Class104_Sub3.method3179(var8, 1979415253) && !Class26.method159(var8, (byte)-104)) {
                     if(!this.method5401(var1, var8, var7, var24, var12, var9, var10, var3, var2, var21, var20, var22, var4, var5, var23, var19, var13, var14, 736329680)) {
                        if(!this.method5407(var1, var8, var7, var24, var12, var9, var10, var3, var2, var21, var20, var22, var4, var5, (byte)60)) {
                           ;
                        }
                     }
                  } else {
                     if(var24) {
                        var25 = new Class563_Sub1_Sub4_Sub5(this.aClass259_7198, var1, this.aClass529_8333, var12, var3, var2, var21, var20, var22, this.aBoolean_7199, var4, var4 + var13 - 1, var5, var14 + var5 - 1, var8, var7, var23);
                        if(var25.method2735((byte)12)) {
                           var25.method2721(var1, -238876672);
                        }

                        var26 = var25;
                     } else {
                        var26 = new Class563_Sub1_Sub4_Sub6(this.aClass259_7198, var1, this.aClass529_8333, var12, var3, var2, var21, var20, var22, this.aBoolean_7199, var4, var4 + var13 - 1, var5, var5 + var14 - 1, var8, var7, var9, var10);
                     }

                     this.aClass259_7198.method3455((PositionEntity)var26, false, 1849957089);
                     if(this.aBoolean_7202 && !this.aBoolean_7199 && Class104_Sub3.method3179(var8, 1716480922) && var8 != -1965975883 * Class495.aClass495_9050.anInt_9062 && var3 > 0 && 0 != -60626187 * var12.anInt_9372) {
                        this.aByteArrayArrayArray_7207[var3][var4][var5] = (byte)(this.aByteArrayArrayArray_7207[var3][var4][var5] | 4);
                     }

                  }
               } else {
                  var25 = null;
                  int var28;
                  if(var24) {
                     Class563_Sub1_Sub4_Sub5 var27 = new Class563_Sub1_Sub4_Sub5(this.aClass259_7198, var1, this.aClass529_8333, var12, var3, var2, var21, var20, var22, this.aBoolean_7199, var4, var4 + var13 - 1, var5, var5 + var14 - 1, var8, var7, var23);
                     var28 = var27.method5171((short)9756);
                     var26 = var27;
                     var25 = var27;
                  } else {
                     var26 = new Class563_Sub1_Sub4_Sub6(this.aClass259_7198, var1, this.aClass529_8333, var12, var3, var2, var21, var20, var22, this.aBoolean_7199, var4, var13 + var4 - 1, var5, var5 + var14 - 1, var8, var7, var9, var10);
                     var28 = 15;
                  }

                  if(this.aClass259_7198.method3455((PositionEntity)var26, false, 1871169358)) {
                     if(var25 != null && var25.method2735((byte)12)) {
                        var25.method2721(var1, 538499369);
                     }

                     if(var12.aBoolean_9401 && this.aBoolean_7202) {
                        if(var28 > 30) {
                           var28 = 30;
                        }

                        for(int var31 = 0; var31 <= var13; ++var31) {
                           for(int var29 = 0; var29 <= var14; ++var29) {
                              var19.method2149(var31 + var4, var29 + var5, var28);
                           }
                        }
                     }
                  }

               }
            }
         }
      }
   }

   void method5403(Renderer var1, int var2, int var3, int var4, int var5, short var6) {
      Class218 var7 = this.method5405(var2, var3, var4, var5, 75166702);
      if(var7 != null) {
         Class534 var8 = this.aClass529_8333.method6015(var7.method2723((byte)-120), (byte)1);
         int var9 = var7.method2730(-511175920);
         int var10 = var7.method2718(-257729172);
         if(var8.method6058((byte)86)) {
            Class268.method3533(var2, var4, var5, var8, 293676025);
         }

         if(var7.method2735((byte)12)) {
            var7.method2722(var1, -490499518);
         }

         if(0 == var3) {
            this.aClass259_7198.method3418(var2, var4, var5, 1649220314);
            this.aClass259_7198.method3419(var2, var4, var5, (short)-28216);
            if(1 == -60626187 * var8.anInt_9372) {
               if(0 == var10) {
                  this.aClass259_7198.aClass269_4485.method3547(1, var2, var4, var5);
               } else if(1 == var10) {
                  this.aClass259_7198.aClass269_4485.method3547(2, var2, var4, 1 + var5);
               } else if(var10 == 2) {
                  this.aClass259_7198.aClass269_4485.method3547(1, var2, var4 + 1, var5);
               } else if(var10 == 3) {
                  this.aClass259_7198.aClass269_4485.method3547(2, var2, var4, var5);
               }
            }
         } else if(var3 == 1) {
            this.aClass259_7198.method3446(var2, var4, var5, (byte)2);
            this.aClass259_7198.method3450(var2, var4, var5, 1613482119);
         } else if(var3 == 2) {
            this.aClass259_7198.method3421(var2, var4, var5, client.aClass264_482, -1259524946);
            if(var9 == Class495.aClass495_9043.anInt_9062 * -1965975883) {
               if((var10 & 1) == 0) {
                  this.aClass259_7198.aClass269_4485.method3547(8, var2, var4, var5);
               } else {
                  this.aClass259_7198.aClass269_4485.method3547(16, var2, var4, var5);
               }
            }
         } else if(3 == var3) {
            this.aClass259_7198.method3405(var2, var4, var5, (byte)-67);
         }
      }

   }

   public final void method5404(Renderer var1, byte[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, byte var10) {
      ByteArrayDataNode var11 = new ByteArrayDataNode(var2);
      int var12 = -1;

      while(true) {
         int var13 = var11.method4491(-1869821578);
         if(0 == var13) {
            return;
         }

         var12 += var13;
         int var14 = 0;

         while(true) {
            int var15 = var11.method4490((byte)0);
            if(var15 == 0) {
               break;
            }

            var14 += var15 - 1;
            int var16 = var14 & 63;
            int var17 = var14 >> 6 & 63;
            int var18 = var14 >> 12;
            int var19 = var11.readByte(190160465);
            int var20 = var19 >> 2;
            int var21 = var19 & 3;
            if(var18 == var6 && var17 >= var7 && var17 < var7 + 8 && var16 >= var8 && var16 < var8 + 8) {
               Class534 var22 = this.aClass529_8333.method6015(var12, (byte)1);
               int var23 = var4 + Class557.method6157(var17 & 7, var16 & 7, var9, var22.anInt_9377 * -215704445, -220503463 * var22.anInt_9423, var21, 694561552);
               int var24 = var5 + Class412.method5107(var17 & 7, var16 & 7, var9, -215704445 * var22.anInt_9377, -220503463 * var22.anInt_9423, var21, 152610284);
               if(var23 > 0 && var24 > 0 && var23 < this.cubeWidth * -1058787665 - 1 && var24 < this.cubeHeight * -581318601 - 1) {
                  this.method5402(var1, var3, var3, var23, var24, var12, var21 + var9 & 3, var20, -1, 0, 1009817560);
               }
            }
         }
      }
   }

   public Class377_Sub1(WorldObjects var1, Class529 var2, int var3, int var4, int var5, boolean var6, Class281 var7, Class588 var8) {
      super(var1, var3, var4, var5, var6, Class133.aClass565_2603, PlayerComposite.aClass530_9858, var7);
      this.aClass529_8333 = var2;
      this.aClass588_8337 = var8;
   }

   Class218 method5405(int var1, int var2, int var3, int var4, int var5) {
      Class218 var6 = null;
      if(var2 == 0) {
         var6 = (Class218)this.aClass259_7198.method3423(var1, var3, var4, (byte)-7);
      }

      if(var2 == 1) {
         var6 = (Class218)this.aClass259_7198.method3425(var1, var3, var4, -2068087944);
      }

      if(2 == var2) {
         var6 = (Class218)this.aClass259_7198.method3416(var1, var3, var4, client.aClass264_482, 1422337890);
      }

      if(var2 == 3) {
         var6 = (Class218)this.aClass259_7198.method3428(var1, var3, var4, -946705284);
      }

      return var6;
   }

   public final void method5406(Renderer var1, boolean var2, byte var3) {
      this.aClass259_7198.method3429();
      if(!var2) {
         int var4;
         int var5;
         if(this.cubeStack * 1527979441 > 1) {
            for(var4 = 0; var4 < -1058787665 * this.cubeWidth; ++var4) {
               for(var5 = 0; var5 < this.cubeHeight * -581318601; ++var5) {
                  if(2 == (this.aClass281_7188.aByteArrayArrayArray_4768[1][var4][var5] & 2)) {
                     this.aClass259_7198.method3406(var4, var5, -1733307320);
                  }
               }
            }
         }

         for(var4 = 0; var4 < 1527979441 * this.cubeStack; ++var4) {
            for(var5 = 0; var5 <= -581318601 * this.cubeHeight; ++var5) {
               for(int var6 = 0; var6 <= this.cubeWidth * -1058787665; ++var6) {
                  if((this.aByteArrayArrayArray_7207[var4][var6][var5] & 4) != 0) {
                     int var7 = var6;
                     int var8 = var6;
                     int var9 = var5;

                     int var10;
                     for(var10 = var5; var9 > 0 && 0 != (this.aByteArrayArrayArray_7207[var4][var6][var9 - 1] & 4) && var10 - var9 < 10; --var9) {
                        ;
                     }

                     while(var10 < this.cubeHeight * -581318601 && (this.aByteArrayArrayArray_7207[var4][var6][1 + var10] & 4) != 0 && var10 - var9 < 10) {
                        ++var10;
                     }

                     int var11;
                     label94:
                     while(var7 > 0 && var8 - var7 < 10) {
                        for(var11 = var9; var11 <= var10; ++var11) {
                           if((this.aByteArrayArrayArray_7207[var4][var7 - 1][var11] & 4) == 0) {
                              break label94;
                           }
                        }

                        --var7;
                     }

                     label107:
                     while(var8 < this.cubeWidth * -1058787665 && var8 - var7 < 10) {
                        for(var11 = var9; var11 <= var10; ++var11) {
                           if(0 == (this.aByteArrayArrayArray_7207[var4][1 + var8][var11] & 4)) {
                              break label107;
                           }
                        }

                        ++var8;
                     }

                     if((var10 - var9 + 1) * (1 + (var8 - var7)) >= 4) {
                        var11 = this.anIntArrayArrayArray_7263[var4][var7][var9];
                        this.aClass259_7198.aClass269_4485.method3545(4, var4, var7 << 9, 512 + (var8 << 9), var9 << 9, (var10 << 9) + 512, var11, var11);

                        for(int var12 = var7; var12 <= var8; ++var12) {
                           for(int var13 = var9; var13 <= var10; ++var13) {
                              this.aByteArrayArrayArray_7207[var4][var12][var13] &= -5;
                           }
                        }
                     }
                  }
               }
            }
         }

         this.aClass259_7198.aClass269_4485.method3534();
      }

      this.aByteArrayArrayArray_7207 = (byte[][][])null;
   }

   boolean method5407(Renderer var1, int var2, int var3, boolean var4, Class534 var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, byte var15) {
      Object var17;
      if(var2 == Class495.aClass495_9044.anInt_9062 * -1965975883) {
         if(var4) {
            Class563_Sub1_Sub3_Sub1 var27 = new Class563_Sub1_Sub3_Sub1(this.aClass259_7198, var1, this.aClass529_8333, var5, var8, var9, var10, var11, var12, this.aBoolean_7199, 0, 0, var2, var3);
            if(var27.method2735((byte)12)) {
               var27.method2721(var1, -762372692);
            }

            var17 = var27;
         } else {
            var17 = new Class563_Sub1_Sub3_Sub2(this.aClass259_7198, var1, this.aClass529_8333, var5, var8, var9, var10, var11, var12, this.aBoolean_7199, 0, 0, var2, var3, var6, var7);
         }

         this.aClass259_7198.method3448(var8, var13, var14, (Class563_Sub1_Sub3)var17, (Class563_Sub1_Sub3)null, -1872547426);
         return true;
      } else {
         int var23;
         Class218 var24;
         Class563_Sub1_Sub3_Sub1 var26;
         if(var2 == Class495.aClass495_9045.anInt_9062 * -1965975883) {
            var23 = 65;
            var24 = (Class218)this.aClass259_7198.method3423(var8, var13, var14, (byte)-2);
            if(null != var24) {
               var23 = this.aClass529_8333.method6015(var24.method2723((byte)-76), (byte)1).anInt_9390 * -461592693 + 1;
            }

            if(var4) {
               var26 = new Class563_Sub1_Sub3_Sub1(this.aClass259_7198, var1, this.aClass529_8333, var5, var8, var9, var10, var11, var12, this.aBoolean_7199, anIntArray_8332[var3] * var23, anIntArray_8331[var3] * var23, var2, var3);
               if(var26.method2735((byte)12)) {
                  var26.method2721(var1, 1857847878);
               }

               var17 = var26;
            } else {
               var17 = new Class563_Sub1_Sub3_Sub2(this.aClass259_7198, var1, this.aClass529_8333, var5, var8, var9, var10, var11, var12, this.aBoolean_7199, var23 * anIntArray_8332[var3], anIntArray_8331[var3] * var23, var2, var3, var6, var7);
            }

            this.aClass259_7198.method3448(var8, var13, var14, (Class563_Sub1_Sub3)var17, (Class563_Sub1_Sub3)null, -1838883776);
            return true;
         } else if(Class495.aClass495_9046.anInt_9062 * -1965975883 == var2) {
            var23 = 33;
            var24 = (Class218)this.aClass259_7198.method3423(var8, var13, var14, (byte)-88);
            if(var24 != null) {
               var23 = this.aClass529_8333.method6015(var24.method2723((byte)-7), (byte)1).anInt_9390 * -461592693 / 2 + 1;
            }

            if(var4) {
               var26 = new Class563_Sub1_Sub3_Sub1(this.aClass259_7198, var1, this.aClass529_8333, var5, var8, var9, var10, var11, var12, this.aBoolean_7199, anIntArray_8332[var3] * var23, var23 * anIntArray_8331[var3], var2, var3 + 4);
               if(var26.method2735((byte)12)) {
                  var26.method2721(var1, 674679598);
               }

               var17 = var26;
            } else {
               var17 = new Class563_Sub1_Sub3_Sub2(this.aClass259_7198, var1, this.aClass529_8333, var5, var8, var9, var10, var11, var12, this.aBoolean_7199, var23 * anIntArray_8334[var3], anIntArray_8335[var3] * var23, var2, var3 + 4, var6, var7);
            }

            this.aClass259_7198.method3448(var8, var13, var14, (Class563_Sub1_Sub3)var17, (Class563_Sub1_Sub3)null, -2068655390);
            return true;
         } else if(var2 == Class495.aClass495_9047.anInt_9062 * -1965975883) {
            var23 = var3 + 2 & 3;
            if(var4) {
               Class563_Sub1_Sub3_Sub1 var25 = new Class563_Sub1_Sub3_Sub1(this.aClass259_7198, var1, this.aClass529_8333, var5, var8, var9, var10, var11, var12, this.aBoolean_7199, 0, 0, var2, 4 + var23);
               if(var25.method2735((byte)12)) {
                  var25.method2721(var1, 1408563528);
               }

               var17 = var25;
            } else {
               var17 = new Class563_Sub1_Sub3_Sub2(this.aClass259_7198, var1, this.aClass529_8333, var5, var8, var9, var10, var11, var12, this.aBoolean_7199, 0, 0, var2, 4 + var23, var6, var7);
            }

            this.aClass259_7198.method3448(var8, var13, var14, (Class563_Sub1_Sub3)var17, (Class563_Sub1_Sub3)null, -1886656257);
            return true;
         } else if(var2 == -1965975883 * Class495.aClass495_9048.anInt_9062) {
            int var18 = 2 + var3 & 3;
            int var19 = 33;
            Class218 var20 = (Class218)this.aClass259_7198.method3423(var8, var13, var14, (byte)29);
            if(var20 != null) {
               var19 = this.aClass529_8333.method6015(var20.method2723((byte)-32), (byte)1).anInt_9390 * -461592693 / 2 + 1;
            }

            Object var16;
            if(var4) {
               Class563_Sub1_Sub3_Sub1 var21 = new Class563_Sub1_Sub3_Sub1(this.aClass259_7198, var1, this.aClass529_8333, var5, var8, var9, var10, var11, var12, this.aBoolean_7199, var19 * anIntArray_8334[var3], var19 * anIntArray_8335[var3], var2, var3 + 4);
               Class563_Sub1_Sub3_Sub1 var22 = new Class563_Sub1_Sub3_Sub1(this.aClass259_7198, var1, this.aClass529_8333, var5, var8, var9, var10, var11, var12, this.aBoolean_7199, 0, 0, var2, var18 + 4);
               if(var21.method2735((byte)12)) {
                  var21.method2721(var1, -1112664056);
               }

               if(var22.method2735((byte)12)) {
                  var22.method2721(var1, 541401290);
               }

               var17 = var21;
               var16 = var22;
            } else {
               Class563_Sub1_Sub3_Sub2 var29 = new Class563_Sub1_Sub3_Sub2(this.aClass259_7198, var1, this.aClass529_8333, var5, var8, var9, var10, var11, var12, this.aBoolean_7199, anIntArray_8334[var3] * var19, var19 * anIntArray_8335[var3], var2, var3 + 4, var6, var7);
               Class563_Sub1_Sub3_Sub2 var28 = new Class563_Sub1_Sub3_Sub2(this.aClass259_7198, var1, this.aClass529_8333, var5, var8, var9, var10, var11, var12, this.aBoolean_7199, 0, 0, var2, var18 + 4, var6, var7);
               var17 = var29;
               var16 = var28;
            }

            this.aClass259_7198.method3448(var8, var13, var14, (Class563_Sub1_Sub3)var17, (Class563_Sub1_Sub3)var16, -1904794977);
            return true;
         } else {
            return false;
         }
      }
   }

   static final void method5408(RSInterfaceData var0, int var1) {
      var0.intTypeIndex -= -708028207;
   }

   public static void method5409(int var0, int var1, int var2, byte var3) {
      MapPoint var4 = client.aClass296_348.getMapArea();
      int var5 = var1 + var4.loadedMapX * 1265321541;
      int var6 = var4.loadedMapY * -1996781083 + var2;
      if(client.aClass296_348.getWorldObjects() != null && client.aClass296_348.method3742(-1659010975) != Class305.aClass305_6023 && var1 >= 0 && var2 >= 0 && var1 < client.aClass296_348.getMaxX((byte)-41) && var2 < client.aClass296_348.getMaxY(1958527302)) {
         long var7 = (long)(var0 << 28 | var6 << 14 | var5);
         Class240_Sub25 var9 = (Class240_Sub25)client.groundItems.getNode(var7);
         if(var9 == null) {
            client.aClass296_348.getWorldObjects().method3445(var0, var1, var2, -580525454);
         } else {
            Class240_Sub36 var10 = (Class240_Sub36)var9.itemList.getBaseNode_2((byte)86);
            if(null == var10) {
               client.aClass296_348.getWorldObjects().method3445(var0, var1, var2, -580525454);
            } else {
               Class563_Sub1_Sub2_Sub1 var11 = (Class563_Sub1_Sub2_Sub1)client.aClass296_348.getWorldObjects().method3445(var0, var1, var2, -580525454);
               if(null == var11) {
                  var11 = new Class563_Sub1_Sub2_Sub1(client.aClass296_348.getWorldObjects(), var1 << 265, client.aClass296_348.getWorldObjects().planes[var0].method2155(var1, var2, (short)12051), var2 << 265, var0, var0);
               } else {
                  var11.anInt_3184 = -748737285;
                  var11.anInt_3182 = -768007107;
                  var11.worldObjects = client.aClass296_348.getWorldObjects();
               }

               var11.anInt_3187 = 1941434859 * var10.id;
               var11.anInt_3181 = 1854535471 * var10.anInt_7496;

               label53:
               while(true) {
                  Class240_Sub36 var12 = (Class240_Sub36)var9.itemList.getNext(-961964224);
                  if(null == var12) {
                     break;
                  }

                  if(1665912711 * var12.id != 1210439125 * var11.anInt_3187) {
                     var11.anInt_3182 = var12.id * -1162768171;
                     var11.anInt_3180 = -235813347 * var12.anInt_7496;

                     while(true) {
                        Class240_Sub36 var13 = (Class240_Sub36)var9.itemList.getNext(-403151743);
                        if(null == var13) {
                           break label53;
                        }

                        if(1665912711 * var13.id != 1210439125 * var11.anInt_3187 && 493513963 * var11.anInt_3182 != var13.id * 1665912711) {
                           var11.anInt_3184 = var13.id * 1424446115;
                           var11.anInt_3189 = 291534239 * var13.anInt_7496;
                        }
                     }
                  }
               }

               int var14 = CompProfile.getHeight((var1 << 9) + 256, 256 + (var2 << 9), var0);
               var11.setPosition((float)(var1 << 265), (float)var14, (float)(var2 << 265));
               var11.anInt_3186 = 0;
               var11.plane = (byte)var0;
               var11.aByte_6942 = (byte)var0;
               if(client.aClass296_348.method3753().method3646(var1, var2, (byte)0)) {
                  ++var11.aByte_6942;
               }

               client.aClass296_348.getWorldObjects().method3414(var0, var1, var2, var14, var11, -256783956);
            }
         }
      }
   }
}
