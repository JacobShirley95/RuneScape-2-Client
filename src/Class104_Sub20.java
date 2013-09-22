
public class Class104_Sub20 extends CharTask {

   final int anInt_10727;
   final int anInt_10728;
   final int anInt_10729;
   final int anInt_10730;
   final int anInt_10731;
   public static int anInt_10732;


   Class104_Sub20(ByteArrayDataNode var1) {
      super(var1);
      this.anInt_10727 = var1.readShort(-164801096) * 539280901;
      int var2 = var1.method4480(1260717178);
      this.anInt_10728 = -1402691573 * (var2 >>> 16);
      this.anInt_10731 = 426385199 * (var2 & '\uffff');
      this.anInt_10730 = var1.readByte(-157146235) * -510923019;
      this.anInt_10729 = var1.method4489(1158549501) * -286327003;
   }

   public void execute() {
      Class95.aClass100Array_1894[951391949 * this.anInt_10727].method1285(1703734179 * this.anInt_10728, -1754167345 * this.anInt_10731, this.anInt_10730 * 949013853, 925697197 * this.anInt_10729, (byte)3);
   }

   public static int method7394(int var0, int var1, float var2, int var3) {
      return UpdateServerConnector.rgbToColour(var0, var1, (int)var2);
   }
}
