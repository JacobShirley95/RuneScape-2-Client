
public class Class308 {

   int anInt_6038;
   final int anInt_6039;
   final int anInt_6040;
   static final int anInt_6041 = 512;
   final int anInt_6042;
   final int anInt_6043;
   final int anInt_6044;
   final int anInt_6045;
   final int anInt_6046;
   final boolean aBoolean_6047;
   int anInt_6048;
   static final int anInt_6049 = 13;
   int anInt_6050;
   Sprite aClass170_6051;
   int anInt_6052;
   int anInt_6053;
   static final int anInt_6054 = 2;
   static final int anInt_6055 = 1;
   int anInt_6056;
   int anInt_6057;
   static final int anInt_6058 = 0;
   static final int anInt_6059 = 24;
   static final int anInt_6060 = 24;
   static final int anInt_6061 = 192;
   static final int anInt_6062 = 128;
   int anInt_6063;
   static final int anInt_6064 = 16;
   static Model aClass165_6065;
   static Sprite aClass170_6066;
   static Sprite aClass170_6067;
   static final int[] anIntArray_6068 = new int[4];


   boolean method3859(int var1, int var2, int var3, int var4) {
      int var5;
      int var6;
      int var7;
      if(!this.aBoolean_6047) {
         var5 = this.anInt_6044 - var1;
         var6 = this.anInt_6039 - var2;
         var7 = this.anInt_6046 - var3;
         this.anInt_6038 = (int)Math.sqrt((double)(var5 * var5 + var6 * var6 + var7 * var7));
         if(this.anInt_6038 == 0) {
            this.anInt_6038 = 1;
         }

         var5 = (var5 << 8) / this.anInt_6038;
         var6 = (var6 << 8) / this.anInt_6038;
         var7 = (var7 << 8) / this.anInt_6038;
      } else {
         this.anInt_6038 = 1073741823;
         var5 = this.anInt_6044;
         var6 = this.anInt_6039;
         var7 = this.anInt_6046;
      }

      int var8 = (int)(Math.sqrt((double)(var5 * var5 + var6 * var6 + var7 * var7)) * 256.0D);
      if(var8 > 128) {
         var5 = (var5 << 16) / var8;
         var6 = (var6 << 16) / var8;
         var7 = (var7 << 16) / var8;
         this.anInt_6052 = this.anInt_6043 * var4 / (this.aBoolean_6047?1024:this.anInt_6038);
      } else {
         this.anInt_6052 = 0;
      }

      if(this.anInt_6052 < 8) {
         this.aClass170_6051 = null;
         return false;
      } else {
         int var9 = Class105.method1359(this.anInt_6052, (byte)125);
         if(var9 > var4) {
            var9 = Class234.method3016(var4, (byte)85);
         }

         if(var9 > 512) {
            var9 = 512;
         }

         if(var9 != this.anInt_6053) {
            this.anInt_6053 = var9;
         }

         this.anInt_6050 = (int)(Math.asin((double)((float)var6 / 256.0F)) * 2607.5945876176133D) & 16383;
         this.anInt_6063 = (int)(Math.atan2((double)var5, (double)(-var7)) * 2607.5945876176133D) & 16383;
         this.aClass170_6051 = null;
         return true;
      }
   }

   void method3860(Renderer var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      if(this.aClass170_6051 != null) {
         float[] var12 = new float[3];
         float var13 = (float)(-(this.anInt_6044 - var8 << 16));
         float var14 = (float)(this.anInt_6039 - var9 << 15);
         float var15 = (float)(-(this.anInt_6046 - var10 << 16));
         float[] var16 = new float[3];
         var1.getViewport().method4644(var16);
         var13 += var16[0];
         var14 += var16[1];
         var15 += var16[2];
         var1.getScreenPosHidden(var13, var14, var15, var12);
         if(var12[2] >= 0.0F) {
            int var17 = (int)(var12[0] - (float)(this.anInt_6052 / 2));
            int var18 = (int)(var12[1] - (float)(this.anInt_6052 / 2));
            if(var18 < var5 && var18 + this.anInt_6052 > 0 && var17 < var4 && var17 + this.anInt_6052 > 0) {
               this.aClass170_6051.method2130(var17, var18, this.anInt_6052, this.anInt_6052, 0, var11 << 24 | 16777215, 1);
            }
         }

      }
   }

