
public class Class540_Sub26 extends Setting {

   public static final int anInt_6532 = 0;
   public static final int anInt_6533 = 1;


   public void method4196(byte var1) {
      if(1 != -2021544293 * this.mode && this.mode * -2021544293 != 0) {
         this.mode = this.method6079((byte)52) * -1389394029;
      }

   }

   public Class540_Sub26(int var1, RenderSettings var2) {
      super(var1, var2);
   }

   int method6082(int var1, int var2) {
      return 1;
   }

   int method6079(byte var1) {
      return 1;
   }

   public int method4199(int var1) {
      return -2021544293 * this.mode;
   }

   void method6081(int var1, int var2) {
      this.mode = var1 * -1389394029;
   }

   public Class540_Sub26(RenderSettings var1) {
      super(var1);
   }

   static final void method4201(int var0) {
      int var1 = 0;
      WorldObjects var2 = client.aClass296_348.getWorldObjects();

      for(int var3 = 0; var3 < client.aClass296_348.getMaxX((byte)-91); ++var3) {
         for(int var4 = 0; var4 < client.aClass296_348.getMaxY(-506425523); ++var4) {
            if(Class335.method4158(var2.tiles, var1, var3, var4, true, 53334501)) {
               ++var1;
            }

            if(var1 >= 512) {
               return;
            }
         }
      }

   }

   static final void method4202(RSInterfaceData var0, byte var1) {
      if(!Class66.method680(2085667859)) {
         Class206.method2615(-410223110);
      }

   }
}
