
public class Class540_Sub1 extends Setting {

   public static final int anInt_2039 = 0;
   public static final int anInt_2040 = 1;


   public Class540_Sub1(int var1, RenderSettings var2) {
      super(var1, var2);
   }

   public boolean method1399(int var1) {
      return this.aClass240_Sub23_9464.method4825(-1689950294) == GamePack.runescapePack;
   }

   public int method6082(int var1, int var2) {
      if(this.aClass240_Sub23_9464.method4825(-8903128) == GamePack.runescapePack) {
         if(var1 == 0) {
            if(this.aClass240_Sub23_9464.aClass540_Sub31_7321.method4379(-831324111) == 1) {
               return 2;
            }

            if(this.aClass240_Sub23_9464.aClass540_Sub17_7299.method3986(1841539047) == 1) {
               return 2;
            }

            if(this.aClass240_Sub23_9464.aClass540_Sub22_7310.method4061(-1467325533) > 0) {
               return 2;
            }
         }

         return 1;
      } else {
         return 3;
      }
   }

   void method6081(int var1, int var2) {
      this.mode = var1 * -1389394029;
   }

   public int method1402(byte var1) {
      return this.mode * -2021544293;
   }

   public Class540_Sub1(RenderSettings var1) {
      super(var1);
   }

   int method6079(byte var1) {
      return 1;
   }

   public void method1404(int var1) {
      if(this.aClass240_Sub23_9464.method4825(128579758) != GamePack.runescapePack) {
         this.mode = -1389394029;
      }

      if(this.mode * -2021544293 != 0 && 1 != this.mode * -2021544293) {
         this.mode = this.method6079((byte)53) * -1389394029;
      }

   }

   static final void method1405(RSInterfaceData var0, byte var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      ScreenCharText.method3930(var3, var4, var0, (byte)2);
   }
}
