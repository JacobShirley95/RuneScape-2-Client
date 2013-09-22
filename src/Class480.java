import java.applet.Applet;
import netscape.javascript.JSObject;

public class Class480 {

   public static Object method5701(Applet var0, String var1, int var2) throws Throwable {
      return JSObject.getWindow(var0).call(var1, (Object[])null);
   }

   public static Object method5702(Applet var0, String var1, Object[] var2, int var3) throws Throwable {
      return JSObject.getWindow(var0).call(var1, var2);
   }

   Class480() throws Throwable {
      throw new Error();
   }

   public static void method5703(Applet var0, String var1, byte var2) throws Throwable {
      JSObject.getWindow(var0).eval(var1);
   }
}
