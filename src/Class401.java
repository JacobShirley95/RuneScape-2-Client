
public class Class401 {

   public static final int anInt_7611 = 1;
   public static NodeArrayList aNodeArrayList_7612 = new NodeArrayList(16);
   public int anInt_7613 = 0;
   public int anInt_7614;
   public static final int anInt_7615 = 2;
   public static final int anInt_7616 = 0;
   static final int anInt_7617 = 1;
   public static final int anInt_7618 = 0;
   static final int anInt_7619 = 1;
   public static Class401[] aClass401Array_7620 = new Class401[16];
   static final int anInt_7621 = 0;
   public static final int anInt_7622 = 1;
   static CacheDataUnpacker aCacheUnpacker_7623;
   static CacheNodeArrayList aClass627_7624 = new CacheNodeArrayList(64);
   static int anInt_7625 = 0;
   public int anInt_7626;
   int anInt_7627;
   public int anInt_7628;
   public int anInt_7629;
   public int anInt_7630;
   public int anInt_7631;
   static final int anInt_7632 = 2;
   public int anInt_7633;
   public int anInt_7634 = 0;
   boolean aBoolean_7635 = false;
   public int anInt_7636;
   public long aLong_7637;
   public int anInt_7638;


   void method4961(byte var1) {
      this.anInt_7630 = Class362.sinArray[this.anInt_7627 * -15393743 << 3] * 533897371;
      long var2 = (long)(-1831859401 * this.anInt_7638);
      long var4 = (long)(1689304253 * this.anInt_7629);
      long var6 = (long)(218013533 * this.anInt_7628);
      this.anInt_7636 = (int)Math.sqrt((double)(var4 * var4 + var2 * var2 + var6 * var6)) * -1026698907;
      if(-1621816029 * this.anInt_7614 == 0) {
         this.anInt_7614 = -912291189;
      }

      if(1397470781 * this.anInt_7631 == 0) {
         this.aLong_7637 = -3672503845150168207L;
      } else if(1 == 1397470781 * this.anInt_7631) {
         this.aLong_7637 = (long)(967295848 * this.anInt_7636 / (-1621816029 * this.anInt_7614)) * -130985844190309233L;
         this.aLong_7637 *= this.aLong_7637 * -4939581491706328465L;
      } else if(2 == this.anInt_7631 * 1397470781) {
         this.aLong_7637 = -130985844190309233L * (long)(this.anInt_7636 * 967295848 / (this.anInt_7614 * -1621816029));
      }

      if(this.aBoolean_7635) {
         this.anInt_7636 *= -1;
      }

   }

   void method4962(ByteArrayDataNode var1, int var2, int var3) {
      if(var2 == 1) {
         this.anInt_7627 = var1.readShort(-910180392) * 1007729873;
      } else if(2 == var2) {
         var1.readByte(-400255590);
      } else if(3 == var2) {
         this.anInt_7638 = var1.method4480(1260717178) * 1649252999;
         this.anInt_7629 = var1.method4480(1260717178) * 1431576213;
         this.anInt_7628 = var1.method4480(1260717178) * 827043061;
      } else if(var2 == 4) {
         this.anInt_7631 = var1.readByte(-887542171) * -1653599979;
         this.anInt_7614 = var1.method4480(1260717178) * -912291189;
      } else if(6 == var2) {
         this.anInt_7626 = var1.readByte(-904442364) * -1999985177;
      } else if(8 == var2) {
         this.anInt_7613 = 947445079;
      } else if(9 == var2) {
         this.anInt_7634 = -32582165;
      } else if(var2 == 10) {
         this.aBoolean_7635 = true;
      }

   }

   void method4963(ByteArrayDataNode var1, byte var2) {
      while(true) {
         int var3 = var1.readByte(-789842244);
         if(var3 == 0) {
            return;
         }

         this.method4962(var1, var3, 661825065);
      }
   }

   static final void method4964(RSInterfaceData var0, int var1) {
      Class21.method130((String)var0.stringData[(var0.stringDataIndex -= -1828074049) * 863838783], 2046732550);
   }

   public static void method4965(int var0, int var1) {
      Class540_Sub18.method4006(var0, -1809970437);
   }

   static final void method4966(RSInterface var0, RSInterfaceData var1, int var2) {
      if(728656815 * var1.anInt_9493 >= 10) {
         throw new RuntimeException();
      } else if(null != var0.anObjectArray_2502) {
         Class240_Sub17 var3 = new Class240_Sub17();
         var3.aClass132_6903 = var0;
         var3.anObjectArray_6907 = var0.anObjectArray_2502;
         var3.anInt_6911 = var1.anInt_9493 * -1355962697 + 1258983289;
         client.aNodeList_518.addNode(var3, (short)3180);
      }
   }
}
