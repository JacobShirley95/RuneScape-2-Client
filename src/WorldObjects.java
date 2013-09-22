import java.util.Iterator;

public class WorldObjects {

   final Class240_Sub53[] aClass240_Sub53Array_4470 = new Class240_Sub53[8];
   long[][][] aLongArrayArrayArray_4471;
   byte[][] aByteArrayArray_4472;
   final int anInt_4473;
   final int anInt_4474 = 16;
   final Renderer aRenderer_4475;
   Class499 aClass499_4476;
   public static boolean aBoolean_4477 = true;
   int anInt_4478;
   public final int anInt_4479;
   public int anInt_4480;
   public final int anInt_4481;
   int hiddenObjectsCount;
   public Class638[][][] tiles;
   public Plane[] planes;
   public final Class269 aClass269_4485;
   public Plane[] aClass171Array_4486;
   public Class638[][][] aClass638ArrayArrayArray_4487;
   int anInt_4488;
   int[][] anIntArrayArray_4489;
   short[][] aShortArrayArray_4490;
   int visibleObjectsCount;
   public Plane[] aClass171Array_4492;
   byte[][] aByteArrayArray_4493;
   byte[][] aByteArrayArray_4494;
   int anInt_4495 = 0;
   final int anInt_4496 = 10039;
   final int anInt_4497 = 5001;
   int anInt_4498;
   final Class563_Sub1[] aClass563_Sub1Array_4499;
   final Class563_Sub1[] aClass563_Sub1Array_4500;
   final Class563_Sub1[] aClass563_Sub1Array_4501;
   boolean[][] aBooleanArrayArray_4502;
   int anInt_4503;
   final Class563_Sub1[] hiddenObjects;
   final Class563_Sub1[] visibleObjects;
   final PositionEntity[] aClass563_Sub1_Sub4Array_4506;
   static final int anInt_4507 = 4;
   int anInt_4508;
   int anInt_4509;
   public Class638[][][] aClass638ArrayArrayArray_4510;
   int anInt_4511;
   int anInt_4512;
   public final int shiftAmount;
   boolean aBoolean_4514;
   int anInt_4515;
   int anInt_4516;
   int anInt_4517;
   public Class636 aClass636_4518;
   final boolean aBoolean_4519;
   final float[] aFloatArray_4520 = new float[3];
   int anInt_4521;
   final int anInt_4522 = '\ufe7e';
   final int anInt_4523 = 5075;
   int anInt_4524;
   byte[][] aByteArrayArray_4525;
   Class265[] aClass265Array_4526;
   boolean[] aBooleanArray_4527;
   int anInt_4528;
   final int[] anIntArray_4529;
   final int anInt_4530;
   boolean[][] aBooleanArrayArray_4531;
   boolean[][] aBooleanArrayArray_4532;


   public void method3403(int var1, byte var2) {}

   public void method3404(boolean var1, byte var2) {
      if(var1) {
         this.tiles = this.aClass638ArrayArrayArray_4487;
         this.planes = this.aClass171Array_4492;
      } else {
         this.tiles = this.aClass638ArrayArrayArray_4510;
         this.planes = this.aClass171Array_4486;
      }

      this.anInt_4480 = -1075409577 * this.tiles.length;
   }

   public Class563_Sub1_Sub1 method3405(int var1, int var2, int var3, byte var4) {
      Class638 var5 = this.tiles[var1][var2][var3];
      if(null == var5) {
         return null;
      } else {
         this.method3422(var5.aClass563_Sub1_Sub1_10138, (byte)-66);
         if(var5.aClass563_Sub1_Sub1_10138 != null) {
            Class563_Sub1_Sub1 var6 = var5.aClass563_Sub1_Sub1_10138;
            var5.aClass563_Sub1_Sub1_10138 = null;
            return var6;
         } else {
            return null;
         }
      }
   }

   public void method3406(int var1, int var2, int var3) {
      Class638 var4 = this.tiles[0][var1][var2];

      for(int var5 = 0; var5 < 3; ++var5) {
         Class638 var6 = this.tiles[var5][var1][var2] = this.tiles[1 + var5][var1][var2];
         if(null != var6) {
            for(Class629 var7 = var6.aClass629_10137; var7 != null; var7 = var7.aClass629_10073) {
               PositionEntity var8 = var7.aClass563_Sub1_Sub4_10075;
               if(var8.locX == var1 && var2 == var8.locY) {
                  --var8.plane;
               }
            }

            if(var6.aClass563_Sub1_Sub1_10138 != null) {
               --var6.aClass563_Sub1_Sub1_10138.plane;
            }

            if(var6.aClass563_Sub1_Sub5_10131 != null) {
               --var6.aClass563_Sub1_Sub5_10131.plane;
            }

            if(var6.aClass563_Sub1_Sub5_10132 != null) {
               --var6.aClass563_Sub1_Sub5_10132.plane;
            }

            if(var6.aClass563_Sub1_Sub3_10133 != null) {
               --var6.aClass563_Sub1_Sub3_10133.plane;
            }

            if(null != var6.aClass563_Sub1_Sub3_10134) {
               --var6.aClass563_Sub1_Sub3_10134.plane;
            }
         }
      }

      if(null == this.tiles[0][var1][var2]) {
         this.tiles[0][var1][var2] = new Class638(0);
         this.tiles[0][var1][var2].aByte_10129 = 1;
      }

      this.tiles[0][var1][var2].aClass638_10135 = var4;
      this.tiles[3][var1][var2] = null;
   }

   Class638 method3407(int var1, int var2, int var3, int var4) {
      if(null == this.tiles[var1][var2][var3]) {
         boolean var5 = null != this.tiles[0][var2][var3] && null != this.tiles[0][var2][var3].aClass638_10135;
         if(var5 && var1 >= -743133593 * this.anInt_4480 - 1) {
            return null;
         }

         this.method3408(var1, var2, var3, (short)21402);
      }

      return this.tiles[var1][var2][var3];
   }

   public void method3408(int var1, int var2, int var3, short var4) {
      boolean var5 = this.tiles[0][var2][var3] != null && null != this.tiles[0][var2][var3].aClass638_10135;

      for(int var6 = var1; var6 >= 0; --var6) {
         if(this.tiles[var6][var2][var3] == null) {
            Class638 var7 = this.tiles[var6][var2][var3] = new Class638(var6);
            if(var5) {
               ++var7.aByte_10129;
            }
         }
      }

   }

   public int method3409(int var1, int var2, int var3) {
      return this.aByteArrayArray_4525 != null?this.aByteArrayArray_4525[var1][var2] & 255:0;
   }

   public int method3410(int var1, int var2, int var3) {
      return null != this.aByteArrayArray_4493?this.aByteArrayArray_4493[var1][var2] & 255:0;
   }

   public int method3411(int var1, int var2, int var3) {
      return null != this.aByteArrayArray_4494?this.aByteArrayArray_4494[var1][var2] & 255:0;
   }

   public void method3412(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      if(this.anIntArrayArray_4489 != null) {
         this.anIntArrayArray_4489[var1][var2] = -16777216 | var3;
      }

      if(this.aShortArrayArray_4490 != null) {
         this.aShortArrayArray_4490[var1][var2] = (short)var4;
      }

      if(this.aByteArrayArray_4525 != null) {
         this.aByteArrayArray_4525[var1][var2] = (byte)var5;
      }

      if(this.aByteArrayArray_4472 != null) {
         this.aByteArrayArray_4472[var1][var2] = (byte)var6;
      }

      if(this.aByteArrayArray_4493 != null) {
         this.aByteArrayArray_4493[var1][var2] = (byte)var7;
      }

      if(null != this.aByteArrayArray_4494) {
         this.aByteArrayArray_4494[var1][var2] = (byte)var8;
      }

   }

   public void method3413(int var1, int var2, int var3, Class563_Sub1_Sub1 var4, byte var5) {
      Class638 var6 = this.method3407(var1, var2, var3, -1691027955);
      if(null != var6) {
         var6.aClass563_Sub1_Sub1_10138 = var4;
         int var7 = this.planes == this.aClass171Array_4492?1:0;
         if(var4.method4721(-1219058453)) {
            if(var4.method4722((byte)-126)) {
               var4.aClass563_Sub1_6937 = this.aClass563_Sub1Array_4500[var7];
               this.aClass563_Sub1Array_4500[var7] = var4;
            } else {
               var4.aClass563_Sub1_6937 = this.aClass563_Sub1Array_4499[var7];
               this.aClass563_Sub1Array_4499[var7] = var4;
            }
         } else {
            var4.aClass563_Sub1_6937 = this.aClass563_Sub1Array_4501[var7];
            this.aClass563_Sub1Array_4501[var7] = var4;
         }
      }

   }

