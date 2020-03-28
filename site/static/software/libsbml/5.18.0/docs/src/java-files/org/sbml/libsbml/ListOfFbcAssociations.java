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
 A list of {@link FbcAssociation} objects.
 <p>
 * <p style='color: #777; font-style: italic'>
This class of objects is defined by libSBML only and has no direct
equivalent in terms of SBML components.  This class is not prescribed by
the SBML specifications, although it is used to implement features
defined in SBML.
</p>

 <p>
 * The {@link ListOfFbcAssociations} is a container of {@link FbcAssociation} objects for the
 * {@link FbcAnd} and {@link FbcOr} classes.  Unlike the ListOf___ classes in SBML, the
 * {@link ListOfFbcAssociations} is not a class that appears in the &ldquo;fbc&rdquo;
 * Version&nbsp;2 specification, and instead is used internally in libSBML as
 * a convenience class to store arbitrary numbers of {@link FbcAssociation} objects.
 * Also unlike other ListOf___ classes, the {@link FbcAnd} and {@link FbcOr} classes require
 * at least two child {@link FbcAssociation} objects, so valid {@link ListOfFbcAssociations}
 * libsbml objects will always contain two or more children.  These children
 * will have element names associated with their derived class, not the base
 * {@link FbcAssociation} class: <code>&lt;fbc:and&gt;</code>,
 * <code>&lt;fbc:or&gt;</code>, and <code>&lt;fbc:geneProductRef&gt;</code>.
 <p>
 * <p>
 * @note This class of objects was introduced in Version&nbsp;2 of the
 * SBML Level&nbsp;3 Flux Balance Constraints (&ldquo;fbc&rdquo;)
 * specification.  In Version&nbsp;1 of &ldquo;fbc&rdquo;, the information
 * encoded by this class can be stored instead using the {@link Association} and
 * {@link GeneAssociation} annotation classes.  Please see the Version&nbsp;1 and
 * Version&nbsp;2 &ldquo;fbc&rdquo; specifications for more details.
 <p>
 * @warning It is important to be clear that <em>ListOfFbcAssociations is not
 * written out in the XML output produced by libSBML</em>&mdash;the
 * constructs only exist in software to enable software applications to
 * manipulate {@link FbcAssociation} objects in a way that mirrors how other lists of
 * components in SBML are manipulated.  {@link ListOfFbcAssociations} is abstracted
 * away when an SBML &ldquo;fbc&rdquo; model file is actually written out in
 * the final XML form.
 <p>
 * @see FbcAssociation
 * @see FbcAnd
 * @see FbcOr
 * @see GeneProductRef
 */

public class ListOfFbcAssociations extends ListOf {
   private long swigCPtr;

   protected ListOfFbcAssociations(long cPtr, boolean cMemoryOwn)
   {
     super(libsbmlJNI.ListOfFbcAssociations_SWIGUpcast(cPtr), cMemoryOwn);
     swigCPtr = cPtr;
   }

   protected static long getCPtr(ListOfFbcAssociations obj)
   {
     return (obj == null) ? 0 : obj.swigCPtr;
   }

