import java.util.Arrays;

public class Class534 {

   int[][] anIntArrayArray_9359;
   public int anInt_9360 = -1067487488;
   int anInt_9361 = 0;
   short[] aShortArray_9362;
   byte[] aByteArray_9363;
   public boolean aBoolean_9364 = false;
   public String name = "null";
   byte[] aByteArray_9366;
   public int anInt_9367;
   short[] aShortArray_9368;
   int[] anIntArray_9369 = null;
   byte aByte_9370 = 0;
   public int anInt_9371 = 0;
   public int anInt_9372 = 1587482275;
   byte aByte_9373;
   byte aByte_9374;
   short[] aShortArray_9375;
   byte aByte_9376 = 0;
   public int anInt_9377 = 610112043;
   int anInt_9378 = -1182358144;
   public int anInt_9379 = -136347918;
   public int anInt_9380 = -585590231;
   Class529 aClass529_9381;
   int anInt_9382 = 401735931;
   public boolean aBoolean_9383 = false;
   byte[] aByteArray_9384;
   public int anInt_9385 = 952570048;
   public int anInt_9386 = 0;
   public int[] anIntArray_9387;
   int[] anIntArray_9388 = null;
   byte aByte_9389;
   public int anInt_9390 = -1869477696;
   int anInt_9391 = 0;
   int anInt_9392 = 0;
   public String[] screenOptions;
   int[] anIntArray_9394;
   public int anInt_9395 = 2011301827;
   public int anInt_9396 = 599337939;
   public boolean aBoolean_9397 = false;
   public int anInt_9398 = 0;
   static final int anInt_9399 = 6;
   public boolean aBoolean_9400 = false;
   public boolean aBoolean_9401 = true;
   int anInt_9402 = -890422144;
   int anInt_9403 = 492529280;
   int anInt_9404 = 0;
   NodeArrayList aNodeArrayList_9405;
   int anInt_9406 = 0;
   int anInt_9407 = 0;
   int anInt_9408 = 0;
   int anInt_9409 = 0;
   public int anInt_9410 = -1933820477;
   public boolean aBoolean_9411 = false;
   boolean aBoolean_9412 = false;
   public int anInt_9413 = -1209611397;
   public int anInt_9414 = 0;
   public int[] anIntArray_9415;
   int anInt_9416 = 1633091383;
   int anInt_9417 = -410215905;
   public int anInt_9418 = 2117687397;
   public static short[] aShortArray_9419 = new short[256];
   public int anInt_9420 = 0;
   byte[] aByteArray_9421;
   public boolean aBoolean_9422 = false;
   public int anInt_9423 = 1781384681;
   public int anInt_9424 = 0;
   public int[] anIntArray_9425;
   public boolean aBoolean_9426 = false;
   public boolean aBoolean_9427 = true;
   short[] aShortArray_9428;
   public boolean aBoolean_9429 = true;
   public boolean aBoolean_9430 = false;
   public int anInt_9431 = 0;
   public boolean aBoolean_9432 = false;
   public boolean aBoolean_9433 = false;
   public int anInt_9434 = 236852992;
   public boolean aBoolean_9435 = false;
   public boolean aBoolean_9436 = false;
   public boolean aBoolean_9437 = false;
   static final int anInt_9438 = 127007;
   public static Class275 aClass275_9439;


   void method6041(ByteArrayDataNode var1, int var2) {
      while(true) {
         int var3 = var1.readByte(852448391);
         if(var3 == 0) {
            return;
         }

         this.method6042(var1, var3, (byte)69);
      }
   }

