import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;

public final class Class454 {

   ReferenceQueue aReferenceQueue_8555 = new ReferenceQueue();
   WeakReference_Sub1[] aWeakReference_Sub1Array_8556 = new WeakReference_Sub1[16];
   int anInt_8557;


   void method5534(int var1) {
      WeakReference_Sub1[] var2 = this.aWeakReference_Sub1Array_8556;
      this.aWeakReference_Sub1Array_8556 = new WeakReference_Sub1[2 * var2.length];
      WeakReference_Sub1[] var3 = var2;

      WeakReference_Sub1 var6;
      for(int var4 = 0; var4 < var3.length; ++var4) {
         for(WeakReference_Sub1 var5 = var3[var4]; null != var5; var5 = var6) {
            var6 = var5.aWeakReference_Sub1_3372;
            int var7 = var5.anInt_3371 * -2095385381 & this.aWeakReference_Sub1Array_8556.length - 1;
            var5.aWeakReference_Sub1_3372 = this.aWeakReference_Sub1Array_8556[var7];
            this.aWeakReference_Sub1Array_8556[var7] = var5;
         }
      }

   }

   public void method5535(Object var1, Object var2, int var3) {
      if(null == var1) {
         throw new NullPointerException();
      } else {
         this.method5537((byte)-40);
         int var4 = System.identityHashCode(var1);
         int var5 = var4 & this.aWeakReference_Sub1Array_8556.length - 1;
         WeakReference_Sub1 var6 = this.aWeakReference_Sub1Array_8556[var5];
         if(var6 == null) {
            this.aWeakReference_Sub1Array_8556[var5] = new WeakReference_Sub1(var1, this.aReferenceQueue_8555, var4, var2);
            this.anInt_8557 += -709915371;
            if(this.anInt_8557 * -1614128579 >= this.aWeakReference_Sub1Array_8556.length) {
               this.method5534(-1253716311);
            }
         } else {
            while(var6.get() != var1) {
               if(null == var6.aWeakReference_Sub1_3372) {
                  var6.aWeakReference_Sub1_3372 = new WeakReference_Sub1(var1, this.aReferenceQueue_8555, var4, var2);
                  this.anInt_8557 += -709915371;
                  if(this.anInt_8557 * -1614128579 >= this.aWeakReference_Sub1Array_8556.length) {
                     this.method5534(-1253716311);
                  }
                  break;
               }

               var6 = var6.aWeakReference_Sub1_3372;
            }
         }

      }
   }

   public void method5536(Object var1, byte var2) {
      if(var1 == null) {
         throw new NullPointerException();
      } else {
         this.method5537((byte)26);
         int var3 = System.identityHashCode(var1);
         int var4 = var3 & this.aWeakReference_Sub1Array_8556.length - 1;
         WeakReference_Sub1 var5 = this.aWeakReference_Sub1Array_8556[var4];
         if(null != var5) {
            if(var5.get() == var1) {
               this.aWeakReference_Sub1Array_8556[var4] = var5.aWeakReference_Sub1_3372;
               this.anInt_8557 -= -709915371;
            } else {
               while(true) {
                  WeakReference_Sub1 var6 = var5.aWeakReference_Sub1_3372;
                  if(var6 == null) {
                     break;
                  }

                  if(var6.get() == var1) {
                     var5.aWeakReference_Sub1_3372 = var6.aWeakReference_Sub1_3372;
                     this.anInt_8557 -= -709915371;
                     break;
                  }

                  var5 = var6;
               }
            }

         }
      }
   }

   void method5537(byte var1) {
      while(true) {
         WeakReference_Sub1 var2 = (WeakReference_Sub1)this.aReferenceQueue_8555.poll();
         if(var2 == null) {
            return;
         }

         int var3 = var2.anInt_3371 * -2095385381 & this.aWeakReference_Sub1Array_8556.length - 1;
         WeakReference_Sub1 var4 = this.aWeakReference_Sub1Array_8556[var3];
         if(var4 == var2) {
            this.aWeakReference_Sub1Array_8556[var3] = var2.aWeakReference_Sub1_3372;
            this.anInt_8557 -= -709915371;
         } else {
            while(null != var4 && var4.aWeakReference_Sub1_3372 != var2) {
               var4 = var4.aWeakReference_Sub1_3372;
            }

            if(null != var4) {
               var4.aWeakReference_Sub1_3372 = var2.aWeakReference_Sub1_3372;
               this.anInt_8557 -= -709915371;
            }
         }
      }
   }

   public ArrayList method5538(int var1) {
      this.method5537((byte)-5);
      ArrayList var2 = new ArrayList(-1614128579 * this.anInt_8557);
      WeakReference_Sub1[] var3 = this.aWeakReference_Sub1Array_8556;

      for(int var4 = 0; var4 < var3.length; ++var4) {
         for(WeakReference_Sub1 var5 = var3[var4]; var5 != null; var5 = var5.aWeakReference_Sub1_3372) {
            Object var6 = var5.get();
            if(var6 != null) {
               var2.add(var6);
            }
         }
      }

      return var2;
   }

   static final void method5539(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class521.myPlayer.aClass6_4337.getRotation((byte)98);
   }

   static void method5540(int var0, boolean var1, int var2) {
      Class240_Sub46 var3 = Class416.method5153(var0, var1, (byte)-107);
      if(null != var3) {
         for(int var4 = 0; var4 < var3.anIntArray_7650.length; ++var4) {
            var3.anIntArray_7650[var4] = -1;
            var3.anIntArray_7647[var4] = 0;
         }

      }
   }
}
