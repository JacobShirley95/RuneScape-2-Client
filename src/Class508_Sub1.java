import java.util.Map;

public class Class508_Sub1 extends Class508 {

   final Class342 aClass342_2058 = new Class342();
   final Class342 aClass342_2059 = new Class342(Float.NaN, Float.NaN, Float.NaN, Float.NaN);
   public static Map aMap_2060;


   public GameCoord method5903(int var1) {
      GameCoord var2 = new GameCoord(0.0F, 0.0F, 1000.0F);
      var2.method4328(Class342.method4241(this.aClass342_2058));
      var2.floatY *= -1.0F;
      var2.method4314(this.aClass43_9142.method371(-851656906));
      return var2;
   }

   public void method1441(Class342 var1, byte var2) {
      this.aClass342_2059.aFloat_6541 = var1.aFloat_6541;
      this.aClass342_2059.aFloat_6542 = var1.aFloat_6542;
      this.aClass342_2059.aFloat_6543 = var1.aFloat_6543;
      this.aClass342_2059.aFloat_6538 = var1.aFloat_6538;
      this.aClass342_2058.method4226(this.aClass342_2059);
   }

   public GameCoord method5904(int var1) {
      GameCoord var2 = new GameCoord(0.0F, 0.0F, 1000.0F);
      var2.method4328(Class342.method4241(this.aClass342_2059));
      var2.floatY *= -1.0F;
      var2.method4314(this.aClass43_9142.method371(-1286763319));
      return var2;
   }

   public void method5907(float var1, int var2) {
      this.aClass342_2058.method4226(this.aClass342_2059);
   }

   public Class342 method5905(byte var1) {
      return new Class342(this.aClass342_2058);
   }

   public void method5906(ByteArrayDataNode var1, int var2) {
      this.aClass342_2059.method4221(var1);
   }

   public void method5902(Class115 var1, Viewport var2, int var3, int var4, float var5, int var6) {
      GameCoord var7 = GameCoord.method4308(this.aClass43_9142.method371(-220731427));
      var7.floatX -= (float)var3;
      var7.floatZ -= (float)var4;
      var7.floatY *= -1.0F;
      var2.method4628(Class342.method4241(this.aClass342_2058));
      var2.setOffset(var7);
      var2.method4642();
      var7.store();
   }

   public Class508_Sub1(Class43 var1) {
      super(var1);
   }

   public boolean method5901(int var1) {
      return !Float.isNaN(this.aClass342_2058.aFloat_6541);
   }
}
