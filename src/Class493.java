
public class Class493 {

   long[] aLongArray_9019 = new long[8];
   public static final int anInt_9020 = 64;
   static final int anInt_9021 = 10;
   static final String aString_9022 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦?䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬?贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀?﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓?鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜";
   int anInt_9023 = 0;
   static long[] aLongArray_9024 = new long[11];
   byte[] aByteArray_9025 = new byte[32];
   static final int anInt_9026 = 512;
   byte[] aByteArray_9027 = new byte[64];
   int anInt_9028 = 0;
   long[] aLongArray_9029 = new long[8];
   long[] aLongArray_9030 = new long[8];
   static long[][] aLongArrayArray_9031 = new long[8][256];
   long[] aLongArray_9032 = new long[8];
   long[] aLongArray_9033 = new long[8];
   public static Class466 aClass466_9034;


   void method5765(short var1) {
      int var2;
      for(var2 = 0; var2 < 32; ++var2) {
         this.aByteArray_9025[var2] = 0;
      }

      this.anInt_9028 = 0;
      this.anInt_9023 = 0;
      this.aByteArray_9027[0] = 0;

      for(var2 = 0; var2 < 8; ++var2) {
         this.aLongArray_9029[var2] = 0L;
      }

   }

   void method5766(byte var1) {
      int var2 = 0;

      int var3;
      for(var3 = 0; var2 < 8; var3 += 8) {
         this.aLongArray_9032[var2] = (long)this.aByteArray_9027[var3] << 56 ^ ((long)this.aByteArray_9027[var3 + 1] & 255L) << 48 ^ ((long)this.aByteArray_9027[2 + var3] & 255L) << 40 ^ ((long)this.aByteArray_9027[3 + var3] & 255L) << 32 ^ ((long)this.aByteArray_9027[4 + var3] & 255L) << 24 ^ ((long)this.aByteArray_9027[var3 + 5] & 255L) << 16 ^ ((long)this.aByteArray_9027[var3 + 6] & 255L) << 8 ^ (long)this.aByteArray_9027[var3 + 7] & 255L;
         ++var2;
      }

      for(var2 = 0; var2 < 8; ++var2) {
         this.aLongArray_9033[var2] = this.aLongArray_9032[var2] ^ (this.aLongArray_9030[var2] = this.aLongArray_9029[var2]);
      }

      for(var2 = 1; var2 <= 10; ++var2) {
         int var4;
         int var5;
         for(var3 = 0; var3 < 8; ++var3) {
            this.aLongArray_9019[var3] = 0L;
            var4 = 0;

            for(var5 = 56; var4 < 8; var5 -= 8) {
               this.aLongArray_9019[var3] ^= aLongArrayArray_9031[var4][(int)(this.aLongArray_9030[var3 - var4 & 7] >>> var5) & 255];
               ++var4;
            }
         }

         for(var3 = 0; var3 < 8; ++var3) {
            this.aLongArray_9030[var3] = this.aLongArray_9019[var3];
         }

         this.aLongArray_9030[0] ^= aLongArray_9024[var2];

         for(var3 = 0; var3 < 8; ++var3) {
            this.aLongArray_9019[var3] = this.aLongArray_9030[var3];
            var4 = 0;

            for(var5 = 56; var4 < 8; var5 -= 8) {
               this.aLongArray_9019[var3] ^= aLongArrayArray_9031[var4][(int)(this.aLongArray_9033[var3 - var4 & 7] >>> var5) & 255];
               ++var4;
            }
         }

         for(var3 = 0; var3 < 8; ++var3) {
            this.aLongArray_9033[var3] = this.aLongArray_9019[var3];
         }
      }

      for(var2 = 0; var2 < 8; ++var2) {
         this.aLongArray_9029[var2] ^= this.aLongArray_9033[var2] ^ this.aLongArray_9032[var2];
      }

   }

