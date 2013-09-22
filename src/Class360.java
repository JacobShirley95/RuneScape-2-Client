
public class Class360 {

   static final float[] aFloatArray_6795 = new float[16384];
   static final float[] aFloatArray_6796 = new float[16384];


   static {
      double var0 = 3.834951969714103E-4D;

      for(int var2 = 0; var2 < 16384; ++var2) {
         aFloatArray_6796[var2] = (float)Math.sin((double)var2 * var0);
         aFloatArray_6795[var2] = (float)Math.cos((double)var2 * var0);
      }

   }

   Class360() throws Throwable {
      throw new Error();
   }
}
