package config;

import org.apache.commons.dbcp.BasicDataSource;
import org.h2.store.Data;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by
 *
 * @author Belkevich V.A.
 *         17.02.2017 11:10
 */

@Configuration
@ComponentScan(basePackages = {"by.belkevich"} )
@EnableTransactionManagement()
@Import({by.belkevich.config.CoreConfig.class,by.belkevich.config.JPAConfig.class})
public class TestJPAConfig {

    /**
     * Overrides dataSource bean from main configuration class
     * @return test dataSource
     */
    @Bean
    public BasicDataSource dataSource(){
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("org.h2.Driver");
        dataSource.setUsername("sa");
        dataSource.setPassword("");
        dataSource.setUrl("jdbc:h2:~/test-breakingnews");

        dataSource.setInitialSize(10);
        dataSource.setMaxActive(50);
        dataSource.setMaxIdle(50);
        dataSource.setMaxWait(6000);

//
//        List<String> stringList = new ArrayList<>();
//        stringList.add("")
//        dataSource.setConnectionInitSqls(stringList);

        return dataSource;
    }

}
