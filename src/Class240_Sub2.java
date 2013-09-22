import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;

public class Class240_Sub2 extends NodeListNode {

   int[] anIntArray_6676;
   int anInt_6677;
   byte[] aByteArray_6678;
   int anInt_6679;
   int anInt_6680;
   boolean aBoolean_6681;
   int[] anIntArray_6682;
   int anInt_6683 = 0;
   int anInt_6684;
   int[] anIntArray_6685;
   int[] anIntArray_6686;
   int anInt_6687;
   int[] anIntArray_6688;
   int anInt_6689;
   static byte[] aByteArray_6690;
   static int anInt_6691;
   static int anInt_6692;
   float[] aFloatArray_6693;
   boolean aBoolean_6694;
   Class311[] aClass311Array_6695;
   Class310[] aClass310Array_6696;
   Class320[] aClass320Array_6697;
   int[] anIntArray_6698;
   boolean[] aBooleanArray_6699;
   Class219[] aClass219Array_6700;
   boolean aBoolean_6701 = false;
   static boolean aBoolean_6702 = false;
   float[] aFloatArray_6703;
   int anInt_6704;
   float[] aFloatArray_6705;
   int anInt_6706;
   float[] aFloatArray_6707;
   float[] aFloatArray_6708;
   int anInt_6709;
   int anInt_6710;
   float[] aFloatArray_6711;
   int[] anIntArray_6712;
   float[] aFloatArray_6713;
   int[] anIntArray_6714;
   int[] anIntArray_6715;
   float[] aFloatArray_6716;
   int anInt_6717 = 0;
   int anInt_6718;
   float[] aFloatArray_6719;


   void method4403() {
      if(this.aByteArray_6678 == null) {
         throw new RuntimeException();
      } else {
         ByteArrayDataNode var1 = new ByteArrayDataNode(this.aByteArray_6678);
         this.anInt_6679 = var1.method4480(1260717178);
         this.anInt_6680 = var1.method4480(1260717178);
         if(this.anInt_6680 < 0) {
            this.anInt_6680 = ~this.anInt_6680;
            this.aBoolean_6681 = true;
         }

         var1.method4480(1260717178);
         this.anInt_6684 = var1.method4480(1260717178);
         this.anIntArray_6686 = new int[this.anInt_6684];
         this.anIntArray_6685 = new int[this.anInt_6684];
         int var2 = var1.index * 964952859 + this.anInt_6684 * 4;

         for(int var3 = 0; var3 < this.anInt_6684; ++var3) {
            this.anIntArray_6686[var3] = var2;
            this.anIntArray_6685[var3] = var1.method4480(1260717178);
            var2 += this.anIntArray_6685[var3];
         }

         this.anInt_6689 = var1.index * 964952859;
         this.anInt_6677 = 22050;
      }
   }

   static void method4404(byte[] var0, int var1) {
      aByteArray_6690 = var0;
      anInt_6691 = var1;
      anInt_6692 = 0;
   }

   static int method4405(int var0) {
      int var1 = 0;

      int var2;
      int var3;
      for(var2 = 0; var0 >= 8 - anInt_6692; var0 -= var3) {
         var3 = 8 - anInt_6692;
         int var4 = (1 << var3) - 1;
         var1 += (aByteArray_6690[anInt_6691] >> anInt_6692 & var4) << var2;
         anInt_6692 = 0;
         ++anInt_6691;
         var2 += var3;
      }

      if(var0 > 0) {
         var3 = (1 << var0) - 1;
         var1 += (aByteArray_6690[anInt_6691] >> anInt_6692 & var3) << var2;
         anInt_6692 += var0;
      }

      return var1;
   }

