import java.net.MalformedURLException;
import java.net.URL;

public class Class429 implements Class415 {

   public final int anInt_8260;


   Class429(int var1) {
      this.anInt_8260 = var1 * -1273207939;
   }

   public Class408 method5142(int var1) {
      return Class408.aClass408_7747;
   }

   static boolean method5315(String var0, short var1) {
      if(null == var0) {
         return false;
      } else {
         try {
            new URL(var0);
            return true;
         } catch (MalformedURLException var3) {
            return false;
         }
      }
   }

   static final void method5316(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      Class127.method1634(var3, var4, var0, 283938990);
   }

   static final void method5317(RSInterfaceData var0, byte var1) {
      String var2 = (String)var0.stringData[(var0.stringDataIndex -= -1828074049) * 863838783];
      Class120.method1517(var2, 1103477589);
   }

   static final void method5318(RSInterfaceData var0, byte var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class547.method6103(-243034353 * client.loginStage, 1532328979)?1:0;
   }

   static final void method5319(RSInterfaceData var0, byte var1) {
      Class522 var2 = Class282.method3657(2098723055);
      String var3 = ClientSuper.method2892(701568006);
      if(null == var3) {
         var3 = "";
      }

      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var2.getLanguageID(1796047097);
      var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = var3;
   }
}
