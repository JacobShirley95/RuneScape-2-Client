
public class CacheObjectLoader implements Class208 {

   final Class465 aClass465_8586;
   final LanguagePack languagePack;
   public int anInt_8588;
   public final InventoryCacheMap inventoryCache = new InventoryCacheMap(250);
   boolean aBoolean_8590;
   final GamePack gamePack;
   final CacheNodeArrayList itemListCache = new CacheNodeArrayList(64);
   final CacheNodeArrayList aClass627_8593 = new CacheNodeArrayList(50);
   final CacheDataUnpacker groundObjectCache;
   final ItemProfile aClass453_8595 = new ItemProfile();
   final CacheDataUnpacker inventoryObjectCache;
   int anInt_8597;
   final String[] screenOptions;
   final String[] invenOptions;


   public void method5573(int var1) {
      CacheNodeArrayList var2 = this.itemListCache;
      synchronized(this.itemListCache) {
         this.itemListCache.method6669(-602419720);
      }

      var2 = this.aClass627_8593;
      synchronized(this.aClass627_8593) {
         this.aClass627_8593.method6669(-994516673);
      }

      InventoryCacheMap var9 = this.inventoryCache;
      synchronized(this.inventoryCache) {
         this.inventoryCache.method6590();
      }
   }

   public Sprite getInvSprite(Renderer var1, int var2, int var3, int var4, int var5, int var6, PlayerComposite var7, int var8) {
      this.aClass453_8595.renderTarget = -1187513645 * var1.rendererID;
      this.aClass453_8595.itemID = var2 * -1538474215;
      this.aClass453_8595.amount = var3 * -341014919;
      this.aClass453_8595.anInt_8548 = -1874492127 * var4;
      this.aClass453_8595.anInt_8550 = 214773917 * var5;
      this.aClass453_8595.anInt_8553 = -779907941 * var6;
      this.aClass453_8595.isWorn = null != var7;
      return (Sprite)this.inventoryCache.get(this.aClass453_8595);
   }

   public void method5575(int var1, int var2) {
      this.anInt_8597 = 1980521383 * var1;
      CacheNodeArrayList var3 = this.aClass627_8593;
      synchronized(this.aClass627_8593) {
         this.aClass627_8593.method6669(996426751);
      }
   }

   public Sprite getInvSprite(Renderer var1, Renderer var2, int var3, int amount, int var5, int var6, boolean var7, boolean var8, int var9, FontRenderer var10, PlayerComposite var11, int var12) {
      if(!var8) {
         Sprite var13 = this.getInvSprite(var2, var3, amount, var5, var6, var9, var11, 586106019);
         if(null != var13) {
            return var13;
         }
      }

      ObjectDescriptor var17 = this.getObjectDescriptor(var3);
      if(amount > 1 && null != var17.anIntArray_8494) {
         int var14 = -1;

         for(int var15 = 0; var15 < 10; ++var15) {
            if(amount >= var17.anIntArray_8495[var15] && var17.anIntArray_8495[var15] != 0) {
               var14 = var17.anIntArray_8494[var15];
            }
         }

         if(-1 != var14) {
            var17 = this.getObjectDescriptor(var14);
         }
      }

      int[] var18 = var17.method5470(var1, var2, amount, var5, var6, var7, var9, var10, var11, 1322421012);
      if(var18 == null) {
         return null;
      } else {
         Sprite var19;
         if(var8) {
            var19 = var1.defineSprite(var18, 0, 36, 36, 32);
         } else {
            var19 = var2.defineSprite(var18, 0, 36, 36, 32);
         }

         if(!var8) {
            ItemProfile var16 = new ItemProfile();
            var16.renderTarget = -1187513645 * var2.rendererID;
            var16.itemID = -1538474215 * var3;
            var16.amount = -341014919 * amount;
            var16.anInt_8548 = -1874492127 * var5;
            var16.anInt_8550 = 214773917 * var6;
            var16.anInt_8553 = -779907941 * var9;
            var16.isWorn = var11 != null;
            this.inventoryCache.method6584(var19, var16);
         }

         return var19;
      }
   }

