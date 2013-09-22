import java.util.Arrays;

public class NPCComposite {

   public int anInt_8606 = 458274829;
   public static short[] aShortArray_8607 = new short[256];
   public int anInt_8608 = -1448459667;
   public int modelID;
   short[] aShortArray_8610;
   public byte[] aByteArray_8611;
   NPCUnpacker npcUnpacker;
   public String name = "null";
   int[][] anIntArrayArray_8614;
   short[] aShortArray_8615;
   byte aByte_8616 = 0;
   public short[] aShortArray_8617;
   byte[] aByteArray_8618;
   public byte aByte_8619;
   public short[] aShortArray_8620;
   public Class536 aClass536_8621;
   public int anInt_8622;
   byte aByte_8623;
   byte aByte_8624;
   byte aByte_8625;
   public static final int anInt_8626 = 1;
   public String[] optionsArray;
   int[] anIntArray_8628;
   public int attackOption = -1987886001;
   public boolean aBoolean_8630 = true;
   public int anInt_8631 = 833654759;
   int anInt_8632 = -497574272;
   int anInt_8633 = -1547533952;
   public boolean aBoolean_8634 = false;
   public byte aByte_8635 = -16;
   public boolean aBoolean_8636 = false;
   int anInt_8637 = 0;
   int anInt_8638 = 0;
   public int anInt_8639 = 1841065875;
   public int anInt_8640 = 1429042769;
   public int[] anIntArray_8641;
   public int[] anIntArray_8642;
   int anInt_8643 = -604394373;
   int anInt_8644 = 1870153885;
   public int anInt_8645;
   public boolean aBoolean_8646 = true;
   public boolean aBoolean_8647 = true;
   public short aShort_8648 = 0;
   public short aShort_8649 = 0;
   public byte aByte_8650 = -96;
   public boolean aBoolean_8651 = true;
   public boolean aBoolean_8652;
   public boolean aBoolean_8653 = false;
   public static final int anInt_8654 = 2;
   public int[] anIntArray_8655;
   public int anInt_8656 = 0;
   public byte[] aByteArray_8657;
   public int anInt_8658 = -802857611;
   public int anInt_8659 = 0;
   public int anInt_8660 = 718593824;
   public int anInt_8661 = -839441103;
   public boolean aBoolean_8662;
   NodeArrayList aNodeArrayList_8663;
   public int anInt_8664 = 1730083625;
   public int anInt_8665 = -1534636695;
   public int anInt_8666 = 963379383;
   public int[] anIntArray_8667;
   static final int anInt_8668 = 6;
   public int anInt_8669;
   public int anInt_8670;
   public byte aByte_8671 = 0;
   public int anInt_8672;
   public int anInt_8673 = -313133197;


   public String method5594(int var1, String var2, byte var3) {
      if(this.aNodeArrayList_8663 == null) {
         return var2;
      } else {
         Class240_Sub9 var4 = (Class240_Sub9)this.aNodeArrayList_8663.getNode((long)var1);
         return null == var4?var2:(String)var4.anObject_6783;
      }
   }

   NPCComposite() {
      this.aClass536_8621 = Class536.aClass536_9446;
      this.anInt_8645 = 782754951;
      this.aByte_8619 = -1;
      this.anInt_8669 = -1180785843;
      this.anInt_8670 = -238321408;
      this.anInt_8622 = -1286456064;
      this.anInt_8672 = 0;
      this.aBoolean_8652 = true;
   }

