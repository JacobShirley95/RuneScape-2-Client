import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Class576 {

   static Map aMap_9663 = new HashMap();
   public static int anInt_9664;


   Class576() throws Throwable {
      throw new Error();
   }

   public static int method6292(int var0, int var1, int var2, int var3) {
      var2 &= 3;
      return 0 == var2?var1:(1 == var2?7 - var0:(2 == var2?7 - var1:var0));
   }

   static void method6293(RSInterfaceData var0, int var1) {
      Class559 var2 = HintMarker.aClass583_3709.method6327(var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111], -1397828712);
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var2.anIntArray_9569 == null?0:var2.anIntArray_9569.length;
   }

   static byte[] method6294(File var0, int var1, byte var2) {
      try {
         byte[] var3 = new byte[var1];
         Class79.method1044(var0, var3, var1, (byte)-112);
         return var3;
      } catch (IOException var4) {
         return null;
      }
   }

   static final void method6295(RSInterfaceData var0, int var1) {
      var0.intTypeIndex -= -1416056414;
      int var2 = var0.intTypes[var0.intTypeIndex * -831324111];
      int var3 = var0.intTypes[1 + -831324111 * var0.intTypeIndex];
      var0.aClass420_9507.anIntArray_7966[var2] = var3;
   }

   static void method6296(Class268 var0, int var1) {
      var0.aClass563_Sub1_4643 = null;
      Stack var2 = Class268.aStack_4644;
      synchronized(Class268.aStack_4644) {
         if(Class268.aStack_4644.size() < 200) {
            Class268.aStack_4644.push(var0);
         }
      }
   }
}
