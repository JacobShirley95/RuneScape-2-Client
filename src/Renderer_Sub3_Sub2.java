import jagdx.D3DADAPTER_IDENTIFIER;
import jagdx.D3DCAPS;
import jagdx.D3DDISPLAYMODE;
import jagdx.D3DLIGHT;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3D;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DEventQuery;
import jagdx.IDirect3DSurface;
import jagdx.IUnknown;
import jagdx.a;
import jagdx.h;
import jagdx.m;
import java.awt.Canvas;

public class Renderer_Sub3_Sub2 extends Renderer_Sub3 {

   static final int[] anIntArray_1423 = new int[]{77, 80};
   final int anInt_1424;
   long aLong_1425 = 0L;
   long curScene = 0L;
   long aLong_1427 = 0L;
   NodeList aNodeList_1428 = new NodeList();
   int anInt_1429 = 0;
   long aLong_1430 = 0L;
   final float[] aFloatArray_1431 = new float[16];
   final boolean aBoolean_1432;
   final D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS_1433;
   boolean[] aBooleanArray_1434;
   final boolean aBoolean_1435;
   final boolean aBoolean_1436;
   boolean[] aBooleanArray_1437;
   Class389[] aClass389Array_1438;
   boolean[] aBooleanArray_1439;
   ArrayViewport anArrayViewport_1440;
   Class125_Sub2 aClass125_Sub2_1441;
   long aLong_1442;
   int[] anIntArray_1443;
   boolean aBoolean_1444 = false;
   final D3DCAPS aD3DCAPS_1445;
   long aLong_1446 = 0L;
   boolean[] aBooleanArray_1447;
   boolean aBoolean_1448;
   int anInt_1449 = 128;
   int anInt_1450 = 0;
   long[] aLongArray_1451;
   final int anInt_1452;
   static final int[] anIntArray_1453 = new int[]{22, 23};


   public boolean method7325() {
      return (this.aD3DCAPS_1445.anInt_1693 & '\uffff') >= 257;
   }

   static Renderer method888(Canvas var0, Class163 var1, Class96 var2, CacheDataUnpacker var3, Integer var4) {
      Renderer_Sub3_Sub2 var5 = null;

      try {
         byte var6 = 0;
         byte var7 = 1;
         long var8 = IDirect3D.Direct3DCreate();
         D3DCAPS var10 = new D3DCAPS();
         IDirect3D.GetDeviceCaps(var8, var6, var7, var10);
         if(var10.anInt_1680 < 2) {
            throw new RuntimeException("");
         } else if((var10.anInt_1678 & 2) == 0) {
            throw new RuntimeException("");
         } else if((var10.anInt_1678 & 8) == 0) {
            throw new RuntimeException("");
         } else if((var10.anInt_1678 & 64) == 0) {
            throw new RuntimeException("");
         } else if((var10.anInt_1678 & 512) == 0) {
            throw new RuntimeException("");
         } else if((var10.anInt_1678 & 33554432) == 0) {
            throw new RuntimeException("");
         } else if((var10.anInt_1653 & var10.anInt_1654 & 16) == 0) {
            throw new RuntimeException("");
         } else if((var10.anInt_1653 & var10.anInt_1654 & 32) == 0) {
            throw new RuntimeException("");
         } else if((var10.anInt_1653 & var10.anInt_1654 & 2) == 0) {
            throw new RuntimeException("");
         } else if(var10.anInt_1682 > 0 && var10.anInt_1682 < 2) {
            throw new RuntimeException("");
         } else if(var10.anInt_1689 < 5) {
            throw new RuntimeException("");
         } else {
            D3DPRESENT_PARAMETERS var11 = new D3DPRESENT_PARAMETERS(var0);
            var11.aBoolean_1149 = true;
            var11.aBoolean_1150 = true;
            var11.anInt_1141 = var0.getWidth();
            var11.anInt_1142 = var0.getHeight();
            var11.anInt_1144 = 1;
            var11.anInt_1154 = Integer.MIN_VALUE;
            if(!method950(var6, var7, var8, var4.intValue(), var11)) {
               throw new RuntimeException("");
            } else {
               int var12 = 0;
               if((var10.anInt_1649 & 1048576) != 0) {
                  var12 |= 16;
               }

               long var13 = 0L;

               try {
                  var13 = IDirect3D.CreateDeviceContext(var8, var6, var7, var0, var12 | 64, var11);
               } catch (a var16) {
                  var13 = IDirect3D.CreateDeviceContext(var8, var6, var7, var0, var12 & -1048577 | 32, var11);
               }

               var5 = new Renderer_Sub3_Sub2(var6, var7, var8, var13, var11, var10, var1, var2, var3, var4.intValue());
               if(!var5.canvasMap.containsKey(var0)) {
                  Class619.setIgnoreRepaint(var0, 1116356103);
                  var5.addCanvas(var0, new Class174_Sub2_Sub2_Sub2(var5, var0, var0.getWidth(), var0.getHeight(), true), (short)255);
               }

               var5.method1982(var0, 1342676145);
               var5.init();
               return var5;
            }
         }
      } catch (RuntimeException var17) {
         if(var5 != null) {
            var5.method1888();
         }

         throw var17;
      }
   }

