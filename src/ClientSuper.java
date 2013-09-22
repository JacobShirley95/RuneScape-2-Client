import jaclib.nanotime.QueryPerformanceCounter;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URL;
import java.util.Iterator;

public abstract class ClientSuper implements Class323, Runnable, FocusListener, WindowListener {

   static boolean aBoolean_3897 = false;
   public static int fps = 0;
   public static Class228 aClass228_3899;
   static final int anInt_3900 = 32;
   static Class224 aClass224_3901 = null;
   static long[] aLongArray_3902 = new long[32];
   public boolean aBoolean_3903 = false;
   static final int anInt_3904 = 1048576;
   public static int canvasY = 0;
   protected static volatile boolean aBoolean_3906 = true;
   static int anInt_3907 = -1410183828;
   static long[] aLongArray_3908 = new long[32];
   protected static volatile boolean aBoolean_3909 = false;
   static volatile long aLong_3910 = 0L;
   protected static boolean aBoolean_3911 = false;
   static volatile boolean aBoolean_3912 = true;
   protected static CustomCursorKit customCursor;
   static final long aLong_3914 = 3221225472L;
   boolean aBoolean_3915 = false;
   static long aLong_3916 = 2068133915862352640L;
   static final String aString_3917 = "main_file_cache.dat2";
   static final String aString_3918 = "main_file_cache.idx";
   static final String aString_3919 = "main_file_cache.idx255";
   static final String aString_3920 = "random.dat";
   protected static int clientHeight;
   protected static CacheFile cacheDat2 = null;
   protected static CacheFile cacheIDx = null;
   static final int anInt_3924 = 0;
   static final int anInt_3925 = 1;
   public static int canvasX = 0;
   static long aLong_3927 = 0L;
   static final String aString_3928 = "rw";
   boolean aBoolean_3929 = false;
   public static int maxMemory = 1352065923;
   public static int availableProcessors = -1544068761;
   static CacheFile randomDataFile = null;
   protected static String curLoadingString = null;
   static EventQueue anEventQueue_3934;


   public boolean method2855(File var1, int var2) {
      if(null == var1) {
         return false;
      } else if(!var1.exists()) {
         return false;
      } else if(!var1.isDirectory()) {
         return false;
      } else if(var1.listFiles().length != 0) {
         return false;
      } else if(!this.writeFile(new File(var1, "test.dat"), true, 1259952090)) {
         return false;
      } else {
         this.writeRootCacheFile(var1, Class240_Sub22_Sub1.rootCacheDir, 1935742052);
         return true;
      }
   }

   public void supplyApplet(Applet var1) {
      Class481.clientApplet = var1;
   }

   final void method2856(GameDataHolder var1, String var2, String var3, int var4, int var5, int var6, int var7, boolean var8, int var9) {
      try {
         this.method2869(Class224.aClass224_3844, var8, (byte)0);
         Class221.clientWidth = (Class29.canvasWidth = var1.getGameWidth(1190333557) * -1100942773) * -1419026117;
         clientHeight = (Class597.canvasHeight = var1.getGameHeight((byte)62) * -2053228525) * -857866285;
         canvasX = 0;
         canvasY = 0;
         if(Class363.method4614(1275622010) == Class224.aClass224_3845) {
            Class221.clientWidth += -184646510 * var1.method3890(-271756119);
            clientHeight += -1890301614 * var1.method3891((byte)71);
            this.initClientFrame(var1.getGameName((byte)-47), -304416856);
         }

         RuntimeException_Sub3.anApplet_3274 = Class481.clientApplet;
         this.startGame(var2, var3, var4, var5, var6, var7, (byte)1);
      } catch (Throwable var11) {
         CacheFileID.method1397((String)null, var11, -655870490);
         this.showError("crash", 579419126);
      }

   }

