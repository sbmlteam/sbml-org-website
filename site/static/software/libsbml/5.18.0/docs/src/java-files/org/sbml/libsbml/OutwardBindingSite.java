/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.sbml.libsbml;

/** 
 * <span class="pkg-marker pkg-color-multi"><a href="group__multi.html">multi</a></span>
 Defines a outward-facing binding site for a {@link MultiSpeciesType}.
 <p>
 * The {@link OutwardBindingSite} object is a child of a {@link Species} (via the
 * {@link MultiSpeciesPlugin}).  It has two optional attributes, 'id' and 'name', and
 * two required attributes, 'bindingStatus' and 'component'. A binding site
 * not involved in any {@link InSpeciesTypeBond} object in the {@link MultiSpeciesType}
 * referenced by a {@link Species} is an {@link OutwardBindingSite}. The bindingStatus
 * attribute is of type {@link BindingStatus_t}.  The component attribute,
 * of type SIdRef, references a component which ultimately references a
 * {@link BindingSiteSpeciesType} object. The attribute value must be the identifier
 * of a {@link SpeciesTypeInstance}, {@link SpeciesTypeComponentIndex} or {@link MultiSpeciesType}
 * object. An {@link OutwardBindingSite} cannot be a binding site referenced by any
 * {@link InSpeciesTypeBond} in the species. There are three scenarios for the
 * component attribute to have the value of an identifier of
 * {@link MultiSpeciesType}, {@link SpeciesTypeInstance}, or {@link SpeciesTypeComponentIndex}
 * respectively:
 * <ul>
 * <li> When a {@link Species} references a simple {@link BindingSiteSpeciesType}, the value
 * of the component attribute of the {@link OutwardBindingSite} of the {@link Species} can
 * only be the id of the referenced {@link MultiSpeciesType}.
 * <li> When a {@link Species} references a {@link MultiSpeciesType} with a
 * {@link SpeciesTypeInstance} being a binding site (have an id of
 * {@link BindingSiteSpeciesType} as its 'speciesType' attribute) and the id of the
 * {@link SpeciesTypeInstance} can identify the binding site within the
 * {@link MultiSpeciesType} (referenced by the {@link Species}) unambiguously, and therefore,
 * the value of the component attribute of an {@link OutwardBindingSite} of the
 * species can be the id of the {@link SpeciesTypeInstance}.
 * <li> When a {@link Species} references a {@link MultiSpeciesType} with a
 * {@link SpeciesTypeInstance} being a binding site (directly or indirectly) and id of
 * the {@link SpeciesTypeInstance} can NOT identify the binding site without
 * ambiguity, an id of {@link SpeciesTypeComponentIndex} can be used as the value of
 * the component attribute of an {@link OutwardBindingSite} of the {@link Species}.
 * </ul>
 */

public class OutwardBindingSite extends SBase {
   private long swigCPtr;

   protected OutwardBindingSite(long cPtr, boolean cMemoryOwn)
   {
     super(libsbmlJNI.OutwardBindingSite_SWIGUpcast(cPtr), cMemoryOwn);
     swigCPtr = cPtr;
   }

   protected static long getCPtr(OutwardBindingSite obj)
   {
     return (obj == null) ? 0 : obj.swigCPtr;
   }

   protected static long getCPtrAndDisown (OutwardBindingSite obj)
   {
     long ptr = 0;

     if (obj != null)
     {
       ptr             = obj.swigCPtr;
       obj.swigCMemOwn = false;
     }

     return ptr;
   }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libsbmlJNI.delete_OutwardBindingSite(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  
/**
   * Creates a new {@link OutwardBindingSite} object.
   <p>
   * @param level the SBML Level.
   * @param version the Version within the SBML Level.
   * @param pkgVersion the version of the package.
   <p>
   * <p>
 * @note Attempting to add an object to an {@link SBMLDocument} having a different
 * combination of SBML Level, Version and XML namespaces than the object
 * itself will result in an error at the time a caller attempts to make the
 * addition.  A parent object must have compatible Level, Version and XML
 * namespaces.  (Strictly speaking, a parent may also have more XML
 * namespaces than a child, but the reverse is not permitted.)  The
 * restriction is necessary to ensure that an SBML model has a consistent
 * overall structure.  This requires callers to manage their objects
 * carefully, but the benefit is increased flexibility in how models can be
 * created by permitting callers to create objects bottom-up if desired.  In
 * situations where objects are not yet attached to parents (e.g.,
 * {@link SBMLDocument}), knowledge of the intented SBML Level and Version help
 * libSBML determine such things as whether it is valid to assign a
 * particular value to an attribute.  For packages, this means that the 
 * parent object to which this package element is being added must have
 * been created with the package namespace, or that the package namespace
 * was added to it, even if that parent is not a package object itself.
   */ public
 OutwardBindingSite(long level, long version, long pkgVersion) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_OutwardBindingSite__SWIG_0(level, version, pkgVersion), true);
  }

  
