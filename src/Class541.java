
public class Class541 {

   static int[] anIntArray_9467;
   static char[] aCharArray_9468;
   static char[] aCharArray_9469 = new char[64];
   public static int[] anIntArray_9470;
   static Class221 aClass221_9471;


   static {
      int var0;
      for(var0 = 0; var0 < 26; ++var0) {
         aCharArray_9469[var0] = (char)(65 + var0);
      }

      for(var0 = 26; var0 < 52; ++var0) {
         aCharArray_9469[var0] = (char)(97 + var0 - 26);
      }

      for(var0 = 52; var0 < 62; ++var0) {
         aCharArray_9469[var0] = (char)(48 + var0 - 52);
      }

      aCharArray_9469[62] = 43;
      aCharArray_9469[63] = 47;
      aCharArray_9468 = new char[64];

      for(var0 = 0; var0 < 26; ++var0) {
         aCharArray_9468[var0] = (char)(var0 + 65);
      }

      for(var0 = 26; var0 < 52; ++var0) {
         aCharArray_9468[var0] = (char)(var0 + 97 - 26);
      }

      for(var0 = 52; var0 < 62; ++var0) {
         aCharArray_9468[var0] = (char)(var0 + 48 - 52);
      }

      aCharArray_9468[62] = 42;
      aCharArray_9468[63] = 45;
      anIntArray_9467 = new int[128];

      for(var0 = 0; var0 < anIntArray_9467.length; ++var0) {
         anIntArray_9467[var0] = -1;
      }

      for(var0 = 65; var0 <= 90; ++var0) {
         anIntArray_9467[var0] = var0 - 65;
      }

      for(var0 = 97; var0 <= 122; ++var0) {
         anIntArray_9467[var0] = var0 - 97 + 26;
      }

      for(var0 = 48; var0 <= 57; ++var0) {
         anIntArray_9467[var0] = var0 - 48 + 52;
      }

      int[] var2 = anIntArray_9467;
      anIntArray_9467[43] = 62;
      var2[42] = 62;
      int[] var1 = anIntArray_9467;
      anIntArray_9467[47] = 63;
      var1[45] = 63;
   }

   Class541() throws Throwable {
      throw new Error();
   }

   public static void method6085(int var0, byte var1) {
      if(Class620.method6632(631970412)) {
         if(var0 != 1674910981 * Class11.anInt_105) {
            Class11.aLong_99 = 3016473431628976607L;
         }

         Class11.anInt_105 = var0 * -822335539;
         client.lobbyConnectionHandler.method2545((byte)125);
         Class418.method5190(18, (byte)-46);
      }
   }
}
