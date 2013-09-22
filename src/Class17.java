import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;

public class Class17 {

   static NodeList requestedItems = new NodeList();
   static Renderer aRenderer_139;
   static FontRenderer aTextRenderer_140;


   Class17() throws Throwable {
      throw new Error();
   }

   static void method91(int var0) {
      if(Class194.anInt_3364 * 561034439 < 102) {
         Class194.anInt_3364 += 927124938;
      }

      int var1;
      if(-985543139 * Class194.anInt_3356 != -1 && -5403713747482066761L * Class194.timeStamp < Class373.getCurrentTime((short)16917)) {
         for(var1 = Class194.anInt_3356 * -985543139; var1 < Class505.aStringArray_9123.length; ++var1) {
            if(Class505.aStringArray_9123[var1].startsWith("pause")) {
               int var2 = 5;

               try {
                  var2 = Integer.parseInt(Class505.aStringArray_9123[var1].substring(6));
               } catch (Exception var9) {
                  ;
               }

               Class19.addStringToConsole("Pausing for " + var2 + " seconds...", -282738471);
               Class194.anInt_3356 = -2050923467 * (1 + var1);
               Class194.timeStamp = (Class373.getCurrentTime((short)5011) + (long)(1000 * var2)) * 6699129404184534279L;
               return;
            }

            Class194.aString_3361 = Class505.aStringArray_9123[var1];
            Class604.method6514(false, (byte)-65);
         }

         Class194.anInt_3356 = 2050923467;
      }

      if(0 != -236083147 * client.scrollClickCount) {
         Class194.anInt_3360 -= client.scrollClickCount * -2073038873;
         if(-1724145265 * Class194.anInt_3360 >= 499415203 * Class194.anInt_3370) {
            Class194.anInt_3360 = -1687714387 * Class194.anInt_3370 - -1588830865;
         }

         if(-1724145265 * Class194.anInt_3360 < 0) {
            Class194.anInt_3360 = 0;
         }

         client.scrollClickCount = 0;
      }

      for(var1 = 0; var1 < 232284759 * client.anInt_483; ++var1) {
         Class233 var11 = client.aClass233Array_360[var1];
         int var3 = var11.method2971(-16711936);
         char var4 = var11.method2984(-443198952);
         int var5 = var11.method2973(-1291726595);
         if(84 == var3) {
            Class604.method6514(false, (byte)-53);
         }

         if(80 == var3) {
            Class604.method6514(true, (byte)-110);
         } else if(var3 == 66 && 0 != (var5 & 4)) {
            if(null != Class1024_Sub3.aClipboard_10983) {
               String var12 = "";

               for(int var13 = Class194.consoleStrings.length - 1; var13 >= 0; --var13) {
                  if(Class194.consoleStrings[var13] != null && Class194.consoleStrings[var13].length() > 0) {
                     var12 = var12 + Class194.consoleStrings[var13] + '\n';
                  }
               }

               Class1024_Sub3.aClipboard_10983.setContents(new StringSelection(var12), (ClipboardOwner)null);
            }
         } else if(67 == var3 && (var5 & 4) != 0) {
            if(Class1024_Sub3.aClipboard_10983 != null) {
               try {
                  Transferable var6 = Class1024_Sub3.aClipboard_10983.getContents((Object)null);
                  if(null != var6) {
                     String var7 = (String)var6.getTransferData(DataFlavor.stringFlavor);
                     if(var7 != null) {
                        String[] var8 = Class136.method1799(var7, '\n', (byte)36);
                        Class503.method5854(var8, (byte)-6);
                     }
                  }
               } catch (Exception var10) {
                  ;
               }
            }
         } else if(var3 == 85 && Class194.anInt_3363 * 202635779 > 0) {
            Class194.aString_3361 = Class194.aString_3361.substring(0, 202635779 * Class194.anInt_3363 - 1) + Class194.aString_3361.substring(Class194.anInt_3363 * 202635779);
            Class194.anInt_3363 -= 1782055083;
         } else if(var3 == 101 && Class194.anInt_3363 * 202635779 < Class194.aString_3361.length()) {
            Class194.aString_3361 = Class194.aString_3361.substring(0, Class194.anInt_3363 * 202635779) + Class194.aString_3361.substring(Class194.anInt_3363 * 202635779 + 1);
         } else if(96 == var3 && 202635779 * Class194.anInt_3363 > 0) {
            Class194.anInt_3363 -= 1782055083;
         } else if(97 == var3 && Class194.anInt_3363 * 202635779 < Class194.aString_3361.length()) {
            Class194.anInt_3363 += 1782055083;
         } else if(var3 == 102) {
            Class194.anInt_3363 = 0;
         } else if(var3 == 103) {
            Class194.anInt_3363 = Class194.aString_3361.length() * 1782055083;
         } else if(var3 == 104 && Class194.anInt_3362 * -815504715 < Class194.consoleStrings.length) {
            Class194.anInt_3362 += 956890013;
            Class476.method5682(-1854072259);
            Class194.anInt_3363 = Class194.aString_3361.length() * 1782055083;
         } else if(var3 == 105 && Class194.anInt_3362 * -815504715 > 0) {
            Class194.anInt_3362 -= 956890013;
            Class476.method5682(-1854072259);
            Class194.anInt_3363 = Class194.aString_3361.length() * 1782055083;
         } else if(Class111.method1423(var4, -371552592) || "\\/.:, _-+[]~@".indexOf(var4) != -1) {
            Class194.aString_3361 = Class194.aString_3361.substring(0, 202635779 * Class194.anInt_3363) + client.aClass233Array_360[var1].method2984(359163928) + Class194.aString_3361.substring(Class194.anInt_3363 * 202635779);
            Class194.anInt_3363 += 1782055083;
         }
      }

      client.anInt_483 = 0;
      client.anInt_321 = 0;
      Class104_Sub3.method3180(2105623373);
   }

   static void method92(Class240_Sub2 var0, byte var1) {
      if(!Class293.aLinkedList_5920.contains(var0)) {
         Class293.aLinkedList_5920.add(var0);
      }

   }

   static final void method93(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      int var3 = client.aClass301Array_286[var2].method3816(1193762257);
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 0 == var3?1:0;
   }
}
