
public class Class15 {

   static byte[] aByteArray_121 = new byte[2048];
   static final int anInt_122 = 1;
   public static int availablePlayers = 0;
   static byte[] aByteArray_124 = new byte[2048];
   static int anInt_125 = 0;
   static ByteArrayDataNode[] aClass240_Sub8Array_126 = new ByteArrayDataNode[2048];
   static int[] playersIndices = new int[2048];
   static final int anInt_128 = 2;
   static int[] anIntArray_129 = new int[2048];
   static Class21[] aClass21Array_130 = new Class21[2048];
   static int anInt_131 = 0;
   static int[] anIntArray_132 = new int[2048];
   public static Class316 aClass316_133;


   Class15() throws Throwable {
      throw new Error();
   }

   static Class29 method82(int var0, int var1) {
      return var0 == -549618557 * Class29.aClass29_805.anInt_802?Class29.aClass29_805:(var0 == Class29.aClass29_803.anInt_802 * -549618557?Class29.aClass29_803:(-549618557 * Class29.aClass29_804.anInt_802 == var0?Class29.aClass29_804:null));
   }

   static final void method83(RSInterfaceData var0, int var1) {
      var0.stringDataIndex -= 638819198;
      String var2 = (String)var0.stringData[863838783 * var0.stringDataIndex];
      String var3 = (String)var0.stringData[1 + 863838783 * var0.stringDataIndex];
      if(var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111] == 1) {
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = var2;
      } else {
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = var3;
      }

   }

   static final void method84(RSInterfaceData var0, int var1) {
      Class332.aClass332_6421.method4108((byte)-98);
   }

   static void method85(ByteArrayDataNode var0, int var1, int var2) {
      if(null != ClientSuper.randomDataFile) {
         try {
            ClientSuper.randomDataFile.seek(0L);
            ClientSuper.randomDataFile.storeData(var0.data, var1, 24, 1591275270);
         } catch (Exception var4) {
            ;
         }
      }

   }

   static final void method86(RSInterfaceData var0, int var1) {
      if(Class506.aBoolean_9125 && null != Class102.aFrame_1967) {
         Class522.method5974(Class104_Sub21.renderSettings.aClass540_Sub13_7311.method1694(783234315), -1, -1, false, -2134375236);
      }

   }
}
