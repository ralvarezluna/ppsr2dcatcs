/**
 */
package ppsr_coremetamodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ppsr_coremetamodel.CSProject;
import ppsr_coremetamodel.ProgramOrCampaign;
import ppsr_coremetamodel.ppsrmetamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program Or Campaign</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ppsr_coremetamodel.impl.ProgramOrCampaignImpl#getProgramId <em>Program Id</em>}</li>
 *   <li>{@link ppsr_coremetamodel.impl.ProgramOrCampaignImpl#getProgramName <em>Program Name</em>}</li>
 *   <li>{@link ppsr_coremetamodel.impl.ProgramOrCampaignImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link ppsr_coremetamodel.impl.ProgramOrCampaignImpl#getCsproject <em>Csproject</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramOrCampaignImpl extends EObjectImpl implements ProgramOrCampaign {
	/**
	 * The default value of the '{@link #getProgramId() <em>Program Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramId()
	 * @generated
	 * @ordered
	 */
	protected static final String PROGRAM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProgramId() <em>Program Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramId()
	 * @generated
	 * @ordered
	 */
	protected String programId = PROGRAM_ID_EDEFAULT;

	/**
	 * This is true if the Program Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean programIdESet;

	/**
	 * The default value of the '{@link #getProgramName() <em>Program Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROGRAM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProgramName() <em>Program Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramName()
	 * @generated
	 * @ordered
	 */
	protected String programName = PROGRAM_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected String language = LANGUAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCsproject() <em>Csproject</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsproject()
	 * @generated
	 * @ordered
	 */
	protected EList<CSProject> csproject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramOrCampaignImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ppsrmetamodelPackage.Literals.PROGRAM_OR_CAMPAIGN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProgramId() {
		return programId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProgramId(String newProgramId) {
		String oldProgramId = programId;
		programId = newProgramId;
		boolean oldProgramIdESet = programIdESet;
		programIdESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ppsrmetamodelPackage.PROGRAM_OR_CAMPAIGN__PROGRAM_ID, oldProgramId, programId, !oldProgramIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetProgramId() {
		String oldProgramId = programId;
		boolean oldProgramIdESet = programIdESet;
		programId = PROGRAM_ID_EDEFAULT;
		programIdESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ppsrmetamodelPackage.PROGRAM_OR_CAMPAIGN__PROGRAM_ID, oldProgramId, PROGRAM_ID_EDEFAULT, oldProgramIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetProgramId() {
		return programIdESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProgramName() {
		return programName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProgramName(String newProgramName) {
		String oldProgramName = programName;
		programName = newProgramName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ppsrmetamodelPackage.PROGRAM_OR_CAMPAIGN__PROGRAM_NAME, oldProgramName, programName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLanguage(String newLanguage) {
		String oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ppsrmetamodelPackage.PROGRAM_OR_CAMPAIGN__LANGUAGE, oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CSProject> getCsproject() {
		if (csproject == null) {
			csproject = new EObjectContainmentEList<CSProject>(CSProject.class, this, ppsrmetamodelPackage.PROGRAM_OR_CAMPAIGN__CSPROJECT);
		}
		return csproject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ppsrmetamodelPackage.PROGRAM_OR_CAMPAIGN__CSPROJECT:
				return ((InternalEList<?>)getCsproject()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ppsrmetamodelPackage.PROGRAM_OR_CAMPAIGN__PROGRAM_ID:
				return getProgramId();
			case ppsrmetamodelPackage.PROGRAM_OR_CAMPAIGN__PROGRAM_NAME:
				return getProgramName();
			case ppsrmetamodelPackage.PROGRAM_OR_CAMPAIGN__LANGUAGE:
				return getLanguage();
			case ppsrmetamodelPackage.PROGRAM_OR_CAMPAIGN__CSPROJECT:
				return getCsproject();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ppsrmetamodelPackage.PROGRAM_OR_CAMPAIGN__PROGRAM_ID:
				setProgramId((String)newValue);
				return;
			case ppsrmetamodelPackage.PROGRAM_OR_CAMPAIGN__PROGRAM_NAME:
				setProgramName((String)newValue);
				return;
			case ppsrmetamodelPackage.PROGRAM_OR_CAMPAIGN__LANGUAGE:
				setLanguage((String)newValue);
				return;
			case ppsrmetamodelPackage.PROGRAM_OR_CAMPAIGN__CSPROJECT:
				getCsproject().clear();
				getCsproject().addAll((Collection<? extends CSProject>)newValue);
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
			case ppsrmetamodelPackage.PROGRAM_OR_CAMPAIGN__PROGRAM_ID:
				unsetProgramId();
				return;
			case ppsrmetamodelPackage.PROGRAM_OR_CAMPAIGN__PROGRAM_NAME:
				setProgramName(PROGRAM_NAME_EDEFAULT);
				return;
			case ppsrmetamodelPackage.PROGRAM_OR_CAMPAIGN__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case ppsrmetamodelPackage.PROGRAM_OR_CAMPAIGN__CSPROJECT:
				getCsproject().clear();
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
			case ppsrmetamodelPackage.PROGRAM_OR_CAMPAIGN__PROGRAM_ID:
				return isSetProgramId();
			case ppsrmetamodelPackage.PROGRAM_OR_CAMPAIGN__PROGRAM_NAME:
				return PROGRAM_NAME_EDEFAULT == null ? programName != null : !PROGRAM_NAME_EDEFAULT.equals(programName);
			case ppsrmetamodelPackage.PROGRAM_OR_CAMPAIGN__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
			case ppsrmetamodelPackage.PROGRAM_OR_CAMPAIGN__CSPROJECT:
				return csproject != null && !csproject.isEmpty();
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
		result.append(" (programId: ");
		if (programIdESet) result.append(programId); else result.append("<unset>");
		result.append(", programName: ");
		result.append(programName);
		result.append(", language: ");
		result.append(language);
		result.append(')');
		return result.toString();
	}

} //ProgramOrCampaignImpl