   void method6042(ByteArrayDataNode var1, int var2, byte var3) {
      int var4;
      int var5;
      int var6;
      int var7;
      if(var2 == 1) {
         var4 = var1.readByte(1618054368);
         this.aByteArray_9363 = new byte[var4];
         this.anIntArrayArray_9359 = new int[var4][];

         for(var5 = 0; var5 < var4; ++var5) {
            this.aByteArray_9363[var5] = var1.getByte((byte)18);
            var6 = var1.readByte(655941550);
            this.anIntArrayArray_9359[var5] = new int[var6];

            for(var7 = 0; var7 < var6; ++var7) {
               this.anIntArrayArray_9359[var5][var7] = var1.method4493(-157074556);
            }
         }
      } else if(2 == var2) {
         this.name = var1.method4485(-1368039558);
      } else if(14 == var2) {
         this.anInt_9377 = var1.readByte(1005891260) * 610112043;
      } else if(var2 == 15) {
         this.anInt_9423 = var1.readByte(-380332611) * 1781384681;
      } else if(17 == var2) {
         this.anInt_9379 = 0;
      } else if(18 != var2) {
         if(var2 == 19) {
            this.anInt_9380 = var1.readByte(1839302292) * 585590231;
         } else if(21 == var2) {
            this.aByte_9370 = 1;
         } else if(22 == var2) {
            this.aBoolean_9383 = true;
         } else if(23 == var2) {
            this.anInt_9372 = -1587482275;
         } else if(24 == var2) {
            var4 = var1.method4493(-157074556);
            if(-1 != var4) {
               this.anIntArray_9369 = new int[]{var4};
            }
         } else if(var2 == 27) {
            this.anInt_9379 = 2079309689;
         } else if(var2 == 28) {
            this.anInt_9390 = (var1.readByte(-870625688) << 2) * -968734685;
         } else if(29 == var2) {
            this.anInt_9391 = var1.getByte((byte)63) * -1713729965;
         } else if(var2 == 39) {
            this.anInt_9392 = var1.getByte((byte)105) * -1090351445;
         } else if(var2 >= 30 && var2 < 35) {
            this.screenOptions[var2 - 30] = var1.method4485(-910764650);
         } else if(var2 == 40) {
            var4 = var1.readByte(-920063972);
            this.aShortArray_9428 = new short[var4];
            this.aShortArray_9368 = new short[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.aShortArray_9428[var5] = (short)var1.readShort(-660440391);
               this.aShortArray_9368[var5] = (short)var1.readShort(1507262429);
            }
         } else if(41 == var2) {
            var4 = var1.readByte(-747468656);
            this.aShortArray_9362 = new short[var4];
            this.aShortArray_9375 = new short[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.aShortArray_9362[var5] = (short)var1.readShort(-365908616);
               this.aShortArray_9375[var5] = (short)var1.readShort(-1232604796);
            }
         } else if(42 == var2) {
            var4 = var1.readByte(2145504206);
            this.aByteArray_9366 = new byte[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.aByteArray_9366[var5] = var1.getByte((byte)78);
            }
         } else {
            byte var9;
            if(var2 == 44) {
               var4 = var1.readShort(-1150328478);
               var5 = 0;

               for(var6 = var4; var6 > 0; var6 >>= 1) {
                  ++var5;
               }

               this.aByteArray_9384 = new byte[var5];
               var9 = 0;

               for(var7 = 0; var7 < var5; ++var7) {
                  if((var4 & 1 << var7) > 0) {
                     this.aByteArray_9384[var7] = var9++;
                  } else {
                     this.aByteArray_9384[var7] = -1;
                  }
               }
            } else if(var2 == 45) {
               var4 = var1.readShort(416863848);
               var5 = 0;

               for(var6 = var4; var6 > 0; var6 >>= 1) {
                  ++var5;
               }

               this.aByteArray_9421 = new byte[var5];
               var9 = 0;

               for(var7 = 0; var7 < var5; ++var7) {
                  if((var4 & 1 << var7) > 0) {
                     this.aByteArray_9421[var7] = var9++;
                  } else {
                     this.aByteArray_9421[var7] = -1;
                  }
               }
            } else if(var2 == 62) {
               this.aBoolean_9400 = true;
            } else if(var2 == 64) {
               this.aBoolean_9401 = false;
            } else if(65 == var2) {
               this.anInt_9402 = var1.readShort(1314493726) * -443164039;
            } else if(var2 == 66) {
               this.anInt_9403 = var1.readShort(563072530) * 238728909;
            } else if(67 == var2) {
               this.anInt_9378 = var1.readShort(-479012873) * -915206837;
            } else if(69 == var2) {
               var1.readByte(1786415788);
            } else if(70 == var2) {
               this.anInt_9361 = (var1.method4478((byte)1) << 2) * 400222665;
            } else if(var2 == 71) {
               this.anInt_9406 = (var1.method4478((byte)1) << 2) * 444367555;
            } else if(var2 == 72) {
               this.anInt_9407 = (var1.method4478((byte)1) << 2) * -967997191;
            } else if(73 == var2) {
               this.aBoolean_9411 = true;
            } else if(74 == var2) {
               this.aBoolean_9412 = true;
            } else if(75 == var2) {
               this.anInt_9413 = var1.readByte(87720709) * 1209611397;
            } else if(var2 != 77 && 92 != var2) {
               if(78 == var2) {
                  this.anInt_9418 = var1.readShort(1451717886) * -2117687397;
                  this.anInt_9431 = var1.readByte(1066618574) * 2040952819;
               } else if(var2 == 79) {
                  this.anInt_9371 = var1.readShort(759260851) * -365682363;
                  this.anInt_9424 = var1.readShort(1049370660) * -1720453429;
                  this.anInt_9431 = var1.readByte(-1040706555) * 2040952819;
                  var4 = var1.readByte(486950495);
                  this.anIntArray_9425 = new int[var4];

                  for(var5 = 0; var5 < var4; ++var5) {
                     this.anIntArray_9425[var5] = var1.readShort(-55012306);
                  }
               } else if(var2 == 81) {
                  this.aByte_9370 = 2;
                  this.anInt_9382 = var1.readByte(-234541314) * 234816768;
               } else if(82 == var2) {
                  this.aBoolean_9433 = true;
               } else if(var2 == 88) {
                  this.aBoolean_9429 = false;
               } else if(89 == var2) {
                  this.aBoolean_9427 = false;
               } else if(var2 == 91) {
                  this.aBoolean_9364 = true;
               } else if(93 == var2) {
                  this.aByte_9370 = 3;
                  this.anInt_9382 = var1.readShort(-533820010) * -401735931;
               } else if(var2 == 94) {
                  this.aByte_9370 = 4;
               } else if(95 == var2) {
                  this.aByte_9370 = 5;
                  this.anInt_9382 = var1.method4478((byte)1) * -401735931;
               } else if(97 == var2) {
                  this.aBoolean_9397 = true;
               } else if(98 == var2) {
                  this.aBoolean_9432 = true;
               } else if(var2 != 99 && 100 != var2) {
                  if(var2 == 101) {
                     this.anInt_9398 = var1.readByte(1501809975) * -329307711;
                  } else if(102 == var2) {
                     this.anInt_9396 = var1.readShort(97201921) * -599337939;
                  } else if(var2 == 103) {
                     this.anInt_9372 = 0;
                  } else if(104 == var2) {
                     this.anInt_9410 = var1.readByte(-45109650) * -1237123267;
                  } else if(var2 == 105) {
                     this.aBoolean_9430 = true;
                  } else if(106 == var2) {
                     var4 = var1.readByte(-265731840);
                     var5 = 0;
                     this.anIntArray_9369 = new int[var4];
                     this.anIntArray_9388 = new int[var4];

                     for(var6 = 0; var6 < var4; ++var6) {
                        this.anIntArray_9369[var6] = var1.method4493(-157074556);
                        var5 += this.anIntArray_9388[var6] = var1.readByte(2094443168);
                     }

                     for(var6 = 0; var6 < var4; ++var6) {
                        this.anIntArray_9388[var6] = this.anIntArray_9388[var6] * '\uffff' / var5;
                     }
                  } else if(107 == var2) {
                     this.anInt_9395 = var1.readShort(-1166702860) * -2011301827;
                  } else if(var2 >= 150 && var2 < 155) {
                     this.screenOptions[var2 - 150] = var1.method4485(-1195830170);
                     if(!this.aClass529_9381.aBoolean_9308) {
                        this.screenOptions[var2 - 150] = null;
                     }
                  } else if(160 == var2) {
                     var4 = var1.readByte(-307326432);
                     this.anIntArray_9387 = new int[var4];

                     for(var5 = 0; var5 < var4; ++var5) {
                        this.anIntArray_9387[var5] = var1.readShort(-735705560);
                     }
                  } else if(var2 == 162) {
                     this.aByte_9370 = 3;
                     this.anInt_9382 = var1.method4480(1260717178) * -401735931;
                  } else if(163 == var2) {
                     this.aByte_9373 = var1.getByte((byte)66);
                     this.aByte_9374 = var1.getByte((byte)13);
                     this.aByte_9389 = var1.getByte((byte)101);
                     this.aByte_9376 = var1.getByte((byte)121);
                  } else if(var2 == 164) {
                     this.anInt_9408 = var1.method4478((byte)1) * 1171049897;
                  } else if(165 == var2) {
                     this.anInt_9409 = var1.method4478((byte)1) * 1554386473;
                  } else if(var2 == 166) {
                     this.anInt_9404 = var1.method4478((byte)1) * -810534993;
                  } else if(167 == var2) {
                     this.anInt_9414 = var1.readShort(-245050556) * 1006427131;
                  } else if(168 == var2) {
                     this.aBoolean_9422 = true;
                  } else if(var2 == 169) {
                     this.aBoolean_9435 = true;
                  } else if(170 == var2) {
                     this.anInt_9385 = var1.method4490((byte)0) * -2137543539;
                  } else if(171 == var2) {
                     this.anInt_9386 = var1.method4490((byte)0) * 907417449;
                  } else if(173 == var2) {
                     this.anInt_9434 = var1.readShort(669469007) * 906894871;
                     this.anInt_9360 = var1.readShort(-397866052) * -1212129425;
                  } else if(var2 == 177) {
                     this.aBoolean_9436 = true;
                  } else if(var2 == 178) {
                     this.anInt_9420 = var1.readByte(-1139135481) * -725486027;
                  } else if(var2 == 189) {
                     this.aBoolean_9437 = true;
                  } else if(var2 >= 190 && var2 < 196) {
                     if(null == this.anIntArray_9394) {
                        this.anIntArray_9394 = new int[6];
                        Arrays.fill(this.anIntArray_9394, -1);
                     }

                     this.anIntArray_9394[var2 - 190] = var1.readShort(-319765018);
                  } else if(var2 == 196) {
                     Class559.method6185(Class20.method117((byte)-110), var1.readByte(1066669540), (byte)-13);
                  } else if(197 == var2) {
                     Class559.method6185(Class203.method2585(-2054293275), var1.readByte(693692388), (byte)-19);
                  } else if(198 != var2 && 199 != var2) {
                     if(var2 == 200) {
                        this.aBoolean_9426 = true;
                     } else if(249 == var2) {
                        var4 = var1.readByte(-346489770);
                        if(null == this.aNodeArrayList_9405) {
                           var5 = Class105.method1359(var4, (byte)124);
                           this.aNodeArrayList_9405 = new NodeArrayList(var5);
                        }

                        for(var5 = 0; var5 < var4; ++var5) {
                           boolean var10 = var1.readByte(275721263) == 1;
                           var7 = var1.method4479(738776218);
                           Object var8;
                           if(var10) {
                              var8 = new Class240_Sub9(var1.method4485(-1483929377));
                           } else {
                              var8 = new IndexNode(var1.method4480(1260717178));
                           }

                           this.aNodeArrayList_9405.insert((NodeListNode)var8, (long)var7);
                        }
                     }
                  }
               } else {
                  var1.readByte(-996465862);
                  var1.readShort(1012928817);
               }
            } else {
               this.anInt_9416 = var1.readShort(502313558) * -1633091383;
               if('\uffff' == this.anInt_9416 * 288561529) {
                  this.anInt_9416 = 1633091383;
               }

               this.anInt_9417 = var1.readShort(307745821) * 410215905;
               if('\uffff' == this.anInt_9417 * -1977639391) {
                  this.anInt_9417 = -410215905;
               }

               var4 = -1;
               if(var2 == 92) {
                  var4 = var1.method4493(-157074556);
               }

               var5 = var1.readByte(1493611896);
               this.anIntArray_9415 = new int[2 + var5];

               for(var6 = 0; var6 <= var5; ++var6) {
                  this.anIntArray_9415[var6] = var1.method4493(-157074556);
               }

               this.anIntArray_9415[1 + var5] = var4;
            }
         }
      }

   }

