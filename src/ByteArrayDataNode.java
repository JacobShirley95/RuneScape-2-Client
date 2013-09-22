import java.math.BigInteger;

public class ByteArrayDataNode extends NodeListNode {

   public static long[] aLongArray_6770;
   static final int anInt_6771 = -306674912;
   public static final int anInt_6772 = 100;
   public int index;
   static int[] anIntArray_6774 = new int[256];
   public static final int anInt_6775 = 5000;
   public byte[] data;
   static final long aLong_6777 = -3932672073523589310L;


   public int method4462(byte var1) {
      return this.data[(this.index += -2043502829) * 964952859 - 1] - 128 & 255;
   }

   public void method4463(int var1, int var2) {
      this.data[(this.index += -2043502829) * 964952859 - 1] = (byte)(var1 >> 8);
      this.data[(this.index += -2043502829) * 964952859 - 1] = (byte)var1;
   }

   public void method4464(int var1, byte var2) {
      this.data[(this.index += -2043502829) * 964952859 - 1] = (byte)var1;
      this.data[(this.index += -2043502829) * 964952859 - 1] = (byte)(var1 >> 8);
   }

   public void method4465(int var1, int var2) {
      this.data[(this.index += -2043502829) * 964952859 - 1] = (byte)(var1 >> 16);
      this.data[(this.index += -2043502829) * 964952859 - 1] = (byte)(var1 >> 8);
      this.data[(this.index += -2043502829) * 964952859 - 1] = (byte)var1;
   }

   public void putInt(int var1, int var2) {
      this.data[(this.index += -2043502829) * 964952859 - 1] = (byte)var1;
      this.data[(this.index += -2043502829) * 964952859 - 1] = (byte)(var1 >> 8);
      this.data[(this.index += -2043502829) * 964952859 - 1] = (byte)(var1 >> 16);
      this.data[(this.index += -2043502829) * 964952859 - 1] = (byte)(var1 >> 24);
   }

   public void putLong(long var1) {
      this.data[(this.index += -2043502829) * 964952859 - 1] = (byte)((int)(var1 >> 56));
      this.data[(this.index += -2043502829) * 964952859 - 1] = (byte)((int)(var1 >> 48));
      this.data[(this.index += -2043502829) * 964952859 - 1] = (byte)((int)(var1 >> 40));
      this.data[(this.index += -2043502829) * 964952859 - 1] = (byte)((int)(var1 >> 32));
      this.data[(this.index += -2043502829) * 964952859 - 1] = (byte)((int)(var1 >> 24));
      this.data[(this.index += -2043502829) * 964952859 - 1] = (byte)((int)(var1 >> 16));
      this.data[(this.index += -2043502829) * 964952859 - 1] = (byte)((int)(var1 >> 8));
      this.data[(this.index += -2043502829) * 964952859 - 1] = (byte)((int)var1);
   }

   public void method4468(long var1, int var3, int var4) {
      --var3;
      if(var3 >= 0 && var3 <= 7) {
         for(int var5 = 8 * var3; var5 >= 0; var5 -= 8) {
            this.data[(this.index += -2043502829) * 964952859 - 1] = (byte)((int)(var1 >> var5));
         }

      } else {
         throw new IllegalArgumentException();
      }
   }

   public void putString(String var1, byte var2) {
      int var3 = var1.indexOf(0);
      if(var3 >= 0) {
         throw new IllegalArgumentException("");
      } else {
         this.index += Class524.method5985(var1, 0, var1.length(), this.data, this.index * 964952859, 220090399) * -2043502829;
         this.data[(this.index += -2043502829) * 964952859 - 1] = 0;
      }
   }

   public void putBytes(byte[] var1, int var2, int var3, int var4) {
      for(int var5 = var2; var5 < var2 + var3; ++var5) {
         this.data[(this.index += -2043502829) * 964952859 - 1] = var1[var5];
      }

   }

   public int method4471(int var1) {
      byte var2 = this.data[(this.index += -2043502829) * 964952859 - 1];

      int var3;
      for(var3 = 0; var2 < 0; var2 = this.data[(this.index += -2043502829) * 964952859 - 1]) {
         var3 = (var3 | var2 & 127) << 7;
      }

      return var3 | var2;
   }

