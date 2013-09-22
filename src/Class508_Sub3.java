
public class Class508_Sub3 extends Class508 {

   Class66_Sub1 aClass66_Sub1_2122 = null;
   Class341 aClass341_2123 = null;


   public void method5907(float var1, int var2) {}

   public boolean method5901(int var1) {
      return null != this.aClass341_2123 && null != this.aClass66_Sub1_2122 && this.aClass66_Sub1_2122.method672((byte)0);
   }

   public GameCoord method5903(int var1) {
      return GameCoord.method4308(this.aClass341_2123.method4211(this.aClass66_Sub1_2122.method2787(1535762916)));
   }

   public GameCoord method5904(int var1) {
      return GameCoord.method4308(this.aClass341_2123.method4211(this.aClass66_Sub1_2122.method2787(1108920165)));
   }

   public void method5902(Class115 var1, Viewport var2, int var3, int var4, float var5, int var6) {
      GameCoord var7 = GameCoord.method4308(this.aClass43_9142.method371(-2130912244));
      var7.floatX -= (float)var3;
      var7.floatZ -= (float)var4;
      float var8 = this.aClass66_Sub1_2122.method2787(-525584784);
      GameCoord var9 = GameCoord.method4308(this.aClass341_2123.method4211(var8));
      var9.floatX -= (float)var3;
      var9.floatZ -= (float)var4;
      GameCoord var10 = GameCoord.distBetween(var9, var7);
      var10.method4313();
      Class342 var11 = new Class342();
      var11.method4225(var10, var5);
      GameCoord var12 = GameCoord.createCoord(0.0F, 1.0F, 0.0F);
      GameCoord var13 = GameCoord.method4321(var10, var12);
      var12 = GameCoord.method4321(var13, var10);
      var12.method4328(var11);
      var7.floatY *= -1.0F;
      var9.floatY *= -1.0F;
      var2.method4636(var7.floatX, var7.floatY, var7.floatZ, var9.floatX, var9.floatY, var9.floatZ, var12.floatX, var12.floatY, var12.floatZ);
      var7.store();
      var9.store();
      var12.store();
   }

   public void method5906(ByteArrayDataNode var1, int var2) {
      this.aClass341_2123 = new Class341(var1);
   }

   public Class508_Sub3(Class43 var1) {
      super(var1);
   }
}
