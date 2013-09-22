
public abstract class AbstractMouseNode extends NodeListNode {

   static final int anInt_7578 = 3;
   public static final int anInt_7579 = 0;
   static final int anInt_7580 = 1;
   static final int anInt_7581 = 4;
   public static final int anInt_7582 = 2;
   public static final int anInt_7583 = -1;
   static final int anInt_7584 = 5;
   public static final int anInt_7585 = 6;


   public abstract int getClickType(int var1);

   public abstract void addThisNode(short var1);

   public abstract long method4940(byte var1);

   public abstract int getMouseY(int var1);

   public abstract int getMouseX(byte var1);

   public abstract int getMouseInfo();

   public static final void method4944(String var0, int var1) {
      if(var0 != null) {
         String var2 = Class606.method6518(var0, Class123.aClass436_2275, -1215862968);
         if(var2 != null) {
            for(int var3 = 0; var3 < -275736435 * client.ignoreListCount; ++var3) {
               IgnoredPlayer var4 = client.ignoreList[var3];
               String var5 = var4.aString_111;
               String var6 = Class606.method6518(var5, Class123.aClass436_2275, -1215862968);
               if(Class194.method2516(var0, var2, var5, var6, -2029128999)) {
                  client.ignoreListCount -= 242149957;

                  for(int var7 = var3; var7 < client.ignoreListCount * -275736435; ++var7) {
                     client.ignoreList[var7] = client.ignoreList[1 + var7];
                  }

                  client.anInt_512 = client.anInt_413 * -490132939;
                  ConnectionHandler var9 = Class32.method230(1714268102);
                  Class240_Sub27 var8 = Class47_Sub1.method3496(Class326.aClass326_6270, var9.aClass528_3433, 1917447504);
                  var8.aClass240_Sub8_Sub1_7370.putByte(Class258.method3383(var0, -978402541), -758654003);
                  var8.aClass240_Sub8_Sub1_7370.putString(var0, (byte)-95);
                  var9.addPacket(var8, 809791780);
                  break;
               }
            }

         }
      }
   }
}
