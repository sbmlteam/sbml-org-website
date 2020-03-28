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
 A list of {@link GeneProduct} objects.
 <p>
 * The {@link ListOfGeneProducts} is a container for the SBML extended {@link Model}
 * that lists all the possible {@link GeneProduct} elements in the model.  These
 * {@link GeneProduct} elements are referenced in the {@link GeneProductAssociation} child
 * of an extended {@link Reaction}.
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
 * 
 * <p>
 * @note This class of objects was introduced in Version&nbsp;2 of the
 * SBML Level&nbsp;3 Flux Balance Constraints (&ldquo;fbc&rdquo;)
 * specification.  In Version&nbsp;1 of &ldquo;fbc&rdquo;, the information
 * encoded by this class can be stored instead using the {@link Association} and
 * {@link GeneAssociation} annotation classes.  Please see the Version&nbsp;1 and
 * Version&nbsp;2 &ldquo;fbc&rdquo; specifications for more details.
 <p>
   * @see GeneProduct
 * @see FbcModelPlugin
 */

public class ListOfGeneProducts extends ListOf {
   private long swigCPtr;

   protected ListOfGeneProducts(long cPtr, boolean cMemoryOwn)
   {
     super(libsbmlJNI.ListOfGeneProducts_SWIGUpcast(cPtr), cMemoryOwn);
     swigCPtr = cPtr;
   }

   protected static long getCPtr(ListOfGeneProducts obj)
   {
     return (obj == null) ? 0 : obj.swigCPtr;
   }

