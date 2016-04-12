//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.25 at 05:48:09 PM CEST 
//


package es.rickyepoderi.wbxml.bind.wvcsp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sessionDescriptor",
    "transaction"
})
@XmlRootElement(name = "Session")
public class Session {

    @XmlElement(name = "SessionDescriptor", required = true)
    protected SessionDescriptor sessionDescriptor;
    @XmlElement(name = "Transaction", required = true)
    protected List<Transaction> transaction;

    /**
     * Gets the value of the sessionDescriptor property.
     * 
     * @return
     *     possible object is
     *     {@link SessionDescriptor }
     *     
     */
    public SessionDescriptor getSessionDescriptor() {
        return sessionDescriptor;
    }

    /**
     * Sets the value of the sessionDescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionDescriptor }
     *     
     */
    public void setSessionDescriptor(SessionDescriptor value) {
        this.sessionDescriptor = value;
    }

    /**
     * Gets the value of the transaction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transaction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransaction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Transaction }
     * 
     * 
     */
    public List<Transaction> getTransaction() {
        if (transaction == null) {
            transaction = new ArrayList<Transaction>();
        }
        return this.transaction;
    }

}