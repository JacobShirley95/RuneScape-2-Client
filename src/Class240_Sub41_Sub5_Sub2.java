
public class Class240_Sub41_Sub5_Sub2 extends Class240_Sub41_Sub5 {

   static final int anInt_3264 = 128;


   static int method2401(float var0, float[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, Class240_Sub41_Sub5_Sub2 var10) {
      var3 >>= 8;
      var9 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var5 *= 128;
      var6 *= 128;
      if((var7 = var4 + var9 - var3) > var8) {
         var7 = var8;
      }

      var4 <<= 1;
      var7 <<= 1;

      int var10001;
      for(var7 -= 6; var4 < var7; var2[var10001] = (int)((float)var2[var10001] + var0 * (float)var6)) {
         var0 = var1[var3++];
         var10001 = var4++;
         var2[var10001] = (int)((float)var2[var10001] + var0 * (float)var5);
         var10001 = var4++;
         var2[var10001] = (int)((float)var2[var10001] + var0 * (float)var6);
         var0 = var1[var3++];
         var10001 = var4++;
         var2[var10001] = (int)((float)var2[var10001] + var0 * (float)var5);
         var10001 = var4++;
         var2[var10001] = (int)((float)var2[var10001] + var0 * (float)var6);
         var0 = var1[var3++];
         var10001 = var4++;
         var2[var10001] = (int)((float)var2[var10001] + var0 * (float)var5);
         var10001 = var4++;
         var2[var10001] = (int)((float)var2[var10001] + var0 * (float)var6);
         var0 = var1[var3++];
         var10001 = var4++;
         var2[var10001] = (int)((float)var2[var10001] + var0 * (float)var5);
         var10001 = var4++;
      }

      for(var7 += 6; var4 < var7; var2[var10001] = (int)((float)var2[var10001] + var0 * (float)var6)) {
         var0 = var1[var3++];
         var10001 = var4++;
         var2[var10001] = (int)((float)var2[var10001] + var0 * (float)var5);
         var10001 = var4++;
      }

      var10.anInt_1193 = (var3 << 8) * 147588577;
      return var4 >> 1;
   }

   int method2402(int[] var1, int var2, int var3, int var4, float var5) {
      while(true) {
         if(this.anInt_1206 * -721397207 > 0) {
            int var6 = var2 + this.anInt_1206 * -721397207;
            if(var6 > var4) {
               var6 = var4;
            }

            this.anInt_1206 += var2 * 306700825;
            if(this.anInt_1196 * -208424667 == -256 && (this.anInt_1193 * -1348534751 & 255) == 0) {
               if(Class316.aBoolean_6136) {
                  var2 = method2411(0.0F, ((Class240_Sub7_Sub1_Sub2)this.aClass240_Sub7_7567).method2429(), var1, this.anInt_1193 * -1348534751, var2, this.anInt_1197 * -1017597731, this.anInt_1198 * 148739579, this.anInt_1200 * 2071015239, this.anInt_1201 * 2040591525, 0, var6, var3, this);
               } else {
                  var2 = method2410(((Class240_Sub7_Sub1_Sub2)this.aClass240_Sub7_7567).method2429(), var1, this.anInt_1193 * -1348534751, var2, this.anInt_1192 * 1876655185, this.anInt_1199 * -208963221, 0, var6, var3, this);
               }
            } else if(Class316.aBoolean_6136) {
               var2 = method2416(0.0F, 0, ((Class240_Sub7_Sub1_Sub2)this.aClass240_Sub7_7567).method2429(), var1, this.anInt_1193 * -1348534751, var2, this.anInt_1197 * -1017597731, this.anInt_1198 * 148739579, this.anInt_1200 * 2071015239, this.anInt_1201 * 2040591525, 0, var6, var3, this, this.anInt_1196 * -208424667, var5);
            } else {
               var2 = method2414(0.0F, 0, ((Class240_Sub7_Sub1_Sub2)this.aClass240_Sub7_7567).method2429(), var1, this.anInt_1193 * -1348534751, var2, this.anInt_1192 * 1876655185, this.anInt_1199 * -208963221, 0, var6, var3, this, this.anInt_1196 * -208424667, var5);
            }

            this.anInt_1206 -= var2 * 306700825;
            if(this.anInt_1206 * -721397207 != 0) {
               return var2;
            }

            if(!this.method616(905476288)) {
               continue;
            }

            return var4;
         }

         if(this.anInt_1196 * -208424667 == -256 && (this.anInt_1193 * -1348534751 & 255) == 0) {
            if(Class316.aBoolean_6136) {
               return method2415(0.0F, ((Class240_Sub7_Sub1_Sub2)this.aClass240_Sub7_7567).method2429(), var1, this.anInt_1193 * -1348534751, var2, this.anInt_1197 * -1017597731, this.anInt_1198 * 148739579, 0, var4, var3, this);
            }

            return method2403(((Class240_Sub7_Sub1_Sub2)this.aClass240_Sub7_7567).method2429(), var1, this.anInt_1193 * -1348534751, var2, this.anInt_1192 * 1876655185, 0, var4, var3, this);
         }

         if(Class316.aBoolean_6136) {
            return method2407(0.0F, 0, ((Class240_Sub7_Sub1_Sub2)this.aClass240_Sub7_7567).method2429(), var1, this.anInt_1193 * -1348534751, var2, this.anInt_1197 * -1017597731, this.anInt_1198 * 148739579, 0, var4, var3, this, this.anInt_1196 * -208424667, var5);
         }

         return method2418(0.0F, 0, ((Class240_Sub7_Sub1_Sub2)this.aClass240_Sub7_7567).method2429(), var1, this.anInt_1193 * -1348534751, var2, this.anInt_1192 * 1876655185, 0, var4, var3, this, this.anInt_1196 * -208424667, var5);
      }
   }

   Class240_Sub41_Sub5_Sub2(Class240_Sub7_Sub1_Sub2 var1, int var2, int var3, int var4) {
      this.aClass240_Sub7_7567 = var1;
      this.anInt_1203 = var1.anInt_1054 * 145558109;
      this.anInt_1204 = var1.anInt_1056 * 265620655;
      this.aBoolean_1205 = var1.aBoolean_1055;
      this.anInt_1196 = var2 * 1659044525;
      this.anInt_1194 = var3 * -2139464957;
      this.anInt_1195 = var4 * -1744650965;
      this.anInt_1193 = 0;
      this.method601(1503875904);
   }

   static int method2403(float[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, Class240_Sub41_Sub5_Sub2 var8) {
      var2 >>= 8;
      var7 >>= 8;
      var4 <<= 2;
      var4 *= 128;
      if((var5 = var3 + var2 - (var7 - 1)) > var6) {
         var5 = var6;
      }

      int var10001;
      for(var5 -= 3; var3 < var5; var1[var10001] = (int)((float)var1[var10001] + var0[var2--] * (float)var4)) {
         var10001 = var3++;
         var1[var10001] = (int)((float)var1[var10001] + var0[var2--] * (float)var4);
         var10001 = var3++;
         var1[var10001] = (int)((float)var1[var10001] + var0[var2--] * (float)var4);
         var10001 = var3++;
         var1[var10001] = (int)((float)var1[var10001] + var0[var2--] * (float)var4);
         var10001 = var3++;
      }

      for(var5 += 3; var3 < var5; var1[var10001] = (int)((float)var1[var10001] + var0[var2--] * (float)var4)) {
         var10001 = var3++;
      }

      var8.anInt_1193 = (var2 << 8) * 147588577;
      return var3;
   }

   int method2404(int[] var1, int var2, int var3, int var4, float var5) {
      while(true) {
         if(this.anInt_1206 * -721397207 > 0) {
            int var6 = var2 + this.anInt_1206 * -721397207;
            if(var6 > var4) {
               var6 = var4;
            }

            this.anInt_1206 += var2 * 306700825;
            if(this.anInt_1196 * -208424667 == 256 && (this.anInt_1193 * -1348534751 & 255) == 0) {
               if(Class316.aBoolean_6136) {
                  var2 = method2409(0.0F, ((Class240_Sub7_Sub1_Sub2)this.aClass240_Sub7_7567).method2429(), var1, this.anInt_1193 * -1348534751, var2, this.anInt_1197 * -1017597731, this.anInt_1198 * 148739579, this.anInt_1200 * 2071015239, this.anInt_1201 * 2040591525, 0, var6, var3, this);
               } else {
                  var2 = method2408(((Class240_Sub7_Sub1_Sub2)this.aClass240_Sub7_7567).method2429(), var1, this.anInt_1193 * -1348534751, var2, this.anInt_1192 * 1876655185, this.anInt_1199 * -208963221, 0, var6, var3, this);
               }
            } else if(Class316.aBoolean_6136) {
               var2 = method2413(0.0F, 0, ((Class240_Sub7_Sub1_Sub2)this.aClass240_Sub7_7567).method2429(), var1, this.anInt_1193 * -1348534751, var2, this.anInt_1197 * -1017597731, this.anInt_1198 * 148739579, this.anInt_1200 * 2071015239, this.anInt_1201 * 2040591525, 0, var6, var3, this, this.anInt_1196 * -208424667, var5);
            } else {
               var2 = method2412(0.0F, 0, ((Class240_Sub7_Sub1_Sub2)this.aClass240_Sub7_7567).method2429(), var1, this.anInt_1193 * -1348534751, var2, this.anInt_1192 * 1876655185, this.anInt_1199 * -208963221, 0, var6, var3, this, this.anInt_1196 * -208424667, var5);
            }

            this.anInt_1206 -= var2 * 306700825;
            if(this.anInt_1206 * -721397207 != 0) {
               return var2;
            }

            if(!this.method616(2088055814)) {
               continue;
            }

            return var4;
         }

         if(this.anInt_1196 * -208424667 == 256 && (this.anInt_1193 * -1348534751 & 255) == 0) {
            if(Class316.aBoolean_6136) {
               return method2401(0.0F, ((Class240_Sub7_Sub1_Sub2)this.aClass240_Sub7_7567).method2429(), var1, this.anInt_1193 * -1348534751, var2, this.anInt_1197 * -1017597731, this.anInt_1198 * 148739579, 0, var4, var3, this);
            }

            return method2417(((Class240_Sub7_Sub1_Sub2)this.aClass240_Sub7_7567).method2429(), var1, this.anInt_1193 * -1348534751, var2, this.anInt_1192 * 1876655185, 0, var4, var3, this);
         }

         if(Class316.aBoolean_6136) {
            return method2406(0.0F, 0, ((Class240_Sub7_Sub1_Sub2)this.aClass240_Sub7_7567).method2429(), var1, this.anInt_1193 * -1348534751, var2, this.anInt_1197 * -1017597731, this.anInt_1198 * 148739579, 0, var4, var3, this, this.anInt_1196 * -208424667, var5);
         }

         return method2405(0.0F, 0, ((Class240_Sub7_Sub1_Sub2)this.aClass240_Sub7_7567).method2429(), var1, this.anInt_1193 * -1348534751, var2, this.anInt_1192 * 1876655185, 0, var4, var3, this, this.anInt_1196 * -208424667, var5);
      }
   }

   static int method2405(float var0, int var1, float[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, Class240_Sub41_Sub5_Sub2 var10, int var11, float var12) {
      var6 *= 128;
      if(var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 257) / var11) > var8) {
         var7 = var8;
      }

      int var10001;
      while(var5 < var7) {
         var1 = var4 >> 8;
         var0 = var2[var1];
         var10001 = var5++;
         var3[var10001] += (int)((var0 * 256.0F + (var2[var1 + 1] - var0) * (float)(var4 & 255)) * (float)var6) >> 6;
         var4 += var11;
      }

      if(var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 1) / var11) > var8) {
         var7 = var8;
      }

