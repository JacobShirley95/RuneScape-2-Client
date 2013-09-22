import jaggl.OpenGL;

public class Class125_Sub1 extends Class125 {

   String aString_4270;
   String aString_4271;
   boolean aBoolean_4272;
   static final int anInt_4273 = 13;
   Class133_Sub2 aClass133_Sub2_4274;
   int glProgramID;
   int anInt_4276;
   OpenGLRenderer_Sub1 aRenderer_Sub3_Sub1_4277;
   int anInt_4278;
   int[] anIntArray_4279;
   static final int[] anIntArray_4280 = new int[2];
   static final float[] aFloatArray_4281 = new float[16];
   float[] aFloatArray_4282;
   float[] aFloatArray_4283;
   float[] aFloatArray_4284;
   static final int anInt_4285 = 35632;
   int[] anIntArray_4286;
   static final int anInt_4287 = 35633;
   float[] aFloatArray_4288;


   void method1599(int var1, int var2, Class403 var3) {
      this.aRenderer_Sub3_Sub1_4277.method7313(var2);
      this.aRenderer_Sub3_Sub1_4277.method7224(var3);
      OpenGL.glUniform1i(var1, var2);
   }

   Class125_Sub1(OpenGLRenderer_Sub1 var1, Class89 var2) {
      this.glProgramID = 0;
      this.anInt_4276 = 0;
      this.anInt_4278 = 0;
      this.aBoolean_4272 = false;
      this.anIntArray_4279 = new int[13];
      this.aString_2351 = var2.aString_1802;
      StringBuilder var3 = new StringBuilder();
      Class111[] var4;
      int var5;
      Class111 var6;
      if(var2.aString_1800 != null) {
         this.aString_2350 = var2.aString_1800;
         if(var2.aClass111Array_1803 != null) {
            var4 = var2.aClass111Array_1803;

            for(var5 = 0; var5 < var4.length; ++var5) {
               var6 = var4[var5];
               var3.append("#define " + var6.aString_2046 + " " + var6.aString_2045 + '\n');
            }
         }

         var3.append(new String(var1.method757(this.aString_2350)));
         this.aString_4271 = var3.toString();
      }

      if(var2.aString_1801 != null) {
         this.aString_2352 = var2.aString_1801;
         var3.setLength(0);
         if(var2.aClass111Array_1804 != null) {
            var4 = var2.aClass111Array_1804;

            for(var5 = 0; var5 < var4.length; ++var5) {
               var6 = var4[var5];
               var3.append("#define " + var6.aString_2046 + " " + var6.aString_2045 + '\n');
            }
         }

         var3.append(new String(var1.method757(this.aString_2352)));
         this.aString_4270 = var3.toString();
      }

      Class543.method6089(this.anIntArray_4279, 0, this.anIntArray_4279.length, -1);
   }

   int method3229(int var1, String var2, String var3) {
      if(var2 == null) {
         return 0;
      } else {
         int var4 = OpenGL.glCreateShader(var1);
         OpenGL.glShaderSource(var4, var2);
         OpenGL.glCompileShader(var4);
         OpenGL.glGetShaderiv(var4, '\u8b81', anIntArray_4280, 0);
         if(anIntArray_4280[0] == 0) {
            OpenGL.glDeleteShader(var4);
            var4 = 0;
         }

         return var4;
      }
   }

   void method1591(Class240_Sub50_Sub1 var1, float var2, float var3, float var4) {
      int var5 = ((Class240_Sub50_Sub1_Sub2)var1).method2463();
      if(var5 != -1) {
         if(this.aFloatArray_4282[var5] != var2 || this.aFloatArray_4288[var5] != var3 || this.aFloatArray_4284[var5] != var4) {
            this.aFloatArray_4282[var5] = var2;
            this.aFloatArray_4288[var5] = var3;
            this.aFloatArray_4284[var5] = var4;
            if(var1.method875(-1667407280) != Class121.aClass121_2239) {
               throw new IllegalArgumentException_Sub1(var1, "");
            }

            OpenGL.glUniform3f(var5, var2, var3, var4);
         }

      }
   }

   void method1589(Class240_Sub50_Sub1 var1, float var2) {
      int var3 = ((Class240_Sub50_Sub1_Sub2)var1).method2463();
      if(var3 != -1) {
         if(this.aFloatArray_4282[var3] != var2) {
            this.aFloatArray_4282[var3] = var2;
            if(var1.method875(-840465944) != Class121.aClass121_2172 && var1.method875(-1998582795) != Class121.aClass121_2194) {
               throw new IllegalArgumentException_Sub1(var1, "");
            }

            OpenGL.glUniform1f(var3, var2);
         }

      }
   }

   void method1600(int var1, float var2, float var3, float var4) {
      OpenGL.glUniform3f(var1, var2, var3, var4);
   }

