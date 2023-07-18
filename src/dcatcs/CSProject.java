/**
 */
package dcatcs;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CS Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dcatcs.CSProject#getProjectAim <em>Project Aim</em>}</li>
 *   <li>{@link dcatcs.CSProject#getDifficultyLevel <em>Difficulty Level</em>}</li>
 *   <li>{@link dcatcs.CSProject#getProjectStartDate <em>Project Start Date</em>}</li>
 *   <li>{@link dcatcs.CSProject#getProjectEndDate <em>Project End Date</em>}</li>
 *   <li>{@link dcatcs.CSProject#getProjectScienceType <em>Project Science Type</em>}</li>
 *   <li>{@link dcatcs.CSProject#getUnRegions <em>Un Regions</em>}</li>
 *   <li>{@link dcatcs.CSProject#getProjectLocality <em>Project Locality</em>}</li>
 *   <li>{@link dcatcs.CSProject#getProjectmedia <em>Projectmedia</em>}</li>
 *   <li>{@link dcatcs.CSProject#getProjectId <em>Project Id</em>}</li>
 *   <li>{@link dcatcs.CSProject#getProjectDateCreated <em>Project Date Created</em>}</li>
 *   <li>{@link dcatcs.CSProject#getProjectgeographiclocation <em>Projectgeographiclocation</em>}</li>
 *   <li>{@link dcatcs.CSProject#getContacts <em>Contacts</em>}</li>
 * </ul>
 *
 * @see dcatcs.DcatcsPackage#getCSProject()
 * @model
 * @generated
 */
public interface CSProject extends Resource {
	/**
	 * Returns the value of the '<em><b>Project Aim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Aim</em>' attribute.
	 * @see #setProjectAim(String)
	 * @see dcatcs.DcatcsPackage#getCSProject_ProjectAim()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getProjectAim();

	/**
	 * Sets the value of the '{@link dcatcs.CSProject#getProjectAim <em>Project Aim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Aim</em>' attribute.
	 * @see #getProjectAim()
	 * @generated
	 */
	void setProjectAim(String value);

	/**
	 * Returns the value of the '<em><b>Difficulty Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Difficulty Level</em>' attribute.
	 * @see #isSetDifficultyLevel()
	 * @see #unsetDifficultyLevel()
	 * @see #setDifficultyLevel(String)
	 * @see dcatcs.DcatcsPackage#getCSProject_DifficultyLevel()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	String getDifficultyLevel();

	/**
	 * Sets the value of the '{@link dcatcs.CSProject#getDifficultyLevel <em>Difficulty Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Difficulty Level</em>' attribute.
	 * @see #isSetDifficultyLevel()
	 * @see #unsetDifficultyLevel()
	 * @see #getDifficultyLevel()
	 * @generated
	 */
	void setDifficultyLevel(String value);

	/**
	 * Unsets the value of the '{@link dcatcs.CSProject#getDifficultyLevel <em>Difficulty Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDifficultyLevel()
	 * @see #getDifficultyLevel()
	 * @see #setDifficultyLevel(String)
	 * @generated
	 */
	void unsetDifficultyLevel();

	/**
	 * Returns whether the value of the '{@link dcatcs.CSProject#getDifficultyLevel <em>Difficulty Level</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Difficulty Level</em>' attribute is set.
	 * @see #unsetDifficultyLevel()
	 * @see #getDifficultyLevel()
	 * @see #setDifficultyLevel(String)
	 * @generated
	 */
	boolean isSetDifficultyLevel();

	/**
	 * Returns the value of the '<em><b>Project Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Start Date</em>' attribute.
	 * @see #setProjectStartDate(Date)
	 * @see dcatcs.DcatcsPackage#getCSProject_ProjectStartDate()
	 * @model unique="false"
	 * @generated
	 */
	Date getProjectStartDate();

	/**
	 * Sets the value of the '{@link dcatcs.CSProject#getProjectStartDate <em>Project Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Start Date</em>' attribute.
	 * @see #getProjectStartDate()
	 * @generated
	 */
	void setProjectStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>Project End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project End Date</em>' attribute.
	 * @see #isSetProjectEndDate()
	 * @see #unsetProjectEndDate()
	 * @see #setProjectEndDate(Date)
	 * @see dcatcs.DcatcsPackage#getCSProject_ProjectEndDate()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	Date getProjectEndDate();

	/**
	 * Sets the value of the '{@link dcatcs.CSProject#getProjectEndDate <em>Project End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project End Date</em>' attribute.
	 * @see #isSetProjectEndDate()
	 * @see #unsetProjectEndDate()
	 * @see #getProjectEndDate()
	 * @generated
	 */
	void setProjectEndDate(Date value);

	/**
	 * Unsets the value of the '{@link dcatcs.CSProject#getProjectEndDate <em>Project End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProjectEndDate()
	 * @see #getProjectEndDate()
	 * @see #setProjectEndDate(Date)
	 * @generated
	 */
	void unsetProjectEndDate();

	/**
	 * Returns whether the value of the '{@link dcatcs.CSProject#getProjectEndDate <em>Project End Date</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Project End Date</em>' attribute is set.
	 * @see #unsetProjectEndDate()
	 * @see #getProjectEndDate()
	 * @see #setProjectEndDate(Date)
	 * @generated
	 */
	boolean isSetProjectEndDate();

	/**
	 * Returns the value of the '<em><b>Project Science Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Science Type</em>' attribute.
	 * @see #setProjectScienceType(String)
	 * @see dcatcs.DcatcsPackage#getCSProject_ProjectScienceType()
	 * @model unique="false"
	 * @generated
	 */
	String getProjectScienceType();

	/**
	 * Sets the value of the '{@link dcatcs.CSProject#getProjectScienceType <em>Project Science Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Science Type</em>' attribute.
	 * @see #getProjectScienceType()
	 * @generated
	 */
	void setProjectScienceType(String value);

	/**
	 * Returns the value of the '<em><b>Un Regions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Un Regions</em>' attribute.
	 * @see #isSetUnRegions()
	 * @see #unsetUnRegions()
	 * @see #setUnRegions(String)
	 * @see dcatcs.DcatcsPackage#getCSProject_UnRegions()
	 * @model unsettable="true" ordered="false"
	 * @generated
	 */
	String getUnRegions();

	/**
	 * Sets the value of the '{@link dcatcs.CSProject#getUnRegions <em>Un Regions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Un Regions</em>' attribute.
	 * @see #isSetUnRegions()
	 * @see #unsetUnRegions()
	 * @see #getUnRegions()
	 * @generated
	 */
	void setUnRegions(String value);

	/**
	 * Unsets the value of the '{@link dcatcs.CSProject#getUnRegions <em>Un Regions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnRegions()
	 * @see #getUnRegions()
	 * @see #setUnRegions(String)
	 * @generated
	 */
	void unsetUnRegions();

	/**
	 * Returns whether the value of the '{@link dcatcs.CSProject#getUnRegions <em>Un Regions</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Un Regions</em>' attribute is set.
	 * @see #unsetUnRegions()
	 * @see #getUnRegions()
	 * @see #setUnRegions(String)
	 * @generated
	 */
	boolean isSetUnRegions();

	/**
	 * Returns the value of the '<em><b>Project Locality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Locality</em>' attribute.
	 * @see #isSetProjectLocality()
	 * @see #unsetProjectLocality()
	 * @see #setProjectLocality(String)
	 * @see dcatcs.DcatcsPackage#getCSProject_ProjectLocality()
	 * @model unsettable="true"
	 * @generated
	 */
	String getProjectLocality();

	/**
	 * Sets the value of the '{@link dcatcs.CSProject#getProjectLocality <em>Project Locality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Locality</em>' attribute.
	 * @see #isSetProjectLocality()
	 * @see #unsetProjectLocality()
	 * @see #getProjectLocality()
	 * @generated
	 */
	void setProjectLocality(String value);

	/**
	 * Unsets the value of the '{@link dcatcs.CSProject#getProjectLocality <em>Project Locality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProjectLocality()
	 * @see #getProjectLocality()
	 * @see #setProjectLocality(String)
	 * @generated
	 */
	void unsetProjectLocality();

	/**
	 * Returns whether the value of the '{@link dcatcs.CSProject#getProjectLocality <em>Project Locality</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Project Locality</em>' attribute is set.
	 * @see #unsetProjectLocality()
	 * @see #getProjectLocality()
	 * @see #setProjectLocality(String)
	 * @generated
	 */
	boolean isSetProjectLocality();

	/**
	 * Returns the value of the '<em><b>Projectmedia</b></em>' containment reference list.
	 * The list contents are of type {@link dcatcs.ProjectMedia}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projectmedia</em>' containment reference list.
	 * @see dcatcs.DcatcsPackage#getCSProject_Projectmedia()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ProjectMedia> getProjectmedia();

	/**
	 * Returns the value of the '<em><b>Project Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Globally unique identifier (GUID) for the project. System generated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Project Id</em>' attribute.
	 * @see dcatcs.DcatcsPackage#getCSProject_ProjectId()
	 * @model changeable="false"
	 *        annotation="http://purl.org/dc/elements/1.1/identifier"
	 * @generated
	 */
	String getProjectId();

	/**
	 * Returns the value of the '<em><b>Project Date Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date and time that the record was created in the database. Uses the ISO 8601:2004 (E) dateTime standard
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Project Date Created</em>' attribute.
	 * @see #setProjectDateCreated(Date)
	 * @see dcatcs.DcatcsPackage#getCSProject_ProjectDateCreated()
	 * @model unique="false"
	 *        annotation="http://purl.org/dc/terms/created"
	 * @generated
	 */
	Date getProjectDateCreated();

	/**
	 * Sets the value of the '{@link dcatcs.CSProject#getProjectDateCreated <em>Project Date Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Date Created</em>' attribute.
	 * @see #getProjectDateCreated()
	 * @generated
	 */
	void setProjectDateCreated(Date value);

	/**
	 * Returns the value of the '<em><b>Projectgeographiclocation</b></em>' containment reference list.
	 * The list contents are of type {@link dcatcs.ProjectGeographicLocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projectgeographiclocation</em>' containment reference list.
	 * @see dcatcs.DcatcsPackage#getCSProject_Projectgeographiclocation()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProjectGeographicLocation> getProjectgeographiclocation();

	/**
	 * Returns the value of the '<em><b>Contacts</b></em>' containment reference list.
	 * The list contents are of type {@link dcatcs.ContactPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contacts</em>' containment reference list.
	 * @see dcatcs.DcatcsPackage#getCSProject_Contacts()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContactPoint> getContacts();

} // CSProject