   public void method5577(int var1) {
      InventoryCacheMap var2 = this.inventoryCache;
      synchronized(this.inventoryCache) {
         this.inventoryCache.method6590();
      }
   }

   public void method5578(int var1) {
      CacheNodeArrayList var2 = this.aClass627_8593;
      synchronized(this.aClass627_8593) {
         this.aClass627_8593.method6669(-851867810);
      }
   }

   public void method5579(int var1, int var2) {
      CacheNodeArrayList var3 = this.itemListCache;
      synchronized(this.itemListCache) {
         this.itemListCache.method6677(var1, -1383737852);
      }

      var3 = this.aClass627_8593;
      synchronized(this.aClass627_8593) {
         this.aClass627_8593.method6677(var1, -1067919444);
      }

      InventoryCacheMap var10 = this.inventoryCache;
      synchronized(this.inventoryCache) {
         this.inventoryCache.method6582(var1);
      }
   }

   public void method5580(int var1) {
      CacheNodeArrayList var2 = this.itemListCache;
      synchronized(this.itemListCache) {
         this.itemListCache.method6665((byte)5);
      }

      var2 = this.aClass627_8593;
      synchronized(this.aClass627_8593) {
         this.aClass627_8593.method6665((byte)5);
      }

      InventoryCacheMap var9 = this.inventoryCache;
      synchronized(this.inventoryCache) {
         this.inventoryCache.method6589();
      }
   }

   public ObjectDescriptor getObjectDescriptor(int id) {
      ObjectDescriptor var4;
      synchronized(this.itemListCache) {
         var4 = (ObjectDescriptor)this.itemListCache.getObject((long)id);
      }

      if(null != var4) {
         return var4;
      } else {
         CacheDataUnpacker var5 = this.inventoryObjectCache;
         byte[] data;
         synchronized(this.inventoryObjectCache) {
            data = this.inventoryObjectCache.getDataBytes(Class124.aClass124_2286.method1575(id, 982381948), Class124.aClass124_2286.method1573(id, (byte)85), 698784935);
         }

         var4 = new ObjectDescriptor();
         var4.cacheObjectLoader = this;
         var4.id = id * -1664394185;
         var4.screenOptions = (String[])((String[])this.screenOptions.clone());
         var4.invenOptions = (String[])((String[])this.invenOptions.clone());
         if(null != data) {
            var4.load(new ByteArrayDataNode(data));
         }

         var4.method5467(1485063947);
         if(-1 != var4.anInt_8497 * 953318699) {
            var4.method5465(this.getObjectDescriptor(var4.anInt_8497 * 953318699), this.getObjectDescriptor(var4.anInt_8496 * -1561115695), -759971940);
         }

         if(var4.anInt_8499 * -427788353 != -1) {
            var4.method5466(this.getObjectDescriptor(var4.anInt_8499 * -427788353), this.getObjectDescriptor(var4.anInt_8498 * 1479415157), -1663442101);
         }

         if(-1 != -722184523 * var4.anInt_8463) {
            var4.method5479(this.getObjectDescriptor(-722184523 * var4.anInt_8463), this.getObjectDescriptor(656579491 * var4.anInt_8511), -923508737);
         }

         if(!this.aBoolean_8590 && var4.inBank) {
            var4.anInt_8505 = 0;
            var4.screenOptions = this.screenOptions;
            var4.invenOptions = this.invenOptions;
            var4.aBoolean_8506 = false;
            var4.anIntArray_8481 = null;
            if(var4.aNodeArrayList_8513 != null) {
               boolean var13 = false;

               for(NodeListNode var6 = var4.aNodeArrayList_8513.start(); null != var6; var6 = var4.aNodeArrayList_8513.next()) {
                  Class476 var7 = this.aClass465_8586.method5610((int)(4058728944299054175L * var6.id), -691031518);
                  if(var7.aBoolean_8740) {
                     var6.shiftNext();
                  } else {
                     var13 = true;
                  }
               }

               if(!var13) {
                  var4.aNodeArrayList_8513 = null;
               }
            }
         }

         CacheNodeArrayList var14 = this.itemListCache;
         synchronized(this.itemListCache) {
            this.itemListCache.insert(var4, (long)id);
            return var4;
         }
      }
   }