/**
   * Creates a new {@link OutwardBindingSite} object.
   <p>
   * @param level the SBML Level.
   * @param version the Version within the SBML Level.
   * @param pkgVersion the version of the package.
   <p>
   * <p>
 * @note Attempting to add an object to an {@link SBMLDocument} having a different
 * combination of SBML Level, Version and XML namespaces than the object
 * itself will result in an error at the time a caller attempts to make the
 * addition.  A parent object must have compatible Level, Version and XML
 * namespaces.  (Strictly speaking, a parent may also have more XML
 * namespaces than a child, but the reverse is not permitted.)  The
 * restriction is necessary to ensure that an SBML model has a consistent
 * overall structure.  This requires callers to manage their objects
 * carefully, but the benefit is increased flexibility in how models can be
 * created by permitting callers to create objects bottom-up if desired.  In
 * situations where objects are not yet attached to parents (e.g.,
 * {@link SBMLDocument}), knowledge of the intented SBML Level and Version help
 * libSBML determine such things as whether it is valid to assign a
 * particular value to an attribute.  For packages, this means that the 
 * parent object to which this package element is being added must have
 * been created with the package namespace, or that the package namespace
 * was added to it, even if that parent is not a package object itself.
   */ public
 OutwardBindingSite(long level, long version) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_OutwardBindingSite__SWIG_1(level, version), true);
  }

  
/**
   * Creates a new {@link OutwardBindingSite} object.
   <p>
   * @param level the SBML Level.
   * @param version the Version within the SBML Level.
   * @param pkgVersion the version of the package.
   <p>
   * <p>
 * @note Attempting to add an object to an {@link SBMLDocument} having a different
 * combination of SBML Level, Version and XML namespaces than the object
 * itself will result in an error at the time a caller attempts to make the
 * addition.  A parent object must have compatible Level, Version and XML
 * namespaces.  (Strictly speaking, a parent may also have more XML
 * namespaces than a child, but the reverse is not permitted.)  The
 * restriction is necessary to ensure that an SBML model has a consistent
 * overall structure.  This requires callers to manage their objects
 * carefully, but the benefit is increased flexibility in how models can be
 * created by permitting callers to create objects bottom-up if desired.  In
 * situations where objects are not yet attached to parents (e.g.,
 * {@link SBMLDocument}), knowledge of the intented SBML Level and Version help
 * libSBML determine such things as whether it is valid to assign a
 * particular value to an attribute.  For packages, this means that the 
 * parent object to which this package element is being added must have
 * been created with the package namespace, or that the package namespace
 * was added to it, even if that parent is not a package object itself.
   */ public
 OutwardBindingSite(long level) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_OutwardBindingSite__SWIG_2(level), true);
  }

  
/**
   * Creates a new {@link OutwardBindingSite} object.
   <p>
   * @param level the SBML Level.
   * @param version the Version within the SBML Level.
   * @param pkgVersion the version of the package.
   <p>
   * <p>
 * @note Attempting to add an object to an {@link SBMLDocument} having a different
 * combination of SBML Level, Version and XML namespaces than the object
 * itself will result in an error at the time a caller attempts to make the
 * addition.  A parent object must have compatible Level, Version and XML
 * namespaces.  (Strictly speaking, a parent may also have more XML
 * namespaces than a child, but the reverse is not permitted.)  The
 * restriction is necessary to ensure that an SBML model has a consistent
 * overall structure.  This requires callers to manage their objects
 * carefully, but the benefit is increased flexibility in how models can be
 * created by permitting callers to create objects bottom-up if desired.  In
 * situations where objects are not yet attached to parents (e.g.,
 * {@link SBMLDocument}), knowledge of the intented SBML Level and Version help
 * libSBML determine such things as whether it is valid to assign a
 * particular value to an attribute.  For packages, this means that the 
 * parent object to which this package element is being added must have
 * been created with the package namespace, or that the package namespace
 * was added to it, even if that parent is not a package object itself.
   */ public
 OutwardBindingSite() throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_OutwardBindingSite__SWIG_3(), true);
  }

  
