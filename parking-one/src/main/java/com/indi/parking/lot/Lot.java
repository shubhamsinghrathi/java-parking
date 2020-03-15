package com.indi.parking.lot;

import java.util.HashMap;
import java.util.Map;

import com.indi.parking.lot.slot.Slot;
import com.indi.parking.lot.slot.SlotInfo;

public class Lot {
	LotInfo lotInfo;
	
	public Lot(int totalCars) {
		LotSizeInfo lotSizeInfo = new LotSizeInfo(totalCars);
		lotInfo = new LotInfo(lotSizeInfo);
		Map<Integer, Slot> slotMap = new HashMap<Integer, Slot>();
		addToSlotMap(slotMap, totalCars);
	}
	
	private static void addToSlotMap(Map<Integer, Slot> slotMap, int totalCars) {
		for (int i=0; i<=totalCars; i++) {
			Slot slot = new Slot();
			setSlotInfo(slot, i);
			slotMap.put(i, slot);
		}
	}
	
	private static void setSlotInfo(Slot slot, int i) {
		SlotInfo slotInfo = new SlotInfo();
		slotInfo.number = i;
		slot.slotInfo = slotInfo;
	}
}