   public CacheObjectLoader(GamePack var1, LanguagePack var2, boolean var3, Class465 var4, CacheDataUnpacker var5, CacheDataUnpacker var6) {
      this.gamePack = var1;
      this.languagePack = var2;
      this.aBoolean_8590 = var3;
      this.aClass465_8586 = var4;
      this.inventoryObjectCache = var5;
      this.groundObjectCache = var6;
      if(null != this.inventoryObjectCache) {
         int var7 = this.inventoryObjectCache.method3581((short)-2020) - 1;
         this.anInt_8588 = (var7 * Class124.aClass124_2286.method1574(-1942616995) + this.inventoryObjectCache.method3575(var7, -1560812960)) * 1798876283;
      } else {
         this.anInt_8588 = 0;
      }

      if(this.gamePack == GamePack.runescapePack) {
         this.screenOptions = new String[]{null, null, ServerString.takeStr.getText(this.languagePack, -1994928232), null, null, ServerString.examineStr.getText(this.languagePack, 749875425)};
      } else {
         this.screenOptions = new String[]{null, null, ServerString.takeStr.getText(this.languagePack, -822864664), null, null, null};
      }

      this.invenOptions = new String[]{null, null, null, null, ServerString.dropStr.getText(this.languagePack, -1890155324)};
   }

   public void method5582(boolean var1, byte var2) {
      if(var1 != this.aBoolean_8590) {
         this.aBoolean_8590 = var1;
         this.method5573(12238903);
      }
   }

   static final void method5583(RSInterface[] var0, int var1, int var2) {
      for(int var3 = 0; var3 < var0.length; ++var3) {
         RSInterface var4 = var0[var3];
         if(null != var4 && var4.parentID * -671235497 == var1 && !client.method179(var4)) {
            if(0 == var4.index * 1916189739) {
               method5583(var0, 1278853609 * var4.cacheID, -2027579995);
               if(null != var4.children) {
                  method5583(var4.children, var4.cacheID * 1278853609, -2079579112);
               }

               Class240_Sub16 var5 = (Class240_Sub16)client.widgets.getNode((long)(var4.cacheID * 1278853609));
               if(null != var5) {
                  Class371.method4718(1320796941 * var5.widgetID, -194716990);
               }
            }

            if(1916189739 * var4.index == 6 && -1 != var4.currentAnimation * 135359233) {
               if(null == var4.aClass507_2578) {
                  var4.aClass507_2578 = new Class507_Sub3();
                  var4.aClass507_2578.animate(135359233 * var4.currentAnimation, 1593151072);
               }

               if(var4.aClass507_2578.method5883(1451701819 * client.anInt_384, -249863691) && var4.aClass507_2578.method5887(-1304779862)) {
                  var4.aClass507_2578.method5881((byte)33);
               }
            }
         }
      }

   }

   static boolean method5584(int var0) {
      client.anInt_526 += 1120609673;
      client.aBoolean_346 = true;
      return true;
   }

   public static String method5585(int var0) {
      return Class195.method2530("www", false, (byte)0);
   }

   static final void method5586(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = ClientSuper.fps * 2143956159;
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 2143956159 * ClientSuper.fps;
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 1;
   }

   static final void method5587(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      if(client.anInt_567 * -826987519 != 0 && var2 < client.ignoreListCount * -275736435) {
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = client.ignoreList[var2].aString_111;
      } else {
         var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = "";
      }

   }
}
