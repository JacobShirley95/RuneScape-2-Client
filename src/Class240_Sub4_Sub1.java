import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;

public class Class240_Sub4_Sub1 extends Class240_Sub4 {

   int anInt_834;
   static final int anInt_835 = 0;
   String aString_836;
   int anInt_837;
   String aString_838;
   String aString_839;
   float aFloat_840;
   float aFloat_841;
   static final int anInt_842 = 128;


   void method4434(OggPacket var1, int var2) {
      if(-992639099 * this.anInt_6750 <= 0 || "SUB".equals(this.aString_839)) {
         ByteArrayDataNode var3 = new ByteArrayDataNode(var1.getData());
         int var4 = var3.readByte(1805221943);
         if(-992639099 * this.anInt_6750 <= 8) {
            if(0 == (var4 | 128)) {
               throw new IllegalStateException();
            }

            if(this.anInt_6750 * -992639099 == 0) {
               var3.index += 244075189;
               this.anInt_834 = var3.method4481(-2135447978) * 634728935;
               this.anInt_837 = var3.method4481(-2140565615) * 876631321;
               if(0 == this.anInt_834 * -1905307177 || this.anInt_837 * -33933527 == 0) {
                  throw new IllegalStateException();
               }

               ByteArrayDataNode var5 = new ByteArrayDataNode(16);
               var3.fillArray(var5.data, 0, 16);
               this.aString_838 = var5.method4485(993345213);
               var5.index = 0;
               var3.fillArray(var5.data, 0, 16);
               this.aString_839 = var5.method4485(-547593828);
            }
         } else {
            if(0 == var4) {
               long var6 = var3.method4541(-558187225);
               long var8 = var3.method4541(-310632270);
               long var10 = var3.method4541(-1787883728);
               if(var6 < 0L || var8 < 0L || var10 < 0L || var10 > var6) {
                  throw new IllegalStateException();
               }

               this.aFloat_840 = (float)(var6 * (long)(this.anInt_837 * -33933527)) / (float)(this.anInt_834 * -1905307177);
               this.aFloat_841 = (float)((var6 + var8) * (long)(-33933527 * this.anInt_837)) / (float)(this.anInt_834 * -1905307177);
               int var12 = var3.method4481(-2142634167);
               if(var12 < 0 || var12 > var3.data.length - var3.index * 964952859) {
                  throw new IllegalStateException();
               }

               this.aString_836 = Class34.decodeString(var3.data, var3.index * 964952859, var12, -1367679101);
            }

            if(0 != (var4 | 128)) {
               return;
            }
         }

      }
   }

   public float method277(int var1) {
      return this.aFloat_840;
   }

   Class240_Sub4_Sub1(OggStreamState var1) {
      super(var1);
   }

   public String method278(int var1) {
      return this.aString_836;
   }

   void method4435(int var1) {}

   String method280(int var1) {
      return this.aString_838;
   }

   public float method281(byte var1) {
      return this.aFloat_841;
   }
}
