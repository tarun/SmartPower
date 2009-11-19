
package soa;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the soa package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddMoneyResponse_QNAME = new QName("http://soa/", "addMoneyResponse");
    private final static QName _AddAccountResponse_QNAME = new QName("http://soa/", "addAccountResponse");
    private final static QName _TransferMoney_QNAME = new QName("http://soa/", "transferMoney");
    private final static QName _AddAccount_QNAME = new QName("http://soa/", "addAccount");
    private final static QName _WithdrawMoneyResponse_QNAME = new QName("http://soa/", "withdrawMoneyResponse");
    private final static QName _WithdrawMoney_QNAME = new QName("http://soa/", "withdrawMoney");
    private final static QName _AddMoney_QNAME = new QName("http://soa/", "addMoney");
    private final static QName _TransferMoneyResponse_QNAME = new QName("http://soa/", "transferMoneyResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: soa
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddMoney }
     * 
     */
    public AddMoney createAddMoney() {
        return new AddMoney();
    }

    /**
     * Create an instance of {@link WithdrawMoney }
     * 
     */
    public WithdrawMoney createWithdrawMoney() {
        return new WithdrawMoney();
    }

    /**
     * Create an instance of {@link AddMoneyResponse }
     * 
     */
    public AddMoneyResponse createAddMoneyResponse() {
        return new AddMoneyResponse();
    }

    /**
     * Create an instance of {@link WithdrawMoneyResponse }
     * 
     */
    public WithdrawMoneyResponse createWithdrawMoneyResponse() {
        return new WithdrawMoneyResponse();
    }

    /**
     * Create an instance of {@link TransferMoney }
     * 
     */
    public TransferMoney createTransferMoney() {
        return new TransferMoney();
    }

    /**
     * Create an instance of {@link AddAccount }
     * 
     */
    public AddAccount createAddAccount() {
        return new AddAccount();
    }

    /**
     * Create an instance of {@link AddAccountResponse }
     * 
     */
    public AddAccountResponse createAddAccountResponse() {
        return new AddAccountResponse();
    }

    /**
     * Create an instance of {@link TransferMoneyResponse }
     * 
     */
    public TransferMoneyResponse createTransferMoneyResponse() {
        return new TransferMoneyResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMoneyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa/", name = "addMoneyResponse")
    public JAXBElement<AddMoneyResponse> createAddMoneyResponse(AddMoneyResponse value) {
        return new JAXBElement<AddMoneyResponse>(_AddMoneyResponse_QNAME, AddMoneyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa/", name = "addAccountResponse")
    public JAXBElement<AddAccountResponse> createAddAccountResponse(AddAccountResponse value) {
        return new JAXBElement<AddAccountResponse>(_AddAccountResponse_QNAME, AddAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransferMoney }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa/", name = "transferMoney")
    public JAXBElement<TransferMoney> createTransferMoney(TransferMoney value) {
        return new JAXBElement<TransferMoney>(_TransferMoney_QNAME, TransferMoney.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa/", name = "addAccount")
    public JAXBElement<AddAccount> createAddAccount(AddAccount value) {
        return new JAXBElement<AddAccount>(_AddAccount_QNAME, AddAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WithdrawMoneyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa/", name = "withdrawMoneyResponse")
    public JAXBElement<WithdrawMoneyResponse> createWithdrawMoneyResponse(WithdrawMoneyResponse value) {
        return new JAXBElement<WithdrawMoneyResponse>(_WithdrawMoneyResponse_QNAME, WithdrawMoneyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WithdrawMoney }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa/", name = "withdrawMoney")
    public JAXBElement<WithdrawMoney> createWithdrawMoney(WithdrawMoney value) {
        return new JAXBElement<WithdrawMoney>(_WithdrawMoney_QNAME, WithdrawMoney.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMoney }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa/", name = "addMoney")
    public JAXBElement<AddMoney> createAddMoney(AddMoney value) {
        return new JAXBElement<AddMoney>(_AddMoney_QNAME, AddMoney.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransferMoneyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa/", name = "transferMoneyResponse")
    public JAXBElement<TransferMoneyResponse> createTransferMoneyResponse(TransferMoneyResponse value) {
        return new JAXBElement<TransferMoneyResponse>(_TransferMoneyResponse_QNAME, TransferMoneyResponse.class, null, value);
    }

}
