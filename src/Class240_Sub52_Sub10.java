
public class Class240_Sub52_Sub10 extends Class240_Sub52 {

   int anInt_1122;
   // $FF: synthetic field
   final Class75 aClass75_1123;


   Class240_Sub52_Sub10(Class75 var1) {
      this.aClass75_1123 = var1;
      this.anInt_1122 = 23686597;
   }

   void method5261(ByteArrayDataNode var1, byte var2) {
      this.anInt_1122 = var1.readShort(-1134658737) * -23686597;
   }

   void method5260(Class68 var1, byte var2) {
      var1.method699(this.anInt_1122 * -935037197, 1695176134);
   }

   static void method585(Class434 var0, int var1, int var2, RSInterfaceData var3, int var4) {
      InterfaceDataComposite var5 = Class432.getInterfaceComposite(var0, var1, var2, 2112253642);
      if(null == var5) {
         Class109.decInterfaceIndex(2031364659);
      } else {
         var3.mouseData = new int[var5.anInt_3549 * -891126915];
         var3.objectData = new Object[1306035847 * var5.anInt_3550];
         if(Class434.aClass434_8351 != var5.type && Class434.aClass434_8365 != var5.type && Class434.aClass434_8349 != var5.type) {
            if(Class434.aClass434_8359 == var5.type) {
               var3.mouseData[0] = var3.anInt_9516 * -329527179;
            }
         } else {
            int var6 = 0;
            int var7 = 0;
            if(null != Class203.aClass132_3532) {
               var6 = -1500060803 * Class203.aClass132_3532.X1;
               var7 = 980798721 * Class203.aClass132_3532.Y1;
            }

            var3.mouseData[0] = Class53.captureMouseList.getCaptureMouseX() - var6;
            var3.mouseData[1] = Class53.captureMouseList.getCaptureMouseY() - var7;
         }

         Class273.method3597(var5, 200000, var3, 389652707);
      }
   }
}
