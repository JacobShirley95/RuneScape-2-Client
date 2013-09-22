import java.io.IOException;

public class ParameterNode {

   public static final ParameterNode aClass424_8039 = new ParameterNode("27", "27");
   static final ParameterNode aClass424_8040 = new ParameterNode("5", "5");
   static final ParameterNode aClass424_8041 = new ParameterNode("33", "33");
   static final ParameterNode aClass424_8042 = new ParameterNode("2", "2");
   static final ParameterNode aClass424_8043 = new ParameterNode("30", "30");
   static final ParameterNode aClass424_8044 = new ParameterNode("16", "16");
   static final ParameterNode aClass424_8045 = new ParameterNode("28", "28");
   static final ParameterNode aClass424_8046 = new ParameterNode("17", "17");
   static final ParameterNode aClass424_8047 = new ParameterNode("9", "9");
   static final ParameterNode aClass424_8048 = new ParameterNode("12", "12");
   static final ParameterNode aClass424_8049 = new ParameterNode("36", "36");
   static final ParameterNode aClass424_8050 = new ParameterNode("34", "34");
   static final ParameterNode aClass424_8051 = new ParameterNode("8", "8");
   static final ParameterNode aClass424_8052 = new ParameterNode("20", "20");
   static final ParameterNode aClass424_8053 = new ParameterNode("26", "26");
   static final ParameterNode aClass424_8054 = new ParameterNode("13", "13");
   static final ParameterNode aClass424_8055 = new ParameterNode("14", "14");
   static final ParameterNode aClass424_8056 = new ParameterNode("21", "21");
   static final ParameterNode aClass424_8057 = new ParameterNode("24", "24");
   public static final ParameterNode aClass424_8058 = new ParameterNode("37", "37");
   static final ParameterNode aClass424_8059 = new ParameterNode("15", "15");
   static final ParameterNode aClass424_8060 = new ParameterNode("10", "10");
   static final ParameterNode aClass424_8061 = new ParameterNode("3", "3");
   static final ParameterNode aClass424_8062 = new ParameterNode("32", "32");
   static final ParameterNode aClass424_8063 = new ParameterNode("31", "31");
   static final ParameterNode aClass424_8064 = new ParameterNode("23", "23");
   static final ParameterNode aClass424_8065 = new ParameterNode("4", "4");
   static final ParameterNode aClass424_8066 = new ParameterNode("7", "7");
   static final ParameterNode aClass424_8067 = new ParameterNode("38", "38");
   static final ParameterNode aClass424_8068 = new ParameterNode("22", "22");
   static final ParameterNode aClass424_8069 = new ParameterNode("11", "11");
   static final ParameterNode aClass424_8070 = new ParameterNode("25", "25");
   static final ParameterNode aClass424_8071 = new ParameterNode("29", "29");
   static final ParameterNode aClass424_8072 = new ParameterNode("35", "35");
   static final ParameterNode aClass424_8073 = new ParameterNode("18", "18");
   static final ParameterNode aClass424_8074 = new ParameterNode("1", "1");
   public final String parameterStringIndex;
   static final ParameterNode aClass424_8076 = new ParameterNode("6", "6");
   public static long aLong_8077;
   public static int anInt_8078;


   ParameterNode(String var1, String var2) {
      this.parameterStringIndex = var2;
   }

   public static void method5290(ByteArrayDataNode var0, byte var1) {
      byte[] var2 = new byte[24];

      try {
         ClientSuper.randomDataFile.seek(0L);
         ClientSuper.randomDataFile.fillArray(var2, -1444668868);

         int var3;
         for(var3 = 0; var3 < 24 && var2[var3] == 0; ++var3) {
            ;
         }

         if(var3 >= 24) {
            throw new IOException();
         }
      } catch (Exception var5) {
         for(int var4 = 0; var4 < 24; ++var4) {
            var2[var4] = -1;
         }
      }

      var0.putBytes(var2, 0, 24, -144707030);
   }

   static final void method5291(RSInterfaceData var0, byte var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class592.cacheObjectLoader.getObjectDescriptor(var2).anInt_8477 * -742835789;
   }

   public static float method5292(float var0, float var1, byte var2) {
      double var3 = Math.atan2((double)var0, (double)var1);
      if(var3 < 0.0D) {
         var3 = 3.141592653589793D + 3.141592653589793D + var3;
      }

      return (float)var3;
   }

   static final void method5293(RSInterfaceData var0, int var1) {
      ConnectionHandler var2 = Class32.method230(1259142063);
      Class240_Sub27 var3 = Class47_Sub1.method3496(Class326.aClass326_6285, var2.aClass528_3433, 1917447504);
      var3.aClass240_Sub8_Sub1_7370.putByte(0, -105854621);
      int var4 = 964952859 * var3.aClass240_Sub8_Sub1_7370.index;
      var3.aClass240_Sub8_Sub1_7370.putByte(3, -1649063555);
      var3.aClass240_Sub8_Sub1_7370.method4463(var0.aClass420_9507.anInt_7968 * -405493655, -213952179);
      var0.aClass420_9507.aClass240_Sub22_Sub16_7967.method2676(var3.aClass240_Sub8_Sub1_7370, var0.aClass420_9507.anIntArray_7966, 1086212751);
      var3.aClass240_Sub8_Sub1_7370.method4521(var3.aClass240_Sub8_Sub1_7370.index * 964952859 - var4, -907432342);
      var2.addPacket(var3, 1566393256);
   }

   public static final void method5294(String var0, String var1, int var2) {
      ConnectionHandler var3 = Class32.method230(-767976143);
      Class240_Sub27 var4 = Class47_Sub1.method3496(Class326.aClass326_6318, var3.aClass528_3433, 1917447504);
      if(var1.length() > 30) {
         var1 = var1.substring(0, 30);
      }

      var4.aClass240_Sub8_Sub1_7370.putByte(Class258.method3383(var0, -730190853) + Class258.method3383(var1, -1934962298), -95291289);
      var4.aClass240_Sub8_Sub1_7370.putString(var1, (byte)-81);
      var4.aClass240_Sub8_Sub1_7370.putString(var0, (byte)-38);
      var3.addPacket(var4, 584406411);
   }

   static final void method5295(RSInterfaceData var0, int var1) {
      if(var0.anInt_9505 * 853810813 != 0) {
         Class566 var2 = var0.interfaceData[(var0.anInt_9505 -= 1307888341) * 853810813];
         var0.composite = var2.interfaceComp;
         var0.actions = var0.composite.actions;
         var0.anIntArray_9518 = var0.composite.anIntArray_3544;
         var0.anInt_9510 = 853889937 * var2.anInt_9611;
         var0.mouseData = var2.anIntArray_9614;
         var0.objectData = var2.anObjectArray_9613;
         var0.aLongArray_9494 = var2.aLongArray_9610;
      }
   }
}
