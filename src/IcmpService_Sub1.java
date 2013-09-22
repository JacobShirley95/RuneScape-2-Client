import jaclib.ping.IcmpService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IcmpService_Sub1 extends IcmpService {

   static volatile IcmpService_Sub1 anIcmpService_Sub1_7119;
   final List aList_7120 = new ArrayList();


   protected void notify(int var1) {
      Iterator var2 = this.aList_7120.iterator();

      while(var2.hasNext()) {
         Class553 var3 = (Class553)var2.next();
         var3.method6131(var1 == 0, 1598280485);
      }

   }

   protected void notify(int var1, int var2, int var3) {
      Iterator var4 = this.aList_7120.iterator();

      while(var4.hasNext()) {
         Class553 var5 = (Class553)var4.next();
         var5.method6128(var1, var2, var3, -291443110);
      }

   }

}
