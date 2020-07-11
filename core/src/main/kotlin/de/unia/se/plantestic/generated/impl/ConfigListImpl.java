/**
 */
package de.unia.se.plantestic.generated.impl;

import de.unia.se.plantestic.generated.AsyncRequestConfig;
import de.unia.se.plantestic.generated.ConfigList;
import de.unia.se.plantestic.generated.ConfigmetamodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Config List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link configmetamodel.impl.ConfigListImpl#getAsyncConfig <em>Async Config</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigListImpl extends MinimalEObjectImpl.Container implements ConfigList {
	/**
	 * The cached value of the '{@link #getAsyncConfig() <em>Async Config</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsyncConfig()
	 * @generated
	 * @ordered
	 */
	protected EList<AsyncRequestConfig> asyncConfig;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigmetamodelPackage.Literals.CONFIG_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AsyncRequestConfig> getAsyncConfig() {
		if (asyncConfig == null) {
			asyncConfig = new EObjectResolvingEList<AsyncRequestConfig>(AsyncRequestConfig.class, this, ConfigmetamodelPackage.CONFIG_LIST__ASYNC_CONFIG);
		}
		return asyncConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigmetamodelPackage.CONFIG_LIST__ASYNC_CONFIG:
				return getAsyncConfig();
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
			case ConfigmetamodelPackage.CONFIG_LIST__ASYNC_CONFIG:
				getAsyncConfig().clear();
				getAsyncConfig().addAll((Collection<? extends AsyncRequestConfig>)newValue);
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
			case ConfigmetamodelPackage.CONFIG_LIST__ASYNC_CONFIG:
				getAsyncConfig().clear();
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
			case ConfigmetamodelPackage.CONFIG_LIST__ASYNC_CONFIG:
				return asyncConfig != null && !asyncConfig.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConfigListImpl
