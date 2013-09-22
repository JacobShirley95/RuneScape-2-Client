
public class Class350 {

   public static final int anInt_6628 = 4096;
   public static final int anInt_6629 = 32;
   public static final int anInt_6630 = 1;
   public static final int anInt_6631 = 2;
   public static final int anInt_6632 = 8;
   public static final int anInt_6633 = 1048576;
   public static final int anInt_6634 = 128;
   public static final int anInt_6635 = 4;
   public static final int anInt_6636 = 32768;
   public static final int anInt_6637 = 16384;
   public static final int anInt_6638 = 16777216;
   public static final int anInt_6639 = 1024;
   public static final int anInt_6640 = 4096;
   public static final int anInt_6641 = 8192;
   public static final int anInt_6642 = 256;
   public static final int anInt_6643 = 65536;
   public static final int anInt_6644 = 1;
   public static final int anInt_6645 = 16384;
   public static final int anInt_6646 = 32768;
   public static final int anInt_6647 = 4194304;
   public static final int anInt_6648 = 524288;
   public static final int anInt_6649 = 8388608;
   public static final int anInt_6650 = 2097152;
   public static final int anInt_6651 = 8;
   public static final int anInt_6652 = 2048;
   public static final int anInt_6653 = 524288;
   public static final int anInt_6654 = 1048576;
   public static final int anInt_6655 = 2;
   public static final int anInt_6656 = 128;
   public static final int anInt_6657 = 262144;
   public static final int anInt_6658 = 4;
   public static final int anInt_6659 = 512;
   public static final int anInt_6660 = 64;
   public static final int anInt_6661 = 2048;
   public static final int anInt_6662 = 4194304;
   public static final int anInt_6663 = 1024;
   public static final int anInt_6664 = 16;
   public static final int anInt_6665 = 8192;
   public static final int anInt_6666 = 65536;
   public static final int anInt_6667 = 16;
   public static final int anInt_6668 = 131072;
   public static final int anInt_6669 = 262144;
   public static final int anInt_6670 = 8388608;
   public static final int anInt_6671 = 64;
   public static final int anInt_6672 = 131072;
   public static final int anInt_6673 = 2097152;
   public static final int anInt_6674 = 32;
   public static final int anInt_6675 = 33554432;


   Class350() throws Throwable {
      throw new Error();
   }

   static final void method4396(RSInterfaceData var0, byte var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class618.method6611(var3, var4, var0, (byte)12);
   }

   static final void method4397(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class2.method6(var3, var4, var0, (byte)30);
   }

   static final void method4398(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      Class6.method37(var3, var4, var0, 1333843743);
   }

   static final void method4399(RSInterfaceData var0, byte var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var0.aClass68_9508.aByte_1275;
   }

   static final void method4400(RSInterfaceData var0, int var1) {
      if(Class506.aBoolean_9125) {
         Class516[] var2 = Class326.method4017(-376718181);
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var2.length;
      } else {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 0;
      }

   }

   public static int method4401(CharSequence var0, int var1) {
      int var2 = var0.length();
      int var3 = 0;

      for(int var4 = 0; var4 < var2; ++var4) {
         var3 = (var3 << 5) - var3 + Class120.method1515(var0.charAt(var4), -1234775258);
      }

      return var3;
   }

   static final void method4402(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var3.anInt_2569 * 1062321687;
   }
}
