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

 Representation of cubic Bezier curves.
 <p>
 * The {@link RenderCubicBezier} is derived from {@link RenderPoint} and is the second
 * element needed to represent arbitrary curves with relative coordinates as
 * they can appear in {@link RenderCurve} and {@link Polygon} objects.  In addition to the
 * attributes inherited from {@link RenderPoint}, {@link RenderCubicBezier} has two
 * additional attributes for the two base points that define a cubic bezier
 * curve.
 <p>
 * Segments in a {@link RenderCurve} or a {@link Polygon} are always defined by two
 * consecutive {@link RenderPoint} or {@link RenderCubicBezier} elements. The first element
 * in a list of RenderPoints has to be a {@link RenderPoint} object, all following
 * elements can either be {@link RenderPoint} or {@link RenderCubicBezier} elements.  If the
 * second element is a {@link RenderPoint}, the two elements represent a straight
 * line segement; if the second element if a {@link RenderCubicBezier}, the two
 * elements represent a cubic bezier curve segment.
 <p>
 * For further details please have a look at the SBML Level&nbsp;3 Render
 * package specification.
 */

public class RenderCubicBezier extends RenderPoint {
   private long swigCPtr;

   protected RenderCubicBezier(long cPtr, boolean cMemoryOwn)
   {
     super(libsbmlJNI.RenderCubicBezier_SWIGUpcast(cPtr), cMemoryOwn);
     swigCPtr = cPtr;
   }

   protected static long getCPtr(RenderCubicBezier obj)
   {
     return (obj == null) ? 0 : obj.swigCPtr;
   }

   protected static long getCPtrAndDisown (RenderCubicBezier obj)
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
        libsbmlJNI.delete_RenderCubicBezier(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  
/**
   * Creates a new {@link RenderCubicBezier} using the given SBML Level, Version and
   * &ldquo;render&rdquo; package version.
   <p>
   * @param level a long integer, the SBML Level to assign to this
   * {@link RenderCubicBezier}.
   <p>
   * @param version a long integer, the SBML Version to assign to this
   * {@link RenderCubicBezier}.
   <p>
   * @param pkgVersion a long integer, the SBML Render Version to assign to
   * this {@link RenderCubicBezier}.
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
 RenderCubicBezier(long level, long version, long pkgVersion) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_RenderCubicBezier__SWIG_0(level, version, pkgVersion), true);
  }

  
/**
   * Creates a new {@link RenderCubicBezier} using the given SBML Level, Version and
   * &ldquo;render&rdquo; package version.
   <p>
   * @param level a long integer, the SBML Level to assign to this
   * {@link RenderCubicBezier}.
   <p>
   * @param version a long integer, the SBML Version to assign to this
   * {@link RenderCubicBezier}.
   <p>
   * @param pkgVersion a long integer, the SBML Render Version to assign to
   * this {@link RenderCubicBezier}.
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
 RenderCubicBezier(long level, long version) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_RenderCubicBezier__SWIG_1(level, version), true);
  }

  
/**
   * Creates a new {@link RenderCubicBezier} using the given SBML Level, Version and
   * &ldquo;render&rdquo; package version.
   <p>
   * @param level a long integer, the SBML Level to assign to this
   * {@link RenderCubicBezier}.
   <p>
   * @param version a long integer, the SBML Version to assign to this
   * {@link RenderCubicBezier}.
   <p>
   * @param pkgVersion a long integer, the SBML Render Version to assign to
   * this {@link RenderCubicBezier}.
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
 RenderCubicBezier(long level) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_RenderCubicBezier__SWIG_2(level), true);
  }

  
/**
   * Creates a new {@link RenderCubicBezier} using the given SBML Level, Version and
   * &ldquo;render&rdquo; package version.
   <p>
   * @param level a long integer, the SBML Level to assign to this
   * {@link RenderCubicBezier}.
   <p>
   * @param version a long integer, the SBML Version to assign to this
   * {@link RenderCubicBezier}.
   <p>
   * @param pkgVersion a long integer, the SBML Render Version to assign to
   * this {@link RenderCubicBezier}.
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
 RenderCubicBezier() throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_RenderCubicBezier__SWIG_3(), true);
  }

  
/**
   * Creates a new {@link RenderCubicBezier} using the given {@link RenderPkgNamespaces}
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
 RenderCubicBezier(RenderPkgNamespaces renderns) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_RenderCubicBezier__SWIG_4(RenderPkgNamespaces.getCPtr(renderns), renderns), true);
  }

  
/**
  * Creates a {@link CubicBezier} with the given points.
  <p>
  * @param renderns the {@link RenderPkgNamespaces} object.
  * @param bp1_x x coordinate of the first base point.
  * @param bp1_y y coordinate of the first base point.
  * @param bp1_z z coordinate of the first base point.
  * @param bp2_x x coordinate of the second base point.
  * @param bp2_y y coordinate of the second base point.
  * @param bp2_z z coordinate of the second base point.
  * @param end_x x coordinate of the end point.
  * @param end_y y coordinate of the end point.
  * @param end_z z coordinate of the end point.
  */ public
 RenderCubicBezier(RenderPkgNamespaces renderns, RelAbsVector bp1_x, RelAbsVector bp1_y, RelAbsVector bp1_z, RelAbsVector bp2_x, RelAbsVector bp2_y, RelAbsVector bp2_z, RelAbsVector end_x, RelAbsVector end_y, RelAbsVector end_z) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_RenderCubicBezier__SWIG_5(RenderPkgNamespaces.getCPtr(renderns), renderns, RelAbsVector.getCPtr(bp1_x), bp1_x, RelAbsVector.getCPtr(bp1_y), bp1_y, RelAbsVector.getCPtr(bp1_z), bp1_z, RelAbsVector.getCPtr(bp2_x), bp2_x, RelAbsVector.getCPtr(bp2_y), bp2_y, RelAbsVector.getCPtr(bp2_z), bp2_z, RelAbsVector.getCPtr(end_x), end_x, RelAbsVector.getCPtr(end_y), end_y, RelAbsVector.getCPtr(end_z), end_z), true);
  }

  
