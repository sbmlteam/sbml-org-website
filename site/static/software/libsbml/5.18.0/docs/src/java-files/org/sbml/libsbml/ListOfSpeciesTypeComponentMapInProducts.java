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
 A list of {@link SpeciesTypeComponentMapInProduct} objects.
 <p>
 * The {@link ListOfSpeciesTypeComponentMapInProducts} is a container for
 * {@link SpeciesTypeComponentMapInProduct} objects.
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
 * @see SpeciesTypeComponentMapInProduct
 */

public class ListOfSpeciesTypeComponentMapInProducts extends ListOf {
   private long swigCPtr;

   protected ListOfSpeciesTypeComponentMapInProducts(long cPtr, boolean cMemoryOwn)
   {
     super(libsbmlJNI.ListOfSpeciesTypeComponentMapInProducts_SWIGUpcast(cPtr), cMemoryOwn);
     swigCPtr = cPtr;
   }

   protected static long getCPtr(ListOfSpeciesTypeComponentMapInProducts obj)
   {
     return (obj == null) ? 0 : obj.swigCPtr;
   }

   protected static long getCPtrAndDisown (ListOfSpeciesTypeComponentMapInProducts obj)
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
        libsbmlJNI.delete_ListOfSpeciesTypeComponentMapInProducts(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  
/**
   * Creates a new {@link ListOfSpeciesTypeComponentMapInProducts} object.
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
 ListOfSpeciesTypeComponentMapInProducts(long level, long version, long pkgVersion) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ListOfSpeciesTypeComponentMapInProducts__SWIG_0(level, version, pkgVersion), true);
  }

  
/**
   * Creates a new {@link ListOfSpeciesTypeComponentMapInProducts} object.
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
 ListOfSpeciesTypeComponentMapInProducts(long level, long version) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ListOfSpeciesTypeComponentMapInProducts__SWIG_1(level, version), true);
  }

  
/**
   * Creates a new {@link ListOfSpeciesTypeComponentMapInProducts} object.
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
 ListOfSpeciesTypeComponentMapInProducts(long level) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ListOfSpeciesTypeComponentMapInProducts__SWIG_2(level), true);
  }

  
/**
   * Creates a new {@link ListOfSpeciesTypeComponentMapInProducts} object.
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
 ListOfSpeciesTypeComponentMapInProducts() throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ListOfSpeciesTypeComponentMapInProducts__SWIG_3(), true);
  }

  
/**
   * Creates a new {@link ListOfSpeciesTypeComponentMapInProducts} with the given
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
 ListOfSpeciesTypeComponentMapInProducts(MultiPkgNamespaces multins) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ListOfSpeciesTypeComponentMapInProducts__SWIG_4(MultiPkgNamespaces.getCPtr(multins), multins), true);
  }

  
/**
   * Creates and returns a deep copy of this
   * {@link ListOfSpeciesTypeComponentMapInProducts} object.
   <p>
   * @return a (deep) copy of this {@link ListOfSpeciesTypeComponentMapInProducts} object.
   */ public
 ListOfSpeciesTypeComponentMapInProducts cloneObject() {
    long cPtr = libsbmlJNI.ListOfSpeciesTypeComponentMapInProducts_cloneObject(swigCPtr, this);
    return (cPtr == 0) ? null : new ListOfSpeciesTypeComponentMapInProducts(cPtr, true);
  }

  
/**
   * Get the nth {@link SpeciesTypeComponentMapInProduct} object from the
   * {@link ListOfSpeciesTypeComponentMapInProducts}.
   <p>
   * @param n the index number of the {@link SpeciesTypeComponentMapInProduct} to get.
   <p>
   * @return the nth object, or <code>null</code> if the index <code>is</code> out of range.
   <p>
   * @see #size()
   */ public
 SpeciesTypeComponentMapInProduct get(long n) {
    long cPtr = libsbmlJNI.ListOfSpeciesTypeComponentMapInProducts_get__SWIG_0(swigCPtr, this, n);
    return (cPtr == 0) ? null : new SpeciesTypeComponentMapInProduct(cPtr, false);
  }

  
/**
   * Get the {@link SpeciesTypeComponentMapInProduct} object with the given
   * identifier <code>sid</code>.
   <p>
   * @param sid a string representing the identifier
   * of the {@link SpeciesTypeComponentMapInProduct} to get.
   <p>
   * @return the object with the given id, or <code>null</code> if no such object exists.
   <p>
   * @see #get(long n)
   * @see #size()
   */ public
 SpeciesTypeComponentMapInProduct get(String sid) {
    long cPtr = libsbmlJNI.ListOfSpeciesTypeComponentMapInProducts_get__SWIG_2(swigCPtr, this, sid);
    return (cPtr == 0) ? null : new SpeciesTypeComponentMapInProduct(cPtr, false);
  }

  
/**
   * Removes the nth {@link SpeciesTypeComponentMapInProduct} object from this
   * {@link ListOfSpeciesTypeComponentMapInProducts}.
   <p>
   * @param n the index of the {@link SpeciesTypeComponentMapInProduct} to remove.
   <p>
   * @return the object removed, or <code>null</code> if no such object exists.  Note that
   * the caller owns the returned object and is responsible for deleting it.
   <p>
   * @see #size()
   */ public
 SpeciesTypeComponentMapInProduct remove(long n) {
    long cPtr = libsbmlJNI.ListOfSpeciesTypeComponentMapInProducts_remove__SWIG_0(swigCPtr, this, n);
    return (cPtr == 0) ? null : new SpeciesTypeComponentMapInProduct(cPtr, true);
  }

  
/**
   * Removes the {@link SpeciesTypeComponentMapInProduct} object with the given
   * identifier <code>sid</code>.
   <p>
   * @param sid the identifier of the {@link SpeciesTypeComponentMapInProduct} to remove.
   <p>
   * @return the object removed, or <code>null</code> if no such object exists.  Note that
   * the caller owns the returned object and is responsible for deleting it.
   */ public
 SpeciesTypeComponentMapInProduct remove(String sid) {
    long cPtr = libsbmlJNI.ListOfSpeciesTypeComponentMapInProducts_remove__SWIG_1(swigCPtr, this, sid);
    return (cPtr == 0) ? null : new SpeciesTypeComponentMapInProduct(cPtr, true);
  }

  
/**
   * Returns the XML element name of this object.
   <p>
   * @return the name of this element, i.e.
   * <code>'listOfSpeciesTypeComponentMapInProducts'.</code>
   */ public
 String getElementName() {
    return libsbmlJNI.ListOfSpeciesTypeComponentMapInProducts_getElementName(swigCPtr, this);
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
    return libsbmlJNI.ListOfSpeciesTypeComponentMapInProducts_getTypeCode(swigCPtr, this);
  }

  
/**
   * Returns the libSBML type code for the objects contained in this {@link ListOf}
   * (i.e., {@link Compartment} objects, if the list is non-empty).
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
   * instance: {@link libsbmlConstants#SBML_COMPARTMENT SBML_COMPARTMENT} (default).
   <p>
   * @see #getElementName()
   * @see #getPackageName()
   */ public
 int getItemTypeCode() {
    return libsbmlJNI.ListOfSpeciesTypeComponentMapInProducts_getItemTypeCode(swigCPtr, this);
  }

}
