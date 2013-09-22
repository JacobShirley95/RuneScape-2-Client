package jaclib.ping;


public abstract class IcmpService implements Runnable {

   protected abstract void notify(int var1);

   protected abstract void notify(int var1, int var2, int var3);

   public native void run();

   public native void quit();

   public static native boolean available();

   public native void o();

   public native void k();

   public native void q();
}
