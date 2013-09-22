
public class Class98 {

   static final int anInt_1928 = 2;
   static short[] aShortArray_1929 = new short[500];
   static short[] aShortArray_1930 = new short[500];
   static short[] aShortArray_1931 = new short[500];
   static short[] aShortArray_1932 = new short[500];
   static byte[] aByteArray_1933 = new byte[500];
   Class240_Sub26 aClass240_Sub26_1934 = null;
   int anInt_1935 = 0;
   short[] aShortArray_1936;
   short[] aShortArray_1937;
   static final int anInt_1938 = 2;
   short[] aShortArray_1939;
   boolean aBoolean_1940 = false;
   boolean aBoolean_1941 = false;
   short[] aShortArray_1942;
   byte[] aByteArray_1943;
   boolean aBoolean_1944 = false;
   static final int anInt_1945 = 1;
   static short[] aShortArray_1946 = new short[500];
   short[] aShortArray_1947;


   Class98(byte[] var1, Class240_Sub26 var2) {
      this.aClass240_Sub26_1934 = var2;

      try {
         ByteArrayDataNode var3 = new ByteArrayDataNode(var1);
         ByteArrayDataNode var4 = new ByteArrayDataNode(var1);
         int var5 = var3.readByte(165024917);
         var3.index += 207961638;
         int var6 = var3.readShort(1963420596);
         int var7 = 0;
         int var8 = -1;
         int var9 = -1;
         var4.index = (var3.index * 964952859 + var6) * -2043502829;

         int var10;
         for(var10 = 0; var10 < var6; ++var10) {
            int var11 = this.aClass240_Sub26_1934.anIntArray_7347[var10];
            if(var11 == 0) {
               var8 = var10;
            }

            int var12 = var3.readByte(-682805689);
            if(var12 > 0) {
               if(var11 == 0) {
                  var9 = var10;
               }

               aShortArray_1946[var7] = (short)var10;
               short var13 = 0;
               if(var11 == 3 || var11 == 10) {
                  var13 = 128;
               }

               if(var5 >= 2 && var11 == 7) {
                  if((var12 & 1) != 0) {
                     aShortArray_1929[var7] = (short)var4.method4489(1158549501);
                     var4.method4489(1158549501);
                  } else {
                     aShortArray_1929[var7] = var13;
                  }

                  if((var12 & 2) != 0) {
                     aShortArray_1930[var7] = (short)var4.method4489(1158549501);
                     var4.method4489(1158549501);
                  } else {
                     aShortArray_1930[var7] = var13;
                  }

                  if((var12 & 4) != 0) {
                     aShortArray_1931[var7] = (short)var4.method4489(1158549501);
                     var4.method4489(1158549501);
                  } else {
                     aShortArray_1931[var7] = var13;
                  }
               } else {
                  if((var12 & 1) != 0) {
                     aShortArray_1929[var7] = (short)var4.method4489(1158549501);
                  } else {
                     aShortArray_1929[var7] = var13;
                  }

                  if((var12 & 2) != 0) {
                     aShortArray_1930[var7] = (short)var4.method4489(1158549501);
                  } else {
                     aShortArray_1930[var7] = var13;
                  }

                  if((var12 & 4) != 0) {
                     aShortArray_1931[var7] = (short)var4.method4489(1158549501);
                  } else {
                     aShortArray_1931[var7] = var13;
                  }
               }

               aByteArray_1933[var7] = (byte)(var12 >>> 3 & 3);
               if(var11 == 2 || var11 == 9) {
                  aShortArray_1929[var7] = (short)(aShortArray_1929[var7] << 2 & 16383);
                  aShortArray_1930[var7] = (short)(aShortArray_1930[var7] << 2 & 16383);
                  aShortArray_1931[var7] = (short)(aShortArray_1931[var7] << 2 & 16383);
               }

               aShortArray_1932[var7] = -1;
               if(var11 != 1 && var11 != 2 && var11 != 3) {
                  if(var11 == 5) {
                     this.aBoolean_1941 = true;
                  } else if(var11 == 7) {
                     this.aBoolean_1940 = true;
                  } else if(var11 == 9 || var11 == 10 || var11 == 8) {
                     this.aBoolean_1944 = true;
                  }
               } else if(var8 > var9) {
                  aShortArray_1932[var7] = (short)var8;
                  var9 = var8;
               }

               ++var7;
            }
         }

         if(var4.index * 964952859 != var1.length) {
            throw new RuntimeException();
         }

         this.anInt_1935 = var7;
         this.aShortArray_1936 = new short[var7];
         this.aShortArray_1937 = new short[var7];
         this.aShortArray_1947 = new short[var7];
         this.aShortArray_1939 = new short[var7];
         this.aShortArray_1942 = new short[var7];
         this.aByteArray_1943 = new byte[var7];

         for(var10 = 0; var10 < var7; ++var10) {
            this.aShortArray_1936[var10] = aShortArray_1946[var10];
            this.aShortArray_1937[var10] = aShortArray_1929[var10];
            this.aShortArray_1947[var10] = aShortArray_1930[var10];
            this.aShortArray_1939[var10] = aShortArray_1931[var10];
            this.aShortArray_1942[var10] = aShortArray_1932[var10];
            this.aByteArray_1943[var10] = aByteArray_1933[var10];
         }
      } catch (Exception var14) {
         this.anInt_1935 = 0;
         this.aBoolean_1941 = false;
         this.aBoolean_1940 = false;
      }

   }

}
