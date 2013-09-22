
public class Class613 {

   public static int serverCount;
   static final int anInt_9954 = 1;
   static final int anInt_9955 = -1;
   static boolean aBoolean_9956 = false;
   static final int anInt_9957 = 2;
   static RSWorld[] worldArray;
   public static int maxServers;


   Class613() throws Throwable {
      throw new Error();
   }

   static final void method6578(RSInterfaceData var0, int var1) {
      var0.intTypeIndex -= -1416056414;
      int var2 = var0.intTypes[var0.intTypeIndex * -831324111];
      int var3 = var0.intTypes[-831324111 * var0.intTypeIndex + 1];
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class534.aClass275_9439.method3606(var2, -1435998940).anIntArray_3542[var3];
   }

   static final void method6579(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var0.aClass563_Sub1_Sub2_Sub1_9512.getHeight();
   }

   static final void method6580(RSInterfaceData var0, short var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 1854782309 * client.anInt_468;
   }

   static void method6581(int var0, int var1) {
      for(NodeListNode var2 = client.aNodeArrayList_521.start(); null != var2; var2 = client.aNodeArrayList_521.next()) {
         if((var2.id * 4058728944299054175L >> 48 & 65535L) == (long)var0) {
            var2.shiftNext();
         }
      }

   }
}
