
public class Class187_Sub2 extends Class187 {

   public static int anInt_10980;


   void method2293(ByteArrayDataNode var1, int var2, int var3) {}

   Class187_Sub2(Class283 var1, int var2) {
      super(var1, var2);
   }

   public static final void method7582(short var0) {
      if(client.anInt_400 * -525438487 != -1 && client.anInt_408 * 1026644157 != -1) {
         int var1 = (-793393371 * client.anInt_474 * (client.anInt_406 * -1341985689 - -277375191 * client.anInt_405) >> 16) + -277375191 * client.anInt_405;
         client.anInt_474 += -157221715 * var1;
         if(client.anInt_474 * -793393371 >= '\uffff') {
            client.anInt_474 = 101450579;
            if(!client.aBoolean_489) {
               client.aBoolean_407 = true;
            } else {
               client.aBoolean_407 = false;
            }

            client.aBoolean_489 = true;
         } else {
            client.aBoolean_407 = false;
            client.aBoolean_489 = false;
         }

         float var2 = (float)(client.anInt_474 * -793393371) / 65535.0F;
         float[] var3 = new float[3];
         int var4 = 379186278 * client.anInt_392;

         int var7;
         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         for(int var5 = 0; var5 < 3; ++var5) {
            int var6 = client.anIntArrayArrayArray_399[client.anInt_400 * -525438487][var4][var5] * 3;
            var7 = 3 * client.anIntArrayArrayArray_399[client.anInt_400 * -525438487][1 + var4][var5];
            var8 = 3 * (client.anIntArrayArrayArray_399[client.anInt_400 * -525438487][2 + var4][var5] - (client.anIntArrayArrayArray_399[client.anInt_400 * -525438487][var4 + 3][var5] - client.anIntArrayArrayArray_399[-525438487 * client.anInt_400][2 + var4][var5]));
            var9 = client.anIntArrayArrayArray_399[-525438487 * client.anInt_400][var4][var5];
            var10 = var7 - var6;
            var11 = var6 - var7 * 2 + var8;
            var12 = var7 + (client.anIntArrayArrayArray_399[-525438487 * client.anInt_400][var4 + 2][var5] - var9) - var8;
            var3[var5] = (var2 * ((float)var11 + var2 * (float)var12) + (float)var10) * var2 + (float)var9;
         }

         MapPoint var18 = client.aClass296_348.getMapArea();
         Class330.anInt_6406 = 1881166515 * ((int)var3[0] - var18.loadedMapX * -695432704);
         Class1.anInt_17 = 1911010599 * (int)var3[1];
         Class373.anInt_7118 = ((int)var3[2] - -149698048 * var18.loadedMapY) * -1775806967;
         float[] var19 = new float[3];
         var7 = client.anInt_403 * 716231142;

         for(var8 = 0; var8 < 3; ++var8) {
            var9 = 3 * client.anIntArrayArrayArray_399[1026644157 * client.anInt_408][var7][var8];
            var10 = 3 * client.anIntArrayArrayArray_399[client.anInt_408 * 1026644157][1 + var7][var8];
            var11 = (client.anIntArrayArrayArray_399[client.anInt_408 * 1026644157][2 + var7][var8] - (client.anIntArrayArrayArray_399[1026644157 * client.anInt_408][3 + var7][var8] - client.anIntArrayArrayArray_399[1026644157 * client.anInt_408][var7 + 2][var8])) * 3;
            var12 = client.anIntArrayArrayArray_399[1026644157 * client.anInt_408][var7][var8];
            int var13 = var10 - var9;
            int var14 = var9 - var10 * 2 + var11;
            int var15 = client.anIntArrayArrayArray_399[1026644157 * client.anInt_408][2 + var7][var8] - var12 + var10 - var11;
            var19[var8] = (float)var12 + ((float)var13 + var2 * ((float)var14 + (float)var15 * var2)) * var2;
         }

         float var20 = var19[0] - var3[0];
         float var21 = -1.0F * (var19[1] - var3[1]);
         float var22 = var19[2] - var3[2];
         double var16 = Math.sqrt((double)(var22 * var22 + var20 * var20));
         Class631.anInt_10082 = ((int)(Math.atan2((double)var21, var16) * 2607.5945876176133D) & 16383) * 351528041;
         Class474.anInt_8724 = ((int)(-Math.atan2((double)var20, (double)var22) * 2607.5945876176133D) & 16383) * -449062061;
         Class283_Sub5.anInt_8259 = -499274677 * (client.anIntArrayArrayArray_399[client.anInt_400 * -525438487][var4][3] + (-793393371 * client.anInt_474 * (client.anIntArrayArrayArray_399[-525438487 * client.anInt_400][var4 + 2][3] - client.anIntArrayArrayArray_399[-525438487 * client.anInt_400][var4][3]) >> 16));
      }
   }

   static int method7583(int var0, int var1, int var2) {
      return var0 != -1965975883 * Class495.aClass495_9040.anInt_9062 && var0 != Class495.aClass495_9042.anInt_9062 * -1965975883?Class563_Sub1_Sub5_Sub1.anIntArray_7862[var1 & 3]:Class563_Sub1_Sub5_Sub1.anIntArray_7864[var1 & 3];
   }

   static final void method7584(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class210.aByte_3656;
   }

   static final void method7585(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class104_Sub21.renderSettings.aClass540_Sub17_7299.method3984(653013396)?1:0;
   }
}
