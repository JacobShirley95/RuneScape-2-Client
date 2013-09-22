
public class Class423 {

   static final int anInt_8022 = 17;
   static final int anInt_8023 = 3;
   static final int anInt_8024 = 10;
   static final int anInt_8025 = 14;
   static final int anInt_8026 = 11;
   static final int anInt_8027 = 6;
   static final int anInt_8028 = 4;
   static final int anInt_8029 = 5;
   static final int anInt_8030 = 16;
   static final int anInt_8031 = 13;
   static final int anInt_8032 = 15;
   static final int anInt_8033 = 12;
   static final int anInt_8034 = 9;
   static final int anInt_8035 = 7;
   static final int anInt_8036 = 1;
   static final int anInt_8037 = 2;
   static final int anInt_8038 = 8;


   Class423() throws Throwable {
      throw new Error();
   }

   static void method5283(byte[] var0, int var1) {
      ByteArrayDataNode var2 = new ByteArrayDataNode(var0);

      while(true) {
         int var3 = var2.readByte(1590527768);
         if(var3 == 0) {
            return;
         }

         if(1 == var3) {
            int var4 = var2.readShort(-257317096);
            if(-1 == Class217.anInt_3756 * -630832909) {
               Class217.anInt_3756 = var4 * -1504257989;
            }
         }
      }
   }

   static final void method5284(RSInterfaceData var0, int var1) {
      var0.intTypeIndex -= -1416056414;
      int var2 = var0.intTypes[var0.intTypeIndex * -831324111];
      int var3 = var0.intTypes[-831324111 * var0.intTypeIndex + 1];
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class504.method5858(var2, var3, true, 824435656);
   }

   static final void method5285(RSInterfaceData var0, int var1) {
      var0.intTypeIndex -= -1416056414;
      int var2 = var0.intTypes[var0.intTypeIndex * -831324111];
      int var3 = var0.intTypes[var0.intTypeIndex * -831324111 + 1];
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class525.aClass490_9274.method5748(var2, (byte)87).anIntArray_3694[var3];
   }

   static final void method5286(RSInterfaceData var0, short var1) throws Exception_Sub1 {
      var0.intTypeIndex -= -1416056414;
      int var2 = var0.intTypes[-831324111 * var0.intTypeIndex];
      int var3 = var0.intTypes[var0.intTypeIndex * -831324111 + 1];
      GameCoord var4 = GameCoord.createCoord((float)var2, (float)var2, (float)var2);
      if(var4.floatX == -1.0F) {
         var4.floatX = Float.POSITIVE_INFINITY;
      }

      if(-1.0F == var4.floatY) {
         var4.floatY = Float.POSITIVE_INFINITY;
      }

      if(var4.floatZ == -1.0F) {
         var4.floatZ = Float.POSITIVE_INFINITY;
      }

      Class542.aClass43_Sub1_9475.method356(var4, -571044696);
      Class542.aClass43_Sub1_9475.method354((float)var3 / 1000.0F, -1985021459);
      var4.store();
   }

   static final void method5287(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class134.method1786(var3, var4, var0, (byte)126);
   }

   public static void method5288(int var0, int var1) {
      Class240_Sub52_Sub14.anInt_1819 = 475236117 * var0;
      RSInterface.aClass627_2423.method6669(-1147274707);
   }

   static final void method5289(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var3.anInt_2469 * -28225993 == 1?var3.anInt_2416 * 1007149995:-1;
   }
}
