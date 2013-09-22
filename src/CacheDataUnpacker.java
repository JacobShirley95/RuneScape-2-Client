
public final class CacheDataUnpacker {

   int anInt_4694;
   Object[][] cacheSubObjects;
   boolean aBoolean_4696;
   static Class433 aClass433_4697 = new Class433();
   Object[] cacheObjects;
   Class372 aClass372_4699 = null;
   public static final int anInt_4700 = 1;
   public static final int anInt_4701 = 2;
   static final int anInt_4702 = 0;
   AbstractCacheData cacheData;
   static boolean aBoolean_4704 = false;
   static int anInt_4705 = 0;
   static final int anInt_4706 = 0;
   static final int anInt_4707 = 1;


   public byte[] getDataBytes(int var1, int var2, int var3) {
      return this.getDataBytes(var1, var2, (int[])null, -544974544);
   }

   synchronized boolean method3563(byte var1) {
      if(this.aClass372_4699 == null) {
         this.aClass372_4699 = this.cacheData.method4672(-906262480);
         if(null == this.aClass372_4699) {
            return false;
         }

         this.cacheObjects = new Object[this.aClass372_4699.objectsCount * -1690688605];
         this.cacheSubObjects = new Object[-1690688605 * this.aClass372_4699.objectsCount][];
      }

      return true;
   }

   public int method3564(int var1) {
      if(!this.method3563((byte)92)) {
         throw new IllegalStateException("");
      } else {
         return this.aClass372_4699.anInt_6944 * -1977589579;
      }
   }

   public synchronized boolean method3565(int var1, int var2, int var3) {
      if(!this.method3563((byte)127)) {
         return false;
      } else if(var1 >= 0 && var2 >= 0 && var1 < this.aClass372_4699.anIntArray_6959.length && var2 < this.aClass372_4699.anIntArray_6959[var1]) {
         return true;
      } else if(aBoolean_4704) {
         throw new IllegalArgumentException(var1 + " " + var2);
      } else {
         return false;
      }
   }

   public synchronized byte[] method3566(int var1, int var2) {
      if(!this.method3563((byte)119)) {
         return null;
      } else if(1 == this.aClass372_4699.anIntArray_6959.length) {
         return this.getDataBytes(0, var1, -1213546614);
      } else if(!this.method3586(var1, (byte)74)) {
         return null;
      } else if(1 == this.aClass372_4699.anIntArray_6959[var1]) {
         return this.getDataBytes(var1, 0, -996128930);
      } else {
         throw new RuntimeException();
      }
   }

   public void method3567(int var1, byte var2) {
      this.cacheData.method4671(var1, (byte)-126);
   }

   public synchronized boolean method3568(int var1, int var2, int var3) {
      if(!this.method3565(var1, var2, 1749399647)) {
         return false;
      } else if(null != this.cacheSubObjects[var1] && this.cacheSubObjects[var1][var2] != null) {
         return true;
      } else if(this.cacheObjects[var1] != null) {
         return true;
      } else {
         this.method3591(var1, (byte)-71);
         return null != this.cacheObjects[var1];
      }
   }

   public int method3569(int var1, int var2) {
      if(!this.method3563((byte)97)) {
         return -1;
      } else {
         int var3 = this.aClass372_4699.aClass45_6957.method414(var1, (byte)47);
         return !this.method3586(var3, (byte)23)?-1:var3;
      }
   }

   public synchronized boolean hasData(int var1, int var2) {
      if(!this.method3563((byte)41)) {
         return false;
      } else if(this.aClass372_4699.anIntArray_6959.length == 1) {
         return this.method3568(0, var1, -5085516);
      } else if(!this.method3586(var1, (byte)58)) {
         return false;
      } else if(1 == this.aClass372_4699.anIntArray_6959[var1]) {
         return this.method3568(var1, 0, 1196961586);
      } else {
         throw new RuntimeException();
      }
   }

   public synchronized boolean method3571(int var1, int var2) {
      if(!this.method3586(var1, (byte)4)) {
         return false;
      } else if(this.cacheObjects[var1] != null) {
         return true;
      } else {
         this.method3591(var1, (byte)-104);
         return null != this.cacheObjects[var1];
      }
   }

   synchronized int getPercentLoaded(int var1, byte var2) {
      return !this.method3586(var1, (byte)71)?0:(null != this.cacheObjects[var1]?100:this.cacheData.getPercentLoaded(var1, -656538601));
   }

