
public abstract class Class240_Sub52 extends NodeListNode {

   static int anInt_7975;


   abstract void method5260(Class68 var1, byte var2);

   abstract void method5261(ByteArrayDataNode var1, byte var2);

   public static void method5262(float var0, GameCoord var1, Class342 var2, GameCoord var3, GameCoord var4, GameCoord var5, GameCoord var6, float var7, float var8, int var9) {
      if(!var3.method4312(var1)) {
         GameCoord var10 = GameCoord.createCoord(0.0F, 0.0F, 0.0F);
         GameCoord var11 = GameCoord.method4308(GameCoord.distBetween(var3, var1));
         var11.method4328(var2);
         GameCoord var12 = GameCoord.distBetween(var11, var10);
         float var13 = var12.getHyp();
         if(var7 > 0.0F) {
            var5 = GameCoord.method4308(var5);
            var5.method4331(var8 * (var13 / var7));
         }

         if(var5.floatX != Float.POSITIVE_INFINITY && !Float.isNaN(var1.floatX) && var13 <= 5120.0F) {
            var2.method4222();
            GameCoord var14 = GameCoord.createCoord(1.0F, 0.0F, 0.0F);
            GameCoord var15 = GameCoord.createCoord(0.0F, 1.0F, 0.0F);
            GameCoord var16 = GameCoord.createCoord(0.0F, 0.0F, 1.0F);
            var14.method4328(var2);
            var15.method4328(var2);
            var16.method4328(var2);
            GameCoord var17 = GameCoord.createCoord(GameCoord.method4326(var14, var4), GameCoord.method4326(var15, var4), GameCoord.method4326(var16, var4));
            GameCoord var18 = GameCoord.method4308(var17);
            var18.method4322();
            GameCoord var19 = GameCoord.method4325(GameCoord.method4324(var18, var18), GameCoord.method4327(var5, 2.0F));
            GameCoord var20 = GameCoord.method4308(var12);
            var20.method4322();
            GameCoord var21 = GameCoord.method4308(var17);
            if(var19.floatX > var20.floatX) {
               if(var12.floatX < 0.0F) {
                  var21.floatX += var0 * var5.floatX;
                  if(var21.floatX > 0.0F) {
                     var21.floatX = 0.0F;
                  }
               } else {
                  var21.floatX -= var5.floatX * var0;
                  if(var21.floatX < 0.0F) {
                     var21.floatX = 0.0F;
                  }
               }
            } else if(var18.floatX < var6.floatX) {
               if(var12.floatX < 0.0F) {
                  var21.floatX -= var0 * var5.floatX;
                  if(var21.floatX < -var6.floatX) {
                     var21.floatX = -var6.floatX;
                  }
               } else {
                  var21.floatX += var0 * var5.floatX;
                  if(var21.floatX > var6.floatX) {
                     var21.floatX = var6.floatX;
                  }
               }
            }

            if(var19.floatY > var20.floatY) {
               if(var12.floatY < 0.0F) {
                  var21.floatY += var5.floatY * var0;
                  if(var21.floatY > 0.0F) {
                     var21.floatY = 0.0F;
                  }
               } else {
                  var21.floatY -= var5.floatY * var0;
                  if(var21.floatY < 0.0F) {
                     var21.floatY = 0.0F;
                  }
               }
            } else if(var18.floatY < var6.floatY) {
               if(var12.floatY < 0.0F) {
                  var21.floatY -= var5.floatY * var0;
                  if(var21.floatY < -var6.floatY) {
                     var21.floatY = -var6.floatY;
                  }
               } else {
                  var21.floatY += var5.floatY * var0;
                  if(var21.floatY > var6.floatY) {
                     var21.floatY = var6.floatY;
                  }
               }
            }

            if(var19.floatZ > var20.floatZ) {
               if(var12.floatZ < 0.0F) {
                  var21.floatZ += var0 * var5.floatZ;
                  if(var21.floatZ > 0.0F) {
                     var21.floatZ = 0.0F;
                  }
               } else {
                  var21.floatZ -= var5.floatZ * var0;
                  if(var21.floatZ < 0.0F) {
                     var21.floatZ = 0.0F;
                  }
               }
            } else if(var18.floatZ < var6.floatZ) {
               if(var12.floatZ < 0.0F) {
                  var21.floatZ -= var0 * var5.floatZ;
                  if(var21.floatZ < -var6.floatZ) {
                     var21.floatZ = -var6.floatZ;
                  }
               } else {
                  var21.floatZ += var0 * var5.floatZ;
                  if(var21.floatZ > var6.floatZ) {
                     var21.floatZ = var6.floatZ;
                  }
               }
            }

            GameCoord var22 = GameCoord.method4327(var14, var21.floatX);
            var22.method4315(var15, var21.floatY);
            var22.method4315(var16, var21.floatZ);
            var4.method4330(var22, 0.8F);
            if(var13 < 10.0F) {
               var1.setPos(var3);
               var4.method4311();
            } else {
               var1.method4314(GameCoord.method4327(var4, var0));
            }

            var18.store();
            var21.store();
            var20.store();
         } else {
            var1.setPos(var3);
            var4.method4311();
         }

      }
   }
}