   public void method3414(int var1, int var2, int var3, int var4, Class563_Sub1_Sub2 var5, int var6) {
      Class638 var7 = this.method3407(var1, var2, var3, -2117719833);
      if(var7 != null) {
         var5.setPos(new GameCoord((float)(-569208769 * this.anInt_4473 + (var2 << 725150473 * this.shiftAmount)), (float)var4, (float)((var3 << this.shiftAmount * 725150473) + -569208769 * this.anInt_4473)));
         var7.aClass563_Sub1_Sub2_10136 = var5;
         int var8 = this.aClass171Array_4492 == this.planes?1:0;
         if(var5.method4721(-1219058453)) {
            if(var5.method4722((byte)-125)) {
               var5.aClass563_Sub1_6937 = this.aClass563_Sub1Array_4500[var8];
               this.aClass563_Sub1Array_4500[var8] = var5;
            } else {
               var5.aClass563_Sub1_6937 = this.aClass563_Sub1Array_4499[var8];
               this.aClass563_Sub1Array_4499[var8] = var5;
            }
         } else {
            var5.aClass563_Sub1_6937 = this.aClass563_Sub1Array_4501[var8];
            this.aClass563_Sub1Array_4501[var8] = var5;
         }
      }

   }

   public void method3415(Class240_Sub22_Sub7 var1, int var2, int var3, int var4, boolean[] var5, byte var6) {
      if(this.aClass171Array_4492 != this.planes) {
         int var7 = this.aClass171Array_4486[var2].getHeight(var3, var4);

         for(int var8 = 0; var8 <= var2; ++var8) {
            if(null == var5 || var5[var8]) {
               Plane var9 = this.aClass171Array_4486[var8];
               if(var9 != null) {
                  var9.method2158(var1, var3, var7 - var9.getHeight(var3, var4), var4, 0, false);
               }
            }
         }
      }

   }

   public PositionEntity method3416(int var1, int var2, int var3, Class264 var4, int var5) {
      Class638 var6 = this.tiles[var1][var2][var3];
      if(var6 == null) {
         return null;
      } else {
         for(Class629 var7 = var6.aClass629_10137; var7 != null; var7 = var7.aClass629_10073) {
            PositionEntity var8 = var7.aClass563_Sub1_Sub4_10075;
            if((var4 == null || var4.method3511(var8, (byte)19)) && var2 == var8.locX && var3 == var8.locY) {
               return var8;
            }
         }

         return null;
      }
   }

   public void method3417(byte var1) {
      for(int var2 = 0; var2 < 1775205107 * this.anInt_4495; ++var2) {
         PositionEntity var3 = this.aClass563_Sub1_Sub4Array_4506[var2];
         this.method3443(var3, true, (byte)-32);
         this.aClass563_Sub1_Sub4Array_4506[var2] = null;
      }

      this.anInt_4495 = 0;
   }

   public Class563_Sub1_Sub5 method3418(int var1, int var2, int var3, int var4) {
      Class638 var5 = this.tiles[var1][var2][var3];
      if(null != var5) {
         this.method3422(var5.aClass563_Sub1_Sub5_10131, (byte)-7);
         if(null != var5.aClass563_Sub1_Sub5_10131) {
            Class563_Sub1_Sub5 var6 = var5.aClass563_Sub1_Sub5_10131;
            var5.aClass563_Sub1_Sub5_10131 = null;
            return var6;
         }
      }

      return null;
   }

   public Class563_Sub1_Sub5 method3419(int var1, int var2, int var3, short var4) {
      Class638 var5 = this.tiles[var1][var2][var3];
      if(null != var5) {
         this.method3422(var5.aClass563_Sub1_Sub5_10132, (byte)-78);
         if(null != var5.aClass563_Sub1_Sub5_10132) {
            Class563_Sub1_Sub5 var6 = var5.aClass563_Sub1_Sub5_10132;
            var5.aClass563_Sub1_Sub5_10132 = null;
            return var6;
         }
      }

      return null;
   }

   public WorldObjects(Renderer var1, int var2, int var3, int var4, int var5, int var6, boolean var7, boolean var8) {
      this.aRenderer_4475 = var1;
      this.aBoolean_4519 = this.aRenderer_4475.method1994() > 0;
      this.shiftAmount = var2 * 1850872633;
      this.anInt_4530 = 982219389 * (1 << this.shiftAmount * 725150473);
      this.anInt_4473 = (this.anInt_4530 * -1510650155 >> 1) * 195125183;
      this.anInt_4480 = -1075409577 * var3;
      this.anInt_4481 = var4 * 1974390049;
      this.anInt_4479 = var5 * -1063814093;
      this.anInt_4498 = -849900193 * var6;
      this.aClass499_4476 = new Class499();
      this.aClass269_4485 = new Class269(this);
      this.aClass638ArrayArrayArray_4510 = new Class638[var3][1346434785 * this.anInt_4481][-1775771909 * this.anInt_4479];
      this.aClass171Array_4486 = new Plane[var3];
      if(var7) {
         this.anIntArrayArray_4489 = new int[1346434785 * this.anInt_4481][this.anInt_4479 * -1775771909];
         this.aByteArrayArray_4525 = new byte[1346434785 * this.anInt_4481][-1775771909 * this.anInt_4479];
         this.aShortArrayArray_4490 = new short[this.anInt_4481 * 1346434785][-1775771909 * this.anInt_4479];
         this.aByteArrayArray_4472 = new byte[this.anInt_4481 * 1346434785][this.anInt_4479 * -1775771909];
         this.aByteArrayArray_4493 = new byte[1346434785 * this.anInt_4481][-1775771909 * this.anInt_4479];
         this.aByteArrayArray_4494 = new byte[this.anInt_4481 * 1346434785][-1775771909 * this.anInt_4479];
         this.aClass638ArrayArrayArray_4487 = new Class638[1][this.anInt_4481 * 1346434785][this.anInt_4479 * -1775771909];
         this.aClass171Array_4492 = new Plane[1];
      }

      if(var8) {
         this.aLongArrayArrayArray_4471 = new long[var3][var4][var5];
         this.aClass265Array_4526 = new Class265['\ufe7e'];
         this.aBooleanArray_4527 = new boolean['\ufe7e'];
         this.anInt_4528 = 0;
      }

      this.method3404(false, (byte)3);
      this.aClass563_Sub1Array_4499 = new Class563_Sub1[2];
      this.aClass563_Sub1Array_4500 = new Class563_Sub1[2];
      this.aClass563_Sub1Array_4501 = new Class563_Sub1[2];
      this.visibleObjects = new Class563_Sub1[10039];
      this.visibleObjectsCount = 0;
      this.hiddenObjects = new Class563_Sub1[5001];
      this.hiddenObjectsCount = 0;
      this.aClass563_Sub1_Sub4Array_4506 = new PositionEntity[5075];
      this.anInt_4495 = 0;
      this.aBooleanArrayArray_4531 = new boolean[1 + this.anInt_4498 * -644084065 + this.anInt_4498 * -644084065][this.anInt_4498 * -644084065 + -644084065 * this.anInt_4498 + 1];
      this.aBooleanArrayArray_4502 = new boolean[this.anInt_4498 * -644084065 + this.anInt_4498 * -644084065 + 2][-644084065 * this.anInt_4498 + -644084065 * this.anInt_4498 + 2];
      this.anIntArray_4529 = new int[-644084065 * this.anInt_4498 + -644084065 * this.anInt_4498 + 2];
      this.aClass636_4518 = new Class636(false);
   }

   public int method3420(int var1, int var2, int var3) {
      return this.aShortArrayArray_4490 != null?this.aShortArrayArray_4490[var1][var2] & '\uffff':0;
   }

   public PositionEntity method3421(int var1, int var2, int var3, Class264 var4, int var5) {
      Class638 var6 = this.tiles[var1][var2][var3];
      if(null == var6) {
         return null;
      } else {
         for(Class629 var7 = var6.aClass629_10137; null != var7; var7 = var7.aClass629_10073) {
            PositionEntity var8 = var7.aClass563_Sub1_Sub4_10075;
            if((var4 == null || var4.method3511(var8, (byte)27)) && var2 == var8.locX && var3 == var8.locY) {
               this.method3443(var8, false, (byte)-101);
               return var8;
            }
         }

         return null;
      }
   }

   void method3422(Class563_Sub1 var1, byte var2) {
      if(var1 != null) {
         var1.method6212();

         for(int var3 = 0; var3 < 2; ++var3) {
            Class563_Sub1 var4 = null;

            Class563_Sub1 var5;
            for(var5 = this.aClass563_Sub1Array_4499[var3]; null != var5; var5 = var5.aClass563_Sub1_6937) {
               if(var1 == var5) {
                  if(var4 != null) {
                     var4.aClass563_Sub1_6937 = var5.aClass563_Sub1_6937;
                  } else {
                     this.aClass563_Sub1Array_4499[var3] = var5.aClass563_Sub1_6937;
                  }

                  return;
               }

               var4 = var5;
            }

            var4 = null;

            for(var5 = this.aClass563_Sub1Array_4500[var3]; var5 != null; var5 = var5.aClass563_Sub1_6937) {
               if(var5 == var1) {
                  if(null != var4) {
                     var4.aClass563_Sub1_6937 = var5.aClass563_Sub1_6937;
                  } else {
                     this.aClass563_Sub1Array_4500[var3] = var5.aClass563_Sub1_6937;
                  }

                  return;
               }

               var4 = var5;
            }

            var4 = null;

            for(var5 = this.aClass563_Sub1Array_4501[var3]; var5 != null; var5 = var5.aClass563_Sub1_6937) {
               if(var1 == var5) {
                  if(var4 != null) {
                     var4.aClass563_Sub1_6937 = var5.aClass563_Sub1_6937;
                  } else {
                     this.aClass563_Sub1Array_4501[var3] = var5.aClass563_Sub1_6937;
                  }

                  return;
               }

               var4 = var5;
            }
         }

      }
   }

