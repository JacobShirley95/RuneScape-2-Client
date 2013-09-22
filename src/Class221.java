
public class Class221 {

   static final int anInt_3783 = 6;
   static final int anInt_3784 = 14;
   static final int anInt_3785 = 7;
   int anInt_3786;
   int anInt_3787;
   int[][] anIntArrayArray_3788;
   protected static int clientWidth;
   public static Sprite aSprite_3790;


   byte[] method2777(byte[] var1, int var2) {
      if(null != this.anIntArrayArray_3788) {
         int var3 = 14 + (int)((long)(this.anInt_3787 * 45296835) * (long)var1.length / (long)(842833823 * this.anInt_3786));
         int[] var4 = new int[var3];
         int var5 = 0;
         int var6 = 0;

         int var7;
         for(var7 = 0; var7 < var1.length; ++var7) {
            byte var8 = var1[var7];
            int[] var9 = this.anIntArrayArray_3788[var6];

            int var10;
            for(var10 = 0; var10 < 14; ++var10) {
               var4[var10 + var5] += var9[var10] * var8;
            }

            var6 += 45296835 * this.anInt_3787;
            var10 = var6 / (this.anInt_3786 * 842833823);
            var5 += var10;
            var6 -= this.anInt_3786 * 842833823 * var10;
         }

         var1 = new byte[var3];

         for(var7 = 0; var7 < var3; ++var7) {
            int var11 = '\u8000' + var4[var7] >> 16;
            if(var11 < -128) {
               var1[var7] = -128;
            } else if(var11 > 127) {
               var1[var7] = 127;
            } else {
               var1[var7] = (byte)var11;
            }
         }
      }

      return var1;
   }

   public short[] method2778(short[] var1, int var2) {
      if(this.anIntArrayArray_3788 != null) {
         int var3 = (int)((long)var1.length * (long)(45296835 * this.anInt_3787) / (long)(this.anInt_3786 * 842833823)) + 14;
         int[] var4 = new int[var3];
         int var5 = 0;
         int var6 = 0;

         int var7;
         for(var7 = 0; var7 < var1.length; ++var7) {
            short var8 = var1[var7];
            int[] var9 = this.anIntArrayArray_3788[var6];

            int var10;
            for(var10 = 0; var10 < 14; ++var10) {
               var4[var5 + var10] += var8 * var9[var10] >> 2;
            }

            var6 += this.anInt_3787 * 45296835;
            var10 = var6 / (842833823 * this.anInt_3786);
            var5 += var10;
            var6 -= this.anInt_3786 * 842833823 * var10;
         }

         var1 = new short[var3];

         for(var7 = 0; var7 < var3; ++var7) {
            int var11 = 8192 + var4[var7] >> 14;
            if(var11 < -32768) {
               var1[var7] = -32768;
            } else if(var11 > 32767) {
               var1[var7] = 32767;
            } else {
               var1[var7] = (short)var11;
            }
         }
      }

      return var1;
   }

   int method2779(int var1, int var2) {
      if(this.anIntArrayArray_3788 != null) {
         var1 = (int)((long)var1 * (long)(this.anInt_3787 * 45296835) / (long)(this.anInt_3786 * 842833823)) + 6;
      }

      return var1;
   }

   int method2780(int var1, byte var2) {
      if(null != this.anIntArrayArray_3788) {
         var1 = (int)((long)var1 * (long)(this.anInt_3787 * 45296835) / (long)(this.anInt_3786 * 842833823));
      }

      return var1;
   }

   public Class221(int var1, int var2) {
      if(var2 != var1) {
         int var3 = Class115.method1483(var1, var2, -2004561867);
         var1 /= var3;
         var2 /= var3;
         this.anInt_3786 = var1 * 1689828447;
         this.anInt_3787 = 780657643 * var2;
         this.anIntArrayArray_3788 = new int[var1][14];

         for(int var4 = 0; var4 < var1; ++var4) {
            int[] var5 = this.anIntArrayArray_3788[var4];
            double var6 = (double)var4 / (double)var1 + 6.0D;
            int var8 = (int)Math.floor(1.0D + (var6 - 7.0D));
            if(var8 < 0) {
               var8 = 0;
            }

            int var9 = (int)Math.ceil(var6 + 7.0D);
            if(var9 > 14) {
               var9 = 14;
            }

            for(double var10 = (double)var2 / (double)var1; var8 < var9; ++var8) {
               double var12 = 3.141592653589793D * ((double)var8 - var6);
               double var14 = var10;
               if(var12 < -1.0E-4D || var12 > 1.0E-4D) {
                  var14 = var10 * (Math.sin(var12) / var12);
               }

               var14 *= 0.54D + 0.46D * Math.cos(((double)var8 - var6) * 0.2243994752564138D);
               var5[var8] = (int)Math.floor(var14 * 65536.0D + 0.5D);
            }
         }

      }
   }

   static final void method2781(int var0) {
      if(!Class636.method6720(client.loginStage * -243034353, 672130538) && !Class305.method3848(-243034353 * client.loginStage, -1645873008)) {
         MapIconUnpacker.aClass237_10013 = client.gameConnectionHandler.getServerConnection();
         client.gameConnectionHandler.close((byte)8);
         Class418.method5190(17, (byte)-84);
      } else {
         Class125.method1608(false, (byte)-85);
      }
   }

   public static int method2782(int var0) {
      return 12;
   }
}
