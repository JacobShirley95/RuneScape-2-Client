import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;

public abstract class Class34 implements Class70 {

   final CacheDataUnpacker aCacheUnpacker_825;
   final CacheDataUnpacker aCacheUnpacker_826;
   final Class409 aClass409_827;
   FontRenderer aTextRenderer_828;
   int anInt_829;
   long aLong_830;


   int method253(byte var1) {
      int var2 = Class52.aClass327_1072.method4030(1662389173);
      int var3 = 100 * var2;
      if(var2 == this.anInt_829 * -442077313 && 0 != var2) {
         int var4 = Class52.aClass327_1072.method4029(-994459989);
         if(var4 > var2) {
            long var5 = -8488959116522945653L * this.aLong_830 - Class52.aClass327_1072.method4032(1766004725);
            if(var5 > 0L) {
               long var7 = 10000L * var5 / (long)var2 * (long)(var4 - var2);
               long var9 = (Class373.getCurrentTime((short)29974) - -8488959116522945653L * this.aLong_830) * 10000L;
               if(var9 < var7) {
                  var3 = (int)(100L * var9 * (long)(var4 - var2) / var7 + (long)(var2 * 100));
               } else {
                  var3 = var4 * 100;
               }
            }
         }
      } else {
         this.anInt_829 = var2 * -337031041;
         this.aLong_830 = Class373.getCurrentTime((short)10075) * -5732738484450816989L;
      }

      return var3;
   }

   Class34(CacheDataUnpacker var1, CacheDataUnpacker var2, Class409 var3) {
      this.aCacheUnpacker_825 = var1;
      this.aCacheUnpacker_826 = var2;
      this.aClass409_827 = var3;
   }

   public void method812(short var1) {
      RSFont var2 = Class105.method1356(this.aCacheUnpacker_826, this.aClass409_827.anInt_7767 * 1909120553, 1223225512);
      this.aTextRenderer_828 = Class286.gameRenderer.method1935(var2, (ImageData[])((ImageData[])ImageUtils.method1796(this.aCacheUnpacker_825, this.aClass409_827.anInt_7767 * 1909120553)), true);
   }

   public boolean method811(byte var1) {
      boolean var2 = true;
      if(!this.aCacheUnpacker_825.hasData(1909120553 * this.aClass409_827.anInt_7767, 523180276)) {
         var2 = false;
      }

      if(!this.aCacheUnpacker_826.hasData(this.aClass409_827.anInt_7767 * 1909120553, -1254112652)) {
         var2 = false;
      }

      return var2;
   }

   abstract void method256(boolean var1, int var2, int var3, int var4);

   abstract void method257(boolean var1, int var2, int var3, int var4);

   public void method813(boolean var1, int var2) {
      int var3 = this.aClass409_827.aClass419_7760.method5215(1912610703 * this.aClass409_827.anInt_7764, client.anInt_343 * 688709465, (byte)-96) + this.aClass409_827.anInt_7762 * 1684132453;
      int var4 = this.aClass409_827.aClass412_7761.method5106(1854937727 * this.aClass409_827.anInt_7765, 759607001 * client.anInt_435, 1939296200) + this.aClass409_827.anInt_7766 * 731209435;
      this.method257(var1, var3, var4, -1841830545);
      this.method256(var1, var3, var4, 1868493912);
      String var5 = Class52.aClass327_1072.method4031((byte)0);
      if(Class373.getCurrentTime((short)13160) - this.aLong_830 * -8488959116522945653L > 10000L) {
         var5 = var5 + " (" + Class52.aClass327_1072.method4033((byte)5).anInt6738 * -227539357 + ")";
      }

      this.aTextRenderer_828.method1063(var5, var3 + 1912610703 * this.aClass409_827.anInt_7764 / 2, -138079065 * this.aClass409_827.anInt_7763 + 4 + var4 + 1854937727 * this.aClass409_827.anInt_7765 / 2, 2062892803 * this.aClass409_827.anInt_7768, -1, (short)-4716);
   }

