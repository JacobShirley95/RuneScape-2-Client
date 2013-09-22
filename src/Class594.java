import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Class594 {

   boolean aBoolean_9814 = false;
   boolean aBoolean_9815 = false;
   Class231_Sub2_Sub1_Sub1[] aClass231_Sub2_Sub1_Sub1Array_9816 = new Class231_Sub2_Sub1_Sub1[8192];
   public boolean aBoolean_9817 = false;
   long aLong_9818;
   long aLong_9819;
   int anInt_9820 = 0;
   int anInt_9821 = 0;
   List aList_9822 = new LinkedList();
   int anInt_9823 = 0;
   boolean aBoolean_9824 = false;
   static boolean[] aBooleanArray_9825 = new boolean[16];
   int anInt_9826;
   Class167 aClass167_9827 = new Class167();
   static boolean[] aBooleanArray_9828 = new boolean[64];
   List aList_9829 = new LinkedList();


   void method6428(int var1, boolean var2) {
      Class597.aList_9869.add(this);
      this.aLong_9819 = (long)var1;
      this.aLong_9818 = (long)var1;
      this.aBoolean_9824 = true;
      this.aBoolean_9814 = var2;
   }

   public void method6429() {
      this.aBoolean_9824 = true;
   }

   void method6430() {
      this.aBoolean_9817 = true;
      Iterator var1 = this.aList_9822.iterator();

      while(var1.hasNext()) {
         Class240_Sub18 var2 = (Class240_Sub18)var1.next();
         if(var2.aClass401_7128.anInt_7626 * -1754227241 == 1) {
            var2.shiftNext();
         }
      }

      for(int var3 = 0; var3 < this.aClass231_Sub2_Sub1_Sub1Array_9816.length; ++var3) {
         if(this.aClass231_Sub2_Sub1_Sub1Array_9816[var3] != null) {
            this.aClass231_Sub2_Sub1_Sub1Array_9816[var3].method2435();
            this.aClass231_Sub2_Sub1_Sub1Array_9816[var3] = null;
         }
      }

      this.anInt_9823 = 0;
      this.aList_9829 = new LinkedList();
      this.anInt_9821 = 0;
      this.aList_9822 = new LinkedList();
      this.anInt_9820 = 0;
   }

   public void method6431() {
      this.aBoolean_9815 = true;
   }

   void method6432() {
      this.aBoolean_9815 = false;
   }

   public void method6433(long var1) {
      this.aLong_9819 = var1;
   }

   public Class167 method6434() {
      return this.aClass167_9827;
   }

   void method6435(Renderer var1, Class86[] var2, boolean var3) {
      for(int var4 = 0; var4 < 64; ++var4) {
         aBooleanArray_9828[var4] = false;
      }

      Iterator var7 = this.aList_9829.iterator();

      label60:
      while(var7.hasNext()) {
         Class578 var5 = (Class578)var7.next();
         if(var2 != null) {
            for(int var6 = 0; var6 < var2.length; ++var6) {
               if(var5.aClass86_9694 == var2[var6] || var5.aClass86_9694 == var2[var6].aClass86_1742) {
                  aBooleanArray_9828[var6] = true;
                  var5.method6307(1935641767);
                  var5.aBoolean_9688 = false;
                  continue label60;
               }
            }
         }

         if(!var3) {
            if(var5.anInt_9690 * 669674077 == 0) {
               var7.remove();
               --this.anInt_9821;
            } else {
               var5.aBoolean_9688 = true;
            }
         }
      }

      if(var2 != null) {
         for(int var8 = 0; var8 < var2.length && var8 != 64 && this.anInt_9821 != 64; ++var8) {
            if(!aBooleanArray_9828[var8]) {
               Class578 var9 = new Class578(var1, var2[var8], this, this.aLong_9819);
               this.aList_9829.add(var9);
               ++this.anInt_9821;
               aBooleanArray_9828[var8] = true;
            }
         }
      }

   }

   void method6436(Class172[] var1, boolean var2) {
      int var3;
      for(var3 = 0; var3 < 16; ++var3) {
         aBooleanArray_9825[var3] = false;
      }

      Iterator var6 = this.aList_9822.iterator();

      Class240_Sub18 var4;
      label69:
      while(var6.hasNext()) {
         var4 = (Class240_Sub18)var6.next();
         if(var1 != null) {
            for(int var5 = 0; var5 < var1.length; ++var5) {
               if(var4.aClass172_7131 == var1[var5] || var4.aClass172_7131 == var1[var5].aClass172_3035) {
                  aBooleanArray_9825[var5] = true;
                  var4.method4770((byte)0);
                  continue label69;
               }
            }
         }

         if(!var2) {
            var4.shiftNext();
            --this.anInt_9820;
            if(var4.hasNext()) {
               var4.shiftNext();
               Class597.anInt_9868 -= -1743952791;
            }
         }
      }

      if(var1 != null) {
         for(var3 = 0; var3 < var1.length && var3 != 16 && this.anInt_9820 != 16; ++var3) {
            if(!aBooleanArray_9825[var3]) {
               var4 = null;
               if(var1[var3].method2169((byte)111).anInt_7626 * -1754227241 == 1 && Class597.anInt_9868 * 1484680153 < 32) {
                  var4 = new Class240_Sub18(var1[var3], this);
                  Class597.aNodeArrayList_9859.insert(var4, (long)(var1[var3].anInt_3040 * 94661645));
                  Class597.anInt_9868 += -1743952791;
               }

               if(var4 == null) {
                  var4 = new Class240_Sub18(var1[var3], this);
               }

               this.aList_9822.add(var4);
               ++this.anInt_9820;
               aBooleanArray_9825[var3] = true;
            }
         }
      }

   }

   public Class167 method6437() {
      this.aClass167_9827.aClass505_3024.method5862(-867721278);

      for(int var1 = 0; var1 < this.aClass231_Sub2_Sub1_Sub1Array_9816.length; ++var1) {
         if(this.aClass231_Sub2_Sub1_Sub1Array_9816[var1] != null && this.aClass231_Sub2_Sub1_Sub1Array_9816[var1].aClass578_3281 != null) {
            this.aClass167_9827.aClass505_3024.method5864(this.aClass231_Sub2_Sub1_Sub1Array_9816[var1], 2080227876);
         }
      }

      return this.aClass167_9827;
   }

   public void method6438(Renderer var1, long var2, Class86[] var4, Class172[] var5, boolean var6) {
      if(!this.aBoolean_9817) {
         this.method6435(var1, var4, var6);
         this.method6436(var5, var6);
         this.aLong_9819 = var2;
      }
   }

   void method6439(WorldObjects var1, Renderer var2) {
      this.aClass167_9827.aClass505_3024.method5862(-867721278);
      Iterator var3 = this.aList_9829.iterator();

      while(var3.hasNext()) {
         Class578 var4 = (Class578)var3.next();
         var4.method6309(var1, var2, this.aLong_9818);
      }

   }

   Class594(int var1, boolean var2) {
      this.method6428(var1, var2);
   }

   public static Class594 method6440(int var0, boolean var1) {
      if(Class597.anInt_9867 * 1886887541 != Class597.anInt_9863 * -485677733) {
         Class594 var2 = Class293.aClass594Array_5921[Class597.anInt_9863 * -485677733];
         Class597.anInt_9863 = (Class597.anInt_9863 * -485677733 + 1 & Class84.anIntArray_1709[Class597.anInt_9865 * -80546315]) * 1245086419;
         var2.method6428(var0, var1);
         return var2;
      } else {
         return new Class594(var0, var1);
      }
   }

   public void method6441(int var1, int var2, int var3, int var4, int var5) {
      this.anInt_9826 = var1;
   }

   boolean method6442(Renderer var1, long var2) {
      if(this.aLong_9819 != this.aLong_9818) {
         this.method6431();
      } else {
         this.method6432();
      }

      if(var2 - this.aLong_9819 > 750L) {
         this.method6430();
         return false;
      } else {
         int var4 = (int)(var2 - this.aLong_9818);
         Iterator var5;
         Class578 var6;
         if(this.aBoolean_9824) {
            var5 = this.aList_9829.iterator();

            while(var5.hasNext()) {
               var6 = (Class578)var5.next();

               for(int var7 = 0; var7 < var6.aClass411_9684.anInt_7808 * 253164025; ++var7) {
                  var6.method6308(var1, var2, 1, !this.aBoolean_9815, (byte)0);
               }
            }

            this.aBoolean_9824 = false;
         }

         var5 = this.aList_9829.iterator();

         while(var5.hasNext()) {
            var6 = (Class578)var5.next();
            var6.method6308(var1, var2, var4, !this.aBoolean_9815, (byte)0);
         }

         this.aLong_9818 = var2;
         return true;
      }
   }

}
