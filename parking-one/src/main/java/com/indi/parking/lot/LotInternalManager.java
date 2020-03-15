package com.indi.parking.lot;

import com.indi.parking.lot.ticket.Ticket;

public interface LotInternalManager {
	
	public void parkCar(Ticket ticket) throws Exception;
	
	public void carExit(Ticket ticket) throws Exception;
	
}
