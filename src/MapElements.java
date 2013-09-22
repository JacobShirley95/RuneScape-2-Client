import java.util.Iterator;

public class MapElements {

   public int[] positionData;
   public int size;
   public int[] cacheIDs;


   public MapElements(int var1) {
      this.size = -152973557 * var1;
      this.positionData = new int[this.size * 655819939];
      this.cacheIDs = new int[this.size * 655819939];
   }

   public static boolean method2924(CharSequence var0, int var1) {
      return Class5.method27(var0, 10, true, 389034984);
   }

   public static void method2925(byte var0) {
      int var1 = Class293.aLinkedList_5920.size();
      Iterator var2 = Class293.aLinkedList_5920.iterator();

      while(var2.hasNext()) {
         Class240_Sub2 var3 = (Class240_Sub2)var2.next();
         var3.method4415(var3.method4416() + var3.method4417() / (var1 * 2));
         if(!var3.method4422()) {
            var2.remove();
         }
      }

   }

   static void method2926(int var0, int var1, int var2) {
      Class240_Sub22_Sub5 var3 = Class65_Sub1_Sub2.method866(7, (long)var0);
      var3.method596((byte)23);
      var3.anInt_1175 = var1 * 134353971;
   }
}
