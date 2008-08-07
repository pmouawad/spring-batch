package org.springframework.batch.item.file.transform;

import junit.framework.TestCase;

import org.springframework.batch.item.file.transform.LineAggregator;
import org.springframework.batch.item.file.transform.PassThroughLineAggregator;

public class PassThroughLineAggregatorTests extends TestCase {
	
	private LineAggregator<Object> mapper = new PassThroughLineAggregator<Object>();

	public void testUnmapItemAsFieldSet() {
		Object item = new Object();
		assertEquals(item.toString(), mapper.aggregate(item));
	}

	public void testUnmapItemAsString() {
		assertEquals("foo", mapper.aggregate("foo"));
	}

}
