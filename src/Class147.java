
public class Class147 {

   static final float[] aFloatArray_2717 = new float[16384];
   static final float[] aFloatArray_2718 = new float[16384];


   Class147() throws Throwable {
      throw new Error();
   }

   static {
      double var0 = 3.834951969714103E-4D;

      for(int var2 = 0; var2 < 16384; ++var2) {
         aFloatArray_2718[var2] = (float)Math.sin((double)var2 * var0);
         aFloatArray_2717[var2] = (float)Math.cos((double)var2 * var0);
      }

   }
}