   void method6043(int var1) {
      if(-1 == 166485479 * this.anInt_9380) {
         this.anInt_9380 = 0;
         if(null != this.aByteArray_9363 && 1 == this.aByteArray_9363.length && Class495.aClass495_9054.anInt_9062 * -1965975883 == this.aByteArray_9363[0]) {
            this.anInt_9380 = 585590231;
         }

         for(int var2 = 0; var2 < 5; ++var2) {
            if(null != this.screenOptions[var2]) {
               this.anInt_9380 = 585590231;
               break;
            }
         }
      }

      if(-1 == this.anInt_9413 * -1248943027) {
         this.anInt_9413 = (this.anInt_9379 * -69502263 != 0?1:0) * 1209611397;
      }

      if(this.method6053((short)29259) || this.aBoolean_9432 || null != this.anIntArray_9415) {
         this.aBoolean_9436 = true;
      }

   }

   public final boolean method6044(int var1, byte var2) {
      if(null == this.anIntArrayArray_9359) {
         return true;
      } else {
         boolean var3 = true;
         CacheDataUnpacker var4 = this.aClass529_9381.aCacheUnpacker_9310;
         synchronized(this.aClass529_9381.aCacheUnpacker_9310) {
            for(int var5 = 0; var5 < this.aByteArray_9363.length; ++var5) {
               if(var1 == this.aByteArray_9363[var5]) {
                  for(int var6 = 0; var6 < this.anIntArrayArray_9359[var5].length; ++var6) {
                     if(!this.aClass529_9381.aCacheUnpacker_9310.method3568(this.anIntArrayArray_9359[var5][var6], 0, 1586526214)) {
                        var3 = false;
                     }
                  }
               }
            }

            return var3;
         }
      }
   }

