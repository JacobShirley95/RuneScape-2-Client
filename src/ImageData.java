
public class ImageData extends AbstractImageData {

   public int width;
   public int height;
   public int x;
   int posX;
   public int y;
   int posY;
   public int[] anIntArray_10491;
   public byte[] data;
   public byte[] aByteArray_10493;


   public boolean method1376() {
      return this.aByteArray_10493 != null;
   }

   public int getWidth() {
      return this.width;
   }

   public int getHeight() {
      return this.height;
   }

   public int getAbsoluteX() {
      return this.width + this.x + this.posX;
   }

   public int getAbsoluteY() {
      return this.height + this.y + this.posY;
   }

   public int method1379() {
      return this.posX;
   }

   public int method1367() {
      return this.posY;
   }

   public int method1368() {
      return this.x;
   }

   public void method1373(int var1) {
      int var2 = -1;
      int var3;
      int var4;
      int var5;
      if(this.anIntArray_10491.length < 255) {
         for(var3 = 0; var3 < this.anIntArray_10491.length; ++var3) {
            if(this.anIntArray_10491[var3] == var1) {
               var2 = var3;
               break;
            }
         }

         if(var2 == -1) {
            var2 = this.anIntArray_10491.length;
            int[] var16 = new int[this.anIntArray_10491.length + 1];
            System.arraycopy(this.anIntArray_10491, 0, var16, 0, this.anIntArray_10491.length);
            this.anIntArray_10491 = var16;
            var16[var2] = var1;
         }
      } else {
         var3 = Integer.MAX_VALUE;
         var4 = var1 >> 16 & 255;
         var5 = var1 >> 8 & 255;
         int var6 = var1 & 255;

         for(int var7 = 0; var7 < this.anIntArray_10491.length; ++var7) {
            int var8 = this.anIntArray_10491[var7];
            int var9 = var8 >> 16 & 255;
            int var10 = var8 >> 8 & 255;
            int var11 = var8 & 255;
            int var12 = var4 - var9;
            if(var12 < 0) {
               var12 = -var12;
            }

            int var13 = var5 - var10;
            if(var13 < 0) {
               var13 = -var13;
            }

            int var14 = var6 - var11;
            if(var14 < 0) {
               var14 = -var14;
            }

            int var15 = var12 + var13 + var14;
            if(var15 < var3) {
               var3 = var15;
               var2 = var7;
            }
         }
      }

      for(var3 = this.height - 1; var3 > 0; --var3) {
         var4 = var3 * this.width;

         for(var5 = this.width - 1; var5 > 0; --var5) {
            if(this.anIntArray_10491[this.data[var5 + var4] & 255] == 0 && this.anIntArray_10491[this.data[var5 + var4 - 1 - this.width] & 255] != 0) {
               this.data[var5 + var4] = (byte)var2;
            }
         }
      }

   }

   public void method1378() {
      byte[] var1 = this.data;
      int var2;
      int var3;
      int var4;
      byte var5;
      if(this.aByteArray_10493 == null) {
         for(var2 = this.height - 1; var2 >= 0; --var2) {
            var3 = var2 * this.width;

            for(var4 = (var2 + 1) * this.width; var3 < var4; ++var3) {
               --var4;
               var5 = var1[var3];
               var1[var3] = var1[var4];
               var1[var4] = var5;
            }
         }
      } else {
         byte[] var7 = this.aByteArray_10493;

         for(var3 = this.height - 1; var3 >= 0; --var3) {
            var4 = var3 * this.width;

            for(int var6 = (var3 + 1) * this.width; var4 < var6; ++var4) {
               --var6;
               var5 = var1[var4];
               var1[var4] = var1[var6];
               var1[var6] = var5;
               var5 = var7[var4];
               var7[var4] = var7[var6];
               var7[var6] = var5;
            }
         }
      }

      var2 = this.x;
      this.x = this.posX;
      this.posX = var2;
   }

   public void method1374() {
      byte[] var1 = new byte[this.width * this.height];
      int var2 = 0;
      int var3;
      int var4;
      if(this.aByteArray_10493 == null) {
         for(var3 = 0; var3 < this.width; ++var3) {
            for(var4 = this.height - 1; var4 >= 0; --var4) {
               var1[var2++] = this.data[var3 + var4 * this.width];
            }
         }

         this.data = var1;
      } else {
         byte[] var6 = new byte[this.width * this.height];

         for(var4 = 0; var4 < this.width; ++var4) {
            for(int var5 = this.height - 1; var5 >= 0; --var5) {
               var1[var2] = this.data[var4 + var5 * this.width];
               var6[var2++] = this.aByteArray_10493[var4 + var5 * this.width];
            }
         }

         this.data = var1;
         this.aByteArray_10493 = var6;
      }

      var3 = this.y;
      this.y = this.x;
      this.x = this.posY;
      this.posY = this.posX;
      this.posX = var3;
      var3 = this.height;
      this.height = this.width;
      this.width = var3;
   }

