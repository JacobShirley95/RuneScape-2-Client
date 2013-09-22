
public class Class353 {

   public static void method4438(GameCoord var0, GameCoord var1, GameCoord var2, float var3, GameCoord[] var4) {
      GameCoord var5 = GameCoord.distBetween(var0, var2);
      float var6 = GameCoord.method4326(var5, var5) - var3 * var3;
      float var7 = GameCoord.method4326(var1, var5);
      float var8 = var7 * var7 - var6;
      if(var8 < 0.0F) {
         var4[1] = null;
         var4[0] = null;
      } else if(var8 >= 9.765625E-4F) {
         float var9 = (float)Math.sqrt((double)var8);
         var4[0] = GameCoord.method4306();
         var4[0].setPos(var0);
         var4[0].method4314(GameCoord.method4327(GameCoord.method4308(var1), -var7 - var9));
         var4[1] = GameCoord.method4306();
         var4[1].setPos(var0);
         var4[1].method4314(GameCoord.method4327(GameCoord.method4308(var1), -var7 + var9));
      } else {
         var4[0] = GameCoord.method4306();
         var4[0].setPos(var0);
         var4[0].method4314(GameCoord.method4327(GameCoord.method4308(var1), -var7));
         var4[1] = null;
      }

   }

   Class353() throws Throwable {
      throw new Error();
   }
}
