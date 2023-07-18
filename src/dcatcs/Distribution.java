/**
 */
package dcatcs;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Distribution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dcatcs.Distribution#getDatadistributionservice <em>Datadistributionservice</em>}</li>
 *   <li>{@link dcatcs.Distribution#getAccessURL <em>Access URL</em>}</li>
 *   <li>{@link dcatcs.Distribution#getByteSize <em>Byte Size</em>}</li>
 *   <li>{@link dcatcs.Distribution#getDownloadURL <em>Download URL</em>}</li>
 *   <li>{@link dcatcs.Distribution#getMediaType <em>Media Type</em>}</li>
 *   <li>{@link dcatcs.Distribution#getConformsTo <em>Conforms To</em>}</li>
 *   <li>{@link dcatcs.Distribution#getDescription <em>Description</em>}</li>
 *   <li>{@link dcatcs.Distribution#getFormat <em>Format</em>}</li>
 *   <li>{@link dcatcs.Distribution#getIssued <em>Issued</em>}</li>
 *   <li>{@link dcatcs.Distribution#getLicense <em>License</em>}</li>
 *   <li>{@link dcatcs.Distribution#getModified <em>Modified</em>}</li>
 *   <li>{@link dcatcs.Distribution#getRights <em>Rights</em>}</li>
 *   <li>{@link dcatcs.Distribution#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @see dcatcs.DcatcsPackage#getDistribution()
 * @model
 * @generated
 */
public interface Distribution extends EObject {
	/**
	 * Returns the value of the '<em><b>Datadistributionservice</b></em>' containment reference list.
	 * The list contents are of type {@link dcatcs.DataDistributionService}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datadistributionservice</em>' containment reference list.
	 * @see dcatcs.DcatcsPackage#getDistribution_Datadistributionservice()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataDistributionService> getDatadistributionservice();

	/**
	 * Returns the value of the '<em><b>Access URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access URL</em>' attribute.
	 * @see #setAccessURL(String)
	 * @see dcatcs.DcatcsPackage#getDistribution_AccessURL()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" ordered="false"
	 * @generated
	 */
	String getAccessURL();

	/**
	 * Sets the value of the '{@link dcatcs.Distribution#getAccessURL <em>Access URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access URL</em>' attribute.
	 * @see #getAccessURL()
	 * @generated
	 */
	void setAccessURL(String value);

	/**
	 * Returns the value of the '<em><b>Byte Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Byte Size</em>' attribute.
	 * @see #setByteSize(float)
	 * @see dcatcs.DcatcsPackage#getDistribution_ByteSize()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	float getByteSize();

	/**
	 * Sets the value of the '{@link dcatcs.Distribution#getByteSize <em>Byte Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Byte Size</em>' attribute.
	 * @see #getByteSize()
	 * @generated
	 */
	void setByteSize(float value);

	/**
	 * Returns the value of the '<em><b>Download URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Download URL</em>' attribute.
	 * @see #setDownloadURL(String)
	 * @see dcatcs.DcatcsPackage#getDistribution_DownloadURL()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI" ordered="false"
	 * @generated
	 */
	String getDownloadURL();

	/**
	 * Sets the value of the '{@link dcatcs.Distribution#getDownloadURL <em>Download URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Download URL</em>' attribute.
	 * @see #getDownloadURL()
	 * @generated
	 */
	void setDownloadURL(String value);

	/**
	 * Returns the value of the '<em><b>Media Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Media Type</em>' attribute.
	 * @see #setMediaType(String)
	 * @see dcatcs.DcatcsPackage#getDistribution_MediaType()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getMediaType();

	/**
	 * Sets the value of the '{@link dcatcs.Distribution#getMediaType <em>Media Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Media Type</em>' attribute.
	 * @see #getMediaType()
	 * @generated
	 */
	void setMediaType(String value);

	/**
	 * Returns the value of the '<em><b>Conforms To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conforms To</em>' attribute.
	 * @see #setConformsTo(String)
	 * @see dcatcs.DcatcsPackage#getDistribution_ConformsTo()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" ordered="false"
	 * @generated
	 */
	String getConformsTo();

	/**
	 * Sets the value of the '{@link dcatcs.Distribution#getConformsTo <em>Conforms To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conforms To</em>' attribute.
	 * @see #getConformsTo()
	 * @generated
	 */
	void setConformsTo(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see dcatcs.DcatcsPackage#getDistribution_Description()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link dcatcs.Distribution#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see #setFormat(String)
	 * @see dcatcs.DcatcsPackage#getDistribution_Format()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getFormat();

	/**
	 * Sets the value of the '{@link dcatcs.Distribution#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(String value);

	/**
	 * Returns the value of the '<em><b>Issued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issued</em>' attribute.
	 * @see #setIssued(Date)
	 * @see dcatcs.DcatcsPackage#getDistribution_Issued()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	Date getIssued();

	/**
	 * Sets the value of the '{@link dcatcs.Distribution#getIssued <em>Issued</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issued</em>' attribute.
	 * @see #getIssued()
	 * @generated
	 */
	void setIssued(Date value);

	/**
	 * Returns the value of the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>License</em>' attribute.
	 * @see #setLicense(String)
	 * @see dcatcs.DcatcsPackage#getDistribution_License()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getLicense();

	/**
	 * Sets the value of the '{@link dcatcs.Distribution#getLicense <em>License</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>License</em>' attribute.
	 * @see #getLicense()
	 * @generated
	 */
	void setLicense(String value);

	/**
	 * Returns the value of the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modified</em>' attribute.
	 * @see #setModified(Date)
	 * @see dcatcs.DcatcsPackage#getDistribution_Modified()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	Date getModified();

	/**
	 * Sets the value of the '{@link dcatcs.Distribution#getModified <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modified</em>' attribute.
	 * @see #getModified()
	 * @generated
	 */
	void setModified(Date value);

	/**
	 * Returns the value of the '<em><b>Rights</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rights</em>' attribute.
	 * @see #setRights(String)
	 * @see dcatcs.DcatcsPackage#getDistribution_Rights()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getRights();

	/**
	 * Sets the value of the '{@link dcatcs.Distribution#getRights <em>Rights</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rights</em>' attribute.
	 * @see #getRights()
	 * @generated
	 */
	void setRights(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see dcatcs.DcatcsPackage#getDistribution_Title()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link dcatcs.Distribution#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

} // Distribution
