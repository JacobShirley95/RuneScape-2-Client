
public class Class212_Sub1_Sub1 extends Class212_Sub1 {

   static int hintHeadicons;
   final CacheNodeArrayList aClass627_1757 = new CacheNodeArrayList(64);
   final CacheDataUnpacker aCacheUnpacker_1758;


   public void method1134(int var1, byte var2) {
      CacheNodeArrayList var3 = this.aClass627_1757;
      synchronized(this.aClass627_1757) {
         this.aClass627_1757.method6677(var1, -2020817527);
      }
   }

   public Class187 method5503(int var1, int var2) {
      CacheNodeArrayList var3 = this.aClass627_1757;
      synchronized(this.aClass627_1757) {
         Class187_Sub1 var4 = (Class187_Sub1)this.aClass627_1757.getObject((long)var1);
         if(null == var4) {
            byte[] var5 = this.aCacheUnpacker_1758.getDataBytes(this.aClass283_8532.method3663(1141835508).anInt_2347 * -851327023, var1, 252896693);
            var4 = new Class187_Sub1(this.aClass283_8532, var1);
            if(var5 != null) {
               var4.method2290(new ByteArrayDataNode(var5), -57532105);
            }

            this.aClass627_1757.insert(var4, (long)var1);
         }

         return var4;
      }
   }

   public void method1136(byte var1) {
      CacheNodeArrayList var2 = this.aClass627_1757;
      synchronized(this.aClass627_1757) {
         this.aClass627_1757.method6669(-1899286867);
      }
   }

   public void method1137(int var1) {
      CacheNodeArrayList var2 = this.aClass627_1757;
      synchronized(this.aClass627_1757) {
         this.aClass627_1757.method6665((byte)5);
      }
   }

   public Class212_Sub1_Sub1(GamePack var1, Class283 var2, LanguagePack var3, CacheDataUnpacker var4) {
      super(var1, var2, var3, null != var4?var4.method3575(var2.method3663(-250954214).anInt_2347 * -851327023, -883996404):0);
      this.aCacheUnpacker_1758 = var4;
   }

   public static void method1138(int var0, int var1) {
      Class240_Sub22_Sub5 var2 = Class65_Sub1_Sub2.method866(15, (long)var0);
      var2.method597((byte)0);
   }
}
