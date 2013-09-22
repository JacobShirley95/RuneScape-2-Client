import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.Mixer.Info;

public class Class316_Sub1 extends Class316 {

   byte[] aByteArray_8287;
   AudioFormat anAudioFormat_8288;
   int anInt_8289;
   SourceDataLine aSourceDataLine_8290;
   boolean aBoolean_8291 = false;
   boolean aBoolean_8292 = false;


   int method3910() {
      return this.anInt_8289 - (this.aSourceDataLine_8290.available() >> (aBoolean_6136?2:1));
   }

   void method3903(Component var1) {
      Info[] var2 = AudioSystem.getMixerInfo();
      if(var2 != null) {
         Info[] var3 = var2;

         for(int var4 = 0; var4 < var3.length; ++var4) {
            Info var5 = var3[var4];
            if(var5 != null) {
               String var6 = var5.getName();
               if(var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                  this.aBoolean_8292 = true;
               }
            }
         }
      }

      this.anAudioFormat_8288 = new AudioFormat((float)anInt_6135, 16, aBoolean_6136?2:1, true, false);
      this.aByteArray_8287 = new byte[256 << (aBoolean_6136?2:1)];
   }

   void method3904(int var1) throws LineUnavailableException {
      if(this.aSourceDataLine_8290 != null) {
         if(!this.aBoolean_8291) {
            throw new IllegalStateException("");
         }

         if(var1 == this.anInt_8289) {
            this.aBoolean_8291 = false;
            return;
         }

         if(!this.method5378()) {
            return;
         }
      }

      try {
         javax.sound.sampled.DataLine.Info var2 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.anAudioFormat_8288, var1 << (aBoolean_6136?2:1));
         this.aSourceDataLine_8290 = (SourceDataLine)AudioSystem.getLine(var2);
         this.aSourceDataLine_8290.open();
         this.aSourceDataLine_8290.start();
         this.anInt_8289 = var1;
         this.aBoolean_8291 = false;
      } catch (LineUnavailableException var3) {
         if(Class459.method5572(var1, -845242193) != 1) {
            this.method3904(Class105.method1359(var1, (byte)125));
         } else {
            this.aBoolean_8291 = true;
            throw var3;
         }
      }
   }

   void method3913() {
      if(!this.aBoolean_8291) {
         int var1 = 256;
         if(aBoolean_6136) {
            var1 <<= 1;
         }

         for(int var2 = 0; var2 < var1; ++var2) {
            int var3 = this.anIntArray_6141[var2];
            if((var3 + 8388608 & -16777216) != 0) {
               var3 = 8388607 ^ var3 >> 31;
            }

            this.aByteArray_8287[var2 * 2] = (byte)(var3 >> 8);
            this.aByteArray_8287[var2 * 2 + 1] = (byte)(var3 >> 16);
         }

         this.aSourceDataLine_8290.write(this.aByteArray_8287, 0, var1 << 1);
      }
   }

   void method3906(boolean var1) {
      if(var1) {
         this.method5378();
      } else {
         try {
            this.method3907();
         } catch (LineUnavailableException var3) {
            ;
         }

         this.aBoolean_8291 = true;
      }
   }

   void method3907() throws LineUnavailableException {
      if(!this.aBoolean_8291) {
         this.aSourceDataLine_8290.flush();
         if(this.aBoolean_8292) {
            if(!this.method5378()) {
               return;
            }

            javax.sound.sampled.DataLine.Info var1 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.anAudioFormat_8288, this.anInt_8289 << (aBoolean_6136?2:1));
            this.aSourceDataLine_8290 = (SourceDataLine)AudioSystem.getLine(var1);
            this.aSourceDataLine_8290.open();
            this.aSourceDataLine_8290.start();
         }

      }
   }

   boolean method5378() {
      boolean var1 = false;
      if(this.aSourceDataLine_8290 != null) {
         Thread var2 = new Thread(new Class292(this));
         var2.start();

         try {
            var2.join(2000L);
         } catch (InterruptedException var7) {
            ;
         } finally {
            if(this.aSourceDataLine_8290 != null) {
               this.aSourceDataLine_8290 = null;
               this.method3905();
            }

            var1 = true;
         }
      }

      return var1;
   }
}
