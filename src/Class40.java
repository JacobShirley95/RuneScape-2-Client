
public class Class40 {

   public final int anInt_873;
   static final Class40 aClass40_874 = new Class40(1, 120);
   static final Class40 aClass40_875 = new Class40(2, 136);
   static final Class40 aClass40_876 = new Class40(3, 168);
   static final Class40 aClass40_877 = new Class40(4, 72);
   public static final Class40 aClass40_878 = new Class40(0, 104);
   public final int anInt_879;
   public static byte aByte_880;


   Class40(int var1, int var2) {
      this.anInt_873 = 43897875 * var1;
      this.anInt_879 = -1188340817 * var2;
   }

   static int method325(ByteArrayDataNode_Sub1 var0, int var1) {
      int var2 = var0.method291(2, 1832157798);
      int var3;
      if(0 == var2) {
         var3 = 0;
      } else if(1 == var2) {
         var3 = var0.method291(5, 1832157798);
      } else if(2 == var2) {
         var3 = var0.method291(8, 1832157798);
      } else {
         var3 = var0.method291(11, 1832157798);
      }

      return var3;
   }

   public static boolean method326(byte[] var0, byte var1) {
      ByteArrayDataNode var2 = new ByteArrayDataNode(var0);
      int var3 = var2.readByte(897275470);
      if(2 != var3) {
         return false;
      } else {
         boolean var4 = var2.readByte(-479928713) == 1;
         if(var4) {
            Class254.method3338(var2, -1817033853);
         }

         Class223.method2807(var2, -1735302762);
         return true;
      }
   }
}
