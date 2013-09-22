
public class Class430_Sub1 extends Class430 {

   public final int anInt_4024;


   public Class408 method5142(int var1) {
      return Class408.aClass408_7749;
   }

   Class430_Sub1(int var1, Class419 var2, Class412 var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5);
      this.anInt_4024 = var6 * 226356769;
   }

   static final void method3046(int var0) {
      for(Class240_Sub22_Sub4 var1 = (Class240_Sub22_Sub4)client.aNodeList_570.getBaseNode_2((byte)105); null != var1; var1 = (Class240_Sub22_Sub4)client.aNodeList_570.getNext(-1260219002)) {
         Class563_Sub1_Sub4_Sub3 var2 = var1.aClass563_Sub1_Sub4_Sub3_1155;
         if(client.timer * -1025618511 > -299960183 * var2.anInt_3209) {
            var1.shiftNext();
            var2.method2318(137354043);
         } else if(client.timer * -1025618511 >= var2.anInt_3208 * 1386461615) {
            var2.method2319((byte)123);
            GameCoord var5;
            if(-784398287 * var2.anInt_3224 > 0) {
               if(1 == 415041591 * client.anInt_356) {
                  RSCharacter var3 = Class95.aClass100Array_1894[-784398287 * var2.anInt_3224 - 1].getTarget((byte)119);
                  if(null != var3) {
                     GameCoord var4 = var3.method6203().gameCoord;
                     if((int)var4.floatX >= 0 && (int)var4.floatX < client.aClass296_348.getMaxX((byte)-72) * 512 && (int)var4.floatZ >= 0 && (int)var4.floatZ < client.aClass296_348.getMaxY(-1760826664) * 512) {
                        var2.method2332((int)var4.floatX, (int)var4.floatZ, CompProfile.getHeight((int)var4.floatX, (int)var4.floatZ, var3.plane) - var2.anInt_3207 * -1783352715, client.timer * -1025618511, -1843015128);
                     }
                  }
               } else {
                  Class240_Sub9 var6 = (Class240_Sub9)client.npcNodeList.getNode((long)(var2.anInt_3224 * -784398287 - 1));
                  if(var6 != null) {
                     NPC var8 = (NPC)var6.anObject_6783;
                     var5 = var8.method6203().gameCoord;
                     if((int)var5.floatX >= 0 && (int)var5.floatX < client.aClass296_348.getMaxX((byte)-29) * 512 && (int)var5.floatZ >= 0 && (int)var5.floatZ < client.aClass296_348.getMaxY(819708174) * 512) {
                        var2.method2332((int)var5.floatX, (int)var5.floatZ, CompProfile.getHeight((int)var5.floatX, (int)var5.floatZ, var2.plane) - -1783352715 * var2.anInt_3207, -1025618511 * client.timer, -826569626);
                     }
                  }
               }
            }

            if(var2.anInt_3224 * -784398287 < 0) {
               int var9 = -(-784398287 * var2.anInt_3224) - 1;
               Player var7;
               if(client.anInt_438 * -719726693 == var9) {
                  var7 = Class521.myPlayer;
               } else {
                  var7 = client.aPlayerArray[var9];
               }

               if(var7 != null) {
                  var5 = var7.method6203().gameCoord;
                  if((int)var5.floatX >= 0 && (int)var5.floatX < client.aClass296_348.getMaxX((byte)-64) * 512 && (int)var5.floatZ >= 0 && (int)var5.floatZ < client.aClass296_348.getMaxY(1277388439) * 512) {
                     var2.method2332((int)var5.floatX, (int)var5.floatZ, CompProfile.getHeight((int)var5.floatX, (int)var5.floatZ, var2.plane) - var2.anInt_3207 * -1783352715, client.timer * -1025618511, 1847689411);
                  }
               }
            }

            var2.method2326(1451701819 * client.anInt_384, (byte)9);
            client.aClass296_348.getWorldObjects().method3455(var2, true, 2091651687);
         }
      }

   }
}
