
public class Class58 {

   final Class96 aClass96_1104;
   CacheNodeArrayList aClass627_1105 = new CacheNodeArrayList(6291456, 256);
   final Renderer_Sub3 aRenderer_Sub3_1106;


   void method564() {
      this.aClass627_1105.method6669(-639724345);
   }

   Class384 method565(Class183 var1) {
      return this.method568(var1, var1.anInt_3112 * -1446355517);
   }

   boolean method566(Class183 var1, int var2) {
      if(var2 == -1) {
         var2 = var1.anInt_3112 * -1446355517;
      }

      return var1.aBoolean_3141 && this.aRenderer_Sub3_1106.method1989()?this.aClass96_1104.method1263(var1.anInt_3146 * -534969509, Class610.aClass610_9946, 0.7F, var2, var2, false, (byte)63):(var1.aClass620_3153 != Class620.aClass620_10022 && Class21.method126(var1.aByte_3169, (byte)55)?this.aClass96_1104.method1263(var1.anInt_3146 * -534969509, Class610.aClass610_9944, 0.7F, var2, var2, true, (byte)31):this.aClass96_1104.method1263(var1.anInt_3146 * -534969509, Class610.aClass610_9945, 0.7F, var2, var2, false, (byte)46));
   }

   void method567() {
      this.aClass627_1105.method6677(5, -2023491803);
   }

   Class384 method568(Class183 var1, int var2) {
      long var3 = (long)(var2 << 16 | var1.anInt_3146 * -534969509);
      Class384 var5 = (Class384)this.aClass627_1105.getObject(var3);
      if(var5 != null) {
         return var5;
      } else if(!this.method566(var1, var2)) {
         return null;
      } else {
         if(var2 == -1) {
            var2 = var1.anInt_3112 * -1446355517;
         }

         Class384 var7;
         if(var1.aBoolean_3141 && this.aRenderer_Sub3_1106.method1989()) {
            float[] var8 = this.aClass96_1104.method1253(var1.anInt_3146 * -534969509, 0.7F, var2, var2, false, (byte)5);
            var7 = this.aRenderer_Sub3_1106.method7216(Class136.aClass136_2625, var2, var2, true, var8);
         } else {
            int[] var6;
            if(var1.aClass620_3153 != Class620.aClass620_10022 && Class21.method126(var1.aByte_3169, (byte)88)) {
               var6 = this.aClass96_1104.method1251(var1.anInt_3146 * -534969509, 0.7F, var2, var2, true, 565560703);
            } else {
               var6 = this.aClass96_1104.method1257(var1.anInt_3146 * -534969509, 0.7F, var2, var2, false, (byte)1);
            }

            var7 = this.aRenderer_Sub3_1106.method7297(var2, var2, true, var6);
         }

         var7.method4869(var1.aByte_3154 == 1, var1.aByte_3111 == 1);
         this.aClass627_1105.insert(var7, var3, var2 * var2, -335732268);
         return var7;
      }
   }

   Class58(Renderer_Sub3 var1, Class96 var2) {
      this.aRenderer_Sub3_1106 = var1;
      this.aClass96_1104 = var2;
   }
}
