import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

public abstract class AbstractServerConnection {

   static int mapEdgeHintOffset;
   public static Class212_Sub1_Sub2 aClass212_Sub1_Sub2_4038;


   public abstract int method3064(byte[] var1, int var2, int var3, short var4) throws IOException;

   public abstract boolean method3065(int var1, int var2) throws IOException;

   public abstract int method3066(byte var1) throws IOException;

   public abstract void method3067(byte var1);

   public abstract void method3068(byte[] var1, int var2, int var3, byte var4) throws IOException;

   public abstract void close();

   public static final int method3070(long var0, String var2, int var3) {
      Random var4 = new Random();
      ByteArrayDataNode var5 = new ByteArrayDataNode(128);
      ByteArrayDataNode var6 = new ByteArrayDataNode(128);
      int[] var7 = new int[]{var4.nextInt(), var4.nextInt(), (int)(var0 >> 32), (int)var0};
      var5.putByte(10, -1552698067);

      int var8;
      for(var8 = 0; var8 < 4; ++var8) {
         var5.putIntBE(var4.nextInt(), 2062892803);
      }

      var5.putIntBE(var7[0], 2062892803);
      var5.putIntBE(var7[1], 2062892803);
      var5.putLong(var0);
      var5.putLong(0L);

      for(var8 = 0; var8 < 4; ++var8) {
         var5.putIntBE(var4.nextInt(), 2062892803);
      }

      var5.method4504(Class24.aBigInteger_210, Class24.aBigInteger_211, (byte)-95);
      var6.putByte(10, -772441664);

      for(var8 = 0; var8 < 3; ++var8) {
         var6.putIntBE(var4.nextInt(), 2062892803);
      }

      var6.putLong(var4.nextLong());
      var6.method4536(var4.nextLong());
      ParameterNode.method5290(var6, (byte)12);
      var6.putLong(var4.nextLong());
      var6.method4504(Class24.aBigInteger_210, Class24.aBigInteger_211, (byte)6);
      var8 = Class258.method3383(var2, -46824973);
      if(var8 % 8 != 0) {
         var8 += 8 - var8 % 8;
      }

      ByteArrayDataNode var9 = new ByteArrayDataNode(var8);
      var9.putString(var2, (byte)-50);
      var9.index = var8 * -2043502829;
      var9.method4537(var7, -1891412674);
      ByteArrayDataNode var10 = new ByteArrayDataNode(var6.index * 964952859 + 5 + var5.index * 964952859 + var9.index * 964952859);
      var10.putByte(2, -1470600168);
      var10.putByte(var5.index * 964952859, -963250665);
      var10.putBytes(var5.data, 0, 964952859 * var5.index, -144707030);
      var10.putByte(964952859 * var6.index, -209127108);
      var10.putBytes(var6.data, 0, 964952859 * var6.index, -144707030);
      var10.method4463(964952859 * var9.index, 2077925353);
      var10.putBytes(var9.data, 0, var9.index * 964952859, -144707030);
      String var11 = Class595.method6446(var10.data, (byte)16);

      try {
         URL var12 = new URL(Class195.method2530("services", false, (byte)0) + "m=accountappeal/login.ws");
         URLConnection var13 = var12.openConnection();
         var13.setDoInput(true);
         var13.setDoOutput(true);
         var13.setConnectTimeout(5000);
         OutputStreamWriter var14 = new OutputStreamWriter(var13.getOutputStream());
         var14.write("data2=" + Class370.method4697(var11, -692921010) + "&dest=" + Class370.method4697("passwordchoice.ws", 1826638799));
         var14.flush();
         InputStream var15 = var13.getInputStream();
         var10 = new ByteArrayDataNode(new byte[1000]);

         do {
            int var16 = var15.read(var10.data, var10.index * 964952859, 1000 - 964952859 * var10.index);
            if(-1 == var16) {
               var14.close();
               var15.close();
               String var18 = new String(var10.data);
               if(var18.startsWith("OFFLINE")) {
                  return 4;
               } else if(var18.startsWith("WRONG")) {
                  return 7;
               } else if(var18.startsWith("RELOAD")) {
                  return 3;
               } else if(var18.startsWith("Not permitted for social network accounts.")) {
                  return 6;
               } else {
                  var10.method4495(var7, (byte)126);

                  while(var10.index * 964952859 > 0 && var10.data[var10.index * 964952859 - 1] == 0) {
                     var10.index -= -2043502829;
                  }

                  var18 = new String(var10.data, 0, var10.index * 964952859);
                  if(Class429.method5315(var18, (short)251)) {
                     Class167.method2082(var18, true, client.aBoolean_285, (byte)-24);
                     return 2;
                  } else {
                     return 5;
                  }
               }
            }

            var10.index += -2043502829 * var16;
         } while(var10.index * 964952859 < 1000);

         return 5;
      } catch (Throwable var17) {
         var17.printStackTrace();
         return 5;
      }
   }

   static final void method3071(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      var0.intTypeIndex -= -1416056414;
      int var4 = var0.intTypes[var0.intTypeIndex * -831324111];
      int var5 = var0.intTypes[1 + var0.intTypeIndex * -831324111];
      Class476 var6 = Class240_Sub1.aClass465_6506.method5610(var4, -1288752007);
      if(-80630797 * var6.anInt_8739 != var5) {
         var3.method1719(var4, var5, 73991305);
      } else {
         var3.method1702(var4, -2133600447);
      }

   }

   static final void method3072(RSInterfaceData var0, int var1) {
      var0.intTypeIndex -= -1416056414;
      client.anInt_371 = var0.intTypes[var0.intTypeIndex * -831324111] * -731250983;
      client.anInt_461 = -1069958275 * var0.intTypes[-831324111 * var0.intTypeIndex + 1];
   }

   static final void method3073(RSInterfaceData var0, int var1) {
      boolean var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111] == 1;
      if(var2) {
         Plane.method2165(2, (byte)125);
      } else {
         Plane.method2165(3, (byte)121);
      }

   }

   static void method3074(RSInterfaceData var0, byte var1) {
      var0.intTypes[var0.intTypeIndex * -831324111 - 1] = HintMarker.aClass583_3709.method6327(var0.intTypes[-831324111 * var0.intTypeIndex - 1], -273921696).aBoolean_9578?1:0;
   }

   static Class618 method3075(ByteArrayDataNode var0, int var1) {
      int var2 = var0.readByte(-477118586);
      int var3 = var0.readByte(-617403537);
      int var4 = var0.readByte(1171437853);
      int[] var5 = new int[var4];

      for(int var6 = 0; var6 < var4; ++var6) {
         var5[var6] = var0.readByte(2072939837);
      }

      return new Class618(var2, var3, var5);
   }

   static final void method3076(RSInterfaceData var0, int var1) {
      var0.intTypeIndex -= -708028207;
   }

   static final void method3077(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, byte var3) {
      var2.intTypeIndex -= -2124084621;
      int var4 = var2.intTypes[var2.intTypeIndex * -831324111];
      short var5 = (short)var2.intTypes[1 + var2.intTypeIndex * -831324111];
      short var6 = (short)var2.intTypes[2 + var2.intTypeIndex * -831324111];
      if(var4 >= 0 && var4 < 5) {
         var0.method1716(var4, var5, var6, (byte)4);
         Class110_Sub1.method3149(var0, -880682780);
         if(-1 == -1001687885 * var0.anInt_2428 && !var1.aBoolean_2054) {
            Class254.method3341(var0.cacheID * 1278853609, var4, 1780959220);
         }

      }
   }
}
