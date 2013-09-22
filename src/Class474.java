
public class Class474 {

   Class445 aClass445_8720;
   public int anInt_8721;
   public int anInt_8722;
   public boolean aBoolean_8723 = false;
   public static int anInt_8724;
   static int anInt_8725;
   static boolean aBoolean_8726;


   void method5665(ByteArrayDataNode var1, int var2) {
      while(true) {
         int var3 = var1.readByte(1363262732);
         if(var3 == 0) {
            return;
         }

         this.method5666(var1, var3, 1414733383);
      }
   }

   void method5666(ByteArrayDataNode var1, int var2, int var3) {
      if(1 == var2) {
         this.anInt_8721 = var1.method4493(-157074556) * -253765595;
      } else if(var2 == 2) {
         this.anInt_8722 = var1.method4479(738776218) * 1522323979;
      } else if(var2 == 3) {
         this.aBoolean_8723 = true;
      } else if(var2 == 4) {
         this.anInt_8721 = 253765595;
      }

   }

   public Sprite method5667(Renderer var1, int var2, boolean var3, byte var4) {
      long var5 = (long)(1587577773 * this.anInt_8721 | var2 << 16 | (var3?262144:0) | var1.rendererID * -1555911463 << 19);
      Sprite var7 = (Sprite)this.aClass445_8720.aClass627_8518.getObject(var5);
      if(var7 != null) {
         return var7;
      } else if(!this.aClass445_8720.aCacheUnpacker_8520.hasData(1587577773 * this.anInt_8721, 2079825136)) {
         return null;
      } else {
         AbstractImageData var8 = ImageUtils.getImageData(this.aClass445_8720.aCacheUnpacker_8520, 1587577773 * this.anInt_8721, 0);
         if(var8 != null) {
            var8.method1377();
            if(var3) {
               var8.method1381();
            }

            for(int var9 = 0; var9 < var2; ++var9) {
               var8.method1374();
            }
         }

         var7 = var1.loadSprite(var8, true);
         if(null != var7) {
            this.aClass445_8720.aClass627_8518.insert(var7, var5);
         }

         return var7;
      }
   }

   public boolean method5668(int var1) {
      return this.aClass445_8720.aCacheUnpacker_8520.hasData(this.anInt_8721 * 1587577773, -1402800812);
   }

   static final void method5669(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, int var3) {
      var0.aBoolean = var2.intTypes[(var2.intTypeIndex -= -708028207) * -831324111] == 1;
      Class110_Sub1.method3149(var0, 156107177);
   }
}
