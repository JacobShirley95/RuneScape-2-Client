
public class Class129 {

   byte[] aByteArray_2386;
   int anInt_2387;
   public static int visibleTilesY;


   int method1663(int var1) {
      short var2 = 0;

      for(int var3 = 0; var3 < 2; ++var3) {
         var2 = (short)(var2 | (this.aByteArray_2386[(this.anInt_2387 += 1605371091) * 1484714843 - 1] & 255) << var3 * 8);
      }

      return var2;
   }

   Class129(byte[] var1) {
      this.aByteArray_2386 = var1;
      this.anInt_2387 = 0;
   }

   String method1664(int var1) {
      int var2 = this.method1663(-1611443095);
      if(var2 == -1) {
         return null;
      } else if(var2 > 256) {
         throw new RuntimeException_Sub1();
      } else {
         String var3 = new String(this.aByteArray_2386, this.anInt_2387 * 1484714843, var2);
         this.anInt_2387 += 1605371091 * var2;
         return var3;
      }
   }

   public static void method1665(Class225 var0, int var1) {
      if(var0.aClass240_Sub41_Sub5_3867 != null) {
         Class217.aClass240_Sub41_Sub4_3757.method531(var0.aClass240_Sub41_Sub5_3867);
      } else {
         var0.anInt_3871 = Integer.MIN_VALUE;
      }

   }

   static void method1666(byte var0) {
      for(OptionListNode var1 = (OptionListNode)Class18.optionNodeList.getBaseNode_2((byte)1); var1 != null; var1 = (OptionListNode)Class18.optionNodeList.getNext(-322571387)) {
         if(Class500.method5835(var1.action * -533194375, (byte)92)) {
            Class582.method6326(var1, 43435313);
         }
      }

   }

   static final void method1667(RSInterfaceData var0, byte var1) {
      var0.stringDataIndex -= 638819198;
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class476.compareStrings((String)var0.stringData[var0.stringDataIndex * 863838783], (String)var0.stringData[var0.stringDataIndex * 863838783 + 1], Class599.clientLanguage, 1624141830);
   }

   static final void method1668(RSInterfaceData var0, byte var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class232.anInt_3986 * 1360095729;
   }

   static final void method1669(int var0, int[] var1, byte var2) {
      if(Class24.method149(var0, var1, 1812358334)) {
         RSInterface[] var3 = RSInterface.interfaceGroups[var0].interfaceArray;

         for(int var4 = 0; var4 < var3.length; ++var4) {
            RSInterface var5 = var3[var4];
            if(var5 != null && null != var5.aClass507_2578) {
               var5.aClass507_2578.method5881((byte)95);
            }
         }

      }
   }

   static final void method1670(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var0.aClass240_Sub47_9501.aByte_7659;
   }
}