   public final synchronized Class477 method6045(Renderer var1, int var2, int var3, int var4, Plane var5, Plane var6, int var7, int var8, int var9, boolean var10, Class532 var11, int var12) {
      if(Class86.method1131(var3, -483218261)) {
         var3 = Class495.aClass495_9044.anInt_9062 * -1965975883;
      }

      long var13 = (long)(var4 + (this.anInt_9367 * 2043792579 << 10) + (var3 << 3));
      var13 |= (long)(-1555911463 * var1.rendererID << 29);
      if(var11 != null) {
         var13 |= 490335251831437917L * var11.aLong_9336 << 32;
      }

      int var15 = var2;
      if(3 == this.aByte_9370) {
         var15 = var2 | 7;
      } else {
         if(0 != this.aByte_9370 || this.anInt_9409 * -327455207 != 0) {
            var15 = var2 | 2;
         }

         if(-926800231 * this.anInt_9408 != 0) {
            var15 |= 1;
         }

         if(this.anInt_9404 * 330399567 != 0) {
            var15 |= 4;
         }
      }

      if(var10) {
         var15 |= 262144;
      }

      boolean var16 = 0 != this.aByte_9370 && (var5 != null || var6 != null);
      boolean var17 = -926800231 * this.anInt_9408 != 0 || this.anInt_9409 * -327455207 != 0 || 0 != 330399567 * this.anInt_9404;
      CacheNodeArrayList var18 = this.aClass529_9381.aClass627_9314;
      Class477 var19;
      synchronized(this.aClass529_9381.aClass627_9314) {
         var19 = (Class477)this.aClass529_9381.aClass627_9314.getObject(var13);
      }

      Model var26 = (Model)(null != var19?var19.anObject_8743:null);
      Class240_Sub22_Sub7 var20 = null;
      if(null != var26 && var1.method1940(var26.method2015(), var15) == 0) {
         var20 = (Class240_Sub22_Sub7)var19.anObject_8742;
         if(var10 && null == var20 && !var16 && !var17) {
            var20 = (Class240_Sub22_Sub7)(var19.anObject_8742 = var26.method2054((Class240_Sub22_Sub7)null));
         }
      } else {
         if(var26 != null) {
            var15 = var1.method1941(var15, var26.method2015());
         }

         int var21 = var15;
         if(var3 == Class495.aClass495_9054.anInt_9062 * -1965975883 && var4 > 3) {
            var21 = var15 | 5;
         }

         var26 = this.method6047(var1, var21, var3, var4, var11, -916932591);
         if(null == var26) {
            return null;
         }

         if(Class495.aClass495_9054.anInt_9062 * -1965975883 == var3 && var4 > 3) {
            var26.method2017(2048);
         }

         if(var10 && !var16 && !var17) {
            var20 = var26.method2054((Class240_Sub22_Sub7)null);
         }

         var26.method2042(var15);
         var19 = new Class477(var26, var20);
         CacheNodeArrayList var22 = this.aClass529_9381.aClass627_9314;
         synchronized(this.aClass529_9381.aClass627_9314) {
            this.aClass529_9381.aClass627_9314.insert(var19, var13);
         }
      }

      if(!var16 && !var17) {
         var26 = var26.copy((byte)0, var2, true);
      } else {
         var26 = var26.copy((byte)0, var15, true);
         if(var16) {
            var26.method2023(this.aByte_9370, this.anInt_9382 * -406850099, var5, var6, var7, var8, var9);
         }

         if(var17) {
            var26.offset(-926800231 * this.anInt_9408, -327455207 * this.anInt_9409, this.anInt_9404 * 330399567);
         }

         if(var10) {
            var20 = var26.method2054((Class240_Sub22_Sub7)null);
         }

         var26.method2042(var2);
      }

      this.aClass529_9381.aClass477_9312.anObject_8743 = var26;
      this.aClass529_9381.aClass477_9312.anObject_8742 = var20;
      return this.aClass529_9381.aClass477_9312;
   }

