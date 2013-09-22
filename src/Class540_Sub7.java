
public class Class540_Sub7 extends Setting {

   public boolean method1581(int var1) {
      int var2 = this.aClass240_Sub23_9464.method4827((byte)-69).method6111((byte)-10);
      return var2 >= 245;
   }

   public Class540_Sub7(int var1, RenderSettings var2) {
      super(var1, var2);
   }

   public void method1582(int var1) {
      int var2 = this.aClass240_Sub23_9464.method4827((byte)-50).method6111((byte)11);
      if(var2 < 245) {
         this.mode = -1052053887 * Class40.aClass40_878.anInt_873;
      }

      if(Class40.aClass40_876.anInt_873 * 746264091 == this.mode * -2021544293 && var2 < 500) {
         this.mode = -1052053887 * Class40.aClass40_875.anInt_873;
      }

      if(this.mode * -2021544293 < Class40.aClass40_878.anInt_873 * 746264091 || this.mode * -2021544293 > Class40.aClass40_877.anInt_873 * 746264091) {
         this.mode = this.method6079((byte)47) * -1389394029;
      }

   }

   public int method6082(int var1, int var2) {
      int var3 = this.aClass240_Sub23_9464.method4827((byte)-69).method6111((byte)-4);
      return var3 < 245?3:(var1 == 746264091 * Class40.aClass40_876.anInt_873 && var3 < 500?3:1);
   }

   void method6081(int var1, int var2) {
      this.mode = var1 * -1389394029;
   }

   public Class540_Sub7(RenderSettings var1) {
      super(var1);
   }

   int method6079(byte var1) {
      return 746264091 * Class40.aClass40_878.anInt_873;
   }

   public int method1586(int var1) {
      return -2021544293 * this.mode;
   }
}
