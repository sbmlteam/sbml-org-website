/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.sbml.libsbml;

/** 
 * <span class="pkg-marker pkg-color-fbc"><a href="group__fbc.html">fbc</a></span>
 An &ldquo;and&rdquo; relationship for gene products
 <p>
 * {@link FbcAnd} class is used in Version 2 of the SBML Level&nbsp;3 <a href='../../../extensions-summary.html#fbc'>Flux Balance Constraints</a>
 * (&ldquo;fbc&rdquo;) package to represent an 'and' relationship between two
 * or more child {@link FbcAssociation} objects.  In other words, it indicates that
 * all of the child objects are included.  Note that since the {@link FbcAssociation}
 * class is the parent class of {@link GeneProductRef}, {@link FbcAnd} and {@link FbcOr}, a given
 * {@link FbcAnd} can potentially include nested 'and'/'or' combinations of gene
 * products.
 <p>
 * <p>
 * @note This class of objects was introduced in Version&nbsp;2 of the
 * SBML Level&nbsp;3 Flux Balance Constraints (&ldquo;fbc&rdquo;)
 * specification.  In Version&nbsp;1 of &ldquo;fbc&rdquo;, the information
 * encoded by this class can be stored instead using the {@link Association} and
 * {@link GeneAssociation} annotation classes.  Please see the Version&nbsp;1 and
 * Version&nbsp;2 &ldquo;fbc&rdquo; specifications for more details.
 <p>
 * @see FbcAssociation
 * @see FbcOr
 * @see GeneProductRef
 */

public class FbcAnd extends FbcAssociation {
   private long swigCPtr;

   protected FbcAnd(long cPtr, boolean cMemoryOwn)
   {
     super(libsbmlJNI.FbcAnd_SWIGUpcast(cPtr), cMemoryOwn);
     swigCPtr = cPtr;
   }

   protected static long getCPtr(FbcAnd obj)
   {
     return (obj == null) ? 0 : obj.swigCPtr;
   }

   protected static long getCPtrAndDisown (FbcAnd obj)
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
        libsbmlJNI.delete_FbcAnd(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  
/**
   * Creates a new {@link FbcAnd} with the given SBML Level, Version, and
   * &ldquo;fbc&rdquo;package version.
   <p>
   * @param level a long integer, the SBML Level to assign to this {@link FbcAnd}.
   <p>
   * @param version a long integer, the SBML Version to assign to this
   * {@link FbcAnd}.
   <p>
   * @param pkgVersion a long integer, the SBML Fbc Version to assign to
   * this {@link FbcAnd}.
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
 FbcAnd(long level, long version, long pkgVersion) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_FbcAnd__SWIG_0(level, version, pkgVersion), true);
  }

  
/**
   * Creates a new {@link FbcAnd} with the given SBML Level, Version, and
   * &ldquo;fbc&rdquo;package version.
   <p>
   * @param level a long integer, the SBML Level to assign to this {@link FbcAnd}.
   <p>
   * @param version a long integer, the SBML Version to assign to this
   * {@link FbcAnd}.
   <p>
   * @param pkgVersion a long integer, the SBML Fbc Version to assign to
   * this {@link FbcAnd}.
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
 FbcAnd(long level, long version) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_FbcAnd__SWIG_1(level, version), true);
  }

  
/**
   * Creates a new {@link FbcAnd} with the given SBML Level, Version, and
   * &ldquo;fbc&rdquo;package version.
   <p>
   * @param level a long integer, the SBML Level to assign to this {@link FbcAnd}.
   <p>
   * @param version a long integer, the SBML Version to assign to this
   * {@link FbcAnd}.
   <p>
   * @param pkgVersion a long integer, the SBML Fbc Version to assign to
   * this {@link FbcAnd}.
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
 FbcAnd(long level) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_FbcAnd__SWIG_2(level), true);
  }

  
/**
   * Creates a new {@link FbcAnd} with the given SBML Level, Version, and
   * &ldquo;fbc&rdquo;package version.
   <p>
   * @param level a long integer, the SBML Level to assign to this {@link FbcAnd}.
   <p>
   * @param version a long integer, the SBML Version to assign to this
   * {@link FbcAnd}.
   <p>
   * @param pkgVersion a long integer, the SBML Fbc Version to assign to
   * this {@link FbcAnd}.
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
 FbcAnd() throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_FbcAnd__SWIG_3(), true);
  }

  
/**
   * Creates a new {@link FbcAnd} with the given {@link FbcPkgNamespaces} object.
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
   * @param fbcns the {@link FbcPkgNamespaces} object.
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
 FbcAnd(FbcPkgNamespaces fbcns) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_FbcAnd__SWIG_4(FbcPkgNamespaces.getCPtr(fbcns), fbcns), true);
  }

  
/**
   * Copy constructor for {@link FbcAnd}.
   <p>
   * @param orig the {@link FbcAnd} instance to copy.
   */ public
 FbcAnd(FbcAnd orig) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_FbcAnd__SWIG_5(FbcAnd.getCPtr(orig), orig), true);
  }

  