   boolean method3861(Renderer var1, Class308 var2) {
      if(this.aClass170_6051 == null) {
         if(this.anInt_6042 == 0) {
            if(Class104_Sub21.aClass96_10733.method1263(this.anInt_6040, Class610.aClass610_9945, 0.7F, this.anInt_6053, this.anInt_6053, false, (byte)56)) {
               int[] var3 = Class104_Sub21.aClass96_10733.method1257(this.anInt_6040, 0.7F, this.anInt_6053, this.anInt_6053, false, (byte)1);
               this.aClass170_6051 = var1.defineSprite(var3, 0, this.anInt_6053, this.anInt_6053, this.anInt_6053);
            }
         } else if(this.anInt_6042 == 2) {
            this.method3866(var1, var2);
         } else if(this.anInt_6042 == 1) {
            this.method3863(var1, var2);
         }
      }

      return this.aClass170_6051 != null;
   }

   boolean method3862(Renderer var1, Class308 var2) {
      return this.aClass170_6051 != null || this.method3861(var1, var2);
   }

   void method3863(Renderer var1, Class308 var2) {
      method3864(var1);
      method3865(var1);
      var1.method1913(anIntArray_6068);
      var1.method1965(0, 0, this.anInt_6053, this.anInt_6053);
      var1.method1977(2, 0);
      var1.drawOutline(0, 0, this.anInt_6053, this.anInt_6053, -16777216 | this.anInt_6045, 0);
      int var3 = 0;
      int var4 = 0;
      int var5 = 256;
      if(var2 != null) {
         if(var2.aBoolean_6047) {
            var3 = -var2.anInt_6044;
            var4 = -var2.anInt_6039;
            var5 = -var2.anInt_6046;
         } else {
            var3 = var2.anInt_6044 - this.anInt_6044;
            var4 = var2.anInt_6039 - this.anInt_6039;
            var5 = var2.anInt_6046 - this.anInt_6046;
         }
      }

      int var6;
      int var7;
      int var8;
      if(this.anInt_6050 != 0) {
         var6 = Class362.cosArray[this.anInt_6050];
         var7 = Class362.sinArray[this.anInt_6050];
         var8 = var4 * var7 - var5 * var6 >> 14;
         var5 = var4 * var6 + var5 * var7 >> 14;
         var4 = var8;
      }

      if(this.anInt_6063 != 0) {
         var6 = Class362.cosArray[this.anInt_6063];
         var7 = Class362.sinArray[this.anInt_6063];
         var8 = var5 * var6 + var3 * var7 >> 14;
         var5 = var5 * var7 - var3 * var6 >> 14;
         var3 = var8;
      }

      Model var13 = aClass165_6065.copy((byte)0, '\uc800', true);
      var13.method2035((short)0, (short)this.anInt_6040);
      var1.method1947(1.0F);
      var1.method1945(16777215, 1.0F, 1.0F, (float)var3, (float)var4, (float)var5);
      var7 = 1024 * this.anInt_6053 / (var13.method2022() - var13.method2039());
      if(this.anInt_6045 != 0) {
         var7 = var7 * 13 / 16;
      }

      ArrayViewport var14 = var1.method1984();
      ArrayViewport var9 = var1.method1936();
      var9.method4578((float)(this.anInt_6053 / 2), (float)(this.anInt_6053 / 2), (float)var7, (float)var7, 50.0F, 50000.0F, (float)var1.method1896(1476861403).method2194(), (float)var1.method1896(1514297258).method2198(), 1024.0F);
      var1.method1946(var9);
      var1.setViewport(new Viewport());
      Viewport var10 = new Viewport();
      var10.setPos(0.0F, 0.0F, (float)(50 - var13.method2065()));
      var13.method2069(var10, (Class92)null, 1);
      int var11 = this.anInt_6053 * 13 / 16;
      int var12 = (this.anInt_6053 - var11) / 2;
      aClass170_6066.method2130(var12, var12, var11, var11, 0, -16777216 | this.anInt_6045, 1);
      this.aClass170_6051 = var1.method1932(0, 0, this.anInt_6053, this.anInt_6053, true);
      var1.method1977(2, 0);
      var1.drawOutline(0, 0, this.anInt_6053, this.anInt_6053, 0, 0);
      aClass170_6067.method2130(0, 0, this.anInt_6053, this.anInt_6053, 1, 0, 0);
      this.aClass170_6051.method2128(0, 0, 3);
      var1.method1946(var14);
      var1.method1965(anIntArray_6068[0], anIntArray_6068[1], anIntArray_6068[2], anIntArray_6068[3]);
   }

