
public class Class519 {

   boolean aBoolean_9230 = false;
   int anInt_9231;
   int anInt_9232;
   Class240_Sub22_Sub9 aClass240_Sub22_Sub9_9233;
   Class240_Sub22_Sub9 aClass240_Sub22_Sub9_9234;
   int anInt_9235;


   final boolean method5963(AnimationUnpacker var1, Animation var2, int var3, int var4, int[] var5, int var6) {
      if(!this.aBoolean_9230) {
         if(var3 >= var5.length) {
            return false;
         } else {
            this.anInt_9231 = 1729205971 * var5[var3];
            this.aClass240_Sub22_Sub9_9233 = var1.method3368(this.anInt_9231 * -1426378405 >> 16, (byte)-42);
            this.anInt_9231 = (this.anInt_9231 * -1426378405 & '\uffff') * 1729205971;
            if(this.aClass240_Sub22_Sub9_9233 != null) {
               if(var2.aBoolean_10121 && var4 != -1 && var4 < var5.length) {
                  this.anInt_9235 = var5[var4] * 1299540987;
                  this.aClass240_Sub22_Sub9_9234 = var1.method3368(63235891 * this.anInt_9235 >> 16, (byte)-23);
                  this.anInt_9235 = (63235891 * this.anInt_9235 & '\uffff') * 1299540987;
               }

               if(var2.aBoolean_10117) {
                  this.anInt_9232 = 2029996425 * (-19268423 * this.anInt_9232 | 512);
               }

               if(this.aClass240_Sub22_Sub9_9233.method2579(this.anInt_9231 * -1426378405, 2100270347)) {
                  this.anInt_9232 = (-19268423 * this.anInt_9232 | 128) * 2029996425;
               }

               if(this.aClass240_Sub22_Sub9_9233.method2577(this.anInt_9231 * -1426378405, -2056212608)) {
                  this.anInt_9232 = (this.anInt_9232 * -19268423 | 256) * 2029996425;
               }

               if(this.aClass240_Sub22_Sub9_9233.method2578(this.anInt_9231 * -1426378405, 1963779085)) {
                  this.anInt_9232 = 2029996425 * (-19268423 * this.anInt_9232 | 1024);
               }

               if(this.aClass240_Sub22_Sub9_9234 != null) {
                  if(this.aClass240_Sub22_Sub9_9234.method2579(this.anInt_9235 * 63235891, 1304006967)) {
                     this.anInt_9232 = 2029996425 * (this.anInt_9232 * -19268423 | 128);
                  }

                  if(this.aClass240_Sub22_Sub9_9234.method2577(this.anInt_9235 * 63235891, -2056527363)) {
                     this.anInt_9232 = 2029996425 * (-19268423 * this.anInt_9232 | 256);
                  }

                  if(this.aClass240_Sub22_Sub9_9234.method2578(this.anInt_9235 * 63235891, 1963779085)) {
                     this.anInt_9232 = 2029996425 * (this.anInt_9232 * -19268423 | 1024);
                  }
               }

               this.anInt_9232 = 2029996425 * (this.anInt_9232 * -19268423 | 32);
               this.aBoolean_9230 = true;
               return true;
            } else {
               return false;
            }
         }
      } else {
         return true;
      }
   }

   final void method5964(byte var1) {
      this.aBoolean_9230 = false;
      this.anInt_9232 = 0;
      this.aClass240_Sub22_Sub9_9234 = null;
      this.aClass240_Sub22_Sub9_9233 = null;
   }

   public static void method5965(int var0) {
      if(5 == client.loginStage * -243034353) {
         if(!Class66.method680(2107742468) && !Class119.method1505((byte)-39)) {
            Class418.method5190(0, (byte)-86);
         }
      }
   }
}
