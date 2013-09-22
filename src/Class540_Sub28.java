
public class Class540_Sub28 extends Setting {

   public static CacheDataUnpacker aCacheUnpacker_6563;


   public Class540_Sub28(int var1, RenderSettings var2) {
      super(var1, var2);
   }

   public int method4269(int var1) {
      return -2021544293 * this.mode;
   }

   int method6082(int var1, int var2) {
      return 1;
   }

   void method6081(int var1, int var2) {
      this.mode = -1389394029 * var1;
   }

   public Class540_Sub28(RenderSettings var1) {
      super(var1);
   }

   int method6079(byte var1) {
      return 798041355 * Class50.aClass50_1046.anInt_1048;
   }

   public void method4273(int var1) {
      if(-2021544293 * this.mode < 798041355 * Class50.aClass50_1046.anInt_1048 || -2021544293 * this.mode > 798041355 * Class50.aClass50_1045.anInt_1048) {
         this.mode = this.method6079((byte)55) * -1389394029;
      }

   }

   static final void method4274(RSInterfaceData var0, byte var1) {
      if(Class506.aBoolean_9125 && Class102.aFrame_1967 != null) {
         Class522.method5974(Class104_Sub21.renderSettings.aClass540_Sub13_7311.method1694(783234315), -1, -1, false, -1534999631);
      }

      String var2 = (String)var0.stringData[(var0.stringDataIndex -= -1828074049) * 863838783];
      boolean var3 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111] == 1;
      String var4 = CacheObjectLoader.method5585(-2076392331) + var2;
      Class167.method2082(var4, var3, client.aBoolean_285, (byte)0);
   }

   static final void method4275(RSInterfaceData var0, byte var1) {
      if(Class223.captureKeyboardList.method3208(81, 1953407658)) {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 1;
      } else {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 0;
      }

   }

   static final void method4276(RSInterfaceData var0, int var1) {
      Class240_Sub12 var2 = Class8.method47(1096046746);
      if(null == var2) {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = -1;
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = -1;
      } else {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var2.anInt_6801 * 781228131;
         int var3 = 196197751 * var2.anInt_6804 << 28 | var2.anInt_6802 * -1889789653 + Class248.anInt_4120 << 14 | var2.anInt_6803 * -526841819 + Class248.anInt_4124;
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var3;
      }

   }
}
