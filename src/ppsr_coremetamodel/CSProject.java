/**
 */
package ppsr_coremetamodel;

import java.util.Date;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CS Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A project is an overarching context for a set of associated activities which contribute to a specific objective. Entity equates to OWL 2.0 Class object. The project entity is described and defined by this schema.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ppsr_coremetamodel.CSProject#getProjectId <em>Project Id</em>}</li>
 *   <li>{@link ppsr_coremetamodel.CSProject#getProjectDateCreated <em>Project Date Created</em>}</li>
 *   <li>{@link ppsr_coremetamodel.CSProject#getProjectLastUpdatedDate <em>Project Last Updated Date</em>}</li>
 *   <li>{@link ppsr_coremetamodel.CSProject#getProjectName <em>Project Name</em>}</li>
 *   <li>{@link ppsr_coremetamodel.CSProject#getProjectAim <em>Project Aim</em>}</li>
 *   <li>{@link ppsr_coremetamodel.CSProject#getProjectDescription <em>Project Description</em>}</li>
 *   <li>{@link ppsr_coremetamodel.CSProject#getHasTag <em>Has Tag</em>}</li>
 *   <li>{@link ppsr_coremetamodel.CSProject#getDifficultyLevel <em>Difficulty Level</em>}</li>
 *   <li>{@link ppsr_coremetamodel.CSProject#getProjectStatus <em>Project Status</em>}</li>
 *   <li>{@link ppsr_coremetamodel.CSProject#getProjectStartDate <em>Project Start Date</em>}</li>
 *   <li>{@link ppsr_coremetamodel.CSProject#getProjectEndDate <em>Project End Date</em>}</li>
 *   <li>{@link ppsr_coremetamodel.CSProject#getProjectDuration <em>Project Duration</em>}</li>
 *   <li>{@link ppsr_coremetamodel.CSProject#getProjectScienceType <em>Project Science Type</em>}</li>
 *   <li>{@link ppsr_coremetamodel.CSProject#getProjectUrl <em>Project Url</em>}</li>
 *   <li>{@link ppsr_coremetamodel.CSProject#getUnRegions <em>Un Regions</em>}</li>
 *   <li>{@link ppsr_coremetamodel.CSProject#getLanguage <em>Language</em>}</li>
 *   <li>{@link ppsr_coremetamodel.CSProject#getProjectgeographiclocation <em>Projectgeographiclocation</em>}</li>
 *   <li>{@link ppsr_coremetamodel.CSProject#getProjectmedia <em>Projectmedia</em>}</li>
 *   <li>{@link ppsr_coremetamodel.CSProject#getActivity <em>Activity</em>}</li>
 *   <li>{@link ppsr_coremetamodel.CSProject#getKeywords <em>Keywords</em>}</li>
 *   <li>{@link ppsr_coremetamodel.CSProject#getContactpoint <em>Contactpoint</em>}</li>
 *   <li>{@link ppsr_coremetamodel.CSProject#getProjectResponsiblePartyName <em>Project Responsible Party Name</em>}</li>
 * </ul>
 *
 * @see ppsr_coremetamodel.ppsrmetamodelPackage#getCSProject()
 * @model
 * @generated
 */
public interface CSProject extends EObject {
	/**
	 * Returns the value of the '<em><b>Project Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Globally unique identifier (GUID) for the project. System generated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Project Id</em>' attribute.
	 * @see #setProjectId(String)
	 * @see ppsr_coremetamodel.ppsrmetamodelPackage#getCSProject_ProjectId()
	 * @model id="true"
	 *        annotation="http://purl.org/dc/elements/1.1/identifier"
	 * @generated
	 */
	String getProjectId();

	/**
	 * Sets the value of the '{@link ppsr_coremetamodel.CSProject#getProjectId <em>Project Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Id</em>' attribute.
	 * @see #getProjectId()
	 * @generated
	 */
	void setProjectId(String value);

	/**
	 * Returns the value of the '<em><b>Project Date Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date and time that the record was created in the database. Uses the ISO 8601:2004 (E) dateTime standard
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Project Date Created</em>' attribute.
	 * @see #setProjectDateCreated(Date)
	 * @see ppsr_coremetamodel.ppsrmetamodelPackage#getCSProject_ProjectDateCreated()
	 * @model annotation="http://purl.org/dc/terms/created"
	 * @generated
	 */
	Date getProjectDateCreated();

	/**
	 * Sets the value of the '{@link ppsr_coremetamodel.CSProject#getProjectDateCreated <em>Project Date Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Date Created</em>' attribute.
	 * @see #getProjectDateCreated()
	 * @generated
	 */
	void setProjectDateCreated(Date value);

	/**
	 * Returns the value of the '<em><b>Project Last Updated Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date and time that the record was last updated in the database. Uses the ISO 8601:2004 (E) dateTime standard
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Project Last Updated Date</em>' attribute.
	 * @see #setProjectLastUpdatedDate(Date)
	 * @see ppsr_coremetamodel.ppsrmetamodelPackage#getCSProject_ProjectLastUpdatedDate()
	 * @model annotation="http://purl.org/dc/terms/modified"
	 * @generated
	 */
	Date getProjectLastUpdatedDate();

	/**
	 * Sets the value of the '{@link ppsr_coremetamodel.CSProject#getProjectLastUpdatedDate <em>Project Last Updated Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Last Updated Date</em>' attribute.
	 * @see #getProjectLastUpdatedDate()
	 * @generated
	 */
	void setProjectLastUpdatedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Short name or title of the project.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Project Name</em>' attribute.
	 * @see #setProjectName(String)
	 * @see ppsr_coremetamodel.ppsrmetamodelPackage#getCSProject_ProjectName()
	 * @model annotation="http://purl.org/dc/elements/1.1/title"
	 * @generated
	 */
	String getProjectName();

	/**
	 * Sets the value of the '{@link ppsr_coremetamodel.CSProject#getProjectName <em>Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Name</em>' attribute.
	 * @see #getProjectName()
	 * @generated
	 */
	void setProjectName(String value);

	/**
	 * Returns the value of the '<em><b>Project Aim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The primary aim, goal or objective of the project.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Project Aim</em>' attribute.
	 * @see #setProjectAim(String)
	 * @see ppsr_coremetamodel.ppsrmetamodelPackage#getCSProject_ProjectAim()
	 * @model unique="false"
	 *        annotation="http://purl.org/dc/terms/abstract"
	 * @generated
	 */
	String getProjectAim();

	/**
	 * Sets the value of the '{@link ppsr_coremetamodel.CSProject#getProjectAim <em>Project Aim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Aim</em>' attribute.
	 * @see #getProjectAim()
	 * @generated
	 */
	void setProjectAim(String value);

	/**
	 * Returns the value of the '<em><b>Project Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Abstract or long description of the project.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Project Description</em>' attribute.
	 * @see #setProjectDescription(String)
	 * @see ppsr_coremetamodel.ppsrmetamodelPackage#getCSProject_ProjectDescription()
	 * @model unique="false"
	 *        annotation="http://purl.org/dc/elements/1.1/description"
	 * @generated
	 */
	String getProjectDescription();

	/**
	 * Sets the value of the '{@link ppsr_coremetamodel.CSProject#getProjectDescription <em>Project Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Description</em>' attribute.
	 * @see #getProjectDescription()
	 * @generated
	 */
	void setProjectDescription(String value);

	/**
	 * Returns the value of the '<em><b>Has Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Tag</em>' attribute.
	 * @see #setHasTag(String)
	 * @see ppsr_coremetamodel.ppsrmetamodelPackage#getCSProject_HasTag()
	 * @model unique="false"
	 * @generated
	 */
	String getHasTag();

	/**
	 * Sets the value of the '{@link ppsr_coremetamodel.CSProject#getHasTag <em>Has Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Tag</em>' attribute.
	 * @see #getHasTag()
	 * @generated
	 */
	void setHasTag(String value);

	/**
	 * Returns the value of the '<em><b>Difficulty Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Difficulty Level</em>' attribute.
	 * @see #setDifficultyLevel(String)
	 * @see ppsr_coremetamodel.ppsrmetamodelPackage#getCSProject_DifficultyLevel()
	 * @model
	 * @generated
	 */
	String getDifficultyLevel();

	/**
	 * Sets the value of the '{@link ppsr_coremetamodel.CSProject#getDifficultyLevel <em>Difficulty Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Difficulty Level</em>' attribute.
	 * @see #getDifficultyLevel()
	 * @generated
	 */
	void setDifficultyLevel(String value);

	/**
	 * Returns the value of the '<em><b>Project Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Status</em>' attribute.
	 * @see #setProjectStatus(String)
	 * @see ppsr_coremetamodel.ppsrmetamodelPackage#getCSProject_ProjectStatus()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getProjectStatus();

	/**
	 * Sets the value of the '{@link ppsr_coremetamodel.CSProject#getProjectStatus <em>Project Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Status</em>' attribute.
	 * @see #getProjectStatus()
	 * @generated
	 */
	void setProjectStatus(String value);

	/**
	 * Returns the value of the '<em><b>Project Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Start Date</em>' attribute.
	 * @see #setProjectStartDate(Date)
	 * @see ppsr_coremetamodel.ppsrmetamodelPackage#getCSProject_ProjectStartDate()
	 * @model
	 * @generated
	 */
	Date getProjectStartDate();

	/**
	 * Sets the value of the '{@link ppsr_coremetamodel.CSProject#getProjectStartDate <em>Project Start Date</em>}' attribute.
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
	 * @see #setProjectEndDate(Date)
	 * @see ppsr_coremetamodel.ppsrmetamodelPackage#getCSProject_ProjectEndDate()
	 * @model
	 * @generated
	 */
	Date getProjectEndDate();

	/**
	 * Sets the value of the '{@link ppsr_coremetamodel.CSProject#getProjectEndDate <em>Project End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project End Date</em>' attribute.
	 * @see #getProjectEndDate()
	 * @generated
	 */
	void setProjectEndDate(Date value);

	/**
	 * Returns the value of the '<em><b>Project Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Duration</em>' attribute.
	 * @see #setProjectDuration(XMLGregorianCalendar)
	 * @see ppsr_coremetamodel.ppsrmetamodelPackage#getCSProject_ProjectDuration()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Time"
	 * @generated
	 */
	XMLGregorianCalendar getProjectDuration();

	/**
	 * Sets the value of the '{@link ppsr_coremetamodel.CSProject#getProjectDuration <em>Project Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Duration</em>' attribute.
	 * @see #getProjectDuration()
	 * @generated
	 */
	void setProjectDuration(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Project Science Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Science Type</em>' attribute.
	 * @see #setProjectScienceType(String)
	 * @see ppsr_coremetamodel.ppsrmetamodelPackage#getCSProject_ProjectScienceType()
	 * @model
	 * @generated
	 */
	String getProjectScienceType();

	/**
	 * Sets the value of the '{@link ppsr_coremetamodel.CSProject#getProjectScienceType <em>Project Science Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Science Type</em>' attribute.
	 * @see #getProjectScienceType()
	 * @generated
	 */
	void setProjectScienceType(String value);

	/**
	 * Returns the value of the '<em><b>Project Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Url</em>' attribute.
	 * @see #setProjectUrl(String)
	 * @see ppsr_coremetamodel.ppsrmetamodelPackage#getCSProject_ProjectUrl()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 * @generated
	 */
	String getProjectUrl();

	/**
	 * Sets the value of the '{@link ppsr_coremetamodel.CSProject#getProjectUrl <em>Project Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Url</em>' attribute.
	 * @see #getProjectUrl()
	 * @generated
	 */
	void setProjectUrl(String value);

	/**
	 * Returns the value of the '<em><b>Un Regions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Un Regions</em>' attribute.
	 * @see #setUnRegions(String)
	 * @see ppsr_coremetamodel.ppsrmetamodelPackage#getCSProject_UnRegions()
	 * @model
	 * @generated
	 */
	String getUnRegions();

	/**
	 * Sets the value of the '{@link ppsr_coremetamodel.CSProject#getUnRegions <em>Un Regions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Un Regions</em>' attribute.
	 * @see #getUnRegions()
	 * @generated
	 */
	void setUnRegions(String value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see ppsr_coremetamodel.ppsrmetamodelPackage#getCSProject_Language()
	 * @model
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link ppsr_coremetamodel.CSProject#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Projectgeographiclocation</b></em>' containment reference list.
	 * The list contents are of type {@link ppsr_coremetamodel.ProjectGeographicLocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projectgeographiclocation</em>' containment reference list.
	 * @see ppsr_coremetamodel.ppsrmetamodelPackage#getCSProject_Projectgeographiclocation()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ProjectGeographicLocation> getProjectgeographiclocation();

	/**
	 * Returns the value of the '<em><b>Projectmedia</b></em>' containment reference list.
	 * The list contents are of type {@link ppsr_coremetamodel.ProjectMedia}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projectmedia</em>' containment reference list.
	 * @see ppsr_coremetamodel.ppsrmetamodelPackage#getCSProject_Projectmedia()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ProjectMedia> getProjectmedia();

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' containment reference list.
	 * The list contents are of type {@link ppsr_coremetamodel.Activity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' containment reference list.
	 * @see ppsr_coremetamodel.ppsrmetamodelPackage#getCSProject_Activity()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Activity> getActivity();

	/**
	 * Returns the value of the '<em><b>Keywords</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keywords</em>' attribute.
	 * @see #setKeywords(String)
	 * @see ppsr_coremetamodel.ppsrmetamodelPackage#getCSProject_Keywords()
	 * @model
	 * @generated
	 */
	String getKeywords();

	/**
	 * Sets the value of the '{@link ppsr_coremetamodel.CSProject#getKeywords <em>Keywords</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keywords</em>' attribute.
	 * @see #getKeywords()
	 * @generated
	 */
	void setKeywords(String value);

	/**
	 * Returns the value of the '<em><b>Contactpoint</b></em>' containment reference list.
	 * The list contents are of type {@link ppsr_coremetamodel.ContactPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contactpoint</em>' containment reference list.
	 * @see ppsr_coremetamodel.ppsrmetamodelPackage#getCSProject_Contactpoint()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ContactPoint> getContactpoint();

	/**
	 * Returns the value of the '<em><b>Project Responsible Party Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Responsible Party Name</em>' attribute.
	 * @see #setProjectResponsiblePartyName(String)
	 * @see ppsr_coremetamodel.ppsrmetamodelPackage#getCSProject_ProjectResponsiblePartyName()
	 * @model
	 * @generated
	 */
	String getProjectResponsiblePartyName();

	/**
	 * Sets the value of the '{@link ppsr_coremetamodel.CSProject#getProjectResponsiblePartyName <em>Project Responsible Party Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Responsible Party Name</em>' attribute.
	 * @see #getProjectResponsiblePartyName()
	 * @generated
	 */
	void setProjectResponsiblePartyName(String value);

} // CSProject