/**
   * Creates a new {@link OutwardBindingSite} with the given {@link MultiPkgNamespaces}
   * object.
   <p>
   * @param multins the {@link MultiPkgNamespaces} object
   */ public
 OutwardBindingSite(MultiPkgNamespaces multins) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_OutwardBindingSite__SWIG_4(MultiPkgNamespaces.getCPtr(multins), multins), true);
  }

  
/**
   * Copy constructor for {@link OutwardBindingSite}.
   <p>
   * @param orig the {@link OutwardBindingSite} instance to copy.
   */ public
 OutwardBindingSite(OutwardBindingSite orig) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_OutwardBindingSite__SWIG_5(OutwardBindingSite.getCPtr(orig), orig), true);
  }

  
/**
   * Creates and returns a deep copy of this {@link OutwardBindingSite} object.
   <p>
   * @return a (deep) copy of this {@link OutwardBindingSite} object.
   */ public
 OutwardBindingSite cloneObject() {
    long cPtr = libsbmlJNI.OutwardBindingSite_cloneObject(swigCPtr, this);
    return (cPtr == 0) ? null : new OutwardBindingSite(cPtr, true);
  }

  
/**
   * Returns the value of the 'id' attribute of this {@link OutwardBindingSite}.
   <p>
   * @return the value of the 'id' attribute of this {@link OutwardBindingSite} as a string.
   */ public
 String getId() {
    return libsbmlJNI.OutwardBindingSite_getId(swigCPtr, this);
  }

  
/**
   * Returns <code>true</code> if this {@link OutwardBindingSite}'s 'id' attribute has been
   * set.
   <p>
   * @return <code>true</code> if this {@link OutwardBindingSite}'s 'id' attribute has been
   * set, otherwise <code>false</code> is returned.
   */ public
 boolean isSetId() {
    return libsbmlJNI.OutwardBindingSite_isSetId(swigCPtr, this);
  }

  
/**
   * Sets the value of the 'id' attribute of this {@link OutwardBindingSite}.
   <p>
   * @param id String value of the 'id' attribute to be set
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   The possible values
 * returned by this function are:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * <li> {@link libsbmlConstants#LIBSBML_INVALID_ATTRIBUTE_VALUE LIBSBML_INVALID_ATTRIBUTE_VALUE}
   * </ul>
   */ public
 int setId(String id) {
    return libsbmlJNI.OutwardBindingSite_setId(swigCPtr, this, id);
  }

  
/**
   * Unsets the value of the 'id' attribute of this {@link OutwardBindingSite}.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   The possible values
 * returned by this function are:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_FAILED LIBSBML_OPERATION_FAILED}
   * </ul>
   */ public
 int unsetId() {
    return libsbmlJNI.OutwardBindingSite_unsetId(swigCPtr, this);
  }

  
/**
   * Returns the value of the 'name' attribute of this {@link OutwardBindingSite}.
   <p>
   * @return the value of the 'name' attribute of this {@link OutwardBindingSite} as
   * a string.
   */ public
 String getName() {
    return libsbmlJNI.OutwardBindingSite_getName(swigCPtr, this);
  }

  
/**
   * Returns <code>true</code> if this {@link OutwardBindingSite}'s 'name' attribute has been
   * set.
   <p>
   * @return <code>true</code> if this {@link OutwardBindingSite}'s 'name' attribute has been set,
   * otherwise <code>false</code> is returned.
   */ public
 boolean isSetName() {
    return libsbmlJNI.OutwardBindingSite_isSetName(swigCPtr, this);
  }

  
/**
   * Sets the value of the 'name' attribute of this {@link OutwardBindingSite}.
   <p>
   * @param name String value of the 'name' attribute to be set
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   The possible values
 * returned by this function are:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * <li> {@link libsbmlConstants#LIBSBML_INVALID_ATTRIBUTE_VALUE LIBSBML_INVALID_ATTRIBUTE_VALUE}
   * </ul>
   */ public
 int setName(String name) {
    return libsbmlJNI.OutwardBindingSite_setName(swigCPtr, this, name);
  }

  