   public Class563_Sub1_Sub5 method3423(int var1, int var2, int var3, byte var4) {
      Class638 var5 = this.tiles[var1][var2][var3];
      return null == var5?null:var5.aClass563_Sub1_Sub5_10131;
   }

   public Class563_Sub1_Sub5 method3424(int var1, int var2, int var3, int var4) {
      Class638 var5 = this.tiles[var1][var2][var3];
      return null == var5?null:var5.aClass563_Sub1_Sub5_10132;
   }

   public Class563_Sub1_Sub3 method3425(int var1, int var2, int var3, int var4) {
      Class638 var5 = this.tiles[var1][var2][var3];
      return null == var5?null:var5.aClass563_Sub1_Sub3_10133;
   }

   public Class563_Sub1_Sub2 method3426(int var1, int var2, int var3, int var4) {
      Class638 var5 = this.tiles[var1][var2][var3];
      return null == var5?null:var5.aClass563_Sub1_Sub2_10136;
   }

   public Class629 method3427(int var1, int var2, int var3, byte var4) {
      Class638 var5 = this.tiles[var1][var2][var3];
      return var5 == null?null:var5.aClass629_10137;
   }

   public Class563_Sub1_Sub1 method3428(int var1, int var2, int var3, int var4) {
      Class638 var5 = this.tiles[var1][var2][var3];
      return null != var5 && null != var5.aClass563_Sub1_Sub1_10138?var5.aClass563_Sub1_Sub1_10138:null;
   }

   public void method3429() {
      for(int var1 = 0; var1 < -743133593 * this.anInt_4480; ++var1) {
         for(int var2 = 0; var2 < 1346434785 * this.anInt_4481; ++var2) {
            for(int var3 = 0; var3 < -1775771909 * this.anInt_4479; ++var3) {
               Class638 var4 = this.tiles[var1][var2][var3];
               if(var4 != null) {
                  Class563_Sub1_Sub5 var5 = var4.aClass563_Sub1_Sub5_10131;
                  Class563_Sub1_Sub5 var6 = var4.aClass563_Sub1_Sub5_10132;
                  if(var5 != null && var5.method4731(1044591359)) {
                     this.method3453(var5, var1, var2, var3, 1, 1);
                     if(var6 != null && var6.method4731(1044591359)) {
                        this.method3453(var6, var1, var2, var3, 1, 1);
                        var6.method4720(this.aRenderer_4475, var5, 0, 0, 0, false, 1190359532);
                        var6.method4723(1880960478);
                     }

                     var5.method4723(-1919716922);
                  }

                  for(Class629 var7 = var4.aClass629_10137; var7 != null; var7 = var7.aClass629_10073) {
                     PositionEntity var8 = var7.aClass563_Sub1_Sub4_10075;
                     if(var8 != null && var8.method4731(1044591359)) {
                        this.method3453(var8, var1, var2, var3, 1 + (var8.locX2 - var8.locX), 1 + (var8.locY2 - var8.locY));
                        var8.method4723(-1681357754);
                     }
                  }

                  Class563_Sub1_Sub1 var9 = var4.aClass563_Sub1_Sub1_10138;
                  if(null != var9 && var9.method4731(1044591359)) {
                     this.method3430(var9, var1, var2, var3, 1721848729);
                     var9.method4723(183617750);
                  }
               }
            }
         }
      }

   }

   void method3430(Class563_Sub1 var1, int var2, int var3, int var4, int var5) {
      Class638 var6;
      int var7;
      if(var3 < this.anInt_4481 * 1346434785) {
         var6 = this.tiles[var2][1 + var3][var4];
         if(null != var6 && var6.aClass563_Sub1_Sub1_10138 != null && var6.aClass563_Sub1_Sub1_10138.method4731(1044591359)) {
            var7 = (this.planes[var2].method2155(var3 + 1, var4, (short)26310) + this.planes[var2].method2155(1 + var3 + 1, var4, (short)17130) + this.planes[var2].method2155(var3 + 1, 1 + var4, (short)12580) + this.planes[var2].method2155(var3 + 1 + 1, 1 + var4, (short)18730)) / 4 - (this.planes[var2].method2155(var3, var4, (short)5675) + this.planes[var2].method2155(var3 + 1, var4, (short)17339) + this.planes[var2].method2155(var3, var4 + 1, (short)7324) + this.planes[var2].method2155(1 + var3, 1 + var4, (short)-342)) / 4;
            var1.method4720(this.aRenderer_4475, var6.aClass563_Sub1_Sub1_10138, this.anInt_4530 * -1510650155, var7, 0, true, 557018384);
         }
      }

      if(var4 < this.anInt_4481 * 1346434785) {
         var6 = this.tiles[var2][var3][var4 + 1];
         if(null != var6 && null != var6.aClass563_Sub1_Sub1_10138 && var6.aClass563_Sub1_Sub1_10138.method4731(1044591359)) {
            var7 = (this.planes[var2].method2155(var3, var4, (short)-12676) + this.planes[var2].method2155(var3 + 1, 1 + var4, (short)3327) + this.planes[var2].method2155(var3, 1 + var4 + 1, (short)17427) + this.planes[var2].method2155(var3 + 1, var4 + 1 + 1, (short)21054)) / 4 - (this.planes[var2].method2155(var3, var4, (short)-4984) + this.planes[var2].method2155(var3 + 1, var4, (short)-4016) + this.planes[var2].method2155(var3, 1 + var4, (short)10474) + this.planes[var2].method2155(1 + var3, 1 + var4, (short)-5265)) / 4;
            var1.method4720(this.aRenderer_4475, var6.aClass563_Sub1_Sub1_10138, 0, var7, -1510650155 * this.anInt_4530, true, 1839463306);
         }
      }

      if(var3 < 1346434785 * this.anInt_4481 && var4 < this.anInt_4479 * -1775771909) {
         var6 = this.tiles[var2][var3 + 1][var4 + 1];
         if(null != var6 && var6.aClass563_Sub1_Sub1_10138 != null && var6.aClass563_Sub1_Sub1_10138.method4731(1044591359)) {
            var7 = (this.planes[var2].method2155(1 + var3, 1 + var4, (short)1525) + this.planes[var2].method2155(var3 + 1 + 1, 1 + var4, (short)-10874) + this.planes[var2].method2155(var3 + 1, 1 + var4 + 1, (short)-4861) + this.planes[var2].method2155(1 + 1 + var3, var4 + 1 + 1, (short)-11966)) / 4 - (this.planes[var2].method2155(var3, var4, (short)-3765) + this.planes[var2].method2155(var3 + 1, var4, (short)29409) + this.planes[var2].method2155(var3, 1 + var4, (short)10514) + this.planes[var2].method2155(var3 + 1, var4 + 1, (short)-3228)) / 4;
            var1.method4720(this.aRenderer_4475, var6.aClass563_Sub1_Sub1_10138, -1510650155 * this.anInt_4530, var7, this.anInt_4530 * -1510650155, true, 1257453634);
         }
      }

      if(var3 < 1346434785 * this.anInt_4481 && var4 > 0) {
         var6 = this.tiles[var2][var3 + 1][var4 - 1];
         if(var6 != null && var6.aClass563_Sub1_Sub1_10138 != null && var6.aClass563_Sub1_Sub1_10138.method4731(1044591359)) {
            var7 = (this.planes[var2].method2155(var3 + 1, var4 - 1, (short)22388) + this.planes[var2].method2155(1 + 1 + var3, var4 - 1, (short)10724) + this.planes[var2].method2155(var3 + 1, 1 + var4 - 1, (short)-5883) + this.planes[var2].method2155(1 + 1 + var3, 1 + var4 - 1, (short)-3783)) / 4 - (this.planes[var2].method2155(var3, var4, (short)5861) + this.planes[var2].method2155(var3 + 1, var4, (short)-826) + this.planes[var2].method2155(var3, 1 + var4, (short)-6060) + this.planes[var2].method2155(var3 + 1, var4 + 1, (short)26972)) / 4;
            var1.method4720(this.aRenderer_4475, var6.aClass563_Sub1_Sub1_10138, this.anInt_4530 * -1510650155, var7, -(this.anInt_4530 * -1510650155), true, 1990617871);
         }
      }

   }

