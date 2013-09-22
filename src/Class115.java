
public class Class115 {

   public int anInt_2082;
   public int anInt_2083;
   public int anInt_2084;


   static final void method1481(RSInterfaceData var0, byte var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      Class322.method3968(var3, var4, var0, (byte)0);
   }

   static final void method1482(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      Class3.method18(var3, var4, var0, (byte)-25);
   }

   public static int method1483(int var0, int var1, int var2) {
      int var3;
      if(var1 > var0) {
         var3 = var0;
         var0 = var1;
         var1 = var3;
      }

      while(0 != var1) {
         var3 = var0 % var1;
         var0 = var1;
         var1 = var3;
      }

      return var0;
   }
}
