import jaclib.memory.DirectBufferHelper;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;
import jaclib.memory.heap.NativeHeapBuffer;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import sun.misc.Unsafe;

public abstract class Renderer_Sub3 extends Renderer {

   protected float aFloat_10494;
   Class379 aClass379_10495;
   static final int anInt_10496 = 128;
   static final int anInt_10497 = 1;
   static final int anInt_10498 = 2;
   ArrayViewport anArrayViewport_10499;
   Class379 aClass379_10500;
   static final int anInt_10501 = 55;
   static final int anInt_10502 = 7;
   Class76 aClass76_10503;
   protected Class240_Sub53[] aClass240_Sub53Array_10504;
   protected boolean aBoolean_10505;
   int[] anIntArray_10506;
   int anInt_10507;
   protected Class404[] aClass404Array_10508;
   final int anInt_10509 = 4194304;
   public Unsafe anUnsafe_10510;
   protected int anInt_10511;
   protected int anInt_10512;
   protected float[] aFloatArray_10513;
   public int anInt_10514;
   boolean aBoolean_10515;
   protected int anInt_10516;
   Viewport aViewport_10517 = new Viewport();
   ArrayViewport anArrayViewport_10518 = new ArrayViewport();
   Viewport aViewport_10519 = new Viewport();
   Viewport aViewport_10520 = new Viewport();
   public ArrayViewport anArrayViewport_10521 = new ArrayViewport();
   ArrayViewport anArrayViewport_10522 = new ArrayViewport();
   Class65_Sub1_Sub2 aClass65_Sub1_Sub2_10523;
   ArrayViewport anArrayViewport_10524 = new ArrayViewport();
   static final ArrayViewport anArrayViewport_10525 = new ArrayViewport();
   Viewport aViewport_10526 = new Viewport();
   protected ArrayViewport anArrayViewport_10527 = new ArrayViewport();
   protected int anInt_10528;
   GameCoord aClass347_10529 = new GameCoord();
   float[] aFloatArray_10530 = new float[4];
   protected int anInt_10531;
   Class387 aClass387_10532;
   boolean aBoolean_10533;
   protected boolean isMultisample;
   ArrayViewport anArrayViewport_10535;
   static final int anInt_10536 = 8;
   ArrayViewport anArrayViewport_10537;
   ArrayViewport anArrayViewport_10538;
   ArrayViewport anArrayViewport_10539;
   static final int anInt_10540 = 4;
   ArrayViewport anArrayViewport_10541;
   public ArrayViewport anArrayViewport_10542;
   float[][] aFloatArrayArray_10543;
   float aFloat_10544;
   float aFloat_10545;
   float aFloat_10546;
   float aFloat_10547;
   protected float aFloat_10548;
   Sprite_Sub1 aClass170_Sub1_10549;
   float aFloat_10550;
   Class57 aClass57_10551;
   protected int anInt_10552;
   protected boolean aBoolean_10553;
   NativeHeap aNativeHeap_10554;
   protected boolean aBoolean_10555;
   NodeList aNodeList_10556 = new NodeList();
   protected int anInt_10557;
   Class454 aClass454_10558 = new Class454();
   Class65_Sub1_Sub1 aClass65_Sub1_Sub1_10559;
   int anInt_10560;
   public float aFloat_10561;
   protected int anInt_10562;
   public Class384 aClass384_10563;
   Class60 aClass60_10564;
   protected int anInt_10565;
   protected boolean aBoolean_10566;
   protected int anInt_10567;
   protected float aFloat_10568;
   int anInt_10569;
   int anInt_10570;
   protected boolean aBoolean_10571;
   protected boolean aBoolean_10572;
   protected boolean aBoolean_10573;
   public float[] aFloatArray_10574;
   protected Class392[] aClass392Array_10575;
   protected float aFloat_10576;
   protected int anInt_10577;
   ArrayViewport anArrayViewport_10578 = new ArrayViewport();
   public float aFloat_10579;
   public float aFloat_10580;
   public ArrayViewport anArrayViewport_10581;
   protected float aFloat_10582;
   protected int anInt_10583;
   protected float aFloat_10584;
   public boolean aBoolean_10585;
   protected int anInt_10586;
   protected int anInt_10587;
   int anInt_10588;
   int anInt_10589;
   boolean aBoolean_10590;
   int anInt_10591;
   static final Object anObject_10592 = new Object();
   Class403[] aClass403Array_10593;
   protected ArrayViewport[] anArrayViewportArray_10594;
   int anInt_10595;
   final CacheDataUnpacker aCacheUnpacker_10596;
   protected Class392[] aClass392Array_10597;
   protected int anInt_10598;
   final Class58 aClass58_10599;
   protected float aFloat_10600;
   Class384 aClass384_10601;
   boolean aBoolean_10602 = false;
   Sprite_Sub1 aClass170_Sub1_10603;
   boolean aBoolean_10604;
   Class59 aClass59_10605;
   Class76 aClass76_10606;
   final Class65[] aClass65Array_10607;
   protected boolean aBoolean_10608;
   protected static final int anInt_10609 = 100663296;
   Class47 aClass47_10610;
   Class28 aClass28_10611;
   Class65_Sub1_Sub2 aClass65_Sub1_Sub2_10612;
   float[] aFloatArray_10613;
   protected float aFloat_10614;
   Class63 aClass63_10615;
   static final int anInt_10616 = 1;
   static final int anInt_10617 = 2;
   final Class378[] aClass378Array_10618;
   Class177_Sub1 aClass177_Sub1_10619;
   boolean aBoolean_10620;
   Class65 aClass65_10621;
   int anInt_10622;
   Class105 aClass105_10623;
   protected boolean aBoolean_10624;
   protected boolean aBoolean_10625;
   protected int anInt_10626;
   protected int anInt_10627;
   protected int anInt_10628;
   public long aLong_10629;
   float[] aFloatArray_10630;
   int anInt_10631;
   protected Class393 aClass393_10632;
   protected boolean aBoolean_10633;
   protected boolean aBoolean_10634;
   public final int anInt_10635;
   public int anInt_10636;
   int anInt_10637;
   Class27 aClass27_10638;
   Class379 aClass379_10639;
   int anInt_10640;
   public int anInt_10641;
   protected int anInt_10642;
   Class379 aClass379_10643;
   float aFloat_10644;
   protected boolean aBoolean_10645;
   public ByteBuffer aByteBuffer_10646;
   SpriteRenderer spriteRenderer;
   boolean aBoolean_10648;
   Class76 aClass76_10649;
   Viewport aViewport_10650;
   public float aFloat_10651;
   Class379 aClass379_10652;
   int anInt_10653;
   Class379 aClass379_10654;
   protected boolean aBoolean_10655;
   public int anInt_10656;
   Class414 aClass414_10657;
   Class165_Sub1[] aClass165_Sub1Array_10658;
   Class165_Sub1[] aClass165_Sub1Array_10659;
   ArrayViewport anArrayViewport_10660;
   Viewport aViewport_10661 = new Viewport();
   protected boolean aBoolean_10662;
   protected int anInt_10663;


   public void method7127(Class72 var1) {
      this.aClass454_10558.method5536(var1, (byte)108);
   }

