/**
 * 
 */
package org.springframework.data.aerospike.repository.support;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 *
 *
 * @author Peter Milne
 * @author Jean Mercier
 *
 */
@RunWith(Suite.class)
@SuiteClasses({ AerospikeRepositoryFactoryTest.class,
		SimpleAerospikeRepositoryTest.class })
public class AllTests {

}
