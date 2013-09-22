
public class ItemProfile implements Class622 {

   int anInt_8548;
   int itemID;
   int anInt_8550;
   int renderTarget;
   int amount;
   int anInt_8553;
   boolean isWorn;


   public long method6641() {
      long[] var1 = ByteArrayDataNode.aLongArray_6770;
      long var2 = -1L;
      var2 = var2 >>> 8 ^ var1[(int)((var2 ^ (long)(this.renderTarget * 66442787)) & 255L)];
      var2 = var2 >>> 8 ^ var1[(int)((var2 ^ (long)(1288580393 * this.itemID >> 8)) & 255L)];
      var2 = var2 >>> 8 ^ var1[(int)((var2 ^ (long)(this.itemID * 1288580393)) & 255L)];
      var2 = var2 >>> 8 ^ var1[(int)((var2 ^ (long)(1307509705 * this.amount >> 24)) & 255L)];
      var2 = var2 >>> 8 ^ var1[(int)((var2 ^ (long)(this.amount * 1307509705 >> 16)) & 255L)];
      var2 = var2 >>> 8 ^ var1[(int)((var2 ^ (long)(this.amount * 1307509705 >> 8)) & 255L)];
      var2 = var2 >>> 8 ^ var1[(int)((var2 ^ (long)(this.amount * 1307509705)) & 255L)];
      var2 = var2 >>> 8 ^ var1[(int)((var2 ^ (long)(this.anInt_8548 * 531119841)) & 255L)];
      var2 = var2 >>> 8 ^ var1[(int)((var2 ^ (long)(this.anInt_8550 * 625137077 >> 24)) & 255L)];
      var2 = var2 >>> 8 ^ var1[(int)((var2 ^ (long)(this.anInt_8550 * 625137077 >> 16)) & 255L)];
      var2 = var2 >>> 8 ^ var1[(int)((var2 ^ (long)(625137077 * this.anInt_8550 >> 8)) & 255L)];
      var2 = var2 >>> 8 ^ var1[(int)((var2 ^ (long)(this.anInt_8550 * 625137077)) & 255L)];
      var2 = var2 >>> 8 ^ var1[(int)((var2 ^ (long)(1167292819 * this.anInt_8553)) & 255L)];
      var2 = var2 >>> 8 ^ var1[(int)((var2 ^ (long)(this.isWorn?1:0)) & 255L)];
      return var2;
   }

   public boolean method6640(Class622 var1) {
      if(!(var1 instanceof ItemProfile)) {
         return false;
      } else {
         ItemProfile var2 = (ItemProfile)var1;
         return 66442787 * this.renderTarget != 66442787 * var2.renderTarget?false:(var2.itemID * 1288580393 != this.itemID * 1288580393?false:(this.amount * 1307509705 != 1307509705 * var2.amount?false:(var2.anInt_8548 * 531119841 != this.anInt_8548 * 531119841?false:(this.anInt_8550 * 625137077 != 625137077 * var2.anInt_8550?false:(this.anInt_8553 * 1167292819 != 1167292819 * var2.anInt_8553?false:this.isWorn == var2.isWorn)))));
      }
   }

   static final void method5530(RSInterfaceData var0, int var1) {
      String var2 = (String)var0.stringData[(var0.stringDataIndex -= -1828074049) * 863838783];
      Class240_Sub27 var3 = Class47_Sub1.method3496(Class326.aClass326_6290, client.gameConnectionHandler.aClass528_3433, 1917447504);
      var3.aClass240_Sub8_Sub1_7370.putByte(var2.length() + 1, 812917968);
      var3.aClass240_Sub8_Sub1_7370.putString(var2, (byte)-84);
      client.gameConnectionHandler.addPacket(var3, 37264613);
   }

   public static final void method5531(int var0) {
      client.aBoolean_553 = true;
   }

   static RSCharacter method5532(int var0, int var1, int var2, int var3) {
      Class638 var4 = client.aClass296_348.getWorldObjects().tiles[var0][var1][var2];
      if(null == var4) {
         return null;
      } else {
         RSCharacter var5 = null;
         int var6 = -1;

         for(Class629 var7 = var4.aClass629_10137; null != var7; var7 = var7.aClass629_10073) {
            PositionEntity var8 = var7.aClass563_Sub1_Sub4_10075;
            if(var8 instanceof RSCharacter) {
               RSCharacter var9 = (RSCharacter)var8;
               int var10 = (var9.method3257() - 1) * 256 + 252;
               GameCoord var11 = var9.method6203().gameCoord;
               int var12 = (int)var11.floatX - var10 >> 9;
               int var13 = (int)var11.floatZ - var10 >> 9;
               int var14 = (int)var11.floatX + var10 >> 9;
               int var15 = var10 + (int)var11.floatZ >> 9;
               if(var12 <= var1 && var13 <= var2 && var14 >= var1 && var15 >= var2) {
                  int var16 = (1 + var15 - var2) * (1 + var14 - var1);
                  if(var16 > var6) {
                     var5 = var9;
                     var6 = var16;
                  }
               }
            }
         }

         return var5;
      }
   }

   public static ParameterNode[] constructParameterNodes(int var0) {
      return new ParameterNode[]{ParameterNode.aClass424_8050, ParameterNode.aClass424_8060, ParameterNode.aClass424_8040, ParameterNode.aClass424_8049, ParameterNode.aClass424_8063, ParameterNode.aClass424_8067, ParameterNode.aClass424_8041, ParameterNode.aClass424_8057, ParameterNode.aClass424_8055, ParameterNode.aClass424_8047, ParameterNode.aClass424_8066, ParameterNode.aClass424_8062, ParameterNode.aClass424_8068, ParameterNode.aClass424_8072, ParameterNode.aClass424_8061, ParameterNode.aClass424_8039, ParameterNode.aClass424_8043, ParameterNode.aClass424_8070, ParameterNode.aClass424_8046, ParameterNode.aClass424_8064, ParameterNode.aClass424_8044, ParameterNode.aClass424_8048, ParameterNode.aClass424_8069, ParameterNode.aClass424_8058, ParameterNode.aClass424_8076, ParameterNode.aClass424_8073, ParameterNode.aClass424_8051, ParameterNode.aClass424_8053, ParameterNode.aClass424_8065, ParameterNode.aClass424_8071, ParameterNode.aClass424_8056, ParameterNode.aClass424_8042, ParameterNode.aClass424_8045, ParameterNode.aClass424_8074, ParameterNode.aClass424_8054, ParameterNode.aClass424_8059, ParameterNode.aClass424_8052};
   }
}