   public void method4472(int var1, int var2) {
      this.data[964952859 * this.index - var1 - 2] = (byte)(var1 >> 8);
      this.data[964952859 * this.index - var1 - 1] = (byte)var1;
   }

   public void method4473(int var1, byte var2) {
      if(var1 >= 0 && var1 < 128) {
         this.putByte(var1, 204077254);
      } else if(var1 >= 0 && var1 < '\u8000') {
         this.method4463('\u8000' + var1, -1320148716);
      } else {
         throw new IllegalArgumentException();
      }
   }

   public void method4474(int var1) {
      if(this.data != null) {
         Class557.method6156(this.data, 884117457);
      }

      this.data = null;
   }

   public int readByte(int var1) {
      return this.data[(this.index += -2043502829) * 964952859 - 1] & 255;
   }

   public byte getByte(byte var1) {
      return this.data[(this.index += -2043502829) * 964952859 - 1];
   }

   public void method4477(int var1, byte var2) {
      this.data[(this.index += -2043502829) * 964952859 - 1] = (byte)(0 - var1);
   }

   public int method4478(byte var1) {
      this.index += 207961638;
      int var2 = ((this.data[964952859 * this.index - 2] & 255) << 8) + (this.data[964952859 * this.index - 1] & 255);
      if(var2 > 32767) {
         var2 -= 65536;
      }

      return var2;
   }

   public int method4479(int var1) {
      this.index += -1835541191;
      return (this.data[964952859 * this.index - 1] & 255) + ((this.data[964952859 * this.index - 2] & 255) << 8) + ((this.data[this.index * 964952859 - 3] & 255) << 16);
   }

   public int method4480(int var1) {
      this.index += 415923276;
      return ((this.data[964952859 * this.index - 4] & 255) << 24) + ((this.data[964952859 * this.index - 3] & 255) << 16) + ((this.data[this.index * 964952859 - 2] & 255) << 8) + (this.data[964952859 * this.index - 1] & 255);
   }

   public int method4481(int var1) {
      this.index += 415923276;
      return (this.data[this.index * 964952859 - 4] & 255) + ((this.data[964952859 * this.index - 3] & 255) << 8) + ((this.data[964952859 * this.index - 1] & 255) << 24) + ((this.data[964952859 * this.index - 2] & 255) << 16);
   }

   public long method4482(int var1) {
      long var2 = (long)this.readByte(384549466) & 4294967295L;
      long var4 = (long)this.method4480(1260717178) & 4294967295L;
      return var4 + (var2 << 32);
   }

   public long method4483(int var1, byte var2) {
      --var1;
      if(var1 >= 0 && var1 <= 7) {
         int var3 = var1 * 8;

         long var4;
         for(var4 = 0L; var3 >= 0; var3 -= 8) {
            var4 |= ((long)this.data[(this.index += -2043502829) * 964952859 - 1] & 255L) << var3;
         }

         return var4;
      } else {
         throw new IllegalArgumentException();
      }
   }

   public int method4484(byte var1) {
      this.index += -1835541191;
      int var2 = (this.data[this.index * 964952859 - 1] & 255) + ((this.data[this.index * 964952859 - 3] & 255) << 16) + ((this.data[964952859 * this.index - 2] & 255) << 8);
      if(var2 > 8388607) {
         var2 -= 16777216;
      }

      return var2;
   }

   public String method4485(int var1) {
      int var2 = this.index * 964952859;

      while(this.data[(this.index += -2043502829) * 964952859 - 1] != 0) {
         ;
      }

      int var3 = this.index * 964952859 - var2 - 1;
      return 0 == var3?"":Class537.bytesToString(this.data, var2, var3, 1422959198);
   }

   public String readString(int var1) {
      byte var2 = this.data[(this.index += -2043502829) * 964952859 - 1];
      if(var2 != 0) {
         throw new IllegalStateException("");
      } else {
         int var3 = 964952859 * this.index;

         while(this.data[(this.index += -2043502829) * 964952859 - 1] != 0) {
            ;
         }

         int var4 = 964952859 * this.index - var3 - 1;
         return 0 == var4?"":Class537.bytesToString(this.data, var3, var4, -1609693550);
      }
   }

