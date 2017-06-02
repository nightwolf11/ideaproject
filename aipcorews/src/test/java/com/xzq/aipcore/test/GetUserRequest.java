
package com.xzq.aipcore.test;

import javax.xml.bind.annotation.*;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡhead���Ե�ֵ��
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
     * ����head���Ե�ֵ��
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
     * ��ȡmessage���Ե�ֵ��
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
     * ����message���Ե�ֵ��
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
