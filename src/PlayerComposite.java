
public class PlayerComposite {

   static CacheNodeArrayList playerModelCache = new CacheNodeArrayList(5);
   public static final int anInt_9843 = Integer.MIN_VALUE;
   static final int anInt_9844 = 1073741823;
   public int anInt_9845 = -1106341583;
   int[] equipmentIDs;
   Class459[] aClass459Array_9847;
   public int[] anIntArray_9848;
   int anInt_9849;
   static final int[] anIntArray_9850 = new int[]{8, 11, 4, 6, 9, 7, 10, 0};
   long identifier;
   public boolean aBoolean_9852;
   public static short[][] aShortArrayArray_9853;
   public static short[][][] aShortArrayArrayArray_9854;
   static CacheNodeArrayList longTermPlayerCache = new CacheNodeArrayList(260);
   long aLong_9856;
   public static final int anInt_9857 = 1073741824;
   public static Class530 aClass530_9858;


   public void method6448(int var1, int var2, Class71 var3, int var4) {
      int var5 = anIntArray_9850[var1];
      if(var3.method818(var2, 6854909) != null) {
         this.equipmentIDs[var5] = var2 | Integer.MIN_VALUE;
         this.update();
      }
   }

   public void method6449(int var1, int var2, byte var3) {
      this.anIntArray_9848[var1] = var2;
      this.update();
   }

   public void method6450(boolean var1, int var2) {
      this.aBoolean_9852 = var1;
      this.update();
   }

   public void equip(int var1, int var2, CacheObjectLoader var3) {
      if(-1 == var2) {
         this.equipmentIDs[var1] = 0;
      } else {
         if(var3.getObjectDescriptor(var2) == null) {
            return;
         }

         this.equipmentIDs[var1] = var2 | 1073741824;
         this.update();
      }

   }

