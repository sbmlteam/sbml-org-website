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

 Representation of a radial gradient.
 <p>
 * The concept of a radial gradient is more or or less taken from SVG.  A
 * radial gradient is defined by a center point, a radius and an optional
 * focal point.  A valid gradient will have a positive radius 
 * greater than 0, and the focal point should be within the circle
 * defined by the center point and the radius.  Otherwise all restrictions
 * for the {@link GradientBase} class apply.
 <p>
 * The center and the focal point of a radial gradient are defined by three
 * pairs of absolute-relative value.  The radius is also defined as an
 * absolute-relative value pair.  For examples of {@link RadialGradient} object
 * definitions, see the SBML Render package specification and/or the SVG
 * specification.
 <p>
 * @see GradientBase
 * @see RelAbsVector
 */

public class RadialGradient extends GradientBase {
   private long swigCPtr;

   protected RadialGradient(long cPtr, boolean cMemoryOwn)
   {
     super(libsbmlJNI.RadialGradient_SWIGUpcast(cPtr), cMemoryOwn);
     swigCPtr = cPtr;
   }

   protected static long getCPtr(RadialGradient obj)
   {
     return (obj == null) ? 0 : obj.swigCPtr;
   }

   protected static long getCPtrAndDisown (RadialGradient obj)
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
        libsbmlJNI.delete_RadialGradient(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  
/**
   * Creates a new {@link RadialGradient} using the given SBML Level, Version and
   * &ldquo;render&rdquo; package version.
   <p>
   * @param level a long integer, the SBML Level to assign to this
   * {@link RadialGradient}.
   <p>
   * @param version a long integer, the SBML Version to assign to this
   * {@link RadialGradient}.
   <p>
   * @param pkgVersion a long integer, the SBML Render Version to assign to
   * this {@link RadialGradient}.
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
 RadialGradient(long level, long version, long pkgVersion) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_RadialGradient__SWIG_0(level, version, pkgVersion), true);
  }

  
/**
   * Creates a new {@link RadialGradient} using the given SBML Level, Version and
   * &ldquo;render&rdquo; package version.
   <p>
   * @param level a long integer, the SBML Level to assign to this
   * {@link RadialGradient}.
   <p>
   * @param version a long integer, the SBML Version to assign to this
   * {@link RadialGradient}.
   <p>
   * @param pkgVersion a long integer, the SBML Render Version to assign to
   * this {@link RadialGradient}.
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
 RadialGradient(long level, long version) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_RadialGradient__SWIG_1(level, version), true);
  }

  
/**
   * Creates a new {@link RadialGradient} using the given SBML Level, Version and
   * &ldquo;render&rdquo; package version.
   <p>
   * @param level a long integer, the SBML Level to assign to this
   * {@link RadialGradient}.
   <p>
   * @param version a long integer, the SBML Version to assign to this
   * {@link RadialGradient}.
   <p>
   * @param pkgVersion a long integer, the SBML Render Version to assign to
   * this {@link RadialGradient}.
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
 RadialGradient(long level) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_RadialGradient__SWIG_2(level), true);
  }

  
/**
   * Creates a new {@link RadialGradient} using the given SBML Level, Version and
   * &ldquo;render&rdquo; package version.
   <p>
   * @param level a long integer, the SBML Level to assign to this
   * {@link RadialGradient}.
   <p>
   * @param version a long integer, the SBML Version to assign to this
   * {@link RadialGradient}.
   <p>
   * @param pkgVersion a long integer, the SBML Render Version to assign to
   * this {@link RadialGradient}.
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
 RadialGradient() throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_RadialGradient__SWIG_3(), true);
  }

  
/**
   * Creates a new {@link RadialGradient} using the given {@link RenderPkgNamespaces} object.
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
 RadialGradient(RenderPkgNamespaces renderns) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_RadialGradient__SWIG_4(RenderPkgNamespaces.getCPtr(renderns), renderns), true);
  }

  
/**
   * Creates a new {@link RadialGradient} object from the given {@link XMLNode} object.
   * The {@link XMLNode} object has to contain a valid XML representation of a 
   * {@link RadialGradient} object as defined in the render extension specification.
   * This method is normally called when render information is read from a file and 
   * should normally not have to be called explicitly.
   <p>
   * @param node the {@link XMLNode} object reference that describes the {@link RadialGradient}
   * object to be instantiated.
   <p>
   * @param l2version an integer indicating the version of SBML Level&nbsp;2
   */ public
 RadialGradient(XMLNode node, long l2version) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_RadialGradient__SWIG_5(XMLNode.getCPtr(node), node, l2version), true);
  }

  
