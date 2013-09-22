import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.ImageObserver;
import java.io.IOException;
import java.io.InputStream;

public class Class338 implements Class345 {

   int anInt_6507;
   Font aFont_6508;
   Image anImage_6509;
   Color aColor_6510;
   int anInt_6511;
   Image anImage_6512;
   boolean aBoolean_6513;
   Image anImage_6514;
   Image anImage_6515;
   Image anImage_6516;
   Image anImage_6517;
   Image anImage_6518;
   Image anImage_6519;
   Image anImage_6520;
   Image anImage_6521;
   boolean aBoolean_6522;
   FontMetrics aFontMetrics_6523;
   int anInt_6524;
   int anInt_6525;
   int anInt_6526;
   int anInt_6527;
   int anInt_6528;
   int anInt_6529;
   boolean aBoolean_6530;
   int anInt_6531;


   public boolean method4290(long var1) {
      return true;
   }

   final int method4181(int var1, byte var2) {
      return this.aBoolean_6513?(Class29.canvasWidth * 1111410531 - var1) / 2:0;
   }

   final int method4182(int var1, int var2) {
      return this.aBoolean_6522?(Class597.canvasHeight * -75607525 - var1) / 2:0;
   }

   public int method4286(int var1) {
      return 0;
   }

   Image method4184(String var1, int var2) throws IOException {
      try {
         InputStream var3 = Class481.clientApplet.getClass().getClassLoader().getResourceAsStream(var1);
         byte[] var4 = new byte[4000];

         int var6;
         for(int var5 = 0; (var6 = var3.read()) != -1; var4[var5++] = (byte)var6) {
            ;
         }

         Image var7 = Toolkit.getDefaultToolkit().createImage(var4);
         return var7;
      } catch (Exception var8) {
         throw new IOException();
      }
   }

   public void method4288(byte var1) {
      Class563_Sub1_Sub1_Sub1.method5128((byte)-101);
   }

   public void method4291(byte var1) {}