   public Model getModel(Renderer var1, int flags, Class255 var3, Class71 var4, NPCUnpacker var5, CacheObjectLoader var6, Class185 var7, Class184 var8, Animator mainAnimation, Animator stance, Animator[] otherAnimes, int[] var12, int rotation, boolean var14, Class592 var15, int var16) {
      if(-1 != this.anInt_9845 * 2037569583) {
         return var5.method5670(this.anInt_9845 * 2037569583, -986193356).method5602(var1, flags, var3, var7, var8, mainAnimation, stance, otherAnimes, var12, rotation, (Class442)null, -583311388);
      } else {
         int flags2 = flags;
         long id = this.identifier * -4594900391287831353L;
         int[] modelIDs = this.equipmentIDs;
         boolean var21 = false;
         boolean var22 = false;
         int var24;
         if(mainAnimation != null) {
            Animation var23 = mainAnimation.getAnimation(1817483455);
            if(var23 != null && (962536699 * var23.anInt_10119 >= 0 || var23.anInt_10112 * 1590298829 >= 0)) {
               modelIDs = new int[this.equipmentIDs.length];

               for(var24 = 0; var24 < modelIDs.length; ++var24) {
                  modelIDs[var24] = this.equipmentIDs[var24];
               }

               if(var23.anInt_10119 * 962536699 >= 0 && -1 != -30071649 * var15.anInt_9804) {
                  var21 = true;
                  if('\uffff' == 962536699 * var23.anInt_10119) {
                     modelIDs[var15.anInt_9804 * -30071649] = 0;

                     for(var24 = 0; var24 < var15.anIntArray_9799.length; ++var24) {
                        modelIDs[var15.anIntArray_9799[var24]] = 0;
                     }

                     id ^= -4294967296L;
                  } else {
                     modelIDs[-30071649 * var15.anInt_9804] = var23.anInt_10119 * 962536699 | 1073741824;

                     for(var24 = 0; var24 < var15.anIntArray_9799.length; ++var24) {
                        modelIDs[var15.anIntArray_9799[var24]] = 0;
                     }

                     id ^= (long)modelIDs[-30071649 * var15.anInt_9804] << 32;
                  }
               }

               if(1590298829 * var23.anInt_10112 >= 0 && -1 != -1850317659 * var15.anInt_9800) {
                  var22 = true;
                  if('\uffff' == var23.anInt_10112 * 1590298829) {
                     modelIDs[var15.anInt_9800 * -1850317659] = 0;

                     for(var24 = 0; var24 < var15.anIntArray_9803.length; ++var24) {
                        modelIDs[var15.anIntArray_9803[var24]] = 0;
                     }

                     id ^= 4294967295L;
                  } else {
                     modelIDs[var15.anInt_9800 * -1850317659] = var23.anInt_10112 * 1590298829 | 1073741824;

                     for(var24 = 0; var24 < var15.anIntArray_9803.length; ++var24) {
                        modelIDs[var15.anIntArray_9803[var24]] = 0;
                     }

                     id ^= (long)modelIDs[var15.anInt_9800 * -1850317659];
                  }
               }
            }
         }

         boolean isAnimating = false;
         var24 = otherAnimes != null?otherAnimes.length:0;

         for(int var25 = 0; var25 < var24; ++var25) {
            if(otherAnimes[var25] != null) {
               flags2 |= otherAnimes[var25].getFlags((short)-15505);
               isAnimating = true;
            }
         }

         if(null != mainAnimation) {
            flags2 |= mainAnimation.getFlags((short)-5746);
            isAnimating = true;
         }

         if(null != stance) {
            flags2 |= stance.getFlags((short)-19488);
            isAnimating = true;
         }

         boolean var43 = false;
         if(var12 != null) {
            for(int var26 = 0; var26 < var12.length; ++var26) {
               if(var12[var26] != -1) {
                  flags2 |= 32;
                  var43 = true;
               }
            }
         }

         CacheNodeArrayList var27 = longTermPlayerCache;
         Model gotModel;
         synchronized(longTermPlayerCache) {
            gotModel = (Model)longTermPlayerCache.getObject(id);
         }

         Class263 var46 = null;
         if(-1 != 1511135739 * this.anInt_9849) {
            var46 = var3.method3343(this.anInt_9849 * 1511135739, 1516291115);
         }

         int var31;
         int var30;
         if(null == gotModel || var1.method1940(gotModel.method2015(), flags2) != 0) {
            if(gotModel != null) {
               flags2 = var1.method1941(flags2, gotModel.method2015());
            }

            boolean var29 = false;

            int var34;
            for(var30 = 0; var30 < modelIDs.length; ++var30) {
               var31 = modelIDs[var30];
               Class459 var32 = null;
               boolean var33 = false;
               if(var21) {
                  if(var30 == var15.anInt_9804 * -30071649) {
                     var33 = true;
                  } else {
                     for(var34 = 0; var34 < var15.anIntArray_9799.length; ++var34) {
                        if(var30 == var15.anIntArray_9799[var34]) {
                           var33 = true;
                           break;
                        }
                     }
                  }
               }

               if(var22) {
                  if(var15.anInt_9800 * -1850317659 == var30) {
                     var33 = true;
                  } else {
                     for(var34 = 0; var34 < var15.anIntArray_9803.length; ++var34) {
                        if(var15.anIntArray_9803[var34] == var30) {
                           var33 = true;
                           break;
                        }
                     }
                  }
               }

               if((var31 & 1073741824) != 0) {
                  if(!var33 && null != this.aClass459Array_9847 && this.aClass459Array_9847[var30] != null) {
                     var32 = this.aClass459Array_9847[var30];
                  }

                  if(!var6.getObjectDescriptor(var31 & 1073741823).method5480(this.aBoolean_9852, var32, -1607232264)) {
                     var29 = true;
                  }
               } else if(0 != (var31 & Integer.MIN_VALUE) && !var4.method818(var31 & 1073741823, 1090881588).method1038(16711935)) {
                  var29 = true;
               }
            }

            if(var29) {
               if(4696216603750172451L * this.aLong_9856 != -1L) {
                  CacheNodeArrayList var47 = longTermPlayerCache;
                  synchronized(longTermPlayerCache) {
                     gotModel = (Model)longTermPlayerCache.getObject(this.aLong_9856 * 4696216603750172451L);
                  }
               }

               if(gotModel == null || var1.method1940(gotModel.method2015(), flags2) != 0) {
                  return null;
               }
            } else {
               ModelData[] equipmentModels = new ModelData[modelIDs.length];

               int var50;
               for(var31 = 0; var31 < modelIDs.length; ++var31) {
                  var50 = modelIDs[var31];
                  Class459 var54 = null;
                  boolean var56 = 5 == var31 && var21 || 3 == var31 && var22;
                  ModelData var35;
                  if(0 != (var50 & 1073741824)) {
                     if(!var56 && this.aClass459Array_9847 != null && this.aClass459Array_9847[var31] != null) {
                        var54 = this.aClass459Array_9847[var31];
                     }

                     var35 = var6.getObjectDescriptor(var50 & 1073741823).method5473(this.aBoolean_9852, var54, -1928561941);
                     if(var35 != null) {
                        equipmentModels[var31] = var35;
                     }
                  } else if((var50 & Integer.MIN_VALUE) != 0) {
                     var35 = var4.method818(var50 & 1073741823, -1774778146).method1036((byte)-22);
                     if(var35 != null) {
                        equipmentModels[var31] = var35;
                     }
                  }
               }

               int var53;
               if(var46 != null && var46.viewportData != null) {
                  for(var31 = 0; var31 < var46.viewportData.length; ++var31) {
                     if(null != equipmentModels[var31]) {
                        var50 = 0;
                        var53 = 0;
                        var34 = 0;
                        int var52 = 0;
                        int var36 = 0;
                        int var37 = 0;
                        if(null != var46.viewportData[var31]) {
                           var50 = var46.viewportData[var31][0];
                           var53 = var46.viewportData[var31][1];
                           var34 = var46.viewportData[var31][2];
                           var52 = var46.viewportData[var31][3] << 3;
                           var36 = var46.viewportData[var31][4] << 3;
                           var37 = var46.viewportData[var31][5] << 3;
                        }

                        if(var52 != 0 || var36 != 0 || var37 != 0) {
                           equipmentModels[var31].method1228(var52, var36, var37);
                        }

                        if(0 != var50 || 0 != var53 || var34 != 0) {
                           equipmentModels[var31].offset(var50, var53, var34);
                        }
                     }
                  }
               }

               ModelData var51 = new ModelData(equipmentModels, equipmentModels.length);
               int var28 = flags2 | 16384;
               gotModel = var1.createModel(var51, var28, Class104_Sub13.anInt_10681 * 645480573, 64, 850);

               for(var50 = 0; var50 < 10; ++var50) {
                  for(var53 = 0; var53 < aShortArrayArray_9853[var50].length; ++var53) {
                     if(this.anIntArray_9848[var50] < aShortArrayArrayArray_9854[var50][var53].length) {
                        gotModel.method2030(aShortArrayArray_9853[var50][var53], aShortArrayArrayArray_9854[var50][var53][this.anIntArray_9848[var50]]);
                     }
                  }
               }

               if(var14) {
                  gotModel.method2042(flags2);
                  CacheNodeArrayList var55 = longTermPlayerCache;
                  synchronized(longTermPlayerCache) {
                     longTermPlayerCache.insert(gotModel, id);
                  }

                  this.aLong_9856 = id * -2720250256609288053L;
               }
            }
         }

         Model resultModel = gotModel.copy((byte)4, flags2, true);
         if(!isAnimating && !var43) {
            return resultModel;
         } else { //apply animations
            Viewport[] viewports = null;
            if(var46 != null) {
               viewports = var46.genViewports((byte)67);
            }

            if(var43 && null != viewports) {
               for(var30 = 0; var30 < var12.length; ++var30) {
                  if(null != viewports[var30]) {
                     resultModel.applyViewport(viewports[var30], 1 << var30, true);
                  }
               }
            }

            var30 = 0;

            for(var31 = 1; var30 < var24; var31 <<= 1) {
               if(otherAnimes[var30] != null) {
                  otherAnimes[var30].method5890(resultModel, 0, var31, (byte)-112);
               }

               ++var30;
            }

            if(var43) {
               for(var30 = 0; var30 < var12.length; ++var30) {
                  if(var12[var30] != -1) {
                     var31 = var12[var30] - rotation;
                     var31 &= 16383;
                     Viewport var57 = new Viewport();
                     var57.rotate(0.0F, 1.0F, 0.0F, Class362.toRadians(var31));
                     resultModel.applyViewport(var57, 1 << var30, false);
                  }
               }
            }

            if(var43 && null != viewports) {
               for(var30 = 0; var30 < var12.length; ++var30) {
                  if(viewports[var30] != null) {
                     resultModel.applyViewport(viewports[var30], 1 << var30, false);
                  }
               }
            }

            if(null != mainAnimation && stance != null) {
               RandomAccessFileNode.method5763(resultModel, mainAnimation, stance, -1926950185);
            } else if(null != mainAnimation) {
               mainAnimation.applyToModel(resultModel, 0, 1181260038);
            } else if(null != stance) {
               stance.applyToModel(resultModel, 0, 1109025);
            }

            return resultModel;
         }
      }
   }