   protected static long getCPtrAndDisown (ListOfFbcAssociations obj)
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
        libsbmlJNI.delete_ListOfFbcAssociations(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  
/**
   * Creates a new {@link ListOfFbcAssociations} with the given SBML Level, Version,
   * and &ldquo;fbc&rdquo;package version.
   <p>
   * @param level a long integer, the SBML Level to assign to this
   * {@link ListOfFbcAssociations}.
   <p>
   * @param version a long integer, the SBML Version to assign to this
   * {@link ListOfFbcAssociations}.
   <p>
   * @param pkgVersion a long integer, the SBML &ldquo;fbc&rdquo; package
   * Version to assign to this {@link ListOfFbcAssociations}.
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
 ListOfFbcAssociations(long level, long version, long pkgVersion) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ListOfFbcAssociations__SWIG_0(level, version, pkgVersion), true);
  }

  
/**
   * Creates a new {@link ListOfFbcAssociations} with the given SBML Level, Version,
   * and &ldquo;fbc&rdquo;package version.
   <p>
   * @param level a long integer, the SBML Level to assign to this
   * {@link ListOfFbcAssociations}.
   <p>
   * @param version a long integer, the SBML Version to assign to this
   * {@link ListOfFbcAssociations}.
   <p>
   * @param pkgVersion a long integer, the SBML &ldquo;fbc&rdquo; package
   * Version to assign to this {@link ListOfFbcAssociations}.
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
 ListOfFbcAssociations(long level, long version) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ListOfFbcAssociations__SWIG_1(level, version), true);
  }

  
/**
   * Creates a new {@link ListOfFbcAssociations} with the given SBML Level, Version,
   * and &ldquo;fbc&rdquo;package version.
   <p>
   * @param level a long integer, the SBML Level to assign to this
   * {@link ListOfFbcAssociations}.
   <p>
   * @param version a long integer, the SBML Version to assign to this
   * {@link ListOfFbcAssociations}.
   <p>
   * @param pkgVersion a long integer, the SBML &ldquo;fbc&rdquo; package
   * Version to assign to this {@link ListOfFbcAssociations}.
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
 ListOfFbcAssociations(long level) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ListOfFbcAssociations__SWIG_2(level), true);
  }

  
/**
   * Creates a new {@link ListOfFbcAssociations} with the given SBML Level, Version,
   * and &ldquo;fbc&rdquo;package version.
   <p>
   * @param level a long integer, the SBML Level to assign to this
   * {@link ListOfFbcAssociations}.
   <p>
   * @param version a long integer, the SBML Version to assign to this
   * {@link ListOfFbcAssociations}.
   <p>
   * @param pkgVersion a long integer, the SBML &ldquo;fbc&rdquo; package
   * Version to assign to this {@link ListOfFbcAssociations}.
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
 ListOfFbcAssociations() throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ListOfFbcAssociations__SWIG_3(), true);
  }

  
/**
   * Creates a new {@link ListOfFbcAssociations} with the given {@link FbcPkgNamespaces}
   * object.
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
 ListOfFbcAssociations(FbcPkgNamespaces fbcns) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ListOfFbcAssociations__SWIG_4(FbcPkgNamespaces.getCPtr(fbcns), fbcns), true);
  }

  
/**
   * Creates and returns a deep copy of this {@link ListOfFbcAssociations} object.
   <p>
   * @return a (deep) copy of this {@link ListOfFbcAssociations} object.
   */ public
 ListOfFbcAssociations cloneObject() {
    long cPtr = libsbmlJNI.ListOfFbcAssociations_cloneObject(swigCPtr, this);
    return (cPtr == 0) ? null : new ListOfFbcAssociations(cPtr, true);
  }

  
/**
   * Get a {@link FbcAssociation} from the {@link ListOfFbcAssociations}.
   <p>
   * @param n the index number of the {@link FbcAssociation} to get.
   <p>
   * @return the nth {@link FbcAssociation} in this {@link ListOfFbcAssociations}.
   * If the index <code>n</code> is invalid, <code>null</code> is returned.
   <p>
   * @see #size()
   * @see #getNumFbcAssociations()
   */ public
 FbcAssociation get(long n) {
	return (FbcAssociation) libsbml.DowncastSBase(libsbmlJNI.ListOfFbcAssociations_get__SWIG_0(swigCPtr, this, n), false);
}

  
/**
   * Get a {@link FbcAssociation} from the {@link ListOfFbcAssociations} based on its
   * identifier.
   <p>
   * @param sid a string representing the identifier of the {@link FbcAssociation} to
   * get.
   <p>
   * @return {@link FbcAssociation} in this {@link ListOfFbcAssociations} with the given id
   * or <code>null</code> if no such {@link FbcAssociation} exists.
   <p>
   * @see #get(long n)
   * @see #size()
   */ public
 FbcAssociation get(String sid) {
	return (FbcAssociation) libsbml.DowncastSBase(libsbmlJNI.ListOfFbcAssociations_get__SWIG_2(swigCPtr, this, sid), false);
}

  
/**
   * Adds a copy the given {@link FbcAssociation} object to this
   * {@link ListOfFbcAssociations}.
   <p>
   * @param fa the {@link FbcAssociation} object to add.
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
 int addFbcAssociation(FbcAssociation fa) {
    return libsbmlJNI.ListOfFbcAssociations_addFbcAssociation(swigCPtr, this, FbcAssociation.getCPtr(fa), fa);
  }

  
/**
   * Get the number of {@link FbcAssociation} objects in this {@link ListOfFbcAssociations}.
   <p>
   * @return the number of {@link FbcAssociation} objects in this
   * {@link ListOfFbcAssociations}.
   */ public
 long getNumFbcAssociations() {
    return libsbmlJNI.ListOfFbcAssociations_getNumFbcAssociations(swigCPtr, this);
  }

  
/**
   * Creates a new {@link FbcAnd} object.
   <p>
   * This method creates a new {@link FbcAssociation} object of subclass {@link FbcAnd}, adds
   * it to the {@link ListOfFbcAssociations}, and returns the {@link FbcAssociation} object
   * created.
   <p>
   * @return a new {@link FbcAssociation} object instance.
   <p>
   * @see #createOr()
   * @see #createGeneProductRef()
   * @see #addFbcAssociation(FbcAssociation fa)
   */ public
 FbcAnd createAnd() {
    long cPtr = libsbmlJNI.ListOfFbcAssociations_createAnd(swigCPtr, this);
    return (cPtr == 0) ? null : new FbcAnd(cPtr, false);
  }

  
/**
   * Creates a new {@link FbcOr} object.
   <p>
   * This method creates a new {@link FbcAssociation} object of subclass {@link FbcOr}, adds
   * it to the {@link ListOfFbcAssociations}, and returns the {@link FbcAssociation} object
   * created.
   <p>
   * @return a new {@link FbcAssociation} object instance.
   <p>
   * @see #createAnd()
   * @see #createGeneProductRef()
   * @see #addFbcAssociation(FbcAssociation fa)
   */ public
 FbcOr createOr() {
    long cPtr = libsbmlJNI.ListOfFbcAssociations_createOr(swigCPtr, this);
    return (cPtr == 0) ? null : new FbcOr(cPtr, false);
  }

  
/**
   * Creates a new {@link GeneProductRef} object.
   <p>
   * This method creates a new {@link FbcAssociation} object of subclass
   * {@link GeneProductRef}, adds it to the {@link ListOfFbcAssociations}, and returns the
   * {@link FbcAssociation} object created.
   <p>
   * @return a new {@link FbcAssociation} object instance.
   <p>
   * @see #createOr()
   * @see #createAnd()
   * @see #addFbcAssociation(FbcAssociation fa)
   */ public
 GeneProductRef createGeneProductRef() {
    long cPtr = libsbmlJNI.ListOfFbcAssociations_createGeneProductRef(swigCPtr, this);
    return (cPtr == 0) ? null : new GeneProductRef(cPtr, false);
  }

  
/**
   * Removes the nth {@link FbcAssociation}
   <p>
   * This method removes the nth object from this {@link ListOfFbcAssociations} and
   * returns a pointer to it.
   <p>
   * @param n the index of the {@link FbcAssociation} to remove.
   <p>
   * @see #size()
   */ public
 FbcAssociation remove(long n) {
	return (FbcAssociation) libsbml.DowncastSBase(libsbmlJNI.ListOfFbcAssociations_remove__SWIG_0(swigCPtr, this, n), true);
}

  
/**
   * Removes the {@link FbcAssociation} with the given identifier
   <p>
   * This method searches for and removes the {@link FbcAssociation} object with the
   * given identifier <code>sid</code>, and returns a pointer to it.  The caller owns
   * the returned item and is responsible for deleting it.  If none of the
   * items in this list have the identifier <code>sid</code>, then <code>null</code> is returned.
   <p>
   * @param sid the identifier of the {@link FbcAssociation} to remove.
   <p>
   * @return the {@link FbcAssociation} removed. As mentioned above, the caller owns
   * the returned item.
   */ public
 FbcAssociation remove(String sid) {
	return (FbcAssociation) libsbml.DowncastSBase(libsbmlJNI.ListOfFbcAssociations_remove__SWIG_1(swigCPtr, this, sid), true);
}

  
/**
   * Returns the XML element name of this object.
   <p>
   * For {@link ListOfFbcAssociations}, the XML element name is always
   * <code>'listOfFbcAssociations'.</code>
   <p>
   * @return the name of this element.
   */ public
 String getElementName() {
    return libsbmlJNI.ListOfFbcAssociations_getElementName(swigCPtr, this);
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
   * {@link libsbmlConstants#SBML_LIST_OF SBML_LIST_OF} (default).
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
    return libsbmlJNI.ListOfFbcAssociations_getTypeCode(swigCPtr, this);
  }

  
/**
   * Returns the libSBML type code for the objects contained in this {@link ListOf}.
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
   * @return the SBML type code for the objects contained in this {@link ListOf}
   * instance: {@link libsbmlConstants#SBML_FBC_ASSOCIATION SBML_FBC_ASSOCIATION} (default).
   <p>
   * @see #getElementName()
   * @see #getPackageName()
   */ public
 int getItemTypeCode() {
    return libsbmlJNI.ListOfFbcAssociations_getItemTypeCode(swigCPtr, this);
  }

}
