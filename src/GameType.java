import java.util.Iterator;

public class GameType {

   public static final GameType aClass510_9184 = new GameType("WIP", 2);
   public static final GameType aClass510_9185 = new GameType("BUILDLIVE", 3);
   public static final GameType aClass510_9186 = new GameType("LIVE", 0);
   static final GameType aClass510_9187 = new GameType("INTBETA", 4);
   public static final GameType aClass510_9188 = new GameType("RC", 1);
   public final String runtype;
   public final int id;
   static int anInt_9191;


   GameType(String var1, int var2) {
      this.runtype = var1;
      this.id = 169856729 * var2;
   }

   static final void method5916(byte var0) {
      Iterator var1 = client.aNodeArrayList_277.iterator();

      while(var1.hasNext()) {
         Class240_Sub22_Sub6 var2 = (Class240_Sub22_Sub6)var1.next();
         Class563_Sub1_Sub4_Sub2 var3 = var2.aClass563_Sub1_Sub4_Sub2_1237;
         if(client.aClass296_348.getWorldObjects() != null && var3.method2241((byte)8)) {
            client.aClass296_348.getWorldObjects().method3455(var3, true, 1799347921);
         }
      }

   }

   public static final void method5917(boolean var0, int var1, short var2) {
      Class240_Sub47 var3 = var0?Class104_Sub11.aClass240_Sub47_10199:Class545.aClass240_Sub47_9477;
      if(null != var3 && var1 >= 0 && var1 < 899618089 * var3.anInt_7662) {
         Class37 var4 = var3.aClass37Array_7661[var1];
         if(-1 == var4.aByte_855) {
            String var5 = var4.aString_853;
            ConnectionHandler var6 = Class32.method230(759867264);
            Class240_Sub27 var7 = Class47_Sub1.method3496(Class326.aClass326_6268, var6.aClass528_3433, 1917447504);
            var7.aClass240_Sub8_Sub1_7370.putByte(3 + Class258.method3383(var5, -938596954), 431660427);
            var7.aClass240_Sub8_Sub1_7370.putByte(var0?1:0, 1110671604);
            var7.aClass240_Sub8_Sub1_7370.method4463(var1, -1887660636);
            var7.aClass240_Sub8_Sub1_7370.putString(var5, (byte)-77);
            var6.addPacket(var7, 2001106175);
         }
      }
   }

   static final void method5918(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var3.anInt_2428 * -1001687885;
   }

   static final void method5919(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class234.method3013(var3, var4, true, 1, var0, 1728982167);
   }
}
