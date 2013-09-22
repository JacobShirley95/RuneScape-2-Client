
public class Class297 {

   ByteArrayDataNode_Sub1 aClass240_Sub8_Sub1_5990;
   Class305 aClass305_5991;


   public Class297(Class305 var1, ByteArrayDataNode_Sub1 var2) {
      this.aClass305_5991 = var1;
      this.aClass240_Sub8_Sub1_5990 = var2;
   }

   static Class240_Sub41_Sub2 method3795(Class240_Sub41_Sub2 var0, int var1) {
      Class240_Sub41_Sub2 var2 = var0 == null?new Class240_Sub41_Sub2():new Class240_Sub41_Sub2(var0);
      var2.method476(9, 128, 1377194424);
      return var2;
   }

   static final void method3796(RSInterfaceData var0, byte var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = -340277309 * var3.scrollX;
   }

   static final void method3797(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var3.anInt_2475 * 551013685;
   }

   static final void method3798(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = -1760962491 * var3.anInt_2486;
   }

   public static void method3799(int var0) {
      for(Class240_Sub22_Sub1 var1 = (Class240_Sub22_Sub1)Class18.aClass494_158.method5772(-1761370607); var1 != null; var1 = (Class240_Sub22_Sub1)Class18.aClass494_158.method5771(-1443174479)) {
         if(var1.anInt_799 * -1686791407 > 1) {
            var1.anInt_799 = 0;
            Class18.aClass627_161.insert(var1, -7702105217297120635L * ((OptionListNode)var1.aClass494_798.aClass240_Sub22_9036.aClass240_Sub22_7277).optionData);
            var1.aClass494_798.method5770(-844452913);
         }
      }

      Class18.anInt_155 = 0;
      Class18.optionCount = 0;
      Class18.optionNodeList.clear(-1915609583);
      Class18.aNodeArrayList_157.method5938(1421832597);
      Class18.aClass494_158.method5770(220891668);
      Class18.optionsClosed = false;
   }
}
