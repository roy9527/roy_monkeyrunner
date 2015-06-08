package com.elong.swdd.main;

import com.android.monkeyrunner.MonkeyDevice;
import com.android.monkeyrunner.adb.AdbBackend;

public class Main {

	public static void main(String[] args) {
		AdbBackend ab = new AdbBackend();
		MonkeyDevice md = ab.waitForConnection();
		try {
			md.getManager().press("menu");
//			md.startActivity("", "", "", "", null, null, "", 0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		ab.shutdown();
		System.exit(0);
	}

}