   void method1592(Class240_Sub50_Sub1 var1, float var2, float var3, float var4, float var5) {
      int var6 = ((Class240_Sub50_Sub1_Sub2)var1).method2463();
      if(var6 != -1) {
         if(this.aFloatArray_4282[var6] != var2 || this.aFloatArray_4288[var6] != var3 || this.aFloatArray_4284[var6] != var4 || this.aFloatArray_4283[var6] != var5) {
            this.aFloatArray_4282[var6] = var2;
            this.aFloatArray_4288[var6] = var3;
            this.aFloatArray_4284[var6] = var4;
            this.aFloatArray_4283[var6] = var5;
            if(var1.method875(-720788047) != Class121.aClass121_2151) {
               throw new IllegalArgumentException_Sub1(var1, "");
            }

            OpenGL.glUniform4f(var6, var2, var3, var4, var5);
         }

      }
   }

   void method1593(Class240_Sub50_Sub1 var1, float[] var2, int var3) {
      int var4 = ((Class240_Sub50_Sub1_Sub2)var1).method2463();
      if(var4 != -1) {
         OpenGL.glUniform4fv(var4, var3, var2, 0);
      }
   }

   void method1602(Class240_Sub50_Sub1 var1, ArrayViewport var2) {
      assert var1.method875(-565394647) == Class121.aClass121_2165;

      int var3 = ((Class240_Sub50_Sub1_Sub2)var1).method2463();
      if(var3 != -1) {
         OpenGL.glUniform2fv(var3, 4, var2.method4574(aFloatArray_4281), 0);
      }
   }

   void method1587(Class240_Sub50_Sub1 var1, ArrayViewport var2) {
      assert var1.method875(-1624507134) == Class121.aClass121_2168;

      int var3 = ((Class240_Sub50_Sub1_Sub2)var1).method2463();
      if(var3 != -1) {
         OpenGL.glUniform4fv(var3, 4, var2.method4570(aFloatArray_4281), 0);
      }
   }

   Class125_Sub1(OpenGLRenderer_Sub1 var1, Class133_Sub2 var2, Class89 var3) {
      this(var1, var3);
      this.aClass133_Sub2_4274 = var2;
      this.aRenderer_Sub3_Sub1_4277 = var1;
   }

   void method1590(Class240_Sub50_Sub1 var1, float var2, float var3) {
      int var4 = ((Class240_Sub50_Sub1_Sub2)var1).method2463();
      if(var4 != -1) {
         if(this.aFloatArray_4282[var4] != var2 || this.aFloatArray_4288[var4] != var3) {
            this.aFloatArray_4282[var4] = var2;
            this.aFloatArray_4288[var4] = var3;
            if(var1.method875(-868629481) != Class121.aClass121_2154) {
               throw new IllegalArgumentException_Sub1(var1, "");
            }

            OpenGL.glUniform2f(var4, var2, var3);
         }

      }
   }

   void method1594(int var1, float[] var2, int var3) {
      OpenGL.glUniform4fv(var1, var3, var2, 0);
   }

   void method1597(int var1, ArrayViewport var2) {
      OpenGL.glUniform3fv(var1, 3, var2.method4572(aFloatArray_4281), 0);
   }

   void method1603(int var1, ArrayViewport var2) {
      OpenGL.glUniform2fv(var1, 4, var2.method4574(aFloatArray_4281), 0);
   }

   void method1598(int var1, ArrayViewport var2) {
      OpenGL.glUniform4fv(var1, 4, var2.method4570(aFloatArray_4281), 0);
   }

   public void method824() {
      if(this.glProgramID != 0) {
         this.aRenderer_Sub3_Sub1_4277.method789(this.glProgramID);
         if(this.anInt_4276 != 0) {
            this.aRenderer_Sub3_Sub1_4277.method799((long)this.anInt_4276);
         }

         if(this.anInt_4278 != 0) {
            this.aRenderer_Sub3_Sub1_4277.method799((long)this.anInt_4278);
         }

         this.glProgramID = 0;
         this.anInt_4276 = 0;
         this.anInt_4278 = 0;
      }

   }