   public final synchronized Model method6046(Renderer var1, int var2, int var3, int var4, Plane var5, Plane var6, int var7, int var8, int var9, Animator var10, Class532 var11, byte var12) {
      if(Class86.method1131(var3, -483218261)) {
         var3 = Class495.aClass495_9044.anInt_9062 * -1965975883;
      }

      long var13 = (long)((var3 << 3) + (2043792579 * this.anInt_9367 << 10) + var4);
      var13 |= (long)(var1.rendererID * -1555911463 << 29);
      if(var11 != null) {
         var13 |= var11.aLong_9336 * 490335251831437917L << 32;
      }

      if(null != var10) {
         var2 |= var10.getFlags((short)-13941);
      }

      if(3 == this.aByte_9370) {
         var2 |= 7;
      } else {
         if(0 != this.aByte_9370 || this.anInt_9409 * -327455207 != 0) {
            var2 |= 2;
         }

         if(0 != -926800231 * this.anInt_9408) {
            var2 |= 1;
         }

         if(this.anInt_9404 * 330399567 != 0) {
            var2 |= 4;
         }
      }

      if(-1965975883 * Class495.aClass495_9054.anInt_9062 == var3 && var4 > 3) {
         var2 |= 5;
      }

      CacheNodeArrayList var16 = this.aClass529_9381.aClass627_9315;
      Model var17;
      synchronized(this.aClass529_9381.aClass627_9315) {
         var17 = (Model)this.aClass529_9381.aClass627_9315.getObject(var13);
      }

      if(var17 == null || var1.method1940(var17.method2015(), var2) != 0) {
         if(var17 != null) {
            var2 = var1.method1941(var2, var17.method2015());
         }

         var17 = this.method6047(var1, var2, var3, var4, var11, -175508971);
         if(var17 == null) {
            return null;
         }

         var16 = this.aClass529_9381.aClass627_9315;
         synchronized(this.aClass529_9381.aClass627_9315) {
            this.aClass529_9381.aClass627_9315.insert(var17, var13);
         }
      }

      boolean var22 = false;
      if(null != var10) {
         var17 = var17.copy((byte)1, var2, true);
         var22 = true;
         var10.applyToModel(var17, var4 & 3, -1672237714);
      }

      if(-1965975883 * Class495.aClass495_9054.anInt_9062 == var3 && var4 > 3) {
         if(!var22) {
            var17 = var17.copy((byte)3, var2, true);
            var22 = true;
         }

         var17.method2017(2048);
      }

      if(this.aByte_9370 != 0) {
         if(!var22) {
            var17 = var17.copy((byte)3, var2, true);
            var22 = true;
         }

         var17.method2023(this.aByte_9370, this.anInt_9382 * -406850099, var5, var6, var7, var8, var9);
      }

      if(0 != -926800231 * this.anInt_9408 || 0 != this.anInt_9409 * -327455207 || this.anInt_9404 * 330399567 != 0) {
         if(!var22) {
            var17 = var17.copy((byte)3, var2, true);
            var22 = true;
         }

         var17.offset(this.anInt_9408 * -926800231, -327455207 * this.anInt_9409, 330399567 * this.anInt_9404);
      }

      if(var22) {
         var17.method2042(var2);
      }

      return var17;
   }

