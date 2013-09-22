
public class FontRenderer_Sub3 extends FontRenderer {

   int[] anIntArray_10695;
   SoftwareRenderer aRenderer_Sub1_10696;
   int[] yCoords;
   byte[][] fontImageData;
   int[] anIntArray_10699;
   int[] xCoords;
   public static Class163 aClass163_10701;


   void method1074(char ch, int x, int y, int var4, boolean var5) {
      if(this.aRenderer_Sub1_10696.renderArray != null) {
         x += this.xCoords[ch];
         y += this.yCoords[ch];
         int charWidth = this.anIntArray_10695[ch];
         int charHeight = this.anIntArray_10699[ch];
         int var8 = this.aRenderer_Sub1_10696.renderWidth * 1176497263;
         int startIndex = x + var8 * y;
         int var10 = var8 - charWidth;
         int var11 = 0;
         int var12 = 0;
         int var13;
         if(y < this.aRenderer_Sub1_10696.targetWidth * 759884099) {
            var13 = 759884099 * this.aRenderer_Sub1_10696.targetWidth - y;
            charHeight -= var13;
            y = this.aRenderer_Sub1_10696.targetWidth * 759884099;
            var12 += var13 * charWidth;
            startIndex += var13 * var8;
         }

         if(charHeight + y > this.aRenderer_Sub1_10696.targetHeight * 108427145) {
            charHeight -= charHeight + y - 108427145 * this.aRenderer_Sub1_10696.targetHeight;
         }

         if(x < this.aRenderer_Sub1_10696.targetX * -346770183) {
            var13 = -346770183 * this.aRenderer_Sub1_10696.targetX - x;
            charWidth -= var13;
            x = -346770183 * this.aRenderer_Sub1_10696.targetX;
            var12 += var13;
            startIndex += var13;
            var11 += var13;
            var10 += var13;
         }

         if(x + charWidth > 1163141991 * this.aRenderer_Sub1_10696.targetY) {
            var13 = charWidth + x - 1163141991 * this.aRenderer_Sub1_10696.targetY;
            charWidth -= var13;
            var11 += var13;
            var10 += var13;
         }

         if(charWidth > 0 && charHeight > 0) {
            this.method7361(this.fontImageData[ch], this.aRenderer_Sub1_10696.renderArray, var4, var12, startIndex, charWidth, charHeight, var10, var11);
         }
      }
   }

   void method7361(byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      for(int var10 = -var7; var10 < 0; ++var10) {
         for(int var11 = -var6; var11 < 0; ++var11) {
            int var12 = var1[var4++] & 255;
            if(var12 != 0) {
               int var13 = ((var3 & '\uff00') * var12 & 16711680) + ((var3 & 16711935) * var12 & -16711936) >> 8;
               var12 = 256 - var12;
               int var14 = var2[var5];
               var2[var5++] = var13 + (((var14 & 16711935) * var12 & -16711936) + (var12 * (var14 & '\uff00') & 16711680) >> 8);
            } else {
               ++var5;
            }
         }

         var5 += var8;
         var4 += var9;
      }

   }

   void method7362(byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, Class1024 var13, int var14, int var15) {
      Class1024_Sub3 var16 = (Class1024_Sub3)var13;
      int[] var17 = var16.anIntArray_10982;
      int[] var18 = var16.anIntArray_10981;
      int var19 = var10 - this.aRenderer_Sub1_10696.targetX * -346770183;
      int var20 = var11;
      if(var15 > var11) {
         var20 = var15;
         var5 += this.aRenderer_Sub1_10696.renderWidth * 1176497263 * (var15 - var11);
         var4 += (var15 - var11) * var12;
      }

      int var21 = var15 + var17.length < var7 + var11?var15 + var17.length:var7 + var11;

      for(int var22 = var20; var22 < var21; ++var22) {
         int var23 = var17[var22 - var15] + var14;
         int var24 = var18[var22 - var15];
         int var25 = var6;
         int var26;
         if(var19 > var23) {
            var26 = var19 - var23;
            if(var26 >= var24) {
               var4 += var9 + var6;
               var5 += var6 + var8;
               continue;
            }

            var24 -= var26;
         } else {
            var26 = var23 - var19;
            if(var26 >= var6) {
               var4 += var6 + var9;
               var5 += var6 + var8;
               continue;
            }

            var4 += var26;
            var25 = var6 - var26;
            var5 += var26;
         }

         var26 = 0;
         if(var25 < var24) {
            var24 = var25;
         } else {
            var26 = var25 - var24;
         }

         for(int var27 = -var24; var27 < 0; ++var27) {
            int var28 = var1[var4++] & 255;
            if(var28 != 0) {
               int var29 = ((var3 & 16711935) * var28 & -16711936) + ((var3 & '\uff00') * var28 & 16711680) >> 8;
               var28 = 256 - var28;
               int var30 = var2[var5];
               var2[var5++] = var29 + ((var28 * (var30 & '\uff00') & 16711680) + (var28 * (var30 & 16711935) & -16711936) >> 8);
            } else {
               ++var5;
            }
         }

         var4 += var26 + var9;
         var5 += var8 + var26;
      }

   }

