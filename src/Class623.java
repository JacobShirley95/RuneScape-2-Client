import java.nio.ByteBuffer;
import java.util.Arrays;

public class Class623 implements Class551 {

   final int anInt_10033;
   static final Class623 aClass623_10034 = new Class623(1);
   static final Class623 aClass623_10035 = new Class623(2);
   static final Class623 aClass623_10036 = new Class623(3);
   static final Class623 aClass623_10037 = new Class623(0);
   static final Class623 aClass623_10038 = new Class623(5);
   static final Class623 aClass623_10039 = new Class623(4);


   public int getLanguageID(int var1) {
      return this.anInt_10033 * 107301611;
   }

   Class623(int var1) {
      this.anInt_10033 = var1 * 2107510211;
   }

   public static byte[] method6643(Object var0, int var1, int var2, int var3) {
      if(null == var0) {
         return null;
      } else if(var0 instanceof byte[]) {
         byte[] var6 = (byte[])((byte[])var0);
         return Arrays.copyOfRange(var6, var1, var2 + var1);
      } else if(var0 instanceof ByteBuffer) {
         ByteBuffer var4 = (ByteBuffer)var0;
         byte[] var5 = new byte[var2];
         var4.position(var1);
         var4.get(var5, 0, var2);
         return var5;
      } else {
         throw new IllegalArgumentException();
      }
   }

   static final void method6644(RSInterfaceData var0, short var1) {
      LanguagePack.method5992(var0, (short)255);
   }
}
