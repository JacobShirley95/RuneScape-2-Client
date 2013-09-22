import java.util.Arrays;
import java.util.Random;

public class Class314 {

   static int[] anIntArray_6103;
   int anInt_6104 = 100;
   Class309 aClass309_6105;
   Class309 aClass309_6106;
   Class309 aClass309_6107;
   int[] anIntArray_6108 = new int[]{0, 0, 0, 0, 0};
   Class309 aClass309_6109;
   static int[] anIntArray_6110;
   int[] anIntArray_6111 = new int[]{0, 0, 0, 0, 0};
   int[] anIntArray_6112 = new int[]{0, 0, 0, 0, 0};
   Class226 aClass226_6113;
   Class309 aClass309_6114;
   static final double aDouble_6115 = 1.0057929410678534D;
   Class309 aClass309_6116;
   Class309 aClass309_6117;
   int anInt_6118 = 500;
   int anInt_6119 = 0;
   static int[] anIntArray_6120;
   static int[] anIntArray_6121 = new int['\u8000'];
   Class309 aClass309_6122;
   int anInt_6123 = 0;
   static int[] anIntArray_6124;
   static int[] anIntArray_6125;
   static int[] anIntArray_6126;
   Class309 aClass309_6127;
   static int[] anIntArray_6128;


