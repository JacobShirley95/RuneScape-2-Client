
public class Class34_Sub2_Sub1 extends Class34_Sub2 {

   Class34_Sub2_Sub1(CacheDataUnpacker var1, CacheDataUnpacker var2, Class409_Sub1_Sub1 var3) {
      super(var1, var2, var3);
   }

   void method2740(int var1, int var2, int var3, int var4, byte var5) {
      int var6 = this.aClass170_3766.getFurthestX();
      int var7 = ((Class409_Sub1_Sub1)this.aClass409_827).anInt_1358 * 1157139655 * Class6.method36(-555926792) / 10 % var6;
      this.aClass170_3766.method2131(var7 + (var1 - var6), var2, var6 + var3 - var7, var4);
   }

   static void method555(RSInterfaceGroup var0, int var1, int var2, int var3, boolean var4, RSInterfaceData var5, int var6) {
      if(0 == var2) {
         throw new RuntimeException();
      } else {
         RSInterface var7 = var0.interfaceArray[var1];
         if(var7.aClass132Array_2579 == null) {
            var7.aClass132Array_2579 = new RSInterface[var3 + 1];
            var7.children = var7.aClass132Array_2579;
         }

         if(var7.aClass132Array_2579.length <= var3) {
            RSInterface[] var8;
            if(var7.aClass132Array_2579 == var7.children) {
               var8 = new RSInterface[1 + var3];

               for(int var9 = 0; var9 < var7.aClass132Array_2579.length; ++var9) {
                  var8[var9] = var7.aClass132Array_2579[var9];
               }

               var7.aClass132Array_2579 = var7.children = var8;
            } else {
               var8 = new RSInterface[var3 + 1];
               RSInterface[] var13 = new RSInterface[1 + var3];

               for(int var10 = 0; var10 < var7.aClass132Array_2579.length; ++var10) {
                  var8[var10] = var7.aClass132Array_2579[var10];
                  var13[var10] = var7.children[var10];
               }

               var7.aClass132Array_2579 = var8;
               var7.children = var13;
            }
         }

         if(var3 > 0 && null == var7.aClass132Array_2579[var3 - 1]) {
            throw new RuntimeException("" + (var3 - 1));
         } else {
            RSInterface var11 = new RSInterface();
            var11.index = 1526735491 * var2;
            var11.parentID = (var11.cacheID = 1 * var7.cacheID) * 1879864767;
            var11.anInt_2428 = 1080580731 * var3;
            var7.aClass132Array_2579[var3] = var11;
            if(var7.children != var7.aClass132Array_2579) {
               var7.children[var3] = var11;
            }

            Class552 var12;
            if(var4) {
               var12 = var5.aClass552_9506;
            } else {
               var12 = var5.aClass552_9492;
            }

            var12.aClass112_9523 = var0;
            var12.aClass132_9524 = var11;
            Class110_Sub1.method3149(var7, 1659192205);
         }
      }
   }
}
