import java.io.IOException;

public class ConnectionHandler {

   public Class528 aClass528_3433;
   Class428 aClass428_3434;
   NodeList packetNodeList = new NodeList();
   public int anInt_3436 = 0;
   ByteArrayDataNode aClass240_Sub8_3437 = new ByteArrayDataNode(1700);
   int outBytes;
   ByteArrayDataNode_Sub1 serverDataNode = new ByteArrayDataNode_Sub1(15000);
   Class528 aClass528_3440;
   AbstractServerConnection serverConnection;
   int bytesOut;
   boolean aBoolean_3443 = true;
   int anInt_3444 = 0;
   int anInt_3445;
   Class428 aClass428_3446;
   public int anInt_3447 = 0;
   Class428 aClass428_3448 = null;
   int bytesIn;
   int anInt_3450 = 0;
   Class428 aClass428_3451;
   ConnectionUpdate connectionUpdate = new ConnectionUpdate();
   public boolean aBoolean_3453 = false;
   static final int anInt_3454 = 15000;
   public static String osHome;


   void close(byte var1) {
      this.serverConnection = null;
      this.connectionUpdate.init((String)null, (short)255);
   }

   final void init(byte var1) {
      this.packetNodeList.clear(-1289850105);
      this.anInt_3436 = 0;
   }

   public final void method2541(byte var1) throws IOException {
      if(null != this.serverConnection && 872510671 * this.anInt_3436 > 0) {
         this.aClass240_Sub8_3437.index = 0;

         while(true) {
            Class240_Sub27 var2 = (Class240_Sub27)this.packetNodeList.getBaseNode_2((byte)73);
            if(var2 == null || -623460689 * var2.anInt_7373 > this.aClass240_Sub8_3437.data.length - this.aClass240_Sub8_3437.index * 964952859) {
               this.serverConnection.method3068(this.aClass240_Sub8_3437.data, 0, 964952859 * this.aClass240_Sub8_3437.index, (byte)18);
               this.anInt_3445 += this.aClass240_Sub8_3437.index * 1896082587;
               this.anInt_3447 = 0;
               break;
            }

            this.aClass240_Sub8_3437.putBytes(var2.aClass240_Sub8_Sub1_7370.data, 0, var2.anInt_7373 * -623460689, -144707030);
            this.anInt_3436 -= 1627017249 * var2.anInt_7373;
            var2.shiftNext();
            var2.aClass240_Sub8_Sub1_7370.method4474(-887852188);
            var2.method4849((short)-15634);
         }
      }

   }

   public final void addPacket(Class240_Sub27 var1, int var2) {
      this.packetNodeList.addNode(var1, (short)1109);
      var1.anInt_7373 = -2123809451 * var1.aClass240_Sub8_Sub1_7370.index;
      var1.aClass240_Sub8_Sub1_7370.index = 0;
      this.anInt_3436 += 1627017249 * var1.anInt_7373;
   }

   void method2543(byte var1) {
      if(-1025618511 * client.timer % 50 == 0) {
         this.bytesOut = this.anInt_3445 * -2067177463;
         this.anInt_3445 = 0;
         this.bytesIn = this.outBytes * 1823292807;
         this.outBytes = 0;
      }

   }

   void setServerConnection(AbstractServerConnection var1, String var2, byte var3) {
      this.serverConnection = var1;
      this.connectionUpdate.init(var2, (short)255);
   }

   void method2545(byte var1) {
      if(null != this.serverConnection) {
         this.serverConnection.method3067((byte)8);
         this.serverConnection = null;
      }

      this.connectionUpdate.init((String)null, (short)255);
   }

   public AbstractServerConnection getServerConnection() {
      return this.serverConnection;
   }

   ConnectionHandler() {
      Thread var1 = new Thread(this.connectionUpdate);
      var1.setDaemon(true);
      var1.setPriority(1);
      var1.start();
   }

   static final void method2547(RSInterfaceData var0, int var1) {
      var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = client.anInt_450 * 1821492367;
   }
}