   Renderer_Sub3_Sub2(int var1, int var2, long var3, long var5, D3DPRESENT_PARAMETERS var7, D3DCAPS var8, Class163 var9, Class96 var10, CacheDataUnpacker var11, int var12) {
      super(var9, var10, var11, var12, 0);
      this.aLongArray_1451 = new long[this.anInt_1449];

      try {
         this.anInt_1452 = var1;
         this.anInt_1424 = var2;
         this.aLong_1425 = var3;
         this.curScene = var5;
         this.aD3DPRESENT_PARAMETERS_1433 = var7;
         this.aD3DCAPS_1445 = var8;
         this.aLong_1430 = D3DLIGHT.Create();
         this.aLong_1427 = D3DLIGHT.Create();
         this.aLong_1446 = D3DLIGHT.Create();
         this.anInt_10641 = this.aD3DCAPS_1445.anInt_1680;
         this.anInt_10642 = this.aD3DCAPS_1445.anInt_1682 > 0?this.aD3DCAPS_1445.anInt_1682:8;
         this.aBoolean_1432 = (this.aD3DCAPS_1445.anInt_1657 & 2) == 0;
         this.aBoolean_10655 = (this.aD3DCAPS_1445.anInt_1657 & 8192) != 0;
         this.aBoolean_1435 = (this.aD3DCAPS_1445.anInt_1657 & 65536) != 0;
         this.aBoolean_1436 = (this.aD3DCAPS_1445.anInt_1657 & 16384) != 0;
         this.aBoolean_10585 = this.aD3DCAPS_1445.anInt_1702 > 0;
         this.aBoolean_10608 = this.aD3DCAPS_1445.anInt_1702 > 0;
         this.isMultisample = this.anInt_10635 > 0 || IDirect3D.CheckDeviceMultiSampleType(this.aLong_1425, this.anInt_1452, this.anInt_1424, this.aD3DPRESENT_PARAMETERS_1433.anInt_1143, true, 2) == 0;
         this.aBoolean_10645 = this.aD3DCAPS_1445.anInt_1702 > 0 && this.anInt_10635 > 0 || IDirect3D.CheckDeviceMultiSampleType(this.aLong_1425, this.anInt_1452, this.anInt_1424, 113, true, 2) == 0;
         this.aBooleanArray_1434 = new boolean[this.anInt_10641];
         this.aBooleanArray_1447 = new boolean[this.anInt_10641];
         this.aBooleanArray_1439 = new boolean[this.anInt_10641];
         this.aClass389Array_1438 = new Class389[this.anInt_10641];
         this.aBooleanArray_1437 = new boolean[this.anInt_10641];
         this.anIntArray_1443 = new int[this.anInt_10641];
         Viewport var13 = new Viewport();
         var13.method4647(1.0F, -1.0F, 0.5F);
         var13.setOffset(0.0F, 0.0F, 0.5F);
         this.anArrayViewport_1440 = new ArrayViewport();
         this.anArrayViewport_1440.setViewport(var13);
         IDirect3DDevice.BeginScene(this.curScene);
      } catch (Throwable var14) {
         var14.printStackTrace();
         this.method1939(-1500363801);
         throw new RuntimeException("");
      }
   }

   void method7278() {
      for(Class240_Sub9 var1 = (Class240_Sub9)this.aNodeList_1428.getBaseNode_2((byte)19); var1 != null; var1 = (Class240_Sub9)this.aNodeList_1428.getNext(166694409)) {
         Class324 var2 = (Class324)var1.anObject_6783;
         var2.method3972();
      }

      super.method7278();
   }

   boolean method890() {
      int var1 = IDirect3DDevice.TestCooperativeLevel(this.curScene);
      if(var1 == 0 || var1 == -2005530519) {
         IDirect3DDevice.SetDepthStencilSurface(this.curScene, 0L);

         int var2;
         for(var2 = 0; var2 < 4; ++var2) {
            IDirect3DDevice.SetRenderTarget(this.curScene, var2, 0L);
         }

         for(var2 = 0; var2 < 4; ++var2) {
            IDirect3DDevice.SetStreamSource(this.curScene, var2, 0L, 0, 0);
         }

         for(var2 = 0; var2 < 4; ++var2) {
            IDirect3DDevice.SetTexture(this.curScene, var2, 0L);
         }

         IDirect3DDevice.SetIndices(this.curScene, 0L);
         this.method7278();
         this.aD3DPRESENT_PARAMETERS_1433.anInt_1141 = 0;
         this.aD3DPRESENT_PARAMETERS_1433.anInt_1142 = 0;
         if(method950(this.anInt_1452, this.anInt_1424, this.aLong_1425, this.anInt_10635, this.aD3DPRESENT_PARAMETERS_1433)) {
            var2 = IDirect3DDevice.Reset(this.curScene, this.aD3DPRESENT_PARAMETERS_1433);
            if(h.method187(var2)) {
               this.method7134();
               this.method7287();
               return true;
            }

            System.exit(0);
         }
      }

      return false;
   }

