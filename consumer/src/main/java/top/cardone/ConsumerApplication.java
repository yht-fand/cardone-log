package top.cardone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ImportResource;

/**
 * 主执行端
 *
 * @author yao hai tao
 */
@SpringBootApplication(exclude = {
        org.springframework.boot.autoconfigure.admin.SpringApplicationAdminJmxAutoConfiguration.class,
        org.springframework.boot.autoconfigure.aop.AopAutoConfiguration.class,
        org.springframework.boot.autoconfigure.amqp.RabbitAutoConfiguration.class,
        org.springframework.boot.autoconfigure.MessageSourceAutoConfiguration.class,
//        org.springframework.boot.autoconfigure.PropertyPlaceholderAutoConfiguration.class,
        org.springframework.boot.autoconfigure.batch.BatchAutoConfiguration.class,
        org.springframework.boot.autoconfigure.cache.CacheAutoConfiguration.class,
        org.springframework.boot.autoconfigure.cassandra.CassandraAutoConfiguration.class,
//        org.springframework.boot.autoconfigure.cloud.CloudAutoConfiguration.class,
//        org.springframework.boot.autoconfigure.context.ConfigurationPropertiesAutoConfiguration.class,
        org.springframework.boot.autoconfigure.dao.PersistenceExceptionTranslationAutoConfiguration.class,
        org.springframework.boot.autoconfigure.data.cassandra.CassandraDataAutoConfiguration.class,
        org.springframework.boot.autoconfigure.data.cassandra.CassandraRepositoriesAutoConfiguration.class,
        org.springframework.boot.autoconfigure.data.elasticsearch.ElasticsearchAutoConfiguration.class,
        org.springframework.boot.autoconfigure.data.elasticsearch.ElasticsearchDataAutoConfiguration.class,
        org.springframework.boot.autoconfigure.data.elasticsearch.ElasticsearchRepositoriesAutoConfiguration.class,
        org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration.class,
        org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration.class,
        org.springframework.boot.autoconfigure.data.mongo.MongoRepositoriesAutoConfiguration.class,
        org.springframework.boot.autoconfigure.data.solr.SolrRepositoriesAutoConfiguration.class,
        org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration.class,
        org.springframework.boot.autoconfigure.data.rest.RepositoryRestMvcAutoConfiguration.class,
        org.springframework.boot.autoconfigure.data.web.SpringDataWebAutoConfiguration.class,
        org.springframework.boot.autoconfigure.freemarker.FreeMarkerAutoConfiguration.class,
        org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration.class,
        org.springframework.boot.autoconfigure.h2.H2ConsoleAutoConfiguration.class,
        org.springframework.boot.autoconfigure.hateoas.HypermediaAutoConfiguration.class,
        org.springframework.boot.autoconfigure.hazelcast.HazelcastAutoConfiguration.class,
        org.springframework.boot.autoconfigure.hazelcast.HazelcastJpaDependencyAutoConfiguration.class,
        org.springframework.boot.autoconfigure.integration.IntegrationAutoConfiguration.class,
        org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration.class,
        org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration.class,
        org.springframework.boot.autoconfigure.jdbc.JndiDataSourceAutoConfiguration.class,
        org.springframework.boot.autoconfigure.jdbc.XADataSourceAutoConfiguration.class,
        org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration.class,
        org.springframework.boot.autoconfigure.jms.JmsAutoConfiguration.class,
        org.springframework.boot.autoconfigure.jmx.JmxAutoConfiguration.class,
        org.springframework.boot.autoconfigure.jms.JndiConnectionFactoryAutoConfiguration.class,
        org.springframework.boot.autoconfigure.jms.activemq.ActiveMQAutoConfiguration.class,
        org.springframework.boot.autoconfigure.jms.artemis.ArtemisAutoConfiguration.class,
        org.springframework.boot.autoconfigure.jms.hornetq.HornetQAutoConfiguration.class,
        org.springframework.boot.autoconfigure.flyway.FlywayAutoConfiguration.class,
        org.springframework.boot.autoconfigure.groovy.template.GroovyTemplateAutoConfiguration.class,
        org.springframework.boot.autoconfigure.jersey.JerseyAutoConfiguration.class,
        org.springframework.boot.autoconfigure.jooq.JooqAutoConfiguration.class,
        org.springframework.boot.autoconfigure.liquibase.LiquibaseAutoConfiguration.class,
        org.springframework.boot.autoconfigure.mail.MailSenderAutoConfiguration.class,
        org.springframework.boot.autoconfigure.mail.MailSenderValidatorAutoConfiguration.class,
        org.springframework.boot.autoconfigure.mobile.DeviceResolverAutoConfiguration.class,
        org.springframework.boot.autoconfigure.mobile.DeviceDelegatingViewResolverAutoConfiguration.class,
        org.springframework.boot.autoconfigure.mobile.SitePreferenceAutoConfiguration.class,
        org.springframework.boot.autoconfigure.mongo.embedded.EmbeddedMongoAutoConfiguration.class,
        org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration.class,
        org.springframework.boot.autoconfigure.mustache.MustacheAutoConfiguration.class,
        org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration.class,
        org.springframework.boot.autoconfigure.reactor.ReactorAutoConfiguration.class,
        org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration.class,
        org.springframework.boot.autoconfigure.security.SecurityFilterAutoConfiguration.class,
        org.springframework.boot.autoconfigure.security.FallbackWebSecurityAutoConfiguration.class,
        org.springframework.boot.autoconfigure.security.oauth2.OAuth2AutoConfiguration.class,
        org.springframework.boot.autoconfigure.sendgrid.SendGridAutoConfiguration.class,
        org.springframework.boot.autoconfigure.session.SessionAutoConfiguration.class,
        org.springframework.boot.autoconfigure.social.SocialWebAutoConfiguration.class,
        org.springframework.boot.autoconfigure.social.FacebookAutoConfiguration.class,
        org.springframework.boot.autoconfigure.social.LinkedInAutoConfiguration.class,
        org.springframework.boot.autoconfigure.social.TwitterAutoConfiguration.class,
        org.springframework.boot.autoconfigure.solr.SolrAutoConfiguration.class,
        org.springframework.boot.autoconfigure.velocity.VelocityAutoConfiguration.class,
        org.springframework.boot.autoconfigure.thymeleaf.ThymeleafAutoConfiguration.class,
        org.springframework.boot.autoconfigure.transaction.TransactionAutoConfiguration.class,
        org.springframework.boot.autoconfigure.transaction.jta.JtaAutoConfiguration.class,
//        org.springframework.boot.autoconfigure.web.DispatcherServletAutoConfiguration.class,
//        org.springframework.boot.autoconfigure.web.EmbeddedServletContainerAutoConfiguration.class,
        org.springframework.boot.autoconfigure.web.ErrorMvcAutoConfiguration.class,
        org.springframework.boot.autoconfigure.web.HttpEncodingAutoConfiguration.class,
        org.springframework.boot.autoconfigure.web.HttpMessageConvertersAutoConfiguration.class,
        org.springframework.boot.autoconfigure.web.MultipartAutoConfiguration.class,
//        org.springframework.boot.autoconfigure.web.ServerPropertiesAutoConfiguration.class,
        org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration.class,
        org.springframework.boot.autoconfigure.websocket.WebSocketAutoConfiguration.class,
        org.springframework.boot.autoconfigure.websocket.WebSocketMessagingAutoConfiguration.class
})
@EnableEurekaClient
@ImportResource({"${app.root}/config/applicationContext.xml"})
public class ConsumerApplication {
    /**
     * 主方法
     *
     * @param args 参数
     * @throws Exception 异常
     */
    public static void main(String[] args) throws Exception {
        SpringApplication.run(ConsumerApplication.class, args);
    }
}