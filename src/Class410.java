
public class Class410 implements Class579 {

   public String method6314(Class577 var1, int[] var2, long var3) {
      if(var1 == Class577.aClass577_9680) {
         Class470 var6 = Class493.aClass466_9034.method5614(var2[0], (byte)43);
         return var6.method5656((int)var3, -1986499759);
      } else if(var1 != Class577.aClass577_9670 && Class577.aClass577_9679 != var1) {
         return var1 != Class577.aClass577_9676 && var1 != Class577.aClass577_9682 && Class577.aClass577_9674 != var1?null:Class493.aClass466_9034.method5614(var2[0], (byte)22).method5656((int)var3, 1756888591);
      } else {
         ObjectDescriptor var5 = Class592.cacheObjectLoader.getObjectDescriptor((int)var3);
         return var5.name;
      }
   }

   static final void method5059(RSInterfaceData var0, byte var1) {
      String var2 = (String)var0.stringData[(var0.stringDataIndex -= -1828074049) * 863838783];
      if(var2.startsWith(Class3.method12(0, -1553609774)) || var2.startsWith(Class3.method12(1, -1553609774))) {
         var2 = var2.substring(7);
      }

      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class600.method6493(var2, 1256248325)?1:0;
   }

   static final void method5060(RSInterfaceData var0, byte var1) {
      var0.intTypeIndex -= -1416056414;
      int var2 = var0.intTypes[-831324111 * var0.intTypeIndex];
      int var3 = var0.intTypes[-831324111 * var0.intTypeIndex + 1];
      if(var3 == -1) {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = -1;
      } else {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class534.aClass275_9439.method3606(var2, -1781797267).method2606((char)var3, -1596833377);
      }

   }

   static final void method5061(RSInterfaceData var0, int var1) {
      var0.intTypeIndex -= -1416056414;
      RSServer.aShortArray_9662[var0.intTypes[var0.intTypeIndex * -831324111]] = (short)Class554.method6139(var0.intTypes[var0.intTypeIndex * -831324111 + 1], (byte)0);
      Class592.cacheObjectLoader.method5578(-1181467598);
      Class592.cacheObjectLoader.method5577(-1695441910);
      Class104_Sub6.characterUnpacker.method5676(1193374292);
      Class104_Sub3.method3180(2105623373);
   }

   public static String method5062(byte[] var0, int var1) {
      return Class537.bytesToString(var0, 0, var0.length, -208873366);
   }

   public static RSFont method5063(CacheDataUnpacker var0, int var1, int var2, int var3) {
      byte[] var4 = var0.getDataBytes(var1, var2, 97494193);
      return null == var4?null:new RSFont(var4);
   }

   static final int method5064(int var0, int var1, int var2) {
      int var3 = Class9.method52(var0 - 1, var1 - 1, -1525273328) + Class9.method52(var0 + 1, var1 - 1, -1909689154) + Class9.method52(var0 - 1, var1 + 1, 1503077921) + Class9.method52(var0 + 1, var1 + 1, -1342247986);
      int var4 = Class9.method52(var0 - 1, var1, -585734722) + Class9.method52(1 + var0, var1, 731487111) + Class9.method52(var0, var1 - 1, -843424296) + Class9.method52(var0, var1 + 1, -485307331);
      int var5 = Class9.method52(var0, var1, -2021127845);
      return var5 / 4 + var3 / 16 + var4 / 8;
   }

   static void method5065(int var0) {
      Class194.anInt_3357 = -2018923158 + 373563279 * Class1.aRSFont_11.anInt_8571 + Class1.aRSFont_11.anInt_8573 * -62186989;
      Class432.anInt_8342 = -1240992203 * Class1.aRSFont_10.anInt_8573 + Class1.aRSFont_10.anInt_8571 * 615896665 + -128184442;
      Class194.consoleStrings = new String[500];

      for(int var1 = 0; var1 < Class194.consoleStrings.length; ++var1) {
         Class194.consoleStrings[var1] = "";
      }

      Class19.addStringToConsole(ServerString.devConsoleStr.getText(Class599.clientLanguage, 1631578002), -880483352);
   }
}