/**
   * Unsets the value of the 'name' attribute of this {@link OutwardBindingSite}.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   The possible values
 * returned by this function are:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_FAILED LIBSBML_OPERATION_FAILED}
   * </ul>
   */ public
 int unsetName() {
    return libsbmlJNI.OutwardBindingSite_unsetName(swigCPtr, this);
  }

  
/**
   * Returns the value of the 'bindingStatus' attribute of this
   * {@link OutwardBindingSite}.
   <p>
   * @return the value of the 'bindingStatus' attribute of this
   * {@link OutwardBindingSite}.
   */ public
 int getBindingStatus() {
    return libsbmlJNI.OutwardBindingSite_getBindingStatus(swigCPtr, this);
  }

  
/**
   * Returns <code>true</code> if this {@link OutwardBindingSite}'s 'bindingStatus' attribute
   * has been set.
   <p>
   * @return <code>true</code> if this {@link OutwardBindingSite}'s 'bindingStatus' attribute
   * has been set, otherwise <code>false</code> is returned.
   */ public
 boolean isSetBindingStatus() {
    return libsbmlJNI.OutwardBindingSite_isSetBindingStatus(swigCPtr, this);
  }

  
/**
   * Sets the value of the 'bindingStatus' attribute of this
   * {@link OutwardBindingSite}.
   <p>
   * @param bindingStatus the new value of the 'bindingStatus' attribute.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   The possible values
 * returned by this function are:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * <li> {@link libsbmlConstants#LIBSBML_INVALID_ATTRIBUTE_VALUE LIBSBML_INVALID_ATTRIBUTE_VALUE}
   * </ul>
   */ public
 int setBindingStatus(int bindingStatus) {
    return libsbmlJNI.OutwardBindingSite_setBindingStatus__SWIG_0(swigCPtr, this, bindingStatus);
  }

  
/**
   * Sets the value of the 'bindingStatus' attribute of this
   * {@link OutwardBindingSite}.
   <p>
   * @param bindingStatus String& of the 'bindingStatus' attribute to be
   * set.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   The possible values
 * returned by this function are:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * <li> {@link libsbmlConstants#LIBSBML_INVALID_ATTRIBUTE_VALUE LIBSBML_INVALID_ATTRIBUTE_VALUE}
   *
   * </ul> <p>
   * <p>
 * The attribute 'bindingStatus' on a {@link OutwardBindingSite} object is used to
 * describe the status of the binding site.
 <p>
 * In the SBML
 * Level&nbsp;3 Version&nbsp;1 Multi specification, the following are the
 * allowable values for 'bindingStatus':
 * <ul>
 * <li> <code>'bound'</code>, the binding site is bound.
 <p>
 * <li> <code>'unbound'</code>, the binding site is not bound.
 <p>
 * <li> <code>'either'</code>, the binding site may either be bound or unbound.
 <p>
 * </ul>
   */ public
 int setBindingStatus(String bindingStatus) {
    return libsbmlJNI.OutwardBindingSite_setBindingStatus__SWIG_1(swigCPtr, this, bindingStatus);
  }

  
/**
   * Unsets the value of the 'bindingStatus' attribute of this
   * {@link OutwardBindingSite}.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   The possible values
 * returned by this function are:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_FAILED LIBSBML_OPERATION_FAILED}
   * </ul>
   */ public
 int unsetBindingStatus() {
    return libsbmlJNI.OutwardBindingSite_unsetBindingStatus(swigCPtr, this);
  }

  
/**
   * Returns the value of the 'component' attribute of this
   * {@link OutwardBindingSite}.
   <p>
   * @return the value of the 'component' attribute of this
   * {@link OutwardBindingSite} as a string.
   */ public
 String getComponent() {
    return libsbmlJNI.OutwardBindingSite_getComponent(swigCPtr, this);
  }

  
/**
   * Returns <code>true</code> if this {@link OutwardBindingSite}'s 'component' attribute has
   * been set.
   <p>
   * @return <code>true</code> if this {@link OutwardBindingSite}'s 'component' attribute has
   * been set; otherwise, <code>false</code> is returned.
   */ public
 boolean isSetComponent() {
    return libsbmlJNI.OutwardBindingSite_isSetComponent(swigCPtr, this);
  }

  
