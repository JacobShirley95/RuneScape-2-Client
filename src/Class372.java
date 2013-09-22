
public class Class372 {

   boolean aBoolean_6943;
   int anInt_6944;
   int[] anIntArray_6945;
   int anInt_6946;
   int totalSize;
   int[] anIntArray_6948;
   static final int anInt_6949 = 7;
   int[][] anIntArrayArray_6950;
   int objectsCount;
   int[] checksums;
   byte[][] aByteArrayArray_6953;
   int[] anIntArray_6954;
   int[] anIntArray_6955;
   int[][] subOffsets;
   Class45 aClass45_6957;
   Class45[] aClass45Array_6958;
   int[] anIntArray_6959;
   boolean aBoolean_6960;
   byte[] aByteArray_6961;


   void method4736(byte[] var1, byte var2) {
      ByteArrayDataNode var3 = new ByteArrayDataNode(Class130.method1673(var1, -1174724853));
      int var4 = var3.readByte(-842879890);
      if(var4 >= 5 && var4 <= 7) {
         if(var4 >= 6) {
            this.anInt_6946 = var3.method4480(1260717178) * 2076184775;
         } else {
            this.anInt_6946 = 0;
         }

         int var5 = var3.readByte(434027869);
         this.aBoolean_6960 = 0 != (var5 & 1);
         this.aBoolean_6943 = (var5 & 2) != 0;
         if(var4 >= 7) {
            this.totalSize = var3.method4492(-901077834) * -1199140283;
         } else {
            this.totalSize = var3.readShort(-910386093) * -1199140283;
         }

         int var6 = 0;
         int var7 = -1;
         this.anIntArray_6948 = new int[this.totalSize * 304787597];
         int var8;
         if(var4 >= 7) {
            for(var8 = 0; var8 < 304787597 * this.totalSize; ++var8) {
               this.anIntArray_6948[var8] = var6 += var3.method4492(-1142031907);
               if(this.anIntArray_6948[var8] > var7) {
                  var7 = this.anIntArray_6948[var8];
               }
            }
         } else {
            for(var8 = 0; var8 < this.totalSize * 304787597; ++var8) {
               this.anIntArray_6948[var8] = var6 += var3.readShort(-689618270);
               if(this.anIntArray_6948[var8] > var7) {
                  var7 = this.anIntArray_6948[var8];
               }
            }
         }

         this.objectsCount = (var7 + 1) * 205858827;
         this.checksums = new int[-1690688605 * this.objectsCount];
         if(this.aBoolean_6943) {
            this.aByteArrayArray_6953 = new byte[-1690688605 * this.objectsCount][];
         }

         this.anIntArray_6954 = new int[this.objectsCount * -1690688605];
         this.anIntArray_6955 = new int[-1690688605 * this.objectsCount];
         this.subOffsets = new int[this.objectsCount * -1690688605][];
         this.anIntArray_6959 = new int[this.objectsCount * -1690688605];
         if(this.aBoolean_6960) {
            this.anIntArray_6945 = new int[-1690688605 * this.objectsCount];

            for(var8 = 0; var8 < -1690688605 * this.objectsCount; ++var8) {
               this.anIntArray_6945[var8] = -1;
            }

            for(var8 = 0; var8 < this.totalSize * 304787597; ++var8) {
               this.anIntArray_6945[this.anIntArray_6948[var8]] = var3.method4480(1260717178);
            }

            this.aClass45_6957 = new Class45(this.anIntArray_6945);
         }

         for(var8 = 0; var8 < this.totalSize * 304787597; ++var8) {
            this.checksums[this.anIntArray_6948[var8]] = var3.method4480(1260717178);
         }

         if(this.aBoolean_6943) {
            for(var8 = 0; var8 < this.totalSize * 304787597; ++var8) {
               byte[] var9 = new byte[64];
               var3.fillArray(var9, 0, 64);
               this.aByteArrayArray_6953[this.anIntArray_6948[var8]] = var9;
            }
         }

         for(var8 = 0; var8 < 304787597 * this.totalSize; ++var8) {
            this.anIntArray_6954[this.anIntArray_6948[var8]] = var3.method4480(1260717178);
         }

         int var10;
         int var11;
         int var12;
         int var13;
         int var14;
         if(var4 >= 7) {
            for(var8 = 0; var8 < 304787597 * this.totalSize; ++var8) {
               this.anIntArray_6955[this.anIntArray_6948[var8]] = var3.method4492(-1354788273);
            }

            for(var8 = 0; var8 < this.totalSize * 304787597; ++var8) {
               var14 = this.anIntArray_6948[var8];
               var10 = this.anIntArray_6955[var14];
               var6 = 0;
               var11 = -1;
               this.subOffsets[var14] = new int[var10];

               for(var12 = 0; var12 < var10; ++var12) {
                  var13 = this.subOffsets[var14][var12] = var6 += var3.method4492(-1451911693);
                  if(var13 > var11) {
                     var11 = var13;
                  }
               }

               this.anIntArray_6959[var14] = var11 + 1;
               if(var10 == var11 + 1) {
                  this.subOffsets[var14] = null;
               }
            }
         } else {
            for(var8 = 0; var8 < this.totalSize * 304787597; ++var8) {
               this.anIntArray_6955[this.anIntArray_6948[var8]] = var3.readShort(-180063083);
            }

            for(var8 = 0; var8 < this.totalSize * 304787597; ++var8) {
               var14 = this.anIntArray_6948[var8];
               var10 = this.anIntArray_6955[var14];
               var6 = 0;
               var11 = -1;
               this.subOffsets[var14] = new int[var10];

               for(var12 = 0; var12 < var10; ++var12) {
                  var13 = this.subOffsets[var14][var12] = var6 += var3.readShort(-1293512086);
                  if(var13 > var11) {
                     var11 = var13;
                  }
               }

               this.anIntArray_6959[var14] = var11 + 1;
               if(var10 == 1 + var11) {
                  this.subOffsets[var14] = null;
               }
            }
         }

         if(this.aBoolean_6960) {
            this.anIntArrayArray_6950 = new int[1 + var7][];
            this.aClass45Array_6958 = new Class45[var7 + 1];

            for(var8 = 0; var8 < 304787597 * this.totalSize; ++var8) {
               var14 = this.anIntArray_6948[var8];
               var10 = this.anIntArray_6955[var14];
               this.anIntArrayArray_6950[var14] = new int[this.anIntArray_6959[var14]];

               for(var11 = 0; var11 < this.anIntArray_6959[var14]; ++var11) {
                  this.anIntArrayArray_6950[var14][var11] = -1;
               }

               for(var11 = 0; var11 < var10; ++var11) {
                  if(this.subOffsets[var14] != null) {
                     var12 = this.subOffsets[var14][var11];
                  } else {
                     var12 = var11;
                  }

                  this.anIntArrayArray_6950[var14][var12] = var3.method4480(1260717178);
               }

               this.aClass45Array_6958[var14] = new Class45(this.anIntArrayArray_6950[var14]);
            }
         }

      } else {
         throw new RuntimeException();
      }
   }

