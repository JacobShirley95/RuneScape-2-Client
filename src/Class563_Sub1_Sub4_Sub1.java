
public class Class563_Sub1_Sub4_Sub1 extends PositionEntity {

   Model aClass165_3045;
   Class235 aClass235_3046;


   boolean method4729(Renderer var1, int var2, int var3, byte var4) {
      return false;
   }

   boolean method4721(int var1) {
      return this.aClass165_3045 != null?!this.aClass165_3045.method2051():true;
   }

   boolean method4722(byte var1) {
      return this.aClass165_3045 != null?this.aClass165_3045.method2058():false;
   }

   void method4720(Renderer var1, Class563_Sub1 var2, int var3, int var4, int var5, boolean var6, int var7) {}

   void method4723(int var1) {}

   Class268 method4719(Renderer var1, int var2) {
      if(this.aClass165_3045 == null) {
         this.aClass165_3045 = this.aClass235_3046.method3048(var1, 1628750399);
      }

      if(null != this.aClass165_3045) {
         Viewport var3 = var1.method1979();
         Viewport var4 = this.getTransform();
         Class348 var5 = this.method6203();
         var3.setAs(var4);
         Class638 var6 = this.worldObjects.tiles[this.plane][(int)var5.gameCoord.floatX >> 9][(int)var5.gameCoord.floatZ >> 9];
         if(var6 != null && null != var6.aClass563_Sub1_Sub1_10138) {
            var3.setOffset(0.0F, (float)(-var6.aClass563_Sub1_Sub1_10138.height), 0.0F);
         }

         this.aClass165_3045.method2069(var3, (Class92)null, 0);
      }

      return null;
   }

   Class563_Sub1_Sub4_Sub1(WorldObjects var1, Class235 var2, int var3, int var4, int var5, int var6, int var7) {
      super(var1, var3, var4, var5, var6, var7, var5 >> 9, var5 >> 9, var7 >> 9, var7 >> 9, false, (byte)0);
      this.aClass235_3046 = var2;
   }

   public int method4732(int var1) {
      return this.aClass165_3045 != null?this.aClass165_3045.method2041():0;
   }

   void method4724(Renderer var1) {}

   boolean method4731(int var1) {
      return false;
   }

   public Class256 method4735(Renderer var1, int var2) {
      return null;
   }
}
