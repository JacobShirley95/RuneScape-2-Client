
public class Class8 {

   static String braceStr = " (";
   static String aString_35 = "true";
   static String commaStr = ",";
   static String closeBraceStr = ")";
   static String optionPointer = "->";
   static String colCloser = "</col>";
   public static String aString_40 = "<br>";
   static String localhostIP = "127.0.0.1";
   public static String aString_42;


   Class8() throws Throwable {
      throw new Error();
   }

   static Class612 method43(ByteArrayDataNode var0, byte var1) {
      int var2 = var0.readByte(1319071124);
      int var3 = var0.readByte(-1118602446);
      return new Class612(var2, var3);
   }

   static final void method44(RSInterfaceData var0, int var1) {
      Class210.method2655(-2060694599);
   }

   static final void method45(RSInterfaceData var0, int var1) throws Exception_Sub1 {
      var0.intTypeIndex -= -1416056414;
      int var2 = var0.intTypes[-831324111 * var0.intTypeIndex];
      float var3 = (float)var0.intTypes[var0.intTypeIndex * -831324111 + 1] / 1000.0F;
      Class542.aClass43_Sub1_9475.method362(var2, var3, 2035711245);
   }

   static final void method46(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class104_Sub21.renderSettings.aClass540_Sub32_7303.method6082(var2, -1504578901);
   }

   public static Class240_Sub12 method47(int var0) {
      if(Class248_Sub1.aNodeList_4122 != null && null != Class248_Sub1.aClass527_6458) {
         Class248_Sub1.aClass527_6458.method6001(Class248_Sub1.aNodeList_4122, -211863211);
         Class240_Sub12 var1 = (Class240_Sub12)Class248_Sub1.aClass527_6458.method6005(-1537411482);
         if(var1 == null) {
            return null;
         } else {
            MapIcon var2 = Class248_Sub1.mapIconUnpacker.loadIcon(var1.anInt_6801 * 781228131);
            return null != var2 && var2.aBoolean_10003 && var2.method6594(Class248_Sub1.aClass185_4140, Class248_Sub1.aClass184_4108, -1799082115)?var1:ClientSuper.method2894(-882247514);
         }
      } else {
         return null;
      }
   }

   static String method48(byte[] var0, int var1, int var2, int var3) {
      StringBuilder var4 = new StringBuilder();

      for(int var5 = var1; var5 < var1 + var2; var5 += 3) {
         int var6 = var0[var5] & 255;
         var4.append(Class541.aCharArray_9469[var6 >>> 2]);
         if(var5 < var2 - 1) {
            int var7 = var0[var5 + 1] & 255;
            var4.append(Class541.aCharArray_9469[(var6 & 3) << 4 | var7 >>> 4]);
            if(var5 < var2 - 2) {
               int var8 = var0[var5 + 2] & 255;
               var4.append(Class541.aCharArray_9469[(var7 & 15) << 2 | var8 >>> 6]).append(Class541.aCharArray_9469[var8 & 63]);
            } else {
               var4.append(Class541.aCharArray_9469[(var7 & 15) << 2]).append('=');
            }
         } else {
            var4.append(Class541.aCharArray_9469[(var6 & 3) << 4]).append('=').append('=');
         }
      }

      return var4.toString();
   }
}