   static void method3864(Renderer var0) {
      if(aClass165_6065 == null) {
         ModelData var1 = new ModelData(580, 1104, 1);
         var1.method1224((short)0, (short)32767, (short)0, (short)1024, (short)1024, (short)1024, (byte)0, (byte)0, (byte)0);
         var1.method1220(0, 128, 0);
         var1.method1220(0, -128, 0);

         for(int var2 = 0; var2 <= 24; ++var2) {
            int var3 = var2 * 8192 / 24;
            int var4 = Class362.cosArray[var3];
            int var5 = Class362.sinArray[var3];

            int var6;
            int var7;
            int var8;
            int var9;
            int var10;
            for(var6 = 1; var6 < 24; ++var6) {
               var7 = var6 * 8192 / 24;
               var8 = Class362.sinArray[var7] >> 7;
               var9 = Class362.cosArray[var7] * var4 >> 21;
               var10 = Class362.cosArray[var7] * var5 >> 21;
               var1.method1220(var10, var8, -var9);
            }

            if(var2 > 0) {
               var6 = var2 * 23 + 2;
               var7 = var6 - 23;
               var1.method1223(0, var7, var6, (byte)0, (byte)0, (short)127, (byte)0, (short)0);

               for(var8 = 1; var8 < 23; ++var8) {
                  var9 = var7 + 1;
                  var10 = var6 + 1;
                  var1.method1223(var7, var9, var6, (byte)0, (byte)0, (short)127, (byte)0, (short)0);
                  var1.method1223(var9, var10, var6, (byte)0, (byte)0, (short)127, (byte)0, (short)0);
                  var7 = var9;
                  var6 = var10;
               }

               var1.method1223(var6, var7, 1, (byte)0, (byte)0, (short)127, (byte)0, (short)0);
            }
         }

         var1.anInt_1850 = var1.anInt_1849;
         var1.anIntArray_1866 = null;
         var1.anIntArray_1844 = null;
         var1.aByteArray_1861 = null;
         aClass165_6065 = var0.createModel(var1, '\uc800', 33, 64, 768);
      }

   }

   static void method3865(Renderer var0) {
      if(aClass170_6067 == null) {
         int[] var1 = new int[16384];
         int[] var2 = new int[16384];

         for(int var3 = 0; var3 < 64; ++var3) {
            int var4 = 64 - var3;
            var4 *= var4;
            int var5 = 128 - var3 - 1;
            int var6 = var3 * 128;
            int var7 = var5 * 128;

            for(int var8 = 0; var8 < 64; ++var8) {
               int var9 = 64 - var8;
               var9 *= var9;
               int var10 = 128 - var8 - 1;
               int var11 = 256 - (var9 + var4 << 8) / 4096;
               var11 = var11 * 3072 / 1536;
               if(var11 < 0) {
                  var11 = 0;
               } else if(var11 > 255) {
                  var11 = 255;
               }

               int var12 = var11 / 2;
               var2[var6 + var8] = var2[var6 + var10] = var2[var7 + var8] = var2[var7 + var10] = -16777216 | var11 << 16;
               var1[var6 + var8] = var1[var6 + var10] = var1[var7 + var8] = var1[var7 + var10] = 127 - var12 << 24 | 16777215;
            }
         }

         aClass170_6067 = var0.defineSprite(var2, 0, 128, 128, 128);
         aClass170_6066 = var0.defineSprite(var1, 0, 128, 128, 128);
      }

   }