/**
  * Creates a new {@link RenderCubicBezier} object from the given {@link XMLNode} object.
  * The {@link XMLNode} object has to contain a valid XML representation of a
  * {@link RenderCubicBezier} object as defined in the render extension specification.
  * This method is normally called when render information is read from a file and
  * should normally not have to be called explicitly.
  <p>
  * @param node the {@link XMLNode} object reference that describes the {@link RenderCubicBezier}
  * object to be instantiated.
  * @param l2version the version of SBML Level&nbsp;2 to target.
  */ public
 RenderCubicBezier(XMLNode node, long l2version) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_RenderCubicBezier__SWIG_6(XMLNode.getCPtr(node), node, l2version), true);
  }

  
/**
  * Creates a new {@link RenderCubicBezier} object from the given {@link XMLNode} object.
  * The {@link XMLNode} object has to contain a valid XML representation of a
  * {@link RenderCubicBezier} object as defined in the render extension specification.
  * This method is normally called when render information is read from a file and
  * should normally not have to be called explicitly.
  <p>
  * @param node the {@link XMLNode} object reference that describes the {@link RenderCubicBezier}
  * object to be instantiated.
  * @param l2version the version of SBML Level&nbsp;2 to target.
  */ public
 RenderCubicBezier(XMLNode node) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_RenderCubicBezier__SWIG_7(XMLNode.getCPtr(node), node), true);
  }

  
/**
   * Copy constructor for {@link RenderCubicBezier}.
   <p>
   * @param orig the {@link RenderCubicBezier} instance to copy.
   */ public
 RenderCubicBezier(RenderCubicBezier orig) throws org.sbml.libsbml.SBMLConstructorException {
    this(libsbmlJNI.new_RenderCubicBezier__SWIG_8(RenderCubicBezier.getCPtr(orig), orig), true);
  }

  
