
public class ChatMessage extends NodeListNode {

   public int anInt_7395;
   public int timeStamp;
   public String aString_7397;
   public int anInt_7398;
   public int anInt_7399 = Class83.method1090(-831324111) * 1240656163;
   public String aString_7400;
   public String aString_7401;
   public String aString_7402;
   public int anInt_7403;
   public String aString_7404;


   void method4855(int var1, int var2, String var3, String var4, String var5, String var6, int var7, String var8, byte var9) {
      this.anInt_7399 = Class83.method1090(-831324111) * 1240656163;
      this.timeStamp = -1488197767 * client.timer;
      this.anInt_7395 = var1 * 1180947889;
      this.anInt_7398 = var2 * 1937524327;
      this.aString_7402 = var3;
      this.aString_7400 = var4;
      this.aString_7401 = var5;
      this.aString_7397 = var6;
      this.anInt_7403 = -1096391815 * var7;
      this.aString_7404 = var8;
   }

   ChatMessage(int var1, int var2, String var3, String var4, String var5, String var6, int var7, String var8) {
      this.timeStamp = client.timer * -1488197767;
      this.anInt_7395 = 1180947889 * var1;
      this.anInt_7398 = var2 * 1937524327;
      this.aString_7402 = var3;
      this.aString_7400 = var4;
      this.aString_7401 = var5;
      this.aString_7397 = var6;
      this.anInt_7403 = -1096391815 * var7;
      this.aString_7404 = var8;
   }

   static char method4856(char var0, int var1) {
      return (char)(198 == var0?'E':(var0 == 230?'e':(var0 == 223?'s':(338 == var0?'E':(339 == var0?'e':'\u0000')))));
   }

   static final void method4857(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, int var3) {
      int var4 = var2.intTypes[(var2.intTypeIndex -= -708028207) * -831324111];
      if(1900159845 * var0.imageID != var4) {
         var0.imageID = var4 * 2138527341;
         Class110_Sub1.method3149(var0, -154427085);
      }

      if(-1001687885 * var0.anInt_2428 == -1 && !var1.aBoolean_2054) {
         Class556.method6151(1278853609 * var0.cacheID, -831324111);
      }

   }
}
