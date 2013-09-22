
public class Class265 {

   int anInt_4603;
   static final int anInt_4604 = 1;
   static final int anInt_4605 = 2;
   static final int anInt_4606 = 3;
   static final int anInt_4607 = 4;
   static final int anInt_4608 = 6;
   static final int anInt_4609 = 7;
   static final int anInt_4610 = 3;
   static final int anInt_4611 = 10;
   static final int anInt_4612 = 5;
   public static final int anInt_4613 = 0;
   static final int anInt_4614 = 5;
   static final int anInt_4615 = 8;
   static final int anInt_4616 = 4;
   static final int anInt_4617 = 2;
   static final int anInt_4618 = 11;
   static final int anInt_4619 = 12;
   static final int anInt_4620 = 13;
   static final int anInt_4621 = 14;
   static final int anInt_4622 = 15;
   static final int anInt_4623 = 16;
   public static final int anInt_4624 = 31;
   static final int anInt_4625 = 9;
   boolean aBoolean_4626;
   boolean aBoolean_4627;
   public int anInt_4628;
   short[] aShortArray_4629;
   public int anInt_4630;
   int anInt_4631;
   int anInt_4632;
   int anInt_4633;
   int anInt_4634;
   public Class240_Sub53 aClass240_Sub53_4635;


   public Class265(Renderer var1, int var2, ByteArrayDataNode var3, int var4) {
      if(null == Class89.anIntArray_1805) {
         Class20.method123(1548183295);
      }

      this.anInt_4628 = var3.readByte(1510154198) * 608527503;
      this.aBoolean_4626 = 0 != (-1420871057 * this.anInt_4628 & 8);
      this.aBoolean_4627 = (-1420871057 * this.anInt_4628 & 16) != 0;
      this.anInt_4628 = (-1420871057 * this.anInt_4628 & 7) * 608527503;
      int var5 = var3.readShort(196638647) << var4;
      int var6 = var3.readShort(-455485132) << var4;
      int var7 = var3.readShort(-569520254) << var4;
      int var8 = var3.readByte(-315427009);
      int var9 = 1 + 2 * var8;
      this.aShortArray_4629 = new short[var9];

      int var10;
      for(var10 = 0; var10 < this.aShortArray_4629.length; ++var10) {
         short var11 = (short)var3.readShort(862825351);
         int var12 = var11 >>> 8;
         int var13 = var11 & 255;
         if(var12 >= var9) {
            var12 = var9 - 1;
         }

         if(var13 > var9 - var12) {
            var13 = var9 - var12;
         }

         this.aShortArray_4629[var10] = (short)(var12 << 8 | var13);
      }

      var8 = (var8 << var2) + (1 << var2 >> 1);
      var10 = Class541.anIntArray_9470 != null?Class541.anIntArray_9470[var3.readShort(972389923)]:Class561.colourMap[CacheFileID.method1398(var3.readShort(-1192075566), -1186652046) & '\uffff'];
      int var14 = var3.readByte(1485943253);
      this.anInt_4630 = 1201624645 * (var14 & 31);
      this.anInt_4633 = ((var14 & 224) << 3) * -203057297;
      if(-676508531 * this.anInt_4630 != 31) {
         this.method3514(-1567543085);
      }

      this.method3516(var1, var5, var7, var6, var8, var10, 1705853526);
   }

   public void method3513(int var1, int var2, int var3, int var4, int var5) {
      this.anInt_4631 = var1 * 725633751;
      this.anInt_4603 = -1596814127 * var4;
      this.anInt_4634 = var3 * 1763303391;
      this.anInt_4632 = var2 * -313344667;
   }

