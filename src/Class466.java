
public class Class466 {

   final CacheDataUnpacker aCacheUnpacker_8679;
   final CacheNodeArrayList aClass627_8680 = new CacheNodeArrayList(128);


   public Class466(GamePack var1, LanguagePack var2, CacheDataUnpacker var3) {
      this.aCacheUnpacker_8679 = var3;
      if(null != this.aCacheUnpacker_8679) {
         int var4 = this.aCacheUnpacker_8679.method3581((short)-30809) - 1;
         Class124.aClass124_2343.method1574(-1910078953);
         this.aCacheUnpacker_8679.method3575(var4, -1182607408);
      }

   }

   public Class470 method5614(int var1, byte var2) {
      CacheNodeArrayList var3 = this.aClass627_8680;
      Class470 var4;
      synchronized(this.aClass627_8680) {
         var4 = (Class470)this.aClass627_8680.getObject((long)var1);
      }

      if(null != var4) {
         return var4;
      } else {
         byte[] var9 = this.aCacheUnpacker_8679.getDataBytes(Class124.aClass124_2343.method1575(var1, -685219600), Class124.aClass124_2343.method1573(var1, (byte)126), -391973565);
         var4 = new Class470();
         if(null != var9) {
            var4.method5649(new ByteArrayDataNode(var9), (byte)51);
         }

         CacheNodeArrayList var5 = this.aClass627_8680;
         synchronized(this.aClass627_8680) {
            this.aClass627_8680.insert(var4, (long)var1);
            return var4;
         }
      }
   }

   static final void method5615(RSInterfaceData var0, short var1) {
      var0.intTypeIndex -= -2124084621;
      Class374.method4755(var0.intTypes[var0.intTypeIndex * -831324111], var0.intTypes[var0.intTypeIndex * -831324111 + 1], var0.intTypes[2 + var0.intTypeIndex * -831324111], 255, 256, -952603512);
   }

   static final void method5616(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class509.anInt_9182 * 1735950531 == 3?1:0;
   }
}