   final void startGame(String var1, String var2, int var3, int var4, int var5, int var6, byte var7) throws Exception {
      Class113.cacheIDCount = -631489757 * var4;
      Class608.anInt_9942 = -922183309 * var3;
      RuntimeException_Sub3.anInt_3272 = var5 * -1564542671;
      RuntimeException_Sub3.anInt_3271 = var6 * -1315623215;
      Class111.javaVendor = "Unknown";
      Class288.javaVersion = "1.1";

      try {
         Class111.javaVendor = System.getProperty("java.vendor");
         Class288.javaVersion = System.getProperty("java.version");
      } catch (Exception var20) {
         ;
      }

      try {
         Class357.osName = System.getProperty("os.name");
      } catch (Exception var19) {
         Class357.osName = "Unknown";
      }

      Class50.aString_1050 = Class357.osName.toLowerCase();

      try {
         Class240_Sub52_Sub2.osArch = System.getProperty("os.arch").toLowerCase();
      } catch (Exception var18) {
         Class240_Sub52_Sub2.osArch = "";
      }

      try {
         ConnectionHandler.osHome = System.getProperty("os.version").toLowerCase();
      } catch (Exception var17) {
         ConnectionHandler.osHome = "";
      }

      try {
         Class405.userDirectory = System.getProperty("user.home");
         if(null != Class405.userDirectory) {
            Class405.userDirectory = Class405.userDirectory + "/";
         }
      } catch (Exception var16) {
         ;
      }

      try {
         if(Class50.aString_1050.startsWith("win")) {
            if(Class405.userDirectory == null) {
               Class405.userDirectory = System.getenv("USERPROFILE");
            }
         } else if(null == Class405.userDirectory) {
            Class405.userDirectory = System.getenv("HOME");
         }

         if(null != Class405.userDirectory) {
            Class405.userDirectory = Class405.userDirectory + "/";
         }
      } catch (Exception var15) {
         ;
      }

      if(Class405.userDirectory == null) {
         Class405.userDirectory = "~/";
      }

      try {
         anEventQueue_3934 = Toolkit.getDefaultToolkit().getSystemEventQueue();
      } catch (Throwable var14) {
         ;
      }

      Class203.cacheDirectories = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Class405.userDirectory, "/tmp/", ""};
      LoadProgress.jagexCacheFiles = new String[]{".jagex_cache_" + 2109879227 * Class608.anInt_9942, ".file_store_" + Class608.anInt_9942 * 2109879227};
      int var8 = 0;

      int var11;
      label131:
      while(var8 < 4) {
         Class240_Sub22_Sub1.rootCacheDir = this.getRootCacheFile(var1, var2, var8, (byte)-79);
         if(!Class240_Sub22_Sub1.rootCacheDir.exists()) {
            Class240_Sub22_Sub1.rootCacheDir.mkdirs();
         }

         File[] var9 = Class240_Sub22_Sub1.rootCacheDir.listFiles();
         if(null == var9) {
            break;
         }

         File[] var10 = var9;
         var11 = 0;

         while(true) {
            if(var11 >= var10.length) {
               break label131;
            }

            File var12 = var10[var11];
            if(!this.writeFile(var12, false, 1612838521)) {
               ++var8;
               break;
            }

            ++var11;
         }
      }

      Class234.setRootCacheFile(Class240_Sub22_Sub1.rootCacheDir, (byte)-12);
      Class111.writeRandomDatFile(542313850);
      cacheDat2 = new CacheFile(new RandomAccessFileNode(Class25.loadResourceFile("main_file_cache.dat2", (short)32322), "rw", 3221225472L), 5200, 0);
      cacheIDx = new CacheFile(new RandomAccessFileNode(Class25.loadResourceFile("main_file_cache.idx255", (short)30808), "rw", 1048576L), 6000, 0);
      RendererInfo.cacheFileArray = new CacheFile[1321520267 * Class113.cacheIDCount];

      for(var8 = 0; var8 < Class113.cacheIDCount * 1321520267; ++var8) {
         RendererInfo.cacheFileArray[var8] = new CacheFile(new RandomAccessFileNode(Class25.loadResourceFile("main_file_cache.idx" + var8, (short)28617), "rw", 1048576L), 6000, 0);
      }

      try {
         MapPoint.graphicsDataHolder = new GraphicsDataHolder();
      } catch (Exception var13) {
         Class506.aBoolean_9125 = false;
      }

      customCursor = new CustomCursorKit();
      ThreadGroup var21 = Thread.currentThread().getThreadGroup();

      for(ThreadGroup var22 = var21.getParent(); var22 != null; var22 = var22.getParent()) {
         var21 = var22;
      }

      Thread[] var24 = new Thread[1000];
      var21.enumerate(var24);

