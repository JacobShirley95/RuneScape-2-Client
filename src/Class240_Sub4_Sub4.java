import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.theora.DecoderContext;
import jagtheora.theora.Frame;
import jagtheora.theora.GranulePos;
import jagtheora.theora.SetupInfo;
import jagtheora.theora.TheoraComment;
import jagtheora.theora.TheoraInfo;

public class Class240_Sub4_Sub4 extends Class240_Sub4 {

   static final int anInt_3673 = 2048;
   static final int anInt_3674 = 1024;
   GranulePos aGranulePos_3675;
   long aLong_3676;
   final TheoraComment aTheoraComment_3677 = new TheoraComment();
   DecoderContext aDecoderContext_3678;
   double aDouble_3679;
   final TheoraInfo aTheoraInfo_3680 = new TheoraInfo();
   Object anObject_3681;
   final SetupInfo aSetupInfo_3682 = new SetupInfo();
   boolean aBoolean_3683;
   Frame aFrame_3684;
   int anInt_3685;
   int anInt_3686;
   boolean aBoolean_3687;
   boolean aBoolean_3688;
   boolean aBoolean_3689;


   void method4434(OggPacket var1, int var2) {
      int var3;
      if(!this.aBoolean_3683) {
         var3 = this.aSetupInfo_3682.decodeHeader(this.aTheoraInfo_3680, this.aTheoraComment_3677, var1);
         if(var3 == 0) {
            this.aBoolean_3683 = true;
            if(this.aTheoraInfo_3680.anInt_599 > 2048 || this.aTheoraInfo_3680.anInt_600 > 1024) {
               throw new IllegalStateException();
            }

            this.aDecoderContext_3678 = new DecoderContext(this.aTheoraInfo_3680, this.aSetupInfo_3682);
            this.aGranulePos_3675 = new GranulePos();
            this.aFrame_3684 = new Frame(this.aTheoraInfo_3680.anInt_599, this.aTheoraInfo_3680.anInt_600);
            this.anInt_3685 = this.aDecoderContext_3678.getMaxPostProcessingLevel() * 1866423943;
            this.method2669(this.anInt_3686 * 1323194035, 354575012);
         } else if(var3 < 0) {
            throw new IllegalStateException("" + var3);
         }
      } else {
         this.aLong_3676 = Class373.getCurrentTime((short)7088) * 8280530112583178515L;
         var3 = this.aDecoderContext_3678.decodePacketIn(var1, this.aGranulePos_3675);
         if(var3 < 0) {
            throw new IllegalStateException("" + var3);
         }

         this.aDecoderContext_3678.granuleFrame(this.aGranulePos_3675);
         this.aDouble_3679 = this.aDecoderContext_3678.granuleTime(this.aGranulePos_3675);
         if(this.aBoolean_3687) {
            boolean var4 = var1.isKeyFrame() == 1;
            if(!var4) {
               return;
            }

            this.aBoolean_3687 = false;
         }

         if(!this.aBoolean_3688 || var1.isKeyFrame() == 1) {
            if(this.aDecoderContext_3678.decodeFrame(this.aFrame_3684) != 0) {
               throw new IllegalStateException("" + var3);
            }

            this.aBoolean_3689 = true;
         }
      }

   }

   void method2669(int var1, int var2) {
      this.anInt_3686 = var1 * 1460553851;
      if(this.aBoolean_3683) {
         if(1323194035 * this.anInt_3686 > -1039464649 * this.anInt_3685) {
            this.anInt_3686 = this.anInt_3685 * 1800793965;
         }

         if(this.anInt_3686 * 1323194035 < 0) {
            this.anInt_3686 = 0;
         }

         this.aDecoderContext_3678.setPostProcessingLevel(1323194035 * this.anInt_3686);
      }

   }

   long method2670(byte var1) {
      return this.aLong_3676 * 5596009685291997467L;
   }

   double method2671(int var1) {
      return this.aDouble_3679;
   }

   float method2672(int var1) {
      return this.aBoolean_3683 && !this.aTheoraInfo_3680.method5439()?(float)this.aTheoraInfo_3680.anInt_605 / (float)this.aTheoraInfo_3680.anInt_606:0.0F;
   }

   void method4435(int var1) {
      if(null != this.aFrame_3684) {
         this.aFrame_3684.method5440();
      }

      if(this.aDecoderContext_3678 != null) {
         this.aDecoderContext_3678.method5440();
         this.aDecoderContext_3678 = null;
      }

      if(this.aGranulePos_3675 != null) {
         this.aGranulePos_3675.method5440();
         this.aGranulePos_3675 = null;
      }

      this.aTheoraInfo_3680.method5440();
      this.aTheoraComment_3677.method5440();
      this.aSetupInfo_3682.method5440();
   }

   public Object method2674(Class238 var1, short var2) {
      if(null == this.aFrame_3684) {
         return null;
      } else if(!this.aBoolean_3689 && null != this.anObject_3681) {
         return this.anObject_3681;
      } else {
         this.anObject_3681 = var1.method3080(this.aFrame_3684.anIntArray_10154, 0, this.aFrame_3684.anInt_10152 * -2039688687, -2039688687 * this.aFrame_3684.anInt_10152, -971817339 * this.aFrame_3684.anInt_10153, false, 134264216);
         this.aBoolean_3689 = false;
         return this.anObject_3681;
      }
   }

   Class240_Sub4_Sub4(OggStreamState var1) {
      super(var1);
   }

   boolean method2675(int var1) {
      return this.aBoolean_3683;
   }
}