   public final Model method5595(Renderer var1, int var2, Class255 var3, Class185 var4, Class184 var5, Animator var6, Animator var7, Animator[] var8, int[] var9, int var10, Class442 var11, int var12, boolean var13, byte var14) {
      if(null != this.anIntArray_8642) {
         NPCComposite var40 = this.method5599(var4, var5, (byte)-118);
         return null == var40?null:var40.method5595(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, (byte)-87);
      } else {
         int var15 = var2;
         if(this.anInt_8633 * 1054018987 != 128) {
            var15 = var2 | 2;
         }

         if(-1305599979 * this.anInt_8632 != 128) {
            var15 |= 5;
         }

         boolean var16 = false;
         int var17 = null != var8?var8.length:0;

         for(int var18 = 0; var18 < var17; ++var18) {
            if(null != var8[var18]) {
               var15 |= var8[var18].getFlags((short)22909);
               var16 = true;
            }
         }

         if(null != var6) {
            var15 |= var6.getFlags((short)18659);
            var16 = true;
         }

         if(null != var7) {
            var15 |= var7.getFlags((short)5089);
            var16 = true;
         }

         long var19 = (long)(this.modelID * 646032317 | var1.rendererID * -1555911463 << 16);
         if(null != var11) {
            var19 |= var11.aLong_8440 * -5912954284790918523L << 24;
         }

         CacheNodeArrayList var21 = this.npcUnpacker.aClass627_8733;
         Model var22;
         synchronized(this.npcUnpacker.aClass627_8733) {
            var22 = (Model)this.npcUnpacker.aClass627_8733.getObject(var19);
         }

         Class263 var41 = null;
         if(!var13 && var12 != -1) {
            var41 = var3.method3343(var12, 1516291115);
         } else if(-1 != this.anInt_8608 * -164370277) {
            var41 = var3.method3343(this.anInt_8608 * -164370277, 1516291115);
         }

         int var27;
         if(var22 == null || (var22.method2015() & var15) != var15) {
            if(var22 != null) {
               var15 |= var22.method2015();
            }

            int var23 = var15;
            if(null != this.aShortArray_8615) {
               var23 = var15 | 16384;
            }

            if(this.aShortArray_8610 != null) {
               var23 |= '\u8000';
            }

            if(this.aByte_8616 != 0) {
               var23 |= 524288;
            }

            int[] var24 = var11 != null && var11.anIntArray_8439 != null?var11.anIntArray_8439:this.anIntArray_8655;
            boolean var25 = false;
            CacheDataUnpacker var26 = this.npcUnpacker.aCacheUnpacker_8730;
            synchronized(this.npcUnpacker.aCacheUnpacker_8730) {
               for(var27 = 0; var27 < var24.length; ++var27) {
                  if(-1 != var24[var27] && !this.npcUnpacker.aCacheUnpacker_8730.method3568(var24[var27], 0, 1320311151)) {
                     var25 = true;
                  }
               }
            }

            if(var25) {
               return null;
            }

            ModelData[] var45 = new ModelData[var24.length];

            int var28;
            for(var28 = 0; var28 < var24.length; ++var28) {
               if(var24[var28] != -1) {
                  CacheDataUnpacker var29 = this.npcUnpacker.aCacheUnpacker_8730;
                  synchronized(this.npcUnpacker.aCacheUnpacker_8730) {
                     var45[var28] = ModelData.createModelUnpacker(this.npcUnpacker.aCacheUnpacker_8730, var24[var28], 0);
                  }

                  if(var45[var28] != null) {
                     if(var45[var28].anInt_1848 < 13) {
                        var45[var28].method1229(2);
                     }

                     if(this.anIntArrayArray_8614 != null && this.anIntArrayArray_8614[var28] != null) {
                        var45[var28].offset(this.anIntArrayArray_8614[var28][0], this.anIntArrayArray_8614[var28][1], this.anIntArrayArray_8614[var28][2]);
                     }
                  }
               }
            }

            int var51;
            if(var41 != null && null != var41.viewportData) {
               for(var28 = 0; var28 < var41.viewportData.length; ++var28) {
                  if(var28 < var45.length && null != var45[var28]) {
                     var51 = 0;
                     int var30 = 0;
                     int var31 = 0;
                     int var32 = 0;
                     int var33 = 0;
                     int var34 = 0;
                     if(var41.viewportData[var28] != null) {
                        var51 = var41.viewportData[var28][0];
                        var30 = var41.viewportData[var28][1];
                        var31 = var41.viewportData[var28][2];
                        var32 = var41.viewportData[var28][3] << 3;
                        var33 = var41.viewportData[var28][4] << 3;
                        var34 = var41.viewportData[var28][5] << 3;
                     }

                     if(0 != var32 || var33 != 0 || 0 != var34) {
                        var45[var28].method1228(var32, var33, var34);
                     }

                     if(0 != var51 || var30 != 0 || 0 != var31) {
                        var45[var28].offset(var51, var30, var31);
                     }
                  }
               }
            }

            ModelData var46;
            if(1 == var45.length) {
               var46 = var45[0];
            } else {
               var46 = new ModelData(var45, var45.length);
            }

            var22 = var1.createModel(var46, var23, this.npcUnpacker.anInt_8735 * 148382231, 64 + -899397047 * this.anInt_8637, 850 + this.anInt_8638 * -1972936321);
            short[] var50;
            if(this.aShortArray_8615 != null) {
               if(null != var11 && var11.aShortArray_8441 != null) {
                  var50 = var11.aShortArray_8441;
               } else {
                  var50 = this.aShortArray_8617;
               }

               for(var51 = 0; var51 < this.aShortArray_8615.length; ++var51) {
                  if(this.aByteArray_8618 != null && var51 < this.aByteArray_8618.length) {
                     var22.method2030(this.aShortArray_8615[var51], aShortArray_8607[this.aByteArray_8618[var51] & 255]);
                  } else {
                     var22.method2030(this.aShortArray_8615[var51], var50[var51]);
                  }
               }
            }

            if(null != this.aShortArray_8610) {
               if(var11 != null && var11.aShortArray_8442 != null) {
                  var50 = var11.aShortArray_8442;
               } else {
                  var50 = this.aShortArray_8620;
               }

               for(var51 = 0; var51 < this.aShortArray_8610.length; ++var51) {
                  var22.method2035(this.aShortArray_8610[var51], var50[var51]);
               }
            }

            if(0 != this.aByte_8616) {
               var22.method2049(this.aByte_8623, this.aByte_8624, this.aByte_8625, this.aByte_8616 & 255);
            }

            var22.method2042(var15);
            CacheNodeArrayList var49 = this.npcUnpacker.aClass627_8733;
            synchronized(this.npcUnpacker.aClass627_8733) {
               this.npcUnpacker.aClass627_8733.insert(var22, var19);
            }
         }

         Model var42 = var22.copy((byte)4, var15, true);
         boolean var44 = false;
         if(null != var9) {
            for(int var43 = 0; var43 < 12; ++var43) {
               if(var9[var43] != -1) {
                  var44 = true;
               }
            }
         }

         if(!var16 && !var44) {
            return var42;
         } else {
            Viewport[] var47 = null;
            if(null != var41) {
               var47 = var41.genViewports((byte)111);
            }

            int var48;
            if(var44 && null != var47) {
               for(var48 = 0; var48 < 12; ++var48) {
                  if(null != var47[var48]) {
                     var42.applyViewport(var47[var48], 1 << var48, true);
                  }
               }
            }

            var48 = 0;

            for(var27 = 1; var48 < var17; var27 <<= 1) {
               if(null != var8[var48]) {
                  var8[var48].method5890(var42, 0, var27, (byte)-74);
               }

               ++var48;
            }

            if(var44) {
               for(var48 = 0; var48 < 12; ++var48) {
                  if(var9[var48] != -1) {
                     var27 = var9[var48] - var10;
                     var27 &= 16383;
                     Viewport var52 = new Viewport();
                     var52.rotate(0.0F, 1.0F, 0.0F, Class362.toRadians(var27));
                     var42.applyViewport(var52, 1 << var48, false);
                  }
               }
            }

            if(var44 && null != var47) {
               for(var48 = 0; var48 < 12; ++var48) {
                  if(null != var47[var48]) {
                     var42.applyViewport(var47[var48], 1 << var48, false);
                  }
               }
            }

            if(null != var6 && null != var7) {
               RandomAccessFileNode.method5763(var42, var6, var7, -1926950185);
            } else if(null != var6) {
               var6.applyToModel(var42, 0, 827679769);
            } else if(null != var7) {
               var7.applyToModel(var42, 0, -1928450536);
            }

            if(this.anInt_8632 * -1305599979 != 128 || 128 != 1054018987 * this.anInt_8633) {
               var42.method2012(-1305599979 * this.anInt_8632, this.anInt_8633 * 1054018987, -1305599979 * this.anInt_8632);
            }

            var42.method2042(var2);
            return var42;
         }
      }
   }

