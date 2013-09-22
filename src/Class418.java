import java.awt.Canvas;

public class Class418 {

   public static final Class418 aClass418_7934 = new Class418(21);
   public static final Class418 aClass418_7935 = new Class418(7);
   public static final Class418 aClass418_7936 = new Class418(-1);
   public static final Class418 aClass418_7937 = new Class418(5);
   public static final Class418 aClass418_7938 = new Class418(5);
   public static final Class418 aClass418_7939 = new Class418(3);
   public static final Class418 aClass418_7940 = new Class418(9);
   public static final Class418 aClass418_7941 = new Class418(10);
   public static final Class418 aClass418_7942 = new Class418(7);
   public static final Class418 aClass418_7943 = new Class418(2);
   public static final Class418 aClass418_7944 = new Class418(7);
   public static final Class418 aClass418_7945 = new Class418(18);
   public static final Class418 aClass418_7946 = new Class418(8);
   public static final Class418 aClass418_7947 = new Class418(6);
   public static final Class418 aClass418_7948 = new Class418(-1);


   Class418(int var1) {}

   static final void method5187(RSInterfaceData var0, int var1) {
      int var2 = var0.anIntArray_9518[-1756266293 * var0.anInt_9510];
      var0.stringDataIndex -= var2 * -1828074049;
      String var3 = ServerInputStream.method3303(var0.stringData, 863838783 * var0.stringDataIndex, var2, (byte)0);
      var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = var3;
   }

   static final void method5188(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = client.anInt_280 * -56315749;
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = client.anInt_326 * 1966576173;
   }

   public static void method5189(Class48 var0, int var1) {
      Class53.aClass48_1073 = var0;
   }

   public static void method5190(int var0, byte var1) {
      if(-243034353 * client.loginStage != var0) {
         client.anInt_459 = 0;
         if(var0 == 17 || var0 == 7) {
            Class21.method128(-671235497);
         }

         if(var0 != 17 && MapIconUnpacker.aClass237_10013 != null) {
            MapIconUnpacker.aClass237_10013.method3067((byte)45);
            MapIconUnpacker.aClass237_10013 = null;
         }

         if(5 == var0) {
            Class271.method3558(3 == client.loginStage * -243034353 || -243034353 * client.loginStage == 0 || Class571.aClass587_9651.anInt_9755 * 2137738939 != 1854782309 * client.anInt_468, (short)-14610);
         }

         if(4 == var0) {
            RandomAccessFileNode.method5761(1854782309 * client.anInt_468 != -1826585143 * Class571.aClass587_9651.anInt_9756, (byte)65);
         }

         if(var0 != 18 && 8 != var0) {
            if(9 != var0 && (2 != var0 || client.loginStage * -243034353 == 11)) {
               if(0 == var0) {
                  Class303.method3834(-1467520122);
               }
            } else if(!Class21.method128(-671235497)) {
               return;
            }
         } else if(!Class561.method6192(-232385531)) {
            return;
         }

         if(Plane.method2164(var0, (byte)1)) {
            client.aClass296_348.method3770(1779150664);
            Class494.method5780(true, -1626899059);
         }

         if(var0 == 10 || var0 == 5) {
            Class493.method5769(1884048175);
         }

         boolean var2 = var0 == 1 || Class305.method3848(var0, 579521279) || Class636.method6720(var0, 940782953);
         boolean var3 = client.loginStage * -243034353 == 1 || Class305.method3848(client.loginStage * -243034353, -58180719) || Class636.method6720(-243034353 * client.loginStage, 1182851676);
         if(var3 != var2) {
            if(var2) {
               Class217.anInt_3752 = Class217.anInt_3756 * -331478693;
               if(Class104_Sub21.renderSettings.aClass540_Sub14_7309.method1701(-1183635134) != 0) {
                  Class335.method4159(2, GraphicsDataHolder.aCacheUnpacker_9212, Class217.anInt_3756 * -630832909, 0, Class104_Sub21.renderSettings.aClass540_Sub14_7309.method1701(-2110604760), false, -410446614);
                  Class134.method1792(1280045050);
               } else {
                  Class240_Sub22_Sub10.method2609(2, -1225960752);
               }

               Class91.updateServerConnection.method3639(false, 379908392);
            } else {
               Class240_Sub22_Sub10.method2609(2, -948508632);
               Class91.updateServerConnection.method3639(true, -455376492);
            }
         }

         if(Plane.method2164(var0, (byte)1) || var0 == 17 || var0 == 7) {
            Class286.gameRenderer.method1907();
         }

         client.loginStage = var0 * -2043512849;
      }
   }

   public static void method5191(int var0, int var1, int var2) {
      Class248_Sub1.anInt_6446 = (var0 - Class248_Sub1.anInt_4120) * 1082544505;
      Class248_Sub1.anInt_6447 = -826358349 * (var1 - Class248_Sub1.anInt_4124);
   }

   public static int method5192(byte var0) {
      Canvas var1 = new Canvas();
      var1.setSize(100, 100);
      Renderer var2 = AnimationUnpacker.getRenderer(0, var1, (Class163)null, (Class96)null, (CacheDataUnpacker)null, 0, (short)-11291);
      long var3 = Class373.getCurrentTime((short)11000);

      int var5;
      for(var5 = 0; var5 < 10000; ++var5) {
         var2.method1921(5, 10, 100.0F, 75, 50, 100.0F, 15, 90, 100.0F, -65536, -65536, -65536, 1);
      }

      var5 = (int)(Class373.getCurrentTime((short)13202) - var3);
      var2.method1915(0, 0, 100, 100, -16777216, (byte)-75);
      var2.method1939(-1500363801);
      return var5;
   }

   static final void method5193(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      Class234.method3013(var3, var4, true, 2, var0, 1636031717);
   }
}
