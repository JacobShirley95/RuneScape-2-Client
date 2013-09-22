
public class Class540_Sub27 extends Setting {

   public static final int anInt_6554 = 0;
   static final int anInt_6555 = 2;


   public Class540_Sub27(int var1, RenderSettings var2) {
      super(var1, var2);
   }

   int method6079(byte var1) {
      return 0;
   }

   public int method4256(int var1) {
      return this.mode * -2021544293;
   }

   void method6081(int var1, int var2) {
      this.mode = var1 * -1389394029;
   }

   public boolean method4258(byte var1) {
      return Class232.notSafeMode(this.aClass240_Sub23_9464.currentToolkit.getToolkitID(), 356052764);
   }

   public Class540_Sub27(RenderSettings var1) {
      super(var1);
   }

   public void method4259(byte var1) {
      if(this.aClass240_Sub23_9464.currentToolkit.method4277(1577565734) && !Class232.notSafeMode(this.aClass240_Sub23_9464.currentToolkit.getToolkitID(), 356052764)) {
         this.mode = 0;
      }

      if(this.mode * -2021544293 < 0 || this.mode * -2021544293 > 2) {
         this.mode = this.method6079((byte)84) * -1389394029;
      }

   }

   public int method6082(int var1, int var2) {
      return !Class232.notSafeMode(this.aClass240_Sub23_9464.currentToolkit.getToolkitID(), 356052764)?3:1;
   }

   static final void method4261(RSInterfaceData var0, int var1) {
      var0.aLongArray_9519[(var0.longTypeIndex += -1088659337) * 973044039 - 1] = var0.aLongArray_9494[var0.anIntArray_9518[var0.anInt_9510 * -1756266293]];
   }

   static void method4262(int var0) {
      Class11.clientServerHandler.init((byte)-29);
      Class11.clientServerHandler.serverDataNode.index = 0;
      Class11.clientServerHandler.aClass428_3448 = null;
      Class11.clientServerHandler.aClass428_3434 = null;
      Class11.clientServerHandler.aClass428_3451 = null;
      Class11.clientServerHandler.aClass428_3446 = null;
      Class11.clientServerHandler.anInt_3450 = 0;
      Class11.clientServerHandler.anInt_3444 = 0;
      client.anInt_450 = 0;
      Class297.method3799(-896035087);
      Class529.method6024(1543413435);

      int var1;
      for(var1 = 0; var1 < 2048; ++var1) {
         client.aPlayerArray[var1] = null;
      }

      Class521.myPlayer = null;

      for(var1 = 0; var1 < 1910301187 * client.anInt_334; ++var1) {
         RSCharacter var2 = (RSCharacter)client.aClass240_Sub9Array_271[var1].anObject_6783;
         if(var2 != null) {
            var2.anInt_4312 = 1835832949;
         }
      }

      Class440.method5459((byte)-5);
      Plane.method2165(AbstractCacheData.method4679(647514803), (byte)115);
      Class418.method5190(6, (byte)-41);

      for(var1 = 0; var1 < 112; ++var1) {
         client.aBooleanArray_525[var1] = true;
      }

      Class271.method3559(239300538);
      Class113.currentServer = null;
      Class568.aLong_9632 = 0L;
      Class100.method1294(1965783498);
      Class267.preferenceFileList.method7715((byte)2);
   }
}
