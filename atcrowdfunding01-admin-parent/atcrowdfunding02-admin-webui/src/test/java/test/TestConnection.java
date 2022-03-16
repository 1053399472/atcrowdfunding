package test;


import crowd.entity.Admin;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import ponent.mapper.AdminMapper;
import ponent.service.api.AdminService;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@SpringJUnitConfig(locations = {"classpath:spring-persist-mybatis.xml","classpath:spring-persist-tx.xml"})
public class TestConnection {
    @Autowired
    private DataSource dataSource;
    @Test
    public void testConnection() throws SQLException {
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
    }
    @Autowired
    private AdminMapper adminMapper;
    @Test
    public void testmapper(){
        Admin admin = new Admin(null, "Rachel", "123123", "rui", "rui@qq.com", null);
        int insert = adminMapper.insert(admin);
        System.out.println(insert);
    }
    @Test
    public void test1(){
        Logger logger = LoggerFactory.getLogger(TestConnection.class);
        logger.debug("debug");
        logger.warn("warn");
        logger.info("info");
        logger.error("error");
    }
    @Autowired
    private AdminService adminService;
    @Test
    public void textTx(){
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter inFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String format = dateTime.format(inFormat);
        Admin admin = new Admin(null, "hh", "123123", "rui", "rui@qq.com", format);
        adminService.saveAdmin(admin);
    }


}
