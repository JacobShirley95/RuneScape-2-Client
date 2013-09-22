import java.io.IOException;

public class Class254_Sub1 extends Class254 {

   int anInt_6480;
   final byte[][] aByteArrayArray_6481 = new byte[10][];
   final CacheDataUnpacker aCacheUnpacker_6482;
   final int anInt_6483;
   int[] anIntArray_6484;
   final ByteArrayDataNode aClass240_Sub8_6485 = new ByteArrayDataNode((byte[])null);
   final ByteArrayDataNode aClass240_Sub8_6486 = new ByteArrayDataNode((byte[])null);
   static final int anInt_6487 = 10;


   public void method4160(byte var1) {
      if(null != this.anIntArray_6484) {
         for(int var2 = 0; var2 < 10 && 343375507 * this.anInt_6480 + var2 < this.anIntArray_6484.length; ++var2) {
            if(null == this.aByteArrayArray_6481[var2] && this.aCacheUnpacker_6482.method3568(this.anIntArray_6484[this.anInt_6480 * 343375507 + var2], 0, 1633248999)) {
               this.aByteArrayArray_6481[var2] = this.aCacheUnpacker_6482.getDataBytes(this.anIntArray_6484[343375507 * this.anInt_6480 + var2], 0, -1758573946);
            }
         }

      }
   }

   int method3320(byte[] var1, int var2) throws IOException {
      int var4;
      int var5;
      if(this.anIntArray_6484 == null) {
         if(!this.aCacheUnpacker_6482.method3568(this.anInt_6483 * 1654229069, 0, 499796101)) {
            return 0;
         }

         byte[] var3 = this.aCacheUnpacker_6482.getDataBytes(1654229069 * this.anInt_6483, 0, 88927625);
         if(var3 == null) {
            throw new IllegalStateException("");
         }

         this.aClass240_Sub8_6485.data = var3;
         this.aClass240_Sub8_6485.index = 0;
         var4 = var3.length >> 1;
         this.anIntArray_6484 = new int[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.anIntArray_6484[var5] = this.aClass240_Sub8_6485.readShort(1988163412);
         }
      }

      if(343375507 * this.anInt_6480 >= this.anIntArray_6484.length) {
         return -1;
      } else {
         this.method4160((byte)0);
         this.aClass240_Sub8_6485.data = var1;
         this.aClass240_Sub8_6485.index = 0;

         do {
            if(964952859 * this.aClass240_Sub8_6485.index >= this.aClass240_Sub8_6485.data.length) {
               this.aClass240_Sub8_6485.data = null;
               return var1.length;
            }

            if(this.aClass240_Sub8_6486.data == null) {
               if(this.aByteArrayArray_6481[0] == null) {
                  this.aClass240_Sub8_6485.data = null;
                  return this.aClass240_Sub8_6485.index * 964952859;
               }

               this.aClass240_Sub8_6486.data = this.aByteArrayArray_6481[0];
            }

            int var6 = this.aClass240_Sub8_6485.data.length - this.aClass240_Sub8_6485.index * 964952859;
            var4 = this.aClass240_Sub8_6486.data.length - 964952859 * this.aClass240_Sub8_6486.index;
            if(var6 < var4) {
               this.aClass240_Sub8_6486.fillArray(this.aClass240_Sub8_6485.data, 964952859 * this.aClass240_Sub8_6485.index, var6);
               this.aClass240_Sub8_6485.data = null;
               return var1.length;
            }

            this.aClass240_Sub8_6485.putBytes(this.aClass240_Sub8_6486.data, 964952859 * this.aClass240_Sub8_6486.index, var4, -144707030);
            this.aClass240_Sub8_6486.data = null;
            this.aClass240_Sub8_6486.index = 0;
            this.anInt_6480 += 762138523;

            for(var5 = 0; var5 < 9; ++var5) {
               this.aByteArrayArray_6481[var5] = this.aByteArrayArray_6481[1 + var5];
            }

            this.aByteArrayArray_6481[9] = null;
         } while(343375507 * this.anInt_6480 < this.anIntArray_6484.length);

         this.aClass240_Sub8_6485.data = null;
         return this.aClass240_Sub8_6485.index * 964952859;
      }
   }

   public Class254_Sub1(int var1, CacheDataUnpacker var2, int var3) {
      super(var1);
      this.aCacheUnpacker_6482 = var2;
      this.anInt_6483 = 709161093 * var3;
   }
}
