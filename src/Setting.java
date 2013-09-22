
public abstract class Setting {

   protected static final int anInt_9461 = 1;
   protected static final int anInt_9462 = 2;
   public static final int anInt_9463 = 3;
   protected RenderSettings aClass240_Sub23_9464;
   protected int mode;
   public static int anInt_9466;


   Setting(int var1, RenderSettings var2) {
      this.mode = var1 * -1389394029;
      this.aClass240_Sub23_9464 = var2;
   }

   abstract int method6079(byte var1);

   void method6080(int var1, byte var2) {
      if(this.method6082(var1, 1646209849) != 3) {
         this.method6081(var1, 263647135);
      }

   }

   abstract void method6081(int var1, int var2);

   abstract int method6082(int var1, int var2);

   Setting(RenderSettings var1) {
      this.aClass240_Sub23_9464 = var1;
      this.mode = this.method6079((byte)63) * -1389394029;
   }

   static final void method6083(int var0, int var1) {
      Class204.method2601('\uff00');
      int var2 = ((Class187_Sub1)Class104_Sub14.aClass212_Sub1_Sub1_10688.method5503(var0, 824148490)).anInt_10909 * -856758213;
      if(var2 != 0) {
         int var3 = Class240_Sub41_Sub3.aClass23_1024.method2269(Class104_Sub14.aClass212_Sub1_Sub1_10688.method5503(var0, 824148490), -390483690);
         if(5 == var2) {
            client.anInt_458 = var3 * -912271291;
         }

         if(6 == var2) {
            client.anInt_470 = var3 * -132629013;
         }

      }
   }

   public static void method6084(CacheDataUnpacker var0, CacheDataUnpacker var1, CacheDataUnpacker var2, CacheDataUnpacker var3, int var4) {
      Class409_Sub1_Sub1.interfaceUnpacker = var0;
      Class24.aCacheUnpacker_219 = var1;
      Class240_Sub47.imageUnpacker = var2;
      RSInterface.interfaceGroups = new RSInterfaceGroup[Class409_Sub1_Sub1.interfaceUnpacker.method3581((short)363)];
      Class527.loadedInterfaces = new boolean[Class409_Sub1_Sub1.interfaceUnpacker.method3581((short)7711)];
   }
}
