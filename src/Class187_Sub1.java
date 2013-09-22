
public class Class187_Sub1 extends Class187 {

   public int anInt_10909;


   void method2293(ByteArrayDataNode var1, int var2, int var3) {
      Class473 var4 = (Class473)Class559.method6185(Class285.method3680(-1044321360), var2, (byte)-67);
      if(var4 == Class473.aClass473_8705) {
         this.anInt_10909 = var1.readShort(-552489298) * 1420013811;
      }

   }

   Class187_Sub1(Class283 var1, int var2) {
      super(var1, var2);
   }

   static final void method7536(RSInterfaceData var0, byte var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class3.method18(var3, var4, var0, (byte)-35);
   }

   static boolean method7537(int var0, int var1) {
      return var0 == 2 || 11 == var0;
   }

   static final void method7538(RSInterfaceData var0, byte var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class104_Sub21.renderSettings.aClass540_Sub21_7306.method4042(860074484)?1:0;
   }
}
