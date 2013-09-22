package jaggl;

import java.awt.Canvas;
import java.util.Hashtable;

public class OpenGL {

   long peer;
   private Hashtable capabilities;
   private Thread aThread_2821;
   private static Hashtable aHashtable_2822 = new Hashtable();
   public static final int anInt_2823 = 5120;
   public static final int anInt_2824 = 5121;
   public static final int anInt_2825 = 5122;
   public static final int anInt_2826 = 5123;
   public static final int anInt_2827 = 5124;
   public static final int anInt_2828 = 5125;
   public static final int anInt_2829 = 5126;
   public static final int anInt_2830 = 0;
   public static final int anInt_2831 = 1;
   public static final int anInt_2832 = 2;
   public static final int anInt_2833 = 3;
   public static final int anInt_2834 = 4;
   public static final int anInt_2835 = 5;
   public static final int anInt_2836 = 6;
   public static final int anInt_2837 = 7;
   public static final int anInt_2838 = 5888;
   public static final int anInt_2839 = 5889;
   public static final int anInt_2840 = 5890;
   public static final int anInt_2841 = 2832;
   public static final int anInt_2842 = 2834;
   public static final int anInt_2843 = 6913;
   public static final int anInt_2844 = 6914;
   public static final int anInt_2845 = 1028;
   public static final int anInt_2846 = 1029;
   public static final int anInt_2847 = 2884;
   public static final int anInt_2848 = 4864;
   public static final int anInt_2849 = 515;
   public static final int anInt_2850 = 516;
   public static final int anInt_2851 = 2929;
   public static final int anInt_2852 = 6402;
   public static final int anInt_2853 = 2896;
   public static final int anInt_2854 = 16384;
   public static final int anInt_2855 = 16385;
   public static final int anInt_2856 = 16386;
   public static final int anInt_2857 = 4615;
   public static final int anInt_2858 = 4616;
   public static final int anInt_2859 = 4617;
   public static final int anInt_2860 = 4608;
   public static final int anInt_2861 = 4609;
   public static final int anInt_2862 = 4611;
   public static final int anInt_2863 = 5634;
   public static final int anInt_2864 = 2899;
   public static final int anInt_2865 = 1032;
   public static final int anInt_2866 = 7425;
   public static final int anInt_2867 = 2903;
   public static final int anInt_2868 = 260;
   public static final int anInt_2869 = 3008;
   public static final int anInt_2870 = 3042;
   public static final int anInt_2871 = 0;
   public static final int anInt_2872 = 1;
   public static final int anInt_2873 = 768;
   public static final int anInt_2874 = 769;
   public static final int anInt_2875 = 770;
   public static final int anInt_2876 = 771;
   public static final int anInt_2877 = 774;
   public static final int anInt_2878 = 2912;
   public static final int anInt_2879 = 2917;
   public static final int anInt_2880 = 2914;
   public static final int anInt_2881 = 2918;
   public static final int anInt_2882 = 2915;
   public static final int anInt_2883 = 2916;
   public static final int anInt_2884 = 9729;
   public static final int anInt_2885 = 7681;
   public static final int anInt_2886 = 6406;
   public static final int anInt_2887 = 6409;
   public static final int anInt_2888 = 6410;
   public static final int anInt_2889 = 6144;
   public static final int anInt_2890 = 6407;
   public static final int anInt_2891 = 6408;
   public static final int anInt_2892 = 2982;
   public static final int anInt_2893 = 3156;
   public static final int anInt_2894 = 4353;
   public static final int anInt_2895 = 3089;
   public static final int anInt_2896 = 3348;
   public static final int anInt_2897 = 3349;
   public static final int anInt_2898 = 3352;
   public static final int anInt_2899 = 3353;
   public static final int anInt_2900 = 3354;
   public static final int anInt_2901 = 3355;
   public static final int anInt_2902 = 3317;
   public static final int anInt_2903 = 3314;
   public static final int anInt_2904 = 8960;
   public static final int anInt_2905 = 8704;
   public static final int anInt_2906 = 3552;
   public static final int anInt_2907 = 3553;
   public static final int anInt_2908 = 10242;
   public static final int anInt_2909 = 10243;
   public static final int anInt_2910 = 10240;
   public static final int anInt_2911 = 10241;
   public static final int anInt_2912 = 8705;
   public static final int anInt_2913 = 3168;
   public static final int anInt_2914 = 3169;
   public static final int anInt_2915 = 9472;
   public static final int anInt_2916 = 9984;
   public static final int anInt_2917 = 9987;
   public static final int anInt_2918 = 9217;
   public static final int anInt_2919 = 9473;
   public static final int anInt_2920 = 9216;
   public static final int anInt_2921 = 9474;
   public static final int anInt_2922 = 8448;
   public static final int anInt_2923 = 9728;
   public static final int anInt_2924 = 10497;
   public static final int anInt_2925 = 8192;
   public static final int anInt_2926 = 8193;
   public static final int anInt_2927 = 8194;
   public static final int anInt_2928 = 8195;
   public static final int anInt_2929 = 3170;
   public static final int anInt_2930 = 3171;
   public static final int anInt_2931 = 7936;
   public static final int anInt_2932 = 7937;
   public static final int anInt_2933 = 7938;
   private static final int anInt_2934 = 7939;
   public static final int anInt_2935 = 256;
   public static final int anInt_2936 = 1024;
   public static final int anInt_2937 = 2048;
   public static final int anInt_2938 = 16384;
   public static final int anInt_2939 = 32830;
   public static final int anInt_2940 = 32834;
   public static final int anInt_2941 = 32852;
   public static final int anInt_2942 = 32859;
   public static final int anInt_2943 = 32884;
   public static final int anInt_2944 = 32885;
   public static final int anInt_2945 = 32886;
   public static final int anInt_2946 = 32888;
   public static final int anInt_2947 = 32879;
   public static final int anInt_2948 = 33639;
   public static final int anInt_2949 = 32993;
   public static final int anInt_2950 = 33071;
   public static final int anInt_2951 = 33984;
   public static final int anInt_2952 = 33985;
   public static final int anInt_2953 = 34018;
   public static final int anInt_2954 = 32925;
   public static final int anInt_2955 = 34065;
   public static final int anInt_2956 = 34066;
   public static final int anInt_2957 = 34067;
   public static final int anInt_2958 = 34069;
   public static final int anInt_2959 = 34070;
   public static final int anInt_2960 = 34071;
   public static final int anInt_2961 = 34072;
   public static final int anInt_2962 = 34073;
   public static final int anInt_2963 = 34074;
   public static final int anInt_2964 = 34160;
   public static final int anInt_2965 = 34161;
   public static final int anInt_2966 = 34162;
   public static final int anInt_2967 = 34176;
   public static final int anInt_2968 = 34178;
   public static final int anInt_2969 = 34184;
   public static final int anInt_2970 = 34186;
   public static final int anInt_2971 = 34192;
   public static final int anInt_2972 = 34200;
   public static final int anInt_2973 = 34163;
   public static final int anInt_2974 = 34165;
   public static final int anInt_2975 = 34023;
   public static final int anInt_2976 = 34166;
   public static final int anInt_2977 = 34167;
   public static final int anInt_2978 = 34168;
   public static final int anInt_2979 = 34479;
   public static final int anInt_2980 = 33189;
   public static final int anInt_2981 = 33190;
   public static final int anInt_2982 = 34895;
   public static final int anInt_2983 = 35001;
   public static final int anInt_2984 = 34929;
   public static final int anInt_2985 = 34930;
   public static final int anInt_2986 = 35632;
   public static final int anInt_2987 = 35633;
   public static final int anInt_2988 = 34336;
   public static final int anInt_2989 = 34379;
   public static final int anInt_2990 = 34933;
   public static final int anInt_2991 = 34820;
   public static final int anInt_2992 = 34962;
   public static final int anInt_2993 = 34963;
   public static final int anInt_2994 = 35040;
   public static final int anInt_2995 = 35044;
   public static final int anInt_2996 = 35713;
   public static final int anInt_2997 = 35714;
   public static final int anInt_2998 = 35716;
   public static final int anInt_2999 = 35633;
   public static final int anInt_3000 = 35632;
   public static final int anInt_3001 = 34037;
   public static final int anInt_3002 = 5131;
   public static final int anInt_3003 = 34836;
   public static final int anInt_3004 = 34837;
   public static final int anInt_3005 = 34838;
   public static final int anInt_3006 = 34840;
   public static final int anInt_3007 = 34841;
   public static final int anInt_3008 = 34842;
   public static final int anInt_3009 = 34843;
   public static final int anInt_3010 = 34844;
   public static final int anInt_3011 = 34846;
   public static final int anInt_3012 = 34847;
   public static final int anInt_3013 = 33777;
   public static final int anInt_3014 = 33779;
   public static final int anInt_3015 = 36053;
   public static final int anInt_3016 = 36064;
   public static final int anInt_3017 = 36096;
   public static final int anInt_3018 = 36160;
   public static final int anInt_3019 = 36161;
   public static final int anInt_3020 = 36008;
   public static final int anInt_3021 = 36219;


