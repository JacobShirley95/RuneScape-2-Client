import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;

public abstract class AbstractKeyboardHandler {

   static final int anInt_4156 = 129;
   static final int anInt_4157 = 137;
   static final int anInt_4158 = 2;
   static final int anInt_4159 = 41;
   public static final int anInt_4160 = 105;
   static final int anInt_4161 = 5;
   public static final int anInt_4162 = 97;
   public static final int anInt_4163 = 98;
   static final int anInt_4164 = 16;
   static final int anInt_4165 = 9;
   static final int anInt_4166 = 10;
   public static final int anInt_4167 = 103;
   static final int anInt_4168 = 20;
   static final int anInt_4169 = 49;
   static final int anInt_4170 = 17;
   static final int anInt_4171 = 18;
   public static final int anInt_4172 = 101;
   static final int anInt_4173 = 8;
   static final int anInt_4174 = 21;
   static final int anInt_4175 = 22;
   static final int anInt_4176 = 23;
   static final int anInt_4177 = 24;
   static final int anInt_4178 = 25;
   static final int anInt_4179 = 26;
   static final int anInt_4180 = 27;
   static final int anInt_4181 = 32;
   static final int anInt_4182 = 83;
   static final int anInt_4183 = 34;
   static final int anInt_4184 = 35;
   static final int anInt_4185 = 6;
   static final int anInt_4186 = 37;
   static final int anInt_4187 = 38;
   static final int anInt_4188 = 33;
   static final int anInt_4189 = 40;
   static final int anInt_4190 = 11;
   static final int anInt_4191 = 42;
   static final int anInt_4192 = 160;
   static final int anInt_4193 = 131;
   static final int anInt_4194 = 43;
   static final int anInt_4195 = 50;
   public static final int anInt_4196 = 82;
   static final int anInt_4197 = 52;
   static final int anInt_4198 = 53;
   static final int anInt_4199 = 54;
   static final int anInt_4200 = 55;
   static final int anInt_4201 = 56;
   static final int anInt_4202 = 48;
   static final int anInt_4203 = 58;
   static final int anInt_4204 = 64;
   static final int anInt_4205 = 65;
   public static final int anInt_4206 = 66;
   public static final int anInt_4207 = 67;
   static final int anInt_4208 = 68;
   static final int anInt_4209 = 1;
   static final int anInt_4210 = 70;
   static final int anInt_4211 = 71;
   static final int anInt_4212 = 72;
   static final int anInt_4213 = 73;
   public static final int anInt_4214 = 80;
   public static final int anInt_4215 = 81;
   static final int anInt_4216 = 19;
   static final int anInt_4217 = 7;
   static final int anInt_4218 = 152;
   public static final int anInt_4219 = 85;
   public static final int anInt_4220 = 86;
   static final int anInt_4221 = 59;
   static final int anInt_4222 = 74;
   public static final int anInt_4223 = 28;
   static final int anInt_4224 = 87;
   static final int anInt_4225 = 88;
   static final int anInt_4226 = 89;
   static final int anInt_4227 = 90;
   static final int anInt_4228 = 3;
   public static final int anInt_4229 = 96;
   static final int anInt_4230 = 36;
   static final int anInt_4231 = 150;
   public static final int anInt_4232 = 99;
   static final int anInt_4233 = 100;
   static final int anInt_4234 = 39;
   public static final int anInt_4235 = 102;
   static final int anInt_4236 = 161;
   public static final int anInt_4237 = 104;
   static final int anInt_4238 = 138;
   static final int anInt_4239 = 128;
   static final int anInt_4240 = 4;
   static final int anInt_4241 = 130;
   static final int anInt_4242 = 12;
   static final int anInt_4243 = 132;
   static final int anInt_4244 = 133;
   static final int anInt_4245 = 134;
   static final int anInt_4246 = 151;
   static final int anInt_4247 = 136;
   static final int anInt_4248 = 51;
   static final int anInt_4249 = 135;
   static final int anInt_4250 = 139;
   static final int anInt_4251 = 13;
   static final int anInt_4252 = 141;
   static final int anInt_4253 = 142;
   static final int anInt_4254 = 143;
   static final int anInt_4255 = 91;
   static final int anInt_4256 = 69;
   static final int anInt_4257 = 140;
   static final int anInt_4258 = 153;
   public static final int anInt_4259 = 84;
   static final int anInt_4260 = 57;
   static final int anInt_4261 = 162;
   public static Class457 aClass457_4262;


   public abstract void captureKeyboard(int var1);

   public abstract boolean method3208(int var1, int var2);

   public abstract Class233 method3209(int var1);

   public abstract void method3210(int var1);

   static final void method3211(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, int var3) {
      String var4 = (String)var2.stringData[(var2.stringDataIndex -= -1828074049) * 863838783];
      int[] var5 = Class557.extractInterfaceIntData(var4, var2, 1572385531);
      if(var5 != null) {
         var4 = var4.substring(0, var4.length() - 1);
      }

      var0.anObjectArray_2554 = Class133.extractInterfaceData(var4, var2, (byte)86);
      var0.anIntArray_2474 = var5;
      var0.aBoolean_2524 = true;
   }

   static final void method3212(RSInterfaceData var0, short var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = -28225993 * var3.anInt_2469 == 1?1007149995 * var3.anInt_2416:-1;
   }

   static final void method3213(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = 1677361569 * client.anInt_538;
   }

   static final void method3214(RSInterfaceData var0, int var1) {
      String var2 = "";
      if(Class1024_Sub3.aClipboard_10983 != null) {
         Transferable var3 = Class1024_Sub3.aClipboard_10983.getContents((Object)null);
         if(null != var3) {
            try {
               var2 = (String)var3.getTransferData(DataFlavor.stringFlavor);
               if(var2 == null) {
                  var2 = "";
               }
            } catch (Exception var5) {
               ;
            }
         }
      }

      var0.stringData[(var0.stringDataIndex += -1828074049) * 863838783 - 1] = var2;
   }

   static final void method3215(RSInterfaceData var0, int var1) {
      String var2 = (String)var0.stringData[(var0.stringDataIndex -= -1828074049) * 863838783];
      AbstractMouseNode.method4944(var2, 1928769979);
   }

   static final void method3216(RSInterfaceData var0, short var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class592.cacheObjectLoader.getObjectDescriptor(var2).inBank?1:0;
   }
}
