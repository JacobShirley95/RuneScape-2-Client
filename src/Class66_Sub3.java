
public class Class66_Sub3 extends Class66 {

   int anInt_3994 = 989830056;
   final GameCoord aClass347_3995 = new GameCoord();
   final Class342 aClass342_3996 = new Class342();
   boolean aBoolean_3997;
   Class118 aClass118_3998;
   int anInt_3999;
   final GameCoord aClass347_4000 = new GameCoord(Float.NaN, Float.NaN, Float.NaN);
   final Class342 aClass342_4001 = new Class342();
   final GameCoord aClass347_4002 = new GameCoord();
   final GameCoord aClass347_4003 = new GameCoord(Float.NaN, Float.NaN, Float.NaN);


   public void method666(float var1, int[][][] var2, Class281 var3, int var4, int var5, int var6) {
      if(null != this.aClass118_3998) {
         this.method2990(var2, var3, var4, var5, 1756186585);
         Class342 var7 = this.method2989(2112226504);
         this.aClass342_4001.method4233(var7, this.aClass43_1256.method378((byte)23));
         var7.method4243();
         this.aClass347_4003.setPos(this.aClass118_3998.method1504((byte)-22).method4447(-1936406143));
         this.aClass43_1256.method391(true, var1, this.aClass347_4000, this.aClass43_1256.method392(2069701141), this.aClass347_4003, this.aClass347_4002, -1243534981);
      }
   }

   Class342 method2989(int var1) {
      Class342 var2 = Class342.method4239(this.aClass342_3996);
      if(this.aBoolean_3997) {
         GameCoord var3 = this.aClass118_3998.method1502((byte)0);
         if(var3.getHyp() < (float)(this.anInt_3994 * -719226475)) {
            var3 = GameCoord.createCoord(0.0F, 0.0F, 1.0F);
            Class342 var4 = this.aClass118_3998.method1503((byte)8);
            var3.method4328(var4);
         }

         var3.floatY = 0.0F;
         float var6 = (float)Math.atan2((double)var3.floatX, (double)var3.floatZ);
         var3.store();
         Class342 var5 = new Class342();
         var5.method4242(0.0F, 1.0F, 0.0F, var6);
         var2.method4231(var5);
      }

      return var2;
   }

   void method2990(int[][][] var1, Class281 var2, int var3, int var4, int var5) {
      if(this.method672((byte)0) && (this.aClass43_1256.method384(706090624) || this.aClass43_1256.method385((byte)1))) {
         Class240_Sub6 var6 = this.aClass118_3998.method1504((byte)64);
         this.anInt_3999 = -1162471455 * var6.anInt_6760;
         int var7 = 1008547111 * this.anInt_3999;
         boolean var8 = true;
         if(3 == 1008547111 * this.anInt_3999) {
            var8 = false;
         } else if(var2.method3646(-78428807 * var6.anInt_6764 - var3 >> 9, var6.anInt_6761 * -406791065 - var4 >> 9, (byte)0)) {
            var7 = 1 + this.anInt_3999 * 1008547111;
            var8 = false;
         }

         if(this.aClass43_1256.method385((byte)1) && var1 != null) {
            float var9 = this.method3000(var1, var2, var3, var4, var7, var8, -1530301415);
            if(Float.NaN == var9) {
               return;
            }

            if(var9 > 0.0F) {
               float var10 = 3.1415927F;
               GameCoord var11 = GameCoord.createCoord(0.0F, 0.0F, 1.0F);
               var11.method4328(this.aClass342_3996);
               GameCoord var12 = GameCoord.createCoord(var11.floatX, 0.0F, var11.floatZ);
               var12.method4313();
               float var13 = GameCoord.method4326(var11, var12);

               for(int var14 = 0; var14 < 10; ++var14) {
                  float var15 = (var13 + var10) / 2.0F - var13;
                  float var16 = var15;
                  if(var9 > 0.0F) {
                     var16 = var15 * -1.0F;
                  }

                  GameCoord var17 = GameCoord.createCoord(1.0F, 0.0F, 0.0F);
                  var17.method4328(this.aClass342_3996);
                  Class342 var18 = Class342.method4218();
                  var18.method4225(var17, var16);
                  this.aClass342_3996.method4231(var18);
                  var17.store();
                  var18.method4243();
                  var9 = this.method3000(var1, var2, var3, var4, var7, var8, -1392259507);
                  if(Float.NaN == var9) {
                     return;
                  }

                  if(var9 > 0.0F) {
                     var13 += var15;
                  } else {
                     var10 -= var15;
                  }
               }
            }
         }
      }

   }

