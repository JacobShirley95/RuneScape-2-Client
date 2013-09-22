import java.util.Random;

public class Class449 {

   final CacheDataUnpacker aCacheUnpacker_8538;
   final Class447[] aClass447Array_8539;
   final int anInt_8540;
   static final int anInt_8541 = 0;


   public Class449(GamePack var1, LanguagePack var2, CacheDataUnpacker var3) {
      this.aCacheUnpacker_8538 = var3;
      ByteArrayDataNode var4 = new ByteArrayDataNode(this.aCacheUnpacker_8538.getDataBytes(0, 0, -2118236452));
      int var5 = var4.data != null && var4.data.length >= 1?var4.readByte(850265461):-1;
      if(var5 < 4) {
         this.aClass447Array_8539 = new Class447[0];
         this.anInt_8540 = 520062393;
      } else {
         int var6 = var4.readByte(1592929719);
         Class408[] var7 = Class405.method5010(1761954963);
         boolean var8 = true;
         int var9;
         int var10;
         if(var7.length != var6) {
            var8 = false;
         } else {
            for(var9 = 0; var9 < var7.length; ++var9) {
               var10 = var4.readByte(2101118129);
               if(var10 != var7[var9].anInt_7752 * -215852867) {
                  var8 = false;
                  break;
               }
            }
         }

         if(var8) {
            var9 = var4.readByte(349048540);
            var10 = var4.readByte(-1005850907);
            int var11;
            int var12;
            if(var5 > 2) {
               this.anInt_8540 = var4.method4478((byte)1) * -520062393;
               var11 = var4.method4479(738776218);
               var12 = var4.readShort(109827024);
            } else {
               this.anInt_8540 = 520062393;
               var11 = 0;
               var12 = 0;
            }

            this.aClass447Array_8539 = new Class447[var10 + 1];

            int var13;
            for(var13 = 0; var13 < var9; ++var13) {
               int var14 = var4.readByte(-472208530);
               boolean var15 = var4.readByte(1623430617) == 1;
               int var16 = var4.readShort(623130069);
               Class446[] var17;
               int var19;
               int var18;
               int var21;
               int var20;
               if(-1829040265 * this.anInt_8540 == -1) {
                  var17 = new Class446[var16];

                  for(var18 = 0; var18 < var16; ++var18) {
                     var19 = var4.readShort(1798569766);
                     var20 = var4.method4479(738776218);
                     var21 = var4.readShort(-1063033272);
                     var17[var18] = new Class446(var19, var20, var21);
                  }

                  this.aClass447Array_8539[var14] = new Class447(var15, var17);
               } else {
                  var17 = new Class446[1 + var16];
                  var17[0] = new Class446(this.anInt_8540 * -1829040265, var11, var12);

                  for(var18 = 0; var18 < var16; ++var18) {
                     var19 = var4.readShort(102326317);
                     var20 = var4.method4479(738776218);
                     var21 = var4.readShort(2075987932);
                     var17[var18 + 1] = new Class446(var19, var20, var21);
                  }
               }

               this.aClass447Array_8539[var14] = new Class447(var15, var17);
            }

            for(var13 = 0; var13 < var10 + 1; ++var13) {
               if(this.aClass447Array_8539[var13] == null) {
                  this.aClass447Array_8539[var13] = this.method5513(var11, var12, (byte)-106);
               }
            }
         } else {
            this.aClass447Array_8539 = new Class447[0];
            this.anInt_8540 = 520062393;
         }
      }

   }

   Class447 method5513(int var1, int var2, byte var3) {
      if(-1 == -1829040265 * this.anInt_8540) {
         return new Class447(false, new Class446[0]);
      } else {
         Class446 var4 = new Class446(-1829040265 * this.anInt_8540, var1, var2);
         return new Class447(false, new Class446[]{var4});
      }
   }

   public Class440 method5514(int var1, int var2) {
      byte[] var3 = this.aCacheUnpacker_8538.getDataBytes(var1, 0, -619797722);
      Class440 var4 = new Class440();
      var4.method5457(new ByteArrayDataNode(var3), 1788503189);
      return var4;
   }

   public Class446[] method5515(int var1, int var2) {
      if(var1 >= 0 && var1 < this.aClass447Array_8539.length) {
         Class447 var3 = this.aClass447Array_8539[var1];
         if(var3.aBoolean_8527 && var3.aClass446Array_8526.length > 1) {
            int var4 = -1829040265 * this.anInt_8540 == -1?0:1;
            Random var5 = new Random();
            Class446[] var6 = new Class446[var3.aClass446Array_8526.length];
            System.arraycopy(var3.aClass446Array_8526, 0, var6, 0, var6.length);

            for(int var7 = var4; var7 < var6.length; ++var7) {
               int var8 = Class417.method5182(var5, var6.length - var4, 592076527) + var4;
               Class446 var9 = var3.aClass446Array_8526[var7];
               var6[var7] = var6[var8];
               var6[var8] = var9;
            }

            return var6;
         } else {
            return var3.aClass446Array_8526;
         }
      } else {
         return this.method5513(0, 0, (byte)-100).aClass446Array_8526;
      }
   }

   public boolean method5516(int var1) {
      return -1829040265 * this.anInt_8540 != -1;
   }

   static final void method5517(RSInterfaceData var0, byte var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 100 == Class248_Sub1.worldMapLoadPercent * -1761614089?1:0;
   }
}
