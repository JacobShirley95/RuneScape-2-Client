import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class AbstractQueue_Sub1 extends AbstractQueue {

   final Comparator aComparator_3333;
   Class400[] aClass400Array_3334;
   int anInt_3335;
   Map aMap_3336;
   int anInt_3337;


   public Object peek() {
      return -1469343899 * this.anInt_3335 == 0?null:this.aClass400Array_3334[0].anObject_7610;
   }

   AbstractQueue_Sub1(int var1, Comparator var2) {
      this.anInt_3337 = 0;
      this.aClass400Array_3334 = new Class400[var1];
      this.aMap_3336 = new HashMap();
      this.aComparator_3333 = var2;
   }

   public Object poll() {
      if(0 == this.anInt_3335 * -1469343899) {
         return null;
      } else {
         this.anInt_3337 += 1966610807;
         Object var1 = this.aClass400Array_3334[0].anObject_7610;
         this.aMap_3336.remove(var1);
         this.anInt_3335 -= -885079443;
         if(0 == this.anInt_3335 * -1469343899) {
            this.aClass400Array_3334[-1469343899 * this.anInt_3335] = null;
         } else {
            this.aClass400Array_3334[0] = this.aClass400Array_3334[-1469343899 * this.anInt_3335];
            this.aClass400Array_3334[0].anInt_7609 = 0;
            this.aClass400Array_3334[this.anInt_3335 * -1469343899] = null;
            this.method2501(0, (byte)112);
         }

         return var1;
      }
   }

   public boolean offer(Object var1) {
      if(this.aMap_3336.containsKey(var1)) {
         throw new IllegalArgumentException("");
      } else {
         this.anInt_3337 += 1966610807;
         int var2 = -1469343899 * this.anInt_3335;
         if(var2 >= this.aClass400Array_3334.length) {
            this.method2504((byte)96);
         }

         this.anInt_3335 += -885079443;
         if(0 == var2) {
            this.aClass400Array_3334[0] = new Class400(var1, 0);
            this.aMap_3336.put(var1, this.aClass400Array_3334[0]);
         } else {
            this.aClass400Array_3334[var2] = new Class400(var1, var2);
            this.aMap_3336.put(var1, this.aClass400Array_3334[var2]);
            this.method2507(var2, 615625147);
         }

         return true;
      }
   }

   void method2501(int var1, byte var2) {
      Class400 var3 = this.aClass400Array_3334[var1];

      int var9;
      for(int var4 = this.anInt_3335 * -1469343899 >>> 1; var1 < var4; var1 = var9) {
         int var5 = (var1 << 1) + 1;
         Class400 var6 = this.aClass400Array_3334[var5];
         int var7 = 2 + (var1 << 1);
         Class400 var8 = this.aClass400Array_3334[var7];
         if(this.aComparator_3333 != null) {
            if(var7 < -1469343899 * this.anInt_3335 && this.aComparator_3333.compare(var6.anObject_7610, var8.anObject_7610) > 0) {
               var9 = var7;
            } else {
               var9 = var5;
            }
         } else if(var7 < -1469343899 * this.anInt_3335 && ((Comparable)var6.anObject_7610).compareTo(var8.anObject_7610) > 0) {
            var9 = var7;
         } else {
            var9 = var5;
         }

         if(null != this.aComparator_3333) {
            if(this.aComparator_3333.compare(var3.anObject_7610, this.aClass400Array_3334[var9].anObject_7610) <= 0) {
               break;
            }
         } else if(((Comparable)var3.anObject_7610).compareTo(this.aClass400Array_3334[var9].anObject_7610) <= 0) {
            break;
         }

         this.aClass400Array_3334[var1] = this.aClass400Array_3334[var9];
         this.aClass400Array_3334[var1].anInt_7609 = var1 * -2023452719;
      }

      this.aClass400Array_3334[var1] = var3;
      this.aClass400Array_3334[var1].anInt_7609 = var1 * -2023452719;
   }

   public boolean contains(Object var1) {
      return this.aMap_3336.containsKey(var1);
   }

   public Object[] toArray() {
      Object[] var1 = super.toArray();
      if(this.aComparator_3333 != null) {
         Arrays.sort(var1, this.aComparator_3333);
      } else {
         Arrays.sort(var1);
      }

      return var1;
   }

   void method2504(byte var1) {
      int var2 = 1 + (this.aClass400Array_3334.length << 1);
      this.aClass400Array_3334 = (Class400[])((Class400[])Arrays.copyOf(this.aClass400Array_3334, var2));
   }

   public AbstractQueue_Sub1(int var1) {
      this(var1, (Comparator)null);
   }

   public boolean remove(Object var1) {
      Class400 var2 = (Class400)this.aMap_3336.remove(var1);
      if(var2 == null) {
         return false;
      } else {
         this.anInt_3337 += 1966610807;
         this.anInt_3335 -= -885079443;
         if(1966614833 * var2.anInt_7609 == this.anInt_3335 * -1469343899) {
            this.aClass400Array_3334[this.anInt_3335 * -1469343899] = null;
            return true;
         } else {
            Class400 var3 = this.aClass400Array_3334[-1469343899 * this.anInt_3335];
            this.aClass400Array_3334[this.anInt_3335 * -1469343899] = null;
            this.aClass400Array_3334[var2.anInt_7609 * 1966614833] = var3;
            this.aClass400Array_3334[1966614833 * var2.anInt_7609].anInt_7609 = 1 * var2.anInt_7609;
            this.method2501(var2.anInt_7609 * 1966614833, (byte)9);
            if(this.aClass400Array_3334[1966614833 * var2.anInt_7609] == var3) {
               this.method2507(var2.anInt_7609 * 1966614833, 615625147);
            }

            return true;
         }
      }
   }

   public int size() {
      return -1469343899 * this.anInt_3335;
   }

   void method2507(int var1, int var2) {
      Class400 var3;
      int var4;
      for(var3 = this.aClass400Array_3334[var1]; var1 > 0; var1 = var4) {
         var4 = var1 - 1 >>> 1;
         Class400 var5 = this.aClass400Array_3334[var4];
         if(null != this.aComparator_3333) {
            if(this.aComparator_3333.compare(var3.anObject_7610, var5.anObject_7610) >= 0) {
               break;
            }
         } else if(((Comparable)var3.anObject_7610).compareTo(var5.anObject_7610) >= 0) {
            break;
         }

         this.aClass400Array_3334[var1] = var5;
         this.aClass400Array_3334[var1].anInt_7609 = var1 * -2023452719;
      }

      this.aClass400Array_3334[var1] = var3;
      this.aClass400Array_3334[var1].anInt_7609 = var1 * -2023452719;
   }

   public Iterator iterator() {
      return new Class407(this);
   }
}
