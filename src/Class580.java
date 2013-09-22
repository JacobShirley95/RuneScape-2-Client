
public class Class580 {

   public int anInt_9703;


   public Class580(int var1) {
      this.anInt_9703 = var1 * 852119785;
   }

   public static final int method6315(int var0, int var1, byte var2) {
      if(-2 == var0) {
         return 12345678;
      } else if(var0 == -1) {
         if(var1 < 2) {
            var1 = 2;
         } else if(var1 > 126) {
            var1 = 126;
         }

         return var1;
      } else {
         var1 = (var0 & 127) * var1 >> 7;
         if(var1 < 2) {
            var1 = 2;
         } else if(var1 > 126) {
            var1 = 126;
         }

         return (var0 & '\uff80') + var1;
      }
   }

   static final void method6316(RSInterfaceData var0, byte var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = -1023105689 * Class11.anInt_62;
   }

   static void method6317(Renderer var0, byte var1) {
      if(!Class18.aBoolean_172) {
         Class100.renderOptionsList(var0, (short)-24985);
      } else {
         Class174_Sub2.method7580(var0, -63424967);
      }

   }

   static Class240_Sub34 method6318(CacheDataUnpacker var0, int var1, int var2) {
      byte[] var3 = var0.method3566(var1, 1889062724);
      return null == var3?null:new Class240_Sub34(var3);
   }
}
