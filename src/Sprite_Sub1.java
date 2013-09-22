



public class Sprite_Sub1 extends Sprite {

   final Class384 aClass384_10665;
   int anInt_10666;
   int anInt_10667;
   final Class101 aClass101_10668;
   boolean aBoolean_10669;
   final Renderer_Sub3 renderer;
   int anInt_10671;
   final int anInt_10672;
   final int anInt_10673;
   int anInt_10674;
   final boolean aBoolean_10675;
   final boolean aBoolean_10676;
   final boolean aBoolean_10677;
   final boolean aBoolean_10678;


   Sprite_Sub1(Renderer_Sub3 var1, Class384 var2, int var3, int var4) {
      this.aBoolean_10669 = false;
      this.anInt_10671 = 0;
      this.anInt_10667 = 0;
      this.anInt_10666 = 0;
      this.anInt_10674 = 0;
      this.renderer = var1;
      this.anInt_10672 = var3;
      this.anInt_10673 = var4;
      this.aClass384_10665 = var2;
      this.aClass101_10668 = null;
      this.aBoolean_10675 = this.aClass384_10665.method4868() != var3;
      this.aBoolean_10676 = this.aClass384_10665.method4863() != var4;
      this.aBoolean_10677 = !this.aBoolean_10675 && this.aClass384_10665.method4866();
      this.aBoolean_10678 = !this.aBoolean_10676 && this.aClass384_10665.method4866();
   }

   public void method2128(int var1, int var2, int var3) {
      int[] var4 = this.renderer.method1906(var1, var2, this.anInt_10672, this.anInt_10673);
      int[] var5 = new int[this.anInt_10672 * this.anInt_10673];
      this.aClass384_10665.method4872(0, 0, this.anInt_10672, this.anInt_10673, var5, 0);
      int var6;
      int var7;
      int var8;
      if(var3 == 0) {
         for(var6 = 0; var6 < this.anInt_10673; ++var6) {
            var7 = var6 * this.anInt_10672;

            for(var8 = 0; var8 < this.anInt_10672; ++var8) {
               var5[var7 + var8] = var5[var7 + var8] & 16777215 | var4[var7 + var8] << 8 & -16777216;
            }
         }
      } else if(var3 == 1) {
         for(var6 = 0; var6 < this.anInt_10673; ++var6) {
            var7 = var6 * this.anInt_10672;

            for(var8 = 0; var8 < this.anInt_10672; ++var8) {
               var5[var7 + var8] = var5[var7 + var8] & 16777215 | var4[var7 + var8] << 16 & -16777216;
            }
         }
      } else if(var3 == 2) {
         for(var6 = 0; var6 < this.anInt_10673; ++var6) {
            var7 = var6 * this.anInt_10672;

            for(var8 = 0; var8 < this.anInt_10672; ++var8) {
               var5[var7 + var8] = var5[var7 + var8] & 16777215 | var4[var7 + var8] << 24 & -16777216;
            }
         }
      } else if(var3 == 3) {
         for(var6 = 0; var6 < this.anInt_10673; ++var6) {
            var7 = var6 * this.anInt_10672;

            for(var8 = 0; var8 < this.anInt_10672; ++var8) {
               var5[var7 + var8] = var5[var7 + var8] & 16777215 | (var4[var7 + var8] != 0?-16777216:0);
            }
         }
      }

      this.method7337(0, 0, this.anInt_10672, this.anInt_10673, var5, 0, this.anInt_10672);
   }

   public void setDimensions(int var1, int var2, int var3, int var4) {
      this.anInt_10667 = var1;
      this.anInt_10671 = var2;
      this.anInt_10674 = var3;
      this.anInt_10666 = var4;
      this.aBoolean_10669 = this.anInt_10667 != 0 || this.anInt_10671 != 0 || this.anInt_10674 != 0 || this.anInt_10666 != 0;
   }

   public void exportDimensions(int[] var1) {
      var1[0] = this.anInt_10667;
      var1[1] = this.anInt_10671;
      var1[2] = this.anInt_10674;
      var1[3] = this.anInt_10666;
   }

