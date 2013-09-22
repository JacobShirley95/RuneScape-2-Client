import java.io.File;
import java.io.RandomAccessFile;

public class Class25 {

   static final short aShort_220 = 5;
   static final short aShort_221 = 3;
   static final short aShort_222 = 4;
   static final short aShort_223 = 52;
   static final short aShort_224 = 60;
   static final short aShort_225 = 49;
   static final short aShort_226 = 9;
   static final short aShort_227 = 10;
   static final short aShort_228 = 11;
   static final short aShort_229 = 22;
   static final short aShort_230 = 13;
   static final short aShort_231 = 15;
   static final short aShort_232 = 1009;
   static final short aShort_233 = 17;
   static final short aShort_234 = 45;
   static final short aShort_235 = 19;
   static final short aShort_236 = 20;
   static final short aShort_237 = 25;
   static final short aShort_238 = 2;
   static final short aShort_239 = 23;
   static final short aShort_240 = 50;
   static final short aShort_241 = 30;
   static final short aShort_242 = 44;
   static final short aShort_243 = 1008;
   static final short aShort_244 = 16;
   static final short aShort_245 = 47;
   static final short aShort_246 = 48;
   static final short aShort_247 = 1007;
   static final short aShort_248 = 21;
   static final short aShort_249 = 51;
   static final short aShort_250 = 46;
   static final short aShort_251 = 53;
   static final short aShort_252 = 57;
   static final short aShort_253 = 58;
   static final short aShort_254 = 59;
   static final short aShort_255 = 8;
   static final short aShort_256 = 1001;
   static final short aShort_257 = 1002;
   static final short aShort_258 = 6;
   static final short aShort_259 = 1003;
   static final short aShort_260 = 1006;
   static final short aShort_261 = 12;
   static final short aShort_262 = 18;
   static final short aShort_263 = 1004;
   static final short aShort_264 = 1010;
   static final short aShort_265 = 1011;
   static final short aShort_266 = 1012;


   Class25() throws Throwable {
      throw new Error();
   }

   static void method153(int var0) {
      CacheNodeArrayList var1 = Class4.aClass627_29;
      synchronized(Class4.aClass627_29) {
         Class4.aClass627_29.method6665((byte)5);
      }
   }

   static final void method154(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, byte var3) {
      var0.anInt_2469 = -104478841;
      var0.anInt_2416 = var2.intTypes[(var2.intTypeIndex -= -708028207) * -831324111] * 795082499;
      Class110_Sub1.method3149(var0, -1300593458);
      if(-1 == var0.anInt_2428 * -1001687885 && !var1.aBoolean_2054) {
         Class86.method1132(var0.cacheID * 1278853609, (byte)72);
      }

   }

   public static File loadResourceFile(String var0, short var1) {
      if(!Class223.cacheFileExists) {
         throw new RuntimeException("");
      } else {
         File var2 = (File)Class223.loadedFileMap.get(var0);
         if(var2 != null) {
            return var2;
         } else {
            File var3 = new File(Class223.aFile_3824, var0);
            RandomAccessFile var4 = null;

            try {
               File var5 = new File(var3.getParent());
               if(!var5.exists()) {
                  throw new RuntimeException("");
               } else {
                  var4 = new RandomAccessFile(var3, "rw");
                  int var6 = var4.read();
                  var4.seek(0L);
                  var4.write(var6);
                  var4.seek(0L);
                  var4.close();
                  Class223.loadedFileMap.put(var0, var3);
                  return var3;
               }
            } catch (Exception var8) {
               try {
                  if(var4 != null) {
                     var4.close();
                     var4 = null;
                  }
               } catch (Exception var7) {
                  ;
               }

               throw new RuntimeException();
            }
         }
      }
   }

   public static final int method156(int var0, int var1, int var2) {
      if(var0 == -1) {
         return 12345678;
      } else {
         var1 = (var0 & 127) * var1 >> 7;
         if(var1 < 2) {
            var1 = 2;
         } else if(var1 > 126) {
            var1 = 126;
         }

         return var1 + (var0 & '\uff80');
      }
   }

   static final void method157(RSInterfaceData var0, int var1) {
      FontRenderer.method1084(var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111], (byte)-10);
   }
}
