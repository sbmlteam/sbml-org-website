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

 Representation of a linear gradient.
 <p>
 * The concept of a linear gradient is more or or less taken from SVG.  A
 * linear gradient is defined by a vector which determines the direction and
 * the length of the gradient.  So for a valid gradient, this vector should
 * have a length different from 0.  Otherwise, all restrictions for the
 * {@link GradientBase} class apply.
 <p>
 * The vector for a linear gradient is defined by a start and an endpoint and
 * each point consists of three absolute-relative value pairs.
 <p>
 * For examples of {@link LinearGradient} objects, see the SBML Render package
 * specification and/or the SVG specification.
 <p>
 * @see GradientBase
 * @see RelAbsVector
 */

public class LinearGradient extends GradientBase {
   private long swigCPtr;

   protected LinearGradient(long cPtr, boolean cMemoryOwn)
   {
     super(libsbmlJNI.LinearGradient_SWIGUpcast(cPtr), cMemoryOwn);
     swigCPtr = cPtr;
   }

   protected static long getCPtr(LinearGradient obj)
   {
     return (obj == null) ? 0 : obj.swigCPtr;
   }

   protected static long getCPtrAndDisown (LinearGradient obj)
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
        libsbmlJNI.delete_LinearGradient(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  
/**
   * Creates a new {@link LinearGradient} using the given SBML Level, Version and
   * &ldquo;render&rdquo; package version.
   <p>
   * @param level a long integer, the SBML Level to assign to this
   * {@link LinearGradient}.
   <p>
   * @param version a long integer, the SBML Version to assign to this
   * {@link LinearGradient}.
   <p>
   * @param pkgVersion a long integer, the SBML Render Version to assign to
   * this {@link LinearGradient}.
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
 LinearGradient(long level, long version, long pkgVersion) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_LinearGradient__SWIG_0(level, version, pkgVersion), true);
  }

  
/**
   * Creates a new {@link LinearGradient} using the given SBML Level, Version and
   * &ldquo;render&rdquo; package version.
   <p>
   * @param level a long integer, the SBML Level to assign to this
   * {@link LinearGradient}.
   <p>
   * @param version a long integer, the SBML Version to assign to this
   * {@link LinearGradient}.
   <p>
   * @param pkgVersion a long integer, the SBML Render Version to assign to
   * this {@link LinearGradient}.
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
 LinearGradient(long level, long version) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_LinearGradient__SWIG_1(level, version), true);
  }

  
/**
   * Creates a new {@link LinearGradient} using the given SBML Level, Version and
   * &ldquo;render&rdquo; package version.
   <p>
   * @param level a long integer, the SBML Level to assign to this
   * {@link LinearGradient}.
   <p>
   * @param version a long integer, the SBML Version to assign to this
   * {@link LinearGradient}.
   <p>
   * @param pkgVersion a long integer, the SBML Render Version to assign to
   * this {@link LinearGradient}.
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
 LinearGradient(long level) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_LinearGradient__SWIG_2(level), true);
  }

  
/**
   * Creates a new {@link LinearGradient} using the given SBML Level, Version and
   * &ldquo;render&rdquo; package version.
   <p>
   * @param level a long integer, the SBML Level to assign to this
   * {@link LinearGradient}.
   <p>
   * @param version a long integer, the SBML Version to assign to this
   * {@link LinearGradient}.
   <p>
   * @param pkgVersion a long integer, the SBML Render Version to assign to
   * this {@link LinearGradient}.
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
 LinearGradient() throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_LinearGradient__SWIG_3(), true);
  }

  
/**
   * Creates a new {@link LinearGradient} using the given {@link RenderPkgNamespaces} object.
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
 LinearGradient(RenderPkgNamespaces renderns) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_LinearGradient__SWIG_4(RenderPkgNamespaces.getCPtr(renderns), renderns), true);
  }

  
/**
   * Creates a new {@link LinearGradient} object from the given {@link XMLNode} object.
   * The {@link XMLNode} object has to contain a valid XML representation of a 
   * {@link LinearGradient} object as defined in the render extension specification.
   * This method is normally called when render information is read from a file and 
   * should normally not have to be called explicitly.
   <p>
   * @param node the {@link XMLNode} object reference that describes the {@link LinearGradient}
   * object to be instantiated.
   <p>
   * @param l2version an integer indicating the version of SBML Level&nbsp;2
   */ public
 LinearGradient(XMLNode node, long l2version) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_LinearGradient__SWIG_5(XMLNode.getCPtr(node), node, l2version), true);
  }

  
