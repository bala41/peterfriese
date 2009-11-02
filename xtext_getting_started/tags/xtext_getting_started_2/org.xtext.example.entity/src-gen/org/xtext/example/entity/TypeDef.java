/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.example.entity;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.entity.TypeDef#getMappedType <em>Mapped Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.entity.EntityPackage#getTypeDef()
 * @model
 * @generated
 */
public interface TypeDef extends Type
{
  /**
   * Returns the value of the '<em><b>Mapped Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mapped Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mapped Type</em>' containment reference.
   * @see #setMappedType(JAVAID)
   * @see org.xtext.example.entity.EntityPackage#getTypeDef_MappedType()
   * @model containment="true"
   * @generated
   */
  JAVAID getMappedType();

  /**
   * Sets the value of the '{@link org.xtext.example.entity.TypeDef#getMappedType <em>Mapped Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mapped Type</em>' containment reference.
   * @see #getMappedType()
   * @generated
   */
  void setMappedType(JAVAID value);

} // TypeDef
