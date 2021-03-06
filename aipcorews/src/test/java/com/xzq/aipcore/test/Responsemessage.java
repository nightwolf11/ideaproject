
package com.xzq.aipcore.test;

import com.xzq.aipcore.test.User;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>responsemessage complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="responsemessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="user" type="{http://www.xzq.com/userws}user"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "responsemessage", namespace = "http://www.xzq.com/userws", propOrder = {
    "user"
})
public class Responsemessage {

    @XmlElement(namespace = "http://www.xzq.com/userws", required = true)
    protected com.xzq.aipcore.test.User user;

    /**
     * 获取user属性的值。
     *
     * @return
     *     possible object is
     *     {@link com.xzq.aipcore.test.User }
     *
     */
    public com.xzq.aipcore.test.User getUser() {
        return user;
    }

    /**
     * 设置user属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link com.xzq.aipcore.test.User }
     *
     */
    public void setUser(User value) {
        this.user = value;
    }

    @Override
    public String toString() {
        return "Responsemessage{"+user.toString()+"}";
    }
}
