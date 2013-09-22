import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;

public class GraphicsDataHolder {

   GraphicsDevice aGraphicsDevice_9210;
   DisplayMode aDisplayMode_9211;
   public static CacheDataUnpacker aCacheUnpacker_9212;


   void method5947(Frame var1, int var2, int var3, int var4, int var5, byte var6) {
      this.aDisplayMode_9211 = this.aGraphicsDevice_9210.getDisplayMode();
      if(this.aDisplayMode_9211 == null) {
         throw new NullPointerException();
      } else {
         var1.setUndecorated(true);
         var1.enableInputMethods(false);
         this.method5949(var1, -282571309);
         if(0 == var5) {
            int var7 = this.aDisplayMode_9211.getRefreshRate();
            DisplayMode[] var8 = this.aGraphicsDevice_9210.getDisplayModes();
            boolean var9 = false;

            for(int var10 = 0; var10 < var8.length; ++var10) {
               if(var8[var10].getWidth() == var2 && var8[var10].getHeight() == var3 && var8[var10].getBitDepth() == var4) {
                  int var11 = var8[var10].getRefreshRate();
                  if(!var9 || Math.abs(var11 - var7) < Math.abs(var5 - var7)) {
                     var5 = var11;
                     var9 = true;
                  }
               }
            }

            if(!var9) {
               var5 = var7;
            }
         }

         this.aGraphicsDevice_9210.setDisplayMode(new DisplayMode(var2, var3, var4, var5));
      }
   }

   void method5948(int var1) {
      if(null != this.aDisplayMode_9211) {
         DisplayMode[] var2 = this.aGraphicsDevice_9210.getDisplayModes();
         boolean var3 = false;
         DisplayMode[] var4 = var2;

         for(int var5 = 0; var5 < var4.length; ++var5) {
            DisplayMode var6 = var4[var5];
            if(var6.equals(this.aDisplayMode_9211)) {
               this.aGraphicsDevice_9210.setDisplayMode(this.aDisplayMode_9211);
               var3 = true;
               break;
            }
         }

         if(!var3) {
            try {
               Field var8 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("defaultDisplayMode");
               var8.setAccessible(true);
               var8.set(this.aGraphicsDevice_9210, (Object)null);
            } catch (Throwable var7) {
               ;
            }
         }

         this.aDisplayMode_9211 = null;
      }

      this.method5949((Frame)null, -282571309);
   }

   public GraphicsDataHolder() throws Exception {
      GraphicsEnvironment var1 = GraphicsEnvironment.getLocalGraphicsEnvironment();
      this.aGraphicsDevice_9210 = var1.getDefaultScreenDevice();
      if(!this.aGraphicsDevice_9210.isFullScreenSupported()) {
         GraphicsDevice[] var2 = var1.getScreenDevices();
         GraphicsDevice[] var3 = var2;

         for(int var4 = 0; var4 < var3.length; ++var4) {
            GraphicsDevice var5 = var3[var4];
            if(var5 != null && var5.isFullScreenSupported()) {
               this.aGraphicsDevice_9210 = var5;
               return;
            }
         }

         throw new Exception();
      }
   }

   void method5949(Frame var1, int var2) {
      boolean var3 = false;

      Field var4;
      try {
         var4 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
         var4.setAccessible(true);
         boolean var5 = ((Boolean)var4.get(this.aGraphicsDevice_9210)).booleanValue();
         if(var5) {
            var4.set(this.aGraphicsDevice_9210, Boolean.FALSE);
            var3 = true;
         }
      } catch (Throwable var15) {
         ;
      }

      boolean var12 = false;

      try {
         var12 = true;
         this.aGraphicsDevice_9210.setFullScreenWindow(var1);
         var12 = false;
      } finally {
         if(var12) {
            if(var3) {
               try {
                  Field var7 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
                  var7.set(this.aGraphicsDevice_9210, Boolean.TRUE);
               } catch (Throwable var13) {
                  ;
               }
            }

         }
      }

      if(var3) {
         try {
            var4 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
            var4.set(this.aGraphicsDevice_9210, Boolean.TRUE);
         } catch (Throwable var14) {
            ;
         }
      }

   }

   int[] method5950(byte var1) {
      DisplayMode[] var2 = this.aGraphicsDevice_9210.getDisplayModes();
      int[] var3 = new int[var2.length << 2];

      for(int var4 = 0; var4 < var2.length; ++var4) {
         var3[var4 << 2] = var2[var4].getWidth();
         var3[1 + (var4 << 2)] = var2[var4].getHeight();
         var3[(var4 << 2) + 2] = var2[var4].getBitDepth();
         var3[3 + (var4 << 2)] = var2[var4].getRefreshRate();
      }

      return var3;
   }

   static Class46 method5951(int var0, byte var1) {
      return var0 == Class46.aClass46_972.anInt_973 * 677005635?Class46.aClass46_972:(Class46.aClass46_971.anInt_973 * 677005635 == var0?Class46.aClass46_971:null);
   }

   static final void method5952(RSInterfaceData var0, byte var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class104_Sub21.renderSettings.aClass540_Sub31_7321.method6082(var2, 546109543);
   }

   static final void method5953(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      int var4 = -1;
      int var5 = -1;
      Class126 var6 = var3.method1712(Class286.gameRenderer, 1272478299);
      if(var6 != null) {
         var4 = -1598600089 * var6.anInt_2367;
         var5 = var6.anInt_2365 * 860389213;
      }

      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var4;
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var5;
   }
}