   public int[] getPixelData(boolean var1) {
      int var2;
      int[] var3;
      int var4;
      int var5;
      int var6;
      int var7;
      if(var1) {
         var2 = this.getAbsoluteX();
         var3 = new int[var2 * this.getAbsoluteY()];
         if(this.aByteArray_10493 != null) {
            for(var4 = 0; var4 < this.height; ++var4) {
               var5 = var4 * this.width;
               var6 = this.x + (var4 + this.y) * var2;

               for(var7 = 0; var7 < this.width; ++var7) {
                  var3[var6++] = this.aByteArray_10493[var5] << 24 | this.anIntArray_10491[this.data[var5] & 255];
                  ++var5;
               }
            }
         } else {
            for(var4 = 0; var4 < this.height; ++var4) {
               var5 = var4 * this.width;
               var6 = this.x + (var4 + this.y) * var2;

               for(var7 = 0; var7 < this.width; ++var7) {
                  int var8 = this.anIntArray_10491[this.data[var5++] & 255];
                  if(var8 != 0) {
                     var3[var6++] = -16777216 | var8;
                  } else {
                     var3[var6++] = 0;
                  }
               }
            }
         }
      } else {
         var3 = new int[this.width * this.height];
         var2 = 0;
         var4 = 0;
         if(this.aByteArray_10493 != null) {
            for(var5 = 0; var5 < this.height; ++var5) {
               for(var6 = 0; var6 < this.width; ++var6) {
                  var3[var4++] = this.aByteArray_10493[var2] << 24 | this.anIntArray_10491[this.data[var2] & 255];
                  ++var2;
               }
            }
         } else {
            for(var5 = 0; var5 < this.height; ++var5) {
               for(var6 = 0; var6 < this.width; ++var6) {
                  var7 = this.anIntArray_10491[this.data[var2++] & 255];
                  var3[var4++] = var7 != 0?-16777216 | var7:0;
               }
            }
         }
      }

      return var3;
   }

   public void setPosition(int var1, int var2, int var3) {
      for(int var4 = 1; var4 < this.anIntArray_10491.length; ++var4) {
         if(this.anIntArray_10491[var4] != 1 && this.anIntArray_10491[var4] != 16711935) {
            int var5 = this.anIntArray_10491[var4] >> 16 & 255;
            var5 += var1;
            if(var5 < 0) {
               var5 = 0;
            } else if(var5 > 255) {
               var5 = 255;
            }

            int var6 = this.anIntArray_10491[var4] >> 8 & 255;
            var6 += var2;
            if(var6 < 0) {
               var6 = 0;
            } else if(var6 > 255) {
               var6 = 255;
            }

            int var7 = this.anIntArray_10491[var4] >> 0 & 255;
            var7 += var3;
            if(var7 < 0) {
               var7 = 0;
            } else if(var7 > 255) {
               var7 = 255;
            }

            this.anIntArray_10491[var4] = var5 << 16 | var6 << 8 | var7;
         }
      }

   }

   public int getColourAt(int var1, int var2) {
      return this.anIntArray_10491[this.data[var1 + var2 * this.width] & 255];
   }

   public void method1381() {
      byte[] var1 = this.data;
      int var2;
      int var3;
      int var4;
      int var5;
      byte var6;
      if(this.aByteArray_10493 == null) {
         for(var2 = (this.height >> 1) - 1; var2 >= 0; --var2) {
            var3 = var2 * this.width;
            var4 = (this.height - var2 - 1) * this.width;

            for(var5 = -this.width; var5 < 0; ++var5) {
               var6 = var1[var3];
               var1[var3] = var1[var4];
               var1[var4] = var6;
               ++var3;
               ++var4;
            }
         }
      } else {
         byte[] var8 = this.aByteArray_10493;

         for(var3 = (this.height >> 1) - 1; var3 >= 0; --var3) {
            var4 = var3 * this.width;
            var5 = (this.height - var3 - 1) * this.width;

            for(int var7 = -this.width; var7 < 0; ++var7) {
               var6 = var1[var4];
               var1[var4] = var1[var5];
               var1[var5] = var6;
               var6 = var8[var4];
               var8[var4] = var8[var5];
               var8[var5] = var6;
               ++var4;
               ++var5;
            }
         }
      }

      var2 = this.y;
      this.y = this.posY;
      this.posY = var2;
   }