/**
   * Creates and returns a deep copy of this {@link RenderCubicBezier} object.
   <p>
   * @return a (deep) copy of this {@link RenderCubicBezier} object.
   */ public
 RenderCubicBezier cloneObject() {
    long cPtr = libsbmlJNI.RenderCubicBezier_cloneObject(swigCPtr, this);
    return (cPtr == 0) ? null : new RenderCubicBezier(cPtr, true);
  }

  
/**
   * Returns the value of the 'basePoint1_x' element of this {@link RenderCubicBezier}.
   <p>
   * @return the value of the 'basePoint1_x' element of this {@link RenderCubicBezier}
   * as a {@link RelAbsVector}.
   */ public
 RelAbsVector getBasePoint1_x() {
    return new RelAbsVector(libsbmlJNI.RenderCubicBezier_getBasePoint1_x__SWIG_0(swigCPtr, this), false);
  }

  
/**
   * Returns the x value of the first base point of the curve (the one closer to the
   * starting point) as a  reference.
   <p>
   * @return  reference to x value of first base point
   */ public
 RelAbsVector basePoint1_X() {
    return new RelAbsVector(libsbmlJNI.RenderCubicBezier_basePoint1_X__SWIG_0(swigCPtr, this), false);
  }

  
/**
   * Returns the value of the 'basePoint1_y' element of this {@link RenderCubicBezier}.
   <p>
   * @return the value of the 'basePoint1_y' element of this {@link RenderCubicBezier}
   * as a {@link RelAbsVector}.
   */ public
 RelAbsVector getBasePoint1_y() {
    return new RelAbsVector(libsbmlJNI.RenderCubicBezier_getBasePoint1_y__SWIG_0(swigCPtr, this), false);
  }

  
/**
   * Returns the y value of the first base point of the curve (the one closer to the
   * starting point) as a  reference.
   <p>
   * @return  reference to y value of first base point
   */ public
 RelAbsVector basePoint1_Y() {
    return new RelAbsVector(libsbmlJNI.RenderCubicBezier_basePoint1_Y__SWIG_0(swigCPtr, this), false);
  }

  
/**
   * Returns the value of the 'basePoint1_z' element of this {@link RenderCubicBezier}.
   <p>
   * @return the value of the 'basePoint1_z' element of this {@link RenderCubicBezier}
   * as a {@link RelAbsVector}.
   */ public
 RelAbsVector getBasePoint1_z() {
    return new RelAbsVector(libsbmlJNI.RenderCubicBezier_getBasePoint1_z__SWIG_0(swigCPtr, this), false);
  }

  
/**
   * Returns the z value of the first base point of the curve (the one closer to the
   * starting point) as a  reference.
   <p>
   * @return  reference to z value of first base point
   */ public
 RelAbsVector basePoint1_Z() {
    return new RelAbsVector(libsbmlJNI.RenderCubicBezier_basePoint1_Z__SWIG_0(swigCPtr, this), false);
  }

  
/**
   * Returns the value of the 'basePoint2_x' element of this {@link RenderCubicBezier}.
   <p>
   * @return the value of the 'basePoint2_x' element of this {@link RenderCubicBezier}
   * as a {@link RelAbsVector}.
   */ public
 RelAbsVector getBasePoint2_x() {
    return new RelAbsVector(libsbmlJNI.RenderCubicBezier_getBasePoint2_x__SWIG_0(swigCPtr, this), false);
  }

  
/**
   * Returns the x value of the second base point of the curve (the one further from the
   * starting point) as a  reference.
   <p>
   * @return  reference to x value of second base point
   */ public
 RelAbsVector basePoint2_X() {
    return new RelAbsVector(libsbmlJNI.RenderCubicBezier_basePoint2_X__SWIG_0(swigCPtr, this), false);
  }

  
