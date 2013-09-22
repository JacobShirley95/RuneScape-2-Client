import java.util.LinkedList;
import java.util.Queue;

public class Class585_Sub2 extends Class585 {

   final Queue aQueue_7126 = new LinkedList();


   void method6351(byte var1) {
      Class240_Sub43_Sub2 var2 = (Class240_Sub43_Sub2)this.aQueue_7126.poll();
      if(var2 != null) {
         Class240_Sub27 var3 = Class47_Sub1.method3496(Class326.aClass326_6224, client.gameConnectionHandler.aClass528_3433, 1917447504);
         var3.aClass240_Sub8_Sub1_7370.method4514(var2.getMouseX((byte)-12) | var2.getMouseY(-147320104) << 16, 935552707);
         var3.aClass240_Sub8_Sub1_7370.method4463(this.method6348(var2, '\uffff', 2120963392), -1786691332);
         var3.aClass240_Sub8_Sub1_7370.method4500(var2.method2629(1063940434) << 1 | var2.method2624(-1167316697) & 1, (byte)-124);
         client.gameConnectionHandler.addPacket(var3, 1455701435);
         var2.addThisNode((short)16383);
      }
   }

   Class240_Sub27 method6353(byte var1) {
      return Class47_Sub1.method3496(Class326.aClass326_6229, client.gameConnectionHandler.aClass528_3433, 1917447504);
   }

   void method4764(ByteArrayDataNode var1, Class240_Sub43_Sub2 var2, int var3) {
      var1.putByte(var2.method2624(366005941), 1100431254);
   }

   int method6349(byte var1) {
      return 1;
   }

   void method6350(ByteArrayDataNode var1, AbstractMouseNode var2, int var3) {
      this.method4764(var1, (Class240_Sub43_Sub2)var2, 1702913035);
   }

   void method4767(Class240_Sub43_Sub2 var1, byte var2) {
      this.aQueue_7126.add(var1);
      if(this.aQueue_7126.size() > 10) {
         this.aQueue_7126.poll();
      }

   }

   boolean method6354(int var1) {
      return !this.aQueue_7126.isEmpty() || -7013156493177369919L * this.aLong_9725 < Class373.getCurrentTime((short)31671) - 2000L;
   }

   static final void method4769(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class51.method517(var3, var4, var0, -1157805867);
   }
}
