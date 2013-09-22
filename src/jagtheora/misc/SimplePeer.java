package jagtheora.misc;


public abstract class SimplePeer {

   private long peer;


   private static native void init();

   public final boolean method5439() {
      return 0L == this.peer;
   }

   public final void method5440() {
      if(!this.method5439()) {
         this.method5441();
      }

   }

   protected abstract void method5441();

   protected void finalize() throws Throwable {
      if(!this.method5439()) {
         this.method5440();
      }

      super.finalize();
   }

   static {
      init();
   }
}