   void method4406(byte[] var1) throws IOException {
      this.aByteArray_6678 = var1;
      this.method4403();
      if(method4408(this.aByteArray_6678, this.anInt_6689)) {
         int var2 = 0;
         boolean var3 = false;
         this.anIntArray_6714 = new int[this.anInt_6684];
         this.anIntArray_6688 = new int[this.anInt_6684];
         this.anInt_6709 = 0;

         int var4;
         int var5;
         int var6;
         int var7;
         int var8;
         int var9;
         int var10;
         int var14;
         for(var4 = 0; var4 < this.anInt_6684; ++var4) {
            var14 = this.anIntArray_6686[var4];
            var5 = 0;

            while(var14 + 26 < this.anIntArray_6686[var4] + this.anIntArray_6685[var4]) {
               if(!method4408(var1, var14)) {
                  throw new RuntimeException("" + var14);
               }

               var6 = var1[var14 + 6] & 255 | (var1[var14 + 7] & 255) << 8 | (var1[var14 + 8] & 255) << 16 | var1[var14 + 9] << 24;
               if(var6 > var5) {
                  var5 = var6;
               }

               var7 = var1[var14 + 26] & 255;
               var8 = var14 + 27;
               var14 = var8 + var7;
               if(var14 > var1.length) {
                  break;
               }

               for(var9 = 0; var9 < var7; ++var9) {
                  var10 = var1[var8++] & 255;
                  var14 += var10;
                  if(var14 > var1.length) {
                     break;
                  }

                  if(var10 < 255) {
                     ++var2;
                     ++this.anIntArray_6714[var4];
                  }
               }
            }

            this.anIntArray_6688[var4] = var5;
            this.anInt_6709 += var5;
         }

         this.anIntArray_6682 = new int[var2];
         this.anIntArray_6698 = new int[var2];
         var3 = false;
         var4 = 0;
         var5 = 0;
         var6 = 0;

         while(var6 < this.anInt_6684) {
            var14 = this.anIntArray_6686[var6];

            label65:
            while(true) {
               if(var14 + 26 < this.anIntArray_6686[var6] + this.anIntArray_6685[var6]) {
                  var7 = 0;
                  var8 = var1[var14 + 26] & 255;
                  var9 = var14 + 27;
                  var14 = var9 + var8;
                  if(var14 <= this.anIntArray_6686[var6] + this.anIntArray_6685[var6]) {
                     var10 = var14;
                     boolean var11 = false;
                     int var12 = 0;

                     while(true) {
                        if(var12 < var8) {
                           int var13 = var1[var9++] & 255;
                           var14 += var13;
                           if(var14 <= this.anIntArray_6686[var6] + this.anIntArray_6685[var6]) {
                              if(var13 < 255) {
                                 int var15 = (var12 - var7) * 255 + var13 + var5;
                                 this.anIntArray_6682[var4] = var10;
                                 this.anIntArray_6698[var4] = var15;
                                 ++var4;
                                 var5 = 0;
                                 var7 = var12 + 1;
                                 var10 = var14;
                              }

                              ++var12;
                              continue;
                           }
                        }

                        if(var14 <= this.anIntArray_6686[var6] + this.anIntArray_6685[var6] && var7 < var8) {
                           var5 = (var8 - var7) * 255;
                        }
                        continue label65;
                     }
                  }
               }

               ++var6;
               break;
            }
         }

      }
   }

   static boolean method4407(byte[] var0, int var1, int var2) {
      return var0[var1] != var2?false:var0[var1 + 1] == 118 && var0[var1 + 2] == 111 && var0[var1 + 3] == 114 && var0[var1 + 4] == 98 && var0[var1 + 5] == 105 && var0[var1 + 6] == 115;
   }

   static boolean method4408(byte[] var0, int var1) {
      return var0[var1] == 79 && var0[var1 + 1] == 103 && var0[var1 + 2] == 103 && var0[var1 + 3] == 83;
   }

   static void method4409(byte[] var0) {
      if(method4408(var0, 0)) {
         aBoolean_6702 = true;
      }
   }

