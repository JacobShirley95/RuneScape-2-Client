import java.util.LinkedList;

public class Class267 {

   static LinkedList aLinkedList_4640 = new LinkedList();
   public static Class178_Sub1 preferenceFileList;


   Class267() throws Throwable {
      throw new Error();
   }

   static final void method3525(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      Class240_Sub27 var3 = Class47_Sub1.method3496(Class326.aClass326_6221, client.gameConnectionHandler.aClass528_3433, 1917447504);
      var3.aClass240_Sub8_Sub1_7370.method4463(var2, -1190165748);
      client.gameConnectionHandler.addPacket(var3, 455734684);
   }

   static final void method3526(RSInterfaceData var0, byte var1) {
      var0.intTypeIndex -= -1416056414;
      int var2 = var0.intTypes[var0.intTypeIndex * -831324111];
      int var3 = var0.intTypes[var0.intTypeIndex * -831324111 + 1];
      if(0 == var2) {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 0;
      } else if(0 == var3) {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Integer.MAX_VALUE;
      } else {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = (int)Math.pow((double)var2, 1.0D / (double)var3);
      }

   }

   static final void method3527(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class593.method6424((char)var2, -1632722969)?1:0;
   }

   static final void method3528(ByteArrayDataNode_Sub1 var0, byte var1) {
      for(int var2 = 0; var2 < Class15.anInt_131 * 1796066387; ++var2) {
         var0.readShort(2130675515);
         int var3 = Class15.anIntArray_132[var2];
         Player var4 = client.aPlayerArray[var3];
         int var5 = var0.readByte(1678686568);
         if((var5 & 4) != 0) {
            var5 += var0.readByte(394898383) << 8;
         }

         if(0 != (var5 & 256)) {
            var5 += var0.readByte(64901473) << 16;
         }

         InputStream_Sub1.method1209(var0, var3, var4, var5, 623532221);
      }

   }
}
