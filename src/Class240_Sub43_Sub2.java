import java.awt.Point;

public class Class240_Sub43_Sub2 extends AbstractMouseNode {

   static final int anInt_3567 = 169;
   static final int anInt_3568 = 161;
   static final int anInt_3569 = 162;
   static final int anInt_3570 = 163;
   static final int anInt_3571 = 164;
   static final int anInt_3572 = 165;
   static final int anInt_3573 = 166;
   static final int anInt_3574 = 173;
   static final int anInt_3575 = 168;
   int anInt_3576;
   static final int anInt_3577 = 518;
   static final int anInt_3578 = 171;
   static final int anInt_3579 = 172;
   static final int anInt_3580 = 517;
   static final int anInt_3581 = 174;
   static final int anInt_3582 = 514;
   static final int anInt_3583 = 513;
   static Class240_Sub43_Sub2[] aClass240_Sub43_Sub2Array_3584 = new Class240_Sub43_Sub2[0];
   static final int anInt_3585 = 515;
   int mouseX;
   static final int anInt_3587 = 160;
   static final int anInt_3588 = 170;
   static final int anInt_3589 = 519;
   static final int anInt_3590 = 520;
   static final int anInt_3591 = 521;
   static final int anInt_3592 = 522;
   static final int anInt_3593 = 525;
   static final int anInt_3594 = 672;
   static final int anInt_3595 = 674;
   static final int anInt_3596 = 167;
   static final int anInt_3597 = 512;
   int anInt_3598;
   long aLong_3599;
   static final int anInt_3600 = 516;
   int mouseY;


   public int getMouseX(byte var1) {
      return this.mouseX * -1063543241;
   }

   public int method2624(int var1) {
      return this.anInt_3598 * -1701707677;
   }

   public boolean method2625(int var1) {
      switch(this.anInt_3576 * 1187742969) {
      case 160:
      case 161:
      case 162:
      case 163:
      case 164:
      case 165:
      case 166:
      case 167:
      case 168:
      case 169:
      case 170:
      case 171:
      case 172:
      case 173:
      case 174:
      case 672:
      case 674:
         return true;
      default:
         return false;
      }
   }

   public int getMouseInfo() {
      switch(this.anInt_3576 * 1187742969) {
      case 160:
      case 512:
         return 0;
      case 163:
      case 166:
      case 169:
      case 173:
      case 515:
      case 518:
      case 521:
      case 525:
         return 2;
      default:
         return 1;
      }
   }

   public int getClickType(int var1) {
      switch(this.anInt_3576 * 1187742969) {
      case 160:
      case 512:
         return -1;
      case 161:
      case 163:
      case 513:
      case 515:
         return 0;
      case 162:
      case 514:
         return 3;
      case 164:
      case 166:
      case 516:
      case 518:
         return 2;
      case 165:
      case 517:
         return 5;
      case 167:
      case 169:
      case 519:
      case 521:
         return 1;
      case 168:
      case 520:
         return 4;
      case 170:
      case 522:
         return 6;
      default:
         return -2;
      }
   }

   public long method4940(byte var1) {
      return this.aLong_3599 * -386434721277726695L;
   }

   public int method2629(int var1) {
      return 1187742969 * this.anInt_3576;
   }

   public int getMouseY(int var1) {
      return 2081470241 * this.mouseY;
   }

   public void method2631(Point var1, int var2) {
      this.mouseX -= var1.x * -776177785;
      this.mouseY -= 1091144929 * var1.y;
   }

   public void addThisNode(short var1) {
      Class240_Sub43_Sub2[] var2 = aClass240_Sub43_Sub2Array_3584;
      synchronized(aClass240_Sub43_Sub2Array_3584) {
         if(Class516.anInt_9217 * 1888887529 < 1735760513 * Class240_Sub25.anInt_7333 - 1) {
            aClass240_Sub43_Sub2Array_3584[(Class516.anInt_9217 += 494064985) * 1888887529 - 1] = this;
         }

      }
   }
}