   public final Model method5596(Renderer var1, int var2, Class185 var3, Class184 var4, Animator var5, Class442 var6, byte var7) {
      if(null != this.anIntArray_8642) {
         NPCComposite var24 = this.method5599(var3, var4, (byte)-107);
         return null == var24?null:var24.method5596(var1, var2, var3, var4, var5, var6, (byte)-66);
      } else if(this.anIntArray_8641 == null && (var6 == null || null == var6.anIntArray_8439)) {
         return null;
      } else {
         int var8 = var2;
         if(var5 != null) {
            var8 = var2 | var5.getFlags((short)-13066);
         }

         long var9 = (long)(646032317 * this.modelID | var1.rendererID * -1555911463 << 16);
         if(null != var6) {
            var9 |= -5912954284790918523L * var6.aLong_8440 << 24;
         }

         CacheNodeArrayList var11 = this.npcUnpacker.aClass627_8734;
         Model var12;
         synchronized(this.npcUnpacker.aClass627_8734) {
            var12 = (Model)this.npcUnpacker.aClass627_8734.getObject(var9);
         }

         if(null == var12 || (var12.method2015() & var8) != var8) {
            if(var12 != null) {
               var8 |= var12.method2015();
            }

            int var25 = var8;
            if(this.aShortArray_8615 != null) {
               var25 = var8 | 16384;
            }

            if(null != this.aShortArray_8610) {
               var25 |= '\u8000';
            }

            if(this.aByte_8616 != 0) {
               var25 |= 524288;
            }

            int[] var13 = var6 != null && null != var6.anIntArray_8439?var6.anIntArray_8439:this.anIntArray_8641;
            boolean var14 = false;
            CacheDataUnpacker var15 = this.npcUnpacker.aCacheUnpacker_8730;
            int var16;
            synchronized(this.npcUnpacker.aCacheUnpacker_8730) {
               for(var16 = 0; var16 < var13.length; ++var16) {
                  if(!this.npcUnpacker.aCacheUnpacker_8730.method3568(var13[var16], 0, -1176901735)) {
                     var14 = true;
                  }
               }
            }

            if(var14) {
               return null;
            }

            ModelData[] var26 = new ModelData[var13.length];
            CacheDataUnpacker var27 = this.npcUnpacker.aCacheUnpacker_8730;
            synchronized(this.npcUnpacker.aCacheUnpacker_8730) {
               for(int var17 = 0; var17 < var13.length; ++var17) {
                  var26[var17] = ModelData.createModelUnpacker(this.npcUnpacker.aCacheUnpacker_8730, var13[var17], 0);
               }
            }

            for(var16 = 0; var16 < var13.length; ++var16) {
               if(var26[var16] != null && var26[var16].anInt_1848 < 13) {
                  var26[var16].method1229(2);
               }
            }

            ModelData var28;
            if(1 == var26.length) {
               var28 = var26[0];
            } else {
               var28 = new ModelData(var26, var26.length);
            }

            var12 = var1.createModel(var28, var25, this.npcUnpacker.anInt_8735 * 148382231, 64, 768);
            int var18;
            short[] var29;
            if(null != this.aShortArray_8615) {
               if(var6 != null && null != var6.aShortArray_8441) {
                  var29 = var6.aShortArray_8441;
               } else {
                  var29 = this.aShortArray_8617;
               }

               for(var18 = 0; var18 < this.aShortArray_8615.length; ++var18) {
                  if(null != this.aByteArray_8618 && var18 < this.aByteArray_8618.length) {
                     var12.method2030(this.aShortArray_8615[var18], aShortArray_8607[this.aByteArray_8618[var18] & 255]);
                  } else {
                     var12.method2030(this.aShortArray_8615[var18], var29[var18]);
                  }
               }
            }

            if(this.aShortArray_8610 != null) {
               if(var6 != null && var6.aShortArray_8442 != null) {
                  var29 = var6.aShortArray_8442;
               } else {
                  var29 = this.aShortArray_8620;
               }

               for(var18 = 0; var18 < this.aShortArray_8610.length; ++var18) {
                  var12.method2035(this.aShortArray_8610[var18], var29[var18]);
               }
            }

            if(0 != this.aByte_8616) {
               var12.method2049(this.aByte_8623, this.aByte_8624, this.aByte_8625, this.aByte_8616 & 255);
            }

            var12.method2042(var8);
            CacheNodeArrayList var30 = this.npcUnpacker.aClass627_8734;
            synchronized(this.npcUnpacker.aClass627_8734) {
               this.npcUnpacker.aClass627_8734.insert(var12, var9);
            }
         }

         if(var5 != null) {
            var12 = var12.copy((byte)1, var8, true);
            var5.applyToModel(var12, 0, -399918663);
         }

         var12.method2042(var2);
         return var12;
      }
   }

