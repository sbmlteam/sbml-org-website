/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.sbml.libsbml;

/** 
 * <span class="pkg-marker pkg-color-render"><a href="group__render.html">render</a></span>

 A list of {@link GlobalRenderInformation} objects.
 <p>
 * The {@link ListOfGlobalRenderInformation} is a container for the
 * {@link GlobalRenderInformation} elements of a {@link ListOfLayouts} object.
 <p>
 * <p>
 * The various ListOf___ classes in SBML
 * are merely containers used for organizing the main components of an SBML
 * model.  In libSBML's implementation, ListOf___
 * classes are derived from the
 * intermediate utility class {@link ListOf}, which
 * is not defined by the SBML specifications but serves as a useful
 * programmatic construct.  {@link ListOf} is itself is in turn derived from {@link SBase},
 * which provides all of the various ListOf___
 * classes with common features
 * defined by the SBML specification, such as 'metaid' attributes and
 * annotations.
 <p>
 * The relationship between the lists and the rest of an SBML model is
 * illustrated by the following (for SBML Level&nbsp;2 Version&nbsp;4):
 <p>
 * <figure>
  <object type="image/svg+xml" data="listof-illustration.svg" class="centered"></object>
</figure>

 <p>
 * SBML Level&nbsp;3 Version&nbsp;1 has essentially the same structure as 
 * Level&nbsp;2 Version&nbsp;4, depicted above, but SBML Level&nbsp;3 
 * Version&nbsp;2 allows
 * containers to contain zero or more of the relevant object, instead of 
 * requiring at least one.  As such, libsbml will write out an 
 * otherwise-empty ListOf___ element that has any optional attribute set 
 * (such as 'id' or 'metaid'), that has an optional child (such 
 * as a 'notes' or 'annotation'), or that has attributes or children set
 * from any SBML Level&nbsp;3 package, whether or not the ListOf___ has 
 * any other children.
 <p>
 * Readers may wonder about the motivations for using the ListOf___
 * containers in SBML.  A simpler approach in XML might be to place the
 * components all directly at the top level of the model definition.  The
 * choice made in SBML is to group them within XML elements named after
 * ListOf<em>Classname</em>, in part because it helps organize the
 * components.  More importantly, the fact that the container classes are
 * derived from {@link SBase} means that software tools can add information <em>about</em>
 * the lists themselves into each list container's 'annotation'.
 <p>
 * @see ListOfFunctionDefinitions
 * @see ListOfUnitDefinitions
 * @see ListOfCompartmentTypes
 * @see ListOfSpeciesTypes
 * @see ListOfCompartments
 * @see ListOfSpecies
 * @see ListOfParameters
 * @see ListOfInitialAssignments
 * @see ListOfRules
 * @see ListOfConstraints
 * @see ListOfReactions
 * @see ListOfEvents
 <p>
 * @see GlobalRenderInformation
 */

public class ListOfGlobalRenderInformation extends ListOf {
   private long swigCPtr;

   protected ListOfGlobalRenderInformation(long cPtr, boolean cMemoryOwn)
   {
     super(libsbmlJNI.ListOfGlobalRenderInformation_SWIGUpcast(cPtr), cMemoryOwn);
     swigCPtr = cPtr;
   }

   protected static long getCPtr(ListOfGlobalRenderInformation obj)
   {
     return (obj == null) ? 0 : obj.swigCPtr;
   }