/**
   * Creates and returns a deep copy of this {@link FbcAnd} object.
   <p>
   * @return a (deep) copy of this {@link FbcAnd} object.
   */ public
 FbcAnd cloneObject() {
    long cPtr = libsbmlJNI.FbcAnd_cloneObject(swigCPtr, this);
    return (cPtr == 0) ? null : new FbcAnd(cPtr, true);
  }

  
/**
   * Returns the {@link ListOfFbcAssociations} in this {@link FbcAnd} object.
   <p>
   * @return the {@link ListOfFbcAssociations} child of this {@link FbcAnd}.
   */ public
 ListOfFbcAssociations getListOfAssociations() {
    long cPtr = libsbmlJNI.FbcAnd_getListOfAssociations__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new ListOfFbcAssociations(cPtr, false);
  }

  
/**
   * Get the nth object from the {@link ListOfFbcAssociations}.
   <p>
   * @param n the index number of the {@link FbcAssociation} to get.
   <p>
   * @return the nth {@link FbcAssociation} in the {@link ListOfFbcAssociations} within this
   * {@link FbcAnd}.
   * If the index <code>n</code> is invalid, <code>null</code> is returned.
   <p>
   * @see #getNumAssociations()
   */ public
 FbcAssociation getAssociation(long n) {
	return (FbcAssociation) libsbml.DowncastSBase(libsbmlJNI.FbcAnd_getAssociation__SWIG_0(swigCPtr, this, n), false);
}

  
/**
   * Get an {@link FbcAssociation} from the {@link ListOfFbcAssociations}
   * based on its identifier.
   <p>
   * @param sid a string representing the identifier
   * of the {@link FbcAssociation} to get.
   <p>
   * @return the {@link FbcAssociation} in the {@link ListOfFbcAssociations}
   * with the given id or <code>null</code> if no such
   * {@link FbcAssociation} exists.
   <p>
   * 
   * @see #getNumAssociations()
   <p>
   * @see #getAssociation(long n)
   */ public
 FbcAssociation getAssociation(String sid) {
	return (FbcAssociation) libsbml.DowncastSBase(libsbmlJNI.FbcAnd_getAssociation__SWIG_2(swigCPtr, this, sid), false);
}

  
/**
   * Adds a copy the given {@link FbcAssociation} to this {@link FbcAnd}.
   <p>
   * @param fa the {@link FbcAssociation} object to add.
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
   * <li> {@link libsbmlConstants#LIBSBML_NAMESPACES_MISMATCH LIBSBML_NAMESPACES_MISMATCH}
   * </ul>
   */ public
 int addAssociation(FbcAssociation fa) {
    return libsbmlJNI.FbcAnd_addAssociation(swigCPtr, this, FbcAssociation.getCPtr(fa), fa);
  }

  
/**
   * Get the number of {@link FbcAssociation} objects in this {@link FbcAnd}.
   <p>
   * @return the number of {@link FbcAssociation} objects in this {@link FbcAnd}.
   */ public
 long getNumAssociations() {
    return libsbmlJNI.FbcAnd_getNumAssociations(swigCPtr, this);
  }

  
/**
  * Converts this {@link FbcAssociation} object into an infix string representation.
  <p>
  * @return the association as infix string.
  */ public
 String toInfix(boolean usingId) {
    return libsbmlJNI.FbcAnd_toInfix__SWIG_0(swigCPtr, this, usingId);
  }

  
/**
  * Converts this {@link FbcAssociation} object into an infix string representation.
  <p>
  * @return the association as infix string.
  */ public
 String toInfix() {
    return libsbmlJNI.FbcAnd_toInfix__SWIG_1(swigCPtr, this);
  }

  
/**
   * Creates a new {@link FbcAnd} object, adds it to this {@link FbcAnd}'s
   * {@link ListOfFbcAssociations} and returns the {@link FbcAnd} object created. 
   <p>
   * @return a new {@link FbcAnd} object instance.
   <p>
   * @see #addAssociation(FbcAssociation fa)
   */ public
 FbcAnd createAnd() {
    long cPtr = libsbmlJNI.FbcAnd_createAnd(swigCPtr, this);
    return (cPtr == 0) ? null : new FbcAnd(cPtr, false);
  }

  
