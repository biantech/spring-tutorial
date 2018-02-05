package com.biantech.spring4.samples.datasource;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;

/**
 * <code>DataSourceDbcpXmlTest</code>
 *
 * @author jonathan.bian
 * @version 1.0
 * @since 1.0 2016-05-13
 *
 * mvn test -Dtest=DataSourceDbcpXmlTest
 */
@SpringApplicationConfiguration( locations = {"classpath:spring/dataSource-dbcp.xml"})
@ActiveProfiles("dbcp-xml")
public class DataSourceDbcpXmlTest extends AbstractDataSourceTest {

}
