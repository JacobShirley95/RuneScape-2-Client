import java.util.Iterator;

public class Class494 implements Iterable {

   Class240_Sub22 aClass240_Sub22_9035;
   public Class240_Sub22 aClass240_Sub22_9036 = new Class240_Sub22();
   public static Class240_Sub15 aClass240_Sub15_9037;
   public static int anInt_9038;


   public void method5770(int var1) {
      while(this.aClass240_Sub22_9036.aClass240_Sub22_7277 != this.aClass240_Sub22_9036) {
         this.aClass240_Sub22_9036.aClass240_Sub22_7277.shiftNext();
      }

   }

   public Class240_Sub22 method5771(int var1) {
      Class240_Sub22 var2 = this.aClass240_Sub22_9035;
      if(var2 == this.aClass240_Sub22_9036) {
         this.aClass240_Sub22_9035 = null;
         return null;
      } else {
         this.aClass240_Sub22_9035 = var2.aClass240_Sub22_7277;
         return var2;
      }
   }

   public Class240_Sub22 method5772(int var1) {
      return this.method5777((Class240_Sub22)null, (byte)-107);
   }

   public int getSize(int var1) {
      int var2 = 0;

      for(Class240_Sub22 var3 = this.aClass240_Sub22_9036.aClass240_Sub22_7277; var3 != this.aClass240_Sub22_9036; var3 = var3.aClass240_Sub22_7277) {
         ++var2;
      }

      return var2;
   }

   public Iterator iterator() {
      return new IteratorNodeList(this);
   }

   public void insert(Class240_Sub22 var1, int var2) {
      if(var1.aClass240_Sub22_7279 != null) {
         var1.shiftNext();
      }

      var1.aClass240_Sub22_7279 = this.aClass240_Sub22_9036.aClass240_Sub22_7279;
      var1.aClass240_Sub22_7277 = this.aClass240_Sub22_9036;
      var1.aClass240_Sub22_7279.aClass240_Sub22_7277 = var1;
      var1.aClass240_Sub22_7277.aClass240_Sub22_7279 = var1;
   }

   public Class494() {
      this.aClass240_Sub22_9036.aClass240_Sub22_7277 = this.aClass240_Sub22_9036;
      this.aClass240_Sub22_9036.aClass240_Sub22_7279 = this.aClass240_Sub22_9036;
   }

   public Class240_Sub22 method5776(int var1) {
      Class240_Sub22 var2 = this.aClass240_Sub22_9036.aClass240_Sub22_7277;
      if(var2 == this.aClass240_Sub22_9036) {
         return null;
      } else {
         var2.shiftNext();
         return var2;
      }
   }

   Class240_Sub22 method5777(Class240_Sub22 var1, byte var2) {
      Class240_Sub22 var3;
      if(var1 == null) {
         var3 = this.aClass240_Sub22_9036.aClass240_Sub22_7277;
      } else {
         var3 = var1;
      }

      if(this.aClass240_Sub22_9036 == var3) {
         this.aClass240_Sub22_9035 = null;
         return null;
      } else {
         this.aClass240_Sub22_9035 = var3.aClass240_Sub22_7277;
         return var3;
      }
   }

   static void method5778(RSCharacter var0, int var1, int var2) {
      if(null != var0.animationQueue) {
         Class539 var3 = (Class539)Class559.method6185(Class12.method70((byte)16), var1, (byte)74);
         int var4 = var0.animationQueue[var3.method6078(-875633742)];
         if(var4 != var0.animation.getAnimationID(289204691)) {
            var0.animation.animate(var4, var0.animation.method5878(-1729959646), -1980339150);
            var0.anInt_4345 = var0.anInt_4331 * -422512077;
         }
      }

   }

   static final void method5779(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      AbstractKeyboardHandler.method3211(var3, var4, var0, 709146);
   }

   public static void method5780(boolean var0, int var1) {
      if(var0 && null != Class248_Sub1.currentWorldArea) {
         AbstractMouseHandler.anInt_4052 = 96297625 * Class248_Sub1.currentWorldArea.anInt_3514;
      } else {
         AbstractMouseHandler.anInt_4052 = 2118443683;
      }

      Class248_Sub1.currentWorldArea = null;
      IgnoredPlayer.aNodeList_114 = null;
      Class248_Sub1.worldMapLoadPercent = 0;
      Class203.aClass132_3532 = null;
      Class248_Sub1.method3172();
      Class248_Sub1.aNodeList_4122.clear(1272205429);
      Class248_Sub1.staticElements = null;
      Class621.aClass170_10032 = null;
      Class248_Sub1.anInt_6446 = -1082544505;
      Class248_Sub1.anInt_6447 = 826358349;
      Class204.aClass198_3538 = null;
      Class346.aClass198_6569 = null;
      Class240_Sub22_Sub17.aClass198_8437 = null;
      Class254.aClass198_4402 = null;
      Class445.aClass198_8521 = null;
      Class240_Sub19.aClass198_7179 = null;
      Class509.aClass198_9183 = null;
      Class240_Sub28.aClass198_7385 = null;
      if(Class248_Sub1.mapIconUnpacker != null) {
         Class248_Sub1.mapIconUnpacker.method6601(613044169);
         Class248_Sub1.mapIconUnpacker.init(128, 64);
      }

      if(Class248_Sub1.aClass445_4107 != null) {
         Class248_Sub1.aClass445_4107.method5490(64, 64, -1844551733);
      }

      if(null != Class248_Sub1.aClass529_4105) {
         Class248_Sub1.aClass529_4105.method6018(256, 1494744909);
      }

      Class603.aClass212_Sub2_9897.method7530(64, (short)-10017);
   }

   static final void method5781(RSInterfaceData var0, byte var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class104_Sub21.renderSettings.aClass540_Sub7_7291.method6082(var2, -1536445809);
   }
}