   public int getWidth() {
      return this.anInt_10672;
   }

   public int getFurthestX() {
      return this.anInt_10672 + this.anInt_10667 + this.anInt_10674;
   }

   public Class101 method2126() {
      return this.aClass101_10668;
   }

   Sprite_Sub1(Renderer_Sub3 var1, int var2, int var3, int[] var4, int var5, int var6) {
      this.aBoolean_10669 = false;
      this.anInt_10671 = 0;
      this.anInt_10667 = 0;
      this.anInt_10666 = 0;
      this.anInt_10674 = 0;
      this.renderer = var1;
      this.anInt_10672 = var2;
      this.anInt_10673 = var3;
      this.aClass101_10668 = null;
      this.aClass384_10665 = var1.method7219(var2, var3, false, var4, var5, var6);
      this.aClass384_10665.method4869(true, true);
      this.aBoolean_10675 = this.aClass384_10665.method4868() != var2;
      this.aBoolean_10676 = this.aClass384_10665.method4863() != var3;
      this.aBoolean_10677 = !this.aBoolean_10675 && this.aClass384_10665.method4866();
      this.aBoolean_10678 = !this.aBoolean_10676 && this.aClass384_10665.method4866();
   }

   void method7337(int var1, int var2, int var3, int var4, int[] var5, int var6, int var7) {
      this.aClass384_10665.method4867(var1, var2, var3, var4, var5, var6, var7);
   }

   public void drawAt(int var1, int var2, int var3, int var4, int var5) {
      if(this.renderer.method7148() != Class56.aClass56_1089) {
         var1 += this.anInt_10667;
         var2 += this.anInt_10671;
         this.renderer.aClass59_10605.method573((float)var1, (float)var2, (float)(var1 + this.anInt_10672), (float)(var2 + this.anInt_10673), 0.0F, 0.0F, this.aClass384_10665.method4864(), this.aClass384_10665.method4873(), this.aClass384_10665, var4);
      } else {
         this.renderer.method7194();
         this.renderer.method7279(var5);
         SpriteRenderer var6 = this.renderer.spriteRenderer;
         var6.aClass384_1262 = this.aClass384_10665;
         var6.method687(var3, var4);
         var1 += this.anInt_10667;
         var2 += this.anInt_10671;
         float var7 = (float)this.renderer.method1896(-326529337).method2194();
         float var8 = (float)this.renderer.method1896(910170198).method2198();
         var6.anArrayViewport_1265.method4557((float)this.anInt_10672 * 2.0F / var7, (float)this.anInt_10673 * 2.0F / var8, 1.0F, 1.0F);
         var6.anArrayViewport_1265.data[12] = ((float)var1 + this.renderer.method7146()) * 2.0F / var7 - 1.0F;
         var6.anArrayViewport_1265.data[13] = ((float)var2 + this.renderer.method7146()) * 2.0F / var8 - 1.0F;
         var6.anArrayViewport_1265.data[14] = -1.0F;
         var6.anArrayViewport_1263.method4557(this.aClass384_10665.method4862((float)this.anInt_10672), this.aClass384_10665.method4865((float)this.anInt_10673), 1.0F, 1.0F);
         var6.aClass76_1264 = this.renderer.aClass76_10649;
         var6.anInt_1268 = 0;
         var6.aClass379_1269 = this.renderer.aClass379_10652;
         var6.method688();
      }

   }

   public void method2127(int var1, int var2, int var3, int var4, int var5, int var6) {
      int[] var7 = this.renderer.method1906(var5, var6, var3, var4);
      if(var7 != null) {
         for(int var8 = 0; var8 < var7.length; ++var8) {
            var7[var8] |= -16777216;
         }

         this.method7337(var1, var2, var3, var4, var7, 0, var3);
      }

   }

