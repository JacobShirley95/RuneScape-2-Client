
public class IndexNode extends NodeListNode {

   static int floorShadowsOffset;
   public int cacheID;
   static int anInt_7329;


   public IndexNode(int var1) {
      this.cacheID = var1 * 1848583331;
   }

   static final void method4831(RSInterfaceData var0, byte var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class371.method4711(var3, var4, var0, (byte)52);
   }

   static final void method4832(RSInterfaceData var0, byte var1) {
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub26_7308, var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111] == 1?1:0, 1857617690);
      Class481.method5706(-834672780);
      client.aClass296_348.method3754(-2064946815).method6383((byte)-106);
      Class83.method1089(-1800490901);
      client.aBoolean_568 = false;
   }

   static final void method4833(RSInterfaceData var0, byte var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      Class100.method1295(var3, var4, var0, (byte)8);
   }
}
