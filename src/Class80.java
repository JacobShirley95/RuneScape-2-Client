import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;

public class Class80 {

   long aLong_1524;
   long aLong_1525 = 2897250426264932597L;
   static final int anInt_1526 = 1;
   static final int anInt_1527 = 5;
   static final int anInt_1528 = 2;
   static final int anInt_1529 = 3;
   static final int anInt_1530 = 4;
   NodeList aNodeList_1531 = new NodeList();
   public static CacheDataUnpacker aCacheUnpacker_1532;


   void method1051(ByteArrayDataNode var1, byte var2) {
      this.aLong_1524 = var1.method4538(1385013726) * 4102900775812261953L;
      this.aLong_1525 = var1.method4538(1385013726) * -2897250426264932597L;

      for(int var3 = var1.readByte(-1116063855); 0 != var3; var3 = var1.readByte(628499661)) {
         Object var4;
         if(1 == var3) {
            var4 = new Class240_Sub44_Sub2(this);
         } else if(var3 == 4) {
            var4 = new Class240_Sub44_Sub5(this);
         } else if(3 == var3) {
            var4 = new Class240_Sub44_Sub1(this);
         } else if(var3 == 2) {
            var4 = new Class240_Sub44_Sub3(this);
         } else {
            if(5 != var3) {
               throw new RuntimeException("");
            }

            var4 = new Class240_Sub44_Sub4(this);
         }

         ((Class240_Sub44)var4).method4968(var1, 1438212940);
         this.aNodeList_1531.addNode((NodeListNode)var4, (short)15729);
      }

   }

   public Class80(ByteArrayDataNode var1) {
      this.method1051(var1, (byte)-26);
   }

   public void method1052(Class240_Sub47 var1, byte var2) {
      if(var1.id * 4058728944299054175L == 8014237639370155969L * this.aLong_1524 && var1.aLong_7666 * -6294407878710092803L == 7316059400772560035L * this.aLong_1525) {
         for(Class240_Sub44 var3 = (Class240_Sub44)this.aNodeList_1531.getBaseNode_2((byte)119); null != var3; var3 = (Class240_Sub44)this.aNodeList_1531.getNext(-1827799975)) {
            var3.method4967(var1, -1133997915);
         }

         var1.aLong_7666 += 3680757434486004053L;
      } else {
         throw new RuntimeException("");
      }
   }

   static final void method1053(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
      Class234.method3013(var3, var4, true, 0, var0, 183762371);
   }

   static final void method1054(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      CacheDataUnpacker.method3593(var3, var0, -1694498816);
   }

   static final void method1055(RSInterfaceData var0, int var1) {
      String var2 = (String)var0.stringData[(var0.stringDataIndex -= -1828074049) * 863838783];
      Class501.method5847(var2, (byte)42);
   }

   static final void method1056(RSInterfaceData var0, byte var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var0.aClass68_9508.anInt_1300 * -741316095;
   }

   public static final int method1057(int var0, int var1, int var2, int var3, int var4, byte var5) {
      if(client.aClass296_348.getWorldObjects() == null) {
         return 0;
      } else {
         if(var4 < 3) {
            Class281 var6 = client.aClass296_348.method3753();
            int var7 = var0 >> 9;
            int var8 = var1 >> 9;
            if(var2 < 0 || var3 < 0 || var2 > client.aClass296_348.getMaxX((byte)-60) - 1 || var3 > client.aClass296_348.getMaxY(1611614953) - 1) {
               return 0;
            }

            if(var7 < 1 || var8 < 1 || var7 > client.aClass296_348.getMaxX((byte)-31) - 1 || var8 > client.aClass296_348.getMaxY(82075762) - 1) {
               return 0;
            }

            boolean var9 = (var6.aByteArrayArrayArray_4768[1][var0 >> 9][var1 >> 9] & 2) != 0;
            boolean var10;
            boolean var11;
            if((var0 & 511) == 0) {
               var10 = 0 != (var6.aByteArrayArrayArray_4768[1][var7 - 1][var1 >> 9] & 2);
               var11 = (var6.aByteArrayArrayArray_4768[1][var7][var1 >> 9] & 2) != 0;
               if(var10 != var11) {
                  var9 = 0 != (var6.aByteArrayArrayArray_4768[1][var2][var3] & 2);
               }
            }

            if((var1 & 511) == 0) {
               var10 = 0 != (var6.aByteArrayArrayArray_4768[1][var0 >> 9][var8 - 1] & 2);
               var11 = (var6.aByteArrayArrayArray_4768[1][var0 >> 9][var8] & 2) != 0;
               if(var11 != var10) {
                  var9 = 0 != (var6.aByteArrayArrayArray_4768[1][var2][var3] & 2);
               }
            }

            if(var9) {
               ++var4;
            }
         }

         return client.aClass296_348.getWorldObjects().planes[var4].getHeight(var0, var1);
      }
   }

