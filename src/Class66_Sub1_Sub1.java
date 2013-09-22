
public class Class66_Sub1_Sub1 extends Class66_Sub1 {

   float aFloat_1253;
   float aFloat_1254;
   float aFloat_1255 = 1.0F;


   public Class66_Sub1_Sub1(Class43 var1) {
      super(var1);
   }

   float method2792(float var1, float var2, float var3, short var4) {
      float var5 = this.aFloat_3791 / var1;
      if(var5 < 0.0F) {
         var5 = 0.0F;
      }

      if(var5 > 1.0F) {
         var5 = 1.0F;
      }

      return var1 / this.aFloat_1255 * ((this.aFloat_1254 - this.aFloat_1253) * var5 + this.aFloat_1253);
   }

   void method2790(ByteArrayDataNode var1, int var2) {
      this.aFloat_1253 = var1.method4494(-822261228);
      this.aFloat_1254 = var1.method4494(-822261228);
      this.aFloat_1255 = var1.method4494(-822261228);
   }

   public static boolean method665(char var0, int var1) {
      return var0 >= 65 && var0 <= 90 || var0 >= 97 && var0 <= 122;
   }
}