/**
   * Constructor which creates a {@link RadialGradient} with no gradient stops.
   * The id is set to the given value.
   * The {@link RadialGradient} object is invalid until it has an id and at least two 
   * gradient stops.
   * The start and the end of the linear gradient vector are set to (0,0,0).
   * A linear gradient with a vector of length zero should also be considered invalid.
   <p>
   * @param renderns the {@link SBMLNamespaces} object for the SBML 'render' package
   * @param id the new id for the {@link RadialGradient}.
   <p>
   * <p>
 * @warning <span class='warning'>This constructor is deprecated. The new
 * libSBML API uses constructors that either take the SBML Level and Version,
 * <em>or</em> take an {@link SBMLNamespaces} object.</span>
   */ public
 RadialGradient(RenderPkgNamespaces renderns, String id) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_RadialGradient__SWIG_6(RenderPkgNamespaces.getCPtr(renderns), renderns, id), true);
  }

  
/**
   * Copy constructor for {@link RadialGradient}.
   <p>
   * @param orig the {@link RadialGradient} instance to copy.
   */ public
 RadialGradient(RadialGradient orig) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_RadialGradient__SWIG_7(RadialGradient.getCPtr(orig), orig), true);
  }

  
/**
   * Creates and returns a deep copy of this {@link RadialGradient} object.
   <p>
   * @return a (deep) copy of this {@link RadialGradient} object.
   */ public
 RadialGradient cloneObject() {
    long cPtr = libsbmlJNI.RadialGradient_cloneObject(swigCPtr, this);
    return (cPtr == 0) ? null : new RadialGradient(cPtr, true);
  }

  
/**
   * Returns the value of the 'cx' element of this {@link RadialGradient}.
   <p>
   * @return the value of the 'cx' element of this {@link RadialGradient} as a
   * {@link RelAbsVector}.
   */ public
 RelAbsVector getCx() {
    return new RelAbsVector(libsbmlJNI.RadialGradient_getCx__SWIG_0(swigCPtr, this), false);
  }

  
/**
   * Returns the x coordinate for the start point as a  reference.
   <p>
   * @return {@link RelAbsVector} that represents the x value of the start point.
   */ public
 RelAbsVector getCenterX() {
    return new RelAbsVector(libsbmlJNI.RadialGradient_getCenterX__SWIG_0(swigCPtr, this), false);
  }

  
/**
   * Returns the value of the 'cy' element of this {@link RadialGradient}.
   <p>
   * @return the value of the 'cy' element of this {@link RadialGradient} as a
   * {@link RelAbsVector}.
   */ public
 RelAbsVector getCy() {
    return new RelAbsVector(libsbmlJNI.RadialGradient_getCy__SWIG_0(swigCPtr, this), false);
  }

  
/**
   * Returns the y coordinate for the start point as a  reference.
   <p>
   * @return {@link RelAbsVector} that represents the y value of the start point.
   */ public
 RelAbsVector getCenterY() {
    return new RelAbsVector(libsbmlJNI.RadialGradient_getCenterY__SWIG_0(swigCPtr, this), false);
  }

  
/**
   * Returns the value of the 'cz' element of this {@link RadialGradient}.
   <p>
   * @return the value of the 'cz' element of this {@link RadialGradient} as a
   * {@link RelAbsVector}.
   */ public
 RelAbsVector getCz() {
    return new RelAbsVector(libsbmlJNI.RadialGradient_getCz__SWIG_0(swigCPtr, this), false);
  }

  
/**
   * Returns the z coordinate for the start point as a  reference.
   <p>
   * @return {@link RelAbsVector} that represents the z value of the start point.
   */ public
 RelAbsVector getCenterZ() {
    return new RelAbsVector(libsbmlJNI.RadialGradient_getCenterZ__SWIG_0(swigCPtr, this), false);
  }

  
/**
  * Returns the value of the 'r' element of this {@link RadialGradient}.
  <p>
  * @return the value of the 'r' element of this {@link RadialGradient} as a
  * {@link RelAbsVector}.
  */ public
 RelAbsVector getR() {
    return new RelAbsVector(libsbmlJNI.RadialGradient_getR__SWIG_0(swigCPtr, this), false);
  }

  