   void method5767(byte[] var1, long var2) {
      int var4 = 0;
      int var5 = 8 - ((int)var2 & 7) & 7;
      int var6 = this.anInt_9023 * -107534651 & 7;
      long var7 = var2;
      int var9 = 31;

      for(int var10 = 0; var9 >= 0; --var9) {
         var10 += (this.aByteArray_9025[var9] & 255) + ((int)var7 & 255);
         this.aByteArray_9025[var9] = (byte)var10;
         var10 >>>= 8;
         var7 >>>= 8;
      }

      int var11;
      while(var2 > 8L) {
         var11 = var1[var4] << var5 & 255 | (var1[1 + var4] & 255) >>> 8 - var5;
         if(var11 < 0 || var11 >= 256) {
            throw new RuntimeException();
         }

         this.aByteArray_9027[this.anInt_9028 * 163498921] = (byte)(this.aByteArray_9027[this.anInt_9028 * 163498921] | var11 >>> var6);
         this.anInt_9028 += 2057504921;
         this.anInt_9023 += -1367906291 * (8 - var6);
         if(512 == -107534651 * this.anInt_9023) {
            this.method5766((byte)77);
            this.anInt_9028 = 0;
            this.anInt_9023 = 0;
         }

         this.aByteArray_9027[this.anInt_9028 * 163498921] = (byte)(var11 << 8 - var6 & 255);
         this.anInt_9023 += -1367906291 * var6;
         var2 -= 8L;
         ++var4;
      }

      if(var2 > 0L) {
         var11 = var1[var4] << var5 & 255;
         this.aByteArray_9027[163498921 * this.anInt_9028] = (byte)(this.aByteArray_9027[163498921 * this.anInt_9028] | var11 >>> var6);
      } else {
         var11 = 0;
      }

      if((long)var6 + var2 < 8L) {
         this.anInt_9023 = (int)((long)this.anInt_9023 + -1367906291L * var2);
      } else {
         this.anInt_9028 += 2057504921;
         this.anInt_9023 += (8 - var6) * -1367906291;
         var2 -= (long)(8 - var6);
         if(this.anInt_9023 * -107534651 == 512) {
            this.method5766((byte)120);
            this.anInt_9028 = 0;
            this.anInt_9023 = 0;
         }

         this.aByteArray_9027[163498921 * this.anInt_9028] = (byte)(var11 << 8 - var6 & 255);
         this.anInt_9023 += (int)var2 * -1367906291;
      }

   }

   static {
      int var0;
      for(var0 = 0; var0 < 256; ++var0) {
         char var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦?䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬?贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀?﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓?鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
         long var2 = (var0 & 1) == 0?(long)(var1 >>> 8):(long)(var1 & 255);
         long var4 = var2 << 1;
         if(var4 >= 256L) {
            var4 ^= 285L;
         }

         long var6 = var4 << 1;
         if(var6 >= 256L) {
            var6 ^= 285L;
         }

         long var8 = var6 ^ var2;
         long var10 = var6 << 1;
         if(var10 >= 256L) {
            var10 ^= 285L;
         }

         long var12 = var10 ^ var2;
         aLongArrayArray_9031[0][var0] = var2 << 56 | var2 << 48 | var6 << 40 | var2 << 32 | var10 << 24 | var8 << 16 | var4 << 8 | var12;

         for(int var14 = 1; var14 < 8; ++var14) {
            aLongArrayArray_9031[var14][var0] = aLongArrayArray_9031[var14 - 1][var0] >>> 8 | aLongArrayArray_9031[var14 - 1][var0] << 56;
         }
      }

      aLongArray_9024[0] = 0L;

      for(var0 = 1; var0 <= 10; ++var0) {
         int var15 = (var0 - 1) * 8;
         aLongArray_9024[var0] = aLongArrayArray_9031[0][var15] & -72057594037927936L ^ aLongArrayArray_9031[1][var15 + 1] & 71776119061217280L ^ aLongArrayArray_9031[2][2 + var15] & 280375465082880L ^ aLongArrayArray_9031[3][3 + var15] & 1095216660480L ^ aLongArrayArray_9031[4][4 + var15] & 4278190080L ^ aLongArrayArray_9031[5][var15 + 5] & 16711680L ^ aLongArrayArray_9031[6][var15 + 6] & 65280L ^ aLongArrayArray_9031[7][7 + var15] & 255L;
      }

   }

   void method5768(byte[] var1, int var2, byte var3) {
      this.aByteArray_9027[this.anInt_9028 * 163498921] = (byte)(this.aByteArray_9027[this.anInt_9028 * 163498921] | 128 >>> (-107534651 * this.anInt_9023 & 7));
      this.anInt_9028 += 2057504921;
      if(this.anInt_9028 * 163498921 > 32) {
         while(163498921 * this.anInt_9028 < 64) {
            this.aByteArray_9027[(this.anInt_9028 += 2057504921) * 163498921 - 1] = 0;
         }

         this.method5766((byte)112);
         this.anInt_9028 = 0;
      }

      while(this.anInt_9028 * 163498921 < 32) {
         this.aByteArray_9027[(this.anInt_9028 += 2057504921) * 163498921 - 1] = 0;
      }

      System.arraycopy(this.aByteArray_9025, 0, this.aByteArray_9027, 32, 32);
      this.method5766((byte)25);
      int var4 = 0;

      for(int var5 = var2; var4 < 8; var5 += 8) {
         long var6 = this.aLongArray_9029[var4];
         var1[var5] = (byte)((int)(var6 >>> 56));
         var1[1 + var5] = (byte)((int)(var6 >>> 48));
         var1[2 + var5] = (byte)((int)(var6 >>> 40));
         var1[3 + var5] = (byte)((int)(var6 >>> 32));
         var1[var5 + 4] = (byte)((int)(var6 >>> 24));
         var1[var5 + 5] = (byte)((int)(var6 >>> 16));
         var1[6 + var5] = (byte)((int)(var6 >>> 8));
         var1[var5 + 7] = (byte)((int)var6);
         ++var4;
      }

   }

   static void method5769(int var0) {
      if(Class209.currentGameMode != Class554.aClass554_9533) {
         Class332.aClass332_6411.method4108((byte)-46);
      }
   }
}
