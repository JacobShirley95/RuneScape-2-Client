public class Class273 implements Class551 {

	final int anInt_4708;
	static final Class273 aClass273_4709 = new Class273(1);
	static final Class273 aClass273_4710 = new Class273(2);
	static final Class273 aClass273_4711 = new Class273(0);
	public static int anInt_4712;

	public int getLanguageID(int var1) {
		return this.anInt_4708 * 702787519;
	}

	Class273(int var1) {
		this.anInt_4708 = var1 * 2096644159;
	}

	static void method3597(InterfaceDataComposite var0, int var1, RSInterfaceData var2,
			int var3) {
		var2.intTypeIndex = 0;
		var2.stringDataIndex = 0;
		var2.anInt_9510 = 1856838429;
		var2.composite = var0;
		var2.actions = var2.composite.actions;
		var2.anIntArray_9518 = var2.composite.anIntArray_3544;
		InterfaceID curAction = null;
		var2.anInt_9505 = 0;
		var2.aMap_9513.clear();
		var2.aMap_9513.put(Class283.aClass283_4785,
				Class240_Sub41_Sub3.aClass23_1024.aClass608_202);
		var2.aMap_9513.put(Class283.aClass283_4783,
				Class267.preferenceFileList);
		var2.aMap_9513.put(Class283.aClass283_4786, Class97.aClass178_1926);
		if (var2.aClass68_9508 != null) {
			var2.aMap_9513.put(Class283.aClass283_4790,
					Class304.method3836(var2.aClass68_9508, -1958817090));
		}

		if (var2.animeTarget instanceof NPC) {
			var2.aMap_9513.put(Class283.aClass283_4781,
					var2.animeTarget.aClass169_4355);
		}

		if (var2.animeTarget instanceof Player) {
			var2.targetMap.put(Class283.aClass283_4785,
					var2.animeTarget.aClass169_4355);
		}

		boolean var11 = false;

		label139: {
			try {
				StringBuilder var6;
				int var7;
				try {
					var11 = true;
					Class556.anInt_9542 = 0;

					while (true) {
						Class556.anInt_9542 += 85131221;
						if (229917053 * Class556.anInt_9542 > var1) {
							throw new RuntimeException("");
						}

						curAction = var2.actions[(var2.anInt_9510 += -1856838429)
								* -1756266293];
						if (Class556.aBoolean_9548
								&& (null == Class556.aString_9543 || var2.composite.title != null
										&& var2.composite.title
												.indexOf(Class556.aString_9543) != -1)) {
							System.out.println(var2.composite.title + ": "
									+ curAction);
						}

						if (1 == var2.anIntArray_9518[-1756266293
								* var2.anInt_9510]) {
							var2.aBoolean_9522 = true;
						} else {
							var2.aBoolean_9522 = false;
						}

						if (InterfaceID.anInterfaceAction_4958 == curAction
								&& var2.anInt_9505 * 853810813 == 0) {
							var11 = false;
							break label139;
						}

						Class301.loadInterfaceData(curAction, var2);
					}
				} catch (Exception var12) {
					var6 = new StringBuilder(30);
					var6.append("")
							.append(var2.composite.id * 4058728944299054175L)
							.append(" ");
					var7 = 853810813 * var2.anInt_9505 - 1;

					while (var7 >= 0) {
						var6.append("")
								.append(4058728944299054175L * var2.interfaceData[var7].interfaceComp.id)
								.append(" ");
						--var7;
					}

					var6.append("").append(
							Integer.valueOf(curAction.id * 299476015));
					CacheFileID.method1397(var6.toString(), var12, -404423615);
					var11 = false;
				}
			} finally {
				if (var11) {
					Class109.decInterfaceIndex(2143648636);
				}
			}

			Class109.decInterfaceIndex(2108860359);
			return;
		}

		Class109.decInterfaceIndex(2099872416);
	}

	static final void method3598(RSInterfaceData var0, int var1) {
		int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
		ConnectionHandler var3 = Class32.method230(-1250865319);
		Class240_Sub27 var4 = Class47_Sub1.method3496(Class326.aClass326_6319,
				var3.aClass528_3433, 1917447504);
		var4.aClass240_Sub8_Sub1_7370.putByte(var2, 1885277945);
		var3.addPacket(var4, 1831338187);
	}

	static final void method3599(RSInterfaceData var0, int var1) {
		ConnectionHandler var2 = Class32.method230(-711910066);
		Class240_Sub27 var3 = Class47_Sub1.method3496(Class326.aClass326_6285,
				var2.aClass528_3433, 1917447504);
		var3.aClass240_Sub8_Sub1_7370.putByte(0, 998335878);
		int var4 = 964952859 * var3.aClass240_Sub8_Sub1_7370.index;
		var3.aClass240_Sub8_Sub1_7370.putByte(1, 1731294151);
		var3.aClass240_Sub8_Sub1_7370.method4463(-405493655
				* var0.aClass420_9507.anInt_7968, -2099778336);
		var0.aClass420_9507.aClass240_Sub22_Sub16_7967.method2676(
				var3.aClass240_Sub8_Sub1_7370,
				var0.aClass420_9507.anIntArray_7966, 1709190779);
		var3.aClass240_Sub8_Sub1_7370.method4521(964952859
				* var3.aClass240_Sub8_Sub1_7370.index - var4, -907432342);
		var2.addPacket(var3, 482188155);
	}

	public static Class520[] method3600(int var0) {
		return new Class520[] { Class520.aClass520_9238,
				Class520.aClass520_9241, Class520.aClass520_9240,
				Class520.aClass520_9236, Class520.aClass520_9239,
				Class520.aClass520_9237 };
	}

	public static void method3601(int var0) {
		if (4 == -243034353 * client.loginStage) {
			if (!Class66.method680(-1789991087)
					&& !Class119.method1505((byte) 71)) {
				Class418.method5190(2, (byte) -44);
			}
		}
	}

	static final void method3602(RSInterfaceData var0, int var1) {
		int var2 = var0.intTypes[(var0.intTypeIndex -= -708028207) * -831324111];
		RSInterface var3 = RSServerQueue.getInterface(var2, (byte) 105);
		RSInterfaceGroup var4 = RSInterface.interfaceGroups[var2 >> 16];
		Class167.method2079(var3, var4, var0, 927344208);
	}
}
