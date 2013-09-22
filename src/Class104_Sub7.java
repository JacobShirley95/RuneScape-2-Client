public class Class104_Sub7 extends CharTask {

	final int anInt_4428;
	final int anInt_4429;
	final int anInt_4430;
	final int anInt_4431;
	Class225 aClass225_4432;
	public static int anInt_4433;

	Class104_Sub7(ByteArrayDataNode var1) {
		super(var1);
		this.anInt_4429 = var1.readShort(-1105256479) * 572975941;
		this.anInt_4428 = var1.readByte(638318646) * -836716403;
		this.anInt_4430 = var1.readByte(1368006118) * 55039181;
		this.anInt_4431 = var1.readByte(127638083) * 1513063887;
	}

	public void execute() {
		this.aClass225_4432 = Class374.method4755(this.anInt_4429 * -126881907,
				this.anInt_4431 * 788357423, 0, -678704571 * this.anInt_4428,
				-1120126971 * this.anInt_4430, -952603512);
	}

	void method1343(byte var1) {
		if (null != this.aClass225_4432) {
			Class129.method1665(this.aClass225_4432, -368457891);
			this.aClass225_4432 = null;
		}

	}

	public static int getOptionAction(OptionListNode var0, byte var1) {
		if (Class18.optionsClosed) {
			return 6;
		} else if (null == var0) {
			return 0;
		} else {
			int var2 = -533194375 * var0.action;
			return Class500.method5835(var2, (byte) 28) ? 1
					: (Class240_Sub41_Sub1.method431(var2, (byte) -5) ? 2
							: (Class481.method5709(var2, -1088456741) ? 3
									: (Class75.method886(var2, (byte) 16) ? 4
											: (Class565.method6230(var2,
													(byte) 111) ? 7
													: (var2 == 16 ? 8 : 5)))));
		}
	}

	public static void method3379(RSInterface[] var0, int var1, int var2,
			int var3, boolean var4, int var5) {
		for (int var6 = 0; var6 < var0.length; ++var6) {
			RSInterface var7 = var0[var6];
			if (var7 != null && -671235497 * var7.parentID == var1) {
				Class37.method313(var7, var2, var3, var4, (byte) 18);
				Class240_Sub41_Sub1.method434(var7, var2, var3, -1870939377);
				if (var7.scrollX * -340277309 > -1912683305
						* var7.anInt_2453 - -533669195 * var7.width) {
					var7.scrollX = -134753955 * var7.anInt_2453 - 1289626663
							* var7.width;
				}

				if (var7.scrollX * -340277309 < 0) {
					var7.scrollX = 0;
				}

				if (-978526293 * var7.scrollY > 972244665 * var7.anInt_2454
						- var7.height * 1833812087) {
					var7.scrollY = 1081876267 * var7.anInt_2454
							- -1424849307 * var7.height;
				}

				if (var7.scrollY * -978526293 < 0) {
					var7.scrollY = 0;
				}

				if (0 == 1916189739 * var7.index) {
					Class125.method1611(var0, var7, var4, (byte) 0);
				}
			}
		}

	}
}
