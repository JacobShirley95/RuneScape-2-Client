
public class Class204 implements Class101 {

   final int anInt_3533;
   final int[] anIntArray_3534;
   final int anInt_3535;
   public static Class455 aClass455_3536;
   static int anInt_3537;
   static WorldMapText aClass198_3538;


   Class204(int var1, int var2, int[] var3) {
      this.anInt_3535 = 2112551043 * var1;
      this.anInt_3533 = var2 * 661213895;
      this.anIntArray_3534 = var3;
   }

   Class204(int var1, int var2) {
      this(var1, var2, new int[var1 * var2]);
   }

   public void method824() {}

   public int method2006() {
      return this.anInt_3535 * 495916587;
   }

   public int method2005() {
      return this.anInt_3533 * 1276366583;
   }

   static boolean method2597(int var0) {
      return Class194.aBoolean_3365;
   }

   static final void method2598(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      Class100.method1298(var3, var0, (byte)-109);
   }

   static final void method2599(RSInterfaceData var0, short var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class557.method6153(var3, var4, var0, (byte)-36);
   }

   public static void method2600(byte var0) {
      if(Class240_Sub36.method4894(1206526086)) {
         Class104_Sub3.method3183(new Class600(), (byte)-65);
      }

   }

   public static void method2601(int var0) {
      Class240_Sub19 var1;
      for(var1 = (Class240_Sub19)Class240_Sub19.aNodeList_7144.getBaseNode_2((byte)100); var1 != null; var1 = (Class240_Sub19)Class240_Sub19.aNodeList_7144.getNext(-2040596497)) {
         if(var1.aBoolean_7163) {
            var1.method4783((byte)111);
         }
      }

      for(var1 = (Class240_Sub19)Class240_Sub19.aNodeList_7178.getBaseNode_2((byte)61); null != var1; var1 = (Class240_Sub19)Class240_Sub19.aNodeList_7178.getNext(-1152937801)) {
         if(var1.aBoolean_7163) {
            var1.method4783((byte)2);
         }
      }

   }

   static boolean method2602(int var0) {
      return Class18.optionCount * -740020991 > 0;
   }
}
