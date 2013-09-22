import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Class9 implements Runnable {

   volatile String aString_43;
   InetAddress anInetAddress_44;


   public String method49(byte var1) {
      return this.aString_43;
   }

   Class9(int var1) throws UnknownHostException {
      this.anInetAddress_44 = InetAddress.getByAddress(new byte[]{(byte)(var1 >> 24 & 255), (byte)(var1 >> 16 & 255), (byte)(var1 >> 8 & 255), (byte)(var1 & 255)});
   }

   public void run() {
      this.aString_43 = this.anInetAddress_44.getHostName();
   }

   static RenderSettings method50(byte var0) {
      RandomAccessFileNode var1 = null;
      RenderSettings var2 = new RenderSettings(client.currentGamePack, 0);

      try {
         var1 = Class240_Sub22_Sub17.getPreferencesFile("", client.currentGamePack.gameID, false, (byte)-75);
         byte[] var3 = new byte[(int)var1.getFileLength(1584047702)];

         int var5;
         for(int var4 = 0; var4 < var3.length; var4 += var5) {
            var5 = var1.read(var3, var4, var3.length - var4);
            if(-1 == var5) {
               throw new IOException();
            }
         }

         var2 = new RenderSettings(new ByteArrayDataNode(var3), client.currentGamePack, 0);
      } catch (Exception var7) {
         ;
      }

      try {
         if(null != var1) {
            var1.closeRAFile((byte)-34);
         }
      } catch (Exception var6) {
         ;
      }

      return var2;
   }

   public static boolean method51(byte var0) {
      try {
         if(1919337139 * Class134.anInt_2617 == 2) {
            if(NodeList.aClass240_Sub35_9068 == null) {
               NodeList.aClass240_Sub35_9068 = Class240_Sub35.method4892(ConnectionUpdate.aCacheUnpacker_119, Class134.anInt_2611 * -118975885, Class489.anInt_9003 * 564760715);
               if(null == NodeList.aClass240_Sub35_9068) {
                  return false;
               }
            }

            if(null == Class540_Sub20.aClass312_6336) {
               Class540_Sub20.aClass312_6336 = new Class312(Class134.aCacheUnpacker_2619, Class134.aCacheUnpacker_2610);
            }

            Class240_Sub41_Sub2 var1 = Class134.aClass240_Sub41_Sub2_2616;
            if(Class123.aClass240_Sub41_Sub2_2276 != null) {
               var1 = Class123.aClass240_Sub41_Sub2_2276;
            }

            if(var1.method468(NodeList.aClass240_Sub35_9068, Class134.aCacheUnpacker_2618, Class540_Sub20.aClass312_6336, 22050, -811156853)) {
               Class134.aClass240_Sub41_Sub2_2616 = var1;
               Class134.aClass240_Sub41_Sub2_2616.method445(1879885470);
               int var2;
               if(-1804807109 * LanguagePack.anInt_9289 > 0) {
                  Class134.anInt_2617 = 1926706545;
                  Class134.aClass240_Sub41_Sub2_2616.method483(-1804807109 * LanguagePack.anInt_9289 > Class586.anInt_9739 * -101602273?Class586.anInt_9739 * -101602273:-1804807109 * LanguagePack.anInt_9289, -537214428);

                  for(var2 = 0; var2 < Class26.anIntArray_269.length; ++var2) {
                     Class134.aClass240_Sub41_Sub2_2616.method477(var2, Class26.anIntArray_269[var2], -1305573933);
                     Class26.anIntArray_269[var2] = 255;
                  }
               } else {
                  Class134.anInt_2617 = 0;
                  Class134.aClass240_Sub41_Sub2_2616.method483(Class586.anInt_9739 * -101602273, 1431021485);

                  for(var2 = 0; var2 < Class26.anIntArray_269.length; ++var2) {
                     Class134.aClass240_Sub41_Sub2_2616.method477(var2, Class26.anIntArray_269[var2], -1305573933);
                     Class26.anIntArray_269[var2] = 255;
                  }
               }

               if(Class123.aClass240_Sub41_Sub2_2276 == null) {
                  if(Class174_Sub2_Sub3_Sub1.aLong_3245 * -5801872592651188391L > 0L) {
                     Class134.aClass240_Sub41_Sub2_2616.method480(NodeList.aClass240_Sub35_9068, Class134.aBoolean_2612, true, -5801872592651188391L * Class174_Sub2_Sub3_Sub1.aLong_3245);
                  } else {
                     Class134.aClass240_Sub41_Sub2_2616.method446(NodeList.aClass240_Sub35_9068, Class134.aBoolean_2612, -1979447369);
                  }

                  if(null != Class586.aClass110_9743) {
                     Class586.aClass110_9743.method1410('\uff00');
                  }
               }

               if(AnimationUnpacker.aClass316_4423 != null) {
                  AnimationUnpacker.aClass316_4423.method3912(Class134.aClass240_Sub41_Sub2_2616);
               }

               NodeList.aClass240_Sub35_9068 = null;
               Class540_Sub20.aClass312_6336 = null;
               ConnectionUpdate.aCacheUnpacker_119 = null;
               Class174_Sub2_Sub3_Sub1.aLong_3245 = 0L;
               Class123.aClass240_Sub41_Sub2_2276 = null;
               Class586.aClass110_9743 = null;
               return true;
            }
         }
      } catch (Exception var3) {
         var3.printStackTrace();
         Class134.aClass240_Sub41_Sub2_2616.method448((byte)-65);
         Class16.method87(348274980);
      }

      return false;
   }

   static final int method52(int var0, int var1, int var2) {
      int var3 = 57 * var1 + var0;
      var3 ^= var3 << 13;
      int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
      return var4 >> 19 & 255;
   }

   static final void method53(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, byte var3) {
      int var4 = var2.intTypes[(var2.intTypeIndex -= -708028207) * -831324111];
      String var5 = (String)var2.stringData[(var2.stringDataIndex -= -1828074049) * 863838783];
      Class476 var6 = Class240_Sub1.aClass465_6506.method5610(var4, -1475310270);
      if(!var6.aString_8738.equals(var5)) {
         var0.method1714(var4, var5, 889287874);
      } else {
         var0.method1702(var4, -1049483542);
      }

   }

   static final void method54(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      Class599.method6481(var3, var0, -2047112365);
   }

   static final void method55(RSInterfaceData var0, int var1) {
      boolean var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111] == 1;
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub24_7302, var2?2:1, 953194586);
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub24_7297, var2?2:1, -593895000);
      Class488.method5744((byte)1);
      Class83.method1089(-1269448296);
      client.aBoolean_568 = false;
   }

   static final void method56(RSInterfaceData var0, byte var1) {
      String var2 = (String)var0.stringData[(var0.stringDataIndex -= -1828074049) * 863838783];
      if(var2.startsWith(Class3.method12(0, -1553609774)) || var2.startsWith(Class3.method12(1, -1553609774))) {
         var2 = var2.substring(7);
      }

      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class29.method215(var2, -1721534846);
   }

   static final void putFlag(int var0, int var1, int var2) {
      Class192.flagX = var0 * 624818685;
      Class192.flagY = var1 * -2043346881;
      Class192.flagNotPresent = false;
      Class535.method6062(1471462747);
   }
}