/**
   * Returns the value of the 'basePoint2_y' element of this {@link RenderCubicBezier}.
   <p>
   * @return the value of the 'basePoint2_y' element of this {@link RenderCubicBezier}
   * as a {@link RelAbsVector}.
   */ public
 RelAbsVector getBasePoint2_y() {
    return new RelAbsVector(libsbmlJNI.RenderCubicBezier_getBasePoint2_y__SWIG_0(swigCPtr, this), false);
  }

  
/**
   * Returns the y value of the second base point of the curve (the one further from the
   * starting point) as a  reference.
   <p>
   * @return  reference to y value of second base point
   */ public
 RelAbsVector basePoint2_Y() {
    return new RelAbsVector(libsbmlJNI.RenderCubicBezier_basePoint2_Y__SWIG_0(swigCPtr, this), false);
  }

  
/**
   * Returns the value of the 'basePoint2_z' element of this {@link RenderCubicBezier}.
   <p>
   * @return the value of the 'basePoint2_z' element of this {@link RenderCubicBezier}
   * as a {@link RelAbsVector}.
   */ public
 RelAbsVector getBasePoint2_z() {
    return new RelAbsVector(libsbmlJNI.RenderCubicBezier_getBasePoint2_z__SWIG_0(swigCPtr, this), false);
  }

  
/**
   * Returns the z value of the second base point of the curve (the one further from the
   * starting point) as a  reference.
   <p>
   * @return  reference to z value of second base point
   */ public
 RelAbsVector basePoint2_Z() {
    return new RelAbsVector(libsbmlJNI.RenderCubicBezier_basePoint2_Z__SWIG_0(swigCPtr, this), false);
  }

  
/**
   * Predicate returning <code>true</code> if this {@link RenderCubicBezier}'s 'basePoint1_x'
   * element is set.
   <p>
   * @return <code>true</code> if this {@link RenderCubicBezier}'s 'basePoint1_x' element has
   * been set, otherwise <code>false</code> is returned.
   */ public
 boolean isSetBasePoint1_x() {
    return libsbmlJNI.RenderCubicBezier_isSetBasePoint1_x(swigCPtr, this);
  }

  
/**
   * Predicate returning <code>true</code> if this {@link RenderCubicBezier}'s 'basePoint1_y'
   * element is set.
   <p>
   * @return <code>true</code> if this {@link RenderCubicBezier}'s 'basePoint1_y' element has
   * been set, otherwise <code>false</code> is returned.
   */ public
 boolean isSetBasePoint1_y() {
    return libsbmlJNI.RenderCubicBezier_isSetBasePoint1_y(swigCPtr, this);
  }

  
/**
   * Predicate returning <code>true</code> if this {@link RenderCubicBezier}'s 'basePoint1_z'
   * element is set.
   <p>
   * @return <code>true</code> if this {@link RenderCubicBezier}'s 'basePoint1_z' element has
   * been set, otherwise <code>false</code> is returned.
   */ public
 boolean isSetBasePoint1_z() {
    return libsbmlJNI.RenderCubicBezier_isSetBasePoint1_z(swigCPtr, this);
  }

  
/**
   * Predicate returning <code>true</code> if this {@link RenderCubicBezier}'s 'basePoint2_x'
   * element is set.
   <p>
   * @return <code>true</code> if this {@link RenderCubicBezier}'s 'basePoint2_x' element has
   * been set, otherwise <code>false</code> is returned.
   */ public
 boolean isSetBasePoint2_x() {
    return libsbmlJNI.RenderCubicBezier_isSetBasePoint2_x(swigCPtr, this);
  }

  
/**
   * Predicate returning <code>true</code> if this {@link RenderCubicBezier}'s 'basePoint2_y'
   * element is set.
   <p>
   * @return <code>true</code> if this {@link RenderCubicBezier}'s 'basePoint2_y' element has
   * been set, otherwise <code>false</code> is returned.
   */ public
 boolean isSetBasePoint2_y() {
    return libsbmlJNI.RenderCubicBezier_isSetBasePoint2_y(swigCPtr, this);
  }

  
