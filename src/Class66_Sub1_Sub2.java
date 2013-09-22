
public class Class66_Sub1_Sub2 extends Class66_Sub1 {

   float method2792(float var1, float var2, float var3, short var4) {
      float var5 = var1 - this.aFloat_3791;
      if(this.aClass43_1256.method389((byte)-41).floatX == Float.POSITIVE_INFINITY) {
         var2 = this.aClass43_1256.method380(1382199582).getHyp();
      } else {
         float var6 = var2 / this.aClass43_1256.method389((byte)-124).getHyp();
         float var7 = var2 / 2.0F * var6;
         if(var7 > var5) {
            var2 -= this.aClass43_1256.method389((byte)-116).getHyp() * var3;
            if(var2 < 0.0F) {
               var2 = 0.0F;
            }
         } else if(var2 < this.aClass43_1256.method380(-2125325550).getHyp()) {
            var2 += this.aClass43_1256.method389((byte)-26).getHyp() * var3;
            if(var2 > this.aClass43_1256.method380(1106033274).getHyp()) {
               var2 = this.aClass43_1256.method380(-865447200).getHyp();
            }
         }
      }

      return var2;
   }

   public Class66_Sub1_Sub2(Class43 var1) {
      super(var1);
   }

   void method2790(ByteArrayDataNode var1, int var2) {}

   static void method686(ConnectionHandler var0, RSInterface var1, int var2, int var3, int var4, int var5) {
      Class240_Sub27 var6;
      if(1 == var2) {
         var6 = Class47_Sub1.method3496(Class326.aClass326_6289, var0.aClass528_3433, 1917447504);
         Class457.method5551(var6, var3, var4, var1.itemID * 2142376247, -2020610454);
         var0.addPacket(var6, 1738004995);
      }

      if(var2 == 2) {
         var6 = Class47_Sub1.method3496(Class326.aClass326_6301, var0.aClass528_3433, 1917447504);
         Class457.method5551(var6, var3, var4, 2142376247 * var1.itemID, -728813887);
         var0.addPacket(var6, 966144725);
      }

      if(var2 == 3) {
         var6 = Class47_Sub1.method3496(Class326.aClass326_6230, var0.aClass528_3433, 1917447504);
         Class457.method5551(var6, var3, var4, var1.itemID * 2142376247, 1916605437);
         var0.addPacket(var6, 95498887);
      }

      if(var2 == 4) {
         var6 = Class47_Sub1.method3496(Class326.aClass326_6288, var0.aClass528_3433, 1917447504);
         Class457.method5551(var6, var3, var4, var1.itemID * 2142376247, 102031410);
         var0.addPacket(var6, 1220591442);
      }

      if(5 == var2) {
         var6 = Class47_Sub1.method3496(Class326.aClass326_6325, var0.aClass528_3433, 1917447504);
         Class457.method5551(var6, var3, var4, 2142376247 * var1.itemID, 321208423);
         var0.addPacket(var6, 1011130855);
      }

      if(var2 == 6) {
         var6 = Class47_Sub1.method3496(Class326.aClass326_6314, var0.aClass528_3433, 1917447504);
         Class457.method5551(var6, var3, var4, 2142376247 * var1.itemID, -1519968587);
         var0.addPacket(var6, 1309734537);
      }

      if(var2 == 7) {
         var6 = Class47_Sub1.method3496(Class326.aClass326_6281, var0.aClass528_3433, 1917447504);
         Class457.method5551(var6, var3, var4, var1.itemID * 2142376247, -587246310);
         var0.addPacket(var6, 706896991);
      }

      if(8 == var2) {
         var6 = Class47_Sub1.method3496(Class326.aClass326_6269, var0.aClass528_3433, 1917447504);
         Class457.method5551(var6, var3, var4, var1.itemID * 2142376247, 186444675);
         var0.addPacket(var6, 924779155);
      }

      if(9 == var2) {
         var6 = Class47_Sub1.method3496(Class326.aClass326_6238, var0.aClass528_3433, 1917447504);
         Class457.method5551(var6, var3, var4, 2142376247 * var1.itemID, -1359143746);
         var0.addPacket(var6, 2030782157);
      }

      if(10 == var2) {
         var6 = Class47_Sub1.method3496(Class326.aClass326_6328, var0.aClass528_3433, 1917447504);
         Class457.method5551(var6, var3, var4, var1.itemID * 2142376247, -1045244174);
         var0.addPacket(var6, 247827556);
      }

   }
}
