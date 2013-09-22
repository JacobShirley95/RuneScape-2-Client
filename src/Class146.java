import jaggl.OpenGL;

public class Class146 {

   boolean aBoolean_2696 = true;
   Class174_Sub1_Sub2 aClass174_Sub1_Sub2_2697;
   Class174_Sub1_Sub2 aClass174_Sub1_Sub2_2698;
   boolean aBoolean_2699 = true;
   int anInt_2700 = 1;
   int anInt_2701 = 0;
   int anInt_2702 = 1;
   Class174_Sub1_Sub2 aClass174_Sub1_Sub2_2703;
   boolean aBoolean_2704;
   boolean aBoolean_2705 = false;
   int anInt_2706 = 0;
   boolean aBoolean_2707 = true;
   NodeList aNodeList_2708 = new NodeList();
   boolean aBoolean_2709 = true;
   OGLTexture_Sub3[] anOGLTexture_Sub3Array_2710 = new OGLTexture_Sub3[2];
   final OpenGLRenderer aRenderer_Sub2_2711;
   OGLTexture_Sub3 anOGLTexture_Sub3_2712;
   Class240_Sub22_Sub18 aClass240_Sub22_Sub18_2713;
   Class240_Sub22_Sub18 aClass240_Sub22_Sub18_2714;
   int anInt_2715 = 0;
   Class87 aClass87_2716;


   boolean method1818() {
      return this.aClass174_Sub1_Sub2_2698 != null;
   }

