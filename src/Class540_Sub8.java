
public class Class540_Sub8 extends Setting {

   public static final int anInt_2360 = 0;
   public static final int anInt_2361 = 1;
   public static final int anInt_2362 = 3;
   static final int anInt_2363 = 2;
   public static final int anInt_2364 = 4;


   public int method1620(int var1) {
      return this.mode * -2021544293;
   }

   public void method1621(int var1) {
      if(this.mode * -2021544293 < 0 || -2021544293 * this.mode > 4 || this.mode * -2021544293 == 2) {
         this.mode = this.method6079((byte)33) * -1389394029;
      }

   }

   public Class540_Sub8(RenderSettings var1) {
      super(var1);
   }

   int method6082(int var1, int var2) {
      return 1;
   }

   void method6081(int var1, int var2) {
      this.mode = var1 * -1389394029;
   }

   int method6079(byte var1) {
      return 0;
   }

   public Class540_Sub8(int var1, RenderSettings var2) {
      super(var1, var2);
   }

   static final void method1625(RSInterfaceData var0, int var1) {
      boolean var2 = true;
      if(client.aBoolean_452) {
         try {
            Object var3 = Class332.aClass332_6419.method4110((byte)-6);
            if(var3 != null) {
               var2 = ((Boolean)var3).booleanValue();
            }
         } catch (Throwable var4) {
            ;
         }
      }

      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var2?1:0;
   }
}