/**
   * Returns the radius as a  reference.
   <p>
   * @return  reference to the radius 
   */ public
 RelAbsVector getRadius() {
    return new RelAbsVector(libsbmlJNI.RadialGradient_getRadius__SWIG_0(swigCPtr, this), false);
  }

  
/**
  * Returns the value of the 'fx' element of this {@link RadialGradient}.
  <p>
  * @return the value of the 'fx' element of this {@link RadialGradient} as a
  * {@link RelAbsVector}.
  */ public
 RelAbsVector getFx() {
    return new RelAbsVector(libsbmlJNI.RadialGradient_getFx__SWIG_0(swigCPtr, this), false);
  }

  
/**
  * Returns the x coordinate for the start point as a  reference.
  <p>
  * @return {@link RelAbsVector} that represents the x value of the start point.
  */ public
 RelAbsVector getFocalPointX() {
    return new RelAbsVector(libsbmlJNI.RadialGradient_getFocalPointX__SWIG_0(swigCPtr, this), false);
  }

  
/**
  * Returns the value of the 'fy' element of this {@link RadialGradient}.
  <p>
  * @return the value of the 'fy' element of this {@link RadialGradient} as a
  * {@link RelAbsVector}.
  */ public
 RelAbsVector getFy() {
    return new RelAbsVector(libsbmlJNI.RadialGradient_getFy__SWIG_0(swigCPtr, this), false);
  }

  
/**
  * Returns the y coordinate for the start point as a  reference.
  <p>
  * @return {@link RelAbsVector} that represents the y value of the start point.
  */ public
 RelAbsVector getFocalPointY() {
    return new RelAbsVector(libsbmlJNI.RadialGradient_getFocalPointY__SWIG_0(swigCPtr, this), false);
  }

  
/**
  * Returns the value of the 'fz' element of this {@link RadialGradient}.
  <p>
  * @return the value of the 'fz' element of this {@link RadialGradient} as a
  * {@link RelAbsVector}.
  */ public
 RelAbsVector getFz() {
    return new RelAbsVector(libsbmlJNI.RadialGradient_getFz__SWIG_0(swigCPtr, this), false);
  }

  
/**
  * Returns the z coordinate for the start point as a  reference.
  <p>
  * @return {@link RelAbsVector} that represents the z value of the start point.
  */ public
 RelAbsVector getFocalPointZ() {
    return new RelAbsVector(libsbmlJNI.RadialGradient_getFocalPointZ__SWIG_0(swigCPtr, this), false);
  }

  
/**
   * Predicate returning <code>true</code> if this {@link RadialGradient}'s 'cx' element is set.
   <p>
   * @return <code>true</code> if this {@link RadialGradient}'s 'cx' element has been set,
   * otherwise <code>false</code> is returned.
   */ public
 boolean isSetCx() {
    return libsbmlJNI.RadialGradient_isSetCx(swigCPtr, this);
  }

  
/**
   * Predicate returning <code>true</code> if this {@link RadialGradient}'s 'cy' element is set.
   <p>
   * @return <code>true</code> if this {@link RadialGradient}'s 'cy' element has been set,
   * otherwise <code>false</code> is returned.
   */ public
 boolean isSetCy() {
    return libsbmlJNI.RadialGradient_isSetCy(swigCPtr, this);
  }

  
/**
   * Predicate returning <code>true</code> if this {@link RadialGradient}'s 'cz' element is set.
   <p>
   * @return <code>true</code> if this {@link RadialGradient}'s 'cz' element has been set,
   * otherwise <code>false</code> is returned.
   */ public
 boolean isSetCz() {
    return libsbmlJNI.RadialGradient_isSetCz(swigCPtr, this);
  }

  
/**
   * Predicate returning <code>true</code> if this {@link RadialGradient}'s 'r' element is set.
   <p>
   * @return <code>true</code> if this {@link RadialGradient}'s 'r' element has been set,
   * otherwise <code>false</code> is returned.
   */ public
 boolean isSetR() {
    return libsbmlJNI.RadialGradient_isSetR(swigCPtr, this);
  }

  