   public void method3431(int var1, int var2, int var3, int var4, byte[][][] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, int var11, byte var12, int var13, int var14, boolean var15, boolean var16, int var17, boolean var18) {
      this.aClass269_4485.aBoolean_4648 = true;
      this.aBoolean_4514 = var16;
      this.anInt_4521 = (var2 >> 725150473 * this.shiftAmount) * 1834897837;
      this.anInt_4508 = -343682937 * (var4 >> 725150473 * this.shiftAmount);
      this.anInt_4509 = -223484909 * var2;
      this.anInt_4478 = 1975806285 * var4;
      this.anInt_4511 = -755243433 * var3;
      this.anInt_4524 = this.anInt_4521 * 1822822979 - this.anInt_4498 * 24036377;
      if(this.anInt_4524 * 1364918135 < 0) {
         this.anInt_4488 = -(this.anInt_4524 * -1913077921);
         this.anInt_4524 = 0;
      } else {
         this.anInt_4488 = 0;
      }

      this.anInt_4516 = 2027761913 * this.anInt_4508 - -1701953519 * this.anInt_4498;
      if(-154332241 * this.anInt_4516 < 0) {
         this.anInt_4515 = -(this.anInt_4516 * -894553239);
         this.anInt_4516 = 0;
      } else {
         this.anInt_4515 = 0;
      }

      this.anInt_4517 = 438326161 * this.anInt_4521 + this.anInt_4498 * 2015935011;
      if(this.anInt_4517 * 1243237205 > this.anInt_4481 * 1346434785) {
         this.anInt_4517 = this.anInt_4481 * -1532021411;
      }

      this.anInt_4503 = this.anInt_4498 * 97407823 + this.anInt_4508 * 1337262439;
      if(this.anInt_4503 * -1747256399 > -1775771909 * this.anInt_4479) {
         this.anInt_4503 = this.anInt_4479 * -653104021;
      }

      boolean[][] var19 = this.aBooleanArrayArray_4531;
      boolean[][] var20 = this.aBooleanArrayArray_4502;
      int var21;
      int var22;
      if(this.aBoolean_4514) {
         for(var21 = 0; var21 < this.anInt_4498 * -644084065 + this.anInt_4498 * -644084065 + 2; ++var21) {
            var22 = 0;
            int var23 = 0;

            for(int var24 = 0; var24 < this.anInt_4498 * -644084065 + this.anInt_4498 * -644084065 + 2; ++var24) {
               if(var24 > 1) {
                  this.anIntArray_4529[var24 - 2] = var22;
               }

               var22 = var23;
               int var25 = this.anInt_4521 * -1947125211 - -644084065 * this.anInt_4498 + var21;
               int var26 = var24 + (-2026113737 * this.anInt_4508 - -644084065 * this.anInt_4498);
               int var27;
               if(var25 >= 0 && var26 >= 0 && var25 < this.anInt_4481 * 1346434785 && var26 < -1775771909 * this.anInt_4479) {
                  var27 = var25 << 725150473 * this.shiftAmount;
                  int var28 = var26 << this.shiftAmount * 725150473;
                  int var29 = this.aClass171Array_4486[this.aClass171Array_4486.length - 1].method2155(var25, var26, (short)8489) - (1000 << 725150473 * this.shiftAmount - 7);
                  int var30 = (null != this.aClass171Array_4492?this.aClass171Array_4492[0].method2155(var25, var26, (short)11511) + this.anInt_4530 * -1510650155:this.aClass171Array_4486[0].method2155(var25, var26, (short)-1258) + this.anInt_4530 * -1510650155) + (1000 << this.shiftAmount * 725150473 - 7);
                  var23 = this.aRenderer_4475.method1978(var27, var29, var28, var27, var30, var28);
                  this.aBooleanArrayArray_4502[var21][var24] = var23 == 0;
               } else {
                  var23 = -1;
                  this.aBooleanArrayArray_4502[var21][var24] = false;
               }

               if(var21 > 0 && var24 > 0) {
                  var27 = this.anIntArray_4529[var24 - 1] & this.anIntArray_4529[var24] & var22 & var23;
                  this.aBooleanArrayArray_4531[var21 - 1][var24 - 1] = var27 == 0;
               }
            }

            this.anIntArray_4529[-644084065 * this.anInt_4498 + -644084065 * this.anInt_4498] = var22;
            this.anIntArray_4529[this.anInt_4498 * -644084065 + this.anInt_4498 * -644084065 + 1] = var23;
         }

         if(!var18) {
            this.aClass269_4485.aBoolean_4648 = false;
         } else {
            this.aClass269_4485.anIntArray_4666 = var6;
            this.aClass269_4485.anIntArray_4667 = var7;
            this.aClass269_4485.anIntArray_4668 = var8;
            this.aClass269_4485.anIntArray_4669 = var9;
            this.aClass269_4485.anIntArray_4675 = var10;
            this.aClass269_4485.method3537(this.aRenderer_4475, var11);
         }
      } else {
         if(this.aBooleanArrayArray_4532 == null) {
            this.aBooleanArrayArray_4532 = new boolean[2 + this.anInt_4498 * -644084065 + this.anInt_4498 * -644084065][2 + -644084065 * this.anInt_4498 + this.anInt_4498 * -644084065];
         }

         for(var21 = 0; var21 < this.aBooleanArrayArray_4532.length; ++var21) {
            for(var22 = 0; var22 < this.aBooleanArrayArray_4532[0].length; ++var22) {
               this.aBooleanArrayArray_4532[var21][var22] = true;
            }
         }

         this.aBooleanArrayArray_4502 = this.aBooleanArrayArray_4532;
         this.aBooleanArrayArray_4531 = this.aBooleanArrayArray_4532;
         this.anInt_4524 = 0;
         this.anInt_4516 = 0;
         this.anInt_4517 = -1532021411 * this.anInt_4481;
         this.anInt_4503 = -653104021 * this.anInt_4479;
         this.aClass269_4485.aBoolean_4648 = false;
      }

      CacheDownload.method4779(this, this.aRenderer_4475, -1533901120);
      if(!this.aClass636_4518.aBoolean_10100) {
         Iterator var31 = this.aClass636_4518.aList_10102.iterator();

         while(var31.hasNext()) {
            Class268 var32 = (Class268)var31.next();
            var31.remove();
            Class576.method6296(var32, -1135753450);
         }
      }

      if(this.aBoolean_4519) {
         for(var21 = 0; var21 < this.anInt_4528 * -1744116241; ++var21) {
            this.aClass265Array_4526[var21].method3515(var1, var15, -2048442141);
         }
      }

      if(this.aClass638ArrayArrayArray_4487 != null) {
         this.method3404(true, (byte)3);
         this.aRenderer_4475.method1957(-1, new Class105(1583160, 40, 127, 63, 0, 0, 0));
         this.method3437(true, var5, var11, var12, var17);
         this.aRenderer_4475.method1981();
         this.method3404(false, (byte)3);
      }

      this.method3437(false, var5, var11, var12, var17);
      if(!this.aBoolean_4514) {
         this.aBooleanArrayArray_4531 = var19;
         this.aBooleanArrayArray_4502 = var20;
      }

   }

   void getZIndex(Class563_Sub1 var1, int var2) {
      GameCoord var3 = var1.method6203().gameCoord;
      this.aRenderer_4475.getScreenPosHidden((float)((int)var3.floatX), (float)((int)var3.floatY + (var1.method4732(481032064) >> 1)), (float)((int)var3.floatZ), this.aFloatArray_4520);
      var1.zIndex = 206076851 * (int)this.aFloatArray_4520[2];
   }

   void sortObjectsHighestZ(Class563_Sub1[] var1, int var2, int var3) {
      if(var2 < var3) {
         int var4 = (var3 + var2) / 2;
         int var5 = var2;
         Class563_Sub1 var6 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var6;
         int var7 = 1631890299 * var6.zIndex;

         for(int var8 = var2; var8 < var3; ++var8) {
            if(1631890299 * var1[var8].zIndex > var7 + (var8 & 1)) {
               Class563_Sub1 var9 = var1[var8];
               var1[var8] = var1[var5];
               var1[var5++] = var9;
            }
         }

         var1[var3] = var1[var5];
         var1[var5] = var6;
         this.sortObjectsHighestZ(var1, var2, var5 - 1);
         this.sortObjectsHighestZ(var1, 1 + var5, var3);
      }

   }

   void sortObjectsLowestZ(Class563_Sub1[] var1, int var2, int var3) {
      if(var2 < var3) {
         int var4 = (var2 + var3) / 2;
         int var5 = var2;
         Class563_Sub1 var6 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var6;
         int var7 = 1631890299 * var6.zIndex;

         for(int var8 = var2; var8 < var3; ++var8) {
            if(1631890299 * var1[var8].zIndex < var7 + (var8 & 1)) {
               Class563_Sub1 var9 = var1[var8];
               var1[var8] = var1[var5];
               var1[var5++] = var9;
            }
         }

         var1[var3] = var1[var5];
         var1[var5] = var6;
         this.sortObjectsLowestZ(var1, var2, var5 - 1);
         this.sortObjectsLowestZ(var1, var5 + 1, var3);
      }

   }

