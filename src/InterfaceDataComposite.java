
public class InterfaceDataComposite extends Class240_Sub22 {

   public int[] anIntArray_3544;
   public Class434 type;
   public InterfaceID[] actions;
   public NodeArrayList[] aNodeArrayListArray_3547;
   public Object[] anObjectArray_3548;
   public int anInt_3549;
   public int anInt_3550;
   public int anInt_3551;
   public int anInt_3552;
   public int anInt_3553;
   public int anInt_3554;
   public String title;
   final Class185 aClass185_3556;


   InterfaceID getID(ByteArrayDataNode var1, InterfaceID[] var2, int var3) {
      int var4 = var1.readShort(1660166994);
      if(var4 >= 0 && var4 < var2.length) {
         InterfaceID var5 = var2[var4];
         return var5;
      } else {
         throw new RuntimeException("");
      }
   }

   int loadInterfaceData(ByteArrayDataNode var1, int var2) {
      var1.index = -2043502829 * (var1.data.length - 2);
      int var3 = var1.readShort(1068605528);
      int var4 = var1.data.length - 2 - var3 - 16;
      var1.index = var4 * -2043502829;
      int var5 = var1.method4480(1260717178);
      this.anInt_3549 = var1.readShort(-687912163) * 42341845;
      this.anInt_3550 = var1.readShort(-606148326) * -474390729;
      this.anInt_3551 = var1.readShort(1211890439) * 190070285;
      this.anInt_3552 = var1.readShort(1056210263) * -1749496573;
      this.anInt_3553 = var1.readShort(625413992) * -1451738109;
      this.anInt_3554 = var1.readShort(-943208223) * -1585629231;
      int var6 = var1.readByte(1402933183);
      if(var6 > 0) {
         this.aNodeArrayListArray_3547 = new NodeArrayList[var6];

         for(int var7 = 0; var7 < var6; ++var7) {
            int var8 = var1.readShort(-986390272);
            NodeArrayList var9 = new NodeArrayList(Class105.method1359(var8, (byte)125));
            this.aNodeArrayListArray_3547[var7] = var9;

            while(var8-- > 0) {
               int var10 = var1.method4480(1260717178);
               int var11 = var1.method4480(1260717178);
               var9.insert(new IndexNode(var11), (long)var10);
            }
         }
      }

      var1.index = 0;
      this.title = var1.method4523(-892050887);
      this.actions = new InterfaceID[var5];
      return var4;
   }

   void loadAction(ByteArrayDataNode var1, int var2, InterfaceID var3, int var4) {
      int var5 = this.actions.length;
      if(var3 != InterfaceID.anInterfaceAction_4831 && var3 != InterfaceID.anInterfaceAction_4832) {
         if(var3 == InterfaceID.anInterfaceAction_5531) {
            Class282 var9 = (Class282)Class559.method6185(Class282.method3656((byte)-31), var1.readByte(-112811648), (byte)63);
            switch(-1587892197 * var9.anInt_4776) {
            case 1:
               if(null == this.anIntArray_3544) {
                  this.anIntArray_3544 = new int[var5];
               }

               var3 = InterfaceID.anInterfaceAction_5312;
               this.anIntArray_3544[var2] = var1.method4480(1260717178);
               break;
            case 2:
               if(null == this.anObjectArray_3548) {
                  this.anObjectArray_3548 = new Object[var5];
               }

               var3 = InterfaceID.anInterfaceAction_4855;
               this.anObjectArray_3548[var2] = Long.valueOf(var1.method4538(1385013726));
               break;
            case 3:
               if(this.anObjectArray_3548 == null) {
                  this.anObjectArray_3548 = new Object[var5];
               }

               this.anObjectArray_3548[var2] = var1.method4485(-728577519).intern();
               break;
            default:
               throw new RuntimeException();
            }
         } else if(InterfaceID.anInterfaceAction_4833 != var3 && var3 != InterfaceID.anInterfaceAction_4834) {
            if(null == this.anIntArray_3544) {
               this.anIntArray_3544 = new int[var5];
            }

            if(var3.aBoolean_5287) {
               this.anIntArray_3544[var2] = var1.method4480(1260717178);
            } else {
               this.anIntArray_3544[var2] = var1.readByte(381620941);
            }
         } else {
            int var8 = var1.readShort(-212345132);
            if(null == this.anObjectArray_3548) {
               this.anObjectArray_3548 = new Object[var5];
            }

            this.anObjectArray_3548[var2] = this.aClass185_3556.method2280(var8, (byte)-96);
            if(null == this.anIntArray_3544) {
               this.anIntArray_3544 = new int[var5];
            }

            this.anIntArray_3544[var2] = var1.readByte(1651869575);
         }
      } else {
         Class283 var6 = (Class283)Class559.method6185(Class283.method3664((short)-11990), var1.readByte(1108182260), (byte)55);
         int var7 = var1.readShort(-365978847);
         if(this.anObjectArray_3548 == null) {
            this.anObjectArray_3548 = new Object[var5];
         }

         this.anObjectArray_3548[var2] = this.aClass185_3556.method2281(var6, var7, -2011352765);
         if(this.anIntArray_3544 == null) {
            this.anIntArray_3544 = new int[var5];
         }

         this.anIntArray_3544[var2] = var1.readByte(225925995);
      }

      this.actions[var2] = var3;
   }

   public InterfaceDataComposite(ByteArrayDataNode var1, Class185 var2) {
      this.aClass185_3556 = var2;
      int var3 = this.loadInterfaceData(var1, 1282896764);
      int var4 = 0;

      for(InterfaceID[] var5 = Class531.getAllInterfaceActions(2111419076); var1.index * 964952859 < var3; ++var4) {
         InterfaceID var6 = this.getID(var1, var5, 1228888754);
         this.loadAction(var1, var4, var6, 688136967);
      }

   }

   static final void method2613(int var0) {
      int var1 = -688404505 * Class15.availablePlayers;
      int[] var2 = Class15.playersIndices;

      for(int var3 = 0; var3 < var1; ++var3) {
         Player var4 = client.aPlayerArray[var2[var3]];
         if(null != var4) {
            Class572.method6275(var4, false, 1834898295);
         }
      }

   }
}
