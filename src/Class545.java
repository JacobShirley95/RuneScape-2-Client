
public class Class545 {

   public static Class240_Sub47 aClass240_Sub47_9477;
   static String aString_9478;


   Class545() throws Throwable {
      throw new Error();
   }

   static final void method6096(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, short var3) {
      String var4 = (String)var2.stringData[(var2.stringDataIndex -= -1828074049) * 863838783];
      if(Class557.extractInterfaceIntData(var4, var2, 1899424879) != null) {
         var4 = var4.substring(0, var4.length() - 1);
      }

      var0.anObjectArray_2558 = Class133.extractInterfaceData(var4, var2, (byte)7);
      var0.aBoolean_2524 = true;
   }

   public static void method6097(int var0) {
      if(Class363.method4614(1349706771) != Class224.aClass224_3843) {
         try {
            String var1 = Class481.clientApplet.getParameter(ParameterNode.aClass424_8039.parameterStringIndex);
            int var2 = (int)(Class373.getCurrentTime((short)29270) / 86400000L) - 11745;
            String var3 = "usrdob=" + var2 + "; version=1; path=/; domain=" + var1;
            Class480.method5703(Class481.clientApplet, "document.cookie=\"" + var3 + "\"", (byte)2);
         } catch (Throwable var4) {
            ;
         }

      }
   }

   static Class517[] method6098(int var0) {
      return new Class517[]{Class517.aClass517_9219, Class517.aClass517_9218, Class517.aClass517_9220};
   }

   public static String method6099(OptionListNode var0, int var1) {
      return !Class18.optionsClosed && var0 != null?var0.optionName:"";
   }
}