   void method4410(int var1) {
      if(this.aByteArray_6678 == null) {
         throw new RuntimeException();
      } else {
         int var2 = this.anIntArray_6682[var1];
         int var3 = this.anIntArray_6682[var1 + 2];
         if(!method4407(this.aByteArray_6678, var2, 1)) {
            throw new RuntimeException();
         } else {
            method4404(this.aByteArray_6678, var2 + 7);
            int var4 = method4405(32);
            method4405(8);
            this.anInt_6677 = method4405(32);
            method4405(32);
            method4405(32);
            method4405(32);
            this.anInt_6706 = 1 << method4405(4);
            this.anInt_6718 = 1 << method4405(4);
            int var5 = 1 << method4405(1);
            if(var4 == 0 && var5 != 0) {
               if(!method4407(this.aByteArray_6678, var3, 5)) {
                  throw new RuntimeException();
               } else {
                  method4404(this.aByteArray_6678, var3);
                  this.aFloatArray_6707 = new float[this.anInt_6718];

                  int var6;
                  int var7;
                  int var8;
                  int var9;
                  int var10;
                  for(var6 = 0; var6 < 2; ++var6) {
                     var7 = var6 != 0?this.anInt_6718:this.anInt_6706;
                     var8 = var7 >> 1;
                     var9 = var7 >> 2;
                     var10 = var7 >> 3;
                     float[] var11 = new float[var8];

                     for(int var12 = 0; var12 < var9; ++var12) {
                        var11[2 * var12] = (float)Math.cos((double)(4 * var12) * 3.141592653589793D / (double)var7);
                        var11[2 * var12 + 1] = -((float)Math.sin((double)(4 * var12) * 3.141592653589793D / (double)var7));
                     }

                     float[] var18 = new float[var8];

                     for(int var13 = 0; var13 < var9; ++var13) {
                        var18[2 * var13] = (float)Math.cos((double)(2 * var13 + 1) * 3.141592653589793D / (double)(2 * var7));
                        var18[2 * var13 + 1] = (float)Math.sin((double)(2 * var13 + 1) * 3.141592653589793D / (double)(2 * var7));
                     }

                     float[] var19 = new float[var9];

                     for(int var14 = 0; var14 < var10; ++var14) {
                        var19[2 * var14] = (float)Math.cos((double)(4 * var14 + 2) * 3.141592653589793D / (double)var7);
                        var19[2 * var14 + 1] = -((float)Math.sin((double)(4 * var14 + 2) * 3.141592653589793D / (double)var7));
                     }

                     int[] var20 = new int[var10];
                     int var15 = Class125.method1607(var10 - 1, 1449278716);

                     for(int var16 = 0; var16 < var10; ++var16) {
                        var20[var16] = Class283.method3670(var16, var15, (byte)78);
                     }

                     if(var6 != 0) {
                        this.aFloatArray_6705 = var11;
                        this.aFloatArray_6693 = var18;
                        this.aFloatArray_6713 = var19;
                        this.anIntArray_6715 = var20;
                     } else {
                        this.aFloatArray_6708 = var11;
                        this.aFloatArray_6711 = var18;
                        this.aFloatArray_6719 = var19;
                        this.anIntArray_6676 = var20;
                     }
                  }

                  method4404(this.aByteArray_6678, var3 + 7);
                  var6 = method4405(8) + 1;
                  this.aClass219Array_6700 = new Class219[var6];

                  for(var7 = 0; var7 < var6; ++var7) {
                     this.aClass219Array_6700[var7] = new Class219();
                  }

                  var7 = method4405(6) + 1;

                  for(var8 = 0; var8 < var7; ++var8) {
                     method4405(16);
                  }

                  var7 = method4405(6) + 1;
                  this.aClass310Array_6696 = new Class310[var7];

                  for(var8 = 0; var8 < var7; ++var8) {
                     this.aClass310Array_6696[var8] = new Class310();
                  }

                  var8 = method4405(6) + 1;
                  this.aClass320Array_6697 = new Class320[var8];

                  for(var9 = 0; var9 < var8; ++var9) {
                     this.aClass320Array_6697[var9] = new Class320();
                  }

                  var9 = method4405(6) + 1;
                  this.aClass311Array_6695 = new Class311[var9];

                  for(var10 = 0; var10 < var9; ++var10) {
                     this.aClass311Array_6695[var10] = new Class311();
                  }

                  var10 = method4405(6) + 1;
                  this.aBooleanArray_6699 = new boolean[var10];
                  this.anIntArray_6712 = new int[var10];

                  for(int var17 = 0; var17 < var10; ++var17) {
                     this.aBooleanArray_6699[var17] = method4420() != 0;
                     method4405(16);
                     method4405(16);
                     this.anIntArray_6712[var17] = method4405(8);
                  }

                  this.aBoolean_6701 = true;
               }
            } else {
               throw new RuntimeException();
            }
         }
      }
   }