   protected static long getCPtrAndDisown (ListOfGlobalRenderInformation obj)
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
        libsbmlJNI.delete_ListOfGlobalRenderInformation(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  
/**
   * Creates a new {@link ListOfGlobalRenderInformation} using the given SBML Level,
   * Version and &ldquo;render&rdquo; package version.
   <p>
   * @param level a long integer, the SBML Level to assign to this
   * {@link ListOfGlobalRenderInformation}.
   <p>
   * @param version a long integer, the SBML Version to assign to this
   * {@link ListOfGlobalRenderInformation}.
   <p>
   * @param pkgVersion a long integer, the SBML Render Version to assign to
   * this {@link ListOfGlobalRenderInformation}.
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
 ListOfGlobalRenderInformation(long level, long version, long pkgVersion) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ListOfGlobalRenderInformation__SWIG_0(level, version, pkgVersion), true);
  }

  
/**
   * Creates a new {@link ListOfGlobalRenderInformation} using the given SBML Level,
   * Version and &ldquo;render&rdquo; package version.
   <p>
   * @param level a long integer, the SBML Level to assign to this
   * {@link ListOfGlobalRenderInformation}.
   <p>
   * @param version a long integer, the SBML Version to assign to this
   * {@link ListOfGlobalRenderInformation}.
   <p>
   * @param pkgVersion a long integer, the SBML Render Version to assign to
   * this {@link ListOfGlobalRenderInformation}.
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
 ListOfGlobalRenderInformation(long level, long version) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ListOfGlobalRenderInformation__SWIG_1(level, version), true);
  }

  
/**
   * Creates a new {@link ListOfGlobalRenderInformation} using the given SBML Level,
   * Version and &ldquo;render&rdquo; package version.
   <p>
   * @param level a long integer, the SBML Level to assign to this
   * {@link ListOfGlobalRenderInformation}.
   <p>
   * @param version a long integer, the SBML Version to assign to this
   * {@link ListOfGlobalRenderInformation}.
   <p>
   * @param pkgVersion a long integer, the SBML Render Version to assign to
   * this {@link ListOfGlobalRenderInformation}.
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
 ListOfGlobalRenderInformation(long level) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ListOfGlobalRenderInformation__SWIG_2(level), true);
  }

  
/**
   * Creates a new {@link ListOfGlobalRenderInformation} using the given SBML Level,
   * Version and &ldquo;render&rdquo; package version.
   <p>
   * @param level a long integer, the SBML Level to assign to this
   * {@link ListOfGlobalRenderInformation}.
   <p>
   * @param version a long integer, the SBML Version to assign to this
   * {@link ListOfGlobalRenderInformation}.
   <p>
   * @param pkgVersion a long integer, the SBML Render Version to assign to
   * this {@link ListOfGlobalRenderInformation}.
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
 ListOfGlobalRenderInformation() throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ListOfGlobalRenderInformation__SWIG_3(), true);
  }

  
/**
   * Creates a new {@link ListOfGlobalRenderInformation} using the given
   * {@link RenderPkgNamespaces} object.
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
   * @param renderns the {@link RenderPkgNamespaces} object.
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
 ListOfGlobalRenderInformation(RenderPkgNamespaces renderns) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ListOfGlobalRenderInformation__SWIG_4(RenderPkgNamespaces.getCPtr(renderns), renderns), true);
  }

  
/**
   * Copy constructor for {@link ListOfGlobalRenderInformation}.
   <p>
   * @param orig the {@link ListOfGlobalRenderInformation} instance to copy.
   */ public
 ListOfGlobalRenderInformation(ListOfGlobalRenderInformation orig) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ListOfGlobalRenderInformation__SWIG_5(ListOfGlobalRenderInformation.getCPtr(orig), orig), true);
  }

  
/**
   * Creates and returns a deep copy of this {@link ListOfGlobalRenderInformation}
   * object.
   <p>
   * @return a (deep) copy of this {@link ListOfGlobalRenderInformation} object.
   */ public
 ListOfGlobalRenderInformation cloneObject() {
    long cPtr = libsbmlJNI.ListOfGlobalRenderInformation_cloneObject(swigCPtr, this);
    return (cPtr == 0) ? null : new ListOfGlobalRenderInformation(cPtr, true);
  }

  
/**
   * Returns the value of the 'majorVersion' attribute of this
   * {@link ListOfGlobalRenderInformation}.
   <p>
   * @return the value of the 'majorVersion' attribute of this
   * {@link ListOfGlobalRenderInformation} as a longeger.
   */ public
 long getMajorVersion() {
    return libsbmlJNI.ListOfGlobalRenderInformation_getMajorVersion(swigCPtr, this);
  }

  
/**
   * Returns the value of the 'minorVersion' attribute of this
   * {@link ListOfGlobalRenderInformation}.
   <p>
   * @return the value of the 'minorVersion' attribute of this
   * {@link ListOfGlobalRenderInformation} as a longeger.
   */ public
 long getMinorVersion() {
    return libsbmlJNI.ListOfGlobalRenderInformation_getMinorVersion(swigCPtr, this);
  }

  