   public boolean loadDataEntry(String var1, int var2) {
      if(!this.method3563((byte)66)) {
         return false;
      } else {
         var1 = var1.toLowerCase();
         int var3 = this.aClass372_4699.aClass45_6957.method414(Class350.method4401(var1, 615907829), (byte)84);
         return this.method3571(var3, -2127403880);
      }
   }

   public boolean method3574(int var1, int var2) {
      if(!this.method3563((byte)86)) {
         return false;
      } else if(1 == this.aClass372_4699.anIntArray_6959.length) {
         return this.method3565(0, var1, 1883927844);
      } else if(!this.method3586(var1, (byte)102)) {
         return false;
      } else if(this.aClass372_4699.anIntArray_6959[var1] == 1) {
         return this.method3565(var1, 0, 1795672042);
      } else {
         throw new RuntimeException();
      }
   }

   public int method3575(int var1, int var2) {
      return !this.method3586(var1, (byte)75)?0:this.aClass372_4699.anIntArray_6959[var1];
   }

   public synchronized boolean method3576(byte var1) {
      if(!this.method3563((byte)64)) {
         return false;
      } else {
         boolean var2 = true;

         for(int var3 = 0; var3 < this.aClass372_4699.anIntArray_6948.length; ++var3) {
            int var4 = this.aClass372_4699.anIntArray_6948[var3];
            if(null == this.cacheObjects[var4]) {
               this.method3591(var4, (byte)-70);
               if(null == this.cacheObjects[var4]) {
                  var2 = false;
               }
            }
         }

         return var2;
      }
   }

   public synchronized void method3577(int var1, int var2) {
      if(this.method3586(var1, (byte)84)) {
         if(null != this.cacheSubObjects) {
            this.cacheSubObjects[var1] = null;
         }

      }
   }

   public void method3578(boolean var1, boolean var2, int var3) {
      if(this.method3563((byte)49)) {
         if(var1) {
            this.aClass372_4699.anIntArray_6945 = null;
            this.aClass372_4699.aClass45_6957 = null;
         }

         if(var2) {
            this.aClass372_4699.anIntArrayArray_6950 = (int[][])null;
            this.aClass372_4699.aClass45Array_6958 = null;
         }

      }
   }