   public native long init(Canvas var1, int var2, int var3, int var4, int var5, int var6, int var7);

   public native boolean arePbuffersAvailable();

   public boolean isCompatible(String var1) {
      if(this.capabilities == null) {
         this.capabilities = new Hashtable();
         String var2 = glGetString(7939);
         int var3 = 0;

         while(true) {
            int var4 = var2.indexOf(32, var3);
            if(var4 == -1) {
               String var6 = var2.substring(var3).trim();
               if(var6.length() != 0) {
                  this.capabilities.put(var6, var6);
               }
               break;
            }

            String var5 = var2.substring(var3, var4).trim();
            if(var5.length() != 0) {
               this.capabilities.put(var5, var5);
            }

            var3 = 1 + var4;
         }
      }

      return this.capabilities.containsKey(var1);
   }

   public synchronized boolean method2008() {
      Thread var1 = Thread.currentThread();
      if(this.attachPeer()) {
         OpenGL var2 = (OpenGL)aHashtable_2822.put(var1, this);
         if(var2 != null) {
            var2.aThread_2821 = null;
         }

         this.aThread_2821 = var1;
         return true;
      } else {
         return false;
      }
   }

   public synchronized boolean method2009() {
      if(this.aThread_2821 != Thread.currentThread()) {
         return false;
      } else {
         this.detachPeer();
         aHashtable_2822.remove(this.aThread_2821);
         this.aThread_2821 = null;
         return true;
      }
   }

