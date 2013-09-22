import java.lang.ref.SoftReference;

public class Class240_Sub22_Sub14_Sub2 extends Class240_Sub22_Sub14 {

   SoftReference aSoftReference_3196;


   boolean method2649(byte var1) {
      return true;
   }

   Object method2648(int var1) {
      return this.aSoftReference_3196.get();
   }

   Class240_Sub22_Sub14_Sub2(Object var1, int var2) {
      super(var2);
      this.aSoftReference_3196 = new SoftReference(var1);
   }
}
