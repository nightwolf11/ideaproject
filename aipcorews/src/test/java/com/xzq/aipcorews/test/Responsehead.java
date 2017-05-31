
package com.xzq.aipcorews.test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>responsehead complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="responsehead">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="systemcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="translatedt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tradecode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bankcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rows" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "responsehead", namespace = "http://www.xzq.com/userws", propOrder = {
    "systemcode",
    "translatedt",
    "tradecode",
    "bankcode",
    "rows"
})
public class Responsehead {

    @XmlElement(namespace = "http://www.xzq.com/userws", required = true)
    protected String systemcode;
    @XmlElement(namespace = "http://www.xzq.com/userws", required = true)
    protected String translatedt;
    @XmlElement(namespace = "http://www.xzq.com/userws", required = true)
    protected String tradecode;
    @XmlElement(namespace = "http://www.xzq.com/userws", required = true)
    protected String bankcode;
    @XmlElement(namespace = "http://www.xzq.com/userws", required = true)
    protected String rows;

    /**
     * ��ȡsystemcode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemcode() {
        return systemcode;
    }

    /**
     * ����systemcode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemcode(String value) {
        this.systemcode = value;
    }

    /**
     * ��ȡtranslatedt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranslatedt() {
        return translatedt;
    }

    /**
     * ����translatedt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranslatedt(String value) {
        this.translatedt = value;
    }

    /**
     * ��ȡtradecode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradecode() {
        return tradecode;
    }

    /**
     * ����tradecode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradecode(String value) {
        this.tradecode = value;
    }

    /**
     * ��ȡbankcode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankcode() {
        return bankcode;
    }

    /**
     * ����bankcode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankcode(String value) {
        this.bankcode = value;
    }

    /**
     * ��ȡrows���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRows() {
        return rows;
    }

    /**
     * ����rows���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRows(String value) {
        this.rows = value;
    }

    @Override
    public String toString() {
        return "Responsehead{"+systemcode+"|"+translatedt+"|"+tradecode+"|"+bankcode+rows+"}";
    }

}
