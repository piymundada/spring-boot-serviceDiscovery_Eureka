# Spring-Cloud-Config-Server
Config server to host all dependency micro service URLs

Config repo url is mentioned in application.properties file.
(spring.cloud.config.server.git.uri)

##Mark it as config server
To define it as config Server
we need to add @EnableConfigServer to our main class 

##Dependencies to add
        <dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-config-server</artifactId>
		</dependency>


    <dependencyManagement>
		<dependencies>
			<dependency>
				<groupId>org.springframework.cloud</groupId>
				<artifactId>spring-cloud-dependencies</artifactId>
				<version>${spring-cloud.version}</version>
				<type>pom</type>
				<scope>import</scope>
			</dependency>
		</dependencies>
	</dependencyManagement>
