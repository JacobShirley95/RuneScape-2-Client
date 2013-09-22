
public class Class477 {

   public Object anObject_8742;
   public Object anObject_8743;


   public String toString() {
      return this.anObject_8743 + ", " + this.anObject_8742;
   }

   public boolean equals(Object var1) {
      if(var1 != null && var1 instanceof Class477) {
         Class477 var2 = (Class477)var1;
         if(this.anObject_8743 == null) {
            if(var2.anObject_8743 != null) {
               return false;
            }
         } else if(!this.anObject_8743.equals(var2.anObject_8743)) {
            return false;
         }

         if(this.anObject_8742 == null) {
            if(var2.anObject_8742 != null) {
               return false;
            }
         } else if(!this.anObject_8742.equals(var2.anObject_8742)) {
            return false;
         }

         return true;
      } else {
         return false;
      }
   }

   public Class477(Object var1, Object var2) {
      this.anObject_8743 = var1;
      this.anObject_8742 = var2;
   }

   public int hashCode() {
      int var1 = 0;
      if(this.anObject_8743 != null) {
         var1 += this.anObject_8743.hashCode();
      }

      if(this.anObject_8742 != null) {
         var1 += 31 * this.anObject_8742.hashCode();
      }

      return var1;
   }
}