   boolean method1819(int var1, int var2, int var3, int var4) {
      if(this.aClass174_Sub1_Sub2_2698 != null && !this.aNodeList_2708.isEmpty(1897715656)) {
         if(this.anInt_2702 != var3 || this.anInt_2700 != var4) {
            this.anInt_2702 = var3;
            this.anInt_2700 = var4;

            for(NodeListNode var5 = this.aNodeList_2708.getBaseNode_2((byte)20); var5 != this.aNodeList_2708.rootNode; var5 = var5.baseNode) {
               ((Class240_Sub40)var5).method4919(this.anInt_2702, this.anInt_2700);
            }

            this.aBoolean_2696 = true;
            this.aBoolean_2699 = true;
            this.aBoolean_2707 = true;
         }

         if(this.method1825()) {
            this.anInt_2706 = var1;
            this.anInt_2701 = var2;
            this.aBoolean_2704 = true;
            this.aRenderer_Sub2_2711.method6969(-this.anInt_2706, this.anInt_2700 + this.anInt_2701 - this.aRenderer_Sub2_2711.method1896(768254024).method2198());
            this.aRenderer_Sub2_2711.method1901(this.aClass174_Sub1_Sub2_2698, -119889964);
            this.aRenderer_Sub2_2711.method1977(3, 0);
            this.aClass174_Sub1_Sub2_2698.method1242(0);
            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   void method1820() {
      if(this.aBoolean_2704) {
         if(this.aClass174_Sub1_Sub2_2703 != null) {
            this.aRenderer_Sub2_2711.method1902(this.aClass174_Sub1_Sub2_2703, 923341840);
            this.aRenderer_Sub2_2711.method1901(this.aClass174_Sub1_Sub2_2697, 808226350);
            this.aClass174_Sub1_Sub2_2697.method1242(0);
            this.aClass174_Sub1_Sub2_2703.method7329(0, 0, this.anInt_2702, this.anInt_2700, 0, 0, true, this.aBoolean_2705);
         }

         this.aRenderer_Sub2_2711.method7067();
         this.aRenderer_Sub2_2711.setBlendFunc(0);
         this.aRenderer_Sub2_2711.setTextureEnv(1);
         this.aRenderer_Sub2_2711.method1967();
         int var1 = 0;
         int var2 = 1;

         Class240_Sub40 var4;
         for(Class240_Sub40 var3 = (Class240_Sub40)this.aNodeList_2708.getBaseNode_2((byte)98); var3 != null; var3 = var4) {
            var4 = (Class240_Sub40)this.aNodeList_2708.getNext(-25762544);
            int var5 = var3.method4925();

            for(int var6 = 0; var6 < var5; ++var6) {
               var3.method4924(var6, this.anOGLTexture_Sub3Array_2710[var1], this.anOGLTexture_Sub3_2712);
               if(var4 == null && var6 == var5 - 1) {
                  this.aRenderer_Sub2_2711.method1902(this.aClass174_Sub1_Sub2_2697, 379083522);
                  this.aRenderer_Sub2_2711.method6969(0, 0);
                  OpenGL.glBegin(7);
                  OpenGL.glTexCoord2f(0.0F, (float)this.anInt_2700);
                  OpenGL.glMultiTexCoord2f('\u84c1', 0.0F, 1.0F);
                  OpenGL.glVertex2i(this.anInt_2706, this.anInt_2701);
                  OpenGL.glTexCoord2f(0.0F, 0.0F);
                  OpenGL.glMultiTexCoord2f('\u84c1', 0.0F, 0.0F);
                  OpenGL.glVertex2i(this.anInt_2706, this.anInt_2701 + this.anInt_2700);
                  OpenGL.glTexCoord2f((float)this.anInt_2702, 0.0F);
                  OpenGL.glMultiTexCoord2f('\u84c1', 1.0F, 0.0F);
                  OpenGL.glVertex2i(this.anInt_2706 + this.anInt_2702, this.anInt_2701 + this.anInt_2700);
                  OpenGL.glTexCoord2f((float)this.anInt_2702, (float)this.anInt_2700);
                  OpenGL.glMultiTexCoord2f('\u84c1', 1.0F, 1.0F);
                  OpenGL.glVertex2i(this.anInt_2706 + this.anInt_2702, this.anInt_2701);
                  OpenGL.glEnd();
               } else {
                  this.aClass174_Sub1_Sub2_2697.method1242(var2);
                  OpenGL.glBegin(7);
                  OpenGL.glTexCoord2f(0.0F, (float)this.anInt_2700);
                  OpenGL.glMultiTexCoord2f('\u84c1', 0.0F, 1.0F);
                  OpenGL.glVertex2i(0, 0);
                  OpenGL.glTexCoord2f(0.0F, 0.0F);
                  OpenGL.glMultiTexCoord2f('\u84c1', 0.0F, 0.0F);
                  OpenGL.glVertex2i(0, this.anInt_2700);
                  OpenGL.glTexCoord2f((float)this.anInt_2702, 0.0F);
                  OpenGL.glMultiTexCoord2f('\u84c1', 1.0F, 0.0F);
                  OpenGL.glVertex2i(this.anInt_2702, this.anInt_2700);
                  OpenGL.glTexCoord2f((float)this.anInt_2702, (float)this.anInt_2700);
                  OpenGL.glMultiTexCoord2f('\u84c1', 1.0F, 1.0F);
                  OpenGL.glVertex2i(this.anInt_2702, 0);
                  OpenGL.glEnd();
               }

               var3.method4918(var6);
               var2 = var2 + 1 & 1;
               var1 = var1 + 1 & 1;
            }
         }

         this.aBoolean_2704 = false;
      }
   }

   boolean method1821(Class240_Sub40 var1) {
      if(this.aClass174_Sub1_Sub2_2698 != null) {
         if(var1.method4916() || var1.method4917()) {
            this.aNodeList_2708.addNode(var1, (short)-10165);
            this.method1823();
            if(this.method1825()) {
               if(this.anInt_2702 != -1 && this.anInt_2700 != -1) {
                  var1.method4919(this.anInt_2702, this.anInt_2700);
               }

               var1.aBoolean_7558 = true;
               return true;
            }
         }

         this.method1822(var1);
      }

      return false;
   }

   void method1822(Class240_Sub40 var1) {
      var1.aBoolean_7558 = false;
      var1.method4922();
      var1.shiftNext();
      this.method1823();
   }

   void method1823() {
      int var1 = 0;
      boolean var2 = false;
      Class87 var3 = Class87.aClass87_1759;

      for(Class240_Sub40 var4 = (Class240_Sub40)this.aNodeList_2708.getBaseNode_2((byte)93); var4 != null; var4 = (Class240_Sub40)this.aNodeList_2708.getNext(-2122379190)) {
         Class87 var5 = var4.method4920();
         if(var5.anInt_1764 * -151363651 > var3.anInt_1764 * -151363651) {
            var3 = var5;
         }

         var2 |= var4.method4921();
         var1 += var4.method4925();
      }

      if(var3 != this.aClass87_2716) {
         this.aClass87_2716 = var3;
         this.aBoolean_2696 = true;
      }

      int var6 = this.anInt_2715 > 2?2:this.anInt_2715;
      int var7 = var1 > 2?2:var1;
      if(var6 != var7) {
         this.aBoolean_2696 = true;
         this.aBoolean_2707 = true;
      }

      if(var2 != this.aBoolean_2705) {
         this.aBoolean_2705 = var2;
         this.aBoolean_2699 = true;
      }

      this.anInt_2715 = var1;
   }

   Class146(OpenGLRenderer var1) {
      this.aClass87_2716 = Class87.aClass87_1759;
      this.aRenderer_Sub2_2711 = var1;
      if(this.aRenderer_Sub2_2711.supportsFrameBuffer && this.aRenderer_Sub2_2711.supportsTextureRect) {
         this.aClass174_Sub1_Sub2_2698 = this.aClass174_Sub1_Sub2_2697 = new Class174_Sub1_Sub2(this.aRenderer_Sub2_2711);
         if(this.aRenderer_Sub2_2711.anInt_10319 > 1 && this.aRenderer_Sub2_2711.aBoolean_10327 && this.aRenderer_Sub2_2711.aBoolean_10439) {
            this.aClass174_Sub1_Sub2_2698 = this.aClass174_Sub1_Sub2_2703 = new Class174_Sub1_Sub2(this.aRenderer_Sub2_2711);
         }
      }

   }

   void method1824() {
      this.aClass174_Sub1_Sub2_2697 = null;
      this.aClass174_Sub1_Sub2_2703 = null;
      this.aClass174_Sub1_Sub2_2698 = null;
      this.aClass240_Sub22_Sub18_2713 = null;
      this.anOGLTexture_Sub3_2712 = null;
      this.anOGLTexture_Sub3Array_2710 = null;
      this.aClass240_Sub22_Sub18_2714 = null;
      if(!this.aNodeList_2708.isEmpty(1555593613)) {
         for(NodeListNode var1 = this.aNodeList_2708.getBaseNode_2((byte)13); var1 != this.aNodeList_2708.rootNode; var1 = var1.baseNode) {
            ((Class240_Sub40)var1).method4922();
         }
      }

      this.anInt_2700 = 1;
      this.anInt_2702 = 1;
   }

   boolean method1825() {
      if(this.aBoolean_2699) {
         if(this.aClass240_Sub22_Sub18_2713 != null) {
            this.aClass240_Sub22_Sub18_2713.method824();
            this.aClass240_Sub22_Sub18_2713 = null;
         }

         if(this.anOGLTexture_Sub3_2712 != null) {
            this.anOGLTexture_Sub3_2712.unloadTextures();
            this.anOGLTexture_Sub3_2712 = null;
         }
      }

      if(this.aBoolean_2696) {
         if(this.aClass240_Sub22_Sub18_2714 != null) {
            this.aClass240_Sub22_Sub18_2714.method824();
            this.aClass240_Sub22_Sub18_2714 = null;
         }

         if(this.anOGLTexture_Sub3Array_2710[0] != null) {
            this.anOGLTexture_Sub3Array_2710[0].unloadTextures();
            this.anOGLTexture_Sub3Array_2710[0] = null;
         }

         if(this.anOGLTexture_Sub3Array_2710[1] != null) {
            this.anOGLTexture_Sub3Array_2710[1].unloadTextures();
            this.anOGLTexture_Sub3Array_2710[1] = null;
         }
      }

      if(this.aBoolean_2699) {
         if(this.aClass174_Sub1_Sub2_2703 != null) {
            this.aClass240_Sub22_Sub18_2713 = new Class240_Sub22_Sub18(this.aRenderer_Sub2_2711, Class136.aClass136_2629, Class87.aClass87_1762, this.anInt_2702, this.anInt_2700, this.aRenderer_Sub2_2711.anInt_10319);
         }

         if(this.aBoolean_2705) {
            this.anOGLTexture_Sub3_2712 = new OGLTexture_Sub3(this.aRenderer_Sub2_2711, '\u84f5', Class136.aClass136_2629, Class87.aClass87_1762, this.anInt_2702, this.anInt_2700);
         } else if(this.aClass240_Sub22_Sub18_2713 == null) {
            this.aClass240_Sub22_Sub18_2713 = new Class240_Sub22_Sub18(this.aRenderer_Sub2_2711, Class136.aClass136_2629, Class87.aClass87_1762, this.anInt_2702, this.anInt_2700);
         }

         this.aBoolean_2699 = false;
         this.aBoolean_2707 = true;
         this.aBoolean_2709 = true;
      }

      if(this.aBoolean_2696) {
         if(this.aClass174_Sub1_Sub2_2703 != null) {
            this.aClass240_Sub22_Sub18_2714 = new Class240_Sub22_Sub18(this.aRenderer_Sub2_2711, Class136.aClass136_2625, this.aClass87_2716, this.anInt_2702, this.anInt_2700, this.aRenderer_Sub2_2711.anInt_10319);
         }

         this.anOGLTexture_Sub3Array_2710[0] = new OGLTexture_Sub3(this.aRenderer_Sub2_2711, '\u84f5', Class136.aClass136_2625, this.aClass87_2716, this.anInt_2702, this.anInt_2700);
         this.anOGLTexture_Sub3Array_2710[1] = this.anInt_2715 > 1?new OGLTexture_Sub3(this.aRenderer_Sub2_2711, '\u84f5', Class136.aClass136_2625, this.aClass87_2716, this.anInt_2702, this.anInt_2700):null;
         this.aBoolean_2696 = false;
         this.aBoolean_2707 = true;
         this.aBoolean_2709 = true;
      }

      if(this.aBoolean_2707) {
         if(this.aClass174_Sub1_Sub2_2703 != null) {
            this.aRenderer_Sub2_2711.method1901(this.aClass174_Sub1_Sub2_2697, 1790583950);
            this.aClass174_Sub1_Sub2_2697.method7328((Class99)null);
            this.aClass174_Sub1_Sub2_2697.method7327(0, (Class101)null);
            this.aClass174_Sub1_Sub2_2697.method7327(1, (Class101)null);
            this.aClass174_Sub1_Sub2_2697.method7327(0, this.anOGLTexture_Sub3Array_2710[0].method5446(0));
            this.aClass174_Sub1_Sub2_2697.method7327(1, this.anInt_2715 > 1?this.anOGLTexture_Sub3Array_2710[1].method5446(0):null);
            if(this.aBoolean_2705) {
               this.aClass174_Sub1_Sub2_2697.method7328(this.anOGLTexture_Sub3_2712.method5445(0));
            }

            this.aRenderer_Sub2_2711.method1902(this.aClass174_Sub1_Sub2_2697, -141153436);
            this.aRenderer_Sub2_2711.method1901(this.aClass174_Sub1_Sub2_2703, -324418121);
            this.aClass174_Sub1_Sub2_2703.method7328((Class99)null);
            this.aClass174_Sub1_Sub2_2703.method7327(0, (Class101)null);
            this.aClass174_Sub1_Sub2_2703.method7327(0, this.aClass240_Sub22_Sub18_2714);
            this.aClass174_Sub1_Sub2_2703.method7328(this.aClass240_Sub22_Sub18_2713);
            this.aRenderer_Sub2_2711.method1902(this.aClass174_Sub1_Sub2_2703, 1078504112);
         } else {
            this.aRenderer_Sub2_2711.method1901(this.aClass174_Sub1_Sub2_2697, 1686626930);
            this.aClass174_Sub1_Sub2_2697.method7328((Class99)null);
            this.aClass174_Sub1_Sub2_2697.method7327(0, (Class101)null);
            this.aClass174_Sub1_Sub2_2697.method7327(1, (Class101)null);
            this.aClass174_Sub1_Sub2_2697.method7327(0, this.anOGLTexture_Sub3Array_2710[0].method5446(0));
            this.aClass174_Sub1_Sub2_2697.method7327(1, this.anInt_2715 > 1?this.anOGLTexture_Sub3Array_2710[1].method5446(0):null);
            if(this.aBoolean_2705) {
               this.aClass174_Sub1_Sub2_2697.method7328(this.anOGLTexture_Sub3_2712.method5445(0));
            } else {
               this.aClass174_Sub1_Sub2_2697.method7328(this.aClass240_Sub22_Sub18_2713);
            }

            this.aRenderer_Sub2_2711.method1902(this.aClass174_Sub1_Sub2_2697, -2088284969);
         }

         this.aBoolean_2707 = false;
         this.aBoolean_2709 = true;
      }

      if(this.aBoolean_2709) {
         this.aRenderer_Sub2_2711.method1901(this.aClass174_Sub1_Sub2_2698, -1475615610);
         this.aBoolean_2709 = !this.aClass174_Sub1_Sub2_2698.method7330();
         this.aRenderer_Sub2_2711.method1902(this.aClass174_Sub1_Sub2_2698, -334614209);
      }

      return !this.aBoolean_2709;
   }
}
