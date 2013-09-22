import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class LibraryUnpacker implements Class299 {

   final String libFolder;
   final CacheDataUnpacker libsUnpacker;
   Hashtable loadedLibs = new Hashtable();
   Hashtable aHashtable_4149 = new Hashtable();


   public int extractLib(String var1, int var2) throws Exception_Sub4 {
      if(this.loadedLibs.containsKey(var1)) {
         return 100;
      } else {
         String var3 = Class608.method6551(var1, -170290328);
         if(null == var3) {
            throw new Exception_Sub4(1, var1);
         } else {
            String var4 = null;
            if(null == var4) {
               var4 = this.libFolder + var3;
               if(!this.libsUnpacker.method3587(var4, "", -598529813)) {
                  throw new Exception_Sub4(2, var1);
               }
            }

            if(!this.libsUnpacker.loadDataEntry(var4, 1935946564)) {
               return this.libsUnpacker.getPercentLoaded(var4, (byte)14);
            } else {
               byte[] var5 = this.libsUnpacker.method3583(var4, "", (byte)42);
               if(var5 == null) {
                  throw new Exception_Sub4(3, var1);
               } else {
                  File var6 = null;

                  try {
                     var6 = Class25.loadResourceFile(var3, (short)27396);
                  } catch (RuntimeException var11) {
                     throw new Exception_Sub4(4, var1, var11);
                  }

                  if(null == var6) {
                     throw new Exception_Sub4(5, var1);
                  } else {
                     boolean var7 = true;
                     byte[] var8 = Class278.method3619(var6, -2037957691);
                     if(null != var8 && var5.length == var8.length) {
                        for(int var9 = 0; var9 < var8.length; ++var9) {
                           if(var8[var9] != var5[var9]) {
                              var7 = false;
                              break;
                           }
                        }
                     } else {
                        var7 = false;
                     }

                     if(!var7) {
                        try {
                           FileOutputStream var12 = new FileOutputStream(var6);
                           var12.write(var5, 0, var5.length);
                           var12.close();
                        } catch (Throwable var10) {
                           throw new Exception_Sub4(6, var1, var10);
                        }
                     }

                     this.method3185(var1, var6, (byte)-67);
                     return 100;
                  }
               }
            }
         }
      }
   }

   void method3185(String var1, File var2, byte var3) {
      this.loadedLibs.put(var1, var2);
   }

   public boolean method3805(String var1, byte var2) {
      return this.loadedLibs.containsKey(var1);
   }

   public boolean isLibLoaded(String var1, int var2) {
      return this.aHashtable_4149.containsKey(var1);
   }

   public void loadLib(String var1, byte var2) throws Exception_Sub5 {
      this.method3189(var1, Class247.class, 1635539487);
   }

   void method3189(String var1, Class var2, int var3) throws Exception_Sub5 {
      Class var4 = (Class)this.aHashtable_4149.get(var1);
      if(var4 != null && var4.getClassLoader() != var2.getClassLoader()) {
         throw new Exception_Sub5(1, var1);
      } else {
         File var5 = null;
         if(var5 == null) {
            var5 = (File)this.loadedLibs.get(var1);
         }

         if(var5 != null) {
            try {
               var5 = new File(var5.getCanonicalPath());
               Class var6 = Class.forName("java.lang.Runtime");
               Class var7 = Class.forName("java.lang.reflect.AccessibleObject");
               Method var8 = var7.getDeclaredMethod("setAccessible", new Class[]{Boolean.TYPE});
               Method var9 = var6.getDeclaredMethod("load0", new Class[]{Class.forName("java.lang.Class"), Class.forName("java.lang.String")});
               var8.invoke(var9, new Object[]{Boolean.TRUE});
               var9.invoke(Runtime.getRuntime(), new Object[]{var2, var5.getPath()});
               var8.invoke(var9, new Object[]{Boolean.FALSE});
               this.aHashtable_4149.put(var1, var2);
            } catch (NoSuchMethodException var10) {
               System.load(var5.getPath());
               this.aHashtable_4149.put(var1, Class247.class);
            } catch (Throwable var11) {
               throw new Exception_Sub5(3, var1);
            }

         } else {
            throw new Exception_Sub5(4, var1);
         }
      }
   }

   public boolean method3806(int var1) {
      Hashtable var2 = new Hashtable();
      Enumeration var3 = this.aHashtable_4149.keys();

      while(var3.hasMoreElements()) {
         String var4 = (String)var3.nextElement();
         var2.put(var4, this.aHashtable_4149.get(var4));
      }

      try {
         Class var25 = Class.forName("java.lang.reflect.AccessibleObject");
         Class var5 = Class.forName("java.lang.ClassLoader");
         Field var6 = var5.getDeclaredField("nativeLibraries");
         Method var7 = var25.getDeclaredMethod("setAccessible", new Class[]{Boolean.TYPE});
         var7.invoke(var6, new Object[]{Boolean.TRUE});

         try {
            var3 = this.aHashtable_4149.keys();

            while(var3.hasMoreElements()) {
               String var8 = (String)var3.nextElement();

               try {
                  File var9 = (File)this.loadedLibs.get(var8);
                  Class var10 = (Class)this.aHashtable_4149.get(var8);
                  Vector var11 = (Vector)var6.get(var10.getClassLoader());

                  for(int var12 = 0; var12 < var11.size(); ++var12) {
                     try {
                        Object var13 = var11.elementAt(var12);
                        Field var14 = var13.getClass().getDeclaredField("name");
                        var7.invoke(var14, new Object[]{Boolean.TRUE});

                        try {
                           String var15 = (String)var14.get(var13);
                           if(var15 != null && var15.equalsIgnoreCase(var9.getCanonicalPath())) {
                              Field var16 = var13.getClass().getDeclaredField("handle");
                              Method var17 = var13.getClass().getDeclaredMethod("finalize", new Class[0]);
                              var7.invoke(var16, new Object[]{Boolean.TRUE});
                              var7.invoke(var17, new Object[]{Boolean.TRUE});

                              try {
                                 var17.invoke(var13, new Object[0]);
                                 var16.set(var13, new Integer(0));
                                 var2.remove(var8);
                              } catch (Throwable var19) {
                                 ;
                              }

                              var7.invoke(var17, new Object[]{Boolean.FALSE});
                              var7.invoke(var16, new Object[]{Boolean.FALSE});
                           }
                        } catch (Throwable var20) {
                           ;
                        }

                        var7.invoke(var14, new Object[]{Boolean.FALSE});
                     } catch (Throwable var21) {
                        ;
                     }
                  }
               } catch (Throwable var22) {
                  ;
               }
            }
         } catch (Throwable var23) {
            ;
         }

         var7.invoke(var6, new Object[]{Boolean.FALSE});
      } catch (Throwable var24) {
         ;
      }

      this.aHashtable_4149 = var2;
      return this.aHashtable_4149.isEmpty();
   }

   public LibraryUnpacker(CacheDataUnpacker var1) {
      this.libsUnpacker = var1;
      String var2 = "";
      if(!Class288.aString_4826.startsWith("win") && !Class288.aString_4826.startsWith("windows 7")) {
         if(Class288.aString_4826.startsWith("linux")) {
            var2 = var2 + "linux/";
         } else if(Class288.aString_4826.startsWith("mac")) {
            var2 = var2 + "macos/";
         }
      } else {
         var2 = var2 + "windows/";
      }

      if(!Class288.aString_4827.startsWith("amd64") && !Class288.aString_4827.startsWith("x86_64")) {
         if(!Class288.aString_4827.startsWith("i386") && !Class288.aString_4827.startsWith("i486") && !Class288.aString_4827.startsWith("i586") && !Class288.aString_4827.startsWith("x86")) {
            if(Class288.aString_4827.startsWith("ppc")) {
               var2 = var2 + "ppc/";
            } else {
               var2 = var2 + "universal/";
            }
         } else {
            var2 = var2 + "x86/";
         }
      } else {
         var2 = var2 + "x86_64/";
      }

      this.libFolder = var2;
   }

   static final void method3191(RSInterfaceData var0, byte var1) {
      Class542.aClass43_Sub1_9475.method366((byte)0);
   }

   static final void method3192(RSInterfaceData var0, byte var1) {
      var0.intTypeIndex -= -2124084621;
      int var2 = var0.intTypes[-831324111 * var0.intTypeIndex];
      int var3 = var0.intTypes[1 + var0.intTypeIndex * -831324111];
      int var4 = var0.intTypes[-831324111 * var0.intTypeIndex + 2];
      Class598.method6476(6, var2 << 16 | var3, var4, "", -1898494081);
   }

   static final void method3193(RSInterfaceData var0, int var1) {
      int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
      RSInterface var3 = RSServerQueue.getInterface(var2, (byte)105);
      Class319.method3955(var3, var0, -2038855491);
   }

   static final void method3194(RSInterfaceData var0, short var1) {
      Class124.method1579(659038573);
   }

   public static int method3195(byte[] var0, int var1, int var2) {
      return Class584.method6345(var0, 0, var1, -1329891955);
   }
}