   protected static long getCPtrAndDisown (ListOfGeneProducts obj)
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
        libsbmlJNI.delete_ListOfGeneProducts(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  
/**
   * Creates a new {@link GeneProduct} with the given SBML Level, Version, and
   * &ldquo;fbc&rdquo;package version.
   <p>
   * @param level a long integer, the SBML Level to assign to this
   * {@link ListOfGeneProducts}.
   <p>
   * @param version a long integer, the SBML Version to assign to this
   * {@link ListOfGeneProducts}.
   <p>
   * @param pkgVersion a long integer, the SBML Fbc Version to assign to
   * this {@link ListOfGeneProducts}.
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
 ListOfGeneProducts(long level, long version, long pkgVersion) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ListOfGeneProducts__SWIG_0(level, version, pkgVersion), true);
  }

  
/**
   * Creates a new {@link GeneProduct} with the given SBML Level, Version, and
   * &ldquo;fbc&rdquo;package version.
   <p>
   * @param level a long integer, the SBML Level to assign to this
   * {@link ListOfGeneProducts}.
   <p>
   * @param version a long integer, the SBML Version to assign to this
   * {@link ListOfGeneProducts}.
   <p>
   * @param pkgVersion a long integer, the SBML Fbc Version to assign to
   * this {@link ListOfGeneProducts}.
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
 ListOfGeneProducts(long level, long version) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ListOfGeneProducts__SWIG_1(level, version), true);
  }

  
/**
   * Creates a new {@link GeneProduct} with the given SBML Level, Version, and
   * &ldquo;fbc&rdquo;package version.
   <p>
   * @param level a long integer, the SBML Level to assign to this
   * {@link ListOfGeneProducts}.
   <p>
   * @param version a long integer, the SBML Version to assign to this
   * {@link ListOfGeneProducts}.
   <p>
   * @param pkgVersion a long integer, the SBML Fbc Version to assign to
   * this {@link ListOfGeneProducts}.
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
 ListOfGeneProducts(long level) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ListOfGeneProducts__SWIG_2(level), true);
  }

  
/**
   * Creates a new {@link GeneProduct} with the given SBML Level, Version, and
   * &ldquo;fbc&rdquo;package version.
   <p>
   * @param level a long integer, the SBML Level to assign to this
   * {@link ListOfGeneProducts}.
   <p>
   * @param version a long integer, the SBML Version to assign to this
   * {@link ListOfGeneProducts}.
   <p>
   * @param pkgVersion a long integer, the SBML Fbc Version to assign to
   * this {@link ListOfGeneProducts}.
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
 ListOfGeneProducts() throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ListOfGeneProducts__SWIG_3(), true);
  }

  
/**
   * Creates a new {@link ListOfGeneProducts} with the given {@link FbcPkgNamespaces} object.
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
 ListOfGeneProducts(FbcPkgNamespaces fbcns) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ListOfGeneProducts__SWIG_4(FbcPkgNamespaces.getCPtr(fbcns), fbcns), true);
  }

  
/**
   * Creates and returns a deep copy of this {@link ListOfGeneProducts} object.
   <p>
   * @return a (deep) copy of this {@link ListOfGeneProducts} object.
   */ public
 ListOfGeneProducts cloneObject() {
    long cPtr = libsbmlJNI.ListOfGeneProducts_cloneObject(swigCPtr, this);
    return (cPtr == 0) ? null : new ListOfGeneProducts(cPtr, true);
  }

  
/**
   * Get a {@link GeneProduct} from the {@link ListOfGeneProducts}.
   <p>
   * @param n the index number of the {@link GeneProduct} to get.
   <p>
   * @return the nth {@link GeneProduct} in this {@link ListOfGeneProducts}.
   * If the index <code>n</code> is invalid, <code>null</code> is returned.
   <p>
   * @see #size()
   */ public
 GeneProduct get(long n) {
    long cPtr = libsbmlJNI.ListOfGeneProducts_get__SWIG_0(swigCPtr, this, n);
    return (cPtr == 0) ? null : new GeneProduct(cPtr, false);
  }

  
/**
   * Get a {@link GeneProduct} from the {@link ListOfGeneProducts} based on its identifier.
   <p>
   * @param sid a string representing the identifier of the {@link GeneProduct} to
   * get.
   <p>
   * @return {@link GeneProduct} in this {@link ListOfGeneProducts} with the given id or <code>null</code>
   * if no such {@link GeneProduct} exists.
   <p>
   * @see #get(long n)
   * @see #size()
   */ public
 GeneProduct get(String sid) {
    long cPtr = libsbmlJNI.ListOfGeneProducts_get__SWIG_2(swigCPtr, this, sid);
    return (cPtr == 0) ? null : new GeneProduct(cPtr, false);
  }

  
/**
   * Adds a copy the given {@link GeneProduct} to this {@link ListOfGeneProducts}.
   <p>
   * @param gp the {@link GeneProduct} object to add.
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
 int addGeneProduct(GeneProduct gp) {
    return libsbmlJNI.ListOfGeneProducts_addGeneProduct(swigCPtr, this, GeneProduct.getCPtr(gp), gp);
  }

  
/**
   * Get the number of {@link GeneProduct} objects in this {@link ListOfGeneProducts}.
   <p>
   * @return the number of {@link GeneProduct} objects in this {@link ListOfGeneProducts}.
   */ public
 long getNumGeneProducts() {
    return libsbmlJNI.ListOfGeneProducts_getNumGeneProducts(swigCPtr, this);
  }

  
/**
   * Creates a new {@link GeneProduct} object, adds it to the {@link ListOfGeneProducts} and
   * returns the {@link GeneProduct} object created.
   <p>
   * @return a new {@link GeneProduct} object instance.
   <p>
   * @see #addGeneProduct(GeneProduct gp)
   */ public
 GeneProduct createGeneProduct() {
    long cPtr = libsbmlJNI.ListOfGeneProducts_createGeneProduct(swigCPtr, this);
    return (cPtr == 0) ? null : new GeneProduct(cPtr, false);
  }

  
/**
   * Removes the nth {@link GeneProduct} from this {@link ListOfGeneProducts}
   * and returns a pointer to it.
   <p>
   * The caller owns the returned item and is responsible for deleting it.
   <p>
   * @param n the index of the {@link GeneProduct} to remove.
   <p>
   * @see #size()
   */ public
 GeneProduct remove(long n) {
    long cPtr = libsbmlJNI.ListOfGeneProducts_remove__SWIG_0(swigCPtr, this, n);
    return (cPtr == 0) ? null : new GeneProduct(cPtr, true);
  }

  
/**
   * Removes the {@link GeneProduct} from this {@link ListOfGeneProducts} with the given
   * identifier and returns a pointer to it.
   <p>
   * The caller owns the returned item and is responsible for deleting it.
   * If none of the items in this list have the identifier <code>sid</code>, then
   * <code>null</code> is returned.
   <p>
   * @param sid the identifier of the {@link GeneProduct} to remove.
   <p>
   * @return the {@link GeneProduct} removed. As mentioned above, the caller owns the
   * returned item.
   */ public
 GeneProduct remove(String sid) {
    long cPtr = libsbmlJNI.ListOfGeneProducts_remove__SWIG_1(swigCPtr, this, sid);
    return (cPtr == 0) ? null : new GeneProduct(cPtr, true);
  }

  
/**
   * Returns the XML element name of this object.
   <p>
   * For {@link ListOfGeneProducts}, the XML element name is always
   * <code>'listOfGeneProducts'.</code>
   <p>
   * @return the name of this element, i.e. <code>'listOfGeneProducts'.</code>
   */ public
 String getElementName() {
    return libsbmlJNI.ListOfGeneProducts_getElementName(swigCPtr, this);
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
    return libsbmlJNI.ListOfGeneProducts_getTypeCode(swigCPtr, this);
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
   * instance: {@link libsbmlConstants#SBML_FBC_GENEPRODUCT SBML_FBC_GENEPRODUCT} (default).
   <p>
   * @see #getElementName()
   * @see #getPackageName()
   */ public
 int getItemTypeCode() {
    return libsbmlJNI.ListOfGeneProducts_getItemTypeCode(swigCPtr, this);
  }

}
