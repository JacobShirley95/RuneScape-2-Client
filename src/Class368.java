import java.util.Iterator;

public class Class368 {

   public static final int anInt_6916 = 6;
   public static final int anInt_6917 = 5;
   public static final int anInt_6918 = 2;
   public static final int anInt_6919 = 4;
   public static final int anInt_6920 = 3;
   public static final int anInt_6921 = 1;
   public static FontUnpacker aFontUnpacker_6922;


   Class368() throws Throwable {
      throw new Error();
   }

   static final void method4680(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = var0.aClass68_9508.aStringArray_1299[var2];
   }

   public static void method4681(byte var0) {
      Class564.aShort_9605 = client.aShort_462;
      Class95.aShort_1897 = client.aShort_560;
      Class619.aShort_10018 = client.aShort_557;
      Class95.aShort_1898 = client.aShort_558;
      Class95.aBoolean_1896 = true;
      Class95.anInt_1899 = -465103365 * Class217.anInt_3752;
      if(-2124531271 * Class95.anInt_1891 != 0 && Class95.anInt_1895 * 77579819 != 0) {
         client.aShort_557 = 334;
         client.aShort_558 = 334;
         client.aShort_560 = client.aShort_462 = (short)(-1133284864 * Class95.anInt_1891 / (Class95.anInt_1895 * 77579819));
      }

   }

   static final void method4682(boolean var0, int var1) {
      client.anInt_340 = 0;
      client.anInt_337 = 0;
      client.anInt_339 += -1470667723;
      Class240_Sub17.method4662(-1625787921);
      Class528.method6012(var0, -1426075839);
      Class110_Sub1.method3148(1399449106);
      boolean var2 = false;

      int var3;
      int var4;
      for(var3 = 0; var3 < client.anInt_340 * 775658641; ++var3) {
         var4 = client.anIntArray_480[var3];
         Class240_Sub9 var5 = (Class240_Sub9)client.npcNodeList.getNode((long)var4);
         NPC var6 = (NPC)var5.anObject_6783;
         if(client.anInt_339 * 1585171997 != var6.anInt_4290 * 802042849) {
            if(Class18.optionsClosed && Class177.method2221(var4, 1046729210)) {
               Class602.method6502(-1194383738);
            }

            if(var6.npcComposite.method5601(2227919)) {
               Class338.method4194(var6, 600427485);
            }

            var6.method1151((NPCComposite)null, -850085380);
            var5.shiftNext();
            var2 = true;
         }
      }

      if(var2) {
         var3 = 1910301187 * client.anInt_334;
         client.anInt_334 = client.npcNodeList.size() * -471050069;
         var4 = 0;

         Class240_Sub9 var9;
         for(Iterator var7 = client.npcNodeList.iterator(); var7.hasNext(); client.aClass240_Sub9Array_271[var4++] = var9) {
            var9 = (Class240_Sub9)var7.next();
         }

         for(int var8 = client.anInt_334 * 1910301187; var8 < var3; ++var8) {
            client.aClass240_Sub9Array_271[var8] = null;
         }
      }

      if(1463379377 * client.gameConnectionHandler.anInt_3450 != client.gameConnectionHandler.serverDataNode.index * 964952859) {
         throw new RuntimeException(964952859 * client.gameConnectionHandler.serverDataNode.index + " " + 1463379377 * client.gameConnectionHandler.anInt_3450);
      } else {
         for(var3 = 0; var3 < 1636714459 * client.availableNPCS; ++var3) {
            if(client.npcNodeList.getNode((long)client.npcIndices[var3]) == null) {
               throw new RuntimeException(var3 + " " + 1636714459 * client.availableNPCS);
            }
         }

         if(0 != 1910301187 * client.anInt_334 - 1636714459 * client.availableNPCS) {
            throw new RuntimeException("" + (1910301187 * client.anInt_334 - 1636714459 * client.availableNPCS));
         } else {
            for(var3 = 0; var3 < 1910301187 * client.anInt_334; ++var3) {
               if(((RSCharacter)client.aClass240_Sub9Array_271[var3].anObject_6783).anInt_4290 * 802042849 != 1585171997 * client.anInt_339) {
                  throw new RuntimeException("" + ((RSCharacter)client.aClass240_Sub9Array_271[var3].anObject_6783).index * 50743311);
               }
            }

         }
      }
   }
}
