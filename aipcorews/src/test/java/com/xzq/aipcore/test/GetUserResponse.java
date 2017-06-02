
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
 *         &lt;element name="head" type="{http://www.xzq.com/userws}responsehead"/>
 *         &lt;element name="message" type="{http://www.xzq.com/userws}responsemessage"/>
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
@XmlRootElement(name = "getUserResponse", namespace = "http://www.xzq.com/userws")
public class GetUserResponse {

    @XmlElement(namespace = "http://www.xzq.com/userws", required = true)
    protected Responsehead head;
    @XmlElement(namespace = "http://www.xzq.com/userws", required = true)
    protected Responsemessage message;

    /**
     * ��ȡhead���Ե�ֵ��
     *
     * @return
     *     possible object is
     *     {@link Responsehead }
     *
     */
    public Responsehead getHead() {
        return head;
    }

    /**
     * ����head���Ե�ֵ��
     *
     * @param value
     *     allowed object is
     *     {@link Responsehead }
     *
     */
    public void setHead(Responsehead value) {
        this.head = value;
    }

    /**
     * ��ȡmessage���Ե�ֵ��
     *
     * @return
     *     possible object is
     *     {@link Responsemessage }
     *
     */
    public Responsemessage getMessage() {
        return message;
    }

    /**
     * ����message���Ե�ֵ��
     *
     * @param value
     *     allowed object is
     *     {@link Responsemessage }
     *     
     */
    public void setMessage(Responsemessage value) {
        this.message = value;
    }

    @Override
    public String toString() {
        return "GetUserResponse{"+head.toString()+"||"+message.toString()+"}";
    }
}
