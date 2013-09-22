import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Class636 {

   boolean aBoolean_10100 = false;
   int anInt_10101 = 0;
   public List aList_10102 = new LinkedList();
   int anInt_10103 = 0;


   public void method6715(int var1) {
      Iterator var2 = this.aList_10102.iterator();

      while(var2.hasNext()) {
         Class268 var3 = (Class268)var2.next();
         var2.remove();
         Class576.method6296(var3, -1961961931);
      }

   }

   void method6716(Class268 var1, byte var2) {
      Class563_Sub1 var3 = var1.aClass563_Sub1_4643;
      boolean var4 = true;
      Class92[] var5 = var1.aClass563_Sub1_4643.aClass92Array_6938;

      for(int var6 = 0; var6 < var5.length; ++var6) {
         if(var5[var6].aBoolean_1828) {
            var4 = false;
            break;
         }
      }

      if(!var4) {
         var1.aClass636_4645 = this;
         Class268 var7;
         if(this.aBoolean_10100) {
            Iterator var8 = this.aList_10102.iterator();

            while(var8.hasNext()) {
               var7 = (Class268)var8.next();
               if(var3 == var7.aClass563_Sub1_4643) {
                  var8.remove();
                  Class576.method6296(var7, -1161287524);
               }
            }
         }

         ListIterator var9 = this.aList_10102.listIterator();

         do {
            if(!var9.hasNext()) {
               this.aList_10102.add(var1);
               return;
            }

            var7 = (Class268)var9.next();
         } while(var3.zIndex * 1631890299 < 1631890299 * var7.aClass563_Sub1_4643.zIndex);

         var9.previous();
         var9.add(var1);
      }
   }

   Class636(boolean var1) {
      this.aBoolean_10100 = var1;
   }

   static final void method6717(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, byte var3) {
      var2.intTypeIndex -= 1462854468;
      var0.anInt_2451 = var2.intTypes[-831324111 * var2.intTypeIndex] * -1460560313;
      var0.anInt_2446 = var2.intTypes[1 + -831324111 * var2.intTypeIndex] * 1403108011;
      int var4 = var2.intTypes[-831324111 * var2.intTypeIndex + 2];
      if(var4 < 0) {
         var4 = 0;
      } else if(var4 > 5) {
         var4 = 5;
      }

      int var5 = var2.intTypes[-831324111 * var2.intTypeIndex + 3];
      if(var5 < 0) {
         var5 = 0;
      } else if(var5 > 5) {
         var5 = 5;
      }

      var0.aByte_2431 = (byte)var4;
      var0.aByte_2477 = (byte)var5;
      Class110_Sub1.method3149(var0, 374482947);
      Class174_Sub2.method7577(var1, var0, -1906339601);
      if(0 == 1916189739 * var0.index) {
         Class20.method120(var1, var0, false, 1753440788);
      }

      if(-1 == var0.anInt_2428 * -1001687885 && !var1.aBoolean_2054) {
         Class240_Sub52_Sub6.method500(var0.cacheID * 1278853609, 1470429868);
      }

   }

   static final void method6718(RSInterfaceData var0, byte var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = ~var2;
   }

   static final void method6719(RSInterfaceData var0, int var1) {
      String var2 = (String)var0.stringData[(var0.stringDataIndex -= -1828074049) * 863838783];
      var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = Class86.method1129(var2, 285311039);
   }

   public static boolean method6720(int var0, int var1) {
      return var0 == 4 || 14 == var0 || var0 == 2 || 11 == var0;
   }

   static final void method6721(int var0, int var1, int var2, byte var3) {
      String var4 = "tele " + var0 + Class8.commaStr + (var1 >> 6) + Class8.commaStr + (var2 >> 6) + Class8.commaStr + (var1 & 63) + Class8.commaStr + (var2 & 63);
      System.out.println(var4);
      Class66.acceptCommand(var4, true, false, 33618016);
   }
}
