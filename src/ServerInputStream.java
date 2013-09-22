import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public class ServerInputStream implements Runnable {

   int anInt_4368;
   Thread aThread_4369;
   InputStream anInputStream_4370;
   byte[] aByteArray_4371;
   int anInt_4372 = 0;
   int anInt_4373 = 0;
   IOException anIOException_4374;
   public static int anInt_4375;


   boolean method3298(int var1, byte var2) throws IOException {
      if(var1 > 0 && var1 < this.anInt_4368 * -6176969) {
         synchronized(this) {
            int var4;
            if(this.anInt_4372 * 1055542997 <= 88489911 * this.anInt_4373) {
               var4 = this.anInt_4373 * 88489911 - this.anInt_4372 * 1055542997;
            } else {
               var4 = -6176969 * this.anInt_4368 - this.anInt_4372 * 1055542997 + this.anInt_4373 * 88489911;
            }

            if(var4 < var1) {
               if(null != this.anIOException_4374) {
                  throw new IOException(this.anIOException_4374.toString());
               } else {
                  this.notifyAll();
                  return false;
               }
            } else {
               return true;
            }
         }
      } else {
         throw new IOException();
      }
   }

   ServerInputStream(InputStream var1, int var2) {
      this.anInputStream_4370 = var1;
      this.anInt_4368 = 540944007 * (var2 + 1);
      this.aByteArray_4371 = new byte[-6176969 * this.anInt_4368];
      this.aThread_4369 = new Thread(this);
      this.aThread_4369.setDaemon(true);
      this.aThread_4369.start();
   }

   int method3299(byte[] var1, int var2, int var3, int var4) throws IOException {
      if(var3 >= 0 && var2 >= 0 && var2 + var3 <= var1.length) {
         synchronized(this) {
            int var6;
            if(this.anInt_4372 * 1055542997 <= 88489911 * this.anInt_4373) {
               var6 = this.anInt_4373 * 88489911 - 1055542997 * this.anInt_4372;
            } else {
               var6 = this.anInt_4368 * -6176969 - this.anInt_4372 * 1055542997 + this.anInt_4373 * 88489911;
            }

            if(var3 > var6) {
               var3 = var6;
            }

            if(var3 == 0 && this.anIOException_4374 != null) {
               throw new IOException(this.anIOException_4374.toString());
            } else {
               if(1055542997 * this.anInt_4372 + var3 <= this.anInt_4368 * -6176969) {
                  System.arraycopy(this.aByteArray_4371, 1055542997 * this.anInt_4372, var1, var2, var3);
               } else {
                  int var7 = -6176969 * this.anInt_4368 - 1055542997 * this.anInt_4372;
                  System.arraycopy(this.aByteArray_4371, 1055542997 * this.anInt_4372, var1, var2, var7);
                  System.arraycopy(this.aByteArray_4371, 0, var1, var2 + var7, var3 - var7);
               }

               this.anInt_4372 = (var3 + 1055542997 * this.anInt_4372) % (this.anInt_4368 * -6176969) * 82737789;
               this.notifyAll();
               return var3;
            }
         }
      } else {
         throw new IOException();
      }
   }

   void method3300(int var1) {
      this.anInputStream_4370 = new InputStream_Sub1();
   }

   int method3301(int var1) throws IOException {
      synchronized(this) {
         int var3;
         if(1055542997 * this.anInt_4372 <= this.anInt_4373 * 88489911) {
            var3 = this.anInt_4373 * 88489911 - 1055542997 * this.anInt_4372;
         } else {
            var3 = this.anInt_4368 * -6176969 - 1055542997 * this.anInt_4372 + 88489911 * this.anInt_4373;
         }

         if(null != this.anIOException_4374) {
            throw new IOException(this.anIOException_4374.toString());
         } else {
            this.notifyAll();
            return var3;
         }
      }
   }

   public void run() {
      while(true) {
         int var2;
         synchronized(this) {
            while(true) {
               if(null != this.anIOException_4374) {
                  return;
               }

               if(this.anInt_4372 * 1055542997 == 0) {
                  var2 = -6176969 * this.anInt_4368 - 88489911 * this.anInt_4373 - 1;
               } else if(this.anInt_4372 * 1055542997 <= this.anInt_4373 * 88489911) {
                  var2 = this.anInt_4368 * -6176969 - this.anInt_4373 * 88489911;
               } else {
                  var2 = this.anInt_4372 * 1055542997 - this.anInt_4373 * 88489911 - 1;
               }

               if(var2 > 0) {
                  break;
               }

               try {
                  this.wait();
               } catch (InterruptedException var9) {
                  ;
               }
            }
         }

         int var1;
         try {
            var1 = this.anInputStream_4370.read(this.aByteArray_4371, this.anInt_4373 * 88489911, var2);
            if(-1 == var1) {
               throw new EOFException();
            }
         } catch (IOException var10) {
            IOException var3 = var10;
            synchronized(this) {
               this.anIOException_4374 = var3;
               return;
            }
         }

         synchronized(this) {
            this.anInt_4373 = (88489911 * this.anInt_4373 + var1) % (-6176969 * this.anInt_4368) * -592851449;
         }
      }
   }

   void method3302(int var1) {
      synchronized(this) {
         if(null == this.anIOException_4374) {
            this.anIOException_4374 = new IOException("");
         }

         this.notifyAll();
      }

      try {
         this.aThread_4369.join();
      } catch (InterruptedException var4) {
         ;
      }

   }

   public static String method3303(Object[] var0, int var1, int var2, byte var3) {
      if(var2 == 0) {
         return "";
      } else if(1 == var2) {
         CharSequence var9 = (CharSequence)var0[var1];
         return var9 == null?"null":var9.toString();
      } else {
         int var4 = var1 + var2;
         int var5 = 0;

         for(int var6 = var1; var6 < var4; ++var6) {
            CharSequence var7 = (CharSequence)var0[var6];
            if(null == var7) {
               var5 += 4;
            } else {
               var5 += var7.length();
            }
         }

         StringBuilder var10 = new StringBuilder(var5);

         for(int var11 = var1; var11 < var4; ++var11) {
            CharSequence var8 = (CharSequence)var0[var11];
            if(null == var8) {
               var10.append("null");
            } else {
               var10.append(var8);
            }
         }

         return var10.toString();
      }
   }

   static void drawOptionBox(Renderer var0, int var1, int var2, int var3, int var4, int var5, int var6, byte var7) {
      var0.method1915(var1, var2, var3, var4, var5, (byte)11);
      var0.method1915(1 + var1, 1 + var2, var3 - 2, 16, var6, (byte)-6);
      var0.method1972(var1 + 1, 18 + var2, var3 - 2, var4 - 19, var6, 1071851646);
   }
}
