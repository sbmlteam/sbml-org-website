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
 Identifies a component within a {@link MultiSpeciesType}.
 <p>
 * The {@link SpeciesTypeComponentIndex} object is a child of {@link MultiSpeciesType}, and
 * provides a way to identify or index a component within that
 * {@link MultiSpeciesType}. A {@link SpeciesTypeComponentIndex} object can be referenced by
 * other class objects, such as {@link InSpeciesTypeBond}, {@link OutwardBindingSite},
 * {@link SpeciesFeature} or {@link SpeciesTypeComponentMapInProduct} objects, which need to
 * identify a component in a particular {@link MultiSpeciesType}.  A
 * {@link SpeciesTypeComponentIndex} should be unambiguous. For example, a
 * {@link SpeciesTypeComponentIndex} should not reference a {@link MultiSpeciesType} which is
 * referenced by two {@link SpeciesTypeInstance} objects contained in the same
 * {@link MultiSpeciesType} object.
 */

public class SpeciesTypeComponentIndex extends SBase {
   private long swigCPtr;

   protected SpeciesTypeComponentIndex(long cPtr, boolean cMemoryOwn)
   {
     super(libsbmlJNI.SpeciesTypeComponentIndex_SWIGUpcast(cPtr), cMemoryOwn);
     swigCPtr = cPtr;
   }

   protected static long getCPtr(SpeciesTypeComponentIndex obj)
   {
     return (obj == null) ? 0 : obj.swigCPtr;
   }

   protected static long getCPtrAndDisown (SpeciesTypeComponentIndex obj)
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
        libsbmlJNI.delete_SpeciesTypeComponentIndex(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  
/**
   * Creates a new {@link SpeciesTypeComponentIndex} object.
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
 SpeciesTypeComponentIndex(long level, long version, long pkgVersion) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_SpeciesTypeComponentIndex__SWIG_0(level, version, pkgVersion), true);
  }

  
/**
   * Creates a new {@link SpeciesTypeComponentIndex} object.
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
 SpeciesTypeComponentIndex(long level, long version) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_SpeciesTypeComponentIndex__SWIG_1(level, version), true);
  }

  
/**
   * Creates a new {@link SpeciesTypeComponentIndex} object.
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
 SpeciesTypeComponentIndex(long level) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_SpeciesTypeComponentIndex__SWIG_2(level), true);
  }

  
/**
   * Creates a new {@link SpeciesTypeComponentIndex} object.
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
 SpeciesTypeComponentIndex() throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_SpeciesTypeComponentIndex__SWIG_3(), true);
  }

  
/**
   * Creates a new {@link SpeciesTypeComponentIndex} with the given
   * {@link MultiPkgNamespaces} object.
   <p>
   * <p>
 * The package namespaces object used in this constructor is derived from a
 * {@link SBMLNamespaces} object, which encapsulates SBML Level/Version/namespaces
 * information.  It is used to communicate the SBML Level, Version, and 
 * package version and name information used in addition to SBML Level&nbsp;3 Core.  A
 * common approach to using libSBML's {@link SBMLNamespaces} facilities is to create an
 * package namespace object somewhere in a program once, then hand that object
 * as needed to object constructors of that package that accept it as and
 * argument, such as this one.
   <p>
   * @param multins the {@link MultiPkgNamespaces} object
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
 SpeciesTypeComponentIndex(MultiPkgNamespaces multins) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_SpeciesTypeComponentIndex__SWIG_4(MultiPkgNamespaces.getCPtr(multins), multins), true);
  }

  
/**
   * Copy constructor for {@link SpeciesTypeComponentIndex}.
   <p>
   * @param orig the {@link SpeciesTypeComponentIndex} instance to copy.
   */ public
 SpeciesTypeComponentIndex(SpeciesTypeComponentIndex orig) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_SpeciesTypeComponentIndex__SWIG_5(SpeciesTypeComponentIndex.getCPtr(orig), orig), true);
  }

  
/**
   * Creates and returns a deep copy of this {@link SpeciesTypeComponentIndex} object.
   <p>
   * @return a (deep) copy of this {@link SpeciesTypeComponentIndex} object.
   */ public
 SpeciesTypeComponentIndex cloneObject() {
    long cPtr = libsbmlJNI.SpeciesTypeComponentIndex_cloneObject(swigCPtr, this);
    return (cPtr == 0) ? null : new SpeciesTypeComponentIndex(cPtr, true);
  }

  
/**
   * Returns the value of the 'id' attribute of this
   * {@link SpeciesTypeComponentIndex}.
   <p>
   * @return the value of the 'id' attribute of this {@link SpeciesTypeComponentIndex} as a string.
   */ public
 String getId() {
    return libsbmlJNI.SpeciesTypeComponentIndex_getId(swigCPtr, this);
  }

  
/**
   * Returns <code>true</code> if this {@link SpeciesTypeComponentIndex}'s 'id' attribute has
   * been set.
   <p>
   * @return <code>true</code> if this {@link SpeciesTypeComponentIndex}'s 'id' attribute has
   * been set; otherwise, <code>false</code> is returned.
   */ public
 boolean isSetId() {
    return libsbmlJNI.SpeciesTypeComponentIndex_isSetId(swigCPtr, this);
  }

  
/**
   * Sets the value of the 'id' attribute of this {@link SpeciesTypeComponentIndex}.
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
    return libsbmlJNI.SpeciesTypeComponentIndex_setId(swigCPtr, this, id);
  }

  
/**
   * Unsets the value of the 'id' attribute of this {@link SpeciesTypeComponentIndex}.
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
    return libsbmlJNI.SpeciesTypeComponentIndex_unsetId(swigCPtr, this);
  }

  
/**
   * Returns the value of the 'name' attribute of this
   * {@link SpeciesTypeComponentIndex}.
   <p>
   * @return the value of the 'name' attribute of this
   * {@link SpeciesTypeComponentIndex} as a string.
   */ public
 String getName() {
    return libsbmlJNI.SpeciesTypeComponentIndex_getName(swigCPtr, this);
  }

  
