package com.xzq.aipcore.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.sql.Date;


@Entity
@Table(name = "t_user", schema = "test", catalog = "")
public class User {
    private long userid;
    private String user;
    private String username;
    private Integer sex;
    private Date birthday;
    private String remark;
    private Timestamp makedt;
    private Timestamp modifydt;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userid")
    public long getUserid() {
        return userid;
    }

    public void setUserid(long userid) {
        this.userid = userid;
    }

    @Basic
    @Column(name = "user",unique = true)
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "sex")
    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "birthday")
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Basic
    @Column(name = "remark")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Basic
    @Column(name = "makedt",insertable = false,updatable = false)
    public Timestamp getMakedt() {
        return makedt;
    }

    public void setMakedt(Timestamp makedt) {
        this.makedt = makedt;
    }

    @Basic
    @Column(name = "modifydt" ,updatable = false,insertable = false)
    public Timestamp getModifydt() {
        return modifydt;
    }

    public void setModifydt(Timestamp modifydt) {
        this.modifydt = modifydt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user1 = (User) o;

        if (userid != user1.userid) return false;
        if (user != null ? !user.equals(user1.user) : user1.user != null) return false;
        if (username != null ? !username.equals(user1.username) : user1.username != null) return false;
        if (sex != null ? !sex.equals(user1.sex) : user1.sex != null) return false;
        if (birthday != null ? !birthday.equals(user1.birthday) : user1.birthday != null) return false;
        if (remark != null ? !remark.equals(user1.remark) : user1.remark != null) return false;
        if (makedt != null ? !makedt.equals(user1.makedt) : user1.makedt != null) return false;
        if (modifydt != null ? !modifydt.equals(user1.modifydt) : user1.modifydt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (userid ^ (userid >>> 32));
        result = 31 * result + (user != null ? user.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (makedt != null ? makedt.hashCode() : 0);
        result = 31 * result + (modifydt != null ? modifydt.hashCode() : 0);
        return result;
    }
    public String toString(){
        String s = "userEntity{userid:"+userid+",user:"+user+",username:"+username+
                ",sex:"+sex+",birthday:"+(birthday==null?"":birthday.toString())+
                ",remark:"+remark+",makedt:"+(makedt==null?"":makedt.toString())+
                ",modifydt:"+(modifydt==null?"":modifydt.toString())+"}";
    return s;
    }
}
