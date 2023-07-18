/**
 */
package dcatcs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CS Catalog</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dcatcs.CSCatalog#getCsproject <em>Csproject</em>}</li>
 *   <li>{@link dcatcs.CSCatalog#getProgramOrCampaign <em>Program Or Campaign</em>}</li>
 * </ul>
 *
 * @see dcatcs.DcatcsPackage#getCSCatalog()
 * @model
 * @generated
 */
public interface CSCatalog extends Catalog {
	/**
	 * Returns the value of the '<em><b>Csproject</b></em>' containment reference list.
	 * The list contents are of type {@link dcatcs.CSProject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Csproject</em>' containment reference list.
	 * @see dcatcs.DcatcsPackage#getCSCatalog_Csproject()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<CSProject> getCsproject();

	/**
	 * Returns the value of the '<em><b>Program Or Campaign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program Or Campaign</em>' attribute.
	 * @see #setProgramOrCampaign(String)
	 * @see dcatcs.DcatcsPackage#getCSCatalog_ProgramOrCampaign()
	 * @model
	 * @generated
	 */
	String getProgramOrCampaign();

	/**
	 * Sets the value of the '{@link dcatcs.CSCatalog#getProgramOrCampaign <em>Program Or Campaign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program Or Campaign</em>' attribute.
	 * @see #getProgramOrCampaign()
	 * @generated
	 */
	void setProgramOrCampaign(String value);

} // CSCatalog
