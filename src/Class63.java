import java.nio.ByteBuffer;
import java.util.Vector;

public class Class63 {

   int anInt_1207;
   Class174_Sub1 aClass174_Sub1_1208;
   Class379 aClass379_1209;
   Class406 aClass406_1210;
   Class406 aClass406_1211;
   Class406 aClass406_1212;
   Class101 aClass101_1213;
   Class101 aClass101_1214;
   Renderer_Sub3 aRenderer_Sub3_1215;
   Class101 aClass101_1216;
   Class174_Sub1 aClass174_Sub1_1217;
   Class99 aClass99_1218;
   Class99 aClass99_1219;
   Class87 aClass87_1220;
   boolean aBoolean_1221;
   Class101 aClass101_1222;
   int anInt_1223;
   Class76 aClass76_1224;
   Vector aVector_1225 = new Vector();
   int anInt_1226 = 0;
   int anInt_1227 = 0;


   void method626() {
      this.aRenderer_Sub3_1215.method7251(0, this.aClass76_1224);
      this.aRenderer_Sub3_1215.method7190(this.aClass379_1209);
      this.aRenderer_Sub3_1215.method7268(Class396.aClass396_7573, 0, 1);
   }

   void method627() {
      this.method634();
      switch(this.anInt_1226) {
      case 0:
         this.aClass87_1220 = Class87.aClass87_1759;
         break;
      case 1:
         this.aClass87_1220 = Class87.aClass87_1766;
         break;
      case 2:
         this.aClass87_1220 = Class87.aClass87_1767;
         break;
      default:
         throw new RuntimeException();
      }

      this.aClass174_Sub1_1217 = this.aRenderer_Sub3_1215.method1890();
      if(this.aRenderer_Sub3_1215.anInt_10635 > 1 && this.aRenderer_Sub3_1215.aBoolean_10608 && this.aRenderer_Sub3_1215.aBoolean_10645) {
         this.aClass174_Sub1_1208 = this.aRenderer_Sub3_1215.method1890();
         this.aClass101_1216 = this.aRenderer_Sub3_1215.method1927(this.anInt_1207, this.anInt_1223, Class136.aClass136_2625, this.aClass87_1220, this.aRenderer_Sub3_1215.anInt_10635);
         this.aClass99_1218 = this.aRenderer_Sub3_1215.method1905(this.anInt_1207, this.anInt_1223, this.aRenderer_Sub3_1215.anInt_10635);
      }

      this.aClass406_1210 = this.aRenderer_Sub3_1215.method7292(Class136.aClass136_2625, this.aClass87_1220, this.anInt_1207, this.anInt_1223);
      this.aClass101_1213 = this.aClass406_1210.method5013(0);
      this.aClass406_1211 = this.aRenderer_Sub3_1215.method7292(Class136.aClass136_2625, this.aClass87_1220, this.anInt_1207, this.anInt_1223);
      this.aClass101_1214 = this.aClass406_1211.method5013(0);
      this.aClass406_1212 = this.aRenderer_Sub3_1215.method7292(Class136.aClass136_2625, this.aClass87_1220, this.anInt_1207, this.anInt_1223);
      this.aClass101_1222 = this.aClass406_1212.method5013(0);
      this.aClass99_1219 = this.aRenderer_Sub3_1215.method1918(this.anInt_1207, this.anInt_1223);
      int var1 = this.aVector_1225.size();

      for(int var2 = 0; var2 < var1; ++var2) {
         Class378 var3 = (Class378)this.aVector_1225.elementAt(var2);
         var3.method4834(this.anInt_1207, this.anInt_1223);
      }

   }

   Class63(Renderer_Sub3 var1, int var2, int var3) {
      this.aRenderer_Sub3_1215 = var1;
      this.aClass87_1220 = Class87.aClass87_1759;
      this.anInt_1207 = var2;
      this.anInt_1223 = var3;
   }

   boolean method628(int var1, Class378 var2) {
      if(!var2.method4835() && !var2.method4843()) {
         this.method633(var2);
         return true;
      } else {
         this.aVector_1225.insertElementAt(var2, var1);
         var2.method4834(this.anInt_1207, this.anInt_1223);
         int var3 = var2.method4841();
         if(var3 > this.anInt_1226) {
            this.anInt_1226 = var3;
         }

         var2.aBoolean_7330 = true;
         return true;
      }
   }

   boolean method629(Class378 var1) {
      return this.method628(this.aVector_1225.size(), var1);
   }