/**
   * Creates a new {@link FbcOr} object, adds it to this {@link FbcAnd}'s
   * {@link ListOfFbcAssociations} and returns the {@link FbcOr} object created. 
   <p>
   * @return a new {@link FbcOr} object instance.
   <p>
   * @see #addAssociation(FbcAssociation fa)
   */ public
 FbcOr createOr() {
    long cPtr = libsbmlJNI.FbcAnd_createOr(swigCPtr, this);
    return (cPtr == 0) ? null : new FbcOr(cPtr, false);
  }

  
/**
   * Creates a new {@link GeneProductRef} object, adds it to this {@link FbcAnd}'s
   * {@link ListOfFbcAssociations} and returns the {@link GeneProductRef} object created. 
   <p>
   * @return a new {@link GeneProductRef} object instance.
   <p>
   * @see #addAssociation(FbcAssociation fa)
   */ public
 GeneProductRef createGeneProductRef() {
    long cPtr = libsbmlJNI.FbcAnd_createGeneProductRef(swigCPtr, this);
    return (cPtr == 0) ? null : new GeneProductRef(cPtr, false);
  }

  
/**
   * Removes the nth {@link FbcAssociation} from the {@link ListOfFbcAssociations} within this 
   * {@link FbcAnd} and returns a pointer to it.
   <p>
   * The caller owns the returned item and is responsible for deleting it.
   <p>
   * @param n the index of the {@link FbcAssociation} to remove.
   <p>
   * @see #getNumAssociations()
   */ public
 FbcAssociation removeAssociation(long n) {
	return (FbcAssociation) libsbml.DowncastSBase(libsbmlJNI.FbcAnd_removeAssociation__SWIG_0(swigCPtr, this, n), true);
}

  
/**
   * Removes the {@link FbcAssociation} with the given identifier from the 
   * {@link ListOfFbcAssociations} within this {@link FbcAnd} and returns a pointer to it.
   <p>
   * The caller owns the returned item and is responsible for deleting it.
   * If none of the items in this list have the identifier <code>sid</code>, then
   * <code>null</code> is returned.
   <p>
   * @param sid the identifier of the {@link FbcAssociation} to remove.
   <p>
   * @return the {@link FbcAssociation} removed. As mentioned above, the caller owns the
   * returned item.
   */ public
 FbcAssociation removeAssociation(String sid) {
	return (FbcAssociation) libsbml.DowncastSBase(libsbmlJNI.FbcAnd_removeAssociation__SWIG_1(swigCPtr, this, sid), true);
}

  
/**
   * Returns the XML element name of this object.
   <p>
   * For {@link FbcAnd}, the XML element name is always <code>'fbcAnd'.</code>
   <p>
   * @return the name of this element, i.e. <code>'fbcAnd'.</code>
   */ public
 String getElementName() {
    return libsbmlJNI.FbcAnd_getElementName(swigCPtr, this);
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
   * {@link libsbmlConstants#SBML_FBC_AND SBML_FBC_AND} (default).
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
    return libsbmlJNI.FbcAnd_getTypeCode(swigCPtr, this);
  }

  
/**
   * Predicate returning <code>true</code> if all the required attributes
   * for this {@link FbcAnd} object have been set.  Will always return
   * <code>true</code>, since {@link FbcOr} has no required attributes.
   <p>
   * @return a boolean value indicating whether all the required
   * attributes for this object have been defined.
   */ public
 boolean hasRequiredAttributes() {
    return libsbmlJNI.FbcAnd_hasRequiredAttributes(swigCPtr, this);
  }

  
/**
   * Predicate returning <code>true</code> if all the required elements
   * for this {@link FbcAnd} object have been set.
   <p>
   * @note An {@link FbcAnd} object must have at least two {@link FbcAssociation}
   * children.
   <p>
   * @return a boolean value indicating whether all the required
   * elements for this object have been defined.
   */ public
 boolean hasRequiredElements() {
    return libsbmlJNI.FbcAnd_hasRequiredElements(swigCPtr, this);
  }

  
/** * @internal */ public
 void connectToChild() {
    libsbmlJNI.FbcAnd_connectToChild(swigCPtr, this);
  }

  
/** * @internal */ public
 void enablePackageInternal(String pkgURI, String pkgPrefix, boolean flag) {
    libsbmlJNI.FbcAnd_enablePackageInternal(swigCPtr, this, pkgURI, pkgPrefix, flag);
  }

}