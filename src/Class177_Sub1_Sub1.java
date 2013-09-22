
public class Class177_Sub1_Sub1 extends Class177_Sub1 {

   static final int[] anIntArray_1270 = new int[6];
   Class398 aClass398_1271;
   final Renderer_Sub3 aRenderer_Sub3_1272;
   static final int[][] anIntArrayArray_1273 = new int[6][];
   final int anInt_1274;


   Class177_Sub1_Sub1(Renderer_Sub3 var1, int var2) {
      this.aRenderer_Sub3_1272 = var1;
      this.anInt_1274 = var2;
   }

   Class398 method7123() {
      if(this.aClass398_1271 == null) {
         Class96 var1 = this.aRenderer_Sub3_1272.aClass96_2801;
         Class183 var2 = this.aRenderer_Sub3_1272.aClass163_2802.method1996(this.anInt_1274, (byte)2);
         if(var2 == null) {
            return null;
         }

         if(var2.anIntArray_3147 == null) {
            return null;
         }

         anIntArray_1270[0] = var2.anIntArray_3147[0];
         anIntArray_1270[1] = var2.anIntArray_3147[1];
         anIntArray_1270[2] = var2.anIntArray_3147[2];
         anIntArray_1270[3] = var2.anIntArray_3147[3];
         anIntArray_1270[4] = var2.anIntArray_3147[4];
         anIntArray_1270[5] = var2.anIntArray_3147[5];

         int var3;
         for(var3 = 0; var3 < 6; ++var3) {
            if(anIntArray_1270[var3] < 0) {
               return null;
            }

            if(!var1.method1263(anIntArray_1270[var3], Class610.aClass610_9944, 1.0F, var2.anInt_3112 * -1446355517, var2.anInt_3112 * -1446355517, false, (byte)84)) {
               return null;
            }
         }

         var3 = 0;

         while(true) {
            if(var3 < 6) {
               anIntArrayArray_1273[var3] = var1.method1251(anIntArray_1270[var3], 1.0F, var2.anInt_3112 * -1446355517, var2.anInt_3112 * -1446355517, false, -1858461599);
               if(anIntArrayArray_1273[var3] != null && anIntArrayArray_1273[var3].length == var2.anInt_3112 * -1446355517 * var2.anInt_3112 * -1446355517) {
                  ++var3;
                  continue;
               }

               return null;
            }

            this.aClass398_1271 = this.aRenderer_Sub3_1272.method7220(var2.anInt_3112 * -1446355517, var2.aByte_3143 != 0, anIntArrayArray_1273);
            break;
         }
      }

      return this.aClass398_1271;
   }

}
