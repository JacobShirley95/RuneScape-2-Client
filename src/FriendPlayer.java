import java.awt.Component;

public class FriendPlayer {

   public boolean aBoolean_45;
   public String aString_46;
   public String aString_47;
   public String aString_48;
   public int anInt_49;
   public int anInt_50;
   public String aString_51;
   public int anInt_52;
   public boolean aBoolean_53;
   public int anInt_54;
   static RSFont aRSFont_55;


   static final void method58(RSInterface var0, RSInterfaceData var1, int var2) {
      var1.intTypeIndex -= -1416056414;
      int var3 = var1.intTypes[-831324111 * var1.intTypeIndex] - 1;
      int var4 = var1.intTypes[1 + var1.intTypeIndex * -831324111];
      if(var3 >= 0 && var3 <= 9) {
         Class240_Sub30.method4860(var0, var3, var4, var1, 569540883);
      } else {
         throw new RuntimeException();
      }
   }

   static final void method59(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class104_Sub21.renderSettings.aClass540_Sub22_7310.method4062(1914692712)?1:0;
   }

   public static RSWorld method60(byte var0) {
      return Class113.getRSWorld(Class503.aConnectionDesc_9108.id * -1543224839, -1400725172);
   }

   public static AbstractKeyboardHandler addKeyboardHandlerToComponent(Component var0, int var1) {
      return new KeyboardHandler(var0);
   }
}
