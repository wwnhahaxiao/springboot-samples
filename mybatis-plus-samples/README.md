1.  引入依赖  
    `<dependency>`  
    &nbsp;&nbsp;&nbsp;&nbsp;`<groupId>`com.baomidou`</groupId>`  
    &nbsp;&nbsp;&nbsp;&nbsp;`<artifactId>`mybatis-plus-boot-starter`</artifactId>`  
    &nbsp;&nbsp;&nbsp;&nbsp;`<version>`3.5.1`</version>`  
    `</dependency>`  
    `<dependency>`  
    &nbsp;&nbsp;&nbsp;&nbsp;`<groupId>`mysql`</groupId>`  
    &nbsp;&nbsp;&nbsp;&nbsp;`<artifactId>`mysql-connector-java`</artifactId>`  
    &nbsp;&nbsp;&nbsp;&nbsp;`<scope>`runtime`</scope>`  
    `</dependency>`  
2.  Application添加mapper扫描注解  
@MapperScan("com.roshan.dao")  
3.  配置数据库相关信息  
spring: datasource: url:  
&nbsp;&nbsp;&nbsp;&nbsp;jdbc:mysql://localhost:3306/dynamicTest1?serverTimezone=UTC  
&nbsp;&nbsp;&nbsp;&nbsp;username: root  
&nbsp;&nbsp;&nbsp;&nbsp;password: root  
&nbsp;&nbsp;&nbsp;&nbsp;driver-class-name: com.mysql.cj.jdbc.Driver
4.  mapper继承com.baomidou.mybatisplus.core.mapper.BaseMapper