   private native boolean attachPeer();

   private native void detachPeer();

   public native long prepareSurface(Canvas var1);

   public native void surfaceResized(long var1);

   public native void releaseSurface(Canvas var1, long var2);

   public native boolean setSurface(long var1);

   public native long createPbuffer(int var1, int var2);

   public native void releasePbuffer(long var1);

   public native void setPbuffer(long var1);

   public native void swapBuffers(long var1);

   public native void setSwapInterval(int var1);

   public native void release();

   public static native void glEnable(int var0);

   public static native void glDisable(int var0);

   public static native void glCullFace(int var0);

   public static native void glPushAttrib(int var0);

   public static native void glPopAttrib();

   public static native void glShadeModel(int var0);

   public static native void glHint(int var0, int var1);

   public static native void glFinish();

   public static native void glFlush();

   public static native void glClear(int var0);

   public static native void glClearColor(float var0, float var1, float var2, float var3);

   public static native void glClearDepth(float var0);

   public static native void glDepthFunc(int var0);

   public static native void glDepthMask(boolean var0);

   public static native void glDepthRange(float var0, float var1);

   public static native void glAlphaFunc(int var0, float var1);

   public static native void glColorMask(boolean var0, boolean var1, boolean var2, boolean var3);

   public static native void glReadBuffer(int var0);

