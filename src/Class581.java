import java.util.Iterator;

public class Class581 implements Iterator {

   Class598[] aClass598Array_9704;
   int anInt_9705;


   public Object next() {
      return this.aClass598Array_9704[(this.anInt_9705 += -915955945) * 471173287 - 1];
   }

   public void remove() {
      throw new UnsupportedOperationException();
   }

   public boolean hasNext() {
      return this.anInt_9705 * 471173287 < this.aClass598Array_9704.length;
   }

   Class581(Class598[] var1) {
      this.aClass598Array_9704 = var1;
   }

   public static void method6322(int var0, int var1, int var2, int var3, int var4, int var5, int var6, byte var7) {
      Class240_Sub30 var8 = null;

      for(Class240_Sub30 var9 = (Class240_Sub30)Class240_Sub30.aNodeList_7421.getBaseNode_2((byte)18); var9 != null; var9 = (Class240_Sub30)Class240_Sub30.aNodeList_7421.getNext(-416071620)) {
         if(var9.anInt_7423 * -511987961 == var0 && var9.anInt_7409 * -1480406251 == var1 && var2 == -1398294791 * var9.anInt_7422 && var3 == var9.anInt_7410 * -2030620795) {
            var8 = var9;
            break;
         }
      }

      if(var8 == null) {
         var8 = new Class240_Sub30();
         var8.anInt_7423 = var0 * 1048612535;
         var8.anInt_7410 = var3 * 537489741;
         var8.anInt_7409 = 813050941 * var1;
         var8.anInt_7422 = 1933126473 * var2;
         if(var1 >= 0 && var2 >= 0 && var1 < client.aClass296_348.getMaxX((byte)-97) && var2 < client.aClass296_348.getMaxY(-443511082)) {
            Class77.method986(var8, 1294913192);
         }

         Class240_Sub30.aNodeList_7421.addNode(var8, (short)9367);
      }

      var8.anInt_7415 = -1257280717 * var4;
      var8.anInt_7411 = var5 * 54676535;
      var8.anInt_7416 = var6 * -397343849;
      var8.aBoolean_7419 = true;
      var8.aBoolean_7420 = false;
   }

   static final void method6323(RSInterfaceData var0, int var1) {
      LanguagePack.method5992(var0, (short)255);
   }

   static final void method6324(RSInterfaceData var0, byte var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      Class319.method3955(var3, var0, 370122763);
   }
}
