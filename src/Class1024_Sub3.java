import java.awt.datatransfer.Clipboard;

public class Class1024_Sub3 extends Class1024 {

   int[] anIntArray_10981;
   int[] anIntArray_10982;
   public static Clipboard aClipboard_10983;


   Class1024_Sub3(int var1, int var2, int[] var3, int[] var4) {
      this.anIntArray_10982 = var3;
      this.anIntArray_10981 = var4;
   }

   static final void method7586(RSInterfaceData var0, byte var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var3.hidden?1:0;
   }

   static final void method7587(RSInterface var0, byte[] var1, byte[] var2, RSInterfaceData var3, int var4) {
      int var5 = var3.intTypes[(var3.intTypeIndex -= -708028207) * -831324111] - 1;
      if(var5 >= 0 && var5 <= 9) {
         Class19.method112(var0, var5, var1, var2, var3, 191417370);
      } else {
         throw new RuntimeException();
      }
   }
}
