
public abstract class Class290 implements Runnable {

   volatile boolean aBoolean_5910 = false;
   volatile boolean aBoolean_5911 = false;
   volatile Class316[] aClass316Array_5912 = new Class316[2];


   static final void method3707(RSInterfaceData var0, byte var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      ScreenCharText.method3930(var3, var4, var0, (byte)2);
   }

   static final void method3708(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      Class633.method6704(var3, var4, var0, (byte)27);
   }

   static final void method3709(RSInterfaceData var0, byte var1) {
      var0.stringDataIndex -= -1828074049;
      var0.intTypeIndex -= -2124084621;
      String var2 = (String)var0.stringData[var0.stringDataIndex * 863838783];
      boolean var3 = 1 == var0.intTypes[var0.intTypeIndex * -831324111];
      boolean var4 = 1 == var0.intTypes[-831324111 * var0.intTypeIndex + 1];
      boolean var5 = 1 == var0.intTypes[var0.intTypeIndex * -831324111 + 2];
      Class240_Sub27 var6 = Class47_Sub1.method3496(Class326.aClass326_6294, client.lobbyConnectionHandler.aClass528_3433, 1917447504);
      var6.aClass240_Sub8_Sub1_7370.method4463(Class258.method3383(var2, -876513505) + 1, -82974103);
      var6.aClass240_Sub8_Sub1_7370.putString(var2, (byte)-5);
      int var7 = 0;
      if(var3) {
         var7 |= 1;
      }

      if(var4) {
         var7 |= 2;
      }

      if(var5) {
         var7 |= 4;
      }

      var6.aClass240_Sub8_Sub1_7370.putByte(var7, -734183348);
      client.lobbyConnectionHandler.addPacket(var6, 1857729578);
   }

   static Class method3710(String var0, byte var1) throws ClassNotFoundException {
      return var0.equals("B")?Byte.TYPE:(var0.equals("I")?Integer.TYPE:(var0.equals("S")?Short.TYPE:(var0.equals("J")?Long.TYPE:(var0.equals("Z")?Boolean.TYPE:(var0.equals("F")?Float.TYPE:(var0.equals("D")?Double.TYPE:(var0.equals("C")?Character.TYPE:(var0.equals("void")?Void.TYPE:Class.forName(var0)))))))));
   }

   static final void method3711(RSInterfaceData var0, byte var1) {
      var0.intTypeIndex -= -1416056414;
      int var2 = var0.intTypes[var0.intTypeIndex * -831324111];
      int var3 = var0.intTypes[var0.intTypeIndex * -831324111 + 1];
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class504.method5858(var2, var3, false, -1701006333);
   }
}
