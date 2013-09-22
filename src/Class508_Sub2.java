
public class Class508_Sub2 extends Class508 {

   final GameCoord aClass347_2118 = new GameCoord();
   final GameCoord aClass347_2119 = new GameCoord(Float.NaN, Float.NaN, Float.NaN);
   final GameCoord aClass347_2120 = new GameCoord(Float.NaN, Float.NaN, Float.NaN);
   public static CacheDataUnpacker aCacheUnpacker_2121;


   public void method1518(Class240_Sub6 var1, int var2) {
      this.aClass347_2119.floatX = (float)(var1.anInt_6764 * -78428807);
      this.aClass347_2119.floatY = (float)(1646052693 * var1.anInt_6763);
      this.aClass347_2119.floatZ = (float)(var1.anInt_6761 * -406791065);
      if(Float.isNaN(this.aClass347_2120.floatX)) {
         this.aClass347_2120.setPos(this.aClass347_2119);
         this.aClass347_2118.method4311();
      }

   }

   public void method5907(float var1, int var2) {
      this.aClass43_9142.method391(false, var1, this.aClass347_2120, this.aClass43_9142.method392(-874902317), this.aClass347_2119, this.aClass347_2118, -2048935216);
   }

   public GameCoord method5903(int var1) {
      return GameCoord.method4308(this.aClass347_2120);
   }

   public GameCoord method5904(int var1) {
      return GameCoord.method4308(this.aClass347_2119);
   }

   public void method5906(ByteArrayDataNode var1, int var2) {
      this.aClass347_2119.method4335(var1);
   }

   public boolean method5901(int var1) {
      return !Float.isNaN(this.aClass347_2120.floatX);
   }

   public void method5902(Class115 var1, Viewport var2, int var3, int var4, float var5, int var6) {
      GameCoord var7 = GameCoord.method4308(this.aClass43_9142.method371(34650727));
      var7.floatX -= (float)var3;
      var7.floatZ -= (float)var4;
      var7.floatY *= -1.0F;
      GameCoord var8 = GameCoord.method4308(this.aClass347_2120);
      var8.floatX -= (float)var3;
      var8.floatZ -= (float)var4;
      var8.floatY *= -1.0F;
      var2.method4636(var7.floatX, var7.floatY, var7.floatZ, var8.floatX, var8.floatY, var8.floatZ, 0.0F, 1.0F, 0.0F);
      var7.store();
      var8.store();
   }

   public Class508_Sub2(Class43 var1) {
      super(var1);
   }
}
