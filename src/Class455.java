
public class Class455 {

   final CacheDataUnpacker aCacheUnpacker_8558;
   int anInt_8559;
   Class240_Sub22_Sub2[] aClass240_Sub22_Sub2Array_8560;


   public Class455(GamePack var1, LanguagePack var2, CacheDataUnpacker var3, boolean var4) {
      this.aCacheUnpacker_8558 = var3;
      int var5 = this.aCacheUnpacker_8558.method3581((short)1656) - 1;
      this.anInt_8559 = (var5 * Class124.aClass124_2302.method1574(556295195) + this.aCacheUnpacker_8558.method3575(var5, -2078716052)) * 1995650009;
      if(var4) {
         this.aClass240_Sub22_Sub2Array_8560 = new Class240_Sub22_Sub2[1756634217 * this.anInt_8559];

         for(int var6 = 0; var6 < this.anInt_8559 * 1756634217; ++var6) {
            CacheDataUnpacker var7 = this.aCacheUnpacker_8558;
            byte[] var8;
            synchronized(this.aCacheUnpacker_8558) {
               var8 = this.aCacheUnpacker_8558.getDataBytes(Class124.aClass124_2302.method1575(var6, 23382859), Class124.aClass124_2302.method1573(var6, (byte)14), -956990268);
            }

            Class240_Sub22_Sub2 var11 = new Class240_Sub22_Sub2();
            if(var8 != null) {
               var11.method235(new ByteArrayDataNode(var8), -1177838476);
            }

            this.aClass240_Sub22_Sub2Array_8560[var6] = var11;
         }
      }

   }

   public Class240_Sub22_Sub2 method5541(int var1, int var2) {
      return var1 < 0?new Class240_Sub22_Sub2():this.aClass240_Sub22_Sub2Array_8560[var1];
   }
}
