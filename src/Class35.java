import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

public class Class35 implements Runnable {

   Thread aThread_831;
   Class77[] aClass77Array_832;
   volatile boolean aBoolean_833;


   Class77 method267(int var1, int var2) {
      return this.aClass77Array_832 != null && var1 >= 0 && var1 < this.aClass77Array_832.length?this.aClass77Array_832[var1]:null;
   }

   boolean method268(byte var1) {
      if(this.aBoolean_833) {
         return true;
      } else {
         if(null == this.aThread_831) {
            this.aThread_831 = new Thread(this);
            this.aThread_831.start();
         }

         return this.aBoolean_833;
      }
   }

   public void run() {
      try {
         int var1 = Class554.aClass554_9529 == Class209.currentGameMode?80:-1543224839 * Class503.aConnectionDesc_9109.id + 7000;
         BufferedReader var2 = new BufferedReader(new InputStreamReader(new DataInputStream((new URL("http://" + Class503.aConnectionDesc_9109.hostIP + ":" + var1 + "/news.ws?game=" + client.currentGamePack.anInt_9269 * -265238991)).openStream())));
         String var3 = var2.readLine();

         ArrayList var4;
         for(var4 = new ArrayList(); var3 != null; var3 = var2.readLine()) {
            var4.add(var3);
         }

         String[] var5 = new String[var4.size()];
         var4.toArray(var5);
         if(var5.length % 3 != 0) {
            return;
         }

         this.aClass77Array_832 = new Class77[var5.length / 3];

         for(int var6 = 0; var6 < var5.length; var6 += 3) {
            this.aClass77Array_832[var6 / 3] = new Class77(var5[var6], var5[1 + var6], var5[var6 + 2]);
         }
      } catch (IOException var7) {
         ;
      }

      this.aBoolean_833 = true;
   }

   static final void method269(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class336.method4165(var3, var4, var0, (byte)-112);
   }

   static final void method270(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      Class240_Sub46.method4981(var2, 820971279);
   }

   static final void method271(RSInterfaceData var0, byte var1) {
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub23_7293, var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111] == 1?1:0, -228190436);
      Class83.method1089(-1930278833);
      client.aBoolean_568 = false;
   }

   static final void method272(RSInterfaceData var0, short var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      Class618.method6611(var3, var4, var0, (byte)84);
   }

   public static void method273(int var0, int var1, int var2) {
      if(0 != Class134.anInt_2617 * 1919337139) {
         if(var0 < 0) {
            for(int var3 = 0; var3 < 16; ++var3) {
               Class26.anIntArray_269[var3] = var1;
            }
         } else {
            Class26.anIntArray_269[var0] = var1;
         }
      }

      Class134.aClass240_Sub41_Sub2_2616.method477(var0, var1, -1305573933);
   }

   static final void method274(RSInterfaceData var0, byte var1) {
      if(0 == -826987519 * client.anInt_567) {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = -1;
      } else {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = -275736435 * client.ignoreListCount;
      }

   }

   static final void method275(RSInterface var0, RSInterfaceData var1, int var2) {
      int var3 = var1.intTypes[(var1.intTypeIndex -= -708028207) * -831324111];
      int var4 = var1.intTypes[(var1.intTypeIndex -= -708028207) * -831324111] - 1;
      int var5 = var4;
      if(6 != -28225993 * var0.anInt_2469 && -28225993 * var0.anInt_2469 != 2) {
         throw new RuntimeException("");
      } else {
         NPCComposite var6 = Class104_Sub6.characterUnpacker.method5670(1007149995 * var0.anInt_2416, 1290540225);
         if(var0.aClass442_2594 == null) {
            var0.aClass442_2594 = new Class442(var6, 6 == var0.anInt_2469 * -28225993);
         }

         var0.aClass442_2594.aLong_8440 = Class585_Sub1.method4152(555125569) * -7074691745365666227L;
         if(null != var6.aByteArray_8657) {
            if(var4 < 0 || var4 >= var6.aByteArray_8657.length) {
               throw new RuntimeException("");
            }

            var5 = var6.aByteArray_8657[var4];
         }

         if(null != var6.aShortArray_8617 && var5 >= 0 && var5 < var6.aShortArray_8617.length) {
            var0.aClass442_2594.aShortArray_8441[var5] = (short)var3;
            Class110_Sub1.method3149(var0, -1657283980);
         } else {
            throw new RuntimeException("");
         }
      }
   }
}
