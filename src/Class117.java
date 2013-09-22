
public class Class117 {

   public static final Class117 aClass117_2091 = new Class117(5);
   static final Class117 aClass117_2092 = new Class117(0);
   public static final Class117 aClass117_2093 = new Class117(3);
   static final Class117 aClass117_2094 = new Class117(1);
   public static final Class117 aClass117_2095 = new Class117(4);
   static final Class117 aClass117_2096 = new Class117(2);
   int anInt_2097;


   Class117(int var1) {
      this.anInt_2097 = var1 * 810652755;
   }

   static final void method1493(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      if(null != client.aString_542 && var2 < Class298.anInt_5996 * 1282766579) {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = ScreenCharText.aClass214Array_6170[var2].anInt_3713 * 948065465;
      } else {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 0;
      }

   }

   static final void method1494(RSInterfaceData var0, int var1) {
      var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = Class370.getRootCacheFile(-974187698).toString();
   }

   static final void method1495(RSInterfaceData var0, byte var1) {
      Class586.method6364(var0, Class521.myPlayer, 324434249);
   }

   static final void method1496(RSInterfaceData var0, byte var1) {
      var0.intTypeIndex -= -1416056414;
      int var2 = var0.intTypes[-831324111 * var0.intTypeIndex];
      int var3 = var0.intTypes[1 + -831324111 * var0.intTypeIndex];
      if(-1 != var2) {
         if(var3 > 255) {
            var3 = 255;
         } else if(var3 < 0) {
            var3 = 0;
         }

         Class611.method6567(var2, var3, false, 1937178656);
      }

   }

   static Class611 method1497(int var0, byte var1) {
      Class611[] var2 = Class121.method1531(-1802699436);

      for(int var3 = 0; var3 < var2.length; ++var3) {
         Class611 var4 = var2[var3];
         if(var4.anInt_9948 * 1508901969 == var0) {
            return var4;
         }
      }

      return null;
   }

   static final void method1498(RSInterfaceData var0, byte var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      Class638.method6729(var3, var4, var0, (byte)-39);
   }
}
