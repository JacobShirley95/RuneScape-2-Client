
public class Class122 {

   static final byte[] aByteArray_2250 = new byte[]{(byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)0, (byte)1, (byte)2, (byte)1, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
   int anInt_2251;
   int[] anIntArray_2252;
   static final int anInt_2253 = 3;
   int[] anIntArray_2254;
   int[] anIntArray_2255;
   int anInt_2256;
   int[] anIntArray_2257;
   long aLong_2258;
   static final int anInt_2259 = 500000;
   static final int anInt_2260 = 0;
   static final int anInt_2261 = 1;
   static final int anInt_2262 = 2;
   ByteArrayDataNode aClass240_Sub8_2263 = new ByteArrayDataNode((byte[])null);


   Class122(byte[] var1) {
      this.method1550(var1);
   }

   void method1536() {
      this.aClass240_Sub8_2263.index = 2043502829;
   }

   void method1537() {
      this.aClass240_Sub8_2263.data = null;
      this.anIntArray_2252 = null;
      this.anIntArray_2257 = null;
      this.anIntArray_2254 = null;
      this.anIntArray_2255 = null;
   }

   void method1538(int var1) {
      this.aClass240_Sub8_2263.index = this.anIntArray_2257[var1] * -2043502829;
   }

   void method1539(int var1) {
      this.anIntArray_2257[var1] = this.aClass240_Sub8_2263.index * 964952859;
   }

   boolean method1540() {
      return this.aClass240_Sub8_2263.data != null;
   }

   void method1541(int var1) {
      int var2 = this.aClass240_Sub8_2263.method4471(-346313357);
      this.anIntArray_2254[var1] += var2;
   }

   int method1542(int var1) {
      int var2 = this.method1543(var1);
      return var2;
   }

   int method1543(int var1) {
      byte var2 = this.aClass240_Sub8_2263.data[this.aClass240_Sub8_2263.index * 964952859];
      int var5;
      if(var2 < 0) {
         var5 = var2 & 255;
         this.anIntArray_2255[var1] = var5;
         this.aClass240_Sub8_2263.index += -2043502829;
      } else {
         var5 = this.anIntArray_2255[var1];
      }

      if(var5 != 240 && var5 != 247) {
         return this.method1544(var1, var5);
      } else {
         int var3 = this.aClass240_Sub8_2263.method4471(1487808844);
         if(var5 == 247 && var3 > 0) {
            int var4 = this.aClass240_Sub8_2263.data[this.aClass240_Sub8_2263.index * 964952859] & 255;
            if(var4 >= 241 && var4 <= 243 || var4 == 246 || var4 == 248 || var4 >= 250 && var4 <= 252 || var4 == 254) {
               this.aClass240_Sub8_2263.index += -2043502829;
               this.anIntArray_2255[var1] = var4;
               return this.method1544(var1, var4);
            }
         }

         this.aClass240_Sub8_2263.index += var3 * -2043502829;
         return 0;
      }
   }

   int method1544(int var1, int var2) {
      int var4;
      if(var2 == 255) {
         int var7 = this.aClass240_Sub8_2263.readByte(-666268448);
         var4 = this.aClass240_Sub8_2263.method4471(718885888);
         if(var7 == 47) {
            this.aClass240_Sub8_2263.index += var4 * -2043502829;
            return 1;
         } else if(var7 == 81) {
            int var5 = this.aClass240_Sub8_2263.method4479(738776218);
            var4 -= 3;
            int var6 = this.anIntArray_2254[var1];
            this.aLong_2258 += (long)var6 * (long)(this.anInt_2256 - var5);
            this.anInt_2256 = var5;
            this.aClass240_Sub8_2263.index += var4 * -2043502829;
            return 2;
         } else {
            this.aClass240_Sub8_2263.index += var4 * -2043502829;
            return 3;
         }
      } else {
         byte var3 = aByteArray_2250[var2 - 128];
         var4 = var2;
         if(var3 >= 1) {
            var4 = var2 | this.aClass240_Sub8_2263.readByte(-1076465044) << 8;
         }

         if(var3 >= 2) {
            var4 |= this.aClass240_Sub8_2263.readByte(1208684456) << 16;
         }

         return var4;
      }
   }

   long method1545(int var1) {
      return this.aLong_2258 + (long)var1 * (long)this.anInt_2256;
   }

   int method1546() {
      int var1 = this.anIntArray_2257.length;
      int var2 = -1;
      int var3 = Integer.MAX_VALUE;

      for(int var4 = 0; var4 < var1; ++var4) {
         if(this.anIntArray_2257[var4] >= 0 && this.anIntArray_2254[var4] < var3) {
            var2 = var4;
            var3 = this.anIntArray_2254[var4];
         }
      }

      return var2;
   }

   boolean method1547() {
      int var1 = this.anIntArray_2257.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         if(this.anIntArray_2257[var2] >= 0) {
            return false;
         }
      }

      return true;
   }

   void method1548(long var1) {
      this.aLong_2258 = var1;
      int var3 = this.anIntArray_2257.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         this.anIntArray_2254[var4] = 0;
         this.anIntArray_2255[var4] = 0;
         this.aClass240_Sub8_2263.index = this.anIntArray_2252[var4] * -2043502829;
         this.method1541(var4);
         this.anIntArray_2257[var4] = this.aClass240_Sub8_2263.index * 964952859;
      }

   }

   int method1549() {
      return this.anIntArray_2257.length;
   }

   Class122() {}

   void method1550(byte[] var1) {
      this.aClass240_Sub8_2263.data = var1;
      this.aClass240_Sub8_2263.index = 1039808190;
      int var2 = this.aClass240_Sub8_2263.readShort(-1027785526);
      this.anInt_2251 = this.aClass240_Sub8_2263.readShort(-1134969264);
      this.anInt_2256 = 500000;
      this.anIntArray_2252 = new int[var2];

      int var3;
      int var5;
      for(var3 = 0; var3 < var2; this.aClass240_Sub8_2263.index += var5 * -2043502829) {
         int var4 = this.aClass240_Sub8_2263.method4480(1260717178);
         var5 = this.aClass240_Sub8_2263.method4480(1260717178);
         if(var4 == 1297379947) {
            this.anIntArray_2252[var3] = this.aClass240_Sub8_2263.index * 964952859;
            ++var3;
         }
      }

      this.aLong_2258 = 0L;
      this.anIntArray_2257 = new int[var2];

      for(var3 = 0; var3 < var2; ++var3) {
         this.anIntArray_2257[var3] = this.anIntArray_2252[var3];
      }

      this.anIntArray_2254 = new int[var2];
      this.anIntArray_2255 = new int[var2];
   }
}
