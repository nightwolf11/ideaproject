
package com.xzq.aipcorews.test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>user complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="user">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sex" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="birthday" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="makedt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="modifydt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "user", namespace = "http://www.xzq.com/userws", propOrder = {
    "userid",
    "user",
    "username",
    "sex",
    "birthday",
    "makedt",
    "modifydt","remark"
})
public class User {

    @XmlElement(namespace = "http://www.xzq.com/userws", required = true)
    protected String userid;
    @XmlElement(namespace = "http://www.xzq.com/userws", required = true)
    protected String user;
    @XmlElement(namespace = "http://www.xzq.com/userws", required = true)
    protected String username;
    @XmlElement(namespace = "http://www.xzq.com/userws", required = true)
    protected String sex;
    @XmlElement(namespace = "http://www.xzq.com/userws", required = true)
    protected String birthday;
    @XmlElement(namespace = "http://www.xzq.com/userws", required = true)
    protected String makedt;
    @XmlElement(namespace = "http://www.xzq.com/userws", required = true)
    protected String modifydt;
    @XmlElement(namespace = "http://www.xzq.com/userws", required = true)
    protected String remark;

    /**
     * 获取userid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserid() {
        return userid;
    }

    /**
     * 设置userid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserid(String value) {
        this.userid = value;
    }

    /**
     * 获取user属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser() {
        return user;
    }

    /**
     * 设置user属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser(String value) {
        this.user = value;
    }

    /**
     * 获取username属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置username属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * 获取sex属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置sex属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSex(String value) {
        this.sex = value;
    }

    /**
     * 获取birthday属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * 设置birthday属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthday(String value) {
        this.birthday = value;
    }

    /**
     * 获取makedt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMakedt() {
        return makedt;
    }

    /**
     * 设置makedt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMakedt(String value) {
        this.makedt = value;
    }

    /**
     * 获取modifydt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifydt() {
        return modifydt;
    }

    /**
     * 设置modifydt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifydt(String value) {
        this.modifydt = value;
    }

    /**
     * 获取remark属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置remark属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRemark(String value) {
        this.remark = value;
    }

    @Override
    public String toString() {
        return "User{"+userid+"|"+user+"|"+username+"|"+sex+"|"+birthday
                +"|"+remark+"|"+makedt+"|"+modifydt+"}";
    }

}