   synchronized boolean method3579(int var1, int var2, int[] var3, int var4) {
      if(!this.method3586(var1, (byte)46)) {
         return false;
      } else if(this.cacheObjects[var1] == null) {
         return false;
      } else {
         int var5 = this.aClass372_4699.anIntArray_6955[var1];
         int[] var6 = this.aClass372_4699.subOffsets[var1];
         if(null == this.cacheSubObjects[var1]) {
            this.cacheSubObjects[var1] = new Object[this.aClass372_4699.anIntArray_6959[var1]];
         }

         Object[] var7 = this.cacheSubObjects[var1];
         boolean var8 = true;

         for(int var9 = 0; var9 < var5; ++var9) {
            int var10;
            if(null == var6) {
               var10 = var9;
            } else {
               var10 = var6[var9];
            }

            if(var7[var10] == null) {
               var8 = false;
               break;
            }
         }

         if(var8) {
            return true;
         } else {
            int var11;
            int var12;
            byte[] var23;
            if(null != var3 && (0 != var3[0] || var3[1] != 0 || var3[2] != 0 || 0 != var3[3])) {
               var23 = Class41.method340(this.cacheObjects[var1], true, (byte)-10);
               ByteArrayDataNode var24 = new ByteArrayDataNode(var23);
               var11 = var24.readByte(930263785);
               var12 = var24.method4480(1260717178);
               int var13 = var12 + (0 == var11?5:9);
               var24.method4497(var3, 5, var13, (byte)-103);
            } else {
               var23 = Class41.method340(this.cacheObjects[var1], false, (byte)30);
            }

            byte[] var25;
            try {
               var25 = Class130.method1673(var23, -1174724853);
            } catch (RuntimeException var22) {
               throw Class116.method1492(var22, (var3 != null) + " " + var1 + " " + var23.length + " " + LibraryUnpacker.method3195(var23, var23.length, -2020412357) + " " + LibraryUnpacker.method3195(var23, var23.length - 2, -2020412357) + " " + this.aClass372_4699.checksums[var1] + " " + this.aClass372_4699.anInt_6944 * -1977589579);
            }

            if(this.aBoolean_4696) {
               this.cacheObjects[var1] = null;
            }

            if(var5 > 1) {
               int var15;
               int var17;
               int var16;
               int var19;
               int var18;
               ByteArrayDataNode var26;
               if(650362209 * this.anInt_4694 != 2) {
                  var11 = var25.length;
                  --var11;
                  var12 = var25[var11] & 255;
                  var11 -= 4 * var5 * var12;
                  var26 = new ByteArrayDataNode(var25);
                  int[] var14 = new int[var5];
                  var26.index = var11 * -2043502829;

                  for(var15 = 0; var15 < var12; ++var15) {
                     var16 = 0;

                     for(var17 = 0; var17 < var5; ++var17) {
                        var16 += var26.method4480(1260717178);
                        var14[var17] += var16;
                     }
                  }

                  byte[][] var28 = new byte[var5][];

                  for(var16 = 0; var16 < var5; ++var16) {
                     var28[var16] = new byte[var14[var16]];
                     var14[var16] = 0;
                  }

                  var26.index = var11 * -2043502829;
                  var16 = 0;

                  for(var17 = 0; var17 < var12; ++var17) {
                     var18 = 0;

                     for(var19 = 0; var19 < var5; ++var19) {
                        var18 += var26.method4480(1260717178);
                        System.arraycopy(var25, var16, var28[var19], var14[var19], var18);
                        var14[var19] += var18;
                        var16 += var18;
                     }
                  }

                  for(var17 = 0; var17 < var5; ++var17) {
                     if(var6 == null) {
                        var18 = var17;
                     } else {
                        var18 = var6[var17];
                     }

                     if(0 == this.anInt_4694 * 650362209) {
                        var7[var18] = Class89.method1184(var28[var17], false, (short)14457);
                     } else {
                        var7[var18] = var28[var17];
                     }
                  }
               } else {
                  var11 = var25.length;
                  --var11;
                  var12 = var25[var11] & 255;
                  var11 -= 4 * var5 * var12;
                  var26 = new ByteArrayDataNode(var25);
                  int var27 = 0;
                  var15 = 0;
                  var26.index = -2043502829 * var11;

                  for(var16 = 0; var16 < var12; ++var16) {
                     var17 = 0;

                     for(var18 = 0; var18 < var5; ++var18) {
                        var17 += var26.method4480(1260717178);
                        if(null == var6) {
                           var19 = var18;
                        } else {
                           var19 = var6[var18];
                        }

                        if(var19 == var2) {
                           var27 += var17;
                           var15 = var19;
                        }
                     }
                  }

                  if(var27 == 0) {
                     return true;
                  }

                  byte[] var29 = new byte[var27];
                  var27 = 0;
                  var26.index = -2043502829 * var11;
                  var17 = 0;

                  for(var18 = 0; var18 < var12; ++var18) {
                     var19 = 0;

                     for(int var20 = 0; var20 < var5; ++var20) {
                        var19 += var26.method4480(1260717178);
                        int var21;
                        if(null == var6) {
                           var21 = var20;
                        } else {
                           var21 = var6[var20];
                        }

                        if(var21 == var2) {
                           System.arraycopy(var25, var17, var29, var27, var19);
                           var27 += var19;
                        }

                        var17 += var19;
                     }
                  }

                  var7[var15] = var29;
               }
            } else {
               if(null == var6) {
                  var11 = 0;
               } else {
                  var11 = var6[0];
               }

               if(this.anInt_4694 * 650362209 == 0) {
                  var7[var11] = Class89.method1184(var25, false, (short)2198);
               } else {
                  var7[var11] = var25;
               }
            }

            return true;
         }
      }
   }

   public int getCacheOffset(String var1) {
      if(!this.method3563((byte)126)) {
         return -1;
      } else {
         var1 = var1.toLowerCase();
         int var3 = this.aClass372_4699.aClass45_6957.method414(Class350.method4401(var1, -935624873), (byte)2);
         return !this.method3586(var3, (byte)19)?-1:var3;
      }
   }

   public int method3581(short var1) {
      return !this.method3563((byte)106)?-1:this.aClass372_4699.anIntArray_6959.length;
   }

   public boolean entryExists(String var1, byte var2) {
      if(!this.method3563((byte)111)) {
         return false;
      } else {
         var1 = var1.toLowerCase();
         int var3 = this.aClass372_4699.aClass45_6957.method414(Class350.method4401(var1, 44956946), (byte)12);
         return var3 >= 0;
      }
   }

