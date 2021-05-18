/*
 * package com.example.demo.Configuration;
 * 
 * 
 * import com.mongodb.Mongo; import
 * cz.jirutka.spring.embedmongo.EmbeddedMongoBuilder; import
 * org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration;
 * 
 * import java.io.IOException; import java.net.ServerSocket;
 * 
 * @Configuration public class MongoConfiguration {
 * 
 * @Bean public Mongo mongo() throws IOException {
 * System.setProperty("DB.TRACE","true"); return new EmbeddedMongoBuilder()
 * .version("2.13.1") .bindIp("127.0.0.1") .port(allocateRandomPort()) .build();
 * } }
 */