/**
 */
package Configmetamodel.impl;

import Configmetamodel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfigmetamodelFactoryImpl extends EFactoryImpl implements ConfigmetamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConfigmetamodelFactory init() {
		try {
			ConfigmetamodelFactory theConfigmetamodelFactory = (ConfigmetamodelFactory)EPackage.Registry.INSTANCE.getEFactory(ConfigmetamodelPackage.eNS_URI);
			if (theConfigmetamodelFactory != null) {
				return theConfigmetamodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ConfigmetamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigmetamodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ConfigmetamodelPackage.CONFIG_LIST: return (EObject)createConfigList();
			case ConfigmetamodelPackage.ASYNC_REQUEST_CONFIG: return (EObject)createAsyncRequestConfig();
			case ConfigmetamodelPackage.REQUEST_PARAMETER: return (EObject)createRequestParameter();
			case ConfigmetamodelPackage.RESPONSE_PARAMETER: return (EObject)createResponseParameter();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfigListImpl createConfigList() {
		ConfigListImpl configList = new ConfigListImpl();
		return configList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AsyncRequestConfigImpl createAsyncRequestConfig() {
		AsyncRequestConfigImpl asyncRequestConfig = new AsyncRequestConfigImpl();
		return asyncRequestConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequestParameterImpl createRequestParameter() {
		RequestParameterImpl requestParameter = new RequestParameterImpl();
		return requestParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResponseParameterImpl createResponseParameter() {
		ResponseParameterImpl responseParameter = new ResponseParameterImpl();
		return responseParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfigmetamodelPackage getConfigmetamodelPackage() {
		return (ConfigmetamodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ConfigmetamodelPackage getPackage() {
		return ConfigmetamodelPackage.eINSTANCE;
	}

} //ConfigmetamodelFactoryImpl
