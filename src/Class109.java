import java.util.HashMap;
import java.util.Map;

public class Class109 {

   static final NodeArrayList aNodeArrayList_2041 = new NodeArrayList(1024);
   static final Map aMap_2042 = new HashMap();
   static int anInt_2043 = 0;
   public static int anInt_2044;


   Class109() throws Throwable {
      throw new Error();
   }

   public static void method1406(byte var0) {
      Class308.method3867();
   }

   static final void decInterfaceIndex(int var0) {
      Class556.interfaceDatIndex -= 476864413;
   }

   static final void method1408(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, byte var3) {
      String var4 = (String)var2.stringData[(var2.stringDataIndex -= -1828074049) * 863838783];
      if(Class557.extractInterfaceIntData(var4, var2, 1498156717) != null) {
         var4 = var4.substring(0, var4.length() - 1);
      }

      var0.interfaceData = Class133.extractInterfaceData(var4, var2, (byte)68);
      var0.aBoolean_2524 = true;
   }

   static void method1409(RSInterface var0, int var1) {
      if(client.aBoolean_463) {
         if(null != var0.anObjectArray_2449) {
            RSInterface var2 = DrawingTarget.method2201(2036107931 * Class283_Sub3.anInt_7897, client.anInt_543 * -315969483, (byte)92);
            if(var2 != null) {
               Class240_Sub17 var3 = new Class240_Sub17();
               var3.aClass132_6903 = var0;
               var3.aClass132_6909 = var2;
               var3.anObjectArray_6907 = var0.anObjectArray_2449;
               Class411.method5074(var3, (byte)1);
            }
         }

         Class240_Sub27 var4 = Class47_Sub1.method3496(Class326.aClass326_6311, client.gameConnectionHandler.aClass528_3433, 1917447504);
         var4.aClass240_Sub8_Sub1_7370.method4514(2036107931 * Class283_Sub3.anInt_7897, 1746976775);
         var4.aClass240_Sub8_Sub1_7370.method4463(-315969483 * client.anInt_543, -1027462);
         var4.aClass240_Sub8_Sub1_7370.putShort(1440987389 * client.anInt_279, -1706565735);
         var4.aClass240_Sub8_Sub1_7370.method4507(-1001687885 * var0.anInt_2428, -1828074049);
         var4.aClass240_Sub8_Sub1_7370.method4507(2142376247 * var0.itemID, -1828074049);
         var4.aClass240_Sub8_Sub1_7370.method4515(var0.cacheID * 1278853609, 447751394);
         client.gameConnectionHandler.addPacket(var4, 2108818396);
      }
   }
}
