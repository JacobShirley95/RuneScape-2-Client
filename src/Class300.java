
public class Class300 {

   public static CacheData[] cacheDataArray;


   Class300() throws Throwable {
      throw new Error();
   }

   public static void method3808(Class434 var0, int var1, int var2, Class573 var3, Class563_Sub1_Sub2_Sub1 var4, byte var5) {
      RSInterfaceData var6 = Class261.getInterfaceData();
      var6.aClass563_Sub1_Sub2_Sub1_9512 = var4;
      Class240_Sub52_Sub10.method585(var0, var1, var2, var6, 2073810497);
      var6.aClass563_Sub1_Sub2_Sub1_9512 = null;
   }

   static final void method3809(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, int var3) {
      String var4 = (String)var2.stringData[(var2.stringDataIndex -= -1828074049) * 863838783];
      if(Class557.extractInterfaceIntData(var4, var2, 1647116524) != null) {
         var4 = var4.substring(0, var4.length() - 1);
      }

      var0.anObjectArray_2526 = Class133.extractInterfaceData(var4, var2, (byte)6);
      var0.aBoolean_2524 = true;
   }

   static final void method3810(RSInterfaceData var0, int var1) {
      int interfaceIndex = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(interfaceIndex, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[interfaceIndex >> 16];
      Class109.method1408(var3, var4, var0, (byte)112);
   }

   static final void method3811(RSInterfaceData var0, int var1) {
      var0.intTypeIndex -= -708028207;
      int var2 = var0.intTypes[-831324111 * var0.intTypeIndex];
      Class240_Sub16 var3 = (Class240_Sub16)client.widgets.getNode((long)var2);
      if(null != var3 && 3 == var3.anInt_6897 * 270505159) {
         Class104_Sub8.method3387(var3, true, true, (byte)-1);
      }

   }

   static final void method3812(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 1389998033 * Class11.anInt_59;
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = -1187895493 * Class11.anInt_57;
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class11.anInt_98 * -624833733;
      Class11.anInt_59 = 1494347166;
      Class11.anInt_57 = 1783621133;
      Class11.anInt_98 = 1935878669;
   }

   static final void method3813(RSInterfaceData var0, byte var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      if(-826987519 * client.anInt_567 == 2 && var2 < -1301826725 * client.friendsCount) {
         FriendPlayer var3 = client.friendsList[var2];
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = var3.aString_51;
         if(null != var3.aString_46) {
            var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = var3.aString_46;
         } else {
            var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = "";
         }
      } else {
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = "";
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = "";
      }

   }

   public static void method3814(int var0) {
      Class620.aClass170_10024 = null;
      Class192.anInt_3345 = 1094626891;
   }

   static String getOptionString(RSInterface var0, int var1, int var2) {
      return !client.method174(var0).method4998(var1, -1348534751) && null == var0.anObjectArray_2572?null:(null != var0.options && var0.options.length > var1 && var0.options[var1] != null && var0.options[var1].trim().length() != 0?var0.options[var1]:(client.aBoolean_365?"Hidden-" + var1:null));
   }
}