   boolean method3435(Class563_Sub1 var1, boolean var2, byte[][][] var3, int var4, byte var5) {
      if(!this.aBoolean_4514) {
         return false;
      } else if(var1 instanceof PositionEntity) {
         short var12 = ((PositionEntity)var1).locX2;
         short var13 = ((PositionEntity)var1).locY2;
         short var14 = ((PositionEntity)var1).locX;
         short var9 = ((PositionEntity)var1).locY;

         for(int var10 = var14; var10 <= var12; ++var10) {
            for(int var11 = var9; var11 <= var13; ++var11) {
               if(var1.aByte_6942 < -743133593 * this.anInt_4480 && var10 >= this.anInt_4524 * 1364918135 && var10 < this.anInt_4517 * 1243237205 && var11 >= -154332241 * this.anInt_4516 && var11 < -1747256399 * this.anInt_4503) {
                  if((null == var3 || var1.plane < var4 || var5 != var3[var1.plane][var10][var11]) && var1.method4726(2032617996) && !var1.method4734(this.aRenderer_4475, 303683983)) {
                     return false;
                  }

                  if(!var2 && var10 >= this.anInt_4521 * -1947125211 - 16 && var10 <= -1947125211 * this.anInt_4521 + 16 && var11 >= this.anInt_4508 * -2026113737 - 16 && var11 <= this.anInt_4508 * -2026113737 + 16) {
                     var1.method4724(this.aRenderer_4475);
                  }

                  return true;
               }
            }
         }

         return true;
      } else {
         GameCoord var6 = var1.method6203().gameCoord;
         int var7 = (int)var6.floatX >> this.shiftAmount * 725150473;
         int var8 = (int)var6.floatZ >> this.shiftAmount * 725150473;
         if(var1.aByte_6942 < this.anInt_4480 * -743133593 && var7 >= this.anInt_4524 * 1364918135 && var7 < this.anInt_4517 * 1243237205 && var8 >= -154332241 * this.anInt_4516 && var8 < -1747256399 * this.anInt_4503) {
            if((null == var3 || var1.plane < var4 || var5 != var3[var1.plane][var7][var8]) && var1.method4726(-671297160) && !var1.method4734(this.aRenderer_4475, -2145020634)) {
               return false;
            } else {
               if(!var2 && var7 >= -1947125211 * this.anInt_4521 - 16 && var7 <= 16 + -1947125211 * this.anInt_4521 && var8 >= -2026113737 * this.anInt_4508 - 16 && var8 <= 16 + -2026113737 * this.anInt_4508) {
                  var1.method4724(this.aRenderer_4475);
               }

               return true;
            }
         } else {
            return true;
         }
      }
   }

   public boolean method3436(Class240_Sub22_Sub7 var1, int var2, int var3, int var4, boolean[] var5, int var6) {
      boolean var7 = false;
      if(this.aClass171Array_4492 != this.planes) {
         int var8 = this.aClass171Array_4486[var2].getHeight(var3, var4);

         for(int var9 = 0; var9 <= var2; ++var9) {
            Plane var10 = this.aClass171Array_4486[var9];
            if(null != var10) {
               int var11 = var8 - var10.getHeight(var3, var4);
               if(null != var5) {
                  var5[var9] = var10.method2159(var1, var3, var11, var4, 0, false);
                  if(!var5[var9]) {
                     continue;
                  }
               }

               var10.method2157(var1, var3, var11, var4, 0, false);
               var7 = true;
            }
         }
      }

      return var7;
   }

   void method3437(boolean var1, byte[][][] var2, int var3, byte var4, int var5) {
      int var6 = var1?1:0;
      this.visibleObjectsCount = 0;
      this.hiddenObjectsCount = 0;
      this.anInt_4512 += 68628089;
      Class563_Sub1 var7;
      if((var5 & 2) == 0) {
         for(var7 = this.aClass563_Sub1Array_4499[var6]; var7 != null; var7 = var7.aClass563_Sub1_6937) {
            this.getZIndex(var7, -1948561799);
            if(-1 != var7.zIndex * 1631890299 && !this.method3435(var7, var1, var2, var3, var4)) {
               this.visibleObjects[(this.visibleObjectsCount += -929496111) * 892089649 - 1] = var7;
            }
         }
      }

      int var16;
      if(0 == (var5 & 1)) {
         for(var7 = this.aClass563_Sub1Array_4500[var6]; null != var7; var7 = var7.aClass563_Sub1_6937) {
            this.getZIndex(var7, -1481990397);
            if(var7.zIndex * 1631890299 != -1 && !this.method3435(var7, var1, var2, var3, var4)) {
               this.hiddenObjects[(this.hiddenObjectsCount += -298530421) * 1312003619 - 1] = var7;
            }
         }

         for(var7 = this.aClass563_Sub1Array_4501[var6]; null != var7; var7 = var7.aClass563_Sub1_6937) {
            this.getZIndex(var7, -1488042262);
            if(-1 != var7.zIndex * 1631890299 && !this.method3435(var7, var1, var2, var3, var4)) {
               if(var7.method4722((byte)-112)) {
                  this.hiddenObjects[(this.hiddenObjectsCount += -298530421) * 1312003619 - 1] = var7;
               } else {
                  this.visibleObjects[(this.visibleObjectsCount += -929496111) * 892089649 - 1] = var7;
               }
            }
         }

         if(!var1) {
            for(var16 = 0; var16 < 1775205107 * this.anInt_4495; ++var16) {
               this.getZIndex(this.aClass563_Sub1_Sub4Array_4506[var16], -1270601429);
               if(this.aClass563_Sub1_Sub4Array_4506[var16].zIndex * 1631890299 != -1 && !this.method3435(this.aClass563_Sub1_Sub4Array_4506[var16], var1, var2, var3, var4)) {
                  if(this.aClass563_Sub1_Sub4Array_4506[var16].method4722((byte)-10)) {
                     this.hiddenObjects[(this.hiddenObjectsCount += -298530421) * 1312003619 - 1] = this.aClass563_Sub1_Sub4Array_4506[var16];
                  } else {
                     this.visibleObjects[(this.visibleObjectsCount += -929496111) * 892089649 - 1] = this.aClass563_Sub1_Sub4Array_4506[var16];
                  }
               }
            }
         }
      }

      if(892089649 * this.visibleObjectsCount > 0) {
         this.sortObjectsLowestZ(this.visibleObjects, 0, 892089649 * this.visibleObjectsCount - 1);

         for(var16 = 0; var16 < this.visibleObjectsCount * 892089649; ++var16) {
            this.method3441(this.visibleObjects[var16], this.aClass240_Sub53Array_4470);
         }
      }

      if(this.aBoolean_4519) {
         this.aRenderer_4475.method1993(0, (Class240_Sub53[])null);
      }

      if(0 == (var5 & 2)) {
         for(var16 = 0; var16 < this.anInt_4480 * -743133593; ++var16) {
            int var8;
            int var9;
            boolean[][] var10;
            int var11;
            int var12;
            int var13;
            if(var16 >= var3 && var2 != null) {
               var8 = this.aBooleanArrayArray_4531.length;
               if(this.aBooleanArrayArray_4531.length + this.anInt_4524 * 1364918135 > 1346434785 * this.anInt_4481) {
                  var8 -= 1364918135 * this.anInt_4524 + this.aBooleanArrayArray_4531.length - this.anInt_4481 * 1346434785;
               }

               var9 = this.aBooleanArrayArray_4531[0].length;
               if(this.anInt_4516 * -154332241 + this.aBooleanArrayArray_4531[0].length > this.anInt_4479 * -1775771909) {
                  var9 -= this.aBooleanArrayArray_4531[0].length + -154332241 * this.anInt_4516 - -1775771909 * this.anInt_4479;
               }

               var10 = this.aBooleanArrayArray_4502;
               if(this.aBoolean_4514) {
                  for(var11 = 1954967273 * this.anInt_4488; var11 < var8; ++var11) {
                     var12 = 1364918135 * this.anInt_4524 + var11 - this.anInt_4488 * 1954967273;

                     for(var13 = 1526227799 * this.anInt_4515; var13 < var9; ++var13) {
                        var10[var11][var13] = false;
                        if(this.aBooleanArrayArray_4531[var11][var13]) {
                           int var14 = -154332241 * this.anInt_4516 + var13 - 1526227799 * this.anInt_4515;

                           for(int var15 = var16; var15 >= 0; --var15) {
                              if(this.tiles[var15][var12][var14] != null && this.tiles[var15][var12][var14].aByte_10129 == var16) {
                                 if((var15 < var3 || var2[var15][var12][var14] != var4) && !this.aClass269_4485.method3540(var16, var12, var14)) {
                                    var10[var11][var13] = true;
                                 } else {
                                    var10[var11][var13] = false;
                                 }
                                 break;
                              }
                           }
                        }
                     }
                  }
               }

               this.planes[var16].method2161(this.anInt_4521 * -1947125211, this.anInt_4508 * -2026113737, -644084065 * this.anInt_4498, this.aBooleanArrayArray_4502, false, var5);
            } else {
               var8 = this.aBooleanArrayArray_4531.length;
               if(this.aBooleanArrayArray_4531.length + this.anInt_4524 * 1364918135 > this.anInt_4481 * 1346434785) {
                  var8 -= this.aBooleanArrayArray_4531.length + this.anInt_4524 * 1364918135 - this.anInt_4481 * 1346434785;
               }

               var9 = this.aBooleanArrayArray_4531[0].length;
               if(-154332241 * this.anInt_4516 + this.aBooleanArrayArray_4531[0].length > -1775771909 * this.anInt_4479) {
                  var9 -= this.aBooleanArrayArray_4531[0].length + -154332241 * this.anInt_4516 - -1775771909 * this.anInt_4479;
               }

               var10 = this.aBooleanArrayArray_4502;
               if(this.aBoolean_4514) {
                  for(var11 = this.anInt_4488 * 1954967273; var11 < var8; ++var11) {
                     var12 = var11 + this.anInt_4524 * 1364918135 - 1954967273 * this.anInt_4488;

                     for(var13 = this.anInt_4515 * 1526227799; var13 < var9; ++var13) {
                        if(this.aBooleanArrayArray_4531[var11][var13] && !this.aClass269_4485.method3540(var16, var12, var13 + this.anInt_4516 * -154332241 - 1526227799 * this.anInt_4515)) {
                           var10[var11][var13] = true;
                        } else {
                           var10[var11][var13] = false;
                        }
                     }
                  }
               }

               this.planes[var16].method2161(this.anInt_4521 * -1947125211, -2026113737 * this.anInt_4508, -644084065 * this.anInt_4498, this.aBooleanArrayArray_4502, true, var5);
            }
         }
      }

      if(this.hiddenObjectsCount * 1312003619 > 0) {
         this.sortObjectsHighestZ(this.hiddenObjects, 0, this.hiddenObjectsCount * 1312003619 - 1);

         for(var16 = 0; var16 < 1312003619 * this.hiddenObjectsCount; ++var16) {
            this.method3441(this.hiddenObjects[var16], this.aClass240_Sub53Array_4470);
         }
      }

   }

