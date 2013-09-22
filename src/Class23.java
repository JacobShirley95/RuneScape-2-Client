
public class Class23 implements Class184, Class185, Class589 {

   public final Class608 aClass608_202;
   final Class212_Sub1_Sub1 aClass212_Sub1_Sub1_203;
   final Class212_Sub2 aClass212_Sub2_204;
   final Class591[] aClass591Array_205;


   public int method134(int var1, int var2) {
      return this.aClass591Array_205[var1].method6399(client.aBoolean_270?Class538.aClass538_9454:Class538.aClass538_9453, -1082918189);
   }

   public int method135(int var1, int var2) {
      return this.aClass591Array_205[var1].method6402(-75607525);
   }

   public int method136(int var1, byte var2) {
      return this.aClass591Array_205[var1].method6398(-708028207);
   }

   public int method137(int var1, int var2) {
      return this.aClass591Array_205[var1].method6405(-181874513);
   }

   public int method2269(Class187 var1, int var2) {
      return this.aClass608_202.method2269(var1, -390483690);
   }

   public Class416 method2280(int var1, byte var2) {
      Class416 var3 = this.aClass212_Sub2_204.method7527(var1, -212425491);
      return var3.aClass187_7903.aClass283_3201 != Class283.aClass283_4785?null:var3;
   }

   public Class187 method2281(Class283 var1, int var2, int var3) {
      return var1 != Class283.aClass283_4785?null:this.aClass212_Sub1_Sub1_203.method5503(var2, 824148490);
   }

   public Class23(Class212_Sub1_Sub1 var1, Class212_Sub2 var2, int var3) {
      this.aClass591Array_205 = new Class591[var3];
      this.aClass608_202 = new Class608();
      this.aClass212_Sub1_Sub1_203 = var1;
      this.aClass212_Sub2_204 = var2;
   }

   public int method6395(int var1, int var2) {
      return this.aClass591Array_205[var1].method6401(client.aBoolean_270?Class538.aClass538_9454:Class538.aClass538_9453, (byte)-64);
   }

   public int method2268(Class416 var1, int var2) {
      return this.aClass608_202.method2268(var1, 746591623);
   }

   static Class40[] method143(int var0) {
      return new Class40[]{Class40.aClass40_876, Class40.aClass40_874, Class40.aClass40_875, Class40.aClass40_877, Class40.aClass40_878};
   }

   public static void method144(int var0) {
      Class484.method5725(1375083315);
      Class316.method3897(22050, Class104_Sub21.renderSettings.aClass540_Sub9_7325.method1643(-1636632172) == 1, 2);
      Class15.aClass316_133 = Class316.method3896(Class51.clientCanvas, 0, 22050);
      ByteArrayDataNode.method4544(true, Class297.method3795((Class240_Sub41_Sub2)null, 1955631312), (byte)-102);
      Class306.aClass316_6036 = Class316.method3896(Class51.clientCanvas, 1, 2048);
      Class306.aClass316_6036.method3912(Class217.aClass240_Sub41_Sub4_3757);
   }

   static final void method145(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class474.method5669(var3, var4, var0, 1630876722);
   }

   static final void method146(RSInterfaceData var0, int var1) {
      FontRenderer_Sub3.method7365(-1979940682);
   }

   static final int method147(Class436 var0, int var1) {
      if(null == var0) {
         return 12;
      } else {
         switch(-666496225 * var0.anInt_8373) {
         case 1:
            return 20;
         default:
            return 12;
         }
      }
   }

   static final void method148(RSCharacter var0, RSCharacter var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, byte var9) {
      int var10 = var1.method3263(283571489);
      if(var10 != -1) {
         Sprite var11 = null;
         var11 = (Sprite)client.aClass627_329.getObject((long)var10);
         if(null == var11) {
            AbstractImageData[] var12 = ImageUtils.method1797(Class301.mmUnpacker, var10, 0);
            if(var12 == null) {
               return;
            }

            var11 = Class286.gameRenderer.loadSprite(var12[0], true);
            client.aClass627_329.insert(var11, (long)var10);
         }

         GameCoord gameCoord = var0.method6203().gameCoord;
         Class488.setScreenMarkerPos(var0.plane, (int)gameCoord.floatX, (int)gameCoord.floatZ, var0.method3257() * 256, 0, false, -1419668923);
         int var13 = (int)(client.calculatedPosition[0] + (float)var3 - 18.0F);
         int var14 = (int)((float)var4 + client.calculatedPosition[1] - 16.0F - 54.0F);
         var13 += 18 * (var2 / 4);
         var14 += 18 * (var2 % 4);
         var11.drawAt(var13, var14);
         if(var1 == var0) {
            Class286.gameRenderer.method1972(var13 - 1, var14 - 1, 18, 18, -256, 1436161556);
         }

         Class231_Sub4 var15 = Class103.method1332(-2089401804);
         var15.aClass563_Sub1_Sub4_Sub4_8093 = var1;
         var15.anInt_8091 = var13 * -1453794983;
         var15.anInt_8092 = 709396569 * var14;
         var15.anInt_8088 = (var13 + 16) * -1381265593;
         var15.anInt_8094 = (var14 + 16) * -2091526621;
         client.aClass512_402.method5931(var15, -12014405);
      }
   }
}
