
public class Class174_Sub1_Sub3 extends Class174_Sub1 {

   Class204 aClass204_1970;
   Class203 aClass203_1971;
   SoftwareRenderer aRenderer_Sub1_1972;
   int anInt_1973 = 0;
   int anInt_1974 = 0;


   public int method2194() {
      return this.anInt_1973 * 1299377265;
   }

   public int method2198() {
      return this.anInt_1974 * 916205487;
   }

   public void method7327(int var1, Class101 var2) {
      if(var1 != 0) {
         throw new RuntimeException();
      } else {
         Class204 var3 = (Class204)var2;
         if(null != this.aClass203_1971 && var3 != null && (this.aClass203_1971.anInt_3527 * -185716297 != var3.anInt_3535 * 495916587 || var3.anInt_3533 * 1276366583 != this.aClass203_1971.anInt_3528 * 1458984769)) {
            throw new RuntimeException();
         } else {
            this.aClass204_1970 = var3;
            if(null != var3) {
               this.anInt_1973 = var3.anInt_3535 * 1355983451;
               this.anInt_1974 = -240574663 * var3.anInt_3533;
            } else if(this.aClass203_1971 == null) {
               this.anInt_1973 = 0;
               this.anInt_1974 = 0;
            }

            if(this == this.aRenderer_Sub1_1972.method1896(48552145)) {
               this.method2196();
            }

         }
      }
   }

   public boolean method7330() {
      return true;
   }

   boolean method2197() {
      return true;
   }

   public void method7328(Class99 var1) {
      Class203 var2 = (Class203)var1;
      if(this.aClass204_1970 != null && var2 != null && (var2.anInt_3527 * -185716297 != this.aClass204_1970.anInt_3535 * 495916587 || var2.anInt_3528 * 1458984769 != this.aClass204_1970.anInt_3533 * 1276366583)) {
         throw new RuntimeException();
      } else {
         this.aClass203_1971 = var2;
         if(var2 != null) {
            this.anInt_1973 = var2.anInt_3527 * 1767847079;
            this.anInt_1974 = -1612696561 * var2.anInt_3528;
         } else if(null == this.aClass204_1970) {
            this.anInt_1973 = 0;
            this.anInt_1974 = 0;
         }

         if(this == this.aRenderer_Sub1_1972.method1896(-1921499478)) {
            this.method2196();
         }

      }
   }

   public void method2195() {}

   Class174_Sub1_Sub3(SoftwareRenderer var1) {
      this.aRenderer_Sub1_1972 = var1;
   }

   public void method7329(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7, boolean var8) {
      int[] var9 = null;
      int[] var10 = null;
      float[] var11 = null;
      float[] var12 = null;
      if(var7 && null != this.aClass204_1970) {
         var9 = this.aClass204_1970.anIntArray_3534;
         var10 = this.aRenderer_Sub1_1972.renderArray;
      }

      if(var8 && this.aClass203_1971 != null) {
         var11 = this.aClass203_1971.aFloatArray_3529;
         var12 = this.aRenderer_Sub1_1972.aFloatArray_10159;
      }

      Class95.method1237(this.anInt_1973 * 1299377265, 1176497263 * this.aRenderer_Sub1_1972.renderWidth, var9, var10, var11, var12, var1, var2, var5, var6, var3, var4, 209911416);
   }

   boolean method2196() {
      this.aRenderer_Sub1_1972.method6750(1299377265 * this.anInt_1973, 916205487 * this.anInt_1974, this.aClass204_1970 == null?null:this.aClass204_1970.anIntArray_3534, null == this.aClass203_1971?null:this.aClass203_1971.aFloatArray_3529);
      return true;
   }

   static final void method1342(RSInterfaceData var0, byte var1) {
      long var2 = Class373.getCurrentTime((short)32119);
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = (int)(var2 / 86400000L) - 11745;
   }
}