   void method3514(int var1) {
      switch(-676508531 * this.anInt_4630) {
      case 2:
         this.anInt_4631 = 725633751;
         this.anInt_4603 = 0;
         this.anInt_4634 = -822151168;
         this.anInt_4632 = -1779750912;
         break;
      case 3:
         this.anInt_4631 = 725633751;
         this.anInt_4603 = 0;
         this.anInt_4634 = -822151168;
         this.anInt_4632 = 735465472;
         break;
      case 4:
         this.anInt_4631 = -1392432292;
         this.anInt_4603 = 0;
         this.anInt_4634 = -822151168;
         this.anInt_4632 = -1779750912;
         break;
      case 5:
         this.anInt_4631 = -1392432292;
         this.anInt_4603 = 0;
         this.anInt_4634 = -822151168;
         this.anInt_4632 = 1470930944;
         break;
      case 6:
         this.anInt_4631 = -2118066043;
         this.anInt_4603 = 482350336;
         this.anInt_4634 = 1302306048;
         this.anInt_4632 = -1779750912;
         break;
      case 7:
         this.anInt_4631 = -2118066043;
         this.anInt_4603 = 482350336;
         this.anInt_4634 = 1302306048;
         this.anInt_4632 = 735465472;
         break;
      case 8:
         this.anInt_4631 = -2118066043;
         this.anInt_4603 = 1244873728;
         this.anInt_4634 = 1736408064;
         this.anInt_4632 = -1779750912;
         break;
      case 9:
         this.anInt_4631 = -2118066043;
         this.anInt_4603 = 1244873728;
         this.anInt_4634 = 1736408064;
         this.anInt_4632 = 735465472;
         break;
      case 10:
         this.anInt_4631 = -2118066043;
         this.anInt_4603 = -280173056;
         this.anInt_4634 = 868204032;
         this.anInt_4632 = -1779750912;
         break;
      case 11:
         this.anInt_4631 = -2118066043;
         this.anInt_4603 = -280173056;
         this.anInt_4634 = 868204032;
         this.anInt_4632 = 735465472;
         break;
      case 12:
         this.anInt_4631 = 1451267502;
         this.anInt_4603 = 0;
         this.anInt_4634 = -822151168;
         this.anInt_4632 = -1779750912;
         break;
      case 13:
         this.anInt_4631 = 1451267502;
         this.anInt_4603 = 0;
         this.anInt_4634 = -822151168;
         this.anInt_4632 = 1470930944;
         break;
      case 14:
         this.anInt_4631 = 725633751;
         this.anInt_4603 = 482350336;
         this.anInt_4634 = 1302306048;
         this.anInt_4632 = -1779750912;
         break;
      case 15:
         this.anInt_4631 = 725633751;
         this.anInt_4603 = -280173056;
         this.anInt_4634 = 868204032;
         this.anInt_4632 = 735465472;
         break;
      case 16:
         this.anInt_4631 = 725633751;
         this.anInt_4603 = -1042696448;
         this.anInt_4634 = 434102016;
         this.anInt_4632 = 1470930944;
         break;
      default:
         this.anInt_4603 = 0;
         this.anInt_4631 = 0;
         this.anInt_4634 = -822151168;
         this.anInt_4632 = -1779750912;
      }

   }

   void method3515(int var1, boolean var2, int var3) {
      int var5;
      if(!var2) {
         int var4 = 1457007725 * this.anInt_4632 * var1 / 50 + 1861855119 * this.anInt_4633 & 2047;
         switch(764430567 * this.anInt_4631) {
         case 1:
            var5 = 1024 + (Class362.cosArray[var4 << 3] >> 4);
            break;
         case 2:
            var5 = var4;
            break;
         case 3:
            var5 = Class89.anIntArray_1805[var4] >> 1;
            break;
         case 4:
            var5 = var4 >> 10 << 11;
            break;
         case 5:
            var5 = (var4 < 1024?var4:2048 - var4) << 1;
            break;
         default:
            var5 = 2048;
         }
      } else {
         var5 = 2048;
      }

      this.aClass240_Sub53_4635.method5280((float)(this.anInt_4603 * -858436559 + (this.anInt_4634 * 617520159 * var5 >> 11)) / 2048.0F, 672292026);
   }

   void method3516(Renderer var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.aClass240_Sub53_4635 = var1.method1950(var2, var3, var4, var5, var6, 1.0F);
   }

   static final void method3517(RSInterfaceData var0, int var1) {
      RSInterface var2 = var0.animeTarget.headInterfaces.getChildInterface(var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111], 217884348);
      var2.aClass132Array_2579 = null;
      var2.children = null;
      Class110_Sub1.method3149(var2, 745337114);
   }

   static void method3518(int var0, int var1) {
      HintMarker.anInt_3708 = -1940800941 * var0;
      HintMarker.modelNodeArrayList.method6669(-459564097);
   }

   static final void method3519(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      Class563_Sub1_Sub1_Sub2.method5213(var3, var4, var0, -420349742);
   }

   public static void method3520(String var0, boolean var1, int var2) {
      var0 = var0.toLowerCase();
      short[] var3 = new short[16];
      int var4 = 0;

      for(int var5 = 0; var5 < Class592.cacheObjectLoader.anInt_8588 * -161459533; ++var5) {
         ObjectDescriptor var6 = Class592.cacheObjectLoader.getObjectDescriptor(var5);
         if((!var1 || var6.aBoolean_8506) && -1 == 953318699 * var6.anInt_8497 && var6.anInt_8499 * -427788353 == -1 && -1 == -722184523 * var6.anInt_8463 && 0 == 1149777253 * var6.anInt_8476 && var6.name.toLowerCase().indexOf(var0) != -1) {
            if(var4 >= 250) {
               Class357.anInt_6780 = -2007187467;
               Animation.aShortArray_10128 = null;
               return;
            }

            if(var4 >= var3.length) {
               short[] var7 = new short[var3.length * 2];

               for(int var8 = 0; var8 < var4; ++var8) {
                  var7[var8] = var3[var8];
               }

               var3 = var7;
            }

            var3[var4++] = (short)var5;
         }
      }

      Animation.aShortArray_10128 = var3;
      Class462.anInt_8604 = 0;
      Class357.anInt_6780 = var4 * 2007187467;
      String[] var9 = new String[-2050929757 * Class357.anInt_6780];

      for(int var10 = 0; var10 < Class357.anInt_6780 * -2050929757; ++var10) {
         var9[var10] = Class592.cacheObjectLoader.getObjectDescriptor(var3[var10]).name;
      }

      Class363.method4615(var9, Animation.aShortArray_10128, -1624348810);
   }
}
