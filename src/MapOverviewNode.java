
public class MapOverviewNode extends Class240_Sub22 {

   public int anInt_3512 = 0;
   public String identifier;
   public int anInt_3514;
   public int anInt_3515 = -396060160;
   public int mapArea;
   int anInt_3517 = 629135215;
   public int zoomPercent = -284829177;
   boolean aBoolean_3519 = true;
   public int anInt_3520 = 465603072;
   public String areaName;
   public int anInt_3522 = 0;
   NodeList aNodeList_3523;


   public boolean method2572(int var1, int var2, int[] var3, byte var4) {
      for(Class240_Sub10 var5 = (Class240_Sub10)this.aNodeList_3523.getBaseNode_2((byte)123); null != var5; var5 = (Class240_Sub10)this.aNodeList_3523.getNext(-1491301543)) {
         if(var5.method4590(var1, var2, 1440346030)) {
            var5.method4593(var1, var2, var3, 2042264128);
            return true;
         }
      }

      return false;
   }

   public boolean method2573(int var1, int var2, int[] var3, byte var4) {
      for(Class240_Sub10 var5 = (Class240_Sub10)this.aNodeList_3523.getBaseNode_2((byte)68); null != var5; var5 = (Class240_Sub10)this.aNodeList_3523.getNext(-643709489)) {
         if(var5.method4592(var1, var2, 720325013)) {
            var5.method4591(var1, var2, var3, (byte)15);
            return true;
         }
      }

      return false;
   }

   MapOverviewNode(int var1, String var2, String var3, int var4, int var5, boolean var6, int var7, int var8) {
      this.anInt_3514 = -2063184027 * var1;
      this.identifier = var2;
      this.areaName = var3;
      this.mapArea = var4 * -326247835;
      this.anInt_3517 = var5 * -629135215;
      this.aBoolean_3519 = var6;
      this.zoomPercent = 284829177 * var7;
      if(this.zoomPercent * -1998615479 == 255) {
         this.zoomPercent = 0;
      }

      Class564.method6221(var8, (byte)-14);
      this.aNodeList_3523 = new NodeList();
   }

   public boolean method2574(int var1, int var2, int var3, int[] var4, int var5) {
      for(Class240_Sub10 var6 = (Class240_Sub10)this.aNodeList_3523.getBaseNode_2((byte)90); var6 != null; var6 = (Class240_Sub10)this.aNodeList_3523.getNext(-1135396717)) {
         if(var6.method4594(var1, var2, var3, -1661956391)) {
            var6.method4593(var2, var3, var4, 2069065072);
            return true;
         }
      }

      return false;
   }

   void method2575(int var1) {
      this.anInt_3515 = -396060160;
      this.anInt_3512 = 0;
      this.anInt_3520 = 465603072;
      this.anInt_3522 = 0;

      for(Class240_Sub10 var2 = (Class240_Sub10)this.aNodeList_3523.getBaseNode_2((byte)75); var2 != null; var2 = (Class240_Sub10)this.aNodeList_3523.getNext(-1226674464)) {
         if(var2.anInt_6789 * 250894445 < 424964861 * this.anInt_3515) {
            this.anInt_3515 = -1431663055 * var2.anInt_6789;
         }

         if(-1271349531 * var2.anInt_6791 > this.anInt_3512 * 62427907) {
            this.anInt_3512 = var2.anInt_6791 * -1980150281;
         }

         if(-1453360791 * var2.anInt_6790 < 1212870597 * this.anInt_3520) {
            this.anInt_3520 = -211863211 * var2.anInt_6790;
         }

         if(var2.anInt_6792 * -295078855 > 525149733 * this.anInt_3522) {
            this.anInt_3522 = -1797183611 * var2.anInt_6792;
         }
      }

   }

   boolean method2576(int var1, int var2, byte var3) {
      for(Class240_Sub10 var4 = (Class240_Sub10)this.aNodeList_3523.getBaseNode_2((byte)2); var4 != null; var4 = (Class240_Sub10)this.aNodeList_3523.getNext(-896888407)) {
         if(var4.method4590(var1, var2, 1779931393)) {
            return true;
         }
      }

      return false;
   }
}
