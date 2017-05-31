
package com.xzq.aipcorews.test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>responsehead complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取systemcode属性的值。
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
     * 设置systemcode属性的值。
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
     * 获取translatedt属性的值。
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
     * 设置translatedt属性的值。
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
     * 获取tradecode属性的值。
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
     * 设置tradecode属性的值。
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
     * 获取bankcode属性的值。
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
     * 设置bankcode属性的值。
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
     * 获取rows属性的值。
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
     * 设置rows属性的值。
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
