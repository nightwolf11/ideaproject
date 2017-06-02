package com.xzq.aipcore.domain.secondary;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by XZQ on 2017-05-25.
 */
@Entity
@Table(name = "idchannelcode")
public class Idchannelcode {
    private Long codeid;
    private String countrycode;
    private String companycode;
    private String areacode;
    private String channelcode;
    private String codetype;
    private String codevalue;
    private String remark;
    private Date makedate;
    private Date  modifydate;

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seqcodeid")
    @SequenceGenerator(name="seqcodeid",sequenceName="seq_codeid",allocationSize=1,initialValue=10000)
    @Column(name = "CODEID",unique = true, nullable = false, precision = 0)
    public Long getCodeid() {
        return codeid;
    }

    public void setCodeid(Long codeid) {
        this.codeid = codeid;
    }

    @Basic
    @Column(name = "COUNTRYCODE", nullable = false, length = 30)
    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }

    @Basic
    @Column(name = "COMPANYCODE", nullable = false, length = 30)
    public String getCompanycode() {
        return companycode;
    }

    public void setCompanycode(String companycode) {
        this.companycode = companycode;
    }

    @Basic
    @Column(name = "AREACODE", nullable = true, length = 30)
    public String getAreacode() {
        return areacode;
    }

    public void setAreacode(String areacode) {
        this.areacode = areacode;
    }

    @Basic
    @Column(name = "CHANNELCODE", nullable = true, length = 30)
    public String getChannelcode() {
        return channelcode;
    }

    public void setChannelcode(String channelcode) {
        this.channelcode = channelcode;
    }

    @Basic
    @Column(name = "CODETYPE", nullable = false, length = 30)
    public String getCodetype() {
        return codetype;
    }

    public void setCodetype(String codetype) {
        this.codetype = codetype;
    }

    @Basic
    @Column(name = "CODEVALUE", nullable = false, length = 300)
    public String getCodevalue() {
        return codevalue;
    }

    public void setCodevalue(String codevalue) {
        this.codevalue = codevalue;
    }

    @Basic
    @Column(name = "REMARK", nullable = true, length = 3000)
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Basic
    @Column(name = "MAKEDATE", updatable = false, insertable = false)
    public Date getMakedate() {
        return makedate;
    }

    public void setMakedate(Date makedate) {
        this.makedate = makedate;
    }

    @Basic
    @Column(name = "MODIFYDATE", updatable = true, insertable = false)
    public Date getModifydate() {
        return modifydate;
    }

    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Idchannelcode that = (Idchannelcode) o;

        if (codeid != null ? !codeid.equals(that.codeid) : that.codeid != null) return false;
        if (countrycode != null ? !countrycode.equals(that.countrycode) : that.countrycode != null) return false;
        if (companycode != null ? !companycode.equals(that.companycode) : that.companycode != null) return false;
        if (areacode != null ? !areacode.equals(that.areacode) : that.areacode != null) return false;
        if (channelcode != null ? !channelcode.equals(that.channelcode) : that.channelcode != null) return false;
        if (codetype != null ? !codetype.equals(that.codetype) : that.codetype != null) return false;
        if (codevalue != null ? !codevalue.equals(that.codevalue) : that.codevalue != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;
        if (makedate != null ? !makedate.equals(that.makedate) : that.makedate != null) return false;
        if (modifydate != null ? !modifydate.equals(that.modifydate) : that.modifydate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codeid != null ? codeid.hashCode() : 0;
        result = 31 * result + (countrycode != null ? countrycode.hashCode() : 0);
        result = 31 * result + (companycode != null ? companycode.hashCode() : 0);
        result = 31 * result + (areacode != null ? areacode.hashCode() : 0);
        result = 31 * result + (channelcode != null ? channelcode.hashCode() : 0);
        result = 31 * result + (codetype != null ? codetype.hashCode() : 0);
        result = 31 * result + (codevalue != null ? codevalue.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (makedate != null ? makedate.hashCode() : 0);
        result = 31 * result + (modifydate != null ? modifydate.hashCode() : 0);
        return result;
    }

    public String toString(){

        String string = "idchannelcode{codeid:"+codeid+",countrycode:"+countrycode+
                ",companycode:"+companycode+
                ",codetype:"+codetype+",codevalue:"+codevalue+",remark:"+remark+
                ",makedate:"+ (makedate == null?"":makedate.toString())+"}";
        return string;
    }
}
