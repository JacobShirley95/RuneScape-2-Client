
public class Class362 {

   public static final int anInt_6807 = 1024;
   public static final int anInt_6808 = 16383;
   public static final int anInt_6809 = 2048;
   public static final int anInt_6810 = 8192;
   public static final int anInt_6811 = 16384;
   public static final int anInt_6812 = 16383;
   public static final int anInt_6813 = 14;
   public static final int anInt_6814 = 14;
   public static final double aDouble_6815 = 2607.5945876176133D;
   public static final int anInt_6816 = 4096;
   public static final int anInt_6817 = 6144;
   public static final int anInt_6818 = 12288;
   public static final int anInt_6819 = 10240;
   public static final int anInt_6820 = 16384;
   public static final int anInt_6821 = 14336;
   public static final int anInt_6822 = 16384;
   public static final int[] cosArray = new int[16384];
   public static final int[] sinArray = new int[16384];


   public static float toRadians(int var0) {
      var0 &= 16383;
      return (float)((double)((float)var0 / 16384.0F) * 6.283185307179586D);
   }

   Class362() throws Throwable {
      throw new Error();
   }

   static {
      double var0 = 3.834951969714103E-4D;

      for(int var2 = 0; var2 < 16384; ++var2) {
         cosArray[var2] = (int)(16384.0D * Math.sin((double)var2 * var0));
         sinArray[var2] = (int)(16384.0D * Math.cos((double)var2 * var0));
      }

   }
}
