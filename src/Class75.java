
public class Class75 {

   static final int anInt_1405 = 12;
   int anInt_1406 = -2052079441;
   NodeList aNodeList_1407 = new NodeList();
   static final int anInt_1408 = 6;
   static final int anInt_1409 = 2;
   static final int anInt_1410 = 3;
   static final int anInt_1411 = 4;
   static final int anInt_1412 = 13;
   long aLong_1413;
   static final int anInt_1414 = 7;
   static final int anInt_1415 = 8;
   static final int anInt_1416 = 9;
   static final int anInt_1417 = 10;
   static final int anInt_1418 = 11;
   static final int anInt_1419 = 14;
   static final int anInt_1420 = 5;
   static final int anInt_1421 = 1;
   public static Class558 aClass558_1422;


   public void method879(Class68 var1, int var2) {
      if(1446401286912974391L * this.aLong_1413 == -5826985294315614527L * var1.aLong_1294 && 281831857 * this.anInt_1406 == 2022985063 * var1.anInt_1292) {
         for(Class240_Sub52 var3 = (Class240_Sub52)this.aNodeList_1407.getBaseNode_2((byte)99); null != var3; var3 = (Class240_Sub52)this.aNodeList_1407.getNext(-1282794835)) {
            var3.method5260(var1, (byte)15);
         }

         var1.anInt_1292 += 181894743;
      } else {
         throw new RuntimeException("");
      }
   }

   void method880(ByteArrayDataNode var1, int var2) {
      this.aLong_1413 = var1.method4538(1385013726) * 292867019015616391L;
      this.anInt_1406 = var1.method4480(1260717178) * 2052079441;

      for(int var3 = var1.readByte(1638406989); var3 != 0; var3 = var1.readByte(730388520)) {
         Object var4;
         if(3 == var3) {
            var4 = new Class240_Sub52_Sub14(this);
         } else if(1 == var3) {
            var4 = new Class240_Sub52_Sub12(this);
         } else if(var3 == 13) {
            var4 = new Class240_Sub52_Sub11(this);
         } else if(4 == var3) {
            var4 = new Class240_Sub52_Sub5(this);
         } else if(var3 == 6) {
            var4 = new Class240_Sub52_Sub10(this);
         } else if(var3 == 5) {
            var4 = new Class240_Sub52_Sub9(this);
         } else if(var3 == 2) {
            var4 = new Class240_Sub52_Sub6(this);
         } else if(7 == var3) {
            var4 = new Class240_Sub52_Sub1(this);
         } else if(14 == var3) {
            var4 = new Class240_Sub52_Sub13(this);
         } else if(var3 == 8) {
            var4 = new Class240_Sub52_Sub4(this);
         } else if(var3 == 9) {
            var4 = new Class240_Sub52_Sub2(this);
         } else if(10 == var3) {
            var4 = new Class240_Sub52_Sub3(this);
         } else if(11 == var3) {
            var4 = new Class240_Sub52_Sub8(this);
         } else {
            if(12 != var3) {
               throw new RuntimeException("");
            }

            var4 = new Class240_Sub52_Sub7(this);
         }

         ((Class240_Sub52)var4).method5261(var1, (byte)7);
         this.aNodeList_1407.addNode((NodeListNode)var4, (short)-7107);
      }

   }

   public Class75(ByteArrayDataNode var1) {
      this.method880(var1, -2139987650);
   }

   static final void method881(RSInterfaceData var0, byte var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class134.method1787(var3, var4, var0, -1498695837);
   }

   static final void method882(RSInterfaceData var0, int var1) {
      RSInterface var2 = RSServerQueue.getInterface(var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111], (byte)105);
      if(-1 != var2.itemID * 2142376247) {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var2.itemAmount * 736448653;
      } else {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 0;
      }

   }

   static final void method883(RSInterfaceData var0, int var1) {
      Class104_Sub13.method7348(2004934020);
   }

   static final void method884(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = Class534.aClass275_9439.method3606(var2, -1816346176).aString_3541;
   }

   static final void method885(RSInterfaceData var0, int var1) {
      var0.stringDataIndex -= 638819198;
      String var2 = (String)var0.stringData[var0.stringDataIndex * 863838783];
      String var3 = (String)var0.stringData[1 + var0.stringDataIndex * 863838783];
      Class631.method6698(var2, var3, 219052225);
   }

   static boolean method886(int var0, byte var1) {
      return var0 != 9 && 10 != var0 && 11 != var0 && var0 != 12 && var0 != 13 && 1003 != var0?8 == var0:true;
   }
}
