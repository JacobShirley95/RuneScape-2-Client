
public class Class402 {

   int anInt_7639;
   long aLong_7640;


   public final Class380 method4970(int var1) {
      return Class380.method4848(this.method4972(var1));
   }

   public final int method4971() {
      return this.anInt_7639;
   }

   final int method4972(int var1) {
      return (int)(this.aLong_7640 >> Class380.anInt_7365 * var1) & 15;
   }

   final void method4973(Class380 var1) {
      this.aLong_7640 |= (long)(var1.anInt_7366 << Class380.anInt_7365 * this.anInt_7639++);
   }

   Class402(Class380[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         this.method4973(var1[var2]);
      }

   }

   Class402(Class380 var1) {
      this.aLong_7640 = (long)var1.anInt_7366;
      this.anInt_7639 = 1;
   }
}