   public synchronized byte[] method3583(String var1, String var2, byte var3) {
      if(!this.method3563((byte)87)) {
         return null;
      } else {
         var1 = var1.toLowerCase();
         var2 = var2.toLowerCase();
         int var4 = this.aClass372_4699.aClass45_6957.method414(Class350.method4401(var1, 423490823), (byte)22);
         if(!this.method3586(var4, (byte)81)) {
            return null;
         } else {
            int var5 = this.aClass372_4699.aClass45Array_6958[var4].method414(Class350.method4401(var2, -855830712), (byte)50);
            return this.getDataBytes(var4, var5, -2068447054);
         }
      }
   }

   boolean method3584(String var1, String var2, int var3) {
      if(!this.method3563((byte)65)) {
         return false;
      } else {
         var1 = var1.toLowerCase();
         var2 = var2.toLowerCase();
         int var4 = this.aClass372_4699.aClass45_6957.method414(Class350.method4401(var1, -967413329), (byte)99);
         if(!this.method3586(var4, (byte)36)) {
            return false;
         } else {
            int var5 = this.aClass372_4699.aClass45Array_6958[var4].method414(Class350.method4401(var2, -6273758), (byte)37);
            return this.method3568(var4, var5, 1257049723);
         }
      }
   }

   public boolean method3585(String var1, int var2) {
      int var3 = this.getCacheOffset("");
      return -1 != var3?this.method3584("", var1, 1985623225):this.method3584(var1, "", -37884779);
   }

   synchronized boolean method3586(int var1, byte var2) {
      if(!this.method3563((byte)17)) {
         return false;
      } else if(var1 >= 0 && var1 < this.aClass372_4699.anIntArray_6959.length && this.aClass372_4699.anIntArray_6959[var1] != 0) {
         return true;
      } else if(aBoolean_4704) {
         throw new IllegalArgumentException(Integer.toString(var1));
      } else {
         return false;
      }
   }

   public boolean method3587(String var1, String var2, int var3) {
      if(!this.method3563((byte)46)) {
         return false;
      } else {
         var1 = var1.toLowerCase();
         var2 = var2.toLowerCase();
         int var4 = this.aClass372_4699.aClass45_6957.method414(Class350.method4401(var1, 355341866), (byte)38);
         if(var4 < 0) {
            return false;
         } else {
            int var5 = this.aClass372_4699.aClass45Array_6958[var4].method414(Class350.method4401(var2, 2063131221), (byte)59);
            return var5 >= 0;
         }
      }
   }

   public int getPercentLoaded(String var1, byte var2) {
      if(!this.method3563((byte)7)) {
         return 0;
      } else {
         var1 = var1.toLowerCase();
         int var3 = this.aClass372_4699.aClass45_6957.method414(Class350.method4401(var1, 2072057365), (byte)33);
         return this.getPercentLoaded(var3, (byte)48);
      }
   }

   public synchronized byte[] getDataBytes(int entryPoint, int subEntryPoint, int[] var3, int var4) {
      if(!this.method3565(entryPoint, subEntryPoint, 999743366)) {
         return null;
      } else {
         byte[] var5 = null;
         if(null == this.cacheSubObjects[entryPoint] || null == this.cacheSubObjects[entryPoint][subEntryPoint]) {
            boolean var6 = this.method3579(entryPoint, subEntryPoint, var3, 868063485);
            if(!var6) {
               this.method3591(entryPoint, (byte)-128);
               var6 = this.method3579(entryPoint, subEntryPoint, var3, -125337855);
               if(!var6) {
                  return null;
               }
            }
         }

         if(null == this.cacheSubObjects[entryPoint]) {
            throw new RuntimeException("");
         } else {
            if(this.cacheSubObjects[entryPoint][subEntryPoint] != null) {
               var5 = Class41.method340(this.cacheSubObjects[entryPoint][subEntryPoint], false, (byte)-83);
               if(null == var5) {
                  throw new RuntimeException("");
               }
            }

            if(var5 != null) {
               if(this.anInt_4694 * 650362209 == 1) {
                  this.cacheSubObjects[entryPoint][subEntryPoint] = null;
                  if(this.aClass372_4699.anIntArray_6959[entryPoint] == 1) {
                     this.cacheSubObjects[entryPoint] = null;
                  }
               } else if(this.anInt_4694 * 650362209 == 2) {
                  this.cacheSubObjects[entryPoint] = null;
               }
            }

            return var5;
         }
      }
   }