   Class372(byte[] var1, int var2, byte[] var3) {
      this.anInt_6944 = LibraryUnpacker.method3195(var1, var1.length, -2020412357) * -1694659171;
      if(var2 != this.anInt_6944 * -1977589579) {
         throw new RuntimeException();
      } else {
         if(var3 != null) {
            if(var3.length != 64) {
               throw new RuntimeException();
            }

            this.aByteArray_6961 = Class255.method3348(var1, 0, var1.length, -113478103);

            for(int var4 = 0; var4 < 64; ++var4) {
               if(this.aByteArray_6961[var4] != var3[var4]) {
                  throw new RuntimeException();
               }
            }
         }

         this.method4736(var1, (byte)-47);
      }
   }

   static final void method4737(RSInterfaceData var0, byte var1) {
      if(null != Class545.aClass240_Sub47_9477) {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 1;
         var0.aClass240_Sub47_9501 = Class545.aClass240_Sub47_9477;
      } else {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 0;
      }

   }

   static final void method4738(RSInterfaceData var0, int var1) {
      Class573.method6282((Class563_Sub1)var0.aClass218_9511, var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111], 515320674);
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = (int)client.calculatedPosition[0];
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = (int)client.calculatedPosition[1];
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = (int)client.calculatedPosition[2];
   }

   static final void method4739(RSInterfaceData var0, byte var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      Class19.method105(var3, var4, var0, 873816857);
   }

   static void method4740(Renderer var0, Class534 var1, int var2, int var3, int var4, int var5) {
      Class474 var6 = Class520.aClass445_9243.method5489(-156591195 * var1.anInt_9396, -1084903425);
      if(-1 != var6.anInt_8721 * 1587577773) {
         if(var1.aBoolean_9397) {
            var2 += var1.anInt_9398 * 588506689;
            var2 &= 3;
         } else {
            var2 = 0;
         }

         Sprite var7 = var6.method5667(var0, var2, var1.aBoolean_9430, (byte)0);
         if(null != var7) {
            int var8 = var1.anInt_9377 * -215704445;
            int var9 = var1.anInt_9423 * -220503463;
            if(1 == (var2 & 1)) {
               var8 = -220503463 * var1.anInt_9423;
               var9 = -215704445 * var1.anInt_9377;
            }

            int var10 = var7.getFurthestX();
            int var11 = var7.getFurthestY();
            if(var6.aBoolean_8723) {
               var10 = 4 * var8;
               var11 = var9 * 4;
            }

            if(-797464157 * var6.anInt_8722 != 0) {
               var7.method2130(var3, var4 - (var9 - 1) * 4, var10, var11, 0, -16777216 | var6.anInt_8722 * -797464157, 1);
            } else {
               var7.method2145(var3, var4 - (var9 - 1) * 4, var10, var11);
            }

         }
      }
   }
}
