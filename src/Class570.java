
public class Class570 implements Class169 {

   Class68 aClass68_9633;


   public Object method2117(Class187 var1, byte var2) {
      if(Class373.aClass373_7051 != var1.aClass373_3197) {
         throw new IllegalArgumentException("");
      } else {
         return this.aClass68_9633.method694(-265238991 * client.currentGamePack.anInt_9269 << 16 | -1982395567 * var1.anInt_3198, 1099572643);
      }
   }

   public int method2269(Class187 var1, int var2) {
      Integer var3 = this.aClass68_9633.method707(-265238991 * client.currentGamePack.anInt_9269 << 16 | var1.anInt_3198 * -1982395567, -106620481);
      return var3 == null?((Integer)var1.method2292(-601658282)).intValue():var3.intValue();
   }

   public void method2106(Class187 var1, long var2) {
      throw new UnsupportedOperationException();
   }

   public int method2268(Class416 var1, int var2) {
      return var1.method5146(this.method2269(var1.aClass187_7903, -390483690), (byte)76);
   }

   public void method2111(Class187 var1, int var2, int var3) {
      throw new UnsupportedOperationException();
   }

   public long method2094(Class187 var1, int var2) {
      Long var3 = this.aClass68_9633.method698(client.currentGamePack.anInt_9269 * -265238991 << 16 | -1982395567 * var1.anInt_3198, (short)-1413);
      return var3 == null?((Long)var1.method2292(1405373317)).longValue():var3.longValue();
   }

   public void method2093(Class416 var1, int var2, int var3) {
      throw new UnsupportedOperationException();
   }

   Class570(Class68 var1) {
      this.aClass68_9633 = var1;
   }

   public void method2097(Class187 var1, Object var2, byte var3) {
      throw new UnsupportedOperationException();
   }

   public static byte[] method6262(byte[] var0, int var1) {
      if(null == var0) {
         return null;
      } else {
         byte[] var2 = new byte[var0.length];
         System.arraycopy(var0, 0, var2, 0, var0.length);
         return var2;
      }
   }
}