/**
  * Returns the version as a string.
  <p>
  * @return the version of the {@link GlobalRenderInformation} object
  * as a string
  */ public
 String getVersionString() {
    return libsbmlJNI.ListOfGlobalRenderInformation_getVersionString(swigCPtr, this);
  }

  
/**
   * Predicate returning <code>true</code> if this {@link ListOfGlobalRenderInformation}'s
   * 'majorVersion' attribute is set.
   <p>
   * @return <code>true</code> if this {@link ListOfGlobalRenderInformation}'s 'majorVersion'
   * attribute has been set, otherwise <code>false</code> is returned.
   */ public
 boolean isSetMajorVersion() {
    return libsbmlJNI.ListOfGlobalRenderInformation_isSetMajorVersion(swigCPtr, this);
  }

  
/**
   * Predicate returning <code>true</code> if this {@link ListOfGlobalRenderInformation}'s
   * 'minorVersion' attribute is set.
   <p>
   * @return <code>true</code> if this {@link ListOfGlobalRenderInformation}'s 'minorVersion'
   * attribute has been set, otherwise <code>false</code> is returned.
   */ public
 boolean isSetMinorVersion() {
    return libsbmlJNI.ListOfGlobalRenderInformation_isSetMinorVersion(swigCPtr, this);
  }

  
/** * @internal */ public
 boolean isSetVersionMajor() {
    return libsbmlJNI.ListOfGlobalRenderInformation_isSetVersionMajor(swigCPtr, this);
  }

  
/** * @internal */ public
 boolean isSetVersionMinor() {
    return libsbmlJNI.ListOfGlobalRenderInformation_isSetVersionMinor(swigCPtr, this);
  }

  
/**
   * Sets the value of the 'majorVersion' attribute of this
   * {@link ListOfGlobalRenderInformation}.
   <p>
   * @param majorVersion long value of the 'majorVersion' attribute to
   * be set.
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
 int setMajorVersion(long majorVersion) {
    return libsbmlJNI.ListOfGlobalRenderInformation_setMajorVersion(swigCPtr, this, majorVersion);
  }

  
/**
   * Sets the value of the 'minorVersion' attribute of this
   * {@link ListOfGlobalRenderInformation}.
   <p>
   * @param minorVersion long value of the 'minorVersion' attribute to
   * be set.
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
 int setMinorVersion(long minorVersion) {
    return libsbmlJNI.ListOfGlobalRenderInformation_setMinorVersion(swigCPtr, this, minorVersion);
  }

  
/** * @internal */ public
 int setVersionMajor(long majorVersion) {
    return libsbmlJNI.ListOfGlobalRenderInformation_setVersionMajor(swigCPtr, this, majorVersion);
  }

  
/** * @internal */ public
 int setVersionMinor(long minorVersion) {
    return libsbmlJNI.ListOfGlobalRenderInformation_setVersionMinor(swigCPtr, this, minorVersion);
  }

  
/**
  * Sets the version of the render information list.
  * The version consists of a major and a minor version number.
  <p>
  * @param major major version number
  * @param minor minor version number
  */ public
 void setVersion(long major, long minor) {
    libsbmlJNI.ListOfGlobalRenderInformation_setVersion(swigCPtr, this, major, minor);
  }

  
/**
   * Unsets the value of the 'majorVersion' attribute of this
   * {@link ListOfGlobalRenderInformation}.
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
 int unsetMajorVersion() {
    return libsbmlJNI.ListOfGlobalRenderInformation_unsetMajorVersion(swigCPtr, this);
  }

  
/**
   * Unsets the value of the 'minorVersion' attribute of this
   * {@link ListOfGlobalRenderInformation}.
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
 int unsetMinorVersion() {
    return libsbmlJNI.ListOfGlobalRenderInformation_unsetMinorVersion(swigCPtr, this);
  }

  
/** * @internal */ public
 int unsetVersionMajor() {
    return libsbmlJNI.ListOfGlobalRenderInformation_unsetVersionMajor(swigCPtr, this);
  }

  
/** * @internal */ public
 int unsetVersionMinor() {
    return libsbmlJNI.ListOfGlobalRenderInformation_unsetVersionMinor(swigCPtr, this);
  }

  