/**
   * Predicate returning <code>true</code> if this {@link RadialGradient}'s 'fx' element is set.
   <p>
   * @return <code>true</code> if this {@link RadialGradient}'s 'fx' element has been set,
   * otherwise <code>false</code> is returned.
   */ public
 boolean isSetFx() {
    return libsbmlJNI.RadialGradient_isSetFx(swigCPtr, this);
  }

  
/**
   * Predicate returning <code>true</code> if this {@link RadialGradient}'s 'fy' element is set.
   <p>
   * @return <code>true</code> if this {@link RadialGradient}'s 'fy' element has been set,
   * otherwise <code>false</code> is returned.
   */ public
 boolean isSetFy() {
    return libsbmlJNI.RadialGradient_isSetFy(swigCPtr, this);
  }

  
/**
   * Predicate returning <code>true</code> if this {@link RadialGradient}'s 'fz' element is set.
   <p>
   * @return <code>true</code> if this {@link RadialGradient}'s 'fz' element has been set,
   * otherwise <code>false</code> is returned.
   */ public
 boolean isSetFz() {
    return libsbmlJNI.RadialGradient_isSetFz(swigCPtr, this);
  }

  
/**
   * Sets the value of the 'cx' element of this {@link RadialGradient}.
   <p>
   * @param cx {@link RelAbsVector} value of the 'cx' element to be set.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   This particular
 * function only does one thing irrespective of user input or 
 * object state, and thus will only return a single value:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * </ul>
   */ public
 int setCx(RelAbsVector cx) {
    return libsbmlJNI.RadialGradient_setCx(swigCPtr, this, RelAbsVector.getCPtr(cx), cx);
  }

  
/**
   * Sets the value of the 'cy' element of this {@link RadialGradient}.
   <p>
   * @param cy {@link RelAbsVector} value of the 'cy' element to be set.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   This particular
 * function only does one thing irrespective of user input or 
 * object state, and thus will only return a single value:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * </ul>
   */ public
 int setCy(RelAbsVector cy) {
    return libsbmlJNI.RadialGradient_setCy(swigCPtr, this, RelAbsVector.getCPtr(cy), cy);
  }

  
/**
   * Sets the value of the 'cz' element of this {@link RadialGradient}.
   <p>
   * @param cz {@link RelAbsVector} value of the 'cz' element to be set.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   This particular
 * function only does one thing irrespective of user input or 
 * object state, and thus will only return a single value:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * </ul>
   */ public
 int setCz(RelAbsVector cz) {
    return libsbmlJNI.RadialGradient_setCz(swigCPtr, this, RelAbsVector.getCPtr(cz), cz);
  }

  
/**
   * Sets the value of the 'r' element of this {@link RadialGradient}.
   <p>
   * @param r {@link RelAbsVector} value of the 'r' element to be set.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   This particular
 * function only does one thing irrespective of user input or 
 * object state, and thus will only return a single value:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * </ul>
   */ public
 int setR(RelAbsVector r) {
    return libsbmlJNI.RadialGradient_setR(swigCPtr, this, RelAbsVector.getCPtr(r), r);
  }

  
/**
   * Sets the radius of the radial gradient.
   <p>
   * @param r radius of the radial gradient vector.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   This particular
 * function only does one thing irrespective of user input or 
 * object state, and thus will only return a single value:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * </ul>
   */ public
 int setRadius(RelAbsVector r) {
    return libsbmlJNI.RadialGradient_setRadius(swigCPtr, this, RelAbsVector.getCPtr(r), r);
  }

  
/**
   * Sets the value of the 'fx' element of this {@link RadialGradient}.
   <p>
   * @param fx {@link RelAbsVector} value of the 'fx' element to be set.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   This particular
 * function only does one thing irrespective of user input or 
 * object state, and thus will only return a single value:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * </ul>
   */ public
 int setFx(RelAbsVector fx) {
    return libsbmlJNI.RadialGradient_setFx(swigCPtr, this, RelAbsVector.getCPtr(fx), fx);
  }

  
/**
   * Sets the value of the 'fy' element of this {@link RadialGradient}.
   <p>
   * @param fy {@link RelAbsVector} value of the 'fy' element to be set.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   This particular
 * function only does one thing irrespective of user input or 
 * object state, and thus will only return a single value:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * </ul>
   */ public
 int setFy(RelAbsVector fy) {
    return libsbmlJNI.RadialGradient_setFy(swigCPtr, this, RelAbsVector.getCPtr(fy), fy);
  }

  
