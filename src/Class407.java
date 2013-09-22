import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Class407 implements Iterator {

   int anInt_7730;
   AbstractQueue_Sub1 anAbstractQueue_Sub1_7731;
   int anInt_7732 = 0;


   public boolean hasNext() {
      return this.anInt_7732 * -640318313 < this.anAbstractQueue_Sub1_7731.anInt_3335 * -1469343899;
   }

   public void remove() {
      throw new UnsupportedOperationException();
   }

   Class407(AbstractQueue_Sub1 var1) {
      this.anInt_7730 = 421724349 * this.anAbstractQueue_Sub1_7731.anInt_3337;
      this.anAbstractQueue_Sub1_7731 = var1;
   }

   public Object next() {
      if(1982549843 * this.anInt_7730 != this.anAbstractQueue_Sub1_7731.anInt_3337 * 827494471) {
         throw new ConcurrentModificationException();
      } else if(-640318313 * this.anInt_7732 < -1469343899 * this.anAbstractQueue_Sub1_7731.anInt_3335) {
         Object var1 = this.anAbstractQueue_Sub1_7731.aClass400Array_3334[this.anInt_7732 * -640318313].anObject_7610;
         this.anInt_7732 += -2019149017;
         return var1;
      } else {
         throw new NoSuchElementException();
      }
   }

   static final void method5023(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      Class100.method1298(var3, var0, (byte)-10);
   }

   static final void method5024(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class104_Sub23.method7400(2078215641).getLanguageID(-163915355);
   }

   static final void method5025(RSInterfaceData var0, int var1) {
      NPC var2 = (NPC)var0.animeTarget;
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var2.anInt_1779 * -850211617;
   }

   static final int method5026(int var0, int var1) {
      int var2 = var0 & 63;
      int var3 = var0 >> 6 & 3;
      if(var2 == 18) {
         if(0 == var3) {
            return 1;
         }

         if(1 == var3) {
            return 2;
         }

         if(2 == var3) {
            return 4;
         }

         if(3 == var3) {
            return 8;
         }
      } else if(var2 == 19 || 21 == var2) {
         if(0 == var3) {
            return 16;
         }

         if(1 == var3) {
            return 32;
         }

         if(var3 == 2) {
            return 64;
         }

         if(3 == var3) {
            return 128;
         }
      }

      return 0;
   }
}
