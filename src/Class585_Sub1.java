
public class Class585_Sub1 extends Class585 {

   void method6350(ByteArrayDataNode var1, AbstractMouseNode var2, int var3) {}

   boolean method6354(int var1) {
      return this.method4148(711337273) != null || -7013156493177369919L * this.aLong_9725 < Class373.getCurrentTime((short)5578) - 2000L;
   }

   AbstractMouseNode method4148(int var1) {
      return (AbstractMouseNode)client.mouseNodeList.getBaseNode_2((byte)43);
   }

   Class240_Sub27 method6353(byte var1) {
      return Class47_Sub1.method3496(Class326.aClass326_6265, client.gameConnectionHandler.aClass528_3433, 1917447504);
   }

   void method6351(byte var1) {
      AbstractMouseNode var2 = this.method4148(-891174069);
      if(null != var2) {
         int var3 = this.method6348(var2, 32767, -1019863216);
         int var4 = var2.getMouseY(106246653);
         if(var4 < 0) {
            var4 = 0;
         } else if(var4 > '\uffff') {
            var4 = '\uffff';
         }

         int var5 = var2.getMouseX((byte)41);
         if(var5 < 0) {
            var5 = 0;
         } else if(var5 > '\uffff') {
            var5 = '\uffff';
         }

         byte var6 = 0;
         if(var2.getClickType(745814269) == 2) {
            var6 = 1;
         }

         Class240_Sub27 var7 = Class47_Sub1.method3496(Class326.aClass326_6284, client.gameConnectionHandler.aClass528_3433, 1917447504);
         var7.aClass240_Sub8_Sub1_7370.method4507(var3 | var6 << 15, -1828074049);
         var7.aClass240_Sub8_Sub1_7370.method4516(var5 | var4 << 16, -350677284);
         client.gameConnectionHandler.addPacket(var7, 1513172434);
      }

   }

   int method6349(byte var1) {
      return 0;
   }

   static final long method4152(int var0) {
      return (long)((Class556.anInt_9552 += 1141835491) * 1784704715 - 1) << 32 | 4294967295L;
   }

   public static Class604[] method4153(int var0) {
      return new Class604[]{Class604.aClass604_9900, Class604.aClass604_9898, Class604.aClass604_9899};
   }

   static final void method4154(String var0, int var1) {
      System.out.println("Error: " + Class602.method6503(var0, "%0a", "\n", -1025618511));
   }
}