/**
   * Creates a new {@link LinearGradient} object from the given {@link XMLNode} object.
   * The {@link XMLNode} object has to contain a valid XML representation of a 
   * {@link LinearGradient} object as defined in the render extension specification.
   * This method is normally called when render information is read from a file and 
   * should normally not have to be called explicitly.
   <p>
   * @param node the {@link XMLNode} object reference that describes the {@link LinearGradient}
   * object to be instantiated.
   <p>
   * @param l2version an integer indicating the version of SBML Level&nbsp;2
   */ public
 LinearGradient(XMLNode node) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_LinearGradient__SWIG_6(XMLNode.getCPtr(node), node), true);
  }

  
/**
   * Constructor which creates a {@link LinearGradient} with no gradient stops.
   * The id is set to the given value.
   * The {@link LinearGradient} object is invalid until it has an id and at least two 
   * gradient stops.
   * The start and the end of the linear gradient vector are set to (0,0,0).
   * A linear gradient with a vector of length zero should also be considered invalid.
   <p>
   * @param renderns the {@link SBMLNamespaces} object for the SBML 'render' package
   * @param id the new id for the {@link LinearGradient}.
   <p>
   * <p>
 * @warning <span class='warning'>This constructor is deprecated. The new
 * libSBML API uses constructors that either take the SBML Level and Version,
 * <em>or</em> take an {@link SBMLNamespaces} object.</span>
   */ public
 LinearGradient(RenderPkgNamespaces renderns, String id) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_LinearGradient__SWIG_7(RenderPkgNamespaces.getCPtr(renderns), renderns, id), true);
  }

  
/**
   * Copy constructor for {@link LinearGradient}.
   <p>
   * @param orig the {@link LinearGradient} instance to copy.
   */ public
 LinearGradient(LinearGradient orig) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_LinearGradient__SWIG_8(LinearGradient.getCPtr(orig), orig), true);
  }

  
/**
   * Creates and returns a deep copy of this {@link LinearGradient} object.
   <p>
   * @return a (deep) copy of this {@link LinearGradient} object.
   */ public
 LinearGradient cloneObject() {
    long cPtr = libsbmlJNI.LinearGradient_cloneObject(swigCPtr, this);
    return (cPtr == 0) ? null : new LinearGradient(cPtr, true);
  }

  
/**
   * Returns the value of the 'x1' element of this {@link LinearGradient}.
   <p>
   * @return the value of the 'x1' element of this {@link LinearGradient} as a
   * {@link RelAbsVector}.
   */ public
 RelAbsVector getX1() {
    return new RelAbsVector(libsbmlJNI.LinearGradient_getX1__SWIG_0(swigCPtr, this), false);
  }

  
/**
   * Returns the x coordinate for the start point as a  reference.
   <p>
   * @return {@link RelAbsVector} that represents the x value of the start point.
   */ public
 RelAbsVector getXPoint1() {
    return new RelAbsVector(libsbmlJNI.LinearGradient_getXPoint1__SWIG_0(swigCPtr, this), false);
  }

  