   public RendererInfo getRendererInfo() {
      D3DADAPTER_IDENTIFIER var1 = new D3DADAPTER_IDENTIFIER();
      IDirect3D.GetAdapterIdentifier(this.aLong_1425, this.anInt_1452, 0, var1);
      return new RendererInfo(var1.anInt_10147, this.method7298()?"Direct3D FF":"Direct3D", 9, var1.aString_10144, var1.aLong_10146);
   }

   void method1886(int var1, int var2) throws Exception_Sub7 {
      IDirect3DDevice.EndScene(this.curScene);
      int var3 = this.softwareTarget.method7576();
      if(h.method186(var3)) {
         if(var3 != -2005530520) {
            if(++this.anInt_1429 > 50) {
               throw new Exception_Sub7(var3);
            }
         } else {
            this.softwareTarget.method2195();
            this.method890();
            ((Class174_Sub2_Sub2_Sub2)this.softwareTarget).method3970();
         }
      } else {
         this.anInt_1429 = 0;
      }

      IDirect3DDevice.BeginScene(this.curScene);
      if(this.aClass96_2801 != null) {
         this.aClass96_2801.method1254(-817487130);
      }

   }

   public void method1962() {
      long var1 = IDirect3DDevice.CreateEventQuery(this.curScene);
      if(h.method187(IDirect3DEventQuery.Issue(var1))) {
         while(true) {
            int var3 = IDirect3DEventQuery.IsSignaled(var1);
            if(var3 != 1) {
               break;
            }

            Thread.yield();
         }
      }

      IUnknown.Release(var1);
   }

   void method1888() {
      super.method1888();
      if(this.aLong_1430 != 0L) {
         D3DLIGHT.Destroy(this.aLong_1430);
         this.aLong_1430 = 0L;
      }

      if(this.aLong_1427 != 0L) {
         D3DLIGHT.Destroy(this.aLong_1427);
         this.aLong_1427 = 0L;
      }

      if(this.aLong_1446 != 0L) {
         D3DLIGHT.Destroy(this.aLong_1446);
         this.aLong_1446 = 0L;
      }

      if(this.curScene != 0L) {
         IDirect3DDevice.Destroy(this.curScene);
         this.curScene = 0L;
      }

      if(this.aLong_1425 != 0L) {
         IUnknown.Release(this.aLong_1425);
         this.aLong_1425 = 0L;
      }

   }

   public void finalize() {
      super.finalize();
   }

   public float method7146() {
      return -0.5F;
   }

   public Class174_Sub1 method1890() {
      return new Class174_Sub1_Sub1_Sub2(this);
   }

   public Class99 method1905(int var1, int var2, int var3) {
      return new Class422(this, Class87.aClass87_1762, var1, var2, var3);
   }

   Class240_Sub9 method898(Class324 var1) {
      for(Class240_Sub9 var2 = (Class240_Sub9)this.aNodeList_1428.getBaseNode_2((byte)112); var2 != null; var2 = (Class240_Sub9)this.aNodeList_1428.getNext(-289691004)) {
         if(var2.anObject_6783 == var1) {
            return var2;
         }
      }

      return null;
   }

   void method899(Class324 var1) {
      if(this.method898(var1) == null) {
         this.aNodeList_1428.addNode(new Class240_Sub9(var1), (short)-7178);
      }

   }

   void method900(Class324 var1) {
      Class240_Sub9 var2 = this.method898(var1);
      if(var2 != null) {
         var2.shiftNext();
      }

   }

   public int[] method1906(int var1, int var2, int var3, int var4) {
      int[] var5 = null;
      long var6 = IDirect3DDevice.GetRenderTarget(this.curScene, 0);
      long var8 = IDirect3DDevice.CreateRenderTarget(this.curScene, var3, var4, 21, 0, 0, true);
      if(h.method187(IDirect3DDevice.StretchRect(this.curScene, var6, var1, var2, var3, var4, var8, 0, 0, var3, var4, 1))) {
         var5 = new int[var3 * var4];
         IDirect3DSurface.Download(var8, 0, 0, var3, var4, var3 * 4, 16, this.aLong_10629);
         this.aByteBuffer_10646.clear();
         this.aByteBuffer_10646.asIntBuffer().get(var5);
      }

      IUnknown.Release(var6);
      IUnknown.Release(var8);
      return var5;
   }

   public void method7251(int var1, Class76 var2) {
      Class337 var3 = (Class337)var2;
      IDirect3DDevice.SetStreamSource(this.curScene, var1, var3.aLong_6491, 0, var3.method4173());
   }

   public Class177 method1985(Class177 var1, Class177 var2, float var3, Class177 var4) {
      return var3 < 0.5F?var1:var2;
   }

   public void method1977(int var1, int var2) {
      IDirect3DDevice.Clear(this.curScene, var1, var2, 1.0F, 0);
   }

   void method7180() {
      if(this.aClass174_2815 != null) {
         IDirect3DDevice.SetViewport(this.curScene, this.anInt_10531 + this.anInt_10562, this.anInt_10567 + this.anInt_10583, this.anInt_10577, this.anInt_10565, this.aFloat_10548, this.aFloat_10600);
      }

   }

