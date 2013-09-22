
public class Class104_Sub8 extends CharTask {

   final int anInt_4436;
   final int anInt_4437;
   Class123 aClass123_4438;


   public void execute() {
      Class87.method1142(this.aClass123_4438, this.anInt_4436 * 275136581, (byte)118);
   }

   boolean method1344(int var1) {
      if(null == this.aClass123_4438) {
         this.aClass123_4438 = new Class123(GraphicsDataHolder.aCacheUnpacker_9212, this.anInt_4437 * -900137353);
      }

      return this.aClass123_4438.method1565(1870230320);
   }

   Class104_Sub8(ByteArrayDataNode var1) {
      super(var1);
      this.anInt_4437 = var1.readShort(2120309484) * -441173177;
      this.anInt_4436 = var1.readByte(1911572738) * 1904136845;
   }

   public static final void method3387(Class240_Sub16 var0, boolean var1, boolean var2, byte var3) {
      int var4 = 1320796941 * var0.widgetID;
      int var5 = (int)(4058728944299054175L * var0.id);
      var0.shiftNext();
      if(var1) {
         Class188.method2308(var4, 1148469640);
      }

      Class613.method6581(var4, -782198371);
      RSInterface var6 = RSServerQueue.getInterface(var5, (byte)105);
      if(var6 != null) {
         Class110_Sub1.method3149(var6, -1106521723);
      }

      Class129.method1666((byte)3);
      if(!var2 && client.anInt_468 * 1854782309 != -1) {
         Class462.method5591(1854782309 * client.anInt_468, 1, 1685123114);
      }

      NodeListIterator var7 = new NodeListIterator(client.widgets);

      for(Class240_Sub16 var8 = (Class240_Sub16)var7.getFirst(); null != var8; var8 = (Class240_Sub16)var7.next()) {
         if(!var8.hasNext()) {
            var8 = (Class240_Sub16)var7.getFirst();
            if(var8 == null) {
               break;
            }
         }

         if(3 == 270505159 * var8.anInt_6897) {
            int var9 = (int)(var8.id * 4058728944299054175L);
            if(var9 >>> 16 == var4) {
               method3387(var8, true, var2, (byte)-1);
            }
         }
      }

   }

   static final void method3388(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var0.animeTarget.interfaceOpen * 1732818823;
   }
}