/**
   * Returns the value of the 'defaultValues' element of this
   * {@link ListOfGlobalRenderInformation}.
   <p>
   * @return the value of the 'defaultValues' element of this
   * {@link ListOfGlobalRenderInformation} as a {@link DefaultValues}.
   */ public
 DefaultValues getDefaultValues() {
    long cPtr = libsbmlJNI.ListOfGlobalRenderInformation_getDefaultValues__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new DefaultValues(cPtr, false);
  }

  
/**
   * Predicate returning <code>true</code> if this {@link ListOfGlobalRenderInformation}'s
   * 'defaultValues' element is set.
   <p>
   * @return <code>true</code> if this {@link ListOfGlobalRenderInformation}'s 'defaultValues'
   * element has been set, otherwise <code>false</code> is returned.
   */ public
 boolean isSetDefaultValues() {
    return libsbmlJNI.ListOfGlobalRenderInformation_isSetDefaultValues(swigCPtr, this);
  }

  
/**
   * Sets the value of the 'defaultValues' element of this
   * {@link ListOfGlobalRenderInformation}.
   <p>
   * @param defaultValues {@link DefaultValues} value of the 'defaultValues' element
   * to be set.
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
 int setDefaultValues(DefaultValues defaultValues) {
    return libsbmlJNI.ListOfGlobalRenderInformation_setDefaultValues(swigCPtr, this, DefaultValues.getCPtr(defaultValues), defaultValues);
  }

  
/**
   * Creates a new {@link DefaultValues} object, adds it to this
   * {@link ListOfGlobalRenderInformation} object and returns the {@link DefaultValues} object
   * created.
   <p>
   * @return a new {@link DefaultValues} object instance.
   */ public
 DefaultValues createDefaultValues() {
    long cPtr = libsbmlJNI.ListOfGlobalRenderInformation_createDefaultValues(swigCPtr, this);
    return (cPtr == 0) ? null : new DefaultValues(cPtr, false);
  }

  
/**
   * Unsets the value of the 'defaultValues' element of this
   * {@link ListOfGlobalRenderInformation}.
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
 int unsetDefaultValues() {
    return libsbmlJNI.ListOfGlobalRenderInformation_unsetDefaultValues(swigCPtr, this);
  }

  
/**
   * Get a {@link GlobalRenderInformation} from the {@link ListOfGlobalRenderInformation}.
   <p>
   * @param n a long integer representing the index of the
   * {@link GlobalRenderInformation} to retrieve.
   <p>
   * @return the nth {@link GlobalRenderInformation} in this
   * {@link ListOfGlobalRenderInformation}.
   * If the index <code>n</code> is invalid, <code>null</code> is returned.
   <p>
   * <p>
 * @note
 * The pointer that is returned by this function is not owned by the caller,
 * but may be queried and modified.  Any changes made will be reflected in any
 * resulting SBML document containing the pointer's parent.
   <p>
   * @see #addGlobalRenderInformation(GlobalRenderInformation object)
   * @see #createGlobalRenderInformation()
   * @see #get(String sid)
   * @see #getNumGlobalRenderInformation()
   * @see #remove(String sid)
   * @see #remove(long n)
   */ public
 SBase get(long n) {
    long cPtr = libsbmlJNI.ListOfGlobalRenderInformation_get__SWIG_0(swigCPtr, this, n);
    return (cPtr == 0) ? null : new GlobalRenderInformation(cPtr, false);
  }

  
/**
   * Get a {@link GlobalRenderInformation} from the {@link ListOfGlobalRenderInformation} based
   * on its identifier.
   <p>
   * @param sid a string representing the identifier of the
   * {@link GlobalRenderInformation} to retrieve.
   <p>
   * @return the {@link GlobalRenderInformation} in this {@link ListOfGlobalRenderInformation}
   * with the given <code>sid</code> or <code>null</code> if no such {@link GlobalRenderInformation}
   * exists.
   <p>
   * <p>
 * @note
 * The pointer that is returned by this function is not owned by the caller,
 * but may be queried and modified.  Any changes made will be reflected in any
 * resulting SBML document containing the pointer's parent.
   <p>
   * @see #addGlobalRenderInformation(GlobalRenderInformation object)
   * @see #createGlobalRenderInformation()
   * @see #get(long n)
   * @see #getNumGlobalRenderInformation()
   * @see #remove(String sid)
   * @see #remove(long n)
   */ public
 GlobalRenderInformation get(String sid) {
    long cPtr = libsbmlJNI.ListOfGlobalRenderInformation_get__SWIG_2(swigCPtr, this, sid);
    return (cPtr == 0) ? null : new GlobalRenderInformation(cPtr, false);
  }

  
