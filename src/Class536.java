
public class Class536 implements Class551 {

   static final Class536 aClass536_9442 = new Class536(7, 5);
   static final Class536 aClass536_9443 = new Class536(1, 1);
   static final Class536 aClass536_9444 = new Class536(0, 2);
   static final Class536 aClass536_9445 = new Class536(4, 3);
   public static final Class536 aClass536_9446 = new Class536(5, 4);
   static final Class536 aClass536_9447 = new Class536(6, 0);
   static final Class536 aClass536_9448 = new Class536(3, 6);
   public final int anInt_9449;
   static final Class536 aClass536_9450 = new Class536(2, 7);
   final int anInt_9451;


   public Class536 method6066(int var1) {
      switch(this.anInt_9449 * -1837159453) {
      case 0:
         return aClass536_9448;
      case 1:
         return aClass536_9442;
      case 2:
         return aClass536_9445;
      case 3:
         return aClass536_9444;
      case 4:
         return aClass536_9450;
      case 5:
         return aClass536_9447;
      case 6:
         return aClass536_9446;
      case 7:
         return aClass536_9443;
      default:
         throw new IllegalStateException();
      }
   }

   public int getLanguageID(int var1) {
      return this.anInt_9451 * -1654565633;
   }

   Class536(int var1, int var2) {
      this.anInt_9449 = 2120446411 * var1;
      this.anInt_9451 = var2 * -278549761;
   }

   static final void method6068(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      NodeArrayList.method5943(var3, var4, var0, 1305932618);
   }

   static void method6069(int var0, int var1, int var2, int var3, int var4, int var5, Class532 var6, int var7) {
      Class240_Sub30 var8 = null;

      for(Class240_Sub30 var9 = (Class240_Sub30)Class240_Sub30.aNodeList_7408.getBaseNode_2((byte)73); null != var9; var9 = (Class240_Sub30)Class240_Sub30.aNodeList_7408.getNext(-1515408827)) {
         if(var0 == -511987961 * var9.anInt_7423 && var1 == var9.anInt_7409 * -1480406251 && var2 == var9.anInt_7422 * -1398294791 && var9.anInt_7410 * -2030620795 == var3) {
            var8 = var9;
            break;
         }
      }

      if(null == var8) {
         var8 = new Class240_Sub30();
         var8.anInt_7423 = var0 * 1048612535;
         var8.anInt_7410 = var3 * 537489741;
         var8.anInt_7409 = 813050941 * var1;
         var8.anInt_7422 = 1933126473 * var2;
         Class240_Sub30.aNodeList_7408.addNode(var8, (short)1528);
      }

      var8.anInt_7415 = var4 * -1257280717;
      var8.anInt_7411 = 54676535 * var5;
      var8.aClass532_7417 = var6;
      var8.aBoolean_7419 = true;
      var8.aBoolean_7420 = false;
   }
}