   public boolean method1588() {
      if(this.aBoolean_4272) {
         return true;
      } else {
         this.aRenderer_Sub3_Sub1_4277.aClass125_Sub1_1353 = null;
         this.anInt_4276 = this.method3229('\u8b31', this.aString_4271, this.aString_2350);
         this.anInt_4278 = this.method3229('\u8b30', this.aString_4270, this.aString_2352);
         if(this.anInt_4276 != 0 && this.anInt_4278 != 0) {
            this.glProgramID = OpenGL.glCreateProgram();
            if(this.anInt_4276 != 0) {
               OpenGL.glAttachShader(this.glProgramID, this.anInt_4276);
            }

            if(this.anInt_4278 != 0) {
               OpenGL.glAttachShader(this.glProgramID, this.anInt_4278);
            }

            OpenGL.glLinkProgram(this.glProgramID);
            OpenGL.glGetProgramiv(this.glProgramID, '\u8b82', anIntArray_4280, 0);
            if(anIntArray_4280[0] == 0) {
               if(this.anInt_4276 != 0) {
                  OpenGL.glDetachShader(this.glProgramID, this.anInt_4276);
                  OpenGL.glDeleteShader(this.anInt_4276);
               }

               if(this.anInt_4278 != 0) {
                  OpenGL.glDetachShader(this.glProgramID, this.anInt_4278);
                  OpenGL.glDeleteShader(this.anInt_4278);
               }

               OpenGL.glDeleteProgram(this.glProgramID);
               return false;
            } else {
               OpenGL.glUseProgram(this.glProgramID);
               int var1 = -1;

               int var2;
               for(var2 = 0; var2 < this.aClass133_Sub2_4274.method1730(-410742167); ++var2) {
                  if(this.aClass133_Sub2_4274.method1731(var2, -1087982553) == this) {
                     var1 = var2;
                     break;
                  }
               }

               if(var1 == -1) {
                  return false;
               } else {
                  var2 = 0;
                  int var3 = 0;

                  int var4;
                  Class240_Sub50_Sub1 var5;
                  Class121 var6;
                  int var7;
                  for(var4 = 0; var4 < this.aClass133_Sub2_4274.method1756(554318221); ++var4) {
                     var5 = this.aClass133_Sub2_4274.method1757(var4, (byte)102);
                     if(var5 != null) {
                        var5.method869(var1);
                        var6 = var5.method875(-1082737675);
                        var7 = ((Class240_Sub50_Sub1_Sub2)var5).anIntArray_3320[var1];
                        if(var6 != Class121.aClass121_2172 && var6 != Class121.aClass121_2194 && var6 != Class121.aClass121_2154 && var6 != Class121.aClass121_2239 && var6 != Class121.aClass121_2151) {
                           var3 = Math.max(var7, var3);
                        } else {
                           var2 = Math.max(var7, var2);
                        }
                     }
                  }

                  for(var4 = 0; var4 < this.aClass133_Sub2_4274.method1754((byte)-105); ++var4) {
                     var5 = this.aClass133_Sub2_4274.method1755(var4, (byte)-44);
                     if(var5 != null) {
                        var5.method869(var1);
                        var6 = var5.method875(-496277227);
                        var7 = ((Class240_Sub50_Sub1_Sub2)var5).anIntArray_3320[var1];
                        if(var6 != Class121.aClass121_2172 && var6 != Class121.aClass121_2194 && var6 != Class121.aClass121_2154 && var6 != Class121.aClass121_2239 && var6 != Class121.aClass121_2151) {
                           var3 = Math.max(var7, var3);
                        } else {
                           var2 = Math.max(var7, var2);
                        }
                     }
                  }

                  this.aFloatArray_4282 = new float[var2 + 1];
                  this.aFloatArray_4288 = new float[var2 + 1];
                  this.aFloatArray_4284 = new float[var2 + 1];
                  this.aFloatArray_4283 = new float[var2 + 1];
                  this.anIntArray_4286 = new int[var3 + 1];

                  for(var4 = 0; var4 < this.anIntArray_4286.length; ++var4) {
                     this.anIntArray_4286[var4] = -1;
                  }

                  this.aString_4271 = null;
                  this.aString_4270 = null;
                  this.aBoolean_4272 = true;
                  return true;
               }
            }
         } else {
            if(this.anInt_4276 != 0) {
               OpenGL.glDeleteShader(this.anInt_4276);
            }

            if(this.anInt_4278 != 0) {
               OpenGL.glDeleteShader(this.anInt_4278);
            }

            return false;
         }
      }
   }

   public void finalize() {
      this.method824();
   }

   void method1596(int var1, float var2, float var3, float var4, float var5) {
      OpenGL.glUniform4f(var1, var2, var3, var4, var5);
   }

   void method1595(Class240_Sub50_Sub1 var1, int var2, Class403 var3) {
      int var4 = ((Class240_Sub50_Sub1_Sub2)var1).method2463();
      if(var4 != -1) {
         if(var3 == null) {
            var3 = this.aRenderer_Sub3_Sub1_4277.aClass384_10563;
         }

         if(var2 < this.aRenderer_Sub3_Sub1_4277.anInt_10641) {
            this.aRenderer_Sub3_Sub1_4277.method7313(var2);
            this.aRenderer_Sub3_Sub1_4277.method7224((Class403)var3);
         } else {
            OpenGL.glActiveTexture('\u84c0' + var2);
            OpenGL.glBindTexture(((Class294)var3).textureTarget, ((Class294)var3).texture);
         }

         if(this.anIntArray_4286[var4] != var2) {
            this.anIntArray_4286[var4] = var2;
            OpenGL.glUniform1i(var4, var2);
         }

      }
   }

}