/**
   * Removes the nth {@link GlobalRenderInformation} from this
   * {@link ListOfGlobalRenderInformation} and returns a pointer to it.
   <p>
   * @param n a long integer representing the index of the
   * {@link GlobalRenderInformation} to remove.
   <p>
   * @return a pointer to the nth {@link GlobalRenderInformation} in this
   * {@link ListOfGlobalRenderInformation}.
   <p>
   * <p>
 * @warning
 * <span class='warning'>The pointer that is returned by this function is owned
 * by the caller, who is responsible for deleting it.  Any changes made to the
 * element will not be reflected in any resulting SBML document unless the
 * element is added to an SBML Document.  Even in this case, the element's
 * deletion is still the responsibility of the caller with two exceptions: if
 * it is used as the 'disownedItem' in the * {@link ListOf#appendAndOwn()} or {@link ListOf#insertAndOwn()} 
 * functions.  All other functions in libsbml add a copy of the element,
 * and do not transfer ownership of the pointer.</span>
   <p>
   * @see #addGlobalRenderInformation(GlobalRenderInformation object)
   * @see #createGlobalRenderInformation()
   * @see #get(String sid)
   * @see #get(long n)
   * @see #getNumGlobalRenderInformation()
   * @see #remove(String sid)
   */ public
 SBase remove(long n) {
    long cPtr = libsbmlJNI.ListOfGlobalRenderInformation_remove__SWIG_0(swigCPtr, this, n);
    return (cPtr == 0) ? null : new GlobalRenderInformation(cPtr, true);
  }

  
/**
   * Removes the {@link GlobalRenderInformation} from this
   * {@link ListOfGlobalRenderInformation} based on its identifier and returns a
   * pointer to it.
   <p>
   * @param sid a string representing the identifier of the
   * {@link GlobalRenderInformation} to remove.
   <p>
   * @return the {@link GlobalRenderInformation} in this {@link ListOfGlobalRenderInformation}
   * based on the identifier or null if no such {@link GlobalRenderInformation} exists.
   <p>
   * <p>
 * @warning
 * <span class='warning'>The pointer that is returned by this function is owned
 * by the caller, who is responsible for deleting it.  Any changes made to the
 * element will not be reflected in any resulting SBML document unless the
 * element is added to an SBML Document.  Even in this case, the element's
 * deletion is still the responsibility of the caller with two exceptions: if
 * it is used as the 'disownedItem' in the * {@link ListOf#appendAndOwn()} or {@link ListOf#insertAndOwn()} 
 * functions.  All other functions in libsbml add a copy of the element,
 * and do not transfer ownership of the pointer.</span>
   <p>
   * @see #addGlobalRenderInformation(GlobalRenderInformation object)
   * @see #createGlobalRenderInformation()
   * @see #get(String sid)
   * @see #get(long n)
   * @see #getNumGlobalRenderInformation()
   * @see #remove(long n)
   */ public
 GlobalRenderInformation remove(String sid) {
    long cPtr = libsbmlJNI.ListOfGlobalRenderInformation_remove__SWIG_1(swigCPtr, this, sid);
    return (cPtr == 0) ? null : new GlobalRenderInformation(cPtr, true);
  }

  