   public synchronized int[] getSubOffsets(int var1) {
      if(!this.method3586(var1, (byte)64)) {
         return null;
      } else {
         int[] var3 = this.aClass372_4699.subOffsets[var1];
         if(null == var3) {
            var3 = new int[this.aClass372_4699.anIntArray_6955[var1]];

            for(int var4 = 0; var4 < var3.length; var3[var4] = var4++) {
               ;
            }
         }

         return var3;
      }
   }

   public CacheDataUnpacker(AbstractCacheData var1, boolean var2, int var3) {
      if(var3 >= 0 && var3 <= 2) {
         this.cacheData = var1;
         this.aBoolean_4696 = var2;
         this.anInt_4694 = 934913697 * var3;
      } else {
         throw new IllegalArgumentException("");
      }
   }

   synchronized void method3591(int var1, byte var2) {
      if(this.aBoolean_4696) {
         this.cacheObjects[var1] = this.cacheData.method4669(var1, -2094825812);
      } else {
         this.cacheObjects[var1] = Class89.method1184(this.cacheData.method4669(var1, 641016013), false, (short)1360);
      }

   }

   public synchronized int method3592(int var1) {
      if(!this.method3563((byte)58)) {
         return 0;
      } else {
         int var2 = 0;
         int var3 = 0;

         int var4;
         for(var4 = 0; var4 < this.cacheObjects.length; ++var4) {
            if(this.aClass372_4699.anIntArray_6955[var4] > 0) {
               var2 += 100;
               var3 += this.getPercentLoaded(var4, (byte)71);
            }
         }

         if(var2 == 0) {
            return 100;
         } else {
            var4 = var3 * 100 / var2;
            return var4;
         }
      }
   }

   static final void method3593(RSInterface var0, RSInterfaceData var1, int var2) {
      var1.intTypeIndex -= -708028207;
      int var3 = var1.intTypes[-831324111 * var1.intTypeIndex] - 1;
      if(var3 >= 0 && var3 <= 9) {
         RSServerQueue.method6200(var0, var3, var1, (byte)2);
      } else {
         throw new RuntimeException();
      }
   }

   static WorldMapText getMapTextRenderer(int var0, int var1) {
      if(var0 == 0) {
         if((double)Class248_Sub1.mapZoomScaleX == 3.0D) {
            return Class204.aClass198_3538;
         }

         if(4.0D == (double)Class248_Sub1.mapZoomScaleX) {
            return Class346.aClass198_6569;
         }

         if(6.0D == (double)Class248_Sub1.mapZoomScaleX) {
            return Class240_Sub22_Sub17.aClass198_8437;
         }

         if((double)Class248_Sub1.mapZoomScaleX >= 8.0D) {
            return Class254.aClass198_4402;
         }
      } else if(1 == var0) {
         if(3.0D == (double)Class248_Sub1.mapZoomScaleX) {
            return Class240_Sub22_Sub17.aClass198_8437;
         }

         if((double)Class248_Sub1.mapZoomScaleX == 4.0D) {
            return Class254.aClass198_4402;
         }

         if(6.0D == (double)Class248_Sub1.mapZoomScaleX) {
            return Class445.aClass198_8521;
         }

         if((double)Class248_Sub1.mapZoomScaleX >= 8.0D) {
            return Class240_Sub19.aClass198_7179;
         }
      } else if(var0 == 2) {
         if(3.0D == (double)Class248_Sub1.mapZoomScaleX) {
            return Class445.aClass198_8521;
         }

         if((double)Class248_Sub1.mapZoomScaleX == 4.0D) {
            return Class240_Sub19.aClass198_7179;
         }

         if(6.0D == (double)Class248_Sub1.mapZoomScaleX) {
            return Class509.aClass198_9183;
         }

         if((double)Class248_Sub1.mapZoomScaleX >= 8.0D) {
            return Class240_Sub28.aClass198_7385;
         }
      }

      return null;
   }

   static void method3595(int var0, int var1, short var2) {
      if(1 == 1413353159 * Class18.anInt_179) {
         Class491.method5753(Class39.aClass240_Sub22_Sub3_866, var0, var1, (byte)3);
      } else if(2 == Class18.anInt_179 * 1413353159) {
         Class508.method5908(var0, var1, (byte)49);
      }

      Class18.anInt_179 = 0;
      Class39.aClass240_Sub22_Sub3_866 = null;
   }
}