   void method7157() {
      IDirect3DDevice.SetScissorRect(this.curScene, this.anInt_10531 + this.anInt_10528, this.anInt_10567 + this.anInt_10552, this.anInt_10557, this.anInt_10512);
   }

   void method7182() {
      IDirect3DDevice.method6284(this.curScene, 174, this.aBoolean_10662);
   }

   final void method908(long var1) {
      this.aLong_1442 = var1;
      IDirect3DDevice.SetVertexShader(this.curScene, var1);
   }

   final void method909(long var1) {
      IDirect3DDevice.SetPixelShader(this.curScene, var1);
   }

   public void method7132(ArrayViewport var1, ArrayViewport var2, ArrayViewport var3) {
      IDirect3DDevice.SetTransform(this.curScene, 256, var1.data);
      IDirect3DDevice.SetTransform(this.curScene, 2, var2.data);
      IDirect3DDevice.SetTransform(this.curScene, 3, var3.data);
   }

   public void method7192(ArrayViewport var1) {
      var1.method4580(this.anArrayViewport_1440);
   }

   void method7201() {
      IDirect3DDevice.method6284(this.curScene, 7, this.aBoolean_10553);
   }

   void method7303() {
      if(this.aBoolean_10505) {
         IDirect3DDevice.method6284(this.curScene, 137, this.aBoolean_10571 && !this.aBoolean_10573);
      }

   }

   void method7208() {
      if(this.aBoolean_10505) {
         D3DLIGHT.SetAmbient(this.aLong_1430, this.aFloat_10579 * this.aFloat_10582, this.aFloat_10580 * this.aFloat_10582, this.aFloat_10651 * this.aFloat_10582, 0.0F);
         this.aBoolean_1444 = false;
      }

   }

   void method7240() {
      if(this.aLong_1442 == 0L && this.aClass404Array_10508[this.anInt_10511] != Class404.aClass404_7655) {
         if(this.aClass404Array_10508[this.anInt_10511] == Class404.aClass404_7652) {
            IDirect3DDevice.SetTransform(this.curScene, 16 + this.anInt_10511, this.anArrayViewportArray_10594[this.anInt_10511].method4566(this.aFloatArray_1431));
         } else {
            IDirect3DDevice.SetTransform(this.curScene, 16 + this.anInt_10511, this.anArrayViewportArray_10594[this.anInt_10511].method4570(this.aFloatArray_1431));
         }

         int var1 = method961(this.aClass404Array_10508[this.anInt_10511]);
         if(var1 != this.anIntArray_1443[this.anInt_10511]) {
            IDirect3DDevice.SetTextureStageState(this.curScene, this.anInt_10511, 24, var1);
            this.anIntArray_1443[this.anInt_10511] = var1;
         }
      } else {
         IDirect3DDevice.SetTextureStageState(this.curScene, this.anInt_10511, 24, 0);
         this.anIntArray_1443[this.anInt_10511] = 0;
      }

   }

   void method7209() {
      this.method7310();
      this.method7290();
   }

   void method7290() {
      if(this.aBoolean_10505 && !this.aBoolean_1444) {
         IDirect3DDevice.LightEnable(this.curScene, 0, false);
         IDirect3DDevice.LightEnable(this.curScene, 1, false);
         IDirect3DDevice.SetLight(this.curScene, 0, this.aLong_1430);
         IDirect3DDevice.SetLight(this.curScene, 1, this.aLong_1427);
         IDirect3DDevice.LightEnable(this.curScene, 0, true);
         IDirect3DDevice.LightEnable(this.curScene, 1, true);
         this.aBoolean_1444 = true;
      }

   }

   boolean method7212(Class136 var1, Class87 var2) {
      D3DDISPLAYMODE var3 = new D3DDISPLAYMODE();
      return h.method187(IDirect3D.GetAdapterDisplayMode(this.aLong_1425, this.anInt_1452, var3)) && h.method187(IDirect3D.CheckDeviceFormat(this.aLong_1425, this.anInt_1452, this.anInt_1424, var3.anInt_9528, 0, 3, method958(var1, var2)));
   }

   void method7211() {
      int var1;
      for(var1 = 0; var1 < this.anInt_10587; ++var1) {
         Class240_Sub53 var2 = this.aClass240_Sub53Array_10504[var1];
         int var3 = var1 + 2;
         int var4 = var2.method5278((byte)-123);
         float var5 = var2.method5279(-1965887986) / 255.0F;
         D3DLIGHT.SetPosition(this.aLong_1446, (float)var2.method5274((byte)7), (float)var2.method5275((byte)121), (float)var2.method5276((byte)60));
         D3DLIGHT.SetDiffuse(this.aLong_1446, (float)(var4 >> 16 & 255) * var5, (float)(var4 >> 8 & 255) * var5, (float)(var4 & 255) * var5, 0.0F);
         D3DLIGHT.SetAttenuation(this.aLong_1446, 0.0F, 0.0F, 1.0F / (float)(var2.method5277(-1932051005) * var2.method5277(-1932051005)));
         D3DLIGHT.SetRange(this.aLong_1446, (float)var2.method5277(-1932051005));
         IDirect3DDevice.SetLight(this.curScene, var3, this.aLong_1446);
         IDirect3DDevice.LightEnable(this.curScene, var3, true);
      }

      while(var1 < this.anInt_10586) {
         IDirect3DDevice.LightEnable(this.curScene, var1 + 2, false);
         ++var1;
      }

   }

