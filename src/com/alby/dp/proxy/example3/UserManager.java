package com.alby.dp.proxy.example3;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;

public class UserManager {

    public Collection<UserModelApi> getUserByDepId(String depId) throws Exception {
        Collection<UserModelApi> col = new ArrayList<UserModelApi>();
        Connection conn = this.getConnection();

        String sql = "select * from tbl_user u,tbl_dep d where u.depId = d.depId and d.depid like ?";
        PreparedStatement pst = conn.prepareStatement(sql);

        pst.setString(1, depId + "%");

        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
            ////这个创建代理对象
            Proxy proxy = new Proxy(new UserModel());
            proxy.setUserId(rs.getString("userId"));
            proxy.setName(rs.getString("name"));

            col.add(proxy);
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
