package de.techstarter.cinema;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class TicketTest {
	
	// TimeSlot instance
	TimeSlot time = TimeSlot.AFTERNOON; // nicht herausgefunden wie ich enum hier richtig einsetzte
	// create Ticket instance
	Ticket blank = Ticket("Room", TimeSlot.AFTERNOON, LocalDate.of(2022, 12, 18), 'f', 14);
	
	@Test
	void testGetRoom() {
		String expected = "Room";
		String actual = blank.getRoom();
		assertEquals(expected, actual);
		// fail("Not yet implemented"); // TODO
	}

	private Ticket Ticket(String string, TimeSlot afternoon, LocalDate of, char c, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Test
	void testGetTimeSlot() {
		// assertEquals("AFTERNOON", Ticket.TimeSlot.AFTERNOON);
		fail("Not yet implemented"); // TODO
	}

	@Test
	void testGetDate() {
		LocalDate expected = LocalDate.of(2022, 12, 18);
		LocalDate actual = blank.getDate();
		assertEquals(expected, actual);
		// fail("Not yet implemented"); // TODO
	}

	@Test
	void testGetRow() {
		char expected = 'f';
		char actual = blank.getRow();
		assertEquals(expected, actual);
		// fail("Not yet implemented"); // TODO
	}

	@Test
	void testGetPlace() {
		int expected = 14;
		int actual = blank.getPlace();
		assertEquals(expected, actual);
		// fail("Not yet implemented"); // TODO
	}

}
