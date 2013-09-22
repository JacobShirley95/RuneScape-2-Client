
public abstract class Class508_Sub5 extends Class508 {

   Class341 aClass341_6570;
   float aFloat_6571 = 0.0F;
   float aFloat_6572 = 0.0F;
   static Class625[] aClass625Array_6573;


   public void method4297(Class341 var1, int var2, int var3) {
      this.aClass341_6570 = var1;
      this.aFloat_6572 = 0.0F;
      this.aFloat_6571 = 0.0F;
   }

   public void method5907(float var1, int var2) {
      float var3 = this.aClass341_6570.method4216();
      if(this.aFloat_6572 < var3) {
         this.aFloat_6571 = this.method4305(var3, this.aFloat_6571, var1, 609461364);
         this.aFloat_6572 += this.aFloat_6571;
         if(this.aFloat_6572 > var3) {
            this.aFloat_6572 = var3;
         }

      }
   }

   public GameCoord method5903(int var1) {
      return GameCoord.method4308(this.aClass341_6570.method4210(this.aFloat_6572));
   }

   public GameCoord method5904(int var1) {
      return GameCoord.method4308(this.aClass341_6570.method4210(this.aFloat_6572));
   }

   public void method5902(Class115 var1, Viewport var2, int var3, int var4, float var5, int var6) {
      GameCoord var7 = GameCoord.method4308(this.aClass43_9142.method371(-2112965023));
      var7.floatX -= (float)var3;
      var7.floatZ -= (float)var4;
      GameCoord var8 = GameCoord.method4308(this.aClass341_6570.method4210(this.aFloat_6572));
      var8.floatX -= (float)var3;
      var8.floatZ -= (float)var4;
      var7.floatY *= -1.0F;
      var8.floatY *= -1.0F;
      GameCoord var9 = GameCoord.distBetween(var8, var7);
      var9.method4313();
      Class342 var10 = new Class342();
      var10.method4225(var9, var5);
      GameCoord var11 = GameCoord.createCoord(0.0F, 1.0F, 0.0F);
      GameCoord var12 = GameCoord.method4321(var9, var11);
      var11 = GameCoord.method4321(var12, var9);
      var11.method4328(var10);
      var2.method4636(var7.floatX, var7.floatY, var7.floatZ, var8.floatX, var8.floatY, var8.floatZ, var11.floatX, var11.floatY, var11.floatZ);
      var7.store();
      var8.store();
      var11.store();
   }

   abstract void method4302(ByteArrayDataNode var1, int var2);

   public boolean method5901(int var1) {
      return this.aClass341_6570 != null;
   }

   public void method5906(ByteArrayDataNode var1, int var2) {
      this.aClass341_6570 = new Class341(var1);
      this.aFloat_6572 = 0.0F;
      this.aFloat_6571 = 0.0F;
      this.method4302(var1, 863225049);
   }

   abstract float method4305(float var1, float var2, float var3, int var4);

   Class508_Sub5(Class43 var1) {
      super(var1);
   }
}