/**
   * Sets the value of the 'fz' element of this {@link RadialGradient}.
   <p>
   * @param fz {@link RelAbsVector} value of the 'fz' element to be set.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   This particular
 * function only does one thing irrespective of user input or 
 * object state, and thus will only return a single value:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * </ul>
   */ public
 int setFz(RelAbsVector fz) {
    return libsbmlJNI.RadialGradient_setFz(swigCPtr, this, RelAbsVector.getCPtr(fz), fz);
  }

  
/**
   * Sets the 3D coordinates for the center and the focal
   * point as well as the radius.
   * Each value can be a combination of absolute and relative value and is represented by 
   * a {@link RelAbsVector} object.
   <p>
   * @param x x value of the center point of the radial gradient vector
   * @param y y value of the center point of the radial gradient vector
   * @param z z value of the center point of the radial gradient vector
   * @param r x value of the radius of the radial gradient vector
   * @param fx x value of the focal point of the radial gradient vector
   * @param fy y value of the focal point of the radial gradient vector
   * @param fz z value of the focal point of the radial gradient vector
   */ public
 void setCoordinates(RelAbsVector x, RelAbsVector y, RelAbsVector z, RelAbsVector r, RelAbsVector fx, RelAbsVector fy, RelAbsVector fz) {
    libsbmlJNI.RadialGradient_setCoordinates__SWIG_0(swigCPtr, this, RelAbsVector.getCPtr(x), x, RelAbsVector.getCPtr(y), y, RelAbsVector.getCPtr(z), z, RelAbsVector.getCPtr(r), r, RelAbsVector.getCPtr(fx), fx, RelAbsVector.getCPtr(fy), fy, RelAbsVector.getCPtr(fz), fz);
  }

  
/**
   * Sets the 2D coordinates for the center and the focal
   * point as well as the radius.
   * The z values are automatically set to 0.
   * Each value can be a combination of absolute and relative value and is represented by 
   * a {@link RelAbsVector} object.
   <p>
   * @param x x value of the center point of the radial gradient vector
   * @param y y value of the center point of the radial gradient vector
   * @param r x value of the radius of the radial gradient vector
   * @param fx x value of the focal point of the radial gradient vector
   * @param fy y value of the focal point of the radial gradient vector
   */ public
 void setCoordinates(RelAbsVector x, RelAbsVector y, RelAbsVector r, RelAbsVector fx, RelAbsVector fy) {
    libsbmlJNI.RadialGradient_setCoordinates__SWIG_1(swigCPtr, this, RelAbsVector.getCPtr(x), x, RelAbsVector.getCPtr(y), y, RelAbsVector.getCPtr(r), r, RelAbsVector.getCPtr(fx), fx, RelAbsVector.getCPtr(fy), fy);
  }

  
/**
   * Sets the coordinates for the center point.
   <p>
   * @param x x value of the center point of the radial gradient vector
   * @param y y value of the center point of the radial gradient vector
   * @param z z value of the center point of the radial gradient vector
   * The z argument can be omitted. In that case it is set to 0.
   */ public
 void setCenter(RelAbsVector x, RelAbsVector y, RelAbsVector z) {
    libsbmlJNI.RadialGradient_setCenter__SWIG_0(swigCPtr, this, RelAbsVector.getCPtr(x), x, RelAbsVector.getCPtr(y), y, RelAbsVector.getCPtr(z), z);
  }

  
/**
   * Sets the coordinates for the center point.
   <p>
   * @param x x value of the center point of the radial gradient vector
   * @param y y value of the center point of the radial gradient vector
   * @param z z value of the center point of the radial gradient vector
   * The z argument can be omitted. In that case it is set to 0.
   */ public
 void setCenter(RelAbsVector x, RelAbsVector y) {
    libsbmlJNI.RadialGradient_setCenter__SWIG_1(swigCPtr, this, RelAbsVector.getCPtr(x), x, RelAbsVector.getCPtr(y), y);
  }

  
/**
   * Sets the coordinates for the focal point.
   <p>
   * @param x x value of the focal point of the radial gradient vector
   * @param y y value of the focal point of the radial gradient vector
   * @param z z value of the focal point of the radial gradient vector.
   * The z argument can be omitted. In that case it is set to 0.
   */ public
 void setFocalPoint(RelAbsVector x, RelAbsVector y, RelAbsVector z) {
    libsbmlJNI.RadialGradient_setFocalPoint__SWIG_0(swigCPtr, this, RelAbsVector.getCPtr(x), x, RelAbsVector.getCPtr(y), y, RelAbsVector.getCPtr(z), z);
  }

  