   public void method4287(boolean var1, byte var2) {
      if(!this.aBoolean_6530 && null == this.aFont_6508) {
         try {
            String[] var3 = Class136.method1799(client.aString_549, ',', (byte)52);
            if(var3.length != 23) {
               this.aBoolean_6530 = true;
            }

            this.aBoolean_6513 = Boolean.parseBoolean(var3[0]);
            this.aBoolean_6522 = Boolean.parseBoolean(var3[1]);
            this.anInt_6531 = LoadProgress.method4427(var3[2], -526350584) * 863379235;
            this.anInt_6524 = LoadProgress.method4427(var3[3], 1941239214) * 1563698379;
            this.anInt_6525 = LoadProgress.method4427(var3[4], -48213013) * 1220484261;
            this.anInt_6507 = LoadProgress.method4427(var3[5], -1296164267) * -1746284161;
            this.anInt_6527 = LoadProgress.method4427(var3[6], -393440891) * 1087033969;
            this.anInt_6528 = LoadProgress.method4427(var3[7], 2079790144) * 1594150159;
            this.anInt_6529 = LoadProgress.method4427(var3[8], -497985321) * 1035279949;
            this.anInt_6526 = LoadProgress.method4427(var3[9], 238424133) * 1477599893;
            String var4 = var3[10];
            int var5 = LoadProgress.method4427(var3[11], 1392335536);
            int var6 = Class343.method4253(var3[12].substring(2), 16, 1145471504);
            this.aFont_6508 = new Font(var4, 0, var5);
            this.aFontMetrics_6523 = Class51.clientCanvas.getFontMetrics(this.aFont_6508);
            this.aColor_6510 = new Color(var6);
            MediaTracker var7 = new MediaTracker(Class51.clientCanvas);
            this.anImage_6521 = this.method4184(var3[13], -1642061564);
            var7.addImage(this.anImage_6521, 0);
            this.anImage_6512 = this.method4184(var3[14], -1237168941);
            var7.addImage(this.anImage_6512, 1);
            this.anImage_6519 = this.method4184(var3[15], -843141292);
            var7.addImage(this.anImage_6519, 2);
            this.anImage_6514 = this.method4184(var3[16], -1994850384);
            var7.addImage(this.anImage_6514, 3);
            this.anImage_6515 = this.method4184(var3[17], -1142806454);
            var7.addImage(this.anImage_6515, 4);
            this.anImage_6516 = this.method4184(var3[18], -1349659503);
            var7.addImage(this.anImage_6516, 5);
            this.anImage_6517 = this.method4184(var3[19], -842909225);
            var7.addImage(this.anImage_6517, 6);
            this.anImage_6509 = this.method4184(var3[20], -1833418161);
            var7.addImage(this.anImage_6509, 7);
            this.anImage_6518 = this.method4184(var3[21], -1667072810);
            var7.addImage(this.anImage_6518, 8);
            var7.waitForAll();
            this.anInt_6511 = LoadProgress.method4427(var3[22], -1009800720) * -342734937;
         } catch (Exception var34) {
            this.aBoolean_6530 = true;
         }
      }

      if(this.aBoolean_6530) {
         this.method4188(-202392766);
      } else {
         Graphics var36 = Class51.clientCanvas.getGraphics();
         if(var36 != null) {
            try {
               int var37 = Class52.aClass327_1072.method4030(1178216062);
               String var38 = Class52.aClass327_1072.method4031((byte)0);
               if(Class2.anImage_19 == null) {
                  Class2.anImage_19 = Class51.clientCanvas.createImage(1111410531 * Class29.canvasWidth, Class597.canvasHeight * -75607525);
               }

               Graphics var39 = Class2.anImage_19.getGraphics();
               var39.setColor(Color.BLACK);
               var39.fillRect(0, 0, 1111410531 * Class29.canvasWidth, -75607525 * Class597.canvasHeight);
               int var40 = this.anImage_6517.getWidth((ImageObserver)null);
               int var8 = this.anImage_6509.getWidth((ImageObserver)null);
               int var9 = this.anImage_6518.getWidth((ImageObserver)null);
               int var10 = this.anImage_6517.getHeight((ImageObserver)null);
               int var11 = this.anImage_6509.getHeight((ImageObserver)null);
               int var12 = this.anImage_6518.getHeight((ImageObserver)null);
               var39.drawImage(this.anImage_6517, this.method4181(var40, (byte)-108) + this.anInt_6527 * -1837715823 - -1288091003 * this.anInt_6529 / 2, this.method4182(var10, 1270638561) + -1915715089 * this.anInt_6528, (ImageObserver)null);
               int var13 = var40 + (-1837715823 * this.anInt_6527 - -1288091003 * this.anInt_6529 / 2);
               int var14 = this.anInt_6529 * -1288091003 / 2 + this.anInt_6527 * -1837715823;

               int var15;
               for(var15 = var13; var15 <= var14; var15 += var9) {
                  var39.drawImage(this.anImage_6518, this.method4181(var40, (byte)-96) + -1837715823 * this.anInt_6527 + var15, this.method4182(var12, 1270638561) + this.anInt_6528 * -1915715089, (ImageObserver)null);
               }

               var39.drawImage(this.anImage_6509, this.method4181(var8, (byte)-82) + this.anInt_6527 * -1837715823 + this.anInt_6529 * -1288091003 / 2, this.method4182(var11, 1270638561) + this.anInt_6528 * -1915715089, (ImageObserver)null);
               var15 = this.anImage_6519.getWidth((ImageObserver)null);
               int var16 = this.anImage_6519.getHeight((ImageObserver)null);
               int var17 = this.anImage_6514.getWidth((ImageObserver)null);
               int var18 = this.anImage_6514.getHeight((ImageObserver)null);
               int var19 = this.anImage_6516.getHeight((ImageObserver)null);
               int var20 = this.anImage_6515.getWidth((ImageObserver)null);
               int var21 = this.anImage_6515.getHeight((ImageObserver)null);
               int var22 = this.anImage_6516.getWidth((ImageObserver)null);
               int var23 = this.anImage_6521.getWidth((ImageObserver)null);
               int var24 = this.anImage_6512.getWidth((ImageObserver)null);
               int var25 = this.method4181(1770220333 * this.anInt_6525, (byte)-105) + 449579147 * this.anInt_6531;
               int var26 = this.method4182(-1841041793 * this.anInt_6507, 1270638561) + this.anInt_6524 * 658383075;
               var39.drawImage(this.anImage_6519, var25, (this.anInt_6507 * -1841041793 - var16) / 2 + var26, (ImageObserver)null);
               var39.drawImage(this.anImage_6514, var25 + this.anInt_6525 * 1770220333 - var17, var26 + (this.anInt_6507 * -1841041793 - var18) / 2, (ImageObserver)null);
               if(this.anImage_6520 == null) {
                  this.anImage_6520 = Class51.clientCanvas.createImage(1770220333 * this.anInt_6525 - var15 - var17, -1841041793 * this.anInt_6507);
               }

               Graphics var27 = this.anImage_6520.getGraphics();

               int var28;
               for(var28 = 0; var28 < this.anInt_6525 * 1770220333 - var15 - var17; var28 += var20) {
                  var27.drawImage(this.anImage_6515, var28, 0, (ImageObserver)null);
               }

               for(var28 = 0; var28 < 1770220333 * this.anInt_6525 - var15 - var17; var28 += var22) {
                  var27.drawImage(this.anImage_6516, var28, -1841041793 * this.anInt_6507 - var19, (ImageObserver)null);
               }

               var28 = (1770220333 * this.anInt_6525 - var15 - var17) * var37 / 100;
               int var33;
               if(var28 > 0) {
                  Image var29 = Class51.clientCanvas.createImage(var28, this.anInt_6507 * -1841041793 - var21 - var19);
                  int var30 = var29.getWidth((ImageObserver)null);
                  Graphics var31 = var29.getGraphics();
                  int var32 = 498724887 * this.anInt_6511 * Class6.method36(-1579645067) / 10 % var23;

                  for(var33 = var32 - var23; var33 < var30; var33 += var23) {
                     var31.drawImage(this.anImage_6521, var33, 0, (ImageObserver)null);
                  }

                  var27.drawImage(var29, 0, var21, (ImageObserver)null);
               }

               int var43 = var28;
               var28 = this.anInt_6525 * 1770220333 - var15 - var17 - var28;
               if(var28 > 0) {
                  Image var41 = Class51.clientCanvas.createImage(var28, this.anInt_6507 * -1841041793 - var21 - var19);
                  int var42 = var41.getWidth((ImageObserver)null);
                  Graphics var44 = var41.getGraphics();

                  for(var33 = 0; var33 < var42; var33 += var24) {
                     var44.drawImage(this.anImage_6512, var33, 0, (ImageObserver)null);
                  }

                  var27.drawImage(var41, var43, var21, (ImageObserver)null);
               }

               var39.drawImage(this.anImage_6520, var25 + var15, var26, (ImageObserver)null);
               var39.setFont(this.aFont_6508);
               var39.setColor(this.aColor_6510);
               var39.drawString(var38, var25 + (this.anInt_6525 * 1770220333 - this.aFontMetrics_6523.stringWidth(var38)) / 2, this.anInt_6526 * -572368707 + 4 + -1841041793 * this.anInt_6507 / 2 + var26);
               var36.drawImage(Class2.anImage_19, 0, 0, (ImageObserver)null);
            } catch (Exception var35) {
               this.aBoolean_6530 = true;
            }
         } else {
            Class51.clientCanvas.repaint();
         }

      }
   }

