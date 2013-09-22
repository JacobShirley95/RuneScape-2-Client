
public class BufferedImageData extends AbstractImageData {

   int anInt_10477;
   int height;
   int anInt_10479;
   int anInt_10480;
   int width;
   int anInt_10482;
   int[] colourData;
   boolean aBoolean_10484;


   public boolean method1364() {
      return false;
   }

   public boolean method1376() {
      return this.aBoolean_10484;
   }

   public int getWidth() {
      return this.width;
   }

   public int getHeight() {
      return this.height;
   }

   BufferedImageData(int var1, int var2, int[] var3) {
      this.width = var1;
      this.height = var2;
      this.colourData = var3;
   }

   public int getAbsoluteY() {
      return this.height + this.anInt_10479 + this.anInt_10482;
   }

   public int method1379() {
      return this.anInt_10480;
   }

   public int method1366() {
      return this.anInt_10479;
   }

   public int method1368() {
      return this.anInt_10477;
   }

   public void method1372(int var1) {
      int var2 = 0;
      int[] var3 = new int[this.width * this.height];

      for(int var4 = 0; var4 < this.height; ++var4) {
         for(int var5 = 0; var5 < this.width; ++var5) {
            int var6 = this.colourData[var2];
            if((var6 & -16777216) == 0) {
               if(var5 > 0 && (this.colourData[var2 - 1] & -16777216) != 0) {
                  var6 = var1;
               } else if(var4 > 0 && (this.colourData[var2 - this.width] & -16777216) != 0) {
                  var6 = var1;
               } else if(var5 < this.width - 1 && (this.colourData[var2 + 1] & -16777216) != 0) {
                  var6 = var1;
               } else if(var4 < this.height - 1 && (this.colourData[var2 + this.width] & -16777216) != 0) {
                  var6 = var1;
               }
            }

            var3[var2++] = var6;
         }
      }

      this.colourData = var3;
   }

   public int method1367() {
      return this.anInt_10482;
   }

   public void method1373(int var1) {
      for(int var2 = this.height - 1; var2 > 0; --var2) {
         int var3 = var2 * this.width;

         for(int var4 = this.width - 1; var4 > 0; --var4) {
            if((this.colourData[var4 + var3] & -16777216) == 0 && (this.colourData[var4 + var3 - 1 - this.width] & -16777216) != 0) {
               this.colourData[var4 + var3] = var1;
            }
         }
      }

   }

   public int[] getPixelData(boolean var1) {
      if(var1 && (this.getAbsoluteX() != this.width || this.getAbsoluteY() != this.height)) {
         int var2 = this.getAbsoluteX();
         int[] var3 = new int[var2 * this.getAbsoluteY()];

         for(int var4 = 0; var4 < this.height; ++var4) {
            int var5 = var4 * this.width;
            int var6 = this.anInt_10477 + (var4 + this.anInt_10479) * var2;

            for(int var7 = 0; var7 < this.width; ++var7) {
               var3[var6++] = this.colourData[var5];
               ++var5;
            }
         }

         return var3;
      } else {
         return this.colourData;
      }
   }

   public void method1377() {
      this.anInt_10482 = 0;
      this.anInt_10479 = 0;
      this.anInt_10480 = 0;
      this.anInt_10477 = 0;
   }

   public int getColourAt(int var1, int var2) {
      return this.colourData[var1 + var2 * this.width];
   }

   public int getAbsoluteX() {
      return this.width + this.anInt_10477 + this.anInt_10480;
   }

   public void method1374() {
      int[] var1 = new int[this.width * this.height];
      int var2 = 0;

      int var3;
      for(var3 = 0; var3 < this.width; ++var3) {
         for(int var4 = this.height - 1; var4 >= 0; --var4) {
            var1[var2++] = this.colourData[var3 + var4 * this.width];
         }
      }

      this.colourData = var1;
      var3 = this.anInt_10479;
      this.anInt_10479 = this.anInt_10477;
      this.anInt_10477 = this.anInt_10482;
      this.anInt_10482 = this.anInt_10480;
      this.anInt_10480 = var3;
      var3 = this.height;
      this.height = this.width;
      this.width = var3;
   }

   public void setPosition(int var1, int var2, int var3) {
      for(int var4 = 1; var4 < this.colourData.length; ++var4) {
         int var5 = this.colourData[var4] >> 16 & 255;
         var5 += var1;
         if(var5 < 0) {
            var5 = 0;
         } else if(var5 > 255) {
            var5 = 255;
         }

         int var6 = this.colourData[var4] >> 8 & 255;
         var6 += var2;
         if(var6 < 0) {
            var6 = 0;
         } else if(var6 > 255) {
            var6 = 255;
         }

         int var7 = this.colourData[var4] >> 0 & 255;
         var7 += var3;
         if(var7 < 0) {
            var7 = 0;
         } else if(var7 > 255) {
            var7 = 255;
         }

         this.colourData[var4] = this.colourData[var4] & -16777216 | var5 << 16 | var6 << 8 | var7;
      }

   }

   public void method1371(int var1) {
      int var2 = this.getAbsoluteX();
      int var3 = this.getAbsoluteY();
      if(this.width != var2 || this.height != var3) {
         int var4 = var1;
         if(var1 > this.anInt_10477) {
            var4 = this.anInt_10477;
         }

         int var5 = var1;
         if(var1 + this.anInt_10477 + this.width > var2) {
            var5 = var2 - this.anInt_10477 - this.width;
         }

         int var6 = var1;
         if(var1 > this.anInt_10479) {
            var6 = this.anInt_10479;
         }

         int var7 = var1;
         if(var1 + this.anInt_10479 + this.height > var3) {
            var7 = var3 - this.anInt_10479 - this.height;
         }

         int var8 = this.width + var4 + var5;
         int var9 = this.height + var6 + var7;
         int[] var10 = new int[var8 * var9];

         for(int var11 = 0; var11 < this.height; ++var11) {
            int var12 = var11 * this.width;
            int var13 = (var11 + var6) * var8 + var4;

            for(int var14 = 0; var14 < this.width; ++var14) {
               var10[var13++] = this.colourData[var12++];
            }
         }

         this.anInt_10477 -= var4;
         this.anInt_10479 -= var6;
         this.anInt_10480 -= var5;
         this.anInt_10482 -= var7;
         this.width = var8;
         this.height = var9;
         this.colourData = var10;
      }
   }

   public void method1378() {
      int[] var1 = this.colourData;

      int var2;
      for(var2 = this.height - 1; var2 >= 0; --var2) {
         int var3 = var2 * this.width;

         for(int var4 = (var2 + 1) * this.width; var3 < var4; ++var3) {
            --var4;
            int var5 = var1[var3];
            var1[var3] = var1[var4];
            var1[var4] = var5;
         }
      }

      var2 = this.anInt_10477;
      this.anInt_10477 = this.anInt_10480;
      this.anInt_10480 = var2;
   }

   public void method1381() {
      int[] var1 = this.colourData;

      int var2;
      for(var2 = (this.height >> 1) - 1; var2 >= 0; --var2) {
         int var3 = var2 * this.width;
         int var4 = (this.height - var2 - 1) * this.width;

         for(int var5 = -this.width; var5 < 0; ++var5) {
            int var6 = var1[var3];
            var1[var3] = var1[var4];
            var1[var4] = var6;
            ++var3;
            ++var4;
         }
      }

      var2 = this.anInt_10479;
      this.anInt_10479 = this.anInt_10482;
      this.anInt_10482 = var2;
   }
}
