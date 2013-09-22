import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.io.File;
import java.net.URI;

public class Class303 {

   public final int anInt_6010;
   public final int anInt_6011;
   public final int anInt_6012;
   public final int anInt_6013;
   static File rootCacheFile;
   public static int minServerIndex;


   Class303(int var1, int var2, int var3, int var4) {
      this.anInt_6013 = -1500439701 * var1;
      this.anInt_6011 = var2 * 2002100249;
      this.anInt_6012 = var3 * 256537737;
      this.anInt_6010 = var4 * 2074143683;
   }

   Class303() {
      this.anInt_6013 = (32 + (int)(Math.random() * 4.0D)) * -1500439701;
      this.anInt_6011 = (3 + (int)(Math.random() * 2.0D)) * 2002100249;
      this.anInt_6012 = (16 + (int)(Math.random() * 3.0D)) * 256537737;
      if(Class104_Sub21.renderSettings.aClass540_Sub17_7299.method3986(1018633512) == 1) {
         this.anInt_6010 = (int)(Math.random() * 6.0D) * 2074143683;
      } else {
         this.anInt_6010 = (int)(Math.random() * 12.0D) * 2074143683;
      }

   }

   static final void method3828(RSInterfaceData var0, byte var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = Class592.cacheObjectLoader.getObjectDescriptor(var2).name;
   }

   public static Class517 method3829(int var0, int var1) {
      Class517[] var2 = Class545.method6098(-852869601);

      for(int var3 = 0; var3 < var2.length; ++var3) {
         Class517 var4 = var2[var3];
         if(var0 == 1581295263 * var4.anInt_9221) {
            return var4;
         }
      }

      return null;
   }

   static final void method3830(RSInterfaceData var0, int var1) {
      int var2 = var0.anIntArray_9518[var0.anInt_9510 * -1756266293];
      InterfaceDataComposite var3 = Class239.method3088(var2, -1487828225);
      if(var3 == null) {
         throw new RuntimeException();
      } else {
         int[] var4 = new int[var3.anInt_3549 * -891126915];
         Object[] var5 = new Object[1306035847 * var3.anInt_3550];
         long[] var6 = new long[var3.anInt_3551 * -636665659];

         int var7;
         for(var7 = 0; var7 < var3.anInt_3552 * 2111440299; ++var7) {
            var4[var7] = var0.intTypes[var7 + (-831324111 * var0.intTypeIndex - var3.anInt_3552 * 2111440299)];
         }

         for(var7 = 0; var7 < var3.anInt_3553 * -1261613397; ++var7) {
            var5[var7] = var0.stringData[863838783 * var0.stringDataIndex - -1261613397 * var3.anInt_3553 + var7];
         }

         for(var7 = 0; var7 < -2123857615 * var3.anInt_3554; ++var7) {
            var6[var7] = var0.aLongArray_9519[var0.longTypeIndex * 973044039 - var3.anInt_3554 * -2123857615 + var7];
         }

         var0.intTypeIndex -= 2083874971 * var3.anInt_3552;
         var0.stringDataIndex -= 1110417557 * var3.anInt_3553;
         var0.longTypeIndex -= 140668359 * var3.anInt_3554;
         Class566 var8 = new Class566();
         var8.interfaceComp = var0.composite;
         var8.anInt_9611 = var0.anInt_9510 * 1672203633;
         var8.anIntArray_9614 = var0.mouseData;
         var8.anObjectArray_9613 = var0.objectData;
         var8.aLongArray_9610 = var0.aLongArray_9494;
         if(853810813 * var0.anInt_9505 >= var0.interfaceData.length) {
            throw new RuntimeException();
         } else {
            var0.interfaceData[(var0.anInt_9505 += 1307888341) * 853810813 - 1] = var8;
            var0.composite = var3;
            var0.actions = var0.composite.actions;
            var0.anIntArray_9518 = var0.composite.anIntArray_3544;
            var0.anInt_9510 = 1856838429;
            var0.mouseData = var4;
            var0.objectData = var5;
            var0.aLongArray_9494 = var6;
         }
      }
   }

   static void method3831(short var0) {
      client.lobbyConnectionHandler.method2545((byte)68);
      if(Class3.anInt_23 * -1549947895 < 2) {
         Class503.lobbyConnectionDesc.method5689(-35110734);
         Class3.anInt_20 = 0;
         Class3.anInt_23 += -1567645127;
         Class3.aClass26_26 = Class26.aClass26_268;
      } else {
         Class3.aClass26_26 = null;
         Class3.aClass531_25 = Class531.aClass531_9327;
         Class418.method5190(5, (byte)-29);
      }

   }

   public static void method3832(String var0, boolean var1, String var2, boolean var3, int var4) {
      if(var1) {
         if(!var3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
               Desktop.getDesktop().browse(new URI(var0));
               return;
            } catch (Exception var6) {
               ;
            }
         }

         if(Class220.aString_3781.startsWith("win") && !var3) {
            client.method181(var0, 0, -1845182059);
            return;
         }

         if(Class220.aString_3781.startsWith("mac")) {
            Class194.method2521(var0, 1, var2, -1746521923);
            return;
         }

         client.method181(var0, 2, -1324883275);
      } else {
         client.method181(var0, 3, -1275380669);
      }

   }

   static final void method3833(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      Class431.method5396(var3, var4, var0, 1875787642);
   }

   static void method3834(int var0) {
      Class3.aClass26_26 = Class26.aClass26_268;
      Class3.aClass531_25 = Class531.aClass531_9332;
      Class479.aClass533_8756 = Class533.aClass533_9345;
      Class3.aClass520_21 = Class520.aClass520_9236;
      Class500.aClass522_9086 = Class522.aClass522_9253;
      Class3.aClass521_22 = Class521.aClass521_9249;
      IllegalArgumentException_Sub1.aString_3234 = null;
   }
}
