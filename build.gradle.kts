plugins {
	java
	id("org.springframework.boot") version "3.2.11"
	id("io.spring.dependency-management") version "1.1.6"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(17)
	}
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-aop")
	implementation("org.springframework.boot:spring-boot-starter")
	implementation("org.springframework.boot:spring-boot-starter-web")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")
	implementation("org.hibernate.orm:hibernate-core:6.2.7.Final")

	// Oracle JDBC 驅動
	implementation("com.oracle.database.jdbc:ojdbc8:19.19.0.0")
	// Spring Data JPA（如果需要使用 JPA）
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	// Spring JDBC（如果需要使用 JDBC）
	implementation("org.springframework.boot:spring-boot-starter-jdbc")

}

tasks.withType<Test> {
	useJUnitPlatform()
}