      while(var5 < var7) {
         var0 = var2[var4 >> 8];
         var10001 = var5++;
         var3[var10001] += (int)((var0 * 256.0F + (var12 - var0) * (float)(var4 & 255)) * (float)var6) >> 6;
         var4 += var11;
      }

      var10.anInt_1193 = var4 * 147588577;
      return var5;
   }

   static int method2406(float var0, int var1, float[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, Class240_Sub41_Sub5_Sub2 var11, int var12, float var13) {
      var6 *= 128;
      var7 *= 128;
      if(var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      int var10001;
      for(var8 <<= 1; var5 < var8; var4 += var12) {
         var1 = var4 >> 8;
         var0 = var2[var1];
         var0 = var0 * 256.0F + (var2[var1 + 1] - var0) * (float)(var4 & 255);
         var10001 = var5++;
         var3[var10001] += (int)(var0 * (float)var6) >> 6;
         var10001 = var5++;
         var3[var10001] += (int)(var0 * (float)var7) >> 6;
      }

      if(var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12 - 1) / var12) > var9) {
         var8 = var9;
      }

      for(var8 <<= 1; var5 < var8; var4 += var12) {
         var0 = var2[var4 >> 8];
         var0 = var0 * 256.0F + (var13 - var0) * (float)(var4 & 255);
         var10001 = var5++;
         var3[var10001] += (int)(var0 * (float)var6) >> 6;
         var10001 = var5++;
         var3[var10001] += (int)(var0 * (float)var7) >> 6;
      }

      var11.anInt_1193 = var4 * 147588577;
      return var5 >> 1;
   }

   static int method2407(float var0, int var1, float[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, Class240_Sub41_Sub5_Sub2 var11, int var12, float var13) {
      var6 *= 128;
      var7 *= 128;
      if(var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      int var10001;
      for(var8 <<= 1; var5 < var8; var4 += var12) {
         var1 = var4 >> 8;
         var0 = var2[var1 - 1];
         var0 = var0 * 256.0F + (var2[var1] - var0) * (float)(var4 & 255);
         var10001 = var5++;
         var3[var10001] += (int)(var0 * (float)var6) >> 6;
         var10001 = var5++;
         var3[var10001] += (int)(var0 * (float)var7) >> 6;
      }

      if(var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      for(var8 <<= 1; var5 < var8; var4 += var12) {
         var0 = var13 * 256.0F + (var2[var4 >> 8] - var13) * (float)(var4 & 255);
         var10001 = var5++;
         var3[var10001] += (int)(var0 * (float)var6) >> 6;
         var10001 = var5++;
         var3[var10001] += (int)(var0 * (float)var7) >> 6;
      }

      var11.anInt_1193 = var4 * 147588577;
      return var5 >> 1;
   }

   static int method2408(float[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, Class240_Sub41_Sub5_Sub2 var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      var4 *= 128;
      var5 *= 128;
      if((var6 = var3 + var8 - var2) > var7) {
         var6 = var7;
      }

      var9.anInt_1197 += var9.anInt_1200 * 2071015239 * (var6 - var3) * 209954677;
      var9.anInt_1198 += var9.anInt_1201 * 2040591525 * (var6 - var3) * -1759892173;

      int var10001;
      for(var6 -= 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] = (int)((float)var1[var10001] + var0[var2++] * (float)var4);
         var4 += var5;
         var10001 = var3++;
         var1[var10001] = (int)((float)var1[var10001] + var0[var2++] * (float)var4);
         var4 += var5;
         var10001 = var3++;
         var1[var10001] = (int)((float)var1[var10001] + var0[var2++] * (float)var4);
         var4 += var5;
         var10001 = var3++;
         var1[var10001] = (int)((float)var1[var10001] + var0[var2++] * (float)var4);
      }

      for(var6 += 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] = (int)((float)var1[var10001] + var0[var2++] * (float)var4);
      }

      var9.anInt_1192 = (var4 / 128 >> 2) * -1876472655;
      var9.anInt_1193 = (var2 << 8) * 147588577;
      return var3;
   }

   static int method2409(float var0, float[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, Class240_Sub41_Sub5_Sub2 var12) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      var5 *= 128;
      var7 *= 128;
      var6 *= 128;
      var8 *= 128;
      if((var9 = var4 + var11 - var3) > var10) {
         var9 = var10;
      }

      var12.anInt_1192 += var12.anInt_1199 * -208963221 * (var9 - var4) * -1876472655;
      var4 <<= 1;
      var9 <<= 1;

      int var10001;
      for(var9 -= 6; var4 < var9; var6 += var8) {
         var0 = var1[var3++];
         var10001 = var4++;
         var2[var10001] = (int)((float)var2[var10001] + var0 * (float)var5);
         var5 += var7;
         var10001 = var4++;
         var2[var10001] = (int)((float)var2[var10001] + var0 * (float)var6);
         var6 += var8;
         var0 = var1[var3++];
         var10001 = var4++;
         var2[var10001] = (int)((float)var2[var10001] + var0 * (float)var5);
         var5 += var7;
         var10001 = var4++;
         var2[var10001] = (int)((float)var2[var10001] + var0 * (float)var6);
         var6 += var8;
         var0 = var1[var3++];
         var10001 = var4++;
         var2[var10001] = (int)((float)var2[var10001] + var0 * (float)var5);
         var5 += var7;
         var10001 = var4++;
         var2[var10001] = (int)((float)var2[var10001] + var0 * (float)var6);
         var6 += var8;
         var0 = var1[var3++];
         var10001 = var4++;
         var2[var10001] = (int)((float)var2[var10001] + var0 * (float)var5);
         var5 += var7;
         var10001 = var4++;
         var2[var10001] = (int)((float)var2[var10001] + var0 * (float)var6);
      }

      for(var9 += 6; var4 < var9; var6 += var8) {
         var0 = var1[var3++];
         var10001 = var4++;
         var2[var10001] = (int)((float)var2[var10001] + var0 * (float)var5);
         var5 += var7;
         var10001 = var4++;
         var2[var10001] = (int)((float)var2[var10001] + var0 * (float)var6);
      }

      var12.anInt_1197 = (var5 / 128 >> 2) * 209954677;
      var12.anInt_1198 = (var6 / 128 >> 2) * -1759892173;
      var12.anInt_1193 = (var3 << 8) * 147588577;
      return var4 >> 1;
   }

   static int method2410(float[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, Class240_Sub41_Sub5_Sub2 var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      var4 *= 128;
      var5 *= 128;
      if((var6 = var3 + var2 - (var8 - 1)) > var7) {
         var6 = var7;
      }

      var9.anInt_1197 += var9.anInt_1200 * 2071015239 * (var6 - var3) * 209954677;
      var9.anInt_1198 += var9.anInt_1201 * 2040591525 * (var6 - var3) * -1759892173;

      int var10001;
      for(var6 -= 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] = (int)((float)var1[var10001] + var0[var2--] * (float)var4);
         var4 += var5;
         var10001 = var3++;
         var1[var10001] = (int)((float)var1[var10001] + var0[var2--] * (float)var4);
         var4 += var5;
         var10001 = var3++;
         var1[var10001] = (int)((float)var1[var10001] + var0[var2--] * (float)var4);
         var4 += var5;
         var10001 = var3++;
         var1[var10001] = (int)((float)var1[var10001] + var0[var2--] * (float)var4);
      }

      for(var6 += 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] = (int)((float)var1[var10001] + var0[var2--] * (float)var4);
      }

      var9.anInt_1192 = (var4 / 128 >> 2) * -1876472655;
      var9.anInt_1193 = (var2 << 8) * 147588577;
      return var3;
   }

   static int method2411(float var0, float[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, Class240_Sub41_Sub5_Sub2 var12) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      var5 *= 128;
      var7 *= 128;
      var6 *= 128;
      var8 *= 128;
      if((var9 = var4 + var3 - (var11 - 1)) > var10) {
         var9 = var10;
      }

      var12.anInt_1192 += var12.anInt_1199 * -208963221 * (var9 - var4) * -1876472655;
      var4 <<= 1;
      var9 <<= 1;

      int var10001;
      for(var9 -= 6; var4 < var9; var6 += var8) {
         var0 = var1[var3--];
         var10001 = var4++;
         var2[var10001] = (int)((float)var2[var10001] + var0 * (float)var5);
         var5 += var7;
         var10001 = var4++;
         var2[var10001] = (int)((float)var2[var10001] + var0 * (float)var6);
         var6 += var8;
         var0 = var1[var3--];
         var10001 = var4++;
         var2[var10001] = (int)((float)var2[var10001] + var0 * (float)var5);
         var5 += var7;
         var10001 = var4++;
         var2[var10001] = (int)((float)var2[var10001] + var0 * (float)var6);
         var6 += var8;
         var0 = var1[var3--];
         var10001 = var4++;
         var2[var10001] = (int)((float)var2[var10001] + var0 * (float)var5);
         var5 += var7;
         var10001 = var4++;
         var2[var10001] = (int)((float)var2[var10001] + var0 * (float)var6);
         var6 += var8;
         var0 = var1[var3--];
         var10001 = var4++;
         var2[var10001] = (int)((float)var2[var10001] + var0 * (float)var5);
         var5 += var7;
         var10001 = var4++;
         var2[var10001] = (int)((float)var2[var10001] + var0 * (float)var6);
      }

      for(var9 += 6; var4 < var9; var6 += var8) {
         var0 = var1[var3--];
         var10001 = var4++;
         var2[var10001] = (int)((float)var2[var10001] + var0 * (float)var5);
         var5 += var7;
         var10001 = var4++;
         var2[var10001] = (int)((float)var2[var10001] + var0 * (float)var6);
      }

      var12.anInt_1197 = (var5 / 128 >> 2) * 209954677;
      var12.anInt_1198 = (var6 / 128 >> 2) * -1759892173;
      var12.anInt_1193 = (var3 << 8) * 147588577;
      return var4 >> 1;
   }

   static int method2412(float var0, int var1, float[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, Class240_Sub41_Sub5_Sub2 var11, int var12, float var13) {
      var6 *= 128;
      var7 *= 128;
      var11.anInt_1197 -= var11.anInt_1200 * 2071015239 * var5 * 209954677;
      var11.anInt_1198 -= var11.anInt_1201 * 2040591525 * var5 * -1759892173;
      if(var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
         var8 = var9;
      }

      int var10001;
      while(var5 < var8) {
         var1 = var4 >> 8;
         var0 = var2[var1];
         var10001 = var5++;
         var3[var10001] += (int)((var0 * 256.0F + (var2[var1 + 1] - var0) * (float)(var4 & 255)) * (float)var6) >> 6;
         var6 += var7;
         var4 += var12;
      }

      if(var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 1) / var12) > var9) {
         var8 = var9;
      }

      while(var5 < var8) {
         var0 = var2[var4 >> 8];
         var10001 = var5++;
         var3[var10001] += (int)((var0 * 256.0F + (var13 - var0) * (float)(var4 & 255)) * (float)var6) >> 6;
         var6 += var7;
         var4 += var12;
      }

      var11.anInt_1197 += var11.anInt_1200 * 2071015239 * var5 * 209954677;
      var11.anInt_1198 += var11.anInt_1201 * 2040591525 * var5 * -1759892173;
      var11.anInt_1192 = var6 / 128 * -1876472655;
      var11.anInt_1193 = var4 * 147588577;
      return var5;
   }

   static int method2413(float var0, int var1, float[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, Class240_Sub41_Sub5_Sub2 var13, int var14, float var15) {
      var6 *= 128;
      var8 *= 128;
      var7 *= 128;
      var9 *= 128;
      var13.anInt_1192 -= var13.anInt_1199 * -208963221 * var5 * -1876472655;
      if(var14 == 0 || (var10 = var5 + (var12 - var4 + var14 - 257) / var14) > var11) {
         var10 = var11;
      }

      var5 <<= 1;

      int var10001;
      for(var10 <<= 1; var5 < var10; var4 += var14) {
         var1 = var4 >> 8;
         var0 = var2[var1];
         var0 = var0 * 256.0F + (var2[var1 + 1] - var0) * (float)(var4 & 255);
         var10001 = var5++;
         var3[var10001] += (int)(var0 * (float)var6) >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += (int)(var0 * (float)var7) >> 6;
         var7 += var9;
      }

      if(var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14 - 1) / var14) > var11) {
         var10 = var11;
      }

      for(var10 <<= 1; var5 < var10; var4 += var14) {
         var0 = var2[var4 >> 8];
         var0 = var0 * 256.0F + (var15 - var0) * (float)(var4 & 255);
         var10001 = var5++;
         var3[var10001] += (int)(var0 * (float)var6) >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += (int)(var0 * (float)var7) >> 6;
         var7 += var9;
      }

      var5 >>= 1;
      var13.anInt_1192 += var13.anInt_1199 * -208963221 * var5 * -1876472655;
      var13.anInt_1197 = var6 / 128 * 209954677;
      var13.anInt_1198 = var7 / 128 * -1759892173;
      var13.anInt_1193 = var4 * 147588577;
      return var5;
   }

   static int method2414(float var0, int var1, float[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, Class240_Sub41_Sub5_Sub2 var11, int var12, float var13) {
      var6 *= 128;
      var7 *= 128;
      var11.anInt_1197 -= var11.anInt_1200 * 2071015239 * var5 * 209954677;
      var11.anInt_1198 -= var11.anInt_1201 * 2040591525 * var5 * -1759892173;
      if(var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      int var10001;
      while(var5 < var8) {
         var1 = var4 >> 8;
         var0 = var2[var1 - 1];
         var10001 = var5++;
         var3[var10001] += (int)((var0 * 256.0F + (var2[var1] - var0) * (float)(var4 & 255)) * (float)var6) >> 6;
         var6 += var7;
         var4 += var12;
      }

      if(var12 == 0 || (var8 = var5 + (var10 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      for(var0 = var13; var5 < var8; var4 += var12) {
         var10001 = var5++;
         var3[var10001] += (int)((var0 * 256.0F + (var2[var4 >> 8] - var0) * (float)(var4 & 255)) * (float)var6) >> 6;
         var6 += var7;
      }

      var11.anInt_1197 += var11.anInt_1200 * 2071015239 * var5 * 209954677;
      var11.anInt_1198 += var11.anInt_1201 * 2040591525 * var5 * -1759892173;
      var11.anInt_1192 = var6 / 128 * -1876472655;
      var11.anInt_1193 = var4 * 147588577;
      return var5;
   }

   static int method2415(float var0, float[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, Class240_Sub41_Sub5_Sub2 var10) {
      var3 >>= 8;
      var9 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var5 *= 128;
      var6 *= 128;
      if((var7 = var4 + var3 - (var9 - 1)) > var8) {
         var7 = var8;
      }

      var4 <<= 1;
      var7 <<= 1;

      int var10001;
      for(var7 -= 6; var4 < var7; var2[var10001] = (int)((float)var2[var10001] + var0 * (float)var6)) {
         var0 = var1[var3--];
         var10001 = var4++;
         var2[var10001] = (int)((float)var2[var10001] + var0 * (float)var5);
         var10001 = var4++;
         var2[var10001] = (int)((float)var2[var10001] + var0 * (float)var6);
         var0 = var1[var3--];
         var10001 = var4++;
         var2[var10001] = (int)((float)var2[var10001] + var0 * (float)var5);
         var10001 = var4++;
         var2[var10001] = (int)((float)var2[var10001] + var0 * (float)var6);
         var0 = var1[var3--];
         var10001 = var4++;
         var2[var10001] = (int)((float)var2[var10001] + var0 * (float)var5);
         var10001 = var4++;
         var2[var10001] = (int)((float)var2[var10001] + var0 * (float)var6);
         var0 = var1[var3--];
         var10001 = var4++;
         var2[var10001] = (int)((float)var2[var10001] + var0 * (float)var5);
         var10001 = var4++;
      }

      for(var7 += 6; var4 < var7; var2[var10001] = (int)((float)var2[var10001] + var0 * (float)var6)) {
         var0 = var1[var3--];
         var10001 = var4++;
         var2[var10001] = (int)((float)var2[var10001] + var0 * (float)var5);
         var10001 = var4++;
      }

      var10.anInt_1193 = (var3 << 8) * 147588577;
      return var4 >> 1;
   }

   static int method2416(float var0, int var1, float[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, Class240_Sub41_Sub5_Sub2 var13, int var14, float var15) {
      var6 *= 128;
      var8 *= 128;
      var7 *= 128;
      var9 *= 128;
      var13.anInt_1192 -= var13.anInt_1199 * -208963221 * var5 * -1876472655;
      if(var14 == 0 || (var10 = var5 + (var12 + 256 - var4 + var14) / var14) > var11) {
         var10 = var11;
      }

      var5 <<= 1;

      int var10001;
      for(var10 <<= 1; var5 < var10; var4 += var14) {
         var1 = var4 >> 8;
         var0 = var2[var1 - 1];
         var0 = var0 * 256.0F + (var2[var1] - var0) * (float)(var4 & 255);
         var10001 = var5++;
         var3[var10001] += (int)(var0 * (float)var6) >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += (int)(var0 * (float)var7) >> 6;
         var7 += var9;
      }

      if(var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14) / var14) > var11) {
         var10 = var11;
      }

      for(var10 <<= 1; var5 < var10; var4 += var14) {
         var0 = var15 * 256.0F + (var2[var4 >> 8] - var15) * (float)(var4 & 255);
         var10001 = var5++;
         var3[var10001] += (int)(var0 * (float)var6) >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += (int)(var0 * (float)var7) >> 6;
         var7 += var9;
      }

      var5 >>= 1;
      var13.anInt_1192 += var13.anInt_1199 * -208963221 * var5 * -1876472655;
      var13.anInt_1197 = var6 / 128 * 209954677;
      var13.anInt_1198 = var7 / 128 * -1759892173;
      var13.anInt_1193 = var4 * 147588577;
      return var5;
   }

   static int method2417(float[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, Class240_Sub41_Sub5_Sub2 var8) {
      var2 >>= 8;
      var7 >>= 8;
      var4 <<= 2;
      var4 *= 128;
      if((var5 = var3 + var7 - var2) > var6) {
         var5 = var6;
      }

      int var10001;
      for(var5 -= 3; var3 < var5; var1[var10001] = (int)((float)var1[var10001] + var0[var2++] * (float)var4)) {
         var10001 = var3++;
         var1[var10001] = (int)((float)var1[var10001] + var0[var2++] * (float)var4);
         var10001 = var3++;
         var1[var10001] = (int)((float)var1[var10001] + var0[var2++] * (float)var4);
         var10001 = var3++;
         var1[var10001] = (int)((float)var1[var10001] + var0[var2++] * (float)var4);
         var10001 = var3++;
      }

      for(var5 += 3; var3 < var5; var1[var10001] = (int)((float)var1[var10001] + var0[var2++] * (float)var4)) {
         var10001 = var3++;
      }

      var8.anInt_1193 = (var2 << 8) * 147588577;
      return var3;
   }

   static int method2418(float var0, int var1, float[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, Class240_Sub41_Sub5_Sub2 var10, int var11, float var12) {
      var6 *= 128;
      if(var11 == 0 || (var7 = var5 + (var9 + 256 - var4 + var11) / var11) > var8) {
         var7 = var8;
      }

      int var10001;
      while(var5 < var7) {
         var1 = var4 >> 8;
         var0 = var2[var1 - 1];
         var10001 = var5++;
         var3[var10001] += (int)((var0 * 256.0F + (var2[var1] - var0) * (float)(var4 & 255)) * (float)var6) >> 6;
         var4 += var11;
      }

      if(var11 == 0 || (var7 = var5 + (var9 - var4 + var11) / var11) > var8) {
         var7 = var8;
      }

      for(var0 = var12; var5 < var7; var4 += var11) {
         var10001 = var5++;
         var3[var10001] += (int)((var0 * 256.0F + (var2[var4 >> 8] - var0) * (float)(var4 & 255)) * (float)var6) >> 6;
      }

      var10.anInt_1193 = var4 * 147588577;
      return var5;
   }

   public synchronized void method4937(int[] var1, int var2, int var3) throws IllegalStateException {
      if(this.anInt_1194 * -242391125 == 0 && this.anInt_1206 * -721397207 == 0) {
         this.method4935(var3);
      } else {
         int var4 = this.anInt_1203 * 333398009 << 8;
         int var5 = this.anInt_1204 * 960762737 << 8;
         int var6 = ((Class240_Sub7_Sub1_Sub2)this.aClass240_Sub7_7567).method508() << 8;
         int var7 = var5 - var4;
         if(var7 <= 0) {
            this.anInt_1202 = 0;
         }

         int var8 = var2;
         var3 += var2;
         if(this.anInt_1193 * -1348534751 < 0) {
            if(this.anInt_1196 * -208424667 <= 0) {
               this.method611((byte)-16);
               this.shiftNext();
               return;
            }

            this.anInt_1193 = 0;
         }

         if(this.anInt_1193 * -1348534751 >= var6) {
            if(this.anInt_1196 * -208424667 >= 0) {
               this.method611((byte)-31);
               this.shiftNext();
               return;
            }

            this.anInt_1193 = (var6 - 1) * 147588577;
         }

         if(this.anInt_1202 * 221893437 < 0) {
            if(this.aBoolean_1205) {
               if(this.anInt_1196 * -208424667 < 0) {
                  var8 = this.method2402(var1, var2, var4, var3, ((Class240_Sub7_Sub1_Sub2)this.aClass240_Sub7_7567).method2429()[this.anInt_1203 * 333398009]);
                  if(this.anInt_1193 * -1348534751 >= var4) {
                     return;
                  }

                  this.anInt_1193 = (var4 + var4 - 1 - this.anInt_1193 * -1348534751) * 147588577;
                  this.anInt_1196 = -(this.anInt_1196 * 1);
               }

               while(true) {
                  var8 = this.method2404(var1, var8, var5, var3, ((Class240_Sub7_Sub1_Sub2)this.aClass240_Sub7_7567).method2429()[this.anInt_1204 * 960762737 - 1]);
                  if(this.anInt_1193 * -1348534751 < var5) {
                     return;
                  }

                  this.anInt_1193 = (var5 + var5 - 1 - this.anInt_1193 * -1348534751) * 147588577;
                  this.anInt_1196 = -(this.anInt_1196 * 1);
                  var8 = this.method2402(var1, var8, var4, var3, ((Class240_Sub7_Sub1_Sub2)this.aClass240_Sub7_7567).method2429()[this.anInt_1203 * 333398009]);
                  if(this.anInt_1193 * -1348534751 >= var4) {
                     return;
                  }

                  this.anInt_1193 = (var4 + var4 - 1 - this.anInt_1193 * -1348534751) * 147588577;
                  this.anInt_1196 = -(this.anInt_1196 * 1);
               }
            } else if(this.anInt_1196 * -208424667 < 0) {
               while(true) {
                  var8 = this.method2402(var1, var8, var4, var3, ((Class240_Sub7_Sub1_Sub2)this.aClass240_Sub7_7567).method2429()[this.anInt_1204 * 960762737 - 1]);
                  if(this.anInt_1193 * -1348534751 >= var4) {
                     return;
                  }

                  this.anInt_1193 = (var5 - 1 - (var5 - 1 - this.anInt_1193 * -1348534751) % var7) * 147588577;
               }
            } else {
               while(true) {
                  var8 = this.method2404(var1, var8, var5, var3, ((Class240_Sub7_Sub1_Sub2)this.aClass240_Sub7_7567).method2429()[this.anInt_1203 * 333398009]);
                  if(this.anInt_1193 * -1348534751 < var5) {
                     return;
                  }

                  this.anInt_1193 = (var4 + (this.anInt_1193 * -1348534751 - var4) % var7) * 147588577;
               }
            }
         } else {
            if(this.anInt_1202 * 221893437 > 0) {
               if(this.aBoolean_1205) {
                  label134: {
                     if(this.anInt_1196 * -208424667 < 0) {
                        var8 = this.method2402(var1, var2, var4, var3, ((Class240_Sub7_Sub1_Sub2)this.aClass240_Sub7_7567).method2429()[this.anInt_1203 * 333398009]);
                        if(this.anInt_1193 * -1348534751 >= var4) {
                           return;
                        }

                        this.anInt_1193 = (var4 + var4 - 1 - this.anInt_1193 * -1348534751) * 147588577;
                        this.anInt_1196 = -(this.anInt_1196 * 1);
                        if((this.anInt_1202 -= -1439491051) * 221893437 == 0) {
                           break label134;
                        }
                     }

                     do {
                        var8 = this.method2404(var1, var8, var5, var3, ((Class240_Sub7_Sub1_Sub2)this.aClass240_Sub7_7567).method2429()[this.anInt_1204 * 960762737 - 1]);
                        if(this.anInt_1193 * -1348534751 < var5) {
                           return;
                        }

                        this.anInt_1193 = (var5 + var5 - 1 - this.anInt_1193 * -1348534751) * 147588577;
                        this.anInt_1196 = -(this.anInt_1196 * 1);
                        if((this.anInt_1202 -= -1439491051) * 221893437 == 0) {
                           break;
                        }

                        var8 = this.method2402(var1, var8, var4, var3, ((Class240_Sub7_Sub1_Sub2)this.aClass240_Sub7_7567).method2429()[this.anInt_1203 * 333398009]);
                        if(this.anInt_1193 * -1348534751 >= var4) {
                           return;
                        }

                        this.anInt_1193 = (var4 + var4 - 1 - this.anInt_1193 * -1348534751) * 147588577;
                        this.anInt_1196 = -(this.anInt_1196 * 1);
                     } while((this.anInt_1202 -= -1439491051) * 221893437 != 0);
                  }
               } else {
                  int var9;
                  if(this.anInt_1196 * -208424667 < 0) {
                     while(true) {
                        var8 = this.method2402(var1, var8, var4, var3, ((Class240_Sub7_Sub1_Sub2)this.aClass240_Sub7_7567).method2429()[this.anInt_1204 * 960762737 - 1]);
                        if(this.anInt_1193 * -1348534751 >= var4) {
                           return;
                        }

                        var9 = (var5 - 1 - this.anInt_1193 * -1348534751) / var7;
                        if(var9 >= this.anInt_1202 * 221893437) {
                           this.anInt_1193 += var7 * this.anInt_1202 * 221893437 * 147588577;
                           this.anInt_1202 = 0;
                           break;
                        }

                        this.anInt_1193 += var7 * var9 * 147588577;
                        this.anInt_1202 -= var9 * -1439491051;
                     }
                  } else {
                     while(true) {
                        var8 = this.method2404(var1, var8, var5, var3, ((Class240_Sub7_Sub1_Sub2)this.aClass240_Sub7_7567).method2429()[this.anInt_1203 * 333398009]);
                        if(this.anInt_1193 * -1348534751 < var5) {
                           return;
                        }

                        var9 = (this.anInt_1193 * -1348534751 - var4) / var7;
                        if(var9 >= this.anInt_1202 * 221893437) {
                           this.anInt_1193 -= var7 * this.anInt_1202 * 221893437 * 147588577;
                           this.anInt_1202 = 0;
                           break;
                        }

                        this.anInt_1193 -= var7 * var9 * 147588577;
                        this.anInt_1202 -= var9 * -1439491051;
                     }
                  }
               }
            }

            if(this.anInt_1196 * -208424667 < 0) {
               this.method2402(var1, var8, 0, var3, 0.0F);
               if(this.anInt_1193 * -1348534751 < 0) {
                  this.anInt_1193 = -147588577;
                  this.method611((byte)10);
                  this.shiftNext();
               }
            } else {
               this.method2404(var1, var8, var6, var3, 0.0F);
               if(this.anInt_1193 * -1348534751 >= var6) {
                  this.anInt_1193 = var6 * 147588577;
                  this.method611((byte)2);
                  this.shiftNext();
               }
            }

         }
      }
   }
}
