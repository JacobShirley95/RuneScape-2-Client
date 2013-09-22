
public class Class261 {

   Class261() throws Throwable {
      throw new Error();
   }

   static final RSInterfaceData getInterfaceData() {
      if(186392245 * Class556.interfaceDatIndex == Class556.interfaceDataList.size()) {
         Class556.interfaceDataList.add(new RSInterfaceData());
      }

      RSInterfaceData var1 = (RSInterfaceData)Class556.interfaceDataList.get(Class556.interfaceDatIndex * 186392245);
      Class556.interfaceDatIndex += 476864413;
      return var1;
   }

   public static void method3490(Class123 var0, int var1, short var2) {
      Class134.aClass240_Sub41_Sub2_2616.method448((byte)37);
      Class240_Sub41_Sub2 var3 = var0.method1567(939590017);
      if(null != var3) {
         AnimationUnpacker.aClass316_4423.method3899();
         Class134.aClass240_Sub41_Sub2_2616 = var3;
         Class134.aClass240_Sub41_Sub2_2616.method446(var0.method1564((byte)19), false, -136793875);
         Class134.aClass240_Sub41_Sub2_2616.method483(var1, 1875138509);
         if(null != AnimationUnpacker.aClass316_4423) {
            AnimationUnpacker.aClass316_4423.method3912(Class134.aClass240_Sub41_Sub2_2616);
         }

         Class16.method87(1690623497);
      }
   }

   public static GamePack method3491(int var0, byte var1) {
      GamePack[] var2 = Class540_Sub19.method4013((byte)-119);

      for(int var3 = 0; var3 < var2.length; ++var3) {
         GamePack var4 = var2[var3];
         if(-265238991 * var4.anInt_9269 == var0) {
            return var4;
         }
      }

      return null;
   }
}
