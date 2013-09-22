
public class Class540_Sub16 extends Setting {

   public static final int anInt_2607 = 0;
   public static final int anInt_2608 = 1;


   public boolean method1778(int var1) {
      return Class232.notSafeMode(this.aClass240_Sub23_9464.currentToolkit.getToolkitID(), 356052764);
   }

   public Class540_Sub16(int var1, RenderSettings var2) {
      super(var1, var2);
   }

   int method6079(byte var1) {
      return 0;
   }

   void method6081(int var1, int var2) {
      this.mode = var1 * -1389394029;
   }

   public int method6082(int var1, int var2) {
      return !Class232.notSafeMode(this.aClass240_Sub23_9464.currentToolkit.getToolkitID(), 356052764)?3:1;
   }

   public Class540_Sub16(RenderSettings var1) {
      super(var1);
   }

   public void method1782(int var1) {
      if(this.aClass240_Sub23_9464.currentToolkit.method4277(786978523) && !Class232.notSafeMode(this.aClass240_Sub23_9464.currentToolkit.getToolkitID(), 356052764)) {
         this.mode = 0;
      }

      if(-2021544293 * this.mode < 0 || -2021544293 * this.mode > 1) {
         this.mode = this.method6079((byte)16) * -1389394029;
      }

   }

   public int method1783(int var1) {
      return this.mode * -2021544293;
   }

   static boolean method1784(MapIcon var0, int var1) {
      return null == var0?false:(!var0.aBoolean_9977?false:(!var0.method6594(Class248_Sub1.aClass185_4140, Class248_Sub1.aClass184_4108, -1799082115)?false:(Class248_Sub1.aNodeArrayList_6444.getNode((long)(var0.id * 1622352653)) != null?false:Class248_Sub1.aNodeArrayList_6457.getNode((long)(var0.anInt_10004 * 1297612527)) == null)));
   }
}
