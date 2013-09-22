
public class Class177_Sub2_Sub1 extends Class177_Sub2 {

   static final int[] anIntArray_1793 = new int[6];
   OGLTexture_Sub2 anOGLTexture_Sub2_1794;
   final OpenGLRenderer aRenderer_Sub2_1795;
   final int anInt_1796;
   static final int[][] anIntArrayArray_1797 = new int[6][];


   OGLTexture_Sub2 method7357() {
      if(this.anOGLTexture_Sub2_1794 == null) {
         Class96 var1 = this.aRenderer_Sub2_1795.aClass96_2801;
         Class183 var2 = this.aRenderer_Sub2_1795.aClass163_2802.method1996(this.anInt_1796, (byte)2);
         if(var2 == null) {
            return null;
         }

         if(var2.anIntArray_3147 == null) {
            return null;
         }

         anIntArray_1793[0] = var2.anIntArray_3147[0];
         anIntArray_1793[1] = var2.anIntArray_3147[1];
         anIntArray_1793[2] = var2.anIntArray_3147[2];
         anIntArray_1793[3] = var2.anIntArray_3147[3];
         anIntArray_1793[4] = var2.anIntArray_3147[4];
         anIntArray_1793[5] = var2.anIntArray_3147[5];

         int var3;
         for(var3 = 0; var3 < 6; ++var3) {
            if(anIntArray_1793[var3] < 0) {
               return null;
            }

            if(!var1.method1263(anIntArray_1793[var3], Class610.aClass610_9944, 1.0F, var2.anInt_3112 * -1446355517, var2.anInt_3112 * -1446355517, false, (byte)15)) {
               return null;
            }
         }

         var3 = 0;

         while(true) {
            if(var3 < 6) {
               anIntArrayArray_1797[var3] = var1.method1251(anIntArray_1793[var3], 1.0F, var2.anInt_3112 * -1446355517, var2.anInt_3112 * -1446355517, false, -749503286);
               if(anIntArrayArray_1797[var3] != null && anIntArrayArray_1797[var3].length == var2.anInt_3112 * -1446355517 * var2.anInt_3112 * -1446355517) {
                  ++var3;
                  continue;
               }

               return null;
            }

            this.anOGLTexture_Sub2_1794 = new OGLTexture_Sub2(this.aRenderer_Sub2_1795, Class136.aClass136_2627, Class87.aClass87_1759, var2.anInt_3112 * -1446355517, var2.aByte_3143 != 0, anIntArrayArray_1797);
            break;
         }
      }

      return this.anOGLTexture_Sub2_1794;
   }

   Class177_Sub2_Sub1(OpenGLRenderer var1, int var2) {
      this.aRenderer_Sub2_1795 = var1;
      this.anInt_1796 = var2;
   }

}
