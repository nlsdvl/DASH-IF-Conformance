//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.2-hudson-jaxb-ri-2.2-63- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.05 at 03:52:15 PM MESZ 
//


package org.iso.mpeg.dash;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for AdaptationSetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdaptationSetType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:dash:schema:mpd:2011}RepresentationBaseType">
 *       &lt;sequence>
 *         &lt;element name="Accessibility" type="{urn:mpeg:dash:schema:mpd:2011}DescriptorType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Role" type="{urn:mpeg:dash:schema:mpd:2011}DescriptorType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Rating" type="{urn:mpeg:dash:schema:mpd:2011}DescriptorType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Viewpoint" type="{urn:mpeg:dash:schema:mpd:2011}DescriptorType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ContentComponent" type="{urn:mpeg:dash:schema:mpd:2011}ContentComponentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BaseURL" type="{urn:mpeg:dash:schema:mpd:2011}BaseURLType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SegmentBase" type="{urn:mpeg:dash:schema:mpd:2011}SegmentBaseType" minOccurs="0"/>
 *         &lt;element name="SegmentList" type="{urn:mpeg:dash:schema:mpd:2011}SegmentListType" minOccurs="0"/>
 *         &lt;element name="SegmentTemplate" type="{urn:mpeg:dash:schema:mpd:2011}SegmentTemplateType" minOccurs="0"/>
 *         &lt;element name="Representation" type="{urn:mpeg:dash:schema:mpd:2011}RepresentationType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{http://www.w3.org/1999/xlink}href"/>
 *       &lt;attribute ref="{http://www.w3.org/1999/xlink}actuate"/>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="group" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="lang" type="{http://www.w3.org/2001/XMLSchema}language" />
 *       &lt;attribute name="contentType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="par" type="{urn:mpeg:dash:schema:mpd:2011}RatioType" />
 *       &lt;attribute name="minBandwidth" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="maxBandwidth" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="minWidth" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="maxWidth" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="minHeight" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="maxHeight" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="minFrameRate" type="{urn:mpeg:dash:schema:mpd:2011}FrameRateType" />
 *       &lt;attribute name="maxFrameRate" type="{urn:mpeg:dash:schema:mpd:2011}FrameRateType" />
 *       &lt;attribute name="segmentAlignment" type="{urn:mpeg:dash:schema:mpd:2011}ConditionalUintType" default="false" />
 *       &lt;attribute name="subsegmentAlignment" type="{urn:mpeg:dash:schema:mpd:2011}ConditionalUintType" default="false" />
 *       &lt;attribute name="subsegmentStartsWithSAP" type="{urn:mpeg:dash:schema:mpd:2011}SAPType" default="0" />
 *       &lt;attribute name="bitstreamSwitching" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdaptationSetType", propOrder = {
    "accessibilities",
    "roles",
    "ratings",
    "viewpoints",
    "contentComponents",
    "baseURLs",
    "segmentBase",
    "segmentList",
    "segmentTemplate",
    "representations"
})
public class AdaptationSetType
    extends RepresentationBaseType
{

    @XmlElement(name = "Accessibility")
    protected List<DescriptorType> accessibilities;
    @XmlElement(name = "Role")
    protected List<DescriptorType> roles;
    @XmlElement(name = "Rating")
    protected List<DescriptorType> ratings;
    @XmlElement(name = "Viewpoint")
    protected List<DescriptorType> viewpoints;
    @XmlElement(name = "ContentComponent")
    protected List<ContentComponentType> contentComponents;
    @XmlElement(name = "BaseURL")
    protected List<BaseURLType> baseURLs;
    @XmlElement(name = "SegmentBase")
    protected SegmentBaseType segmentBase;
    @XmlElement(name = "SegmentList")
    protected SegmentListType segmentList;
    @XmlElement(name = "SegmentTemplate")
    protected SegmentTemplateType segmentTemplate;
    @XmlElement(name = "Representation")
    protected List<RepresentationType> representations;
    @XmlAttribute(name = "href", namespace = "http://www.w3.org/1999/xlink")
    protected String href;
    @XmlAttribute(name = "actuate", namespace = "http://www.w3.org/1999/xlink")
    protected ActuateType actuate;
    @XmlAttribute(name = "id")
    @XmlSchemaType(name = "unsignedInt")
    protected Long id;
    @XmlAttribute(name = "group")
    @XmlSchemaType(name = "unsignedInt")
    protected Long group;
    @XmlAttribute(name = "lang")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String lang;
    @XmlAttribute(name = "contentType")
    protected String contentType;
    @XmlAttribute(name = "par")
    protected String par;
    @XmlAttribute(name = "minBandwidth")
    @XmlSchemaType(name = "unsignedInt")
    protected Long minBandwidth;
    @XmlAttribute(name = "maxBandwidth")
    @XmlSchemaType(name = "unsignedInt")
    protected Long maxBandwidth;
    @XmlAttribute(name = "minWidth")
    @XmlSchemaType(name = "unsignedInt")
    protected Long minWidth;
    @XmlAttribute(name = "maxWidth")
    @XmlSchemaType(name = "unsignedInt")
    protected Long maxWidth;
    @XmlAttribute(name = "minHeight")
    @XmlSchemaType(name = "unsignedInt")
    protected Long minHeight;
    @XmlAttribute(name = "maxHeight")
    @XmlSchemaType(name = "unsignedInt")
    protected Long maxHeight;
    @XmlAttribute(name = "minFrameRate")
    protected String minFrameRate;
    @XmlAttribute(name = "maxFrameRate")
    protected String maxFrameRate;
    @XmlAttribute(name = "segmentAlignment")
    protected String segmentAlignment;
    @XmlAttribute(name = "subsegmentAlignment")
    protected String subsegmentAlignment;
    @XmlAttribute(name = "subsegmentStartsWithSAP")
    protected Long subsegmentStartsWithSAP;
    @XmlAttribute(name = "bitstreamSwitching")
    protected Boolean bitstreamSwitching;

    /**
     * Gets the value of the accessibilities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accessibilities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccessibilities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescriptorType }
     * 
     * 
     */
    public List<DescriptorType> getAccessibilities() {
        if (accessibilities == null) {
            accessibilities = new ArrayList<DescriptorType>();
        }
        return this.accessibilities;
    }

    /**
     * Gets the value of the roles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescriptorType }
     * 
     * 
     */
    public List<DescriptorType> getRoles() {
        if (roles == null) {
            roles = new ArrayList<DescriptorType>();
        }
        return this.roles;
    }

    /**
     * Gets the value of the ratings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ratings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRatings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescriptorType }
     * 
     * 
     */
    public List<DescriptorType> getRatings() {
        if (ratings == null) {
            ratings = new ArrayList<DescriptorType>();
        }
        return this.ratings;
    }

    /**
     * Gets the value of the viewpoints property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the viewpoints property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getViewpoints().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescriptorType }
     * 
     * 
     */
    public List<DescriptorType> getViewpoints() {
        if (viewpoints == null) {
            viewpoints = new ArrayList<DescriptorType>();
        }
        return this.viewpoints;
    }

    /**
     * Gets the value of the contentComponents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contentComponents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContentComponents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContentComponentType }
     * 
     * 
     */
    public List<ContentComponentType> getContentComponents() {
        if (contentComponents == null) {
            contentComponents = new ArrayList<ContentComponentType>();
        }
        return this.contentComponents;
    }

    /**
     * Gets the value of the baseURLs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baseURLs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBaseURLs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BaseURLType }
     * 
     * 
     */
    public List<BaseURLType> getBaseURLs() {
        if (baseURLs == null) {
            baseURLs = new ArrayList<BaseURLType>();
        }
        return this.baseURLs;
    }

    /**
     * Gets the value of the segmentBase property.
     * 
     * @return
     *     possible object is
     *     {@link SegmentBaseType }
     *     
     */
    public SegmentBaseType getSegmentBase() {
        return segmentBase;
    }

    /**
     * Sets the value of the segmentBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentBaseType }
     *     
     */
    public void setSegmentBase(SegmentBaseType value) {
        this.segmentBase = value;
    }

    /**
     * Gets the value of the segmentList property.
     * 
     * @return
     *     possible object is
     *     {@link SegmentListType }
     *     
     */
    public SegmentListType getSegmentList() {
        return segmentList;
    }

    /**
     * Sets the value of the segmentList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentListType }
     *     
     */
    public void setSegmentList(SegmentListType value) {
        this.segmentList = value;
    }

    /**
     * Gets the value of the segmentTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link SegmentTemplateType }
     *     
     */
    public SegmentTemplateType getSegmentTemplate() {
        return segmentTemplate;
    }

    /**
     * Sets the value of the segmentTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentTemplateType }
     *     
     */
    public void setSegmentTemplate(SegmentTemplateType value) {
        this.segmentTemplate = value;
    }

    /**
     * Gets the value of the representations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the representations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRepresentations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RepresentationType }
     * 
     * 
     */
    public List<RepresentationType> getRepresentations() {
        if (representations == null) {
            representations = new ArrayList<RepresentationType>();
        }
        return this.representations;
    }

    /**
     * Gets the value of the href property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    /**
     * Gets the value of the actuate property.
     * 
     * @return
     *     possible object is
     *     {@link ActuateType }
     *     
     */
    public ActuateType getActuate() {
        if (actuate == null) {
            return ActuateType.ON_REQUEST;
        } else {
            return actuate;
        }
    }

    /**
     * Sets the value of the actuate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActuateType }
     *     
     */
    public void setActuate(ActuateType value) {
        this.actuate = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGroup(Long value) {
        this.group = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Gets the value of the contentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * Sets the value of the contentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentType(String value) {
        this.contentType = value;
    }

    /**
     * Gets the value of the par property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPar() {
        return par;
    }

    /**
     * Sets the value of the par property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPar(String value) {
        this.par = value;
    }

    /**
     * Gets the value of the minBandwidth property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMinBandwidth() {
        return minBandwidth;
    }

    /**
     * Sets the value of the minBandwidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMinBandwidth(Long value) {
        this.minBandwidth = value;
    }

    /**
     * Gets the value of the maxBandwidth property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxBandwidth() {
        return maxBandwidth;
    }

    /**
     * Sets the value of the maxBandwidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxBandwidth(Long value) {
        this.maxBandwidth = value;
    }

    /**
     * Gets the value of the minWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMinWidth() {
        return minWidth;
    }

    /**
     * Sets the value of the minWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMinWidth(Long value) {
        this.minWidth = value;
    }

    /**
     * Gets the value of the maxWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxWidth() {
        return maxWidth;
    }

    /**
     * Sets the value of the maxWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxWidth(Long value) {
        this.maxWidth = value;
    }

    /**
     * Gets the value of the minHeight property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMinHeight() {
        return minHeight;
    }

    /**
     * Sets the value of the minHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMinHeight(Long value) {
        this.minHeight = value;
    }

    /**
     * Gets the value of the maxHeight property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxHeight() {
        return maxHeight;
    }

    /**
     * Sets the value of the maxHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxHeight(Long value) {
        this.maxHeight = value;
    }

    /**
     * Gets the value of the minFrameRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinFrameRate() {
        return minFrameRate;
    }

    /**
     * Sets the value of the minFrameRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinFrameRate(String value) {
        this.minFrameRate = value;
    }

    /**
     * Gets the value of the maxFrameRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxFrameRate() {
        return maxFrameRate;
    }

    /**
     * Sets the value of the maxFrameRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxFrameRate(String value) {
        this.maxFrameRate = value;
    }

    /**
     * Gets the value of the segmentAlignment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentAlignment() {
        if (segmentAlignment == null) {
            return "false";
        } else {
            return segmentAlignment;
        }
    }

    /**
     * Sets the value of the segmentAlignment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentAlignment(String value) {
        this.segmentAlignment = value;
    }

    /**
     * Gets the value of the subsegmentAlignment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubsegmentAlignment() {
        if (subsegmentAlignment == null) {
            return "false";
        } else {
            return subsegmentAlignment;
        }
    }

    /**
     * Sets the value of the subsegmentAlignment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubsegmentAlignment(String value) {
        this.subsegmentAlignment = value;
    }

    /**
     * Gets the value of the subsegmentStartsWithSAP property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public long getSubsegmentStartsWithSAP() {
        if (subsegmentStartsWithSAP == null) {
            return  0L;
        } else {
            return subsegmentStartsWithSAP;
        }
    }

    /**
     * Sets the value of the subsegmentStartsWithSAP property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSubsegmentStartsWithSAP(Long value) {
        this.subsegmentStartsWithSAP = value;
    }

    /**
     * Gets the value of the bitstreamSwitching property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBitstreamSwitching() {
        return bitstreamSwitching;
    }

    /**
     * Sets the value of the bitstreamSwitching property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBitstreamSwitching(Boolean value) {
        this.bitstreamSwitching = value;
    }

}
