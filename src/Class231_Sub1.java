
public class Class231_Sub1 extends Class231 {

   public int anInt_4048;
   public int anInt_4049;
   public int anInt_4050;
   public int anInt_4051;


   Class231_Sub1(int var1, int var2, int var3, int var4) {
      this.anInt_4050 = 1142219069 * var1;
      this.anInt_4048 = var2 * 1027641055;
      this.anInt_4049 = var3 * -1002793425;
      this.anInt_4051 = -334607687 * var4;
   }

   void method3096(int var1, int var2, int var3, int var4, int var5) {
      this.anInt_4050 = var1 * 1142219069;
      this.anInt_4048 = var2 * 1027641055;
      this.anInt_4049 = var3 * -1002793425;
      this.anInt_4051 = -334607687 * var4;
   }

   static CharTask method3097(ByteArrayDataNode var0, int var1) {
      int var2 = var0.readByte(-756050193);
      Class439 var3 = Class266.method3523(var2, -1961562673);
      Object var4 = null;
      switch(var3.anInt_8431 * 553251975) {
      case 0:
         var4 = new Class104_Sub15(var0);
         break;
      case 1:
         var4 = new Class104_Sub11(var0);
      case 2:
      case 15:
      case 19:
      default:
         break;
      case 3:
         var4 = new Class104_Sub9(var0);
         break;
      case 4:
         var4 = new Class104_Sub10(var0);
         break;
      case 5:
         var4 = new Class104_Sub20(var0);
         break;
      case 6:
         var4 = new Class104_Sub8(var0);
         break;
      case 7:
         var4 = new Class104_Sub6(var0);
         break;
      case 8:
         var4 = new Class104_Sub3(var0);
         break;
      case 9:
         var4 = new Class104_Sub17(var0);
         break;
      case 10:
         var4 = new Class104_Sub1(var0, 0, 1);
         break;
      case 11:
         var4 = new Class104_Sub16(var0);
         break;
      case 12:
         var4 = new Class104_Sub4(var0);
         break;
      case 13:
         var4 = new Class104_Sub2(var0);
         break;
      case 14:
         var4 = new Class104_Sub7(var0);
         break;
      case 16:
         var4 = new Class104_Sub13(var0, false);
         break;
      case 17:
         var4 = new Class104_Sub14(var0);
         break;
      case 18:
         var4 = new Class104_Sub13(var0, true);
         break;
      case 20:
         var4 = new Class104_Sub22(var0);
         break;
      case 21:
         var4 = new Class104_Sub12(var0);
         break;
      case 22:
         var4 = new Class104_Sub1(var0, 1, 1);
         break;
      case 23:
         var4 = new Class104_Sub1(var0, 1, 0);
         break;
      case 24:
         var4 = new Class104_Sub21(var0);
         break;
      case 25:
         var4 = new Class104_Sub18_Sub1(var0);
         break;
      case 26:
         var4 = new Class104_Sub5(var0);
         break;
      case 27:
         var4 = new Class104_Sub1(var0, 0, 0);
         break;
      case 28:
         var4 = new Class104_Sub23(var0);
         break;
      case 29:
         var4 = new Class104_Sub18_Sub2(var0);
         break;
      case 30:
         var4 = new Class104_Sub19(var0);
      }

      return (CharTask)var4;
   }

   static final void method3098(RSCharacter var0, byte var1) {
      Animator var2 = var0.animation;
      if(client.timer * -1025618511 == var0.anInt_4317 * 2141686191 || !var2.isAnimating(1360838560) || var2.method5892(1, -492549814)) {
         int var3 = 2141686191 * var0.anInt_4317 - -1865071747 * var0.anInt_4321;
         int var4 = -1025618511 * client.timer - var0.anInt_4321 * -1865071747;
         int var5 = -839136768 * var0.anInt_4318 + var0.method3257() * 256;
         int var6 = -1070398976 * var0.anInt_4320 + var0.method3257() * 256;
         int var7 = var0.anInt_4330 * -713070080 + var0.method3257() * 256;
         int var8 = var0.anInt_4322 * -2017729024 + var0.method3257() * 256;
         GameCoord var9 = var0.method6203().gameCoord;
         var0.setPosition((float)((var4 * var7 + var5 * (var3 - var4)) / var3), (float)((int)var9.floatY), (float)(((var3 - var4) * var6 + var8 * var4) / var3));
      }

      var0.anInt_4304 = 0;
      var0.turnTo(-159166155 * var0.anInt_4324, false, 2026900109);
   }
}