   public void method3438(byte var1) {
      for(int var2 = 0; var2 < -1744116241 * this.anInt_4528; ++var2) {
         if(!this.aBooleanArray_4527[var2]) {
            Class265 var3 = this.aClass265Array_4526[var2];
            Class240_Sub53 var4 = var3.aClass240_Sub53_4635;
            int var5 = var3.anInt_4628 * -1420871057;
            int var6 = var4.method5277(-1932051005) - -569208769 * this.anInt_4473;
            int var7 = 1 + (2 * var6 >> 725150473 * this.shiftAmount);
            int var8 = 0;
            int[] var9 = new int[var7 * var7];
            int var10 = var4.method5274((byte)49) - var6 >> this.shiftAmount * 725150473;
            int var11 = var4.method5276((byte)8) - var6 >> 725150473 * this.shiftAmount;
            int var12 = var4.method5276((byte)71) + var6 >> 725150473 * this.shiftAmount;
            if(var11 < 0) {
               var8 -= var11;
               var11 = 0;
            }

            if(var12 >= this.anInt_4479 * -1775771909) {
               var12 = -1775771909 * this.anInt_4479 - 1;
            }

            for(int var13 = var11; var13 <= var12; ++var13) {
               short var14 = var3.aShortArray_4629[var8];
               int var15 = var14 >>> 8;
               int var16 = var7 * var8 + var15;
               int var17 = var10 + (var14 >>> 8);
               int var18 = var17 + (var14 & 255) - 1;
               if(var17 < 0) {
                  var16 -= var17;
                  var17 = 0;
               }

               if(var18 >= this.anInt_4481 * 1346434785) {
                  var18 = this.anInt_4481 * 1346434785 - 1;
               }

               for(int var19 = var17; var19 <= var18; ++var19) {
                  byte var20 = 1;
                  PositionEntity var21 = this.method3416(var5, var19, var13, (Class264)null, -790693682);
                  if(var21 != null && 0 != var21.aByte_3295) {
                     boolean var23;
                     boolean var22;
                     int var25;
                     short var24;
                     int var26;
                     if(var21.aByte_3295 == 1) {
                        var22 = var19 - 1 >= var17;
                        var23 = var19 + 1 <= var18;
                        if(!var22 && var13 + 1 <= var12) {
                           var24 = var3.aShortArray_4629[1 + var8];
                           var25 = (var24 >>> 8) + var10;
                           var26 = var25 + (var24 & 255);
                           var22 = var19 > var25 && var19 < var26;
                        }

                        if(!var23 && var13 - 1 >= var11) {
                           var24 = var3.aShortArray_4629[var8 - 1];
                           var25 = (var24 >>> 8) + var10;
                           var26 = (var24 & 255) + var25;
                           var23 = var19 > var25 && var19 < var26;
                        }

                        if(var22 && !var23) {
                           var20 = 4;
                        } else if(var23 && !var22) {
                           var20 = 2;
                        }
                     } else {
                        var22 = var19 - 1 >= var17;
                        var23 = var19 + 1 <= var18;
                        if(!var22 && var13 - 1 >= var11) {
                           var24 = var3.aShortArray_4629[var8 - 1];
                           var25 = var10 + (var24 >>> 8);
                           var26 = var25 + (var24 & 255);
                           var22 = var19 > var25 && var19 < var26;
                        }

                        if(!var23 && 1 + var13 <= var12) {
                           var24 = var3.aShortArray_4629[1 + var8];
                           var25 = var10 + (var24 >>> 8);
                           var26 = (var24 & 255) + var25;
                           var23 = var19 > var25 && var19 < var26;
                        }

                        if(var22 && !var23) {
                           var20 = 3;
                        } else if(var23 && !var22) {
                           var20 = 5;
                        }
                     }
                  }

                  var9[var16++] = var20;
               }

               ++var8;
            }

            this.aBooleanArray_4527[var2] = true;
            if(aBoolean_4477) {
               this.planes[var5].method2160(var4, var9);
            }
         }
      }

   }

   public void method3439(int var1) {
      this.method3447(1, -743133593 * this.anInt_4480, (short)-9269);
   }

   public void method3440(Class265 var1, int var2) {
      if(this.anInt_4528 * -1744116241 < '\ufe7e') {
         Class240_Sub53 var3 = var1.aClass240_Sub53_4635;
         this.aClass265Array_4526[this.anInt_4528 * -1744116241] = var1;
         this.aBooleanArray_4527[this.anInt_4528 * -1744116241] = false;
         this.anInt_4528 += -1689589489;
         int var4 = -1420871057 * var1.anInt_4628;
         if(var1.aBoolean_4627) {
            var4 = 0;
         }

         int var5 = var1.anInt_4628 * -1420871057;
         if(var1.aBoolean_4626) {
            var5 = -743133593 * this.anInt_4480 - 1;
         }

         for(int var6 = var4; var6 <= var5; ++var6) {
            int var7 = 0;
            int var8 = var3.method5276((byte)3) - var3.method5277(-1932051005) + this.anInt_4473 * -569208769 >> 725150473 * this.shiftAmount;
            if(var8 < 0) {
               var7 -= var8;
               var8 = 0;
            }

            int var9 = var3.method5276((byte)85) + var3.method5277(-1932051005) - -569208769 * this.anInt_4473 >> this.shiftAmount * 725150473;
            if(var9 >= -1775771909 * this.anInt_4479) {
               var9 = -1775771909 * this.anInt_4479 - 1;
            }

            for(int var10 = var8; var10 <= var9; ++var10) {
               short var11 = var1.aShortArray_4629[var7++];
               int var12 = (var3.method5274((byte)75) - var3.method5277(-1932051005) + this.anInt_4473 * -569208769 >> this.shiftAmount * 725150473) + (var11 >>> 8);
               int var13 = var12 + (var11 & 255) - 1;
               if(var12 < 0) {
                  var12 = 0;
               }

               if(var13 >= 1346434785 * this.anInt_4481) {
                  var13 = this.anInt_4481 * 1346434785 - 1;
               }

               for(int var14 = var12; var14 <= var13; ++var14) {
                  long var15 = this.aLongArrayArrayArray_4471[var6][var14][var10];
                  if(0L == (var15 & 65535L)) {
                     this.aLongArrayArrayArray_4471[var6][var14][var10] = var15 | (long)(this.anInt_4528 * -1744116241);
                  } else if(0L == (var15 & 4294901760L)) {
                     this.aLongArrayArrayArray_4471[var6][var14][var10] = var15 | (long)(this.anInt_4528 * -1744116241) << 16;
                  } else if(0L == (var15 & 281470681743360L)) {
                     this.aLongArrayArrayArray_4471[var6][var14][var10] = var15 | (long)(-1744116241 * this.anInt_4528) << 32;
                  } else if(0L == (var15 & -281474976710656L)) {
                     this.aLongArrayArrayArray_4471[var6][var14][var10] = var15 | (long)(this.anInt_4528 * -1744116241) << 48;
                  }
               }
            }
         }

      }
   }

