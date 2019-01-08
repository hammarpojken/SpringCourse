package com.hammar.spring.basics.udemyspringlevel.cdi;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SomeCdiBusinessTest {
	
	@InjectMocks
	SomeCdiBusiness business;
	
	@Mock
	SomeCdiDAO daoMock;

	@Test
	public void testBasicSenario() {
		Mockito.when(daoMock.getData()).thenReturn(new int[] {2,4});
		assertEquals(4, business.findGreatest());
	}
	@Test
	public void testBasicSenario_NoElements() {
		Mockito.when(daoMock.getData()).thenReturn(new int[] {});
		assertEquals(Integer.MIN_VALUE, business.findGreatest());
	}

}