   public static native void glDrawBuffer(int var0);

   public static native void glDrawBuffersARB(int var0, int[] var1, int var2);

   public static native void glMatrixMode(int var0);

   public static native void glPushMatrix();

   public static native void glPopMatrix();

   public static native void glLoadIdentity();

   public static native void glOrtho(double var0, double var2, double var4, double var6, double var8, double var10);

   public static native void glFrustum(double var0, double var2, double var4, double var6, double var8, double var10);

   public static native void glTranslatef(float var0, float var1, float var2);

   public static native void glRotatef(float var0, float var1, float var2, float var3);

   public static native void glScalef(float var0, float var1, float var2);

   public static native void glLoadMatrixf(float[] var0, int var1);

   public static native void glMultMatrixf(float[] var0, int var1);

   public static native void glViewport(int var0, int var1, int var2, int var3);

   public static native void glScissor(int var0, int var1, int var2, int var3);

   public static native int glGenLists(int var0);

   public static native void glDeleteLists(int var0, int var1);

   public static native void glNewList(int var0, int var1);

   public static native void glEndList();

   public static native void glCallList(int var0);

   public static native void glBegin(int var0);

   public static native void glVertex2i(int var0, int var1);

   public static native void glVertex2f(float var0, float var1);

   public static native void glVertex3f(float var0, float var1, float var2);

   public static native void glNormal3f(float var0, float var1, float var2);

   public static native void glColor3f(float var0, float var1, float var2);

   public static native void glColor4f(float var0, float var1, float var2, float var3);

   public static native void glColor3ub(byte var0, byte var1, byte var2);

   public static native void glColor4ub(byte var0, byte var1, byte var2, byte var3);

   public static native void glTexCoord2i(int var0, int var1);

   public static native void glTexCoord3i(int var0, int var1, int var2);

   public static native void glTexCoord2f(float var0, float var1);

   public static native void glTexCoord3f(float var0, float var1, float var2);

   public static native void glMultiTexCoord2i(int var0, int var1, int var2);

   public static native void glMultiTexCoord3i(int var0, int var1, int var2, int var3);

   public static native void glMultiTexCoord2f(int var0, float var1, float var2);

   public static native void glRasterPos2i(int var0, int var1);

   public static native void glEnd();

   public static native void glEnableClientState(int var0);

   public static native void glDisableClientState(int var0);

   public static native void glClientActiveTexture(int var0);

   public static native void glVertexPointer(int var0, int var1, int var2, long var3);

   public static native void glNormalPointer(int var0, int var1, long var2);

   public static native void glColorPointer(int var0, int var1, int var2, long var3);

   public static native void glTexCoordPointer(int var0, int var1, int var2, long var3);

   public static native void glVertexAttribPointer(int var0, int var1, int var2, boolean var3, int var4, long var5);

   public static native void glEnableVertexAttribArray(int var0);

   public static native void glDisableVertexAttribArray(int var0);

   public static native void glBindAttribLocation(int var0, int var1, String var2);

   public static native int glGetAttribLocation(int var0, String var1);

   public static native void glGenBuffersARB(int var0, int[] var1, int var2);

   public static native void glBindBufferARB(int var0, int var1);

   public static native void glBufferDataARBa(int var0, int var1, long var2, int var4);

   public static native void glBufferDataARBub(int var0, int var1, byte[] var2, int var3, int var4);

   public static native void glBufferSubDataARBa(int var0, int var1, int var2, long var3);

   public static native void glBufferSubDataARBub(int var0, int var1, int var2, byte[] var3, int var4);

   public static native long glMapBufferARB(int var0, int var1);

   public static native boolean glUnmapBufferARB(int var0);

   public static native void glDeleteBuffersARB(int var0, int[] var1, int var2);