   Model method6047(Renderer var1, int var2, int var3, int var4, Class532 var5, int var6) {
      int var7 = -714545701 * this.anInt_9391 + 64;
      int var8 = 850 + this.anInt_9392 * 167570447;
      int var9 = var2;
      boolean var10 = this.aBoolean_9400 || var3 == -1965975883 * Class495.aClass495_9058.anInt_9062 && var4 > 3;
      if(var10) {
         var2 |= 16;
      }

      if(0 == var4) {
         if(128 != this.anInt_9402 * -1455067191 || 0 != -250904455 * this.anInt_9361) {
            var2 |= 1;
         }

         if(128 != this.anInt_9378 * -9956253 || 1831385417 * this.anInt_9407 != 0) {
            var2 |= 4;
         }
      } else {
         var2 |= 13;
      }

      if(128 != this.anInt_9403 * 1486366213 || 0 != 697220587 * this.anInt_9406) {
         var2 |= 2;
      }

      if(this.aShortArray_9428 != null) {
         var2 |= 16384;
      }

      if(this.aShortArray_9362 != null) {
         var2 |= '\u8000';
      }

      if(0 != this.aByte_9376) {
         var2 |= 524288;
      }

      Model var11 = null;
      int var14;
      if(null != this.aByteArray_9363) {
         int var12 = -1;

         for(int var13 = 0; var13 < this.aByteArray_9363.length; ++var13) {
            if(var3 == this.aByteArray_9363[var13]) {
               var12 = var13;
               break;
            }
         }

         if(-1 == var12) {
            return null;
         }

         int[] var29 = null != var5 && null != var5.anIntArray_9335?var5.anIntArray_9335:this.anIntArrayArray_9359[var12];
         var14 = var29.length;
         if(var14 > 0) {
            long var15 = (long)(-1555911463 * var1.rendererID);

            int var17;
            for(var17 = 0; var17 < var14; ++var17) {
               var15 = var15 * 67783L + (long)var29[var17];
            }

            CacheNodeArrayList var32 = this.aClass529_9381.aClass627_9306;
            synchronized(this.aClass529_9381.aClass627_9306) {
               var11 = (Model)this.aClass529_9381.aClass627_9306.getObject(var15);
            }

            if(var11 != null) {
               if(var7 != var11.method2046()) {
                  var2 |= 4096;
               }

               if(var8 != var11.method2047()) {
                  var2 |= 8192;
               }
            }

            if(null == var11 || var1.method1940(var11.method2015(), var2) != 0) {
               var17 = var2 | 127007;
               if(null != var11) {
                  var17 = var1.method1941(var17, var11.method2015());
               }

               ModelData var18 = null;
               ModelData[] var19 = this.aClass529_9381.aClass94Array_9318;
               synchronized(this.aClass529_9381.aClass94Array_9318) {
                  for(int var20 = 0; var20 < var14; ++var20) {
                     CacheDataUnpacker var21 = this.aClass529_9381.aCacheUnpacker_9310;
                     synchronized(this.aClass529_9381.aCacheUnpacker_9310) {
                        var18 = ModelData.createModelUnpacker(this.aClass529_9381.aCacheUnpacker_9310, var29[var20], 0);
                     }

                     if(null == var18) {
                        return null;
                     }

                     if(var18.anInt_1848 < 13) {
                        var18.method1229(2);
                     }

                     if(var14 > 1) {
                        this.aClass529_9381.aClass94Array_9318[var20] = var18;
                     }
                  }

                  if(var14 > 1) {
                     var18 = new ModelData(this.aClass529_9381.aClass94Array_9318, var14);
                  }
               }

               var11 = var1.createModel(var18, var17, this.aClass529_9381.anInt_9319 * -1520328639, var7, var8);
               CacheNodeArrayList var33 = this.aClass529_9381.aClass627_9306;
               synchronized(this.aClass529_9381.aClass627_9306) {
                  this.aClass529_9381.aClass627_9306.insert(var11, var15);
               }
            }
         }
      }

      if(null == var11) {
         return null;
      } else {
         Model var31 = var11.copy((byte)0, var2, true);
         if(var7 != var11.method2046()) {
            var31.method2044(var7);
         }

         if(var8 != var11.method2047()) {
            var31.method2028(var8);
         }

         if(var10) {
            var31.method2021();
         }

         if(Class495.aClass495_9044.anInt_9062 * -1965975883 == var3 && var4 > 3) {
            var31.method2055(2048);
            var31.offset(180, 0, -180);
         }

         var4 &= 3;
         if(var4 == 1) {
            var31.method2055(4096);
         } else if(var4 == 2) {
            var31.method2055(8192);
         } else if(var4 == 3) {
            var31.method2055(12288);
         }

         short[] var30;
         if(null != this.aShortArray_9428) {
            if(var5 != null && null != var5.aShortArray_9334) {
               var30 = var5.aShortArray_9334;
            } else {
               var30 = this.aShortArray_9368;
            }

            for(var14 = 0; var14 < this.aShortArray_9428.length; ++var14) {
               if(null != this.aByteArray_9366 && var14 < this.aByteArray_9366.length) {
                  var31.method2030(this.aShortArray_9428[var14], aShortArray_9419[this.aByteArray_9366[var14] & 255]);
               } else {
                  var31.method2030(this.aShortArray_9428[var14], var30[var14]);
               }
            }
         }

         if(null != this.aShortArray_9362) {
            if(var5 != null && null != var5.aShortArray_9337) {
               var30 = var5.aShortArray_9337;
            } else {
               var30 = this.aShortArray_9375;
            }

            for(var14 = 0; var14 < this.aShortArray_9362.length; ++var14) {
               var31.method2035(this.aShortArray_9362[var14], var30[var14]);
            }
         }

         if(0 != this.aByte_9376) {
            var31.method2049(this.aByte_9373, this.aByte_9374, this.aByte_9389, this.aByte_9376 & 255);
         }

         if(this.anInt_9402 * -1455067191 != 128 || 128 != 1486366213 * this.anInt_9403 || -9956253 * this.anInt_9378 != 128) {
            var31.method2012(-1455067191 * this.anInt_9402, 1486366213 * this.anInt_9403, this.anInt_9378 * -9956253);
         }

         if(0 != -250904455 * this.anInt_9361 || 0 != this.anInt_9406 * 697220587 || 0 != this.anInt_9407 * 1831385417) {
            var31.offset(-250904455 * this.anInt_9361, 697220587 * this.anInt_9406, this.anInt_9407 * 1831385417);
         }

         var31.method2042(var9);
         return var31;
      }
   }

