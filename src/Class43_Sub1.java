import java.util.Iterator;

public class Class43_Sub1 extends Class43 {

   int anInt_4386 = 0;


   public Class43_Sub1(Class30 var1) {
      super(Class38.aClass38_857, var1);
   }

   public void method3316(ByteArrayDataNode var1, int var2, int var3) {
      int var4 = var1.index * 964952859;
      int var5 = var1.readByte(2133848183);
      this.method387(GraphicsDataHolder.method5951(var5 & 1, (byte)18), -511130188);
      if(0 != (var5 & 8)) {
         Class31 var6 = Class111.method1420(var1.readByte(-223493612), (byte)0);
         if(this.aClass31_913 != var6) {
            try {
               this.method351(var6, true, 775120310);
            } catch (Exception_Sub1 var16) {
               var16.printStackTrace();
            }
         }
      }

      if((var5 & 16) != 0) {
         Class116 var18 = Class563_Sub1_Sub5_Sub1.method5099(var1.readByte(1219145700), 891208972);
         if(this.aClass116_915 != var18) {
            try {
               this.method352(var18, true, (byte)-35);
            } catch (Exception_Sub1 var15) {
               var15.printStackTrace();
            }
         }
      }

      if((var5 >> 7 & 1) == 1) {
         int var17 = var1.readShort(-1033583054);
         if(1 == (var17 >> Class41.aClass41_903.anInt_893 * 1710883891 & 1)) {
            this.aClass347_921.method4335(var1);
         }

         if((var17 >> 1710883891 * Class41.aClass41_892.anInt_893 & 1) == 1) {
            this.aClass347_928.method4335(var1);
         }

         if(1 == (var17 >> Class41.aClass41_891.anInt_893 * 1710883891 & 1)) {
            this.aClass347_922.method4335(var1);
         }

         if(1 == (var17 >> Class41.aClass41_894.anInt_893 * 1710883891 & 1)) {
            this.aClass347_925.method4335(var1);
         }

         if(1 == (var17 >> Class41.aClass41_895.anInt_893 * 1710883891 & 1)) {
            this.aFloat_930 = var1.method4494(-822261228);
            this.aFloat_931 = var1.method4494(-822261228);
         }

         if((var17 >> 1710883891 * Class41.aClass41_896.anInt_893 & 1) == 1) {
            this.aFloat_912 = var1.method4494(-822261228);
            this.aFloat_933 = var1.method4494(-822261228);
         }

         if(1 == (var17 >> 1710883891 * Class41.aClass41_898.anInt_893 & 1)) {
            this.aClass29_918 = Class15.method82(var1.readByte(462415214), 1997335203);
         }

         if((var17 >> Class41.aClass41_897.anInt_893 * 1710883891 & 1) == 1) {
            this.anInt_919 = var1.method4479(738776218) * 1483601195;
            var1.readByte(351955396);
         }

         int var7;
         if((var17 >> 1710883891 * Class41.aClass41_899.anInt_893 & 1) == 1) {
            var7 = var1.readByte(-868284081);
            this.aBoolean_932 = (var7 & 1) == 1;
            this.aBoolean_935 = (var7 & 2) == 2;
         }

         if(1 == (var17 >> 1710883891 * Class41.aClass41_900.anInt_893 & 1)) {
            var7 = var1.readByte(149612555);

            for(int var8 = 0; var8 < var7; ++var8) {
               int var9 = var1.readByte(1347888914);
               int var10 = var1.readByte(-1024895301);
               if(var9 == 0) {
                  this.method364(var10, -797243513);
               } else {
                  Class39 var11 = Class537.method6075(var1.readByte(903705416), -1312957685);
                  boolean var12 = true;
                  Iterator var13 = this.aNodeArrayList_938.iterator();

                  while(var13.hasNext()) {
                     Class240_Sub22_Sub12 var14 = (Class240_Sub22_Sub12)var13.next();
                     if(var10 == -1890428917 * var14.anInt_3604) {
                        var14.method2637(var1, -156467359);
                        var12 = false;
                        break;
                     }
                  }

                  if(var12) {
                     this.method363(Class26.method161(var10, var11, var1, (byte)9), 1447525078);
                  }
               }
            }
         }

         if((var17 >> 1710883891 * Class41.aClass41_901.anInt_893 & 1) == 1) {
            this.anInt_936 = var1.readShort(160175036) * -505262827;
            this.aFloat_937 = var1.method4494(-822261228);
         }

         if(1 == (var17 >> 1710883891 * Class41.aClass41_902.anInt_893 & 1)) {
            this.aClass52_934 = Class540_Sub15.method1776(var1.readByte(-1057630595), (byte)36);
         }

         if(1 == (var17 >> Class41.aClass41_906.anInt_893 * 1710883891 & 1)) {
            this.aClass347_926.method4335(var1);
            this.aClass347_916.method4335(var1);
            this.aFloat_924 = var1.method4494(-822261228);
            this.aFloat_929 = var1.method4494(-822261228);
         }

         if((var17 >> Class41.aClass41_904.anInt_893 * 1710883891 & 1) == 1) {
            var1.method4494(-822261228);
         }

         if(1 == (var17 >> 1710883891 * Class41.aClass41_905.anInt_893 & 1)) {
            this.aFloat_920 = var1.method4494(-822261228);
         }
      }

      if(this.aClass508_914 != null && (var5 >> 5 & 1) == 1) {
         this.aClass508_914.method5906(var1, -536971246);
      }

      if(null != this.aClass66_917 && (var5 >> 6 & 1) == 1) {
         this.aClass66_917.method671(var1, (byte)-8);
      }

      if(var1.index * 964952859 - var4 != var2) {
         throw new RuntimeException(964952859 * var1.index - var4 + "," + var2);
      }
   }

   public int method3317(int var1) {
      this.anInt_4386 += 1926086415;
      if(-54833169 * this.anInt_4386 == 126) {
         this.anInt_4386 = 0;
      }

      return this.anInt_4386 * -54833169;
   }

   static final void method3318(RSInterfaceData var0, byte var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      PlayerComposite.method6458(var3, var4, var0, -2083081667);
   }

   public static void method3319(byte var0) {
      Class597.aNodeArrayList_9859 = new NodeArrayList(8);
      Class597.anInt_9868 = 0;
      Iterator var1 = Class597.aList_9869.iterator();

      while(var1.hasNext()) {
         Class594 var2 = (Class594)var1.next();
         var2.method6430();
      }

   }
}