   void method2144(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if(this.renderer.method7148() != Class56.aClass56_1089) {
         if(this.aBoolean_10669) {
            var3 = var3 * this.anInt_10672 / this.getFurthestX();
            var4 = var4 * this.anInt_10673 / this.getFurthestY();
            var1 += this.anInt_10667 * var3 / this.anInt_10672;
            var2 += this.anInt_10671 * var4 / this.anInt_10673;
         }

         this.renderer.aClass59_10605.method573((float)var1, (float)var2, (float)(var1 + var3), (float)(var2 + var4), this.aClass384_10665.method4862(0.0F), this.aClass384_10665.method4865(0.0F), this.aClass384_10665.method4862((float)this.anInt_10672), this.aClass384_10665.method4865((float)this.anInt_10673), this.aClass384_10665, var6);
      } else {
         this.renderer.method7194();
         this.renderer.method7279(var7);
         SpriteRenderer var9 = this.renderer.spriteRenderer;
         var9.aClass384_1262 = this.aClass384_10665;
         var9.method687(var5, var6);
         if(this.aBoolean_10669) {
            var3 = var3 * this.anInt_10672 / this.getFurthestX();
            var4 = var4 * this.anInt_10673 / this.getFurthestY();
            var1 += this.anInt_10667 * var3 / this.anInt_10672;
            var2 += this.anInt_10671 * var4 / this.anInt_10673;
         }

         float var10 = (float)this.renderer.method1896(-31262141).method2194();
         float var11 = (float)this.renderer.method1896(696529734).method2198();
         var9.anArrayViewport_1265.method4557((float)var3 * 2.0F / var10, (float)var4 * 2.0F / var11, 1.0F, 1.0F);
         var9.anArrayViewport_1265.data[12] = ((float)var1 + this.renderer.method7146()) * 2.0F / var10 - 1.0F;
         var9.anArrayViewport_1265.data[13] = ((float)var2 + this.renderer.method7146()) * 2.0F / var11 - 1.0F;
         var9.anArrayViewport_1265.data[14] = -1.0F;
         var9.anArrayViewport_1263.method4557(this.aClass384_10665.method4862((float)this.anInt_10672), this.aClass384_10665.method4865((float)this.anInt_10673), 1.0F, 1.0F);
         var9.aClass76_1264 = this.renderer.aClass76_10649;
         var9.anInt_1268 = 0;
         var9.aClass379_1269 = this.renderer.aClass379_10652;
         var9.method688();
      }

   }

