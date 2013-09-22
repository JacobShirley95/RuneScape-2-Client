import java.io.IOException;
import java.net.Socket;

public abstract class Class469 {

   String proxyHost;
   int anInt_8692;


   Socket method5641(byte var1) throws IOException {
      return new Socket(this.proxyHost, this.anInt_8692 * 1196365031);
   }

   public abstract Socket openSocket(int var1) throws IOException;

   static int method5643(CharSequence var0, int var1, boolean var2, int var3) {
      if(var1 >= 2 && var1 <= 36) {
         boolean var4 = false;
         boolean var5 = false;
         int var6 = 0;
         int var7 = var0.length();

         for(int var8 = 0; var8 < var7; ++var8) {
            char var9 = var0.charAt(var8);
            if(var8 == 0) {
               if(45 == var9) {
                  var4 = true;
                  continue;
               }

               if(43 == var9 && var2) {
                  continue;
               }
            }

            int var11;
            if(var9 >= 48 && var9 <= 57) {
               var11 = var9 - 48;
            } else if(var9 >= 65 && var9 <= 90) {
               var11 = var9 - 55;
            } else {
               if(var9 < 97 || var9 > 122) {
                  throw new NumberFormatException();
               }

               var11 = var9 - 87;
            }

            if(var11 >= var1) {
               throw new NumberFormatException();
            }

            if(var4) {
               var11 = -var11;
            }

            int var10 = var11 + var6 * var1;
            if(var10 / var1 != var6) {
               throw new NumberFormatException();
            }

            var6 = var10;
            var5 = true;
         }

         if(!var5) {
            throw new NumberFormatException();
         } else {
            return var6;
         }
      } else {
         throw new IllegalArgumentException("" + var1);
      }
   }

   static final void method5644(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class104_Sub5.method3285(var3, var4, var0, 2119538518);
   }

   static final void method5645(RSInterfaceData var0, byte var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class555.method6145(var3, var4, var0, -1551599444);
   }

   static int method5646(String var0, byte[] var1, int var2, int var3) {
      int var4 = var2;
      int var5 = var0.length();

      for(int var6 = 0; var6 < var5; var6 += 4) {
         int var7 = Class212.method2666(var0.charAt(var6), (short)-1733);
         int var8 = 1 + var6 < var5?Class212.method2666(var0.charAt(var6 + 1), (short)-2060):-1;
         int var9 = var6 + 2 < var5?Class212.method2666(var0.charAt(var6 + 2), (short)-10726):-1;
         int var10 = var6 + 3 < var5?Class212.method2666(var0.charAt(var6 + 3), (short)-24201):-1;
         var1[var2++] = (byte)(var7 << 2 | var8 >>> 4);
         if(var9 == -1) {
            break;
         }

         var1[var2++] = (byte)((var8 & 15) << 4 | var9 >>> 2);
         if(var10 == -1) {
            break;
         }

         var1[var2++] = (byte)((var9 & 3) << 6 | var10);
      }

      return var2 - var4;
   }

   static void method5647(Renderer var0, byte var1) {
      var0.method1965(0, 0, Class29.canvasWidth * 1111410531, 350);
      var0.drawOutline(0, 0, 1111410531 * Class29.canvasWidth, 350, 561034439 * Class194.anInt_3364 << 24 | 3351159, 1);
      int var2 = 350 / (104308971 * Class432.anInt_8342);
      int var3;
      if(499415203 * Class194.anInt_3370 > 0) {
         var3 = 346 - 104308971 * Class432.anInt_8342 - 4;
         int var4 = var3 * var2 / (499415203 * Class194.anInt_3370 + var2 - 1);
         int var5 = 4;
         if(Class194.anInt_3370 * 499415203 > 1) {
            var5 += (Class194.anInt_3370 * 499415203 - 1 - -1724145265 * Class194.anInt_3360) * (var3 - var4) / (Class194.anInt_3370 * 499415203 - 1);
         }

         var0.drawOutline(1111410531 * Class29.canvasWidth - 16, var5, 12, var4, 561034439 * Class194.anInt_3364 << 24 | 3351159, 2);

         for(int var6 = -1724145265 * Class194.anInt_3360; var6 < -1724145265 * Class194.anInt_3360 + var2 && var6 < Class194.anInt_3370 * 499415203; ++var6) {
            String[] var7 = Class136.method1799(Class194.consoleStrings[var6], '\b', (byte)14);
            int var8 = (Class29.canvasWidth * 1111410531 - 8 - 16) / var7.length;

            for(int var9 = 0; var9 < var7.length; ++var9) {
               int var10 = 8 + var9 * var8;
               var0.method1965(var10, 0, var10 + var8 - 8, 350);
               CacheDataNode.aTextRenderer_3243.renderText(Class3.method16(var7[var9], (byte)-86), var10, 350 - 665839517 * Class194.anInt_3357 - 2 - Class1.aRSFont_10.anInt_8571 * 2080531379 - 104308971 * Class432.anInt_8342 * (var6 - Class194.anInt_3360 * -1724145265), -1, -16777216, 263119748);
            }
         }
      }

      Class585.aTextRenderer_9728.renderColourText("768 1", Class29.canvasWidth * 1111410531 - 25, 330, -1, -16777216, (byte)60);
      var0.method1965(0, 0, Class29.canvasWidth * 1111410531, 350);
      var0.method1917(0, 350 - Class194.anInt_3357 * 665839517, 1111410531 * Class29.canvasWidth, -1, (byte)124);
      MouseHandler.aTextRenderer_6379.renderText("--> " + Class3.method16(Class194.aString_3361, (byte)-67), 10, 350 - Class1.aRSFont_11.anInt_8571 * 2080531379 - 1, -1, -16777216, 566742611);
      if(AbstractCacheData.aBoolean_6915) {
         var3 = -1;
         if(client.timer * -1025618511 % 30 > 15) {
            var3 = 16777215;
         }

         var0.method1904(10 + Class1.aRSFont_11.method5566("--> " + Class3.method16(Class194.aString_3361, (byte)-79).substring(0, 202635779 * Class194.anInt_3363), 17423631), 350 - Class1.aRSFont_11.anInt_8571 * 2080531379 - 11, 12, var3, -468080658);
      }

      var0.method1967();
      Class285.method3682((byte)1);
   }
}
