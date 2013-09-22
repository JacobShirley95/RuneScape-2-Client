
public class Class271 {

   static final Class271 aClass271_4683 = new Class271(5);
   public final int anInt_4684;
   public static final Class271 aClass271_4685 = new Class271(2);
   public static final Class271 aClass271_4686 = new Class271(3);
   public static final Class271 aClass271_4687 = new Class271(4);
   public static final Class271 aClass271_4688 = new Class271(1);
   static final Class271 aClass271_4689 = new Class271(6);
   static final Class271 aClass271_4690 = new Class271(8);
   static final Class271 aClass271_4691 = new Class271(7);
   public static final Class271 aClass271_4692 = new Class271(0);
   public static int anInt_4693;


   Class271(int var1) {
      this.anInt_4684 = 46546407 * var1;
   }

   public static Class225 method3556(int var0, int var1, int var2, int var3, boolean var4, int var5, int var6) {
      if((var4?Class104_Sub21.renderSettings.aClass540_Sub14_7322.method1701(-1956304880):Class104_Sub21.renderSettings.aClass540_Sub14_7320.method1701(-1759220320)) != 0 && 0 != var1 && Class217.anInt_3759 * 1967345345 < 50 && -1 != var0) {
         Class225 var7 = new Class225((byte)(var4?3:2), var0, var1, var2, var3, 0, var5, (Class563_Sub1)null);
         Class217.aClass225Array_3760[(Class217.anInt_3759 += 1198145857) * 1967345345 - 1] = var7;
         return var7;
      } else {
         return null;
      }
   }

   static final void method3557(RSInterfaceData var0, int var1) {
      var0.intTypeIndex -= -1416056414;
      int var2 = var0.intTypes[-831324111 * var0.intTypeIndex];
      int var3 = var0.intTypes[1 + var0.intTypeIndex * -831324111];
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var2 % var3;
   }

   public static void method3558(boolean var0, short var1) {
      if(var0) {
         if(-1 != client.anInt_468 * 1854782309) {
            Class188.method2308(client.anInt_468 * 1854782309, 1148469640);
         }

         for(Class240_Sub16 var2 = (Class240_Sub16)client.widgets.start(); var2 != null; var2 = (Class240_Sub16)client.widgets.next()) {
            if(!var2.hasNext()) {
               var2 = (Class240_Sub16)client.widgets.start();
               if(null == var2) {
                  break;
               }
            }

            Class104_Sub8.method3387(var2, true, false, (byte)-1);
         }

         client.anInt_468 = 1513750931;
         client.widgets = new NodeArrayList(8);
         Class86.method1133(1309983100);
         client.anInt_468 = -709554273 * Class571.aClass587_9651.anInt_9755;
         Class211.method2659(false, -1929062718);
         Class104_Sub3.method3180(2105623373);
         Class240_Sub25.method4845(1854782309 * client.anInt_468, (int[])null, -710931857);
      }

      Class542.method6086((byte)1);
      Class11.aBoolean_97 = false;
      Class188.method2315(1410278882);
      client.anInt_373 = 1449477201;
      Class608.method6553(-381640343 * client.anInt_371, 1791648701);
      Class521.myPlayer = new Player((WorldObjects)null);
      Class521.myPlayer.setPosition((float)(client.aClass296_348.getMaxX((byte)-78) * 512 / 2), 0.0F, (float)(client.aClass296_348.getMaxY(992210950) * 512 / 2));
      Class521.myPlayer.tilePosArrayX[0] = client.aClass296_348.getMaxX((byte)-63) / 2;
      Class521.myPlayer.tilePosArrayY[0] = client.aClass296_348.getMaxY(-1978231912) / 2;
      Class373.anInt_7118 = 0;
      Class330.anInt_6406 = 0;
      if(Class509.anInt_9182 * 1735950531 == 5) {
         Class330.anInt_6406 = 1881166515 * (Class183.anInt_3179 * -2039509027 << 9);
         Class373.anInt_7118 = (Class326.anInt_6335 * 987042753 << 9) * -1775806967;
      } else {
         Class187_Sub2.method7582((short)9117);
      }

      client.aClass296_348.method3754(-1477111690).method6383((byte)-48);
   }

   static void method3559(int var0) {
      Class240_Sub27 var1 = Class47_Sub1.method3496(Class326.aClass326_6303, client.gameConnectionHandler.aClass528_3433, 1917447504);
      var1.aClass240_Sub8_Sub1_7370.putByte(Class445.method5491(1917504476), -906905306);
      var1.aClass240_Sub8_Sub1_7370.method4463(1111410531 * Class29.canvasWidth, -370119493);
      var1.aClass240_Sub8_Sub1_7370.method4463(-75607525 * Class597.canvasHeight, 1945178064);
      var1.aClass240_Sub8_Sub1_7370.putByte(Class104_Sub21.renderSettings.aClass540_Sub27_7288.method4256(-2098592998), 205027903);
      client.gameConnectionHandler.addPacket(var1, 638615062);
   }

   public static void method3560(int var0, String var1, int var2, int var3) {
      InterfaceDataComposite var4 = Class432.getInterfaceComposite(Class434.aClass434_8347, var0, -1, 2020245218);
      if(var4 != null) {
         RSInterfaceData var5 = Class261.getInterfaceData();
         var5.mouseData = new int[var4.anInt_3549 * -891126915];
         var5.objectData = new String[var4.anInt_3550 * 1306035847];
         var5.objectData[0] = var1;
         var5.mouseData[0] = var2;
         Class273.method3597(var4, 200000, var5, 616376802);
      }
   }

   static short[][] method3561(float[][] var0, short[][] var1, byte var2) {
      for(int var3 = 0; var3 < var0.length; ++var3) {
         for(int var4 = 0; var4 < var1[var3].length; ++var4) {
            var1[var3][var4] = (short)((int)(16383.0F * var0[var3][var4]));
         }
      }

      return var1;
   }
}