   public int method1366() {
      return this.y;
   }

   public void method1371(int var1) {
      int var2 = this.getAbsoluteX();
      int var3 = this.getAbsoluteY();
      if(this.width != var2 || this.height != var3) {
         int var4 = var1;
         if(var1 > this.x) {
            var4 = this.x;
         }

         int var5 = var1;
         if(var1 + this.x + this.width > var2) {
            var5 = var2 - this.x - this.width;
         }

         int var6 = var1;
         if(var1 > this.y) {
            var6 = this.y;
         }

         int var7 = var1;
         if(var1 + this.y + this.height > var3) {
            var7 = var3 - this.y - this.height;
         }

         int var8 = this.width + var4 + var5;
         int var9 = this.height + var6 + var7;
         byte[] var10 = new byte[var8 * var9];
         int var12;
         int var13;
         int var14;
         if(this.aByteArray_10493 == null) {
            for(int var11 = 0; var11 < this.height; ++var11) {
               var12 = var11 * this.width;
               var13 = (var11 + var6) * var8 + var4;

               for(var14 = 0; var14 < this.width; ++var14) {
                  var10[var13++] = this.data[var12++];
               }
            }
         } else {
            byte[] var16 = new byte[var8 * var9];

            for(var12 = 0; var12 < this.height; ++var12) {
               var13 = var12 * this.width;
               var14 = (var12 + var6) * var8 + var4;

               for(int var15 = 0; var15 < this.width; ++var15) {
                  var16[var14] = this.aByteArray_10493[var13];
                  var10[var14++] = this.data[var13++];
               }
            }

            this.aByteArray_10493 = var16;
         }

         this.x -= var4;
         this.y -= var6;
         this.posX -= var5;
         this.posY -= var7;
         this.width = var8;
         this.height = var9;
         this.data = var10;
      }
   }

   public boolean method1364() {
      return true;
   }

   public void method1372(int var1) {
      int var2 = -1;
      int var3;
      int var5;
      int var6;
      int var7;
      if(this.anIntArray_10491.length < 255) {
         for(var3 = 0; var3 < this.anIntArray_10491.length; ++var3) {
            if(this.anIntArray_10491[var3] == var1) {
               var2 = var3;
               break;
            }
         }

         if(var2 == -1) {
            var2 = this.anIntArray_10491.length;
            int[] var16 = new int[this.anIntArray_10491.length + 1];
            System.arraycopy(this.anIntArray_10491, 0, var16, 0, this.anIntArray_10491.length);
            this.anIntArray_10491 = var16;
            var16[var2] = var1;
         }
      } else {
         var3 = Integer.MAX_VALUE;
         int var4 = var1 >> 16 & 255;
         var5 = var1 >> 8 & 255;
         var6 = var1 & 255;

         for(var7 = 0; var7 < this.anIntArray_10491.length; ++var7) {
            int var8 = this.anIntArray_10491[var7];
            int var9 = var8 >> 16 & 255;
            int var10 = var8 >> 8 & 255;
            int var11 = var8 & 255;
            int var12 = var4 - var9;
            if(var12 < 0) {
               var12 = -var12;
            }

            int var13 = var5 - var10;
            if(var13 < 0) {
               var13 = -var13;
            }

            int var14 = var6 - var11;
            if(var14 < 0) {
               var14 = -var14;
            }

            int var15 = var12 + var13 + var14;
            if(var15 < var3) {
               var3 = var15;
               var2 = var7;
            }
         }
      }

      var3 = 0;
      byte[] var17 = new byte[this.width * this.height];

      for(var5 = 0; var5 < this.height; ++var5) {
         for(var6 = 0; var6 < this.width; ++var6) {
            var7 = this.data[var3] & 255;
            if(this.anIntArray_10491[var7] == 0) {
               if(var6 > 0 && this.anIntArray_10491[this.data[var3 - 1] & 255] != 0) {
                  var7 = var2;
               } else if(var5 > 0 && this.anIntArray_10491[this.data[var3 - this.width] & 255] != 0) {
                  var7 = var2;
               } else if(var6 < this.width - 1 && this.anIntArray_10491[this.data[var3 + 1] & 255] != 0) {
                  var7 = var2;
               } else if(var5 < this.height - 1 && this.anIntArray_10491[this.data[var3 + this.width] & 255] != 0) {
                  var7 = var2;
               }
            }

            var17[var3++] = (byte)var7;
         }
      }

      this.data = var17;
   }

   public void method1377() {
      this.posY = 0;
      this.y = 0;
      this.posX = 0;
      this.x = 0;
   }
}
