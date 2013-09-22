
public class Class232 {

   public static int anInt_3986;


   Class232() throws Throwable {
      throw new Error();
   }

   static final void method2964(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      Class234.method3013(var3, var4, false, 2, var0, 2086917474);
   }

   static final void method2965(RSInterfaceData var0, int var1) {
      MapOverviewNode var2 = Class605.method6516(472983286);
      if(null != var2) {
         boolean var3 = var2.method2573(Class107.viewOfMapImageX * -1850250531 + Class248.anInt_4120, Class248.anInt_4124 + 1377436059 * AbstractUpdateServerConnector.viewOfMapImageY, Class556.anIntArray_9545, (byte)62);
         if(var3) {
            var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class556.anIntArray_9545[1];
            var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class556.anIntArray_9545[2];
         } else {
            var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = -1;
            var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = -1;
         }
      } else {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = -1;
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = -1;
      }

   }

   static final void method2966(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class104_Sub21.renderSettings.aClass540_Sub21_7306.method6082(var2, 38578979);
   }

   public static boolean notSafeMode(int var0, int var1) {
      return 1 == var0 || var0 == 3 || var0 == 5;
   }

   public static void method2968(float var0, GameCoord var1, Class342 var2, GameCoord var3, GameCoord var4, GameCoord var5, float var6, int var7) {
      if(!var3.method4312(var1)) {
         GameCoord var8 = GameCoord.createCoord(0.0F, 0.0F, 0.0F);
         GameCoord var9 = GameCoord.method4308(GameCoord.distBetween(var3, var1));
         var9.method4328(var2);
         GameCoord var10 = GameCoord.distBetween(var9, var8);
         float var11 = var10.getHyp();
         if(Float.POSITIVE_INFINITY != var5.floatX && !Float.isNaN(var1.floatX) && var11 <= 5120.0F) {
            var2.method4222();
            GameCoord var12 = GameCoord.createCoord(1.0F, 0.0F, 0.0F);
            GameCoord var13 = GameCoord.createCoord(0.0F, 1.0F, 0.0F);
            GameCoord var14 = GameCoord.createCoord(0.0F, 0.0F, 1.0F);
            var12.method4328(var2);
            var13.method4328(var2);
            var14.method4328(var2);
            GameCoord var15 = GameCoord.createCoord(GameCoord.method4326(var12, var4), GameCoord.method4326(var13, var4), GameCoord.method4326(var14, var4));
            GameCoord var16 = GameCoord.method4308(var15);
            GameCoord var17 = GameCoord.createCoord(var10.floatX * var5.floatX, var10.floatY * var5.floatY, var5.floatZ * var10.floatZ);
            var16.method4315(var17, var0);
            var16.method4332(var6);
            GameCoord var18 = GameCoord.method4327(var12, var16.floatX);
            var18.method4315(var13, var16.floatY);
            var18.method4315(var14, var16.floatZ);
            var4.setPos(var18);
            if(var11 < 1.0F) {
               var1.setPos(var3);
               var4.method4311();
            } else {
               var1.method4314(GameCoord.method4327(var4, var0));
            }
         } else {
            var1.setPos(var3);
            var4.method4311();
         }

      }
   }
}