/**
   * Returns the value of the 'y1' element of this {@link LinearGradient}.
   <p>
   * @return the value of the 'y1' element of this {@link LinearGradient} as a
   * {@link RelAbsVector}.
   */ public
 RelAbsVector getY1() {
    return new RelAbsVector(libsbmlJNI.LinearGradient_getY1__SWIG_0(swigCPtr, this), false);
  }

  
/**
   * Returns the y coordinate for the start point as a  reference.
   <p>
   * @return {@link RelAbsVector} that represents the y value of the start point.
   */ public
 RelAbsVector getYPoint1() {
    return new RelAbsVector(libsbmlJNI.LinearGradient_getYPoint1__SWIG_0(swigCPtr, this), false);
  }

  
/**
   * Returns the value of the 'z1' element of this {@link LinearGradient}.
   <p>
   * @return the value of the 'z1' element of this {@link LinearGradient} as a
   * {@link RelAbsVector}.
   */ public
 RelAbsVector getZ1() {
    return new RelAbsVector(libsbmlJNI.LinearGradient_getZ1__SWIG_0(swigCPtr, this), false);
  }

  
/**
   * Returns the z coordinate for the start point as a  reference.
   <p>
   * @return {@link RelAbsVector} that represents the z value of the start point.
   */ public
 RelAbsVector getZPoint1() {
    return new RelAbsVector(libsbmlJNI.LinearGradient_getZPoint1__SWIG_0(swigCPtr, this), false);
  }

  
/**
  * Returns the value of the 'x2' element of this {@link LinearGradient}.
  <p>
  * @return the value of the 'x2' element of this {@link LinearGradient} as a
  * {@link RelAbsVector}.
  */ public
 RelAbsVector getX2() {
    return new RelAbsVector(libsbmlJNI.LinearGradient_getX2__SWIG_0(swigCPtr, this), false);
  }

  
/**
  * Returns the x coordinate for the end point as a  reference.
  <p>
  * @return {@link RelAbsVector} that represents the x value of the end point.
  */ public
 RelAbsVector getXPoint2() {
    return new RelAbsVector(libsbmlJNI.LinearGradient_getXPoint2__SWIG_0(swigCPtr, this), false);
  }

  
/**
  * Returns the value of the 'y2' element of this {@link LinearGradient}.
  <p>
  * @return the value of the 'y2' element of this {@link LinearGradient} as a
  * {@link RelAbsVector}.
  */ public
 RelAbsVector getY2() {
    return new RelAbsVector(libsbmlJNI.LinearGradient_getY2__SWIG_0(swigCPtr, this), false);
  }

  
/**
  * Returns the y coordinate for the end point as a  reference.
  <p>
  * @return {@link RelAbsVector} that represents the y value of the end point.
  */ public
 RelAbsVector getYPoint2() {
    return new RelAbsVector(libsbmlJNI.LinearGradient_getYPoint2__SWIG_0(swigCPtr, this), false);
  }

  
/**
  * Returns the value of the 'z2' element of this {@link LinearGradient}.
  <p>
  * @return the value of the 'z2' element of this {@link LinearGradient} as a
  * {@link RelAbsVector}.
  */ public
 RelAbsVector getZ2() {
    return new RelAbsVector(libsbmlJNI.LinearGradient_getZ2__SWIG_0(swigCPtr, this), false);
  }

  
/**
  * Returns the z coordinate for the end point as a  reference.
  <p>
  * @return {@link RelAbsVector} that represents the z value of the end point.
  */ public
 RelAbsVector getZPoint2() {
    return new RelAbsVector(libsbmlJNI.LinearGradient_getZPoint2__SWIG_0(swigCPtr, this), false);
  }

  
/**
   * Predicate returning <code>true</code> if this {@link LinearGradient}'s 'x1' element is set.
   <p>
   * @return <code>true</code> if this {@link LinearGradient}'s 'x1' element has been set,
   * otherwise <code>false</code> is returned.
   */ public
 boolean isSetX1() {
    return libsbmlJNI.LinearGradient_isSetX1(swigCPtr, this);
  }

  
