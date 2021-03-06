/**
 */
package de.unia.se.plantestic.generated;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.unia.se.plantestic.generated.ConfigmetamodelFactory
 * @model kind="package"
 * @generated
 */
public interface ConfigmetamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Configmetamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/Configmetamodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Configmetamodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConfigmetamodelPackage eINSTANCE = de.unia.se.plantestic.generated.impl.ConfigmetamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link Configmetamodel.impl.ConfigListImpl <em>Config List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Configmetamodel.impl.ConfigListImpl
	 * @see Configmetamodel.impl.ConfigmetamodelPackageImpl#getConfigList()
	 * @generated
	 */
	int CONFIG_LIST = 0;

	/**
	 * The feature id for the '<em><b>Async Config</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_LIST__ASYNC_CONFIG = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_LIST__NAME = 1;

	/**
	 * The number of structural features of the '<em>Config List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_LIST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Config List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Configmetamodel.impl.AsyncRequestConfigImpl <em>Async Request Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Configmetamodel.impl.AsyncRequestConfigImpl
	 * @see Configmetamodel.impl.ConfigmetamodelPackageImpl#getAsyncRequestConfig()
	 * @generated
	 */
	int ASYNC_REQUEST_CONFIG = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNC_REQUEST_CONFIG__ID = 0;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNC_REQUEST_CONFIG__TIMEOUT = 1;

	/**
	 * The feature id for the '<em><b>Request Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNC_REQUEST_CONFIG__REQUEST_METHOD = 2;

	/**
	 * The feature id for the '<em><b>Request URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNC_REQUEST_CONFIG__REQUEST_URL = 3;

	/**
	 * The feature id for the '<em><b>Response Status Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNC_REQUEST_CONFIG__RESPONSE_STATUS_CODE = 4;

	/**
	 * The feature id for the '<em><b>Request Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNC_REQUEST_CONFIG__REQUEST_PARAMETER = 5;

	/**
	 * The feature id for the '<em><b>Response Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNC_REQUEST_CONFIG__RESPONSE_PARAMETER = 6;

	/**
	 * The number of structural features of the '<em>Async Request Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNC_REQUEST_CONFIG_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Async Request Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNC_REQUEST_CONFIG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Configmetamodel.impl.RequestParameterImpl <em>Request Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Configmetamodel.impl.RequestParameterImpl
	 * @see Configmetamodel.impl.ConfigmetamodelPackageImpl#getRequestParameter()
	 * @generated
	 */
	int REQUEST_PARAMETER = 2;

	/**
	 * The feature id for the '<em><b>Request Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_PARAMETER__REQUEST_VARIABLE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_PARAMETER__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Request Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Request Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Configmetamodel.impl.ResponseParameterImpl <em>Response Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Configmetamodel.impl.ResponseParameterImpl
	 * @see Configmetamodel.impl.ConfigmetamodelPackageImpl#getResponseParameter()
	 * @generated
	 */
	int RESPONSE_PARAMETER = 3;

	/**
	 * The feature id for the '<em><b>Response Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_PARAMETER__RESPONSE_VARIABLE_NAME = 0;

	/**
	 * The feature id for the '<em><b>XPath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_PARAMETER__XPATH = 1;

	/**
	 * The number of structural features of the '<em>Response Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Response Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_PARAMETER_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link Configmetamodel.ConfigList <em>Config List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config List</em>'.
	 * @see Configmetamodel.ConfigList
	 * @generated
	 */
	EClass getConfigList();

	/**
	 * Returns the meta object for the containment reference list '{@link Configmetamodel.ConfigList#getAsyncConfig <em>Async Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Async Config</em>'.
	 * @see Configmetamodel.ConfigList#getAsyncConfig()
	 * @see #getConfigList()
	 * @generated
	 */
	EReference getConfigList_AsyncConfig();

	/**
	 * Returns the meta object for the attribute '{@link Configmetamodel.ConfigList#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Configmetamodel.ConfigList#getName()
	 * @see #getConfigList()
	 * @generated
	 */
	EAttribute getConfigList_Name();

	/**
	 * Returns the meta object for class '{@link Configmetamodel.AsyncRequestConfig <em>Async Request Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Async Request Config</em>'.
	 * @see Configmetamodel.AsyncRequestConfig
	 * @generated
	 */
	EClass getAsyncRequestConfig();

	/**
	 * Returns the meta object for the attribute '{@link Configmetamodel.AsyncRequestConfig#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Configmetamodel.AsyncRequestConfig#getId()
	 * @see #getAsyncRequestConfig()
	 * @generated
	 */
	EAttribute getAsyncRequestConfig_Id();

	/**
	 * Returns the meta object for the attribute '{@link Configmetamodel.AsyncRequestConfig#getTimeout <em>Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timeout</em>'.
	 * @see Configmetamodel.AsyncRequestConfig#getTimeout()
	 * @see #getAsyncRequestConfig()
	 * @generated
	 */
	EAttribute getAsyncRequestConfig_Timeout();

	/**
	 * Returns the meta object for the attribute '{@link Configmetamodel.AsyncRequestConfig#getRequestMethod <em>Request Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Request Method</em>'.
	 * @see Configmetamodel.AsyncRequestConfig#getRequestMethod()
	 * @see #getAsyncRequestConfig()
	 * @generated
	 */
	EAttribute getAsyncRequestConfig_RequestMethod();

	/**
	 * Returns the meta object for the attribute '{@link Configmetamodel.AsyncRequestConfig#getRequestURL <em>Request URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Request URL</em>'.
	 * @see Configmetamodel.AsyncRequestConfig#getRequestURL()
	 * @see #getAsyncRequestConfig()
	 * @generated
	 */
	EAttribute getAsyncRequestConfig_RequestURL();

	/**
	 * Returns the meta object for the attribute '{@link Configmetamodel.AsyncRequestConfig#getResponseStatusCode <em>Response Status Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Response Status Code</em>'.
	 * @see Configmetamodel.AsyncRequestConfig#getResponseStatusCode()
	 * @see #getAsyncRequestConfig()
	 * @generated
	 */
	EAttribute getAsyncRequestConfig_ResponseStatusCode();

	/**
	 * Returns the meta object for the containment reference list '{@link Configmetamodel.AsyncRequestConfig#getRequestParameter <em>Request Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Request Parameter</em>'.
	 * @see Configmetamodel.AsyncRequestConfig#getRequestParameter()
	 * @see #getAsyncRequestConfig()
	 * @generated
	 */
	EReference getAsyncRequestConfig_RequestParameter();

	/**
	 * Returns the meta object for the containment reference list '{@link Configmetamodel.AsyncRequestConfig#getResponseParameter <em>Response Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Response Parameter</em>'.
	 * @see Configmetamodel.AsyncRequestConfig#getResponseParameter()
	 * @see #getAsyncRequestConfig()
	 * @generated
	 */
	EReference getAsyncRequestConfig_ResponseParameter();

	/**
	 * Returns the meta object for class '{@link Configmetamodel.RequestParameter <em>Request Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request Parameter</em>'.
	 * @see Configmetamodel.RequestParameter
	 * @generated
	 */
	EClass getRequestParameter();

	/**
	 * Returns the meta object for the attribute '{@link Configmetamodel.RequestParameter#getRequestVariableName <em>Request Variable Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Request Variable Name</em>'.
	 * @see Configmetamodel.RequestParameter#getRequestVariableName()
	 * @see #getRequestParameter()
	 * @generated
	 */
	EAttribute getRequestParameter_RequestVariableName();

	/**
	 * Returns the meta object for the attribute '{@link Configmetamodel.RequestParameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see Configmetamodel.RequestParameter#getValue()
	 * @see #getRequestParameter()
	 * @generated
	 */
	EAttribute getRequestParameter_Value();

	/**
	 * Returns the meta object for class '{@link Configmetamodel.ResponseParameter <em>Response Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response Parameter</em>'.
	 * @see Configmetamodel.ResponseParameter
	 * @generated
	 */
	EClass getResponseParameter();

	/**
	 * Returns the meta object for the attribute '{@link Configmetamodel.ResponseParameter#getResponseVariableName <em>Response Variable Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Response Variable Name</em>'.
	 * @see Configmetamodel.ResponseParameter#getResponseVariableName()
	 * @see #getResponseParameter()
	 * @generated
	 */
	EAttribute getResponseParameter_ResponseVariableName();

	/**
	 * Returns the meta object for the attribute '{@link Configmetamodel.ResponseParameter#getXPath <em>XPath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XPath</em>'.
	 * @see Configmetamodel.ResponseParameter#getXPath()
	 * @see #getResponseParameter()
	 * @generated
	 */
	EAttribute getResponseParameter_XPath();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConfigmetamodelFactory getConfigmetamodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Configmetamodel.impl.ConfigListImpl <em>Config List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Configmetamodel.impl.ConfigListImpl
		 * @see Configmetamodel.impl.ConfigmetamodelPackageImpl#getConfigList()
		 * @generated
		 */
		EClass CONFIG_LIST = eINSTANCE.getConfigList();

		/**
		 * The meta object literal for the '<em><b>Async Config</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIG_LIST__ASYNC_CONFIG = eINSTANCE.getConfigList_AsyncConfig();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG_LIST__NAME = eINSTANCE.getConfigList_Name();

		/**
		 * The meta object literal for the '{@link Configmetamodel.impl.AsyncRequestConfigImpl <em>Async Request Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Configmetamodel.impl.AsyncRequestConfigImpl
		 * @see Configmetamodel.impl.ConfigmetamodelPackageImpl#getAsyncRequestConfig()
		 * @generated
		 */
		EClass ASYNC_REQUEST_CONFIG = eINSTANCE.getAsyncRequestConfig();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASYNC_REQUEST_CONFIG__ID = eINSTANCE.getAsyncRequestConfig_Id();

		/**
		 * The meta object literal for the '<em><b>Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASYNC_REQUEST_CONFIG__TIMEOUT = eINSTANCE.getAsyncRequestConfig_Timeout();

		/**
		 * The meta object literal for the '<em><b>Request Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASYNC_REQUEST_CONFIG__REQUEST_METHOD = eINSTANCE.getAsyncRequestConfig_RequestMethod();

		/**
		 * The meta object literal for the '<em><b>Request URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASYNC_REQUEST_CONFIG__REQUEST_URL = eINSTANCE.getAsyncRequestConfig_RequestURL();

		/**
		 * The meta object literal for the '<em><b>Response Status Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASYNC_REQUEST_CONFIG__RESPONSE_STATUS_CODE = eINSTANCE.getAsyncRequestConfig_ResponseStatusCode();

		/**
		 * The meta object literal for the '<em><b>Request Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASYNC_REQUEST_CONFIG__REQUEST_PARAMETER = eINSTANCE.getAsyncRequestConfig_RequestParameter();

		/**
		 * The meta object literal for the '<em><b>Response Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASYNC_REQUEST_CONFIG__RESPONSE_PARAMETER = eINSTANCE.getAsyncRequestConfig_ResponseParameter();

		/**
		 * The meta object literal for the '{@link Configmetamodel.impl.RequestParameterImpl <em>Request Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Configmetamodel.impl.RequestParameterImpl
		 * @see Configmetamodel.impl.ConfigmetamodelPackageImpl#getRequestParameter()
		 * @generated
		 */
		EClass REQUEST_PARAMETER = eINSTANCE.getRequestParameter();

		/**
		 * The meta object literal for the '<em><b>Request Variable Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST_PARAMETER__REQUEST_VARIABLE_NAME = eINSTANCE.getRequestParameter_RequestVariableName();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST_PARAMETER__VALUE = eINSTANCE.getRequestParameter_Value();

		/**
		 * The meta object literal for the '{@link Configmetamodel.impl.ResponseParameterImpl <em>Response Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Configmetamodel.impl.ResponseParameterImpl
		 * @see Configmetamodel.impl.ConfigmetamodelPackageImpl#getResponseParameter()
		 * @generated
		 */
		EClass RESPONSE_PARAMETER = eINSTANCE.getResponseParameter();

		/**
		 * The meta object literal for the '<em><b>Response Variable Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_PARAMETER__RESPONSE_VARIABLE_NAME = eINSTANCE.getResponseParameter_ResponseVariableName();

		/**
		 * The meta object literal for the '<em><b>XPath</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_PARAMETER__XPATH = eINSTANCE.getResponseParameter_XPath();

	}

} //ConfigmetamodelPackage
