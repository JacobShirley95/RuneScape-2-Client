import java.util.Queue;

final class Class600 implements Class553 {

   static int anInt_9881;


   public void method6128(int var1, int var2, int var3, int var4) {
      int var5 = var1 >> 16;
      int var6 = var1 & '\uffff';
      Queue var7 = Class593.aQueue_9813;
      synchronized(Class593.aQueue_9813) {
         Class593.aQueue_9813.add(Class12.method71(var5, var6, var2, var3, (byte)-57));
      }
   }

   public void method6131(boolean var1, int var2) {}

   public static int method6489(byte var0) {
      return Class344.anInt_6560 * 350950847;
   }

   static final void method6490(RSInterfaceData var0, int var1) {
      ConnectionHandler var2 = Class32.method230(-313347673);
      Class240_Sub27 var3 = Class47_Sub1.method3496(Class326.aClass326_6285, var2.aClass528_3433, 1917447504);
      var3.aClass240_Sub8_Sub1_7370.putByte(0, -1776260787);
      int var4 = 964952859 * var3.aClass240_Sub8_Sub1_7370.index;
      var3.aClass240_Sub8_Sub1_7370.putByte(0, -291016226);
      var3.aClass240_Sub8_Sub1_7370.method4463(var0.aClass420_9507.anInt_7968 * -405493655, 1780088387);
      var0.aClass420_9507.aClass240_Sub22_Sub16_7967.method2676(var3.aClass240_Sub8_Sub1_7370, var0.aClass420_9507.anIntArray_7966, 1354202625);
      var3.aClass240_Sub8_Sub1_7370.method4521(var3.aClass240_Sub8_Sub1_7370.index * 964952859 - var4, -907432342);
      var2.addPacket(var3, 1484600166);
   }

   static final void method6491(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      MapOverviewNode var3 = Class248.method3157(var2);
      if(var3 == null) {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = -1;
      } else {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var3.zoomPercent * -1998615479;
      }

   }

   static final void method6492(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class104_Sub21.renderSettings.aClass540_Sub3_7307.method1431((byte)0);
   }

   public static boolean method6493(String var0, int var1) {
      if(null == var0) {
         return false;
      } else {
         for(int var2 = 0; var2 < client.friendsCount * -1301826725; ++var2) {
            if(var0.equalsIgnoreCase(client.friendsList[var2].aString_51)) {
               return true;
            }
         }

         if(var0.equalsIgnoreCase(Class521.myPlayer.playerName)) {
            return true;
         } else {
            return false;
         }
      }
   }
}
