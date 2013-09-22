
public class Class540_Sub29 extends Setting {

   public boolean aBoolean_6564 = false;
   boolean aBoolean_6565 = true;


   boolean method4277(int var1) {
      return this.aBoolean_6565;
   }

   public Class540_Sub29(int var1, RenderSettings var2) {
      super(var1, var2);
   }

   public void method4278(byte var1) {
      if(-2021544293 * this.mode < 0 || this.mode * -2021544293 > 5 || this.mode * -2021544293 == 2) {
         this.mode = this.method6079((byte)33) * -1389394029;
      }

   }

   public Class540_Sub29(RenderSettings var1) {
      super(var1);
   }

   public boolean method4279(int var1) {
      return true;
   }

   public int method6082(int var1, int var2) {
      return var1 == 3 && !Class183.getLibLoader(279104792).method3805("jagdx", (byte)125)?3:2;
   }

   void method6081(int var1, int var2) {
      this.aBoolean_6564 = false;
      this.mode = var1 * -1389394029;
   }

   int method6079(byte var1) {
      this.aBoolean_6564 = true;
      return this.aClass240_Sub23_9464.method4827((byte)-92).method6110((byte)-87)?3:1;
   }

   public void method4283(boolean var1, byte var2) {
      this.aBoolean_6565 = var1;
   }

   public int getToolkitID() {
      return this.mode * -2021544293;
   }

   static final void method4285(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      Class401.method4966(var3, var0, 2107315950);
   }
}
