
public class Class327 implements Runnable {

   Class345 aClass345_6340 = null;
   volatile boolean aBoolean_6341;
   long aLong_6342;
   LoadProgress aClass351_6343;
   Class345 aClass345_6344 = new Class338();
   int anInt_6345;
   long aLong_6346;
   String aString_6347;
   int anInt_6348;
   boolean aBoolean_6349;


   int method4024(byte var1) {
      return -1412532391 * this.anInt_6345;
   }

   void method4025(byte var1) {
      this.aBoolean_6341 = true;
   }

   synchronized boolean method4026(int var1) {
      return this.aClass345_6344.method4290(409980220568173843L * this.aLong_6342);
   }

   synchronized void method4027(Class345 var1, int var2) {
      this.aClass345_6340 = this.aClass345_6344;
      this.aClass345_6344 = var1;
      this.aLong_6342 = Class373.getCurrentTime((short)8352) * -8282567614183221989L;
   }

   synchronized void method4028(long var1, String var3, int var4, LoadProgress var5, int var6) {
      this.aLong_6346 = 3000356480719547853L * var1;
      this.aString_6347 = var3;
      this.anInt_6348 = 1777075885 * var4;
      this.aClass351_6343 = var5;
   }

   public int method4029(int var1) {
      if(null == this.aClass351_6343) {
         return 0;
      } else {
         int var2 = this.aClass351_6343.anInt6738 * -227539357;
         return this.aClass351_6343.aBoolean_6744 && -2021307099 * this.anInt_6348 < -392308157 * this.aClass351_6343.anInt_6742?1 + -2021307099 * this.anInt_6348:(var2 >= 0 && var2 < Class344.aClass351Array_6559.length - 1?(-2021307099 * this.anInt_6348 == this.aClass351_6343.percent * 1707216417?-392308157 * this.aClass351_6343.anInt_6742:1707216417 * this.aClass351_6343.percent):100);
      }
   }

   public int method4030(int var1) {
      return this.anInt_6348 * -2021307099;
   }

   public String method4031(byte var1) {
      return this.aString_6347;
   }

   public long method4032(int var1) {
      return -3364980296062712059L * this.aLong_6346;
   }

   public LoadProgress method4033(byte var1) {
      return this.aClass351_6343;
   }

   public void run() {
      while(!this.aBoolean_6341) {
         long var1 = Class373.getCurrentTime((short)11897);
         synchronized(this) {
            try {
               this.anInt_6345 += 544497897;
               if(this.aClass345_6344 instanceof Class338) {
                  this.aClass345_6344.method4287(this.aBoolean_6349, (byte)1);
               } else {
                  long var4 = Class373.getCurrentTime((short)21227);
                  if(null != Class286.gameRenderer && null != this.aClass345_6340 && this.aClass345_6340.method4286(1621202908) != 0 && 409980220568173843L * this.aLong_6342 >= var4 - (long)this.aClass345_6340.method4286(334596377)) {
                     int var6 = (int)(255L * (var4 - 409980220568173843L * this.aLong_6342) / (long)this.aClass345_6340.method4286(194664624));
                     int var7 = 255 - var6;
                     var6 = var6 << 24 | 16777215;
                     var7 = var7 << 24 | 16777215;
                     Class408.method5039(1961579735);
                     Class286.gameRenderer.method1977(1, 0);
                     Sprite var8 = Class286.gameRenderer.method1928(1111410531 * Class29.canvasWidth, Class597.canvasHeight * -75607525, true, 1404928193);
                     Class174_Sub1 var9 = Class286.gameRenderer.method1890();
                     var9.method7327(0, var8.method2126());
                     Class286.gameRenderer.method1901(var9, -808704783);
                     this.aClass345_6340.method4287(true, (byte)1);
                     Class286.gameRenderer.method1902(var9, 1686549825);
                     var8.drawAt(0, 0, 0, var7, 1);
                     Class286.gameRenderer.method1901(var9, 761794684);
                     Class286.gameRenderer.method1977(1, 0);
                     this.aClass345_6344.method4287(true, (byte)1);
                     Class286.gameRenderer.method1902(var9, -265173619);
                     var8.drawAt(0, 0, 0, var6, 1);
                  } else {
                     if(null != this.aClass345_6340) {
                        this.aBoolean_6349 = true;
                        this.aClass345_6340.method4288((byte)0);
                        this.aClass345_6340 = null;
                     }

                     if(this.aBoolean_6349) {
                        Class408.method5039(1880554407);
                        if(Class286.gameRenderer != null) {
                           Class286.gameRenderer.method1977(1, 0);
                        }
                     }

                     this.aClass345_6344.method4287(this.aBoolean_6349 || null != Class286.gameRenderer && Class286.gameRenderer.method1891(), (byte)1);
                  }

                  try {
                     if(null != Class286.gameRenderer && !(this.aClass345_6344 instanceof Class338)) {
                        Class286.gameRenderer.method1885((byte)-65);
                     }
                  } catch (Exception_Sub7 var15) {
                     CacheFileID.method1397(var15.getMessage() + DamageAnimeLoader.gameClient.method2883(-1416420953), var15, -1815708886);
                     Class462.setRenderToolkit(0, true, -1921641993);
                  }
               }

               this.aBoolean_6349 = false;
               if(null != Class286.gameRenderer && !(this.aClass345_6344 instanceof Class338) && this.aClass351_6343.anInt6738 * -227539357 < -227539357 * LoadProgress.aClass351_6735.anInt6738) {
                  Class278.method3620(1596968813);
               }
            } catch (Exception var16) {
               continue;
            }
         }

         long var12 = Class373.getCurrentTime((short)30016);
         int var14 = (int)(20L - (var12 - var1));
         if(var14 > 0) {
            RSInterface.method1724((long)var14);
         }
      }

   }

   synchronized void method4034(int var1) {
      this.aBoolean_6349 = true;
   }

   static final void method4035(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class19.method106(var3, var4, var0, (short)-22776);
   }

   public static void method4036(Class491 var0, String var1, int var2, byte var3) {
      Class110.method1412(new Class633(var0, var1, var2), 1537146665);
   }

   static final void method4037(RSInterfaceData var0, short var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class521.myPlayer.getMapCoord(-1968013586).method6658((byte)97);
   }
}