   public void method2147(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var13;
      int var14;
      int var15;
      int var17;
      int var16;
      int var18;
      if(this.renderer.method7148() != Class56.aClass56_1089) {
         int var8 = var2 + var4;
         int var9 = var1 + var3;
         int var10 = this.getFurthestX();
         int var11 = this.getFurthestY();
         int var12 = var2 + this.anInt_10671;

         for(var13 = var12 + this.anInt_10673; var13 <= var8; var13 += var11) {
            var14 = var1 + this.anInt_10667;

            for(var15 = var14 + this.anInt_10672; var15 <= var9; var15 += var10) {
               this.renderer.aClass59_10605.method573((float)var14, (float)var12, (float)(var14 + this.anInt_10672), (float)(var12 + this.anInt_10673), 0.0F, 0.0F, this.aClass384_10665.method4864(), this.aClass384_10665.method4873(), this.aClass384_10665, var6);
               var14 += var10;
            }

            if(var14 < var9) {
               var16 = var9 - var14;
               this.renderer.aClass59_10605.method573((float)var14, (float)var12, (float)(var14 + var16), (float)(var12 + this.anInt_10673), 0.0F, 0.0F, (float)var16 / (float)this.anInt_10672 * this.aClass384_10665.method4864(), this.aClass384_10665.method4873(), this.aClass384_10665, var6);
            }

            var12 += var11;
         }

         if(var12 < var8) {
            var14 = var8 - var12;
            float var28 = (float)var14 / (float)this.anInt_10673 * this.aClass384_10665.method4873();
            var16 = var1 + this.anInt_10667;

            for(var17 = var16 + this.anInt_10672; var17 <= var9; var17 += var10) {
               this.renderer.aClass59_10605.method573((float)var16, (float)var12, (float)(var16 + this.anInt_10672), (float)(var12 + var14), 0.0F, 0.0F, this.aClass384_10665.method4864(), var28, this.aClass384_10665, var6);
               var16 += var10;
            }

            if(var16 < var9) {
               var18 = var9 - var16;
               this.renderer.aClass59_10605.method573((float)var16, (float)var12, (float)(var16 + var18), (float)(var12 + var14), 0.0F, 0.0F, (float)var18 / (float)this.anInt_10672 * this.aClass384_10665.method4864(), var28, this.aClass384_10665, var6);
            }
         }
      } else {
         this.renderer.method7194();
         this.renderer.method7279(var7);
         SpriteRenderer var23 = this.renderer.spriteRenderer;
         var23.aClass384_1262 = this.aClass384_10665;
         var23.method687(var5, var6);
         float var24 = (float)this.renderer.method1896(764374988).method2194();
         float var26 = (float)this.renderer.method1896(-882425124).method2198();
         var23.aClass76_1264 = this.renderer.aClass76_10649;
         var23.anInt_1268 = 0;
         var23.aClass379_1269 = this.renderer.aClass379_10652;
         boolean var25 = this.aBoolean_10678 && this.anInt_10671 == 0 && this.anInt_10666 == 0;
         boolean var27 = this.aBoolean_10677 && this.anInt_10667 == 0 && this.anInt_10674 == 0;
         if(var27 & var25) {
            var23.anArrayViewport_1265.method4557((float)var3 * 2.0F / var24, (float)var4 * 2.0F / var26, 1.0F, 1.0F);
            var23.anArrayViewport_1265.data[12] = ((float)var1 + this.renderer.method7146()) * 2.0F / var24 - 1.0F;
            var23.anArrayViewport_1265.data[13] = ((float)var2 + this.renderer.method7146()) * 2.0F / var26 - 1.0F;
            var23.anArrayViewport_1265.data[14] = -1.0F;
            var23.anArrayViewport_1263.method4557(this.aClass384_10665.method4862((float)var3), this.aClass384_10665.method4865((float)var4), 1.0F, 1.0F);
            var23.method688();
         } else if(var27) {
            var13 = var2 + var4;
            var14 = this.getFurthestY();
            var23.anArrayViewport_1263.method4557(this.aClass384_10665.method4862((float)var3), this.aClass384_10665.method4865((float)this.anInt_10673), 1.0F, 1.0F);
            var15 = var2 + this.anInt_10671;

            for(var16 = var15 + this.anInt_10673; var16 <= var13; var16 += var14) {
               var23.anArrayViewport_1265.method4557((float)var3 * 2.0F / var24, (float)this.anInt_10673 * 2.0F / var26, 1.0F, 1.0F);
               var23.anArrayViewport_1265.data[12] = ((float)var1 + this.renderer.method7146()) * 2.0F / var24 - 1.0F;
               var23.anArrayViewport_1265.data[13] = ((float)var15 + this.renderer.method7146()) * 2.0F / var26 - 1.0F;
               var23.anArrayViewport_1265.data[14] = -1.0F;
               var23.method688();
               var15 += var14;
            }

            if(var15 < var13) {
               var17 = var13 - var15;
               var23.anArrayViewport_1263.method4557(this.aClass384_10665.method4862((float)var3), this.aClass384_10665.method4865((float)var17), 1.0F, 1.0F);
               var23.anArrayViewport_1265.method4557((float)var3 * 2.0F / var24, (float)var17 * 2.0F / var26, 1.0F, 1.0F);
               var23.anArrayViewport_1265.data[12] = ((float)var1 + this.renderer.method7146()) * 2.0F / var24 - 1.0F;
               var23.anArrayViewport_1265.data[13] = ((float)var15 + this.renderer.method7146()) * 2.0F / var26 - 1.0F;
               var23.anArrayViewport_1265.data[14] = -1.0F;
               var23.method688();
            }
         } else if(var25) {
            var13 = var1 + var3;
            var14 = this.getFurthestX();
            var23.anArrayViewport_1263.method4557(this.aClass384_10665.method4862((float)this.anInt_10672), this.aClass384_10665.method4865((float)var4), 1.0F, 1.0F);
            var15 = var1 + this.anInt_10667;

            for(var16 = var15 + this.anInt_10672; var16 <= var13; var16 += var14) {
               var23.anArrayViewport_1265.method4557((float)this.anInt_10672 * 2.0F / var24, (float)var4 * 2.0F / var26, 1.0F, 1.0F);
               var23.anArrayViewport_1265.data[12] = ((float)var15 + this.renderer.method7146()) * 2.0F / var24 - 1.0F;
               var23.anArrayViewport_1265.data[13] = ((float)var2 + this.renderer.method7146()) * 2.0F / var26 - 1.0F;
               var23.anArrayViewport_1265.data[14] = -1.0F;
               var23.method688();
               var15 += var14;
            }

            if(var15 < var13) {
               var17 = var13 - var15;
               var23.anArrayViewport_1263.method4557(this.aClass384_10665.method4862((float)var17), this.aClass384_10665.method4865((float)var4), 1.0F, 1.0F);
               var23.anArrayViewport_1265.method4557((float)var17 * 2.0F / var24, (float)var4 * 2.0F / var26, 1.0F, 1.0F);
               var23.anArrayViewport_1265.data[12] = ((float)var15 + this.renderer.method7146()) * 2.0F / var24 - 1.0F;
               var23.anArrayViewport_1265.data[13] = ((float)var2 + this.renderer.method7146()) * 2.0F / var26 - 1.0F;
               var23.anArrayViewport_1265.data[14] = -1.0F;
               var23.method688();
            }
         } else {
            var13 = var2 + var4;
            var14 = var1 + var3;
            var15 = this.getFurthestX();
            var16 = this.getFurthestY();
            var17 = var2 + this.anInt_10671;

            int var19;
            int var21;
            int var20;
            for(var18 = var17 + this.anInt_10673; var18 <= var13; var18 += var16) {
               var23.anArrayViewport_1263.method4557(this.aClass384_10665.method4862((float)this.anInt_10672), this.aClass384_10665.method4865((float)this.anInt_10673), 1.0F, 1.0F);
               var19 = var1 + this.anInt_10667;

               for(var20 = var19 + this.anInt_10672; var20 <= var14; var20 += var15) {
                  var23.anArrayViewport_1265.method4557((float)this.anInt_10672 * 2.0F / var24, (float)this.anInt_10673 * 2.0F / var26, 1.0F, 1.0F);
                  var23.anArrayViewport_1265.data[12] = ((float)var19 + this.renderer.method7146()) * 2.0F / var24 - 1.0F;
                  var23.anArrayViewport_1265.data[13] = ((float)var17 + this.renderer.method7146()) * 2.0F / var26 - 1.0F;
                  var23.anArrayViewport_1265.data[14] = -1.0F;
                  var23.method688();
                  var19 += var15;
               }

               if(var19 < var14) {
                  var21 = var14 - var19;
                  var23.anArrayViewport_1263.method4557(this.aClass384_10665.method4862((float)var21), this.aClass384_10665.method4865((float)this.anInt_10673), 1.0F, 1.0F);
                  var23.anArrayViewport_1265.method4557((float)var21 * 2.0F / var24, (float)this.anInt_10673 * 2.0F / var26, 1.0F, 1.0F);
                  var23.anArrayViewport_1265.data[12] = ((float)var19 + this.renderer.method7146()) * 2.0F / var24 - 1.0F;
                  var23.anArrayViewport_1265.data[13] = ((float)var17 + this.renderer.method7146()) * 2.0F / var26 - 1.0F;
                  var23.anArrayViewport_1265.data[14] = -1.0F;
                  var23.method688();
               }

               var17 += var16;
            }

            if(var17 < var13) {
               var19 = var13 - var17;
               var23.anArrayViewport_1263.method4557(this.aClass384_10665.method4862((float)this.anInt_10672), this.aClass384_10665.method4865((float)var19), 1.0F, 1.0F);
               var20 = var1 + this.anInt_10667;

               for(var21 = var20 + this.anInt_10672; var21 <= var14; var21 += var15) {
                  var23.anArrayViewport_1265.method4557((float)this.anInt_10672 * 2.0F / var24, (float)var19 * 2.0F / var26, 1.0F, 1.0F);
                  var23.anArrayViewport_1265.data[12] = ((float)var20 + this.renderer.method7146()) * 2.0F / var24 - 1.0F;
                  var23.anArrayViewport_1265.data[13] = ((float)var17 + this.renderer.method7146()) * 2.0F / var26 - 1.0F;
                  var23.anArrayViewport_1265.data[14] = -1.0F;
                  var23.method688();
                  var20 += var15;
               }

               if(var20 < var14) {
                  int var22 = var14 - var20;
                  var23.anArrayViewport_1263.method4557(this.aClass384_10665.method4862((float)var22), this.aClass384_10665.method4865((float)var19), 1.0F, 1.0F);
                  var23.anArrayViewport_1265.method4557((float)var22 * 2.0F / var24, (float)var19 * 2.0F / var26, 1.0F, 1.0F);
                  var23.anArrayViewport_1265.data[12] = ((float)var20 + this.renderer.method7146()) * 2.0F / var24 - 1.0F;
                  var23.anArrayViewport_1265.data[13] = ((float)var17 + this.renderer.method7146()) * 2.0F / var26 - 1.0F;
                  var23.anArrayViewport_1265.data[14] = -1.0F;
                  var23.method688();
               }
            }
         }
      }

   }

