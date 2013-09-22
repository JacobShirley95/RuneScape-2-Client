
public class Class104_Sub10 extends CharTask {

   final int anInt_4598;
   final int anInt_4599;
   final int anInt_4600;
   final int anInt_4601;
   final int anInt_4602;


   Class104_Sub10(ByteArrayDataNode var1) {
      super(var1);
      this.anInt_4598 = var1.readShort(1624996947) * 2135838467;
      int var2 = var1.method4480(1260717178);
      this.anInt_4599 = 1038155947 * (var2 >>> 16);
      this.anInt_4600 = -231494757 * (var2 & '\uffff');
      this.anInt_4601 = var1.readByte(-422152348) * -1318274801;
      this.anInt_4602 = var1.readByte(714570521) * -417194285;
   }

   public void execute() {
      Class95.aClass102Array_1889[-1415834709 * this.anInt_4598].method1310(-2137057809 * this.anInt_4601, this.anInt_4599 * 1596127747, 132891283 * this.anInt_4600, -1689523877 * this.anInt_4602, -1980504451);
   }
}
