import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Class188 implements Class96 {

   CacheDataUnpacker aCacheUnpacker_3202;
   CacheDataUnpacker aCacheUnpacker_3203;
   public static CacheDataUnpacker aCacheUnpacker_3204;


   int[] method2299(int var1, int var2) {
      byte[] var3 = this.aCacheUnpacker_3203.method3566(var1, 1525326498);
      if(var3 == null) {
         return null;
      } else {
         try {
            int[] var4 = this.method2307(var3, -1723149665);
            return var4;
         } catch (IOException var5) {
            return null;
         }
      }
   }

   public boolean method1263(int var1, Class610 var2, float var3, int var4, int var5, boolean var6, byte var7) {
      boolean var8 = true;
      if(this.aCacheUnpacker_3202.method3574(var1, -366987729)) {
         var8 = this.aCacheUnpacker_3202.hasData(var1, -969539713);
      }

      var8 &= this.aCacheUnpacker_3203.hasData(var1, -504961993);
      return var8;
   }

   int[] method2301(int var1, int var2) {
      int[] var3 = this.method2299(var1, -1254162752);
      if(null == var3) {
         return null;
      } else {
         for(int var4 = 0; var4 < var3.length; ++var4) {
            if(0 != (var3[var4] & 16777215)) {
               var3[var4] |= -16777216;
            } else {
               var3[var4] &= 16777215;
            }
         }

         return var3;
      }
   }

   float[] method2302(int var1, byte var2) {
      int[] var3 = this.method2299(var1, -1166332008);
      if(var3 == null) {
         return null;
      } else {
         int[] var4 = null;
         int var6;
         if(this.aCacheUnpacker_3202.method3574(var1, 1924533134)) {
            byte[] var5 = this.aCacheUnpacker_3202.method3566(var1, 1927325449);
            if(var5 != null) {
               try {
                  var4 = this.method2307(var5, 379124859);

                  for(var6 = 0; var6 < var4.length; ++var6) {
                     var4[var6] &= 4095;
                  }
               } catch (IOException var14) {
                  ;
               }
            }
         }

         if(null == var4) {
            var4 = new int[var3.length];
         }

         float[] var15 = new float[var3.length * 4];
         var6 = 0;

         for(int var7 = 0; var7 < var3.length; ++var7) {
            int var8 = var3[var7];
            int var9 = var8 >>> 24;
            int var10 = (var8 & 16711680) >> 16;
            int var11 = (var8 & '\uff00') >> 8;
            int var12 = var8 & 255;
            float var13 = (float)var4[var7] * 31.0F / 4096.0F + 1.0F;
            var15[var6++] = (float)var10 * var13 / 255.0F;
            var15[var6++] = var13 * (float)var11 / 255.0F;
            var15[var6++] = (float)var12 * var13 / 255.0F;
            var15[var6++] = (float)var9 / 255.0F;
         }

         return var15;
      }
   }

   public void method1254(int var1) {}

   public int[] method1251(int var1, float var2, int var3, int var4, boolean var5, int var6) {
      return this.method2301(var1, 1889416245);
   }

   public int[] method1257(int var1, float var2, int var3, int var4, boolean var5, byte var6) {
      return this.method2299(var1, -1515936859);
   }

   public float[] method1253(int var1, float var2, int var3, int var4, boolean var5, byte var6) {
      return this.method2302(var1, (byte)0);
   }

   int[] method2307(byte[] var1, int var2) throws IOException {
      BufferedImage var3 = ImageIO.read(new ByteArrayInputStream(var1));
      if(var3.getType() != 10 && var3.getType() != 0) {
         return var3.getRGB(0, 0, var3.getWidth(), var3.getHeight(), (int[])null, 0, var3.getWidth());
      } else {
         Object var4 = null;
         int[] var8 = var3.getRaster().getPixels(0, 0, var3.getWidth(), var3.getHeight(), (int[])var4);
         int[] var5 = new int[var3.getWidth() * var3.getHeight()];
         int var6;
         if(var3.getType() == 10) {
            for(var6 = 0; var6 < var5.length; ++var6) {
               var5[var6] = (var8[var6] << 16) + (var8[var6] << 8) + var8[var6] + -16777216;
            }
         } else {
            for(var6 = 0; var6 < var5.length; ++var6) {
               int var7 = var6 * 2;
               var5[var6] = (var8[var7] << 8) + (var8[var7] << 16) + (var8[1 + var7] << 24) + var8[var7];
            }
         }

         return var5;
      }
   }

   public Class188(CacheDataUnpacker var1, CacheDataUnpacker var2) {
      this.aCacheUnpacker_3203 = var1;
      this.aCacheUnpacker_3202 = var2;
   }

   public static void method2308(int var0, int var1) {
      Class527.loadedInterfaces[var0] = false;
      Class620.method6627(var0, (byte)35);
   }

   public static void method2309(int var0) {
      for(int var1 = 0; var1 < Class217.anInt_3759 * 1967345345; ++var1) {
         Class225 var2 = Class217.aClass225Array_3760[var1];
         if(3 == var2.aByte_3875) {
            Class129.method1665(var2, -368457891);
         }
      }

   }

   public static Class240_Sub41_Sub2 method2310(int var0) {
      return Class134.aClass240_Sub41_Sub2_2616;
   }

   static final void method2311(RSInterfaceData var0, byte var1) {
      Class187 var2 = (Class187)var0.composite.anObjectArray_3548[var0.anInt_9510 * -1756266293];
      Class169 var3 = (Class169)(var0.anIntArray_9518[var0.anInt_9510 * -1756266293] == 0?var0.aMap_9513.get(var2.aClass283_3201):var0.targetMap.get(var2.aClass283_3201));
      Class282 var4 = var2.aClass373_3197.method4745(1290182620);
      if(Class282.aClass282_4773 == var4) {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var3.method2269(var2, -390483690);
      } else if(var4 == Class282.aClass282_4778) {
         var0.aLongArray_9519[(var0.longTypeIndex += -1088659337) * 973044039 - 1] = var3.method2094(var2, -1933124691);
      } else {
         if(var4 != Class282.aClass282_4772) {
            throw new RuntimeException();
         }

         try {
            String var5 = (String)var3.method2117(var2, (byte)-28);
            if(var5 == null) {
               var5 = "null";
            }

            var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = var5;
         } catch (Exception var6) {
            throw new RuntimeException(var6);
         }
      }

   }

   static final void method2312(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      Class595.method6444(var3, var4, var0, -1361975558);
   }

   static final void method2313(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class104_Sub18.method7378(var3, var4, var0, -708028207);
   }

   static final void method2314(RSInterfaceData var0, int var1) throws Exception_Sub1 {
      var0.intTypeIndex -= -2124084621;
      int var2 = var0.intTypes[var0.intTypeIndex * -831324111];
      int var3 = var0.intTypes[1 + -831324111 * var0.intTypeIndex];
      int var4 = var0.intTypes[2 + var0.intTypeIndex * -831324111];
      float var5 = (float)(2.0D * Math.atan((double)((float)var2 / 2.0F / (float)var4)));
      float var6 = (float)(2.0D * Math.atan((double)((float)var3 / 2.0F / (float)var4)));
      Class542.aClass43_Sub1_9475.method361(var5, var6, (byte)-45);
   }

   static void method2315(int var0) {
      Class18.cancelOption = new OptionListNode(ServerString.cancelOptionStr.getText(Class599.clientLanguage, 1503934812), "", client.anInt_373 * 635272015, 1006, -1, 0L, 0, 0, true, false, 0L, true);
   }
}