   void method2146(float var1, float var2, float var3, float var4, float var5, float var6, int var7, int var8, int var9, int var10) {
      if(this.renderer.method7148() != Class56.aClass56_1089) {
         this.renderer.aClass59_10605.method582(var1, var2, var3, var4, var5, var6, var3 + var5 - var1, var4 + var6 - var2, 0.0F, 0.0F, this.aClass384_10665.method4864(), 0.0F, 0.0F, this.aClass384_10665.method4873(), this.aClass384_10665.method4864(), this.aClass384_10665.method4873(), this.aClass384_10665, var8);
      } else {
         this.renderer.method7194();
         this.renderer.method7279(var9);
         float var12;
         float var13;
         if(this.aBoolean_10669) {
            float var11 = (float)this.getFurthestX();
            var12 = (float)this.getFurthestY();
            var13 = (var3 - var1) / var11;
            float var14 = (var4 - var2) / var11;
            float var15 = (var5 - var1) / var12;
            float var16 = (var6 - var2) / var12;
            float var17 = var15 * (float)this.anInt_10671;
            float var18 = var16 * (float)this.anInt_10671;
            float var19 = var13 * (float)this.anInt_10667;
            float var20 = var14 * (float)this.anInt_10667;
            float var21 = -var13 * (float)this.anInt_10674;
            float var22 = -var14 * (float)this.anInt_10674;
            float var23 = -var15 * (float)this.anInt_10666;
            float var24 = -var16 * (float)this.anInt_10666;
            var1 = var1 + var19 + var17;
            var2 = var2 + var20 + var18;
            var3 = var3 + var21 + var17;
            var4 = var4 + var22 + var18;
            var5 = var5 + var19 + var23;
            var6 = var6 + var20 + var24;
         }

         SpriteRenderer var25 = this.renderer.spriteRenderer;
         var25.aClass384_1262 = this.aClass384_10665;
         var25.method687(var7, var8);
         var12 = (float)this.renderer.method1896(890612625).method2194();
         var13 = (float)this.renderer.method1896(-352778651).method2198();
         var25.anArrayViewport_1265.reset();
         var25.anArrayViewport_1265.data[0] = (var3 - var1) * 2.0F / var12;
         var25.anArrayViewport_1265.data[1] = (var4 - var2) * 2.0F / var13;
         var25.anArrayViewport_1265.data[4] = (var5 - var1) * 2.0F / var12;
         var25.anArrayViewport_1265.data[5] = (var6 - var2) * 2.0F / var13;
         var25.anArrayViewport_1265.data[12] = (var1 + this.renderer.method7146()) * 2.0F / var12 - 1.0F;
         var25.anArrayViewport_1265.data[13] = (var2 + this.renderer.method7146()) * 2.0F / var13 - 1.0F;
         var25.anArrayViewport_1265.data[14] = -1.0F;
         var25.anArrayViewport_1263.method4557(this.aClass384_10665.method4862((float)this.anInt_10672), this.aClass384_10665.method4865((float)this.anInt_10673), 1.0F, 1.0F);
         var25.aClass76_1264 = this.renderer.aClass76_10649;
         var25.anInt_1268 = 0;
         var25.aClass379_1269 = this.renderer.aClass379_10652;
         var25.method688();
      }

   }