   void method4188(int var1) {
      Class34.drawLoading(Class52.aClass327_1072.method4030(-225618134), Class52.aClass327_1072.method4031((byte)0), client.aColorArray_323[435081651 * client.anInt_276], client.loadingColours[435081651 * client.anInt_276], client.aColorArray_325[client.anInt_276 * 435081651], 1278165636);
   }

   public int method4289(int var1) {
      return 100;
   }

   static boolean method4190(int var0) {
      return Class419.method5217(Class268.aClass586_4646.aClass619_9737, -1935731650);
   }

   static final void method4191(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      Class263 var3 = RandomAccessFileNode.aClass255_9018.method3343(var2, 1516291115);
      if(null != var3.anIntArray_4555 && var3.anIntArray_4555.length > 0) {
         int var4 = 0;
         int var5 = var3.anIntArray_4556[0];

         for(int var6 = 1; var6 < var3.anIntArray_4555.length; ++var6) {
            if(var3.anIntArray_4556[var6] > var5) {
               var4 = var6;
               var5 = var3.anIntArray_4556[var6];
            }
         }

         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var3.anIntArray_4555[var4];
      } else {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var3.anInt_4570 * 2042492901;
      }

   }

   public static Class225 method4192(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      return Class19.method109(var0, var1, var2, var3, var4, false, var5, (byte)-110);
   }

   static RSInterface method4193(RSInterface var0, byte var1) {
      RSInterface var2 = client.method175(var0);
      if(var2 == null) {
         var2 = var0.aClass132_2519;
      }

      return var2;
   }

   public static void method4194(NPC var0, int var1) {
      for(Class240_Sub19 var2 = (Class240_Sub19)Class240_Sub19.aNodeList_7178.getBaseNode_2((byte)84); null != var2; var2 = (Class240_Sub19)Class240_Sub19.aNodeList_7178.getNext(-1287998483)) {
         if(var2.aClass563_Sub1_Sub4_Sub4_Sub2_7173 == var0) {
            if(var2.aClass240_Sub41_Sub5_7170 != null) {
               Class217.aClass240_Sub41_Sub4_3757.method531(var2.aClass240_Sub41_Sub5_7170);
               var2.aClass240_Sub41_Sub5_7170 = null;
            }

            var2.shiftNext();
            return;
         }
      }

   }
}
