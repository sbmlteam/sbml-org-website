/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.sbml.libsbml;

/** 
 * <span class="pkg-marker pkg-color-qual"><a href="group__qual.html">qual</a></span>

 The default result of a {@link Transition}.
 <p>
 * The {@link DefaultTerm} defines the default result of a {@link Transition}, held in the
 * (required) 'resultLevel' attribute.  This term is
 * used when there are no other {@link FunctionTerm} elements or when none of the Math
 * elements of the {@link FunctionTerm} elements evaluate to <code>true.</code>
 */

public class DefaultTerm extends SBase {
   private long swigCPtr;

   protected DefaultTerm(long cPtr, boolean cMemoryOwn)
   {
     super(libsbmlJNI.DefaultTerm_SWIGUpcast(cPtr), cMemoryOwn);
     swigCPtr = cPtr;
   }

   protected static long getCPtr(DefaultTerm obj)
   {
     return (obj == null) ? 0 : obj.swigCPtr;
   }

   protected static long getCPtrAndDisown (DefaultTerm obj)
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
        libsbmlJNI.delete_DefaultTerm(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  
/**
   * Creates a new {@link DefaultTerm} with the given level, version, and package version.
   <p>
   * @param level a long integer, the SBML Level to assign to this {@link DefaultTerm}.
   <p>
   * @param version a long integer, the SBML Version to assign to this {@link DefaultTerm}.
   <p>
   * @param pkgVersion a long integer, the SBML Qual Version to assign to this {@link DefaultTerm}.
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
 DefaultTerm(long level, long version, long pkgVersion) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_DefaultTerm__SWIG_0(level, version, pkgVersion), true);
  }

  
/**
   * Creates a new {@link DefaultTerm} with the given level, version, and package version.
   <p>
   * @param level a long integer, the SBML Level to assign to this {@link DefaultTerm}.
   <p>
   * @param version a long integer, the SBML Version to assign to this {@link DefaultTerm}.
   <p>
   * @param pkgVersion a long integer, the SBML Qual Version to assign to this {@link DefaultTerm}.
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
 DefaultTerm(long level, long version) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_DefaultTerm__SWIG_1(level, version), true);
  }

  
/**
   * Creates a new {@link DefaultTerm} with the given level, version, and package version.
   <p>
   * @param level a long integer, the SBML Level to assign to this {@link DefaultTerm}.
   <p>
   * @param version a long integer, the SBML Version to assign to this {@link DefaultTerm}.
   <p>
   * @param pkgVersion a long integer, the SBML Qual Version to assign to this {@link DefaultTerm}.
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
 DefaultTerm(long level) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_DefaultTerm__SWIG_2(level), true);
  }

  
/**
   * Creates a new {@link DefaultTerm} with the given level, version, and package version.
   <p>
   * @param level a long integer, the SBML Level to assign to this {@link DefaultTerm}.
   <p>
   * @param version a long integer, the SBML Version to assign to this {@link DefaultTerm}.
   <p>
   * @param pkgVersion a long integer, the SBML Qual Version to assign to this {@link DefaultTerm}.
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
 DefaultTerm() throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_DefaultTerm__SWIG_3(), true);
  }

  
/**
   * Creates a new {@link DefaultTerm} with the given {@link QualPkgNamespaces} object.
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
   * @param qualns the {@link QualPkgNamespaces} object.
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
 DefaultTerm(QualPkgNamespaces qualns) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_DefaultTerm__SWIG_4(QualPkgNamespaces.getCPtr(qualns), qualns), true);
  }

  
/**
   * Copy constructor for {@link DefaultTerm}.
   <p>
   * @param orig the {@link DefaultTerm} instance to copy.
   */ public
 DefaultTerm(DefaultTerm orig) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_DefaultTerm__SWIG_5(DefaultTerm.getCPtr(orig), orig), true);
  }

  
/**
   * Creates and returns a deep copy of this {@link DefaultTerm} object.
   <p>
   * @return a (deep) copy of this {@link DefaultTerm} object.
   */ public
 DefaultTerm cloneObject() {
    long cPtr = libsbmlJNI.DefaultTerm_cloneObject(swigCPtr, this);
    return (cPtr == 0) ? null : new DefaultTerm(cPtr, true);
  }

  
/**
   * Returns the value of the 'resultLevel' attribute of this {@link DefaultTerm}.
   <p>
   * @return the value of the 'resultLevel' attribute of this {@link DefaultTerm} as a integer.
   */ public
 int getResultLevel() {
    return libsbmlJNI.DefaultTerm_getResultLevel(swigCPtr, this);
  }

  
/**
   * Predicate returning <code>true</code> or <code>false</code> depending on whether this
   * {@link DefaultTerm}'s 'resultLevel' attribute has been set.
   <p>
   * @return <code>true</code> if this {@link DefaultTerm}'s 'resultLevel' attribute has been set,
   * otherwise <code>false</code> is returned.
   */ public
 boolean isSetResultLevel() {
    return libsbmlJNI.DefaultTerm_isSetResultLevel(swigCPtr, this);
  }

  
/**
   * Sets the value of the 'resultLevel' attribute of this {@link DefaultTerm}.
   <p>
   * @param resultLevel int value of the 'resultLevel' attribute to be set.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   The possible values
 * returned by this function are:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * </ul>
   */ public
 int setResultLevel(int resultLevel) {
    return libsbmlJNI.DefaultTerm_setResultLevel(swigCPtr, this, resultLevel);
  }

  
/**
   * Unsets the value of the 'resultLevel' attribute of this {@link DefaultTerm}.
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
 int unsetResultLevel() {
    return libsbmlJNI.DefaultTerm_unsetResultLevel(swigCPtr, this);
  }

  
/**
   * Returns the XML name of this object.
   <p>
   * @return the name of this element.
   */ public
 String getElementName() {
    return libsbmlJNI.DefaultTerm_getElementName(swigCPtr, this);
  }

  
/**
   * Returns the libSBML type code of this object instance.
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
   * {@link libsbmlConstants#SBML_QUAL_DEFAULT_TERM SBML_QUAL_DEFAULT_TERM}.
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
    return libsbmlJNI.DefaultTerm_getTypeCode(swigCPtr, this);
  }

  
/**
   * Predicate returning <code>true</code> if all the required attributes
   * for this {@link DefaultTerm} object have been set.
   <p>
   * @note The required attribute for a {@link DefaultTerm} object is:
   * <ul>
   * <li> 'resultLevel'
   *
   * </ul> <p>
   * @return a boolean value indicating whether the required
   * attribute for this object has been defined.
   */ public
 boolean hasRequiredAttributes() {
    return libsbmlJNI.DefaultTerm_hasRequiredAttributes(swigCPtr, this);
  }

  
/** * @internal */ public
 void enablePackageInternal(String pkgURI, String pkgPrefix, boolean flag) {
    libsbmlJNI.DefaultTerm_enablePackageInternal(swigCPtr, this, pkgURI, pkgPrefix, flag);
  }

}
