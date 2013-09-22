
public class Class240_Sub22_Sub2 extends Class240_Sub22 {

   NodeArrayList aNodeArrayList_818;


   void method234(ByteArrayDataNode var1, int var2, byte var3) {
      if(249 == var2) {
         int var4 = var1.readByte(665173275);
         int var5;
         if(null == this.aNodeArrayList_818) {
            var5 = Class105.method1359(var4, (byte)126);
            this.aNodeArrayList_818 = new NodeArrayList(var5);
         }

         for(var5 = 0; var5 < var4; ++var5) {
            boolean var6 = var1.readByte(-4603430) == 1;
            int var7 = var1.method4479(738776218);
            Object var8;
            if(var6) {
               var8 = new Class240_Sub9(var1.method4485(-441528261));
            } else {
               var8 = new IndexNode(var1.method4480(1260717178));
            }

            this.aNodeArrayList_818.insert((NodeListNode)var8, (long)var7);
         }
      }

   }

   void method235(ByteArrayDataNode var1, int var2) {
      while(true) {
         int var3 = var1.readByte(2036535037);
         if(var3 == 0) {
            return;
         }

         this.method234(var1, var3, (byte)-23);
      }
   }

   public String method236(int var1, String var2, int var3) {
      if(null == this.aNodeArrayList_818) {
         return var2;
      } else {
         Class240_Sub9 var4 = (Class240_Sub9)this.aNodeArrayList_818.getNode((long)var1);
         return null == var4?var2:(String)var4.anObject_6783;
      }
   }

   public int method237(int var1, int var2, int var3) {
      if(null == this.aNodeArrayList_818) {
         return var2;
      } else {
         IndexNode var4 = (IndexNode)this.aNodeArrayList_818.getNode((long)var1);
         return var4 == null?var2:var4.cacheID * 523939595;
      }
   }
}
