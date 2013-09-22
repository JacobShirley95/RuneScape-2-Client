import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class RandomAccessFileNode {

   long size;
   RandomAccessFile file;
   final long aLong_9017;
   public static Class255 aClass255_9018;


   final void seek(long var1) throws IOException {
      this.file.seek(var1);
      this.size = var1 * 5114745737076359681L;
   }

   public final void writeData(byte[] var1, int var2, int var3, byte var4) throws IOException {
      if(-152784253310812671L * this.size + (long)var3 > this.aLong_9017 * -3380184049508908511L) {
         this.file.seek(this.aLong_9017 * -3380184049508908511L);
         this.file.write(1);
         throw new EOFException();
      } else {
         this.file.write(var1, var2, var3);
         this.size += (long)var3 * 5114745737076359681L;
      }
   }

   public final long getFileLength(int var1) throws IOException {
      return this.file.length();
   }

   public RandomAccessFileNode(File var1, String var2, long var3) throws IOException {
      if(var3 == -1L) {
         var3 = Long.MAX_VALUE;
      }

      if(var1.length() > var3) {
         var1.delete();
      }

      this.file = new RandomAccessFile(var1, var2);
      this.aLong_9017 = -5614937545775808031L * var3;
      this.size = 0L;
      int var5 = this.file.read();
      if(var5 != -1 && !var2.equals("r")) {
         this.file.seek(0L);
         this.file.write(var5);
      }

      this.file.seek(0L);
   }

   public void finalize() throws Throwable {
      if(null != this.file) {
         System.out.println("");
         this.closeRAFile((byte)95);
      }

   }

   public final void closeRAFile(byte var1) throws IOException {
      if(this.file != null) {
         this.file.close();
         this.file = null;
      }

   }

   public final int read(byte[] var1, int var2, int var3) throws IOException {
      int var5 = this.file.read(var1, var2, var3);
      if(var5 > 0) {
         this.size += 5114745737076359681L * (long)var5;
      }

      return var5;
   }

   static void method5761(boolean var0, byte var1) {
      if(var0) {
         if(client.anInt_468 * 1854782309 != -1) {
            Class188.method2308(client.anInt_468 * 1854782309, 1148469640);
         }

         for(Class240_Sub16 var2 = (Class240_Sub16)client.widgets.start(); null != var2; var2 = (Class240_Sub16)client.widgets.next()) {
            if(!var2.hasNext()) {
               var2 = (Class240_Sub16)client.widgets.start();
               if(var2 == null) {
                  break;
               }
            }

            Class104_Sub8.method3387(var2, true, false, (byte)-1);
         }

         client.anInt_468 = 1513750931;
         client.widgets = new NodeArrayList(8);
         Class86.method1133(-48752405);
         client.anInt_468 = 1782801557 * Class571.aClass587_9651.anInt_9756;
         Class211.method2659(false, 2052158274);
         Class104_Sub3.method3180(2105623373);
         Class240_Sub25.method4845(client.anInt_468 * 1854782309, (int[])null, 291673434);
      }

      Class11.aBoolean_97 = true;
   }

   static final void method5762(RSInterfaceData var0, byte var1) {
      var0.intTypeIndex -= -1416056414;
      int var2 = var0.intTypes[-831324111 * var0.intTypeIndex];
      int var3 = var0.intTypes[1 + -831324111 * var0.intTypeIndex];
      if(null == RSInterface.interfaceGroups[var2]) {
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = "";
      } else {
         String var4 = RSInterface.interfaceGroups[var2].interfaceArray[var3].aString_2425;
         if(null == var4) {
            var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = "";
         } else {
            var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = var4;
         }
      }

   }

   public static final void method5763(Model var0, Animator var1, Animator var2, int var3) {
      if(var1.method5886(1266345920) && var2.method5886(1530490324)) {
         Animation var4 = var1.animation;
         Animation var5 = var2.animation;
         var0.method2018(var1.aClass519_9137.aClass240_Sub22_Sub9_9233, var1.aClass519_9137.anInt_9231 * -1426378405, var1.aClass519_9137.aClass240_Sub22_Sub9_9234, 63235891 * var1.aClass519_9137.anInt_9235, 808430347 * var1.anInt_9130, var4.anIntArray_10109[799508455 * var1.anInt_9126], var2.aClass519_9137.aClass240_Sub22_Sub9_9233, -1426378405 * var2.aClass519_9137.anInt_9231, var2.aClass519_9137.aClass240_Sub22_Sub9_9234, var2.aClass519_9137.anInt_9235 * 63235891, var2.anInt_9130 * 808430347, var5.anIntArray_10109[var2.anInt_9126 * 799508455], var4.aClass258_10110 != null?var4.aClass258_10110.aBooleanArray_4434:null, var4.aBoolean_10117 | var5.aBoolean_10117);
      }

   }

   public static void method5764(Class231 var0, Class231 var1, int var2) {
      if(null != var0.aClass231_3955) {
         var0.method2931(-1612011383);
      }

      var0.aClass231_3955 = var1;
      var0.aClass231_3954 = var1.aClass231_3954;
      var0.aClass231_3955.aClass231_3954 = var0;
      var0.aClass231_3954.aClass231_3955 = var0;
   }
}
