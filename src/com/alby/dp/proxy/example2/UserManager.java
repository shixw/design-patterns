package com.alby.dp.proxy.example2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by xianwei on 2015/12/4.
 * 实现示例要求的功能
 */
public class UserManager {

    public Collection<UserModel> getUserByDepId(String depId) throws Exception {
        Collection<UserModel> col = new ArrayList<UserModel>();
        Connection conn = this.getConnection();

        String sql = "select * from tbl_user u,tbl_dep d where u.depId = d.depId and d.depid like ?";
        PreparedStatement pst = conn.prepareStatement(sql);

        pst.setString(1, depId + "%");

        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
            UserModel um = new UserModel();
            um.setUserId(rs.getString("userId"));
            um.setName(rs.getString("name"));
            um.setDepId(rs.getString("depid"));
            um.setSex(rs.getString("sex"));
            col.add(um);
        }
        rs.close();
        pst.close();
        conn.close();
        return col;
    }

    private Connection getConnection() throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:maximo", "maximo", "maximo");
    }
}
