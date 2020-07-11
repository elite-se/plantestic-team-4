/**
 */
package de.unia.se.plantestic.generated.impl;

import de.unia.se.plantestic.generated.AsyncRequestConfig;
import de.unia.se.plantestic.generated.ConfigList;
import de.unia.se.plantestic.generated.ConfigmetamodelFactory;
import de.unia.se.plantestic.generated.ConfigmetamodelPackage;
import de.unia.se.plantestic.generated.RequestParameter;
import de.unia.se.plantestic.generated.ResponseParameter;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfigmetamodelPackageImpl extends EPackageImpl implements ConfigmetamodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass asyncRequestConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseParameterEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.unia.se.plantestic.generated.configmetamodel.ConfigmetamodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConfigmetamodelPackageImpl() {
		super(eNS_URI, ConfigmetamodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ConfigmetamodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ConfigmetamodelPackage init() {
		if (isInited) return (ConfigmetamodelPackage)EPackage.Registry.INSTANCE.getEPackage(ConfigmetamodelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredConfigmetamodelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ConfigmetamodelPackageImpl theConfigmetamodelPackage = registeredConfigmetamodelPackage instanceof ConfigmetamodelPackageImpl ? (ConfigmetamodelPackageImpl)registeredConfigmetamodelPackage : new ConfigmetamodelPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theConfigmetamodelPackage.createPackageContents();

		// Initialize created meta-data
		theConfigmetamodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theConfigmetamodelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ConfigmetamodelPackage.eNS_URI, theConfigmetamodelPackage);
		return theConfigmetamodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConfigList() {
		return configListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConfigList_AsyncConfig() {
		return (EReference)configListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAsyncRequestConfig() {
		return asyncRequestConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAsyncRequestConfig_Id() {
		return (EAttribute)asyncRequestConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAsyncRequestConfig_Timeout() {
		return (EAttribute)asyncRequestConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAsyncRequestConfig_RequestMethod() {
		return (EAttribute)asyncRequestConfigEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAsyncRequestConfig_RequestURL() {
		return (EAttribute)asyncRequestConfigEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAsyncRequestConfig_ResponseStatusCode() {
		return (EAttribute)asyncRequestConfigEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAsyncRequestConfig_RequestParameter() {
		return (EReference)asyncRequestConfigEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAsyncRequestConfig_ResponseParameter() {
		return (EReference)asyncRequestConfigEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequestParameter() {
		return requestParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequestParameter_RequestVariableName() {
		return (EAttribute)requestParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequestParameter_Value() {
		return (EAttribute)requestParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResponseParameter() {
		return responseParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResponseParameter_ResponseVariableName() {
		return (EAttribute)responseParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResponseParameter_XPath() {
		return (EAttribute)responseParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfigmetamodelFactory getConfigmetamodelFactory() {
		return (ConfigmetamodelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		configListEClass = createEClass(CONFIG_LIST);
		createEReference(configListEClass, CONFIG_LIST__ASYNC_CONFIG);

		asyncRequestConfigEClass = createEClass(ASYNC_REQUEST_CONFIG);
		createEAttribute(asyncRequestConfigEClass, ASYNC_REQUEST_CONFIG__ID);
		createEAttribute(asyncRequestConfigEClass, ASYNC_REQUEST_CONFIG__TIMEOUT);
		createEAttribute(asyncRequestConfigEClass, ASYNC_REQUEST_CONFIG__REQUEST_METHOD);
		createEAttribute(asyncRequestConfigEClass, ASYNC_REQUEST_CONFIG__REQUEST_URL);
		createEAttribute(asyncRequestConfigEClass, ASYNC_REQUEST_CONFIG__RESPONSE_STATUS_CODE);
		createEReference(asyncRequestConfigEClass, ASYNC_REQUEST_CONFIG__REQUEST_PARAMETER);
		createEReference(asyncRequestConfigEClass, ASYNC_REQUEST_CONFIG__RESPONSE_PARAMETER);

		requestParameterEClass = createEClass(REQUEST_PARAMETER);
		createEAttribute(requestParameterEClass, REQUEST_PARAMETER__REQUEST_VARIABLE_NAME);
		createEAttribute(requestParameterEClass, REQUEST_PARAMETER__VALUE);

		responseParameterEClass = createEClass(RESPONSE_PARAMETER);
		createEAttribute(responseParameterEClass, RESPONSE_PARAMETER__RESPONSE_VARIABLE_NAME);
		createEAttribute(responseParameterEClass, RESPONSE_PARAMETER__XPATH);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(configListEClass, ConfigList.class, "ConfigList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfigList_AsyncConfig(), this.getAsyncRequestConfig(), null, "asyncConfig", null, 0, -1, ConfigList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(asyncRequestConfigEClass, AsyncRequestConfig.class, "AsyncRequestConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAsyncRequestConfig_Id(), ecorePackage.getEString(), "id", null, 0, 1, AsyncRequestConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAsyncRequestConfig_Timeout(), ecorePackage.getEInt(), "timeout", null, 0, 1, AsyncRequestConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAsyncRequestConfig_RequestMethod(), ecorePackage.getEString(), "requestMethod", null, 0, 1, AsyncRequestConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAsyncRequestConfig_RequestURL(), ecorePackage.getEString(), "requestURL", null, 0, 1, AsyncRequestConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAsyncRequestConfig_ResponseStatusCode(), ecorePackage.getEString(), "responseStatusCode", null, 0, 1, AsyncRequestConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAsyncRequestConfig_RequestParameter(), this.getRequestParameter(), null, "requestParameter", null, 0, -1, AsyncRequestConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAsyncRequestConfig_ResponseParameter(), this.getResponseParameter(), null, "responseParameter", null, 0, -1, AsyncRequestConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requestParameterEClass, RequestParameter.class, "RequestParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequestParameter_RequestVariableName(), ecorePackage.getEString(), "requestVariableName", null, 0, 1, RequestParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequestParameter_Value(), ecorePackage.getEString(), "value", null, 0, 1, RequestParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(responseParameterEClass, ResponseParameter.class, "ResponseParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResponseParameter_ResponseVariableName(), ecorePackage.getEString(), "responseVariableName", null, 0, 1, ResponseParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResponseParameter_XPath(), ecorePackage.getEString(), "xPath", null, 0, 1, ResponseParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ConfigmetamodelPackageImpl
