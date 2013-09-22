
public class Class240_Sub41_Sub3 extends Class240_Sub41 {

   Class240_Sub41_Sub4 aClass240_Sub41_Sub4_1021 = new Class240_Sub41_Sub4();
   NodeList aNodeList_1022 = new NodeList();
   Class240_Sub41_Sub2 aClass240_Sub41_Sub2_1023;
   public static Class23 aClass23_1024;


   Class240_Sub41 method4931() {
      Class240_Sub48 var1;
      do {
         var1 = (Class240_Sub48)this.aNodeList_1022.getNext(-1839628734);
         if(null == var1) {
            return null;
         }
      } while(null == var1.aClass240_Sub41_Sub5_7688);

      return var1.aClass240_Sub41_Sub5_7688;
   }

   int method4933() {
      return 0;
   }

   void method4937(int[] var1, int var2, int var3) {
      this.aClass240_Sub41_Sub4_1021.method4937(var1, var2, var3);

      for(Class240_Sub48 var4 = (Class240_Sub48)this.aNodeList_1022.getBaseNode_2((byte)89); var4 != null; var4 = (Class240_Sub48)this.aNodeList_1022.getNext(-23447508)) {
         if(!this.aClass240_Sub41_Sub2_1023.method471(var4, (byte)79)) {
            int var5 = var2;
            int var6 = var3;

            do {
               if(var6 <= var4.anInt_7670 * 1979219363) {
                  this.method495(var4, var1, var5, var6, var6 + var5, (byte)-24);
                  var4.anInt_7670 -= -1466393077 * var6;
                  break;
               }

               this.method495(var4, var1, var5, 1979219363 * var4.anInt_7670, var5 + var6, (byte)-111);
               var5 += var4.anInt_7670 * 1979219363;
               var6 -= var4.anInt_7670 * 1979219363;
            } while(!this.aClass240_Sub41_Sub2_1023.method472(var4, var1, var5, var6, 917464470));
         }
      }

   }

   void method4935(int var1) {
      this.aClass240_Sub41_Sub4_1021.method4935(var1);

      for(Class240_Sub48 var2 = (Class240_Sub48)this.aNodeList_1022.getBaseNode_2((byte)41); var2 != null; var2 = (Class240_Sub48)this.aNodeList_1022.getNext(-1514452129)) {
         if(!this.aClass240_Sub41_Sub2_1023.method471(var2, (byte)116)) {
            int var3 = var1;

            do {
               if(var3 <= var2.anInt_7670 * 1979219363) {
                  this.method497(var2, var3, -825171078);
                  var2.anInt_7670 -= var3 * -1466393077;
                  break;
               }

               this.method497(var2, 1979219363 * var2.anInt_7670, -1235509783);
               var3 -= var2.anInt_7670 * 1979219363;
            } while(!this.aClass240_Sub41_Sub2_1023.method472(var2, (int[])null, 0, var3, 917464470));
         }
      }

   }

   Class240_Sub41_Sub3(Class240_Sub41_Sub2 var1) {
      this.aClass240_Sub41_Sub2_1023 = var1;
   }

   void method495(Class240_Sub48 var1, int[] var2, int var3, int var4, int var5, byte var6) {
      if((this.aClass240_Sub41_Sub2_1023.anIntArray_974[-1932051005 * var1.anInt_7685] & 4) != 0 && 1620679509 * var1.anInt_7684 < 0) {
         int var7 = this.aClass240_Sub41_Sub2_1023.anIntArray_996[var1.anInt_7685 * -1932051005] / Class316.anInt_6135;

         while(true) {
            int var8 = (1048575 + var7 - var1.anInt_7689 * -59218445) / var7;
            if(var8 > var4) {
               var1.anInt_7689 += 890813243 * var7 * var4;
               break;
            }

            var1.aClass240_Sub41_Sub5_7688.method4937(var2, var3, var8);
            var3 += var8;
            var4 -= var8;
            var1.anInt_7689 += 890813243 * (var7 * var8 - 1048576);
            int var9 = Class316.anInt_6135 / 100;
            int var10 = 262144 / var7;
            if(var10 < var9) {
               var9 = var10;
            }

            Class240_Sub41_Sub5 var11 = var1.aClass240_Sub41_Sub5_7688;
            if(0 == this.aClass240_Sub41_Sub2_1023.anIntArray_992[-1932051005 * var1.anInt_7685]) {
               var1.aClass240_Sub41_Sub5_7688 = var1.aClass240_Sub7_Sub1_7672.method509(var11.method614(1870072465), var11.method607(1401268299), var11.method608(-7205838));
            } else {
               var1.aClass240_Sub41_Sub5_7688 = var1.aClass240_Sub7_Sub1_7672.method509(var11.method614(1870072465), 0, var11.method608(-7205838));
               this.aClass240_Sub41_Sub2_1023.method447(var1, var1.aClass240_Sub34_7687.aShortArray_7485[690065911 * var1.anInt_7675] < 0, (byte)-127);
               var1.aClass240_Sub41_Sub5_7688.method623(var9, var11.method607(-330846033), -445710157);
            }

            if(var1.aClass240_Sub34_7687.aShortArray_7485[var1.anInt_7675 * 690065911] < 0) {
               var1.aClass240_Sub41_Sub5_7688.method603(-1, 1884987856);
            }

            var11.method622(var9, 1653552186);
            var11.method4937(var2, var3, var5 - var3);
            if(var11.method620(-1475557922)) {
               this.aClass240_Sub41_Sub4_1021.method521(var11);
            }
         }
      }

      var1.aClass240_Sub41_Sub5_7688.method4937(var2, var3, var4);
   }

   Class240_Sub41 method4936() {
      Class240_Sub48 var1 = (Class240_Sub48)this.aNodeList_1022.getBaseNode_2((byte)36);
      return (Class240_Sub41)(null == var1?null:(var1.aClass240_Sub41_Sub5_7688 != null?var1.aClass240_Sub41_Sub5_7688:this.method4931()));
   }

   void method497(Class240_Sub48 var1, int var2, int var3) {
      if((this.aClass240_Sub41_Sub2_1023.anIntArray_974[var1.anInt_7685 * -1932051005] & 4) != 0 && 1620679509 * var1.anInt_7684 < 0) {
         int var4 = this.aClass240_Sub41_Sub2_1023.anIntArray_996[-1932051005 * var1.anInt_7685] / Class316.anInt_6135;
         int var5 = (1048575 + var4 - -59218445 * var1.anInt_7689) / var4;
         var1.anInt_7689 = (var2 * var4 + -59218445 * var1.anInt_7689 & 1048575) * 890813243;
         if(var5 <= var2) {
            Class240_Sub41_Sub5 var6 = var1.aClass240_Sub41_Sub5_7688;
            if(this.aClass240_Sub41_Sub2_1023.anIntArray_992[-1932051005 * var1.anInt_7685] == 0) {
               var1.aClass240_Sub41_Sub5_7688 = var1.aClass240_Sub7_Sub1_7672.method509(var6.method614(1870072465), var6.method607(2067532573), var6.method608(-7205838));
            } else {
               var1.aClass240_Sub41_Sub5_7688 = var1.aClass240_Sub7_Sub1_7672.method509(var6.method614(1870072465), 0, var6.method608(-7205838));
               this.aClass240_Sub41_Sub2_1023.method447(var1, var1.aClass240_Sub34_7687.aShortArray_7485[690065911 * var1.anInt_7675] < 0, (byte)-93);
            }

            if(var1.aClass240_Sub34_7687.aShortArray_7485[var1.anInt_7675 * 690065911] < 0) {
               var1.aClass240_Sub41_Sub5_7688.method603(-1, 1884987856);
            }

            var2 = var1.anInt_7689 * -59218445 / var4;
         }
      }

      var1.aClass240_Sub41_Sub5_7688.method4935(var2);
   }
}