   void method3866(Renderer var1, Class308 var2) {
      ModelData var3 = ModelData.createModelUnpacker(Class286.aCacheUnpacker_4796, this.anInt_6040, 0);
      if(var3 != null) {
         var1.method1913(anIntArray_6068);
         var1.method1965(0, 0, this.anInt_6053, this.anInt_6053);
         var1.method1977(2, 0);
         var1.drawOutline(0, 0, this.anInt_6053, this.anInt_6053, 0, 0);
         int var4 = 0;
         int var5 = 0;
         int var6 = 256;
         if(var2 != null) {
            if(var2.aBoolean_6047) {
               var4 = -var2.anInt_6044;
               var5 = -var2.anInt_6039;
               var6 = -var2.anInt_6046;
            } else {
               var4 = this.anInt_6044 - var2.anInt_6044;
               var5 = this.anInt_6039 - var2.anInt_6039;
               var6 = this.anInt_6046 - var2.anInt_6046;
            }
         }

         int var7;
         int var8;
         int var9;
         int var10;
         if(this.anInt_6050 != 0) {
            var7 = -this.anInt_6050 & 16383;
            var8 = Class362.cosArray[var7];
            var9 = Class362.sinArray[var7];
            var10 = var5 * var9 - var6 * var8 >> 14;
            var6 = var5 * var8 + var6 * var9 >> 14;
            var5 = var10;
         }

         if(this.anInt_6063 != 0) {
            var7 = -this.anInt_6063 & 16383;
            var8 = Class362.cosArray[var7];
            var9 = Class362.sinArray[var7];
            var10 = var6 * var8 + var4 * var9 >> 14;
            var6 = var6 * var9 - var4 * var8 >> 14;
            var4 = var10;
         }

         var1.method1947(1.0F);
         var1.method1945(this.anInt_6045, 1.0F, 1.0F, (float)var4, (float)var5, (float)var6);
         var3.method1228(this.anInt_6056 & 16383, this.anInt_6057 & 16383, this.anInt_6048 & 16383);
         Model var16 = var1.createModel(var3, 2048, 0, 64, 768);
         var8 = var16.method2022() - var16.method2039();
         var9 = var16.method2056() - var16.method2041();
         var10 = var8 > var9?var8:var9;
         int var11 = 1024 * this.anInt_6053 / var10;
         ArrayViewport var12 = var1.method1984();
         ArrayViewport var13 = var1.method1936();
         var13.method4578((float)(this.anInt_6053 / 2), (float)(this.anInt_6053 / 2), (float)var11, (float)var11, 50.0F, 50000.0F, (float)var1.method1896(-1188574047).method2194(), (float)var1.method1896(-1823802439).method2198(), 1024.0F);
         var1.method1946(var13);
         Viewport var14 = new Viewport();
         var1.setViewport(var14);
         Viewport var15 = var1.method1979();
         var15.setPos(0.0F, 0.0F, (float)(50 - var16.method2065()));
         var16.method2069(var15, (Class92)null, 1);
         this.aClass170_6051 = var1.method1932(0, 0, this.anInt_6053, this.anInt_6053, true);
         this.aClass170_6051.method2128(0, 0, 3);
         var1.method1946(var12);
         var1.method1965(anIntArray_6068[0], anIntArray_6068[1], anIntArray_6068[2], anIntArray_6068[3]);
      }
   }

   public Class308(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11) {
      this.anInt_6044 = var3;
      this.anInt_6039 = var4;
      this.anInt_6046 = var5;
      this.aBoolean_6047 = var8;
      this.anInt_6040 = var2;
      this.anInt_6045 = var7;
      this.anInt_6043 = var6;
      this.anInt_6042 = var1;
      this.anInt_6056 = var9;
      this.anInt_6057 = var10;
      this.anInt_6048 = var11;
   }

   static void method3867() {
      aClass165_6065 = null;
      aClass170_6067 = null;
   }

}
