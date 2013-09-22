import java.applet.Applet;

public class Class481 {

   final int anInt_8757;
   final int anInt_8758;
   final int anInt_8759;
   final int anInt_8760;
   final int anInt_8761;
   public static Sprite[] nameIconsSprites;
   static AbstractImageData aClass106_8763;
   public static Applet clientApplet;


   Class481(int var1, int var2, int var3, int var4, int var5) {
      this.anInt_8760 = -717899551 * var1;
      this.anInt_8758 = 141919565 * var2;
      this.anInt_8759 = var3 * 347662221;
      this.anInt_8757 = 1032110869 * var4;
      this.anInt_8761 = -981987009 * var5;
   }

   public int hashCode() {
      return -1982756063 * this.anInt_8760;
   }

   static String getOptionString(OptionListNode var0, int var1) {
      return null != var0.aString_956 && var0.aString_956.length() != 0?(var0.optionString != null && var0.optionString.length() > 0?var0.optionName + ServerString.spacingStr.getText(Class599.clientLanguage, 1261559545) + var0.optionString + ServerString.spacingStr.getText(Class599.clientLanguage, -801473150) + var0.aString_956:var0.optionName + ServerString.spacingStr.getText(Class599.clientLanguage, -498521820) + var0.aString_956):(var0.optionString != null && var0.optionString.length() > 0?var0.optionName + ServerString.spacingStr.getText(Class599.clientLanguage, 1407310549) + var0.optionString:var0.optionName);
   }

   public static void method5706(int var0) {
      int var1 = 0;
      if(Class104_Sub21.renderSettings.aClass540_Sub26_7308.method4199(-660117571) == 1) {
         var1 |= 1;
         var1 |= 16;
         var1 |= 32;
         var1 |= 2;
         var1 |= 4;
      }

      if(Class104_Sub21.renderSettings.aClass540_Sub17_7299.method3986(1104216662) == 0) {
         var1 |= 64;
      }

      Class423.method5288(var1, 643889445);
      client.aClass296_348.method3755(1058608286).method6017(var1, -929798711);
      Class476.aClass306_8741.method3851((byte)13).method3755(1972817428).method6017(var1, -467882790);
      Class592.cacheObjectLoader.method5575(var1, 858993591);
      Class104_Sub6.characterUnpacker.method5671(var1, (byte)13);
      Class75.aClass558_1422.method6160(var1, (byte)-5);
      Class265.method3518(var1, 1242516643);
      Class571.method6272(var1, -1520705521);
      Class43.method401(var1, (byte)1);
      Class293.method3721(var1, 1549248668);
      Class206.method2621(var1, (byte)102);
      client.aClass296_348.method3789((byte)76);
   }

   static final void method5707(RSInterfaceData var0, byte var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class116.method1485(var3, var4, var0, (short)257);
   }

   public static void method5708(byte var0) {
      if(!Class209.aBoolean_3605) {
         Class37.method307(client.aClass296_348.getWorldObjects().aClass638ArrayArrayArray_4510, -1687549659);
         if(client.aClass296_348.getWorldObjects().aClass638ArrayArrayArray_4487 != null) {
            Class37.method307(client.aClass296_348.getWorldObjects().aClass638ArrayArrayArray_4487, -1687549659);
         }

         Class209.aBoolean_3605 = true;
      }
   }

   static boolean method5709(int var0, int var1) {
      return var0 != 3 && 4 != var0 && 5 != var0 && 6 != var0 && 1001 != var0 && 1002 != var0?var0 == 2:true;
   }
}