/**
   * Predicate returning <code>true</code> if this {@link RenderCubicBezier}'s 'basePoint2_z'
   * element is set.
   <p>
   * @return <code>true</code> if this {@link RenderCubicBezier}'s 'basePoint2_z' element has
   * been set, otherwise <code>false</code> is returned.
   */ public
 boolean isSetBasePoint2_z() {
    return libsbmlJNI.RenderCubicBezier_isSetBasePoint2_z(swigCPtr, this);
  }

  
/**
   * Sets the value of the 'basePoint1_x' element of this {@link RenderCubicBezier}.
   <p>
   * @param basePoint1_x {@link RelAbsVector} value of the 'basePoint1_x' element to
   * be set.
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
 int setBasePoint1_x(RelAbsVector basePoint1_x) {
    return libsbmlJNI.RenderCubicBezier_setBasePoint1_x(swigCPtr, this, RelAbsVector.getCPtr(basePoint1_x), basePoint1_x);
  }

  
/**
   * Sets the x value of the first base point of the curve (the one closer to the
   * starting point).
   <p>
   * @param x x coordinate of first base point.
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
 int setBasePoint1_X(RelAbsVector x) {
    return libsbmlJNI.RenderCubicBezier_setBasePoint1_X(swigCPtr, this, RelAbsVector.getCPtr(x), x);
  }

  
/**
   * Sets the value of the 'basePoint1_y' element of this {@link RenderCubicBezier}.
   <p>
   * @param basePoint1_y {@link RelAbsVector} value of the 'basePoint1_y' element to
   * be set.
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
 int setBasePoint1_y(RelAbsVector basePoint1_y) {
    return libsbmlJNI.RenderCubicBezier_setBasePoint1_y(swigCPtr, this, RelAbsVector.getCPtr(basePoint1_y), basePoint1_y);
  }

  
/**
   * Sets the value of the 'basePoint1_y' element of this {@link RenderCubicBezier}.
   * Sets the y value of the first base point of the curve (the one closer to the
   * starting point).
   <p>
   * @param y y coordinate of first base point.
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
 int setBasePoint1_Y(RelAbsVector y) {
    return libsbmlJNI.RenderCubicBezier_setBasePoint1_Y(swigCPtr, this, RelAbsVector.getCPtr(y), y);
  }

  
/**
   * Sets the value of the 'basePoint1_z' element of this {@link RenderCubicBezier}.
   <p>
   * @param basePoint1_z {@link RelAbsVector} value of the 'basePoint1_z' element to
   * be set.
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
 int setBasePoint1_z(RelAbsVector basePoint1_z) {
    return libsbmlJNI.RenderCubicBezier_setBasePoint1_z(swigCPtr, this, RelAbsVector.getCPtr(basePoint1_z), basePoint1_z);
  }

  
/**
   * Sets the value of the 'basePoint1_z' element of this {@link RenderCubicBezier}.
   * Sets the z value of the first base point of the curve (the one closer to the
   * starting point).
   <p>
   * @param z z coordinate of first base point.
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
 int setBasePoint1_Z(RelAbsVector z) {
    return libsbmlJNI.RenderCubicBezier_setBasePoint1_Z(swigCPtr, this, RelAbsVector.getCPtr(z), z);
  }

  
/**
   * Sets the value of the 'basePoint2_x' element of this {@link RenderCubicBezier}.
   <p>
   * @param basePoint2_x {@link RelAbsVector} value of the 'basePoint2_x' element to
   * be set.
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
 int setBasePoint2_x(RelAbsVector basePoint2_x) {
    return libsbmlJNI.RenderCubicBezier_setBasePoint2_x(swigCPtr, this, RelAbsVector.getCPtr(basePoint2_x), basePoint2_x);
  }

  
/**
   * Sets the x value of the second base point of the curve (the one further from the
   * starting point).
   <p>
   * @param x value of second base point.
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
 int setBasePoint2_X(RelAbsVector x) {
    return libsbmlJNI.RenderCubicBezier_setBasePoint2_X(swigCPtr, this, RelAbsVector.getCPtr(x), x);
  }

  
/**
   * Sets the value of the 'basePoint2_y' element of this {@link RenderCubicBezier}.
   <p>
   * @param basePoint2_y {@link RelAbsVector} value of the 'basePoint2_y' element to
   * be set.
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
 int setBasePoint2_y(RelAbsVector basePoint2_y) {
    return libsbmlJNI.RenderCubicBezier_setBasePoint2_y(swigCPtr, this, RelAbsVector.getCPtr(basePoint2_y), basePoint2_y);
  }

  
/**
   * Sets the y value of the second base point of the curve (the one further from the
   * starting point).
   <p>
   * @param y value of second base point.
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
 int setBasePoint2_Y(RelAbsVector y) {
    return libsbmlJNI.RenderCubicBezier_setBasePoint2_Y(swigCPtr, this, RelAbsVector.getCPtr(y), y);
  }

  
/**
   * Sets the value of the 'basePoint2_z' element of this {@link RenderCubicBezier}.
   <p>
   * @param basePoint2_z {@link RelAbsVector} value of the 'basePoint2_z' element to
   * be set.
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
 int setBasePoint2_z(RelAbsVector basePoint2_z) {
    return libsbmlJNI.RenderCubicBezier_setBasePoint2_z(swigCPtr, this, RelAbsVector.getCPtr(basePoint2_z), basePoint2_z);
  }

  
/**
   * Sets the z value of the second base point of the curve (the one further from the
   * starting point).
   <p>
   * @param z value of second base point.
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
 int setBasePoint2_Z(RelAbsVector z) {
    return libsbmlJNI.RenderCubicBezier_setBasePoint2_Z(swigCPtr, this, RelAbsVector.getCPtr(z), z);
  }

  
/**
   * Sets the first basepoint to the given coordinatees.
   <p>
   * @param x coordinate of second base point.
   * @param y coordinate of second base point.
   * @param z coordinate of second base point.
   * If the z coodinate is omitted, it is set to 0.
   */ public
 void setBasePoint1(RelAbsVector x, RelAbsVector y, RelAbsVector z) {
    libsbmlJNI.RenderCubicBezier_setBasePoint1__SWIG_0(swigCPtr, this, RelAbsVector.getCPtr(x), x, RelAbsVector.getCPtr(y), y, RelAbsVector.getCPtr(z), z);
  }

  
