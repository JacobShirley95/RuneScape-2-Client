
public class Class104_Sub2 extends CharTask {

   final int anInt_4101;
   final int anInt_4102;


   Class104_Sub2(ByteArrayDataNode var1) {
      super(var1);
      this.anInt_4102 = var1.readShort(-984073275) * -1081699331;
      this.anInt_4101 = var1.method4480(1260717178) * -22020745;
   }

   public void execute() {
      client.anInt_331 = 834881873 * client.timer;
      client.anInt_575 = client.timer * 583590479 + this.anInt_4102 * -531132757;
      Class172.anInt_3041 = -2052330665 * client.anInt_272;
      RendererInfo.anInt_3079 = client.anInt_364 * -955972287;
      RSCharacter.anInt_4356 = -1822638293 * client.anInt_545;
      Class540_Sub11.anInt_2385 = client.anInt_366 * 1432346169;
      client.anInt_272 = 1025553921 * (846326855 * this.anInt_4101 >>> 24);
      client.anInt_364 = 2134853389 * (this.anInt_4101 * 846326855 >>> 16 & 255);
      client.anInt_545 = (this.anInt_4101 * 846326855 >>> 8 & 255) * 480818915;
      client.anInt_366 = (846326855 * this.anInt_4101 & 255) * 1960937893;
   }

   public static boolean method3146(int var0, String var1, int var2) {
      Class503.aConnectionDesc_9108 = new ConnectionDesc();
      Class503.aConnectionDesc_9108.id = -1268862903 * var0;
      Class503.aConnectionDesc_9108.hostIP = var1;
      if(Class554.aClass554_9529 != Class209.currentGameMode) {
         Class503.aConnectionDesc_9108.index = Class503.aConnectionDesc_9108.id * 714041859 + -2114966848;
         Class503.aConnectionDesc_9108.anInt_8747 = Class503.aConnectionDesc_9108.id * -1638782029 + -1087093648;
      }

      return true;
   }
}
