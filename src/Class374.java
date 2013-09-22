
public class Class374 implements Class551 {

   public static final Class374 aClass374_7121 = new Class374(2);
   public static final Class374 aClass374_7122 = new Class374(1);
   final int anInt_7123;
   public static final Class374 aClass374_7124 = new Class374(0);
   static int nameIconsCount;


   Class374(int var1) {
      this.anInt_7123 = var1 * 1188606923;
   }

   public int getLanguageID(int var1) {
      return this.anInt_7123 * 824531427;
   }

   public static Class225 method4755(int var0, int var1, int var2, int var3, int var4, int var5) {
      return Class271.method3556(var0, var1, var2, var3, false, var4, -708028207);
   }

   static final void method4756(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var0.anIntArray_9518[var0.anInt_9510 * -1756266293];
   }

   static final void method4757(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, int var3) {
      var0.aBoolean_2472 = var2.intTypes[(var2.intTypeIndex -= -708028207) * -831324111] == 1;
      Class110_Sub1.method3149(var0, 1788551340);
   }

   static final void method4758(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, int var3) {
      var0.aBoolean_2468 = var2.intTypes[(var2.intTypeIndex -= -708028207) * -831324111] == 1;
      Class110_Sub1.method3149(var0, 1844273369);
      if(-1 == -1001687885 * var0.anInt_2428 && !var1.aBoolean_2054) {
         NodeListNode.method3095(1278853609 * var0.cacheID, 2098757225);
      }

   }

   static final void method4759(RSInterfaceData var0, byte var1) {
      if(1201203591 * Class494.aClass240_Sub15_9037.anInt_6873 < 6) {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 0;
      } else if(Class494.aClass240_Sub15_9037.anInt_6873 * 1201203591 == 6 && Class494.aClass240_Sub15_9037.anInt_6875 * 1272691903 < 10) {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 0;
      } else {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 1;
      }

   }

   static final void method4760(RSInterfaceData var0, byte var1) {
      var0.intTypeIndex -= -2124084621;
      int var2 = var0.intTypes[var0.intTypeIndex * -831324111];
      int var3 = var0.intTypes[-831324111 * var0.intTypeIndex + 1];
      int var4 = var0.intTypes[var0.intTypeIndex * -831324111 + 2];
      RSInterface var5 = DrawingTarget.method2201(var2 << 16 | var3, var4, (byte)123);
      Class537.method6073(714433728);
      Class240_Sub49 var6 = client.method174(var5);
      Class210.method2656(var5, var6.method4993((byte)120), var6.anInt_7701 * -13045859, (byte)-1);
   }

   static void method4761(int var0, int var1, int var2, Class240_Sub36 var3, byte var4) {
      long var5 = (long)(var0 << 28 | var2 << 14 | var1);
      Class240_Sub25 var7 = (Class240_Sub25)client.groundItems.getNode(var5);
      if(null == var7) {
         var7 = new Class240_Sub25();
         client.groundItems.insert(var7, var5);
         var7.itemList.addNode(var3, (short)-24302);
      } else {
         ObjectDescriptor var8 = Class592.cacheObjectLoader.getObjectDescriptor(var3.id * 1665912711);
         int var9 = -840435819 * var8.anInt_8469;
         if(1 == 1279665793 * var8.anInt_8467) {
            var9 *= -557533247 * var3.anInt_7496 + 1;
         }

         for(Class240_Sub36 var10 = (Class240_Sub36)var7.itemList.getBaseNode_2((byte)76); var10 != null; var10 = (Class240_Sub36)var7.itemList.getNext(-994877354)) {
            var8 = Class592.cacheObjectLoader.getObjectDescriptor(1665912711 * var10.id);
            int var11 = -840435819 * var8.anInt_8469;
            if(1 == 1279665793 * var8.anInt_8467) {
               var11 *= 1 + var10.anInt_7496 * -557533247;
            }

            if(var9 > var11) {
               Class592.method6419(var3, var10, 1509339319);
               return;
            }
         }

         var7.itemList.addNode(var3, (short)-16818);
      }
   }
}