   public final boolean method5597(int var1) {
      if(null == this.anIntArray_8655) {
         return true;
      } else {
         boolean var2 = true;
         int[] var3 = this.anIntArray_8655;

         for(int var4 = 0; var4 < var3.length; ++var4) {
            int var5 = var3[var4];
            if(!this.npcUnpacker.aCacheUnpacker_8730.method3568(var5, 0, 447464640)) {
               var2 = false;
            }
         }

         return var2;
      }
   }

   public int method5598(int var1, int var2, int var3) {
      if(this.aNodeArrayList_8663 == null) {
         return var2;
      } else {
         IndexNode var4 = (IndexNode)this.aNodeArrayList_8663.getNode((long)var1);
         return null == var4?var2:523939595 * var4.cacheID;
      }
   }

   public final NPCComposite method5599(Class185 var1, Class184 var2, byte var3) {
      int var4 = -1;
      if(-1 != 25734477 * this.anInt_8643) {
         Class416 var5 = var1.method2280(25734477 * this.anInt_8643, (byte)-1);
         if(var5 != null) {
            var4 = var2.method2268(var5, -1080510512);
         }
      } else if(562004555 * this.anInt_8644 != -1) {
         Class187 var6 = var1.method2281(Class283.aClass283_4785, 562004555 * this.anInt_8644, -2021898002);
         if(null != var6) {
            var4 = var2.method2269(var6, -390483690);
         }
      }

      if(var4 >= 0 && var4 < this.anIntArray_8642.length - 1) {
         return this.anIntArray_8642[var4] == -1?null:this.npcUnpacker.method5670(this.anIntArray_8642[var4], 2033567083);
      } else {
         int var7 = this.anIntArray_8642[this.anIntArray_8642.length - 1];
         return -1 != var7?this.npcUnpacker.method5670(var7, -111829698):null;
      }
   }

