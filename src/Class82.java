public class Class82 {

	public static final int anInt_1546 = 4;
	public static final int anInt_1547 = 3;
	public static final int anInt_1548 = 4;
	public static final int anInt_1549 = 16;
	public static final int anInt_1550 = 32;
	public static final int anInt_1551 = 64;
	public static final int anInt_1552 = 2;
	public static final int anInt_1553 = 5;
	public static final int anInt_1554 = 4;
	public static final int anInt_1555 = 7;
	public static final int anInt_1556 = 8;
	public static final int anInt_1557 = 2;
	public static final int anInt_1558 = 32;
	public static final int anInt_1559 = 128;
	public static final int anInt_1560 = 2;
	public static final int anInt_1561 = 512;
	public static final int anInt_1562 = 1024;
	public static final int anInt_1563 = 2048;
	public static final int anInt_1564 = 4096;
	public static final int anInt_1565 = 8192;
	public static final int anInt_1566 = 2;
	public static final int anInt_1567 = 16384;
	static final float aFloat_1568 = 1.0F;
	public static final int anInt_1569 = 131072;
	public static final int anInt_1570 = 1;
	public static final int anInt_1571 = 524288;
	public static final int anInt_1572 = 1048576;
	public static final int anInt_1573 = 1;
	public static final int anInt_1574 = 2;
	public static final int anInt_1575 = 4;
	public static final int anInt_1576 = 32;
	public static final int anInt_1577 = 1;
	public static final int anInt_1578 = 1;
	public static final int anInt_1579 = 4;
	public static final int anInt_1580 = 8;
	public static final int anInt_1581 = 16;
	public static final int anInt_1582 = 2;
	public static final int anInt_1583 = 1;
	public static final int anInt_1584 = 4;
	public static final int anInt_1585 = 0;
	public static final int anInt_1586 = 1;
	public static final int anInt_1587 = 256;
	public static final int anInt_1588 = 4;
	public static final int anInt_1589 = 4;
	public static final int anInt_1590 = 0;
	public static final float aFloat_1591 = 1.0F;
	public static final int anInt_1592 = 2;
	public static final int anInt_1593 = 0;
	public static final int anInt_1594 = 1;
	public static final int anInt_1595 = 2;
	public static final int anInt_1596 = 0;
	public static final int anInt_1597 = 1;
	public static final int anInt_1598 = 2;
	public static final int anInt_1599 = 3;
	public static final int anInt_1600 = 1;
	public static final int anInt_1601 = 2;
	public static final int anInt_1602 = 3;
	public static final int anInt_1603 = 32768;
	public static final int anInt_1604 = 5;
	public static final int anInt_1605 = 0;
	public static final int anInt_1606 = 1;
	public static final int anInt_1607 = 2;
	public static final int anInt_1608 = 3;
	public static final int anInt_1609 = 2;
	public static final int anInt_1610 = 65536;
	public static final float aFloat_1611 = 1.0F;
	public static final float aFloat_1612 = 0.25F;
	public static final int anInt_1613 = 262144;
	public static final int anInt_1614 = 15;
	public static final int anInt_1615 = 1;
	public static final float aFloat_1616 = 1.0F;
	static final float aFloat_1617 = 0.0F;
	public static final int anInt_1618 = 2;
	public static final int anInt_1619 = 1;
	public static final int anInt_1620 = 1;
	public static final int anInt_1621 = 1;
	public static final int anInt_1622 = 4;
	public static final int anInt_1623 = 8;
	public static final int anInt_1624 = 16;
	public static final int anInt_1625 = 7;

	Class82() throws Throwable {
		throw new Error();
	}

	static final void method1085(RSInterfaceData var0, int var1) throws Exception_Sub1 {
		var0.intTypeIndex -= 1462854468;
		float var2 = (float) var0.intTypes[var0.intTypeIndex * -831324111];
		float var3 = (float) var0.intTypes[-831324111 * var0.intTypeIndex
				+ 1];
		float var4 = (float) var0.intTypes[2 + var0.intTypeIndex
				* -831324111];
		float var5 = (float) var0.intTypes[3 + var0.intTypeIndex
				* -831324111] / 1000.0F;
		Class542.aClass43_Sub1_9475.method357(
				GameCoord.createCoord(var2, var3, var4), var5, (byte) -1);
	}

	static int compareWorld(RSWorld var0, RSWorld var1, int var2, boolean var3,
			int sortType, boolean var5, int var6) {
		int var7 = compareWorld(var0, var1, var2, var3, 446888808);
		if (0 != var7) {
			return var3 ? -var7 : var7;
		} else if (-1 == sortType) {
			return 0;
		} else {
			int var8 = compareWorld(var0, var1, sortType, var5, 1236152115);
			return var5 ? -var8 : var8;
		}
	}

	static final void method1087(RSInterfaceData var0, int var1) {
		var0.intTypes[(var0.intTypeIndex += -708028207) * -831324111 - 1] = var0.aClass240_Sub47_9501
				.method4984(
						(String) var0.stringData[(var0.stringDataIndex -= -1828074049) * 863838783],
						1010804050);
	}

	public static final void method1088(boolean var0, int var1) {
		Class240_Sub27 var2 = Class47_Sub1.method3496(Class326.aClass326_6273,
				client.gameConnectionHandler.aClass528_3433, 1917447504);
		client.gameConnectionHandler.addPacket(var2, -25011128);

		for (Class240_Sub16 var3 = (Class240_Sub16) client.widgets
				.start(); var3 != null; var3 = (Class240_Sub16) client.widgets
				.next()) {
			if (!var3.hasNext()) {
				var3 = (Class240_Sub16) client.widgets
						.start();
				if (var3 == null) {
					break;
				}
			}

			if (0 == var3.anInt_6897 * 270505159) {
				Class104_Sub8.method3387(var3, true, var0, (byte) -1);
			}
		}

		if (null != client.aClass132_335) {
			Class110_Sub1.method3149(client.aClass132_335, 541406613);
			client.aClass132_335 = null;
		}

	}

	static int compareWorld(RSWorld var0, RSWorld var1, int sortType, boolean up,
			int var4) {
		int var5;
		int var6;
		if (sortType == 1) {
			var5 = 485515171 * var0.players;
			var6 = var1.players * 485515171;
			if (!up) {
				if (-1 == var5) {
					var5 = 2001;
				}

				if (var6 == -1) {
					var6 = 2001;
				}
			}

			return var5 - var6;
		} else if (sortType == 2) {
			return Class476.compareStrings(
					var0.method4392(1659822582).aString_10046,
					var1.method4392(821863306).aString_10046,
					Class599.clientLanguage, -1311015313);
		} else if (sortType == 3) {
			return var0.locAcc.equals("-") ? (var1.locAcc.equals("-") ? 0
					: (up ? -1 : 1))
					: (var1.locAcc.equals("-") ? (up ? 1 : -1) : Class476
							.compareStrings(var0.locAcc, var1.locAcc,
									Class599.clientLanguage, -11778274));
		} else if (sortType == 4) {
			return var0.method6636(1769218169) ? (var1.method6636(1562512583) ? 0
					: 1)
					: (var1.method6636(-428840209) ? -1 : 0);
		} else if (5 == sortType) {
			return var0.method6637(109897549) ? (var1.method6637(-544545329) ? 0
					: 1)
					: (var1.method6637(-485673211) ? -1 : 0);
		} else if (6 == sortType) {
			return var0.method6635(712585948) ? (var1.method6635(932343656) ? 0
					: 1) : (var1.method6635(1118585673) ? -1 : 0);
		} else if (7 == sortType) {
			return var0.method6634(-855579240) ? (var1.method6634(792016454) ? 0
					: 1)
					: (var1.method6634(-2034563263) ? -1 : 0);
		} else if (8 == sortType) {
			var5 = -524571829 * var0.ping;
			var6 = -524571829 * var1.ping;
			if (up) {
				if (var5 == 1000) {
					var5 = -1;
				}

				if (var6 == 1000) {
					var6 = -1;
				}
			} else {
				if (var5 == -1) {
					var5 = 1000;
				}

				if (-1 == var6) {
					var6 = 1000;
				}
			}

			return var5 - var6;
		} else {
			return -1592717877 * var0.serverIndex - -1592717877
					* var1.serverIndex;
		}
	}
}