   public Model method6453(Renderer var1, int var2, Class71 var3, NPCUnpacker var4, CacheObjectLoader var5, Class185 var6, Class184 var7, Animator var8, int var9) {
      if(-1 != this.anInt_9845 * 2037569583) {
         return var4.method5670(this.anInt_9845 * 2037569583, 225023654).method5596(var1, var2, var6, var7, var8, (Class442)null, (byte)-22);
      } else {
         int var10 = null != var8?var2 | var8.getFlags((short)-11517):var2;
         CacheNodeArrayList var11 = playerModelCache;
         Model var12;
         synchronized(playerModelCache) {
            var12 = (Model)playerModelCache.getObject(-4594900391287831353L * this.identifier);
         }

         if(var12 == null || var1.method1940(var12.method2015(), var10) != 0) {
            if(null != var12) {
               var10 = var1.method1941(var10, var12.method2015());
            }

            boolean var13 = false;

            int modelCount;
            for(int var14 = 0; var14 < this.equipmentIDs.length; ++var14) {
               modelCount = this.equipmentIDs[var14];
               Class459 var16 = null;
               if(0 != (modelCount & 1073741824)) {
                  if(null != this.aClass459Array_9847 && this.aClass459Array_9847[var14] != null) {
                     var16 = this.aClass459Array_9847[var14];
                  }

                  if(!var5.getObjectDescriptor(modelCount & 1073741823).method5474(this.aBoolean_9852, var16, (byte)70)) {
                     var13 = true;
                  }
               } else if((modelCount & Integer.MIN_VALUE) != 0 && !var3.method818(modelCount & 1073741823, 79162383).method1037(1488494889)) {
                  var13 = true;
               }
            }

            if(var13) {
               return null;
            }

            ModelData[] modelArray = new ModelData[this.equipmentIDs.length];
            modelCount = 0;

            int var17;
            for(int var28 = 0; var28 < this.equipmentIDs.length; ++var28) {
               var17 = this.equipmentIDs[var28];
               Class459 var18 = null;
               ModelData var19;
               if((var17 & 1073741824) != 0) {
                  if(this.aClass459Array_9847 != null && null != this.aClass459Array_9847[var28]) {
                     var18 = this.aClass459Array_9847[var28];
                  }

                  var19 = var5.getObjectDescriptor(var17 & 1073741823).getModelData(this.aBoolean_9852, var18, (byte)-19);
                  if(var19 != null) {
                     modelArray[modelCount++] = var19;
                  }
               } else if((var17 & Integer.MIN_VALUE) != 0) {
                  var19 = var3.method818(var17 & 1073741823, -1920894025).method1039((short)250);
                  if(null != var19) {
                     modelArray[modelCount++] = var19;
                  }
               }
            }

            ModelData var27 = new ModelData(modelArray, modelCount);
            int var23 = var10 | 16384;
            var12 = var1.createModel(var27, var23, 645480573 * Class104_Sub13.anInt_10681, 64, 768);

            for(var17 = 0; var17 < 10; ++var17) {
               for(int var29 = 0; var29 < aShortArrayArray_9853[var17].length; ++var29) {
                  if(this.anIntArray_9848[var17] < aShortArrayArrayArray_9854[var17][var29].length) {
                     var12.method2030(aShortArrayArray_9853[var17][var29], aShortArrayArrayArray_9854[var17][var29][this.anIntArray_9848[var17]]);
                  }
               }
            }

            var12.method2042(var10);
            CacheNodeArrayList var26 = playerModelCache;
            synchronized(playerModelCache) {
               playerModelCache.insert(var12, this.identifier * -4594900391287831353L);
            }
         }

         if(null == var8) {
            return var12;
         } else {
            Model var24 = var12.copy((byte)4, var10, true);
            var8.applyToModel(var24, 0, -1355235111);
            return var24;
         }
      }
   }

