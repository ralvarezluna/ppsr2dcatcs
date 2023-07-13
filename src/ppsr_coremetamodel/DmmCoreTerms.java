/**
 */
package ppsr_coremetamodel;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dmm Core Terms</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ppsr_coremetamodel.DmmCoreTerms#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link ppsr_coremetamodel.DmmCoreTerms#getDateSubmitted <em>Date Submitted</em>}</li>
 *   <li>{@link ppsr_coremetamodel.DmmCoreTerms#getModified <em>Modified</em>}</li>
 *   <li>{@link ppsr_coremetamodel.DmmCoreTerms#getDatasetStatus <em>Dataset Status</em>}</li>
 *   <li>{@link ppsr_coremetamodel.DmmCoreTerms#getTitle <em>Title</em>}</li>
 *   <li>{@link ppsr_coremetamodel.DmmCoreTerms#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link ppsr_coremetamodel.DmmCoreTerms#getAccessRights <em>Access Rights</em>}</li>
 *   <li>{@link ppsr_coremetamodel.DmmCoreTerms#getBibliographicCitation <em>Bibliographic Citation</em>}</li>
 *   <li>{@link ppsr_coremetamodel.DmmCoreTerms#getRightsHolder <em>Rights Holder</em>}</li>
 *   <li>{@link ppsr_coremetamodel.DmmCoreTerms#getLicense <em>License</em>}</li>
 *   <li>{@link ppsr_coremetamodel.DmmCoreTerms#getLanguage <em>Language</em>}</li>
 *   <li>{@link ppsr_coremetamodel.DmmCoreTerms#getDatesetStartDate <em>Dateset Start Date</em>}</li>
 *   <li>{@link ppsr_coremetamodel.DmmCoreTerms#getDatasetEndDate <em>Dataset End Date</em>}</li>
 *   <li>{@link ppsr_coremetamodel.DmmCoreTerms#getMethodType <em>Method Type</em>}</li>
 *   <li>{@link ppsr_coremetamodel.DmmCoreTerms#getDataAccessMethod <em>Data Access Method</em>}</li>
 * </ul>
 *
 * @see ppsr_coremetamodel.ppsrmetamodelPackage#getDmmCoreTerms()
 * @model
 * @generated
 */
public interface DmmCoreTerms extends EObject {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see ppsr_coremetamodel.ppsrmetamodelPackage#getDmmCoreTerms_Identifier()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link ppsr_coremetamodel.DmmCoreTerms#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Date Submitted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Submitted</em>' attribute.
	 * @see #setDateSubmitted(Date)
	 * @see ppsr_coremetamodel.ppsrmetamodelPackage#getDmmCoreTerms_DateSubmitted()
	 * @model
	 * @generated
	 */
	Date getDateSubmitted();

	/**
	 * Sets the value of the '{@link ppsr_coremetamodel.DmmCoreTerms#getDateSubmitted <em>Date Submitted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Submitted</em>' attribute.
	 * @see #getDateSubmitted()
	 * @generated
	 */
	void setDateSubmitted(Date value);

	/**
	 * Returns the value of the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modified</em>' attribute.
	 * @see #setModified(Date)
	 * @see ppsr_coremetamodel.ppsrmetamodelPackage#getDmmCoreTerms_Modified()
	 * @model
	 * @generated
	 */
	Date getModified();

	/**
	 * Sets the value of the '{@link ppsr_coremetamodel.DmmCoreTerms#getModified <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modified</em>' attribute.
	 * @see #getModified()
	 * @generated
	 */
	void setModified(Date value);

	/**
	 * Returns the value of the '<em><b>Dataset Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dataset Status</em>' attribute.
	 * @see #setDatasetStatus(String)
	 * @see ppsr_coremetamodel.ppsrmetamodelPackage#getDmmCoreTerms_DatasetStatus()
	 * @model
	 * @generated
	 */
	String getDatasetStatus();

	/**
	 * Sets the value of the '{@link ppsr_coremetamodel.DmmCoreTerms#getDatasetStatus <em>Dataset Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dataset Status</em>' attribute.
	 * @see #getDatasetStatus()
	 * @generated
	 */
	void setDatasetStatus(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see ppsr_coremetamodel.ppsrmetamodelPackage#getDmmCoreTerms_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link ppsr_coremetamodel.DmmCoreTerms#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(String)
	 * @see ppsr_coremetamodel.ppsrmetamodelPackage#getDmmCoreTerms_Abstract()
	 * @model
	 * @generated
	 */
	String getAbstract();

	/**
	 * Sets the value of the '{@link ppsr_coremetamodel.DmmCoreTerms#getAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #getAbstract()
	 * @generated
	 */
	void setAbstract(String value);

	/**
	 * Returns the value of the '<em><b>Access Rights</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Rights</em>' attribute.
	 * @see #setAccessRights(String)
	 * @see ppsr_coremetamodel.ppsrmetamodelPackage#getDmmCoreTerms_AccessRights()
	 * @model
	 * @generated
	 */
	String getAccessRights();

	/**
	 * Sets the value of the '{@link ppsr_coremetamodel.DmmCoreTerms#getAccessRights <em>Access Rights</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Rights</em>' attribute.
	 * @see #getAccessRights()
	 * @generated
	 */
	void setAccessRights(String value);

	/**
	 * Returns the value of the '<em><b>Bibliographic Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bibliographic Citation</em>' attribute.
	 * @see #isSetBibliographicCitation()
	 * @see #unsetBibliographicCitation()
	 * @see #setBibliographicCitation(String)
	 * @see ppsr_coremetamodel.ppsrmetamodelPackage#getDmmCoreTerms_BibliographicCitation()
	 * @model unsettable="true"
	 * @generated
	 */
	String getBibliographicCitation();

	/**
	 * Sets the value of the '{@link ppsr_coremetamodel.DmmCoreTerms#getBibliographicCitation <em>Bibliographic Citation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bibliographic Citation</em>' attribute.
	 * @see #isSetBibliographicCitation()
	 * @see #unsetBibliographicCitation()
	 * @see #getBibliographicCitation()
	 * @generated
	 */
	void setBibliographicCitation(String value);

	/**
	 * Unsets the value of the '{@link ppsr_coremetamodel.DmmCoreTerms#getBibliographicCitation <em>Bibliographic Citation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBibliographicCitation()
	 * @see #getBibliographicCitation()
	 * @see #setBibliographicCitation(String)
	 * @generated
	 */
	void unsetBibliographicCitation();

	/**
	 * Returns whether the value of the '{@link ppsr_coremetamodel.DmmCoreTerms#getBibliographicCitation <em>Bibliographic Citation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bibliographic Citation</em>' attribute is set.
	 * @see #unsetBibliographicCitation()
	 * @see #getBibliographicCitation()
	 * @see #setBibliographicCitation(String)
	 * @generated
	 */
	boolean isSetBibliographicCitation();

	/**
	 * Returns the value of the '<em><b>Rights Holder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rights Holder</em>' attribute.
	 * @see #setRightsHolder(String)
	 * @see ppsr_coremetamodel.ppsrmetamodelPackage#getDmmCoreTerms_RightsHolder()
	 * @model
	 * @generated
	 */
	String getRightsHolder();

	/**
	 * Sets the value of the '{@link ppsr_coremetamodel.DmmCoreTerms#getRightsHolder <em>Rights Holder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rights Holder</em>' attribute.
	 * @see #getRightsHolder()
	 * @generated
	 */
	void setRightsHolder(String value);

	/**
	 * Returns the value of the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>License</em>' attribute.
	 * @see #setLicense(String)
	 * @see ppsr_coremetamodel.ppsrmetamodelPackage#getDmmCoreTerms_License()
	 * @model
	 * @generated
	 */
	String getLicense();

	/**
	 * Sets the value of the '{@link ppsr_coremetamodel.DmmCoreTerms#getLicense <em>License</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>License</em>' attribute.
	 * @see #getLicense()
	 * @generated
	 */
	void setLicense(String value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see ppsr_coremetamodel.ppsrmetamodelPackage#getDmmCoreTerms_Language()
	 * @model
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link ppsr_coremetamodel.DmmCoreTerms#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Dateset Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dateset Start Date</em>' attribute.
	 * @see #setDatesetStartDate(Date)
	 * @see ppsr_coremetamodel.ppsrmetamodelPackage#getDmmCoreTerms_DatesetStartDate()
	 * @model
	 * @generated
	 */
	Date getDatesetStartDate();

	/**
	 * Sets the value of the '{@link ppsr_coremetamodel.DmmCoreTerms#getDatesetStartDate <em>Dateset Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dateset Start Date</em>' attribute.
	 * @see #getDatesetStartDate()
	 * @generated
	 */
	void setDatesetStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>Dataset End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dataset End Date</em>' attribute.
	 * @see #isSetDatasetEndDate()
	 * @see #unsetDatasetEndDate()
	 * @see #setDatasetEndDate(Date)
	 * @see ppsr_coremetamodel.ppsrmetamodelPackage#getDmmCoreTerms_DatasetEndDate()
	 * @model unsettable="true"
	 * @generated
	 */
	Date getDatasetEndDate();

	/**
	 * Sets the value of the '{@link ppsr_coremetamodel.DmmCoreTerms#getDatasetEndDate <em>Dataset End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dataset End Date</em>' attribute.
	 * @see #isSetDatasetEndDate()
	 * @see #unsetDatasetEndDate()
	 * @see #getDatasetEndDate()
	 * @generated
	 */
	void setDatasetEndDate(Date value);

	/**
	 * Unsets the value of the '{@link ppsr_coremetamodel.DmmCoreTerms#getDatasetEndDate <em>Dataset End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDatasetEndDate()
	 * @see #getDatasetEndDate()
	 * @see #setDatasetEndDate(Date)
	 * @generated
	 */
	void unsetDatasetEndDate();

	/**
	 * Returns whether the value of the '{@link ppsr_coremetamodel.DmmCoreTerms#getDatasetEndDate <em>Dataset End Date</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dataset End Date</em>' attribute is set.
	 * @see #unsetDatasetEndDate()
	 * @see #getDatasetEndDate()
	 * @see #setDatasetEndDate(Date)
	 * @generated
	 */
	boolean isSetDatasetEndDate();

	/**
	 * Returns the value of the '<em><b>Method Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of methodology or sampling protocol used to collect the dataset.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Method Type</em>' attribute.
	 * @see #setMethodType(String)
	 * @see ppsr_coremetamodel.ppsrmetamodelPackage#getDmmCoreTerms_MethodType()
	 * @model
	 * @generated
	 */
	String getMethodType();

	/**
	 * Sets the value of the '{@link ppsr_coremetamodel.DmmCoreTerms#getMethodType <em>Method Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Type</em>' attribute.
	 * @see #getMethodType()
	 * @generated
	 */
	void setMethodType(String value);

	/**
	 * Returns the value of the '<em><b>Data Access Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Access Method</em>' attribute.
	 * @see #setDataAccessMethod(String)
	 * @see ppsr_coremetamodel.ppsrmetamodelPackage#getDmmCoreTerms_DataAccessMethod()
	 * @model transient="true"
	 * @generated
	 */
	String getDataAccessMethod();

	/**
	 * Sets the value of the '{@link ppsr_coremetamodel.DmmCoreTerms#getDataAccessMethod <em>Data Access Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Access Method</em>' attribute.
	 * @see #getDataAccessMethod()
	 * @generated
	 */
	void setDataAccessMethod(String value);

} // DmmCoreTerms
