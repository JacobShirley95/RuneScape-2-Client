import java.awt.Container;
import java.awt.Frame;
import java.io.File;
import javax.swing.JFileChooser;

public class Class20 implements Runnable {

   String aString_187;
   File aFile_188 = null;
   boolean aBoolean_189;
   boolean aBoolean_190 = false;
   static Sprite[] imgNameIcons;


   public void run() {
      Container var1 = DrawingTarget.getGameContainer(-1223029670);
      Frame var2 = null;
      if(null != ConnectionUpdate.clientFrame) {
         var2 = ConnectionUpdate.clientFrame;
      } else {
         while(null != var1) {
            if(var1 instanceof Frame) {
               var2 = (Frame)var1;
               break;
            }

            var1 = var1.getParent();
         }
      }

      if(var2 == null) {
         throw new RuntimeException("");
      } else {
         JFileChooser var3 = new JFileChooser("");
         var3.setDialogTitle(this.aString_187);
         var3.setFileFilter(new FileFilter_Sub1(this, this));
         var3.setFileSelectionMode(1);
         var3.setAcceptAllFileFilterUsed(false);
         int var4 = var3.showOpenDialog(var2);
         if(0 == var4) {
            this.aFile_188 = var3.getSelectedFile();
         }

         this.aBoolean_190 = true;
      }
   }

   public File method114(int var1) {
      return this.aFile_188;
   }

   public boolean method115(int var1) {
      return this.aBoolean_190;
   }

   boolean method116(int var1) {
      return this.aBoolean_189;
   }

   public Class20(String var1, boolean var2) {
      this.aString_187 = var1;
      this.aBoolean_189 = var2;
      (new Thread(this)).start();
   }

   public static Class623[] method117(byte var0) {
      return new Class623[]{Class623.aClass623_10039, Class623.aClass623_10034, Class623.aClass623_10037, Class623.aClass623_10038, Class623.aClass623_10035, Class623.aClass623_10036};
   }

   static final void method118(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class104_Sub21.renderSettings.aClass540_Sub14_7324.method1701(-2024737490);
   }

   static final void method119(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class619.anInt_10019 * 1819308667;
   }

   public static void method120(RSInterfaceGroup var0, RSInterface var1, boolean var2, int var3) {
      Class125.method1611(var0.interfaceArray, var1, var2, (byte)0);
   }

   static final void method121(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      ObjectDescriptor var3 = Class592.cacheObjectLoader.getObjectDescriptor(var2);
      if(953318699 * var3.anInt_8497 >= 0 && -1561115695 * var3.anInt_8496 >= 0) {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var3.anInt_8496 * -1561115695;
      } else {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var2;
      }

   }

   public static void method122(Renderer var0, int var1) {
      Class585.aTextRenderer_9728 = (FontRenderer)Class368.aFontUnpacker_6922.method4139(client.aClass339_284, Class1.p11_fullOffset * -1888224497, true, true, -2137222197);
      FriendPlayer.aRSFont_55 = Class368.aFontUnpacker_6922.method4135(client.aClass339_284, -1888224497 * Class1.p11_fullOffset, -2117488319);
      CacheDataNode.aTextRenderer_3243 = (FontRenderer)Class368.aFontUnpacker_6922.method4139(client.aClass339_284, Class1.p12_fullOffset * -151545987, true, true, -1884932952);
      Class1.aRSFont_10 = Class368.aFontUnpacker_6922.method4135(client.aClass339_284, -151545987 * Class1.p12_fullOffset, -1342958455);
      MouseHandler.aTextRenderer_6379 = (FontRenderer)Class368.aFontUnpacker_6922.method4139(client.aClass339_284, Class1.p13_fullOffset * 511971595, true, true, -1461134954);
      Class1.aRSFont_11 = Class368.aFontUnpacker_6922.method4135(client.aClass339_284, Class1.p13_fullOffset * 511971595, -2041517260);
   }

   static void method123(int var0) {
      Class89.anIntArray_1805 = Class240_Sub22_Sub12.method2638(2048, 35, 8, 8, 4, 0.4F, true, 526553987);
   }
}
