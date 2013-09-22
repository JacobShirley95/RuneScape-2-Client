import java.util.Stack;

public class Class268 {

   boolean aBoolean_4642;
   public Class563_Sub1 aClass563_Sub1_4643;
   static Stack aStack_4644 = new Stack();
   Class636 aClass636_4645;
   public static Class586 aClass586_4646;


   public boolean method3529(Renderer var1, int var2, int var3, byte var4) {
      int var5 = this.aClass563_Sub1_4643.method4730(-188601243);
      if(null != this.aClass563_Sub1_4643.aClass92Array_6938) {
         for(int var6 = 0; var6 < this.aClass563_Sub1_4643.aClass92Array_6938.length; ++var6) {
            this.aClass563_Sub1_4643.aClass92Array_6938[var6].anInt_1831 <<= var5;
            if(this.aClass563_Sub1_4643.aClass92Array_6938[var6].method1207(886234521 * this.aClass636_4645.anInt_10101 + var2, var3 + -1245270881 * this.aClass636_4645.anInt_10103) && this.aClass563_Sub1_4643.method4729(var1, var2, var3, (byte)0)) {
               this.aClass563_Sub1_4643.aClass92Array_6938[var6].anInt_1831 >>= var5;
               return true;
            }

            this.aClass563_Sub1_4643.aClass92Array_6938[var6].anInt_1831 >>= var5;
         }
      }

      return false;
   }

   public static void method3530(Class502_Sub1 var0, int var1) {
      Class110.method1412(var0, 1537146665);
   }

   static final void method3531(RSInterfaceData var0, byte var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class603.method6508(var3, var4, var0, -1729134649);
   }

   public static int method3532(int var0, boolean var1, int var2) {
      if(var1) {
         return 0;
      } else {
         Class240_Sub46 var3 = Class416.method5153(var0, var1, (byte)-11);
         if(var3 == null) {
            return Class45.aClass432_960.method5411(var0, -419957348).anInt_8436 * 1902522835;
         } else {
            int var4 = 0;

            for(int var5 = 0; var5 < var3.anIntArray_7650.length; ++var5) {
               if(-1 == var3.anIntArray_7650[var5]) {
                  ++var4;
               }
            }

            var4 += Class45.aClass432_960.method5411(var0, -419957348).anInt_8436 * 1902522835 - var3.anIntArray_7650.length;
            return var4;
         }
      }
   }

   public static void method3533(int var0, int var1, int var2, Class534 var3, int var4) {
      for(Class240_Sub19 var5 = (Class240_Sub19)Class240_Sub19.aNodeList_7144.getBaseNode_2((byte)95); null != var5; var5 = (Class240_Sub19)Class240_Sub19.aNodeList_7144.getNext(-942638207)) {
         if(var0 == -1022915843 * var5.anInt_7147 && var1 << 9 == -322426997 * var5.anInt_7148 && var5.anInt_7149 * -787252293 == var2 << 9 && 2043792579 * var3.anInt_9367 == var5.aClass534_7157.anInt_9367 * 2043792579) {
            if(null != var5.aClass240_Sub41_Sub5_7170) {
               Class217.aClass240_Sub41_Sub4_3757.method531(var5.aClass240_Sub41_Sub5_7170);
               var5.aClass240_Sub41_Sub5_7170 = null;
            }

            if(var5.aClass240_Sub41_Sub5_7143 != null) {
               Class217.aClass240_Sub41_Sub4_3757.method531(var5.aClass240_Sub41_Sub5_7143);
               var5.aClass240_Sub41_Sub5_7143 = null;
            }

            var5.shiftNext();
            return;
         }
      }

   }
}