   public void method6454(int var1, int[] var2, Class459[] var3, int[] var4, boolean var5, int var6, int var7) {
      if(1511135739 * this.anInt_9849 != var1) {
         this.anInt_9849 = var1 * -1132394189;
      }

      this.equipmentIDs = var2;
      this.aClass459Array_9847 = var3;
      this.anIntArray_9848 = var4;
      this.aBoolean_9852 = var5;
      this.anInt_9845 = 1106341583 * var6;
      this.update();
   }

   void update() {
      long[] var2 = ByteArrayDataNode.aLongArray_6770;
      this.identifier = 9113255727204582153L;
      this.identifier = -9113255727204582153L * (this.identifier * -4594900391287831353L >>> 8 ^ var2[(int)((-4594900391287831353L * this.identifier ^ (long)(1511135739 * this.anInt_9849 >> 8)) & 255L)]);
      this.identifier = -9113255727204582153L * (-4594900391287831353L * this.identifier >>> 8 ^ var2[(int)((this.identifier * -4594900391287831353L ^ (long)(this.anInt_9849 * 1511135739)) & 255L)]);

      int var3;
      for(var3 = 0; var3 < this.equipmentIDs.length; ++var3) {
         this.identifier = (this.identifier * -4594900391287831353L >>> 8 ^ var2[(int)((this.identifier * -4594900391287831353L ^ (long)(this.equipmentIDs[var3] >> 24)) & 255L)]) * -9113255727204582153L;
         this.identifier = -9113255727204582153L * (-4594900391287831353L * this.identifier >>> 8 ^ var2[(int)((-4594900391287831353L * this.identifier ^ (long)(this.equipmentIDs[var3] >> 16)) & 255L)]);
         this.identifier = -9113255727204582153L * (-4594900391287831353L * this.identifier >>> 8 ^ var2[(int)((-4594900391287831353L * this.identifier ^ (long)(this.equipmentIDs[var3] >> 8)) & 255L)]);
         this.identifier = -9113255727204582153L * (-4594900391287831353L * this.identifier >>> 8 ^ var2[(int)((this.identifier * -4594900391287831353L ^ (long)this.equipmentIDs[var3]) & 255L)]);
      }

      if(this.aClass459Array_9847 != null) {
         for(var3 = 0; var3 < this.aClass459Array_9847.length; ++var3) {
            if(null != this.aClass459Array_9847[var3]) {
               int[] var4;
               int[] var5;
               if(this.aBoolean_9852) {
                  var4 = this.aClass459Array_9847[var3].anIntArray_8581;
                  var5 = this.aClass459Array_9847[var3].anIntArray_8583;
               } else {
                  var4 = this.aClass459Array_9847[var3].anIntArray_8584;
                  var5 = this.aClass459Array_9847[var3].anIntArray_8582;
               }

               int var6;
               if(null != var4) {
                  for(var6 = 0; var6 < var4.length; ++var6) {
                     this.identifier = (this.identifier * -4594900391287831353L >>> 8 ^ var2[(int)((-4594900391287831353L * this.identifier ^ (long)(var4[var6] >> 8)) & 255L)]) * -9113255727204582153L;
                     this.identifier = -9113255727204582153L * (-4594900391287831353L * this.identifier >>> 8 ^ var2[(int)((-4594900391287831353L * this.identifier ^ (long)var4[var6]) & 255L)]);
                  }
               }

               if(var5 != null) {
                  for(var6 = 0; var6 < var5.length; ++var6) {
                     this.identifier = (-4594900391287831353L * this.identifier >>> 8 ^ var2[(int)((-4594900391287831353L * this.identifier ^ (long)(var5[var6] >> 8)) & 255L)]) * -9113255727204582153L;
                     this.identifier = -9113255727204582153L * (this.identifier * -4594900391287831353L >>> 8 ^ var2[(int)((-4594900391287831353L * this.identifier ^ (long)var5[var6]) & 255L)]);
                  }
               }

               if(null != this.aClass459Array_9847[var3].aShortArray_8578) {
                  for(var6 = 0; var6 < this.aClass459Array_9847[var3].aShortArray_8578.length; ++var6) {
                     this.identifier = (-4594900391287831353L * this.identifier >>> 8 ^ var2[(int)((-4594900391287831353L * this.identifier ^ (long)(this.aClass459Array_9847[var3].aShortArray_8578[var6] >> 8)) & 255L)]) * -9113255727204582153L;
                     this.identifier = (this.identifier * -4594900391287831353L >>> 8 ^ var2[(int)((this.identifier * -4594900391287831353L ^ (long)this.aClass459Array_9847[var3].aShortArray_8578[var6]) & 255L)]) * -9113255727204582153L;
                  }
               }

               if(null != this.aClass459Array_9847[var3].aShortArray_8576) {
                  for(var6 = 0; var6 < this.aClass459Array_9847[var3].aShortArray_8576.length; ++var6) {
                     this.identifier = -9113255727204582153L * (-4594900391287831353L * this.identifier >>> 8 ^ var2[(int)((this.identifier * -4594900391287831353L ^ (long)(this.aClass459Array_9847[var3].aShortArray_8576[var6] >> 8)) & 255L)]);
                     this.identifier = (-4594900391287831353L * this.identifier >>> 8 ^ var2[(int)((this.identifier * -4594900391287831353L ^ (long)this.aClass459Array_9847[var3].aShortArray_8576[var6]) & 255L)]) * -9113255727204582153L;
                  }
               }
            }
         }
      }

      for(var3 = 0; var3 < 10; ++var3) {
         this.identifier = -9113255727204582153L * (this.identifier * -4594900391287831353L >>> 8 ^ var2[(int)((this.identifier * -4594900391287831353L ^ (long)this.anIntArray_9848[var3]) & 255L)]);
      }

      this.identifier = (this.identifier * -4594900391287831353L >>> 8 ^ var2[(int)((this.identifier * -4594900391287831353L ^ (long)(this.aBoolean_9852?1:0)) & 255L)]) * -9113255727204582153L;
   }