   public final synchronized void cleanup(int var1) {
      for(int var2 = 0; var2 < this.anInt_1450; ++var2) {
         IUnknown.Release(this.aLongArray_1451[var2]);
      }

      this.anInt_1450 = 0;
      super.cleanup(var1);
   }

   Class384 method7218(Class136 var1, int var2, int var3, boolean var4, byte[] var5, int var6, int var7) {
      return new Class328_Sub3(this, var1, var2, var3, var4, var5, var6, var7);
   }

   Class384 method7309(Class136 var1, int var2, int var3, boolean var4, float[] var5, int var6, int var7) {
      return new Class328_Sub3(this, var1, var2, var3, var4, var5, var6, var7);
   }

   Class406 method7292(Class136 var1, Class87 var2, int var3, int var4) {
      return new Class328_Sub3_Sub1(this, var1, var2, var3, var4);
   }

   final void method924(Class328_Sub1 var1) {
      this.method964(var1);
      if(!this.aBooleanArray_1434[this.anInt_10511]) {
         IDirect3DDevice.SetSamplerState(this.curScene, this.anInt_10511, 1, 1);
         this.aBooleanArray_1434[this.anInt_10511] = true;
      }

      if(!this.aBooleanArray_1447[this.anInt_10511]) {
         IDirect3DDevice.SetSamplerState(this.curScene, this.anInt_10511, 2, 1);
         this.aBooleanArray_1447[this.anInt_10511] = true;
      }

   }

   void method7308() {
      if(this.aBoolean_10505) {
         D3DLIGHT.SetDirection(this.aLong_1430, -this.aFloatArray_10574[0], -this.aFloatArray_10574[1], -this.aFloatArray_10574[2]);
         D3DLIGHT.SetDirection(this.aLong_1427, -this.aFloatArray_10513[0], -this.aFloatArray_10513[1], -this.aFloatArray_10513[2]);
         this.aBoolean_1444 = false;
      }

   }

   void method7236() {}

   void method7291() {
      if(this.aBoolean_10505) {
         int var1 = this.aBooleanArray_1439[this.anInt_10511]?method930(this.aClass392Array_10597[this.anInt_10511]):1;
         IDirect3DDevice.SetTextureStageState(this.curScene, this.anInt_10511, 4, var1);
      }

   }

   static final int method928(Class61 var0) {
      switch(var0.anInt_1156) {
      case 0:
         return 3;
      case 1:
         return 0;
      case 2:
         return 2;
      case 3:
         return 1;
      default:
         throw new IllegalArgumentException();
      }
   }

   final void method7235() {
      if(this.aBoolean_10505) {
         IDirect3DDevice.SetRenderState(this.curScene, 60, this.anInt_10598);
      }

   }

   static final int method930(Class392 var0) {
      switch(var0.anInt_7535) {
      case 0:
         return 10;
      case 1:
         return 26;
      case 2:
         return 7;
      case 3:
         return 4;
      case 4:
         return 2;
      default:
         throw new IllegalArgumentException();
      }
   }

   Class398 method7220(int var1, boolean var2, int[][] var3) {
      return new Class328_Sub2(this, var1, var2, var3);
   }

   void method7284(int var1) {
      IDirect3DDevice.SetRenderState(this.curScene, 168, var1);
   }

   void method7242() {
      IDirect3DDevice.method6284(this.curScene, 15, this.aBoolean_10634);
   }

   void method7243() {
      switch(this.aClass393_10632.anInt_7553) {
      case 0:
         IDirect3DDevice.SetRenderState(this.curScene, 19, 5);
         IDirect3DDevice.SetRenderState(this.curScene, 20, 6);
         break;
      case 1:
         IDirect3DDevice.SetRenderState(this.curScene, 19, 9);
         IDirect3DDevice.SetRenderState(this.curScene, 20, 2);
         break;
      case 2:
         IDirect3DDevice.SetRenderState(this.curScene, 19, 2);
         IDirect3DDevice.SetRenderState(this.curScene, 20, 1);
         break;
      case 3:
         IDirect3DDevice.SetRenderState(this.curScene, 19, 2);
         IDirect3DDevice.SetRenderState(this.curScene, 20, 2);
      }

      switch(this.anInt_10663) {
      case 0:
         IDirect3DDevice.SetRenderState(this.curScene, 207, 1);
         IDirect3DDevice.SetRenderState(this.curScene, 208, 1);
         break;
      case 1:
         IDirect3DDevice.SetRenderState(this.curScene, 207, 2);
         IDirect3DDevice.SetRenderState(this.curScene, 208, 1);
         break;
      case 2:
         IDirect3DDevice.SetRenderState(this.curScene, 207, 2);
         IDirect3DDevice.SetRenderState(this.curScene, 208, 2);
      }

   }

   void method7280() {
      IDirect3DDevice.method6284(this.curScene, 27, this.aBoolean_10633);
   }