   void method3441(Class563_Sub1 var1, Class240_Sub53[] var2) {
      int var3;
      if(this.aBoolean_4519) {
         var3 = var1.method4725(var2, 1564385249);
         this.aRenderer_4475.method1993(var3, var2);
      }

      if(this.aClass171Array_4492 == this.planes) {
         boolean var7 = false;
         boolean var4 = false;
         GameCoord var5 = var1.method6203().gameCoord;
         int var8;
         if(var1 instanceof PositionEntity) {
            var3 = ((PositionEntity)var1).locX;
            var8 = ((PositionEntity)var1).locY;
         } else {
            var3 = (int)var5.floatX >> this.shiftAmount * 725150473;
            var8 = (int)var5.floatZ >> this.shiftAmount * 725150473;
         }

         Class105 var6 = new Class105();
         var6.anInt_1982 = this.method3454(var3, var8, (short)-4603) * -2086445537;
         var6.anInt_1981 = this.method3420(var3, var8, 227119114) * 313684481;
         var6.anInt_1985 = this.method3409(var3, var8, -1729080505) * -389863671;
         var6.anInt_1983 = this.method3444(var3, var8, -826647850) * 656375255;
         var6.anInt_1984 = this.method3410(var3, var8, 865839728) * 1726833909;
         var6.anInt_1979 = this.method3411(var3, var8, 625152451) * 1882640509;
         this.aRenderer_4475.method1958(this.aClass171Array_4486[0].getHeight((int)var5.floatX, (int)var5.floatZ), var6);
      }

      Class268 var9 = var1.method4719(this.aRenderer_4475, -1706216295);
      if(null != var9) {
         if(var9.aBoolean_4642) {
            var9.aClass563_Sub1_4643 = var1;
            this.aClass636_4518.method6716(var9, (byte)3);
         } else {
            Class576.method6296(var9, -864406977);
         }
      }

   }

   public void addPlane(int var1, Plane var2) {
      this.planes[var1] = var2;
   }

   void method3443(PositionEntity var1, boolean var2, byte var3) {
      for(int var4 = var1.locX; var4 <= var1.locX2; ++var4) {
         for(int var5 = var1.locY; var5 <= var1.locY2; ++var5) {
            Class638 var6 = this.tiles[var1.plane][var4][var5];
            if(var6 != null) {
               Class629 var7 = var6.aClass629_10137;

               for(Class629 var8 = null; null != var7; var7 = var7.aClass629_10073) {
                  if(var7.aClass563_Sub1_Sub4_10075 == var1) {
                     if(null != var8) {
                        var8.aClass629_10073 = var7.aClass629_10073;
                     } else {
                        var6.aClass629_10137 = var7.aClass629_10073;
                     }

                     var7.method6688(-801407986);
                     break;
                  }

                  var8 = var7;
               }
            }
         }
      }

      if(!var2) {
         this.method3422(var1, (byte)15);
      }

   }

   public int method3444(int var1, int var2, int var3) {
      return this.aByteArrayArray_4472 != null?this.aByteArrayArray_4472[var1][var2] & 255:0;
   }

   public Class563_Sub1_Sub2 method3445(int var1, int var2, int var3, int var4) {
      Class638 var5 = this.tiles[var1][var2][var3];
      if(null == var5) {
         return null;
      } else {
         Class563_Sub1_Sub2 var6 = var5.aClass563_Sub1_Sub2_10136;
         var5.aClass563_Sub1_Sub2_10136 = null;
         this.method3422(var6, (byte)-33);
         return var6;
      }
   }

   public Class563_Sub1_Sub3 method3446(int var1, int var2, int var3, byte var4) {
      Class638 var5 = this.tiles[var1][var2][var3];
      if(null != var5) {
         this.method3422(var5.aClass563_Sub1_Sub3_10133, (byte)-3);
         if(var5.aClass563_Sub1_Sub3_10133 != null) {
            Class563_Sub1_Sub3 var6 = var5.aClass563_Sub1_Sub3_10133;
            var5.aClass563_Sub1_Sub3_10133 = null;
            return var6;
         }
      }

      return null;
   }

   void method3447(int var1, int var2, short var3) {
      Class240_Sub22_Sub7 var4 = null;

      for(int var5 = var1; var5 < var2; ++var5) {
         Plane var6 = this.aClass171Array_4486[var5];
         if(var6 != null) {
            for(int var7 = 0; var7 < this.anInt_4479 * -1775771909; ++var7) {
               for(int var8 = 0; var8 < this.anInt_4481 * 1346434785; ++var8) {
                  var4 = var6.method2156(var8, var7, var4);
                  if(var4 != null) {
                     int var9 = var8 << 725150473 * this.shiftAmount;
                     int var10 = var7 << 725150473 * this.shiftAmount;

                     for(int var11 = var5 - 1; var11 >= 0; --var11) {
                        Plane var12 = this.aClass171Array_4486[var11];
                        if(var12 != null) {
                           int var13 = var6.method2155(var8, var7, (short)15909) - var12.method2155(var8, var7, (short)-19353);
                           int var14 = var6.method2155(var8 + 1, var7, (short)405) - var12.method2155(var8 + 1, var7, (short)5179);
                           int var15 = var6.method2155(var8 + 1, var7 + 1, (short)-10092) - var12.method2155(var8 + 1, 1 + var7, (short)21258);
                           int var16 = var6.method2155(var8, var7 + 1, (short)-3138) - var12.method2155(var8, var7 + 1, (short)-12376);
                           var12.method2157(var4, var9, (var16 + var14 + var13 + var15) / 4, var10, 0, false);
                        }
                     }
                  }
               }
            }
         }
      }

   }

   public void method3448(int var1, int var2, int var3, Class563_Sub1_Sub3 var4, Class563_Sub1_Sub3 var5, int var6) {
      Class638 var7 = this.method3407(var1, var2, var3, -1862439507);
      if(var7 != null) {
         var7.aClass563_Sub1_Sub3_10133 = var4;
         var7.aClass563_Sub1_Sub3_10134 = var5;
         int var8 = this.aClass171Array_4492 == this.planes?1:0;
         if(var4.method4721(-1219058453)) {
            if(var4.method4722((byte)-40)) {
               var4.aClass563_Sub1_6937 = this.aClass563_Sub1Array_4500[var8];
               this.aClass563_Sub1Array_4500[var8] = var4;
            } else {
               var4.aClass563_Sub1_6937 = this.aClass563_Sub1Array_4499[var8];
               this.aClass563_Sub1Array_4499[var8] = var4;
            }
         } else {
            var4.aClass563_Sub1_6937 = this.aClass563_Sub1Array_4501[var8];
            this.aClass563_Sub1Array_4501[var8] = var4;
         }

         if(var5 != null) {
            if(var5.method4721(-1219058453)) {
               if(var5.method4722((byte)-87)) {
                  var5.aClass563_Sub1_6937 = this.aClass563_Sub1Array_4500[var8];
                  this.aClass563_Sub1Array_4500[var8] = var5;
               } else {
                  var5.aClass563_Sub1_6937 = this.aClass563_Sub1Array_4499[var8];
                  this.aClass563_Sub1Array_4499[var8] = var5;
               }
            } else {
               var5.aClass563_Sub1_6937 = this.aClass563_Sub1Array_4501[var8];
               this.aClass563_Sub1Array_4501[var8] = var5;
            }
         }
      }

   }

   public void method3449(int var1, int var2, int var3, Class563_Sub1_Sub5 var4, Class563_Sub1_Sub5 var5, short var6) {
      Class638 var7 = this.method3407(var1, var2, var3, -1896238339);
      if(null != var7) {
         var7.aClass563_Sub1_Sub5_10131 = var4;
         var7.aClass563_Sub1_Sub5_10132 = var5;
         int var8 = this.planes == this.aClass171Array_4492?1:0;
         if(var4.method4721(-1219058453)) {
            if(var4.method4722((byte)-48)) {
               var4.aClass563_Sub1_6937 = this.aClass563_Sub1Array_4500[var8];
               this.aClass563_Sub1Array_4500[var8] = var4;
            } else {
               var4.aClass563_Sub1_6937 = this.aClass563_Sub1Array_4499[var8];
               this.aClass563_Sub1Array_4499[var8] = var4;
            }
         } else {
            var4.aClass563_Sub1_6937 = this.aClass563_Sub1Array_4501[var8];
            this.aClass563_Sub1Array_4501[var8] = var4;
         }

         if(null != var5) {
            if(var5.method4721(-1219058453)) {
               if(var5.method4722((byte)-72)) {
                  var5.aClass563_Sub1_6937 = this.aClass563_Sub1Array_4500[var8];
                  this.aClass563_Sub1Array_4500[var8] = var5;
               } else {
                  var5.aClass563_Sub1_6937 = this.aClass563_Sub1Array_4499[var8];
                  this.aClass563_Sub1Array_4499[var8] = var5;
               }
            } else {
               var5.aClass563_Sub1_6937 = this.aClass563_Sub1Array_4501[var8];
               this.aClass563_Sub1Array_4501[var8] = var5;
            }
         }
      }

   }

   public Class563_Sub1_Sub3 method3450(int var1, int var2, int var3, int var4) {
      Class638 var5 = this.tiles[var1][var2][var3];
      if(var5 != null) {
         this.method3422(var5.aClass563_Sub1_Sub3_10134, (byte)-73);
         if(null != var5.aClass563_Sub1_Sub3_10134) {
            Class563_Sub1_Sub3 var6 = var5.aClass563_Sub1_Sub3_10134;
            var5.aClass563_Sub1_Sub3_10134 = null;
            return var6;
         }
      }

      return null;
   }

