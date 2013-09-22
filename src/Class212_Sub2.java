import java.util.Map;

public class Class212_Sub2 extends Class212 {

   CacheNodeArrayList aClass627_10905 = new CacheNodeArrayList(64);
   public static final int anInt_10906 = 64;
   final Map aMap_10907;
   final CacheDataUnpacker aCacheUnpacker_10908;


   public void method7526(int var1) {
      CacheNodeArrayList var2 = this.aClass627_10905;
      synchronized(this.aClass627_10905) {
         this.aClass627_10905.method6665((byte)5);
      }
   }

   public Class416 method7527(int var1, int var2) {
      CacheNodeArrayList var3 = this.aClass627_10905;
      synchronized(this.aClass627_10905) {
         Class416 var4 = (Class416)this.aClass627_10905.getObject((long)var1);
         if(null == var4) {
            byte[] var5 = this.aCacheUnpacker_10908.getDataBytes(-851327023 * Class124.aClass124_2339.anInt_2347, var1, 365060460);
            var4 = new Class416();
            var4.anInt_7906 = var1 * -372599759;
            var4.aClass212_Sub2_7902 = this;
            if(var5 != null) {
               var4.method5144(new ByteArrayDataNode(var5), false, (byte)21);
            }

            this.aClass627_10905.insert(var4, (long)var1);
         }

         return var4;
      }
   }

   public void method7528(int var1) {
      CacheNodeArrayList var2 = this.aClass627_10905;
      synchronized(this.aClass627_10905) {
         this.aClass627_10905.method6669(841033199);
      }
   }

   public void method7529(int var1, int var2) {
      CacheNodeArrayList var3 = this.aClass627_10905;
      synchronized(this.aClass627_10905) {
         this.aClass627_10905.method6677(var1, -1936099180);
      }
   }

   public void method7530(int var1, short var2) {
      CacheNodeArrayList var3 = this.aClass627_10905;
      synchronized(this.aClass627_10905) {
         this.aClass627_10905.method6669(2145212896);
         this.aClass627_10905 = new CacheNodeArrayList(var1);
      }
   }

   public Class212_Sub2(GamePack var1, LanguagePack var2, CacheDataUnpacker var3, Map var4) {
      super(var1, var2, null != var3?var3.method3575(-851327023 * Class124.aClass124_2339.anInt_2347, -851728429):0);
      this.aCacheUnpacker_10908 = var3;
      this.aMap_10907 = var4;
   }

   static int method7531(RSInterface var0, int var1, byte var2) {
      return !client.method174(var0).method4998(var1, -1348534751) && null == var0.anObjectArray_2572?-1:(null != var0.anIntArray_2517 && var0.anIntArray_2517.length > var1?var0.anIntArray_2517[var1]:-1);
   }
}