   void method2139(float var1, float var2, float var3, float var4, float var5, float var6, int var7, Class1024 var8, int var9, int var10) {
      this.renderer.method7194();
      SpriteRenderer var11 = this.renderer.spriteRenderer;
      var11.aClass384_1262 = this.aClass384_10665;
      var11.method687(1, -1);
      float var12 = (float)this.renderer.method1896(-836040182).method2194();
      float var13 = (float)this.renderer.method1896(956026494).method2198();
      var11.anArrayViewport_1265.reset();
      if(this.aBoolean_10669) {
         float var14 = (float)this.anInt_10672 / (float)this.getFurthestX();
         float var15 = (float)this.anInt_10673 / (float)this.getFurthestY();
         var11.anArrayViewport_1265.data[0] = (var3 - var1) * var14;
         var11.anArrayViewport_1265.data[1] = (var4 - var2) * var14;
         var11.anArrayViewport_1265.data[4] = (var5 - var1) * var15;
         var11.anArrayViewport_1265.data[5] = (var6 - var2) * var15;
         var11.anArrayViewport_1265.data[12] = (var1 + (float)this.anInt_10667) * var14 + this.renderer.method7146();
         var11.anArrayViewport_1265.data[13] = (var2 + (float)this.anInt_10671) * var15 + this.renderer.method7146();
      } else {
         var11.anArrayViewport_1265.data[0] = var3 - var1;
         var11.anArrayViewport_1265.data[1] = var4 - var2;
         var11.anArrayViewport_1265.data[4] = var5 - var1;
         var11.anArrayViewport_1265.data[5] = var6 - var2;
         var11.anArrayViewport_1265.data[12] = var1 + this.renderer.method7146();
         var11.anArrayViewport_1265.data[13] = var2 + this.renderer.method7146();
      }

      ArrayViewport var17 = this.renderer.anArrayViewport_10527;
      var17.reset();
      var17.data[0] = 2.0F / var12;
      var17.data[5] = 2.0F / var13;
      var17.data[12] = -1.0F;
      var17.data[13] = -1.0F;
      var17.data[14] = -1.0F;
      var11.anArrayViewport_1265.method4580(var17);
      var11.anArrayViewport_1263.method4557(this.aClass384_10665.method4862((float)this.anInt_10672), this.aClass384_10665.method4865((float)this.anInt_10673), 1.0F, 1.0F);
      var11.aClass76_1264 = this.renderer.aClass76_10649;
      var11.anInt_1268 = 0;
      var11.aClass379_1269 = this.renderer.aClass379_10652;
      Class384 var16 = ((Class1024_Sub2)var8).aClass384_10776;
      var11.aClass384_1261 = var16;
      var11.anArrayViewport_1266.reset();
      var11.anArrayViewport_1266.data[0] = (var3 - var1) * var16.method4862(1.0F);
      var11.anArrayViewport_1266.data[1] = (var4 - var2) * var16.method4862(1.0F);
      var11.anArrayViewport_1266.data[4] = (var5 - var1) * var16.method4865(1.0F);
      var11.anArrayViewport_1266.data[5] = (var6 - var2) * var16.method4865(1.0F);
      var11.anArrayViewport_1266.data[12] = (var1 - (float)var9) * var16.method4862(1.0F);
      var11.anArrayViewport_1266.data[13] = (var2 - (float)var10) * var16.method4865(1.0F);
      var11.method689();
   }