/**
   * Returns <code>true</code> if this {@link SpeciesTypeComponentIndex}'s 'name' attribute has
   * been set.
   <p>
   * @return <code>true</code> if this {@link SpeciesTypeComponentIndex}'s 'name' attribute has
   * been set; otherwise, <code>false</code> is returned.
   */ public
 boolean isSetName() {
    return libsbmlJNI.SpeciesTypeComponentIndex_isSetName(swigCPtr, this);
  }

  
/**
   * Sets the value of the 'name' attribute of this {@link SpeciesTypeComponentIndex}.
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
    return libsbmlJNI.SpeciesTypeComponentIndex_setName(swigCPtr, this, name);
  }

  
/**
   * Unsets the value of the 'name' attribute of this {@link SpeciesTypeComponentIndex}.
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
    return libsbmlJNI.SpeciesTypeComponentIndex_unsetName(swigCPtr, this);
  }

  
/**
   * Returns the value of the 'component' attribute of this
   * {@link SpeciesTypeComponentIndex}.
   <p>
   * @return the value of the 'component' attribute of this
   * {@link SpeciesTypeComponentIndex} as a string.
   */ public
 String getComponent() {
    return libsbmlJNI.SpeciesTypeComponentIndex_getComponent(swigCPtr, this);
  }

  
/**
   * Returns <code>true</code> if this {@link SpeciesTypeComponentIndex}'s 'component'
   * attribute has been set.
   <p>
   * @return <code>true</code> if this {@link SpeciesTypeComponentIndex}'s 'component'
   * attribute has been set; otherwise, <code>false</code> is returned.
   */ public
 boolean isSetComponent() {
    return libsbmlJNI.SpeciesTypeComponentIndex_isSetComponent(swigCPtr, this);
  }

  
/**
   * Sets the value of the 'component' attribute of this
   * {@link SpeciesTypeComponentIndex}.
   <p>
   * @param component String value of the 'component' attribute
   * to be set
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
    return libsbmlJNI.SpeciesTypeComponentIndex_setComponent(swigCPtr, this, component);
  }

  
/**
   * Unsets the value of the 'component' attribute of this
   * {@link SpeciesTypeComponentIndex}.
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
    return libsbmlJNI.SpeciesTypeComponentIndex_unsetComponent(swigCPtr, this);
  }

  
/**
   * Returns the value of the 'identifyingParent' attribute of this
   * {@link SpeciesTypeComponentIndex}.
   <p>
   * @return the value of the 'identifyingParent' attribute of this
   * {@link SpeciesTypeComponentIndex} as a string.
   */ public
 String getIdentifyingParent() {
    return libsbmlJNI.SpeciesTypeComponentIndex_getIdentifyingParent(swigCPtr, this);
  }

  
/**
   * Returns <code>true</code> if this {@link SpeciesTypeComponentIndex}'s 'identifyingParent'
   * attribute has been set.
   <p>
   * @return <code>true</code> if this {@link SpeciesTypeComponentIndex}'s 'identifyingParent'
   * attribute has been set, otherwise <code>false</code> is returned.
   */ public
 boolean isSetIdentifyingParent() {
    return libsbmlJNI.SpeciesTypeComponentIndex_isSetIdentifyingParent(swigCPtr, this);
  }

  
/**
   * Sets the value of the 'identifyingParent' attribute of this
   * {@link SpeciesTypeComponentIndex}.
   <p>
   * @param identifyingParent String value of the
   * 'identifyingParent' attribute to be set
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
 int setIdentifyingParent(String identifyingParent) {
    return libsbmlJNI.SpeciesTypeComponentIndex_setIdentifyingParent(swigCPtr, this, identifyingParent);
  }

  
/**
   * Unsets the value of the 'identifyingParent' attribute of this
   * {@link SpeciesTypeComponentIndex}.
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
 int unsetIdentifyingParent() {
    return libsbmlJNI.SpeciesTypeComponentIndex_unsetIdentifyingParent(swigCPtr, this);
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
    libsbmlJNI.SpeciesTypeComponentIndex_renameSIdRefs(swigCPtr, this, oldid, newid);
  }

  
/**
   * Returns the XML element name of this object.
   <p>
   * @return the name of this element, i.e. <code>'speciesTypeComponentIndex'.</code>
   */ public
 String getElementName() {
    return libsbmlJNI.SpeciesTypeComponentIndex_getElementName(swigCPtr, this);
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
    return libsbmlJNI.SpeciesTypeComponentIndex_getTypeCode(swigCPtr, this);
  }

  
/**
   * Predicate returning <code>true</code> if all the required attributes
   * for this {@link SpeciesTypeComponentIndex} object have been set.
   <p>
   * @note The required attributes for a {@link SpeciesTypeComponentIndex} object are:
   * <ul>
   * <li> 'id'
   * <li> 'component'
   *
   * </ul> <p>
   * @return a boolean value indicating whether all the required
   * attributes for this object have been defined.
   */ public
 boolean hasRequiredAttributes() {
    return libsbmlJNI.SpeciesTypeComponentIndex_hasRequiredAttributes(swigCPtr, this);
  }

  
/** * @internal */ public
 void enablePackageInternal(String pkgURI, String pkgPrefix, boolean flag) {
    libsbmlJNI.SpeciesTypeComponentIndex_enablePackageInternal(swigCPtr, this, pkgURI, pkgPrefix, flag);
  }

}