/**
   * Adds a copy of the given {@link GlobalRenderInformation} to this
   * {@link ListOfGlobalRenderInformation}.
   <p>
   * @param gri the {@link GlobalRenderInformation} object to add.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   The possible values
 * returned by this function are:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_FAILED LIBSBML_OPERATION_FAILED}
   * <li> {@link libsbmlConstants#LIBSBML_INVALID_OBJECT LIBSBML_INVALID_OBJECT}
   * <li> {@link libsbmlConstants#LIBSBML_LEVEL_MISMATCH LIBSBML_LEVEL_MISMATCH}
   * <li> {@link libsbmlConstants#LIBSBML_VERSION_MISMATCH LIBSBML_VERSION_MISMATCH}
   * <li> {@link libsbmlConstants#LIBSBML_PKG_VERSION_MISMATCH LIBSBML_PKG_VERSION_MISMATCH}
   * <li> {@link libsbmlConstants#LIBSBML_DUPLICATE_OBJECT_ID LIBSBML_DUPLICATE_OBJECT_ID}
   *
   * </ul> <p>
   * <p>
 * @note This method should be used with some caution.  The fact that this
 * method <em>copies</em> the object passed to it means that the caller will be
 * left holding a physically different object instance than the one contained
 * inside this object.  Changes made to the original object instance (such as
 * resetting attribute values) will <em>not affect the instance in this
 * object</em>.  In addition, the caller should make sure to free the
 * original object if it is no longer being used, or else a memory leak will
 * result.  Please see other methods on this class (particularly a
 * corresponding method whose name begins with the word <code>create</code>)
 * for alternatives that do not lead to these issues.
   <p>
   * @see #createGlobalRenderInformation()
   * @see #get(String sid)
   * @see #get(long n)
   * @see #getNumGlobalRenderInformation()
   * @see #remove(String sid)
   * @see #remove(long n)
   */ public
 int addGlobalRenderInformation(GlobalRenderInformation gri) {
    return libsbmlJNI.ListOfGlobalRenderInformation_addGlobalRenderInformation(swigCPtr, this, GlobalRenderInformation.getCPtr(gri), gri);
  }

  
/**
   * Get the number of {@link GlobalRenderInformation} objects in this
   * {@link ListOfGlobalRenderInformation}.
   <p>
   * @return the number of {@link GlobalRenderInformation} objects in this
   * {@link ListOfGlobalRenderInformation}.
   <p>
   * @see #addGlobalRenderInformation(GlobalRenderInformation object)
   * @see #createGlobalRenderInformation()
   * @see #get(String sid)
   * @see #get(long n)
   * @see #remove(String sid)
   * @see #remove(long n)
   */ public
 long getNumGlobalRenderInformation() {
    return libsbmlJNI.ListOfGlobalRenderInformation_getNumGlobalRenderInformation(swigCPtr, this);
  }

  
/**
   * Creates a new {@link GlobalRenderInformation} object, adds it to this
   * {@link ListOfGlobalRenderInformation} object and returns the
   * {@link GlobalRenderInformation} object created.
   <p>
   * @return a new {@link GlobalRenderInformation} object instance.
   <p>
   * <p>
 * @note
 * The pointer that is returned by this function is not owned by the caller,
 * but may be queried and modified.  Any changes made will be reflected in any
 * resulting SBML document containing the pointer's parent.
   <p>
   * @see #addGlobalRenderInformation(GlobalRenderInformation object)
   * @see #get(String sid)
   * @see #get(long n)
   * @see #getNumGlobalRenderInformation()
   * @see #remove(String sid)
   * @see #remove(long n)
   */ public
 GlobalRenderInformation createGlobalRenderInformation() {
    long cPtr = libsbmlJNI.ListOfGlobalRenderInformation_createGlobalRenderInformation(swigCPtr, this);
    return (cPtr == 0) ? null : new GlobalRenderInformation(cPtr, false);
  }

  
/**
   * Returns the XML element name of this {@link ListOfGlobalRenderInformation} object.
   <p>
   * For {@link ListOfGlobalRenderInformation}, the XML element name is always
   * <code>'listOfGlobalRenderInformation'.</code>
   <p>
   * @return the name of this element, i.e. <code>'listOfGlobalRenderInformation'.</code>
   */ public
 String getElementName() {
    return libsbmlJNI.ListOfGlobalRenderInformation_getElementName(swigCPtr, this);
  }

  
/**
   * Returns the libSBML type code for this {@link ListOfGlobalRenderInformation}
   * object.
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
   * {@link libsbmlConstants#SBML_LIST_OF SBML_LIST_OF}.
   <p>
   * <p>
 * @warning <span class='warning'>The specific integer values of the possible
 * type codes may be reused by different libSBML plug-ins for SBML Level&nbsp;3.
 * packages,  To fully identify the correct code, <strong>it is necessary to
 * invoke both getPackageName() and getTypeCode()</strong> (or 
 * {@link ListOf#getItemTypeCode()}).</span>
   */ public
 int getTypeCode() {
    return libsbmlJNI.ListOfGlobalRenderInformation_getTypeCode(swigCPtr, this);
  }

  