/**
   * Sets the value of the 'component' attribute of this {@link OutwardBindingSite}.
   <p>
   * @param component String value of the 'component' attribute to be set
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   The possible values
 * returned by this function are:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * <li> {@link libsbmlConstants#LIBSBML_INVALID_ATTRIBUTE_VALUE LIBSBML_INVALID_ATTRIBUTE_VALUE}
   * </ul>
   */ public
 int setComponent(String component) {
    return libsbmlJNI.OutwardBindingSite_setComponent(swigCPtr, this, component);
  }

  
/**
   * Unsets the value of the 'component' attribute of this {@link OutwardBindingSite}.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   The possible values
 * returned by this function are:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_FAILED LIBSBML_OPERATION_FAILED}
   * </ul>
   */ public
 int unsetComponent() {
    return libsbmlJNI.OutwardBindingSite_unsetComponent(swigCPtr, this);
  }

  
/**
   * Renames all the <code>SIdRef</code> attributes on this element, including any
   * found in MathML content (if such exists).
   <p>
   * This method works by looking at all attributes and (if appropriate)
   * mathematical formulas, comparing the identifiers to the value of 
   * <code>oldid</code>.  If any matches are found, the matching identifiers are replaced
   * with <code>newid</code>.  The method does <em>not</em> descend into child elements.
   <p>
   * @param oldid the old identifier
   * @param newid the new identifier
   */ public
 void renameSIdRefs(String oldid, String newid) {
    libsbmlJNI.OutwardBindingSite_renameSIdRefs(swigCPtr, this, oldid, newid);
  }

  
/**
   * Returns the XML element name of this object.
   <p>
   * @return the name of this element, i.e. <code>'outwardBindingSite'.</code>
   */ public
 String getElementName() {
    return libsbmlJNI.OutwardBindingSite_getElementName(swigCPtr, this);
  }

  
/**
   * Returns the libSBML type code for this SBML object.
   <p>
   * <p>
 * LibSBML attaches an identifying code to every kind of SBML object.  These
 * are integer constants known as <em>SBML type codes</em>.  The names of all
 * the codes begin with the characters <code>SBML_</code>.
 * In the Java language interface for libSBML, the
 * type codes are defined as static integer constants in the interface class
 * {@link libsbmlConstants}.    Note that different Level&nbsp;3
 * package plug-ins may use overlapping type codes; to identify the package
 * to which a given object belongs, call the 
 * <code>{@link SBase#getPackageName()}
 * </code>
 * method on the object.
 <p>
 * The exception to this is lists:  all SBML-style list elements have the type 
 * {@link libsbmlConstants#SBML_LIST_OF SBML_LIST_OF}, regardless of what package they 
 * are from.
   <p>
   * @return the SBML type code for this object:
   * {@link libsbmlConstants#SBML_MULTI_BINDING_SITE_SPECIES_TYPE SBML_MULTI_BINDING_SITE_SPECIES_TYPE}.
   <p>
   * <p>
 * @warning <span class='warning'>The specific integer values of the possible
 * type codes may be reused by different libSBML plug-ins for SBML Level&nbsp;3.
 * packages,  To fully identify the correct code, <strong>it is necessary to
 * invoke both getPackageName() and getTypeCode()</strong> (or 
 * {@link ListOf#getItemTypeCode()}).</span>
   <p>
   * @see #getElementName()
   * @see #getPackageName()
   */ public
 int getTypeCode() {
    return libsbmlJNI.OutwardBindingSite_getTypeCode(swigCPtr, this);
  }

  
/**
   * Predicate returning <code>true</code> if all the required attributes
   * for this {@link OutwardBindingSite} object have been set.
   <p>
   * @note The required attributes for a {@link OutwardBindingSite} object are:
   * <ul>
   * <li> 'bindingStatus'
   * <li> 'component'
   *
   * </ul> <p>
   * @return a boolean value indicating whether all the required
   * attributes for this object have been defined.
   */ public
 boolean hasRequiredAttributes() {
    return libsbmlJNI.OutwardBindingSite_hasRequiredAttributes(swigCPtr, this);
  }

  
/** * @internal */ public
 void enablePackageInternal(String pkgURI, String pkgPrefix, boolean flag) {
    libsbmlJNI.OutwardBindingSite_enablePackageInternal(swigCPtr, this, pkgURI, pkgPrefix, flag);
  }

}
