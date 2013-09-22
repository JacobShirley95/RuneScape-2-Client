
public class Class588 {

   public static int anInt_9767 = -2014507029;
   static Class177 aClass177_9768;
   static int anInt_9769 = -1202855691;
   final Renderer aRenderer_9770;
   final Class584[][] aClass584ArrayArray_9771;
   int anInt_9772 = 1399547621;
   final Class584 aClass584_9773;
   long aLong_9774 = 0L;
   boolean aBoolean_9775 = false;
   final Class584 aClass584_9776;
   final Class584 aClass584_9777;
   final Class584 aClass584_9778;
   final CacheNodeArrayList aClass627_9779 = new CacheNodeArrayList(8);
   final GameCoord aClass347_9780 = new GameCoord(-50.0F, -60.0F, -50.0F);
   int anInt_9781 = 0;
   final CacheNodeArrayList aClass627_9782 = new CacheNodeArrayList(8);


   public void method6373(Class296 var1, int var2) {
      if(!Class305.method3848(client.loginStage * -243034353, 242238745) && !Class636.method6720(-243034353 * client.loginStage, 1630601384)) {
         int var3 = -1;
         int var4 = -1;
         if(Class521.myPlayer != null) {
            var3 = Class521.myPlayer.tilePosArrayX[0] >> 3;
            var4 = Class521.myPlayer.tilePosArrayY[0] >> 3;
         }

         if(var3 >= 0 && var3 < var1.getMaxX((byte)-74) >> 3 && var4 >= 0 && var4 < var1.getMaxY(-2019555823) >> 3) {
            this.method6381(var3, var4, anInt_9769 * 654502201, -2067254592);
         } else {
            this.method6381(var1.getMaxX((byte)-85) >> 4, var1.getMaxY(747463272) >> 4, 0, -314192094);
         }
      } else {
         this.method6381(Class330.anInt_6406 * 1199090811 >> 12, Class373.anInt_7118 * 1527060537 >> 12, anInt_9769 * 654502201, -380916237);
      }

      this.method6384(-33158668);
      this.method6374(1486669570);
      this.method6382((byte)-8);
      this.method6386(-49781379);
   }

   void method6374(int var1) {
      this.aRenderer_9770.method1947((0.7F + (float)Class104_Sub21.renderSettings.aClass540_Sub25_7290.method4178((byte)-84) * 0.1F + client.aClass296_348.method3749(1108745249)) * this.aClass584_9777.aFloat_9712);
      this.aRenderer_9770.method1945(this.aClass584_9777.anInt_9714 * 1256327083, this.aClass584_9777.aFloat_9718, this.aClass584_9777.aFloat_9713, (float)((int)this.aClass347_9780.floatX << 2), (float)((int)this.aClass347_9780.floatY << 2), (float)((int)this.aClass347_9780.floatZ << 2));
      this.aRenderer_9770.method1925(this.aClass584_9777.aClass177_9716);
   }

   public void method6375(Class588 var1, short var2) {
      this.aClass584_9777.method6334(var1.aClass584_9777, (byte)42);
      this.aClass584_9773.method6334(var1.aClass584_9773, (byte)38);
      this.aClass584_9776.method6334(var1.aClass584_9776, (byte)-33);
      this.aLong_9774 = var1.aLong_9774 * 1L;
      this.anInt_9781 = 1 * var1.anInt_9781;
      this.anInt_9772 = 1 * var1.anInt_9772;
   }

   public void method6376(int var1) {
      this.aClass627_9779.method6669(1920666855);
      this.aClass627_9782.method6669(-160695942);
   }

   Class177 method6377(int var1, int var2) {
      Class177 var3 = (Class177)this.aClass627_9779.getObject((long)var1);
      if(null != var3) {
         return var3;
      } else {
         var3 = this.aRenderer_9770.method1952(var1);
         this.aClass627_9779.insert(var3, (long)var1);
         return var3;
      }
   }

   public void method6378(int var1, int var2, Class584 var3, byte var4) {
      this.aClass584ArrayArray_9771[var1][var2] = var3;
   }

   public void method6379(int var1) {
      for(int var2 = 0; var2 < this.aClass584ArrayArray_9771.length; ++var2) {
         for(int var3 = 0; var3 < this.aClass584ArrayArray_9771[var2].length; ++var3) {
            this.aClass584ArrayArray_9771[var2][var3] = this.aClass584_9778;
         }
      }

   }

   public void method6380(int var1, int var2, int var3) {
      Class584 var4 = this.aClass584ArrayArray_9771[var1][var2];
      if(null != var4) {
         this.aClass347_9780.setPos(var4.aClass347_9722);
      }

      this.method6374(1486669570);
   }

   void method6381(int var1, int var2, int var3, int var4) {
      Class584 var5 = this.aClass584ArrayArray_9771[var1][var2];
      if(var5 == null) {
         var5 = this.aClass584_9778;
      }

      if(this.aBoolean_9775) {
         this.aBoolean_9775 = false;
         var3 = 0;
      }

      if(!this.aClass584_9776.method6340(var5, 476921037)) {
         this.aClass584_9776.method6334(var5, (byte)11);
         this.aLong_9774 = Class373.getCurrentTime((short)25707) * -326614254969864627L;
         this.anInt_9781 = (this.anInt_9772 = -1399547621 * var3) * 2004236019;
         if(0 != this.anInt_9781 * 191520097) {
            this.aClass584_9773.method6334(this.aClass584_9777, (byte)-90);
            if(null != this.aClass584_9777.aClass286_9711) {
               if(this.aClass584_9777.aClass286_9711.method3686(1961012305)) {
                  this.aClass584_9777.aClass286_9711 = this.aClass584_9773.aClass286_9711 = this.aClass584_9777.aClass286_9711.method3687(1536374077);
               }

               if(this.aClass584_9777.aClass286_9711 != null && this.aClass584_9777.aClass286_9711 != this.aClass584_9776.aClass286_9711) {
                  this.aClass584_9777.aClass286_9711.method3693(this.aClass584_9776.aClass286_9711, (short)-18877);
               }
            }
         }
      }

   }