   public boolean method5600(Class185 var1, Class184 var2, int var3) {
      if(this.anIntArray_8642 == null) {
         return true;
      } else {
         int var4 = -1;
         if(-1 != 25734477 * this.anInt_8643) {
            Class416 var5 = var1.method2280(25734477 * this.anInt_8643, (byte)-35);
            if(null != var5) {
               var4 = var2.method2268(var5, -956631516);
            }
         } else if(562004555 * this.anInt_8644 != -1) {
            Class187 var6 = var1.method2281(Class283.aClass283_4785, 562004555 * this.anInt_8644, -1946764133);
            if(null != var6) {
               var4 = var2.method2269(var6, -390483690);
            }
         }

         if(var4 >= 0 && var4 < this.anIntArray_8642.length - 1) {
            return this.anIntArray_8642[var4] != -1;
         } else {
            int var7 = this.anIntArray_8642[this.anIntArray_8642.length - 1];
            return var7 != -1;
         }
      }
   }

   public boolean method5601(int var1) {
      if(this.anIntArray_8642 == null) {
         return -1 != this.anInt_8606 * 809085243 || this.anInt_8666 * -1342364935 != -1 || -1 != -67160797 * this.anInt_8658;
      } else {
         for(int var2 = 0; var2 < this.anIntArray_8642.length; ++var2) {
            if(this.anIntArray_8642[var2] != -1) {
               NPCComposite var3 = this.npcUnpacker.method5670(this.anIntArray_8642[var2], 544798686);
               if(var3.anInt_8606 * 809085243 != -1 || -1342364935 * var3.anInt_8666 != -1 || var3.anInt_8658 * -67160797 != -1) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   public final Model method5602(Renderer var1, int var2, Class255 var3, Class185 var4, Class184 var5, Animator var6, Animator var7, Animator[] var8, int[] var9, int var10, Class442 var11, int var12) {
      return this.method5595(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, this.anInt_8608 * -164370277, true, (byte)-46);
   }

   void method5603(int var1) {
      if(this.anIntArray_8655 == null) {
         this.anIntArray_8655 = new int[0];
      }

      if(-1 == this.aByte_8619) {
         if(GamePack.runescapePack == this.npcUnpacker.gamePack) {
            this.aByte_8619 = 1;
         } else {
            this.aByte_8619 = 0;
         }
      }

   }

   void method5604(ByteArrayDataNode var1, int var2, int var3) {
      int var4;
      int var5;
      if(1 == var2) {
         var4 = var1.readByte(2092307385);
         this.anIntArray_8655 = new int[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.anIntArray_8655[var5] = var1.method4493(-157074556);
         }
      } else if(var2 == 2) {
         this.name = var1.method4485(112394514);
      } else if(12 == var2) {
         this.anInt_8665 = var1.readByte(-178252115) * -1534636695;
      } else if(var2 >= 30 && var2 < 35) {
         this.optionsArray[var2 - 30] = var1.method4485(1595417013);
      } else if(40 == var2) {
         var4 = var1.readByte(-48837748);
         this.aShortArray_8615 = new short[var4];
         this.aShortArray_8617 = new short[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.aShortArray_8615[var5] = (short)var1.readShort(-329032253);
            this.aShortArray_8617[var5] = (short)var1.readShort(-1112090227);
         }
      } else if(var2 == 41) {
         var4 = var1.readByte(512186080);
         this.aShortArray_8610 = new short[var4];
         this.aShortArray_8620 = new short[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.aShortArray_8610[var5] = (short)var1.readShort(547672687);
            this.aShortArray_8620[var5] = (short)var1.readShort(1403466570);
         }
      } else if(42 == var2) {
         var4 = var1.readByte(-907324340);
         this.aByteArray_8618 = new byte[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.aByteArray_8618[var5] = var1.getByte((byte)119);
         }
      } else {
         int var6;
         int var7;
         byte var9;
         if(44 == var2) {
            var4 = var1.readShort(-1136187891);
            var5 = 0;

            for(var6 = var4; var6 > 0; var6 >>= 1) {
               ++var5;
            }

            this.aByteArray_8657 = new byte[var5];
            var9 = 0;

            for(var7 = 0; var7 < var5; ++var7) {
               if((var4 & 1 << var7) > 0) {
                  this.aByteArray_8657[var7] = var9++;
               } else {
                  this.aByteArray_8657[var7] = -1;
               }
            }
         } else if(var2 == 45) {
            var4 = var1.readShort(77747107);
            var5 = 0;

            for(var6 = var4; var6 > 0; var6 >>= 1) {
               ++var5;
            }

            this.aByteArray_8611 = new byte[var5];
            var9 = 0;

            for(var7 = 0; var7 < var5; ++var7) {
               if((var4 & 1 << var7) > 0) {
                  this.aByteArray_8611[var7] = var9++;
               } else {
                  this.aByteArray_8611[var7] = -1;
               }
            }
         } else if(var2 == 60) {
            var4 = var1.readByte(-611618475);
            this.anIntArray_8641 = new int[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.anIntArray_8641[var5] = var1.method4493(-157074556);
            }
         } else if(var2 == 93) {
            this.aBoolean_8630 = false;
         } else if(95 == var2) {
            this.anInt_8631 = var1.readShort(-1134798043) * -833654759;
         } else if(var2 == 97) {
            this.anInt_8632 = var1.readShort(942461377) * 1740943165;
         } else if(98 == var2) {
            this.anInt_8633 = var1.readShort(469596335) * 2034730243;
         } else if(99 == var2) {
            this.aBoolean_8634 = true;
         } else if(var2 == 100) {
            this.anInt_8637 = var1.getByte((byte)96) * 554551289;
         } else if(var2 == 101) {
            this.anInt_8638 = var1.getByte((byte)40) * 7329915;
         } else if(102 == var2) {
            this.anInt_8639 = var1.readShort(81886340) * -1841065875;
         } else if(var2 == 103) {
            this.anInt_8660 = var1.readShort(-203901603) * -648632583;
         } else if(106 != var2 && 118 != var2) {
            if(107 == var2) {
               this.aBoolean_8651 = false;
            } else if(var2 == 109) {
               this.aBoolean_8646 = false;
            } else if(var2 == 111) {
               this.aBoolean_8647 = false;
            } else if(113 == var2) {
               this.aShort_8648 = (short)var1.readShort(1911653758);
               this.aShort_8649 = (short)var1.readShort(-212875388);
            } else if(var2 == 114) {
               this.aByte_8650 = var1.getByte((byte)86);
               this.aByte_8635 = var1.getByte((byte)30);
            } else if(var2 == 119) {
               this.aByte_8671 = var1.getByte((byte)103);
            } else if(var2 == 121) {
               this.anIntArrayArray_8614 = new int[this.anIntArray_8655.length][];
               var4 = var1.readByte(229969164);

               for(var5 = 0; var5 < var4; ++var5) {
                  var6 = var1.readByte(694779961);
                  int[] var10 = this.anIntArrayArray_8614[var6] = new int[3];
                  var10[0] = var1.getByte((byte)103);
                  var10[1] = var1.getByte((byte)101);
                  var10[2] = var1.getByte((byte)107);
               }
            } else if(var2 == 123) {
               this.anInt_8664 = var1.readShort(907332115) * -1730083625;
            } else if(125 == var2) {
               this.aClass536_8621 = (Class536)Class559.method6185(Class276.method3610(1182022670), var1.getByte((byte)64), (byte)37);
            } else if(127 == var2) {
               this.anInt_8608 = var1.readShort(1724065908) * 1448459667;
            } else if(128 == var2) {
               Class559.method6185(Class12.method70((byte)16), var1.readByte(-716983783), (byte)3);
            } else if(var2 == 134) {
               this.anInt_8606 = var1.readShort(193286125) * -458274829;
               if('\uffff' == 809085243 * this.anInt_8606) {
                  this.anInt_8606 = 458274829;
               }

               this.anInt_8673 = var1.readShort(1603184293) * 313133197;
               if(-1550124475 * this.anInt_8673 == '\uffff') {
                  this.anInt_8673 = -313133197;
               }

               this.anInt_8666 = var1.readShort(1251374539) * -963379383;
               if(this.anInt_8666 * -1342364935 == '\uffff') {
                  this.anInt_8666 = 963379383;
               }

               this.anInt_8658 = var1.readShort(1187052623) * 802857611;
               if('\uffff' == -67160797 * this.anInt_8658) {
                  this.anInt_8658 = -802857611;
               }

               this.anInt_8659 = var1.readByte(2030027357) * 1549721045;
            } else if(var2 != 135 && var2 != 136) {
               if(var2 == 137) {
                  this.attackOption = var1.readShort(-619385831) * 1987886001;
               } else if(var2 == 138) {
                  this.anInt_8640 = var1.method4493(-157074556) * -1429042769;
               } else if(140 == var2) {
                  this.anInt_8661 = var1.readByte(1222940967) * -458053169;
               } else if(var2 == 141) {
                  this.aBoolean_8636 = true;
               } else if(var2 == 142) {
                  this.anInt_8645 = var1.readShort(1502823493) * -782754951;
               } else if(var2 == 143) {
                  this.aBoolean_8653 = true;
               } else if(var2 >= 150 && var2 < 155) {
                  this.optionsArray[var2 - 150] = var1.method4485(-182774496);
                  if(!this.npcUnpacker.aBoolean_8728) {
                     this.optionsArray[var2 - 150] = null;
                  }
               } else if(var2 == 155) {
                  this.aByte_8623 = var1.getByte((byte)76);
                  this.aByte_8624 = var1.getByte((byte)27);
                  this.aByte_8625 = var1.getByte((byte)24);
                  this.aByte_8616 = var1.getByte((byte)111);
               } else if(var2 == 158) {
                  this.aByte_8619 = 1;
               } else if(var2 == 159) {
                  this.aByte_8619 = 0;
               } else if(160 == var2) {
                  var4 = var1.readByte(730397555);
                  this.anIntArray_8667 = new int[var4];

                  for(var5 = 0; var5 < var4; ++var5) {
                     this.anIntArray_8667[var5] = var1.readShort(-836713232);
                  }
               } else if(var2 == 162) {
                  this.aBoolean_8662 = true;
               } else if(163 == var2) {
                  this.anInt_8669 = var1.readByte(156973703) * 1180785843;
               } else if(var2 == 164) {
                  this.anInt_8670 = var1.readShort(624829643) * 737266561;
                  this.anInt_8622 = var1.readShort(828693041) * -206351811;
               } else if(165 == var2) {
                  this.anInt_8672 = var1.readByte(1046475743) * -2137644121;
               } else if(var2 == 168) {
                  this.anInt_8656 = var1.readByte(-396783841) * -1988800299;
               } else if(var2 == 169) {
                  this.aBoolean_8652 = false;
               } else if(var2 >= 170 && var2 < 176) {
                  if(this.anIntArray_8628 == null) {
                     this.anIntArray_8628 = new int[6];
                     Arrays.fill(this.anIntArray_8628, -1);
                  }

                  var4 = var1.readShort(561138951);
                  if('\uffff' == var4) {
                     var4 = -1;
                  }

                  this.anIntArray_8628[var2 - 170] = var4;
               } else if(var2 != 178 && var2 == 249) {
                  var4 = var1.readByte(1637515373);
                  if(this.aNodeArrayList_8663 == null) {
                     var5 = Class105.method1359(var4, (byte)124);
                     this.aNodeArrayList_8663 = new NodeArrayList(var5);
                  }

                  for(var5 = 0; var5 < var4; ++var5) {
                     boolean var11 = var1.readByte(535028380) == 1;
                     var7 = var1.method4479(738776218);
                     Object var8;
                     if(var11) {
                        var8 = new Class240_Sub9(var1.method4485(-1272861616));
                     } else {
                        var8 = new IndexNode(var1.method4480(1260717178));
                     }

                     this.aNodeArrayList_8663.insert((NodeListNode)var8, (long)var7);
                  }
               }
            } else {
               var1.readByte(2007723299);
               var1.readShort(-632275556);
            }
         } else {
            this.anInt_8643 = var1.readShort(-447712126) * 604394373;
            if('\uffff' == this.anInt_8643 * 25734477) {
               this.anInt_8643 = -604394373;
            }

            this.anInt_8644 = var1.readShort(1485585477) * -1870153885;
            if(562004555 * this.anInt_8644 == '\uffff') {
               this.anInt_8644 = 1870153885;
            }

            var4 = -1;
            if(var2 == 118) {
               var4 = var1.readShort(827775197);
               if('\uffff' == var4) {
                  var4 = -1;
               }
            }

            var5 = var1.readByte(1442952313);
            this.anIntArray_8642 = new int[var5 + 2];

            for(var6 = 0; var6 <= var5; ++var6) {
               this.anIntArray_8642[var6] = var1.readShort(-581205978);
               if(this.anIntArray_8642[var6] == '\uffff') {
                  this.anIntArray_8642[var6] = -1;
               }
            }

            this.anIntArray_8642[var5 + 1] = var4;
         }
      }

   }

   void method5605(ByteArrayDataNode var1, byte var2) {
      while(true) {
         int var3 = var1.readByte(1279832547);
         if(var3 == 0) {
            return;
         }

         this.method5604(var1, var3, -1777253060);
      }
   }

   public int method5606(int var1, byte var2) {
      return this.anIntArray_8628 == null?-1:this.anIntArray_8628[var1];
   }

   static final void method5607(RSInterfaceData var0, int var1) throws Exception_Sub1 {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      Class542.aClass43_Sub1_9475.method351(Class111.method1420(var2, (byte)0), true, 775120310);
   }

   static final void method5608(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      Class636.method6717(var3, var4, var0, (byte)72);
   }

   static final void method5609(RSInterfaceData var0, byte var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = -212594931 * var0.aClass68_9508.anInt_1297;
   }
}