   final int[] method3886(int var1, int var2) {
      Arrays.fill(anIntArray_6120, 0, var1, 0);
      if(var2 < 10) {
         return anIntArray_6120;
      } else {
         double var3 = (double)var1 / ((double)var2 + 0.0D);
         this.aClass309_6122.method3870();
         this.aClass309_6116.method3870();
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         if(this.aClass309_6105 != null) {
            this.aClass309_6105.method3870();
            this.aClass309_6106.method3870();
            var5 = (int)((double)(this.aClass309_6105.anInt_6073 - this.aClass309_6105.anInt_6072) * 32.768D / var3);
            var6 = (int)((double)this.aClass309_6105.anInt_6072 * 32.768D / var3);
         }

         int var8 = 0;
         int var9 = 0;
         int var10 = 0;
         if(this.aClass309_6107 != null) {
            this.aClass309_6107.method3870();
            this.aClass309_6114.method3870();
            var8 = (int)((double)(this.aClass309_6107.anInt_6073 - this.aClass309_6107.anInt_6072) * 32.768D / var3);
            var9 = (int)((double)this.aClass309_6107.anInt_6072 * 32.768D / var3);
         }

         int var11;
         for(var11 = 0; var11 < 5; ++var11) {
            if(this.anIntArray_6111[var11] != 0) {
               anIntArray_6124[var11] = 0;
               anIntArray_6125[var11] = (int)((double)this.anIntArray_6108[var11] * var3);
               anIntArray_6126[var11] = (this.anIntArray_6111[var11] << 14) / 100;
               anIntArray_6103[var11] = (int)((double)(this.aClass309_6122.anInt_6073 - this.aClass309_6122.anInt_6072) * 32.768D * Math.pow(1.0057929410678534D, (double)this.anIntArray_6112[var11]) / var3);
               anIntArray_6128[var11] = (int)((double)this.aClass309_6122.anInt_6072 * 32.768D / var3);
            }
         }

         int var12;
         int var13;
         int var14;
         int var15;
         for(var11 = 0; var11 < var1; ++var11) {
            var12 = this.aClass309_6122.method3871(var1);
            var13 = this.aClass309_6116.method3871(var1);
            if(this.aClass309_6105 != null) {
               var14 = this.aClass309_6105.method3871(var1);
               var15 = this.aClass309_6106.method3871(var1);
               var12 += this.method3887(var7, var15, this.aClass309_6105.anInt_6069) >> 1;
               var7 += (var14 * var5 >> 16) + var6;
            }

            if(this.aClass309_6107 != null) {
               var14 = this.aClass309_6107.method3871(var1);
               var15 = this.aClass309_6114.method3871(var1);
               var13 = var13 * ((this.method3887(var10, var15, this.aClass309_6107.anInt_6069) >> 1) + '\u8000') >> 15;
               var10 += (var14 * var8 >> 16) + var9;
            }

            for(var14 = 0; var14 < 5; ++var14) {
               if(this.anIntArray_6111[var14] != 0) {
                  var15 = var11 + anIntArray_6125[var14];
                  if(var15 < var1) {
                     anIntArray_6120[var15] += this.method3887(anIntArray_6124[var14], var13 * anIntArray_6126[var14] >> 15, this.aClass309_6122.anInt_6069);
                     anIntArray_6124[var14] += (var12 * anIntArray_6103[var14] >> 16) + anIntArray_6128[var14];
                  }
               }
            }
         }

         int var16;
         if(this.aClass309_6109 != null) {
            this.aClass309_6109.method3870();
            this.aClass309_6127.method3870();
            var11 = 0;
            boolean var20 = false;
            boolean var19 = true;

            for(var14 = 0; var14 < var1; ++var14) {
               var15 = this.aClass309_6109.method3871(var1);
               var16 = this.aClass309_6127.method3871(var1);
               if(var19) {
                  var12 = this.aClass309_6109.anInt_6072 + ((this.aClass309_6109.anInt_6073 - this.aClass309_6109.anInt_6072) * var15 >> 8);
               } else {
                  var12 = this.aClass309_6109.anInt_6072 + ((this.aClass309_6109.anInt_6073 - this.aClass309_6109.anInt_6072) * var16 >> 8);
               }

               var11 += 256;
               if(var11 >= var12) {
                  var11 = 0;
                  var19 = !var19;
               }

               if(var19) {
                  anIntArray_6120[var14] = 0;
               }
            }
         }

         if(this.anInt_6123 > 0 && this.anInt_6104 > 0) {
            var11 = (int)((double)this.anInt_6123 * var3);

            for(var12 = var11; var12 < var1; ++var12) {
               anIntArray_6120[var12] += anIntArray_6120[var12 - var11] * this.anInt_6104 / 100;
            }
         }

         if(this.aClass226_6113.anIntArray_3888[0] > 0 || this.aClass226_6113.anIntArray_3888[1] > 0) {
            this.aClass309_6117.method3870();
            var11 = this.aClass309_6117.method3871(var1 + 1);
            var12 = this.aClass226_6113.method2850(0, (float)var11 / 65536.0F);
            var13 = this.aClass226_6113.method2850(1, (float)var11 / 65536.0F);
            if(var1 >= var12 + var13) {
               var14 = 0;
               var15 = var13;
               if(var13 > var1 - var12) {
                  var15 = var1 - var12;
               }

               int var17;
               while(var14 < var15) {
                  var16 = (int)((long)anIntArray_6120[var14 + var12] * (long)Class226.anInt_3890 >> 16);

                  for(var17 = 0; var17 < var12; ++var17) {
                     var16 += (int)((long)anIntArray_6120[var14 + var12 - 1 - var17] * (long)Class226.anIntArrayArray_3891[0][var17] >> 16);
                  }

                  for(var17 = 0; var17 < var14; ++var17) {
                     var16 -= (int)((long)anIntArray_6120[var14 - 1 - var17] * (long)Class226.anIntArrayArray_3891[1][var17] >> 16);
                  }

                  anIntArray_6120[var14] = var16;
                  var11 = this.aClass309_6117.method3871(var1 + 1);
                  ++var14;
               }

               var15 = 128;

               while(true) {
                  if(var15 > var1 - var12) {
                     var15 = var1 - var12;
                  }

                  int var18;
                  while(var14 < var15) {
                     var17 = (int)((long)anIntArray_6120[var14 + var12] * (long)Class226.anInt_3890 >> 16);

                     for(var18 = 0; var18 < var12; ++var18) {
                        var17 += (int)((long)anIntArray_6120[var14 + var12 - 1 - var18] * (long)Class226.anIntArrayArray_3891[0][var18] >> 16);
                     }

                     for(var18 = 0; var18 < var13; ++var18) {
                        var17 -= (int)((long)anIntArray_6120[var14 - 1 - var18] * (long)Class226.anIntArrayArray_3891[1][var18] >> 16);
                     }

                     anIntArray_6120[var14] = var17;
                     var11 = this.aClass309_6117.method3871(var1 + 1);
                     ++var14;
                  }

                  if(var14 >= var1 - var12) {
                     while(var14 < var1) {
                        var17 = 0;

                        for(var18 = var14 + var12 - var1; var18 < var12; ++var18) {
                           var17 += (int)((long)anIntArray_6120[var14 + var12 - 1 - var18] * (long)Class226.anIntArrayArray_3891[0][var18] >> 16);
                        }

                        for(var18 = 0; var18 < var13; ++var18) {
                           var17 -= (int)((long)anIntArray_6120[var14 - 1 - var18] * (long)Class226.anIntArrayArray_3891[1][var18] >> 16);
                        }

                        anIntArray_6120[var14] = var17;
                        this.aClass309_6117.method3871(var1 + 1);
                        ++var14;
                     }
                     break;
                  }

                  var12 = this.aClass226_6113.method2850(0, (float)var11 / 65536.0F);
                  var13 = this.aClass226_6113.method2850(1, (float)var11 / 65536.0F);
                  var15 += 128;
               }
            }
         }

         for(var11 = 0; var11 < var1; ++var11) {
            if(anIntArray_6120[var11] < -32768) {
               anIntArray_6120[var11] = -32768;
            }

            if(anIntArray_6120[var11] > 32767) {
               anIntArray_6120[var11] = 32767;
            }
         }

         return anIntArray_6120;
      }
   }

