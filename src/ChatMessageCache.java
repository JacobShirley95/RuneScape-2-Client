
public class ChatMessageCache {

   ChatMessage[] chatMessages = new ChatMessage[100];
   int anInt_2375;
   static final int anInt_2376 = 100;
   static int crossOffset;


   ChatMessage method1645(int var1, int var2, String var3, String var4, String var5, String var6, String var7, int var8, int var9) {
      ChatMessage var10 = this.chatMessages[99];

      for(int var11 = this.anInt_2375 * -456168597; var11 > 0; --var11) {
         if(100 != var11) {
            this.chatMessages[var11] = this.chatMessages[var11 - 1];
         }
      }

      if(null == var10) {
         var10 = new ChatMessage(var1, var2, var3, var4, var5, var7, var8, var6);
      } else {
         var10.shiftNext();
         var10.method4855(var1, var2, var3, var4, var5, var7, var8, var6, (byte)0);
      }

      this.chatMessages[0] = var10;
      if(-456168597 * this.anInt_2375 < 100) {
         this.anInt_2375 += -1309120189;
      }

      return var10;
   }

   int method1646(byte var1) {
      return this.anInt_2375 * -456168597;
   }

   ChatMessage method1647(int var1, int var2) {
      return var1 >= 0 && var1 < -456168597 * this.anInt_2375?this.chatMessages[var1]:null;
   }

   static final void method1648(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      client.method183(var3, var4, var0, -1707614282);
   }

   static final void method1649(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, byte var3) {
      var0.aString_2514 = (String)var2.stringData[(var2.stringDataIndex -= -1828074049) * 863838783];
   }
}
