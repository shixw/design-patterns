package com.alby.dp.proxy.example3;

import java.sql.*;

/**
 * Created by xianwei on 2015/12/4.
 * 代理对象，代理用户数据对象
 */
public class Proxy implements UserModelApi {
    //持有被代理的具体的目标对象
    private UserModel realSubject = null;

    public Proxy(UserModel realSubject) {
        this.realSubject = realSubject;
    }

    //标示是都已经重新装载过数据了
    private boolean loaded = false;

    @Override
    public String getUserId() {
        return realSubject.getUserId();
    }

    @Override
    public void setUserId(String userId) {
        realSubject.setUserId(userId);
    }

    @Override
    public String getName() {
        return realSubject.getName();
    }

    @Override
    public void setName(String name) {
        realSubject.setName(name);
    }

    @Override
    public String getDepId() {
        if (!this.loaded) {
            reload();
            this.loaded = true;
        }
        return realSubject.getDepId();
    }

    @Override
    public void setDepId(String depId) {
        realSubject.setDepId(depId);
    }

    @Override
    public String getSex() {
        if (!this.loaded) {
            reload();
            this.loaded = true;
        }
        return realSubject.getSex();
    }

    private Connection getConnection() throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:maximo", "maximo", "maximo");
    }

    private void reload() {
        Connection conn = null;
        try {
            conn = this.getConnection();
            String sql = "select * from tbl_user where userId=? ";
            PreparedStatement pst = conn.prepareStatement(sql);

            pst.setString(1, realSubject.getUserId());

            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                realSubject.setDepId(rs.getString("depid"));
                realSubject.setSex(rs.getString("sex"));
            }
            rs.close();
            pst.close();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void setSex(String sex) {
        realSubject.setSex(sex);
    }
}
