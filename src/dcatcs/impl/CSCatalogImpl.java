/**
 */
package dcatcs.impl;

import dcatcs.CSCatalog;
import dcatcs.CSProject;
import dcatcs.DcatcsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CS Catalog</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dcatcs.impl.CSCatalogImpl#getCsproject <em>Csproject</em>}</li>
 *   <li>{@link dcatcs.impl.CSCatalogImpl#getProgramOrCampaign <em>Program Or Campaign</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CSCatalogImpl extends CatalogImpl implements CSCatalog {
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
	 * The default value of the '{@link #getProgramOrCampaign() <em>Program Or Campaign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramOrCampaign()
	 * @generated
	 * @ordered
	 */
	protected static final String PROGRAM_OR_CAMPAIGN_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getProgramOrCampaign() <em>Program Or Campaign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramOrCampaign()
	 * @generated
	 * @ordered
	 */
	protected String programOrCampaign = PROGRAM_OR_CAMPAIGN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CSCatalogImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DcatcsPackage.Literals.CS_CATALOG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CSProject> getCsproject() {
		if (csproject == null) {
			csproject = new EObjectContainmentEList<CSProject>(CSProject.class, this, DcatcsPackage.CS_CATALOG__CSPROJECT);
		}
		return csproject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProgramOrCampaign() {
		return programOrCampaign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProgramOrCampaign(String newProgramOrCampaign) {
		String oldProgramOrCampaign = programOrCampaign;
		programOrCampaign = newProgramOrCampaign;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatcsPackage.CS_CATALOG__PROGRAM_OR_CAMPAIGN, oldProgramOrCampaign, programOrCampaign));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DcatcsPackage.CS_CATALOG__CSPROJECT:
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
			case DcatcsPackage.CS_CATALOG__CSPROJECT:
				return getCsproject();
			case DcatcsPackage.CS_CATALOG__PROGRAM_OR_CAMPAIGN:
				return getProgramOrCampaign();
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
			case DcatcsPackage.CS_CATALOG__CSPROJECT:
				getCsproject().clear();
				getCsproject().addAll((Collection<? extends CSProject>)newValue);
				return;
			case DcatcsPackage.CS_CATALOG__PROGRAM_OR_CAMPAIGN:
				setProgramOrCampaign((String)newValue);
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
			case DcatcsPackage.CS_CATALOG__CSPROJECT:
				getCsproject().clear();
				return;
			case DcatcsPackage.CS_CATALOG__PROGRAM_OR_CAMPAIGN:
				setProgramOrCampaign(PROGRAM_OR_CAMPAIGN_EDEFAULT);
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
			case DcatcsPackage.CS_CATALOG__CSPROJECT:
				return csproject != null && !csproject.isEmpty();
			case DcatcsPackage.CS_CATALOG__PROGRAM_OR_CAMPAIGN:
				return PROGRAM_OR_CAMPAIGN_EDEFAULT == null ? programOrCampaign != null : !PROGRAM_OR_CAMPAIGN_EDEFAULT.equals(programOrCampaign);
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
		result.append(" (programOrCampaign: ");
		result.append(programOrCampaign);
		result.append(')');
		return result.toString();
	}

} //CSCatalogImpl