   void method6382(byte var1) {
      this.aRenderer_9770.method1983(this.aClass584_9777.aFloat_9721, this.aClass584_9777.aFloat_9715, this.aClass584_9777.aFloat_9720, -607699115);
   }

   public void method6383(byte var1) {
      this.aBoolean_9775 = true;
   }

   void method6384(int var1) {
      if(1734285587 * this.anInt_9772 >= 0) {
         long var2 = Class373.getCurrentTime((short)26364);
         this.anInt_9772 = (int)((long)this.anInt_9772 - (var2 - -6303224678739989883L * this.aLong_9774) * -1399547621L);
         if(this.anInt_9772 * 1734285587 > 0) {
            this.aClass584_9777.method6335(this.aRenderer_9770, this.aClass584_9773, this.aClass584_9776, (float)(191520097 * this.anInt_9781 - 1734285587 * this.anInt_9772) / (float)(191520097 * this.anInt_9781), 1886851450);
         } else {
            this.aClass584_9777.method6334(this.aClass584_9776, (byte)-84);
            if(null != this.aClass584_9777.aClass286_9711) {
               this.aClass584_9777.aClass286_9711.method3685(-1548440019);
            }

            this.anInt_9772 = 1399547621;
         }

         this.aLong_9774 = var2 * -326614254969864627L;
      }

   }

   public void method6385(int var1) {
      this.aRenderer_9770.method1947((0.7F + (float)Class104_Sub21.renderSettings.aClass540_Sub25_7290.method4178((byte)10) * 0.1F + client.aClass296_348.method3749(75496537)) * 1.1523438F);
      this.aRenderer_9770.method1945(16777215, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
      this.aRenderer_9770.method1949(13156520, -1, 0);
      this.aRenderer_9770.method1925(aClass177_9768);
   }

   public void method6386(int var1) {
      byte var2 = 0;
      int var3 = (978931593 * this.aClass584_9777.anInt_9717 + 256 << 2) + var2;
      this.aRenderer_9770.method1949(this.aClass584_9777.anInt_9719 * -226776391, Class104_Sub21.renderSettings.aClass540_Sub31_7321.method4379(-831324111) == 1?var3:-1, 0);
   }

   public Class588(Renderer var1, int var2, int var3) {
      this.aRenderer_9770 = var1;
      this.aClass584ArrayArray_9771 = new Class584[var2][var3];
      if(anInt_9767 * 2131844925 != -1) {
         aClass177_9768 = this.method6377(anInt_9767 * 2131844925, -1287046536);
      }

      Class631.aClass286_10081 = null;
      this.aClass584_9778 = new Class584();
      this.aClass584_9777 = new Class584();
      this.aClass584_9773 = new Class584();
      this.aClass584_9776 = new Class584();
      this.method6383((byte)-106);
   }

   Class286 method6387(int var1, int var2, int var3, int var4, int var5) {
      long var6 = ((long)var2 & 65535L) << 48 | ((long)var3 & 65535L) << 32 | ((long)var4 & 65535L) << 16 | (long)var1 & 65535L;
      Class286 var8 = (Class286)this.aClass627_9782.getObject(var6);
      if(var8 == null) {
         var8 = Class585.aClass236_9731.method3057(var1, var2, var3, var4, Class598.aClass44_9877, (byte)-44);
         this.aClass627_9782.insert(var8, var6);
      }

      return var8;
   }

   public Class584 method6388(int var1) {
      return this.aClass584_9777;
   }

   static final void method6389(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class322.method3968(var3, var4, var0, (byte)0);
   }

   static final void method6390(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class234.method3013(var3, var4, false, 1, var0, 147816462);
   }

   static final void method6391(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class4.anInt_30 * 1726690917;
   }

   static final void method6392(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      RSWorld.method4393(var3, var4, var0, 765263251);
   }

   static Class335[] method6393(byte var0) {
      return new Class335[]{Class335.aClass335_6476, Class335.aClass335_6475, Class335.aClass335_6470, Class335.aClass335_6472, Class335.aClass335_6477, Class335.aClass335_6473, Class335.aClass335_6471, Class335.aClass335_6469, Class335.aClass335_6468, Class335.aClass335_6479, Class335.aClass335_6467};
   }

   public static void method6394(Class240_Sub22 var0, Class240_Sub22 var1, int var2) {
      if(null != var0.aClass240_Sub22_7279) {
         var0.shiftNext();
      }

      var0.aClass240_Sub22_7279 = var1.aClass240_Sub22_7279;
      var0.aClass240_Sub22_7277 = var1;
      var0.aClass240_Sub22_7279.aClass240_Sub22_7277 = var0;
      var0.aClass240_Sub22_7277.aClass240_Sub22_7279 = var0;
   }
}
