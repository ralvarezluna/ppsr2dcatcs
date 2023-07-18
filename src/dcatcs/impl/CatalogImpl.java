/**
 */
package dcatcs.impl;

import dcatcs.Catalog;
import dcatcs.CatalogRecord;
import dcatcs.DataService;
import dcatcs.Dataset;
import dcatcs.DcatcsPackage;
import dcatcs.Resource;

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
 * An implementation of the model object '<em><b>Catalog</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dcatcs.impl.CatalogImpl#getDataset <em>Dataset</em>}</li>
 *   <li>{@link dcatcs.impl.CatalogImpl#getDataservice <em>Dataservice</em>}</li>
 *   <li>{@link dcatcs.impl.CatalogImpl#getCatalog <em>Catalog</em>}</li>
 *   <li>{@link dcatcs.impl.CatalogImpl#getCatalogrecord <em>Catalogrecord</em>}</li>
 *   <li>{@link dcatcs.impl.CatalogImpl#getHomePage <em>Home Page</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CatalogImpl extends DatasetImpl implements Catalog {
	/**
	 * The cached value of the '{@link #getDataset() <em>Dataset</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataset()
	 * @generated
	 * @ordered
	 */
	protected EList<Dataset> dataset;

	/**
	 * The cached value of the '{@link #getDataservice() <em>Dataservice</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataservice()
	 * @generated
	 * @ordered
	 */
	protected DataService dataservice;

	/**
	 * The cached value of the '{@link #getCatalog() <em>Catalog</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatalog()
	 * @generated
	 * @ordered
	 */
	protected EList<Catalog> catalog;

	/**
	 * The cached value of the '{@link #getCatalogrecord() <em>Catalogrecord</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatalogrecord()
	 * @generated
	 * @ordered
	 */
	protected EList<CatalogRecord> catalogrecord;

	/**
	 * The default value of the '{@link #getHomePage() <em>Home Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHomePage()
	 * @generated
	 * @ordered
	 */
	protected static final String HOME_PAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHomePage() <em>Home Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHomePage()
	 * @generated
	 * @ordered
	 */
	protected String homePage = HOME_PAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CatalogImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DcatcsPackage.Literals.CATALOG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Dataset> getDataset() {
		if (dataset == null) {
			dataset = new EObjectContainmentEList<Dataset>(Dataset.class, this, DcatcsPackage.CATALOG__DATASET);
		}
		return dataset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataService getDataservice() {
		if (dataservice != null && dataservice.eIsProxy()) {
			InternalEObject oldDataservice = (InternalEObject)dataservice;
			dataservice = (DataService)eResolveProxy(oldDataservice);
			if (dataservice != oldDataservice) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DcatcsPackage.CATALOG__DATASERVICE, oldDataservice, dataservice));
			}
		}
		return dataservice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataService basicGetDataservice() {
		return dataservice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataservice(DataService newDataservice) {
		DataService oldDataservice = dataservice;
		dataservice = newDataservice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatcsPackage.CATALOG__DATASERVICE, oldDataservice, dataservice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Catalog> getCatalog() {
		if (catalog == null) {
			catalog = new EObjectContainmentEList<Catalog>(Catalog.class, this, DcatcsPackage.CATALOG__CATALOG);
		}
		return catalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CatalogRecord> getCatalogrecord() {
		if (catalogrecord == null) {
			catalogrecord = new EObjectContainmentEList<CatalogRecord>(CatalogRecord.class, this, DcatcsPackage.CATALOG__CATALOGRECORD);
		}
		return catalogrecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHomePage() {
		return homePage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHomePage(String newHomePage) {
		String oldHomePage = homePage;
		homePage = newHomePage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatcsPackage.CATALOG__HOME_PAGE, oldHomePage, homePage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DcatcsPackage.CATALOG__DATASET:
				return ((InternalEList<?>)getDataset()).basicRemove(otherEnd, msgs);
			case DcatcsPackage.CATALOG__CATALOG:
				return ((InternalEList<?>)getCatalog()).basicRemove(otherEnd, msgs);
			case DcatcsPackage.CATALOG__CATALOGRECORD:
				return ((InternalEList<?>)getCatalogrecord()).basicRemove(otherEnd, msgs);
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
			case DcatcsPackage.CATALOG__DATASET:
				return getDataset();
			case DcatcsPackage.CATALOG__DATASERVICE:
				if (resolve) return getDataservice();
				return basicGetDataservice();
			case DcatcsPackage.CATALOG__CATALOG:
				return getCatalog();
			case DcatcsPackage.CATALOG__CATALOGRECORD:
				return getCatalogrecord();
			case DcatcsPackage.CATALOG__HOME_PAGE:
				return getHomePage();
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
			case DcatcsPackage.CATALOG__DATASET:
				getDataset().clear();
				getDataset().addAll((Collection<? extends Dataset>)newValue);
				return;
			case DcatcsPackage.CATALOG__DATASERVICE:
				setDataservice((DataService)newValue);
				return;
			case DcatcsPackage.CATALOG__CATALOG:
				getCatalog().clear();
				getCatalog().addAll((Collection<? extends Catalog>)newValue);
				return;
			case DcatcsPackage.CATALOG__CATALOGRECORD:
				getCatalogrecord().clear();
				getCatalogrecord().addAll((Collection<? extends CatalogRecord>)newValue);
				return;
			case DcatcsPackage.CATALOG__HOME_PAGE:
				setHomePage((String)newValue);
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
			case DcatcsPackage.CATALOG__DATASET:
				getDataset().clear();
				return;
			case DcatcsPackage.CATALOG__DATASERVICE:
				setDataservice((DataService)null);
				return;
			case DcatcsPackage.CATALOG__CATALOG:
				getCatalog().clear();
				return;
			case DcatcsPackage.CATALOG__CATALOGRECORD:
				getCatalogrecord().clear();
				return;
			case DcatcsPackage.CATALOG__HOME_PAGE:
				setHomePage(HOME_PAGE_EDEFAULT);
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
			case DcatcsPackage.CATALOG__DATASET:
				return dataset != null && !dataset.isEmpty();
			case DcatcsPackage.CATALOG__DATASERVICE:
				return dataservice != null;
			case DcatcsPackage.CATALOG__CATALOG:
				return catalog != null && !catalog.isEmpty();
			case DcatcsPackage.CATALOG__CATALOGRECORD:
				return catalogrecord != null && !catalogrecord.isEmpty();
			case DcatcsPackage.CATALOG__HOME_PAGE:
				return HOME_PAGE_EDEFAULT == null ? homePage != null : !HOME_PAGE_EDEFAULT.equals(homePage);
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
		result.append(" (homePage: ");
		result.append(homePage);
		result.append(')');
		return result.toString();
	}

} //CatalogImpl