   public Model method6456(Renderer var1, int var2, Class71 var3, AnimationUnpacker var4, Animator var5, int var6, int var7, int var8, byte var9) {
      int var10 = null != var5?var2 | var5.getFlags((short)12839):var2;
      long var11 = (long)var8 << 32 | (long)(var7 << 16) | (long)var6;
      CacheNodeArrayList var13 = playerModelCache;
      Model var14;
      synchronized(playerModelCache) {
         var14 = (Model)playerModelCache.getObject(var11);
      }

      if(null == var14 || var1.method1940(var14.method2015(), var10) != 0) {
         if(null != var14) {
            var10 = var1.method1941(var10, var14.method2015());
         }

         ModelData[] var15 = new ModelData[3];
         int var16 = 0;
         if(!var3.method818(var6, -1637669671).method1037(1488494889) || !var3.method818(var7, -1139966535).method1037(1488494889) || !var3.method818(var8, 1233488667).method1037(1488494889)) {
            return null;
         }

         ModelData var17 = var3.method818(var6, 693152952).method1039((short)250);
         if(var17 != null) {
            var15[var16++] = var17;
         }

         var17 = var3.method818(var7, 627385864).method1039((short)250);
         if(null != var17) {
            var15[var16++] = var17;
         }

         var17 = var3.method818(var8, 995757438).method1039((short)250);
         if(var17 != null) {
            var15[var16++] = var17;
         }

         var17 = new ModelData(var15, var16);
         int var23 = var10 | 16384;
         var14 = var1.createModel(var17, var23, 645480573 * Class104_Sub13.anInt_10681, 64, 768);

         for(int var18 = 0; var18 < 10; ++var18) {
            for(int var19 = 0; var19 < aShortArrayArray_9853[var18].length; ++var19) {
               if(this.anIntArray_9848[var18] < aShortArrayArrayArray_9854[var18][var19].length) {
                  var14.method2030(aShortArrayArray_9853[var18][var19], aShortArrayArrayArray_9854[var18][var19][this.anIntArray_9848[var18]]);
               }
            }
         }

         var14.method2042(var10);
         CacheNodeArrayList var24 = playerModelCache;
         synchronized(playerModelCache) {
            playerModelCache.insert(var14, var11);
         }
      }

      if(null == var5) {
         return var14;
      } else {
         var14 = var14.copy((byte)4, var10, true);
         var5.applyToModel(var14, 0, -1168828431);
         return var14;
      }
   }

