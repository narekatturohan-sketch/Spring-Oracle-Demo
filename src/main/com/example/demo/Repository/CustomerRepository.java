package com.example.demo.repository;

import com.example.demo.model.Customer;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class CustomerRepository {
    private final JdbcTemplate jdbcTemplate;

    public CustomerRepository(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Customer> findAll() {
        String sql = """
                        SELECT ACC_NUMB, BRNCH_NUMB, ACC_TYPE, ACC_SUB_TYPE, ACC_STS
                        FROM acctmasterdetaild0 WHERE DEL_FLAG = 'N'
                    """;
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            new Customer(
                rs.getString("ACC_NUMB"),
                rs.getString("BRNCH_NUMB"),
                rs.getString("ACC_TYPE"),
                rs.getString("ACC_SUB_TYPE"),
                rs.getString("ACC_STS")
            );
        });
    }
}