   void method7247() {
      if(this.aBoolean_10505) {
         IDirect3DDevice.method6284(this.curScene, 28, this.aBoolean_10625 && this.aBoolean_10624 && this.anInt_10627 >= 0);
      }

   }

   void method7246() {
      this.aFloat_10494 = this.aFloat_10568 - (float)this.anInt_10628;
      this.aFloat_10614 = this.aFloat_10494 - (float)this.anInt_10627;
      if(this.aFloat_10614 < this.aFloat_10576) {
         this.aFloat_10614 = this.aFloat_10576;
      }

      if(this.aBoolean_10505) {
         IDirect3DDevice.method6283(this.curScene, 36, this.aFloat_10614);
         IDirect3DDevice.method6283(this.curScene, 37, this.aFloat_10494);
         IDirect3DDevice.SetRenderState(this.curScene, 34, this.anInt_10626);
      }

   }

   final Class414 method7249(boolean var1) {
      return new Class329(this, Class87.aClass87_1763, var1);
   }

   byte[] method939(String var1) {
      return this.method7326("dx", var1);
   }

   public void method7190(Class379 var1) {
      Class379_Sub1 var2 = (Class379_Sub1)var1;
      IDirect3DDevice.SetVertexDeclaration(this.curScene, var2.aLong_3743);
   }

   void method7307(Class414 var1) {
      IDirect3DDevice.SetIndices(this.curScene, ((Class329)var1).aLong_6362);
   }

   public final void method7268(Class396 var1, int var2, int var3) {
      if(this.aClass125_Sub2_1441 != null) {
         this.aClass125_Sub2_1441.method3480();
      }

      IDirect3DDevice.DrawPrimitive(this.curScene, method974(var1), var2, var3);
   }

   final void method7269(Class414 var1, Class396 var2, int var3, int var4, int var5, int var6) {
      if(this.aClass125_Sub2_1441 != null) {
         this.aClass125_Sub2_1441.method3480();
      }

      IDirect3DDevice.DrawIndexedPrimitiveIB(this.curScene, ((Class329)var1).aLong_6362, 4, 0, var3, var4, var5, var6);
   }

   public final void method7270(Class396 var1, int var2, int var3, int var4, int var5) {
      if(this.aClass125_Sub2_1441 != null) {
         this.aClass125_Sub2_1441.method3480();
      }

      IDirect3DDevice.DrawIndexedPrimitive(this.curScene, method974(var1), 0, var2, var3, var4, var5);
   }

   public Class133 method7130(String var1) {
      byte[] var2 = this.method939(var1);
      if(var2 == null) {
         return null;
      } else {
         Class113 var3 = this.method7131(var2);
         return new Class133_Sub1(this, var3);
      }
   }

   public void method1961(boolean var1) {}

   void method7134() {
      for(Class240_Sub9 var1 = (Class240_Sub9)this.aNodeList_1428.getBaseNode_2((byte)53); var1 != null; var1 = (Class240_Sub9)this.aNodeList_1428.getNext(-1593801485)) {
         Class324 var2 = (Class324)var1.anObject_6783;
         var2.method3970();
         if(var2 == this.aClass174_2815) {
            var2.method3978();
         }
      }

      super.method7134();
   }

   final void method7229(int var1, Class61 var2, boolean var3, boolean var4) {
      if(this.aBoolean_10505) {
         int var5 = 0;
         byte var6;
         switch(var1) {
         case 1:
            var6 = 3;
            break;
         case 2:
            var6 = 26;
            break;
         default:
            var6 = 2;
         }

         if(var3) {
            var5 |= 32;
         }

         if(var4) {
            var5 |= 16;
         }

         IDirect3DDevice.SetTextureStageState(this.curScene, this.anInt_10511, var6, method928(var2) | var5);
      }

   }

   final void method7231(int var1, Class61 var2, boolean var3) {
      if(this.aBoolean_10505) {
         int var4 = 0;
         byte var5;
         switch(var1) {
         case 1:
            var5 = 6;
            break;
         case 2:
            var5 = 27;
            break;
         default:
            var5 = 5;
         }

         if(var3) {
            var4 |= 16;
         }

         IDirect3DDevice.SetTextureStageState(this.curScene, this.anInt_10511, var5, method928(var2) | var4);
      }

   }

