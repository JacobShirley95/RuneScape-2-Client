
public class Class563 {

   protected boolean aBoolean_9591;
   Class348 aClass348_9592 = new Class348();
   boolean aBoolean_9593 = true;
   Class348 aClass348_9594 = new Class348();
   boolean aBoolean_9595 = true;
   Viewport aViewport_9596;
   Class563 aClass563_9597;
   Class563 aClass563_9598;
   boolean aBoolean_9599;
   Class563 aClass563_9600;
   Class348 aClass348_9601 = new Class348();


   public final Class348 method6202() {
      return this.aClass348_9601;
   }

   public final Class348 method6203() {
      if(this.aBoolean_9593) {
         this.aBoolean_9593 = false;
         this.aClass348_9592.method4348(this.aClass348_9601);
         if(this.aClass563_9597 != null) {
            this.aClass348_9592.method4350(this.aClass563_9597.method6203());
         }
      }

      return this.aClass348_9592;
   }

   final Viewport getTransform() {
      if(this.aBoolean_9599) {
         this.aBoolean_9599 = false;
         this.aViewport_9596.method4623(this.method6203());
      }

      return this.aViewport_9596;
   }

   final void method6205(Class348 var1) {
      this.aClass348_9601.method4348(var1);
      this.method6210();
      if(this.aClass563_9600 != null) {
         this.aClass563_9600.method6211();
      }

   }

   public final void method6206(Class342 var1) {
      this.aClass348_9601.aClass342_6586.method4226(var1);
      this.method6210();
      if(this.aClass563_9600 != null) {
         this.aClass563_9600.method6211();
      }

   }

   public final void setPos(GameCoord var1) {
      this.aClass348_9601.gameCoord.setPos(var1);
      this.method6210();
      if(this.aClass563_9600 != null) {
         this.aClass563_9600.method6211();
      }

   }

   final Class348 method6208() {
      if(this.aBoolean_9595) {
         this.aBoolean_9595 = false;
         this.aClass348_9594.method4348(this.method6203());
         this.aClass348_9594.method4349();
      }

      return this.aClass348_9592;
   }

   final void method6209(Class348 var1) {
      if(this.aClass563_9597 != null) {
         Class348 var2 = new Class348(var1);
         var2.method4350(this.aClass563_9597.method6208());
         this.method6205(var2);
      } else {
         this.method6205(var1);
      }

   }

   final void method6210() {
      this.aBoolean_9593 = true;
      this.aBoolean_9595 = true;
      this.aBoolean_9599 = true;
      this.aBoolean_9591 = true;
   }

   final void method6211() {
      this.method6210();
      if(this.aClass563_9600 != null) {
         this.aClass563_9600.method6211();
      }

      if(this.aClass563_9598 != null) {
         this.aClass563_9598.method6211();
      }

   }

   public final void method6212() {
      Class563 var1;
      if(this.aClass563_9597 != null) {
         var1 = this.aClass563_9597.aClass563_9600;
         if(var1 == this) {
            this.aClass563_9597.aClass563_9600 = this.aClass563_9598;
         } else {
            while(var1.aClass563_9598 != this) {
               var1 = var1.aClass563_9598;
            }

            var1.aClass563_9598 = this.aClass563_9598;
         }
      }

      this.method6210();
      if(this.aClass563_9600 != null) {
         this.aClass563_9600.method6211();
         var1 = this.aClass563_9600;

         while(true) {
            var1.aClass348_9601.method4350(this.aClass348_9601);
            var1.aClass563_9597 = this.aClass563_9597;
            if(var1.aClass563_9598 == null) {
               var1.aClass563_9598 = this.aClass563_9597.aClass563_9600;
               this.aClass563_9597.aClass563_9600 = this.aClass563_9600;
               break;
            }

            var1 = var1.aClass563_9598;
         }
      }

      this.aClass563_9597 = null;
      this.aClass563_9598 = null;
      this.aClass563_9600 = null;
   }

   Class563() {
      new ArrayViewport();
      new ArrayViewport();
      this.aViewport_9596 = new Viewport();
      this.aBoolean_9599 = true;
      this.aBoolean_9591 = true;
      this.aClass563_9597 = null;
      this.aClass563_9600 = null;
      this.aClass563_9598 = null;
   }

   public final void setPosition(float var1, float var2, float var3) {
      this.aClass348_9601.gameCoord.setPos(var1, var2, var3);
      this.method6210();
      if(this.aClass563_9600 != null) {
         this.aClass563_9600.method6211();
      }

   }
}
