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

 Representation of a {@link Polygon}
 <p>
 * The {@link Polygon} is very similar to the {@link RenderCurve} class. The only difference
 * is that in the polygon the end point of the last element in the curve
 * segment list is automatically connected to the start point of the first
 * element.
 <p>
 * Since a polygon is a closed shape and doesn't really have a start or an
 * end, it does not get decorations as the {@link RenderCurve} does.  So, a polygon
 * is always closed and can therefore have a fill style and fill style related
 * attributes.  Those attributes are inherited from the {@link Polygon} base class
 * {@link GraphicalPrimitive2D}.
 */

public class Polygon extends GraphicalPrimitive2D {
   private long swigCPtr;

   protected Polygon(long cPtr, boolean cMemoryOwn)
   {
     super(libsbmlJNI.Polygon_SWIGUpcast(cPtr), cMemoryOwn);
     swigCPtr = cPtr;
   }

   protected static long getCPtr(Polygon obj)
   {
     return (obj == null) ? 0 : obj.swigCPtr;
   }

   protected static long getCPtrAndDisown (Polygon obj)
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
        libsbmlJNI.delete_Polygon(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  
/**
   * Creates a new {@link Polygon} using the given SBML Level, Version and
   * &ldquo;render&rdquo; package version.
   <p>
   * @param level a long integer, the SBML Level to assign to this {@link Polygon}.
   <p>
   * @param version a long integer, the SBML Version to assign to this
   * {@link Polygon}.
   <p>
   * @param pkgVersion a long integer, the SBML Render Version to assign to
   * this {@link Polygon}.
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
 Polygon(long level, long version, long pkgVersion) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_Polygon__SWIG_0(level, version, pkgVersion), true);
  }

  
/**
   * Creates a new {@link Polygon} using the given SBML Level, Version and
   * &ldquo;render&rdquo; package version.
   <p>
   * @param level a long integer, the SBML Level to assign to this {@link Polygon}.
   <p>
   * @param version a long integer, the SBML Version to assign to this
   * {@link Polygon}.
   <p>
   * @param pkgVersion a long integer, the SBML Render Version to assign to
   * this {@link Polygon}.
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
 Polygon(long level, long version) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_Polygon__SWIG_1(level, version), true);
  }

  
/**
   * Creates a new {@link Polygon} using the given SBML Level, Version and
   * &ldquo;render&rdquo; package version.
   <p>
   * @param level a long integer, the SBML Level to assign to this {@link Polygon}.
   <p>
   * @param version a long integer, the SBML Version to assign to this
   * {@link Polygon}.
   <p>
   * @param pkgVersion a long integer, the SBML Render Version to assign to
   * this {@link Polygon}.
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
 Polygon(long level) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_Polygon__SWIG_2(level), true);
  }

  
/**
   * Creates a new {@link Polygon} using the given SBML Level, Version and
   * &ldquo;render&rdquo; package version.
   <p>
   * @param level a long integer, the SBML Level to assign to this {@link Polygon}.
   <p>
   * @param version a long integer, the SBML Version to assign to this
   * {@link Polygon}.
   <p>
   * @param pkgVersion a long integer, the SBML Render Version to assign to
   * this {@link Polygon}.
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
 Polygon() throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_Polygon__SWIG_3(), true);
  }

  
/**
   * Creates a new {@link Polygon} using the given {@link RenderPkgNamespaces} object.
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
 Polygon(RenderPkgNamespaces renderns) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_Polygon__SWIG_4(RenderPkgNamespaces.getCPtr(renderns), renderns), true);
  }

  
/**
   * Creates a new {@link Polygon} object from the given {@link XMLNode} object.
   * The {@link XMLNode} object has to contain a valid XML representation of a 
   * {@link Polygon} object as defined in the render extension specification.
   * This method is normally called when render information is read from a file and 
   * should normally not have to be called explicitly.
   <p>
   * @param node the {@link XMLNode} object reference that describes the {@link Polygon}
   * object to be instantiated.
   <p>
   * @param l2version an integer indicating the version of SBML Level&nbsp;2
   */ public
 Polygon(XMLNode node, long l2version) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_Polygon__SWIG_5(XMLNode.getCPtr(node), node, l2version), true);
  }

  
/**
   * Creates a new {@link Polygon} object from the given {@link XMLNode} object.
   * The {@link XMLNode} object has to contain a valid XML representation of a 
   * {@link Polygon} object as defined in the render extension specification.
   * This method is normally called when render information is read from a file and 
   * should normally not have to be called explicitly.
   <p>
   * @param node the {@link XMLNode} object reference that describes the {@link Polygon}
   * object to be instantiated.
   <p>
   * @param l2version an integer indicating the version of SBML Level&nbsp;2
   */ public
 Polygon(XMLNode node) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_Polygon__SWIG_6(XMLNode.getCPtr(node), node), true);
  }

  
/**
   * Instanciates a polygon with the given <code>id</code> and no elements.
   * All attributes inherited from GraphicalPrimitive are set as described
   * in the corresponding constructor of that class (
   * @param renderns the {@link SBMLNamespaces} object for the SBML 'render' package
   * @param id id string for the polygon
   <p>
   * <p>
 * @warning <span class='warning'>This constructor is deprecated. The new
 * libSBML API uses constructors that either take the SBML Level and Version,
 * <em>or</em> take an {@link SBMLNamespaces} object.</span>
   <p>
   * @see GraphicalPrimitive2D)
   */ public
 Polygon(RenderPkgNamespaces renderns, String id) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_Polygon__SWIG_7(RenderPkgNamespaces.getCPtr(renderns), renderns, id), true);
  }

  
/**
   * Copy constructor for {@link Polygon}.
   <p>
   * @param orig the {@link Polygon} instance to copy.
   */ public
 Polygon(Polygon orig) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_Polygon__SWIG_8(Polygon.getCPtr(orig), orig), true);
  }

  
/**
   * Creates and returns a deep copy of this {@link Polygon} object.
   <p>
   * @return a (deep) copy of this {@link Polygon} object.
   */ public
 Polygon cloneObject() {
    long cPtr = libsbmlJNI.Polygon_cloneObject(swigCPtr, this);
    return (cPtr == 0) ? null : new Polygon(cPtr, true);
  }

  
/**
   * Returns the {@link ListOfCurveElements} from this {@link Polygon}.
   <p>
   * @return the {@link ListOfCurveElements} from this {@link Polygon}.
   <p>
   * <p>
 * @note
 * The pointer that is returned by this function is not owned by the caller,
 * but may be queried and modified.  Any changes made will be reflected in any
 * resulting SBML document containing the pointer's parent.
   <p>
   * @see #addElement(RenderPoint object)
   * @see #createCubicBezier()
   * @see #getElementBySId(String sid)
   * @see #getElement(long n)
   * @see #getNumElements()
   * @see #removeElement(String sid)
   * @see #removeElement(long n)
   */ public
 ListOfCurveElements getListOfElements() {
    long cPtr = libsbmlJNI.Polygon_getListOfElements__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new ListOfCurveElements(cPtr, false);
  }

  
/**
   * Get a {@link RenderPoint} from the {@link Polygon}.
   <p>
   * @param n a long integer representing the index of the {@link RenderPoint} to
   * retrieve.
   <p>
   * @return the nth {@link RenderPoint} in the {@link ListOfCurveElements} within this
   * {@link Polygon} or <code>null</code> if no such object exists.
   <p>
   * <p>
 * @note
 * The pointer that is returned by this function is not owned by the caller,
 * but may be queried and modified.  Any changes made will be reflected in any
 * resulting SBML document containing the pointer's parent.
   <p>
   * @see #addElement(RenderPoint object)
   * @see #createCubicBezier()
   * @see #getElementBySId(String sid)
   * @see #getNumElements()
   * @see #removeElement(String sid)
   * @see #removeElement(long n)
   */ public
 RenderPoint getElement(long n) {
  return (RenderPoint) libsbml.DowncastSBase(libsbmlJNI.Polygon_getElement__SWIG_0(swigCPtr, this, n), false);
}

  
/**
   * Adds a copy of the given {@link RenderPoint} to this {@link Polygon}.
   <p>
   * @param rp the {@link RenderPoint} object to add.
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
   * @see #createCubicBezier()
   * @see #getElementBySId(String sid)
   * @see #getElement(long n)
   * @see #getNumElements()
   * @see #removeElement(String sid)
   * @see #removeElement(long n)
   */ public
 int addElement(RenderPoint rp) {
    return libsbmlJNI.Polygon_addElement(swigCPtr, this, RenderPoint.getCPtr(rp), rp);
  }

  
/**
   * Get the number of {@link RenderPoint} objects in this {@link Polygon}.
   <p>
   * @return the number of {@link RenderPoint} objects in this {@link Polygon}.
   <p>
   * @see #addElement(RenderPoint object)
   * @see #createCubicBezier()
   * @see #getElementBySId(String sid)
   * @see #getElement(long n)
   * @see #removeElement(String sid)
   * @see #removeElement(long n)
   */ public
 long getNumElements() {
    return libsbmlJNI.Polygon_getNumElements(swigCPtr, this);
  }

  
