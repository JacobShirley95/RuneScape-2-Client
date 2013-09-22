import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.PixelGrabber;

public class WorldMapText {

   int anInt_3410;
   static final String aString_3411 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇÑñ";
   static int[] spriteIndices = new int[256];
   boolean aBoolean_3413 = false;
   Sprite[] sprites;
   int[] spriteWidths;
   int anInt_3416;
   int[] anIntArray_3417 = new int[4];
   static final int anInt_3418 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇÑñ".length();


   static {
      for(int var0 = 0; var0 < 256; ++var0) {
         int var1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇÑñ".indexOf(var0);
         if(var1 == -1) {
            var1 = 74;
         }

         spriteIndices[var0] = var1;
      }

   }

   int method2533() {
      return this.anInt_3416;
   }

   int method2534() {
      return this.anInt_3410 - 1;
   }

   int getRenderedWidth(String var1) {
      int var2 = 0;

      for(int var3 = 0; var3 < var1.length(); ++var3) {
         int var4 = spriteIndices[var1.charAt(var3)];
         var2 += this.spriteWidths[var4];
      }

      return var2;
   }

   void method2536(Renderer var1, String var2, int var3, int var4, int var5, boolean var6) {
      int var7 = this.getRenderedWidth(var2) / 2;
      var1.method1913(this.anIntArray_3417);
      if(var3 - var7 <= this.anIntArray_3417[2]) {
         if(var3 + var7 >= this.anIntArray_3417[0]) {
            if(var4 - this.anInt_3416 <= this.anIntArray_3417[3]) {
               if(var4 + this.anInt_3410 >= this.anIntArray_3417[1]) {
                  this.method2538(var1, var2, this.anIntArray_3417, var3 - var7, var4, var5, var6);
               }
            }
         }
      }
   }

   void defineCharSprite(Renderer var1, Font var2, FontMetrics var3, char var4, int var5, boolean var6) {
      int var7 = var3.charWidth(var4);
      int var8 = var7;
      if(var6) {
         try {
            if(var4 == 47) {
               var6 = false;
            }

            if(var4 == 102 || var4 == 116 || var4 == 119 || var4 == 118 || var4 == 107 || var4 == 120 || var4 == 121 || var4 == 65 || var4 == 86 || var4 == 87) {
               ++var7;
            }
         } catch (Exception var21) {
            ;
         }
      }

      int maxAscent = var3.getMaxAscent();
      int maxAscentAndDescent = var3.getMaxAscent() + var3.getMaxDescent();
      int height = var3.getHeight();
      Image var12 = Class51.clientCanvas.createImage(var7, maxAscentAndDescent);
      Graphics var13 = var12.getGraphics();
      var13.setColor(Color.black);
      var13.fillRect(0, 0, var7, maxAscentAndDescent);
      var13.setColor(Color.white);
      var13.setFont(var2);
      var13.drawString(var4 + "", 0, maxAscent);
      if(var6) {
         var13.drawString(var4 + "", 1, maxAscent);
      }

      int[] imageData = new int[var7 * maxAscentAndDescent];
      PixelGrabber var15 = new PixelGrabber(var12, 0, 0, var7, maxAscentAndDescent, imageData, 0, var7);

      try {
         var15.grabPixels();
      } catch (Exception var20) {
         ;
      }

      var12.flush();
      var12 = null;
      int var16 = 0;

      int var17;
      label64:
      for(var17 = 0; var17 < maxAscentAndDescent; ++var17) {
         for(int var18 = 0; var18 < var7; ++var18) {
            int var19 = imageData[var18 + var17 * var7];
            if((var19 & 16777215) != 0) {
               var16 = var17;
               break label64;
            }
         }
      }

      for(var17 = 0; var17 < imageData.length; ++var17) {
         if((imageData[var17] & 16777215) == 0) {
            imageData[var17] = 0;
         }
      }

      this.anInt_3416 = maxAscent - var16;
      this.anInt_3410 = height;
      this.spriteWidths[var5] = var8;
      this.sprites[var5] = var1.defineSprite(imageData, 0, var7, var7, maxAscentAndDescent);
   }

   WorldMapText(Renderer var1, int var2, boolean var3, Component var4) {
      this.aBoolean_3413 = false;
      this.sprites = new Sprite[256];
      this.spriteWidths = new int[256];
      Font var5 = new Font("Helvetica", var3?1:0, var2);
      FontMetrics var6 = var4.getFontMetrics(var5);

      int var7;
      for(var7 = 0; var7 < anInt_3418; ++var7) {
         this.defineCharSprite(var1, var5, var6, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇÑñ".charAt(var7), var7, false);
      }

      if(var3 && this.aBoolean_3413) {
         this.aBoolean_3413 = false;
         var5 = new Font("Helvetica", 0, var2);
         var6 = var4.getFontMetrics(var5);

         for(var7 = 0; var7 < anInt_3418; ++var7) {
            this.defineCharSprite(var1, var5, var6, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇÑñ".charAt(var7), var7, false);
         }

         if(!this.aBoolean_3413) {
            this.aBoolean_3413 = false;

            for(var7 = 0; var7 < anInt_3418; ++var7) {
               this.defineCharSprite(var1, var5, var6, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇÑñ".charAt(var7), var7, true);
            }
         }
      }

   }

   void method2538(Renderer var1, String var2, int[] var3, int var4, int var5, int var6, boolean var7) {
      if(var6 == 0) {
         var7 = false;
      }

      var6 |= -16777216;

      for(int var8 = 0; var8 < var2.length(); ++var8) {
         int var9 = spriteIndices[var2.charAt(var8)];
         if(var7) {
            this.sprites[var9].drawAt(var4 + 1, var5 + 1, 0, -16777216, 1);
         }

         this.sprites[var9].drawAt(var4, var5, 0, var6, 1);
         var4 += this.spriteWidths[var9];
      }

   }
}