   static void drawMapIcons(Renderer var0, NodeList var1, int var2, int var3, byte var4) {
      IgnoredPlayer.aNodeList_114.clear(-703993930);
      if(!Class248_Sub1.aBoolean_6455) {
         for(Class240_Sub12 var5 = (Class240_Sub12)var1.getBaseNode_2((byte)4); var5 != null; var5 = (Class240_Sub12)var1.getNext(-1728405714)) {
            MapIcon var6 = Class248_Sub1.mapIconUnpacker.loadIcon(var5.anInt_6801 * 781228131);
            if(Class540_Sub16.method1784(var6, -2143786837)) {
               boolean var7 = Class77.method987(var0, var5, var6, var2, var3, 615464709);
               if(var7) {
                  NodeArrayList.method5944(var0, var5, var6, (byte)-115);
               }
            }
         }

      }
   }

   static Class417[] method1059(byte var0) {
      return new Class417[]{Class417.aClass417_7920, Class417.aClass417_7921, Class417.aClass417_7926, Class417.aClass417_7930, Class417.aClass417_7924, Class417.aClass417_7925, Class417.aClass417_7928, Class417.aClass417_7919, Class417.aClass417_7922, Class417.aClass417_7932, Class417.aClass417_7929, Class417.aClass417_7931, Class417.aClass417_7923};
   }

   static final void method1060(RSInterfaceData var0, int var1) {
      var0.intTypeIndex -= -708028207;
   }

   static String method1061(Throwable var0, int var1) throws IOException {
      String var3;
      if(var0 instanceof RuntimeException_Sub3) {
         RuntimeException_Sub3 var2 = (RuntimeException_Sub3)var0;
         var3 = var2.aString_3273 + " | ";
         var0 = var2.aThrowable_3276;
      } else {
         var3 = "";
      }

      StringWriter var13 = new StringWriter();
      PrintWriter var4 = new PrintWriter(var13);
      var0.printStackTrace(var4);
      var4.close();
      String var5 = var13.toString();
      BufferedReader var6 = new BufferedReader(new StringReader(var5));
      String var7 = var6.readLine();

      while(true) {
         String var8 = var6.readLine();
         if(null == var8) {
            var3 = var3 + "| " + var7;
            return var3;
         }

         int var9 = var8.indexOf(40);
         int var10 = var8.indexOf(41, var9 + 1);
         String var11;
         if(var9 != -1) {
            var11 = var8.substring(0, var9);
         } else {
            var11 = var8;
         }

         var11 = var11.trim();
         var11 = var11.substring(var11.lastIndexOf(32) + 1);
         var11 = var11.substring(var11.lastIndexOf(9) + 1);
         var3 = var3 + var11;
         if(var9 != -1 && -1 != var10) {
            int var12 = var8.indexOf(".java:", var9);
            if(var12 >= 0) {
               var3 = var3 + var8.substring(5 + var12, var10);
            }
         }

         var3 = var3 + ' ';
      }
   }
}
