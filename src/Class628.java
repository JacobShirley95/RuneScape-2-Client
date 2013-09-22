
public class Class628 {

   public static final int anInt_10056 = 8;
   public static final int anInt_10057 = 2;
   public static final int anInt_10058 = 1;
   final short[] aShortArray_10059;
   public static final int anInt_10060 = 16;
   final byte aByte_10061;
   final short[] aShortArray_10062;
   final short aShort_10063;
   final short aShort_10064;
   final short aShort_10065;
   final short aShort_10066;
   final int[] anIntArray_10067;
   final int[] anIntArray_10068;
   final byte aByte_10069;
   final int[] anIntArray_10070;
   public static final int anInt_10071 = 4;
   final short[] aShortArray_10072;


   Class628(WorldObjects var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15) {
      this.aByte_10061 = (byte)var2;
      this.aByte_10069 = (byte)var3;
      this.anIntArray_10067 = new int[4];
      this.anIntArray_10068 = new int[4];
      this.anIntArray_10070 = new int[4];
      this.anIntArray_10067[0] = var4;
      this.anIntArray_10067[1] = var5;
      this.anIntArray_10067[2] = var6;
      this.anIntArray_10067[3] = var7;
      this.anIntArray_10068[0] = var8;
      this.anIntArray_10068[1] = var9;
      this.anIntArray_10068[2] = var10;
      this.anIntArray_10068[3] = var11;
      this.anIntArray_10070[0] = var12;
      this.anIntArray_10070[1] = var13;
      this.anIntArray_10070[2] = var14;
      this.anIntArray_10070[3] = var15;
      this.aShort_10063 = (short)(var4 >> var1.shiftAmount * 725150473);
      this.aShort_10064 = (short)(var6 >> 725150473 * var1.shiftAmount);
      this.aShort_10065 = (short)(var12 >> 725150473 * var1.shiftAmount);
      this.aShort_10066 = (short)(var14 >> var1.shiftAmount * 725150473);
      this.aShortArray_10062 = new short[4];
      this.aShortArray_10059 = new short[4];
      this.aShortArray_10072 = new short[4];
   }

   static final void method6685(RSInterfaceData var0, byte var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      if(0 != client.anInt_567 * -826987519 && var2 < client.ignoreListCount * -275736435) {
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = client.ignoreList[var2].aString_113;
      } else {
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = "";
      }

   }

   static final void method6686(RSInterfaceData var0, byte var1) {
      MapOverviewNode var2 = Class248.method3157(var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111]);
      if(null != var2 && var2.areaName != null) {
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = var2.areaName;
      } else {
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = "";
      }

   }

   static final void method6687(RSInterfaceData var0, byte var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class104_Sub21.renderSettings.aClass540_Sub7_7291.method1581(-1189724472)?1:0;
   }
}
