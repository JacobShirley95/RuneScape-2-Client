
public class Class604 implements Class551 {

   static final Class604 aClass604_9898 = new Class604(0);
   static final Class604 aClass604_9899 = new Class604(1);
   static final Class604 aClass604_9900 = new Class604(2);
   final int anInt_9901;


   public int getLanguageID(int var1) {
      return this.anInt_9901 * -1667568283;
   }

   Class604(int var1) {
      this.anInt_9901 = var1 * 270302317;
   }

   static final void method6510(RSInterfaceData var0, byte var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      if(-1 == -1001687885 * var2.aClass132_9524.anInt_2428) {
         if(var0.aBoolean_9522) {
            throw new RuntimeException("");
         } else {
            throw new RuntimeException("");
         }
      } else {
         RSInterface var3 = var2.method6123((byte)24);
         var3.aClass132Array_2579[-1001687885 * var2.aClass132_9524.anInt_2428] = null;
         Class110_Sub1.method3149(var3, -229845047);
      }
   }

   static final void method6511(RSInterfaceData var0, int var1) {
      var0.intTypeIndex -= -2124084621;
      int var2 = var0.intTypes[var0.intTypeIndex * -831324111];
      int var3 = var0.intTypes[-831324111 * var0.intTypeIndex + 1];
      int var4 = var0.intTypes[-831324111 * var0.intTypeIndex + 2];
      if(var3 == -1) {
         throw new RuntimeException();
      } else {
         Class470 var5 = Class493.aClass466_9034.method5614(var3, (byte)-32);
         if(var2 != var5.aChar_8694) {
            throw new RuntimeException();
         } else {
            var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var5.method5648(Integer.valueOf(var4), 2004763587)?1:0;
         }
      }
   }

   public static Class469 createProxyConnection(String var0, int var1, short var2) {
      ProxyConnector var3 = new ProxyConnector();
      var3.proxyHost = var0;
      var3.anInt_8692 = 1209974487 * var1;
      return var3;
   }

   static void method6513(int var0, String var1, boolean var2, int var3) {
      Class46.method441((byte)-111);
      Class547.method6104(-1091591114);
      Class34.method264(2145676032);
      Class479.method5698(var0, var1, var2, 946598459);
      Class368.aFontUnpacker_6922.method4132(1061802956);
      Class368.aFontUnpacker_6922.method4131(client.aClass339_284, -883974002);
      Class20.method122(Class286.gameRenderer, 1157737446);
      Class240_Sub30.loadSprites(Class286.gameRenderer, Class301.mmUnpacker);
      Class540_Sub21.method4048(-1935633038);
      Class215.setTextImgs(Class481.nameIconsSprites);
      Class104_Sub3.method3180(2105623373);
      Class481.method5706(-834672780);
      if(client.loginStage * -243034353 == 5) {
         Class418.method5190(13, (byte)-108);
      } else if(-243034353 * client.loginStage == 4) {
         Class418.method5190(14, (byte)-126);
      } else if(2 == -243034353 * client.loginStage) {
         Class418.method5190(11, (byte)-43);
      } else if(6 == -243034353 * client.loginStage) {
         Class418.method5190(10, (byte)-32);
      } else if(15 != client.loginStage * -243034353 && -243034353 * client.loginStage != 1) {
         if(client.loginStage * -243034353 == 3) {
            Class418.method5190(12, (byte)-121);
         } else if(10 == -243034353 * client.loginStage) {
            Class357.method4549(false, (byte)82);
         }
      } else {
         Class240_Sub19.method4786(594627509);
      }

   }

   static void method6514(boolean var0, byte var1) {
      Class194.aString_3361 = Class194.aString_3361.trim();
      Class194.anInt_3362 = 0;
      if(Class194.aString_3361.length() == 0) {
         Class194.anInt_3363 = 0;
      } else {
         Class19.addStringToConsole("--> " + Class194.aString_3361, -257072358);
         Class66.acceptCommand(Class194.aString_3361, false, var0, -1786563922);
         if(!var0) {
            Class194.anInt_3363 = 0;
            Class194.aString_3361 = "";
         } else {
            Class194.anInt_3363 = Class194.aString_3361.length() * 1782055083;
         }

      }
   }
}