/**
   * Sets the coordinates for the focal point.
   <p>
   * @param x x value of the focal point of the radial gradient vector
   * @param y y value of the focal point of the radial gradient vector
   * @param z z value of the focal point of the radial gradient vector.
   * The z argument can be omitted. In that case it is set to 0.
   */ public
 void setFocalPoint(RelAbsVector x, RelAbsVector y) {
    libsbmlJNI.RadialGradient_setFocalPoint__SWIG_1(swigCPtr, this, RelAbsVector.getCPtr(x), x, RelAbsVector.getCPtr(y), y);
  }

  
/**
   * Unsets the value of the 'cx' element of this {@link RadialGradient}.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   This particular
 * function only does one thing irrespective of user input or 
 * object state, and thus will only return a single value:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * </ul>
   */ public
 int unsetCx() {
    return libsbmlJNI.RadialGradient_unsetCx(swigCPtr, this);
  }

  
/**
   * Unsets the value of the 'cy' element of this {@link RadialGradient}.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   This particular
 * function only does one thing irrespective of user input or 
 * object state, and thus will only return a single value:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * </ul>
   */ public
 int unsetCy() {
    return libsbmlJNI.RadialGradient_unsetCy(swigCPtr, this);
  }

  
/**
   * Unsets the value of the 'cz' element of this {@link RadialGradient}.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   This particular
 * function only does one thing irrespective of user input or 
 * object state, and thus will only return a single value:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * </ul>
   */ public
 int unsetCz() {
    return libsbmlJNI.RadialGradient_unsetCz(swigCPtr, this);
  }

  
/**
   * Unsets the value of the 'r' element of this {@link RadialGradient}.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   This particular
 * function only does one thing irrespective of user input or 
 * object state, and thus will only return a single value:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * </ul>
   */ public
 int unsetR() {
    return libsbmlJNI.RadialGradient_unsetR(swigCPtr, this);
  }

  
/**
   * Unsets the value of the 'fx' element of this {@link RadialGradient}.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   This particular
 * function only does one thing irrespective of user input or 
 * object state, and thus will only return a single value:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * </ul>
   */ public
 int unsetFx() {
    return libsbmlJNI.RadialGradient_unsetFx(swigCPtr, this);
  }

  
/**
   * Unsets the value of the 'fy' element of this {@link RadialGradient}.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   This particular
 * function only does one thing irrespective of user input or 
 * object state, and thus will only return a single value:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * </ul>
   */ public
 int unsetFy() {
    return libsbmlJNI.RadialGradient_unsetFy(swigCPtr, this);
  }

  
/**
   * Unsets the value of the 'fz' element of this {@link RadialGradient}.
   <p>
   * <p>
 * @return integer value indicating success/failure of the
 * function.   This particular
 * function only does one thing irrespective of user input or 
 * object state, and thus will only return a single value:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * </ul>
   */ public
 int unsetFz() {
    return libsbmlJNI.RadialGradient_unsetFz(swigCPtr, this);
  }

  
/**
   * Returns the XML element name of this {@link RadialGradient} object.
   <p>
   * For {@link RadialGradient}, the XML element name is always <code>'radialGradient'.</code>
   <p>
   * @return the name of this element, i.e. <code>'radialGradient'.</code>
   */ public
 String getElementName() {
    return libsbmlJNI.RadialGradient_getElementName(swigCPtr, this);
  }

  
/**
   * Returns the libSBML type code for this {@link RadialGradient} object.
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
   * {@link libsbmlConstants#SBML_RENDER_RADIALGRADIENT SBML_RENDER_RADIALGRADIENT}.
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
    return libsbmlJNI.RadialGradient_getTypeCode(swigCPtr, this);
  }

  
/**
   * Creates an {@link XMLNode} object from this {@link RadialGradient} object.
   <p>
   * @return the {@link XMLNode} with the XML representation for the 
   * {@link RadialGradient} object.
   */ public
 XMLNode toXML() {
    return new XMLNode(libsbmlJNI.RadialGradient_toXML(swigCPtr, this), true);
  }

}
