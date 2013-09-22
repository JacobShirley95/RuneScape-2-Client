import java.lang.ref.SoftReference;

public class Class240_Sub22_Sub13_Sub1 extends Class240_Sub22_Sub13 {

   SoftReference aSoftReference_3096;


   Object method2646() {
      return this.aSoftReference_3096.get();
   }

   boolean method2647() {
      return true;
   }

   Class240_Sub22_Sub13_Sub1(Class622 var1, Object var2, int var3) {
      super(var1, var3);
      this.aSoftReference_3096 = new SoftReference(var2);
   }
}