   public void method3451(FontRenderer var1, byte var2) {}

   public void method3452(byte var1) {
      for(int var2 = 0; var2 < 1346434785 * this.anInt_4481; ++var2) {
         for(int var3 = 0; var3 < this.anInt_4479 * -1775771909; ++var3) {
            if(null == this.tiles[0][var2][var3]) {
               this.tiles[0][var2][var3] = new Class638(0);
            }
         }
      }

   }

   void method3453(Class563_Sub1 var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var7 = true;
      int var8 = var3;
      int var9 = var5 + var3;
      int var10 = var4 - 1;
      int var11 = var4 + var6;

      for(int var12 = var2; var12 <= var2 + 1; ++var12) {
         if(var12 != -743133593 * this.anInt_4480) {
            for(int var13 = var8; var13 <= var9; ++var13) {
               if(var13 >= 0 && var13 < 1346434785 * this.anInt_4481) {
                  for(int var14 = var10; var14 <= var11; ++var14) {
                     if(var14 >= 0 && var14 < -1775771909 * this.anInt_4479 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < var4 && var3 != var13)) {
                        Class638 var15 = this.tiles[var12][var13][var14];
                        if(var15 != null) {
                           int var16 = (this.planes[var12].method2155(var13, var14, (short)-29565) + this.planes[var12].method2155(1 + var13, var14, (short)-23203) + this.planes[var12].method2155(var13, 1 + var14, (short)17821) + this.planes[var12].method2155(var13 + 1, 1 + var14, (short)243)) / 4 - (this.planes[var2].method2155(var3, var4, (short)-15243) + this.planes[var2].method2155(var3 + 1, var4, (short)2908) + this.planes[var2].method2155(var3, 1 + var4, (short)8628) + this.planes[var2].method2155(1 + var3, var4 + 1, (short)22301)) / 4;
                           Class563_Sub1_Sub5 var17 = var15.aClass563_Sub1_Sub5_10131;
                           Class563_Sub1_Sub5 var18 = var15.aClass563_Sub1_Sub5_10132;
                           if(var17 != null && var17.method4731(1044591359)) {
                              var1.method4720(this.aRenderer_4475, var17, (1 - var5) * this.anInt_4473 * -569208769 + (var13 - var3) * -1510650155 * this.anInt_4530, var16, (1 - var6) * -569208769 * this.anInt_4473 + (var14 - var4) * this.anInt_4530 * -1510650155, var7, 590485586);
                           }

                           if(null != var18 && var18.method4731(1044591359)) {
                              var1.method4720(this.aRenderer_4475, var18, -569208769 * this.anInt_4473 * (1 - var5) + -1510650155 * this.anInt_4530 * (var13 - var3), var16, this.anInt_4473 * -569208769 * (1 - var6) + this.anInt_4530 * -1510650155 * (var14 - var4), var7, 1863207666);
                           }

                           for(Class629 var19 = var15.aClass629_10137; var19 != null; var19 = var19.aClass629_10073) {
                              PositionEntity var20 = var19.aClass563_Sub1_Sub4_10075;
                              if(null != var20 && var20.method4731(1044591359) && (var13 == var20.locX || var13 == var8) && (var20.locY == var14 || var10 == var14)) {
                                 int var21 = var20.locX2 - var20.locX + 1;
                                 int var22 = var20.locY2 - var20.locY + 1;
                                 var1.method4720(this.aRenderer_4475, var20, (var21 - var5) * this.anInt_4473 * -569208769 + -1510650155 * this.anInt_4530 * (var20.locX - var3), var16, (var22 - var6) * -569208769 * this.anInt_4473 + -1510650155 * this.anInt_4530 * (var20.locY - var4), var7, 1117234297);
                              }
                           }
                        }
                     }
                  }
               }
            }

            --var8;
            var7 = false;
         }
      }

   }

   public int method3454(int var1, int var2, short var3) {
      return null != this.anIntArrayArray_4489?this.anIntArrayArray_4489[var1][var2] & 16777215:0;
   }

   public boolean method3455(PositionEntity var1, boolean var2, int var3) {
      boolean var4 = this.planes == this.aClass171Array_4492;
      int var5 = 0;
      short var6 = 0;
      byte var7 = 0;
      var1.method2436(-1584985648);
      if(var1.locX >= 0 && var1.locY >= 0 && var1.locX2 < 1346434785 * this.anInt_4481 && var1.locY2 < this.anInt_4479 * -1775771909) {
         short var8 = 0;

         int var9;
         int var10;
         for(var9 = var1.locX; var9 <= var1.locX2; ++var9) {
            for(var10 = var1.locY; var10 <= var1.locY2; ++var10) {
               Class638 var11 = this.method3407(var1.plane, var9, var10, -1713727408);
               if(var11 != null) {
                  Class629 var12 = Class222.method2799(var1, (byte)2);
                  Class629 var13 = var11.aClass629_10137;
                  if(var13 == null) {
                     var11.aClass629_10137 = var12;
                  } else {
                     while(null != var13.aClass629_10073) {
                        var13 = var13.aClass629_10073;
                     }

                     var13.aClass629_10073 = var12;
                  }

                  if(var4 && (this.anIntArrayArray_4489[var9][var10] & -16777216) != 0) {
                     var5 = this.anIntArrayArray_4489[var9][var10];
                     var6 = this.aShortArrayArray_4490[var9][var10];
                     var7 = this.aByteArrayArray_4525[var9][var10];
                  }

                  if(!var2 && null != var11.aClass563_Sub1_Sub1_10138 && var11.aClass563_Sub1_Sub1_10138.height > var8) {
                     var8 = var11.aClass563_Sub1_Sub1_10138.height;
                  }
               }
            }
         }

         if(var4 && 0 != (var5 & -16777216)) {
            for(var9 = var1.locX; var9 <= var1.locX2; ++var9) {
               for(var10 = var1.locY; var10 <= var1.locY2; ++var10) {
                  if((this.anIntArrayArray_4489[var9][var10] & -16777216) == 0) {
                     this.anIntArrayArray_4489[var9][var10] = var5;
                     this.aShortArrayArray_4490[var9][var10] = var6;
                     this.aByteArrayArray_4525[var9][var10] = var7;
                  }
               }
            }
         }

         if(var2) {
            this.aClass563_Sub1_Sub4Array_4506[(this.anInt_4495 += -1102238149) * 1775205107 - 1] = var1;
            var1.worldObjects = this;
         } else {
            var9 = this.aClass171Array_4492 == this.planes?1:0;
            if(var1.method4721(-1219058453)) {
               if(var1.method4722((byte)-103)) {
                  var1.aClass563_Sub1_6937 = this.aClass563_Sub1Array_4500[var9];
                  this.aClass563_Sub1Array_4500[var9] = var1;
               } else {
                  var1.aClass563_Sub1_6937 = this.aClass563_Sub1Array_4499[var9];
                  this.aClass563_Sub1Array_4499[var9] = var1;
               }
            } else {
               var1.aClass563_Sub1_6937 = this.aClass563_Sub1Array_4501[var9];
               this.aClass563_Sub1Array_4501[var9] = var1;
            }
         }

         if(var2) {
            GameCoord var14 = GameCoord.method4308(var1.method6203().gameCoord);
            var14.floatY -= (float)var8;
            var1.setPos(var14);
            var14.store();
         }

         return true;
      } else {
         return false;
      }
   }

   public void method3456(int var1, int var2, int var3, int var4, byte var5) {
      Class638 var6 = this.tiles[var1][var2][var3];
      if(null != var6) {
         Class563_Sub1_Sub3 var7 = var6.aClass563_Sub1_Sub3_10133;
         Class563_Sub1_Sub3 var8 = var6.aClass563_Sub1_Sub3_10134;
         if(null != var7) {
            var7.aShort_3265 = (short)(var4 * var7.aShort_3265 / (16 << 725150473 * this.shiftAmount - 7));
            var7.aShort_3266 = (short)(var4 * var7.aShort_3266 / (16 << 725150473 * this.shiftAmount - 7));
         }

         if(var8 != null) {
            var8.aShort_3265 = (short)(var4 * var8.aShort_3265 / (16 << this.shiftAmount * 725150473 - 7));
            var8.aShort_3266 = (short)(var8.aShort_3266 * var4 / (16 << this.shiftAmount * 725150473 - 7));
         }

      }
   }

   static final void method3457(RSInterfaceData var0, byte var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = (int)(Math.random() * (double)(1 + var2));
   }

   static final void method3458(RSInterfaceData var0, int var1) {
      RSFont.method5567(var0, var0.animeTarget, (byte)7);
   }

   public static void method3459(String[] var0, int[] var1, int var2) {
      Class568.method6250(var0, var1, 0, var0.length - 1, 1485594528);
   }

   static void method3460(int var0) {
      if(Class18.aClass240_Sub22_Sub1_166 != null) {
         Class18.aClass240_Sub22_Sub1_166 = null;
         Class172.method2175(Class474.anInt_8725 * -899275041, Class43.anInt_939 * -1827679021, -1723475363 * Class113.anInt_2072, ScreenCharText.anInt_6172 * -1190617749, (byte)-54);
      }
   }
}
