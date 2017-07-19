package info.ragozin.proflab;

import org.junit.BeforeClass;
import org.junit.Test;

public class CleanPhantomBench {

	@BeforeClass
	public static void deathWatch() {
		DeathWatch.start();
	}
	
	@Test
	public void bench() {
		new ReferenceUsageCheck().low_leaking_references_phantom();
	}	
}
