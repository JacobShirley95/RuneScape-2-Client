
public class Class104_Sub9 extends CharTask {

   final int anInt_4533;
   final int anInt_4534;
   final int anInt_4535;
   final int anInt_4536;
   Class225 aClass225_4537;


   Class104_Sub9(ByteArrayDataNode var1) {
      super(var1);
      this.anInt_4534 = var1.readShort(-704270276) * 1878248131;
      this.anInt_4536 = var1.readByte(-613545684) * 455082363;
      this.anInt_4535 = var1.readByte(-1089021692) * -1011256657;
      this.anInt_4533 = var1.readByte(818453184) * -1704394489;
   }

   void method1343(byte var1) {
      if(this.aClass225_4537 != null) {
         Class129.method1665(this.aClass225_4537, -368457891);
         this.aClass225_4537 = null;
      }

   }

   public void execute() {
      this.aClass225_4537 = Class271.method3556(this.anInt_4534 * 674477547, this.anInt_4533 * -953115465, 0, this.anInt_4536 * 1523168691, false, 1911235663 * this.anInt_4535, -708028207);
   }

   static final void method3463(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class104_Sub21.renderSettings.aClass540_Sub29_7312.method4279(-1390485458)?1:0;
   }

   static final void method3464(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 2057037889 * Class494.aClass240_Sub15_9037.anInt_6891 >= 512 && !client.aBoolean_422 && !client.aBoolean_297?0:1;
   }
}