/**
   * Creates a new {@link RenderPoint} object, adds it to this {@link Polygon} object and
   * returns the {@link RenderPoint} object created.
   <p>
   * @return a new {@link RenderPoint} object instance.
   <p>
   * <p>
 * @note
 * The pointer that is returned by this function is not owned by the caller,
 * but may be queried and modified.  Any changes made will be reflected in any
 * resulting SBML document containing the pointer's parent.
   <p>
   * @see #addElement(RenderPoint object)
   * @see #getElementBySId(String sid)
   * @see #getElement(long n)
   * @see #getNumElements()
   * @see #removeElement(String sid)
   * @see #removeElement(long n)
   */ public
 RenderPoint createPoint() {
  return (RenderPoint) libsbml.DowncastSBase(libsbmlJNI.Polygon_createPoint(swigCPtr, this), false);
}

  
/**
   * Creates a new {@link RenderCubicBezier} object, adds it to this {@link Polygon} object and
   * returns the {@link RenderCubicBezier} object created.
   <p>
   * @return a new {@link RenderCubicBezier} object instance.
   <p>
   * <p>
 * @note
 * The pointer that is returned by this function is not owned by the caller,
 * but may be queried and modified.  Any changes made will be reflected in any
 * resulting SBML document containing the pointer's parent.
   <p>
   * @see #addElement(RenderPoint object)
   * @see #getElementBySId(String sid)
   * @see #getElement(long n)
   * @see #getNumElements()
   * @see #removeElement(String sid)
   * @see #removeElement(long n)
   */ public
 RenderCubicBezier createCubicBezier() {
    long cPtr = libsbmlJNI.Polygon_createCubicBezier(swigCPtr, this);
    return (cPtr == 0) ? null : new RenderCubicBezier(cPtr, false);
  }

  
/**
   * Removes the nth {@link RenderPoint} from this {@link Polygon} and returns a pointer to it.
   <p>
   * @param n a long integer representing the index of the {@link RenderPoint} to
   * remove.
   <p>
   * @return a pointer to the nth {@link RenderPoint} in this {@link Polygon}.
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
   * @see #addElement(RenderPoint object)
   * @see #createCubicBezier()
   * @see #getElementBySId(String sid)
   * @see #getElement(long n)
   * @see #getNumElements()
   * @see #removeElement(String sid)
   */ public
 RenderPoint removeElement(long n) {
  return (RenderPoint) libsbml.DowncastSBase(libsbmlJNI.Polygon_removeElement__SWIG_0(swigCPtr, this, n), false);
}

  
/**
  * Removes the {@link RenderPoint} with the given id from this 
  * {@link Polygon} and returns a pointer to it.
  <p>
  * @param sid the ID of the {@link RenderPoint} to remove.
  <p>
  * @return a pointer to the removed {@link RenderPoint}.
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
  * @see #addElement(RenderPoint object)
  * @see #createCubicBezier()
  * @see #getElementBySId(String sid)
  * @see #getElement(long n)
  * @see #getNumElements()
  * @see #removeElement(long n)
  */ public
 RenderPoint removeElement(String sid) {
  return (RenderPoint) libsbml.DowncastSBase(libsbmlJNI.Polygon_removeElement__SWIG_1(swigCPtr, this, sid), false);
}

  
/**
   * Returns the XML element name of this {@link Polygon} object.
   <p>
   * For {@link Polygon}, the XML element name is always <code>'polygon'.</code>
   <p>
   * @return the name of this element, i.e. <code>'polygon'.</code>
   */ public
 String getElementName() {
    return libsbmlJNI.Polygon_getElementName(swigCPtr, this);
  }

  
/**
   * Returns the libSBML type code for this {@link Polygon} object.
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
   * {@link libsbmlConstants#SBML_RENDER_POLYGON SBML_RENDER_POLYGON}.
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
    return libsbmlJNI.Polygon_getTypeCode(swigCPtr, this);
  }

  
/** * @internal */ public
 void connectToChild() {
    libsbmlJNI.Polygon_connectToChild(swigCPtr, this);
  }

  
/** * @internal */ public
 void enablePackageInternal(String pkgURI, String pkgPrefix, boolean flag) {
    libsbmlJNI.Polygon_enablePackageInternal(swigCPtr, this, pkgURI, pkgPrefix, flag);
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
  return libsbml.DowncastSBase(libsbmlJNI.Polygon_getElementBySId(swigCPtr, this, id), false);
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
  return libsbml.DowncastSBase(libsbmlJNI.Polygon_getElementByMetaId(swigCPtr, this, metaid), false);
}

  
/**
   * Creates an {@link XMLNode} object from this {@link Polygon} object.
   <p>
   * @return the {@link XMLNode} with the XML representation for the 
   * {@link Polygon} object.
   */ public
 XMLNode toXML() {
    return new XMLNode(libsbmlJNI.Polygon_toXML(swigCPtr, this), true);
  }

}