   void method7128() {
      ArrayList var1 = this.aClass454_10558.method5538(-205355966);
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         Class72 var3 = (Class72)var2.next();
         var3.method824();
      }

   }

   public abstract boolean method7129();

   public abstract Class133 method7130(String var1);

   Class113 method7131(byte[] var1) {
      if(var1 == null) {
         return null;
      } else {
         try {
            return new Class113(var1);
         } catch (Exception var3) {
            return null;
         }
      }
   }

   public abstract void method7132(ArrayViewport var1, ArrayViewport var2, ArrayViewport var3);

   Renderer_Sub3(Class163 var1, Class96 var2, CacheDataUnpacker var3, int var4, int var5) {
      super(var1, var2);
      this.aClass387_10532 = Class387.aClass387_7479;
      this.aBoolean_10590 = false;
      this.anArrayViewport_10537 = new ArrayViewport();
      this.anArrayViewport_10535 = new ArrayViewport();
      this.aBoolean_10648 = false;
      this.anArrayViewport_10499 = new ArrayViewport();
      this.anArrayViewport_10538 = new ArrayViewport();
      this.anArrayViewport_10539 = this.anArrayViewport_10538;
      this.anArrayViewport_10581 = new ArrayViewport();
      this.anArrayViewport_10541 = new ArrayViewport();
      this.anArrayViewport_10542 = new ArrayViewport();
      this.aFloatArrayArray_10543 = new float[6][4];
      this.aFloat_10548 = 0.0F;
      this.aFloat_10600 = 1.0F;
      this.aFloat_10550 = 0.0F;
      this.aFloat_10644 = 1.0F;
      this.aFloat_10576 = 50.0F;
      this.aFloat_10568 = 3584.0F;
      this.anInt_10552 = 0;
      this.anInt_10512 = 0;
      this.anInt_10528 = 0;
      this.anInt_10557 = 0;
      this.anInt_10569 = 0;
      this.anInt_10653 = 0;
      this.anInt_10560 = 0;
      this.anInt_10637 = 0;
      this.anInt_10562 = 0;
      this.anInt_10583 = 0;
      this.anInt_10577 = 0;
      this.anInt_10565 = 0;
      this.anInt_10531 = 0;
      this.anInt_10567 = 0;
      this.aBoolean_10566 = true;
      this.aBoolean_10555 = false;
      this.aBoolean_10553 = false;
      this.aBoolean_10571 = false;
      this.aBoolean_10572 = true;
      this.aBoolean_10573 = false;
      this.aFloatArray_10574 = new float[]{0.0F, 0.0F, 1.0F, 0.0F};
      this.aFloatArray_10513 = new float[]{0.0F, 0.0F, -1.0F, 0.0F};
      this.aFloatArray_10630 = new float[]{0.0F, 0.0F, 1.0F, 0.0F};
      this.aFloatArray_10613 = new float[]{0.0F, 0.0F, 1.0F, 0.0F};
      this.anInt_10595 = 16777215;
      this.aFloat_10579 = 1.0F;
      this.aFloat_10580 = 1.0F;
      this.aFloat_10651 = 1.0F;
      this.aFloat_10582 = 1.0F;
      this.aFloat_10561 = -1.0F;
      this.aFloat_10584 = -1.0F;
      this.anInt_10588 = 8;
      this.anInt_10589 = 3;
      this.anInt_10511 = 0;
      this.aBoolean_10604 = false;
      this.aClass65Array_10607 = new Class65[16];
      this.aClass378Array_10618 = new Class378[2];
      this.aBoolean_10515 = false;
      this.aBoolean_10625 = true;
      this.anInt_10626 = -1;
      this.anInt_10627 = -1;
      this.anInt_10628 = 0;
      this.anInt_10631 = 1;
      this.aClass393_10632 = Class393.aClass393_7556;
      this.aBoolean_10633 = true;
      this.aBoolean_10634 = true;
      this.aBoolean_10533 = false;
      this.aClass165_Sub1Array_10658 = new Class165_Sub1[7];
      this.aClass165_Sub1Array_10659 = new Class165_Sub1[7];
      this.anArrayViewport_10660 = new ArrayViewport();
      this.aViewport_10650 = new Viewport();
      this.anInt_10663 = -1;

      try {
         this.aCacheUnpacker_10596 = var3;
         this.anInt_10635 = var4;
         this.anInt_10640 = var5;
         Class86.method1127(false, true, (byte)-38);
         if(this.aClass96_2801 != null) {
            this.aClass58_10599 = new Class58(this, this.aClass96_2801);
         } else {
            this.aClass58_10599 = null;
         }

         if(this.anInt_10640 == 0) {
            this.anIntArray_10506 = Class541.anIntArray_9470;
         } else {
            this.anIntArray_10506 = Class561.anIntArray_9583;
         }

         try {
            Field var6 = Unsafe.class.getDeclaredField("theUnsafe");
            var6.setAccessible(true);
            this.anUnsafe_10510 = (Unsafe)var6.get((Object)null);
         } catch (Exception var7) {
            ;
         }

         this.aByteBuffer_10646 = ByteBuffer.allocateDirect(4194304);
         this.aByteBuffer_10646.order(ByteOrder.nativeOrder());
         this.aLong_10629 = DirectBufferHelper.getDirectBufferAddress(this.aByteBuffer_10646);
      } catch (Throwable var8) {
         var8.printStackTrace();
         this.method1939(-1500363801);
         if(var8 instanceof OutOfMemoryError) {
            throw (OutOfMemoryError)var8;
         }

         throw new RuntimeException("");
      }

      this.method1986(this.method1926(131072));
   }

   final ArrayViewport method7133() {
      return this.anArrayViewport_10542;
   }

   void method7134() {
      this.aClass63_10615.method627();

      for(int var1 = 0; var1 < this.aClass378Array_10618.length; ++var1) {
         if(this.aClass378Array_10618[var1] != null && this.aClass378Array_10618[var1].method4838()) {
            this.aClass378Array_10618[var1].method4836();
         }
      }

      this.aClass60_10564 = new Class60(this);
      this.method7135();
      this.method7136();
      this.method7275();
      this.aClass60_10564.method586(this);
      this.aClass59_10605 = new Class59(this, 1024);
   }

   final void method7135() {
      this.aClass76_10649 = this.method7320(false);
      short var1 = 160;
      this.aClass76_10649.method981(var1, 32);
      this.aByteBuffer_10646.clear();
      this.aByteBuffer_10646.putFloat(0.0F);
      this.aByteBuffer_10646.putFloat(0.0F);
      this.aByteBuffer_10646.putFloat(0.0F);
      this.aByteBuffer_10646.putInt(-1);
      this.aByteBuffer_10646.putFloat(0.0F);
      this.aByteBuffer_10646.putFloat(0.0F);
      this.aByteBuffer_10646.putFloat(0.0F);
      this.aByteBuffer_10646.putFloat(0.0F);
      this.aByteBuffer_10646.putFloat(0.0F);
      this.aByteBuffer_10646.putFloat(1.0F);
      this.aByteBuffer_10646.putFloat(0.0F);
      this.aByteBuffer_10646.putInt(-1);
      this.aByteBuffer_10646.putFloat(0.0F);
      this.aByteBuffer_10646.putFloat(1.0F);
      this.aByteBuffer_10646.putFloat(0.0F);
      this.aByteBuffer_10646.putFloat(1.0F);
      this.aByteBuffer_10646.putFloat(1.0F);
      this.aByteBuffer_10646.putFloat(1.0F);
      this.aByteBuffer_10646.putFloat(0.0F);
      this.aByteBuffer_10646.putInt(-1);
      this.aByteBuffer_10646.putFloat(1.0F);
      this.aByteBuffer_10646.putFloat(1.0F);
      this.aByteBuffer_10646.putFloat(1.0F);
      this.aByteBuffer_10646.putFloat(1.0F);
      this.aByteBuffer_10646.putFloat(1.0F);
      this.aByteBuffer_10646.putFloat(0.0F);
      this.aByteBuffer_10646.putFloat(0.0F);
      this.aByteBuffer_10646.putInt(-1);
      this.aByteBuffer_10646.putFloat(1.0F);
      this.aByteBuffer_10646.putFloat(0.0F);
      this.aByteBuffer_10646.putFloat(1.0F);
      this.aByteBuffer_10646.putFloat(0.0F);
      this.aByteBuffer_10646.putFloat(0.0F);
      this.aByteBuffer_10646.putFloat(0.0F);
      this.aByteBuffer_10646.putFloat(0.0F);
      this.aByteBuffer_10646.putInt(-1);
      this.aByteBuffer_10646.putFloat(0.0F);
      this.aByteBuffer_10646.putFloat(0.0F);
      this.aByteBuffer_10646.putFloat(0.0F);
      this.aByteBuffer_10646.putFloat(0.0F);
      this.aClass76_10649.method4853(0, this.aByteBuffer_10646.position(), this.aLong_10629);
      this.aClass379_10652 = this.method7250(new Class402[]{new Class402(new Class380[]{Class380.aClass380_7356, Class380.aClass380_7353, Class380.aClass380_7355, Class380.aClass380_7355})});
   }

   final void method7136() {
      this.aClass76_10503 = this.method7320(true);
      this.aClass76_10503.method981(24, 12);
      this.aClass379_10643 = this.method7250(new Class402[]{new Class402(Class380.aClass380_7356)});
   }

   boolean method7137(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.aByteBuffer_10646.clear();
      this.aByteBuffer_10646.putFloat(var1);
      this.aByteBuffer_10646.putFloat(var2);
      this.aByteBuffer_10646.putFloat(var3);
      this.aByteBuffer_10646.putFloat(var4);
      this.aByteBuffer_10646.putFloat(var5);
      this.aByteBuffer_10646.putFloat(var6);
      return this.aClass76_10503.method4853(0, this.aByteBuffer_10646.position(), this.aLong_10629);
   }

   void method1888() {
      if(!this.aBoolean_10533) {
         this.method7278();
         this.aClass58_10599.method564();

         for(NodeListNode var1 = this.aNodeList_10556.getBaseNode_2((byte)1); var1 != null; var1 = this.aNodeList_10556.getNext(163932169)) {
            ((Class240_Sub51_Sub1)var1).method823();
         }

         Class19.method103(false, true, (byte)1);

         int var2;
         for(var2 = 0; var2 < this.aClass65Array_10607.length; ++var2) {
            if(this.aClass65Array_10607[var2] != null) {
               this.aClass65Array_10607[var2].method661();
               this.aClass65Array_10607[var2] = null;
            }
         }

         for(var2 = 0; var2 < this.aClass378Array_10618.length; ++var2) {
            if(this.aClass378Array_10618[var2] != null) {
               this.aClass378Array_10618[var2].method4842();
               this.aClass378Array_10618[var2] = null;
            }
         }

         this.method7128();
         this.cleanup(0);
         this.aBoolean_10533 = true;
      }

   }

   public final boolean method1992() {
      return true;
   }

   public final boolean method1891() {
      return true;
   }

   public final boolean method1892() {
      return true;
   }

   void method7142() {
      this.method7314();
      this.method7300();
      this.method7193();
      this.method1908();
      this.method1967();
   }

   public final boolean method1959() {
      return true;
   }

   public final boolean method1964() {
      return true;
   }

   public final boolean method1963() {
      return this.isMultisample;
   }

   public abstract float method7146();

   public void cleanup(int var1) {
      if(this.aClass58_10599 != null) {
         this.aClass58_10599.method567();
      }

      this.anInt_10636 = var1 & Integer.MAX_VALUE;
   }

   Class56 method7148() {
      return this.aClass59_10605 == null?Class56.aClass56_1089:this.aClass59_10605.method579();
   }

   void method7149() {
      this.method7142();
   }

   public final boolean method1953() {
      if(this.aClass378Array_10618[1] != null && !this.aClass378Array_10618[1].method4838()) {
         boolean var1 = this.aClass63_10615.method629(this.aClass378Array_10618[1]);
         if(var1) {
            this.aClass58_10599.method564();
         }

         return var1;
      } else {
         return false;
      }
   }

   public final void method1990() {
      if(this.aClass378Array_10618[1] != null && this.aClass378Array_10618[1].method4838()) {
         this.aClass63_10615.method633(this.aClass378Array_10618[1]);
         this.aClass58_10599.method564();
      }

   }

   public final boolean method1989() {
      return this.aClass378Array_10618[1] != null && this.aClass378Array_10618[1].method4838();
   }

   public final int method1941(int var1, int var2) {
      return var1 | var2;
   }

   public final void method1934(int var1, Class1024 var2, int var3, int var4) {
      this.enableZBuffering(false);
      this.aClass170_Sub1_10603.method2139(0.0F, 0.0F, (float)this.method1896(-2057783969).method2194(), 0.0F, 0.0F, (float)this.method1896(1366264682).method2198(), 0, var2, var3, var4);
      this.enableZBuffering(true);
   }

   public final Class240_Sub51 method1926(int var1) {
      Class240_Sub51_Sub1 var2 = new Class240_Sub51_Sub1(var1);
      this.aNodeList_10556.addNode(var2, (short)-29715);
      return var2;
   }

   public final NativeHeapBuffer method7156(int var1, boolean var2) {
      return this.aNativeHeap_10554.createNativeHeapBuffer(var1, var2);
   }

   abstract void method7157();

   public final int getHeap() {
      return this.anInt_10656 + this.anInt_10514 + this.anInt_10516;
   }

   public final Sprite method1929(int var1, int var2, boolean var3, boolean var4) {
      return new Sprite_Sub1(this, var1, var2, var3, var4);
   }

   public final Sprite method1930(int[] var1, int var2, int var3, int var4, int var5, boolean var6) {
      return new Sprite_Sub1(this, var4, var5, var1, var2, var3);
   }

   public final Sprite method1932(int var1, int var2, int var3, int var4, boolean var5) {
      Sprite_Sub1 var6 = new Sprite_Sub1(this, var3, var4, var5, false);
      var6.method2127(0, 0, var3, var4, var1, var2);
      return var6;
   }

   public final FontRenderer method1935(RSFont var1, ImageData[] var2, boolean var3) {
      return new FontRenderer_Sub2(this, var1, var2, var3);
   }

   public final Class1024 method1910(int var1, int var2, int[] var3, int[] var4) {
      return Class1024_Sub2.create(this, var1, var2, var3, var4);
   }

   public final void method1938(int var1) {}

   public final Model createModel(ModelData var1, int var2, int var3, int var4, int var5) {
      return new Class165_Sub1(this, var1, var2, var4, var5, var3);
   }

   public final int method1940(int var1, int var2) {
      return var1 & var2 ^ var2;
   }

   public final Plane createPlane(int var1, int var2, int[][] var3, int[][] var4, int var5, int var6, int var7) {
      return new Class171_Sub3(this, var6, var7, var1, var2, var3, var4, var5);
   }

   public final ArrayViewport method1936() {
      return this.anArrayViewport_10660;
   }

   public final Viewport method1979() {
      return this.aViewport_10650;
   }

   public final Class177 method1952(int var1) {
      return new Class177_Sub1_Sub1(this, var1);
   }

   public final void method1925(Class177 var1) {
      this.aClass177_Sub1_10619 = (Class177_Sub1)var1;
   }

   public final Class398 method7172() {
      return this.aClass177_Sub1_10619 != null?this.aClass177_Sub1_10619.method7123():null;
   }

   final void method7173() {
      if(this.aClass387_10532 == Class387.aClass387_7481) {
         this.anInt_10562 = this.anInt_10569;
         this.anInt_10583 = this.anInt_10653;
         this.anInt_10577 = this.anInt_10560;
         this.anInt_10565 = this.anInt_10637;
         this.aFloat_10548 = this.aFloat_10550;
         this.aFloat_10600 = this.aFloat_10644;
      } else {
         this.anInt_10562 = 0;
         this.anInt_10583 = 0;
         this.anInt_10577 = this.aClass174_2815.method2194();
         this.anInt_10565 = this.aClass174_2815.method2198();
         this.aFloat_10548 = 0.0F;
         this.aFloat_10600 = 1.0F;
      }

      this.method7180();
      this.aFloat_10545 = (float)this.anInt_10560 / 2.0F;
      this.aFloat_10547 = (float)this.anInt_10637 / 2.0F;
      this.aFloat_10544 = (float)this.anInt_10569 + this.aFloat_10545;
      this.aFloat_10546 = (float)this.anInt_10653 + this.aFloat_10547;
   }

   public void method1970(float var1, float var2) {
      this.aFloat_10550 = var1;
      this.aFloat_10644 = var2;
      this.method7173();
   }

   public final void method1913(int[] var1) {
      var1[0] = this.anInt_10528;
      var1[1] = this.anInt_10552;
      var1[2] = this.anInt_10557;
      var1[3] = this.anInt_10512;
   }

   public void getScreenPosVisible(float var1, float var2, float var3, float[] var4) {
      float var5 = this.anArrayViewport_10541.data[14] + this.anArrayViewport_10541.data[2] * var1 + this.anArrayViewport_10541.data[6] * var2 + this.anArrayViewport_10541.data[10] * var3;
      float var6 = this.anArrayViewport_10541.data[15] + this.anArrayViewport_10541.data[3] * var1 + this.anArrayViewport_10541.data[7] * var2 + this.anArrayViewport_10541.data[11] * var3;
      if(var5 >= -var6 && var5 <= var6) {
         float var7 = this.anArrayViewport_10541.data[12] + this.anArrayViewport_10541.data[0] * var1 + this.anArrayViewport_10541.data[4] * var2 + this.anArrayViewport_10541.data[8] * var3;
         if(var7 >= -var6 && var7 <= var6) {
            float var8 = this.anArrayViewport_10541.data[13] + this.anArrayViewport_10541.data[1] * var1 + this.anArrayViewport_10541.data[5] * var2 + this.anArrayViewport_10541.data[9] * var3;
            if(var8 >= -var6 && var8 <= var6) {
               float var9 = this.anArrayViewport_10521.data[14] + this.anArrayViewport_10521.data[2] * var1 + this.anArrayViewport_10521.data[6] * var2 + this.anArrayViewport_10521.data[10] * var3;
               var4[0] = this.aFloat_10544 + this.aFloat_10545 * var7 / var6;
               var4[1] = this.aFloat_10546 + this.aFloat_10547 * var8 / var6;
               var4[2] = var9;
            } else {
               var4[2] = Float.NaN;
               var4[1] = Float.NaN;
               var4[0] = Float.NaN;
            }
         } else {
            var4[2] = Float.NaN;
            var4[1] = Float.NaN;
            var4[0] = Float.NaN;
         }
      } else {
         var4[2] = Float.NaN;
         var4[1] = Float.NaN;
         var4[0] = Float.NaN;
      }
   }

   public final void method1911(int var1, int var2, int var3, int var4) {
      int var5;
      int var6;
      if(this.aClass174_2815 != null) {
         var5 = this.aClass174_2815.method2194();
         var6 = this.aClass174_2815.method2198();
      } else {
         var6 = 0;
         var5 = 0;
      }

      var1 = var1 >= 0?var1:0;
      var3 = var3 <= var5?var3:var5;
      var2 = var2 >= 0?var2:0;
      var4 = var4 <= var6?var4:var6;
      boolean var7 = false;
      if(this.anInt_10528 < var1) {
         this.anInt_10528 = var1;
         var7 = true;
      }

      if(this.anInt_10557 > var3) {
         this.anInt_10557 = var3;
         var7 = true;
      }

      if(this.anInt_10552 < var2) {
         this.anInt_10552 = var2;
         var7 = true;
      }

      if(this.anInt_10512 > var4) {
         this.anInt_10512 = var4;
         var7 = true;
      }

      if(var7) {
         if(!this.aBoolean_10662 && (this.aBoolean_10604 || this.method7148() == Class56.aClass56_1089)) {
            this.aBoolean_10662 = true;
            this.method7182();
         }

         this.method7157();
      }

   }

   final void method7178(int var1, int var2) {
      this.anInt_10531 = var1;
      this.anInt_10567 = var2;
      this.method7180();
      this.method7157();
   }

   public void method1912(boolean var1) {
      this.aBoolean_10604 = var1;
   }

   abstract void method7180();

   public void method7181(Class72 var1) {
      this.aClass454_10558.method5535(var1, anObject_10592, 1793153963);
   }

   abstract void method7182();

   final ArrayViewport method7183() {
      return this.aClass387_10532 == Class387.aClass387_7481?this.anArrayViewport_10522:anArrayViewport_10525;
   }

   public final void setViewport(Viewport var1) {
      this.aViewport_10519 = var1;
      this.anArrayViewport_10521.setViewport(this.aViewport_10519);
      this.aViewport_10520.setAs(var1);
      this.aViewport_10520.method4642();
      this.anArrayViewport_10522.setViewport(this.aViewport_10520);
      this.method7187();
      if(this.aClass387_10532 == Class387.aClass387_7481) {
         this.method7189();
      }

   }

   public Viewport getViewport() {
      return this.aViewport_10519;
   }

   public final void method1946(ArrayViewport var1) {
      this.anArrayViewport_10499.replaceWith(var1);
      this.method7187();
      if(this.aClass387_10532 == Class387.aClass387_7481) {
         this.method7198();
      }

   }

   final void method7187() {
      this.anArrayViewport_10541.replaceWith(this.anArrayViewport_10521);
      this.anArrayViewport_10541.method4580(this.anArrayViewport_10499);
      this.anArrayViewport_10541.method4584(this.aFloatArrayArray_10543[0]);
      this.anArrayViewport_10541.method4582(this.aFloatArrayArray_10543[1]);
      this.anArrayViewport_10541.method4583(this.aFloatArrayArray_10543[2]);
      this.anArrayViewport_10541.method4567(this.aFloatArrayArray_10543[3]);
      this.anArrayViewport_10541.method4568(this.aFloatArrayArray_10543[4]);
      this.anArrayViewport_10541.method4553(this.aFloatArrayArray_10543[5]);
      this.anArrayViewport_10542.replaceWith(this.anArrayViewport_10541);
      this.method7192(this.anArrayViewport_10542);
   }

   public final ArrayViewport method1984() {
      return this.anArrayViewport_10499;
   }

   final void method7189() {
      this.aBoolean_10602 = false;
   }

   public abstract void method7190(Class379 var1);

   public final void method7191(int var1, Class61 var2) {
      this.method7229(var1, var2, false, false);
   }

   public abstract void method7192(ArrayViewport var1);

   final void method7193() {
      if(this.aClass387_10532 != Class387.aClass387_7479) {
         Class387 var1 = this.aClass387_10532;
         this.aClass387_10532 = Class387.aClass387_7479;
         if(var1 == Class387.aClass387_7481) {
            this.method7189();
         }

         this.anArrayViewport_10539 = this.anArrayViewport_10538;
         this.method7198();
         this.method7173();
         this.anInt_10570 &= -16;
      }

   }

   final void method7194() {
      if(this.aClass387_10532 != Class387.aClass387_7480) {
         Class387 var1 = this.aClass387_10532;
         this.aClass387_10532 = Class387.aClass387_7480;
         if(var1 == Class387.aClass387_7481) {
            this.method7189();
         }

         this.method7196();
         this.anArrayViewport_10539 = this.anArrayViewport_10537;
         this.method7198();
         this.method7173();
         this.anInt_10570 &= -9;
      }

   }

   final void method7195() {
      if(this.aClass387_10532 != Class387.aClass387_7481) {
         this.aClass387_10532 = Class387.aClass387_7481;
         this.method7189();
         this.method7197();
         this.anArrayViewport_10539 = this.anArrayViewport_10499;
         this.method7198();
         this.method7173();
         this.anInt_10570 &= -8;
      }

   }

   final void method7196() {
      if(!this.aBoolean_10590) {
         int var1;
         int var2;
         if(this.aClass174_2815 != null) {
            var1 = this.aClass174_2815.method2194();
            var2 = this.aClass174_2815.method2198();
         } else {
            var2 = 0;
            var1 = 0;
         }

         ArrayViewport var3 = this.anArrayViewport_10537;
         if(var1 != 0 && var2 != 0) {
            var3.method4587(0.0F, (float)var1, 0.0F, (float)var2, -1.0F, 1.0F);
         } else {
            var3.reset();
         }

         this.anArrayViewport_10535.replaceWith(var3);
         this.method7192(this.anArrayViewport_10535);
         this.aBoolean_10590 = true;
      }

   }

   final void method7197() {
      if(!this.aBoolean_10648) {
         this.aBoolean_10648 = true;
      }

   }

   final void method7198() {
      this.anArrayViewport_10581.replaceWith(this.anArrayViewport_10539);
      this.method7192(this.anArrayViewport_10581);
      this.aFloat_10568 = (this.anArrayViewport_10581.data[14] - this.anArrayViewport_10581.data[15]) / (this.anArrayViewport_10581.data[11] - this.anArrayViewport_10581.data[10]);
      this.aFloat_10576 = -this.anArrayViewport_10581.data[14] / this.anArrayViewport_10581.data[10];
      this.method7324();
   }

   final void method7199() {
      if(this.aClass404Array_10508[this.anInt_10511] != Class404.aClass404_7655) {
         this.aClass404Array_10508[this.anInt_10511] = Class404.aClass404_7655;
         this.anArrayViewportArray_10594[this.anInt_10511].reset();
         this.method7234();
      }

   }

   final void method7200(boolean var1) {
      if(var1 != this.aBoolean_10555) {
         this.aBoolean_10555 = var1;
         this.method7202();
         this.anInt_10570 &= -16;
      }

   }

   abstract void method7201();

   abstract void method7202();

   public int method1978(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = 0;
      float var8 = this.anArrayViewport_10541.data[14] + this.anArrayViewport_10541.data[2] * (float)var1 + this.anArrayViewport_10541.data[6] * (float)var2 + this.anArrayViewport_10541.data[10] * (float)var3;
      float var9 = this.anArrayViewport_10541.data[14] + this.anArrayViewport_10541.data[2] * (float)var4 + this.anArrayViewport_10541.data[6] * (float)var5 + this.anArrayViewport_10541.data[10] * (float)var6;
      float var10 = this.anArrayViewport_10541.data[15] + this.anArrayViewport_10541.data[3] * (float)var1 + this.anArrayViewport_10541.data[7] * (float)var2 + this.anArrayViewport_10541.data[11] * (float)var3;
      float var11 = this.anArrayViewport_10541.data[15] + this.anArrayViewport_10541.data[3] * (float)var4 + this.anArrayViewport_10541.data[7] * (float)var5 + this.anArrayViewport_10541.data[11] * (float)var6;
      if(var8 < -var10 && var9 < -var11) {
         var7 |= 16;
      } else if(var8 > var10 && var9 > var11) {
         var7 |= 32;
      }

      float var12 = this.anArrayViewport_10541.data[12] + this.anArrayViewport_10541.data[0] * (float)var1 + this.anArrayViewport_10541.data[4] * (float)var2 + this.anArrayViewport_10541.data[8] * (float)var3;
      float var13 = this.anArrayViewport_10541.data[12] + this.anArrayViewport_10541.data[0] * (float)var4 + this.anArrayViewport_10541.data[4] * (float)var5 + this.anArrayViewport_10541.data[8] * (float)var6;
      if(var12 < -var10 && var13 < -var11) {
         var7 |= 1;
      }

      if(var12 > var10 && var13 > var11) {
         var7 |= 2;
      }

      float var14 = this.anArrayViewport_10541.data[13] + this.anArrayViewport_10541.data[1] * (float)var1 + this.anArrayViewport_10541.data[5] * (float)var2 + this.anArrayViewport_10541.data[9] * (float)var3;
      float var15 = this.anArrayViewport_10541.data[13] + this.anArrayViewport_10541.data[1] * (float)var4 + this.anArrayViewport_10541.data[5] * (float)var5 + this.anArrayViewport_10541.data[9] * (float)var6;
      if(var14 < -var10 && var15 < -var11) {
         var7 |= 4;
      }

      if(var14 > var10 && var15 > var11) {
         var7 |= 8;
      }

      return var7;
   }

   public final void method1993(int var1, Class240_Sub53[] var2) {
      for(int var3 = 0; var3 < var1; ++var3) {
         this.aClass240_Sub53Array_10504[var3] = var2[var3];
      }

      this.anInt_10587 = var1;
   }

   final void method7205(boolean var1) {
      if(var1 != this.aBoolean_10571) {
         this.aBoolean_10571 = var1;
         this.method7303();
         this.anInt_10570 &= -8;
      }

   }

   public final void method1945(int var1, float var2, float var3, float var4, float var5, float var6) {
      boolean var7 = this.anInt_10595 != var1;
      if(var7 || this.aFloat_10561 != var2 || this.aFloat_10584 != var3) {
         this.anInt_10595 = var1;
         this.aFloat_10561 = var2;
         this.aFloat_10584 = var3;
         if(var7) {
            this.aFloat_10579 = (float)(this.anInt_10595 & 16711680) / 1.671168E7F;
            this.aFloat_10580 = (float)(this.anInt_10595 & '\uff00') / 65280.0F;
            this.aFloat_10651 = (float)(this.anInt_10595 & 255) / 255.0F;
            this.method7208();
         }

         this.method7310();
      }

      if(this.aFloatArray_10630[0] != var4 || this.aFloatArray_10630[1] != var5 || this.aFloatArray_10630[2] != var6) {
         this.aFloatArray_10630[0] = var4;
         this.aFloatArray_10630[1] = var5;
         this.aFloatArray_10630[2] = var6;
         this.aFloatArray_10613[0] = -var4;
         this.aFloatArray_10613[1] = -var5;
         this.aFloatArray_10613[2] = -var6;
         float var8 = (float)(1.0D / Math.sqrt((double)(var4 * var4 + var5 * var5 + var6 * var6)));
         this.aFloatArray_10574[0] = var4 * var8;
         this.aFloatArray_10574[1] = var5 * var8;
         this.aFloatArray_10574[2] = var6 * var8;
         this.aFloatArray_10513[0] = -this.aFloatArray_10574[0];
         this.aFloatArray_10513[1] = -this.aFloatArray_10574[1];
         this.aFloatArray_10513[2] = -this.aFloatArray_10574[2];
         this.method7308();
         this.anInt_10507 = (int)(var4 * 256.0F / var5);
         this.anInt_10591 = (int)(var6 * 256.0F / var5);
      }

      this.method7290();
   }

   public final void method1948(int var1) {
      for(this.anInt_10589 = 0; var1 > 1; var1 >>= 1) {
         ++this.anInt_10589;
      }

      this.anInt_10588 = 1 << this.anInt_10589;
   }

   abstract void method7208();

   abstract void method7209();

   final void method7210() {
      if(this.method7298()) {
         this.method7211();
      }

      this.anInt_10586 = this.anInt_10587;
   }

   abstract void method7211();

   abstract boolean method7212(Class136 var1, Class87 var2);

   abstract boolean method7213(Class136 var1, Class87 var2);

   public final void method1986(Class240_Sub51 var1) {
      this.aNativeHeap_10554 = ((Class240_Sub51_Sub1)var1).aNativeHeap_1362;
   }

   final Class384 method7215(Class136 var1, int var2, int var3, boolean var4, byte[] var5) {
      return this.method7218(var1, var2, var3, var4, var5, 0, 0);
   }

   final Class384 method7216(Class136 var1, int var2, int var3, boolean var4, float[] var5) {
      return this.method7309(var1, var2, var3, var4, var5, 0, 0);
   }

   abstract Class384 method7217(Class136 var1, Class87 var2, int var3, int var4);

   abstract Class384 method7218(Class136 var1, int var2, int var3, boolean var4, byte[] var5, int var6, int var7);

   abstract Class384 method7219(int var1, int var2, boolean var3, int[] var4, int var5, int var6);

   abstract Class398 method7220(int var1, boolean var2, int[][] var3);

   abstract Class54 method7221(Class136 var1, int var2, int var3, int var4, boolean var5, byte[] var6);

   ArrayViewport method7222() {
      return this.anArrayViewport_10518;
   }

   public final int method7223() {
      return this.anInt_10511;
   }

   public final void method7224(Class403 var1) {
      if(this.aClass403Array_10593[this.anInt_10511] != var1) {
         this.aClass403Array_10593[this.anInt_10511] = var1;
         if(var1 != null) {
            var1.method4976();
         } else {
            this.aClass384_10563.method4976();
         }

         this.anInt_10570 &= -2;
      }

   }

   public abstract void method7225();

   public final void method7226(int var1) {
      switch(var1) {
      case 0:
         this.method7274(Class392.aClass392_7530, Class392.aClass392_7530);
         break;
      case 1:
         this.method7274(Class392.aClass392_7531, Class392.aClass392_7531);
         break;
      case 2:
         this.method7274(Class392.aClass392_7534, Class392.aClass392_7531);
         break;
      case 3:
         this.method7274(Class392.aClass392_7532, Class392.aClass392_7530);
         break;
      case 4:
         this.method7274(Class392.aClass392_7533, Class392.aClass392_7533);
      }

   }

   final ArrayViewport method7227() {
      return this.aClass387_10532 == Class387.aClass387_7481?this.anArrayViewport_10521:anArrayViewport_10525;
   }

   final void method7228() {
      this.aClass57_10551 = new Class57(this);
      this.aBoolean_10505 = false;

      try {
         this.aClass27_10638 = new Class27_Sub2(this);
         this.spriteRenderer = new Class67_Sub1(this);
         this.aClass47_10610 = new Class47_Sub1(this);
         this.aClass28_10611 = new Class28_Sub1(this);
         this.aClass65_Sub1_Sub2_10612 = new Class65_Sub1_Sub2(this, this.aClass57_10551, false);
         this.aClass65_Sub1_Sub2_10523 = new Class65_Sub1_Sub2(this, this.aClass57_10551, true);
         this.aClass65_Sub1_Sub1_10559 = new Class65_Sub1_Sub1(this, this.aClass57_10551);
      } catch (Exception var3) {
         var3.printStackTrace();
         this.aClass27_10638 = new Class27_Sub1(this);
         this.spriteRenderer = new Class67_Sub2(this);
         this.aClass47_10610 = new Class47_Sub2(this);
         this.aClass28_10611 = new Class28_Sub2(this);
         this.aClass65_Sub1_Sub2_10612 = null;
         this.aClass65_Sub1_Sub2_10523 = null;
         this.aClass65_Sub1_Sub1_10559 = null;
         this.aBoolean_10505 = true;
      }

      int var1;
      int var2;
      if(this.aClass174_2815 != null) {
         var1 = this.aClass174_2815.method2194();
         var2 = this.aClass174_2815.method2198();
      } else {
         var2 = 0;
         var1 = 0;
      }

      this.aClass63_10615 = new Class63(this, var1, var2);
      if(!this.aBoolean_10505) {
         this.aClass378Array_10618[1] = new Class378_Sub1(this);
         this.aClass63_10615.method629(this.aClass378Array_10618[1]);
      }

      if(this.aClass65_10621 != null) {
         this.aClass65_10621.method660();
         this.aClass65_10621 = null;
      }

      this.method7134();
   }

   abstract void method7229(int var1, Class61 var2, boolean var3, boolean var4);

   public final void method7230(int var1, Class61 var2) {
      this.method7231(var1, var2, false);
   }

   abstract void method7231(int var1, Class61 var2, boolean var3);

   public final ArrayViewport method7232() {
      return this.anArrayViewportArray_10594[this.anInt_10511];
   }

   public final void method7233(Class404 var1) {
      this.aClass404Array_10508[this.anInt_10511] = var1;
      this.method7234();
   }

   final void method7234() {
      this.method7240();
   }

   abstract void method7235();

   abstract void method7236();

   public final Sprite loadSprite(AbstractImageData var1, boolean var2) {
      Sprite var4;
      if(var1.getWidth() != 0 && var1.getHeight() != 0) {
         int[] var3 = var1.getPixelData(false);
         var4 = this.defineSprite(var3, 0, var1.getWidth(), var1.getWidth(), var1.getHeight());
      } else {
         var4 = this.defineSprite(new int[]{0}, 0, 1, 1, 1);
      }

      var4.setDimensions(var1.method1368(), var1.method1366(), var1.method1379(), var1.method1367());
      return var4;
   }

   public final void method1957(int var1, Class105 var2) {
      this.anInt_10622 = var1;
      this.aClass105_10623 = var2;
      this.aBoolean_10620 = true;
   }

   public final void method1958(int var1, Class105 var2) {
      if(!this.aBoolean_10620) {
         throw new RuntimeException("");
      } else {
         this.anInt_10622 = var1;
         this.aClass105_10623 = var2;
         if(this.aBoolean_10515) {
            this.aClass65Array_10607[3].method662();
            this.aClass65Array_10607[3].method658();
         }

      }
   }

   abstract void method7240();

   final void method7241(int var1) {
      if(this.anInt_10663 != var1) {
         this.anInt_10663 = var1;
         this.method7243();
      }

   }

   abstract void method7242();

   abstract void method7243();

   final void method7244(boolean var1) {
      if(var1 != this.aBoolean_10624) {
         this.aBoolean_10624 = var1;
         this.method7247();
         this.anInt_10570 &= -16;
      }

   }

   public final void method1949(int var1, int var2, int var3) {
      if(this.anInt_10626 != var1 || this.anInt_10627 != var2 || this.anInt_10628 != var3) {
         this.anInt_10626 = var1;
         this.anInt_10627 = var2;
         this.anInt_10628 = var3;
         this.method7324();
         this.method7247();
      }

   }

   abstract void method7246();

   abstract void method7247();

   abstract void method7248(boolean var1);

   abstract Class414 method7249(boolean var1);

   abstract Class379 method7250(Class402[] var1);

   public abstract void method7251(int var1, Class76 var2);

   public final boolean supportsTexture() {
      return this.aClass378Array_10618[1] != null;
   }

   public final void drawOutline(int var1, int var2, int var3, int var4, int var5, int var6) {
      if(this.aBoolean_10566) {
         this.enableZBuffering(false);
         this.aClass170_Sub1_10549.method2130(var1, var2, var3, var4, 0, var5, var6);
         this.enableZBuffering(true);
      } else {
         this.aClass170_Sub1_10549.method2130(var1, var2, var3, var4, 0, var5, var6);
      }

   }

   public final void method1920(int var1, int var2, int var3, int var4, int var5, int var6) {
      --var3;
      --var4;
      byte var7 = 0;
      if(this instanceof OpenGLRenderer_Sub1) {
         var7 = -1;
      }

      this.method1968(var1, var2 + var7, var1 + var3, var2 + var7, var5, var6);
      this.method1968(var1, var2 + var4 + var7, var1 + var3, var2 + var4 + var7, var5, var6);
      this.method1968(var1, var2, var1, var2 + var4, var5, var6);
      this.method1968(var1 + var3, var2, var1 + var3, var2 + var4, var5, var6);
   }

   public final void method1991(int var1, int var2, int var3, int var4, int var5, int var6, byte[] var7, int var8, int var9) {}

   public final void method1921(int var1, int var2, float var3, int var4, int var5, float var6, int var7, int var8, float var9, int var10, int var11, int var12, int var13) {}

   final void method1937(int var1, int var2, int var3, int var4, int var5) {}

   public final void method1922(int var1, int var2, int var3, int var4, int var5) {
      this.method1968(var1, var2, var1 + var3, var2, var4, var5);
   }

   public final void method1967() {
      if(this.aClass174_2815 != null) {
         this.anInt_10552 = 0;
         this.anInt_10528 = 0;
         this.anInt_10557 = this.aClass174_2815.method2194();
         this.anInt_10512 = this.aClass174_2815.method2198();
      } else {
         this.anInt_10512 = 0;
         this.anInt_10557 = 0;
         this.anInt_10552 = 0;
         this.anInt_10528 = 0;
      }

      if(this.aBoolean_10662) {
         this.aBoolean_10662 = false;
         this.method7182();
      }

   }

   public final void method1968(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.method1956(var1, var2, var3, var4, var5, 1, var6);
   }

   public void method1923(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      float var10 = (float)var3 - (float)var1;
      float var11 = (float)var4 - (float)var2;
      if(var10 == 0.0F && var11 == 0.0F) {
         var10 = 1.0F;
      } else {
         float var12 = (float)(1.0D / Math.sqrt((double)(var10 * var10 + var11 * var11)));
         var10 *= var12;
         var11 *= var12;
      }

      this.method7194();
      Class65 var23 = this.aClass65Array_10607[13];
      var23.method656();
      var23.method657(var5);
      this.method7279(var6);
      var23.method659();
      this.method7248(false);
      var9 %= var8 + var7;
      float var13 = var10 * (float)var7;
      float var14 = var11 * (float)var7;
      float var15 = 0.0F;
      float var16 = 0.0F;
      float var17 = var13;
      float var18 = var14;
      if(var9 > var7) {
         var15 = var10 * (float)(var7 + var8 - var9);
         var16 = var11 * (float)(var7 + var8 - var9);
      } else {
         var17 = var10 * (float)(var7 - var9);
         var18 = var11 * (float)(var7 - var9);
      }

      float var19 = (float)var1 + var15;
      float var20 = (float)var2 + var16;
      float var21 = var10 * (float)var8;
      float var22 = var11 * (float)var8;

      while(true) {
         if(var3 > var1) {
            if(var19 > (float)var3) {
               break;
            }

            if(var19 + var17 > (float)var3) {
               var17 = (float)var3 - var19;
            }
         } else {
            if(var19 < (float)var3) {
               break;
            }

            if(var19 + var17 < (float)var3) {
               var17 = (float)var3 - var19;
            }
         }

         if(var4 > var2) {
            if(var20 > (float)var4) {
               break;
            }

            if(var20 + var18 > (float)var4) {
               var18 = (float)var4 - var20;
            }
         } else {
            if(var20 < (float)var4) {
               break;
            }

            if(var20 + var18 < (float)var4) {
               var18 = (float)var4 - var20;
            }
         }

         if(!this.method7137(var19, var20, 0.0F, var19 + var17, var20 + var18, 0.0F)) {
            return;
         }

         this.method7266();
         var19 += var21 + var17;
         var20 += var22 + var18;
         var17 = var13;
         var18 = var14;
      }

      this.method7248(true);
      var23.method660();
   }

   public void method1974(int var1, int var2, int var3, int var4, int var5, int var6, Class1024 var7, int var8, int var9, int var10, int var11, int var12) {}

   public final void method1954(int var1, int var2, int var3, int var4, int var5, int var6, Class1024 var7, int var8, int var9) {}

   public final void method1956(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      var1 = (int)((float)var1 + 1.0F);
      var2 = (int)((float)var2 + 1.0F);
      var3 = (int)((float)var3 + 1.0F);
      var4 = (int)((float)var4 + 1.0F);
      float var8 = (float)(var3 - var1);
      float var9 = (float)(var4 - var2);
      float var10 = 1.0F / (float)Math.sqrt((double)(var8 * var8 + var9 * var9));
      var8 *= var10;
      var9 *= var10;
      var1 = (int)((float)var1 - var8);
      var2 = (int)((float)var2 - var9);
      float var11 = -var9;
      var11 *= 0.5F * (float)var6;
      float var12 = var8 * 0.5F * (float)var6;
      this.aClass170_Sub1_10549.method2143((float)var1 - var11, (float)var2 - var12, (float)var3 - var11, (float)var4 - var12, (float)var1 + var11, (float)var2 + var12, 0, var5, var7);
   }

   public final void method1944(Class167 var1) {
      this.aClass60_10564.method591(this, var1);
   }

   final void method7266() {
      this.method7251(0, this.aClass76_10503);
      this.method7190(this.aClass379_10643);
      this.method7268(Class396.aClass396_7569, 0, 1);
   }

   public final void method7267() {
      this.method7296(Class396.aClass396_7574, 2);
   }

   public abstract void method7268(Class396 var1, int var2, int var3);

   abstract void method7269(Class414 var1, Class396 var2, int var3, int var4, int var5, int var6);

   public abstract void method7270(Class396 var1, int var2, int var3, int var4, int var5);

   public final void method7271() {
      if(this.anInt_10570 != 2) {
         this.method7194();
         this.method7244(false);
         this.method7205(false);
         this.method7304(false);
         this.method7200(false);
         this.anInt_10570 = 2;
      }

   }

   final void method7272() {
      if(this.anInt_10570 != 8) {
         this.method7195();
         this.method7244(true);
         this.method7304(true);
         this.method7200(true);
         this.method7279(1);
         this.anInt_10570 = 8;
      }

   }

   final void method7273() {
      this.method7208();
      this.method7310();
      this.method7303();
      this.method7210();
      this.method7308();
      this.method7290();
      this.method7209();
      this.method7201();
      this.method7202();
      this.method7247();
      this.method7246();
      this.method7280();
      this.method7243();
      this.method7242();

      for(int var1 = this.anInt_10641 - 1; var1 >= 0; --var1) {
         this.method7313(var1);
         this.method7321();
         this.method7291();
         this.method7199();
      }

      this.method7235();
      this.method7180();
   }

   public final void method7274(Class392 var1, Class392 var2) {
      boolean var3 = false;
      if(this.aClass392Array_10575[this.anInt_10511] != var1) {
         this.aClass392Array_10575[this.anInt_10511] = var1;
         this.method7321();
         var3 = true;
      }

      if(this.aClass392Array_10597[this.anInt_10511] != var2) {
         this.aClass392Array_10597[this.anInt_10511] = var2;
         this.method7291();
         var3 = true;
      }

      if(var3) {
         this.anInt_10570 &= -14;
      }

   }

   final void method7275() {
      this.aClass76_10606 = this.method7320(false);
      this.aClass76_10606.method981(3096, 12);
      this.aByteBuffer_10646.clear();
      this.aByteBuffer_10646.putFloat(0.0F);
      this.aByteBuffer_10646.putFloat(0.0F);
      this.aByteBuffer_10646.putFloat(0.0F);

      for(int var1 = 0; var1 <= 256; ++var1) {
         double var2 = (double)(var1 * 2) * 3.141592653589793D / 256.0D;
         float var4 = (float)Math.cos(var2);
         float var5 = (float)Math.sin(var2);
         this.aByteBuffer_10646.putFloat(var5);
         this.aByteBuffer_10646.putFloat(var4);
         this.aByteBuffer_10646.putFloat(0.0F);
      }

      this.aClass76_10606.method4853(0, this.aByteBuffer_10646.position(), this.aLong_10629);
   }

   ArrayViewport method7276() {
      if(this.aClass387_10532 == Class387.aClass387_7481) {
         if(!this.aBoolean_10602) {
            this.method7285();
         }

         return this.anArrayViewport_10524;
      } else {
         return this.anArrayViewport_10518;
      }
   }

   public void method7277(int var1) {
      if(var1 != this.anInt_10598) {
         this.anInt_10598 = var1;
         this.method7235();
      }

   }

   void method7278() {
      this.aClass63_10615.method635();
      this.aClass76_10649.method824();
      this.aClass76_10503.method824();
      this.aClass76_10606.method824();

      for(int var1 = 0; var1 < 7; ++var1) {
         this.aClass165_Sub1Array_10659[var1].method6899();
      }

      this.aClass60_10564.method588();
      this.aClass414_10657.method824();
      this.aClass59_10605.method580();
      this.aClass59_10605 = null;
   }

   final void method7279(int var1) {
      if(this.anInt_10631 != var1) {
         Class393 var2;
         boolean var3;
         boolean var4;
         if(var1 == 1) {
            var2 = Class393.aClass393_7556;
            var3 = true;
            var4 = true;
         } else if(var1 == 2) {
            var2 = Class393.aClass393_7554;
            var3 = false;
            var4 = true;
         } else if(var1 == 128) {
            var2 = Class393.aClass393_7555;
            var3 = true;
            var4 = true;
         } else {
            var2 = Class393.aClass393_7557;
            var3 = false;
            var4 = false;
         }

         if(var3 != this.aBoolean_10634) {
            this.aBoolean_10634 = var3;
            this.method7242();
         }

         if(var4 != this.aBoolean_10633) {
            this.aBoolean_10633 = var4;
            this.method7280();
         }

         if(var2 != this.aClass393_10632) {
            this.aClass393_10632 = var2;
            this.method7243();
         }

         this.anInt_10631 = var1;
         this.anInt_10570 &= -13;
      }

   }

   abstract void method7280();

   public static void method7281() throws Exception_Sub5 {
      Class183.getLibLoader(927119361).loadLib("jaclib", (byte)90);
   }

   public final void method1973() {
      this.aClass63_10615.method631();
   }

   public final void method1965(int var1, int var2, int var3, int var4) {
      int var5;
      int var6;
      if(this.aClass174_2815 != null) {
         var5 = this.aClass174_2815.method2194();
         var6 = this.aClass174_2815.method2198();
      } else {
         var6 = 0;
         var5 = 0;
      }

      if(var1 <= 0 && var3 >= var5 - 1 && var2 <= 0 && var4 >= var6 - 1) {
         this.method1967();
      } else {
         this.anInt_10528 = var1 >= 0?var1:0;
         this.anInt_10557 = var3 <= var5?var3:var5;
         this.anInt_10552 = var2 >= 0?var2:0;
         this.anInt_10512 = var4 <= var6?var4:var6;
         if(!this.aBoolean_10662 && (this.aBoolean_10604 || this.method7148() == Class56.aClass56_1089)) {
            this.aBoolean_10662 = true;
            this.method7182();
         }

         this.method7157();
      }
   }

   abstract void method7284(int var1);

   Viewport method7285() {
      if(this.aClass387_10532 == Class387.aClass387_7481) {
         if(!this.aBoolean_10602) {
            this.aViewport_10661.setAs(this.aViewport_10517);
            this.aViewport_10661.method4641(this.aViewport_10519);
            this.anArrayViewport_10524.setViewport(this.aViewport_10661);
            this.aBoolean_10602 = true;
         }

         return this.aViewport_10661;
      } else {
         return this.aViewport_10517;
      }
   }

   final Class414 method7286(int var1) {
      if(this.aClass414_10657.method4854() < var1 * 2) {
         this.aClass414_10657.method5136(var1);
      }

      return this.aClass414_10657;
   }

   void method7287() {
      this.method7284(7);
      this.method7273();
   }

   public void getScreenPosHidden(float var1, float var2, float var3, float[] var4) {
      float var5 = this.anArrayViewport_10541.data[15] + this.anArrayViewport_10541.data[3] * var1 + this.anArrayViewport_10541.data[7] * var2 + this.anArrayViewport_10541.data[11] * var3;
      float var6 = this.anArrayViewport_10541.data[12] + this.anArrayViewport_10541.data[0] * var1 + this.anArrayViewport_10541.data[4] * var2 + this.anArrayViewport_10541.data[8] * var3;
      float var7 = this.anArrayViewport_10541.data[13] + this.anArrayViewport_10541.data[1] * var1 + this.anArrayViewport_10541.data[5] * var2 + this.anArrayViewport_10541.data[9] * var3;
      float var8 = this.anArrayViewport_10521.data[14] + this.anArrayViewport_10521.data[2] * var1 + this.anArrayViewport_10521.data[6] * var2 + this.anArrayViewport_10521.data[10] * var3;
      var4[0] = this.aFloat_10544 + this.aFloat_10545 * var6 / var5;
      var4[1] = this.aFloat_10546 + this.aFloat_10547 * var7 / var5;
      var4[2] = var8;
   }

   public final void init() {
      this.aClass403Array_10593 = new Class403[this.anInt_10641];
      this.anArrayViewportArray_10594 = new ArrayViewport[this.anInt_10641];
      this.aClass404Array_10508 = new Class404[this.anInt_10641];
      this.aClass392Array_10575 = new Class392[this.anInt_10641];
      this.aClass392Array_10597 = new Class392[this.anInt_10641];

      for(int var1 = 0; var1 < this.anInt_10641; ++var1) {
         this.aClass392Array_10597[var1] = Class392.aClass392_7530;
         this.aClass392Array_10575[var1] = Class392.aClass392_7530;
         this.aClass404Array_10508[var1] = Class404.aClass404_7655;
         this.anArrayViewportArray_10594[var1] = new ArrayViewport();
      }

      this.aClass240_Sub53Array_10504 = new Class240_Sub53[this.anInt_10642 - 2];
      int[] var3 = new int[]{-1};
      this.aClass384_10563 = this.method7219(1, 1, false, var3, 0, 0);
      var3[0] = -16777216;
      this.aClass384_10601 = this.method7219(1, 1, false, var3, 0, 0);
      this.method1986(new Class240_Sub51_Sub1(262144));
      this.aClass379_10495 = this.method7250(new Class402[]{new Class402(new Class380[]{Class380.aClass380_7356, Class380.aClass380_7355})});
      this.aClass379_10639 = this.method7250(new Class402[]{new Class402(new Class380[]{Class380.aClass380_7356, Class380.aClass380_7353})});
      this.aClass379_10654 = this.method7250(new Class402[]{new Class402(Class380.aClass380_7356), new Class402(Class380.aClass380_7353), new Class402(Class380.aClass380_7355), new Class402(Class380.aClass380_7352)});
      this.aClass379_10500 = this.method7250(new Class402[]{new Class402(Class380.aClass380_7356), new Class402(Class380.aClass380_7353), new Class402(Class380.aClass380_7355)});

      for(int var2 = 0; var2 < 7; ++var2) {
         this.aClass165_Sub1Array_10658[var2] = new Class165_Sub1(this, 0, 0, false, false);
         this.aClass165_Sub1Array_10659[var2] = new Class165_Sub1(this, 0, 0, true, true);
      }

      this.method7228();
      this.aClass414_10657 = this.method7249(true);
      this.method7287();
      this.method1890();
      this.method1967();
      this.method1907();
      this.aClass170_Sub1_10549 = new Sprite_Sub1(this, this.aClass384_10563);
      this.aClass170_Sub1_10603 = new Sprite_Sub1(this, this.aClass384_10601);
      this.method1977(3, 0);
   }

   abstract void method7290();

   abstract void method7291();

   abstract Class406 method7292(Class136 var1, Class87 var2, int var3, int var4);

   Class105 method7293() {
      return this.aClass105_10623;
   }

   final ArrayViewport method7294() {
      return this.anArrayViewport_10581;
   }

   public void method1933() {
      if(this.aClass59_10605 != null) {
         this.aClass59_10605.method574();
      }

   }

   final void method7296(Class396 var1, int var2) {
      this.method7251(0, this.aClass76_10649);
      this.method7190(this.aClass379_10652);
      this.method7268(var1, 0, var2);
   }

   final Class384 method7297(int var1, int var2, boolean var3, int[] var4) {
      return this.method7219(var1, var2, var3, var4, 0, 0);
   }

   final boolean method7298() {
      return this.aBoolean_10505;
   }

   public final boolean method1900() {
      return true;
   }

   final void method7300() {
      this.aBoolean_10648 = false;
      this.method7197();
      if(this.aClass387_10532 == Class387.aClass387_7481) {
         this.method7198();
      }

   }

   public final void method1951(int var1, int var2, int var3, int var4, int var5) {
      this.method1968(var1, var2, var1, var2 + var3, var4, var5);
   }

   public final void enableZBuffering(boolean var1) {
      this.aBoolean_10566 = var1;
      this.method7202();
   }

   abstract void method7303();

   final void method7304(boolean var1) {
      if(var1 != this.aBoolean_10553) {
         this.aBoolean_10553 = var1;
         this.method7201();
         this.anInt_10570 &= -16;
      }

   }

   public final void method1947(float var1) {
      if(this.aFloat_10582 != var1) {
         this.aFloat_10582 = var1;
         this.method7208();
         this.method7290();
      }

   }

   abstract void method7306(int var1);

   abstract void method7307(Class414 var1);

   abstract void method7308();

   abstract Class384 method7309(Class136 var1, int var2, int var3, boolean var4, float[] var5, int var6, int var7);

   abstract void method7310();

   public final void method1981() {
      this.aBoolean_10620 = false;
   }

   final ArrayViewport method7312() {
      return this.anArrayViewportArray_10594[this.anInt_10511];
   }

   public final void method7313(int var1) {
      if(this.anInt_10511 != var1) {
         this.anInt_10511 = var1;
         this.method7236();
      }

   }

   final void method7314() {
      this.aBoolean_10590 = false;
      if(this.aClass387_10532 == Class387.aClass387_7480) {
         this.method7196();
         this.method7198();
      }

   }

   public void method1909(int var1, int var2, int var3, int var4) {
      this.anInt_10569 = var1;
      this.anInt_10653 = var2;
      this.anInt_10560 = var3;
      this.anInt_10637 = var4;
      this.method7173();
   }

   public final void method1887(int var1, int var2, int var3, int var4) {
      this.aClass63_10615.method630(var1, var2, var3, var4);
   }

   public final boolean method1969() {
      return true;
   }

   final void method1955(float var1, float var2, float var3, float var4, float var5, float var6) {
      Class378_Sub1.aFloat_3855 = var1;
      Class378_Sub1.aFloat_3849 = var2;
      Class378_Sub1.aFloat_3848 = var3;
      Class378_Sub1.aFloat_3863 = var6;
   }

   public final int method1994() {
      return this.anInt_10642 - 2;
   }

   abstract Class76 method7320(boolean var1);

   abstract void method7321();

   public void method1908() {
      this.anInt_10569 = 0;
      this.anInt_10653 = 0;
      this.anInt_10560 = this.aClass174_2815.method2194();
      this.anInt_10637 = this.aClass174_2815.method2198();
      this.method7173();
   }

   public final boolean method1894() {
      return false;
   }

   final void method7324() {
      if(this.aClass65_10621 != null) {
         this.aClass65_10621.method658();
      }

      this.method7246();
   }

   public abstract boolean method7325();

   byte[] method7326(String var1, String var2) {
      return this.aCacheUnpacker_10596.method3583(var1, var2, (byte)29);
   }
}