/**
   * Sets the first basepoint to the given coordinatees.
   <p>
   * @param x coordinate of second base point.
   * @param y coordinate of second base point.
   * @param z coordinate of second base point.
   * If the z coodinate is omitted, it is set to 0.
   */ public
 void setBasePoint1(RelAbsVector x, RelAbsVector y) {
    libsbmlJNI.RenderCubicBezier_setBasePoint1__SWIG_1(swigCPtr, this, RelAbsVector.getCPtr(x), x, RelAbsVector.getCPtr(y), y);
  }

  
/**
   * Sets the second basepoint to the given coordinatees.
   <p>
   * @param x coordinate of second base point.
   * @param y coordinate of second base point.
   * @param z coordinate of second base point.
   * If the z coodinate is omitted, it is set to 0.
   */ public
 void setBasePoint2(RelAbsVector x, RelAbsVector y, RelAbsVector z) {
    libsbmlJNI.RenderCubicBezier_setBasePoint2__SWIG_0(swigCPtr, this, RelAbsVector.getCPtr(x), x, RelAbsVector.getCPtr(y), y, RelAbsVector.getCPtr(z), z);
  }

  
/**
   * Sets the second basepoint to the given coordinatees.
   <p>
   * @param x coordinate of second base point.
   * @param y coordinate of second base point.
   * @param z coordinate of second base point.
   * If the z coodinate is omitted, it is set to 0.
   */ public
 void setBasePoint2(RelAbsVector x, RelAbsVector y) {
    libsbmlJNI.RenderCubicBezier_setBasePoint2__SWIG_1(swigCPtr, this, RelAbsVector.getCPtr(x), x, RelAbsVector.getCPtr(y), y);
  }

  
