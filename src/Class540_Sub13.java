
public class Class540_Sub13 extends Setting {

   static Sprite[] prayIconSprites;
   public static final int anInt_2396 = 2;
   public static final int anInt_2397 = 3;
   public static final int anInt_2398 = 1;


   public Class540_Sub13(RenderSettings var1) {
      super(var1);
   }

   public Class540_Sub13(int var1, RenderSettings var2) {
      super(var1, var2);
   }

   int method6079(byte var1) {
      return this.aClass240_Sub23_9464.method4827((byte)-92).method6113(412361946)?3:2;
   }

   public void method1692(byte var1) {
      if(-2021544293 * this.mode < 1 || -2021544293 * this.mode > 3) {
         this.mode = this.method6079((byte)117) * -1389394029;
      }

   }

   void method6081(int var1, int var2) {
      this.mode = -1389394029 * var1;
   }

   public int method1694(int var1) {
      return this.mode * -2021544293;
   }

   int method6082(int var1, int var2) {
      return 1;
   }

   static final void method1696(RSInterfaceData var0, byte var1) throws Exception_Sub1 {
      Class542.aClass43_Sub1_9475.method388((float)var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111] / 1000.0F, 16711935);
   }
}
