import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.vorbis.DSPState;
import jagtheora.vorbis.VorbisBlock;
import jagtheora.vorbis.VorbisComment;
import jagtheora.vorbis.VorbisInfo;

public class Class240_Sub4_Sub3 extends Class240_Sub4 {

   final VorbisComment aVorbisComment_3466 = new VorbisComment();
   VorbisBlock aVorbisBlock_3467;
   DSPState aDSPState_3468;
   final VorbisInfo aVorbisInfo_3469 = new VorbisInfo();
   Class221 aClass221_3470;
   Class240_Sub41_Sub1 aClass240_Sub41_Sub1_3471;
   double aDouble_3472;
   int anInt_3473;


   void method4434(OggPacket var1, int var2) {
      if(-992639099 * this.anInt_6750 < 3) {
         int var3 = this.aVorbisInfo_3469.headerIn(this.aVorbisComment_3466, var1);
         if(var3 < 0) {
            throw new IllegalStateException("" + var3);
         }

         if(-992639099 * this.anInt_6750 == 2) {
            if(this.aVorbisInfo_3469.anInt_3107 > 2 || this.aVorbisInfo_3469.anInt_3107 < 1) {
               throw new RuntimeException("" + this.aVorbisInfo_3469.anInt_3107);
            }

            this.aDSPState_3468 = new DSPState(this.aVorbisInfo_3469);
            this.aVorbisBlock_3467 = new VorbisBlock(this.aDSPState_3468);
            this.aClass221_3470 = new Class221(this.aVorbisInfo_3469.anInt_3108, Class316.anInt_6135);
            this.aClass240_Sub41_Sub1_3471 = new Class240_Sub41_Sub1(this.aVorbisInfo_3469.anInt_3107);
         }
      } else {
         if(this.aVorbisBlock_3467.synthesis(var1) == 0) {
            this.aDSPState_3468.blockIn(this.aVorbisBlock_3467);
         }

         float[][] var6 = this.aDSPState_3468.pcmOut(this.aVorbisInfo_3469.anInt_3107);
         this.aDouble_3472 = this.aDSPState_3468.granuleTime();
         if(-1.0D == this.aDouble_3472) {
            this.aDouble_3472 = (double)((float)(1235000743 * this.anInt_3473) / (float)this.aVorbisInfo_3469.anInt_3108);
         }

         this.aDSPState_3468.read(var6[0].length);
         this.anInt_3473 += var6[0].length * 31078935;
         Class240_Sub11 var4 = this.aClass240_Sub41_Sub1_3471.method420(var6[0].length, this.aDouble_3472);
         Class271.method3561(var6, var4.aShortArrayArray_6797, (byte)103);

         for(int var5 = 0; var5 < this.aVorbisInfo_3469.anInt_3107; ++var5) {
            var4.aShortArrayArray_6797[var5] = this.aClass221_3470.method2778(var4.aShortArrayArray_6797[var5], -1904540550);
         }

         this.aClass240_Sub41_Sub1_3471.method421(var4, -1708733620);
      }

   }

   double method2555(byte var1) {
      double var2 = this.aDouble_3472;
      if(this.aClass240_Sub41_Sub1_3471 != null) {
         var2 = this.aClass240_Sub41_Sub1_3471.method430((byte)0);
         if(var2 < 0.0D) {
            var2 = this.aDouble_3472;
         }
      }

      return var2 - (double)(256.0F / (float)Class316.anInt_6135);
   }

   int method2556(int var1) {
      return this.aClass240_Sub41_Sub1_3471 == null?0:this.aClass240_Sub41_Sub1_3471.method419(1466874404);
   }

   Class240_Sub4_Sub3(OggStreamState var1) {
      super(var1);
   }

   void method4435(int var1) {
      if(null != this.aVorbisBlock_3467) {
         this.aVorbisBlock_3467.method5440();
      }

      if(this.aDSPState_3468 != null) {
         this.aDSPState_3468.method5440();
      }

      this.aVorbisComment_3466.method5440();
      this.aVorbisInfo_3469.method5440();
      if(this.aClass240_Sub41_Sub1_3471 != null) {
         this.aClass240_Sub41_Sub1_3471.method427(-830349699);
      }

   }

   public Class240_Sub41_Sub1 method2558(int var1) {
      return this.aClass240_Sub41_Sub1_3471;
   }
}
