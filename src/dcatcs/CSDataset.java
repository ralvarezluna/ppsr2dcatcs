/**
 */
package dcatcs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CS Dataset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dcatcs.CSDataset#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link dcatcs.CSDataset#getBibliographicCitation <em>Bibliographic Citation</em>}</li>
 *   <li>{@link dcatcs.CSDataset#getMethodType <em>Method Type</em>}</li>
 *   <li>{@link dcatcs.CSDataset#getMethodSpecification <em>Method Specification</em>}</li>
 *   <li>{@link dcatcs.CSDataset#getHasHypothesis <em>Has Hypothesis</em>}</li>
 *   <li>{@link dcatcs.CSDataset#getHasInstrument <em>Has Instrument</em>}</li>
 *   <li>{@link dcatcs.CSDataset#getDataQualityAssuranceMethod <em>Data Quality Assurance Method</em>}</li>
 *   <li>{@link dcatcs.CSDataset#getDataManagementPlan <em>Data Management Plan</em>}</li>
 * </ul>
 *
 * @see dcatcs.DcatcsPackage#getCSDataset()
 * @model
 * @generated
 */
public interface CSDataset extends Dataset {
	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(String)
	 * @see dcatcs.DcatcsPackage#getCSDataset_Abstract()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getAbstract();

	/**
	 * Sets the value of the '{@link dcatcs.CSDataset#getAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #getAbstract()
	 * @generated
	 */
	void setAbstract(String value);

	/**
	 * Returns the value of the '<em><b>Bibliographic Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bibliographic Citation</em>' attribute.
	 * @see #isSetBibliographicCitation()
	 * @see #unsetBibliographicCitation()
	 * @see #setBibliographicCitation(String)
	 * @see dcatcs.DcatcsPackage#getCSDataset_BibliographicCitation()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	String getBibliographicCitation();

	/**
	 * Sets the value of the '{@link dcatcs.CSDataset#getBibliographicCitation <em>Bibliographic Citation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bibliographic Citation</em>' attribute.
	 * @see #isSetBibliographicCitation()
	 * @see #unsetBibliographicCitation()
	 * @see #getBibliographicCitation()
	 * @generated
	 */
	void setBibliographicCitation(String value);

	/**
	 * Unsets the value of the '{@link dcatcs.CSDataset#getBibliographicCitation <em>Bibliographic Citation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBibliographicCitation()
	 * @see #getBibliographicCitation()
	 * @see #setBibliographicCitation(String)
	 * @generated
	 */
	void unsetBibliographicCitation();

	/**
	 * Returns whether the value of the '{@link dcatcs.CSDataset#getBibliographicCitation <em>Bibliographic Citation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bibliographic Citation</em>' attribute is set.
	 * @see #unsetBibliographicCitation()
	 * @see #getBibliographicCitation()
	 * @see #setBibliographicCitation(String)
	 * @generated
	 */
	boolean isSetBibliographicCitation();

	/**
	 * Returns the value of the '<em><b>Method Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Type</em>' attribute.
	 * @see #isSetMethodType()
	 * @see #unsetMethodType()
	 * @see #setMethodType(String)
	 * @see dcatcs.DcatcsPackage#getCSDataset_MethodType()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	String getMethodType();

	/**
	 * Sets the value of the '{@link dcatcs.CSDataset#getMethodType <em>Method Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Type</em>' attribute.
	 * @see #isSetMethodType()
	 * @see #unsetMethodType()
	 * @see #getMethodType()
	 * @generated
	 */
	void setMethodType(String value);

	/**
	 * Unsets the value of the '{@link dcatcs.CSDataset#getMethodType <em>Method Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMethodType()
	 * @see #getMethodType()
	 * @see #setMethodType(String)
	 * @generated
	 */
	void unsetMethodType();

	/**
	 * Returns whether the value of the '{@link dcatcs.CSDataset#getMethodType <em>Method Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Method Type</em>' attribute is set.
	 * @see #unsetMethodType()
	 * @see #getMethodType()
	 * @see #setMethodType(String)
	 * @generated
	 */
	boolean isSetMethodType();

	/**
	 * Returns the value of the '<em><b>Method Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Specification</em>' attribute.
	 * @see #isSetMethodSpecification()
	 * @see #unsetMethodSpecification()
	 * @see #setMethodSpecification(Object)
	 * @see dcatcs.DcatcsPackage#getCSDataset_MethodSpecification()
	 * @model unsettable="true"
	 * @generated
	 */
	Object getMethodSpecification();

	/**
	 * Sets the value of the '{@link dcatcs.CSDataset#getMethodSpecification <em>Method Specification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Specification</em>' attribute.
	 * @see #isSetMethodSpecification()
	 * @see #unsetMethodSpecification()
	 * @see #getMethodSpecification()
	 * @generated
	 */
	void setMethodSpecification(Object value);

	/**
	 * Unsets the value of the '{@link dcatcs.CSDataset#getMethodSpecification <em>Method Specification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMethodSpecification()
	 * @see #getMethodSpecification()
	 * @see #setMethodSpecification(Object)
	 * @generated
	 */
	void unsetMethodSpecification();

	/**
	 * Returns whether the value of the '{@link dcatcs.CSDataset#getMethodSpecification <em>Method Specification</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Method Specification</em>' attribute is set.
	 * @see #unsetMethodSpecification()
	 * @see #getMethodSpecification()
	 * @see #setMethodSpecification(Object)
	 * @generated
	 */
	boolean isSetMethodSpecification();

	/**
	 * Returns the value of the '<em><b>Has Hypothesis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Hypothesis</em>' attribute.
	 * @see #isSetHasHypothesis()
	 * @see #unsetHasHypothesis()
	 * @see #setHasHypothesis(String)
	 * @see dcatcs.DcatcsPackage#getCSDataset_HasHypothesis()
	 * @model unique="false" unsettable="true" ordered="false"
	 * @generated
	 */
	String getHasHypothesis();

	/**
	 * Sets the value of the '{@link dcatcs.CSDataset#getHasHypothesis <em>Has Hypothesis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Hypothesis</em>' attribute.
	 * @see #isSetHasHypothesis()
	 * @see #unsetHasHypothesis()
	 * @see #getHasHypothesis()
	 * @generated
	 */
	void setHasHypothesis(String value);

	/**
	 * Unsets the value of the '{@link dcatcs.CSDataset#getHasHypothesis <em>Has Hypothesis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHasHypothesis()
	 * @see #getHasHypothesis()
	 * @see #setHasHypothesis(String)
	 * @generated
	 */
	void unsetHasHypothesis();

	/**
	 * Returns whether the value of the '{@link dcatcs.CSDataset#getHasHypothesis <em>Has Hypothesis</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Has Hypothesis</em>' attribute is set.
	 * @see #unsetHasHypothesis()
	 * @see #getHasHypothesis()
	 * @see #setHasHypothesis(String)
	 * @generated
	 */
	boolean isSetHasHypothesis();

	/**
	 * Returns the value of the '<em><b>Has Instrument</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Instrument</em>' attribute.
	 * @see #isSetHasInstrument()
	 * @see #unsetHasInstrument()
	 * @see #setHasInstrument(String)
	 * @see dcatcs.DcatcsPackage#getCSDataset_HasInstrument()
	 * @model unique="false" unsettable="true" ordered="false"
	 * @generated
	 */
	String getHasInstrument();

	/**
	 * Sets the value of the '{@link dcatcs.CSDataset#getHasInstrument <em>Has Instrument</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Instrument</em>' attribute.
	 * @see #isSetHasInstrument()
	 * @see #unsetHasInstrument()
	 * @see #getHasInstrument()
	 * @generated
	 */
	void setHasInstrument(String value);

	/**
	 * Unsets the value of the '{@link dcatcs.CSDataset#getHasInstrument <em>Has Instrument</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHasInstrument()
	 * @see #getHasInstrument()
	 * @see #setHasInstrument(String)
	 * @generated
	 */
	void unsetHasInstrument();

	/**
	 * Returns whether the value of the '{@link dcatcs.CSDataset#getHasInstrument <em>Has Instrument</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Has Instrument</em>' attribute is set.
	 * @see #unsetHasInstrument()
	 * @see #getHasInstrument()
	 * @see #setHasInstrument(String)
	 * @generated
	 */
	boolean isSetHasInstrument();

	/**
	 * Returns the value of the '<em><b>Data Quality Assurance Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Quality Assurance Method</em>' attribute.
	 * @see #setDataQualityAssuranceMethod(String)
	 * @see dcatcs.DcatcsPackage#getCSDataset_DataQualityAssuranceMethod()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getDataQualityAssuranceMethod();

	/**
	 * Sets the value of the '{@link dcatcs.CSDataset#getDataQualityAssuranceMethod <em>Data Quality Assurance Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Quality Assurance Method</em>' attribute.
	 * @see #getDataQualityAssuranceMethod()
	 * @generated
	 */
	void setDataQualityAssuranceMethod(String value);

	/**
	 * Returns the value of the '<em><b>Data Management Plan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Management Plan</em>' attribute.
	 * @see #setDataManagementPlan(String)
	 * @see dcatcs.DcatcsPackage#getCSDataset_DataManagementPlan()
	 * @model
	 * @generated
	 */
	String getDataManagementPlan();

	/**
	 * Sets the value of the '{@link dcatcs.CSDataset#getDataManagementPlan <em>Data Management Plan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Management Plan</em>' attribute.
	 * @see #getDataManagementPlan()
	 * @generated
	 */
	void setDataManagementPlan(String value);

} // CSDataset
