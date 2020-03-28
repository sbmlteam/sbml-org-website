/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.sbml.libsbml;

/** 
 * <span class="pkg-marker pkg-color-layout"><a href="group__layout.html">layout</a></span>

 A list of {@link GraphicalObject} objects.
 <p>
 * The {@link ListOfGraphicalObjects} class in libSBML actually represents the
 * ListOfAdditionalGraphicalObjects class in the &ldquo;layout&rdquo;
 * package, and is a container for the additional {@link GraphicalObject} elements of
 * a {@link Layout}.
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
 * @see GraphicalObject
 */

public class ListOfGraphicalObjects extends ListOf {
   private long swigCPtr;

   protected ListOfGraphicalObjects(long cPtr, boolean cMemoryOwn)
   {
     super(libsbmlJNI.ListOfGraphicalObjects_SWIGUpcast(cPtr), cMemoryOwn);
     swigCPtr = cPtr;
   }

   protected static long getCPtr(ListOfGraphicalObjects obj)
   {
     return (obj == null) ? 0 : obj.swigCPtr;
   }

   protected static long getCPtrAndDisown (ListOfGraphicalObjects obj)
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
        libsbmlJNI.delete_ListOfGraphicalObjects(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  
/**
   * Creates and returns a deep copy of this {@link ListOfGraphicalObjects}.
   <p>
   * @return a (deep) copy of this {@link ListOfGraphicalObjects}.
   */ public
 ListOfGraphicalObjects cloneObject() {
    long cPtr = libsbmlJNI.ListOfGraphicalObjects_cloneObject(swigCPtr, this);
    return (cPtr == 0) ? null : new ListOfGraphicalObjects(cPtr, true);
  }

  
/**
   * Constructor.
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
 ListOfGraphicalObjects(long level, long version, long pkgVersion) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ListOfGraphicalObjects__SWIG_0(level, version, pkgVersion), true);
  }

  
/**
   * Constructor.
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
 ListOfGraphicalObjects(long level, long version) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ListOfGraphicalObjects__SWIG_1(level, version), true);
  }

  
/**
   * Constructor.
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
 ListOfGraphicalObjects(long level) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ListOfGraphicalObjects__SWIG_2(level), true);
  }

  
/**
   * Constructor.
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
 ListOfGraphicalObjects() throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ListOfGraphicalObjects__SWIG_3(), true);
  }

  
/**
   * Constructor.
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
   * @param layoutns the {@link LayoutPkgNamespaces} object.
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
 ListOfGraphicalObjects(LayoutPkgNamespaces layoutns) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_ListOfGraphicalObjects__SWIG_4(LayoutPkgNamespaces.getCPtr(layoutns), layoutns), true);
  }

  
/**
   * Returns the libSBML type code for the SBML objects
   * contained in this {@link ListOf} object.
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
   * @return the SBML type code for objects contained in this list:
   * {@link libsbmlConstants#SBML_LAYOUT_GRAPHICALOBJECT SBML_LAYOUT_GRAPHICALOBJECT} (default).
   <p>
   * @see #getElementName()
   * @see #getPackageName()
   */ public
 int getItemTypeCode() {
    return libsbmlJNI.ListOfGraphicalObjects_getItemTypeCode(swigCPtr, this);
  }

  
/**
   * Returns the XML element name of
   * this SBML object.
   <p>
   * @return the string of the name of this element.
   */ public
 String getElementName() {
    return libsbmlJNI.ListOfGraphicalObjects_getElementName(swigCPtr, this);
  }

  
/** * @internal */ public
 void setElementName(String elementName) {
    libsbmlJNI.ListOfGraphicalObjects_setElementName(swigCPtr, this, elementName);
  }

  
/**
   * Get a {@link GraphicalObject} from the {@link ListOfGraphicalObjects}.
   <p>
   * @param n the index number of the {@link GraphicalObject} to get.
   <p>
   * @return the nth {@link GraphicalObject} in this {@link ListOfGraphicalObjects}.
   * If the index <code>n</code> is invalid, <code>null</code> is returned.
   <p>
   * @see #size()
   */ public
 GraphicalObject get(long n) {
	return (GraphicalObject) libsbml.DowncastSBase(libsbmlJNI.ListOfGraphicalObjects_get__SWIG_0(swigCPtr, this, n), false);
}

  
/**
   * Get a {@link GraphicalObject} from the {@link ListOfGraphicalObjects}
   * based on its identifier.
   <p>
   * @param sid a string representing the identifier 
   * of the {@link GraphicalObject} to get.
   <p>
   * @return {@link GraphicalObject} in this {@link ListOfGraphicalObjects}
   * with the given <code>sid</code> or <code>null</code> if no such
   * {@link GraphicalObject} exists.
   <p>
   * @see #get(long n)
   * @see #size()
   */ public
 GraphicalObject get(String sid) {
	return (GraphicalObject) libsbml.DowncastSBase(libsbmlJNI.ListOfGraphicalObjects_get__SWIG_2(swigCPtr, this, sid), false);
}

  
/**
   * Removes the nth item from this {@link ListOfGraphicalObjects} items and returns a pointer to
   * it.
   <p>
   * The caller owns the returned item and is responsible for deleting it.
   <p>
   * @param n the index of the item to remove.
   <p>
   * @see #size()
   */ public
 GraphicalObject remove(long n) {
	return (GraphicalObject) libsbml.DowncastSBase(libsbmlJNI.ListOfGraphicalObjects_remove__SWIG_0(swigCPtr, this, n), true);
}

  
/**
   * Removes item in this {@link ListOfGraphicalObjects} items with the given identifier.
   <p>
   * The caller owns the returned item and is responsible for deleting it.
   * If none of the items in this list have the identifier <code>sid</code>, then
   * <code>null</code> is returned.
   <p>
   * @param sid the identifier of the item to remove.
   <p>
   * @return the item removed.  As mentioned above, the caller owns the
   * returned item.
   */ public
 GraphicalObject remove(String sid) {
	return (GraphicalObject) libsbml.DowncastSBase(libsbmlJNI.ListOfGraphicalObjects_remove__SWIG_1(swigCPtr, this, sid), true);
}

  
/**
    * Creates an {@link XMLNode} object from this.
    */ public
 XMLNode toXML() {
    return new XMLNode(libsbmlJNI.ListOfGraphicalObjects_toXML(swigCPtr, this), true);
  }

}
