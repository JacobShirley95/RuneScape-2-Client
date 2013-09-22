
public class Class240_Sub36 extends NodeListNode {

   int anInt_7496;
   public int id;


   Class240_Sub36(int var1, int var2) {
      this.id = -80951753 * var1;
      this.anInt_7496 = var2 * 295917633;
   }

   public static boolean method4894(int var0) {
      try {
         if(!IcmpService_Sub1.available()) {
            return false;
         }
      } catch (Throwable var2) {
         return false;
      }

      if(IcmpService_Sub1.anIcmpService_Sub1_7119 != null) {
         throw new IllegalStateException("");
      } else {
         IcmpService_Sub1.anIcmpService_Sub1_7119 = new IcmpService_Sub1();
         Thread var1 = new Thread(new Class560());
         var1.setDaemon(true);
         var1.start();
         return true;
      }
   }

   static final void method4895(RSInterfaceData var0, byte var1) {
      var0.intTypeIndex -= 754826261;
      Class271.method3556(var0.intTypes[var0.intTypeIndex * -831324111], var0.intTypes[1 + -831324111 * var0.intTypeIndex], var0.intTypes[2 + var0.intTypeIndex * -831324111], var0.intTypes[-831324111 * var0.intTypeIndex + 3], false, var0.intTypes[var0.intTypeIndex * -831324111 + 4], -708028207);
   }
}