   public static native void glLineWidth(float var0);

   public static native void glPointSize(float var0);

   public static native void glPolygonMode(int var0, int var1);

   public static native void glDrawArrays(int var0, int var1, int var2);

   public static native void glDrawElements(int var0, int var1, int var2, long var3);

   public static native void glGenTextures(int var0, int[] var1, int var2);

   public static native void glDeleteTextures(int var0, int[] var1, int var2);

   public static native void glActiveTexture(int var0);

   public static native void glBindTexture(int var0, int var1);

   public static native void glTexEnvi(int var0, int var1, int var2);

   public static native void glTexEnvf(int var0, int var1, float var2);

   public static native void glTexEnvfv(int var0, int var1, float[] var2, int var3);

   public static native void glTexGeni(int var0, int var1, int var2);

   public static native void glTexGenfv(int var0, int var1, float[] var2, int var3);

   public static native void glTexParameterf(int var0, int var1, float var2);

   public static native void glTexParameteri(int var0, int var1, int var2);

   public static native void glGetTexImagei(int var0, int var1, int var2, int var3, int[] var4, int var5);

   public static native void glGetTexImageub(int var0, int var1, int var2, int var3, byte[] var4, int var5);

   public static native float glGetTexLevelParameterfv(int var0, int var1, int var2);

   public static native int glGetTexLevelParameteriv(int var0, int var1, int var2);

   public static native void glGetTexImage(int var0, int var1, int var2, int var3, byte[] var4);

   public static native void glTexImage1Dub(int var0, int var1, int var2, int var3, int var4, int var5, int var6, byte[] var7, int var8);

   public static native void glCopyTexImage2D(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7);

   public static native void glCopyTexSubImage2D(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7);

   public static native void glTexImage2Di(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int[] var8, int var9);

   public static native void glTexImage2Df(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, float[] var8, int var9);

   public static native void glTexImage2Dub(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, byte[] var8, int var9);

   public static native void glTexSubImage2Di(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int[] var8, int var9);

   public static native void glTexSubImage2Df(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, float[] var8, int var9);

   public static native void glTexSubImage2Dub(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, byte[] var8, int var9);

   public static native void glCopyTexSubImage3D(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8);

   public static native void glTexImage3Dub(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, byte[] var9, int var10);

   public static native void glCompressedTexImage2Dub(int var0, int var1, int var2, int var3, int var4, int var5, int var6, byte[] var7, int var8);

   public static native void glCopyPixels(int var0, int var1, int var2, int var3, int var4);

   public static native void glReadPixelsi(int var0, int var1, int var2, int var3, int var4, int var5, int[] var6, int var7);

   public static native void glReadPixelsub(int var0, int var1, int var2, int var3, int var4, int var5, byte[] var6, int var7);

   public static native void glDrawPixelsi(int var0, int var1, int var2, int var3, int[] var4, int var5);

   public static native void glDrawPixelsub(int var0, int var1, int var2, int var3, byte[] var4, int var5);

   public static native void glPixelZoom(float var0, float var1);

   public static native void glPixelStorei(int var0, int var1);

   public static native void glPixelTransferf(int var0, float var1);

   public static native void glColorMaterial(int var0, int var1);

   public static native void glLightf(int var0, int var1, float var2);

   public static native void glLightfv(int var0, int var1, float[] var2, int var3);

   public static native void glLightModelfv(int var0, float[] var1, int var2);

   public static native void glMaterialfv(int var0, int var1, float[] var2, int var3);

   public static native void glFogi(int var0, int var1);

   public static native void glFogf(int var0, float var1);

   public static native void glFogfv(int var0, float[] var1, int var2);

   public static native void glBlendFunc(int var0, int var1);

   public static native void glBlendFuncSeparate(int var0, int var1, int var2, int var3);

   public static native void glBlendColor(float var0, float var1, float var2, float var3);

   public static native void glGenFramebuffersEXT(int var0, int[] var1, int var2);