   boolean method4411(int var1, AtomicReference var2) {
      if(this.aByteArray_6678 != null && var1 >= 0 && var1 < this.anIntArray_6682.length) {
         method4404(this.aByteArray_6678, this.anIntArray_6682[var1]);
         int var3 = method4420();
         if(var3 == 1) {
            this.aBoolean_6701 = false;
            this.method4410(var1);
            return false;
         } else if(!this.aBoolean_6701) {
            throw new RuntimeException();
         } else {
            int var4 = method4405(Class125.method1607(this.anIntArray_6712.length - 1, -1157094571));
            boolean var5 = this.aBooleanArray_6699[var4];
            int var6 = var5?this.anInt_6718:this.anInt_6706;
            boolean var7 = false;
            boolean var8 = false;
            if(var5) {
               var7 = method4420() != 0;
               var8 = method4420() != 0;
            }

            int var9 = var6 >> 1;
            int var10;
            int var11;
            int var12;
            if(var5 && !var7) {
               var10 = (var6 >> 2) - (this.anInt_6706 >> 2);
               var11 = (var6 >> 2) + (this.anInt_6706 >> 2);
               var12 = this.anInt_6706 >> 1;
            } else {
               var10 = 0;
               var11 = var9;
               var12 = var6 >> 1;
            }

            int var13;
            int var14;
            int var15;
            if(var5 && !var8) {
               var13 = var6 - (var6 >> 2) - (this.anInt_6706 >> 2);
               var14 = var6 - (var6 >> 2) + (this.anInt_6706 >> 2);
               var15 = this.anInt_6706 >> 1;
            } else {
               var13 = var9;
               var14 = var6;
               var15 = var6 >> 1;
            }

            Class311 var16 = this.aClass311Array_6695[this.anIntArray_6712[var4]];
            int var17 = var16.anInt_6094;
            int var18 = var16.anIntArray_6093[var17];
            boolean var19 = !this.aClass310Array_6696[var18].method3876(this);
            boolean var42 = var19;

            for(var18 = 0; var18 < var16.anInt_6092; ++var18) {
               Class320 var20 = this.aClass320Array_6697[var16.anIntArray_6095[var18]];
               float[] var21 = this.aFloatArray_6707;
               var20.method3959(var21, var6 >> 1, var42, this);
            }

            int var43;
            if(!var19) {
               var18 = var16.anInt_6094;
               var43 = var16.anIntArray_6093[var18];
               this.aClass310Array_6696[var43].method3878(this.aFloatArray_6707, var6 >> 1);
            }

            int var46;
            if(var19) {
               for(var18 = var6 >> 1; var18 < var6; ++var18) {
                  this.aFloatArray_6707[var18] = 0.0F;
               }
            } else {
               var18 = var6 >> 1;
               var43 = var6 >> 2;
               var46 = var6 >> 3;
               float[] var22 = this.aFloatArray_6707;

               int var23;
               for(var23 = 0; var23 < var18; ++var23) {
                  var22[var23] *= 0.5F;
               }

               for(var23 = var18; var23 < var6; ++var23) {
                  var22[var23] = -var22[var6 - var23 - 1];
               }

               float[] var48 = var5?this.aFloatArray_6705:this.aFloatArray_6708;
               float[] var24 = var5?this.aFloatArray_6693:this.aFloatArray_6711;
               float[] var25 = var5?this.aFloatArray_6713:this.aFloatArray_6719;
               int[] var26 = var5?this.anIntArray_6715:this.anIntArray_6676;

               int var27;
               float var29;
               float var28;
               float var31;
               float var30;
               for(var27 = 0; var27 < var43; ++var27) {
                  var28 = var22[4 * var27] - var22[var6 - 4 * var27 - 1];
                  var29 = var22[4 * var27 + 2] - var22[var6 - 4 * var27 - 3];
                  var30 = var48[2 * var27];
                  var31 = var48[2 * var27 + 1];
                  var22[var6 - 4 * var27 - 1] = var28 * var30 - var29 * var31;
                  var22[var6 - 4 * var27 - 3] = var28 * var31 + var29 * var30;
               }

               float var32;
               float var33;
               for(var27 = 0; var27 < var46; ++var27) {
                  var28 = var22[var18 + 3 + 4 * var27];
                  var29 = var22[var18 + 1 + 4 * var27];
                  var30 = var22[4 * var27 + 3];
                  var31 = var22[4 * var27 + 1];
                  var22[var18 + 3 + 4 * var27] = var28 + var30;
                  var22[var18 + 1 + 4 * var27] = var29 + var31;
                  var32 = var48[var18 - 4 - 4 * var27];
                  var33 = var48[var18 - 3 - 4 * var27];
                  var22[4 * var27 + 3] = (var28 - var30) * var32 - (var29 - var31) * var33;
                  var22[4 * var27 + 1] = (var29 - var31) * var32 + (var28 - var30) * var33;
               }

               var27 = Class125.method1607(var6 - 1, -406307635);

               int var51;
               int var50;
               int var49;
               int var54;
               for(var49 = 0; var49 < var27 - 3; ++var49) {
                  var51 = var6 >> var49 + 2;
                  var50 = 8 << var49;

                  for(var54 = 0; var54 < 2 << var49; ++var54) {
                     int var53 = var6 - var51 * 2 * var54;
                     int var52 = var6 - var51 * (2 * var54 + 1);

                     for(int var34 = 0; var34 < var6 >> var49 + 4; ++var34) {
                        int var35 = 4 * var34;
                        float var36 = var22[var53 - 1 - var35];
                        float var37 = var22[var53 - 3 - var35];
                        float var38 = var22[var52 - 1 - var35];
                        float var39 = var22[var52 - 3 - var35];
                        var22[var53 - 1 - var35] = var36 + var38;
                        var22[var53 - 3 - var35] = var37 + var39;
                        float var40 = var48[var34 * var50];
                        float var41 = var48[var34 * var50 + 1];
                        var22[var52 - 1 - var35] = (var36 - var38) * var40 - (var37 - var39) * var41;
                        var22[var52 - 3 - var35] = (var37 - var39) * var40 + (var36 - var38) * var41;
                     }
                  }
               }

               for(var49 = 1; var49 < var46 - 1; ++var49) {
                  var51 = var26[var49];
                  if(var49 < var51) {
                     var50 = 8 * var49;
                     var54 = 8 * var51;
                     var32 = var22[var50 + 1];
                     var22[var50 + 1] = var22[var54 + 1];
                     var22[var54 + 1] = var32;
                     var32 = var22[var50 + 3];
                     var22[var50 + 3] = var22[var54 + 3];
                     var22[var54 + 3] = var32;
                     var32 = var22[var50 + 5];
                     var22[var50 + 5] = var22[var54 + 5];
                     var22[var54 + 5] = var32;
                     var32 = var22[var50 + 7];
                     var22[var50 + 7] = var22[var54 + 7];
                     var22[var54 + 7] = var32;
                  }
               }

               for(var49 = 0; var49 < var18; ++var49) {
                  var22[var49] = var22[2 * var49 + 1];
               }

               for(var49 = 0; var49 < var46; ++var49) {
                  var22[var6 - 1 - 2 * var49] = var22[4 * var49];
                  var22[var6 - 2 - 2 * var49] = var22[4 * var49 + 1];
                  var22[var6 - var43 - 1 - 2 * var49] = var22[4 * var49 + 2];
                  var22[var6 - var43 - 2 - 2 * var49] = var22[4 * var49 + 3];
               }

               for(var49 = 0; var49 < var46; ++var49) {
                  var29 = var25[2 * var49];
                  var30 = var25[2 * var49 + 1];
                  var31 = var22[var18 + 2 * var49];
                  var32 = var22[var18 + 2 * var49 + 1];
                  var33 = var22[var6 - 2 - 2 * var49];
                  float var56 = var22[var6 - 1 - 2 * var49];
                  float var55 = var30 * (var31 - var33) + var29 * (var32 + var56);
                  var22[var18 + 2 * var49] = (var31 + var33 + var55) * 0.5F;
                  var22[var6 - 2 - 2 * var49] = (var31 + var33 - var55) * 0.5F;
                  var55 = var30 * (var32 + var56) - var29 * (var31 - var33);
                  var22[var18 + 2 * var49 + 1] = (var32 - var56 + var55) * 0.5F;
                  var22[var6 - 1 - 2 * var49] = (-var32 + var56 + var55) * 0.5F;
               }

               for(var49 = 0; var49 < var43; ++var49) {
                  var22[var49] = var22[2 * var49 + var18] * var24[2 * var49] + var22[2 * var49 + 1 + var18] * var24[2 * var49 + 1];
                  var22[var18 - 1 - var49] = var22[2 * var49 + var18] * var24[2 * var49 + 1] - var22[2 * var49 + 1 + var18] * var24[2 * var49];
               }

               for(var49 = 0; var49 < var43; ++var49) {
                  var22[var6 - var43 + var49] = -var22[var49];
               }

               for(var49 = 0; var49 < var43; ++var49) {
                  var22[var49] = var22[var43 + var49];
               }

               for(var49 = 0; var49 < var43; ++var49) {
                  var22[var43 + var49] = -var22[var43 - var49 - 1];
               }

               for(var49 = 0; var49 < var43; ++var49) {
                  var22[var18 + var49] = var22[var6 - var49 - 1];
               }

               for(var49 = var10; var49 < var11; ++var49) {
                  var29 = (float)Math.sin(((double)(var49 - var10) + 0.5D) / (double)var12 * 0.5D * 3.141592653589793D);
                  this.aFloatArray_6707[var49] *= (float)Math.sin(1.5707963267948966D * (double)var29 * (double)var29);
               }

               for(var49 = var13; var49 < var14; ++var49) {
                  var29 = (float)Math.sin(((double)(var49 - var13) + 0.5D) / (double)var15 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                  this.aFloatArray_6707[var49] *= (float)Math.sin(1.5707963267948966D * (double)var29 * (double)var29);
               }
            }

            float[] var44 = null;
            if(this.anInt_6704 > 0) {
               var43 = this.anInt_6704 + var6 >> 2;
               var44 = new float[var43];
               int var45;
               if(!this.aBoolean_6694) {
                  for(var46 = 0; var46 < this.anInt_6710; ++var46) {
                     var45 = (this.anInt_6704 >> 1) + var46;
                     var44[var46] += this.aFloatArray_6703[var45];
                  }
               }

               if(!var19) {
                  for(var46 = var10; var46 < var6 >> 1; ++var46) {
                     var45 = var44.length - (var6 >> 1) + var46;
                     var44[var45] += this.aFloatArray_6707[var46];
                  }
               }
            }

            float[] var47 = this.aFloatArray_6703;
            this.aFloatArray_6703 = this.aFloatArray_6707;
            this.aFloatArray_6707 = var47;
            this.anInt_6704 = var6;
            this.anInt_6710 = var14 - (var6 >> 1);
            this.aBoolean_6694 = var19;
            var2.set(var44);
            return true;
         }
      } else {
         throw new RuntimeException();
      }
   }

   static boolean method4412(CacheDataUnpacker var0) {
      if(!aBoolean_6702) {
         byte[] var1 = var0.getDataBytes(0, 0, 246330431);
         if(var1 == null) {
            return false;
         }

         method4409(var1);
      }

      return true;
   }

   static Class240_Sub2 method4413(CacheDataUnpacker var0, int var1, int var2) {
      if(!method4412(var0)) {
         var0.method3568(var1, var2, 1211810234);
         return null;
      } else {
         byte[] var3 = var0.getDataBytes(var1, var2, -1145785513);
         if(var3 == null) {
            var0.method3568(var1, var2, -1602633766);
            return null;
         } else {
            Class240_Sub2 var4 = null;

            try {
               var4 = new Class240_Sub2(var3);
            } catch (IOException var6) {
               var6.printStackTrace();
            }

            return var4;
         }
      }
   }

   public Class240_Sub7_Sub1_Sub2 method4414() {
      Class17.method92(this, (byte)0);
      return this.method4422() && (this.anInt_6717 <= this.anInt_6677 || this.anInt_6683 <= this.anInt_6677 / Class340.method4204((byte)-24))?null:new Class240_Sub7_Sub1_Sub2(this.anInt_6677, this, this.aFloatArray_6716, this.anInt_6679, this.anInt_6680, this.aBoolean_6681);
   }

   void method4415(int var1) {
      if(var1 > this.anInt_6709 - 1) {
         var1 = this.anInt_6709 - 1;
      }

      if(var1 > this.anInt_6717) {
         this.anInt_6683 = this.method4421(var1);
      } else {
         this.anInt_6683 = 0;
      }

      if(!this.method4422()) {
         this.aFloatArray_6703 = null;
      }

   }

   int method4416() {
      return this.anInt_6717;
   }

   Class240_Sub2(byte[] var1) throws IOException {
      this.method4406(var1);
   }

   int method4417() {
      return this.anInt_6677;
   }

   public static Class240_Sub2 method4418(CacheDataUnpacker var0, int var1) {
      if(!method4412(var0)) {
         var0.hasData(var1, 643849224);
         return null;
      } else {
         byte[] var2 = var0.method3566(var1, 783488850);
         if(var2 == null) {
            var0.hasData(var1, -1659408415);
            return null;
         } else {
            Class240_Sub2 var3 = null;

            try {
               var3 = new Class240_Sub2(var2);
            } catch (IOException var5) {
               var5.printStackTrace();
            }

            return var3;
         }
      }
   }

   static float method4419(int var0) {
      int var1 = var0 & 2097151;
      int var2 = var0 & Integer.MIN_VALUE;
      int var3 = (var0 & 2145386496) >> 21;
      if(var2 != 0) {
         var1 = -var1;
      }

      return (float)((double)var1 * Math.pow(2.0D, (double)(var3 - 788)));
   }

   static int method4420() {
      int var0 = aByteArray_6690[anInt_6691] >> anInt_6692 & 1;
      ++anInt_6692;
      anInt_6691 += anInt_6692 >> 3;
      anInt_6692 &= 7;
      return var0;
   }

   int method4421(int var1) {
      int var2 = 0;
      if(this.aFloatArray_6716 == null) {
         this.anInt_6704 = 0;
         this.aFloatArray_6703 = new float[this.anInt_6718];
         this.aFloatArray_6716 = new float[this.anInt_6709];
         this.anInt_6717 = 0;
         this.anInt_6687 = 0;
      }

      for(int var3 = this.anIntArray_6682.length; var1 > this.anInt_6717 && this.anInt_6687 < var3; ++this.anInt_6687) {
         Object var4 = null;
         AtomicReference var5 = new AtomicReference((Object)null);
         boolean var6 = this.method4411(this.anInt_6687, var5);
         float[] var10 = (float[])((float[])var5.get());
         if(var6) {
            if(var10 != null) {
               int var7 = this.anInt_6717;
               int var8 = var10.length;
               if(var8 > this.anInt_6709 - var7) {
                  var8 = this.anInt_6709 - var7;
               }

               for(int var9 = 0; var9 < var8; ++var9) {
                  this.aFloatArray_6716[var7++] = var10[var9];
               }

               var2 += var7 - this.anInt_6717;
               this.anInt_6717 = var7;
            }
         } else {
            this.anInt_6704 = 0;
            this.aFloatArray_6703 = new float[this.anInt_6718];
            this.anInt_6687 += 2;
         }
      }

      return var2;
   }

   boolean method4422() {
      return this.anInt_6717 < this.anInt_6709 - 1;
   }
}