   boolean method630(int var1, int var2, int var3, int var4) {
      if(this.aVector_1225.isEmpty()) {
         return false;
      } else {
         if(this.anInt_1207 != var3 || this.anInt_1223 != var4 || this.aRenderer_Sub3_1215.anInt_10635 != this.anInt_1227) {
            this.anInt_1227 = this.aRenderer_Sub3_1215.anInt_10635;
            this.anInt_1207 = var3;
            this.anInt_1223 = var4;
            this.method635();
            this.method627();
         }

         this.aClass174_Sub1_1217.method7327(0, this.aClass101_1222);
         if(this.aClass99_1219 != null) {
            this.aClass174_Sub1_1217.method7328(this.aClass99_1219);
         }

         if(this.aClass174_Sub1_1208 != null) {
            this.aClass174_Sub1_1208.method7327(0, this.aClass101_1216);
            this.aClass174_Sub1_1208.method7328(this.aClass99_1218);
            this.aRenderer_Sub3_1215.method1901(this.aClass174_Sub1_1208, -2011231014);
         } else {
            this.aRenderer_Sub3_1215.method1901(this.aClass174_Sub1_1217, -591422594);
         }

         this.aRenderer_Sub3_1215.method1977(3, -16777216);
         this.aRenderer_Sub3_1215.method7284(15);
         this.aRenderer_Sub3_1215.method7241(0);
         if(!this.aClass174_Sub1_1217.method7330()) {
            throw new RuntimeException("");
         } else {
            this.aBoolean_1221 = true;
            return true;
         }
      }
   }

   void method631() {
      if(this.aBoolean_1221) {
         if(this.aClass174_Sub1_1208 != null) {
            this.aRenderer_Sub3_1215.method1902(this.aClass174_Sub1_1208, 2102748654);
            this.aRenderer_Sub3_1215.method1901(this.aClass174_Sub1_1217, 83021774);
            this.aClass174_Sub1_1208.method7329(0, 0, this.anInt_1207, this.anInt_1223, 0, 0, true, this.aClass99_1219 != null);
         }

         this.method632();
         this.aBoolean_1221 = false;
      }

   }

   void method632() {
      this.aRenderer_Sub3_1215.method1912(true);
      this.aRenderer_Sub3_1215.method7271();
      this.aRenderer_Sub3_1215.method7279(0);
      this.aRenderer_Sub3_1215.method7226(1);
      this.aRenderer_Sub3_1215.method1967();
      this.aClass174_Sub1_1217.method7328((Class99)null);
      this.aRenderer_Sub3_1215.method7178(0, 0);
      int var1 = this.aVector_1225.size();
      this.aClass406_1212.method4871();

      for(int var2 = 0; var2 < var1; ++var2) {
         Class378 var3 = (Class378)this.aVector_1225.elementAt(var2);
         int var4 = var3.method4840();
         boolean var5 = var2 == var1 - 1;

         for(int var6 = 0; var6 < var4; ++var6) {
            if(var5 && var6 == var4 - 1) {
               this.aRenderer_Sub3_1215.method1902(this.aClass174_Sub1_1217, -630261055);
            } else {
               this.aClass174_Sub1_1217.method7327(0, this.aClass101_1214);
            }

            Class406 var7 = this.aClass406_1210;
            if(var6 == 0) {
               var7 = this.aClass406_1212;
            }

            var3.method4844(var6, this.aClass174_Sub1_1217, var7, this.aClass99_1219, this.aClass406_1212);
            this.method626();
            var3.method4839(var6);
            Class406 var8 = this.aClass406_1210;
            this.aClass406_1210 = this.aClass406_1211;
            this.aClass406_1211 = var8;
            Class101 var9 = this.aClass101_1213;
            this.aClass101_1213 = this.aClass101_1214;
            this.aClass101_1214 = var9;
         }
      }

      this.aRenderer_Sub3_1215.method7279(1);
      this.aRenderer_Sub3_1215.method7226(0);
      this.aRenderer_Sub3_1215.method1912(false);
   }

   void method633(Class378 var1) {
      var1.method4837();
      var1.aBoolean_7330 = false;
      this.aVector_1225.removeElement(var1);
   }

   void method634() {
      if(this.aClass76_1224 == null) {
         this.aClass76_1224 = this.aRenderer_Sub3_1215.method7320(false);
         this.aClass76_1224.method981(12, 4);
         ByteBuffer var1 = this.aRenderer_Sub3_1215.aByteBuffer_10646;
         var1.clear();
         var1.putFloat(0.0F);
         var1.putFloat(1.0F);
         var1.putFloat(2.0F);
         this.aClass76_1224.method4853(0, var1.position(), this.aRenderer_Sub3_1215.aLong_10629);
         this.aClass379_1209 = this.aRenderer_Sub3_1215.method7250(new Class402[]{new Class402(Class380.aClass380_7354)});
      }
   }

   void method635() {
      if(this.aClass174_Sub1_1208 != null) {
         this.aClass174_Sub1_1208.method2195();
         this.aClass174_Sub1_1208 = null;
      }

      if(this.aClass101_1216 != null) {
         this.aClass101_1216.method824();
         this.aClass101_1216 = null;
      }

      if(this.aClass99_1218 != null) {
         this.aClass99_1218.method824();
         this.aClass99_1218 = null;
      }

      this.aClass174_Sub1_1217.method2195();
      this.aClass101_1213.method824();
      this.aClass101_1214.method824();
      this.aClass101_1222.method824();
      this.aClass406_1210.method4978();
      this.aClass406_1211.method4978();
      this.aClass406_1212.method4978();
      this.aClass99_1219.method824();
      int var1 = this.aVector_1225.size();

      for(int var2 = 0; var2 < var1; ++var2) {
         Class378 var3 = (Class378)this.aVector_1225.elementAt(var2);
         var3.method4837();
      }

   }
}
