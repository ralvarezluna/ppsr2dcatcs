/**
 */
package ppsr_coremetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program Or Campaign</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ppsr_coremetamodel.ProgramOrCampaign#getProgramId <em>Program Id</em>}</li>
 *   <li>{@link ppsr_coremetamodel.ProgramOrCampaign#getProgramName <em>Program Name</em>}</li>
 *   <li>{@link ppsr_coremetamodel.ProgramOrCampaign#getLanguage <em>Language</em>}</li>
 *   <li>{@link ppsr_coremetamodel.ProgramOrCampaign#getCsproject <em>Csproject</em>}</li>
 * </ul>
 *
 * @see ppsr_coremetamodel.ppsrmetamodelPackage#getProgramOrCampaign()
 * @model
 * @generated
 */
public interface ProgramOrCampaign extends EObject {
	/**
	 * Returns the value of the '<em><b>Program Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program Id</em>' attribute.
	 * @see #isSetProgramId()
	 * @see #unsetProgramId()
	 * @see #setProgramId(String)
	 * @see ppsr_coremetamodel.ppsrmetamodelPackage#getProgramOrCampaign_ProgramId()
	 * @model unique="false" unsettable="true" ordered="false"
	 * @generated
	 */
	String getProgramId();

	/**
	 * Sets the value of the '{@link ppsr_coremetamodel.ProgramOrCampaign#getProgramId <em>Program Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program Id</em>' attribute.
	 * @see #isSetProgramId()
	 * @see #unsetProgramId()
	 * @see #getProgramId()
	 * @generated
	 */
	void setProgramId(String value);

	/**
	 * Unsets the value of the '{@link ppsr_coremetamodel.ProgramOrCampaign#getProgramId <em>Program Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProgramId()
	 * @see #getProgramId()
	 * @see #setProgramId(String)
	 * @generated
	 */
	void unsetProgramId();

	/**
	 * Returns whether the value of the '{@link ppsr_coremetamodel.ProgramOrCampaign#getProgramId <em>Program Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Program Id</em>' attribute is set.
	 * @see #unsetProgramId()
	 * @see #getProgramId()
	 * @see #setProgramId(String)
	 * @generated
	 */
	boolean isSetProgramId();

	/**
	 * Returns the value of the '<em><b>Program Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program Name</em>' attribute.
	 * @see #setProgramName(String)
	 * @see ppsr_coremetamodel.ppsrmetamodelPackage#getProgramOrCampaign_ProgramName()
	 * @model
	 * @generated
	 */
	String getProgramName();

	/**
	 * Sets the value of the '{@link ppsr_coremetamodel.ProgramOrCampaign#getProgramName <em>Program Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program Name</em>' attribute.
	 * @see #getProgramName()
	 * @generated
	 */
	void setProgramName(String value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see ppsr_coremetamodel.ppsrmetamodelPackage#getProgramOrCampaign_Language()
	 * @model
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link ppsr_coremetamodel.ProgramOrCampaign#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Csproject</b></em>' containment reference list.
	 * The list contents are of type {@link ppsr_coremetamodel.CSProject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Csproject</em>' containment reference list.
	 * @see ppsr_coremetamodel.ppsrmetamodelPackage#getProgramOrCampaign_Csproject()
	 * @model containment="true"
	 * @generated
	 */
	EList<CSProject> getCsproject();

} // ProgramOrCampaign