   GameCoord method2991(Class342 var1, int var2) {
      GameCoord var3 = GameCoord.method4308(this.aClass347_3995);
      var3.method4328(var1);
      GameCoord var4 = GameCoord.method4316(this.aClass347_4003, var3);
      var3.store();
      return var4;
   }

   public boolean method672(byte var1) {
      return !Float.isNaN(this.aClass347_4000.floatX);
   }

   public GameCoord method667(int var1) {
      GameCoord var2 = GameCoord.method4308(this.aClass347_3995);
      var2.method4328(this.aClass342_4001);
      GameCoord var3 = GameCoord.method4316(this.aClass347_4000, var2);
      var2.store();
      return var3;
   }

   public Class240_Sub6 method668(int var1) {
      GameCoord var2 = this.method667(1141993098);
      Class240_Sub6 var3 = new Class240_Sub6(1008547111 * this.anInt_3999, (int)var2.floatX, (int)var2.floatY, (int)var2.floatZ);
      var2.store();
      return var3;
   }

   public GameCoord method2995(byte var1) {
      return this.aClass347_4000;
   }

   public Class66_Sub3(Class43 var1) {
      super(var1);
   }

   public float method2996(int var1) {
      return Class36.method301(this.aClass342_3996, (byte)89);
   }

   public float method669(int var1) {
      return 0.0F;
   }

   public void method670(Class115 var1, int var2, int var3, int var4) {
      GameCoord var5 = this.method667(1559063767);
      var1.anInt_2084 = ((int)var5.floatX - var2) * 1892926905;
      var1.anInt_2083 = -213214267 * (int)(-var5.floatY);
      var1.anInt_2082 = ((int)var5.floatZ - var3) * -851374433;
      var5.store();
   }

   public void method671(ByteArrayDataNode var1, byte var2) {
      Class114 var3 = Class529.method6022(var1.readByte(971337700), -1565653929);
      int var4 = var1.readShort(-1040277050);
      this.aClass347_3995.method4335(var1);
      this.aClass342_3996.method4221(var1);
      if(var1.readByte(203761725) == 1) {
         this.aBoolean_3997 = true;
      } else {
         this.aBoolean_3997 = false;
      }

      this.anInt_3994 = var1.readShort(-1107040513) * 1916209597;
      this.aClass118_3998 = this.aClass43_1256.method350((byte)52).method217(var3, var4, 1184710305);
   }

   float method3000(int[][][] var1, Class281 var2, int var3, int var4, int var5, boolean var6, int var7) {
      Class342 var8 = this.method2989(2112226504);
      GameCoord var9 = this.method2991(var8, 2113492692);
      var8.method4243();
      int var10 = (int)var9.floatX - var3 >> 9;
      int var11 = (int)var9.floatZ - var4 >> 9;
      if(var10 >= 0 && var11 >= 0 && var10 + 1 < var1[0].length && 1 + var11 < var1[0][0].length) {
         int var12 = var5;
         if(var6 && var2.method3646(var10, var11, (byte)0)) {
            var12 = 1 + var5;
         }

         int var13 = (int)var9.floatX % 512;
         int var14 = (int)var9.floatZ % 512;
         float var15 = (float)(var1[var12][var10][var11] * (512 - var13) * (512 - var14));
         var15 += (float)((512 - var14) * var1[var12][var10 + 1][var11] * var13);
         var15 += (float)(var1[var12][var10][1 + var11] * (512 - var13) * var14);
         var15 += (float)(var14 * var13 * var1[var12][1 + var10][1 + var11]);
         var15 /= 262144.0F;
         var15 -= 1024.0F;
         float var16 = -var15 - var9.floatY;
         var9.store();
         return var16;
      } else {
         var9.store();
         return Float.NaN;
      }
   }

   public float method3001(byte var1) {
      return Class332.method4113(this.aClass342_3996, (byte)-62);
   }

   public void method3002(Class118 var1, GameCoord var2, Class342 var3, boolean var4, int var5, int[][][] var6, Class281 var7, int var8, int var9, byte var10) {
      this.aClass118_3998 = var1;
      this.aClass347_3995.setPos(var2);
      this.aClass342_3996.method4226(var3);
      this.aBoolean_3997 = var4;
      this.anInt_3994 = var5 * 1916209597;
      this.anInt_3999 = this.aClass118_3998.method1504((byte)-4).anInt_6760 * -1162471455;
      this.method2990(var6, var7, var8, var9, 2013927886);
   }

   public GameCoord method3003(byte var1) {
      return this.aClass347_3995;
   }

   public static Class394 method3004(ByteArrayDataNode var0, int var1) {
      int var2 = var0.method4493(-157074556);
      return new Class394(var2);
   }
}
