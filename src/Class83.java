
public class Class83 {

   static final Class83 aClass83_1626 = new Class83();
   static final Class83 aClass83_1627 = new Class83();
   static final Class83 aClass83_1628 = new Class83();


   public static void method1089(int var0) {
      RandomAccessFileNode var1 = null;

      try {
         var1 = Class240_Sub22_Sub17.getPreferencesFile("", client.currentGamePack.gameID, true, (byte)-32);
         ByteArrayDataNode var2 = Class104_Sub21.renderSettings.compileRenderSettings(-563866040);
         var1.writeData(var2.data, 0, 964952859 * var2.index, (byte)4);
      } catch (Exception var4) {
         ;
      }

      try {
         if(var1 != null) {
            var1.closeRAFile((byte)-28);
         }
      } catch (Exception var3) {
         ;
      }

   }

   static int method1090(int var0) {
      return (Class109.anInt_2043 += 434469867) * -239283005 - 1;
   }

   static final void method1091(RSInterfaceData var0, int var1) {
      var0.longTypeIndex -= 2117648622;
      if(var0.aLongArray_9519[973044039 * var0.longTypeIndex + 1] == var0.aLongArray_9519[973044039 * var0.longTypeIndex]) {
         var0.anInt_9510 += -1856838429 * var0.anIntArray_9518[var0.anInt_9510 * -1756266293];
      }

   }

   static final void method1092(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, byte var3) {
      var0.method1715(-1984987761);
   }

   static final void method1093(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class592.cacheObjectLoader.getObjectDescriptor(var2).anInt_8508 * -156734053;
   }

   static final void method1094(RSInterfaceData var0, byte var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class317.method3923(var3, var4, var0, (byte)1);
   }
}
