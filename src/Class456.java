import java.awt.event.ActionEvent;

public class Class456 {

   Class457 aClass457_8561;
   public int anInt_8562;
   public int anInt_8563;
   int anInt_8564;


   void method5542(ByteArrayDataNode var1, byte var2) {
      while(true) {
         int var3 = var1.readByte(-1026199373);
         if(var3 == 0) {
            return;
         }

         this.method5543(var1, var3, -455434588);
      }
   }

   void method5543(ByteArrayDataNode var1, int var2, int var3) {
      if(1 == var2) {
         this.anInt_8564 = var1.method4493(-157074556) * -1050591155;
      } else if(var2 == 2) {
         this.anInt_8563 = var1.readByte(-116048780) * 1407986877;
         this.anInt_8562 = var1.readByte(1736602203) * -115451259;
      }

   }

   public synchronized AbstractImageData method5544(int var1) {
      AbstractImageData var2 = (AbstractImageData)this.aClass457_8561.aClass627_8568.getObject((long)(this.anInt_8564 * 980154501));
      if(null != var2) {
         return var2;
      } else {
         var2 = ImageUtils.getImageData(this.aClass457_8561.aCacheUnpacker_8565, this.anInt_8564 * 980154501, 0);
         if(null != var2) {
            this.aClass457_8561.aClass627_8568.insert(var2, (long)(980154501 * this.anInt_8564));
         }

         return var2;
      }
   }

   public static void method5545(Object var0, int var1) {
      if(null != ClientSuper.anEventQueue_3934) {
         for(int var2 = 0; var2 < 50 && ClientSuper.anEventQueue_3934.peekEvent() != null; ++var2) {
            RSInterface.method1724(1L);
         }

         try {
            if(null != var0) {
               ClientSuper.anEventQueue_3934.postEvent(new ActionEvent(var0, 1001, "dummy"));
            }
         } catch (Exception var3) {
            ;
         }

      }
   }

   static void method5546(int var0, int var1, int var2, short var3) {
      Class240_Sub22_Sub5 var4 = Class65_Sub1_Sub2.method866(11, (long)var0);
      var4.method596((byte)89);
      var4.anInt_1175 = var1 * 134353971;
      var4.anInt_1165 = var2 * -771972147;
   }
}
