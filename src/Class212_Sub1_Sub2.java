
public class Class212_Sub1_Sub2 extends Class212_Sub1 {

   final CacheDataUnpacker aCacheUnpacker_1959;
   final CacheNodeArrayList aClass627_1960 = new CacheNodeArrayList(64);


   public Class187 method5503(int var1, int var2) {
      CacheNodeArrayList var3 = this.aClass627_1960;
      synchronized(this.aClass627_1960) {
         Class187_Sub2 var4 = (Class187_Sub2)this.aClass627_1960.getObject((long)var1);
         if(var4 == null) {
            byte[] var5 = this.aCacheUnpacker_1959.getDataBytes(this.aClass283_8532.method3663(-2028557297).anInt_2347 * -851327023, var1, -1369100174);
            var4 = new Class187_Sub2(this.aClass283_8532, var1);
            if(var5 != null) {
               var4.method2290(new ByteArrayDataNode(var5), -2135287299);
            }

            this.aClass627_1960.insert(var4, (long)var1);
         }

         return var4;
      }
   }

   public void method1307(byte var1) {
      CacheNodeArrayList var2 = this.aClass627_1960;
      synchronized(this.aClass627_1960) {
         this.aClass627_1960.method6669(-748506764);
      }
   }

   public void method1308(int var1, short var2) {
      CacheNodeArrayList var3 = this.aClass627_1960;
      synchronized(this.aClass627_1960) {
         this.aClass627_1960.method6677(var1, -1234574848);
      }
   }

   public Class212_Sub1_Sub2(GamePack var1, Class283 var2, LanguagePack var3, CacheDataUnpacker var4) {
      super(var1, var2, var3, var4 != null?var4.method3575(var2.method3663(-872503756).anInt_2347 * -851327023, -1401325651):0);
      this.aCacheUnpacker_1959 = var4;
   }

   public void method1309(int var1) {
      CacheNodeArrayList var2 = this.aClass627_1960;
      synchronized(this.aClass627_1960) {
         this.aClass627_1960.method6665((byte)5);
      }
   }
}
