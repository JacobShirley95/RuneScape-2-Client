
public class Class508_Sub4 extends Class508 {

   final GameCoord aClass347_2353 = new GameCoord(Float.NaN, Float.NaN, Float.NaN);
   final GameCoord aClass347_2354 = new GameCoord();
   boolean aBoolean_2355;
   Class118 aClass118_2356;
   final GameCoord aClass347_2357 = new GameCoord(Float.NaN, Float.NaN, Float.NaN);
   final GameCoord aClass347_2358 = new GameCoord();
   static String aString_2359;


   public Class508_Sub4(Class43 var1) {
      super(var1);
   }

   public boolean method5901(int var1) {
      return !Float.isNaN(this.aClass347_2353.floatX);
   }

   public void method5902(Class115 var1, Viewport var2, int var3, int var4, float var5, int var6) {
      GameCoord var7 = GameCoord.method4308(this.aClass43_9142.method371(-483863063));
      var7.floatX -= (float)var3;
      var7.floatZ -= (float)var4;
      var7.floatY *= -1.0F;
      GameCoord var8 = this.method5903(2078899593);
      var8.floatX -= (float)var3;
      var8.floatZ -= (float)var4;
      var8.floatY *= -1.0F;
      var2.method4636(var7.floatX, var7.floatY, var7.floatZ, var8.floatX, var8.floatY, var8.floatZ, 0.0F, 1.0F, 0.0F);
      var7.store();
      var8.store();
   }

   public GameCoord method5903(int var1) {
      GameCoord var2 = GameCoord.method4308(this.aClass347_2353);
      GameCoord var3 = GameCoord.method4308(this.aClass347_2354);
      if(this.aBoolean_2355) {
         var3.method4328(this.aClass118_2356.method1503((byte)8));
      }

      var2.method4314(var3);
      var3.store();
      return var2;
   }

   public GameCoord method5904(int var1) {
      GameCoord var2 = GameCoord.method4308(this.aClass347_2357);
      GameCoord var3 = GameCoord.method4308(this.aClass347_2354);
      if(this.aBoolean_2355) {
         var3.method4328(this.aClass118_2356.method1503((byte)8));
      }

      var2.method4314(var3);
      var3.store();
      return var2;
   }

   public GameCoord method1616(int var1) {
      return this.aClass347_2353;
   }

   public void method5906(ByteArrayDataNode var1, int var2) {
      Class114 var3 = Class529.method6022(var1.readByte(1041581601), -2146730021);
      int var4 = var1.readShort(-545968460);
      this.aClass118_2356 = this.aClass43_9142.method350((byte)96).method217(var3, var4, 1184710305);
      this.aClass347_2354.method4335(var1);
      if(var1.readByte(929732174) == 1) {
         this.aBoolean_2355 = true;
      } else {
         this.aBoolean_2355 = false;
      }

   }

   public void method5907(float var1, int var2) {
      if(this.aClass118_2356 != null) {
         this.aClass347_2357.setPos(this.aClass118_2356.method1504((byte)57).method4447(482548241));
         this.aClass43_9142.method391(false, var1, this.aClass347_2353, this.aClass43_9142.method392(1529979792), this.aClass347_2357, this.aClass347_2358, -1248448215);
      }
   }

   public void method1619(Class118 var1, GameCoord var2, boolean var3, int var4) {
      this.aClass118_2356 = var1;
      this.aClass347_2354.setPos(var2);
      this.aBoolean_2355 = var3;
      var1.method1504((byte)52);
   }
}
