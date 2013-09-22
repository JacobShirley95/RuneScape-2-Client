import java.util.Arrays;

public class Class104_Sub19 extends CharTask {

   final int anInt_10722;
   final int anInt_10723;
   public static long aLong_10724;
   final int[] anIntArray_10725;
   final int anInt_10726;


   public void execute() {
      RSCharacter var2 = Class95.aClass100Array_1894[this.anInt_10726 * 337982905].getTarget((byte)124);
      if(this.anInt_10722 * 309406305 == 0) {
         Class532.method6035(var2, this.anIntArray_10725, 0, false, 48063579);
      } else {
         Class278.method3621(var2, new int[]{this.anInt_10723 * 1489336067}, new int[]{0}, new int[]{309406305 * this.anInt_10722}, (byte)0);
      }

   }

   boolean method1344(int var1) {
      Animation var2 = Class88.animeUnpacker.loadAnimation(1489336067 * this.anInt_10723);
      return var2.method6725(-543221386);
   }

   Class104_Sub19(ByteArrayDataNode var1) {
      super(var1);
      this.anInt_10726 = var1.readShort(528899950) * -1813495671;
      this.anIntArray_10725 = new int[Class12.method70((byte)16).length];
      this.anInt_10723 = var1.method4493(-157074556) * 1236544427;
      Arrays.fill(this.anIntArray_10725, 0, this.anIntArray_10725.length, this.anInt_10723 * 1489336067);
      this.anInt_10722 = var1.method4480(1260717178) * -232982111;
   }

   static ByteArrayDataNode method7391(int var0) {
      ByteArrayDataNode var1 = new ByteArrayDataNode(518);
      Class114.anIntArray_2080 = new int[4];
      Class114.anIntArray_2080[0] = (int)(Math.random() * 9.9999999E7D);
      Class114.anIntArray_2080[1] = (int)(Math.random() * 9.9999999E7D);
      Class114.anIntArray_2080[2] = (int)(Math.random() * 9.9999999E7D);
      Class114.anIntArray_2080[3] = (int)(Math.random() * 9.9999999E7D);
      var1.putByte(10, -502253021);
      var1.putIntBE(Class114.anIntArray_2080[0], 2062892803);
      var1.putIntBE(Class114.anIntArray_2080[1], 2062892803);
      var1.putIntBE(Class114.anIntArray_2080[2], 2062892803);
      var1.putIntBE(Class114.anIntArray_2080[3], 2062892803);
      return var1;
   }

   static void method7392(ArrayViewport var0, int var1) {
      Class18.anArrayViewport_170.replaceWith(var0);
   }
}