   static boolean method950(int var0, int var1, long var2, int var4, D3DPRESENT_PARAMETERS var5) {
      int var6 = 0;
      int var7 = 0;
      int var8 = 0;

      try {
         D3DDISPLAYMODE var9 = new D3DDISPLAYMODE();
         if(h.method186(IDirect3D.GetAdapterDisplayMode(var2, var0, var9))) {
            return false;
         } else {
            label75:
            for(; var4 >= 0; --var4) {
               if(var4 != 1) {
                  var8 = 0 + var4;

                  for(int var10 = 0; var10 < anIntArray_1453.length; ++var10) {
                     if(IDirect3D.CheckDeviceType(var2, var0, var1, var9.anInt_9528, anIntArray_1453[var10], true) == 0 && IDirect3D.CheckDeviceFormat(var2, var0, var1, var9.anInt_9528, 1, 1, anIntArray_1453[var10]) == 0 && (var4 == 0 || IDirect3D.CheckDeviceMultiSampleType(var2, var0, var1, anIntArray_1453[var10], true, var8) == 0)) {
                        for(int var11 = 0; var11 < anIntArray_1423.length; ++var11) {
                           if(IDirect3D.CheckDeviceFormat(var2, var0, var1, var9.anInt_9528, 2, 1, anIntArray_1423[var11]) == 0 && IDirect3D.CheckDepthStencilMatch(var2, var0, var1, var9.anInt_9528, anIntArray_1453[var10], anIntArray_1423[var11]) == 0 && (var4 == 0 || IDirect3D.CheckDeviceMultiSampleType(var2, var0, var1, anIntArray_1423[var10], true, var8) == 0)) {
                              var7 = anIntArray_1453[var10];
                              var6 = anIntArray_1423[var11];
                              break label75;
                           }
                        }
                     }
                  }
               }
            }

            if(var4 >= 0 && var7 != 0 && var6 != 0) {
               var5.anInt_1143 = var7;
               var5.anInt_1151 = var6;
               var5.anInt_1145 = var8;
               var5.anInt_1146 = 0;
               return true;
            } else {
               return false;
            }
         }
      } catch (Throwable var12) {
         return false;
      }
   }

   synchronized void method951(long var1) {
      if(this.anInt_1450 == this.anInt_1449) {
         this.anInt_1449 *= 2;
         long[] var3 = new long[this.anInt_1449];
         System.arraycopy(this.aLongArray_1451, 0, var3, 0, this.anInt_1450);
         this.aLongArray_1451 = var3;
      }

      this.aLongArray_1451[this.anInt_1450] = var1;
      ++this.anInt_1450;
   }

   void method7306(int var1) {
      if(!this.aBoolean_1448) {
         int var2 = (var1 & 2) != 0?2:3;
         IDirect3DDevice.SetRenderState(this.curScene, 8, var2);
      }

   }

   public Class99 method1918(int var1, int var2) {
      return new Class422(this, Class87.aClass87_1762, var1, var2, 0);
   }

   void method7287() {
      for(int var1 = 0; var1 < this.anInt_10641; ++var1) {
         IDirect3DDevice.SetSamplerState(this.curScene, var1, 7, 2);
         IDirect3DDevice.SetSamplerState(this.curScene, var1, 6, 2);
         IDirect3DDevice.SetSamplerState(this.curScene, var1, 5, 2);
         IDirect3DDevice.SetSamplerState(this.curScene, var1, 1, 1);
         IDirect3DDevice.SetSamplerState(this.curScene, var1, 2, 1);
         this.aClass389Array_1438[var1] = Class389.aClass389_7495;
         boolean[] var2 = this.aBooleanArray_1434;
         this.aBooleanArray_1447[var1] = true;
         var2[var1] = true;
         this.aBooleanArray_1437[var1] = false;
         this.anIntArray_1443[var1] = 0;
      }

      IDirect3DDevice.SetTextureStageState(this.curScene, 0, 6, 1);
      IDirect3DDevice.SetRenderState(this.curScene, 9, 2);
      IDirect3DDevice.SetRenderState(this.curScene, 23, 4);
      IDirect3DDevice.SetRenderState(this.curScene, 25, 5);
      IDirect3DDevice.SetRenderState(this.curScene, 24, 0);
      IDirect3DDevice.SetRenderState(this.curScene, 22, 2);
      IDirect3DDevice.SetRenderState(this.curScene, 147, 1);
      IDirect3DDevice.SetRenderState(this.curScene, 145, 1);
      IDirect3DDevice.method6283(this.curScene, 38, 0.95F);
      IDirect3DDevice.SetRenderState(this.curScene, 35, 3);
      IDirect3DDevice.method6283(this.curScene, 154, 1.0F);
      D3DLIGHT.SetType(this.aLong_1430, 3);
      D3DLIGHT.SetType(this.aLong_1427, 3);
      D3DLIGHT.SetType(this.aLong_1446, 1);
      IDirect3DDevice.SetRenderState(this.curScene, 206, 1);
      this.aBoolean_1444 = false;
      super.method7287();
   }

   final void method955(Class328_Sub3 var1) {
      this.method964(var1);
      if(this.aBooleanArray_1434[this.anInt_10511] != var1.aBoolean_4022) {
         IDirect3DDevice.SetSamplerState(this.curScene, this.anInt_10511, 1, var1.aBoolean_4022?1:3);
         this.aBooleanArray_1434[this.anInt_10511] = var1.aBoolean_4022;
      }

      if(this.aBooleanArray_1447[this.anInt_10511] != var1.aBoolean_4023) {
         IDirect3DDevice.SetSamplerState(this.curScene, this.anInt_10511, 2, var1.aBoolean_4023?1:3);
         this.aBooleanArray_1447[this.anInt_10511] = var1.aBoolean_4023;
      }

   }