   public String method4487(byte var1) {
      byte var2 = this.data[(this.index += -2043502829) * 964952859 - 1];
      if(0 != var2) {
         throw new IllegalStateException("");
      } else {
         int var3 = this.method4471(-1899301164);
         if(this.index * 964952859 + var3 > this.data.length) {
            throw new IllegalStateException("");
         } else {
            String var4 = Class34.decodeString(this.data, 964952859 * this.index, var3, -1845657813);
            this.index += var3 * -2043502829;
            return var4;
         }
      }
   }

   public int readShort(int var1) {
      this.index += 207961638;
      return (this.data[this.index * 964952859 - 1] & 255) + ((this.data[964952859 * this.index - 2] & 255) << 8);
   }

   public int method4489(int var1) {
      int var2 = this.data[this.index * 964952859] & 255;
      return var2 < 128?this.readByte(2011957195) - 64:this.readShort(1893494856) - '\uc000';
   }

   public int method4490(byte var1) {
      int var2 = this.data[964952859 * this.index] & 255;
      return var2 < 128?this.readByte(1761560293):this.readShort(1881254387) - '\u8000';
   }

   public int method4491(int var1) {
      int var2 = 0;

      int var3;
      for(var3 = this.method4490((byte)0); var3 == 32767; var3 = this.method4490((byte)0)) {
         var2 += 32767;
      }

      var2 += var3;
      return var2;
   }

   public int method4492(int var1) {
      return this.data[this.index * 964952859] < 0?this.method4480(1260717178) & Integer.MAX_VALUE:this.readShort(-767193560);
   }

   public int method4493(int var1) {
      if(this.data[this.index * 964952859] < 0) {
         return this.method4480(1260717178) & Integer.MAX_VALUE;
      } else {
         int var2 = this.readShort(-470191959);
         return var2 == 32767?-1:var2;
      }
   }

   public float method4494(int var1) {
      return Float.intBitsToFloat(this.method4480(1260717178));
   }

