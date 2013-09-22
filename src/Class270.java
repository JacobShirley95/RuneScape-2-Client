
public final class Class270 implements Comparable {

   long aLong_4678;
   Object anObject_4679;
   long aLong_4680;
   Object anObject_4681;
   public static int anInt_4682;


   public int hashCode() {
      return this.anObject_4681.hashCode();
   }

   public boolean equals(Object var1) {
      if(var1 instanceof Class270) {
         return this.anObject_4681.equals(((Class270)var1).anObject_4681);
      } else {
         throw new IllegalArgumentException();
      }
   }

   Class270(Object var1, Object var2) {
      this.anObject_4679 = var1;
      this.anObject_4681 = var2;
   }

   public int compareTo(Object var1) {
      return this.method3553((Class270)var1, 1018399648);
   }

   int method3553(Class270 var1, int var2) {
      return -2911428130061003875L * this.aLong_4678 < var1.aLong_4678 * -2911428130061003875L?-1:(this.aLong_4678 * -2911428130061003875L > -2911428130061003875L * var1.aLong_4678?1:0);
   }

   static final void method3554(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class104_Sub21.renderSettings.aClass540_Sub29_7312.getToolkitID();
   }

   static final void method3555(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class104_Sub21.renderSettings.aClass540_Sub30_7314.method4346(1199090811);
   }
}
