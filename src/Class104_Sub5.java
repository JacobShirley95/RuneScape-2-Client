import java.util.Stack;

public class Class104_Sub5 extends CharTask {

   final int anInt_4357;
   final int anInt_4358;
   static int anInt_4359;


   Class104_Sub5(ByteArrayDataNode var1) {
      super(var1);
      this.anInt_4358 = var1.readShort(156747381) * 677407355;
      this.anInt_4357 = var1.readByte(431020746) * 631814713;
   }

   public void execute() {
      Class210.method2652(this.anInt_4358 * -1522473805, 0, -693300215 * this.anInt_4357, 819331335);
   }

   public static void method3284(int var0, short var1) {
      Class134.aClass240_Sub41_Sub2_2616.method443(var0 >> 8, 1741147641);
   }

   static final void method3285(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, int var3) {
      var2.intTypeIndex -= -1416056414;
      int var4 = var2.intTypes[var2.intTypeIndex * -831324111];
      int var5 = var2.intTypes[1 + -831324111 * var2.intTypeIndex];
      if(-1 == var4 && var5 == -1) {
         var0.aClass132_2519 = null;
      } else {
         var0.aClass132_2519 = DrawingTarget.method2201(var4, var5, (byte)72);
      }

   }

   public static Class268 method3286(boolean var0, int var1) {
      Stack var2 = Class268.aStack_4644;
      synchronized(Class268.aStack_4644) {
         Class268 var3;
         if(Class268.aStack_4644.isEmpty()) {
            var3 = new Class268();
         } else {
            var3 = (Class268)Class268.aStack_4644.pop();
         }

         var3.aBoolean_4642 = var0;
         return var3;
      }
   }
}
