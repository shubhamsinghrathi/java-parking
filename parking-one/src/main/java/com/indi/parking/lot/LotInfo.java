package com.indi.parking.lot;

import java.util.Map;

import com.indi.parking.lot.slot.Slot;

public class LotInfo {
	LotSizeInfo lotSizeInfo;
	Map<Integer, Slot> slotMap;
	
	public LotInfo(LotSizeInfo lotSizeInfo) {
		this.lotSizeInfo = lotSizeInfo;
	}
	
	public void updateLotEntries(Boolean shouldIncrease) {
		int value = 1;
		if (shouldIncrease == false) {
			value = -1;
		}
		
		lotSizeInfo.totalEntries += value;
		if (lotSizeInfo.totalEntries < 0) {
			lotSizeInfo.totalEntries = 0;
		}
	}
}