   public final Class534 method6048(Class185 var1, Class184 var2, int var3) {
      int var4 = -1;
      if(this.anInt_9416 * 288561529 != -1) {
         Class416 var5 = var1.method2280(this.anInt_9416 * 288561529, (byte)-21);
         if(null != var5) {
            var4 = var2.method2268(var5, 524366739);
         }
      } else if(-1977639391 * this.anInt_9417 != -1) {
         Class187 var6 = var1.method2281(Class283.aClass283_4785, this.anInt_9417 * -1977639391, -1599524226);
         if(null != var6) {
            var4 = var2.method2269(var6, -390483690);
         }
      }

      if(var4 >= 0 && var4 < this.anIntArray_9415.length - 1) {
         return -1 == this.anIntArray_9415[var4]?null:this.aClass529_9381.method6015(this.anIntArray_9415[var4], (byte)1);
      } else {
         int var7 = this.anIntArray_9415[this.anIntArray_9415.length - 1];
         return var7 != -1?this.aClass529_9381.method6015(var7, (byte)1):null;
      }
   }

   public boolean method6049(int var1) {
      return this.anIntArray_9369 != null && this.anIntArray_9369.length > 1;
   }

   public int method6050(int var1) {
      if(this.anIntArray_9369 != null) {
         if(this.anIntArray_9369.length <= 1) {
            return this.anIntArray_9369[0];
         }

         int var2 = (int)(Math.random() * 65535.0D);

         for(int var3 = 0; var3 < this.anIntArray_9369.length; ++var3) {
            if(var2 <= this.anIntArray_9388[var3]) {
               return this.anIntArray_9369[var3];
            }

            var2 -= this.anIntArray_9388[var3];
         }
      }

      return -1;
   }

