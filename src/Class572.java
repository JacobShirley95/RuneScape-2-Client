
public class Class572 {

   public static final Class572 aClass572_9654 = new Class572();
   static final Class572 aClass572_9655 = new Class572();
   static final Class572 aClass572_9656 = new Class572();


   static boolean method6274(int var0) {
      return !CharTask.method1348(client.loginStage * -243034353, -714864269);
   }

   static final void method6275(RSCharacter var0, boolean var1, int var2) {
      int var3 = Class539.aClass539_9457.aByte_9460;
      int var4 = 0;
      if(-1865071747 * var0.anInt_4321 > client.timer * -1025618511) {
         Class22.method133(var0, -208424667);
      } else if(var0.anInt_4317 * 2141686191 >= -1025618511 * client.timer) {
         Class231_Sub1.method3098(var0, (byte)7);
      } else {
         Class41.method342(var0, var1, (byte)38);
         var3 = Class411.anInt_7851 * -1503777883;
         var4 = Class525.anInt_9275 * 1279861479;
      }

      GameCoord var5 = var0.method6203().gameCoord;
      int var6;
      if((int)var5.floatX < 512 || (int)var5.floatZ < 512 || (int)var5.floatX >= (client.aClass296_348.getMaxX((byte)-66) - 1) * 512 || (int)var5.floatZ >= (client.aClass296_348.getMaxY(-1416536980) - 1) * 512) {
         var0.animation.animate(-1, 1593151072);

         for(var6 = 0; var6 < var0.aClass322Array_4319.length; ++var6) {
            var0.aClass322Array_4319[var6].animationID = -1431556309;
            var0.aClass322Array_4319[var6].anime.animate(-1, 1593151072);
         }

         var0.animationQueue = null;
         var0.anInt_4321 = 0;
         var0.anInt_4317 = 0;
         var3 = Class539.aClass539_9457.aByte_9460;
         var4 = 0;
         var0.setPosition((float)(var0.tilePosArrayX[0] * 512 + var0.method3257() * 256), var5.floatY, (float)(var0.tilePosArrayY[0] * 512 + var0.method3257() * 256));
         var0.method3282(489383219);
      }

      if(Class521.myPlayer == var0 && ((int)var5.floatX < 6144 || (int)var5.floatZ < 6144 || (int)var5.floatX >= (client.aClass296_348.getMaxX((byte)-61) - 12) * 512 || (int)var5.floatZ >= (client.aClass296_348.getMaxY(-169681096) - 12) * 512)) {
         var0.animation.animate(-1, 1593151072);

         for(var6 = 0; var6 < var0.aClass322Array_4319.length; ++var6) {
            var0.aClass322Array_4319[var6].animationID = -1431556309;
            var0.aClass322Array_4319[var6].anime.animate(-1, 1593151072);
         }

         var0.animationQueue = null;
         var0.anInt_4321 = 0;
         var0.anInt_4317 = 0;
         var3 = Class539.aClass539_9457.aByte_9460;
         var4 = 0;
         var0.setPosition((float)(var0.tilePosArrayX[0] * 512 + var0.method3257() * 256), var5.floatY, (float)(var0.tilePosArrayY[0] * 512 + var0.method3257() * 256));
         var0.method3282(489383219);
      }

      var6 = IgnoredPlayer.method73(var0, 1976415176);
      Class486.method5739(var0, (byte)-3);
      Class172.method2174(var0, var3, var4, var6, (short)17410);
      Class494.method5778(var0, var3, 1038120819);
      Class86.method1130(var0, -1348770031);
      Class342 var7 = Class342.method4218();
      var7.method4223(Class362.toRadians(var0.aClass6_4337.getRotation((byte)126)), Class362.toRadians(var0.yRotation.getRotation((byte)34)), Class362.toRadians(var0.xRotation.getRotation((byte)72)));
      var0.method6206(var7);
      var7.method4243();
   }

   static final void method6276(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var6 - 334;
      if(var8 < 0) {
         var8 = 0;
      } else if(var8 > 100) {
         var8 = 100;
      }

      int var9 = var8 * (client.aShort_556 - client.aShort_404) / 100 + client.aShort_404;
      var5 = var5 * var9 >> 8;
      int var10 = 16384 - var3 & 16383;
      int var11 = 16384 - var4 & 16383;
      int var12 = 0;
      int var13 = 0;
      int var14 = var5;
      if(0 != var10) {
         var13 = Class362.cosArray[var10] * -var5 >> 14;
         var14 = Class362.sinArray[var10] * var5 >> 14;
      }

      if(var11 != 0) {
         var12 = Class362.cosArray[var11] * var14 >> 14;
         var14 = Class362.sinArray[var11] * var14 >> 14;
      }

      Class330.anInt_6406 = (var0 - var12) * 1881166515;
      Class1.anInt_17 = (var1 - var13) * -1911010599;
      Class373.anInt_7118 = (var2 - var14) * -1775806967;
      Class631.anInt_10082 = var3 * 351528041;
      Class474.anInt_8724 = -449062061 * var4;
      Class283_Sub5.anInt_8259 = 0;
   }

   static byte method6277(int var0, int var1, byte var2) {
      return (byte)(var0 != -1965975883 * Class495.aClass495_9043.anInt_9062?0:(0 == (var1 & 1)?1:2));
   }

   static final String[] method6278(String[] var0, int var1) {
      String[] var2 = new String[5];

      for(int var3 = 0; var3 < 5; ++var3) {
         var2[var3] = var3 + " ";
         if(var0 != null && var0[var3] != null) {
            var2[var3] = var2[var3] + var0[var3];
         }
      }

      return var2;
   }

   public static boolean method6279(int var0, int var1) {
      return var0 == 0 || 1 == var0 || 2 == var0;
   }
}
