
public class Class104_Sub18_Sub2 extends Class104_Sub18 {

   final int anInt_1774;
   final int anInt_1775;
   final int anInt_1776;


   Class104_Sub18_Sub2(ByteArrayDataNode var1) {
      super(var1);
      int var2 = var1.method4480(1260717178);
      this.anInt_1774 = 114817657 * (var2 >>> 16);
      this.anInt_1775 = -1338172123 * (var2 & '\uffff');
      this.anInt_1776 = var1.readByte(-817906254) * -681638697;
   }

   public void execute() {
      int var2 = this.anInt_1774 * -761294336 + 256;
      int var3 = 256 + 1064131072 * this.anInt_1775;
      int var4 = this.anInt_1776 * -1405341977;
      if(var4 < 3 && client.aClass296_348.method3753().method3646(this.anInt_1774 * -1830203447, this.anInt_1775 * -761284947, (byte)0)) {
         ++var4;
      }

      Class563_Sub1_Sub4_Sub2 var5 = new Class563_Sub1_Sub4_Sub2(client.aClass296_348.getWorldObjects(), this.anInt_10711 * 1277898055, 0, -1405341977 * this.anInt_1776, var4, var2, CompProfile.getHeight(var2, var3, -1405341977 * this.anInt_1776) - -1357018981 * this.anInt_10709, var3, this.anInt_1774 * -1830203447, this.anInt_1774 * -1830203447, this.anInt_1775 * -761284947, this.anInt_1775 * -761284947, this.anInt_10710 * 1290243069, false, 0);
      client.aNodeArrayList_277.insert(new Class240_Sub22_Sub6(var5), (long)(this.anInt_1774 * -1830203447 << 16 | this.anInt_1775 * -761284947));
   }
}
