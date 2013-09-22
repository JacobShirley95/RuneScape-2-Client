
public class Class240_Sub17 extends NodeListNode {

   public int anInt_6901;
   public int anInt_6902;
   public RSInterface aClass132_6903;
   public int anInt_6904;
   public int anInt_6905;
   public int anInt_6906;
   public Object[] anObjectArray_6907;
   public boolean aBoolean_6908;
   public RSInterface aClass132_6909;
   public String aString_6910;
   int anInt_6911;


   static final void method4662(int var0) {
      ByteArrayDataNode_Sub1 var1 = client.gameConnectionHandler.serverDataNode;
      var1.method294((byte)25);
      int var2 = var1.method291(8, 1832157798);
      int var3;
      if(var2 < 1636714459 * client.availableNPCS) {
         for(var3 = var2; var3 < client.availableNPCS * 1636714459; ++var3) {
            client.anIntArray_480[(client.anInt_340 += 246654065) * 775658641 - 1] = client.npcIndices[var3];
         }
      }

      if(var2 > 1636714459 * client.availableNPCS) {
         throw new RuntimeException();
      } else {
         client.availableNPCS = 0;

         for(var3 = 0; var3 < var2; ++var3) {
            int var4 = client.npcIndices[var3];
            NPC var5 = (NPC)((Class240_Sub9)client.npcNodeList.getNode((long)var4)).anObject_6783;
            int var6 = var1.method291(1, 1832157798);
            if(var6 == 0) {
               client.npcIndices[(client.availableNPCS += 451173459) * 1636714459 - 1] = var4;
               var5.anInt_4290 = client.anInt_339 * -1468030531;
            } else {
               int var7 = var1.method291(2, 1832157798);
               if(0 == var7) {
                  client.npcIndices[(client.availableNPCS += 451173459) * 1636714459 - 1] = var4;
                  var5.anInt_4290 = client.anInt_339 * -1468030531;
                  client.anIntArray_540[(client.anInt_337 += -1148561355) * -554157539 - 1] = var4;
               } else {
                  Class536 var8;
                  if(1 == var7) {
                     client.npcIndices[(client.availableNPCS += 451173459) * 1636714459 - 1] = var4;
                     var5.anInt_4290 = -1468030531 * client.anInt_339;
                     var8 = (Class536)Class559.method6185(Class276.method3610(1842186858), var1.method291(3, 1832157798), (byte)-115);
                     var5.method1156(var8, Class539.aClass539_9455.aByte_9460, 2136865618);
                     int var9 = var1.method291(1, 1832157798);
                     if(1 == var9) {
                        client.anIntArray_540[(client.anInt_337 += -1148561355) * -554157539 - 1] = var4;
                     }
                  } else if(var7 == 2) {
                     client.npcIndices[(client.availableNPCS += 451173459) * 1636714459 - 1] = var4;
                     var5.anInt_4290 = -1468030531 * client.anInt_339;
                     if(var1.method291(1, 1832157798) == 1) {
                        var8 = (Class536)Class559.method6185(Class276.method3610(1515714347), var1.method291(3, 1832157798), (byte)-73);
                        var5.method1156(var8, Class539.aClass539_9458.aByte_9460, 1947495514);
                        Class536 var10 = (Class536)Class559.method6185(Class276.method3610(1925431485), var1.method291(3, 1832157798), (byte)-42);
                        var5.method1156(var10, Class539.aClass539_9458.aByte_9460, 2017917369);
                     } else {
                        var8 = (Class536)Class559.method6185(Class276.method3610(1930057026), var1.method291(3, 1832157798), (byte)38);
                        var5.method1156(var8, Class539.aClass539_9456.aByte_9460, 2136685155);
                     }

                     int var11 = var1.method291(1, 1832157798);
                     if(1 == var11) {
                        client.anIntArray_540[(client.anInt_337 += -1148561355) * -554157539 - 1] = var4;
                     }
                  } else if(3 == var7) {
                     client.anIntArray_480[(client.anInt_340 += 246654065) * 775658641 - 1] = var4;
                  }
               }
            }
         }

      }
   }
}