   public static String decodeString(byte[] var0, int var1, int var2, int var3) {
      char[] var4 = new char[var2];
      int var5 = 0;
      int var6 = var1;

      int var9;
      for(int var7 = var2 + var1; var6 < var7; var4[var5++] = (char)var9) {
         int var8 = var0[var6++] & 255;
         if(var8 < 128) {
            if(0 == var8) {
               var9 = '\ufffd';
            } else {
               var9 = var8;
            }
         } else if(var8 < 192) {
            var9 = '\ufffd';
         } else if(var8 < 224) {
            if(var6 < var7 && 128 == (var0[var6] & 192)) {
               var9 = (var8 & 31) << 6 | var0[var6++] & 63;
               if(var9 < 128) {
                  var9 = '\ufffd';
               }
            } else {
               var9 = '\ufffd';
            }
         } else if(var8 < 240) {
            if(var6 + 1 < var7 && 128 == (var0[var6] & 192) && (var0[var6 + 1] & 192) == 128) {
               var9 = (var8 & 15) << 12 | (var0[var6++] & 63) << 6 | var0[var6++] & 63;
               if(var9 < 2048) {
                  var9 = '\ufffd';
               }
            } else {
               var9 = '\ufffd';
            }
         } else if(var8 < 248) {
            if(var6 + 2 < var7 && (var0[var6] & 192) == 128 && 128 == (var0[1 + var6] & 192) && 128 == (var0[var6 + 2] & 192)) {
               var9 = (var8 & 7) << 18 | (var0[var6++] & 63) << 12 | (var0[var6++] & 63) << 6 | var0[var6++] & 63;
               if(var9 >= 65536 && var9 <= 1114111) {
                  var9 = '\ufffd';
               } else {
                  var9 = '\ufffd';
               }
            } else {
               var9 = '\ufffd';
            }
         } else {
            var9 = '\ufffd';
         }
      }

      return new String(var4, 0, var5);
   }

   static final void method260(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class192.method2513(var3, var4, var0, 694387031);
   }

