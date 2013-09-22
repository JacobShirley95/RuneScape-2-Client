import java.io.IOException;
import java.io.OutputStream;

public class ServerOutputStream implements Runnable {

   IOException anIOException_4092;
   boolean aBoolean_4093;
   int maxData;
   byte[] data;
   int anInt_4096 = 0;
   int anInt_4097 = 0;
   Thread curThread;
   OutputStream anOutputStream_4099;


   void method3130(int var1) {
      synchronized(this) {
         this.aBoolean_4093 = true;
         this.notifyAll();
      }

      try {
         this.curThread.join();
      } catch (InterruptedException var4) {
         ;
      }

   }

   boolean method3131(byte var1) {
      if(this.aBoolean_4093) {
         try {
            this.anOutputStream_4099.close();
            if(this.anIOException_4092 == null) {
               this.anIOException_4092 = new IOException("");
            }
         } catch (IOException var3) {
            if(null == this.anIOException_4092) {
               this.anIOException_4092 = new IOException(var3);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   ServerOutputStream(OutputStream var1, int var2) {
      this.anOutputStream_4099 = var1;
      this.maxData = 1407389079 * (1 + var2);
      this.data = new byte[1968718375 * this.maxData];
      this.curThread = new Thread(this);
      this.curThread.setDaemon(true);
      this.curThread.start();
   }

   void method3132(byte[] var1, int var2, int var3, int var4) throws IOException {
      if(var3 >= 0 && var2 >= 0 && var2 + var3 <= var1.length) {
         synchronized(this) {
            if(null != this.anIOException_4092) {
               throw new IOException(this.anIOException_4092.toString());
            } else {
               int var6;
               if(this.anInt_4096 * 1103783259 <= this.anInt_4097 * -790370067) {
                  var6 = this.maxData * 1968718375 - -790370067 * this.anInt_4097 + this.anInt_4096 * 1103783259 - 1;
               } else {
                  var6 = 1103783259 * this.anInt_4096 - -790370067 * this.anInt_4097 - 1;
               }

               if(var6 < var3) {
                  throw new IOException("");
               } else {
                  if(var3 + -790370067 * this.anInt_4097 <= 1968718375 * this.maxData) {
                     System.arraycopy(var1, var2, this.data, this.anInt_4097 * -790370067, var3);
                  } else {
                     int var7 = this.maxData * 1968718375 - -790370067 * this.anInt_4097;
                     System.arraycopy(var1, var2, this.data, this.anInt_4097 * -790370067, var7);
                     System.arraycopy(var1, var7 + var2, this.data, 0, var3 - var7);
                  }

                  this.anInt_4097 = -1937591067 * ((var3 + -790370067 * this.anInt_4097) % (1968718375 * this.maxData));
                  this.notifyAll();
               }
            }
         }
      } else {
         throw new IOException();
      }
   }

   void method3133(int var1) {
      this.anOutputStream_4099 = new OutputStream_Sub1();
   }

   public void run() {
      do {
         int var2;
         synchronized(this) {
            while(true) {
               if(null != this.anIOException_4092) {
                  return;
               }

               if(1103783259 * this.anInt_4096 <= -790370067 * this.anInt_4097) {
                  var2 = -790370067 * this.anInt_4097 - this.anInt_4096 * 1103783259;
               } else {
                  var2 = this.anInt_4097 * -790370067 + (this.maxData * 1968718375 - 1103783259 * this.anInt_4096);
               }

               if(var2 > 0) {
                  break;
               }

               try {
                  this.anOutputStream_4099.flush();
               } catch (IOException var10) {
                  this.anIOException_4092 = var10;
                  return;
               }

               if(this.method3131((byte)83)) {
                  return;
               }

               try {
                  this.wait();
               } catch (InterruptedException var11) {
                  ;
               }
            }
         }

         try {
            if(var2 + 1103783259 * this.anInt_4096 <= 1968718375 * this.maxData) {
               this.anOutputStream_4099.write(this.data, this.anInt_4096 * 1103783259, var2);
            } else {
               int var13 = this.maxData * 1968718375 - 1103783259 * this.anInt_4096;
               this.anOutputStream_4099.write(this.data, this.anInt_4096 * 1103783259, var13);
               this.anOutputStream_4099.write(this.data, 0, var2 - var13);
            }
         } catch (IOException var9) {
            IOException var1 = var9;
            synchronized(this) {
               this.anIOException_4092 = var1;
               return;
            }
         }

         synchronized(this) {
            this.anInt_4096 = -1397275949 * ((1103783259 * this.anInt_4096 + var2) % (this.maxData * 1968718375));
         }
      } while(!this.method3131((byte)46));

   }

   static final void method3134(int var0, int var1, int var2, boolean var3, int var4) {
      if(Class24.method149(var0, (int[])null, 1629950444)) {
         Class104_Sub7.method3379(RSInterface.interfaceGroups[var0].interfaceArray, -1, var1, var2, var3, -603580365);
      }
   }

   static final void method3135(RSInterfaceData var0, int var1) {
      Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub32_7303, var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111], 110167790);
      client.aClass296_348.method3789((byte)80);
      Class83.method1089(-2102822457);
      client.aBoolean_568 = false;
   }
}
