import java.nio.ByteBuffer;
import java.util.Arrays;

public class Class89 {

   public String aString_1800;
   public String aString_1801;
   public String aString_1802;
   public Class111[] aClass111Array_1803;
   public Class111[] aClass111Array_1804;
   static int[] anIntArray_1805;


   void method1182(Class129 var1, int var2) {
      this.aString_1802 = var1.method1664(1989731402);
      this.aString_1800 = var1.method1664(1955197949);
      this.aString_1801 = var1.method1664(1902433141);
      int var3 = var1.method1663(-1611443095);
      int var4 = var1.method1663(-1611443095);
      this.aClass111Array_1803 = var3 == 0?null:new Class111[var3];
      this.aClass111Array_1804 = 0 == var4?null:new Class111[var4];

      int var5;
      for(var5 = 0; var5 < var3; ++var5) {
         this.aClass111Array_1803[var5] = new Class111();
         this.aClass111Array_1803[var5].method1417(var1, -1437117717);
      }

      for(var5 = 0; var5 < var4; ++var5) {
         this.aClass111Array_1804[var5] = new Class111();
         this.aClass111Array_1804[var5].method1417(var1, -1997458384);
      }

   }

   public static void method1183(CacheDataUnpacker var0, byte var1) {
      Class397.aCacheUnpacker_7587 = var0;
   }

   public static Object method1184(byte[] var0, boolean var1, short var2) {
      if(null == var0) {
         return null;
      } else if(var0.length > 136) {
         ByteBuffer var3 = ByteBuffer.allocateDirect(var0.length);
         var3.position(0);
         var3.put(var0);
         return var3;
      } else {
         return var1?Arrays.copyOf(var0, var0.length):var0;
      }
   }

   static void method1185(int var0, int var1) {}

   static final void method1186(RSInterfaceData var0, int var1) {
      Class82.method1088(true, -1235493996);
   }

   static void method1187(byte[] var0, int var1) {
      ByteArrayDataNode var2 = new ByteArrayDataNode(var0);

      while(true) {
         int var3 = var2.readByte(191487488);
         if(var3 == 0) {
            return;
         }

         if(var3 == 1) {
            Class588.anInt_9767 = var2.readShort(1426726619) * 2014507029;
         }
      }
   }
}
