
public class Class240_Sub22_Sub12_Sub1 extends Class240_Sub22_Sub12 {

   float aFloat_3047;
   float aFloat_3048;
   Class117 aClass117_3049;
   float aFloat_3050;


   public void method2635(float var1, byte var2) {
      this.aFloat_3047 += this.aFloat_3050 * var1;
   }

   Class240_Sub22_Sub12_Sub1(int var1, ByteArrayDataNode var2) {
      super(var1);
      this.aClass117_3049 = Class540_Sub6.method1562(var2.readByte(1459522249), -113095600);
      this.aFloat_3048 = var2.method4494(-822261228);
      this.aFloat_3050 = var2.method4494(-822261228);
   }

   public Class240_Sub22_Sub12_Sub1(int var1, Class117 var2, float var3, float var4) {
      super(var1);
      this.aClass117_3049 = var2;
      this.aFloat_3048 = var3;
      this.aFloat_3050 = var4;
   }

   public void method2637(ByteArrayDataNode var1, int var2) {
      this.aClass117_3049 = Class540_Sub6.method1562(var1.readByte(757611301), -113095600);
      this.aFloat_3048 = var1.method4494(-822261228);
      this.aFloat_3050 = var1.method4494(-822261228);
   }

   public void method2636(Class115 var1, Viewport var2, ArrayViewport var3, byte var4) {
      float var5 = (float)Math.sin((double)this.aFloat_3047);
      float var6 = var5 * this.aFloat_3048;
      if(this.aClass117_3049 == Class117.aClass117_2092) {
         var1.anInt_2084 = (int)((float)(var1.anInt_2084 * -627265399) + var6) * 1892926905;
         var2.setOffset(var6, 0.0F, 0.0F);
      } else if(Class117.aClass117_2094 == this.aClass117_3049) {
         var1.anInt_2083 = (int)((float)(var1.anInt_2083 * 2107386637) + var6) * -213214267;
         var2.setOffset(0.0F, var6, 0.0F);
      } else if(Class117.aClass117_2096 == this.aClass117_3049) {
         var1.anInt_2082 = (int)((float)(1668451679 * var1.anInt_2082) + var6) * -851374433;
         var2.setOffset(0.0F, 0.0F, var6);
      } else if(this.aClass117_3049 == Class117.aClass117_2093) {
         var2.method4630(1.0F, 0.0F, 0.0F, var6);
      } else if(this.aClass117_3049 == Class117.aClass117_2095) {
         var2.method4630(0.0F, 1.0F, 0.0F, var6);
      } else if(this.aClass117_3049 == Class117.aClass117_2091) {
         var2.method4630(0.0F, 0.0F, 1.0F, var6);
      }

   }
}