   boolean method7213(Class136 var1, Class87 var2) {
      D3DDISPLAYMODE var3 = new D3DDISPLAYMODE();
      return h.method187(IDirect3D.GetAdapterDisplayMode(this.aLong_1425, this.anInt_1452, var3)) && h.method187(IDirect3D.CheckDeviceFormat(this.aLong_1425, this.anInt_1452, this.anInt_1424, var3.anInt_9528, 0, 4, method958(var1, var2)));
   }

   public void method7225() {
      if(this.aBooleanArray_1439[this.anInt_10511]) {
         this.aBooleanArray_1439[this.anInt_10511] = false;
         IDirect3DDevice.SetTexture(this.curScene, this.anInt_10511, 0L);
         this.method7291();
         this.method7321();
      }

   }

   static final int method958(Class136 var0, Class87 var1) {
      switch(var1.anInt_1768 * 636465333) {
      case 0:
         switch(var0.anInt_2635 * 420406933) {
         case 1:
            return m.anInt_749 * 1768452323;
         case 2:
            return 21;
         case 3:
            return 22;
         case 4:
         default:
            throw new IllegalArgumentException("");
         case 5:
            return 77;
         case 6:
            return 28;
         case 7:
            return 51;
         case 8:
            return m.anInt_748 * -641215969;
         case 9:
            return 50;
         }
      case 1:
         if(var0 == Class136.aClass136_2625) {
            return 116;
         }
      case 2:
      case 3:
      default:
         break;
      case 4:
         if(var0 == Class136.aClass136_2625) {
            return 113;
         }
      }

      throw new IllegalArgumentException("");
   }

   Class384 method7219(int var1, int var2, boolean var3, int[] var4, int var5, int var6) {
      return new Class328_Sub3(this, var1, var2, var3, var4, var5, var6);
   }

   void method7202() {
      IDirect3DDevice.method6284(this.curScene, 14, this.aBoolean_10566 && this.aBoolean_10555);
   }

   static final int method961(Class404 var0) {
      switch(var0.anInt_7658) {
      case 0:
         return 3;
      case 1:
         return 256;
      case 2:
         return 2;
      case 3:
         return 1;
      case 4:
         return 4;
      default:
         return 0;
      }
   }

   Class379 method7250(Class402[] var1) {
      return new Class379_Sub1(this, var1);
   }

   Class384 method7217(Class136 var1, Class87 var2, int var3, int var4) {
      return new Class328_Sub3(this, var1, var2, var3, var4);
   }

   final void method964(Class328 var1) {
      IDirect3DDevice.SetTexture(this.curScene, this.anInt_10511, var1.method4040());
      if(this.aBoolean_10505 && !this.aBooleanArray_1439[this.anInt_10511]) {
         this.aBooleanArray_1439[this.anInt_10511] = true;
         this.method7291();
         this.method7321();
      }

   }

   public Class101 method1927(int var1, int var2, Class136 var3, Class87 var4, int var5) {
      return new Class427(this, var3, var4, var1, var2, var5);
   }

   void method7321() {
      if(this.aBoolean_10505) {
         int var1 = this.aBooleanArray_1439[this.anInt_10511]?method930(this.aClass392Array_10575[this.anInt_10511]):1;
         IDirect3DDevice.SetTextureStageState(this.curScene, this.anInt_10511, 1, var1);
      }

   }

   public void method1907() {}

   Class174_Sub2 method1903(Canvas var1, int var2, int var3) {
      return new Class174_Sub2_Sub2_Sub2(this, var1, var2, var3, false);
   }

   static final int method969(Class87 var0) {
      if(var0 == Class87.aClass87_1763) {
         return 80;
      } else if(var0 == Class87.aClass87_1762) {
         return 77;
      } else {
         throw new IllegalArgumentException("");
      }
   }

   void method7248(boolean var1) {
      IDirect3DDevice.method6284(this.curScene, 161, var1);
   }

   void method7310() {
      if(this.aBoolean_10505) {
         float var1 = this.aBoolean_10572?this.aFloat_10561:0.0F;
         float var2 = this.aBoolean_10572?-this.aFloat_10584:0.0F;
         D3DLIGHT.SetDiffuse(this.aLong_1430, var1 * this.aFloat_10579, var1 * this.aFloat_10580, var1 * this.aFloat_10651, 0.0F);
         D3DLIGHT.SetDiffuse(this.aLong_1427, var2 * this.aFloat_10579, var2 * this.aFloat_10580, var2 * this.aFloat_10651, 0.0F);
         this.aBoolean_1444 = false;
      }

   }

   public boolean method7129() {
      return (this.aD3DCAPS_1445.anInt_1691 & '\uffff') >= 257;
   }

   final Class76 method7320(boolean var1) {
      return new Class337(this, var1);
   }

   static final int method974(Class396 var0) {
      switch(var0.anInt_7575) {
      case 0:
         return 5;
      case 1:
         return 4;
      case 2:
         return 6;
      case 3:
         return 1;
      case 4:
         return 2;
      case 5:
         return 3;
      default:
         throw new IllegalArgumentException("");
      }
   }

   Class54 method7221(Class136 var1, int var2, int var3, int var4, boolean var5, byte[] var6) {
      return new Class328_Sub1(this, var1, var2, var3, var4, var5, var6);
   }
}