   static InterfaceDataComposite createInterfaceComposite(byte[] var0, int var1) {
      return new InterfaceDataComposite(new ByteArrayDataNode(var0), Class167.aClass185_3028);
   }

   static final void method6458(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, int var3) {
      String var4 = (String)var2.stringData[(var2.stringDataIndex -= -1828074049) * 863838783];
      if(Class557.extractInterfaceIntData(var4, var2, 1624256647) != null) {
         var4 = var4.substring(0, var4.length() - 1);
      }

      var0.anObjectArray_2560 = Class133.extractInterfaceData(var4, var2, (byte)76);
      var0.aBoolean_2524 = true;
   }

   static final void method6459(RSInterfaceData var0, int var1) {
      var0.intTypeIndex -= -1416056414;
      int var2 = var0.intTypes[-831324111 * var0.intTypeIndex];
      int var3 = var0.intTypes[var0.intTypeIndex * -831324111 + 1];
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var2 & -1 - (1 << var3);
   }

   static final void method6460(RSInterfaceData var0, byte var1) {
      System.out.println(var0.stringData[(var0.stringDataIndex -= -1828074049) * 863838783]);
   }

   static final void method6461(RSInterfaceData var0, int var1) {
      var0.intTypeIndex -= -708028207;
      int var2 = var0.intTypes[-831324111 * var0.intTypeIndex];
      ChatMessage var3 = Class540_Sub12.method1682(var2, (short)31323);
      if(null != var3) {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = -646884527 * var3.anInt_7395;
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = -576966151 * var3.timeStamp;
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 575763799 * var3.anInt_7398;
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = null != var3.aString_7402?var3.aString_7402:"";
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = null != var3.aString_7400?var3.aString_7400:"";
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = var3.aString_7401 != null?var3.aString_7401:"";
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = null != var3.aString_7397?var3.aString_7397:"";
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 1240176329 * var3.anInt_7403;
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = var3.aString_7404 != null?var3.aString_7404:"";
      } else {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = -1;
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 0;
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 0;
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = "";
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = "";
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = "";
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = "";
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 0;
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = "";
      }

   }

   static void method6462(int var0) {
      Class240_Sub22_Sub5.aNodeArrayList_1188.method5938(821282330);
      Class240_Sub22_Sub5.aClass494_1187.method5770(-1207361337);
      Class240_Sub22_Sub5.aClass494_1186.method5770(68933770);
   }
}