/**
   * Unsets the value of the 'basePoint1_x' element of this {@link RenderCubicBezier}.
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
 int unsetBasePoint1_x() {
    return libsbmlJNI.RenderCubicBezier_unsetBasePoint1_x(swigCPtr, this);
  }

  
/**
   * Unsets the value of the 'basePoint1_y' element of this {@link RenderCubicBezier}.
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
 int unsetBasePoint1_y() {
    return libsbmlJNI.RenderCubicBezier_unsetBasePoint1_y(swigCPtr, this);
  }

  
/**
   * Unsets the value of the 'basePoint1_z' element of this {@link RenderCubicBezier}.
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
 int unsetBasePoint1_z() {
    return libsbmlJNI.RenderCubicBezier_unsetBasePoint1_z(swigCPtr, this);
  }

  
/**
   * Unsets the value of the 'basePoint2_x' element of this {@link RenderCubicBezier}.
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
 int unsetBasePoint2_x() {
    return libsbmlJNI.RenderCubicBezier_unsetBasePoint2_x(swigCPtr, this);
  }

  
/**
   * Unsets the value of the 'basePoint2_y' element of this {@link RenderCubicBezier}.
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
 int unsetBasePoint2_y() {
    return libsbmlJNI.RenderCubicBezier_unsetBasePoint2_y(swigCPtr, this);
  }

  
/**
   * Unsets the value of the 'basePoint2_z' element of this {@link RenderCubicBezier}.
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
 int unsetBasePoint2_z() {
    return libsbmlJNI.RenderCubicBezier_unsetBasePoint2_z(swigCPtr, this);
  }

  
/**
   * Returns the XML element name of this {@link RenderCubicBezier} object.
   <p>
   * For {@link RenderCubicBezier}, the XML element name is always <code>'element'.</code>
   <p>
   * @return the name of this element, i.e. <code>'element'.</code>
   */ public
 String getElementName() {
    return libsbmlJNI.RenderCubicBezier_getElementName(swigCPtr, this);
  }

  
/**
   * Returns the libSBML type code for this {@link RenderCubicBezier} object.
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
   * {@link libsbmlConstants#SBML_RENDER_CUBICBEZIER SBML_RENDER_CUBICBEZIER}.
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
    return libsbmlJNI.RenderCubicBezier_getTypeCode(swigCPtr, this);
  }

  
/**
   * Predicate returning <code>true</code> if all the required attributes for this
   * {@link RenderCubicBezier} object have been set.
   <p>
   * @return <code>true</code> to indicate that all the required attributes of this
   * {@link RenderCubicBezier} have been set, otherwise <code>false</code> is returned.
   <p>
   * @note The required elements for the {@link RenderCubicBezier} object are:
   * <ul>
   * <li> 'basePoint1_x'
   * <li> 'basePoint1_y'
   * <li> 'basePoint2_x'
   * <li> 'basePoint2_y'
   * </ul>
  */ public
 boolean hasRequiredAttributes() {
    return libsbmlJNI.RenderCubicBezier_hasRequiredAttributes(swigCPtr, this);
  }

  
/**
   * Creates an {@link XMLNode} object from this {@link RenderCubicBezier} object.
   <p>
   * @return the {@link XMLNode} with the XML representation for the 
   * {@link RenderCubicBezier} object.
   */ public
 XMLNode toXML(String name) {
    return new XMLNode(libsbmlJNI.RenderCubicBezier_toXML(swigCPtr, this, name), true);
  }

}
