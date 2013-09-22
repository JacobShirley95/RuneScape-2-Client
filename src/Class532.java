
public class Class532 {

   short[] aShortArray_9334;
   int[] anIntArray_9335;
   long aLong_9336;
   short[] aShortArray_9337;


   public Class532(long var1, int[] var3, short[] var4, short[] var5) {
      this.aLong_9336 = var1 * -4496535172789769739L;
      this.anIntArray_9335 = var3;
      this.aShortArray_9334 = var4;
      this.aShortArray_9337 = var5;
   }

   public static void method6035(RSCharacter var0, int[] animes, int var2, boolean var3, int var4) {
      boolean sameAnimation;
      int var6;
      if(var0.animationQueue != null) {
         sameAnimation = true;

         for(var6 = 0; var6 < var0.animationQueue.length; ++var6) {
            if(animes[var6] != var0.animationQueue[var6]) {
               sameAnimation = false;
               break;
            }
         }

         Animator var9 = var0.animation;
         if(sameAnimation && var9.isAnimating(2133394886)) {
            Animation var7 = var0.animation.getAnimation(-110448102);
            int var8 = var7.anInt_10104 * -84331573;
            if(1 == var8) {
               var9.method5882(var2, -1874132513);
            }

            if(2 == var8) {
               var9.method5880(-1553218436);
            }
         }
      }

      sameAnimation = true;

      for(var6 = 0; var6 < animes.length; ++var6) {
         if(-1 != animes[var6]) {
            sameAnimation = false;
         }

         if(null == var0.animationQueue || var0.animationQueue[var6] == -1 || Class88.animeUnpacker.loadAnimation(animes[var6]).anInt_10113 * 459293499 >= Class88.animeUnpacker.loadAnimation(var0.animationQueue[var6]).anInt_10113 * 459293499) {
            var0.animationQueue = animes;
            var0.animation.method5879(var2, (byte)102);
            if(var3) {
               var0.anInt_4345 = var0.anInt_4331 * -422512077;
            }
         }
      }

      if(sameAnimation) {
         var0.animationQueue = animes;
         var0.animation.method5879(var2, (byte)113);
         if(var3) {
            var0.anInt_4345 = var0.anInt_4331 * -422512077;
         }
      }

   }
}