   public int getFurthestY() {
      return this.anInt_10673 + this.anInt_10671 + this.anInt_10666;
   }

   Sprite_Sub1(Renderer_Sub3 var1, int var2, int var3, boolean var4, boolean var5) {
      this.aBoolean_10669 = false;
      this.anInt_10671 = 0;
      this.anInt_10667 = 0;
      this.anInt_10666 = 0;
      this.anInt_10674 = 0;
      this.renderer = var1;
      this.anInt_10672 = var2;
      this.anInt_10673 = var3;
      if(var5) {
         Class406 var6 = var1.method7292(var4?Class136.aClass136_2625:Class136.aClass136_2627, Class87.aClass87_1759, var2, var3);
         this.aClass101_10668 = var6.method5013(0);
         this.aClass384_10665 = var6;
      } else {
         this.aClass384_10665 = var1.method7217(var4?Class136.aClass136_2625:Class136.aClass136_2627, Class87.aClass87_1759, var2, var3);
         this.aClass101_10668 = null;
      }

      this.aClass384_10665.method4869(true, true);
      this.aBoolean_10675 = this.aClass384_10665.method4868() != var2;
      this.aBoolean_10676 = this.aClass384_10665.method4863() != var3;
      this.aBoolean_10677 = !this.aBoolean_10675 && this.aClass384_10665.method4866();
      this.aBoolean_10678 = !this.aBoolean_10676 && this.aClass384_10665.method4866();
   }

