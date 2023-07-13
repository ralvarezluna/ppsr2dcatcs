/**
 */
package ppsr_coremetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dmm Extension Terms</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ppsr_coremetamodel.DmmExtensionTerms#getDatasetUpdateFrequency <em>Dataset Update Frequency</em>}</li>
 *   <li>{@link ppsr_coremetamodel.DmmExtensionTerms#getDatasetExternalUrl <em>Dataset External Url</em>}</li>
 *   <li>{@link ppsr_coremetamodel.DmmExtensionTerms#getDownloadURL <em>Download URL</em>}</li>
 *   <li>{@link ppsr_coremetamodel.DmmExtensionTerms#getDataQualityAssuranceMethod <em>Data Quality Assurance Method</em>}</li>
 *   <li>{@link ppsr_coremetamodel.DmmExtensionTerms#getDataQualityAssuranceDescription <em>Data Quality Assurance Description</em>}</li>
 *   <li>{@link ppsr_coremetamodel.DmmExtensionTerms#getUsageGuide <em>Usage Guide</em>}</li>
 *   <li>{@link ppsr_coremetamodel.DmmExtensionTerms#getDataManagementPlan <em>Data Management Plan</em>}</li>
 * </ul>
 *
 * @see ppsr_coremetamodel.ppsrmetamodelPackage#getDmmExtensionTerms()
 * @model
 * @generated
 */
public interface DmmExtensionTerms extends EObject {
	/**
	 * Returns the value of the '<em><b>Dataset Update Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dataset Update Frequency</em>' attribute.
	 * @see #isSetDatasetUpdateFrequency()
	 * @see #unsetDatasetUpdateFrequency()
	 * @see #setDatasetUpdateFrequency(String)
	 * @see ppsr_coremetamodel.ppsrmetamodelPackage#getDmmExtensionTerms_DatasetUpdateFrequency()
	 * @model unsettable="true"
	 * @generated
	 */
	String getDatasetUpdateFrequency();

	/**
	 * Sets the value of the '{@link ppsr_coremetamodel.DmmExtensionTerms#getDatasetUpdateFrequency <em>Dataset Update Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dataset Update Frequency</em>' attribute.
	 * @see #isSetDatasetUpdateFrequency()
	 * @see #unsetDatasetUpdateFrequency()
	 * @see #getDatasetUpdateFrequency()
	 * @generated
	 */
	void setDatasetUpdateFrequency(String value);

	/**
	 * Unsets the value of the '{@link ppsr_coremetamodel.DmmExtensionTerms#getDatasetUpdateFrequency <em>Dataset Update Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDatasetUpdateFrequency()
	 * @see #getDatasetUpdateFrequency()
	 * @see #setDatasetUpdateFrequency(String)
	 * @generated
	 */
	void unsetDatasetUpdateFrequency();

	/**
	 * Returns whether the value of the '{@link ppsr_coremetamodel.DmmExtensionTerms#getDatasetUpdateFrequency <em>Dataset Update Frequency</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dataset Update Frequency</em>' attribute is set.
	 * @see #unsetDatasetUpdateFrequency()
	 * @see #getDatasetUpdateFrequency()
	 * @see #setDatasetUpdateFrequency(String)
	 * @generated
	 */
	boolean isSetDatasetUpdateFrequency();

	/**
	 * Returns the value of the '<em><b>Dataset External Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dataset External Url</em>' attribute.
	 * @see #isSetDatasetExternalUrl()
	 * @see #unsetDatasetExternalUrl()
	 * @see #setDatasetExternalUrl(String)
	 * @see ppsr_coremetamodel.ppsrmetamodelPackage#getDmmExtensionTerms_DatasetExternalUrl()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 * @generated
	 */
	String getDatasetExternalUrl();

	/**
	 * Sets the value of the '{@link ppsr_coremetamodel.DmmExtensionTerms#getDatasetExternalUrl <em>Dataset External Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dataset External Url</em>' attribute.
	 * @see #isSetDatasetExternalUrl()
	 * @see #unsetDatasetExternalUrl()
	 * @see #getDatasetExternalUrl()
	 * @generated
	 */
	void setDatasetExternalUrl(String value);

	/**
	 * Unsets the value of the '{@link ppsr_coremetamodel.DmmExtensionTerms#getDatasetExternalUrl <em>Dataset External Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDatasetExternalUrl()
	 * @see #getDatasetExternalUrl()
	 * @see #setDatasetExternalUrl(String)
	 * @generated
	 */
	void unsetDatasetExternalUrl();

	/**
	 * Returns whether the value of the '{@link ppsr_coremetamodel.DmmExtensionTerms#getDatasetExternalUrl <em>Dataset External Url</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dataset External Url</em>' attribute is set.
	 * @see #unsetDatasetExternalUrl()
	 * @see #getDatasetExternalUrl()
	 * @see #setDatasetExternalUrl(String)
	 * @generated
	 */
	boolean isSetDatasetExternalUrl();

	/**
	 * Returns the value of the '<em><b>Download URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Download URL</em>' attribute.
	 * @see #isSetDownloadURL()
	 * @see #unsetDownloadURL()
	 * @see #setDownloadURL(String)
	 * @see ppsr_coremetamodel.ppsrmetamodelPackage#getDmmExtensionTerms_DownloadURL()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 * @generated
	 */
	String getDownloadURL();

	/**
	 * Sets the value of the '{@link ppsr_coremetamodel.DmmExtensionTerms#getDownloadURL <em>Download URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Download URL</em>' attribute.
	 * @see #isSetDownloadURL()
	 * @see #unsetDownloadURL()
	 * @see #getDownloadURL()
	 * @generated
	 */
	void setDownloadURL(String value);

	/**
	 * Unsets the value of the '{@link ppsr_coremetamodel.DmmExtensionTerms#getDownloadURL <em>Download URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDownloadURL()
	 * @see #getDownloadURL()
	 * @see #setDownloadURL(String)
	 * @generated
	 */
	void unsetDownloadURL();

	/**
	 * Returns whether the value of the '{@link ppsr_coremetamodel.DmmExtensionTerms#getDownloadURL <em>Download URL</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Download URL</em>' attribute is set.
	 * @see #unsetDownloadURL()
	 * @see #getDownloadURL()
	 * @see #setDownloadURL(String)
	 * @generated
	 */
	boolean isSetDownloadURL();

	/**
	 * Returns the value of the '<em><b>Data Quality Assurance Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Quality Assurance Method</em>' attribute.
	 * @see #isSetDataQualityAssuranceMethod()
	 * @see #unsetDataQualityAssuranceMethod()
	 * @see #setDataQualityAssuranceMethod(String)
	 * @see ppsr_coremetamodel.ppsrmetamodelPackage#getDmmExtensionTerms_DataQualityAssuranceMethod()
	 * @model unsettable="true"
	 * @generated
	 */
	String getDataQualityAssuranceMethod();

	/**
	 * Sets the value of the '{@link ppsr_coremetamodel.DmmExtensionTerms#getDataQualityAssuranceMethod <em>Data Quality Assurance Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Quality Assurance Method</em>' attribute.
	 * @see #isSetDataQualityAssuranceMethod()
	 * @see #unsetDataQualityAssuranceMethod()
	 * @see #getDataQualityAssuranceMethod()
	 * @generated
	 */
	void setDataQualityAssuranceMethod(String value);

	/**
	 * Unsets the value of the '{@link ppsr_coremetamodel.DmmExtensionTerms#getDataQualityAssuranceMethod <em>Data Quality Assurance Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDataQualityAssuranceMethod()
	 * @see #getDataQualityAssuranceMethod()
	 * @see #setDataQualityAssuranceMethod(String)
	 * @generated
	 */
	void unsetDataQualityAssuranceMethod();

	/**
	 * Returns whether the value of the '{@link ppsr_coremetamodel.DmmExtensionTerms#getDataQualityAssuranceMethod <em>Data Quality Assurance Method</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Data Quality Assurance Method</em>' attribute is set.
	 * @see #unsetDataQualityAssuranceMethod()
	 * @see #getDataQualityAssuranceMethod()
	 * @see #setDataQualityAssuranceMethod(String)
	 * @generated
	 */
	boolean isSetDataQualityAssuranceMethod();

	/**
	 * Returns the value of the '<em><b>Data Quality Assurance Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Quality Assurance Description</em>' attribute.
	 * @see #isSetDataQualityAssuranceDescription()
	 * @see #unsetDataQualityAssuranceDescription()
	 * @see #setDataQualityAssuranceDescription(String)
	 * @see ppsr_coremetamodel.ppsrmetamodelPackage#getDmmExtensionTerms_DataQualityAssuranceDescription()
	 * @model unsettable="true"
	 * @generated
	 */
	String getDataQualityAssuranceDescription();

	/**
	 * Sets the value of the '{@link ppsr_coremetamodel.DmmExtensionTerms#getDataQualityAssuranceDescription <em>Data Quality Assurance Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Quality Assurance Description</em>' attribute.
	 * @see #isSetDataQualityAssuranceDescription()
	 * @see #unsetDataQualityAssuranceDescription()
	 * @see #getDataQualityAssuranceDescription()
	 * @generated
	 */
	void setDataQualityAssuranceDescription(String value);

	/**
	 * Unsets the value of the '{@link ppsr_coremetamodel.DmmExtensionTerms#getDataQualityAssuranceDescription <em>Data Quality Assurance Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDataQualityAssuranceDescription()
	 * @see #getDataQualityAssuranceDescription()
	 * @see #setDataQualityAssuranceDescription(String)
	 * @generated
	 */
	void unsetDataQualityAssuranceDescription();

	/**
	 * Returns whether the value of the '{@link ppsr_coremetamodel.DmmExtensionTerms#getDataQualityAssuranceDescription <em>Data Quality Assurance Description</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Data Quality Assurance Description</em>' attribute is set.
	 * @see #unsetDataQualityAssuranceDescription()
	 * @see #getDataQualityAssuranceDescription()
	 * @see #setDataQualityAssuranceDescription(String)
	 * @generated
	 */
	boolean isSetDataQualityAssuranceDescription();

	/**
	 * Returns the value of the '<em><b>Usage Guide</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage Guide</em>' attribute.
	 * @see #isSetUsageGuide()
	 * @see #unsetUsageGuide()
	 * @see #setUsageGuide(String)
	 * @see ppsr_coremetamodel.ppsrmetamodelPackage#getDmmExtensionTerms_UsageGuide()
	 * @model unsettable="true"
	 * @generated
	 */
	String getUsageGuide();

	/**
	 * Sets the value of the '{@link ppsr_coremetamodel.DmmExtensionTerms#getUsageGuide <em>Usage Guide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage Guide</em>' attribute.
	 * @see #isSetUsageGuide()
	 * @see #unsetUsageGuide()
	 * @see #getUsageGuide()
	 * @generated
	 */
	void setUsageGuide(String value);

	/**
	 * Unsets the value of the '{@link ppsr_coremetamodel.DmmExtensionTerms#getUsageGuide <em>Usage Guide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUsageGuide()
	 * @see #getUsageGuide()
	 * @see #setUsageGuide(String)
	 * @generated
	 */
	void unsetUsageGuide();

	/**
	 * Returns whether the value of the '{@link ppsr_coremetamodel.DmmExtensionTerms#getUsageGuide <em>Usage Guide</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Usage Guide</em>' attribute is set.
	 * @see #unsetUsageGuide()
	 * @see #getUsageGuide()
	 * @see #setUsageGuide(String)
	 * @generated
	 */
	boolean isSetUsageGuide();

	/**
	 * Returns the value of the '<em><b>Data Management Plan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Management Plan</em>' attribute.
	 * @see #isSetDataManagementPlan()
	 * @see #unsetDataManagementPlan()
	 * @see #setDataManagementPlan(String)
	 * @see ppsr_coremetamodel.ppsrmetamodelPackage#getDmmExtensionTerms_DataManagementPlan()
	 * @model unsettable="true"
	 * @generated
	 */
	String getDataManagementPlan();

	/**
	 * Sets the value of the '{@link ppsr_coremetamodel.DmmExtensionTerms#getDataManagementPlan <em>Data Management Plan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Management Plan</em>' attribute.
	 * @see #isSetDataManagementPlan()
	 * @see #unsetDataManagementPlan()
	 * @see #getDataManagementPlan()
	 * @generated
	 */
	void setDataManagementPlan(String value);

	/**
	 * Unsets the value of the '{@link ppsr_coremetamodel.DmmExtensionTerms#getDataManagementPlan <em>Data Management Plan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDataManagementPlan()
	 * @see #getDataManagementPlan()
	 * @see #setDataManagementPlan(String)
	 * @generated
	 */
	void unsetDataManagementPlan();

	/**
	 * Returns whether the value of the '{@link ppsr_coremetamodel.DmmExtensionTerms#getDataManagementPlan <em>Data Management Plan</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Data Management Plan</em>' attribute is set.
	 * @see #unsetDataManagementPlan()
	 * @see #getDataManagementPlan()
	 * @see #setDataManagementPlan(String)
	 * @generated
	 */
	boolean isSetDataManagementPlan();

} // DmmExtensionTerms