      for(var11 = 0; var11 < var24.length; ++var11) {
         if(null != var24[var11] && var24[var11].getName().startsWith("AWT")) {
            var24[var11].setPriority(1);
         }
      }

      Thread thisThread = new Thread(this);
      thisThread.setDaemon(true);
      thisThread.start();
      thisThread.setPriority(1);
   }

   void writeRootCacheFile(File var1, File var2, int var3) {
      try {
         RandomAccessFileNode var4 = new RandomAccessFileNode(Class303.rootCacheFile, "rw", 10000L);
         ByteArrayDataNode var5 = new ByteArrayDataNode(500);
         var5.putByte(3, -2042640887);
         var5.putByte(null != var2?1:0, -644724200);
         var5.method4539(var1.getPath(), -261189601);
         if(var2 != null) {
            var5.method4539(var2.getPath(), -261189601);
         }

         var4.writeData(var5.data, 0, 964952859 * var5.index, (byte)4);
         var4.closeRAFile((byte)28);
      } catch (IOException var6) {
         var6.printStackTrace();
      }

   }

   boolean writeFile(File var1, boolean var2, int var3) {
      try {
         RandomAccessFile var4 = new RandomAccessFile(var1, "rw");
         int var5 = var4.read();
         var4.seek(0L);
         var4.write(var5);
         var4.seek(0L);
         var4.close();
         if(var2) {
            var1.delete();
         }

         return true;
      } catch (Exception var6) {
         return false;
      }
   }

   synchronized void initClientFrame(String var1, int var2) {
      ConnectionUpdate.clientFrame = new Frame();
      ConnectionUpdate.clientFrame.setTitle(var1);
      ConnectionUpdate.clientFrame.setResizable(true);
      ConnectionUpdate.clientFrame.addWindowListener(this);
      ConnectionUpdate.clientFrame.setBackground(Color.black);
      ConnectionUpdate.clientFrame.setVisible(true);
      ConnectionUpdate.clientFrame.toFront();
      Insets var3 = ConnectionUpdate.clientFrame.getInsets();
      ConnectionUpdate.clientFrame.setSize(var3.right + -1364963335 * Class221.clientWidth + var3.left, var3.bottom + clientHeight * 772194201 + var3.top);
   }

   synchronized void setupCanvas(int var1) {
      this.checkCanvasParent(1071350055);
      Container var2 = DrawingTarget.getGameContainer(-1476850381);
      Class51.clientCanvas = new Canvas_Sub1(var2);
      this.initCanvas(var2, -1978535008);
   }

   void initCanvas(Container var1, int var2) {
      var1.setBackground(Color.black);
      var1.setLayout((LayoutManager)null);
      var1.add(Class51.clientCanvas);
      Class51.clientCanvas.setSize(1111410531 * Class29.canvasWidth, Class597.canvasHeight * -75607525);
      Class51.clientCanvas.setVisible(true);
      if(ConnectionUpdate.clientFrame == var1) {
         Insets var3 = ConnectionUpdate.clientFrame.getInsets();
         Class51.clientCanvas.setLocation(var3.left + canvasX * -1703748163, var3.top + canvasY * -1448718273);
      } else {
         Class51.clientCanvas.setLocation(-1703748163 * canvasX, canvasY * -1448718273);
      }

      Class51.clientCanvas.addFocusListener(this);
      Class51.clientCanvas.requestFocus();
      AbstractCacheData.aBoolean_6915 = true;
      aBoolean_3912 = true;
      Class51.clientCanvas.setFocusTraversalKeysEnabled(false);
      aBoolean_3906 = true;
      aBoolean_3909 = false;
      aLong_3910 = Class373.getCurrentTime((short)25384) * 1785843698437672997L;
   }

   void checkCanvasParent(int var1) {
      if(null != Class51.clientCanvas) {
         Class51.clientCanvas.removeFocusListener(this);
         Class51.clientCanvas.getParent().setBackground(Color.black);
         Class51.clientCanvas.getParent().remove(Class51.clientCanvas);
      }

   }

   final boolean isRightHost(short var1) {
      String host = Class481.clientApplet.getDocumentBase().getHost().toLowerCase();
      if(!host.equals("jagex.com") && !host.endsWith(".jagex.com")) {
         if(!host.equals("runescape.com") && !host.endsWith(".runescape.com")) {
            if(!host.equals("stellardawn.com") && !host.endsWith(".stellardawn.com")) {
               if(host.endsWith("127.0.0.1")) {
                  return true;
               } else {
                  while(host.length() > 0 && host.charAt(host.length() - 1) >= 48 && host.charAt(host.length() - 1) <= 57) {
                     host = host.substring(0, host.length() - 1);
                  }

                  if(host.endsWith("192.168.1.")) {
                     return true;
                  } else {
                     this.showError("invalidhost", 128035492);
                     return false;
                  }
               }
            } else {
               return true;
            }
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   void checkInit(int var1) {
      if(Class111.javaVendor != null) {
         String var2 = Class111.javaVendor.toLowerCase();
         if(var2.indexOf("sun") != -1 || var2.indexOf("apple") != -1) {
            String var3 = Class288.javaVersion;
            if(var3.equals("1.1") || var3.startsWith("1.1.") || var3.equals("1.2") || var3.startsWith("1.2.") || var3.equals("1.3") || var3.startsWith("1.3.") || var3.equals("1.4") || var3.startsWith("1.4.") || var3.equals("1.5") || var3.startsWith("1.5.") || var3.equals("1.6.0")) {
               this.showError("wrongjava", 972353735);
               return;
            }

            if(var3.startsWith("1.6.0_")) {
               int var4;
               for(var4 = 6; var4 < var3.length() && Class223.method2804(var3.charAt(var4), (byte)1); ++var4) {
                  ;
               }

               String var5 = var3.substring(6, var4);
               if(MapElements.method2924(var5, -1905753343) && LoadProgress.method4427(var5, 512764585) < 10) {
                  this.showError("wrongjava", 1956880275);
                  return;
               }
            }
         }
      }

      DrawingTarget.getGameContainer(1206967349).setFocusCycleRoot(true);
      maxMemory = ((int)(Runtime.getRuntime().maxMemory() / 1048576L) + 1) * -1352065923;
      availableProcessors = Runtime.getRuntime().availableProcessors() * -1544068761;
      this.setupCanvas(-1932225859);
      this.setupGame((byte)0);
      aClass228_3899 = Class506.method5870(-492801821);

      while(0L == 5511310788483788727L * aLong_3927 || Class373.getCurrentTime((short)12558) < aLong_3927 * 5511310788483788727L) {
         Class635.anInt_10098 = aClass228_3899.method2898(-8176310497181574577L * aLong_3916) * -261717915;

         for(int var6 = 0; var6 < -1104662163 * Class635.anInt_10098; ++var6) {
            this.method2866(-334857146);
         }

         this.method2867(-698610136);
         Class456.method5545(Class51.clientCanvas, 1749670291);
      }

   }

   void method2866(int var1) {
      long var2 = Class373.getCurrentTime((short)6105);
      long var4 = aLongArray_3902[Class629.anInt_10076 * -1685415981];
      aLongArray_3902[Class629.anInt_10076 * -1685415981] = var2;
      Class629.anInt_10076 = -258549669 * (-1685415981 * Class629.anInt_10076 + 1 & 31);
      if(var4 != 0L && var2 > var4) {
         ;
      }

      synchronized(this) {
         AbstractCacheData.aBoolean_6915 = aBoolean_3912;
      }

      this.method2873((byte)22);
   }

   void method2867(int var1) {
      long var2 = Class373.getCurrentTime((short)29847);
      long var4 = aLongArray_3908[-1118022211 * Class446.anInt_8525];
      aLongArray_3908[-1118022211 * Class446.anInt_8525] = var2;
      Class446.anInt_8525 = -2143449707 * (-1118022211 * Class446.anInt_8525 + 1 & 31);
      if(0L != var4 && var2 > var4) {
         int var6 = (int)(var2 - var4);
         fps = ((var6 >> 1) + 32000) / var6 * 431440703;
      }

      if((anInt_3907 += -921943369) * -888784121 - 1 > 50) {
         anInt_3907 -= 1147471806;
         aBoolean_3906 = true;
         Class51.clientCanvas.setSize(Class29.canvasWidth * 1111410531, -75607525 * Class597.canvasHeight);
         Class51.clientCanvas.setVisible(true);
         if(ConnectionUpdate.clientFrame != null && null == Class102.aFrame_1967) {
            Insets var7 = ConnectionUpdate.clientFrame.getInsets();
            Class51.clientCanvas.setLocation(var7.left + canvasX * -1703748163, var7.top + -1448718273 * canvasY);
         } else {
            Class51.clientCanvas.setLocation(-1703748163 * canvasX, canvasY * -1448718273);
         }
      }

      this.method2880(306700825);
   }

   final void endGame(boolean var1, int var2) {
      synchronized(this) {
         if(aBoolean_3897) {
            return;
         }

         aBoolean_3897 = true;
      }

      try {
         this.method2886(-1679092745);
      } catch (Exception var7) {
         ;
      }

      try {
         cacheDat2.dumpAndClose(930386156);

         for(int var3 = 0; var3 < Class113.cacheIDCount * 1321520267; ++var3) {
            RendererInfo.cacheFileArray[var3].dumpAndClose(930386156);
         }

         cacheIDx.dumpAndClose(930386156);
         randomDataFile.dumpAndClose(930386156);
      } catch (Exception var8) {
         ;
      }

      if(this.aBoolean_3915) {
         try {
            QueryPerformanceCounter.quit();
         } catch (Throwable var6) {
            ;
         }
      }

      if(Class177.method2217((byte)9)) {
         Class183.getLibLoader(-346548218).method3806(1536422537);
      }

      if(null != Class51.clientCanvas) {
         try {
            Class51.clientCanvas.removeFocusListener(this);
            Class51.clientCanvas.getParent().remove(Class51.clientCanvas);
         } catch (Exception var5) {
            ;
         }
      }

      if(null != ConnectionUpdate.clientFrame) {
         ConnectionUpdate.clientFrame.setVisible(false);
         ConnectionUpdate.clientFrame.dispose();
         ConnectionUpdate.clientFrame = null;
      }

   }

   public void start() {
      if(!aBoolean_3897) {
         aLong_3927 = 0L;
      }
   }

   void method2869(Class224 var1, boolean var2, byte var3) {
      if(var1 == null) {
         throw new NullPointerException();
      } else if(var1 != Class224.aClass224_3844 && Class224.aClass224_3843 != var1) {
         throw new IllegalStateException();
      } else {
         aClass224_3901 = var1;
         if(Class224.aClass224_3843 != aClass224_3901) {
            if(var2) {
               aClass224_3901 = Class224.aClass224_3845;
            }

         }
      }
   }

   public final void windowClosed(WindowEvent var1) {}

   public final synchronized void paint(Graphics var1) {
      if(!aBoolean_3897) {
         aBoolean_3906 = true;
         if(Class373.getCurrentTime((short)5921) - aLong_3910 * -1355372959387333715L > 1000L) {
            Rectangle var2 = var1.getClipBounds();
            if(var2 == null || var2.width >= Class221.clientWidth * -1364963335 && var2.height >= clientHeight * 772194201) {
               aBoolean_3909 = true;
            }
         }

      }
   }

   public final void focusGained(FocusEvent var1) {
      aBoolean_3912 = true;
      aBoolean_3906 = true;
   }

   public final void focusLost(FocusEvent var1) {
      aBoolean_3912 = false;
   }

   abstract void method2873(byte var1);

   public final void windowDeactivated(WindowEvent var1) {}

   public final void windowDeiconified(WindowEvent var1) {}

   public final void windowIconified(WindowEvent var1) {}

   public final void windowOpened(WindowEvent var1) {}

   abstract void setupGame(byte var1);

   public final void windowActivated(WindowEvent var1) {}

   abstract void method2880(int var1);

   public void method2881(int var1) throws Exception_Sub5 {
      if(!this.aBoolean_3915) {
         Class183.getLibLoader(-315078710).loadLib("jaclib", (byte)106);

         try {
            QueryPerformanceCounter.init();
         } catch (Throwable var3) {
            throw new Exception_Sub5(128, "jaclib");
         }

         this.aBoolean_3915 = true;
      }
   }

   public void method2882(int var1) throws Exception_Sub5 {
      if(!this.aBoolean_3903) {
         Class183.getLibLoader(1201705493).loadLib("jagtheora", (byte)49);
         this.aBoolean_3903 = true;
      }
   }

   public final void update(Graphics var1) {
      this.paint(var1);
   }

   public abstract void init();

   String method2883(int var1) {
      return null;
   }

   public void stop() {
      if(!aBoolean_3897) {
         aLong_3927 = (Class373.getCurrentTime((short)21090) + 4000L) * -4056205415971529209L;
      }
   }

   void showError(String var1, int var2) {
      if(!this.aBoolean_3929) {
         this.aBoolean_3929 = true;
         System.out.println("error_game_" + var1);

         try {
            Class480.method5701(Class481.clientApplet, "loggedout", 1212006753);
         } catch (Throwable var5) {
            ;
         }

         try {
            Class481.clientApplet.getAppletContext().showDocument(new URL(Class481.clientApplet.getCodeBase(), "error_game_" + var1 + ".ws"), "_top");
         } catch (Exception var4) {
            ;
         }

      }
   }

   public final void windowClosing(WindowEvent var1) {
      aBoolean_3911 = true;
      this.destroy();
   }

   abstract void method2886(int var1);

   public void run() {
      boolean var6 = false;

      label50: {
         try {
            var6 = true;
            this.checkInit(-1476795952);
            var6 = false;
            break label50;
         } catch (ThreadDeath var7) {
            throw var7;
         } catch (Throwable var8) {
        	 var8.printStackTrace();
            //Class108.method1397(this.method2883(-1754662391), var8, -1128751649);
            this.showError("crash", 1947055261);
            var6 = false;
         } finally {
            if(var6) {
               this.endGame(true, 950604016);
            }
         }

         this.endGame(true, 412795041);
         return;
      }

      this.endGame(true, 47262006);
   }

   public void destroy() {
      if(!aBoolean_3897) {
         aLong_3927 = Class373.getCurrentTime((short)15114) * -4056205415971529209L;
         RSInterface.method1724(5000L);
         this.endGame(false, 535886281);
      }
   }

   File getRootCacheFile(String var1, String var2, int var3, byte var4) {
      String var5 = var3 == 0?"":"" + var3;
      Class303.rootCacheFile = new File(Class405.userDirectory, "jagex_cl_" + var1 + "_" + var2 + var5 + ".dat");
      String dirName = null;
      String var7 = null;
      boolean needsWrite = false;
      File var22;
      if(Class303.rootCacheFile.exists()) {
         try {
            RandomAccessFileNode var9 = new RandomAccessFileNode(Class303.rootCacheFile, "rw", 10000L);

            ByteArrayDataNode byteDataNode;
            int encodingType;
            for(byteDataNode = new ByteArrayDataNode((int)var9.getFileLength(1923846750)); 964952859 * byteDataNode.index < byteDataNode.data.length; byteDataNode.index += -2043502829 * encodingType) {
               encodingType = var9.read(byteDataNode.data, 964952859 * byteDataNode.index, byteDataNode.data.length - byteDataNode.index * 964952859);
               if(encodingType == -1) {
                  throw new IOException();
               }
            }

            byteDataNode.index = 0;
            encodingType = byteDataNode.readByte(1053586904);
            if(encodingType < 1 || encodingType > 3) {
               throw new IOException("" + encodingType);
            }

            int var12 = 0;
            if(encodingType > 1) {
               var12 = byteDataNode.readByte(-124618238);
            }

            if(encodingType <= 2) {
               dirName = byteDataNode.readString(1841936278);
               if(1 == var12) {
                  var7 = byteDataNode.readString(1841936278);
               }
            } else {
               dirName = byteDataNode.method4487((byte)-14);
               if(1 == var12) {
                  var7 = byteDataNode.method4487((byte)-8);
               }
            }

            var9.closeRAFile((byte)17);
         } catch (IOException var18) {
            var18.printStackTrace();
         }

         if(null != dirName) {
            var22 = new File(dirName);
            if(!var22.exists()) {
               dirName = null;
            }
         }

         if(dirName != null) {
            var22 = new File(dirName, "test.dat");
            if(!this.writeFile(var22, true, -1486770259)) {
               dirName = null;
            }
         }
      }

      if(null == dirName && 0 == var3) {
         label101:
         for(int var19 = 0; var19 < LoadProgress.jagexCacheFiles.length; ++var19) {
            for(int var21 = 0; var21 < Class203.cacheDirectories.length; ++var21) {
               File var23 = new File(Class203.cacheDirectories[var21] + LoadProgress.jagexCacheFiles[var19] + File.separatorChar + var1 + File.separatorChar);
               if(var23.exists() && this.writeFile(new File(var23, "test.dat"), true, 1834142188)) {
                  dirName = var23.toString();
                  needsWrite = true;
                  break label101;
               }
            }
         }
      }

      if(null == dirName) {
         dirName = Class405.userDirectory + File.separatorChar + "jagexcache" + var5 + File.separatorChar + var1 + File.separatorChar + var2 + File.separatorChar;
         needsWrite = true;
      }

      if(null != var7) {
         File var20 = new File(var7);
         var22 = new File(dirName);

         try {
            File[] var24 = var20.listFiles();
            File[] var25 = var24;

            for(int var13 = 0; var13 < var25.length; ++var13) {
               File var14 = var25[var13];
               File var15 = new File(var22, var14.getName());
               boolean var16 = var14.renameTo(var15);
               if(!var16) {
                  throw new IOException();
               }
            }
         } catch (Exception var17) {
            var17.printStackTrace();
         }

         needsWrite = true;
      }

      if(needsWrite) {
         this.writeRootCacheFile(new File(dirName), (File)null, 1877196855);
      }

      return new File(dirName);
   }

   public static void method2888(Renderer var0, long var1) {
      Class597.anInt_9864 = -602528201 * Class597.anInt_9860;
      Class597.anInt_9860 = 0;
      Class373.getCurrentTime((short)20388);
      Iterator var3 = Class597.aList_9869.iterator();

      while(var3.hasNext()) {
         Class594 var4 = (Class594)var3.next();
         boolean var5 = var4.method6442(var0, var1);
         if(!var5) {
            var3.remove();
            Class293.aClass594Array_5921[Class597.anInt_9867 * 1886887541] = var4;
            Class597.anInt_9867 = (1 + 1886887541 * Class597.anInt_9867 & Class84.anIntArray_1709[Class597.anInt_9865 * -80546315]) * -1804680739;
         }
      }

   }

   static final void method2889(RSInterfaceData var0, int var1) {
      Class552 var2 = var0.aBoolean_9522?var0.aClass552_9506:var0.aClass552_9492;
      RSInterface var3 = var2.aClass132_9524;
      RSInterfaceGroup var4 = var2.aClass112_9523;
      Class206.method2618(var3, var4, var0, 581710662);
   }

   static void method2890(Class240_Sub22_Sub1 var0, byte var1) {
      boolean var2 = false;
      var0.shiftNext();

      for(Class240_Sub22_Sub1 var3 = (Class240_Sub22_Sub1)Class18.aClass494_158.method5772(-306782258); null != var3; var3 = (Class240_Sub22_Sub1)Class18.aClass494_158.method5771(-1217123614)) {
         if(Class21.method125(var0.getAction((short)310), var3.getAction((short)310), (byte)4)) {
            Class32.method228(var0, var3, -660995694);
            var2 = true;
            break;
         }
      }

      if(!var2) {
         Class18.aClass494_158.insert(var0, 1971878495);
      }

   }

   static final void method2891(RSInterfaceData var0, int var1) {
      client.aClass132_523 = null;
      client.aClass132_426 = null;
   }

   public static String method2892(int var0) {
      return IllegalArgumentException_Sub1.aString_3234;
   }

   static final void method2893(RSInterfaceData var0, byte var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = Class11.anInt_102 * -1876814729;
   }

   public static Class240_Sub12 method2894(int var0) {
      if(null != Class248_Sub1.aNodeList_4122 && null != Class248_Sub1.aClass527_6458) {
         for(Class240_Sub12 var1 = (Class240_Sub12)Class248_Sub1.aClass527_6458.next(); null != var1; var1 = (Class240_Sub12)Class248_Sub1.aClass527_6458.next()) {
            MapIcon var2 = Class248_Sub1.mapIconUnpacker.loadIcon(781228131 * var1.anInt_6801);
            if(null != var2 && var2.aBoolean_10003 && var2.method6594(Class248_Sub1.aClass185_4140, Class248_Sub1.aClass184_4108, -1799082115)) {
               return var1;
            }
         }

         return null;
      } else {
         return null;
      }
   }
}
