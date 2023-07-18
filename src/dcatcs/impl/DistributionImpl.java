/**
 */
package dcatcs.impl;

import dcatcs.DataDistributionService;
import dcatcs.DcatcsPackage;
import dcatcs.Distribution;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Distribution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dcatcs.impl.DistributionImpl#getDatadistributionservice <em>Datadistributionservice</em>}</li>
 *   <li>{@link dcatcs.impl.DistributionImpl#getAccessURL <em>Access URL</em>}</li>
 *   <li>{@link dcatcs.impl.DistributionImpl#getByteSize <em>Byte Size</em>}</li>
 *   <li>{@link dcatcs.impl.DistributionImpl#getDownloadURL <em>Download URL</em>}</li>
 *   <li>{@link dcatcs.impl.DistributionImpl#getMediaType <em>Media Type</em>}</li>
 *   <li>{@link dcatcs.impl.DistributionImpl#getConformsTo <em>Conforms To</em>}</li>
 *   <li>{@link dcatcs.impl.DistributionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link dcatcs.impl.DistributionImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link dcatcs.impl.DistributionImpl#getIssued <em>Issued</em>}</li>
 *   <li>{@link dcatcs.impl.DistributionImpl#getLicense <em>License</em>}</li>
 *   <li>{@link dcatcs.impl.DistributionImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link dcatcs.impl.DistributionImpl#getRights <em>Rights</em>}</li>
 *   <li>{@link dcatcs.impl.DistributionImpl#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DistributionImpl extends EObjectImpl implements Distribution {
	/**
	 * The cached value of the '{@link #getDatadistributionservice() <em>Datadistributionservice</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatadistributionservice()
	 * @generated
	 * @ordered
	 */
	protected EList<DataDistributionService> datadistributionservice;

	/**
	 * The default value of the '{@link #getAccessURL() <em>Access URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessURL()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESS_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessURL() <em>Access URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessURL()
	 * @generated
	 * @ordered
	 */
	protected String accessURL = ACCESS_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getByteSize() <em>Byte Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByteSize()
	 * @generated
	 * @ordered
	 */
	protected static final float BYTE_SIZE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getByteSize() <em>Byte Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByteSize()
	 * @generated
	 * @ordered
	 */
	protected float byteSize = BYTE_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDownloadURL() <em>Download URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDownloadURL()
	 * @generated
	 * @ordered
	 */
	protected static final String DOWNLOAD_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDownloadURL() <em>Download URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDownloadURL()
	 * @generated
	 * @ordered
	 */
	protected String downloadURL = DOWNLOAD_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMediaType() <em>Media Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediaType()
	 * @generated
	 * @ordered
	 */
	protected static final String MEDIA_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMediaType() <em>Media Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediaType()
	 * @generated
	 * @ordered
	 */
	protected String mediaType = MEDIA_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getConformsTo() <em>Conforms To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConformsTo()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFORMS_TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConformsTo() <em>Conforms To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConformsTo()
	 * @generated
	 * @ordered
	 */
	protected String conformsTo = CONFORMS_TO_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected String format = FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getIssued() <em>Issued</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssued()
	 * @generated
	 * @ordered
	 */
	protected static final Date ISSUED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIssued() <em>Issued</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssued()
	 * @generated
	 * @ordered
	 */
	protected Date issued = ISSUED_EDEFAULT;

	/**
	 * The default value of the '{@link #getLicense() <em>License</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicense()
	 * @generated
	 * @ordered
	 */
	protected static final String LICENSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLicense() <em>License</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicense()
	 * @generated
	 * @ordered
	 */
	protected String license = LICENSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getModified() <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModified()
	 * @generated
	 * @ordered
	 */
	protected static final Date MODIFIED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModified() <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModified()
	 * @generated
	 * @ordered
	 */
	protected Date modified = MODIFIED_EDEFAULT;

	/**
	 * The default value of the '{@link #getRights() <em>Rights</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRights()
	 * @generated
	 * @ordered
	 */
	protected static final String RIGHTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRights() <em>Rights</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRights()
	 * @generated
	 * @ordered
	 */
	protected String rights = RIGHTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DistributionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DcatcsPackage.Literals.DISTRIBUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataDistributionService> getDatadistributionservice() {
		if (datadistributionservice == null) {
			datadistributionservice = new EObjectContainmentEList<DataDistributionService>(DataDistributionService.class, this, DcatcsPackage.DISTRIBUTION__DATADISTRIBUTIONSERVICE);
		}
		return datadistributionservice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAccessURL() {
		return accessURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessURL(String newAccessURL) {
		String oldAccessURL = accessURL;
		accessURL = newAccessURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatcsPackage.DISTRIBUTION__ACCESS_URL, oldAccessURL, accessURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getByteSize() {
		return byteSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setByteSize(float newByteSize) {
		float oldByteSize = byteSize;
		byteSize = newByteSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatcsPackage.DISTRIBUTION__BYTE_SIZE, oldByteSize, byteSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDownloadURL() {
		return downloadURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDownloadURL(String newDownloadURL) {
		String oldDownloadURL = downloadURL;
		downloadURL = newDownloadURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatcsPackage.DISTRIBUTION__DOWNLOAD_URL, oldDownloadURL, downloadURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMediaType() {
		return mediaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMediaType(String newMediaType) {
		String oldMediaType = mediaType;
		mediaType = newMediaType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatcsPackage.DISTRIBUTION__MEDIA_TYPE, oldMediaType, mediaType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConformsTo() {
		return conformsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConformsTo(String newConformsTo) {
		String oldConformsTo = conformsTo;
		conformsTo = newConformsTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatcsPackage.DISTRIBUTION__CONFORMS_TO, oldConformsTo, conformsTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatcsPackage.DISTRIBUTION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFormat() {
		return format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFormat(String newFormat) {
		String oldFormat = format;
		format = newFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatcsPackage.DISTRIBUTION__FORMAT, oldFormat, format));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getIssued() {
		return issued;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIssued(Date newIssued) {
		Date oldIssued = issued;
		issued = newIssued;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatcsPackage.DISTRIBUTION__ISSUED, oldIssued, issued));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLicense() {
		return license;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLicense(String newLicense) {
		String oldLicense = license;
		license = newLicense;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatcsPackage.DISTRIBUTION__LICENSE, oldLicense, license));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getModified() {
		return modified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModified(Date newModified) {
		Date oldModified = modified;
		modified = newModified;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatcsPackage.DISTRIBUTION__MODIFIED, oldModified, modified));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRights() {
		return rights;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRights(String newRights) {
		String oldRights = rights;
		rights = newRights;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatcsPackage.DISTRIBUTION__RIGHTS, oldRights, rights));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatcsPackage.DISTRIBUTION__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DcatcsPackage.DISTRIBUTION__DATADISTRIBUTIONSERVICE:
				return ((InternalEList<?>)getDatadistributionservice()).basicRemove(otherEnd, msgs);
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
			case DcatcsPackage.DISTRIBUTION__DATADISTRIBUTIONSERVICE:
				return getDatadistributionservice();
			case DcatcsPackage.DISTRIBUTION__ACCESS_URL:
				return getAccessURL();
			case DcatcsPackage.DISTRIBUTION__BYTE_SIZE:
				return getByteSize();
			case DcatcsPackage.DISTRIBUTION__DOWNLOAD_URL:
				return getDownloadURL();
			case DcatcsPackage.DISTRIBUTION__MEDIA_TYPE:
				return getMediaType();
			case DcatcsPackage.DISTRIBUTION__CONFORMS_TO:
				return getConformsTo();
			case DcatcsPackage.DISTRIBUTION__DESCRIPTION:
				return getDescription();
			case DcatcsPackage.DISTRIBUTION__FORMAT:
				return getFormat();
			case DcatcsPackage.DISTRIBUTION__ISSUED:
				return getIssued();
			case DcatcsPackage.DISTRIBUTION__LICENSE:
				return getLicense();
			case DcatcsPackage.DISTRIBUTION__MODIFIED:
				return getModified();
			case DcatcsPackage.DISTRIBUTION__RIGHTS:
				return getRights();
			case DcatcsPackage.DISTRIBUTION__TITLE:
				return getTitle();
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
			case DcatcsPackage.DISTRIBUTION__DATADISTRIBUTIONSERVICE:
				getDatadistributionservice().clear();
				getDatadistributionservice().addAll((Collection<? extends DataDistributionService>)newValue);
				return;
			case DcatcsPackage.DISTRIBUTION__ACCESS_URL:
				setAccessURL((String)newValue);
				return;
			case DcatcsPackage.DISTRIBUTION__BYTE_SIZE:
				setByteSize((Float)newValue);
				return;
			case DcatcsPackage.DISTRIBUTION__DOWNLOAD_URL:
				setDownloadURL((String)newValue);
				return;
			case DcatcsPackage.DISTRIBUTION__MEDIA_TYPE:
				setMediaType((String)newValue);
				return;
			case DcatcsPackage.DISTRIBUTION__CONFORMS_TO:
				setConformsTo((String)newValue);
				return;
			case DcatcsPackage.DISTRIBUTION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case DcatcsPackage.DISTRIBUTION__FORMAT:
				setFormat((String)newValue);
				return;
			case DcatcsPackage.DISTRIBUTION__ISSUED:
				setIssued((Date)newValue);
				return;
			case DcatcsPackage.DISTRIBUTION__LICENSE:
				setLicense((String)newValue);
				return;
			case DcatcsPackage.DISTRIBUTION__MODIFIED:
				setModified((Date)newValue);
				return;
			case DcatcsPackage.DISTRIBUTION__RIGHTS:
				setRights((String)newValue);
				return;
			case DcatcsPackage.DISTRIBUTION__TITLE:
				setTitle((String)newValue);
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
			case DcatcsPackage.DISTRIBUTION__DATADISTRIBUTIONSERVICE:
				getDatadistributionservice().clear();
				return;
			case DcatcsPackage.DISTRIBUTION__ACCESS_URL:
				setAccessURL(ACCESS_URL_EDEFAULT);
				return;
			case DcatcsPackage.DISTRIBUTION__BYTE_SIZE:
				setByteSize(BYTE_SIZE_EDEFAULT);
				return;
			case DcatcsPackage.DISTRIBUTION__DOWNLOAD_URL:
				setDownloadURL(DOWNLOAD_URL_EDEFAULT);
				return;
			case DcatcsPackage.DISTRIBUTION__MEDIA_TYPE:
				setMediaType(MEDIA_TYPE_EDEFAULT);
				return;
			case DcatcsPackage.DISTRIBUTION__CONFORMS_TO:
				setConformsTo(CONFORMS_TO_EDEFAULT);
				return;
			case DcatcsPackage.DISTRIBUTION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case DcatcsPackage.DISTRIBUTION__FORMAT:
				setFormat(FORMAT_EDEFAULT);
				return;
			case DcatcsPackage.DISTRIBUTION__ISSUED:
				setIssued(ISSUED_EDEFAULT);
				return;
			case DcatcsPackage.DISTRIBUTION__LICENSE:
				setLicense(LICENSE_EDEFAULT);
				return;
			case DcatcsPackage.DISTRIBUTION__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
				return;
			case DcatcsPackage.DISTRIBUTION__RIGHTS:
				setRights(RIGHTS_EDEFAULT);
				return;
			case DcatcsPackage.DISTRIBUTION__TITLE:
				setTitle(TITLE_EDEFAULT);
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
			case DcatcsPackage.DISTRIBUTION__DATADISTRIBUTIONSERVICE:
				return datadistributionservice != null && !datadistributionservice.isEmpty();
			case DcatcsPackage.DISTRIBUTION__ACCESS_URL:
				return ACCESS_URL_EDEFAULT == null ? accessURL != null : !ACCESS_URL_EDEFAULT.equals(accessURL);
			case DcatcsPackage.DISTRIBUTION__BYTE_SIZE:
				return byteSize != BYTE_SIZE_EDEFAULT;
			case DcatcsPackage.DISTRIBUTION__DOWNLOAD_URL:
				return DOWNLOAD_URL_EDEFAULT == null ? downloadURL != null : !DOWNLOAD_URL_EDEFAULT.equals(downloadURL);
			case DcatcsPackage.DISTRIBUTION__MEDIA_TYPE:
				return MEDIA_TYPE_EDEFAULT == null ? mediaType != null : !MEDIA_TYPE_EDEFAULT.equals(mediaType);
			case DcatcsPackage.DISTRIBUTION__CONFORMS_TO:
				return CONFORMS_TO_EDEFAULT == null ? conformsTo != null : !CONFORMS_TO_EDEFAULT.equals(conformsTo);
			case DcatcsPackage.DISTRIBUTION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case DcatcsPackage.DISTRIBUTION__FORMAT:
				return FORMAT_EDEFAULT == null ? format != null : !FORMAT_EDEFAULT.equals(format);
			case DcatcsPackage.DISTRIBUTION__ISSUED:
				return ISSUED_EDEFAULT == null ? issued != null : !ISSUED_EDEFAULT.equals(issued);
			case DcatcsPackage.DISTRIBUTION__LICENSE:
				return LICENSE_EDEFAULT == null ? license != null : !LICENSE_EDEFAULT.equals(license);
			case DcatcsPackage.DISTRIBUTION__MODIFIED:
				return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
			case DcatcsPackage.DISTRIBUTION__RIGHTS:
				return RIGHTS_EDEFAULT == null ? rights != null : !RIGHTS_EDEFAULT.equals(rights);
			case DcatcsPackage.DISTRIBUTION__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
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
		result.append(" (accessURL: ");
		result.append(accessURL);
		result.append(", byteSize: ");
		result.append(byteSize);
		result.append(", downloadURL: ");
		result.append(downloadURL);
		result.append(", mediaType: ");
		result.append(mediaType);
		result.append(", conformsTo: ");
		result.append(conformsTo);
		result.append(", description: ");
		result.append(description);
		result.append(", format: ");
		result.append(format);
		result.append(", issued: ");
		result.append(issued);
		result.append(", license: ");
		result.append(license);
		result.append(", modified: ");
		result.append(modified);
		result.append(", rights: ");
		result.append(rights);
		result.append(", title: ");
		result.append(title);
		result.append(')');
		return result.toString();
	}

} //DistributionImpl
