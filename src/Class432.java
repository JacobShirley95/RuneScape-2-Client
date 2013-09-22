
public class Class432 implements Class208 {

   final CacheDataUnpacker aCacheUnpacker_8340;
   final CacheNodeArrayList aClass627_8341 = new CacheNodeArrayList(64);
   static int anInt_8342;


   public Class432(GamePack var1, LanguagePack var2, CacheDataUnpacker var3) {
      this.aCacheUnpacker_8340 = var3;
      this.aCacheUnpacker_8340.method3575(Class124.aClass124_2281.anInt_2347 * -851327023, -1543160982);
   }

   public Class240_Sub22_Sub17 method5411(int var1, int var2) {
      CacheNodeArrayList var3 = this.aClass627_8341;
      Class240_Sub22_Sub17 var4;
      synchronized(this.aClass627_8341) {
         var4 = (Class240_Sub22_Sub17)this.aClass627_8341.getObject((long)var1);
      }

      if(null != var4) {
         return var4;
      } else {
         CacheDataUnpacker var5 = this.aCacheUnpacker_8340;
         byte[] var12;
         synchronized(this.aCacheUnpacker_8340) {
            var12 = this.aCacheUnpacker_8340.getDataBytes(-851327023 * Class124.aClass124_2281.anInt_2347, var1, -1867366498);
         }

         var4 = new Class240_Sub22_Sub17();
         if(null != var12) {
            var4.method5453(new ByteArrayDataNode(var12), 1298239603);
         }

         CacheNodeArrayList var11 = this.aClass627_8341;
         synchronized(this.aClass627_8341) {
            this.aClass627_8341.insert(var4, (long)var1);
            return var4;
         }
      }
   }

   static InterfaceDataComposite getInterfaceComposite(Class434 var0, int var1, int var2, int var3) {
      int index = var0.type * -332091937 | var1 << 10;
      InterfaceDataComposite var5 = (InterfaceDataComposite)Class568.aClass603_9631.method6504((long)index << 16);
      if(null != var5) {
         return var5;
      } else {
         byte[] interfaceData = Class215.aCacheUnpacker_3739.method3566(Class215.aCacheUnpacker_3739.method3569(index, -1299258361), 1364214782);
         if(interfaceData != null) {
            if(interfaceData.length <= 1) {
               return null;
            } else {
               try {
                  var5 = PlayerComposite.createInterfaceComposite(interfaceData, 1016336142);
               } catch (Exception var8) {
                  throw new RuntimeException(var8.getMessage() + " " + index);
               }

               var5.type = var0;
               Class568.aClass603_9631.method6505(var5, (long)index << 16);
               return var5;
            }
         } else {
            index = var0.type * -332091937 | 65536 + var2 << 10;
            var5 = (InterfaceDataComposite)Class568.aClass603_9631.method6504((long)index << 16);
            if(null != var5) {
               return var5;
            } else {
               interfaceData = Class215.aCacheUnpacker_3739.method3566(Class215.aCacheUnpacker_3739.method3569(index, 21158423), 321170799);
               if(null != interfaceData) {
                  if(interfaceData.length <= 1) {
                     return null;
                  } else {
                     try {
                        var5 = PlayerComposite.createInterfaceComposite(interfaceData, 1675574444);
                     } catch (Exception var9) {
                        throw new RuntimeException(var9.getMessage() + " " + index);
                     }

                     var5.type = var0;
                     Class568.aClass603_9631.method6505(var5, (long)index << 16);
                     return var5;
                  }
               } else {
                  index = -332091937 * var0.type | 67107840;
                  var5 = (InterfaceDataComposite)Class568.aClass603_9631.method6504((long)index << 16);
                  if(var5 != null) {
                     return var5;
                  } else {
                     interfaceData = Class215.aCacheUnpacker_3739.method3566(Class215.aCacheUnpacker_3739.method3569(index, -1872747657), 145212465);
                     if(interfaceData != null) {
                        if(interfaceData.length <= 1) {
                           return null;
                        } else {
                           try {
                              var5 = PlayerComposite.createInterfaceComposite(interfaceData, 1982629848);
                           } catch (Exception var10) {
                              throw new RuntimeException(var10.getMessage() + " " + index);
                           }

                           var5.type = var0;
                           Class568.aClass603_9631.method6505(var5, (long)index << 16);
                           return var5;
                        }
                     } else {
                        return null;
                     }
                  }
               }
            }
         }
      }
   }

   static final void method5413(RSInterfaceData var0, byte var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class540_Sub11.method1662(var3, var4, var0, 1229391074);
   }
}
