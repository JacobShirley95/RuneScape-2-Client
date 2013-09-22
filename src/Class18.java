import java.awt.Canvas;
import java.io.IOException;

public class Class18 {

   static int anInt_141 = 0;
   static NodeList optionNodeList = new NodeList();
   static OptionListNode cancelOption;
   static int anInt_144 = 129754608;
   static final int anInt_145 = 31;
   static final int anInt_146 = 31;
   public static boolean optionsClosed = false;
   static boolean aBoolean_148 = false;
   static final int anInt_149 = 1;
   static final int anInt_150 = 0;
   public static final int anInt_151 = 7;
   static int anInt_152 = 0;
   static final int anInt_153 = 8;
   static final int anInt_154 = 412;
   public static int anInt_155 = 0;
   static final int anInt_156 = 504;
   static NodeArrayList aNodeArrayList_157 = new NodeArrayList(16);
   static Class494 aClass494_158 = new Class494();
   static NodeList aNodeList_159 = new NodeList();
   static NodeList aNodeList_160 = new NodeList();
   static CacheNodeArrayList aClass627_161 = new CacheNodeArrayList(30);
   static final int anInt_162 = 2;
   static int anInt_163 = 1035806777;
   static final int anInt_164 = 1;
   static int anInt_165 = -687603161;
   static Class240_Sub22_Sub1 aClass240_Sub22_Sub1_166 = null;
   static int anInt_167 = 0;
   static final int anInt_168 = 2;
   static ArrayViewport anArrayViewport_169 = null;
   static ArrayViewport anArrayViewport_170 = new ArrayViewport();
   public static int optionCount = 0;
   public static boolean aBoolean_172 = false;
   static FontRenderer aTextRenderer_173;
   static int anInt_174 = -1209347097;
   public static int anInt_175 = 61405211;
   static CacheNodeArrayList aClass627_176 = new CacheNodeArrayList(8);
   static float[] aFloatArray_177 = new float[4];
   static final int anInt_178 = 0;
   static int anInt_179 = 0;
   static Viewport aViewport_180 = new Viewport();
   static final int anInt_181 = 3;
   static int anInt_182 = 744833045;
   static final int anInt_183 = 5;
   static final int anInt_184 = 6;
   static RSInterface aClass132_185 = null;
   public static final int anInt_186 = 4;


   Class18() throws Throwable {
      throw new Error();
   }

   public static void method94(int var0) {
      if((-243034353 * client.loginStage == 6 || 10 == -243034353 * client.loginStage) && null != client.gameConnectionHandler) {
         while(true) {
            Class262 var1 = (Class262)Class267.aLinkedList_4640.poll();
            if(var1 == null) {
               return;
            }

            var1.method3492((byte)7);
         }
      }
   }

   static final void method95(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      Class612.method6570(var3, var4, var0, 1712177508);
   }

   static final void method96(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, int var3) {
      var0.actionName = (String)var2.stringData[(var2.stringDataIndex -= -1828074049) * 863838783];
   }

   static final void method97(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      if(2 == -826987519 * client.anInt_567 && var2 < client.friendsCount * -1301826725) {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = client.friendsList[var2].anInt_54 * -570785823;
      } else {
         var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 0;
      }

   }

   static final void method98(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = ((Class563_Sub1)var0.aClass218_9511).getHeight();
   }

   public static void method99(boolean var0, int var1) {
      Class417.method5179((byte)24);
      if(Class547.method6103(-243034353 * client.loginStage, -187201058)) {
         ConnectionHandler[] var2 = client.openConnections;

         for(int var3 = 0; var3 < var2.length; ++var3) {
            ConnectionHandler var4 = var2[var3];
            var4.anInt_3447 += -92815543;
            if(-18521351 * var4.anInt_3447 < 50 && !var0) {
               return;
            }

            var4.anInt_3447 = 0;
            if(!var4.aBoolean_3453 && var4.getServerConnection() != null) {
               Class240_Sub27 var5 = Class47_Sub1.method3496(Class326.aClass326_6217, var4.aClass528_3433, 1917447504);
               var4.addPacket(var5, 644760534);

               try {
                  var4.method2541((byte)-102);
               } catch (IOException var7) {
                  var4.aBoolean_3453 = true;
               }
            }
         }

         Class417.method5179((byte)24);
      }
   }

   static final void method100(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 0;
   }

   public static final Class240_Sub16 method101(int var0, Class240_Sub16 var1, int[] var2, boolean var3, int var4) {
      Class240_Sub16 var5 = (Class240_Sub16)client.widgets.getNode((long)var0);
      if(var5 != null) {
         Class104_Sub8.method3387(var5, 1320796941 * var1.widgetID != 1320796941 * var5.widgetID, var3, (byte)-1);
      }

      client.widgets.insert(var1, (long)var0);
      Class129.method1669(var1.widgetID * 1320796941, var2, (byte)71);
      RSInterface var6 = RSServerQueue.getInterface(var0, (byte)105);
      if(null != var6) {
         Class110_Sub1.method3149(var6, 383671641);
      }

      if(client.aClass132_335 != null) {
         Class110_Sub1.method3149(client.aClass132_335, -265076078);
         client.aClass132_335 = null;
      }

      Class129.method1666((byte)-19);
      if(null != var6) {
         Class20.method120(RSInterface.interfaceGroups[var6.cacheID * 1278853609 >>> 16], var6, !var3, 1102672429);
      }

      if(!var3) {
         Class240_Sub25.method4845(var1.widgetID * 1320796941, var2, -398576817);
      }

      if(!var3 && 1854782309 * client.anInt_468 != -1) {
         Class462.method5591(1854782309 * client.anInt_468, 1, 1685123114);
      }

      return var1;
   }

   public static Renderer getSoftwareRenderer(Canvas var0, Class163 var1, Class96 var2, int var3, int var4, int var5) {
      return new SoftwareRenderer(var0, var1, var2, var3, var4);
   }
}
