
public class Class630 implements Class262 {

   final Class486 aClass486_10077;
   public static Sprite aSprite_10078;


   public void method3492(byte var1) {
      Class240_Sub27 var2 = Class47_Sub1.method3496(Class326.aClass326_6254, client.gameConnectionHandler.aClass528_3433, 1917447504);
      var2.aClass240_Sub8_Sub1_7370.method4477(this.aClass486_10077.getLanguageID(177256542), (byte)76);
      client.gameConnectionHandler.addPacket(var2, 39020784);
   }

   Class630(Class486 var1) {
      this.aClass486_10077 = var1;
   }

   static final void method6690(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, int var3) {
      int var4 = var2.intTypes[(var2.intTypeIndex -= -708028207) * -831324111];
      if(client.anInt_567 * -826987519 == 2 && var4 < -1301826725 * client.friendsCount) {
         var0.aString_2568 = client.friendsList[var4].aString_51;
      }

   }

   static final void method6691(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class561.colourMap[CacheFileID.method1398(var2, 2020200675) & '\uffff'];
   }

   static final void method6692(RSInterfaceData var0, byte var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      Class2.method7(var3, var4, var0, -656133072);
   }

   public static long method6693(CharSequence var0, byte var1) {
      int var2 = var0.length();
      long var3 = 0L;

      for(int var5 = 0; var5 < var2; ++var5) {
         var3 = (var3 << 5) - var3 + (long)var0.charAt(var5);
      }

      return var3;
   }

   static final void method6694(RSInterfaceData var0, int var1) {
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub7_7291, var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111], 583783884);
      Class83.method1089(-1795288086);
      client.aBoolean_568 = false;
   }

   static final void method6695(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      Class285.method3678(var3, var4, var0, -1823747660);
   }
}
