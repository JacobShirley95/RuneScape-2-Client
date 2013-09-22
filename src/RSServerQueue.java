import jaclib.ping.Ping;
import java.net.InetAddress;
import java.util.LinkedList;
import java.util.Queue;

public class RSServerQueue implements Runnable {

   final Queue serverQueue = new LinkedList();
   Thread aThread_9589 = new Thread(this);
   final Object anObject_9590 = new Object();


   public RSServer getServer(String var1, short var2) {
      if(this.aThread_9589 == null) {
         throw new IllegalStateException("");
      } else if(null == var1) {
         throw new IllegalArgumentException("");
      } else {
         RSServer var3 = new RSServer(var1);
         this.queueServer(var3, 598769529);
         return var3;
      }
   }

   void queueServer(Object var1, int var2) {
      Queue var3 = this.serverQueue;
      synchronized(this.serverQueue) {
         this.serverQueue.add(var1);
         this.serverQueue.notify();
      }
   }

   public void run() {
      while(true) {
         Queue var1 = this.serverQueue;
         RSServer var4;
         synchronized(this.serverQueue) {
            Object var2;
            for(var2 = this.serverQueue.poll(); var2 == null; var2 = this.serverQueue.poll()) {
               try {
                  this.serverQueue.wait();
               } catch (InterruptedException var7) {
                  ;
               }
            }

            if(var2 == this.anObject_9590) {
               return;
            }

            var4 = (RSServer)var2;
         }

         int var9;
         try {
            byte[] var10 = InetAddress.getByName(var4.serverAddress).getAddress();
            var9 = Ping.ping(var10[0], var10[1], var10[2], var10[3], 1000L);
         } catch (Throwable var6) {
            var9 = 1000;
         }

         var4.serverPing = var9 * -1897065301;
      }
   }

   public void method6195(int var1) {
      if(null != this.aThread_9589) {
         this.queueServer(this.anObject_9590, 585311924);

         try {
            this.aThread_9589.join();
         } catch (InterruptedException var3) {
            ;
         }

         this.aThread_9589 = null;
      }
   }

   public RSServerQueue() {
      this.aThread_9589.setDaemon(true);
      this.aThread_9589.start();
   }

   static final void method6196(RSInterfaceData var0, byte var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      Class234.method3013(var3, var4, true, 0, var0, 589876446);
   }

   static final void method6197(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class240_Sub41_Sub5.method625(var3, var4, var0, 2084167039);
   }

   static final void method6198(RSInterfaceData var0, byte var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = getInterface(var2, (byte)105);
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 1975898755 * var3.outlineColour;
   }

   static boolean method6199(String var0, String var1, short var2) {
      Class11.anInt_58 = -1907328518;
      Class11.clientServerHandler = client.lobbyConnectionHandler;
      return Class240_Sub44.method4969(false, false, var0, var1, -1L);
   }

   static final void method6200(RSInterface var0, int var1, RSInterfaceData var2, byte var3) {
      if(var0.aByteArrayArray_2506 == null) {
         throw new RuntimeException();
      } else {
         if(var0.anIntArray_2542 == null) {
            var0.anIntArray_2542 = new int[var0.aByteArrayArray_2506.length];
         }

         var0.anIntArray_2542[var1] = Integer.MAX_VALUE;
      }
   }

   public static RSInterface getInterface(int var0, byte var1) {
      int var2 = var0 >> 16;
      if(RSInterface.interfaceGroups[var2] == null || RSInterface.interfaceGroups[var2].getChildInterface(var0, 763976599) == null) {
         boolean var3 = Class24.method149(var2, (int[])null, 752014417);
         if(!var3) {
            return null;
         }
      }

      return RSInterface.interfaceGroups[var2].getChildInterface(var0, -1812844663);
   }
}