/**
   * Returns the libSBML type code for the SBML objects contained in this
   * {@link ListOfGlobalRenderInformation} object.
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
   * @return the SBML typecode for the objects contained in this
   * ListOfGlobalRenderInformation:
   * {@link libsbmlConstants#SBML_RENDER_GLOBALRENDERINFORMATION SBML_RENDER_GLOBALRENDERINFORMATION}.
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
 int getItemTypeCode() {
    return libsbmlJNI.ListOfGlobalRenderInformation_getItemTypeCode(swigCPtr, this);
  }

  
/**
  * Returns whether the given item can be added to this {@link ListOfGlobalRenderInformation}.
  <p>
  * @param item the {@link SBase} element to check.
  <p>
  * @return <code>true</code> if <code>item</code> is not <code>null</code>, and is of type 
  * {@link libsbmlConstants#SBML_RENDER_GLOBALRENDERINFORMATION SBML_RENDER_GLOBALRENDERINFORMATION};
  * <code>false</code> otherwise.
  */ public
 boolean isValidTypeForList(SBase item) {
    return libsbmlJNI.ListOfGlobalRenderInformation_isValidTypeForList(swigCPtr, this, SBase.getCPtrAndDisown(item), item);
  }

  
/**
   * Predicate returning <code>true</code> if all the required attributes for this
   * {@link ListOfGlobalRenderInformation} object have been set.
   <p>
   * @return <code>true</code> to indicate that all the required attributes of this
   * {@link ListOfGlobalRenderInformation} have been set, otherwise <code>false</code> is
   * returned.
   */ public
 boolean hasRequiredAttributes() {
    return libsbmlJNI.ListOfGlobalRenderInformation_hasRequiredAttributes(swigCPtr, this);
  }

  
/** * @internal */ public
 void connectToChild() {
    libsbmlJNI.ListOfGlobalRenderInformation_connectToChild(swigCPtr, this);
  }

  
/**
   * Returns the first child element that has the given <code>id</code> in the model-wide
   * SId namespace, or <code>null</code> if no such object is found.
   <p>
   * @param id a string representing the id attribute of the object to
   * retrieve.
   <p>
   * @return a pointer to the {@link SBase} element with the given <code>id</code>. If no such
   * object is found, this method returns <code>null.</code>
   */ public
 SBase getElementBySId(String id) {
  return libsbml.DowncastSBase(libsbmlJNI.ListOfGlobalRenderInformation_getElementBySId(swigCPtr, this, id), false);
}

  
/**
   * Returns the first child element that has the given <code>metaid</code>, or <code>null</code>
   * if no such object is found.
   <p>
   * @param metaid a string representing the metaid attribute of the object to
   * retrieve.
   <p>
   * @return a pointer to the {@link SBase} element with the given <code>metaid</code>. If no
   * such object is found this method returns <code>null.</code>
   */ public
 SBase getElementByMetaId(String metaid) {
  return libsbml.DowncastSBase(libsbmlJNI.ListOfGlobalRenderInformation_getElementByMetaId(swigCPtr, this, metaid), false);
}

  
/**
  * Creates an {@link XMLNode} object from this {@link ListOfLocalRenderInformation} object.
  <p>
  * @return the {@link XMLNode} with the XML representation for the
  * {@link ListOfLocalRenderInformation} object.
  */ public
 XMLNode toXML() {
    return new XMLNode(libsbmlJNI.ListOfGlobalRenderInformation_toXML(swigCPtr, this), true);
  }

  
/**
  * Parses the xml information in the given node and sets the attributes.
  * This method should never be called by the user. It is only used to read render
  * information from annotations.
  <p>
  * @param node the {@link XMLNode} object reference that describes the {@link ListOfGlobalRenderInformation}
  * object to be instantiated.
  */ public
 void parseXML(XMLNode node) {
    libsbmlJNI.ListOfGlobalRenderInformation_parseXML(swigCPtr, this, XMLNode.getCPtr(node), node);
  }

}