/**
   * Predicate returning <code>true</code> if this {@link LinearGradient}'s 'y1' element is set.
   <p>
   * @return <code>true</code> if this {@link LinearGradient}'s 'y1' element has been set,
   * otherwise <code>false</code> is returned.
   */ public
 boolean isSetY1() {
    return libsbmlJNI.LinearGradient_isSetY1(swigCPtr, this);
  }

  
/**
   * Predicate returning <code>true</code> if this {@link LinearGradient}'s 'z1' element is set.
   <p>
   * @return <code>true</code> if this {@link LinearGradient}'s 'z1' element has been set,
   * otherwise <code>false</code> is returned.
   */ public
 boolean isSetZ1() {
    return libsbmlJNI.LinearGradient_isSetZ1(swigCPtr, this);
  }

  
/**
   * Predicate returning <code>true</code> if this {@link LinearGradient}'s 'x2' element is set.
   <p>
   * @return <code>true</code> if this {@link LinearGradient}'s 'x2' element has been set,
   * otherwise <code>false</code> is returned.
   */ public
 boolean isSetX2() {
    return libsbmlJNI.LinearGradient_isSetX2(swigCPtr, this);
  }

  
/**
   * Predicate returning <code>true</code> if this {@link LinearGradient}'s 'y2' element is set.
   <p>
   * @return <code>true</code> if this {@link LinearGradient}'s 'y2' element has been set,
   * otherwise <code>false</code> is returned.
   */ public
 boolean isSetY2() {
    return libsbmlJNI.LinearGradient_isSetY2(swigCPtr, this);
  }

  
/**
   * Predicate returning <code>true</code> if this {@link LinearGradient}'s 'z2' element is set.
   <p>
   * @return <code>true</code> if this {@link LinearGradient}'s 'z2' element has been set,
   * otherwise <code>false</code> is returned.
   */ public
 boolean isSetZ2() {
    return libsbmlJNI.LinearGradient_isSetZ2(swigCPtr, this);
  }

  
/**
   * Sets the value of the 'x1' element of this {@link LinearGradient}.
   <p>
   * @param x1 {@link RelAbsVector} value of the 'x1' element to be set.
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
 int setX1(RelAbsVector x1) {
    return libsbmlJNI.LinearGradient_setX1(swigCPtr, this, RelAbsVector.getCPtr(x1), x1);
  }

  
/**
   * Sets the value of the 'y1' element of this {@link LinearGradient}.
   <p>
   * @param y1 {@link RelAbsVector} value of the 'y1' element to be set.
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
 int setY1(RelAbsVector y1) {
    return libsbmlJNI.LinearGradient_setY1(swigCPtr, this, RelAbsVector.getCPtr(y1), y1);
  }

  
/**
   * Sets the value of the 'z1' element of this {@link LinearGradient}.
   <p>
   * @param z1 {@link RelAbsVector} value of the 'z1' element to be set.
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
 int setZ1(RelAbsVector z1) {
    return libsbmlJNI.LinearGradient_setZ1(swigCPtr, this, RelAbsVector.getCPtr(z1), z1);
  }

  
/**
   * Sets the value of the 'x2' element of this {@link LinearGradient}.
   <p>
   * @param x2 {@link RelAbsVector} value of the 'x2' element to be set.
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
 int setX2(RelAbsVector x2) {
    return libsbmlJNI.LinearGradient_setX2(swigCPtr, this, RelAbsVector.getCPtr(x2), x2);
  }

  
/**
   * Sets the value of the 'y2' element of this {@link LinearGradient}.
   <p>
   * @param y2 {@link RelAbsVector} value of the 'y2' element to be set.
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
 int setY2(RelAbsVector y2) {
    return libsbmlJNI.LinearGradient_setY2(swigCPtr, this, RelAbsVector.getCPtr(y2), y2);
  }

  
/**
   * Sets the value of the 'z2' element of this {@link LinearGradient}.
   <p>
   * @param z2 {@link RelAbsVector} value of the 'z2' element to be set.
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
 int setZ2(RelAbsVector z2) {
    return libsbmlJNI.LinearGradient_setZ2(swigCPtr, this, RelAbsVector.getCPtr(z2), z2);
  }

  
/**
   * Sets the 3D coordinates for the start and the end point of the linear gradient vector.
   * Each value can be a combination of absolute and relative value and is represented by 
   * a {@link RelAbsVector} object.
   <p>
   * @param x1 x value of the start point of the linear gradient vector
   * @param y1 y value of the start point of the linear gradient vector
   * @param z1 z value of the start point of the linear gradient vector
   * @param x2 x value of the end point of the linear gradient vector
   * @param y2 y value of the end point of the linear gradient vector
   * @param z2 z value of the end point of the linear gradient vector
   */ public
 void setCoordinates(RelAbsVector x1, RelAbsVector y1, RelAbsVector z1, RelAbsVector x2, RelAbsVector y2, RelAbsVector z2) {
    libsbmlJNI.LinearGradient_setCoordinates__SWIG_0(swigCPtr, this, RelAbsVector.getCPtr(x1), x1, RelAbsVector.getCPtr(y1), y1, RelAbsVector.getCPtr(z1), z1, RelAbsVector.getCPtr(x2), x2, RelAbsVector.getCPtr(y2), y2, RelAbsVector.getCPtr(z2), z2);
  }

  
