import java.util.zip.Inflater;

public class Class433 {

   static CacheDataUnpacker aCacheDataUnpacker_8343;
   static RSFont aRSFont_8344;
   Inflater anInflater_8345;


   public Class433() {
      this(-1, 1000000, 1000000);
   }

   Class433(int var1, int var2, int var3) {}

   public byte[] method5414(byte[] var1, byte var2) {
      ByteArrayDataNode var3 = new ByteArrayDataNode(var1);
      var3.index = -2043502829 * (var1.length - 4);
      int var4 = var3.method4481(-2137047678);
      byte[] var5 = new byte[var4];
      var3.index = 0;
      this.method5415(var3, var5, 65466768);
      return var5;
   }

   public void method5415(ByteArrayDataNode var1, byte[] var2, int var3) {
      if(31 == var1.data[964952859 * var1.index] && -117 == var1.data[1 + 964952859 * var1.index]) {
         if(null == this.anInflater_8345) {
            this.anInflater_8345 = new Inflater(true);
         }

         try {
            this.anInflater_8345.setInput(var1.data, 10 + 964952859 * var1.index, var1.data.length - (8 + 964952859 * var1.index + 10));
            this.anInflater_8345.inflate(var2);
         } catch (Exception var5) {
            this.anInflater_8345.reset();
            throw new RuntimeException("");
         }

         this.anInflater_8345.reset();
      } else {
         throw new RuntimeException("");
      }
   }

   public static int method5416(String var0, int var1) {
      return var0.length() + 2;
   }
}