   FontRenderer_Sub3(SoftwareRenderer var1, RSFont var2, ImageData[] charImages, int[] var4, int[] var5) {
      super(var1, var2);
      this.aRenderer_Sub1_10696 = var1;
      this.aRenderer_Sub1_10696 = var1;
      this.anIntArray_10695 = var4;
      this.anIntArray_10699 = var5;
      this.fontImageData = new byte[charImages.length][];
      this.yCoords = new int[charImages.length];
      this.xCoords = new int[charImages.length];

      for(int var6 = 0; var6 < charImages.length; ++var6) {
         ImageData var7 = charImages[var6];
         if(var7.aByteArray_10493 != null) {
            this.fontImageData[var6] = var7.aByteArray_10493;
         } else {
            byte[] var8 = var7.data;
            byte[] var9 = this.fontImageData[var6] = new byte[var8.length];

            for(int var10 = 0; var10 < var8.length; ++var10) {
               var9[var10] = (byte)(var8[var10] == 0?0:-1);
            }
         }

         this.yCoords[var6] = var7.y;
         this.xCoords[var6] = var7.x;
      }

   }

   void method1071(char var1, int var2, int var3, int var4, boolean var5, Class1024 var6, int var7, int var8) {
      if(this.aRenderer_Sub1_10696.renderArray != null) {
         if(null == var6) {
            this.method1074(var1, var2, var3, var4, var5);
         } else {
            var2 += this.xCoords[var1];
            var3 += this.yCoords[var1];
            int var9 = this.anIntArray_10695[var1];
            int var10 = this.anIntArray_10699[var1];
            int var11 = 1176497263 * this.aRenderer_Sub1_10696.renderWidth;
            int var12 = var2 + var11 * var3;
            int var13 = var11 - var9;
            int var14 = 0;
            int var15 = 0;
            int var16;
            if(var3 < 759884099 * this.aRenderer_Sub1_10696.targetWidth) {
               var16 = 759884099 * this.aRenderer_Sub1_10696.targetWidth - var3;
               var10 -= var16;
               var3 = 759884099 * this.aRenderer_Sub1_10696.targetWidth;
               var15 += var16 * var9;
               var12 += var16 * var11;
            }

            if(var10 + var3 > 108427145 * this.aRenderer_Sub1_10696.targetHeight) {
               var10 -= var10 + var3 - this.aRenderer_Sub1_10696.targetHeight * 108427145;
            }

            if(var2 < -346770183 * this.aRenderer_Sub1_10696.targetX) {
               var16 = -346770183 * this.aRenderer_Sub1_10696.targetX - var2;
               var9 -= var16;
               var2 = -346770183 * this.aRenderer_Sub1_10696.targetX;
               var15 += var16;
               var12 += var16;
               var14 += var16;
               var13 += var16;
            }

            if(var2 + var9 > this.aRenderer_Sub1_10696.targetY * 1163141991) {
               var16 = var9 + var2 - this.aRenderer_Sub1_10696.targetY * 1163141991;
               var9 -= var16;
               var14 += var16;
               var13 += var16;
            }

            if(var9 > 0 && var10 > 0) {
               this.method7362(this.fontImageData[var1], this.aRenderer_Sub1_10696.renderArray, var4, var15, var12, var9, var10, var13, var14, var2, var3, this.anIntArray_10695[var1], var6, var7, var8);
            }
         }
      }
   }

   static final void method7364(RSInterfaceData var0, byte var1) {
      var0.intTypeIndex -= -1416056414;
      int var2 = var0.intTypes[-831324111 * var0.intTypeIndex];
      int var3 = var0.intTypes[1 + -831324111 * var0.intTypeIndex];
      if(null == RSInterface.interfaceGroups[var2]) {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 0;
      } else {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = -254367099 * RSInterface.interfaceGroups[var2].interfaceArray[var3].anInt_2571;
      }

   }

   public static void method7365(int var0) {
      Class418.method5190(10, (byte)-39);
      Class522.method5977(1092576685);
      System.gc();
   }

   static void putOnMM(RSInterface var0, Class1024 var1, int var2, int var3, int var4, int var5, Sprite sprite) {
      if(null != sprite) {
         int var8;
         if(2 == Class509.anInt_9182 * 1735950531) {
            var8 = (int)((double)Class542.aClass43_Sub1_9475.method394(-1962301117) * 2607.5945876176133D) + client.anInt_378 * -517467801 & 16383;
         } else if(1735950531 * Class509.anInt_9182 == 4) {
            var8 = (int)client.aFloat_501 & 16383;
         } else {
            var8 = (int)client.aFloat_501 + -517467801 * client.anInt_378 & 16383;
         }

         int var9 = Math.max(var0.width * -533669195 / 2, var0.height * 1833812087 / 2) + 10;
         int var10 = var4 * var4 + var5 * var5;
         if(var10 <= var9 * var9) {
            int x = Class362.cosArray[var8];
            int y = Class362.sinArray[var8];
            if(1735950531 * Class509.anInt_9182 != 4) {
               x = x * 256 / (256 + client.anInt_380 * 1121098075);
               y = y * 256 / (256 + 1121098075 * client.anInt_380);
            }

            int var13 = y * var4 + x * var5 >> 14;
            int var14 = var5 * y - var4 * x >> 14;
            if(null != var1) {
               sprite.method2142(-533669195 * var0.width / 2 + var2 + var13 - sprite.getFurthestX() / 2, var3 + var0.height * 1833812087 / 2 - var14 - sprite.getFurthestY() / 2, var1, var2, var3);
            } else {
               sprite.drawAt(var13 + var2 + -533669195 * var0.width / 2 - sprite.getFurthestX() / 2, var3 + 1833812087 * var0.height / 2 - var14 - sprite.getFurthestY() / 2);
            }

         }
      }
   }
}
