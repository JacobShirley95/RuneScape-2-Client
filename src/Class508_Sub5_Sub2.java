
public class Class508_Sub5_Sub2 extends Class508_Sub5 {

   float aFloat_3374 = 1.0F;
   float aFloat_3375;
   float aFloat_3376;


   public Class508_Sub5_Sub2(Class43 var1) {
      super(var1);
   }

   void method4302(ByteArrayDataNode var1, int var2) {
      this.aFloat_3375 = var1.method4494(-822261228);
      this.aFloat_3376 = var1.method4494(-822261228);
      this.aFloat_3374 = var1.method4494(-822261228);
   }

   float method4305(float var1, float var2, float var3, int var4) {
      float var5 = this.aFloat_6572 / var1;
      if(var5 < 0.0F) {
         var5 = 0.0F;
      }

      if(var5 > 1.0F) {
         var5 = 1.0F;
      }

      return (var5 * (this.aFloat_3376 - this.aFloat_3375) + this.aFloat_3375) * (var1 / this.aFloat_3374);
   }
}