   public int[] method6051(byte var1) {
      return this.anIntArray_9369;
   }

   public boolean method6052(int var1, short var2) {
      if(this.anIntArray_9369 != null && var1 != -1) {
         for(int var3 = 0; var3 < this.anIntArray_9369.length; ++var3) {
            if(this.anIntArray_9369[var3] == var1) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean method6053(short var1) {
      return this.anIntArray_9369 != null;
   }

   public int method6054(int var1, int var2, int var3) {
      if(this.aNodeArrayList_9405 == null) {
         return var2;
      } else {
         IndexNode var4 = (IndexNode)this.aNodeArrayList_9405.getNode((long)var1);
         return var4 == null?var2:var4.cacheID * 523939595;
      }
   }

   public int method6055(int var1, byte var2) {
      return this.anIntArray_9394 == null?-1:this.anIntArray_9394[var1];
   }

   public final boolean method6056(Class580 var1, short var2) {
      if(this.anIntArrayArray_9359 == null) {
         return true;
      } else {
         boolean var3 = true;
         CacheDataUnpacker var4 = this.aClass529_9381.aCacheUnpacker_9310;
         synchronized(this.aClass529_9381.aCacheUnpacker_9310) {
            for(int var5 = 0; var5 < this.anIntArrayArray_9359.length; ++var5) {
               for(int var6 = 0; var6 < this.anIntArrayArray_9359[var5].length; ++var6) {
                  boolean var7 = this.aClass529_9381.aCacheUnpacker_9310.method3568(this.anIntArrayArray_9359[var5][var6], 0, -1733610114);
                  var3 &= var7;
                  if(!var7) {
                     var1.anInt_9703 = this.anIntArrayArray_9359[var5][var6] * 852119785;
                  }
               }
            }

            return var3;
         }
      }
   }

   public String method6057(int var1, String var2, int var3) {
      if(null == this.aNodeArrayList_9405) {
         return var2;
      } else {
         Class240_Sub9 var4 = (Class240_Sub9)this.aNodeArrayList_9405.getNode((long)var1);
         return null == var4?var2:(String)var4.anObject_6783;
      }
   }

   public boolean method6058(byte var1) {
      if(null == this.anIntArray_9415) {
         return 1976723091 * this.anInt_9418 != -1 || null != this.anIntArray_9425;
      } else {
         for(int var2 = 0; var2 < this.anIntArray_9415.length; ++var2) {
            if(this.anIntArray_9415[var2] != -1) {
               Class534 var3 = this.aClass529_9381.method6015(this.anIntArray_9415[var2], (byte)1);
               if(-1 != 1976723091 * var3.anInt_9418 || var3.anIntArray_9425 != null) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   static final void method6059(long var0) {
      int var2 = -1782602441 * client.anInt_385;
      int var3 = client.anInt_534 * -1112038629;
      int var4;
      int var5;
      if(Class326.anInt_6334 * 1890624197 != var2) {
         var4 = var2 - Class326.anInt_6334 * 1890624197;
         var5 = (int)(var0 * (long)var4 / 320L);
         if(var4 > 0) {
            if(var5 == 0) {
               var5 = 1;
            } else if(var5 > var4) {
               var5 = var4;
            }
         } else if(0 == var5) {
            var5 = -1;
         } else if(var5 < var4) {
            var5 = var4;
         }

         Class326.anInt_6334 += var5 * 104107021;
      }

      if(var3 != Class349.anInt_6617 * -1205230297) {
         var4 = var3 - -1205230297 * Class349.anInt_6617;
         var5 = (int)(var0 * (long)var4 / 320L);
         if(var4 > 0) {
            if(0 == var5) {
               var5 = 1;
            } else if(var5 > var4) {
               var5 = var4;
            }
         } else if(0 == var5) {
            var5 = -1;
         } else if(var5 < var4) {
            var5 = var4;
         }

         Class349.anInt_6617 += -1773307241 * var5;
      }

      client.aFloat_501 += client.aFloat_389 * (float)var0 / 40.0F * 8.0F;
      client.aFloat_387 += client.aFloat_390 * (float)var0 / 40.0F * 8.0F;
      Class509.method5913((byte)11);
   }
}