   static final void method261(RSInterfaceData var0, byte var1) {
      Class248_Sub1.aBoolean_6455 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111] == 1;
   }

   public static final void drawLoading(int var0, String var1, Color var2, Color var3, Color var4, int var5) {
      try {
         Graphics var6 = Class51.clientCanvas.getGraphics();
         if(Class370.clientFont == null) {
            Class370.clientFont = new Font("Helvetica", 1, 13);
         }

         if(var2 == null) {
            var2 = new Color(140, 17, 17);
         }

         if(var3 == null) {
            var3 = new Color(140, 17, 17);
         }

         if(var4 == null) {
            var4 = new Color(255, 255, 255);
         }

         int var8;
         int var9;
         try {
            if(Class2.anImage_19 == null) {
               Class2.anImage_19 = Class51.clientCanvas.createImage(Class29.canvasWidth * 1111410531, -75607525 * Class597.canvasHeight);
            }

            Graphics var7 = Class2.anImage_19.getGraphics();
            var7.setColor(Color.black);
            var7.fillRect(0, 0, 1111410531 * Class29.canvasWidth, Class597.canvasHeight * -75607525);
            var8 = Class29.canvasWidth * 1111410531 / 2 - 152;
            var9 = Class597.canvasHeight * -75607525 / 2 - 18;
            var7.setColor(var3);
            var7.drawRect(var8, var9, 303, 33);
            var7.setColor(var2);
            var7.fillRect(var8 + 2, 2 + var9, 3 * var0, 30);
            var7.setColor(Color.black);
            var7.drawRect(1 + var8, 1 + var9, 301, 31);
            var7.fillRect(var0 * 3 + 2 + var8, var9 + 2, 300 - var0 * 3, 30);
            var7.setFont(Class370.clientFont);
            var7.setColor(var4);
            var7.drawString(var1, var8 + (304 - var1.length() * 6) / 2, 22 + var9);
            if(ClientSuper.curLoadingString != null) {
               var7.setFont(Class370.clientFont);
               var7.setColor(var4);
               var7.drawString(ClientSuper.curLoadingString, 1111410531 * Class29.canvasWidth / 2 - ClientSuper.curLoadingString.length() * 6 / 2, Class597.canvasHeight * -75607525 / 2 - 26);
            }

            var6.drawImage(Class2.anImage_19, 0, 0, (ImageObserver)null);
         } catch (Exception var10) {
            var6.setColor(Color.black);
            var6.fillRect(0, 0, 1111410531 * Class29.canvasWidth, Class597.canvasHeight * -75607525);
            var8 = Class29.canvasWidth * 1111410531 / 2 - 152;
            var9 = Class597.canvasHeight * -75607525 / 2 - 18;
            var6.setColor(var3);
            var6.drawRect(var8, var9, 303, 33);
            var6.setColor(var2);
            var6.fillRect(var8 + 2, 2 + var9, var0 * 3, 30);
            var6.setColor(Color.black);
            var6.drawRect(1 + var8, 1 + var9, 301, 31);
            var6.fillRect(var0 * 3 + 2 + var8, var9 + 2, 300 - 3 * var0, 30);
            var6.setFont(Class370.clientFont);
            var6.setColor(var4);
            if(null != ClientSuper.curLoadingString) {
               var6.setFont(Class370.clientFont);
               var6.setColor(var4);
               var6.drawString(ClientSuper.curLoadingString, 1111410531 * Class29.canvasWidth / 2 - ClientSuper.curLoadingString.length() * 6 / 2, -75607525 * Class597.canvasHeight / 2 - 26);
            }

            var6.drawString(var1, var8 + (304 - var1.length() * 6) / 2, 22 + var9);
         }
      } catch (Exception var11) {
         Class51.clientCanvas.repaint();
      }

   }

   static final void method263(RSInterfaceData var0, int var1) {
      if(client.aString_542 != null) {
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = Class52.method535(client.aString_542, 1658249261);
      } else {
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = "";
      }

   }

   static void method264(int var0) {
      Class223.captureKeyboardList.method3210(900413292);
      Class53.captureMouseList.method3105(854937447);
      DamageAnimeLoader.gameClient.setupCanvas(-1932225859);
      Class51.clientCanvas.setBackground(Color.black);
      client.anInt_465 = -2043299451;
      Class223.captureKeyboardList = FriendPlayer.addKeyboardHandlerToComponent(Class51.clientCanvas, -2133288511);
      Class53.captureMouseList = Animator.addMouseHandlerToComponent(Class51.clientCanvas, true, 1319738664);
   }

   static final void method265(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class234.method3013(var3, var4, false, 2, var0, 860496469);
   }

   static void method266(Class502_Sub1 var0, int var1, int profileTime, int var3) {
      var0.method4702(var1, (byte)-11);
      byte option;
      if(profileTime > 20077) {
         Class3.setHigh((byte)113);
         option = 4;
      } else if(profileTime > 10030) {
         Class86.setMid(420406933);
         option = 3;
      } else if(profileTime > 5030) {
         Class194.setLow((byte)-1);
         option = 2;
      } else {
         Class240_Sub52_Sub1.setMin(true, 1841331171);
         option = 1;
      }

      if(Class104_Sub21.renderSettings.currentToolkit.getToolkitID() != var1) {
         Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub29_7312, var1, 2038647371);
         Class462.setRenderToolkit(var1, false, -2106625315);
      } else {
         Class104_Sub21.renderSettings.method4824(Class104_Sub21.renderSettings.currentToolkit, true, -1056284199);
      }

      Class83.method1089(-883326324);
      var0.method4698(option, 1658463661);
   }
}