/**
   * Sets the 2D coordinates for the start and the end point of the linear gradient vector.
   * The z values are automatically set to 0.
   * Each value can be a combination of absolute and relative value and is represented by 
   * a {@link RelAbsVector} object.
   <p>
   * @param x1 x value of the start point of the linear gradient vector
   * @param y1 y value of the start point of the linear gradient vector
   * @param x2 x value of the end point of the linear gradient vector
   * @param y2 y value of the end point of the linear gradient vector
   */ public
 void setCoordinates(RelAbsVector x1, RelAbsVector y1, RelAbsVector x2, RelAbsVector y2) {
    libsbmlJNI.LinearGradient_setCoordinates__SWIG_1(swigCPtr, this, RelAbsVector.getCPtr(x1), x1, RelAbsVector.getCPtr(y1), y1, RelAbsVector.getCPtr(x2), x2, RelAbsVector.getCPtr(y2), y2);
  }

  
/**
   * Sets the coordinates for the start point of the linear gradient vector.
   <p>
   * Each value can be a combination of absolute and relative value and is represented by 
   * a {@link RelAbsVector} object.
   <p>
   * The z value can be omitted. In that case it is set to 0.
   <p>
   * @param x x value of the start point of the linear gradient vector
   * @param y y value of the start point of the linear gradient vector
   * @param z z value of the start point of the linear gradient vector
   */ public
 void setPoint1(RelAbsVector x, RelAbsVector y, RelAbsVector z) {
    libsbmlJNI.LinearGradient_setPoint1__SWIG_0(swigCPtr, this, RelAbsVector.getCPtr(x), x, RelAbsVector.getCPtr(y), y, RelAbsVector.getCPtr(z), z);
  }

  
/**
   * Sets the coordinates for the start point of the linear gradient vector.
   <p>
   * Each value can be a combination of absolute and relative value and is represented by 
   * a {@link RelAbsVector} object.
   <p>
   * The z value can be omitted. In that case it is set to 0.
   <p>
   * @param x x value of the start point of the linear gradient vector
   * @param y y value of the start point of the linear gradient vector
   * @param z z value of the start point of the linear gradient vector
   */ public
 void setPoint1(RelAbsVector x, RelAbsVector y) {
    libsbmlJNI.LinearGradient_setPoint1__SWIG_1(swigCPtr, this, RelAbsVector.getCPtr(x), x, RelAbsVector.getCPtr(y), y);
  }

  
