/**
 */
package ppsr_coremetamodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import ppsr_coremetamodel.ProjectMedia;
import ppsr_coremetamodel.ppsrmetamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project Media</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ppsr_coremetamodel.impl.ProjectMediaImpl#getProjectMediaType <em>Project Media Type</em>}</li>
 *   <li>{@link ppsr_coremetamodel.impl.ProjectMediaImpl#getProjectMediaFile <em>Project Media File</em>}</li>
 *   <li>{@link ppsr_coremetamodel.impl.ProjectMediaImpl#getProjectMediaCredit <em>Project Media Credit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProjectMediaImpl extends EObjectImpl implements ProjectMedia {
	/**
	 * The default value of the '{@link #getProjectMediaType() <em>Project Media Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectMediaType()
	 * @generated
	 * @ordered
	 */
	protected static final String PROJECT_MEDIA_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProjectMediaType() <em>Project Media Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectMediaType()
	 * @generated
	 * @ordered
	 */
	protected String projectMediaType = PROJECT_MEDIA_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getProjectMediaFile() <em>Project Media File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectMediaFile()
	 * @generated
	 * @ordered
	 */
	protected static final String PROJECT_MEDIA_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProjectMediaFile() <em>Project Media File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectMediaFile()
	 * @generated
	 * @ordered
	 */
	protected String projectMediaFile = PROJECT_MEDIA_FILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getProjectMediaCredit() <em>Project Media Credit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectMediaCredit()
	 * @generated
	 * @ordered
	 */
	protected static final String PROJECT_MEDIA_CREDIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProjectMediaCredit() <em>Project Media Credit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectMediaCredit()
	 * @generated
	 * @ordered
	 */
	protected String projectMediaCredit = PROJECT_MEDIA_CREDIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectMediaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ppsrmetamodelPackage.Literals.PROJECT_MEDIA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProjectMediaType() {
		return projectMediaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProjectMediaType(String newProjectMediaType) {
		String oldProjectMediaType = projectMediaType;
		projectMediaType = newProjectMediaType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ppsrmetamodelPackage.PROJECT_MEDIA__PROJECT_MEDIA_TYPE, oldProjectMediaType, projectMediaType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProjectMediaFile() {
		return projectMediaFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProjectMediaFile(String newProjectMediaFile) {
		String oldProjectMediaFile = projectMediaFile;
		projectMediaFile = newProjectMediaFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ppsrmetamodelPackage.PROJECT_MEDIA__PROJECT_MEDIA_FILE, oldProjectMediaFile, projectMediaFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProjectMediaCredit() {
		return projectMediaCredit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProjectMediaCredit(String newProjectMediaCredit) {
		String oldProjectMediaCredit = projectMediaCredit;
		projectMediaCredit = newProjectMediaCredit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ppsrmetamodelPackage.PROJECT_MEDIA__PROJECT_MEDIA_CREDIT, oldProjectMediaCredit, projectMediaCredit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ppsrmetamodelPackage.PROJECT_MEDIA__PROJECT_MEDIA_TYPE:
				return getProjectMediaType();
			case ppsrmetamodelPackage.PROJECT_MEDIA__PROJECT_MEDIA_FILE:
				return getProjectMediaFile();
			case ppsrmetamodelPackage.PROJECT_MEDIA__PROJECT_MEDIA_CREDIT:
				return getProjectMediaCredit();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ppsrmetamodelPackage.PROJECT_MEDIA__PROJECT_MEDIA_TYPE:
				setProjectMediaType((String)newValue);
				return;
			case ppsrmetamodelPackage.PROJECT_MEDIA__PROJECT_MEDIA_FILE:
				setProjectMediaFile((String)newValue);
				return;
			case ppsrmetamodelPackage.PROJECT_MEDIA__PROJECT_MEDIA_CREDIT:
				setProjectMediaCredit((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ppsrmetamodelPackage.PROJECT_MEDIA__PROJECT_MEDIA_TYPE:
				setProjectMediaType(PROJECT_MEDIA_TYPE_EDEFAULT);
				return;
			case ppsrmetamodelPackage.PROJECT_MEDIA__PROJECT_MEDIA_FILE:
				setProjectMediaFile(PROJECT_MEDIA_FILE_EDEFAULT);
				return;
			case ppsrmetamodelPackage.PROJECT_MEDIA__PROJECT_MEDIA_CREDIT:
				setProjectMediaCredit(PROJECT_MEDIA_CREDIT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ppsrmetamodelPackage.PROJECT_MEDIA__PROJECT_MEDIA_TYPE:
				return PROJECT_MEDIA_TYPE_EDEFAULT == null ? projectMediaType != null : !PROJECT_MEDIA_TYPE_EDEFAULT.equals(projectMediaType);
			case ppsrmetamodelPackage.PROJECT_MEDIA__PROJECT_MEDIA_FILE:
				return PROJECT_MEDIA_FILE_EDEFAULT == null ? projectMediaFile != null : !PROJECT_MEDIA_FILE_EDEFAULT.equals(projectMediaFile);
			case ppsrmetamodelPackage.PROJECT_MEDIA__PROJECT_MEDIA_CREDIT:
				return PROJECT_MEDIA_CREDIT_EDEFAULT == null ? projectMediaCredit != null : !PROJECT_MEDIA_CREDIT_EDEFAULT.equals(projectMediaCredit);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (projectMediaType: ");
		result.append(projectMediaType);
		result.append(", projectMediaFile: ");
		result.append(projectMediaFile);
		result.append(", projectMediaCredit: ");
		result.append(projectMediaCredit);
		result.append(')');
		return result.toString();
	}

} //ProjectMediaImpl