   public static native void glDeleteFramebuffersEXT(int var0, int[] var1, int var2);

   public static native void glBindFramebufferEXT(int var0, int var1);

   public static native void glFramebufferTexture2DEXT(int var0, int var1, int var2, int var3, int var4);

   public static native void glFramebufferTexture3DEXT(int var0, int var1, int var2, int var3, int var4, int var5);

   public static native void glFramebufferRenderbufferEXT(int var0, int var1, int var2, int var3);

   public static native int glCheckFramebufferStatusEXT(int var0);

   public static native void glBlitFramebufferEXT(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9);

   public static native void glGenerateMipmapEXT(int var0);

   public static native void glGenRenderbuffersEXT(int var0, int[] var1, int var2);

   public static native void glDeleteRenderbuffersEXT(int var0, int[] var1, int var2);

   public static native void glBindRenderbufferEXT(int var0, int var1);

   public static native void glRenderbufferStorageEXT(int var0, int var1, int var2, int var3);

   public static native void glRenderbufferStorageMultisampleEXT(int var0, int var1, int var2, int var3, int var4);

   public static native int glGenProgramARB();

   public static native void glDeleteProgramARB(int var0);

   public static native void glBindProgramARB(int var0, int var1);

   public static native void glProgramStringARB(int var0, int var1, String var2);

   public static native void glProgramRawARB(int var0, int var1, byte[] var2);

   public static native void glProgramLocalParameter4fARB(int var0, int var1, float var2, float var3, float var4, float var5);

   public static native void glProgramLocalParameter4fvARB(int var0, int var1, float[] var2, int var3);

   public static native void glGetProgramivARB(int var0, int var1, int[] var2, int var3);

   public static native int glCreateProgram();

   public static native int glCreateShader(int var0);

   public static native void glDeleteProgram(int var0);

   public static native void glDeleteShader(int var0);

   public static native void glShaderSource(int var0, String var1);

   public static native void glCompileShader(int var0);

   public static native void glAttachShader(int var0, int var1);

   public static native void glDetachShader(int var0, int var1);

   public static native void glLinkProgram(int var0);

   public static native void glUseProgram(int var0);

   public static native int glGetUniformLocation(int var0, String var1);

   public static native void glUniform1i(int var0, int var1);

   public static native void glUniform1f(int var0, float var1);

   public static native void glUniform2f(int var0, float var1, float var2);

   public static native void glUniform3f(int var0, float var1, float var2, float var3);

   public static native void glUniform4f(int var0, float var1, float var2, float var3, float var4);

   public static native void glUniform1fv(int var0, int var1, float[] var2, int var3);

   public static native void glUniform2fv(int var0, int var1, float[] var2, int var3);

   public static native void glUniform3fv(int var0, int var1, float[] var2, int var3);

   public static native void glUniform4fv(int var0, int var1, float[] var2, int var3);

   public static native void glUniformMatrix2fv(int var0, int var1, boolean var2, float[] var3, int var4);

   public static native void glUniformMatrix3fv(int var0, int var1, boolean var2, float[] var3, int var4);

   public static native void glUniformMatrix4fv(int var0, int var1, boolean var2, float[] var3, int var4);

   public static native void glGetProgramiv(int var0, int var1, int[] var2, int var3);

   public static native void glGetShaderiv(int var0, int var1, int[] var2, int var3);

   public static native void glGetProgramInfoLog(int var0, int var1, int[] var2, int var3, byte[] var4, int var5);

   public static native void glGetShaderInfoLog(int var0, int var1, int[] var2, int var3, byte[] var4, int var5);

   public static native int glGetError();

   public static native String glGetString(int var0);

   public static native void glGetFloatv(int var0, float[] var1, int var2);

   public static native void glGetIntegerv(int var0, int[] var1, int var2);

   public static native void glStencilFunc(int var0, int var1, int var2);

   public static native void glStencilOp(int var0, int var1, int var2);

}