/**
   * Sets the coordinates for the end point of the linear gradient vector.
   <p>
   * Each value can be a combination of absolute and relative value and is represented by 
   * a {@link RelAbsVector} object.
   <p>
   * The z value can be omitted. In that case it is set to 0.
   <p>
   * @param x x value of the end point of the linear gradient vector
   * @param y y value of the end point of the linear gradient vector
   * @param z z value of the end point of the linear gradient vector
   */ public
 void setPoint2(RelAbsVector x, RelAbsVector y, RelAbsVector z) {
    libsbmlJNI.LinearGradient_setPoint2__SWIG_0(swigCPtr, this, RelAbsVector.getCPtr(x), x, RelAbsVector.getCPtr(y), y, RelAbsVector.getCPtr(z), z);
  }

  
/**
   * Sets the coordinates for the end point of the linear gradient vector.
   <p>
   * Each value can be a combination of absolute and relative value and is represented by 
   * a {@link RelAbsVector} object.
   <p>
   * The z value can be omitted. In that case it is set to 0.
   <p>
   * @param x x value of the end point of the linear gradient vector
   * @param y y value of the end point of the linear gradient vector
   * @param z z value of the end point of the linear gradient vector
   */ public
 void setPoint2(RelAbsVector x, RelAbsVector y) {
    libsbmlJNI.LinearGradient_setPoint2__SWIG_1(swigCPtr, this, RelAbsVector.getCPtr(x), x, RelAbsVector.getCPtr(y), y);
  }

  
/**
   * Unsets the value of the 'x1' element of this {@link LinearGradient}.
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
 int unsetX1() {
    return libsbmlJNI.LinearGradient_unsetX1(swigCPtr, this);
  }

  
/**
   * Unsets the value of the 'y1' element of this {@link LinearGradient}.
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
 int unsetY1() {
    return libsbmlJNI.LinearGradient_unsetY1(swigCPtr, this);
  }

  
/**
   * Unsets the value of the 'z1' element of this {@link LinearGradient}.
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
 int unsetZ1() {
    return libsbmlJNI.LinearGradient_unsetZ1(swigCPtr, this);
  }

  
/**
   * Unsets the value of the 'x2' element of this {@link LinearGradient}.
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
 int unsetX2() {
    return libsbmlJNI.LinearGradient_unsetX2(swigCPtr, this);
  }

  
/**
   * Unsets the value of the 'y2' element of this {@link LinearGradient}.
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
 int unsetY2() {
    return libsbmlJNI.LinearGradient_unsetY2(swigCPtr, this);
  }

  
/**
   * Unsets the value of the 'z2' element of this {@link LinearGradient}.
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
 int unsetZ2() {
    return libsbmlJNI.LinearGradient_unsetZ2(swigCPtr, this);
  }

  
/**
   * Returns the XML element name of this {@link LinearGradient} object.
   <p>
   * For {@link LinearGradient}, the XML element name is always <code>'linearGradient'.</code>
   <p>
   * @return the name of this element, i.e. <code>'linearGradient'.</code>
   */ public
 String getElementName() {
    return libsbmlJNI.LinearGradient_getElementName(swigCPtr, this);
  }

  
/**
   * Returns the libSBML type code for this {@link LinearGradient} object.
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
   * {@link libsbmlConstants#SBML_RENDER_LINEARGRADIENT SBML_RENDER_LINEARGRADIENT}.
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
    return libsbmlJNI.LinearGradient_getTypeCode(swigCPtr, this);
  }

  
/**
   * Creates an {@link XMLNode} object from this {@link LinearGradient} object.
   <p>
   * @return the {@link XMLNode} with the XML representation for the 
   * {@link LinearGradient} object.
   */ public
 XMLNode toXML() {
    return new XMLNode(libsbmlJNI.LinearGradient_toXML(swigCPtr, this), true);
  }

}
