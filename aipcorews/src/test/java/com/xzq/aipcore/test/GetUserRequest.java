
package com.xzq.aipcore.test;

import javax.xml.bind.annotation.*;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="head" type="{http://www.xzq.com/userws}requesthead"/>
 *         &lt;element name="message" type="{http://www.xzq.com/userws}requestmessage"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "head",
    "message"
})
@XmlRootElement(name = "getUserRequest", namespace = "http://www.xzq.com/userws")
public class GetUserRequest {

    @XmlElement(namespace = "http://www.xzq.com/userws", required = true)
    protected Requesthead head;
    @XmlElement(namespace = "http://www.xzq.com/userws", required = true)
    protected Requestmessage message;

    /**
     * 获取head属性的值。
     *
     * @return
     *     possible object is
     *     {@link Requesthead }
     *
     */
    public Requesthead getHead() {
        return head;
    }

    /**
     * 设置head属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Requesthead }
     *
     */
    public void setHead(Requesthead value) {
        this.head = value;
    }

    /**
     * 获取message属性的值。
     *
     * @return
     *     possible object is
     *     {@link Requestmessage }
     *
     */
    public Requestmessage getMessage() {
        return message;
    }

    /**
     * 设置message属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Requestmessage }
     *     
     */
    public void setMessage(Requestmessage value) {
        this.message = value;
    }

    @Override
    public String toString() {
        return "GetUserRequest{"+head.toString()+"||"+message.toString()+"}";
    }
}
