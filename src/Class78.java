import java.applet.Applet;

public class Class78 implements Class70 {

   final Class429 aClass429_1490;


   public void method812(short var1) {}

   public boolean method811(byte var1) {
      return true;
   }

   public void method813(boolean var1, int var2) {
      if(var1) {
         Class286.gameRenderer.drawOutline(0, 0, 1111410531 * Class29.canvasWidth, Class597.canvasHeight * -75607525, this.aClass429_1490.anInt_8260 * -886477355, 0);
      }

   }

   Class78(Class429 var1) {
      this.aClass429_1490 = var1;
   }

   static final void method1022(RSInterfaceData var0, int var1) {
      int var2 = var0.anIntArray_9518[var0.anInt_9510 * -1756266293];
      var0.intTypeIndex -= -1416056414;
      int var3 = var0.intTypes[var0.intTypeIndex * -831324111];
      if(var3 >= 0 && var3 < var0.anIntArray_9495[var2]) {
         var0.anIntArrayArray_9496[var2][var3] = var0.intTypes[var0.intTypeIndex * -831324111 + 1];
      } else {
         throw new RuntimeException();
      }
   }

   static final void method1023(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = -1950055551 * client.anInt_288 == var0.animeTarget.getIndex(-831324111)?1:0;
   }

   static final void method1024(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class9.method53(var3, var4, var0, (byte)-38);
   }

   public static void method1025(Applet var0, String var1, int var2) {
      Class220.anApplet_3778 = var0;
      Class220.aString_3781 = var1;
   }

   static final void method1026(RSInterfaceData var0, int var1) {
      var0.stringDataIndex -= -1828074049;
   }
}
