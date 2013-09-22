
public class Class473 implements Class551 {

   static final Class473 aClass473_8703 = new Class473(10, 114);
   static final Class473 aClass473_8704 = new Class473(14, 106);
   static final Class473 aClass473_8705 = new Class473(7, 110);
   static final Class473 aClass473_8706 = new Class473(9, 103);
   static final Class473 aClass473_8707 = new Class473(3, 104);
   final int anInt_8708;
   static final Class473 aClass473_8709 = new Class473(5, 101);
   static final Class473 aClass473_8710 = new Class473(13, 107);
   static final Class473 aClass473_8711 = new Class473(2, 108);
   static final Class473 aClass473_8712 = new Class473(0, 109);
   static final Class473 aClass473_8713 = new Class473(11, 100);
   static final Class473 aClass473_8714 = new Class473(8, 111);
   static final Class473 aClass473_8715 = new Class473(12, 112);
   static final Class473 aClass473_8716 = new Class473(6, 113);
   static final Class473 aClass473_8717 = new Class473(4, 105);
   static final Class473 aClass473_8718 = new Class473(1, 102);
   final int anInt_8719;


   Class473(int var1, int var2) {
      this.anInt_8708 = -33020701 * var1;
      this.anInt_8719 = var2 * 1988009615;
   }

   public int getLanguageID(int var1) {
      return this.anInt_8719 * 1811071087;
   }

   public static Class531 method5660(int var0) {
      return null == Class3.aClass531_25?Class531.aClass531_9324:Class3.aClass531_25;
   }

   static final void method5661(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class525.method5991(var3, var4, var0, 764505002);
   }

   static final void method5662(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class544.method6095(var3, var4, var0, (short)-2967);
   }

   static final void method5663(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = -533669195 * var3.width;
   }

   public static RSInterfaceGroup loadInterfaceGroup(int cacheID, int[] var1, RSInterfaceGroup var2, boolean var3, int var4) {
      if(!Class409_Sub1_Sub1.interfaceUnpacker.method3571(cacheID, -1501903808)) {
         return null;
      } else {
         int var5 = Class409_Sub1_Sub1.interfaceUnpacker.method3575(cacheID, -1808314963);
         RSInterface[] var6;
         if(var5 == 0) {
            var6 = new RSInterface[0];
         } else if(null == var2) {
            var6 = new RSInterface[var5];
         } else {
            var6 = var2.interfaceArray;
         }

         if(null == var2) {
            var2 = new RSInterfaceGroup(var3, var6);
         } else {
            var2.interfaceArray = var6;
            var2.aBoolean_2054 = var3;
         }

         for(int var7 = 0; var7 < var5; ++var7) {
            if(var2.interfaceArray[var7] == null) {
               byte[] var8 = Class409_Sub1_Sub1.interfaceUnpacker.getDataBytes(cacheID, var7, var1, -1777319124);
               if(null != var8) {
                  RSInterface var9 = var2.interfaceArray[var7] = new RSInterface();
                  var9.cacheID = ((cacheID << 16) + var7) * -1557453223;
                  var9.load(new ByteArrayDataNode(var8), -1819851557);
               }
            }
         }

         return var2;
      }
   }
}
