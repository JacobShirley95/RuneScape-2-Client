import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Class26 {

   static final Class26 aClass26_267 = new Class26();
   static final Class26 aClass26_268 = new Class26();
   static int[] anIntArray_269;


   static final void method158(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, int var3) {
      String var4 = (String)var2.stringData[(var2.stringDataIndex -= -1828074049) * 863838783];
      if(Class557.extractInterfaceIntData(var4, var2, 1899521184) != null) {
         var4 = var4.substring(0, var4.length() - 1);
      }

      var0.anObjectArray_2461 = Class133.extractInterfaceData(var4, var2, (byte)39);
      var0.aBoolean_2524 = true;
   }

   public static boolean method159(int var0, byte var1) {
      return var0 >= Class495.aClass495_9049.anInt_9062 * -1965975883 && var0 <= Class495.aClass495_9055.anInt_9062 * -1965975883;
   }

   public static void method160(ByteArrayDataNode_Sub1 var0, int var1) {
      Class240_Sub1 var2 = (Class240_Sub1)Class462.aNodeList_8603.getBaseNode_2((byte)117);
      if(var2 != null) {
         int var3 = var0.index * 964952859;
         var0.putIntBE(var2.anInt_6497 * -1924046481, 2062892803);

         for(int var4 = 0; var4 < var2.anInt_6498 * -542960649; ++var4) {
            if(0 != var2.anIntArray_6500[var4]) {
               var0.putByte(var2.anIntArray_6500[var4], 29781372);
            } else {
               try {
                  int var5 = var2.anIntArray_6501[var4];
                  Field var6;
                  int var7;
                  if(0 == var5) {
                     var6 = var2.aFieldArray_6499[var4];
                     var7 = var6.getInt((Object)null);
                     var0.putByte(0, -486819826);
                     var0.putIntBE(var7, 2062892803);
                  } else if(var5 == 1) {
                     var6 = var2.aFieldArray_6499[var4];
                     var6.setInt((Object)null, var2.anIntArray_6502[var4]);
                     var0.putByte(0, -260308586);
                  } else if(var5 == 2) {
                     var6 = var2.aFieldArray_6499[var4];
                     var7 = var6.getModifiers();
                     var0.putByte(0, -1696635136);
                     var0.putIntBE(var7, 2062892803);
                  }

                  Method var23;
                  if(var5 == 3) {
                     var23 = var2.aMethodArray_6503[var4];
                     byte[][] var24 = var2.aByteArrayArrayArray_6504[var4];
                     Object[] var8 = new Object[var24.length];

                     for(int var9 = 0; var9 < var24.length; ++var9) {
                        ObjectInputStream var10 = new ObjectInputStream(new ByteArrayInputStream(var24[var9]));
                        var8[var9] = var10.readObject();
                     }

                     Object var25 = var23.invoke((Object)null, var8);
                     if(null == var25) {
                        var0.putByte(0, 324730128);
                     } else if(var25 instanceof Number) {
                        var0.putByte(1, 1016919501);
                        var0.putLong(((Number)var25).longValue());
                     } else if(var25 instanceof String) {
                        var0.putByte(2, -309121256);
                        var0.putString((String)var25, (byte)-61);
                     } else {
                        var0.putByte(4, -730613426);
                     }
                  } else if(4 == var5) {
                     var23 = var2.aMethodArray_6503[var4];
                     var7 = var23.getModifiers();
                     var0.putByte(0, -1671851979);
                     var0.putIntBE(var7, 2062892803);
                  }
               } catch (ClassNotFoundException var11) {
                  var0.putByte(-10, -1183192648);
               } catch (InvalidClassException var12) {
                  var0.putByte(-11, 1692300763);
               } catch (StreamCorruptedException var13) {
                  var0.putByte(-12, 1254454398);
               } catch (OptionalDataException var14) {
                  var0.putByte(-13, 1081652832);
               } catch (IllegalAccessException var15) {
                  var0.putByte(-14, 1926008812);
               } catch (IllegalArgumentException var16) {
                  var0.putByte(-15, -49005581);
               } catch (InvocationTargetException var17) {
                  var0.putByte(-16, -272016084);
               } catch (SecurityException var18) {
                  var0.putByte(-17, -1220442706);
               } catch (IOException var19) {
                  var0.putByte(-18, -998358812);
               } catch (NullPointerException var20) {
                  var0.putByte(-19, 792943375);
               } catch (Exception var21) {
                  var0.putByte(-20, -273823943);
               } catch (Throwable var22) {
                  var0.putByte(-21, -1514915023);
               }
            }
         }

         var0.method4534(var3, 36519444);
         var2.shiftNext();
      }
   }

   public static Class240_Sub22_Sub12 method161(int var0, Class39 var1, ByteArrayDataNode var2, byte var3) {
      return (Class240_Sub22_Sub12)(var1 == Class39.aClass39_863?new Class240_Sub22_Sub12_Sub1(var0, var2):(var1 == Class39.aClass39_864?new Class240_Sub22_Sub12_Sub2(var0, var2):null));
   }
}