   public void method4495(int[] var1, byte var2) {
      int var3 = this.index * 964952859 / 8;
      this.index = 0;

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = this.method4480(1260717178);
         int var6 = this.method4480(1260717178);
         int var7 = -957401312;
         int var8 = -1640531527;

         for(int var9 = 32; var9-- > 0; var5 -= var6 + (var6 << 4 ^ var6 >>> 5) ^ var1[var7 & 3] + var7) {
            var6 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ var1[var7 >>> 11 & 3] + var7;
            var7 -= var8;
         }

         this.index -= 831846552;
         this.putIntBE(var5, 2062892803);
         this.putIntBE(var6, 2062892803);
      }

   }

   public void method4496(int[] var1, int var2, int var3, int var4) {
      int var5 = 964952859 * this.index;
      this.index = -2043502829 * var2;
      int var6 = (var3 - var2) / 8;

      for(int var7 = 0; var7 < var6; ++var7) {
         int var8 = this.method4480(1260717178);
         int var9 = this.method4480(1260717178);
         int var10 = 0;
         int var11 = -1640531527;

         for(int var12 = 32; var12-- > 0; var9 += (var8 << 4 ^ var8 >>> 5) + var8 ^ var1[var10 >>> 11 & 3] + var10) {
            var8 += (var9 << 4 ^ var9 >>> 5) + var9 ^ var1[var10 & 3] + var10;
            var10 += var11;
         }

         this.index -= 831846552;
         this.putIntBE(var8, 2062892803);
         this.putIntBE(var9, 2062892803);
      }

      this.index = var5 * -2043502829;
   }

   public void method4497(int[] var1, int var2, int var3, byte var4) {
      int var5 = this.index * 964952859;
      this.index = -2043502829 * var2;
      int var6 = (var3 - var2) / 8;

      for(int var7 = 0; var7 < var6; ++var7) {
         int var8 = this.method4480(1260717178);
         int var9 = this.method4480(1260717178);
         int var10 = -957401312;
         int var11 = -1640531527;

         for(int var12 = 32; var12-- > 0; var8 -= var9 + (var9 << 4 ^ var9 >>> 5) ^ var1[var10 & 3] + var10) {
            var9 -= var8 + (var8 << 4 ^ var8 >>> 5) ^ var1[var10 >>> 11 & 3] + var10;
            var10 -= var11;
         }

         this.index -= 831846552;
         this.putIntBE(var8, 2062892803);
         this.putIntBE(var9, 2062892803);
      }

      this.index = var5 * -2043502829;
   }

   public void putIntBE(int var1, int var2) {
      this.data[(this.index += -2043502829) * 964952859 - 1] = (byte)(var1 >> 24);
      this.data[(this.index += -2043502829) * 964952859 - 1] = (byte)(var1 >> 16);
      this.data[(this.index += -2043502829) * 964952859 - 1] = (byte)(var1 >> 8);
      this.data[(this.index += -2043502829) * 964952859 - 1] = (byte)var1;
   }

   public void method4499(int var1, byte var2) {
      this.data[(this.index += -2043502829) * 964952859 - 1] = (byte)(var1 + 128);
   }

   public void method4500(int var1, byte var2) {
      this.data[(this.index += -2043502829) * 964952859 - 1] = (byte)(128 - var1);
   }

   public int method4501(int var1) {
      return 0 - this.data[(this.index += -2043502829) * 964952859 - 1] & 255;
   }

   public int method4502(short var1) {
      return 128 - this.data[(this.index += -2043502829) * 964952859 - 1] & 255;
   }

   public byte method4503(byte var1) {
      return (byte)(this.data[(this.index += -2043502829) * 964952859 - 1] - 128);
   }

   public void method4504(BigInteger var1, BigInteger var2, byte var3) {
      int var4 = 964952859 * this.index;
      this.index = 0;
      byte[] var5 = new byte[var4];
      this.fillArray(var5, 0, var4);
      BigInteger var6 = new BigInteger(var5);
      BigInteger var7 = var6.modPow(var1, var2);
      byte[] var8 = var7.toByteArray();
      this.index = 0;
      this.method4463(var8.length, -1282682671);
      this.putBytes(var8, 0, var8.length, -144707030);
   }

   public byte method4505(byte var1) {
      return (byte)(128 - this.data[(this.index += -2043502829) * 964952859 - 1]);
   }

   public void putShort(int var1, int var2) {
      this.data[(this.index += -2043502829) * 964952859 - 1] = (byte)var1;
      this.data[(this.index += -2043502829) * 964952859 - 1] = (byte)(var1 >> 8);
   }

   public void method4507(int var1, int var2) {
      this.data[(this.index += -2043502829) * 964952859 - 1] = (byte)(128 + var1);
      this.data[(this.index += -2043502829) * 964952859 - 1] = (byte)(var1 >> 8);
   }

   public void method4508(byte[] var1, int var2, int var3, byte var4) {
      for(int var5 = var3 + var2 - 1; var5 >= var2; --var5) {
         var1[var5] = this.data[(this.index += -2043502829) * 964952859 - 1];
      }

   }

   public int method4509(byte var1) {
      this.index += 207961638;
      int var2 = ((this.data[this.index * 964952859 - 1] & 255) << 8) + (this.data[this.index * 964952859 - 2] & 255);
      if(var2 > 32767) {
         var2 -= 65536;
      }

      return var2;
   }

   public int method4510(int var1) {
      this.index += 207961638;
      int var2 = ((this.data[this.index * 964952859 - 2] & 255) << 8) + (this.data[this.index * 964952859 - 1] - 128 & 255);
      if(var2 > 32767) {
         var2 -= 65536;
      }

      return var2;
   }

   public void method4511(int var1, int var2) {
      this.data[(this.index += -2043502829) * 964952859 - 1] = (byte)(var1 >> 16);
      this.data[(this.index += -2043502829) * 964952859 - 1] = (byte)var1;
      this.data[(this.index += -2043502829) * 964952859 - 1] = (byte)(var1 >> 8);
   }

   public void method4512(int var1, int var2) {
      this.data[(this.index += -2043502829) * 964952859 - 1] = (byte)(var1 >> 8);
      this.data[(this.index += -2043502829) * 964952859 - 1] = (byte)(var1 >> 16);
      this.data[(this.index += -2043502829) * 964952859 - 1] = (byte)var1;
   }

   public int method4513(int var1) {
      this.index += -1835541191;
      return (this.data[this.index * 964952859 - 1] & 255) + ((this.data[964952859 * this.index - 2] & 255) << 16) + ((this.data[this.index * 964952859 - 3] & 255) << 8);
   }

   public void method4514(int var1, int var2) {
      this.data[(this.index += -2043502829) * 964952859 - 1] = (byte)var1;
      this.data[(this.index += -2043502829) * 964952859 - 1] = (byte)(var1 >> 8);
      this.data[(this.index += -2043502829) * 964952859 - 1] = (byte)(var1 >> 16);
      this.data[(this.index += -2043502829) * 964952859 - 1] = (byte)(var1 >> 24);
   }

   public void method4515(int var1, int var2) {
      this.data[(this.index += -2043502829) * 964952859 - 1] = (byte)(var1 >> 8);
      this.data[(this.index += -2043502829) * 964952859 - 1] = (byte)var1;
      this.data[(this.index += -2043502829) * 964952859 - 1] = (byte)(var1 >> 24);
      this.data[(this.index += -2043502829) * 964952859 - 1] = (byte)(var1 >> 16);
   }

   public void method4516(int var1, int var2) {
      this.data[(this.index += -2043502829) * 964952859 - 1] = (byte)(var1 >> 16);
      this.data[(this.index += -2043502829) * 964952859 - 1] = (byte)(var1 >> 24);
      this.data[(this.index += -2043502829) * 964952859 - 1] = (byte)var1;
      this.data[(this.index += -2043502829) * 964952859 - 1] = (byte)(var1 >> 8);
   }

   public int method4517(int var1) {
      this.index += 415923276;
      return ((this.data[964952859 * this.index - 3] & 255) << 8) + ((this.data[964952859 * this.index - 1] & 255) << 24) + ((this.data[this.index * 964952859 - 2] & 255) << 16) + (this.data[964952859 * this.index - 4] & 255);
   }

   public int method4518(int var1) {
      this.index += 415923276;
      return (this.data[this.index * 964952859 - 3] & 255) + ((this.data[964952859 * this.index - 4] & 255) << 8) + ((this.data[this.index * 964952859 - 2] & 255) << 24) + ((this.data[964952859 * this.index - 1] & 255) << 16);
   }

   public int method4519(byte var1) {
      this.index += 415923276;
      return ((this.data[this.index * 964952859 - 1] & 255) << 8) + ((this.data[this.index * 964952859 - 3] & 255) << 24) + ((this.data[this.index * 964952859 - 4] & 255) << 16) + (this.data[this.index * 964952859 - 2] & 255);
   }

   static {
      int var2;
      for(int var0 = 0; var0 < 256; ++var0) {
         int var1 = var0;

         for(var2 = 0; var2 < 8; ++var2) {
            if((var1 & 1) == 1) {
               var1 = var1 >>> 1 ^ -306674912;
            } else {
               var1 >>>= 1;
            }
         }

         anIntArray_6774[var0] = var1;
      }

      aLongArray_6770 = new long[256];

      for(var2 = 0; var2 < 256; ++var2) {
         long var3 = (long)var2;

         for(int var5 = 0; var5 < 8; ++var5) {
            if(1L == (var3 & 1L)) {
               var3 = var3 >>> 1 ^ -3932672073523589310L;
            } else {
               var3 >>>= 1;
            }
         }

         aLongArray_6770[var2] = var3;
      }

   }

   public void method4520(int var1, int var2) {
      if(0 != (var1 & -128)) {
         if(0 != (var1 & -16384)) {
            if((var1 & -2097152) != 0) {
               if((var1 & -268435456) != 0) {
                  this.putByte(var1 >>> 28 | 128, -1534700024);
               }

               this.putByte(var1 >>> 21 | 128, -1048918743);
            }

            this.putByte(var1 >>> 14 | 128, -672387105);
         }

         this.putByte(var1 >>> 7 | 128, 27609264);
      }

      this.putByte(var1 & 127, 597290424);
   }

   public void method4521(int var1, int var2) {
      this.data[964952859 * this.index - var1 - 1] = (byte)var1;
   }

   public int method4522(int var1) {
      this.index += -1835541191;
      return (this.data[964952859 * this.index - 3] & 255) + ((this.data[964952859 * this.index - 2] & 255) << 8) + ((this.data[964952859 * this.index - 1] & 255) << 16);
   }

   public String method4523(int var1) {
      if(this.data[this.index * 964952859] == 0) {
         this.index += -2043502829;
         return null;
      } else {
         return this.method4485(-1588640823);
      }
   }

   public byte method4524(int var1) {
      return (byte)(0 - this.data[(this.index += -2043502829) * 964952859 - 1]);
   }

   public void fillArray(byte[] var1, int var2, int var3) {
      for(int var5 = var2; var5 < var3 + var2; ++var5) {
         var1[var5] = this.data[(this.index += -2043502829) * 964952859 - 1];
      }

   }

   public void putByte(int var1, int var2) {
      this.data[(this.index += -2043502829) * 964952859 - 1] = (byte)var1;
   }

   public int method4527(int var1) {
      this.index += 207961638;
      return ((this.data[964952859 * this.index - 2] & 255) << 8) + (this.data[this.index * 964952859 - 1] - 128 & 255);
   }

   public ByteArrayDataNode(byte[] var1) {
      this.data = var1;
      this.index = 0;
   }

   public void method4528(int var1, int var2) {
      this.data[(this.index += -2043502829) * 964952859 - 1] = (byte)(var1 >> 8);
      this.data[(this.index += -2043502829) * 964952859 - 1] = (byte)(var1 + 128);
   }

   public int method4529(int var1) {
      this.index += 207961638;
      return (this.data[964952859 * this.index - 2] - 128 & 255) + ((this.data[this.index * 964952859 - 1] & 255) << 8);
   }

   public void method4530(int var1, byte var2) {
      this.data[this.index * 964952859 - var1 - 4] = (byte)(var1 >> 24);
      this.data[this.index * 964952859 - var1 - 3] = (byte)(var1 >> 16);
      this.data[964952859 * this.index - var1 - 2] = (byte)(var1 >> 8);
      this.data[964952859 * this.index - var1 - 1] = (byte)var1;
   }

   public int method4531(int var1) {
      this.index += 207961638;
      return (this.data[this.index * 964952859 - 2] & 255) + ((this.data[this.index * 964952859 - 1] & 255) << 8);
   }

   public int method4532(int var1) {
      int var2 = this.data[964952859 * this.index] & 255;
      return var2 < 128?this.readByte(-45502714) - 1:this.readShort(1507655583) - '\u8001';
   }

   public boolean method4533(int var1) {
      this.index -= 415923276;
      int var2 = Class584.method6345(this.data, 0, this.index * 964952859, -1196376259);
      int var3 = this.method4480(1260717178);
      return var3 == var2;
   }

   public int method4534(int var1, int var2) {
      int var3 = Class584.method6345(this.data, var1, 964952859 * this.index, -1747217324);
      this.putIntBE(var3, 2062892803);
      return var3;
   }

   public void method4535(String var1, int var2) {
      int var3 = var1.indexOf(0);
      if(var3 >= 0) {
         throw new IllegalArgumentException("");
      } else {
         this.data[(this.index += -2043502829) * 964952859 - 1] = 0;
         this.index += Class524.method5985(var1, 0, var1.length(), this.data, this.index * 964952859, 220090399) * -2043502829;
         this.data[(this.index += -2043502829) * 964952859 - 1] = 0;
      }
   }

   public void method4536(long var1) {
      this.data[(this.index += -2043502829) * 964952859 - 1] = (byte)((int)(var1 >> 40));
      this.data[(this.index += -2043502829) * 964952859 - 1] = (byte)((int)(var1 >> 32));
      this.data[(this.index += -2043502829) * 964952859 - 1] = (byte)((int)(var1 >> 24));
      this.data[(this.index += -2043502829) * 964952859 - 1] = (byte)((int)(var1 >> 16));
      this.data[(this.index += -2043502829) * 964952859 - 1] = (byte)((int)(var1 >> 8));
      this.data[(this.index += -2043502829) * 964952859 - 1] = (byte)((int)var1);
   }

   public void method4537(int[] var1, int var2) {
      int var3 = 964952859 * this.index / 8;
      this.index = 0;

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = this.method4480(1260717178);
         int var6 = this.method4480(1260717178);
         int var7 = 0;
         int var8 = -1640531527;

         for(int var9 = 32; var9-- > 0; var6 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var7 + var1[var7 >>> 11 & 3]) {
            var5 += (var6 << 4 ^ var6 >>> 5) + var6 ^ var7 + var1[var7 & 3];
            var7 += var8;
         }

         this.index -= 831846552;
         this.putIntBE(var5, 2062892803);
         this.putIntBE(var6, 2062892803);
      }

   }

   public long method4538(int var1) {
      long var2 = (long)this.method4480(1260717178) & 4294967295L;
      long var4 = (long)this.method4480(1260717178) & 4294967295L;
      return var4 + (var2 << 32);
   }

   public void method4539(CharSequence var1, int var2) {
      int var3 = Class502.method5853(var1, 151888601);
      this.data[(this.index += -2043502829) * 964952859 - 1] = 0;
      this.method4520(var3, -544525344);
      this.index += Class235.method3051(this.data, this.index * 964952859, var1, (byte)56) * -2043502829;
   }

   public ByteArrayDataNode(int var1) {
      this.data = Class548.method6107(var1, (byte)102);
      this.index = 0;
   }

   public void method4540(long var1) {
      this.data[(this.index += -2043502829) * 964952859 - 1] = (byte)((int)(var1 >> 32));
      this.data[(this.index += -2043502829) * 964952859 - 1] = (byte)((int)(var1 >> 24));
      this.data[(this.index += -2043502829) * 964952859 - 1] = (byte)((int)(var1 >> 16));
      this.data[(this.index += -2043502829) * 964952859 - 1] = (byte)((int)(var1 >> 8));
      this.data[(this.index += -2043502829) * 964952859 - 1] = (byte)((int)var1);
   }

   public long method4541(int var1) {
      long var2 = (long)this.method4481(-2145157276) & 4294967295L;
      long var4 = (long)this.method4481(-2146308551) & 4294967295L;
      return var2 + (var4 << 32);
   }

   public int method4542(int var1) {
      this.index += 207961638;
      int var2 = (this.data[964952859 * this.index - 2] - 128 & 255) + ((this.data[this.index * 964952859 - 1] & 255) << 8);
      if(var2 > 32767) {
         var2 -= 65536;
      }

      return var2;
   }

   static void method4543(byte var0) {
      for(Class240_Sub22_Sub1 var1 = (Class240_Sub22_Sub1)Class18.aClass494_158.method5772(-121026504); null != var1; var1 = (Class240_Sub22_Sub1)Class18.aClass494_158.method5771(-706899445)) {
         if(-1686791407 * var1.anInt_799 > 1) {
            var1.anInt_799 = 0;
            Class18.aClass627_161.insert(var1, ((OptionListNode)var1.aClass494_798.aClass240_Sub22_9036.aClass240_Sub22_7277).optionData * -7702105217297120635L);
            var1.aClass494_798.method5770(-1123608939);
         }
      }

      Class18.anInt_155 = 0;
      Class18.optionCount = 0;
      Class18.optionNodeList.clear(-1159158563);
      Class18.aNodeArrayList_157.method5938(1753820820);
      Class18.aClass494_158.method5770(-231822269);
      Class39.addOption(Class18.cancelOption, (byte)95);
   }

   static void method4544(boolean var0, Class240_Sub41_Sub2 var1, byte var2) {
      Class15.aClass316_133.method3912(var1);
      if(var0) {
         Class134.method1791(Class361.aCacheUnpacker_6799, Class437.aCacheUnpacker_8384, Class431.aCacheUnpacker_8325, var1, Class15.aClass316_133, -1134510164);
      }

   }
}
