
public abstract class AbstractMouseHandler {

   static int anInt_4052;


   public abstract boolean method3099(short var1);

   public abstract int getCaptureMouseX();

   public abstract boolean method3101(int var1);

   public boolean method3102(int var1) {
      return this.method3099((short)280) || this.method3106(138328107) || this.method3101(-1695392442);
   }

   public abstract AbstractMouseNode method3103(int var1);

   public abstract int getCaptureMouseY();

   public abstract void method3105(int var1);

   public abstract boolean method3106(int var1);

   public abstract void captureMouse();

   static final void method3108(RSInterfaceData var0, int var1) {
      var0.intTypeIndex -= -2124084621;
      byte[] var2 = new byte[]{(byte)var0.intTypes[var0.intTypeIndex * -831324111]};
      byte[] var3 = new byte[]{(byte)var0.intTypes[1 + var0.intTypeIndex * -831324111]};
      int var4 = var0.intTypes[2 + var0.intTypeIndex * -831324111];
      RSInterface var5 = RSServerQueue.getInterface(var4, (byte)105);
      Class1024_Sub3.method7587(var5, var2, var3, var0, 915406079);
   }

   public static void method3109(String var0, String var1, int var2) {
      if(var0.length() <= 320) {
         if(Class620.method6632(631970412)) {
            client.lobbyConnectionHandler.method2545((byte)74);
            Class53.method545(985907904);
            Class11.aString_92 = var0;
            Class11.aString_93 = var1;
            Class418.method5190(18, (byte)-60);
         }
      }
   }

   static final String method3110(int var0, int var1) {
      String var2 = Integer.toString(var0);

      for(int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
         var2 = var2.substring(0, var3) + Class8.commaStr + var2.substring(var3);
      }

      return var2.length() > 9?" " + Class133.addTextColour('\uff80', (byte)6) + var2.substring(0, var2.length() - 8) + ServerString.aClass482_8925.getText(Class599.clientLanguage, 17253380) + " (" + var2 + ")" + Class8.colCloser:(var2.length() > 6?" " + Class133.addTextColour(16777215, (byte)6) + var2.substring(0, var2.length() - 4) + ServerString.aClass482_8903.getText(Class599.clientLanguage, -1263868745) + " (" + var2 + ")" + Class8.colCloser:" " + Class133.addTextColour(16776960, (byte)6) + var2 + Class8.colCloser);
   }

   static final void method3111(RSInterfaceData var0, int var1) {
      Class18.anInt_175 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111] * -61405211;
   }
}