   public int getHeight() {
      return this.anInt_10673;
   }

   Sprite_Sub1(Renderer_Sub3 var1, Class384 var2) {
      this(var1, var2, var2.method4868(), var2.method4863());
   }

   public void method2142(int var1, int var2, Class1024 var3, int var4, int var5) {
      this.renderer.method7194();
      SpriteRenderer renderer = this.renderer.spriteRenderer;
      renderer.aClass384_1262 = this.aClass384_10665;
      renderer.method687(1, -1);
      var1 += this.anInt_10667;
      var2 += this.anInt_10671;
      float var7 = (float)this.renderer.method1896(-417962429).method2194();
      float var8 = (float)this.renderer.method1896(61660523).method2198();
      renderer.anArrayViewport_1265.method4557((float)this.anInt_10672 * 2.0F / var7, (float)this.anInt_10673 * 2.0F / var8, 1.0F, 1.0F);
      renderer.anArrayViewport_1265.data[12] = ((float)var1 + this.renderer.method7146()) * 2.0F / var7 - 1.0F;
      renderer.anArrayViewport_1265.data[13] = ((float)var2 + this.renderer.method7146()) * 2.0F / var8 - 1.0F;
      renderer.anArrayViewport_1265.data[14] = -1.0F;
      renderer.anArrayViewport_1263.method4557(this.aClass384_10665.method4862((float)this.anInt_10672), this.aClass384_10665.method4865((float)this.anInt_10673), 1.0F, 1.0F);
      renderer.aClass76_1264 = this.renderer.aClass76_10649;
      renderer.anInt_1268 = 0;
      renderer.aClass379_1269 = this.renderer.aClass379_10652;
      Class384 var9 = ((Class1024_Sub2)var3).aClass384_10776;
      renderer.aClass384_1261 = var9;
      renderer.anArrayViewport_1266.method4557(var9.method4862((float)this.anInt_10672), var9.method4865((float)this.anInt_10673), 1.0F, 1.0F);
      renderer.anArrayViewport_1266.data[12] = var9.method4862((float)(var1 - var4));
      renderer.anArrayViewport_1266.data[13] = var9.method4865((float)(var2 - var5));
      renderer.method689();
   }
}