   final int method3887(int var1, int var2, int var3) {
      return var3 == 1?((var1 & 32767) < 16384?var2:-var2):(var3 == 2?anIntArray_6110[var1 & 32767] * var2 >> 14:(var3 == 3?((var1 & 32767) * var2 >> 14) - var2:(var3 == 4?anIntArray_6121[var1 / 2607 & 32767] * var2:0)));
   }

   final void method3888(ByteArrayDataNode var1) {
      this.aClass309_6122 = new Class309();
      this.aClass309_6122.method3868(var1);
      this.aClass309_6116 = new Class309();
      this.aClass309_6116.method3868(var1);
      int var2 = var1.readByte(15475100);
      if(var2 != 0) {
         var1.index -= -2043502829;
         this.aClass309_6105 = new Class309();
         this.aClass309_6105.method3868(var1);
         this.aClass309_6106 = new Class309();
         this.aClass309_6106.method3868(var1);
      }

      var2 = var1.readByte(-12822895);
      if(var2 != 0) {
         var1.index -= -2043502829;
         this.aClass309_6107 = new Class309();
         this.aClass309_6107.method3868(var1);
         this.aClass309_6114 = new Class309();
         this.aClass309_6114.method3868(var1);
      }

      var2 = var1.readByte(538499333);
      if(var2 != 0) {
         var1.index -= -2043502829;
         this.aClass309_6109 = new Class309();
         this.aClass309_6109.method3868(var1);
         this.aClass309_6127 = new Class309();
         this.aClass309_6127.method3868(var1);
      }

      for(int var3 = 0; var3 < 10; ++var3) {
         int var4 = var1.method4490((byte)0);
         if(var4 == 0) {
            break;
         }

         this.anIntArray_6111[var3] = var4;
         this.anIntArray_6112[var3] = var1.method4489(1158549501);
         this.anIntArray_6108[var3] = var1.method4490((byte)0);
      }

      this.anInt_6123 = var1.method4490((byte)0);
      this.anInt_6104 = var1.method4490((byte)0);
      this.anInt_6118 = var1.readShort(876069880);
      this.anInt_6119 = var1.readShort(721754921);
      this.aClass226_6113 = new Class226();
      this.aClass309_6117 = new Class309();
      this.aClass226_6113.method2848(var1, this.aClass309_6117);
   }

   static {
      Random var0 = new Random(0L);

      int var1;
      for(var1 = 0; var1 < '\u8000'; ++var1) {
         anIntArray_6121[var1] = (var0.nextInt() & 2) - 1;
      }

      anIntArray_6110 = new int['\u8000'];

      for(var1 = 0; var1 < '\u8000'; ++var1) {
         anIntArray_6110[var1] = (int)(Math.sin((double)var1 / 5215.1903D) * 16384.0D);
      }

      anIntArray_6120 = new int[220500];
      anIntArray_6124 = new int[5];
      anIntArray_6125 = new int[5];
      anIntArray_6126 = new int[5];
      anIntArray_6103 = new int[5];
      anIntArray_6128 = new int[5];
   }

}
