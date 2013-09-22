
public final class Class88 {

   static final String aString_1798 = "#";
   public static AnimationUnpacker animeUnpacker;


   Class88() throws Throwable {
      throw new Error();
   }

   static final void method1181(RSInterfaceData var0, byte var1) {
      var0.intTypeIndex -= -2124084621;
      client.anInt_460 = var0.intTypes[var0.intTypeIndex * -831324111] * 827925881;
      Class430.aClass517_8266 = Class303.method3829(var0.intTypes[1 + -831324111 * var0.intTypeIndex], 1979045162);
      if(Class430.aClass517_8266 == null) {
         Class430.aClass517_8266 = Class517.aClass517_9218;
      }

      client.anInt_538 = var0.intTypes[-831324111 * var0.intTypeIndex + 2] * -689069471;
      ConnectionHandler var2 = Class32.method230(1647546673);
      Class240_Sub27 var3 = Class47_Sub1.method3496(Class326.aClass326_6308, var2.aClass528_3433, 1917447504);
      var3.aClass240_Sub8_Sub1_7370.putByte(client.anInt_460 * -531811127, 919551103);
      var3.aClass240_Sub8_Sub1_7370.putByte(Class430.aClass517_8266.anInt_9221 * 1581295263, -978908459);
      var3.aClass240_Sub8_Sub1_7370.putByte(client.anInt_538 * 1677361569, -1426699327);
      var2.addPacket(var3, -61030737);
   }
}
