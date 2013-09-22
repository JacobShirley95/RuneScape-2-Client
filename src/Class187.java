
public abstract class Class187 implements Class189 {

   public Class373 aClass373_3197;
   public final int anInt_3198;
   public Class374 aClass374_3199;
   public boolean aBoolean_3200;
   public final Class283 aClass283_3201;


   public void method2290(ByteArrayDataNode var1, int var2) {
      while(true) {
         int var3 = var1.readByte(-218187121);
         if(var3 == 0) {
            return;
         }

         Class181 var4 = (Class181)Class559.method6185(RSInterfaceData.method6117(-1956703786), var3, (byte)-27);
         if(var4 != null) {
            switch(-1545947871 * var4.anInt_3104) {
            case 0:
               var1.readString(1841936278);
               break;
            case 1:
               int var5 = var1.readByte(481588409);
               this.aClass373_3197 = (Class373)Class559.method6185(Class373.method4744(-1826360599), var5, (byte)92);
               if(this.aClass373_3197 != null) {
                  break;
               }

               throw new IllegalStateException("");
            case 2:
            default:
               throw new IllegalStateException("");
            case 3:
               Class559.method6185(Class266.method3524(327263509), var1.readByte(-652698576), (byte)-1);
               break;
            case 4:
               this.aBoolean_3200 = false;
            case 5:
               break;
            case 6:
               this.aClass374_3199 = (Class374)Class559.method6185(Class544.method6093(1268362579), var1.readByte(-378204854), (byte)-1);
            }
         } else {
            this.method2293(var1, var3, -56280715);
         }
      }
   }

   boolean method2291(short var1) {
      return null != this.aClass283_3201 && null != this.aClass373_3197;
   }

   Class187(Class283 var1, int var2) {
      this.aClass374_3199 = Class374.aClass374_7124;
      this.aBoolean_3200 = true;
      this.aClass283_3201 = var1;
      this.anInt_3198 = var2 * -2126963279;
   }

   public Object method2292(int var1) {
      return this.aClass283_3201.method3665(this, 1828256330);
   }

   abstract void method2293(ByteArrayDataNode var1, int var2, int var3);

   static void method2294(RSInterfaceData var0, int var1) {
      var0.intTypes[var0.intTypeIndex * -831324111 - 1] = HintMarker.aClass583_3709.method6327(var0.intTypes[-831324111 * var0.intTypeIndex - 1], 2141296778).anInt_9565 * -520408649;
   }

   static final void method2295(RSInterface var0, RSInterfaceGroup var1, RSInterfaceData var2, int var3) {
      String var4 = (String)var2.stringData[(var2.stringDataIndex -= -1828074049) * 863838783];
      if(Class557.extractInterfaceIntData(var4, var2, 1770046123) != null) {
         var4 = var4.substring(0, var4.length() - 1);
      }

      var0.anObjectArray_2555 = Class133.extractInterfaceData(var4, var2, (byte)30);
      var0.aBoolean_2524 = true;
   }

   static final void method2296(RSInterfaceData var0, byte var1) throws Exception_Sub1 {
      var0.intTypeIndex -= -1416056414;
      int var2 = var0.intTypes[var0.intTypeIndex * -831324111];
      int var3 = var0.intTypes[1 + var0.intTypeIndex * -831324111];
      Class542.aClass43_Sub1_9475.method390((float)var2, (float)var3, (byte)10);
   }

   static final void method2297(RSInterfaceData var0, byte var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      if(var2 != Class104_Sub21.renderSettings.aClass540_Sub10_7292.method1653(-594341511)) {
         Class104_Sub21.renderSettings.set(Class104_Sub21.renderSettings.aClass540_Sub10_7292, var2, 1370499199);
         Class83.method1089(-1597109235);
         client.aBoolean_568 = false;
         client.aClass296_348.method3789((byte)21);
      }

   }

   static void method2298(Class256 var0, int var1, int var2, int var3, Model var4, byte var5) {
      if(null != var4) {
         var0.method3363(var1, var2, var3, var4.method2037(), var4.method2039(), var4.method2022(), var4.method2041(), var4.method2056(), var4.method2065(), var4.method2043());
      }
   }
}
